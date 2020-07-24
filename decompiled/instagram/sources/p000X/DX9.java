package p000X;

import java.util.ArrayList;

/* renamed from: X.DX9 */
public final class DX9 extends C17920r1 {
    public final /* synthetic */ C8J A00;

    public DX9(C8J c8j) {
        this.A00 = c8j;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        DX6 dx6;
        DX8 dx8;
        String str;
        String str2;
        String str3;
        int i;
        DXR dxr;
        DXS dxs;
        DXV dxv;
        DX2 dx2;
        DX4 dx4;
        String str4;
        DXU dxu;
        String str5;
        String str6;
        int i2;
        DXO dxo;
        DXP dxp;
        DXT dxt;
        int A03 = AnonymousClass0Z0.A03(-1788864489);
        C30238DWy dWy = (C30238DWy) obj;
        int A032 = AnonymousClass0Z0.A03(1647808763);
        C8J c8j = this.A00;
        ArrayList arrayList = new ArrayList();
        DX0 dx0 = dWy.A00;
        if (!(dx0 == null || (dx2 = dx0.A01) == null || (dx4 = dx2.A00) == null)) {
            for (DXL dxl : dx4.A00) {
                if (!(dxl == null || (str4 = dxl.A03) == null || (dxu = dxl.A00) == null || (str5 = dxu.A00) == null || (str6 = dxl.A04) == null)) {
                    C27367CAm A002 = DVH.A00(dxl.A02);
                    DXN dxn = dxl.A01;
                    if (dxn == null || (dxo = dxn.A00) == null || (dxp = dxo.A00) == null || (dxt = dxp.A00) == null) {
                        i2 = 0;
                    } else {
                        i2 = dxt.A00;
                    }
                    AnonymousClass0a4.A06(str4);
                    AnonymousClass0a4.A06(str6);
                    AnonymousClass0a4.A06(str5);
                    AnonymousClass0a4.A06(A002);
                    arrayList.add(new C27328C8z(str4, str6, str5, A002, 0, 0, 0, i2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (String) null));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        DX0 dx02 = dWy.A00;
        if (!(dx02 == null || (dx6 = dx02.A00) == null || (dx8 = dx6.A00) == null)) {
            for (DXM dxm : dx8.A00) {
                if (!(dxm == null || (str = dxm.A03) == null || (str2 = dxm.A02) == null || (str3 = dxm.A04) == null)) {
                    C27367CAm A003 = DVH.A00(dxm.A01);
                    DXQ dxq = dxm.A00;
                    if (dxq == null || (dxr = dxq.A00) == null || (dxs = dxr.A00) == null || (dxv = dxs.A00) == null) {
                        i = 0;
                    } else {
                        i = dxv.A00;
                    }
                    AnonymousClass0a4.A06(str);
                    AnonymousClass0a4.A06(str3);
                    AnonymousClass0a4.A06(str2);
                    AnonymousClass0a4.A06(A003);
                    arrayList2.add(new C27328C8z(str, str3, str2, A003, 0, 0, 0, i, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (String) null));
                }
            }
        }
        c8j.A00(new C27321C8q(arrayList, arrayList2));
        AnonymousClass0Z0.A0A(2056255907, A032);
        AnonymousClass0Z0.A0A(1570693152, A03);
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(-19834253);
        this.A00.A01(r4.A01);
        AnonymousClass0Z0.A0A(2087275040, A03);
    }
}
