package p000X;

import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: X.1kE  reason: invalid class name and case insensitive filesystem */
public final class C37791kE implements C06570Po {
    public final SharedPreferences A00;
    public final AnonymousClass0C1 A01;

    public static SharedPreferences A00(AnonymousClass0C1 r2) {
        return ((C37791kE) r2.AVA(C37791kE.class, new C37801kF(r2))).A00;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A01.BbT(C37791kE.class);
    }

    public C37791kE(AnonymousClass0C1 r4) {
        this.A01 = r4;
        SharedPreferences A03 = C14190ju.A01(r4).A03(Constants.A02);
        this.A00 = A03;
        int i = A03.getInt("app_version_number", -1);
        int A002 = C06460Pd.A00();
        if (i != A002) {
            this.A00.edit().clear().apply();
            this.A00.edit().putInt("app_version_number", A002).apply();
        }
    }

    public static C37831kI A01(AnonymousClass0C1 r3) {
        String string = A00(r3).getString("qp_cooldown_response_json", (String) null);
        if (string != null) {
            try {
                C13080hr A0A = C12890hY.A00.A0A(string);
                A0A.A0p();
                return C37821kH.parseFromJson(A0A);
            } catch (IOException e) {
                AnonymousClass0QD.A05("IG-QP", "failed to parse stored QP cooldown response.", e);
            }
        }
        return null;
    }

    public static void A02(AnonymousClass0C1 r2) {
        SharedPreferences A002 = A00(r2);
        A002.edit().remove("qp_cooldown_response_json").apply();
        A002.edit().remove("qp_cooldown_response_expiration_time").apply();
    }
}
