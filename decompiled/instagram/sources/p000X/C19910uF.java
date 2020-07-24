package p000X;

import android.text.TextUtils;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.0uF  reason: invalid class name and case insensitive filesystem */
public final class C19910uF implements C19490tZ {
    public static final C05110Id A02 = new C19920uG();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r4) {
        String str;
        String str2;
        C19890uD r42 = (C19890uD) r4;
        if (r42.A06().size() > 1) {
            str = "DirectSendMediaShareMessageMutation_withMultipleDirectThreadKeys";
            str2 = "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys";
        } else if (r42.A01.A00 != null) {
            return AnonymousClass2n2.A00(this.A00, r42);
        } else {
            str = "DirectSendMediaShareMessageMutation_withNullMedia";
            str2 = "Found DirectForwardVisualMessageMutation with null Media";
        }
        AnonymousClass0QD.A03(str, str2, 1);
        return false;
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r19, C06270Ok r20, C73233Ja r21) {
        C17850qu A03;
        C19890uD r4 = (C19890uD) r19;
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
            AnonymousClass0C1 r8 = this.A01;
            String str = r4.A03;
            AnonymousClass3LQ r0 = r4.A02;
            A03 = C99664Sn.A00(r8, directThreadKey, A05, str, r0.A03, A05, AM6, r0.A02);
        } else {
            AnonymousClass0C1 r1 = this.A01;
            String str2 = r4.A03;
            C56382cP r3 = r4.A01;
            AnonymousClass3LQ r02 = r4.A02;
            boolean z2 = r02.A03;
            boolean z3 = r02.A02;
            AnonymousClass1NJ r6 = r3.A00;
            Integer num = r3.A01;
            C15890nh r11 = new C15890nh(r1);
            r11.A06(AnonymousClass3K3.class, false);
            r11.A09 = Constants.ONE;
            r11.A0C = C99664Sn.A01(C58022fB.MEDIA_SHARE, r6.APx(), false);
            C99664Sn.A02(r11, directThreadKey, A05, str2, z2, (String) null, z3);
            r11.A09("media_id", r6.getId());
            if (num != null) {
                r11.A09("post_share_source", "direct_reply_to_author");
            }
            if (!TextUtils.isEmpty(r3.A03)) {
                r11.A09("text", r3.A03);
            }
            String str3 = r3.A02;
            if (str3 != null) {
                r11.A09("carousel_share_child_media_id", str3);
            }
            A03 = r11.A03();
        }
        A03.A00 = AnonymousClass4T7.A00(this.A01, r21);
        C12810hQ.A02(A03);
        AnonymousClass3LX.A0C(r20, Constants.ZERO);
    }

    public C19910uF(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
