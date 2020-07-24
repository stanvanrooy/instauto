package p000X;

/* renamed from: X.C0w */
public final class C0w extends C1m {
    public final C0L[] A00;
    public final String[] A01;

    public final boolean equals(Object obj) {
        int length;
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            C0w c0w = (C0w) obj;
            if (c0w.A00 == this.A00) {
                C0L[] c0lArr = this.A00;
                C0L[] c0lArr2 = c0w.A00;
                if (c0lArr == null) {
                    return c0lArr2 == null || c0lArr2.length == 0;
                }
                if (c0lArr2 != null && (length = c0lArr.length) == c0lArr2.length) {
                    int i = 0;
                    while (i < length) {
                        if (c0lArr[i].equals(c0lArr2[i])) {
                            i++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static C0w A00(Class cls) {
        return new C0w(cls, (String[]) null, (C0L[]) null, (Object) null, (Object) null, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(A0Q());
        sb.append(']');
        return sb.toString();
    }

    public C0w(Class cls) {
        this(cls, (String[]) null, (C0L[]) null, (Object) null, (Object) null, false);
    }

    public C0w(Class cls, String[] strArr, C0L[] c0lArr, Object obj, Object obj2, boolean z) {
        super(cls, 0, obj, obj2, z);
        if (strArr == null || strArr.length == 0) {
            this.A01 = null;
            this.A00 = null;
            return;
        }
        this.A01 = strArr;
        this.A00 = c0lArr;
    }
}
