package p000X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1Vg  reason: invalid class name and case insensitive filesystem */
public final class C30801Vg implements AnonymousClass0PS {
    public final /* synthetic */ AnonymousClass0PS A00;
    public final /* synthetic */ AnonymousClass1VQ A01;

    public C30801Vg(AnonymousClass1VQ r1, AnonymousClass0PS r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void B7H(View view, int i, ViewGroup viewGroup) {
        AnonymousClass1VQ r7 = this.A01;
        C32561bT r3 = new C32561bT(view, r7.A04, r7.A03, r7, r7.A01);
        r3.A00();
        view.setTag(r3);
        AnonymousClass1VU r2 = this.A01.A00;
        if (r2 != null) {
            r2.A00(r3.A0D, new C36641iN(this));
        }
        this.A00.B7H(view, i, viewGroup);
    }
}
