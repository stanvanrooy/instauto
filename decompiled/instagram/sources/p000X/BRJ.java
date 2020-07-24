package p000X;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

/* renamed from: X.BRJ */
public final class BRJ {
    public AnonymousClass7K8 A00;
    public final TelephonyManager A01;
    public final Context A02;

    public static SubscriptionInfo A00(BRJ brj, int i) {
        SubscriptionManager from;
        if (Build.VERSION.SDK_INT < 22 || !brj.A0C() || (from = SubscriptionManager.from(brj.A02)) == null) {
            return null;
        }
        return from.getActiveSubscriptionInfoForSimSlotIndex(i);
    }

    public static AnonymousClass7K8 A01(BRJ brj) {
        if (brj.A00 == null) {
            brj.A00 = new AnonymousClass7K8(brj.A02);
        }
        return brj.A00;
    }

    public static boolean A07(String str) {
        if (str == null || str.equals("")) {
            return true;
        }
        return false;
    }

    public final String A08(int i) {
        TelephonyManager telephonyManager;
        String str = null;
        if (Build.VERSION.SDK_INT >= 29 || this.A02.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0 || (telephonyManager = this.A01) == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            str = telephonyManager.getDeviceId(i);
        }
        if (str == null && i == 0) {
            return this.A01.getDeviceId();
        }
        return str;
    }

    public final boolean A0C() {
        if (this.A02.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            return true;
        }
        return false;
    }

    public BRJ(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A01 = (TelephonyManager) applicationContext.getSystemService("phone");
    }

    public static String A02(BRJ brj, int i) {
        SubscriptionInfo A002 = A00(brj, i);
        if (A002 != null) {
            return A002.getCountryIso();
        }
        return null;
    }

    public static String A03(BRJ brj, int i) {
        SubscriptionInfo A002 = A00(brj, i);
        if (A002 == null || A002.getDisplayName() == null) {
            return null;
        }
        return A002.getDisplayName().toString();
    }

    public static String A04(BRJ brj, int i) {
        SubscriptionInfo A002 = A00(brj, i);
        if (A002 != null) {
            return A002.getNumber();
        }
        return null;
    }

    public static String A05(BRJ brj, int i) {
        SubscriptionInfo A002 = A00(brj, i);
        if (A002 != null) {
            return A002.getIccId();
        }
        return null;
    }

    public static String A06(BRJ brj, int i) {
        SubscriptionInfo A002 = A00(brj, i);
        if (A002 != null) {
            return AnonymousClass000.A0E(String.valueOf(A002.getMcc()), String.valueOf(A002.getMnc()));
        }
        return null;
    }

    public final String A09(int i) {
        SubscriptionInfo A002 = A00(this, i);
        if (A002 == null || A002.getCarrierName() == null) {
            return null;
        }
        return A002.getCarrierName().toString();
    }

    public final String A0A(int i) {
        SubscriptionInfo A002 = A00(this, i);
        if (A002 != null) {
            return String.valueOf(A002.getMcc());
        }
        return null;
    }

    public final String A0B(int i) {
        SubscriptionInfo A002 = A00(this, i);
        if (A002 != null) {
            return String.valueOf(A002.getMnc());
        }
        return null;
    }
}
