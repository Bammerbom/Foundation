/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 FoundationDriven
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.foundationdriven.foundation.api.ban;

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
	void setExpireInterval(BanDuration duration);

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