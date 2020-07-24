package p000X;

import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.A0Y */
public final class A0Y {
    public static final Pattern A00 = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    public static String A00(String str, A1e a1e) {
        String str2;
        String string;
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < a1e.size(); i++) {
            C23043A0y map = a1e.getMap(i);
            sb.append(map.getString("methodName"));
            sb.append("@");
            if (map.hasKey("file") && !map.isNull("file") && map.getType("file") == ReadableType.String && (string = map.getString("file")) != null) {
                Matcher matcher = A00.matcher(string);
                if (matcher.find()) {
                    str2 = AnonymousClass000.A0E(matcher.group(1), ":");
                    sb.append(str2);
                    if (!map.hasKey("lineNumber") || map.isNull("lineNumber") || map.getType("lineNumber") != ReadableType.Number) {
                        sb.append(-1);
                    } else {
                        sb.append(map.getInt("lineNumber"));
                    }
                    if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                        sb.append(":");
                        sb.append(map.getInt("column"));
                    }
                    sb.append("\n");
                }
            }
            str2 = "";
            sb.append(str2);
            if (!map.hasKey("lineNumber") || map.isNull("lineNumber") || map.getType("lineNumber") != ReadableType.Number) {
            }
            sb.append(":");
            sb.append(map.getInt("column"));
            sb.append("\n");
        }
        return sb.toString();
    }
}
