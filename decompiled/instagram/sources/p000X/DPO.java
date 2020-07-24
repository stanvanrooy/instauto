package p000X;

import java.util.HashMap;

/* renamed from: X.DPO */
public final class DPO extends HashMap<String, String> {
    public final /* synthetic */ DP5 A00;

    public DPO(DP5 dp5) {
        this.A00 = dp5;
        put("capture_size", dp5.A01.A05.A00.toString());
    }
}
