package p000X;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.0io  reason: invalid class name and case insensitive filesystem */
public final class C13570io implements C13580ip {
    public static final C13570io A00 = new C13570io();

    public final C13620ix A9t(MapMakerInternalMap.Segment segment, C13620ix r6, C13620ix r7) {
        MapMakerInternalMap.StrongKeyWeakValueSegment strongKeyWeakValueSegment = (MapMakerInternalMap.StrongKeyWeakValueSegment) segment;
        C13630iy r62 = (C13630iy) r6;
        C13630iy r72 = (C13630iy) r7;
        boolean z = false;
        if (r62.getValue() == null) {
            z = true;
        }
        if (z) {
            return null;
        }
        ReferenceQueue referenceQueue = strongKeyWeakValueSegment.queueForValues;
        C13630iy r2 = new C13630iy(r62.A02, r62.A01, r72);
        r2.A00 = r62.A00.A9v(referenceQueue, r2);
        return r2;
    }

    public final MapMakerInternalMap.Strength AiX() {
        return MapMakerInternalMap.Strength.A01;
    }

    public final C13620ix Apo(MapMakerInternalMap.Segment segment, Object obj, int i, C13620ix r5) {
        return new C13630iy(obj, i, (C13630iy) r5);
    }

    public final MapMakerInternalMap.Segment Apt(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
        return new MapMakerInternalMap.StrongKeyWeakValueSegment(mapMakerInternalMap, i, i2);
    }

    public final void Blc(MapMakerInternalMap.Segment segment, C13620ix r5, Object obj) {
        C13630iy r52 = (C13630iy) r5;
        ReferenceQueue referenceQueue = ((MapMakerInternalMap.StrongKeyWeakValueSegment) segment).queueForValues;
        C13560in r1 = r52.A00;
        r52.A00 = new C13660j1(referenceQueue, obj, r52);
        r1.clear();
    }

    public final MapMakerInternalMap.Strength Btj() {
        return MapMakerInternalMap.Strength.A02;
    }
}
