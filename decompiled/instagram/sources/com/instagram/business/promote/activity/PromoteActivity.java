package com.instagram.business.promote.activity;

import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.google.common.collect.ImmutableList;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0OX;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.C06590Pq;
import p000X.C16310oO;
import p000X.C168617Hz;
import p000X.C23079A5b;
import p000X.C23802AbW;
import p000X.C24307AlY;
import p000X.C26581Eb;
import p000X.C26771Ff;
import p000X.C26905BuU;
import p000X.C26908BuX;
import p000X.C27398CBr;
import p000X.C27460CEc;
import p000X.C27502CFs;
import p000X.C52362Om;
import p000X.C945346y;
import p000X.CC4;
import p000X.CC9;
import p000X.CCI;
import p000X.CCQ;
import p000X.CCZ;
import p000X.CCf;
import p000X.CD3;
import p000X.CD5;
import p000X.CD8;
import p000X.CDA;
import p000X.CDB;
import p000X.CDH;
import p000X.CEN;
import p000X.CF8;
import p000X.CFA;
import p000X.CFW;
import p000X.CGB;
import p000X.CGC;
import p000X.CGS;
import p000X.CGU;

public class PromoteActivity extends BaseFragmentActivity implements C945346y, CC9, C23079A5b, CGS {
    public AnonymousClass1EW A00;
    public CD8 A01;
    public CD3 A02;
    public AnonymousClass0C1 A03;
    public SpinnerImageView A04;
    public PermissionsModule A05;
    public CDA A06;

    public final void A0V(Bundle bundle) {
    }

    public static void A01(PromoteActivity promoteActivity, String str, Bundle bundle) {
        CD3 cd3 = promoteActivity.A02;
        cd3.A0R = str;
        C26905BuU buU = cd3.A0I;
        if (buU == C26905BuU.PROMOTE_MANAGER_PREVIEW) {
            promoteActivity.A04.setLoadingStatus(C168617Hz.SUCCESS);
            CD3 cd32 = promoteActivity.A02;
            String string = bundle.getString("destinationCTA");
            AnonymousClass0a4.A06(string);
            cd32.A0A = CCf.valueOf(string);
            promoteActivity.A02.A0a = bundle.getString("politicalAdBylineText");
            promoteActivity.A02.A10 = bundle.getBoolean("isStoriesPlacementEligible");
            promoteActivity.A02.A0u = bundle.getBoolean("isExplorePlacementEligible");
            C16310oO.A00.A02();
            CDH cdh = new CDH();
            C52362Om r1 = new C52362Om(promoteActivity, promoteActivity.A03);
            r1.A08 = false;
            r1.A02 = cdh;
            r1.A02();
        } else if (buU == C26905BuU.HEC_APPEAL) {
            promoteActivity.A04.setLoadingStatus(C168617Hz.SUCCESS);
            C16310oO.A00.A02();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("promoteLaunchOrigin", C26905BuU.HEC_APPEAL);
            CC4 cc4 = new CC4();
            cc4.setArguments(bundle2);
            C52362Om r12 = new C52362Om(promoteActivity, promoteActivity.A03);
            r12.A08 = false;
            r12.A02 = cc4;
            r12.A02();
        } else {
            CD8 cd8 = new CD8(promoteActivity.A03, promoteActivity, promoteActivity);
            promoteActivity.A01 = cd8;
            cd8.A00(promoteActivity, C27398CBr.DESTINATION);
        }
    }

    public final void BF1() {
        this.A04.setLoadingStatus(C168617Hz.SUCCESS);
        AnonymousClass1HD A012 = C16310oO.A00.A02().A01(Constants.A08);
        C52362Om r1 = new C52362Om(this, this.A03);
        r1.A08 = false;
        r1.A02 = A012;
        r1.A02();
    }

    public final void BF2(CFA cfa) {
        ImmutableList A09;
        this.A04.setLoadingStatus(C168617Hz.SUCCESS);
        if (!cfa.A06 || cfa.A01 != null) {
            if (((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.PROMOTE_ERROR_HANDLING, "is_new_error_handling_enabled_for_django", false, (AnonymousClass04H) null)).booleanValue()) {
                CGB cgb = cfa.A01;
                CCZ.A0D(this.A02, C27398CBr.ERROR, C27460CEc.A02(cgb.A01), cgb.A03);
                CGC cgc = cgb.A00;
                Integer num = cgb.A01;
                if (num == Constants.A0B) {
                    this.A02.A0g = cgc.A04;
                    C16310oO.A00.A02();
                    CCQ ccq = new CCQ();
                    C52362Om r1 = new C52362Om(this, this.A03);
                    r1.A08 = false;
                    r1.A02 = ccq;
                    r1.A02();
                    return;
                }
                C16310oO.A00.A02();
                String str = cgc.A02;
                String str2 = cgb.A02;
                String str3 = cgc.A01;
                String str4 = cgc.A03;
                Bundle bundle = new Bundle();
                bundle.putString("error_title", str);
                bundle.putString(TraceFieldType.Error, str2);
                bundle.putString("error_type", C27460CEc.A02(num));
                bundle.putString("adAccountID", str3);
                bundle.putString("paymentMethodID", str4);
                CD5 cd5 = new CD5();
                cd5.setArguments(bundle);
                C52362Om r12 = new C52362Om(this, this.A03);
                r12.A08 = false;
                r12.A02 = cd5;
                r12.A02();
                return;
            }
            CEN cen = cfa.A04;
            if (cen == null) {
                CCZ.A0D(this.A02, C27398CBr.ERROR, CF8.A00(Constants.A08), getString(C0003R.string.promote_error_description_network_error));
                AnonymousClass1HD A012 = C16310oO.A00.A02().A01(Constants.A08);
                C52362Om r13 = new C52362Om(this, this.A03);
                r13.A08 = false;
                r13.A02 = A012;
                r13.A02();
                return;
            }
            CCZ.A0D(this.A02, C27398CBr.ERROR, cen.A01, cen.A02);
            if (cen.A00() == Constants.A04) {
                CD3 cd3 = this.A02;
                if (AnonymousClass0OX.A00(cen.A05)) {
                    A09 = null;
                } else {
                    A09 = ImmutableList.A09(cen.A05);
                }
                cd3.A0g = A09;
                C16310oO.A00.A02();
                CCQ ccq2 = new CCQ();
                C52362Om r14 = new C52362Om(this, this.A03);
                r14.A08 = false;
                r14.A02 = ccq2;
                r14.A02();
                return;
            }
            AnonymousClass1HD A032 = C16310oO.A00.A02().A03(cen.A00(), cen.A04, cen.A02, cen.A00, cen.A03);
            C52362Om r15 = new C52362Om(this, this.A03);
            r15.A08 = false;
            r15.A02 = A032;
            r15.A02();
        } else if (!this.A02.A13 || !((Boolean) AnonymousClass0L6.A03(this.A03, AnonymousClass0L7.QUICK_PROMOTE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || AnonymousClass0OX.A00(this.A02.A0k)) {
            C16310oO.A00.A02();
            CCI cci = new CCI();
            C52362Om r16 = new C52362Om(this, this.A03);
            r16.A08 = false;
            r16.A02 = cci;
            r16.A02();
        } else {
            C16310oO.A00.A02();
            CDB cdb = new CDB();
            C52362Om r17 = new C52362Om(this, this.A03);
            r17.A08 = false;
            r17.A02 = cdb;
            r17.A02();
        }
    }

    public final void BdQ(String[] strArr, int i, PermissionsModule permissionsModule) {
        this.A05 = permissionsModule;
        requestPermissions(strArr, i);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionsModule permissionsModule = this.A05;
        if (permissionsModule != null && permissionsModule.onRequestPermissionsResult(i, strArr, iArr)) {
            this.A05 = null;
        }
    }

    public final C06590Pq A0L() {
        return this.A03;
    }

    public final int A0O() {
        return C0003R.layout.promote_activity;
    }

    public final void A0R() {
        AnonymousClass1HD A0L = A05().A0L(C0003R.C0005id.layout_container_main);
        if (A0L instanceof AnonymousClass1HM) {
            this.A00.A0F((AnonymousClass1HM) A0L);
            return;
        }
        this.A00.Bnz(true);
        this.A00.BlI(C0003R.string.promote);
        AnonymousClass1EW r2 = this.A00;
        boolean z = this.A02.A12;
        int i = C0003R.C0004drawable.instagram_x_outline_24;
        if (z) {
            i = C0003R.C0004drawable.instagram_arrow_back_24;
        }
        r2.BmB(i, this.A09);
        ImageView imageView = this.A00.A0B;
        imageView.setColorFilter(C26771Ff.A00(AnonymousClass1BA.A01(imageView.getContext(), C0003R.attr.glyphColorPrimary)));
        this.A00.Bo6(true);
        this.A00.Bo1(false);
    }

    public final CD3 AT6() {
        return this.A02;
    }

    public final CDA AT7() {
        return this.A06;
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (!(A05().A0L(C0003R.C0005id.layout_container_main) instanceof AnonymousClass1HM)) {
            CCZ.A07(this.A02, C27398CBr.PROMOTE_PREVALIDATION, "cancel_button");
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(1868833031);
        super.onCreate(bundle);
        C26581Eb.A00(this, 1);
        this.A00 = AFO();
        SpinnerImageView spinnerImageView = (SpinnerImageView) findViewById(C0003R.C0005id.loading_spinner);
        this.A04 = spinnerImageView;
        spinnerImageView.setLoadingStatus(C168617Hz.LOADING);
        Bundle extras = getIntent().getExtras();
        AnonymousClass0a4.A06(extras);
        this.A03 = AnonymousClass0J1.A06(extras);
        this.A06 = new CDA();
        CD3 cd3 = new CD3();
        this.A02 = cd3;
        cd3.A0Q = this.A03;
        String string = extras.getString("media_id");
        AnonymousClass0a4.A07(string, "Media Id can not be null when in the Promote flow");
        cd3.A0Z = string;
        this.A02.A0W = extras.getString("entryPoint");
        this.A02.A0X = extras.getString("fb_user_id");
        this.A02.A12 = extras.getBoolean("isSubflow");
        this.A02.A0T = extras.getString("couponOfferId");
        this.A02.A0P = (ImageUrl) extras.getParcelable("mediaUrl");
        this.A02.A0S = extras.getString("adAccountId");
        this.A02.A0I = (C26905BuU) extras.getSerializable("promoteLaunchOrigin");
        this.A02.A0l.put(CGU.A00(Constants.ZERO), CFW.A09);
        this.A02.A0r = C23802AbW.A02(this.A03);
        this.A02.A0s = C24307AlY.A00(this.A03).A01();
        this.A06.A0A(this.A02, extras.getString("audienceId"));
        String string2 = extras.getString("access_token");
        if (string2 != null) {
            A01(this, string2, extras);
        } else {
            AnonymousClass0C1 r2 = this.A03;
            CD3 cd32 = this.A02;
            String str = cd32.A0Z;
            String str2 = cd32.A0W;
            C23802AbW.A00(this, AnonymousClass1L8.A00(this), r2, new C26908BuX(new C27502CFs(this, extras), this, r2, str, str2));
        }
        AnonymousClass0Z0.A07(1292732980, A002);
    }
}
