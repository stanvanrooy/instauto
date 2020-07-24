package p000X;

import android.content.Context;

/* renamed from: X.1q2  reason: invalid class name and case insensitive filesystem */
public final class C41271q2 extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41271q2(C37531jo r3) {
        super("maybeUpdateNotificationSettings", 384);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r5 = this.A00;
        if (((Boolean) AnonymousClass0L6.A02(r5.A07, AnonymousClass0L7.NOTIFICATION_SETTING_SYNC, "shouldSyncNotificationSettings", false, (AnonymousClass04H) null)).booleanValue()) {
            Context context = r5.A06;
            AnonymousClass0C1 r4 = r5.A07;
            boolean z = true;
            int i = 2;
            if (C06100Nt.A01(context)) {
                i = 1;
            }
            int i2 = C16180oA.A00(r4).A00.getInt("notification_settings", 0);
            if (i2 == 0 || i != i2) {
                C15890nh r2 = new C15890nh(r4);
                r2.A09 = Constants.ONE;
                r2.A0C = "notifications/store_client_push_permissions/";
                if (i != 1) {
                    z = false;
                }
                r2.A0C("enabled", z);
                r2.A09("device_id", C05860Mt.A02.A05(context));
                r2.A06(AnonymousClass1N4.class, false);
                C17850qu A03 = r2.A03();
                A03.A00 = new C95234Al(r4, i);
                C12810hQ.A02(A03);
            }
        }
    }
}
