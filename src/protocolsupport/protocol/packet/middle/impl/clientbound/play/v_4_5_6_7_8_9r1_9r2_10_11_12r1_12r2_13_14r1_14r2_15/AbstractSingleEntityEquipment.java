package protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15;

import protocolsupport.protocol.packet.middle.base.clientbound.play.MiddleEntityEquipment;
import protocolsupport.protocol.types.NetworkItemStack;

public abstract class AbstractSingleEntityEquipment extends MiddleEntityEquipment {

	protected AbstractSingleEntityEquipment(IMiddlePacketInit init) {
		super(init);
	}

	@Override
	protected void write() {
		for (Entry entry : entries) {
			writeToClientSingle(entry.getSlot(), entry.getItemStack());
		}
	}

	protected abstract void writeToClientSingle(Slot slot, NetworkItemStack itemstack);

}
