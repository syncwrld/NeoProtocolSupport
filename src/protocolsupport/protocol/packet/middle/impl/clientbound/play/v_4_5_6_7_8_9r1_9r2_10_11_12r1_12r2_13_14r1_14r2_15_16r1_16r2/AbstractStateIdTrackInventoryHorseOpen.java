package protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2;

import protocolsupport.protocol.packet.middle.base.clientbound.play.MiddleInventoryHorseOpen;
import protocolsupport.protocol.storage.netcache.InventoryTransactionCache;

public abstract class AbstractStateIdTrackInventoryHorseOpen extends MiddleInventoryHorseOpen {

	protected AbstractStateIdTrackInventoryHorseOpen(IMiddlePacketInit init) {
		super(init);
	}

	protected final InventoryTransactionCache transactionCache = cache.getTransactionCache();

	@Override
	protected void handle() {
		super.handle();
		transactionCache.openInventory();
	}

}
