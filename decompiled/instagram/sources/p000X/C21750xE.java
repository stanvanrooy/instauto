package p000X;

/* renamed from: X.0xE  reason: invalid class name and case insensitive filesystem */
public final class C21750xE implements C19490tZ {
    public static final C05110Id A01 = new C21760xF();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r5, C06270Ok r6, C73233Ja r7) {
        C15890nh r2;
        Object[] objArr;
        String str;
        C21730xC r52 = (C21730xC) r5;
        AnonymousClass0C1 r1 = this.A00;
        String str2 = r52.A03;
        if (r52.A04) {
            r2 = new C15890nh(r1);
            r2.A09 = Constants.ONE;
            objArr = new Object[]{str2};
            str = "direct_v2/users/%s/block_messages/";
        } else {
            r2 = new C15890nh(r1);
            r2.A09 = Constants.ONE;
            objArr = new Object[]{str2};
            str = "direct_v2/users/%s/unblock_messages/";
        }
        r2.A0E(str, objArr);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        C17850qu A03 = r2.A03();
        A03.A00 = new AnonymousClass4T4(this, this.A00, r7);
        C12810hQ.A02(A03);
    }

    public C21750xE(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
