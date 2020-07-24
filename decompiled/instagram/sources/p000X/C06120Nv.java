package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Nv  reason: invalid class name and case insensitive filesystem */
public final class C06120Nv {
    public static C06120Nv A04;
    public int A00;
    public boolean A01;
    public final List A02 = Collections.synchronizedList(new ArrayList());
    public final Map A03 = new HashMap();

    public static C06120Nv A00() {
        if (A04 == null) {
            synchronized (C06120Nv.class) {
                if (A04 == null) {
                    A04 = new C06120Nv();
                }
            }
        }
        return A04;
    }

    public C06120Nv() {
        if (this.A01) {
            Thread thread = new Thread(new C06130Nw(this));
            thread.setName("IgExecutorMonitor");
            thread.start();
        }
    }
}
