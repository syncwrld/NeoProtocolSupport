package protocolsupport.protocol.packet;

import protocolsupport.zplatform.ServerPlatform;
import protocolsupportbuildprocessor.Preload;

@Preload
public enum ClientBoundPacketType {

	LOGIN_DISCONNECT(ServerPlatform.get().getPacketFactory().getOutLoginDisconnectPacketId()),
	LOGIN_ENCRYPTION_BEGIN(ServerPlatform.get().getPacketFactory().getOutLoginEncryptionBeginPacketId()),
	LOGIN_SUCCESS(ServerPlatform.get().getPacketFactory().getOutLoginSuccessPacketId()),
	LOGIN_SET_COMPRESSION(ServerPlatform.get().getPacketFactory().getOutLoginSetCompressionPacketId()),
	LOGIN_CUSTOM_PAYLOAD(ServerPlatform.get().getPacketFactory().getOutLoginCustomPayloadPacketId()),
	STATUS_SERVER_INFO(ServerPlatform.get().getPacketFactory().getOutStatusServerInfoPacketId()),
	STATUS_PONG(ServerPlatform.get().getPacketFactory().getOutStatusPongPacketId()),
	PLAY_KEEP_ALIVE(ServerPlatform.get().getPacketFactory().getOutPlayKeepAlivePacketId()),
	PLAY_START_GAME(ServerPlatform.get().getPacketFactory().getOutPlayLoginPacketId()),
	PLAY_CHAT(ServerPlatform.get().getPacketFactory().getOutPlayChatPacketId()),
	PLAY_UPDATE_TIME(ServerPlatform.get().getPacketFactory().getOutPlayUpdateTimePacketId()),
	PLAY_SPAWN_POSITION(ServerPlatform.get().getPacketFactory().getOutPlaySpawnPositionPacketId()),
	PLAY_SET_HEALTH(ServerPlatform.get().getPacketFactory().getOutPlayUpdateHealthPacketId()),
	PLAY_SET_EXPERIENCE(ServerPlatform.get().getPacketFactory().getOutPlayExperiencePacketId()),
	PLAY_SET_COOLDOWN(ServerPlatform.get().getPacketFactory().getOutPlaySetCooldownPacketId()),
	PLAY_RESPAWN(ServerPlatform.get().getPacketFactory().getOutPlayRespawnPacketId()),
	PLAY_POSITION(ServerPlatform.get().getPacketFactory().getOutPlayPositionPacketId()),
	PLAY_HELD_SLOT(ServerPlatform.get().getPacketFactory().getOutPlayHeldSlotPacketId()),
	PLAY_SPAWN_NAMED(ServerPlatform.get().getPacketFactory().getOutPlaySpawnNamedPacketId()),
	PLAY_COLLECT_EFFECT(ServerPlatform.get().getPacketFactory().getOutPlayCollectEffectPacketId()),
	PLAY_SPAWN_OBJECT(ServerPlatform.get().getPacketFactory().getOutPlaySpawnObjectPacketId()),
	PLAY_SPAWN_LIVING(ServerPlatform.get().getPacketFactory().getOutPlaySpawnLivingPacketId()),
	PLAY_SPAWN_PAINTING(ServerPlatform.get().getPacketFactory().getOutPlaySpawnPaintingPacketId()),
	PLAY_SPAWN_EXP_ORB(ServerPlatform.get().getPacketFactory().getOutPlaySpawnExpOrbPacketId()),
	PLAY_ENTITY_DESTROY(ServerPlatform.get().getPacketFactory().getOutPlayEntityDestroyPacketId()),
	PLAY_ENTITY_VELOCITY(ServerPlatform.get().getPacketFactory().getOutPlayEntityVelocityPacketId()),
	PLAY_ENTITY_REL_MOVE(ServerPlatform.get().getPacketFactory().getOutPlayEntityRelMovePacketId()),
	PLAY_ENTITY_LOOK(ServerPlatform.get().getPacketFactory().getOutPlayEntityLookPacketId()),
	PLAY_ENTITY_REL_MOVE_LOOK(ServerPlatform.get().getPacketFactory().getOutPlayEntityRelMoveLookPacketId()),
	PLAY_ENTITY_TELEPORT(ServerPlatform.get().getPacketFactory().getOutPlayEntityTeleportPacketId()),
	PLAY_ENTITY_HEAD_ROTATION(ServerPlatform.get().getPacketFactory().getOutPlayEntityHeadRotationPacketId()),
	PLAY_ENTITY_LEASH(ServerPlatform.get().getPacketFactory().getOutPlayEntityLeashPacketId()),
	PLAY_ENTITY_PASSENGERS(ServerPlatform.get().getPacketFactory().getOutPlaySetPassengersPacketId()),
	PLAY_ENTITY_METADATA(ServerPlatform.get().getPacketFactory().getOutPlayEntityMetadataPacketId()),
	PLAY_ENTITY_ATTRIBUTES(ServerPlatform.get().getPacketFactory().getOutPlayEntityAttributesPacketId()),
	PLAY_ENTITY_STATUS(ServerPlatform.get().getPacketFactory().getOutPlayEntityStatusPacketId()),
	PLAY_ENTITY_ANIMATION(ServerPlatform.get().getPacketFactory().getOutPlayAnimationPacketId()),
	PLAY_ENTITY_EFFECT_ADD(ServerPlatform.get().getPacketFactory().getOutPlayEntityEffectAddPacketId()),
	PLAY_ENTITY_EFFECT_REMOVE(ServerPlatform.get().getPacketFactory().getOutPlayEntityEffectRemovePacketId()),
	PLAY_ENTITY_EQUIPMENT(ServerPlatform.get().getPacketFactory().getOutPlayEntityEquipmentPacketId()),
	PLAY_ENTITY_SOUND(ServerPlatform.get().getPacketFactory().getOutPlayEntitySoundPacketId()),
	PLAY_CHUNK_DATA(ServerPlatform.get().getPacketFactory().getOutPlayChunkDataPacketId()),
	PLAY_CHUNK_LIGHT(ServerPlatform.get().getPacketFactory().getOutPlayChunkLightPacketId()),
	PLAY_BLOCK_CHANGE_MULTI(ServerPlatform.get().getPacketFactory().getOutPlayBlockChangeMultiPacketId()),
	PLAY_BLOCK_CHANGE_SINGLE(ServerPlatform.get().getPacketFactory().getOutPlayBlockChangeSinglePacketId()),
	PLAY_BLOCK_TILE(ServerPlatform.get().getPacketFactory().getOutPlayUpdateTilePacketId()),
	PLAY_BLOCK_ACTION(ServerPlatform.get().getPacketFactory().getOutPlayBlockActionPacketId()),
	PLAY_BLOCK_BREAK_ANIMATION(ServerPlatform.get().getPacketFactory().getOutPlayBlockBreakAnimationPacketId()),
	PLAY_EXPLOSION(ServerPlatform.get().getPacketFactory().getOutPlayExplosionPacketId()),
	PLAY_WORLD_EVENT(ServerPlatform.get().getPacketFactory().getOutPlayWorldEventPacketId()),
	PLAY_WORLD_SOUND(ServerPlatform.get().getPacketFactory().getOutPlayWorldSoundPacketId()),
	PLAY_WORLD_PARTICLES(ServerPlatform.get().getPacketFactory().getOutPlayWorldParticlesPacketId()),
	PLAY_GAME_STATE_CHANGE(ServerPlatform.get().getPacketFactory().getOutPlayGameStateChangePacketId()),
	PLAY_WINDOW_OPEN(ServerPlatform.get().getPacketFactory().getOutPlayWindowOpenPacketId()),
	PLAY_WINDOW_HORSE_OPEN(ServerPlatform.get().getPacketFactory().getOutPlayWindowHorseOpenPacketId()),
	PLAY_WINDOW_CLOSE(ServerPlatform.get().getPacketFactory().getOutPlayWindowClosePacketId()),
	PLAY_WINDOW_SET_SLOT(ServerPlatform.get().getPacketFactory().getOutPlayWindowSetSlotPacketId()),
	PLAY_WINDOW_SET_ITEMS(ServerPlatform.get().getPacketFactory().getOutPlayWindowSetItemsPacketId()),
	PLAY_WINDOW_DATA(ServerPlatform.get().getPacketFactory().getOutPlayWindowDataPacketId()),
	PLAY_UPDATE_MAP(ServerPlatform.get().getPacketFactory().getOutPlayMapPacketId()),
	PLAY_SIGN_EDITOR(ServerPlatform.get().getPacketFactory().getOutPlaySignEditorPacketId()),
	PLAY_STATISTICS(ServerPlatform.get().getPacketFactory().getOutPlayStatisticsPacketId()),
	PLAY_PLAYER_INFO(ServerPlatform.get().getPacketFactory().getOutPlayPlayerInfoPacketId()),
	PLAY_PLAYER_ABILITIES(ServerPlatform.get().getPacketFactory().getOutPlayAbilitiesPacketId()),
	PLAY_TAB_COMPLETE(ServerPlatform.get().getPacketFactory().getOutPlayTabCompletePacketId()),
	PLAY_SCOREBOARD_OBJECTIVE(ServerPlatform.get().getPacketFactory().getOutPlayScoreboardObjectivePacketId()),
	PLAY_SCOREBOARD_SCORE(ServerPlatform.get().getPacketFactory().getOutPlayScoreboardScorePacketId()),
	PLAY_SCOREBOARD_DISPLAY_SLOT(ServerPlatform.get().getPacketFactory().getOutPlayScoreboardDisplaySlotPacketId()),
	PLAY_SCOREBOARD_TEAM(ServerPlatform.get().getPacketFactory().getOutPlayScoreboardTeamPacketId()),
	PLAY_CUSTOM_PAYLOAD(ServerPlatform.get().getPacketFactory().getOutPlayCustomPayloadPacketId()),
	PLAY_KICK_DISCONNECT(ServerPlatform.get().getPacketFactory().getOutPlayKickDisconnectPacketId()),
	PLAY_RESOURCE_PACK(ServerPlatform.get().getPacketFactory().getOutPlayResourcePackPacketId()),
	PLAY_CAMERA(ServerPlatform.get().getPacketFactory().getOutPlayCameraPacketId()),
	PLAY_PLAYER_LIST_HEADER_FOOTER(ServerPlatform.get().getPacketFactory().getOutPlayPlayerListHeaderFooterPacketId()),
	PLAY_CHUNK_UNLOAD(ServerPlatform.get().getPacketFactory().getOutPlayChunkUnloadPacketId()),
	PLAY_WORLD_CUSTOM_SOUND(ServerPlatform.get().getPacketFactory().getOutPlayWorldCustomSoundPacketId()),
	PLAY_SERVER_DIFFICULTY(ServerPlatform.get().getPacketFactory().getOutPlayServerDifficultyPacketId()),
	PLAY_BOSS_BAR(ServerPlatform.get().getPacketFactory().getOutPlayBossBarPacketId()),
	PLAY_VEHICLE_MOVE(ServerPlatform.get().getPacketFactory().getOutPlayVehicleMovePacketId()),
	PLAY_UNLOCK_RECIPES(ServerPlatform.get().getPacketFactory().getOutPlayUnlockRecipesPacketId()),
	PLAY_ADVANCEMENTS(ServerPlatform.get().getPacketFactory().getOutPlayAdvancementsPacketId()),
	PLAY_ADVANCEMENTS_TAB(ServerPlatform.get().getPacketFactory().getOutPlayAdvancementsTabPacketId()),
	PLAY_CRAFT_RECIPE_CONFIRM(ServerPlatform.get().getPacketFactory().getOutPlayCraftRecipeConfirmPacketId()),
	PLAY_DECLARE_COMMANDS(ServerPlatform.get().getPacketFactory().getOutPlayDeclareCommandsPacketId()),
	PLAY_DECLARE_RECIPES(ServerPlatform.get().getPacketFactory().getOutPlayDeclareRecipesPacketId()),
	PLAY_DECLARE_TAGS(ServerPlatform.get().getPacketFactory().getOutPlayDeclareTagsPacket()),
	PLAY_QUERY_NBT_RESPONSE(ServerPlatform.get().getPacketFactory().getOutPlayQueryNBTResponsePacketId()),
	PLAY_STOP_SOUND(ServerPlatform.get().getPacketFactory().getOutPlayStopSoundPacketId()),
	PLAY_LOOK_AT(ServerPlatform.get().getPacketFactory().getOutPlayLookAtPacketId()),
	PLAY_SET_VIEW_CENTER(ServerPlatform.get().getPacketFactory().getOutPlaySetViewCenterPacketId()),
	PLAY_UPDATE_VIEW_DISTANCE(ServerPlatform.get().getPacketFactory().getOutPlayUpdateViewDistancePacketId()),
	PLAY_UPDATE_SIMULATION_DISTANCE(ServerPlatform.get().getPacketFactory().getOutPlayUpdateSimulationDistancePacketId()),
	PLAY_MERCHANT_TRADE_LIST(ServerPlatform.get().getPacketFactory().getOutPlayMerchantTradeListPacketId()),
	PLAY_BOOK_OPEN(ServerPlatform.get().getPacketFactory().getOutPlayBookOpenPacketId()),
	PLAY_BLOCK_BREAK_CONFIRM(ServerPlatform.get().getPacketFactory().getOutPlayAcknowledgePlayerDiggingPacketId()),
	PLAY_TITLE_TEXT(ServerPlatform.get().getPacketFactory().getOutPlayTitleTextPacketId()),
	PLAY_TITLE_SUBTEXT(ServerPlatform.get().getPacketFactory().getOutPlayTitleSubTextPacketId()),
	PLAY_TITLE_ANIMATION(ServerPlatform.get().getPacketFactory().getOutPlayTitleAnimationPacketId()),
	PLAY_TITLE_CLEAR(ServerPlatform.get().getPacketFactory().getOutPlayTitleClearPacketId()),
	PLAY_ACTIONBAR(ServerPlatform.get().getPacketFactory().getOutPlayActionbarPacketId()),
	PLAY_WORLDBORDER_INIT(ServerPlatform.get().getPacketFactory().getOutPlayWorldborderInitPacketId()),
	PLAY_WORLDBORDER_CENTER(ServerPlatform.get().getPacketFactory().getOutPlayWorldborderCenterPacketId()),
	PLAY_WORLDBORDER_LERP_SIZE(ServerPlatform.get().getPacketFactory().getOutPlayWorldborderLerpSizePacketId()),
	PLAY_WORLDBORDER_SIZE(ServerPlatform.get().getPacketFactory().getOutPlayWorldborderSizePacketId()),
	PLAY_WORLDBORDER_WARN_DELAY(ServerPlatform.get().getPacketFactory().getOutPlayWorldborderWarnDelayPacketId()),
	PLAY_WORLDBORDER_WARN_DISTANCE(ServerPlatform.get().getPacketFactory().getOutPlayWorldborderWarnDistancePacketId()),
	PLAY_COMBAT_BEGIN(ServerPlatform.get().getPacketFactory().getOutPlayCombatBeginPacketId()),
	PLAY_COMBAT_END(ServerPlatform.get().getPacketFactory().getOutPlayCombatEndPacketId()),
	PLAY_COMBAT_DEATH(ServerPlatform.get().getPacketFactory().getOutPlayCombatDeathPacketId()),
	PLAY_VIBRATION(ServerPlatform.get().getPacketFactory().getOutPlayVibration()),
	PLAY_SYNC_PING(ServerPlatform.get().getPacketFactory().getOutPlaySyncPing()),

	CLIENTBOUND_LEGACY_PLAY_UPDATE_SIGN(-1),
	CLIENTBOUND_LEGACY_PLAY_USE_BED(-1),
	CLIENTBOUND_LEGACY_PLAY_SPAWN_GLOBAL(-1),
	CLIENTBOUND_LEGACY_PLAY_WINDOW_TRANSACTION(-1);

	private final int id;

	private ClientBoundPacketType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}


	private static final int count = values().length;

	public static int getValuesCount() {
		return count;
	}

}
