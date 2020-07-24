package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;

/* renamed from: X.BY9 */
public final class BY9 extends LinearLayout {
    public IgTextView A00 = ((IgTextView) findViewById(C0003R.C0005id.button_label));

    public BY9(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C0003R.layout.grid_quick_preview_button_layout, this);
    }

    public ImageView getImageView() {
        return null;
    }
}
