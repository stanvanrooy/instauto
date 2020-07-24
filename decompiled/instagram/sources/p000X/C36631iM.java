package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.1iM  reason: invalid class name and case insensitive filesystem */
public final class C36631iM extends C35681gl {
    public final /* synthetic */ C36611iK A00;

    public C36631iM(C36611iK r1) {
        this.A00 = r1;
    }

    public final void BA5(View view) {
        C36691iS r1 = this.A00.A00;
        if (r1 != null && r1.A06 && C36621iL.A01(r1.A03)) {
            AnonymousClass0C1 r2 = r1.A02;
            ConstrainedImageView constrainedImageView = r1.A05.A09;
            new C178677k9(r2, constrainedImageView, constrainedImageView.getWidth(), r1.A03, r1.A04);
        }
    }

    public final boolean BR2(View view) {
        C36691iS r4 = this.A00.A00;
        if (r4 == null) {
            return false;
        }
        if (!r4.A05.A09.A0L) {
            return true;
        }
        int dimensionPixelSize = r4.A01.getDimensionPixelSize(C0003R.dimen.emoji_text_size);
        AnonymousClass7XH r2 = new AnonymousClass7XH(r4.A00, r4.A01.getDisplayMetrics().widthPixels);
        r2.A0J(r4.A03.A02);
        r2.A06((float) dimensionPixelSize);
        r2.A05();
        r4.A04.B2D(r4.A03, r2);
        return true;
    }
}
