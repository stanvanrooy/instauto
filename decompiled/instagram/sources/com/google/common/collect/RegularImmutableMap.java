package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p000X.AnonymousClass0a4;
import p000X.C14370kL;
import p000X.C14420kS;
import p000X.C239512q;

public final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap A02 = new RegularImmutableMap((int[]) null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient int A00;
    public final transient int[] A01;
    public final transient Object[] alternatingKeysAndValues;

    public class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient int A00;
        public final transient Object[] A01;
        public final transient ImmutableMap A02;

        public final boolean A0F() {
            return true;
        }

        public final ImmutableList A0J() {
            return new ImmutableList<Map.Entry<K, V>>() {
                public final boolean A0F() {
                    return true;
                }

                /* renamed from: A0N */
                public final Map.Entry get(int i) {
                    AnonymousClass0a4.A03(i, EntrySet.this.A00);
                    Object[] objArr = EntrySet.this.A01;
                    int i2 = i << 1;
                    return new AbstractMap.SimpleImmutableEntry(objArr[0 + i2], objArr[i2 + 1]);
                }

                public final int size() {
                    return EntrySet.this.A00;
                }
            };
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.A02.get(key))) {
                return false;
            }
            return true;
        }

        public final int size() {
            return this.A00;
        }

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i) {
            this.A02 = immutableMap;
            this.A01 = objArr;
            this.A00 = i;
        }

        public final int A0G(Object[] objArr, int i) {
            return A0H().A0G(objArr, i);
        }

        public final C239512q A0I() {
            return A0H().iterator();
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }
    }

    public final class KeySet<K> extends ImmutableSet<K> {
        public final transient ImmutableList A00;
        public final transient ImmutableMap A01;

        public final boolean A0F() {
            return true;
        }

        public final ImmutableList A0H() {
            return this.A00;
        }

        public final boolean contains(Object obj) {
            if (this.A01.get(obj) != null) {
                return true;
            }
            return false;
        }

        public final int size() {
            return this.A01.size();
        }

        public KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.A01 = immutableMap;
            this.A00 = immutableList;
        }

        public final int A0G(Object[] objArr, int i) {
            return A0H().A0G(objArr, i);
        }

        public final C239512q A0I() {
            return A0H().iterator();
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }
    }

    public final class KeysOrValuesAsList extends ImmutableList<Object> {
        public final transient int A00;
        public final transient int A01;
        public final transient Object[] A02;

        public final boolean A0F() {
            return true;
        }

        public final Object get(int i) {
            AnonymousClass0a4.A03(i, this.A01);
            return this.A02[(i << 1) + this.A00];
        }

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.A02 = objArr;
            this.A00 = i;
            this.A01 = i2;
        }

        public final int size() {
            return this.A01;
        }
    }

    public final boolean A07() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r9[r1] = r2;
        r3 = r3 + 1;
     */
    public static RegularImmutableMap A00(int i, Object[] objArr) {
        int[] iArr;
        if (i == 0) {
            return (RegularImmutableMap) A02;
        }
        if (i == 1) {
            C14370kL.A01(objArr[0], objArr[1]);
            return new RegularImmutableMap((int[]) null, objArr, 1);
        }
        AnonymousClass0a4.A04(i, objArr.length >> 1);
        int chooseTableSize = ImmutableSet.chooseTableSize(i);
        if (i == 1) {
            C14370kL.A01(objArr[0], objArr[1]);
            iArr = null;
        } else {
            int i2 = chooseTableSize - 1;
            iArr = new int[chooseTableSize];
            Arrays.fill(iArr, -1);
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 << 1;
                int i5 = i4 + 0;
                Object obj = objArr[i5];
                Object obj2 = objArr[i4 + 1];
                C14370kL.A01(obj, obj2);
                int A002 = C14420kS.A00(obj.hashCode());
                while (true) {
                    int i6 = A002 & i2;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        break;
                    } else if (!objArr[i7].equals(obj)) {
                        A002 = i6 + 1;
                    } else {
                        throw new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i7] + "=" + objArr[i7 ^ 1]);
                    }
                }
            }
        }
        return new RegularImmutableMap(iArr, objArr, i);
    }

    public final ImmutableCollection A03() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.A00);
    }

    public final ImmutableSet A05() {
        return new EntrySet(this, this.alternatingKeysAndValues, this.A00);
    }

    public final ImmutableSet A06() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.A00));
    }

    public final Object get(Object obj) {
        int[] iArr = this.A01;
        Object[] objArr = this.alternatingKeysAndValues;
        int i = this.A00;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return objArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int A002 = C14420kS.A00(obj.hashCode());
            while (true) {
                int i2 = A002 & length;
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return objArr[i3 ^ 1];
                }
                A002 = i2 + 1;
            }
        }
    }

    public final int size() {
        return this.A00;
    }

    public RegularImmutableMap(int[] iArr, Object[] objArr, int i) {
        this.A01 = iArr;
        this.alternatingKeysAndValues = objArr;
        this.A00 = i;
    }
}
