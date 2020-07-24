package p000X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CFM */
public final class CFM {
    public Integer A00;
    public List A01;

    public final Map A00() {
        HashMap hashMap = new HashMap();
        for (C27515CGf cGf : this.A01) {
            hashMap.put(Integer.valueOf(cGf.A01), Integer.valueOf(cGf.A00));
        }
        return hashMap;
    }
}
