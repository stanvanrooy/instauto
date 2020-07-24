package p000X;

import android.view.View;

/* renamed from: X.1ma  reason: invalid class name and case insensitive filesystem */
public final class C39241ma extends C39251mb {
    public C39291mf A00;
    public AnonymousClass3MM A01;
    public final Integer A02;
    public final String A03;

    public final void B0V(View view) {
        AnonymousClass3MM r0 = this.A01;
        if (r0 != null) {
            r0.B0U();
        }
    }

    public final void onClick(View view) {
        C39291mf r1 = this.A00;
        if (r1 != null) {
            r1.Ave(this.A03, view, this);
        }
    }

    public C39241ma(Integer num, String str, boolean z, int i) {
        super(z, i);
        this.A02 = num;
        this.A03 = str;
    }
}
