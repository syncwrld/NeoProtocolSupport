package protocolsupport.protocol.typeremapper.entity.metadata.types.living.zombie;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataInsentientAttackingToLegacySwingingHandsTransformer;
import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataObjectIndexValueBooleanToByteTransformer;
import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataObjectIndexValueNoOpTransformer;
import protocolsupport.protocol.typeremapper.entity.metadata.types.base.InsentientNetworkEntityMetadataFormatTransformerFactory;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class ZombieNetworkEntityMetadataFormatTransformerFactory extends InsentientNetworkEntityMetadataFormatTransformerFactory {

	public static final ZombieNetworkEntityMetadataFormatTransformerFactory INSTANCE = new ZombieNetworkEntityMetadataFormatTransformerFactory();

	protected ZombieNetworkEntityMetadataFormatTransformerFactory() {
		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.Zombie.BABY, 15), ProtocolVersionsHelper.UP_1_15);
		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.Zombie.BABY, 14), ProtocolVersionsHelper.ALL_1_14);
		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.Zombie.BABY, 12), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.Zombie.BABY, 11), ProtocolVersionsHelper.ALL_1_9);
		addTransformer(new NetworkEntityMetadataObjectIndexValueBooleanToByteTransformer(NetworkEntityMetadataObjectIndex.Zombie.BABY, 12), ProtocolVersionsHelper.DOWN_1_8);

		addTransformer(new NetworkEntityMetadataInsentientAttackingToLegacySwingingHandsTransformer(14), ProtocolVersionsHelper.RANGE__1_11__1_13_2);
		addTransformer(new NetworkEntityMetadataInsentientAttackingToLegacySwingingHandsTransformer(15), ProtocolVersion.MINECRAFT_1_10);
		addTransformer(new NetworkEntityMetadataInsentientAttackingToLegacySwingingHandsTransformer(14), ProtocolVersionsHelper.ALL_1_9);

		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.Zombie.DROWNING, 17), ProtocolVersionsHelper.UP_1_15);
		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.Zombie.DROWNING, 16), ProtocolVersionsHelper.ALL_1_14);
		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.Zombie.DROWNING, 15), ProtocolVersionsHelper.ALL_1_13);
	}

}
