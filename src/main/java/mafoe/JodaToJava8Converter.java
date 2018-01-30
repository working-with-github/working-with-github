package mafoe;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.time.ZoneId;

/**
 * Converts Joda time objects to javax.time objects.
 *
 * @author EMAFOER
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

    public static java.time.LocalDate convertLocalDate(LocalDate jodaLocalDate) {

        return java.time.LocalDate.of(
                jodaLocalDate.getYear(),
                jodaLocalDate.getMonthOfYear(),
                jodaLocalDate.getDayOfMonth());
    }
}