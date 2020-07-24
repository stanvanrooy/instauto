package p000X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.B11 */
public final class B11 implements View.OnClickListener {
    public final /* synthetic */ LinearLayout A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C25107B0z A02;

    public B11(C25107B0z b0z, LinearLayout linearLayout, TextView textView) {
        this.A02 = b0z;
        this.A00 = linearLayout;
        this.A01 = textView;
    }

    public final void onClick(View view) {
        Resources resources;
        int i;
        int A05 = AnonymousClass0Z0.A05(-752794189);
        LinearLayout linearLayout = this.A00;
        int i2 = 0;
        if (linearLayout.getVisibility() == 0) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        TextView textView = this.A01;
        if (this.A00.getVisibility() == 0) {
            resources = this.A02.getResources();
            i = C0003R.string.autofill_save_dialog_hide_details_button_text;
        } else {
            resources = this.A02.getResources();
            i = C0003R.string.autofill_save_dialog_show_details_button_text;
        }
        textView.setText(resources.getString(i));
        AnonymousClass0Z0.A0C(796280781, A05);
    }
}
