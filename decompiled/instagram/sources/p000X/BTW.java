package p000X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.BTW */
public final class BTW extends AbstractList<Boolean> implements RandomAccess, Serializable {
    public final int A00;
    public final int A01;
    public final boolean[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof BTW)) {
                return super.equals(obj);
            }
            BTW btw = (BTW) obj;
            int size = size();
            if (btw.size() == size) {
                int i = 0;
                while (i < size) {
                    if (this.A02[this.A01 + i] == btw.A02[btw.A01 + i]) {
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
        if (obj instanceof Boolean) {
            boolean[] zArr = this.A02;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.A01;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    if (zArr[i] == booleanValue) {
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
            int i3 = i * 31;
            int i4 = 1237;
            if (this.A02[i2]) {
                i4 = 1231;
            }
            i = i3 + i4;
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean[] zArr = this.A02;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.A01;
        int i2 = this.A00;
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (zArr[i3] == booleanValue) {
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
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean[] zArr = this.A02;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.A01;
        int i2 = this.A00 - 1;
        while (true) {
            if (i2 >= i) {
                if (zArr[i2] == booleanValue) {
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
        Boolean bool = (Boolean) obj;
        AnonymousClass0a4.A03(i, size());
        boolean[] zArr = this.A02;
        int i2 = this.A01 + i;
        boolean z = zArr[i2];
        AnonymousClass0a4.A06(bool);
        zArr[i2] = bool.booleanValue();
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.A00 - this.A01;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(size() * 7);
        boolean[] zArr = this.A02;
        int i = this.A01;
        if (zArr[i]) {
            str = "[true";
        } else {
            str = "[false";
        }
        while (true) {
            sb.append(str);
            i++;
            if (i >= this.A00) {
                sb.append(']');
                return sb.toString();
            } else if (zArr[i]) {
                str2 = ", true";
            } else {
                str2 = ", false";
            }
        }
    }

    public BTW(boolean[] zArr, int i, int i2) {
        this.A02 = zArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass0a4.A03(i, size());
        return Boolean.valueOf(this.A02[this.A01 + i]);
    }

    public final List subList(int i, int i2) {
        AnonymousClass0a4.A05(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        boolean[] zArr = this.A02;
        int i3 = this.A01;
        return new BTW(zArr, i + i3, i3 + i2);
    }
}
