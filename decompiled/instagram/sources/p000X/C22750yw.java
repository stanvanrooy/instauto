package p000X;

/* renamed from: X.0yw  reason: invalid class name and case insensitive filesystem */
public final class C22750yw implements Runnable {
    public final /* synthetic */ C22650ym A00;

    public C22750yw(C22650ym r1) {
        this.A00 = r1;
    }

    public final void run() {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01(AnonymousClass000.A0E(this.A00.A00.getName(), " onFinish"), 1666200241);
        }
        try {
            this.A00.A00.onFinish();
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-440501450);
            }
        }
    }
}
