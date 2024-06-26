package protocolsupport.protocol.packet.middle.base.serverbound.play;

import protocolsupport.protocol.packet.ServerBoundPacketData;
import protocolsupport.protocol.packet.ServerBoundPacketType;
import protocolsupport.protocol.packet.middle.base.serverbound.ServerBoundMiddlePacket;
import protocolsupport.protocol.storage.netcache.window.WindowCache;

public abstract class MiddleInventoryClose extends ServerBoundMiddlePacket {

	protected final WindowCache windowCache = cache.getWindowCache();

	protected MiddleInventoryClose(IMiddlePacketInit init) {
		super(init);
	}

	protected byte windowId;

	@Override
	protected void handle() {
		windowCache.closeWindow();
	}

	@Override
	protected void write() {
		io.writeServerbound(create(windowId));
	}

	public static ServerBoundPacketData create(int windowId) {
		ServerBoundPacketData creator = ServerBoundPacketData.create(ServerBoundPacketType.PLAY_WINDOW_CLOSE);
		creator.writeByte(windowId);
		return creator;
	}

}
