package p000X;

import android.text.TextUtils;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.0u7  reason: invalid class name and case insensitive filesystem */
public final class C19830u7 implements C19490tZ {
    public static final C05110Id A02 = new C19840u8();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r4) {
        C19810u5 r42 = (C19810u5) r4;
        if (r42.A06().size() <= 1) {
            return AnonymousClass2n2.A00(this.A00, r42);
        }
        AnonymousClass0QD.A03("DirectSendStoryShareMessageMutation_withMultipleDirectThreadKeys", "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys", 1);
        return false;
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r21, C06270Ok r22, C73233Ja r23) {
        C17850qu A03;
        C19810u5 r4 = (C19810u5) r21;
        List A06 = r4.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r4.A05();
        DirectForwardingParams AM6 = r4.AM6();
        if (AM6 != null) {
            AnonymousClass0C1 r10 = this.A01;
            String str = r4.A03;
            AnonymousClass3LQ r0 = r4.A02;
            A03 = C99664Sn.A00(r10, directThreadKey, A05, str, r0.A03, A05, AM6, r0.A02);
        } else {
            AnonymousClass0C1 r1 = this.A01;
            String str2 = r4.A03;
            C56312cI r3 = r4.A01;
            String str3 = r4.A02;
            String str4 = r4.A03;
            AnonymousClass3LQ r02 = r4.A02;
            boolean z2 = r02.A03;
            boolean z3 = r02.A02;
            AnonymousClass1NJ r5 = r3.A00;
            C15890nh r13 = new C15890nh(r1);
            r13.A06(AnonymousClass3K3.class, false);
            r13.A09 = Constants.ONE;
            r13.A0C = C99664Sn.A01(C58022fB.STORY_SHARE, r5.APx(), false);
            C99664Sn.A02(r13, directThreadKey, A05, str2, z2, (String) null, z3);
            r13.A09("story_media_id", r5.getId());
            r13.A09("reel_id", str3);
            r13.A0A("containermodule", str4);
            r13.A0G = true;
            if (!TextUtils.isEmpty(r3.A07)) {
                r13.A09("text", r3.A07);
            }
            A03 = r13.A03();
        }
        A03.A00 = AnonymousClass4T7.A00(this.A01, r23);
        C12810hQ.A02(A03);
        AnonymousClass3LX.A0C(r22, Constants.ZERO);
    }

    public C19830u7(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
