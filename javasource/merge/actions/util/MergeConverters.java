package merge.actions.util;

import com.mendix.systemwideinterfaces.core.IContext;
import merge.proxies.NullableBoolean;
import merge.proxies._String;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

import java.util.Date;
import java.util.function.Function;

import static org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS;
import static org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND;


public class MergeConverters {
    private MergeConverters() {}

    public static Boolean asBoolean(NullableBoolean nullableBoolean) {
        if (nullableBoolean == null) {
            return null;
        } else if (NullableBoolean._True.equals(nullableBoolean.getCaption())) {
            return true;
        } else if (NullableBoolean._False.equals(nullableBoolean.getCaption())) {
            return false;
        } else {
            return null;
        }
    }

    public static OffsetDateTime asOffsetDateTime(Date date) {
        if (date == null) return null;

        Instant instant = Instant.ofEpochMilli(date.getTime());
        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, org.threeten.bp.ZoneOffset.UTC);
        return offsetDateTime;
    }

    public static Date asDate(OffsetDateTime dateTime) {
        if (dateTime == null) return null;

        long instantSecs = dateTime.getLong(INSTANT_SECONDS);
        int nanoOfSecond = dateTime.get(NANO_OF_SECOND);
        java.time.Instant instant = java.time.Instant.ofEpochSecond(instantSecs, nanoOfSecond);
        Date date = Date.from(instant);
        return date;
    }

    public static <T> Function<T, _String> to_String(IContext context) {
        return o -> {
            if (o == null) return null;
            _String _string = new _String(context);
            _string.setValue(o.toString());
            return _string;
        };
    }
}
