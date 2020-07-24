package p000X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.Comparator;

/* renamed from: X.1jU  reason: invalid class name and case insensitive filesystem */
public final class C37331jU implements Comparator {
    public final /* synthetic */ ReelStore A00;

    public C37331jU(ReelStore reelStore) {
        this.A00 = reelStore;
    }

    public final int compare(Object obj, Object obj2) {
        return (((Reel) obj).A0w ? 1 : 0) - (((Reel) obj2).A0w ? 1 : 0);
    }
}
