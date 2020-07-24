package p000X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;

/* renamed from: X.1By  reason: invalid class name and case insensitive filesystem */
public final class C26171By implements C06570Po {
    public static boolean A01;
    public static boolean A02;
    public final AnonymousClass0C1 A00;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static int A00(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.isActiveNetworkMetered()) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        return 0;
    }

    public static C26171By A01(AnonymousClass0C1 r2) {
        return (C26171By) r2.AVA(C26171By.class, new C26181Bz(r2));
    }

    public final int A02() {
        int i = C16180oA.A00(this.A00).A00.getInt("data_saver_network_resources_quality", -1);
        if (i == -1) {
            return 1;
        }
        return i;
    }

    public final boolean A03() {
        boolean z = false;
        if (C16180oA.A00(this.A00).A00.getInt("data_saver_mode_on", -1) != -1) {
            z = true;
        }
        if (!z || C16180oA.A00(this.A00).A00.getInt("data_saver_mode_on", -1) != 1) {
            return false;
        }
        return true;
    }

    public C26171By(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    public final boolean A04() {
        boolean z;
        if (A03()) {
            int A022 = A02();
            if (A022 != -1) {
                if (A022 == 0) {
                    z = true;
                } else if (A022 == 1) {
                    z = !AnonymousClass0NT.A08(StoredPreferences.A00);
                } else if (A022 != 2) {
                    throw new IllegalArgumentException("Unexpected network setting value");
                }
                if (z) {
                    return false;
                }
                return true;
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }
}
