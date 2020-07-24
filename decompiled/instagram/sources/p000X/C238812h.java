package p000X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.12h  reason: invalid class name and case insensitive filesystem */
public final class C238812h implements C238912i, C06570Po {
    public final AnonymousClass13D A00;
    public final C238912i A01;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C238812h(Context context, AnonymousClass0C1 r21) {
        Context context2 = context;
        C14590lB A002 = C22440yQ.A00(context2);
        ArrayList arrayList = new ArrayList();
        AnonymousClass00B r17 = AnonymousClass00B.A01;
        if (C239112l.A00(context2)) {
            arrayList.add(new C239612r(context2, C239812t.A00(context2).A01, C239812t.A00(context2).A00, new C239912u(AnonymousClass00B.A01, new C240212x(this))));
        }
        AnonymousClass136 r3 = new AnonymousClass136(AnonymousClass00B.A01);
        AnonymousClass0C1 r4 = r21;
        AnonymousClass138 r6 = new AnonymousClass138(context2, new AnonymousClass139(context2, r4, r3), C239812t.A00(context2).A00, new AnonymousClass0OR(C05700Lp.A00(), 145, 3, false, false));
        r3.A00 = r6.A06();
        arrayList.add(r6);
        AnonymousClass0OR r11 = new AnonymousClass0OR(C05700Lp.A00(), 146, 3, false, false);
        AnonymousClass13C r13 = new AnonymousClass13C(context2, (C239712s[]) arrayList.toArray(new C239712s[arrayList.size()]), r11, r17, ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.DOWNLOADABLE_MODULES_FAILOVER, "use_failover_downloader", false, (AnonymousClass04H) null)).booleanValue());
        this.A00 = new AnonymousClass13D(context2, A002, r13);
        this.A01 = new AnonymousClass13F(this.A00, C239812t.A00(context2).A02, r13, new AnonymousClass0OR(C05700Lp.A00(), 144, 3, false, false), A002, context2);
    }

    public final C2094790j Apm(Integer num) {
        return this.A01.Apm(num);
    }
}
