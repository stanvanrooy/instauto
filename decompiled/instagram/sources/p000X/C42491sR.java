package p000X;

import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.1sR  reason: invalid class name and case insensitive filesystem */
public final class C42491sR implements Runnable {
    public final /* synthetic */ PendingMediaStore A00;

    public C42491sR(PendingMediaStore pendingMediaStore) {
        this.A00 = pendingMediaStore;
    }

    public final void run() {
        PendingMediaStoreSerializer.A00(this.A00.A01).A02();
    }
}
