package p000X;

import android.util.Log;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.14x  reason: invalid class name and case insensitive filesystem */
public final class C245214x {
    public final C245014v A00;
    public final C243214d A01;
    public final C244814t A02;

    public static List A00(C105814hT r9) {
        ArrayList arrayList = new ArrayList();
        C243414f r1 = new C243414f();
        C104684fd r0 = new C104684fd();
        C105814hT r4 = r9;
        new C245214x(r1, r0).A01(r4, new C105934hf(C105944hg.WAITING), new C106184i4(arrayList), new C106134hz(), false);
        return arrayList;
    }

    public final void A01(C105814hT r10, C105974hj r11, C106124hy r12, C106154i1 r13, boolean z) {
        C106364iO r2;
        C105834hV r5 = new C105834hV(this.A01);
        HashSet hashSet = new HashSet();
        List A002 = this.A00.A00(r10, Collections.singletonList(r10.A00));
        if (!A002.isEmpty()) {
            PriorityQueue priorityQueue = new PriorityQueue(A002.size(), new C108174lO(this));
            priorityQueue.addAll(A002);
            hashSet.addAll(A002);
            while (!priorityQueue.isEmpty()) {
                AnonymousClass15G r6 = (AnonymousClass15G) priorityQueue.poll();
                if (this.A02.A7S(r10, r6, this.A01.AOd(r10.A04, r6), z)) {
                    C105884ha A003 = r5.A00(r10, r6);
                    r11.Bcf(r10, r6, A003);
                    try {
                        r2 = r12.BeB(r6, A003);
                    } catch (RuntimeException e) {
                        AnonymousClass0QD.A05("transactionrunner_operation_exception", StringFormatUtil.formatStrLocaleSafe("Operation %s threw exception", (Object) r6.getTypeName()), e);
                        r2 = C106364iO.A02(Log.getStackTraceString(e), C243714i.NEVER);
                    }
                    this.A01.Bce(r10.A04, r6, r2);
                    r11.Bcd(r10, r6, A003, r2);
                    if (!r13.Adp()) {
                        for (AnonymousClass15G r1 : this.A00.A00(r10, Collections.singletonList(r6))) {
                            if (!hashSet.contains(r1)) {
                                hashSet.add(r1);
                                priorityQueue.add(r1);
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public C245214x(C243214d r2, C244814t r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = new C245014v(r2);
    }
}
