package p000X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.BTU */
public final class BTU extends AbstractList<Long> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final long[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof BTU)) {
                return super.equals(obj);
            }
            BTU btu = (BTU) obj;
            int size = size();
            if (btu.size() == size) {
                int i = 0;
                while (i < size) {
                    if (this.A02[this.A01 + i] == btu.A02[btu.A01 + i]) {
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
        if (obj instanceof Long) {
            long[] jArr = this.A02;
            long longValue = ((Long) obj).longValue();
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    if (jArr[i] == longValue) {
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
            long j = this.A02[i2];
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long[] jArr = this.A02;
        long longValue = ((Long) obj).longValue();
        int i = this.A01;
        int i2 = this.A00;
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (jArr[i3] == longValue) {
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
        if (!(obj instanceof Long)) {
            return -1;
        }
        long[] jArr = this.A02;
        long longValue = ((Long) obj).longValue();
        int i = this.A01;
        int i2 = this.A00 - 1;
        while (true) {
            if (i2 >= i) {
                if (jArr[i2] == longValue) {
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
        Long l = (Long) obj;
        AnonymousClass0a4.A03(i, size());
        long[] jArr = this.A02;
        int i2 = this.A01 + i;
        long j = jArr[i2];
        AnonymousClass0a4.A06(l);
        jArr[i2] = l.longValue();
        return Long.valueOf(j);
    }

    public final int size() {
        return this.A00 - this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 10);
        sb.append('[');
        long[] jArr = this.A02;
        int i = this.A01;
        while (true) {
            sb.append(jArr[i]);
            i++;
            if (i < this.A00) {
                sb.append(", ");
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public BTU(long[] jArr, int i, int i2) {
        this.A02 = jArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass0a4.A03(i, size());
        return Long.valueOf(this.A02[this.A01 + i]);
    }

    public final List subList(int i, int i2) {
        AnonymousClass0a4.A05(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        long[] jArr = this.A02;
        int i3 = this.A01;
        return new BTU(jArr, i + i3, i3 + i2);
    }
}
