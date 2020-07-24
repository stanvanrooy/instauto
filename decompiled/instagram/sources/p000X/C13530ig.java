package p000X;

import com.google.common.base.Strings;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.0ig  reason: invalid class name and case insensitive filesystem */
public final class C13530ig {
    public int A00 = -1;
    public int A01 = -1;
    public C13600ir A02;
    public MapMakerInternalMap.Strength A03;
    public MapMakerInternalMap.Strength A04;
    public boolean A05;

    public final ConcurrentMap A00() {
        if (!this.A05) {
            int i = this.A01;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.A00;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        MapMakerInternalMap.Strength strength = this.A03;
        MapMakerInternalMap.Strength strength2 = MapMakerInternalMap.Strength.A01;
        if (((MapMakerInternalMap.Strength) C13540ik.A01(strength, strength2)) == strength2 && ((MapMakerInternalMap.Strength) C13540ik.A01(this.A04, strength2)) == strength2) {
            return new MapMakerInternalMap(this, DOP.A00);
        }
        if (((MapMakerInternalMap.Strength) C13540ik.A01(strength, strength2)) == strength2 && ((MapMakerInternalMap.Strength) C13540ik.A01(this.A04, strength2)) == MapMakerInternalMap.Strength.A02) {
            return new MapMakerInternalMap(this, C13570io.A00);
        }
        MapMakerInternalMap.Strength strength3 = (MapMakerInternalMap.Strength) C13540ik.A01(strength, strength2);
        MapMakerInternalMap.Strength strength4 = MapMakerInternalMap.Strength.A02;
        if (strength3 == strength4 && ((MapMakerInternalMap.Strength) C13540ik.A01(this.A04, strength2)) == strength2) {
            return new MapMakerInternalMap(this, AnonymousClass36G.A00);
        }
        if (((MapMakerInternalMap.Strength) C13540ik.A01(strength, strength2)) == strength4 && ((MapMakerInternalMap.Strength) C13540ik.A01(this.A04, strength2)) == strength4) {
            return new MapMakerInternalMap(this, AnonymousClass21U.A00);
        }
        throw new AssertionError();
    }

    public final void A01(int i) {
        int i2 = this.A01;
        boolean z = true;
        boolean z2 = false;
        if (i2 == -1) {
            z2 = true;
        }
        if (z2) {
            if (i < 0) {
                z = false;
            }
            AnonymousClass0a4.A09(z);
            this.A01 = i;
            return;
        }
        throw new IllegalStateException(Strings.A00("initial capacity was already set to %s", Integer.valueOf(i2)));
    }

    public final void A02(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.A03;
        boolean z = false;
        if (strength2 == null) {
            z = true;
        }
        AnonymousClass0a4.A0F(z, "Key strength was already set to %s", strength2);
        AnonymousClass0a4.A06(strength);
        this.A03 = strength;
        if (strength != MapMakerInternalMap.Strength.A01) {
            this.A05 = true;
        }
    }

    public final void A03(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.A04;
        boolean z = false;
        if (strength2 == null) {
            z = true;
        }
        AnonymousClass0a4.A0F(z, "Value strength was already set to %s", strength2);
        AnonymousClass0a4.A06(strength);
        this.A04 = strength;
        if (strength != MapMakerInternalMap.Strength.A01) {
            this.A05 = true;
        }
    }

    public final String toString() {
        C197448cd A002 = C13540ik.A00(this);
        int i = this.A01;
        if (i != -1) {
            A002.A02("initialCapacity", i);
        }
        int i2 = this.A00;
        if (i2 != -1) {
            A002.A02("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.A03;
        if (strength != null) {
            C197448cd.A00(A002, "keyStrength", AnonymousClass7P3.A00(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.A04;
        if (strength2 != null) {
            C197448cd.A00(A002, "valueStrength", AnonymousClass7P3.A00(strength2.toString()));
        }
        if (this.A02 != null) {
            A002.A01("keyEquivalence");
        }
        return A002.toString();
    }
}
