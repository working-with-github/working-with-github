package mafoe;

import org.joda.time.DateTime;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

/**
 * @author EMAFOER
 * @version $Id $
 * @since 25.01.2018
 */
public class JodaToJava8ConverterTest {

	@Test
	public void testConvertTimestamp() {

		DateTime jodaTime = DateTime.parse("2010-06-30T01:20+02:00");
		ZonedDateTime zonedDateTime = JodaToJava8Converter.convertTimestamp(jodaTime);
		assertEquals("2010-06-30T01:20+02:00", zonedDateTime.toString());
	}
}