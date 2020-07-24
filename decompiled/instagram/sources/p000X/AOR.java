package p000X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.AOR */
public abstract class AOR {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;

    public AOR(View view) {
        C13150hy.A02(view, "rootView");
        View findViewById = view.findViewById(C0003R.C0005id.iglive_pinned_content);
        if (findViewById == null) {
            View findViewById2 = view.findViewById(C0003R.C0005id.iglive_pinned_content_stub);
            if (findViewById2 != null) {
                findViewById = ((ViewStub) findViewById2).inflate();
                C13150hy.A01(findViewById, "(rootView.findViewById(R…b) as ViewStub).inflate()");
            } else {
                throw new C183227s6("null cannot be cast to non-null type android.view.ViewStub");
            }
        }
        this.A00 = findViewById;
        View findViewById3 = findViewById.findViewById(C0003R.C0005id.title);
        C13150hy.A01(findViewById3, "findViewById(R.id.title)");
        this.A04 = (TextView) findViewById3;
        View findViewById4 = findViewById.findViewById(C0003R.C0005id.subtitle);
        C13150hy.A01(findViewById4, "findViewById(R.id.subtitle)");
        this.A03 = (TextView) findViewById4;
        View findViewById5 = findViewById.findViewById(C0003R.C0005id.description);
        C13150hy.A01(findViewById5, "findViewById(R.id.description)");
        this.A02 = (TextView) findViewById5;
        View findViewById6 = findViewById.findViewById(C0003R.C0005id.action_button);
        C13150hy.A01(findViewById6, "findViewById<TextView>(R.id.action_button)");
        this.A01 = (TextView) findViewById6;
    }
}
