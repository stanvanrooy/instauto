package p000X;

import java.util.Iterator;

/* renamed from: X.0Px  reason: invalid class name and case insensitive filesystem */
public final class C06660Px implements Runnable {
    public final /* synthetic */ C05850Mk A00;

    public C06660Px(C05850Mk r1) {
        this.A00 = r1;
    }

    public final void run() {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("notifyAppForegrounded", -650327673);
        }
        try {
            Iterator it = this.A00.A05.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0Q6) it.next()).onAppForegrounded();
            }
            Iterator it2 = this.A00.A04.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass0Q6) it2.next()).onAppForegrounded();
            }
        } finally {
            C05850Mk.A00(this.A00, "postforeground");
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(1012400520);
            }
        }
    }
}
