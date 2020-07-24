package p000X;

import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0ud  reason: invalid class name and case insensitive filesystem */
public final class C20150ud implements C19490tZ {
    public static C05110Id A02 = new C20160ue();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20130ub) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r12, C06270Ok r13, C73233Ja r14) {
        C17850qu A03;
        C20130ub r122 = (C20130ub) r12;
        List A06 = r122.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        String A05 = r122.A05();
        String str = r122.A03;
        DirectAREffectShare directAREffectShare = r122.A00;
        AnonymousClass3LQ r1 = r122.A02;
        boolean z2 = r1.A03;
        if (r122.AM6() != null) {
            String A052 = r122.A05();
            String str2 = r122.A03;
            AnonymousClass3LQ r0 = r122.A02;
            A03 = C99664Sn.A00(this.A01, (DirectThreadKey) r122.A06().get(0), A052, str2, r0.A03, (String) null, r122.AM6(), r0.A02);
        } else {
            AnonymousClass0C1 r02 = this.A01;
            boolean z3 = r1.A02;
            C15890nh r4 = new C15890nh(r02);
            r4.A09 = Constants.ONE;
            r4.A0C = C99664Sn.A01(C58022fB.AR_EFFECT, (MediaType) null, false);
            r4.A06(AnonymousClass3K3.class, false);
            C99664Sn.A02(r4, directThreadKey, A05, str, z2, (String) null, z3);
            r4.A09("effect_id", directAREffectShare.A02());
            r4.A09("query_id", "3097378217011355");
            ProductAREffectContainer productAREffectContainer = directAREffectShare.A04;
            if (productAREffectContainer != null) {
                Product product = productAREffectContainer.A00.A00;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("product_id", product.getId());
                    jSONObject.put("merchant_id", product.A02.A02);
                    r4.A09("effect_product", jSONObject.toString());
                } catch (JSONException unused) {
                    AnonymousClass0QD.A01("DirectMessageApi", "Error creating effect product json for direct message");
                }
            }
            A03 = r4.A03();
        }
        C12810hQ.A02(A03);
    }

    public C20150ud(AnonymousClass0C1 r2) {
        this.A01 = r2;
        this.A00 = C19290tE.A00(r2);
    }
}
