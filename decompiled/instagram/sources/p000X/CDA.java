package p000X;

import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CDA */
public final class CDA {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Map A06 = Collections.synchronizedMap(new HashMap());

    public final void A01() {
        if (this.A00) {
            this.A00 = false;
            A00(this, Constants.ONE);
        }
    }

    public final void A03(CD3 cd3) {
        if (!this.A00) {
            this.A00 = true;
            if (!AnonymousClass0OX.A00(cd3.A0k)) {
                for (C27481CEx cEx : cd3.A0k) {
                    CFW cfw = (CFW) cd3.A0l.get(cEx.A02.A03);
                    if (cfw == null && (cfw = (CFW) cd3.A0l.get(CGU.A00(Constants.ZERO))) == null) {
                        cfw = CFW.A09;
                    }
                    cEx.A02 = cfw;
                }
            }
            A00(this, Constants.ONE);
        }
    }

    public static void A00(CDA cda, Integer num) {
        for (WeakReference weakReference : cda.A06.values()) {
            C27516CGg cGg = (C27516CGg) weakReference.get();
            if (cGg != null) {
                cGg.BGX(cda, num);
            }
        }
    }

    public final void A02(CD3 cd3) {
        CCf cCf;
        C27481CEx cEx = cd3.A0E;
        String str = cEx.A05;
        String str2 = cEx.A06;
        String str3 = cEx.A04;
        boolean z = cEx.A08;
        CCN ccn = cd3.A0D;
        if (ccn == null || ccn != CCN.WEBSITE_CLICK || (cCf = cd3.A0A) == null) {
            AnonymousClass0a4.A06(ccn);
            boolean z2 = false;
            if (ccn != CCN.WEBSITE_CLICK) {
                z2 = true;
            }
            AnonymousClass0a4.A09(z2);
            if (ccn.ordinal() != 0) {
                cCf = CCf.INSTAGRAM_MESSAGE;
            } else {
                cCf = CCf.VIEW_INSTAGRAM_PROFILE;
            }
        }
        String str4 = cd3.A0U;
        CFW A002 = cd3.A00();
        int i = cd3.A02;
        int i2 = cd3.A05;
        C27481CEx cEx2 = new C27481CEx();
        cEx2.A05 = str;
        cEx2.A00 = i;
        cEx2.A01 = i2;
        cEx2.A02 = A002;
        cEx2.A03 = cCf;
        cEx2.A06 = str2;
        cEx2.A07 = str4;
        cEx2.A04 = str3;
        cEx2.A08 = z;
        cd3.A0E = cEx2;
        A00(this, Constants.A04);
    }

    public final void A04(CD3 cd3, int i) {
        if (i != cd3.A02) {
            cd3.A02 = i;
            cd3.A06 = i * cd3.A05;
            A00(this, Constants.A0N);
        }
    }

    public final void A05(CD3 cd3, int i) {
        if (i != cd3.A05) {
            cd3.A05 = i;
            cd3.A06 = cd3.A02 * i;
            A00(this, Constants.A0Y);
        }
    }

    public final void A06(CD3 cd3, CCN ccn) {
        if (ccn == null || ccn != cd3.A0D) {
            boolean z = false;
            if (ccn != null) {
                z = true;
            }
            this.A03 = z;
            cd3.A0D = ccn;
            A00(this, Constants.ZERO);
        }
    }

    public final void A07(CD3 cd3, C27481CEx cEx) {
        CCf cCf = cEx.A03;
        CCN A002 = CCf.A00(cCf);
        cd3.A0D = A002;
        cd3.A0U = cEx.A07;
        CCf cCf2 = null;
        if (A002 == CCN.WEBSITE_CLICK) {
            cCf2 = cCf;
        }
        cd3.A0A = cCf2;
        String str = cEx.A02.A03;
        if (str == null) {
            str = CGU.A00(Constants.ZERO);
        }
        cd3.A0d = str;
        int i = cEx.A00;
        cd3.A02 = i;
        int i2 = cEx.A01;
        cd3.A05 = i2;
        cd3.A06 = i * i2;
        this.A03 = true;
        this.A02 = true;
    }

    public final void A08(CD3 cd3, CC7 cc7) {
        if (cc7 != cd3.A0O) {
            cd3.A0O = cc7;
        }
        A00(this, Constants.A03);
    }

    public final void A09(CD3 cd3, String str) {
        if (str != null) {
            C27481CEx cEx = cd3.A0E;
            String str2 = cEx.A05;
            int i = cEx.A00;
            int i2 = cEx.A01;
            CFW cfw = cEx.A02;
            CCf cCf = cEx.A03;
            String str3 = cEx.A07;
            String str4 = cEx.A04;
            boolean z = cEx.A08;
            C27481CEx cEx2 = new C27481CEx();
            cEx2.A05 = str2;
            cEx2.A00 = i;
            cEx2.A01 = i2;
            cEx2.A02 = cfw;
            cEx2.A03 = cCf;
            cEx2.A06 = str;
            cEx2.A07 = str3;
            cEx2.A04 = str4;
            cEx2.A08 = z;
            cd3.A0E = cEx2;
        }
        boolean z2 = false;
        if (str != null) {
            z2 = true;
        }
        this.A05 = z2;
        A00(this, Constants.A06);
    }

    public final void A0A(CD3 cd3, String str) {
        if (str == null || !str.equals(cd3.A0d)) {
            boolean z = false;
            if (str != null) {
                z = true;
            }
            this.A02 = z;
            cd3.A0d = str;
            A00(this, Constants.A0C);
        }
    }

    public final void A0C(C27516CGg cGg) {
        if (!this.A06.containsKey(Integer.valueOf(cGg.hashCode()))) {
            this.A06.put(Integer.valueOf(cGg.hashCode()), new WeakReference(cGg));
        }
    }

    public final void A0D(C27516CGg cGg) {
        if (cGg != null && this.A06.containsKey(Integer.valueOf(cGg.hashCode()))) {
            this.A06.remove(Integer.valueOf(cGg.hashCode()));
        }
    }

    public final void A0E(boolean z) {
        if (z != this.A04) {
            this.A04 = z;
            A00(this, Constants.A08);
        }
    }

    public final void A0B(CD3 cd3, List list) {
        AnonymousClass0a4.A06(list);
        C27452CDu cDu = cd3.A08;
        AnonymousClass0a4.A06(cDu);
        String str = cDu.A02;
        String str2 = cDu.A03;
        int i = cDu.A01;
        int i2 = cDu.A00;
        ImmutableList A002 = cDu.A00();
        cDu.A01();
        ImmutableList A022 = cDu.A02();
        C27452CDu cDu2 = new C27452CDu();
        cDu2.A02 = str;
        cDu2.A03 = str2;
        cDu2.A01 = i;
        cDu2.A00 = i2;
        cDu2.A04 = A002;
        cDu2.A05 = list;
        cDu2.A06 = A022;
        cd3.A08 = cDu2;
        A00(this, Constants.A12);
    }
}
