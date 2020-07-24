package p000X;

import java.util.ArrayList;

/* renamed from: X.DZ7 */
public final class DZ7 extends C17920r1 {
    public final /* synthetic */ C8J A00;

    public DZ7(C8J c8j) {
        this.A00 = c8j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r0.A01 == false) goto L_0x002d;
     */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        DZ6 dz6;
        boolean z;
        C30241DXb dXb;
        DZ2 dz2;
        String str;
        DZX dzx;
        String str2;
        String str3;
        DZD dzd;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str4;
        DZO dzo;
        DZT dzt;
        DZQ dzq;
        DZV dzv;
        DZP dzp;
        DZU dzu;
        DZR dzr;
        DZW dzw;
        C30241DXb dXb2;
        DZ2 dz22;
        int A03 = AnonymousClass0Z0.A03(947026891);
        int A032 = AnonymousClass0Z0.A03(-767010750);
        C8J c8j = this.A00;
        C30240DXa dXa = ((DXZ) obj).A00;
        if (dXa == null || (dXb2 = dXa.A00) == null || (dz22 = dXb2.A00) == null) {
            dz6 = null;
        } else {
            dz6 = dz22.A00;
        }
        if (dz6 != null) {
            z = true;
        }
        z = false;
        ArrayList arrayList = new ArrayList();
        if (!(dXa == null || (dXb = dXa.A00) == null || (dz2 = dXb.A00) == null)) {
            for (DZ4 dz4 : dz2.A01) {
                DZA dza = dz4.A00;
                if (!(dza == null || (str = dza.A0B) == null || (dzx = dza.A07) == null || (str2 = dzx.A00) == null || (str3 = dza.A0C) == null)) {
                    DZN dzn = dza.A09;
                    if (dzn != null) {
                        dzd = dzn.A00;
                    } else {
                        dzd = null;
                    }
                    C27367CAm A002 = DVH.A00(dza.A0A);
                    int i6 = dza.A00;
                    int i7 = dza.A01;
                    if (dzd == null || (dzr = dzd.A01) == null || (dzw = dzr.A00) == null) {
                        i = 0;
                    } else {
                        i = dzw.A00;
                    }
                    if (dzd == null || (dzp = dzd.A03) == null || (dzu = dzp.A00) == null) {
                        i2 = 0;
                    } else {
                        i2 = dzu.A00;
                    }
                    int i8 = dza.A02;
                    if (dzd == null || (dzq = dzd.A02) == null || (dzv = dzq.A00) == null) {
                        i3 = 0;
                    } else {
                        i3 = dzv.A00;
                    }
                    if (dzd != null) {
                        i4 = dzd.A00;
                    } else {
                        i4 = 0;
                    }
                    int i9 = dza.A03;
                    int i10 = dza.A04;
                    int i11 = dza.A05;
                    int i12 = dza.A06;
                    if (dzd == null || (dzo = dzd.A05) == null || (dzt = dzo.A00) == null) {
                        i5 = 0;
                    } else {
                        i5 = dzt.A00;
                    }
                    int A003 = DZZ.A00(dzd, "BIO_LINK_CLICKED");
                    int A004 = DZZ.A00(dzd, "CALL");
                    int A005 = DZZ.A00(dzd, "EMAIL");
                    int A006 = DZZ.A00(dzd, "DIRECTION");
                    int A007 = DZZ.A00(dzd, "TEXT");
                    DZS dzs = dza.A08;
                    if (dzs != null) {
                        str4 = dzs.A00;
                    } else {
                        str4 = null;
                    }
                    AnonymousClass0a4.A06(str);
                    AnonymousClass0a4.A06(str3);
                    AnonymousClass0a4.A06(str2);
                    AnonymousClass0a4.A06(A002);
                    arrayList.add(new C27328C8z(str, str3, str2, A002, i6, i7, i, i2, i8, i3, i4, i9, i10, i11, i12, i5, A003, A004, A005, A006, A007, 0, 0, 0, 0, 0, 0, str4));
                }
            }
        }
        c8j.A00(new C8Z(z, arrayList));
        AnonymousClass0Z0.A0A(843103585, A032);
        AnonymousClass0Z0.A0A(1356222592, A03);
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(-1075101030);
        this.A00.A01(r4.A01);
        AnonymousClass0Z0.A0A(-2125798604, A03);
    }
}
