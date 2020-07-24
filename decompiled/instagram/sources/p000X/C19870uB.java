package p000X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import java.util.List;

/* renamed from: X.0uB  reason: invalid class name and case insensitive filesystem */
public final class C19870uB implements C19490tZ {
    public static final C05110Id A02 = new C19880uC();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r4) {
        C19850u9 r42 = (C19850u9) r4;
        if (r42.A06().size() <= 1) {
            return AnonymousClass2n2.A00(this.A00, r42);
        }
        AnonymousClass0QD.A03("DirectSendLiveViewerInviteMessageMutation_withMultipleDirectThreadKeys", "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys", 1);
        return false;
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r13, C06270Ok r14, C73233Ja r15) {
        C17850qu A03;
        C19850u9 r132 = (C19850u9) r13;
        List A06 = r132.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r132.A05();
        if (r132.AM6() != null) {
            String A052 = r132.A05();
            String str = r132.A03;
            AnonymousClass3LQ r0 = r132.A02;
            A03 = C99664Sn.A00(this.A01, (DirectThreadKey) r132.A06().get(0), A052, str, r0.A03, A05, r132.AM6(), r0.A02);
        } else {
            AnonymousClass0C1 r3 = this.A01;
            String str2 = r132.A03;
            String str3 = r132.A02;
            String str4 = r132.A01.A03;
            AnonymousClass3LQ r02 = r132.A02;
            boolean z2 = r02.A03;
            boolean z3 = r02.A02;
            C15890nh r5 = new C15890nh(r3);
            r5.A06(AnonymousClass3K3.class, false);
            r5.A09 = Constants.ONE;
            r5.A0C = C99664Sn.A01(C58022fB.LIVE_VIEWER_INVITE, MediaType.LIVE_REPLAY, false);
            C99664Sn.A02(r5, directThreadKey, A05, str2, z2, (String) null, z3);
            r5.A09(TraceFieldType.BroadcastId, str3);
            r5.A0G = true;
            if (!TextUtils.isEmpty(str4)) {
                r5.A09("text", str4);
            }
            A03 = r5.A03();
        }
        A03.A00 = AnonymousClass4T7.A00(this.A01, r15);
        C12810hQ.A02(A03);
        AnonymousClass3LX.A0C(r14, Constants.ZERO);
    }

    public C19870uB(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
