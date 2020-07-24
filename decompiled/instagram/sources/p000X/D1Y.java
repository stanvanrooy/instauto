package p000X;

import android.util.LruCache;
import java.util.regex.Pattern;

/* renamed from: X.D1Y */
public final class D1Y {
    public static D1Y A01;
    public static final Pattern A02 = Pattern.compile("(.*)\\/live-dash\\/live-ll-(\\w+)-(a|v)/(\\d+)\\-(\\d+)\\.m4(a|v)");
    public final LruCache A00 = new LruCache(12);
}
