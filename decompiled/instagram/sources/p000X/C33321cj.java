package p000X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1cj  reason: invalid class name and case insensitive filesystem */
public final class C33321cj extends C15190mU implements Runnable {
    public C26211Cc A00 = null;
    public C33301ch A01;
    public Integer A02 = null;
    public boolean A03;
    public AnonymousClass1CB A04;
    public AnonymousClass0O9 A05;
    public final AnonymousClass1C4 A06;
    public final C256019m A07;
    public final AnonymousClass1CB A08;
    public final String A09;
    public final AtomicInteger A0A;
    public final /* synthetic */ C16480of A0B;

    public final void onRequestCallbackDone(AnonymousClass1C4 r1, C256019m r2) {
    }

    public C33321cj(C16480of r4, AnonymousClass1C4 r5, C256019m r6, AnonymousClass1CB r7) {
        this.A0B = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = r7;
        this.A0A = new AtomicInteger(0);
        this.A04 = new AnonymousClass1CB(r6, (AnonymousClass12F) null);
        this.A09 = AnonymousClass000.A0G(this.A07.A03, "-copy", r5.hashCode());
    }

    public final void onFailed(AnonymousClass1C4 r3, IOException iOException) {
        if (this.A0A.get() == 2) {
            this.A08.A02(r3, iOException);
        } else if (this.A0A.get() == 0) {
            AnonymousClass0O9 r1 = this.A05;
            if (r1 != null) {
                this.A0B.A03.A02(r1);
            }
            this.A0B.A02.ADc(new C33771dT(this));
        }
    }

    public final void onNewData(AnonymousClass1C4 r3, C256019m r4, ByteBuffer byteBuffer) {
        if (this.A0A.get() == 2) {
            this.A08.A03(r3, byteBuffer);
        }
    }

    public final void onResponseStarted(AnonymousClass1C4 r4, C256019m r5, C33851db r6) {
        if (this.A0A.compareAndSet(0, 2)) {
            this.A08.A01(r4, r6);
        }
    }

    public final void onSucceeded(AnonymousClass1C4 r3) {
        if (this.A0A.get() == 2) {
            this.A08.A00(r3);
        }
    }

    public final void run() {
        C33301ch copyEntry = C15180mT.A05.copyEntry(this.A07.A03, this.A09);
        this.A01 = copyEntry;
        C256019m r1 = this.A07;
        switch (r1.A07.intValue()) {
            case 0:
            case 1:
                throw new IllegalStateException("Not Supported cached policy");
            case 2:
                if (copyEntry != null) {
                    this.A0B.A02.ADc(new C33771dT(this));
                    return;
                } else {
                    this.A08.A02(this.A06, new IOException("no content"));
                    return;
                }
            case 3:
                if (copyEntry != null) {
                    AnonymousClass242 r3 = new AnonymousClass242(this);
                    this.A05 = r3;
                    this.A0B.A03.A01(r3, r1.A00);
                }
                this.A04.A04(this);
                C15180mT.A05.A01(this.A04, this.A06, this.A07.A03);
                C26211Cc startRequest = this.A0B.A01.startRequest(this.A06, this.A07, this.A04);
                this.A00 = startRequest;
                Integer num = this.A02;
                if (num != null) {
                    startRequest.BsT(num);
                }
                if (this.A03) {
                    this.A00.cancel();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
