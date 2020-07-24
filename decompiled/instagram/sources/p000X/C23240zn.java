package p000X;

import android.content.Context;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.0zn  reason: invalid class name and case insensitive filesystem */
public final class C23240zn implements AnonymousClass0C2 {
    public final Context A00;
    public final AnonymousClass0C1 A01;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C23240zn(Context context, AnonymousClass0C1 r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void onUserSessionStart(boolean z) {
        int A03 = AnonymousClass0Z0.A03(873600995);
        PendingMediaStoreSerializer.A00(this.A01).A03(new C23280zs(this));
        AnonymousClass0Z0.A0A(1362972049, A03);
    }
}
