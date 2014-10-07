package io.foundationdriven.foundation.api.ban;

import java.util.Date;

/**
 * Created by Jean-Philippe on 2014-10-07.
 */
public interface BanDuration {

	BanDuration addDays(int d);

	BanDuration addMinutes(int m);

	BanDuration addSeconds(int s);

	BanDuration removeDays(int d);

	BanDuration removeMinutes(int m);

	BanDuration removeSeconds(int s);

	BanDuration setDate(Date d);

	BanDuration setDays(int d);

	BanDuration setMinutes(int m);

	BanDuration setSeconds(int s);

}
