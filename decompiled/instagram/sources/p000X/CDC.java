package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CDC */
public final class CDC {
    public boolean A00 = true;
    public final FragmentActivity A01;
    public final C27501CFr A02;
    public final CD3 A03;
    public final CDA A04;
    public final AnonymousClass0C1 A05;
    public final IgRadioGroup A06;

    public static List A00(CDC cdc, String str) {
        ArrayList arrayList = new ArrayList();
        if (!AnonymousClass0OX.A00(cdc.A03.A0k)) {
            for (C27481CEx cEx : cdc.A03.A0k) {
                if (str.equals(cEx.A02.A03)) {
                    CFW cfw = (CFW) cdc.A03.A0l.get(CGU.A00(Constants.ZERO));
                    String str2 = cEx.A05;
                    int i = cEx.A00;
                    int i2 = cEx.A01;
                    CCf cCf = cEx.A03;
                    String str3 = cEx.A06;
                    String str4 = cEx.A07;
                    String str5 = cEx.A04;
                    boolean z = cEx.A08;
                    if (cfw == null) {
                        cfw = CFW.A09;
                    }
                    C27481CEx cEx2 = new C27481CEx();
                    cEx2.A05 = str2;
                    cEx2.A00 = i;
                    cEx2.A01 = i2;
                    cEx2.A02 = cfw;
                    cEx2.A03 = cCf;
                    cEx2.A06 = str3;
                    cEx2.A07 = str4;
                    cEx2.A04 = str5;
                    cEx2.A08 = z;
                    arrayList.add(cEx2);
                }
            }
        }
        return arrayList;
    }

    public static boolean A01(CDC cdc, String str) {
        CCN ccn = CCN.A02;
        CD3 cd3 = cdc.A03;
        if (ccn.equals(cd3.A0D)) {
            Object obj = cd3.A0l.get(str);
            AnonymousClass11J.A00(obj);
            CFW cfw = (CFW) obj;
            AnonymousClass11J.A00(cfw);
            boolean z = true;
            if (!CDV.A05(cfw) && cfw.A01 < 18) {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A02() {
        this.A06.removeAllViews();
        CD3 cd3 = this.A03;
        boolean z = false;
        if (cd3.A0O == null) {
            z = true;
        }
        this.A00 = z;
        CCK cck = null;
        for (CFW cfw : cd3.A0h) {
            if (CDV.A05(cfw)) {
                String str = cfw.A05;
                AnonymousClass11J.A01(str, "Automatic audience name can not be null");
                cck = new CCK(this.A01, false);
                cck.setTag(CGU.A00(Constants.ZERO));
                cck.setPrimaryText(str);
                if (((Boolean) AnonymousClass0L6.A02(this.A05, AnonymousClass0L7.PROMOTE_BETTER_TARGETING, "is_automatic_description_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    cck.setSecondaryText(CDV.A03(this.A01, cfw));
                    cck.A3h(new C27414CCi(this, cck));
                } else {
                    cck.setSecondaryText(this.A01.getString(C0003R.string.promote_automatic_audience_subtitle));
                    cck.A01(true);
                }
                this.A06.addView(cck);
            } else {
                IgRadioGroup igRadioGroup = this.A06;
                String str2 = cfw.A03;
                AnonymousClass11J.A01(str2, "Audience Id can not be null to create custom audience button row");
                CCK cck2 = new CCK(this.A01, false);
                cck2.setTag(cfw.A03);
                String str3 = cfw.A05;
                AnonymousClass11J.A00(str3);
                cck2.setPrimaryText(str3);
                cck2.setSecondaryText(CDV.A03(this.A01, cfw));
                cck2.setWarningText(this.A01.getString(C0003R.string.promote_audience_warning_for_click_to_direct_age_limit));
                CER cer = new CER(this, str2);
                cck2.setActionLabel(this.A01.getString(C0003R.string.promote_edit), cer);
                if (!this.A00) {
                    cer = null;
                }
                cck2.setSubtitleContainerOnClickListener(cer);
                cck2.A3h(new CCS(this, cck2));
                cck2.setOnLongClickListener(new CF3(this, cck2, str2));
                igRadioGroup.addView(cck2);
            }
        }
        IgRadioGroup igRadioGroup2 = this.A06;
        igRadioGroup2.A02 = new CF7(this);
        if (!this.A04.A02 || igRadioGroup2.findViewWithTag(this.A03.A0d) == null) {
            this.A06.A01(-1);
        } else {
            this.A06.A01(((CCK) this.A06.findViewWithTag(this.A03.A0d)).getId());
        }
        IgRadioGroup igRadioGroup3 = this.A06;
        if (igRadioGroup3.A00 == -1 && cck != null) {
            igRadioGroup3.A01(cck.getId());
        }
    }

    public CDC(View view, CD3 cd3, CDA cda, FragmentActivity fragmentActivity) {
        this.A06 = (IgRadioGroup) view.findViewById(C0003R.C0005id.audience_group);
        this.A03 = cd3;
        this.A04 = cda;
        this.A01 = fragmentActivity;
        this.A05 = cd3.A0Q;
        this.A02 = new C27501CFr(fragmentActivity, cd3.A0R, cd3.A0X, AnonymousClass1L8.A00(fragmentActivity), cd3.A0Q);
    }
}
