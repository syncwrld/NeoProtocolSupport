package protocolsupport.protocol.packet.middle.impl.clientbound.play.v_6;

import com.google.gson.JsonObject;

import protocolsupport.api.chat.ChatAPI.MessagePosition;
import protocolsupport.protocol.codec.StringCodec;
import protocolsupport.protocol.packet.ClientBoundPacketData;
import protocolsupport.protocol.packet.ClientBoundPacketType;
import protocolsupport.protocol.packet.middle.base.clientbound.play.MiddleChat;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV6;
import protocolsupport.protocol.storage.netcache.ClientCache;
import protocolsupport.utils.JsonUtils;

public class Chat extends MiddleChat implements IClientboundMiddlePacketV6 {

	protected final ClientCache clientCache = cache.getClientCache();

	public Chat(IMiddlePacketInit init) {
		super(init);
	}

	@Override
	protected void write() {
		if (position == MessagePosition.HOTBAR) {
			return;
		}

		ClientBoundPacketData chat = ClientBoundPacketData.create(ClientBoundPacketType.PLAY_CHAT);
		StringCodec.writeShortUTF16BEString(chat, encode(message.toLegacyText(clientCache.getLocale())));
		io.writeClientbound(chat);
	}

	protected static String encode(String message) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("text", message);
		return JsonUtils.GSON.toJson(jsonObject);
	}

}
