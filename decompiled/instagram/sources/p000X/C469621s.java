package p000X;

import android.view.View;

/* renamed from: X.21s  reason: invalid class name and case insensitive filesystem */
public final class C469621s extends C38301l3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1NJ A01;
    public final /* synthetic */ AnonymousClass1VJ A02;
    public final /* synthetic */ C36841ih A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C469621s(AnonymousClass1VJ r2, C06590Pq r3, AnonymousClass1NJ r4, C36841ih r5, int i) {
        super(r3, true);
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r5;
        this.A00 = i;
    }

    public final C33071cK A00() {
        return AnonymousClass1VJ.A00(C33051cI.PAGE_PROFILE_PIC, this.A01, this.A03);
    }

    public final void A01(View view) {
        this.A02.A05.Avp(this.A01, this.A03, this.A00);
    }
}
