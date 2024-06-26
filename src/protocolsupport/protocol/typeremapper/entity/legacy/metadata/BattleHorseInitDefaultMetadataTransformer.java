package protocolsupport.protocol.typeremapper.entity.legacy.metadata;

import java.util.function.Consumer;

import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObject;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.types.networkentity.metadata.objects.NetworkEntityMetadataObjectVarInt;
import protocolsupport.utils.CollectionsUtils.ArrayMap;

public class BattleHorseInitDefaultMetadataTransformer implements Consumer<ArrayMap<NetworkEntityMetadataObject<?>>> {

	public static final BattleHorseInitDefaultMetadataTransformer INSTANCE = new BattleHorseInitDefaultMetadataTransformer();

	@Override
	public void accept(ArrayMap<NetworkEntityMetadataObject<?>> t) {
		NetworkEntityMetadataObjectIndex.BattleHorse.VARIANT.setObject(t, new NetworkEntityMetadataObjectVarInt(0));
		NetworkEntityMetadataObjectIndex.BattleHorse.ARMOR.setObject(t, new NetworkEntityMetadataObjectVarInt(0));
	}

}