package p000X;

import java.util.ArrayList;

/* renamed from: X.1Iw  reason: invalid class name and case insensitive filesystem */
public final class C27701Iw implements C27711Ix, C27721Iy {
    public AnonymousClass1KS A00;
    public volatile boolean A01;

    public static final void A00(AnonymousClass1KS r7) {
        if (r7 != null) {
            ArrayList arrayList = null;
            for (Object obj : r7.A03) {
                if (obj instanceof C27711Ix) {
                    try {
                        ((C27711Ix) obj).dispose();
                    } catch (Throwable th) {
                        C29942DHs.A00(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C29938DHo.A00((Throwable) arrayList.get(0));
            }
            throw new B6c(arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        return true;
     */
    public final boolean A2X(C27711Ix r11) {
        Object obj;
        AnonymousClass1J6.A01(r11, "d is null");
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    AnonymousClass1KS r4 = this.A00;
                    if (r4 == null) {
                        r4 = new AnonymousClass1KS();
                        this.A00 = r4;
                    }
                    Object[] objArr = r4.A03;
                    int i = r4.A00;
                    int hashCode = r11.hashCode() * -1640531527;
                    int i2 = (hashCode ^ (hashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (!obj2.equals(r11)) {
                            while (true) {
                                i2 = (i2 + 1) & i;
                                Object obj3 = objArr[i2];
                                if (obj3 != null) {
                                    if (obj3.equals(r11)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    objArr[i2] = r11;
                    int i3 = r4.A02 + 1;
                    r4.A02 = i3;
                    if (i3 >= r4.A01) {
                        Object[] objArr2 = r4.A03;
                        int length = objArr2.length;
                        int i4 = length << 1;
                        int i5 = i4 - 1;
                        Object[] objArr3 = new Object[i4];
                        while (true) {
                            int i6 = i3 - 1;
                            if (i3 == 0) {
                                break;
                            }
                            do {
                                length--;
                                obj = objArr2[length];
                            } while (obj == null);
                            int hashCode2 = obj.hashCode() * -1640531527;
                            int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                            if (objArr3[i7] != null) {
                                do {
                                    i7 = (i7 + 1) & i5;
                                } while (objArr3[i7] != null);
                            }
                            objArr3[i7] = objArr2[length];
                            i3 = i6;
                        }
                        r4.A00 = i5;
                        r4.A01 = (int) (((float) i4) * r4.A04);
                        r4.A03 = objArr3;
                    }
                }
            }
        }
        r11.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[DONT_GENERATE] */
    public final boolean ABd(C27711Ix r7) {
        AnonymousClass1KS r4;
        boolean z;
        Object obj;
        AnonymousClass1J6.A01(r7, "Disposable item is null");
        if (this.A01) {
            return false;
        }
        synchronized (this) {
            if (!this.A01 && (r4 = this.A00) != null) {
                Object[] objArr = r4.A03;
                int i = r4.A00;
                int hashCode = r7.hashCode() * -1640531527;
                int i2 = (hashCode ^ (hashCode >>> 16)) & i;
                Object obj2 = objArr[i2];
                if (obj2 != null) {
                    if (!obj2.equals(r7)) {
                        do {
                            i2 = (i2 + 1) & i;
                            obj = objArr[i2];
                            if (obj != null) {
                            }
                        } while (!obj.equals(r7));
                    }
                    r4.A00(i2, objArr, i);
                    z = true;
                    if (z) {
                        return true;
                    }
                }
                z = false;
                if (z) {
                }
            }
        }
    }

    public final void dispose() {
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    this.A01 = true;
                    AnonymousClass1KS r1 = this.A00;
                    this.A00 = null;
                    A00(r1);
                }
            }
        }
    }

    public final boolean Bae(C27711Ix r2) {
        if (!ABd(r2)) {
            return false;
        }
        r2.dispose();
        return true;
    }
}
