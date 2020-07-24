package p000X;

import com.facebook.common.dextricks.DexStore;

/* renamed from: X.08z  reason: invalid class name and case insensitive filesystem */
public final class C039108z implements C026503j {
    public final int A00;

    private boolean A00(int i) {
        if ((i & this.A00) != 0) {
            return true;
        }
        return false;
    }

    public final boolean BmV(int i, int i2, AnonymousClass04W r5) {
        if (A00(DexStore.LOAD_RESULT_PGO_ATTEMPTED) && i2 == 0 && i != 0) {
            return true;
        }
        if (A00(DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) && i2 != 0 && i == 0) {
            return true;
        }
        if (A00(1024) && r5 == AnonymousClass04W.ACTIVITY_CREATED) {
            return true;
        }
        if (A00(2048) && r5 == AnonymousClass04W.ACTIVITY_STARTED) {
            return true;
        }
        if (A00(4096) && r5 == AnonymousClass04W.ACTIVITY_RESUMED) {
            return true;
        }
        if (A00(8192) && r5 == AnonymousClass04W.ACTIVITY_PAUSED) {
            return true;
        }
        if (A00(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) && r5 == AnonymousClass04W.ACTIVITY_STOPPED) {
            return true;
        }
        if (!A00(DexStore.LOAD_RESULT_PGO) || r5 != AnonymousClass04W.ACTIVITY_DESTROYED) {
            return false;
        }
        return true;
    }

    public final boolean Bms(int i, int i2, AnonymousClass04W r5) {
        if (A00(64) && i2 == 0 && i != 0) {
            return true;
        }
        if (A00(128) && i2 != 0 && i == 0) {
            return true;
        }
        if (A00(1) && r5 == AnonymousClass04W.ACTIVITY_CREATED) {
            return true;
        }
        if (A00(2) && r5 == AnonymousClass04W.ACTIVITY_STARTED) {
            return true;
        }
        if (A00(4) && r5 == AnonymousClass04W.ACTIVITY_RESUMED) {
            return true;
        }
        if (A00(8) && r5 == AnonymousClass04W.ACTIVITY_PAUSED) {
            return true;
        }
        if (A00(16) && r5 == AnonymousClass04W.ACTIVITY_STOPPED) {
            return true;
        }
        if (!A00(32) || r5 != AnonymousClass04W.ACTIVITY_DESTROYED) {
            return false;
        }
        return true;
    }

    public C039108z(int i) {
        this.A00 = i;
    }
}
