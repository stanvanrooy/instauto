package p000X;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.0Qe  reason: invalid class name and case insensitive filesystem */
public final class C06730Qe {
    public final C14590lB A00;

    public final int A01(String str, String str2, String str3, String str4) {
        int i;
        if (str3 == null || str2 == null) {
            i = -1;
        } else {
            i = A00(AnonymousClass000.A0O(str, ":", str2, ":", str3), str4);
        }
        if (str2 != null && i == -1) {
            i = A00(AnonymousClass000.A0J(str, ":", str2), str4);
        }
        if (i == -1) {
            i = A00(str, str4);
        }
        if (i == -2) {
            return 0;
        }
        if (i != -1) {
            return i;
        }
        return 1;
    }

    public final C14610lD A02(String str) {
        if (str == null) {
            str = "0";
        }
        return this.A00.A00(AnonymousClass000.A0E("ig_pigeon_sampling_policy_v2_", str));
    }

    public C06730Qe(Context context) {
        this.A00 = C22440yQ.A00(context);
    }

    public final int A00(String str, String str2) {
        C14610lD A02 = A02(str2);
        Set emptySet = Collections.emptySet();
        C14610lD.A01(A02);
        synchronized (A02.A02) {
            try {
                Set set = (Set) A02.A04.get("__blacklist__");
                if (set != null) {
                    emptySet = set;
                }
            } catch (ClassCastException e) {
                throw C14610lD.A00(A02, e, "__blacklist__");
            }
        }
        if (emptySet.contains(str)) {
            return -2;
        }
        return A02.A03(str, -1);
    }

    public final String A03(String str) {
        C14610lD A02 = A02(str);
        String str2 = null;
        C14610lD.A01(A02);
        synchronized (A02.A02) {
            try {
                String str3 = (String) A02.A04.get("__config_checksum__");
                if (str3 != null) {
                    str2 = str3;
                }
            } catch (ClassCastException e) {
                throw C14610lD.A00(A02, e, "__config_checksum__");
            }
        }
        return str2;
    }
}
