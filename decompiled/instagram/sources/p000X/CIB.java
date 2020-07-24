package p000X;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.CIB */
public final class CIB implements DialogInterface.OnClickListener {
    public final /* synthetic */ C466620j A00;

    public CIB(C466620j r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C466620j r7 = this.A00;
        C13300iJ r6 = r7.A00;
        AnonymousClass0a4.A06(r6);
        C12830hS r5 = r7.A04;
        AnonymousClass0C1 r4 = r7.A05;
        AnonymousClass0RN r3 = r7.A03;
        Integer num = Constants.A0N;
        C17850qu A02 = C25007Axz.A02(r4, r3, num, new ArrayList(), Collections.singletonList(r6.getId()));
        A02.A00 = new CIC(r7, r6);
        r5.schedule(A02);
        r7.A01 = num;
        C466620j.A01(r7);
    }
}
