package p000X;

import android.view.View;

/* renamed from: X.AG1 */
public final class AG1 implements AnonymousClass1E0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C24269Akw A01;

    public AG1(C24269Akw akw, int i) {
        this.A01 = akw;
        this.A00 = i;
    }

    public final C35491gS As7(View view, C35491gS r6) {
        this.A01.A00 = this.A00 + r6.A03();
        view.setPadding(view.getPaddingLeft(), this.A01.A00, view.getPaddingRight(), r6.A03());
        C24269Akw akw = this.A01;
        akw.A07.A0Q(akw.A00);
        return r6;
    }
}
