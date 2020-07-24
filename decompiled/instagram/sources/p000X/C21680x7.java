package p000X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.0x7  reason: invalid class name and case insensitive filesystem */
public final class C21680x7 implements C19490tZ {
    public static final C05110Id A02 = new C21690x8();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C21660x5) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r10, C06270Ok r11, C73233Ja r12) {
        C21660x5 r102 = (C21660x5) r10;
        List A06 = r102.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        String A05 = r102.A05();
        AnonymousClass0C1 r1 = this.A01;
        String str = r102.A03;
        AnonymousClass3LQ r0 = r102.A02;
        C17850qu A002 = C99664Sn.A00(r1, (DirectThreadKey) A06.get(0), A05, str, r0.A03, A05, r102.AM6(), r0.A02);
        A002.A00 = AnonymousClass4T7.A00(this.A01, r12);
        C12810hQ.A02(A002);
        AnonymousClass3LX.A0C(r11, Constants.ZERO);
    }

    public C21680x7(AnonymousClass0C1 r1, C65882uZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
