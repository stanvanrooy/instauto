package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.util.Collections;

/* renamed from: X.0up  reason: invalid class name and case insensitive filesystem */
public final class C20270up implements C19490tZ {
    public static final C05110Id A02 = new C20280uq();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20250un) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r13, C06270Ok r14, C73233Ja r15) {
        C17850qu A03;
        C20250un r132 = (C20250un) r13;
        boolean z = true;
        if (r132.A06().size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        AnonymousClass3LQ r2 = r132.A02;
        if (r132.AM6() != null) {
            String A05 = r132.A05();
            String str = r132.A03;
            AnonymousClass3LQ r0 = r132.A02;
            A03 = C99664Sn.A00(this.A01, (DirectThreadKey) r132.A06().get(0), A05, str, r0.A03, r2.A01, r132.AM6(), r0.A02);
        } else {
            AnonymousClass0C1 r1 = this.A01;
            DirectAnimatedMedia directAnimatedMedia = r132.A01;
            String A052 = r132.A05();
            String str2 = r132.A03;
            boolean z2 = r2.A03;
            String str3 = r2.A01;
            C15890nh r22 = new C15890nh(r1);
            r22.A09 = Constants.ONE;
            r22.A0C = "direct_v2/threads/broadcast/animated_media/";
            r22.A09("id", directAnimatedMedia.A03);
            r22.A09("offline_threading_id", A052);
            r22.A09("client_context", A052);
            r22.A09("device_id", C05860Mt.A00(StoredPreferences.A00));
            r22.A06(AnonymousClass1N4.class, false);
            C99664Sn.A03(r22, Collections.singletonList((DirectThreadKey) r132.A06().get(0)));
            if (str2 != null) {
                r22.A09("mutation_token", str2);
            }
            if (z2) {
                r22.A0C("sampled", true);
            }
            if (str3 != null) {
                r22.A09("send_attribution", str3);
            }
            if (directAnimatedMedia.A05) {
                r22.A09("is_random", "true");
            }
            if (directAnimatedMedia.Aht()) {
                r22.A09("is_sticker", "true");
            }
            A03 = r22.A03();
        }
        A03.A00 = AnonymousClass4T7.A00(this.A01, r15);
        C12810hQ.A02(A03);
    }

    public C20270up(AnonymousClass0C1 r2) {
        this.A01 = r2;
        this.A00 = C19290tE.A00(r2);
    }
}
