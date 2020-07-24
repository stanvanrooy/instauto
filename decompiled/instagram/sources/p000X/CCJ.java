package p000X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.CCJ */
public final class CCJ implements C27029Bwg {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ CD3 A01;
    public final /* synthetic */ CDA A02;
    public final /* synthetic */ CCK A03;

    public final void AvI(IgRadioGroup igRadioGroup, int i) {
        String str;
        if (i == -1) {
            this.A02.A06(this.A01, (CCN) null);
            return;
        }
        igRadioGroup.findViewById(i).getTag();
        CCN ccn = (CCN) igRadioGroup.findViewById(i).getTag();
        CD3 cd3 = this.A01;
        C27398CBr cBr = C27398CBr.DESTINATION;
        switch (ccn.ordinal()) {
            case 0:
                str = "destination_profile";
                break;
            case 1:
                str = "destination_website";
                break;
            case 2:
                str = "destination_direct";
                break;
            default:
                str = "null";
                break;
        }
        CCZ.A07(cd3, cBr, str);
        if (ccn == CCN.WEBSITE_CLICK) {
            CD3 cd32 = this.A01;
            String str2 = cd32.A0U;
            CCf cCf = cd32.A0A;
            if (cCf == null || AnonymousClass1BX.A00(str2)) {
                this.A02.A06(cd32, (CCN) null);
                igRadioGroup.A01(-1);
                this.A03.setChecked(false);
                C16310oO.A00.A02();
                C27410CCd cCd = new C27410CCd();
                C52362Om r2 = new C52362Om(this.A00, this.A01.A0Q);
                r2.A02 = cCd;
                r2.A02();
                return;
            }
            CCK cck = this.A03;
            String A012 = C27411CCe.A01(this.A00, str2, cCf);
            AnonymousClass11J.A00(A012);
            cck.setSecondaryText(A012);
            this.A02.A06(this.A01, CCN.WEBSITE_CLICK);
            return;
        }
        this.A02.A06(this.A01, ccn);
    }

    public CCJ(CDA cda, CD3 cd3, CCK cck, FragmentActivity fragmentActivity) {
        this.A02 = cda;
        this.A01 = cd3;
        this.A03 = cck;
        this.A00 = fragmentActivity;
    }
}
