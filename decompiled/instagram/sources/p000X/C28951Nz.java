package p000X;

import android.text.TextUtils;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Set;

/* renamed from: X.1Nz  reason: invalid class name and case insensitive filesystem */
public final class C28951Nz {
    public final AnonymousClass1O0[] A00 = {new AnonymousClass1O3(), new AnonymousClass1O4(), new AnonymousClass1O5(), new AnonymousClass1O6(), new AnonymousClass1O7()};

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r9, p000X.AnonymousClass0L7.QP_WATERFALL_LOGGING, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0027;
     */
    public final AnonymousClass2C5 A00(AnonymousClass0C1 r19, AnonymousClass2BW r20, QuickPromotionSurface quickPromotionSurface, Set set, Set set2, long j, long j2, boolean z) {
        boolean z2;
        String str;
        AnonymousClass0C1 r9 = r19;
        AnonymousClass2C0 A02 = C17640qZ.A00.A02(r9);
        AnonymousClass2BW r10 = r20;
        String str2 = r10.A02.A05;
        if (z) {
            z2 = true;
        }
        z2 = false;
        for (AnonymousClass1O0 r8 : this.A00) {
            A02.A02(r8.Aae(), str2, z2);
            AnonymousClass2C5 Btg = r8.Btg(r9, r10, quickPromotionSurface, set, set2, j, j2);
            if (!Btg.A01) {
                if (!TextUtils.isEmpty(Btg.A00)) {
                    str = Btg.A00;
                } else {
                    str = "unknown";
                }
                AnonymousClass0QD.A01("IG-QP", AnonymousClass000.A0J(str, "; promotion id: ", str2));
                return Btg;
            }
        }
        A02.A02("client_promotion_valid", str2, z2);
        return new AnonymousClass2C5(true, (String) null);
    }
}
