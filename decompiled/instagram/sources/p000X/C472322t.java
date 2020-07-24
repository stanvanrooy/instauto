package p000X;

import android.content.Context;

/* renamed from: X.22t  reason: invalid class name and case insensitive filesystem */
public final class C472322t extends C12690hE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0C1 A01;

    public final boolean onQueueIdle() {
        AnonymousClass234 A012 = AnonymousClass234.A01(this.A00, this.A01);
        if (!AnonymousClass234.A03(A012, false)) {
            AnonymousClass234.A02(A012, false);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C472322t(Context context, AnonymousClass0C1 r3) {
        super("scheduleCheckForAppUpdate");
        this.A00 = context;
        this.A01 = r3;
    }
}
