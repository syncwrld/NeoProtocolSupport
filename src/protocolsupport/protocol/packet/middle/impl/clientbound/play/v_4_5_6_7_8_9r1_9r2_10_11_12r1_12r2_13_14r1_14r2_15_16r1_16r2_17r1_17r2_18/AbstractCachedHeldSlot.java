package protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2_18;

import protocolsupport.protocol.packet.middle.base.clientbound.play.MiddleHeldSlot;
import protocolsupport.protocol.storage.netcache.ClientCache;

public abstract class AbstractCachedHeldSlot extends MiddleHeldSlot {

	protected AbstractCachedHeldSlot(IMiddlePacketInit init) {
		super(init);
	}

	protected final ClientCache clientCache = cache.getClientCache();

	@Override
	protected void handle() {
		clientCache.setHeldSlot(slot);
	}

}
