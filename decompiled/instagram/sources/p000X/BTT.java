package p000X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.BTT */
public final class BTT extends AbstractList<Float> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final float[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof BTT)) {
                return super.equals(obj);
            }
            BTT btt = (BTT) obj;
            int size = size();
            if (btt.size() == size) {
                int i = 0;
                while (i < size) {
                    if (this.A02[this.A01 + i] == btt.A02[btt.A01 + i]) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.A02;
            float floatValue = ((Float) obj).floatValue();
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    if (fArr[i] == floatValue) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.A01; i2 < this.A00; i2++) {
            i = (i * 31) + Float.valueOf(this.A02[i2]).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float[] fArr = this.A02;
        float floatValue = ((Float) obj).floatValue();
        int i = this.A01;
        int i2 = this.A00;
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (fArr[i3] == floatValue) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            return i3 - i;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float[] fArr = this.A02;
        float floatValue = ((Float) obj).floatValue();
        int i = this.A01;
        int i2 = this.A00 - 1;
        while (true) {
            if (i2 >= i) {
                if (fArr[i2] == floatValue) {
                    break;
                }
                i2--;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2 - i;
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        AnonymousClass0a4.A03(i, size());
        float[] fArr = this.A02;
        int i2 = this.A01 + i;
        float f2 = fArr[i2];
        AnonymousClass0a4.A06(f);
        fArr[i2] = f.floatValue();
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.A00 - this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        sb.append(this.A02[this.A01]);
        int i = this.A01;
        while (true) {
            i++;
            if (i < this.A00) {
                sb.append(", ");
                sb.append(this.A02[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public BTT(float[] fArr, int i, int i2) {
        this.A02 = fArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass0a4.A03(i, size());
        return Float.valueOf(this.A02[this.A01 + i]);
    }

    public final List subList(int i, int i2) {
        AnonymousClass0a4.A05(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        float[] fArr = this.A02;
        int i3 = this.A01;
        return new BTT(fArr, i + i3, i3 + i2);
    }
}
