package p000X;

import android.content.DialogInterface;

/* renamed from: X.CEY */
public final class CEY implements DialogInterface.OnClickListener {
    public final /* synthetic */ CDB A00;
    public final /* synthetic */ C27481CEx A01;

    public CEY(CDB cdb, C27481CEx cEx) {
        this.A00 = cdb;
        this.A01 = cEx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CDB cdb = this.A00;
        CD3 cd3 = cdb.A04;
        C27481CEx cEx = this.A01;
        String str = cEx.A05;
        int i2 = cEx.A00;
        int i3 = cEx.A01;
        CFW cfw = cEx.A02;
        CCf cCf = cEx.A03;
        String str2 = cEx.A06;
        String str3 = cEx.A07;
        String str4 = cEx.A04;
        boolean z = cEx.A08;
        C27481CEx cEx2 = new C27481CEx();
        cEx2.A05 = str;
        cEx2.A00 = i2;
        cEx2.A01 = i3;
        cEx2.A02 = cfw;
        cEx2.A03 = cCf;
        cEx2.A06 = str2;
        cEx2.A07 = str3;
        cEx2.A04 = str4;
        cEx2.A08 = z;
        cd3.A0E = cEx2;
        C31221Wz r1 = cdb.A09;
        if (r1 != null) {
            r1.A0F(new CDQ());
        }
    }
}
