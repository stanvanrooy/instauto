package p000X;

import android.content.Context;

/* renamed from: X.03d  reason: invalid class name and case insensitive filesystem */
public final class C026103d extends C032906k {
    public C032906k A00;
    public final Context A01;

    public final void A01(int i, String str, AnonymousClass06W r12, long j, long j2) {
        C032906k r0;
        C032906k r1;
        synchronized (this) {
            if (this.A00 == null) {
                try {
                    r1 = (C032906k) Class.forName("com.facebook.analytics2.logger.GooglePlayServicesFactory").getDeclaredMethod("createUploadSchedulerImpl", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.A01});
                } catch (Exception e) {
                    e.toString();
                    r1 = null;
                }
                if (r1 == null) {
                    r1 = new C034206x(this.A01);
                }
                this.A00 = r1;
            }
            r0 = this.A00;
        }
        r0.A01(i, str, r12, j, j2);
    }

    public C026103d(Context context) {
        this.A01 = context;
    }
}
