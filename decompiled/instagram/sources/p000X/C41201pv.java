package p000X;

import android.text.TextUtils;

/* renamed from: X.1pv  reason: invalid class name and case insensitive filesystem */
public final class C41201pv extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41201pv(C37531jo r3) {
        super("backfillPersonalLinkageToServer", 377);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r3 = this.A00;
        AnonymousClass0C1 r6 = r3.A07;
        String string = C42251s2.A01(r6).getString("page_id", "");
        String string2 = C42251s2.A01(r3.A07).getString("page_name", "");
        if (Constants.ONE.equals(r6.A06.A1b) && ((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.IG_PERSONAL_ACCOUNT_TO_FB_PAGE_LINKAGE_BACKFILL, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass2CB A002 = AnonymousClass2CB.A00(r6);
            if (A002.A00.A00.getBoolean("personal_account_fb_page_id_backfilling_completed", false)) {
                return;
            }
            if (TextUtils.isEmpty(string)) {
                A002.A00.A00.edit().putBoolean("personal_account_fb_page_id_backfilling_completed", true).apply();
            } else {
                A002.A03(string, string2);
            }
        }
    }
}
