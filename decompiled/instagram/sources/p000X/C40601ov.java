package p000X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1ov  reason: invalid class name and case insensitive filesystem */
public final class C40601ov implements Runnable {
    public final /* synthetic */ C38011ka A00;
    public final /* synthetic */ List A01;

    public C40601ov(C38011ka r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C38011ka r2 = this.A00;
        Context context = r2.A00;
        Integer num = Constants.ONE;
        String A002 = AnonymousClass1DW.A00(num);
        AnonymousClass0C1 r4 = r2.A01;
        new C41711qm(context, A002, r4).A01(num, this.A01, true, 0, 12, ((Boolean) AnonymousClass0L6.A03(r4, AnonymousClass0L7.EXPLORE_2X2_PLACEHOLDER_PREFETCH, "prefetch_full_image", false, (AnonymousClass04H) null)).booleanValue(), true);
    }
}
