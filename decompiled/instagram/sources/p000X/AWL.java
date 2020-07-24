package p000X;

/* renamed from: X.AWL */
public final class AWL extends RuntimeException {
    public AWL(int i, int i2, int i3, int i4) {
        super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
    }
}
