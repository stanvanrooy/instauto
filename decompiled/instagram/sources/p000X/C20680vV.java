package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0vV  reason: invalid class name and case insensitive filesystem */
public final class C20680vV implements C19490tZ {
    public static final C05110Id A01 = new C20690vW();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r9, C06270Ok r10, C73233Ja r11) {
        C20660vT r92 = (C20660vT) r9;
        AnonymousClass0C1 r2 = this.A00;
        DirectThreadKey AY6 = r92.AY6();
        String str = r92.A02;
        String str2 = r92.A01;
        String str3 = r92.A02.A01;
        C15890nh r3 = new C15890nh(r2);
        r3.A09 = Constants.ONE;
        r3.A0C = C06360Ot.formatString("direct_v2/threads/%s/items/%s/delete/", AY6.A00, str);
        r3.A06(AnonymousClass1N4.class, false);
        if (str2 != null) {
            r3.A09("original_message_client_context", str2);
        }
        if (str3 != null) {
            r3.A09("send_attribution", str3);
        }
        C17850qu A03 = r3.A03();
        A03.A00 = new C98114Lt(this, this.A00, r11);
        C12810hQ.A02(A03);
    }

    public C20680vV(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
