package com.google.common.collect;

import com.facebook.common.dextricks.DexStore;
import com.google.common.base.Strings;
import com.google.common.collect.MapMakerInternalMap.Segment;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass17K;
import p000X.AnonymousClass36N;
import p000X.B30;
import p000X.C13530ig;
import p000X.C13540ik;
import p000X.C13550im;
import p000X.C13560in;
import p000X.C13580ip;
import p000X.C13600ir;
import p000X.C13620ix;
import p000X.C13650j0;
import p000X.C25900Bbo;
import p000X.C25901Bbp;
import p000X.C25902Bbq;
import p000X.C25913Bc3;

public class MapMakerInternalMap<K, V, E extends C13620ix<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final C13560in A07 = new C13550im();
    public static final long serialVersionUID = 5;
    public transient Collection A00;
    public transient Set A01;
    public transient Set A02;
    public final transient int A03;
    public final transient int A04;
    public final transient Segment[] A05;
    public final transient C13580ip A06;
    public final int concurrencyLevel;
    public final C13600ir keyEquivalence;

    public abstract class Segment extends ReentrantLock {
        public volatile int count;
        public final MapMakerInternalMap map;
        public final int maxSegmentSize;
        public int modCount;
        public final AtomicInteger readCount = new AtomicInteger();
        public volatile AtomicReferenceArray table;
        public int threshold;

        public void A03() {
        }

        public void A04() {
        }

        /* JADX INFO: finally extract failed */
        public final void A09(ReferenceQueue referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    C13620ix r7 = (C13620ix) poll;
                    MapMakerInternalMap mapMakerInternalMap = this.map;
                    int AMk = r7.AMk();
                    Segment A02 = mapMakerInternalMap.A02(AMk);
                    A02.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = A02.table;
                        int length = AMk & (atomicReferenceArray.length() - 1);
                        C13620ix r2 = (C13620ix) atomicReferenceArray.get(length);
                        C13620ix r1 = r2;
                        while (true) {
                            if (r1 == null) {
                                break;
                            } else if (r1 == r7) {
                                A02.modCount++;
                                atomicReferenceArray.set(length, A02.A00(r2, r1));
                                A02.count--;
                                break;
                            } else {
                                r1 = r1.AQm();
                            }
                        }
                        A02.unlock();
                        i++;
                    } catch (Throwable th) {
                        A02.unlock();
                        throw th;
                    }
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* JADX INFO: finally extract failed */
        public final void A0A(ReferenceQueue referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    C13560in r9 = (C13560in) poll;
                    MapMakerInternalMap mapMakerInternalMap = this.map;
                    C13620ix ALD = r9.ALD();
                    int AMk = ALD.AMk();
                    Segment A02 = mapMakerInternalMap.A02(AMk);
                    Object key = ALD.getKey();
                    A02.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = A02.table;
                        int length = (atomicReferenceArray.length() - 1) & AMk;
                        C13620ix r7 = (C13620ix) atomicReferenceArray.get(length);
                        C13620ix r2 = r7;
                        while (true) {
                            if (r2 == null) {
                                break;
                            }
                            Object key2 = r2.getKey();
                            if (r2.AMk() != AMk || key2 == null || !A02.map.keyEquivalence.A01(key, key2)) {
                                r2 = r2.AQm();
                            } else if (((C13650j0) r2).AZr() == r9) {
                                A02.modCount++;
                                atomicReferenceArray.set(length, A02.A00(r7, r2));
                                A02.count--;
                            }
                        }
                        A02.unlock();
                        i++;
                    } catch (Throwable th) {
                        A02.unlock();
                        throw th;
                    }
                } else {
                    return;
                }
            } while (i != 16);
        }

        public final C13620ix A00(C13620ix r4, C13620ix r5) {
            int i = this.count;
            C13620ix AQm = r5.AQm();
            while (r4 != r5) {
                C13620ix A9t = this.map.A06.A9t(this, r4, AQm);
                if (A9t != null) {
                    AQm = A9t;
                } else {
                    i--;
                }
                r4 = r4.AQm();
            }
            this.count = i;
            return AQm;
        }

        public final C13620ix A01(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.table;
            for (C13620ix r2 = (C13620ix) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); r2 != null; r2 = r2.AQm()) {
                if (r2.AMk() == i) {
                    Object key = r2.getKey();
                    if (key == null) {
                        A07();
                    } else if (this.map.keyEquivalence.A01(obj, key)) {
                        return r2;
                    }
                }
            }
            return null;
        }

        public final void A05() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                A06();
            }
        }

        public final void A08(C13620ix r2, Object obj) {
            this.map.A06.Blc(this, r2, obj);
        }

        /* JADX INFO: finally extract failed */
        public boolean containsValue(Object obj) {
            Object obj2;
            try {
                if (this.count != 0) {
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        C13620ix r2 = (C13620ix) atomicReferenceArray.get(i);
                        while (r2 != null) {
                            if (r2.getKey() == null || (obj2 = r2.getValue()) == null) {
                                A07();
                                obj2 = null;
                            }
                            if (obj2 == null || !this.map.valueEquivalence().A01(obj, obj2)) {
                                r2 = r2.AQm();
                            } else {
                                A05();
                                return true;
                            }
                        }
                    }
                }
                A05();
                return false;
            } catch (Throwable th) {
                A05();
                throw th;
            }
        }

        public Segment(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
            this.map = mapMakerInternalMap;
            this.maxSegmentSize = i2;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
            int length = (atomicReferenceArray.length() * 3) >> 2;
            this.threshold = length;
            if (length == this.maxSegmentSize) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r12.modCount++;
            r0 = r12.map.A06.Apo(r12, r13, r14, r5);
            A08(r0, r15);
            r3.set(r1, r0);
            r12.count = r4;
         */
        public final Object A02(Object obj, int i, Object obj2, boolean z) {
            lock();
            try {
                A06();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    if (length < 1073741824) {
                        int i3 = this.count;
                        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
                        this.threshold = (atomicReferenceArray2.length() * 3) >> 2;
                        int length2 = atomicReferenceArray2.length() - 1;
                        for (int i4 = 0; i4 < length; i4++) {
                            C13620ix r4 = (C13620ix) atomicReferenceArray.get(i4);
                            if (r4 != null) {
                                C13620ix AQm = r4.AQm();
                                int AMk = r4.AMk() & length2;
                                if (AQm == null) {
                                    atomicReferenceArray2.set(AMk, r4);
                                } else {
                                    C13620ix r3 = r4;
                                    while (AQm != null) {
                                        int AMk2 = AQm.AMk() & length2;
                                        if (AMk2 != AMk) {
                                            r3 = AQm;
                                            AMk = AMk2;
                                        }
                                        AQm = AQm.AQm();
                                    }
                                    atomicReferenceArray2.set(AMk, r3);
                                    while (r4 != r3) {
                                        int AMk3 = r4.AMk() & length2;
                                        C13620ix A9t = this.map.A06.A9t(this, r4, (C13620ix) atomicReferenceArray2.get(AMk3));
                                        if (A9t != null) {
                                            atomicReferenceArray2.set(AMk3, A9t);
                                        } else {
                                            i3--;
                                        }
                                        r4 = r4.AQm();
                                    }
                                }
                            }
                        }
                        this.table = atomicReferenceArray2;
                        this.count = i3;
                    }
                    i2 = this.count + 1;
                }
                AtomicReferenceArray atomicReferenceArray3 = this.table;
                int length3 = (atomicReferenceArray3.length() - 1) & i;
                C13620ix r5 = (C13620ix) atomicReferenceArray3.get(length3);
                C13620ix r2 = r5;
                while (true) {
                    if (r2 == null) {
                        break;
                    }
                    Object key = r2.getKey();
                    if (r2.AMk() != i || key == null || !this.map.keyEquivalence.A01(obj, key)) {
                        r2 = r2.AQm();
                    } else {
                        Object value = r2.getValue();
                        if (value == null) {
                            this.modCount++;
                            A08(r2, obj2);
                            this.count = this.count;
                        } else {
                            if (!z) {
                                this.modCount++;
                                A08(r2, obj2);
                            }
                            unlock();
                            return value;
                        }
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public final void A06() {
            if (tryLock()) {
                try {
                    A03();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public final void A07() {
            if (tryLock()) {
                try {
                    A03();
                } finally {
                    unlock();
                }
            }
        }
    }

    public enum Strength {
        ;

        public abstract C13600ir A00();
    }

    public final class StrongKeyWeakValueSegment extends Segment {
        public final ReferenceQueue queueForValues = new ReferenceQueue();

        public final void A03() {
            A0A(this.queueForValues);
        }

        public final void A04() {
            do {
            } while (this.queueForValues.poll() != null);
        }

        public StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }
    }

    public final class WeakKeyStrongValueSegment extends Segment {
        public final ReferenceQueue queueForKeys = new ReferenceQueue();

        public final void A03() {
            A09(this.queueForKeys);
        }

        public final void A04() {
            do {
            } while (this.queueForKeys.poll() != null);
        }

        public WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }
    }

    public final class WeakKeyWeakValueSegment extends Segment {
        public final ReferenceQueue queueForKeys = new ReferenceQueue();
        public final ReferenceQueue queueForValues = new ReferenceQueue();

        public final void A03() {
            A09(this.queueForKeys);
            A0A(this.queueForValues);
        }

        public final void A04() {
            do {
            } while (this.queueForKeys.poll() != null);
        }

        public WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }
    }

    public final boolean containsValue(Object obj) {
        Object value;
        if (obj == null) {
            return false;
        }
        Segment[] segmentArr = this.A05;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (Segment segment : segmentArr) {
                AtomicReferenceArray atomicReferenceArray = segment.table;
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    for (C13620ix r2 = (C13620ix) atomicReferenceArray.get(i2); r2 != null; r2 = r2.AQm()) {
                        Object obj2 = null;
                        if (r2.getKey() == null || (value = r2.getValue()) == null) {
                            segment.A07();
                        } else {
                            obj2 = value;
                        }
                        if (obj2 != null && valueEquivalence().A01(obj, obj2)) {
                            return true;
                        }
                    }
                }
                j2 += (long) segment.modCount;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    public abstract class AbstractSerializationProxy<K, V> extends B30<K, V> implements Serializable {
        public static final long serialVersionUID = 3;
        public transient ConcurrentMap A00;
        public final int concurrencyLevel;
        public final C13600ir keyEquivalence;
        public final Strength keyStrength;
        public final C13600ir valueEquivalence;
        public final Strength valueStrength;

        public AbstractSerializationProxy(Strength strength, Strength strength2, C13600ir r3, C13600ir r4, int i, ConcurrentMap concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = r3;
            this.valueEquivalence = r4;
            this.concurrencyLevel = i;
            this.A00 = concurrentMap;
        }
    }

    public final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        public static final long serialVersionUID = 3;

        public SerializationProxy(Strength strength, Strength strength2, C13600ir r3, C13600ir r4, int i, ConcurrentMap concurrentMap) {
            super(strength, strength2, r3, r4, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            int readInt = objectInputStream.readInt();
            C13530ig r8 = new C13530ig();
            r8.A01(readInt);
            r8.A02(this.keyStrength);
            r8.A03(this.valueStrength);
            C13600ir r3 = this.keyEquivalence;
            C13600ir r2 = r8.A02;
            boolean z = false;
            if (r2 == null) {
                z = true;
            }
            AnonymousClass0a4.A0F(z, "key equivalence was already set to %s", r2);
            AnonymousClass0a4.A06(r3);
            r8.A02 = r3;
            r8.A05 = true;
            int i = this.concurrencyLevel;
            int i2 = r8.A00;
            boolean z2 = true;
            boolean z3 = false;
            if (i2 == -1) {
                z3 = true;
            }
            if (z3) {
                if (i <= 0) {
                    z2 = false;
                }
                AnonymousClass0a4.A09(z2);
                r8.A00 = i;
                this.A00 = r8.A00();
                while (true) {
                    Object readObject = objectInputStream.readObject();
                    if (readObject != null) {
                        this.A00.put(readObject, objectInputStream.readObject());
                    } else {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(Strings.A00("concurrency level was already set to %s", Integer.valueOf(i2)));
            }
        }

        private Object readResolve() {
            return this.A00;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.A00.size());
            for (Map.Entry entry : this.A00.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject((Object) null);
        }
    }

    public static ArrayList A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        AnonymousClass17K.A01(arrayList, collection.iterator());
        return arrayList;
    }

    public final int A01(Object obj) {
        int A002;
        C13600ir r0 = this.keyEquivalence;
        if (obj == null) {
            A002 = 0;
        } else {
            A002 = r0.A00(obj);
        }
        int i = A002 + ((A002 << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public final Segment A02(int i) {
        return this.A05[(i >>> this.A04) & this.A03];
    }

    public final void clear() {
        Segment[] segmentArr = this.A05;
        int length = segmentArr.length;
        for (int i = 0; i < length; i++) {
            Segment segment = segmentArr[i];
            if (segment.count != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segment.table;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, (Object) null);
                    }
                    segment.A04();
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                } finally {
                    segment.unlock();
                }
            }
        }
    }

    public final boolean containsKey(Object obj) {
        C13620ix A012;
        if (obj == null) {
            return false;
        }
        int A013 = A01(obj);
        Segment A022 = A02(A013);
        try {
            boolean z = false;
            if (!(A022.count == 0 || (A012 = A022.A01(obj, A013)) == null || A012.getValue() == null)) {
                z = true;
            }
            return z;
        } finally {
            A022.A05();
        }
    }

    public final Set entrySet() {
        Set set = this.A01;
        if (set != null) {
            return set;
        }
        C25902Bbq bbq = new C25902Bbq(this);
        this.A01 = bbq;
        return bbq;
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int A012 = A01(obj);
        Segment A022 = A02(A012);
        try {
            C13620ix A013 = A022.A01(obj, A012);
            if (A013 == null) {
                return null;
            }
            Object value = A013.getValue();
            if (value == null) {
                A022.A07();
            }
            A022.A05();
            return value;
        } finally {
            A022.A05();
        }
    }

    public final boolean isEmpty() {
        Segment[] segmentArr = this.A05;
        long j = 0;
        int i = 0;
        while (true) {
            int length = segmentArr.length;
            if (i < length) {
                if (segmentArr[i].count != 0) {
                    break;
                }
                j += (long) segmentArr[i].modCount;
                i++;
            } else if (j == 0) {
                return true;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (segmentArr[i2].count != 0) {
                            break;
                        }
                        j -= (long) segmentArr[i2].modCount;
                        i2++;
                    } else if (j != 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final Set keySet() {
        Set set = this.A02;
        if (set != null) {
            return set;
        }
        C25901Bbp bbp = new C25901Bbp(this);
        this.A02 = bbp;
        return bbp;
    }

    public Strength keyStrength() {
        return this.A06.AiX();
    }

    public final int size() {
        Segment[] segmentArr = this.A05;
        long j = 0;
        for (Segment segment : segmentArr) {
            j += (long) segment.count;
        }
        return AnonymousClass36N.A00(j);
    }

    public C13600ir valueEquivalence() {
        return this.A06.Btj().A00();
    }

    public Strength valueStrength() {
        return this.A06.Btj();
    }

    public final Collection values() {
        Collection collection = this.A00;
        if (collection != null) {
            return collection;
        }
        C25900Bbo bbo = new C25900Bbo(this);
        this.A00 = bbo;
        return bbo;
    }

    public Object writeReplace() {
        C13580ip r0 = this.A06;
        Strength AiX = r0.AiX();
        Strength Btj = r0.Btj();
        return new SerializationProxy(AiX, Btj, this.keyEquivalence, Btj.A00(), this.concurrencyLevel, this);
    }

    public MapMakerInternalMap(C13530ig r7, C13580ip r8) {
        int i = r7.A00;
        int min = Math.min(i == -1 ? 4 : i, DexStore.LOAD_RESULT_PGO_ATTEMPTED);
        this.concurrencyLevel = min;
        this.keyEquivalence = (C13600ir) C13540ik.A01(r7.A02, ((Strength) C13540ik.A01(r7.A03, Strength.A01)).A00());
        this.A06 = r8;
        int i2 = r7.A01;
        int min2 = Math.min(i2 == -1 ? 16 : i2, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 < min) {
            i6++;
            i5 <<= 1;
        }
        this.A04 = 32 - i6;
        this.A03 = i5 - 1;
        this.A05 = new Segment[i5];
        int i7 = min2 / i5;
        while (i4 < (i5 * i7 < min2 ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.A05;
            if (i3 < segmentArr.length) {
                segmentArr[i3] = this.A06.Apt(this, i4, -1);
                i3++;
            } else {
                return;
            }
        }
    }

    public C13620ix copyEntry(C13620ix r3, C13620ix r4) {
        Segment A022 = A02(r3.AMk());
        return A022.map.A06.A9t(A022, r3, r4);
    }

    public boolean isLiveForTesting(C13620ix r4) {
        Object value;
        Segment A022 = A02(r4.AMk());
        Object obj = null;
        if (r4.getKey() == null || (value = r4.getValue()) == null) {
            A022.A07();
        } else {
            obj = value;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        AnonymousClass0a4.A06(obj);
        AnonymousClass0a4.A06(obj2);
        int A012 = A01(obj);
        return A02(A012).A02(obj, A012, obj2, false);
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        AnonymousClass0a4.A06(obj);
        AnonymousClass0a4.A06(obj2);
        int A012 = A01(obj);
        return A02(A012).A02(obj, A012, obj2, true);
    }

    public final class StrongKeyStrongValueSegment extends Segment {
        public StrongKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r0 != false) goto L_0x0051;
     */
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int A012 = A01(obj);
        Segment A022 = A02(A012);
        A022.lock();
        try {
            A022.A06();
            AtomicReferenceArray atomicReferenceArray = A022.table;
            int length = (atomicReferenceArray.length() - 1) & A012;
            C13620ix r7 = (C13620ix) atomicReferenceArray.get(length);
            C13620ix r6 = r7;
            while (true) {
                if (r6 == null) {
                    break;
                }
                Object key = r6.getKey();
                if (r6.AMk() != A012 || key == null || !A022.map.keyEquivalence.A01(obj, key)) {
                    r6 = r6.AQm();
                } else {
                    Object value = r6.getValue();
                    if (value == null) {
                        boolean z = false;
                        if (r6.getValue() == null) {
                            z = true;
                        }
                    }
                    A022.modCount++;
                    atomicReferenceArray.set(length, A022.A00(r7, r6));
                    A022.count--;
                    return value;
                }
            }
            A022.unlock();
            return null;
        } finally {
            A022.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r0 != false) goto L_0x005d;
     */
    public final boolean remove(Object obj, Object obj2) {
        boolean z;
        if (obj == null || obj2 == null) {
            return false;
        }
        int A012 = A01(obj);
        Segment A022 = A02(A012);
        A022.lock();
        try {
            A022.A06();
            AtomicReferenceArray atomicReferenceArray = A022.table;
            int length = (atomicReferenceArray.length() - 1) & A012;
            C13620ix r6 = (C13620ix) atomicReferenceArray.get(length);
            C13620ix r5 = r6;
            while (true) {
                z = false;
                if (r5 == null) {
                    break;
                }
                Object key = r5.getKey();
                if (r5.AMk() != A012 || key == null || !A022.map.keyEquivalence.A01(obj, key)) {
                    r5 = r5.AQm();
                } else {
                    if (A022.map.valueEquivalence().A01(obj2, r5.getValue())) {
                        z = true;
                    } else {
                        boolean z2 = false;
                        if (r5.getValue() == null) {
                            z2 = true;
                        }
                    }
                    A022.modCount++;
                    atomicReferenceArray.set(length, A022.A00(r6, r5));
                    A022.count--;
                }
            }
            return z;
        } finally {
            A022.unlock();
        }
    }

    public final Object replace(Object obj, Object obj2) {
        AnonymousClass0a4.A06(obj);
        AnonymousClass0a4.A06(obj2);
        int A012 = A01(obj);
        Segment A022 = A02(A012);
        A022.lock();
        try {
            A022.A06();
            AtomicReferenceArray atomicReferenceArray = A022.table;
            int length = (atomicReferenceArray.length() - 1) & A012;
            C13620ix r6 = (C13620ix) atomicReferenceArray.get(length);
            C13620ix r5 = r6;
            while (true) {
                if (r5 == null) {
                    break;
                }
                Object key = r5.getKey();
                if (r5.AMk() != A012 || key == null || !A022.map.keyEquivalence.A01(obj, key)) {
                    r5 = r5.AQm();
                } else {
                    Object value = r5.getValue();
                    if (value == null) {
                        boolean z = false;
                        if (r5.getValue() == null) {
                            z = true;
                        }
                        if (z) {
                            A022.modCount++;
                            atomicReferenceArray.set(length, A022.A00(r6, r5));
                            A022.count--;
                        }
                    } else {
                        A022.modCount++;
                        A022.A08(r5, obj2);
                        A022.unlock();
                        return value;
                    }
                }
            }
            return null;
        } finally {
            A022.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        AnonymousClass0a4.A06(obj);
        AnonymousClass0a4.A06(obj3);
        if (obj2 == null) {
            return false;
        }
        int A012 = A01(obj);
        Segment A022 = A02(A012);
        A022.lock();
        try {
            A022.A06();
            AtomicReferenceArray atomicReferenceArray = A022.table;
            int length = (atomicReferenceArray.length() - 1) & A012;
            C13620ix r6 = (C13620ix) atomicReferenceArray.get(length);
            C13620ix r3 = r6;
            while (true) {
                if (r3 == null) {
                    break;
                }
                Object key = r3.getKey();
                if (r3.AMk() != A012 || key == null || !A022.map.keyEquivalence.A01(obj, key)) {
                    r3 = r3.AQm();
                } else {
                    Object value = r3.getValue();
                    if (value == null) {
                        boolean z = false;
                        if (r3.getValue() == null) {
                            z = true;
                        }
                        if (z) {
                            A022.modCount++;
                            atomicReferenceArray.set(length, A022.A00(r6, r3));
                            A022.count--;
                        }
                    } else if (A022.map.valueEquivalence().A01(obj2, value)) {
                        A022.modCount++;
                        A022.A08(r3, obj3);
                        A022.unlock();
                        return true;
                    }
                }
            }
            A022.unlock();
            return false;
        } catch (Throwable th) {
            A022.unlock();
            throw th;
        }
    }
}
