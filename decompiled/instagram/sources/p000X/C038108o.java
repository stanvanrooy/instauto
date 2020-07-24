package p000X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.08o  reason: invalid class name and case insensitive filesystem */
public final class C038108o {
    public Context A00 = null;
    public File A01 = null;
    public String A02 = null;
    public Executor A03 = C038308q.A07;
    public final ArrayList A04 = new ArrayList();

    public final C038308q A00() {
        AnonymousClass0FY.A00(this.A01);
        for (int i = 0; i < this.A04.size(); i++) {
            C038208p r3 = (C038208p) this.A04.get(i);
            r3.A00 = new File(this.A01, r3.A01);
        }
        return new C038308q(this);
    }
}
