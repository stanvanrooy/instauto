package p000X;

import com.facebook.C0003R;
import com.instagram.igds.components.bottombutton.IgBottomButtonLayout;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.CUF */
public final class CUF extends C17920r1 {
    public final /* synthetic */ CUK A00;

    public CUF(CUK cuk) {
        this.A00 = cuk;
    }

    public final void onFail(C43791v5 r6) {
        Throwable th;
        int A03 = AnonymousClass0Z0.A03(582507601);
        super.onFail(r6);
        CUK cuk = this.A00;
        cuk.A00 = Constants.ONE;
        C27865CUf cUf = cuk.A02;
        if (r6.A02()) {
            th = r6.A01;
        } else {
            th = null;
        }
        C53822Um.A00(cUf.A00, AnonymousClass2Oq.ERROR);
        AnonymousClass5F9.A00(cUf.A00.getContext(), C0003R.string.product_source_network_error);
        cUf.A00.A04.A05(C53822Um.A0N, th);
        C53822Um r1 = cUf.A00;
        if (r1.A0C) {
            r1.A07.setIsLoading(false);
        }
        AnonymousClass0Z0.A0A(-123427577, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(1408888541);
        super.onStart();
        this.A00.A02.A00.A04.A03(C53822Um.A0N);
        AnonymousClass0Z0.A0A(-94650205, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-526266388);
        CUX cux = (CUX) obj;
        int A032 = AnonymousClass0Z0.A03(1937425617);
        super.onSuccess(cux);
        CUK cuk = this.A00;
        cuk.A00 = Constants.A0C;
        C27865CUf cUf = cuk.A02;
        C53822Um.A00(cUf.A00, AnonymousClass2Oq.GONE);
        CUL cul = cUf.A00.A03;
        cul.A03 = cux.A01;
        CUL.A00(cul);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (CUR cur : cux.A01) {
            if (cur.A05) {
                z = true;
            }
            for (C27862CUc cUc : Collections.unmodifiableList(cur.A04)) {
                arrayList.add(cUc.A01);
            }
        }
        cUf.A00.A04.A04(C53822Um.A0N, arrayList.size(), z, arrayList);
        C53822Um r1 = cUf.A00;
        if (!r1.A0B || C27665CMj.A02(r1.A02) == C53502Ta.CATALOG) {
            C53822Um r0 = cUf.A00;
            String str = cux.A00;
            r0.A09 = str;
            CUL cul2 = r0.A03;
            cul2.A01.A01 = str;
            CUL.A00(cul2);
        }
        C53822Um r12 = cUf.A00;
        if (r12.A0C) {
            IgBottomButtonLayout igBottomButtonLayout = r12.A01;
            if (igBottomButtonLayout != null) {
                igBottomButtonLayout.setPrimaryButtonEnabled(true);
            }
            cUf.A00.A07.setIsLoading(false);
        }
        AnonymousClass0Z0.A0A(1190872541, A032);
        AnonymousClass0Z0.A0A(1953900488, A03);
    }
}
