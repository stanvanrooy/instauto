package p000X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1jv  reason: invalid class name and case insensitive filesystem */
public final class C37601jv extends AnonymousClass0O9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ AnonymousClass0RN A03;
    public final /* synthetic */ C27321Hj A04;
    public final /* synthetic */ AnonymousClass0C1 A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37601jv(C27321Hj r5, Activity activity, AnonymousClass0C1 r7, int i, List list, AnonymousClass0RN r10, boolean z, int i2) {
        super(155, 3, false, true);
        this.A04 = r5;
        this.A02 = activity;
        this.A05 = r7;
        this.A01 = i;
        this.A06 = list;
        this.A03 = r10;
        this.A07 = z;
        this.A00 = i2;
    }

    public final void run() {
        if (this.A04.isAdded()) {
            Activity activity = this.A02;
            AnonymousClass0C1 r8 = this.A05;
            int i = this.A01;
            List list = this.A06;
            AnonymousClass0RN r5 = this.A03;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                List A002 = C37611jw.A00(activity, r8, r5, i + i2, (AnonymousClass1NG) list.get(i2));
                if (!A002.isEmpty()) {
                    arrayList.addAll(A002);
                }
            }
            this.A02.runOnUiThread(new C37701k5(this, arrayList));
        }
    }
}
