package p000X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.cardview.widget.CardView;

/* renamed from: X.AIJ */
public final class AIJ implements AnonymousClass7R3 {
    public Drawable A00;
    public final /* synthetic */ CardView A01;

    public AIJ(CardView cardView) {
        this.A01 = cardView;
    }

    public final boolean ASY() {
        return this.A01.A03;
    }

    public final boolean AZd() {
        return this.A01.A02;
    }

    public final void BgX(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    public final void Biz(int i, int i2) {
        CardView cardView = this.A01;
        if (i > cardView.A01) {
            AIJ.super.setMinimumWidth(i);
        }
        CardView cardView2 = this.A01;
        if (i2 > cardView2.A00) {
            AIJ.super.setMinimumHeight(i2);
        }
    }

    public final void BkW(int i, int i2, int i3, int i4) {
        this.A01.A05.set(i, i2, i3, i4);
        CardView cardView = this.A01;
        Rect rect = cardView.A04;
        AIJ.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public final Drawable AHr() {
        return this.A00;
    }

    public final View AHs() {
        return this.A01;
    }
}
