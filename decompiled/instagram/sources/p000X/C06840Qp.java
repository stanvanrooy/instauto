package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0Qp  reason: invalid class name and case insensitive filesystem */
public final class C06840Qp {
    public static final Set A04 = new HashSet(Arrays.asList(new String[]{"com.facebook.orca", "com.facebook.katana"}));
    public ArrayList A00 = new ArrayList();
    public boolean A01 = false;
    public final SharedPreferences A02;
    public final AnonymousClass0RU A03;

    private void A00(C25231B8x b8x) {
        String str = null;
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("phoneid_sync_stats", (AnonymousClass0RN) null);
        A002.A0G("src_pkg", b8x.A01());
        A002.A0G(RealtimeProtocol.USERS_ACCOUNT_STATUS, b8x.A02());
        A002.A0E("duration", Integer.valueOf(b8x.A00()));
        A002.A0G("sync_medium", b8x.A06());
        C17570qS A05 = b8x.A05();
        if (A05 != null) {
            str = A05.toString();
        }
        A002.A0G("prev_phone_id", str);
        C17570qS A042 = b8x.A04();
        if (A042 != null) {
            A002.A0G("phone_id", A042.toString());
        }
        b8x.toString();
        this.A03.BcG(A002);
    }

    public static void A02(C06840Qp r2) {
        ArrayList arrayList;
        synchronized (r2) {
            arrayList = r2.A00;
            r2.A00 = new ArrayList();
            r2.A01 = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r2.A01((C25232B8y) it.next());
        }
    }

    public final synchronized void A03(C25232B8y b8y) {
        if (b8y instanceof C25231B8x) {
            if (this.A02.getBoolean("analytics_is_phoneid_fully_synced", true) && !b8y.A03() && A04.contains(b8y.A01())) {
                this.A02.edit().putBoolean("analytics_is_phoneid_fully_synced", false).apply();
            }
            this.A00.add(b8y);
            if (!this.A01) {
                AnonymousClass0O3.A00().A01(new AnonymousClass0OV(this), 10000);
                this.A01 = true;
            }
        }
    }

    private void A01(C25232B8y b8y) {
        if (b8y instanceof C25231B8x) {
            A00((C25231B8x) b8y);
        }
    }

    public C06840Qp(Context context, AnonymousClass0RU r4) {
        this.A02 = context.getSharedPreferences("analyticsprefs", 0);
        this.A03 = r4;
    }
}
