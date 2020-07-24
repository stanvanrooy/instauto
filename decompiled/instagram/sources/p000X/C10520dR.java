package p000X;

import java.util.concurrent.TimeoutException;

/* renamed from: X.0dR  reason: invalid class name and case insensitive filesystem */
public class C10520dR {
    public Throwable A00 = null;
    public final int A01;
    public final long A02;
    public final C07990Vf A03;
    public final AnonymousClass0W6 A04;
    public final String A05;
    public volatile AnonymousClass0U3 A06;
    public volatile C08080Vo A07;

    public void A00() {
        synchronized (this) {
            this.A00 = new TimeoutException();
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public void A01(Throwable th) {
        synchronized (this) {
            this.A00 = th;
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public String toString() {
        return "MqttOperation{mResponseType=" + this.A04 + ", mOperationId=" + this.A01 + ", mCreationTime=" + this.A02 + '}';
    }

    public C10520dR(C07990Vf r2, String str, AnonymousClass0W6 r4, int i, long j) {
        this.A03 = r2;
        this.A05 = str;
        this.A04 = r4;
        this.A01 = i;
        this.A02 = j;
    }
}
