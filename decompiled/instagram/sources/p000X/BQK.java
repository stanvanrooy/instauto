package p000X;

import com.facebook.common.dextricks.DexStore;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BQK */
public enum BQK {
    BENIGN_IGNORE(0),
    SUSPICIOUS(1024),
    PARANOID(2048),
    RANDOM_SAMPLE(4096),
    BENIGN(DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED),
    EMPLOYEES(DexStore.LOAD_RESULT_WITH_VDEX_ODEX);
    
    public static final Map A01 = null;
    public int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (BQK bqk : values()) {
            A01.put(Integer.valueOf(bqk.A00), bqk);
        }
    }

    /* access modifiers changed from: public */
    BQK(int i) {
        this.A00 = i;
    }
}
