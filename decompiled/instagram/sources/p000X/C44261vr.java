package p000X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1vr  reason: invalid class name and case insensitive filesystem */
public final class C44261vr implements SharedPreferences.Editor {
    public final Object A00 = new Object();
    public final Map A01 = new HashMap();
    public final /* synthetic */ C22560yd A02;

    public C44261vr(C22560yd r3) {
        this.A02 = r3;
        int A03 = AnonymousClass0Z0.A03(1376558952);
        AnonymousClass0Z0.A0A(-1098578504, A03);
    }

    public static void A00(C44261vr r6, Set set) {
        int A03 = AnonymousClass0Z0.A03(-1542822346);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = r6.A02.A07.iterator();
            while (it2.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(r6.A02, str);
            }
        }
        AnonymousClass0Z0.A0A(2101402947, A03);
    }

    private void A01(HashMap hashMap) {
        int A03 = AnonymousClass0Z0.A03(-997902121);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                this.A02.A02.remove(str);
            } else {
                this.A02.A02.put(str, value);
            }
        }
        AnonymousClass0Z0.A0A(1311280045, A03);
    }

    public final void apply() {
        HashMap hashMap;
        int A03 = AnonymousClass0Z0.A03(-240198440);
        synchronized (this.A02.A06) {
            try {
                synchronized (this.A00) {
                    hashMap = new HashMap(this.A01);
                }
                A01(hashMap);
                this.A02.A04.schedule(new C44271vs(this, new HashMap(this.A02.A02), hashMap.keySet()));
            } catch (Throwable th) {
                AnonymousClass0Z0.A0A(359217271, A03);
                throw th;
            }
        }
        AnonymousClass0Z0.A0A(1761489124, A03);
    }

    public final SharedPreferences.Editor clear() {
        int A03 = AnonymousClass0Z0.A03(-1339135936);
        synchronized (this.A00) {
            try {
                for (String put : this.A02.A02.keySet()) {
                    this.A01.put(put, (Object) null);
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(1714204686, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-548350664, A03);
        return this;
    }

    public final boolean commit() {
        HashMap hashMap;
        Set keySet;
        int A03 = AnonymousClass0Z0.A03(-1724877419);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (this.A02.A06) {
            try {
                synchronized (this.A00) {
                    hashMap = new HashMap(this.A01);
                }
                A01(hashMap);
                HashMap hashMap2 = new HashMap(this.A02.A02);
                keySet = hashMap.keySet();
                this.A02.A04.schedule(new AnonymousClass515(this, atomicBoolean, hashMap2, countDownLatch));
            } catch (Throwable th) {
                AnonymousClass0Z0.A0A(-416420332, A03);
                throw th;
            }
        }
        try {
            if (!countDownLatch.await(5, TimeUnit.SECONDS)) {
                AnonymousClass0QD.A01("EncryptedSharedPrefs_commit_timedOut", "Timed out waiting for commit to complete.");
                AnonymousClass0Z0.A0A(753579580, A03);
                return false;
            }
            boolean z = atomicBoolean.get();
            if (z) {
                AnonymousClass0a4.A06(keySet);
                if (!keySet.isEmpty()) {
                    A00(this, keySet);
                }
            }
            AnonymousClass0Z0.A0A(-1524777310, A03);
            return z;
        } catch (InterruptedException e) {
            AnonymousClass0QD.A0A("EncryptedSharedPrefs_commit_interrupted", e);
            AnonymousClass0Z0.A0A(-1808759222, A03);
            return false;
        }
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        int A03 = AnonymousClass0Z0.A03(1007991373);
        synchronized (this.A00) {
            try {
                this.A01.put(str, Boolean.valueOf(z));
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(-201788752, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-27655855, A03);
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f) {
        int A03 = AnonymousClass0Z0.A03(1904793230);
        synchronized (this.A00) {
            try {
                this.A01.put(str, Float.valueOf(f));
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(992453712, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(1038560459, A03);
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i) {
        int A03 = AnonymousClass0Z0.A03(197580132);
        synchronized (this.A00) {
            try {
                this.A01.put(str, Integer.valueOf(i));
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(-1106408722, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(1539217503, A03);
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j) {
        int A03 = AnonymousClass0Z0.A03(-1773933412);
        synchronized (this.A00) {
            try {
                this.A01.put(str, Long.valueOf(j));
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(829017319, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(1085574366, A03);
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        int A03 = AnonymousClass0Z0.A03(1179237999);
        synchronized (this.A00) {
            try {
                this.A01.put(str, str2);
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(-381436492, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-1485382964, A03);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        int A03 = AnonymousClass0Z0.A03(1848007994);
        synchronized (this.A00) {
            try {
                this.A01.put(str, set);
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(-433803450, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-1788916929, A03);
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        int A03 = AnonymousClass0Z0.A03(1576692666);
        synchronized (this.A00) {
            try {
                this.A01.put(str, (Object) null);
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0Z0.A0A(1224858454, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0Z0.A0A(-1082026171, A03);
        return this;
    }
}
