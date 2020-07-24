package p000X;

import com.facebook.C0003R;

/* renamed from: X.AL8 */
public final class AL8 extends C23718AZy {
    public final /* synthetic */ AL4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AL8(AL4 al4, String str) {
        super(str);
        this.A00 = al4;
    }

    public final /* bridge */ /* synthetic */ void A00(Aa0 aa0) {
        this.A00.A0A.A01();
        C23400AKz aKz = this.A00.A0A;
        C51512Ky r2 = new C51512Ky();
        r2.A07 = Constants.A0C;
        r2.A09 = aKz.A00.getString(C0003R.string.live_cobroadcast_invitation_expired);
        C11130eT.A01.BXT(new C33441cv(r2.A00()));
        AL4.A00(this.A00);
    }
}
