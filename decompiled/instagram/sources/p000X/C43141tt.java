package p000X;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.1tt  reason: invalid class name and case insensitive filesystem */
public final class C43141tt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C35631gg A00;

    public C43141tt(C35631gg r1) {
        this.A00 = r1;
    }

    public final void onGlobalLayout() {
        if (this.A00.A07.getLayout() != null && this.A00.A07.getLayout().getEllipsisCount(0) == 0) {
            TextView textView = this.A00.A07;
            textView.setText(textView.getText() + " ");
            this.A00.A07.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }
}
