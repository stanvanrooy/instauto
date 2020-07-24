package p000X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0nG  reason: invalid class name and case insensitive filesystem */
public final class C15620nG extends C15190mU implements C14250k8 {
    public List A00;
    public final C14250k8 A01;
    public final ArrayList A02 = new ArrayList();

    public final synchronized void A00(C15690nN r2) {
        this.A02.add(r2);
    }

    public final synchronized void A01(C41881r5 r10, double d, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        double d2 = d;
        switch (r10.ordinal()) {
            case 1:
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    ((C15690nN) it.next()).At3(d2, j3, j4);
                }
                break;
            case 2:
                Iterator it2 = this.A02.iterator();
                while (it2.hasNext()) {
                    ((C15690nN) it2.next()).BcF(d);
                }
                break;
            default:
                Iterator it3 = this.A02.iterator();
                while (it3.hasNext()) {
                    ((C15690nN) it3.next()).At2(d2, j3, j4);
                }
                break;
        }
    }

    public final synchronized void onFailed(AnonymousClass1C4 r3, IOException iOException) {
        for (C15190mU onFailed : this.A00) {
            onFailed.onFailed(r3, iOException);
        }
    }

    public final synchronized void onNewData(AnonymousClass1C4 r3, C256019m r4, ByteBuffer byteBuffer) {
        for (C15190mU onNewData : this.A00) {
            onNewData.onNewData(r3, r4, byteBuffer);
        }
    }

    public final synchronized void onRequestCallbackDone(AnonymousClass1C4 r3, C256019m r4) {
        for (C15190mU onRequestCallbackDone : this.A00) {
            onRequestCallbackDone.onRequestCallbackDone(r3, r4);
        }
    }

    public final synchronized void onRequestUploadAttemptStart(AnonymousClass1C4 r3) {
        for (C15190mU onRequestUploadAttemptStart : this.A00) {
            onRequestUploadAttemptStart.onRequestUploadAttemptStart(r3);
        }
    }

    public final synchronized void onResponseStarted(AnonymousClass1C4 r3, C256019m r4, C33851db r5) {
        for (C15190mU onResponseStarted : this.A00) {
            onResponseStarted.onResponseStarted(r3, r4, r5);
        }
    }

    public final C26211Cc startRequest(AnonymousClass1C4 r3, C256019m r4, AnonymousClass1CB r5) {
        C15920nk r1 = r4.A05;
        if (r1 == C15920nk.Image || r1 == C15920nk.Video) {
            r5.A04(this);
        }
        return this.A01.startRequest(r3, r4, r5);
    }

    public C15620nG(C14250k8 r3) {
        this.A01 = r3;
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        arrayList.add(new C15650nJ());
        this.A00.add(new C15670nL(this));
    }
}
