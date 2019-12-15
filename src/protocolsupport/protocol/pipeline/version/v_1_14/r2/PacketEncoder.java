package protocolsupport.protocol.pipeline.version.v_1_14.r2;

import protocolsupport.api.utils.NetworkState;
import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.v_13_14r1_14r2_15.LoginCustomPayload;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.LoginDisconnect;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.LoginSuccess;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EncryptionRequest;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.SetCompression;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopStatistics;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_10_11_12r1_12r2_13_14r1_14r2_15.EntityEffectAdd;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_10_11_12r1_12r2_13_14r1_14r2_15.WorldCustomSound;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_10_11_12r1_12r2_13_14r1_14r2_15.WorldSound;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_11_12r1_12r2_13_14r1_14r2_15.CollectEffect;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_11_12r1_12r2_13_14r1_14r2_15.Title;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_12r1_12r2_13_14r1_14r2_15.Advancements;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_12r1_12r2_13_14r1_14r2_15.AdvancementsTab;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2.SpawnLiving;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2.WorldParticle;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.CraftRecipeConfirm;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.CustomPayload;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.DeclareCommands;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.LookAt;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.QueryNBTResponse;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.ScoreboardObjective;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.ScoreboardTeam;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.StopSound;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.TabComplete;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_13_14r1_14r2_15.UnlockRecipes;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2.ChangeDimension;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2.Chunk;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2.StartGame;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.BlockAction;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.BlockBreakAnimation;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.BlockChangeMulti;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.BlockChangeSingle;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.BlockOpenSignEditor;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.BlockTileUpdate;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.BookOpen;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.ChunkLight;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.ChunkUnload;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.DeclareRecipes;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.DeclareTags;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.EntityMetadata;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.EntitySound;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.Explosion;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.InventoryHorseOpen;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.InventoryOpen;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.MerchantTradeList;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.ServerDifficulty;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.SetViewCenter;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.SpawnObject;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.SpawnPainting;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.SpawnPosition;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.UpdateMap;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.UpdateViewDistance;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15.WorldEvent;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r2_15.BlockBreakConfirm;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityStatus;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.InventoryClose;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.InventoryConfirmTransaction;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.InventoryData;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.InventorySetItems;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.InventorySetSlot;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.ScoreboardDisplay;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.TimeUpdate;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.PlayerAbilities;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityAnimation;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.GameStateChange;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.HeldSlot;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.KickDisconnect;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.Camera;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.Chat;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.CombatEvent;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.Entity;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityDestroy;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityEffectRemove;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityHeadRotation;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityLook;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntitySetAttributes;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityVelocity;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.KeepAlive;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.PlayerListHeaderFooter;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.PlayerListSetEntry;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.ResourcePack;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.ScoreboardScore;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.SetExperience;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.SetHealth;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.WorldBorder;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2.SpawnNamed;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.BossBar;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityEquipment;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityLeash;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityPassengers;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityRelMove;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityRelMoveLook;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.EntityTeleport;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.SetCooldown;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.SetPosition;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.SpawnExpOrb;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.SpawnGlobal;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.VehicleMove;
import protocolsupport.protocol.packet.middleimpl.clientbound.status.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.Pong;
import protocolsupport.protocol.packet.middleimpl.clientbound.status.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.ServerInfo;
import protocolsupport.protocol.pipeline.version.util.encoder.AbstractPacketEncoder;

public class PacketEncoder extends AbstractPacketEncoder {

	public PacketEncoder(ConnectionImpl connection) {
		super(connection);
	}

	{
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_SUCCESS, LoginSuccess::new);
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_ENCRYPTION_BEGIN, EncryptionRequest::new);
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_DISCONNECT, LoginDisconnect::new);
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_SET_COMPRESSION, SetCompression::new);
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_CUSTOM_PAYLOAD, LoginCustomPayload::new);
		registry.register(NetworkState.STATUS, PacketType.CLIENTBOUND_STATUS_SERVER_INFO, ServerInfo::new);
		registry.register(NetworkState.STATUS, PacketType.CLIENTBOUND_STATUS_PONG, Pong::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_KEEP_ALIVE, KeepAlive::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_START_GAME, StartGame::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CHAT, Chat::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_UPDATE_TIME, TimeUpdate::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_EQUIPMENT, EntityEquipment::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_POSITION, SpawnPosition::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SET_HEALTH, SetHealth::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_RESPAWN, ChangeDimension::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_POSITION, SetPosition::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_HELD_SLOT, HeldSlot::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_ANIMATION, EntityAnimation::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_NAMED, SpawnNamed::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_COLLECT_EFFECT, CollectEffect::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_OBJECT, SpawnObject::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_LIVING, SpawnLiving::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_PAINTING, SpawnPainting::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_EXP_ORB, SpawnExpOrb::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_VELOCITY, EntityVelocity::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_DESTROY, EntityDestroy::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_NOOP, Entity::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_REL_MOVE, EntityRelMove::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_LOOK, EntityLook::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_REL_MOVE_LOOK, EntityRelMoveLook::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_TELEPORT, EntityTeleport::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_HEAD_ROTATION, EntityHeadRotation::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_STATUS, EntityStatus::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_LEASH, EntityLeash::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_METADATA, EntityMetadata::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_EFFECT_ADD, EntityEffectAdd::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_EFFECT_REMOVE, EntityEffectRemove::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_SOUND, EntitySound::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SET_EXPERIENCE, SetExperience::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_ATTRIBUTES, EntitySetAttributes::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CHUNK_SINGLE, Chunk::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_CHANGE_MULTI, BlockChangeMulti::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_CHANGE_SINGLE, BlockChangeSingle::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_ACTION, BlockAction::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_BREAK_ANIMATION, BlockBreakAnimation::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_EXPLOSION, Explosion::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_EVENT, WorldEvent::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_SOUND, WorldSound::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_CUSTOM_SOUND, WorldCustomSound::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_PARTICLES, WorldParticle::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_GAME_STATE_CHANGE, GameStateChange::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_GLOBAL, SpawnGlobal::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_OPEN, InventoryOpen::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_HORSE_OPEN, InventoryHorseOpen::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_CLOSE, InventoryClose::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_SET_SLOT, InventorySetSlot::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_SET_ITEMS, InventorySetItems::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_DATA, InventoryData::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_TRANSACTION, InventoryConfirmTransaction::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_UPDATE_MAP, UpdateMap::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_TILE, BlockTileUpdate::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SIGN_EDITOR, BlockOpenSignEditor::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_PLAYER_INFO, PlayerListSetEntry::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_PLAYER_ABILITIES, PlayerAbilities::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_TAB_COMPLETE, TabComplete::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SCOREBOARD_OBJECTIVE, ScoreboardObjective::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SCOREBOARD_SCORE, ScoreboardScore::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SCOREBOARD_DISPLAY_SLOT, ScoreboardDisplay::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SCOREBOARD_TEAM, ScoreboardTeam::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CUSTOM_PAYLOAD, CustomPayload::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_RESOURCE_PACK, ResourcePack::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_KICK_DISCONNECT, KickDisconnect::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CAMERA, Camera::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_PLAYER_LIST_HEADER_FOOTER, PlayerListHeaderFooter::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_PASSENGERS, EntityPassengers::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_TITLE, Title::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_BORDER, WorldBorder::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CHUNK_UNLOAD, ChunkUnload::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SERVER_DIFFICULTY, ServerDifficulty::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_COMBAT_EVENT, CombatEvent::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SET_COOLDOWN, SetCooldown::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BOSS_BAR, BossBar::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_VEHICLE_MOVE, VehicleMove::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ADVANCEMENTS, Advancements::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ADVANCEMENTS_TAB, AdvancementsTab::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_UNLOCK_RECIPES, UnlockRecipes::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CRAFT_RECIPE_CONFIRM, CraftRecipeConfirm::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_DECLARE_COMMANDS, DeclareCommands::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_DECLARE_RECIPES, DeclareRecipes::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_DECLARE_TAGS, DeclareTags::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_QUERY_NBT_RESPONSE, QueryNBTResponse::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_STOP_SOUND, StopSound::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_LOOK_AT, LookAt::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CHUNK_LIGHT, ChunkLight::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_MERCHANT_TRADE_LIST, MerchantTradeList::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BOOK_OPEN, BookOpen::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SET_VIEW_CENTER, SetViewCenter::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_UPDATE_VIEW_DISTANCE, UpdateViewDistance::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_BREAK_CONFIRM, BlockBreakConfirm::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_STATISTICS, NoopStatistics::new);
	}

}
