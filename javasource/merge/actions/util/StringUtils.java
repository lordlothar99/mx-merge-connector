package merge.actions.util;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IMendixObjectMember;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringUtils {
    private StringUtils() {}

    public static String toString(IMendixObject mxObject, IContext context) {
        return toString(mxObject, context, "  ");
    }
    public static String toString(IMendixObject mxObject, IContext context, String indent) {
        ToStringBuilder builder = new ToStringBuilder(indent);
        Map<String, ? extends IMendixObjectMember<?>> members = mxObject.getMembers(context);
        for (Map.Entry<String, ? extends IMendixObjectMember<?>> entry : members.entrySet()) {
            builder.append(entry.getKey(), entry.getValue().getValue(context));
        }
        return builder.toString();
    }

    public static class ToStringBuilder {
        private Map<String, Object> fields = new LinkedHashMap<>();
        private String indent;
        public ToStringBuilder() {
            this("  ");
        }
        public ToStringBuilder(String indent) {
            this.indent = indent;
        }
        public void append(String name, Object value) {
            fields.put(name, value);
        }
        public String toString() {
            String sep = indent;
            StringBuilder builder = new StringBuilder("{\n");
            for (Map.Entry<String, Object> entry : fields.entrySet()) {
                builder.append(sep).append(entry.getKey()).append(": ").append(entry.getValue());
                sep = ",\n" + indent;
            }
            return builder.append("\n}").toString();
        }
    }
}
