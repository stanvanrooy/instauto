package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import java.util.List;

/* renamed from: X.0uR  reason: invalid class name and case insensitive filesystem */
public final class C20030uR implements C19490tZ {
    public static final C05110Id A02 = new C20040uS();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20010uP) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r13, C06270Ok r14, C73233Ja r15) {
        C20010uP r132 = (C20010uP) r13;
        List A06 = r132.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        String A05 = r132.A05();
        String str = r132.A03;
        C103024cY r2 = r132.A00;
        AnonymousClass3LQ r1 = r132.A02;
        boolean z2 = r1.A03;
        C73243Jb r3 = new C73243Jb(r15);
        AnonymousClass0C1 r0 = this.A01;
        boolean z3 = r1.A02;
        C15890nh r5 = new C15890nh(r0);
        r5.A09 = Constants.ONE;
        r5.A0C = C99664Sn.A01(C58022fB.GUIDE_SHARE, (MediaType) null, false);
        r5.A06(AnonymousClass3K3.class, false);
        C99664Sn.A02(r5, (DirectThreadKey) A06.get(0), A05, str, z2, (String) null, z3);
        r5.A09("guide_id", r2.A00.A05);
        C17850qu A03 = r5.A03();
        A03.A00 = new AnonymousClass3K4(this.A01, r3);
        C12810hQ.A02(A03);
    }

    public C20030uR(AnonymousClass0C1 r2) {
        this.A01 = r2;
        this.A00 = C19290tE.A00(r2);
    }
}
