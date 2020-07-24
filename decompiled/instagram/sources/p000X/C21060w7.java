package p000X;

/* renamed from: X.0w7  reason: invalid class name and case insensitive filesystem */
public final class C21060w7 implements C19490tZ {
    public static final C05110Id A01 = new C21070w8();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r6, C06270Ok r7, C73233Ja r8) {
        String str;
        C21040w5 r62 = (C21040w5) r6;
        AnonymousClass0C1 r0 = this.A00;
        String str2 = r62.A00;
        boolean z = r62.A01;
        C15890nh r3 = new C15890nh(r0);
        r3.A09 = Constants.ONE;
        Object[] objArr = new Object[2];
        objArr[0] = str2;
        if (z) {
            str = "mute";
        } else {
            str = "unmute";
        }
        objArr[1] = str;
        r3.A0E("direct_v2/threads/%s/%s_mentions/", objArr);
        r3.A06(AnonymousClass1N4.class, false);
        C17850qu A03 = r3.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A00, r8);
        C12810hQ.A02(A03);
    }

    public C21060w7(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
