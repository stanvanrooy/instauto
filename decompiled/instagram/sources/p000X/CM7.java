package p000X;

import android.graphics.Rect;
import com.instagram.common.p004ui.text.AlternatingTextView;

/* renamed from: X.CM7 */
public final class CM7 implements Runnable {
    public final /* synthetic */ AlternatingTextView A00;

    public CM7(AlternatingTextView alternatingTextView) {
        this.A00 = alternatingTextView;
    }

    public final void run() {
        AlternatingTextView alternatingTextView = this.A00;
        alternatingTextView.setClipBounds(new Rect(0, 0, AlternatingTextView.getMeasuredTextWidth(alternatingTextView), this.A00.getMeasuredHeight()));
    }
}
