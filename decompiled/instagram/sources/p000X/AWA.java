package p000X;

/* renamed from: X.AWA */
public enum AWA {
    BASELINE(0),
    HIGH(1),
    HIGH31(2),
    MAIN(3);
    
    public final int A00;

    public static AWA A00(int i) {
        if (i == 1) {
            return HIGH;
        }
        if (i == 2) {
            return HIGH31;
        }
        if (i != 3) {
            return BASELINE;
        }
        return MAIN;
    }

    public static AWA A01(String str) {
        if (str != null && str.equalsIgnoreCase("high31")) {
            return HIGH31;
        }
        if (str == null || !str.equalsIgnoreCase("high")) {
            return BASELINE;
        }
        return HIGH;
    }

    /* access modifiers changed from: public */
    AWA(int i) {
        this.A00 = i;
    }
}
