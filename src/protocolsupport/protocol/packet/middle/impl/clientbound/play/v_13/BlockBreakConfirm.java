package protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13;

import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV13;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13.AbstractChunkCacheBlockBreakConfirm;
import protocolsupport.protocol.typeremapper.block.BlockDataLegacyDataRegistry;
import protocolsupport.protocol.typeremapper.block.BlockRemappingHelper;
import protocolsupport.protocol.typeremapper.block.FlatteningBlockDataRegistry;
import protocolsupport.protocol.typeremapper.block.FlatteningBlockDataRegistry.FlatteningBlockDataTable;
import protocolsupport.protocol.typeremapper.utils.MappingTable.ArrayBasedIntMappingTable;

public class BlockBreakConfirm extends AbstractChunkCacheBlockBreakConfirm implements IClientboundMiddlePacketV13 {

	public BlockBreakConfirm(IMiddlePacketInit init) {
		super(init);
	}

	protected final ArrayBasedIntMappingTable blockDataRemappingTable = BlockDataLegacyDataRegistry.INSTANCE.getTable(version);
	protected final FlatteningBlockDataTable flatteningBlockDataTable = FlatteningBlockDataRegistry.INSTANCE.getTable(version);

	@Override
	protected void write() {
		io.writeClientbound(BlockChangeSingle.create(position, BlockRemappingHelper.remapFlatteningBlockDataId(blockDataRemappingTable, flatteningBlockDataTable, blockId)));
	}

}
