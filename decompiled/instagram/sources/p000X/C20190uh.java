package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.venue.Venue;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* renamed from: X.0uh  reason: invalid class name and case insensitive filesystem */
public final class C20190uh implements C19490tZ {
    public static final C05110Id A03 = new C20200ui();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;
    public final AnonymousClass0IT A02;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20170uf) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r18, C06270Ok r19, C73233Ja r20) {
        C17850qu A032;
        C20170uf r5 = (C20170uf) r18;
        List A06 = r5.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r5.A05();
        String str = r5.A03;
        Venue venue = r5.A01;
        boolean z2 = r5.A02.A03;
        C73243Jb r1 = new C73243Jb(r20);
        if (directThreadKey.A00 == null || r5.AM6() != null || !RealtimeClientManager.getInstance(this.A01).isMqttConnected() || !((Boolean) this.A02.get()).booleanValue()) {
            DirectForwardingParams AM6 = r5.AM6();
            if (AM6 != null) {
                AnonymousClass0C1 r6 = this.A01;
                String str2 = r5.A03;
                AnonymousClass3LQ r0 = r5.A02;
                A032 = C99664Sn.A00(r6, directThreadKey, A05, str2, r0.A03, (String) null, AM6, r0.A02);
            } else {
                AnonymousClass0C1 r3 = this.A01;
                boolean z3 = r5.A02.A02;
                C15890nh r10 = new C15890nh(r3);
                r10.A09 = Constants.ONE;
                r10.A0C = C99664Sn.A01(C58022fB.LOCATION, (MediaType) null, false);
                r10.A06(AnonymousClass3K3.class, false);
                C99664Sn.A02(r10, directThreadKey, A05, str, z2, (String) null, z3);
                r10.A09("venue_id", venue.getId());
                A032 = r10.A03();
            }
            A032.A00 = new AnonymousClass3K4(this.A01, r1);
            C12810hQ.A02(A032);
            return;
        }
        AnonymousClass4T5.A00(this.A01, C99754Sw.A00(directThreadKey.A00, A05, r5.A03(), venue.getId(), str, z2), r1);
    }

    public C20190uh(AnonymousClass0C1 r2, AnonymousClass0IT r3) {
        this.A01 = r2;
        this.A00 = C19290tE.A00(r2);
        this.A02 = r3;
    }
}
