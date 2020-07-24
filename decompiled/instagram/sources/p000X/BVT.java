package p000X;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.BVT */
public final class BVT extends ClickableSpan {
    public final /* synthetic */ BVR A00;

    public BVT(BVR bvr) {
        this.A00 = bvr;
    }

    public final void onClick(View view) {
        Dialog dialog = BVZ.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        BVY bvy = this.A00.A01;
        bvy.A00.A00.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("https://www.facebook.com/maps/attribution_terms/")).setFlags(268435456));
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(C019000b.A00(this.A00.A00, C0003R.color.info_dialog_link_color));
        textPaint.setUnderlineText(false);
    }
}
