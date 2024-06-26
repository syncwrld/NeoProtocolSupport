package protocolsupport.protocol.packet.middle.impl.clientbound.play.v_17r1;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.codec.ArrayCodec;
import protocolsupport.protocol.codec.ItemStackCodec;
import protocolsupport.protocol.packet.ClientBoundPacketData;
import protocolsupport.protocol.packet.ClientBoundPacketType;
import protocolsupport.protocol.packet.middle.base.clientbound.play.MiddleInventorySetItems;
import protocolsupport.protocol.packet.middle.base.clientbound.play.MiddleInventorySetSlot;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV17r1;
import protocolsupport.protocol.storage.netcache.ClientCache;
import protocolsupport.protocol.typeremapper.window.WindowRemapper;
import protocolsupport.protocol.typeremapper.window.WindowRemapper.ClientItems;
import protocolsupport.protocol.typeremapper.window.WindowRemapper.ClientItemsArray;
import protocolsupport.protocol.typeremapper.window.WindowRemapper.ClientItemsSingle;
import protocolsupport.protocol.types.NetworkItemStack;

public class InventorySetItems extends MiddleInventorySetItems implements IClientboundMiddlePacketV17r1 {

	public InventorySetItems(IMiddlePacketInit init) {
		super(init);
	}

	protected final ClientCache clientCache = cache.getClientCache();

	@Override
	protected void write() {
		String locale = clientCache.getLocale();

		WindowRemapper remapper = windowId == WINDOW_ID_PLAYER_INVENTORY ? windowCache.getPlayerWindowRemapper() : windowCache.getOpenedWindowRemapper();
		ClientItems clientitems = remapper.toClientItems(windowId, items);
		for (ClientItemsArray itemsArray : clientitems.getItemsArrays()) {
			io.writeClientbound(create(version, locale, itemsArray.getWindowId(), itemsArray.getItems()));
		}
		for (ClientItemsSingle itemSingle : clientitems.getItemsSingle()) {
			io.writeClientbound(InventorySetSlot.create(
				version, locale,
				itemSingle.getWindowId(),
				itemSingle.getSlot(),
				itemSingle.getItem()
			));
		}
		io.writeClientbound(InventorySetSlot.create(version, locale, MiddleInventorySetSlot.WINDOW_ID_PLAYER_CURSOR, -1, cursor));
	}

	protected static ClientBoundPacketData create(ProtocolVersion version, String locale, byte windowId, NetworkItemStack[] items) {
		ClientBoundPacketData windowitems = ClientBoundPacketData.create(ClientBoundPacketType.PLAY_WINDOW_SET_ITEMS);
		windowitems.writeByte(windowId);
		ArrayCodec.writeShortTArray(windowitems, items, (lTo, item) -> ItemStackCodec.writeItemStack(lTo, version, locale, item));
		return windowitems;
	}

}
