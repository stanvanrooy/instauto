package p000X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.BTV */
public final class BTV extends AbstractList<Double> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final double[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof BTV)) {
                return super.equals(obj);
            }
            BTV btv = (BTV) obj;
            int size = size();
            if (btv.size() == size) {
                int i = 0;
                while (i < size) {
                    if (this.A02[this.A01 + i] == btv.A02[btv.A01 + i]) {
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
        if (obj instanceof Double) {
            double[] dArr = this.A02;
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    if (dArr[i] == doubleValue) {
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
            i = (i * 31) + Double.valueOf(this.A02[i2]).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double[] dArr = this.A02;
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.A01;
        int i2 = this.A00;
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (dArr[i3] == doubleValue) {
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
        if (!(obj instanceof Double)) {
            return -1;
        }
        double[] dArr = this.A02;
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.A01;
        int i2 = this.A00 - 1;
        while (true) {
            if (i2 >= i) {
                if (dArr[i2] == doubleValue) {
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
        Double d = (Double) obj;
        AnonymousClass0a4.A03(i, size());
        double[] dArr = this.A02;
        int i2 = this.A01 + i;
        double d2 = dArr[i2];
        AnonymousClass0a4.A06(d);
        dArr[i2] = d.doubleValue();
        return Double.valueOf(d2);
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

    public BTV(double[] dArr, int i, int i2) {
        this.A02 = dArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass0a4.A03(i, size());
        return Double.valueOf(this.A02[this.A01 + i]);
    }

    public final List subList(int i, int i2) {
        AnonymousClass0a4.A05(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        double[] dArr = this.A02;
        int i3 = this.A01;
        return new BTV(dArr, i + i3, i3 + i2);
    }
}
