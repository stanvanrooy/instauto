package p000X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.facebook.forker.Process;
import java.util.List;

/* renamed from: X.1bv  reason: invalid class name and case insensitive filesystem */
public final class C32831bv implements Runnable {
    public final /* synthetic */ int A00 = 100;
    public final /* synthetic */ C32821bu A01;

    public C32831bv(C32821bu r2) {
        this.A01 = r2;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        C32821bu r8 = this.A01;
        if (r8.A00) {
            long now = r8.A04.now();
            int A03 = AnonymousClass0Z0.A03(1585838814);
            r8.A05.A00(r8.A09);
            r8.A07.A06(now, r8.A09);
            AnonymousClass11J.A03(r8.A0A.isEmpty());
            C32811bt r0 = r8.A06;
            List list = r8.A0A;
            for (View add : r0.A00.keySet()) {
                list.add(add);
            }
            for (View view : r8.A0A) {
                AnonymousClass1TY r7 = (AnonymousClass1TY) r8.A06.A00.get(view);
                if (r7 == null) {
                    r7 = AnonymousClass1TY.A05;
                }
                for (Rect rect : r8.A09) {
                    Rect rect2 = r8.A02;
                    Rect rect3 = r8.A01;
                    if (!view.isShown()) {
                        rect2.setEmpty();
                        rect3.setEmpty();
                        z = false;
                    } else if (!view.getGlobalVisibleRect(rect2, C37291jQ.A00) || !rect2.intersect(rect)) {
                        rect3.setEmpty();
                        rect2.setEmpty();
                        z = false;
                    } else {
                        Point point = C37291jQ.A00;
                        int i = point.x;
                        rect3.set(i, point.y, i + view.getWidth(), C37291jQ.A00.y + view.getHeight());
                        z = true;
                    }
                    if (z && r7 != AnonymousClass1TY.A05) {
                        C32761bo r4 = r8.A07;
                        Rect rect4 = r8.A02;
                        Rect rect5 = r8.A01;
                        C37301jR r5 = (C37301jR) r4.A04.get(r7.A03);
                        C32771bp r1 = r4.A02;
                        if (r1.A01.add(r7)) {
                            r1.A00.remove(r7.A03);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (r5 == null) {
                                long j = r4.A00;
                                r5 = new C37301jR();
                                r5.A00 = j;
                                r4.A04.put(r7.A03, r5);
                            } else {
                                r5.A01 = Constants.ONE;
                            }
                        }
                        r5.A02.set(rect5);
                        r5.A03.add(new Rect(rect4));
                        AnonymousClass1TY r52 = r7.A00;
                        if (r52 != AnonymousClass1TY.A05) {
                            C32771bp r12 = r4.A01;
                            if (r12.A01.add(r52)) {
                                r12.A00.remove(r52.A03);
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            C37301jR r3 = (C37301jR) r4.A04.get(r52.A03);
                            if (z3) {
                                if (r3 != null) {
                                    r3.A03.clear();
                                    r3.A01 = Constants.ONE;
                                } else {
                                    long j2 = r4.A00;
                                    r3 = new C37301jR();
                                    r3.A00 = j2;
                                    r3.A02.set(Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT);
                                    r4.A04.put(r52.A03, r3);
                                }
                            }
                            r3.A03.add(new Rect(rect4));
                        }
                    }
                }
            }
            r8.A07.A05();
            r8.A0A.clear();
            AnonymousClass0Z0.A0A(140104659, A03);
            C32821bu r02 = this.A01;
            AnonymousClass0ZA.A09(r02.A03, r02.A08, (long) this.A00, 521118137);
        }
    }
}
