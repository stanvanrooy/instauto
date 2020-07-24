package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* renamed from: X.0tr  reason: invalid class name and case insensitive filesystem */
public final class C19670tr implements C19490tZ {
    public static final C05110Id A02 = new C19680ts();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C19650tp) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r29, C06270Ok r30, C73233Ja r31) {
        Integer num;
        C19650tp r10 = (C19650tp) r29;
        List A06 = r10.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r10.A05();
        String str = r10.A03;
        AnonymousClass3LQ r0 = r10.A02;
        boolean z2 = r0.A03;
        String str2 = r0.A01;
        C73243Jb r02 = new C73243Jb(r31);
        if (directThreadKey.A00 == null || !RealtimeClientManager.getInstance(this.A01).isMqttConnected() || !((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.DIRECT_MQTT_SEND, "is_realtime_like_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0C1 r5 = this.A01;
            boolean z3 = r10.A02.A02;
            C15890nh r7 = new C15890nh(r5);
            r7.A09 = Constants.ONE;
            r7.A0C = C99664Sn.A01(C58022fB.LIKE, (MediaType) null, false);
            r7.A06(AnonymousClass3K3.class, false);
            C99664Sn.A02(r7, directThreadKey, A05, str, z2, str2, z3);
            C17850qu A03 = r7.A03();
            A03.A00 = new AnonymousClass3K4(this.A01, r02);
            C12810hQ.A02(A03);
            num = Constants.ZERO;
        } else {
            AnonymousClass4T5.A00(this.A01, new C99754Sw(directThreadKey.A00, Constants.ZERO, A05, C58022fB.LIKE, (C56412cS) null, (String) null, (String) null, (String) null, (String) null, str, z2, (String) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null), r02);
            num = Constants.ONE;
        }
        AnonymousClass3LX.A0C(r30, num);
    }

    public C19670tr(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
