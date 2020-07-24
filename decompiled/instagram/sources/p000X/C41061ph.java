package p000X;

import android.content.Context;

/* renamed from: X.1ph  reason: invalid class name and case insensitive filesystem */
public final class C41061ph extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41061ph(C37531jo r3) {
        super("maybeSyncContactPoints", 365);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r0 = this.A00;
        Context context = r0.A06;
        AnonymousClass0C1 r6 = r0.A07;
        boolean z = false;
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.CONTACT_POINT_UPLOAD_RATE_LIMIT_KILLSWITCH, "enabled", false, (AnonymousClass04H) null)).booleanValue() && C16180oA.A00(r6).A00.getLong("last_successful_contact_points_auto_sync", 0) > System.currentTimeMillis() - 259200000) {
            z = true;
        }
        if (!z && context != null) {
            C12810hQ.A02(new C115524xi(context, r6));
        }
    }
}
