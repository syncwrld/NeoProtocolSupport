package protocolsupport.protocol.typeremapper.block;

import java.util.Arrays;
import java.util.Map.Entry;

import org.bukkit.Material;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import protocolsupport.protocol.utils.MappingsData;
import protocolsupport.protocol.utils.minecraftdata.MinecraftBlockData;
import protocolsupport.utils.ResourceUtils;
import protocolsupportbuildprocessor.Preload;

@SuppressWarnings("deprecation")
@Preload
public class PreFlatteningBlockIdData {

	private PreFlatteningBlockIdData() {
	}

	private static final int[] toLegacyId = new int[MinecraftBlockData.BLOCKDATA_COUNT];

	static {
		Arrays.fill(toLegacyId, Material.LEGACY_BEDROCK.getId() << 4);

		JsonObject rootObject = ResourceUtils.getAsJsonObject(MappingsData.getResourcePath("preflatteningblockdataid.json"));
		for (Entry<String, JsonElement> blockdataEntry : rootObject.entrySet()) {
			toLegacyId[Integer.parseInt(blockdataEntry.getKey())] = blockdataEntry.getValue().getAsInt();
		}
	}

	/**
	 * Returns the legacy block id + data combined into int <br>
	 * This combined id is encoded the same as follows: ((blockId << 4) | (data))
	 * @param modernId modern block id
	 * @return legacy block id + data combined into int
	 */
	public static int getCombinedId(int modernId) {
		return toLegacyId[modernId];
	}

	/**
	 * Extracts block id from legacy combined id (returned by {@link PreFlatteningBlockIdData#getCombinedId(int)})
	 * @param legacyId legacy combined block id
	 * @return block id
	 */
	public static int getIdFromCombinedId(int legacyId) {
		return legacyId >> 4;
	}

	/**
	 * Extracts data from legacy combined id (returned by {@link PreFlatteningBlockIdData#getCombinedId(int)})
	 * @param legacyId legacy combined block id
	 * @return data
	 */
	public static int getDataFromCombinedId(int legacyId) {
		return legacyId & 0xF;
	}

	/**
	 * Returns the legacy block id + data combined into int <br>
	 * This combined id is encoded as follows: ((block id) | (data << 12))
	 * @param modernId modern block id
	 * @return legacy block id + data combined into int
	 */
	public static int getCombinedIdM12(int modernId) {
		return convertCombinedIdToM12(getCombinedId(modernId));
	}

	/**
	 * Returns the legacy block id + data combined into int <br>
	 * This combined id is encoded as follows: ((block id) | (data << 16))
	 * @param modernId modern block id
	 * @return legacy block id + data combined into int
	 */
	public static int getCombinedIdM16(int modernId) {
		return convertCombinedIdToM16(getCombinedId(modernId));
	}

	/**
	 * Converts legacy combined block id (returned by {@link PreFlatteningBlockIdData#getCombinedId(int)}) to another combined id <br>
	 * This combined id is encoded as follows: ((block id) | (data << 12)) <br>
	 * @param legacyId legacy combined block id
	 * @return combined id in another form
	 */
	public static int convertCombinedIdToM12(int legacyId) {
		return (getIdFromCombinedId(legacyId)) | (getDataFromCombinedId(legacyId) << 12);
	}

	/**
	 * Converts legacy combined block id (returned by {@link PreFlatteningBlockIdData#getCombinedId(int)}) to another combined id <br>
	 * This combined id is encoded as follows: ((block id) | (data << 16)) <br>
	 * @param legacyId legacy combined block id
	 * @return combined id in another form
	 */
	public static int convertCombinedIdToM16(int legacyId) {
		return (getIdFromCombinedId(legacyId)) | (getDataFromCombinedId(legacyId) << 16);
	}

}
