package p000X;

/* renamed from: X.22i  reason: invalid class name and case insensitive filesystem */
public final class C471222i implements Runnable {
    public final /* synthetic */ C470422a A00;

    public C471222i(C470422a r1) {
        this.A00 = r1;
    }

    public final void run() {
        C470422a r3 = this.A00;
        synchronized (r3) {
            r3.A03();
            Integer num = Constants.ONE;
            C470422a.A00(r3, C50072Ev.A00(num));
            AnonymousClass0Z9.A03(r3.A05, new C50082Ex(r3, new AnonymousClass2Ew(num)), 1705216549);
        }
    }
}
