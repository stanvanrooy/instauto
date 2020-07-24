package p000X;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DM0 */
public final class DM0<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator A07 = new DLz();
    public DM1 A00;
    public int A01 = 0;
    public int A02 = 0;
    public Comparator A03;
    public DM3 A04;
    public DM2 A05;
    public final DM1 A06 = new DM1();

    public final void clear() {
        this.A00 = null;
        this.A02 = 0;
        this.A01++;
        DM1 dm1 = this.A06;
        dm1.A03 = dm1;
        dm1.A01 = dm1;
    }

    public final boolean containsKey(Object obj) {
        DM1 dm1 = null;
        if (obj != null) {
            try {
                dm1 = A04(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (dm1 != null) {
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        DM1 dm1 = null;
        if (obj != null) {
            try {
                dm1 = A04(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (dm1 != null) {
            return dm1.A04;
        }
        return null;
    }

    public final Object remove(Object obj) {
        DM1 dm1 = null;
        if (obj != null) {
            try {
                dm1 = A04(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (dm1 != null) {
            A06(dm1, true);
        }
        if (dm1 != null) {
            return dm1.A04;
        }
        return null;
    }

    public DM0() {
        Comparator comparator = A07;
        this.A03 = comparator;
    }

    private void A00(DM1 dm1) {
        int i;
        int i2;
        DM1 dm12 = dm1.A05;
        DM1 dm13 = dm1.A06;
        DM1 dm14 = dm13.A05;
        DM1 dm15 = dm13.A06;
        dm1.A06 = dm14;
        if (dm14 != null) {
            dm14.A02 = dm1;
        }
        A02(dm1, dm13);
        dm13.A05 = dm1;
        dm1.A02 = dm13;
        int i3 = 0;
        if (dm12 != null) {
            i = dm12.A00;
        } else {
            i = 0;
        }
        if (dm14 != null) {
            i2 = dm14.A00;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        dm1.A00 = max;
        if (dm15 != null) {
            i3 = dm15.A00;
        }
        dm13.A00 = Math.max(max, i3) + 1;
    }

    private void A01(DM1 dm1) {
        int i;
        int i2;
        DM1 dm12 = dm1.A05;
        DM1 dm13 = dm1.A06;
        DM1 dm14 = dm12.A05;
        DM1 dm15 = dm12.A06;
        dm1.A05 = dm15;
        if (dm15 != null) {
            dm15.A02 = dm1;
        }
        A02(dm1, dm12);
        dm12.A06 = dm1;
        dm1.A02 = dm12;
        int i3 = 0;
        if (dm13 != null) {
            i = dm13.A00;
        } else {
            i = 0;
        }
        if (dm15 != null) {
            i2 = dm15.A00;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        dm1.A00 = max;
        if (dm14 != null) {
            i3 = dm14.A00;
        }
        dm12.A00 = Math.max(max, i3) + 1;
    }

    private void A02(DM1 dm1, DM1 dm12) {
        DM1 dm13 = dm1.A02;
        dm1.A02 = null;
        if (dm12 != null) {
            dm12.A02 = dm13;
        }
        if (dm13 == null) {
            this.A00 = dm12;
        } else if (dm13.A05 == dm1) {
            dm13.A05 = dm12;
        } else {
            dm13.A06 = dm12;
        }
    }

    private void A03(DM1 dm1, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (dm1 != null) {
            DM1 dm12 = dm1.A05;
            DM1 dm13 = dm1.A06;
            int i5 = 0;
            if (dm12 != null) {
                i = dm12.A00;
            } else {
                i = 0;
            }
            if (dm13 != null) {
                i2 = dm13.A00;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                DM1 dm14 = dm13.A05;
                DM1 dm15 = dm13.A06;
                if (dm15 != null) {
                    i4 = dm15.A00;
                } else {
                    i4 = 0;
                }
                if (dm14 != null) {
                    i5 = dm14.A00;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    A00(dm1);
                } else {
                    A01(dm13);
                    A00(dm1);
                }
            } else if (i6 == 2) {
                DM1 dm16 = dm12.A05;
                DM1 dm17 = dm12.A06;
                if (dm17 != null) {
                    i3 = dm17.A00;
                } else {
                    i3 = 0;
                }
                if (dm16 != null) {
                    i5 = dm16.A00;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    A01(dm1);
                } else {
                    A00(dm12);
                    A01(dm1);
                }
            } else {
                if (i6 == 0) {
                    dm1.A00 = i + 1;
                    if (z) {
                        return;
                    }
                } else {
                    dm1.A00 = Math.max(i, i2) + 1;
                    if (!z) {
                        return;
                    }
                }
                dm1 = dm1.A02;
            }
            if (!z) {
                dm1 = dm1.A02;
            } else {
                return;
            }
        }
    }

    public final DM1 A04(Object obj, boolean z) {
        int i;
        DM1 dm1;
        DM1 dm12;
        Comparator comparator = this.A03;
        DM1 dm13 = this.A00;
        if (dm13 != null) {
            Comparable comparable = null;
            if (comparator == A07) {
                comparable = (Comparable) obj;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(dm13.A07);
                } else {
                    i = comparator.compare(obj, dm13.A07);
                }
                if (i != 0) {
                    if (i < 0) {
                        dm12 = dm13.A05;
                    } else {
                        dm12 = dm13.A06;
                    }
                    if (dm12 == null) {
                        break;
                    }
                    dm13 = dm12;
                } else {
                    return dm13;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        DM1 dm14 = this.A06;
        if (dm13 != null) {
            dm1 = new DM1(dm13, obj, dm14, dm14.A03);
            if (i < 0) {
                dm13.A05 = dm1;
            } else {
                dm13.A06 = dm1;
            }
            A03(dm13, true);
        } else if (comparator != A07 || (obj instanceof Comparable)) {
            dm1 = new DM1(dm13, obj, dm14, dm14.A03);
            this.A00 = dm1;
        } else {
            throw new ClassCastException(AnonymousClass000.A0E(obj.getClass().getName(), " is not Comparable"));
        }
        this.A02++;
        this.A01++;
        return dm1;
    }

    public final void A06(DM1 dm1, boolean z) {
        int i;
        if (z) {
            DM1 dm12 = dm1.A03;
            dm12.A01 = dm1.A01;
            dm1.A01.A03 = dm12;
        }
        DM1 dm13 = dm1.A05;
        DM1 dm14 = dm1.A06;
        DM1 dm15 = dm1.A02;
        int i2 = 0;
        if (dm13 == null || dm14 == null) {
            if (dm13 != null) {
                A02(dm1, dm13);
                dm1.A05 = null;
            } else if (dm14 != null) {
                A02(dm1, dm14);
                dm1.A06 = null;
            } else {
                A02(dm1, (DM1) null);
            }
            A03(dm15, false);
            this.A02--;
            this.A01++;
            return;
        }
        if (dm13.A00 > dm14.A00) {
            for (DM1 dm16 = dm13.A06; dm16 != null; dm16 = dm16.A06) {
                dm13 = dm16;
            }
            dm14 = dm13;
        } else {
            for (DM1 dm17 = dm14.A05; dm17 != null; dm17 = dm17.A05) {
                dm14 = dm17;
            }
        }
        A06(dm14, false);
        DM1 dm18 = dm1.A05;
        if (dm18 != null) {
            i = dm18.A00;
            dm14.A05 = dm18;
            dm18.A02 = dm14;
            dm1.A05 = null;
        } else {
            i = 0;
        }
        DM1 dm19 = dm1.A06;
        if (dm19 != null) {
            i2 = dm19.A00;
            dm14.A06 = dm19;
            dm19.A02 = dm14;
            dm1.A06 = null;
        }
        dm14.A00 = Math.max(i, i2) + 1;
        A02(dm1, dm14);
    }

    public final Set entrySet() {
        DM3 dm3 = this.A04;
        if (dm3 != null) {
            return dm3;
        }
        DM3 dm32 = new DM3(this);
        this.A04 = dm32;
        return dm32;
    }

    public final Set keySet() {
        DM2 dm2 = this.A05;
        if (dm2 != null) {
            return dm2;
        }
        DM2 dm22 = new DM2(this);
        this.A05 = dm22;
        return dm22;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            DM1 A042 = A04(obj, true);
            Object obj3 = A042.A04;
            A042.A04 = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r1 == false) goto L_0x0022;
     */
    public final DM1 A05(Map.Entry entry) {
        boolean z;
        boolean z2;
        Object key = entry.getKey();
        DM1 dm1 = null;
        if (key != null) {
            try {
                dm1 = A04(key, false);
            } catch (ClassCastException unused) {
            }
        }
        if (dm1 != null) {
            Object obj = dm1.A04;
            Object value = entry.getValue();
            if (obj == value || (obj != null && obj.equals(value))) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = true;
        }
        z = false;
        if (!z) {
            return null;
        }
        return dm1;
    }

    public final int size() {
        return this.A02;
    }
}
