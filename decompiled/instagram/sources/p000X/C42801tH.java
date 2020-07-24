package p000X;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.1tH  reason: invalid class name and case insensitive filesystem */
public final class C42801tH extends C42811tI implements AnonymousClass1YI {
    public final AbsListView A00;

    public final void BlX(C32861by r1) {
    }

    public final void AC3() {
        ((C31171Wu) this.A00).AC3();
    }

    public final void AD3() {
        ((C31171Wu) this.A00).AD3();
    }

    public final void AEf() {
        ((C31171Wu) this.A00).AEf();
    }

    public final View AaU() {
        return this.A00;
    }

    public final boolean AhA() {
        return ((C31171Wu) this.A00).AhA();
    }

    public final void BiF(boolean z) {
        ((C31171Wu) this.A00).setIsLoading(z);
    }

    public final void Bm7(Runnable runnable) {
        ((C31171Wu) this.A00).setupAndEnableRefresh(new C99494Rw(this, runnable));
    }

    public final void setDrawBorder(boolean z) {
        ((C31171Wu) this.A00).setDrawBorder(z);
    }

    public final void setDrawableTopOffset(int i) {
        ((C31171Wu) this.A00).setDrawableTopOffset(i);
    }

    public final void setIsLoading(boolean z) {
        ((C31171Wu) this.A00).setIsLoading(z);
    }

    public final void setPullDownProgressDelegate(C27611In r2) {
        ((C31171Wu) this.A00).setPullDownProgressDelegate(r2);
    }

    public C42801tH(AbsListView absListView) {
        super(absListView);
        this.A00 = absListView;
    }
}
