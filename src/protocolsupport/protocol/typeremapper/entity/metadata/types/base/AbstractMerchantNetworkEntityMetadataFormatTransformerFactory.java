package protocolsupport.protocol.typeremapper.entity.metadata.types.base;

import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataObjectIndexValueNoOpTransformer;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class AbstractMerchantNetworkEntityMetadataFormatTransformerFactory extends AgeableNetworkEntityMetadataFormatTransformerFactory {

	public static final AbstractMerchantNetworkEntityMetadataFormatTransformerFactory INSTANCE = new AbstractMerchantNetworkEntityMetadataFormatTransformerFactory();

	protected AbstractMerchantNetworkEntityMetadataFormatTransformerFactory() {
		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.AbstractMerchant.HEAD_SHAKE_TIMER, 16), ProtocolVersionsHelper.UP_1_15);
		addTransformer(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.AbstractMerchant.HEAD_SHAKE_TIMER, 15), ProtocolVersionsHelper.RANGE__1_14_1__1_14_4);
	}

}
