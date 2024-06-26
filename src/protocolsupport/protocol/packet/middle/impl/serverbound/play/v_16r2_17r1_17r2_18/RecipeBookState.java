package protocolsupport.protocol.packet.middle.impl.serverbound.play.v_16r2_17r1_17r2_18;

import io.netty.buffer.ByteBuf;
import protocolsupport.protocol.codec.MiscDataCodec;
import protocolsupport.protocol.packet.middle.base.serverbound.play.MiddleRecipeBookState;
import protocolsupport.protocol.packet.middle.impl.serverbound.IServerboundMiddlePacketV16r2;
import protocolsupport.protocol.packet.middle.impl.serverbound.IServerboundMiddlePacketV17r1;
import protocolsupport.protocol.packet.middle.impl.serverbound.IServerboundMiddlePacketV17r2;
import protocolsupport.protocol.packet.middle.impl.serverbound.IServerboundMiddlePacketV18;

public class RecipeBookState extends MiddleRecipeBookState implements
IServerboundMiddlePacketV16r2,
IServerboundMiddlePacketV17r1,
IServerboundMiddlePacketV17r2,
IServerboundMiddlePacketV18 {

	public RecipeBookState(IMiddlePacketInit init) {
		super(init);
	}

	@Override
	protected void read(ByteBuf clientdata) {
		bookType = MiscDataCodec.readVarIntEnum(clientdata, RecipeBookType.CONSTANT_LOOKUP);
		bookOpen = clientdata.readBoolean();
		bookFiltering = clientdata.readBoolean();
	}

}
