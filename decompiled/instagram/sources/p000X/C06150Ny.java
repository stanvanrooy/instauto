package p000X;

import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: X.0Ny  reason: invalid class name and case insensitive filesystem */
public final class C06150Ny implements Runnable {
    public final /* synthetic */ C06140Nx A00;

    public C06150Ny(C06140Nx r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass0O9 r4;
        try {
            Thread.sleep(this.A00.A00);
            C06140Nx r5 = this.A00;
            if (!r5.A05) {
                r5.A04 = true;
                StringBuilder sb = new StringBuilder();
                for (AnonymousClass0O9 r1 : ((C05610Lg) C05700Lp.A00()).A04) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(r1.mRunnableId);
                }
                String sb2 = sb.toString();
                r5.A02 = sb2;
                AnonymousClass0KV r3 = r5.A01;
                if (r3 != null) {
                    C05700Lp.A00().ADc(new AnonymousClass0KX(r3, sb2, ""));
                }
                List list = ((C05610Lg) C05700Lp.A00()).A04;
                PriorityBlockingQueue priorityBlockingQueue = ((C05610Lg) C05700Lp.A00()).A0A;
                while (!this.A00.A05) {
                    if (!list.isEmpty() && (r4 = (AnonymousClass0O9) list.remove(0)) != null) {
                        priorityBlockingQueue.add(r4);
                        C06140Nx r32 = this.A00;
                        String str = r32.A03;
                        if (str == null || str.isEmpty()) {
                            r32.A03 = Integer.toString(r4.mRunnableId);
                        } else {
                            r32.A03 = AnonymousClass000.A0G(str, ",", r4.mRunnableId);
                        }
                    }
                    Thread.sleep(50);
                }
            }
        } catch (InterruptedException e) {
            AnonymousClass0QD.A0A("StuckStartupDetector", e);
        }
    }
}
