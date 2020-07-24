package p000X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.model.shopping.ProductSource;
import java.util.List;

/* renamed from: X.CNV */
public final class CNV {
    public ProductSource A00;
    public C53502Ta A01;
    public final AnonymousClass0QT A02;
    public final C27371Ho A03;
    public final AnonymousClass0C1 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public static AnonymousClass0P4 A00(CNV cnv, String str) {
        C37141jB A032 = C37591ju.A03(C37591ju.A04(str, false), cnv.A03);
        A032.A4E = cnv.A06;
        return A032.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r2 == p000X.C53502Ta.COLLECTION) goto L_0x004d;
     */
    public static void A01(CNV cnv, AnonymousClass0P4 r4) {
        boolean z;
        r4.A0H("waterfall_id", cnv.A07);
        r4.A0H("entry_point", cnv.A05);
        r4.A0A("has_multiple_source_types", Boolean.valueOf(cnv.A08));
        C53502Ta r0 = cnv.A01;
        if (r0 != null) {
            r4.A0G("currently_viewed_source_type", r0.toString());
        }
        ProductSource productSource = cnv.A00;
        if (productSource != null) {
            r4.A0G("selected_source_id", productSource.A01);
            r4.A0G("selected_source_type", cnv.A00.A00.toString());
        }
        if (!cnv.A08 && (r2 = cnv.A01) != C53502Ta.BRAND) {
            z = false;
        }
        z = true;
        r4.A0A(AnonymousClass0C5.$const$string(98), Boolean.valueOf(z));
        AnonymousClass0WN.A01(cnv.A04).BcG(r4);
    }

    public final void A02(ProductSource productSource) {
        CNX cnx = new CNX(this.A02.A02("instagram_shopping_product_source_selected"));
        String str = productSource.A01;
        AnonymousClass0a4.A06(str);
        cnx.A08("selected_source_id", str);
        String str2 = productSource.A04;
        AnonymousClass0a4.A06(str2);
        cnx.A08("selected_source_name", str2);
        String r2 = productSource.A00.toString();
        AnonymousClass0a4.A06(r2);
        cnx.A08("selected_source_type", r2);
        cnx.A08("prior_module", this.A06);
        cnx.A08("waterfall_id", this.A07);
        cnx.A01();
    }

    public final void A03(C53502Ta r4) {
        AnonymousClass0P4 A002 = A00(this, "product_source_load_start");
        A002.A0G("loaded_source_type", r4.toString());
        A01(this, A002);
    }

    public final void A04(C53502Ta r4, int i, boolean z, List list) {
        AnonymousClass0P4 A002 = A00(this, "product_source_load_success");
        A002.A0G("loaded_source_type", r4.toString());
        A002.A0E("result_count", Integer.valueOf(i));
        A002.A0A("has_more_results", Boolean.valueOf(z));
        if (list != null) {
            A002.A0I("sources", list);
        }
        A01(this, A002);
    }

    public final void A05(C53502Ta r4, Throwable th) {
        AnonymousClass0P4 A002 = A00(this, "product_source_load_failure");
        A002.A0G("loaded_source_type", r4.toString());
        if (th != null) {
            A002.A0H("error_message", th.getMessage());
        }
        A01(this, A002);
    }

    public final void A06(String str, ProductSource productSource, C53502Ta r4) {
        this.A00 = productSource;
        boolean z = this.A08;
        if (z && str != null) {
            C53502Ta A002 = C53502Ta.A00(str);
            this.A01 = A002;
            if (A002 != r4) {
                return;
            }
        } else if (!z) {
            this.A01 = r4;
        } else {
            return;
        }
        A01(this, A00(this, "product_source_selection_opened"));
    }

    public final void A07(boolean z) {
        String str;
        AnonymousClass0P4 A002 = A00(this, "onboarding_navigation_request_completed");
        A002.A0F("network_end_time", Long.valueOf(System.currentTimeMillis()));
        if (z) {
            str = "success";
        } else {
            str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        }
        A002.A0G("network_result", str);
        A01(this, A002);
    }

    public CNV(AnonymousClass0C1 r2, C27371Ho r3, boolean z, String str, String str2, String str3) {
        this.A04 = r2;
        this.A03 = r3;
        this.A08 = z;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A02 = AnonymousClass0QT.A00(r2, r3);
    }
}
