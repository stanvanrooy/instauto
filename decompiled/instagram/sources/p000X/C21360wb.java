package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.0wb  reason: invalid class name and case insensitive filesystem */
public final class C21360wb implements C19490tZ {
    public static final C05110Id A01 = new C21370wc();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r6, C06270Ok r7, C73233Ja r8) {
        C21340wZ r62 = (C21340wZ) r6;
        AnonymousClass0C1 r1 = this.A00;
        String str = r62.AY6().A00;
        String trim = r62.A00.trim();
        C15890nh r2 = new C15890nh(r1);
        r2.A09 = Constants.ONE;
        r2.A0E("direct_v2/threads/%s/update_title/", str);
        r2.A09(DialogModule.KEY_TITLE, trim);
        r2.A06(C62672oB.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = new C98094Lr(this, this.A00, r8);
        C12810hQ.A02(A03);
    }

    public C21360wb(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
