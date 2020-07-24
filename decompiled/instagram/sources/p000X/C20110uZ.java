package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediatype.MediaType;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* renamed from: X.0uZ  reason: invalid class name and case insensitive filesystem */
public final class C20110uZ implements C19490tZ {
    public static final C05110Id A03 = new C20120ua();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;
    public final AnonymousClass0IT A02;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r14, C06270Ok r15, C73233Ja r16) {
        C20090uX r5 = (C20090uX) r14;
        List A06 = r5.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r5.A05();
        String str = r5.A03;
        Hashtag hashtag = r5.A00;
        boolean z2 = r5.A02.A03;
        C73243Jb r3 = new C73243Jb(r16);
        if (directThreadKey.A00 == null || !RealtimeClientManager.getInstance(this.A01).isMqttConnected() || !((Boolean) this.A02.get()).booleanValue()) {
            AnonymousClass0C1 r1 = this.A01;
            boolean z3 = r5.A02.A02;
            C15890nh r6 = new C15890nh(r1);
            r6.A09 = Constants.ONE;
            r6.A0C = C99664Sn.A01(C58022fB.HASHTAG, (MediaType) null, false);
            r6.A06(AnonymousClass3K3.class, false);
            C99664Sn.A02(r6, directThreadKey, A05, str, z2, (String) null, z3);
            r6.A09("hashtag", hashtag.A0A);
            C17850qu A032 = r6.A03();
            A032.A00 = new AnonymousClass3K4(this.A01, r3);
            C12810hQ.A02(A032);
            return;
        }
        AnonymousClass4T5.A00(this.A01, C99754Sw.A00(directThreadKey.A00, A05, r5.A03(), hashtag.A0A, str, z2), r3);
    }

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20090uX) r2);
    }

    public C20110uZ(AnonymousClass0C1 r2, AnonymousClass0IT r3) {
        this.A01 = r2;
        this.A00 = C19290tE.A00(r2);
        this.A02 = r3;
    }
}
