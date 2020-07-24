package p000X;

import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.LruCache;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1oe  reason: invalid class name and case insensitive filesystem */
public final class C40431oe {
    public static volatile boolean A00;

    public static String A00(String str, String str2, Uri uri) {
        if (uri != null && "127.0.0.1".equals(uri.getHost())) {
            uri = Uri.parse(uri.getQueryParameter("remote-uri"));
        }
        return AnonymousClass000.A0O(str2, ".", str, ".", uri.getLastPathSegment());
    }

    public static void A01(String str, String str2, Object... objArr) {
        if (A00) {
            Log.w(str, String.format(str2, objArr));
        } else {
            String.format(str2, objArr);
        }
    }

    public static void A04(String str, Throwable th, String str2, Object... objArr) {
        if (A00) {
            Log.w(str, String.format(str2, objArr), th);
        } else {
            String.format(str2, objArr);
        }
    }

    public static void A06(AtomicReference atomicReference, String str) {
        LruCache lruCache = (LruCache) atomicReference.get();
        A01("Util", "Trying to resize cache for %s: old=%d, new=%d, SDK=%d", str, Integer.valueOf(lruCache.maxSize()), 10, Integer.valueOf(Build.VERSION.SDK_INT));
        if (lruCache.maxSize() != 10) {
            A01("Util", "Resizing cache for %s: old=%d, new=%d, %d existing items", str, Integer.valueOf(lruCache.maxSize()), 10, Integer.valueOf(lruCache.size()));
            if (Build.VERSION.SDK_INT >= 21) {
                lruCache.resize(10);
                return;
            }
            LruCache lruCache2 = new LruCache(10);
            for (Map.Entry entry : lruCache.snapshot().entrySet()) {
                lruCache2.put(entry.getKey(), entry.getValue());
            }
            atomicReference.set(lruCache2);
        }
    }

    public static void A02(String str, String str2, Object... objArr) {
        Log.e(str, String.format(str2, objArr));
    }

    public static void A03(String str, String str2, Object... objArr) {
        Log.w(str, String.format(str2, objArr));
    }

    public static void A05(String str, Throwable th, String str2, Object... objArr) {
        Log.e(str, String.format(str2, objArr), th);
    }
}
