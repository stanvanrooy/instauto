package p000X;

import com.instagram.model.reels.Reel;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.1Yt  reason: invalid class name and case insensitive filesystem */
public final class C31551Yt implements Comparator {
    public final /* synthetic */ Map A00;

    public C31551Yt(Map map) {
        this.A00 = map;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long longValue = ((Long) this.A00.get((Reel) obj)).longValue();
        long longValue2 = ((Long) this.A00.get((Reel) obj2)).longValue();
        if (longValue < longValue2) {
            return -1;
        }
        if (longValue == longValue2) {
            return 0;
        }
        return 1;
    }
}
