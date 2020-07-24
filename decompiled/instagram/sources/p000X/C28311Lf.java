package p000X;

import android.content.Context;

/* renamed from: X.1Lf  reason: invalid class name and case insensitive filesystem */
public final class C28311Lf implements C06570Po {
    public final C28331Lh A00;

    public final void onUserSessionWillEnd(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r7, p000X.AnonymousClass0L7.VPVD_IMPRESSIONS_STORE, "use_database", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0033;
     */
    public static C28331Lh A00(Context context, AnonymousClass0C1 r7) {
        boolean z;
        C28331Lh r4;
        Class<C28311Lf> cls = C28311Lf.class;
        C28311Lf r0 = (C28311Lf) r7.AV9(cls);
        if (r0 == null) {
            if (((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.MEDIA_STORE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                z = true;
            }
            z = false;
            if (z) {
                r4 = new C151436di(new BUS(new BUf(context, r7)));
            } else {
                r4 = new C28321Lg(context, r7, "impression_store", ((Integer) AnonymousClass0L6.A02(r7, AnonymousClass0L7.VPVD_IMPRESSIONS_STORE, "max_disk_count", 200, (AnonymousClass04H) null)).intValue());
            }
            r0 = new C28311Lf(r4);
            r7.BYi(cls, r0);
        }
        return r0.A00;
    }

    public C28311Lf(C28331Lh r1) {
        this.A00 = r1;
    }
}
