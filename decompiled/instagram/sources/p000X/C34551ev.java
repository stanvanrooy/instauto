package p000X;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1ev  reason: invalid class name and case insensitive filesystem */
public final class C34551ev {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final boolean A04;

    public C34551ev(View view, AnonymousClass0C1 r4) {
        this.A00 = view;
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.cta_text);
        this.A03 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.A01 = view.findViewById(C0003R.C0005id.cta_chevron);
        this.A02 = view.findViewById(C0003R.C0005id.cta_chevron_fill);
        this.A04 = C34581ey.A0D(r4);
    }
}
