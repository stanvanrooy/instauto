package p000X;

import android.content.Context;

/* renamed from: X.BUf */
public final class BUf {
    public final C06180Ob A00;
    public final C475424l A01;

    public BUf(Context context, AnonymousClass0C1 r12) {
        C25666BUc bUc;
        C25674BUo bUd;
        Class<C25666BUc> cls = C25666BUc.class;
        synchronized (cls) {
            bUc = (C25666BUc) r12.AV9(cls);
            if (bUc == null) {
                Context applicationContext = context.getApplicationContext();
                AnonymousClass0L7 r1 = AnonymousClass0L7.MEDIA_STORE;
                if (((Integer) AnonymousClass0L6.A02(r12, r1, "max_row_count", 0, (AnonymousClass04H) null)).intValue() > 0) {
                    bUd = new C25668BUe(((Integer) AnonymousClass0L6.A02(r12, r1, "max_row_count", 0, (AnonymousClass04H) null)).intValue(), AnonymousClass0WN.A01(r12), C06190Oc.A00);
                } else {
                    bUd = new C25667BUd(C06190Oc.A00, (long) ((Integer) AnonymousClass0L6.A02(r12, AnonymousClass0L7.MEDIA_STORE, "row_max_age_seconds", 172800, (AnonymousClass04H) null)).intValue(), AnonymousClass0WN.A01(r12));
                }
                bUc = new C25666BUc(applicationContext, r12, bUd, AnonymousClass0Q7.A03());
                r12.BYi(cls, bUc);
            }
        }
        C06180Ob r0 = C06190Oc.A00;
        this.A01 = bUc;
        this.A00 = r0;
    }
}
