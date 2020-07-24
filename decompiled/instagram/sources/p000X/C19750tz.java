package p000X;

import android.text.TextUtils;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.List;

/* renamed from: X.0tz  reason: invalid class name and case insensitive filesystem */
public final class C19750tz implements C19490tZ {
    public static final C05110Id A02 = new C19760u0();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r4) {
        C19730tx r42 = (C19730tx) r4;
        if (r42.A06().size() <= 1) {
            return AnonymousClass2n2.A00(this.A00, r42);
        }
        AnonymousClass0QD.A03("DirectSendReelShareMessageMutation_withMultipleDirectThreadKeys", "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys", 1);
        return false;
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r22, C06270Ok r23, C73233Ja r24) {
        String str;
        C19730tx r3 = (C19730tx) r22;
        List A06 = r3.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r3.A05();
        AnonymousClass0C1 r0 = this.A01;
        String str2 = r3.A03;
        C58052fE r2 = r3.A00;
        String str3 = r3.A09;
        String str4 = r3.A01;
        String str5 = r3.A08;
        String str6 = r3.A02;
        boolean z2 = r3.A0D;
        String str7 = r3.A04;
        String str8 = r3.A03;
        AnonymousClass3LQ r32 = r3.A02;
        boolean z3 = r32.A03;
        boolean z4 = r32.A02;
        AnonymousClass1NJ r5 = r2.A01;
        String str9 = r2.A0A;
        boolean z5 = false;
        if (str5 != null) {
            z5 = true;
        }
        C15890nh r25 = new C15890nh(r0);
        r25.A06(AnonymousClass3K3.class, false);
        r25.A09 = Constants.ONE;
        r25.A0C = C99664Sn.A01(C58022fB.REEL_SHARE, r5.APx(), z5);
        boolean z6 = z4;
        C15890nh r14 = r25;
        C99664Sn.A02(r14, directThreadKey, A05, str2, z3, (String) null, z6);
        r25.A09("media_id", r5.getId());
        r25.A09("reel_id", str3);
        r25.A09("entry", str4);
        if (z5) {
            r25.A09("reaction_emoji", str9);
            r25.A0G = true;
        }
        if (str6 != null) {
            r25.A09("gif_id", str6);
            if (z2) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            r25.A09("gif_is_sticker", str);
        }
        if (!TextUtils.isEmpty(str9)) {
            r25.A09("text", str9);
        }
        if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
            r25.A09("interactive_sticker_type", str7);
            r25.A09("interactive_user_id", str8);
        }
        C17850qu A03 = r25.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A01, r24);
        C12810hQ.A02(A03);
        AnonymousClass3LX.A0C(r23, Constants.ZERO);
    }

    public C19750tz(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
