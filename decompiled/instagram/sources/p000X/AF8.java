package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.igds.components.bottombutton.IgBottomButtonLayout;
import java.util.HashMap;

/* renamed from: X.AF8 */
public final class AF8 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C53822Um A01;

    public AF8(C53822Um r1, Context context) {
        this.A01 = r1;
        this.A00 = context;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1174557505);
        HashMap hashMap = new HashMap();
        hashMap.put("catalog_id", this.A01.A03.A01.A01);
        Bundle bundle = this.A01.mArguments;
        hashMap.put("waterfall_id", bundle.getString("waterfall_id"));
        hashMap.put("entry_point", bundle.getString("entry_point"));
        hashMap.put("prior_module", bundle.getString("prior_module_name"));
        hashMap.put("catalog_id", this.A01.A03.A01.A01);
        String $const$string = AnonymousClass0C5.$const$string(111);
        hashMap.put($const$string, bundle.getString($const$string));
        C53822Um r1 = this.A01;
        AnonymousClass1OP r5 = new AnonymousClass1OP(r1.A02, r1);
        IgBottomButtonLayout igBottomButtonLayout = this.A01.A01;
        if (igBottomButtonLayout != null) {
            igBottomButtonLayout.setPrimaryButtonEnabled(false);
        }
        C53822Um r0 = this.A01;
        CNV cnv = r0.A04;
        String str = r0.A03.A01.A01;
        AnonymousClass0P4 A002 = CNV.A00(cnv, "onboarding_navigation_button_clicked");
        A002.A0G("catalog_id", str);
        CNV.A01(cnv, A002);
        CNV cnv2 = this.A01.A04;
        AnonymousClass0P4 A003 = CNV.A00(cnv2, "onboarding_navigation_request_started");
        A003.A0F(AnonymousClass0C5.$const$string(268), Long.valueOf(System.currentTimeMillis()));
        CNV.A01(cnv2, A003);
        C53822Um r2 = this.A01;
        AnonymousClass0C1 r12 = r2.A02;
        String str2 = r2.A08;
        AnonymousClass0a4.A06(str2);
        C53562Th A004 = C53572Ti.A00(r12, str2, hashMap);
        A004.A00 = new AF7(this, r5);
        r2.schedule(A004);
        AnonymousClass0Z0.A0C(935853096, A05);
    }
}
