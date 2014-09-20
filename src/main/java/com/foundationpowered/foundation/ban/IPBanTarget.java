package com.foundationpowered.foundation.ban;

/**
 * An IP that has been targeted by a ban
 */
public interface IPBanTarget extends BanTarget {

	String getIP();

	String getLastUsername();

	String getLastUUID();

}
