package merge.actions.util;

import merge.proxies.NullableBoolean;
import org.threeten.bp.OffsetDateTime;

import java.time.ZoneOffset;

import java.util.Date;

public class MergeConverters {
    private MergeConverters() {
    }

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
        java.time.OffsetDateTime java = date.toInstant().atOffset(ZoneOffset.UTC);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(java.getYear(),
                java.getMonthValue(), java.getDayOfMonth(),
                java.getHour(), java.getMinute(), java.getSecond(),
                java.getNano(), org.threeten.bp.ZoneOffset.of(java.getOffset().getId()));
        return offsetDateTime;
    }
}
