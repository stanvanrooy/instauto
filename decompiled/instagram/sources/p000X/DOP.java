package p000X;

import com.google.common.collect.MapMakerInternalMap;

/* renamed from: X.DOP */
public final class DOP implements C13580ip {
    public static final DOP A00 = new DOP();

    public final C13620ix A9t(MapMakerInternalMap.Segment segment, C13620ix r5, C13620ix r6) {
        DOQ doq = (DOQ) r5;
        DOQ doq2 = new DOQ(doq.A02, doq.A01, (DOQ) r6);
        doq2.A00 = doq.A00;
        return doq2;
    }

    public final C13620ix Apo(MapMakerInternalMap.Segment segment, Object obj, int i, C13620ix r5) {
        return new DOQ(obj, i, (DOQ) r5);
    }

    public final MapMakerInternalMap.Segment Apt(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
        return new MapMakerInternalMap.StrongKeyStrongValueSegment(mapMakerInternalMap, i, i2);
    }

    public final void Blc(MapMakerInternalMap.Segment segment, C13620ix r2, Object obj) {
        ((DOQ) r2).A00 = obj;
    }

    public final MapMakerInternalMap.Strength AiX() {
        return MapMakerInternalMap.Strength.A01;
    }

    public final MapMakerInternalMap.Strength Btj() {
        return MapMakerInternalMap.Strength.A01;
    }
}
