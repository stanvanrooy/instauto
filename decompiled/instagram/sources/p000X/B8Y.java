package p000X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.B8Y */
public final class B8Y {
    public final Map A00;
    public final Set A01;

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B8Y)) {
            return false;
        }
        B8Y b8y = (B8Y) obj;
        Set set = b8y.A01;
        if (set != null) {
            z = set.equals(this.A01);
        } else {
            z = false;
            if (this.A01 == null) {
                z = true;
            }
        }
        Map map = b8y.A00;
        if (map != null) {
            z2 = map.equals(this.A00);
        } else {
            z2 = false;
            if (this.A00 == null) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A01, this.A00});
    }

    public static boolean A05(C25216B8b b8b) {
        if (B91.A10.contains(b8b) || B91.A1H.contains(b8b) || B91.A18.contains(b8b) || B91.A1C.contains(b8b) || B91.A13.contains(b8b)) {
            return true;
        }
        return false;
    }

    public B8Y(Map map) {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            C25216B8b b8b = (C25216B8b) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set == null || !set.contains("*|all_packages|*")) {
                if (!hashMap.containsKey(b8b)) {
                    hashMap.put(b8b, new HashSet());
                }
                ((Set) hashMap.get(b8b)).addAll(set);
            } else {
                hashSet.add(b8b);
            }
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
        this.A00 = Collections.unmodifiableMap(hashMap);
    }

    public static B8X A00(int i, Context context) {
        try {
            int i2 = i;
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null && packagesForUid.length != 0) {
                return new B8X(i2, Collections.unmodifiableList(Arrays.asList(packagesForUid)), C25221B8j.A04(context, packagesForUid), (String) null, (String) null);
            }
            throw new C25218B8g(AnonymousClass000.A05("No packageName associated with uid=", i));
        } catch (RuntimeException e) {
            throw new SecurityException(e);
        }
    }

    public static B8X A01(Context context) {
        if (Binder.getCallingPid() != Process.myPid()) {
            return A00(Binder.getCallingUid(), context);
        }
        throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread.");
    }

    public static B8X A02(Context context, Intent intent) {
        int i;
        B8X A002 = AnonymousClass1BW.A00(context, intent);
        if (A002 == null) {
            return null;
        }
        if (Binder.getCallingPid() == Process.myPid() || A002.A00 == -1 || Binder.getCallingUid() == (i = A002.A00)) {
            return new B8X(A002.A00, A002.A04, C25221B8j.A04(context, (String[]) A002.A04.toArray(new String[0])), A002.A03, A002.A02);
        }
        throw new SecurityException(String.format(Locale.US, "Uid %d from PI not equal to uid %d from binder data", new Object[]{Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid())}));
    }

    public static boolean A03(Context context) {
        return A05(C25221B8j.A03(context, context.getPackageName()));
    }

    public static boolean A04(Context context, String str) {
        return A05(C25221B8j.A03(context, str));
    }

    public static boolean A06(C25216B8b b8b, C25216B8b b8b2, boolean z) {
        if (!b8b.equals(b8b2)) {
            if (!z) {
                return false;
            }
            Set set = (Set) B91.A0u.get(b8b2);
            if (set == null) {
                set = B91.A00(B91.A01);
            }
            if (set.contains(b8b)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A07(B8X b8x, Context context) {
        boolean contains = B91.A0w.contains(C25221B8j.A03(context, context.getPackageName()));
        if (b8x == null) {
            return false;
        }
        C25216B8b b8b = b8x.A01;
        C25216B8b b8b2 = b8b;
        if (b8b == null || b8b == null) {
            return false;
        }
        for (C25216B8b A06 : this.A01) {
            if (A06(b8b2, A06, contains)) {
                return true;
            }
        }
        for (C25216B8b b8b3 : this.A00.keySet()) {
            if (A06(b8b2, b8b3, contains)) {
                for (String contains2 : b8x.A04) {
                    if (((Set) this.A00.get(b8b3)).contains(contains2)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
