package p000X;

import java.util.List;

/* renamed from: X.22s  reason: invalid class name and case insensitive filesystem */
public final class C472222s implements Runnable {
    public final /* synthetic */ AnonymousClass22L A00;
    public final /* synthetic */ C28371Ll A01;
    public final /* synthetic */ List A02;

    public C472222s(C28371Ll r1, AnonymousClass22L r2, List list) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = list;
    }

    public final void run() {
        List<AnonymousClass1NG> AqQ = this.A00.AqQ(this.A02);
        synchronized (this.A01.A03) {
            for (AnonymousClass1NG r2 : AqQ) {
                this.A01.A04.remove(r2.A0X);
            }
        }
        this.A00.B4u(!AqQ.isEmpty());
    }
}
