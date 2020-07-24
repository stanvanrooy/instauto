package p000X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.0gM  reason: invalid class name and case insensitive filesystem */
public final class C12210gM implements AnonymousClass0gN {
    public static C12210gM A04;
    public boolean A00 = false;
    public final C12220gO A01;
    public final List A02 = new ArrayList();
    public final Queue A03 = new LinkedList();

    public static C12210gM A00() {
        C12210gM r0;
        synchronized (C12210gM.class) {
            if (A04 == null) {
                A04 = new C12210gM(C12220gO.A01);
            }
            r0 = A04;
        }
        return r0;
    }

    public static void A02(C12210gM r3) {
        synchronized (r3.A03) {
            while (!r3.A03.isEmpty()) {
                A01((AnonymousClass29A) r3.A03.remove(), C12590h0.A01);
            }
        }
    }

    public final void AlA(AnonymousClass29A r6) {
        if (this.A00) {
            Set set = C12590h0.A01;
            boolean z = !set.isEmpty();
            boolean z2 = false;
            if (this.A03.size() < 50) {
                z2 = true;
            }
            if (!z || z2) {
                synchronized (this.A03) {
                    this.A03.add(r6);
                }
            } else {
                A01(r6, set);
                A02(this);
            }
            if (r6.A04) {
                int i = r6.A00;
                if (i == 2 || i == 4) {
                    A01(r6, C12590h0.A02);
                }
            }
        }
    }

    public C12210gM(C12220gO r2) {
        this.A01 = r2;
    }

    public static void A01(AnonymousClass29A r2, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((AnonymousClass0gN) it.next()).AlA(r2);
        }
    }
}
