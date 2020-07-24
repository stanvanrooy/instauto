package p000X;

import android.app.Dialog;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.BVV */
public final class BVV extends ClickableSpan {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ BVR A01;

    public BVV(BVR bvr, Dialog dialog) {
        this.A01 = bvr;
        this.A00 = dialog;
    }

    public final void onClick(View view) {
        Dialog dialog = BVZ.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.A00.show();
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(C019000b.A00(this.A01.A00, C0003R.color.info_dialog_link_color));
        textPaint.setUnderlineText(false);
    }
}
