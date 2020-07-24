package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0wh  reason: invalid class name and case insensitive filesystem */
public final class C21420wh implements C19490tZ {
    public static final C05110Id A01 = new C21430wi();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r7, C06270Ok r8, C73233Ja r9) {
        String str;
        C21400wf r72 = (C21400wf) r7;
        AnonymousClass0C1 r0 = this.A00;
        DirectThreadKey AY6 = r72.AY6();
        boolean z = r72.A01;
        C15890nh r4 = new C15890nh(r0);
        r4.A09 = Constants.ONE;
        Object[] objArr = new Object[2];
        objArr[0] = AY6.A00;
        if (z) {
            str = "label";
        } else {
            str = "unlabel";
        }
        objArr[1] = str;
        r4.A0E("direct_v2/threads/%s/%s/", objArr);
        r4.A06(AnonymousClass1N4.class, false);
        if (z) {
            r4.A09("thread_label", Integer.toString(1));
        }
        C17850qu A03 = r4.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A00, r9);
        C12810hQ.A02(A03);
    }

    public C21420wh(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
