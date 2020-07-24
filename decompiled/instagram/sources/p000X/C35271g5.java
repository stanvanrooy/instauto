package p000X;

import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Comparator;

/* renamed from: X.1g5  reason: invalid class name and case insensitive filesystem */
public final class C35271g5 implements Comparator {
    public final /* synthetic */ PendingMediaStore A00;

    public C35271g5(PendingMediaStore pendingMediaStore) {
        this.A00 = pendingMediaStore;
    }

    public final int compare(Object obj, Object obj2) {
        return (((PendingMedia) obj).A0a > ((PendingMedia) obj2).A0a ? 1 : (((PendingMedia) obj).A0a == ((PendingMedia) obj2).A0a ? 0 : -1));
    }
}
