package p000X;

import android.content.Context;
import android.util.LruCache;

/* renamed from: X.1lR  reason: invalid class name and case insensitive filesystem */
public final class C38541lR {
    public static final LruCache A00 = new LruCache(100);

    public static String A00(AnonymousClass1NJ r3, Context context, boolean z) {
        C12670hC.A02();
        if (z) {
            return AnonymousClass18D.A03.BWk(r3.A0F().AZc()).A03;
        }
        LruCache lruCache = A00;
        if (lruCache.get(r3.APo()) != null) {
            return (String) lruCache.get(r3.APo());
        }
        String str = AnonymousClass18D.A03.BWk(r3.A0v(context)).A03;
        A00.put(r3.APo(), str);
        return str;
    }
}
