package p000X;

import android.content.Context;
import android.util.Log;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.14y  reason: invalid class name and case insensitive filesystem */
public final class C245314y {
    public final Context A00;
    public final C243214d A01;

    public final void A00(C105814hT r10, C105964hi r11, C106124hy r12, C106154i1 r13, boolean z) {
        C106364iO r2;
        C105834hV r5 = new C105834hV(this.A01);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(r10.A00);
        List A002 = C105904hc.A00(r10, r11, arrayList, z);
        if (!A002.isEmpty()) {
            PriorityQueue priorityQueue = new PriorityQueue(A002.size(), new C108164lN(this));
            priorityQueue.addAll(A002);
            hashSet.addAll(A002);
            while (!priorityQueue.isEmpty()) {
                AnonymousClass15G r6 = (AnonymousClass15G) priorityQueue.poll();
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
                    for (AnonymousClass15G r1 : C105904hc.A00(r10, r11, Collections.singletonList(r6), z)) {
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

    public C245314y(Context context, C243214d r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
