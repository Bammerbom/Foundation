package io.foundationdriven.foundation.api.ban;

import org.spongepowered.api.entity.Player;
import org.spongepowered.api.plugin.Plugin;

import java.util.List;

public interface BanManager {

	/**
	 * Get all bans
	 * @return  all bans
	 */
	List<Ban> getBans();

	/**
	 * Gets all bans that aren't pardoner or expired
	 * @return  active bans
	 */
	List<Ban> getActiveBans();

	boolean isPlayerBanned(Player player);

	boolean isIPBanned(String ip);

	void pardonPlayer(Player player);

	void pardonIP(String ip);

	/**
	 * To be used with a ban builder function.
	 * Automatically kicks the target
	 * @param ban
	 */
	void addBan(Ban ban);

	Ban buildPlayerBan(Player source, Player target);

	Ban buildPlayerBan(Player source, String ip);

	Ban buildSystemBan(Plugin source, Player target);

	Ban buildSystemBan(Plugin source, String ip);

	Ban buildConsoleBan(Player target);

	Ban buildConsoleBan(String ip);

}
