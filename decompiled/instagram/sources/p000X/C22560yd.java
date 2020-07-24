package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0yd  reason: invalid class name and case insensitive filesystem */
public final class C22560yd implements SharedPreferences {
    public static final Map A09 = Collections.synchronizedMap(new ArrayMap());
    public C22610yi A00;
    public C22620yj A01;
    public Map A02 = Collections.synchronizedMap(new ArrayMap());
    public final Context A03;
    public final C12830hS A04;
    public final C22590yg A05;
    public final Object A06 = new Object();
    public final CopyOnWriteArraySet A07 = new CopyOnWriteArraySet();
    public final CountDownLatch A08 = new CountDownLatch(1);

    public /* synthetic */ C22560yd(Context context, String str) {
        int A032 = AnonymousClass0Z0.A03(1600933330);
        this.A03 = context;
        C22590yg A033 = C14280kC.A00.A03(context, str);
        if (A033 == null) {
            this.A05 = C14280kC.A00.A02(context, str);
        } else {
            this.A05 = A033;
        }
        this.A04 = C12810hQ.A00();
        AnonymousClass0Z0.A0A(-1275457106, A032);
        AnonymousClass0Z0.A0A(314831134, AnonymousClass0Z0.A03(1076532484));
    }

    private Object A00(String str, Object obj) {
        Object obj2;
        int A032 = AnonymousClass0Z0.A03(-1505933060);
        A01();
        synchronized (this.A06) {
            try {
                obj2 = this.A02.get(str);
                if (obj2 == null) {
                    obj2 = obj;
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(996442631, A032);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-1939977964, A032);
        return obj2;
    }

    private void A01() {
        int A032 = AnonymousClass0Z0.A03(-202323271);
        try {
            this.A08.await();
        } catch (InterruptedException e) {
            AnonymousClass0QD.A0A("EncryptedSharedPrefs_awaitLoaded_interrupted", e);
        }
        AnonymousClass0Z0.A0A(-1323782161, A032);
    }

    public final boolean contains(String str) {
        boolean containsKey;
        int A032 = AnonymousClass0Z0.A03(-672662717);
        A01();
        synchronized (this.A06) {
            try {
                containsKey = this.A02.containsKey(str);
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(690115455, A032);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(2014532696, A032);
        return containsKey;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        int A032 = AnonymousClass0Z0.A03(1294893344);
        int A033 = AnonymousClass0Z0.A03(1997504302);
        A01();
        C44261vr r1 = new C44261vr(this);
        AnonymousClass0Z0.A0A(413305486, A033);
        AnonymousClass0Z0.A0A(1770509925, A032);
        return r1;
    }

    public final Map getAll() {
        HashMap hashMap;
        int A032 = AnonymousClass0Z0.A03(69718043);
        A01();
        synchronized (this.A06) {
            try {
                hashMap = new HashMap(this.A02);
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(2070442821, A032);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-1209791716, A032);
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z) {
        int A032 = AnonymousClass0Z0.A03(-57953491);
        boolean booleanValue = ((Boolean) A00(str, Boolean.valueOf(z))).booleanValue();
        AnonymousClass0Z0.A0A(-482867039, A032);
        return booleanValue;
    }

    public final float getFloat(String str, float f) {
        int A032 = AnonymousClass0Z0.A03(-1258137148);
        float floatValue = ((Float) A00(str, Float.valueOf(f))).floatValue();
        AnonymousClass0Z0.A0A(-1654660068, A032);
        return floatValue;
    }

    public final int getInt(String str, int i) {
        int A032 = AnonymousClass0Z0.A03(-1156680277);
        int intValue = ((Integer) A00(str, Integer.valueOf(i))).intValue();
        AnonymousClass0Z0.A0A(-1637823457, A032);
        return intValue;
    }

    public final long getLong(String str, long j) {
        int A032 = AnonymousClass0Z0.A03(-933570508);
        long longValue = ((Long) A00(str, Long.valueOf(j))).longValue();
        AnonymousClass0Z0.A0A(-114935842, A032);
        return longValue;
    }

    public final String getString(String str, String str2) {
        int A032 = AnonymousClass0Z0.A03(-573993019);
        String str3 = (String) A00(str, str2);
        AnonymousClass0Z0.A0A(-272611614, A032);
        return str3;
    }

    public final Set getStringSet(String str, Set set) {
        int A032 = AnonymousClass0Z0.A03(-2082589080);
        Set set2 = (Set) A00(str, set);
        AnonymousClass0Z0.A0A(-653781812, A032);
        return set2;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A032 = AnonymousClass0Z0.A03(1284932394);
        this.A07.add(onSharedPreferenceChangeListener);
        AnonymousClass0Z0.A0A(-854971396, A032);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A032 = AnonymousClass0Z0.A03(-205434761);
        this.A07.remove(onSharedPreferenceChangeListener);
        AnonymousClass0Z0.A0A(-367345320, A032);
    }
}
