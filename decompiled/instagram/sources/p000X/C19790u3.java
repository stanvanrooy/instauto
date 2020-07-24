package p000X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import java.util.List;

/* renamed from: X.0u3  reason: invalid class name and case insensitive filesystem */
public final class C19790u3 implements C19490tZ {
    public static final C05110Id A02 = new C19800u4();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r4) {
        C19770u1 r42 = (C19770u1) r4;
        if (r42.A06().size() <= 1) {
            return AnonymousClass2n2.A00(this.A00, r42);
        }
        AnonymousClass0QD.A03("DirectSendLiveVideoShareMessageMutation_withMultipleDirectThreadKeys", "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys", 1);
        return false;
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r15, C06270Ok r16, C73233Ja r17) {
        C19770u1 r152 = (C19770u1) r15;
        List A06 = r152.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        String A05 = r152.A05();
        AnonymousClass0C1 r2 = this.A01;
        String str = r152.A03;
        C99974Ts r5 = r152.A00;
        String str2 = r152.A03;
        String str3 = r152.A02;
        String str4 = r5.A02;
        AnonymousClass3LQ r0 = r152.A02;
        boolean z2 = r0.A03;
        boolean z3 = r0.A02;
        C15890nh r7 = new C15890nh(r2);
        r7.A06(AnonymousClass3K3.class, false);
        r7.A09 = Constants.ONE;
        r7.A0C = C99664Sn.A01(C58022fB.LIVE_VIDEO_SHARE, MediaType.LIVE_REPLAY, false);
        C99664Sn.A02(r7, (DirectThreadKey) A06.get(0), A05, str, z2, (String) null, z3);
        r7.A09(TraceFieldType.BroadcastId, r5.A01.A0I);
        r7.A09("video_offset", Integer.toString(r5.A00));
        r7.A09("reel_id", str2);
        r7.A09("entry", str3);
        r7.A0G = true;
        if (!TextUtils.isEmpty(str4)) {
            r7.A09("text", str4);
        }
        C17850qu A03 = r7.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A01, r17);
        C12810hQ.A02(A03);
        AnonymousClass3LX.A0C(r16, Constants.ZERO);
    }

    public C19790u3(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
