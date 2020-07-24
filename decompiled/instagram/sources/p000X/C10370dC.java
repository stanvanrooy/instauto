package p000X;

/* renamed from: X.0dC  reason: invalid class name and case insensitive filesystem */
public final class C10370dC extends C05010Hm {
    public final AnonymousClass0SI A00;

    public static int A00(C10370dC r13, int i, int i2, int i3) {
        int i4 = 0;
        long A01 = r13.A01(i, 0);
        if (A01 == 0 || r13.A03 == null) {
            return 0;
        }
        long j = 1;
        int i5 = 0;
        while (true) {
            AnonymousClass0IG[] r1 = r13.A03;
            if (i4 >= r1.length) {
                return i5;
            }
            if ((A01 & j) != 0) {
                int i6 = i3;
                if (i6 != 1) {
                    if (i6 == 2) {
                        r1[i4].onQuickMarkerEnd(i, i2);
                    } else {
                        throw new IllegalArgumentException(AnonymousClass000.A05("Unknown listenerMethod: ", i6));
                    }
                } else if (r1[i4].onQuickMarkerStart(i, i2)) {
                    i5 = (int) (((long) i5) | j);
                }
            }
            i4++;
            j <<= 1;
        }
    }

    public C10370dC(AnonymousClass0IG[] r1, AnonymousClass0SI r2, C10910e4 r3) {
        super(r1, r3);
        this.A00 = r2;
    }

    public final int[] A03(AnonymousClass0IG r2) {
        AnonymousClass0IF listenerMarkers = r2.getListenerMarkers();
        if (listenerMarkers == null) {
            return null;
        }
        return listenerMarkers.A01;
    }
}
