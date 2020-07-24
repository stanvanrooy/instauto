package p000X;

import android.content.Context;

/* renamed from: X.0bJ  reason: invalid class name and case insensitive filesystem */
public final class C09380bJ extends C09790c1 {
    public final Context A00;

    public C09380bJ(Context context) {
        this.A00 = context;
    }

    public final void A06() {
        super.A06();
        this.A04.add(AnonymousClass05N.class);
        this.A04.add(C09330bE.class);
    }

    public final void A07() {
        int A03 = AnonymousClass0Z0.A03(1760285223);
        C13890jP.A00().A01(C13880jN.A00);
        AnonymousClass0Q7 A032 = AnonymousClass0Q7.A03();
        Context context = this.A00;
        if (AnonymousClass0KT.A07 == null) {
            AnonymousClass0KT.A07 = new AnonymousClass0KT(context);
            A032.A0B(C11940fv.A00);
            A032.A0B(new C09410bM(this));
            C13890jP A002 = C13890jP.A00();
            A002.A01(new AnonymousClass0jQ(this.A00));
            A002.A01(new C13900jR(this.A00, ((Boolean) C05640Lj.A00(AnonymousClass0L7.MEDIA_CODEC_INFO_COLLECTION, "is_enabled", false)).booleanValue()));
            A002.A01(new C09400bL(this));
            A002.A01(new AnonymousClass0OM(this.A00, new C09390bK(this), C13910jS.A00(), 21600));
            AnonymousClass0Z0.A0A(-2045559185, A03);
            return;
        }
        throw new RuntimeException("ConnectionChangeReporter instance already created");
    }
}
