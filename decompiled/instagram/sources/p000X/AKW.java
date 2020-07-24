package p000X;

import com.facebook.C0003R;

/* renamed from: X.AKW */
public final class AKW extends C17920r1 {
    public final /* synthetic */ AKV A00;
    public final /* synthetic */ C72063Dm A01;

    public AKW(C72063Dm r1, AKV akv) {
        this.A01 = r1;
        this.A00 = akv;
    }

    public final void onFail(C43791v5 r8) {
        int A03 = AnonymousClass0Z0.A03(-1266455752);
        super.onFail(r8);
        C72063Dm r0 = this.A01;
        r0.A0Q = false;
        AKB akb = r0.A0G;
        AKV akv = this.A00;
        if (akb.A0C) {
            AK9 ak9 = akb.A0L;
            String string = ak9.A0K.getContext().getString(C0003R.string.live_with_request_to_join_failed_to_send);
            C51512Ky r1 = new C51512Ky();
            r1.A07 = Constants.ONE;
            r1.A09 = string;
            C11130eT.A01.BXT(new C33441cv(r1.A00()));
            akv.A00 = false;
            ak9.A07.A01();
        }
        AnonymousClass0Z0.A0A(436659765, A03);
    }
}
