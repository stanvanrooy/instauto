package p000X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0j9  reason: invalid class name and case insensitive filesystem */
public class C13740j9 {
    public static final Map A04 = new HashMap();
    public final SharedPreferences A00;
    public final AnonymousClass0Q6 A01 = new C13750jA(this);
    public final Map A02 = new HashMap();
    public final Map A03;

    public final synchronized int A03() {
        return this.A03.size();
    }

    public final synchronized int A04(String str) {
        int i = 0;
        synchronized (this) {
            Integer num = (Integer) this.A03.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public final synchronized long A05(String str, long j) {
        Object obj = this.A03.get(str);
        if (obj != null) {
            j = ((Long) obj).longValue();
        }
        return j;
    }

    public final synchronized Set A06(String str, Set set) {
        Set set2 = (Set) this.A03.get(str);
        if (set2 != null) {
            set = new HashSet(set2);
        }
        return set;
    }

    public final synchronized void A07() {
        this.A02.clear();
        this.A03.clear();
        SharedPreferences.Editor edit = this.A00.edit();
        edit.clear();
        edit.apply();
    }

    public final synchronized void A08() {
        if (this.A02.size() > 0) {
            C05700Lp.A00().ADc(new AnonymousClass2L2(this));
        }
    }

    public final synchronized void A09(String str) {
        this.A03.remove(str);
        this.A02.put(str, this);
    }

    public synchronized void A0A(String str, float f) {
        Map map = this.A03;
        Float valueOf = Float.valueOf(f);
        map.put(str, valueOf);
        this.A02.put(str, valueOf);
    }

    public synchronized void A0B(String str, long j) {
        Map map = this.A03;
        Long valueOf = Long.valueOf(j);
        map.put(str, valueOf);
        this.A02.put(str, valueOf);
    }

    public synchronized void A0C(String str, Set set) {
        HashSet hashSet;
        if (set == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(set);
        }
        this.A03.put(str, hashSet);
        this.A02.put(str, hashSet);
    }

    public synchronized void A0D(String str, boolean z) {
        Map map = this.A03;
        Boolean valueOf = Boolean.valueOf(z);
        map.put(str, valueOf);
        this.A02.put(str, valueOf);
    }

    public final synchronized boolean A0E(String str) {
        return this.A03.containsKey(str);
    }

    public final synchronized boolean A0F(String str) {
        boolean z = false;
        synchronized (this) {
            Boolean bool = (Boolean) this.A03.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public static synchronized C13740j9 A00(String str) {
        C13740j9 A012;
        synchronized (C13740j9.class) {
            A012 = A01(str, false, -1);
        }
        return A012;
    }

    public static synchronized C13740j9 A01(String str, boolean z, int i) {
        C13740j9 r2;
        synchronized (C13740j9.class) {
            r2 = (C13740j9) A04.get(str);
            if (r2 == null) {
                SharedPreferences sharedPreferences = StoredPreferences.A00.getSharedPreferences(str, 0);
                if (!z) {
                    r2 = new C13740j9(sharedPreferences);
                } else {
                    r2 = new C149686am(sharedPreferences, i);
                }
                AnonymousClass0Q7.A03().A0B(r2.A01);
                A04.put(str, r2);
            }
        }
        return r2;
    }

    public final synchronized float A02(String str) {
        float f = -1.0f;
        synchronized (this) {
            Float f2 = (Float) this.A03.get(str);
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return f;
    }

    public C13740j9(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
        this.A03 = new HashMap(sharedPreferences.getAll());
    }
}
