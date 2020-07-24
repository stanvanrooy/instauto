package p000X;

import com.facebook.profilo.ipc.TraceContext;
import java.util.TreeMap;

/* renamed from: X.0Gf  reason: invalid class name and case insensitive filesystem */
public final class C04820Gf {
    public C04810Ge A00;
    public boolean A01;

    public C04820Gf(TraceContext traceContext) {
        int[] iArr;
        TreeMap treeMap = traceContext.A07.A01;
        if (treeMap == null) {
            iArr = null;
        } else {
            iArr = (int[]) treeMap.get("trace_config.duration_condition");
        }
        if (iArr != null && iArr.length > 0) {
            this.A00 = new C04810Ge(iArr);
            this.A01 = true;
        }
    }
}
