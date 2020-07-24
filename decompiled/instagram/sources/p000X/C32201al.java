package p000X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1al  reason: invalid class name and case insensitive filesystem */
public final class C32201al implements C32211am {
    public final /* synthetic */ C32191ak A00;

    public C32201al(C32191ak r1) {
        this.A00 = r1;
    }

    public final void B7G(View view) {
        C32191ak r1 = this.A00;
        r1.A03 = view;
        r1.A02 = view.findViewById(C0003R.C0005id.indicator_background_view);
        this.A00.A04 = (ImageView) view.findViewById(C0003R.C0005id.indicator_icon_view);
        this.A00.A05 = (TextView) view.findViewById(C0003R.C0005id.indicator_text_view);
        int lineHeight = this.A00.A05.getLineHeight();
        int dimensionPixelSize = (lineHeight - this.A00.A0D.getResources().getDimensionPixelSize(C0003R.dimen.media_tag_indicator_text_size)) >> 1;
        C32191ak r0 = this.A00;
        r0.A02.setBackground(C40821pJ.A00(r0.A0D, lineHeight));
        C06220Of.A0U(this.A00.A04, lineHeight);
        C06220Of.A0K(this.A00.A04, lineHeight);
        this.A00.A04.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
}
