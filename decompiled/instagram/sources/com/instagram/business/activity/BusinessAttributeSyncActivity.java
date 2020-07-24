package com.instagram.business.activity;

import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.BusinessAttributeConfirmFragment;
import com.instagram.business.fragment.BusinessAttributeSyncIntroFragment;
import com.instagram.business.model.BusinessAttribute;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass267;
import p000X.AnonymousClass616;
import p000X.AnonymousClass67K;
import p000X.AnonymousClass67L;
import p000X.AnonymousClass67O;
import p000X.AnonymousClass67V;
import p000X.AnonymousClass67X;
import p000X.AnonymousClass67Y;
import p000X.AnonymousClass67b;
import p000X.AnonymousClass67i;
import p000X.AnonymousClass67j;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C132345l9;
import p000X.C16310oO;
import p000X.C52362Om;

public class BusinessAttributeSyncActivity extends BaseFragmentActivity implements AnonymousClass0RN, AnonymousClass67b {
    public AnonymousClass1HD A00;
    public AnonymousClass1HD A01;
    public AnonymousClass1HD A02;
    public AnonymousClass1HD A03;
    public AnonymousClass1HD A04;
    public AnonymousClass67X A05;
    public BusinessAttribute A06;
    public BusinessAttribute A07;
    public BusinessAttribute A08;
    public C06590Pq A09;

    public final String getModuleName() {
        return "business_attribute_sync_activity";
    }

    private Bundle A01() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("fb_attributes", this.A07);
        bundle.putParcelable("ig_attributes", this.A08);
        bundle.putParcelable("sync_attributes", this.A06);
        return bundle;
    }

    private void A04(AnonymousClass1HD r3) {
        C52362Om r1 = new C52362Om(this, this.A09);
        r1.A04 = AJa().name();
        r1.A02 = r3;
        r1.A02();
    }

    public final int ABJ() {
        AnonymousClass67X r1 = this.A05;
        return AnonymousClass67X.A00(r1, r1.A00.A00 + 1) - 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    public final AnonymousClass67V AJa() {
        AnonymousClass67j r0;
        AnonymousClass67V r02;
        AnonymousClass67Y r4 = this.A05.A00;
        int i = r4.A00;
        boolean z = false;
        if (i == -1) {
            z = true;
        }
        if (!z) {
            boolean z2 = false;
            if (i == r4.A01.size()) {
                z2 = true;
            }
            if (!z2) {
                r0 = (AnonymousClass67j) r4.A01.get(r4.A00);
                if (r0 != null) {
                    r02 = null;
                } else {
                    r02 = r0.A00;
                }
                return r02;
            }
        }
        r0 = null;
        if (r0 != null) {
        }
        return r02;
    }

    public final void AnY(String str) {
        AnonymousClass616.A00(this.A09).A01(AJa().A00, str);
    }

    public final void AoZ() {
        AnonymousClass1HD r0;
        AnonymousClass67X r3 = this.A05;
        AnonymousClass67Y r02 = r3.A00;
        int i = r02.A00;
        int size = r02.A01.size();
        boolean z = false;
        if (i == size) {
            z = true;
        }
        if (!z) {
            AnonymousClass67Y r1 = r3.A00;
            r3.A00 = r1.A00(r1.A00 + 1);
        }
        AnonymousClass67V AJa = AJa();
        if (AJa == null) {
            finish();
            return;
        }
        switch (AJa.ordinal()) {
            case 0:
                if (this.A03 == null) {
                    C16310oO.A00.A00();
                    String token = this.A09.getToken();
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
                    BusinessAttributeSyncIntroFragment businessAttributeSyncIntroFragment = new BusinessAttributeSyncIntroFragment();
                    businessAttributeSyncIntroFragment.setArguments(bundle);
                    this.A03 = businessAttributeSyncIntroFragment;
                }
                r0 = this.A03;
                break;
            case 1:
                if (this.A00 == null) {
                    Bundle A012 = A01();
                    C16310oO.A00.A00();
                    AnonymousClass67K r03 = new AnonymousClass67K();
                    r03.setArguments(A012);
                    this.A00 = r03;
                }
                r0 = this.A00;
                break;
            case 2:
                if (this.A04 == null) {
                    Bundle A013 = A01();
                    C16310oO.A00.A00();
                    AnonymousClass67L r04 = new AnonymousClass67L();
                    r04.setArguments(A013);
                    this.A04 = r04;
                }
                r0 = this.A04;
                break;
            case 3:
                if (this.A02 == null) {
                    Bundle A014 = A01();
                    C16310oO.A00.A00();
                    AnonymousClass67O r05 = new AnonymousClass67O();
                    r05.setArguments(A014);
                    this.A02 = r05;
                }
                r0 = this.A02;
                break;
            case 4:
                if (this.A01 == null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("sync_attributes", this.A06);
                    C16310oO.A00.A00();
                    String A052 = C05210Iq.A05(this.A09);
                    BusinessAttributeConfirmFragment businessAttributeConfirmFragment = new BusinessAttributeConfirmFragment();
                    bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", A052);
                    businessAttributeConfirmFragment.setArguments(bundle2);
                    this.A01 = businessAttributeConfirmFragment;
                }
                r0 = this.A01;
                break;
            default:
                return;
        }
        A04(r0);
    }

    public final void Be6() {
        AnonymousClass67X r5 = this.A05;
        AnonymousClass67Y r4 = r5.A00;
        int i = r4.A00;
        boolean z = false;
        if (i == -1) {
            z = true;
        }
        if (!z) {
            r5.A00 = r4.A00(i - 1);
        }
        AnonymousClass67V AJa = AJa();
        if (AJa == null) {
            finish();
        } else {
            A05().A16(AJa.name(), 0);
        }
    }

    public final int BrZ() {
        AnonymousClass67X r1 = this.A05;
        return AnonymousClass67X.A00(r1, r1.A00.A01.size());
    }

    public final C06590Pq A0L() {
        return this.A09;
    }

    public final void A0V(Bundle bundle) {
        if (AJa() == null) {
            AoZ();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r1 == null) goto L_0x003b;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A002 = AnonymousClass0Z0.A00(961053538);
        C06590Pq A003 = AnonymousClass0J1.A00(getIntent().getExtras());
        this.A09 = A003;
        AnonymousClass0a4.A06(A003);
        Bundle extras = getIntent().getExtras();
        this.A07 = (BusinessAttribute) extras.get("fb_attributes");
        BusinessAttribute businessAttribute = (BusinessAttribute) extras.get("ig_attributes");
        this.A08 = businessAttribute;
        if (this.A07 != null) {
            z = true;
        }
        z = false;
        AnonymousClass0a4.A09(z);
        BusinessAttribute businessAttribute2 = this.A08;
        String str = businessAttribute2.A01;
        String str2 = businessAttribute2.A05;
        String str3 = businessAttribute2.A06;
        BusinessAttribute businessAttribute3 = this.A07;
        this.A06 = new BusinessAttribute(str, str2, str3, businessAttribute3.A04, businessAttribute2.A07, businessAttribute2.A00, businessAttribute3.A02, businessAttribute2.A03);
        AnonymousClass267 r4 = new AnonymousClass267();
        r4.A08(new AnonymousClass67j(AnonymousClass67V.INTRO));
        if (C132345l9.A00(businessAttribute3.A01, businessAttribute2.A01, false)) {
            r4.A08(new AnonymousClass67j(AnonymousClass67V.EMAIL));
        }
        boolean z2 = false;
        if (C132345l9.A00(businessAttribute3.A06, businessAttribute2.A06, false) || C132345l9.A00(businessAttribute3.A00, businessAttribute2.A00, false) || C132345l9.A00(businessAttribute3.A07, businessAttribute2.A07, false)) {
            z2 = true;
        }
        if (z2) {
            r4.A08(new AnonymousClass67j(AnonymousClass67V.A02));
        }
        if (C132345l9.A00(businessAttribute3.A05, businessAttribute2.A05, true)) {
            r4.A08(new AnonymousClass67j(AnonymousClass67V.PHONE_NUMBER));
        }
        r4.A08(new AnonymousClass67j(AnonymousClass67V.CONFIRMATION));
        this.A05 = new AnonymousClass67X(new AnonymousClass67i(r4.A06()));
        super.onCreate(bundle);
        AnonymousClass0Z0.A07(-1901899305, A002);
    }
}
