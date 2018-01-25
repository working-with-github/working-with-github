package mafoe;

import org.joda.time.DateTime;

import java.time.ZoneId;

/**
 * Converts Joda time objects to javax.time objects.
 *
 * @author EMAFOER
 * @version $Id $
 * @since 25.01.2018
 */
public class JodaToJava8Converter {

	public static java.time.ZonedDateTime convertTimestamp(DateTime jodaDateTime) {

		String zoneId = jodaDateTime.getZone().getID();
		return java.time.ZonedDateTime.of(
				jodaDateTime.getYear(),
				jodaDateTime.getMonthOfYear(),
				jodaDateTime.getDayOfMonth(),
				jodaDateTime.getHourOfDay(),
				jodaDateTime.getMinuteOfHour(),
				jodaDateTime.getSecondOfMinute(),
				jodaDateTime.getMillisOfSecond() * 1000 * 1000,
				ZoneId.of(zoneId));
	}
}
