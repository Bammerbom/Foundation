package io.foundationdriven.foundation.api.ban;

import javafx.util.Duration;

import java.util.Date;

public interface Ban {

	/**
	 * If the ban is temporary
	 * @return true if temporary
	 */
	boolean isTemporary();

	/**
	 * If the ban was issued by the system or and administrator
	 * @return  true if issued automatically
	 */
	boolean isSystemIssued();

	/**
	 * If the ban has a expire time defined
	 * @return  true if has a expire time
	 */
	boolean hasExpire();

	/**
	 * If the ban is expired
	 * @return  true if expired
	 */
	boolean isExpired();

	/**
	 * If the ban is pardoned
	 * @return  true if pardoned
	 */
	boolean isPardoned();

	/**
	 * Gets the source that has issued the ban
	 * @return  BanSource
	 */
	BanSource getSource();

	/**
	 * Gets the target of the ban
	 * @return  BanTarget
	 */
	BanTarget getTarget();

	/**
	 * Gets the pardon time of the ban
	 * @return the pardon time if set, null if not
	 */
	Date getExpiresTime();

	/**
	 * Gets the creation time
	 * @return origin date
	 */
	Date getCreated();

	/**
	 * Gets the reason of the ban
	 * @return  reason
	 */
	String getReason();

	/**
	 * Sets the ban expires from the creation time + duration
	 * @param   duration of the ban
	 */
	void setExpireInterval(Duration duration);

	/**
	 * Sets the ban expires to the param date
	 * @param   date of expires
	 */
	void setExpires(Date date);

	/**
	 * Sets if the ban is temporary
	 */
	void setTemporary(boolean temporary);

	/**
	 * Sets the reason of the ban
	 * @param   reason
	 */
	void setReason(String reason);

	/**
	 * Pardons the ban
	 */
	void pardon();

}
