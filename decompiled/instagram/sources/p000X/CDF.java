package p000X;

import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;

/* renamed from: X.CDF */
public final class CDF extends C17920r1 {
    public final /* synthetic */ CDE A00;

    public CDF(CDE cde) {
        this.A00 = cde;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-1857217409);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A00.A03, C27398CBr.BUDGET, "reach_estimation_fetch", str);
        AnonymousClass0Z0.A0A(-289191241, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-159758876);
        this.A00.A01.setVisibility(8);
        this.A00.A00.setVisibility(0);
        AnonymousClass0Z0.A0A(2039101967, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d1, code lost:
        if (r7.A05 != r9) goto L_0x00d3;
     */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        boolean z;
        int A03 = AnonymousClass0Z0.A03(-970035096);
        CG6 cg6 = (CG6) obj;
        int A032 = AnonymousClass0Z0.A03(-138022709);
        if (cg6.A00 == null || !((Boolean) AnonymousClass0L6.A02(this.A00.A03.A0Q, AnonymousClass0L7.PROMOTE_ERROR_HANDLING, "is_new_error_handling_enabled_for_django", false, (AnonymousClass04H) null)).booleanValue()) {
            CCZ.A09(this.A00.A03, C27398CBr.BUDGET, "reach_estimation_fetch");
            CD3 cd3 = this.A00.A03;
            AnonymousClass0a4.A06(cd3.A0D);
            CFT cft = cd3.A0M;
            HashMap hashMap = new HashMap();
            for (String str2 : cg6.A01.keySet()) {
                hashMap.put(Integer.valueOf(Integer.parseInt(str2)), (C27408CCb) cg6.A01.get(str2));
            }
            CD3 cd32 = this.A00.A03;
            String str3 = cd32.A0Z;
            String ccn = cd32.A0D.toString();
            String str4 = cd32.A0S;
            if (CDV.A05(cd32.A00())) {
                str = null;
            } else {
                str = this.A00.A03.A0d;
            }
            boolean z2 = this.A00.A03.A10;
            if (TextUtils.equals(cft.A03, str3) && TextUtils.equals(cft.A02, ccn) && TextUtils.equals(cft.A00, str4) && TextUtils.equals(cft.A01, str)) {
                z = false;
            }
            z = true;
            if (z) {
                cft.A04 = new HashMap();
                cft.A03 = str3;
                cft.A02 = ccn;
                cft.A00 = str4;
                cft.A01 = str;
                cft.A05 = z2;
            }
            cft.A04.putAll(hashMap);
            this.A00.A00.setVisibility(8);
            this.A00.A01.setVisibility(0);
            C27408CCb A002 = CDE.A00(this.A00);
            if (A002 != null) {
                CDE cde = this.A00;
                cde.A03.A0L = A002;
                cde.A01.setText(StringFormatUtil.formatStrLocaleSafe("%,d - %,d", Integer.valueOf(A002.A00), Integer.valueOf(A002.A01)));
                CDA.A00(this.A00.A04, Constants.A02);
            }
        } else {
            CCZ.A0C(this.A00.A03, C27398CBr.BUDGET, "reach_estimation_fetch", cg6.A00.A03);
        }
        AnonymousClass0Z0.A0A(225110693, A032);
        AnonymousClass0Z0.A0A(271882425, A03);
    }
}
