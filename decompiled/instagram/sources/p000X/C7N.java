package p000X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.C7N */
public final class C7N implements C32211am {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C7O A01;

    public C7N(C7O c7o, Context context) {
        this.A01 = c7o;
        this.A00 = context;
    }

    public final void B7G(View view) {
        View findViewById = view.findViewById(C0003R.C0005id.indicator_background_view);
        this.A01.A00 = (ImageView) view.findViewById(C0003R.C0005id.indicator_icon_view);
        this.A01.A01 = (TextView) view.findViewById(C0003R.C0005id.indicator_text_view);
        int lineHeight = this.A01.A01.getLineHeight();
        int dimensionPixelSize = (lineHeight - this.A00.getResources().getDimensionPixelSize(C0003R.dimen.media_tag_indicator_text_size)) >> 1;
        findViewById.setBackground(C40821pJ.A00(this.A00, lineHeight));
        C06220Of.A0U(this.A01.A00, lineHeight);
        C06220Of.A0K(this.A01.A00, lineHeight);
        this.A01.A00.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
}
