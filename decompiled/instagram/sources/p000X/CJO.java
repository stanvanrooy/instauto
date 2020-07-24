package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.CJO */
public final class CJO extends C17920r1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CJJ A01;
    public final /* synthetic */ C27586CJf A02;

    public CJO(CJJ cjj, Context context, C27586CJf cJf) {
        this.A01 = cjj;
        this.A00 = context;
        this.A02 = cJf;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-838308676);
        C27578CIx cIx = (C27578CIx) obj;
        int A032 = AnonymousClass0Z0.A03(-1080871449);
        Context context = this.A00;
        if (context == null) {
            AnonymousClass0Z0.A0A(-659258392, A032);
        } else {
            CJC cjc = cIx.A00;
            CJJ cjj = this.A01;
            if (AnonymousClass6NI.A08(cjj.A07)) {
                CJJ.A04(cjj, context, true);
            } else {
                C27586CJf cJf = this.A02;
                if (cJf.A02.booleanValue() || cjc.A0A.booleanValue()) {
                    CJJ.A03(cjj, context, cJf, cjc.A05.A00, cjc.A0E, cjc.A0B);
                } else {
                    String str = cjc.A0B;
                    AnonymousClass2TI r4 = cjj.A01;
                    AnonymousClass2TH r3 = new AnonymousClass2TH(cjj.A02);
                    r3.A0L = cjj.getString(C0003R.string.report);
                    boolean z = cjj.A0I;
                    boolean z2 = z;
                    r3.A0T = z;
                    float f = cjj.A00;
                    r3.A00 = f;
                    AnonymousClass2TI r19 = cjj.A01;
                    AnonymousClass0C1 r18 = cjj.A02;
                    C13300iJ r17 = cjj.A03;
                    String str2 = cjj.A0C;
                    C146056Mg r12 = cjj.A05;
                    AnonymousClass6MW r11 = cjj.A06;
                    AnonymousClass6MX r9 = cjj.A07;
                    C27588CJh cJh = cjj.A08;
                    AnonymousClass2TI r14 = r19;
                    AnonymousClass0C1 r15 = r18;
                    C13300iJ r16 = r17;
                    String str3 = str2;
                    C146056Mg r182 = r12;
                    AnonymousClass6MW r192 = r11;
                    r4.A08(r3, CJJ.A00(r14, r15, r16, str3, r182, r192, r9, cJh, z2, f, str, cjj.A0A, (List) null, cjj.getContext().getResources().getString(C0003R.string.report_tag_guidelines, new Object[]{cjj.A0A.A01.A00}), cJf.A00.A00, cjc.A05.A00, cjc.A0E, cJf));
                }
            }
            AnonymousClass0Z0.A0A(886732002, A032);
        }
        AnonymousClass0Z0.A0A(-231325718, A03);
    }

    public final void onFail(C43791v5 r5) {
        int A03 = AnonymousClass0Z0.A03(1082003841);
        CJJ cjj = this.A01;
        if (AnonymousClass6NI.A08(cjj.A07)) {
            CJJ.A04(cjj, this.A00, false);
        }
        AnonymousClass0Z0.A0A(-105911903, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(988110740);
        AnonymousClass6NI.A03(this.A01.getActivity());
        AnonymousClass0Z0.A0A(1033446814, A03);
    }
}
