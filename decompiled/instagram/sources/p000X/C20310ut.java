package p000X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;

/* renamed from: X.0ut  reason: invalid class name and case insensitive filesystem */
public final class C20310ut implements C19490tZ {
    public static final C05110Id A02 = new C20320uu();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20290ur) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r11, C06270Ok r12, C73233Ja r13) {
        C20290ur r112 = (C20290ur) r11;
        boolean z = true;
        if (r112.A06().size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        AnonymousClass3LQ r2 = r112.A02;
        AnonymousClass0C1 r9 = this.A01;
        String str = r112.A00.A09;
        String A05 = r112.A05();
        String str2 = r112.A03;
        boolean z2 = r2.A03;
        String str3 = r2.A01;
        C15890nh r22 = new C15890nh(r9);
        r22.A09 = Constants.ONE;
        r22.A0C = "direct_v2/threads/broadcast/static_sticker/";
        r22.A09("sticker_id", str);
        r22.A09("offline_threading_id", A05);
        r22.A09("client_context", A05);
        r22.A09("device_id", C05860Mt.A00(StoredPreferences.A00));
        r22.A06(AnonymousClass1N4.class, false);
        C99664Sn.A03(r22, Collections.singletonList((DirectThreadKey) r112.A06().get(0)));
        r22.A09("mutation_token", str2);
        if (z2) {
            r22.A0C("sampled", true);
        }
        if (str3 != null) {
            r22.A09("send_attribution", str3);
        }
        C17850qu A03 = r22.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A01, r13);
        C12810hQ.A02(A03);
    }

    public C20310ut(AnonymousClass0C1 r2) {
        this.A01 = r2;
        this.A00 = C19290tE.A00(r2);
    }
}
