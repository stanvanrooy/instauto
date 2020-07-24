package p000X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.CNE */
public final class CNE {
    public String A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public ArrayList A04;
    public ArrayList A05;
    public boolean A06;
    public final AnonymousClass0C1 A07;
    public final C27671CMp A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public final AnonymousClass1HD A00() {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A07.getToken());
        bundle.putString("prior_module", this.A09);
        bundle.putString("prior_submodule", this.A0A);
        bundle.putSerializable("entrypoint", this.A08);
        bundle.putBoolean(AnonymousClass0C5.$const$string(28), this.A0B);
        bundle.putString("tagged_business_partner", this.A00);
        bundle.putString("tagged_merchant_id", this.A01);
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            bundle.putParcelableArrayList("product_tags", arrayList);
        }
        ArrayList arrayList2 = this.A03;
        if (arrayList2 != null) {
            bundle.putParcelableArrayList(AnonymousClass40t.$const$string(18), arrayList2);
        }
        bundle.putString("tagging_info_id", this.A02);
        bundle.putBoolean("should_return_result", this.A06);
        bundle.putStringArrayList("suggested_product_ids", this.A05);
        CNB cnb = new CNB();
        cnb.setArguments(bundle);
        return cnb;
    }

    public CNE(AnonymousClass0C1 r1, String str, String str2, C27671CMp cMp, boolean z) {
        this.A07 = r1;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = cMp;
        this.A0B = z;
    }
}
