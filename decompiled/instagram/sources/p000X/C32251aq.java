package p000X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.C0003R;

/* renamed from: X.1aq  reason: invalid class name and case insensitive filesystem */
public final class C32251aq implements AnonymousClass1RO {
    public View A00;
    public ViewStub A01;
    public AnonymousClass1NJ A02;
    public ImageView A03;
    public C36841ih A04;
    public final AnonymousClass0C1 A05;

    public static ImageView A00(C32251aq r2) {
        if (r2.A03 == null) {
            ViewStub viewStub = (ViewStub) r2.A00.findViewById(C0003R.C0005id.watchandmore_launch_button_view_stub);
            r2.A01 = viewStub;
            r2.A03 = (ImageView) viewStub.inflate();
        }
        return r2.A03;
    }

    public final void BB7(C36841ih r4, int i) {
        if (i != 8) {
            return;
        }
        if (!r4.A0z) {
            A00(this).setImageResource(C0003R.C0004drawable.wam_close);
        } else if (!r4.A0q) {
            A00(this).setImageResource(C0003R.C0004drawable.wam_open);
            AnonymousClass0C1 r2 = this.A05;
            ImageView A002 = A00(this);
            if (A002.getVisibility() != 0) {
                A002.setVisibility(0);
            }
            if (!this.A04.A0f) {
                A002.post(new AnonymousClass2Y3(r2, this));
            }
        }
    }

    public C32251aq(AnonymousClass0C1 r1, View view) {
        this.A05 = r1;
        this.A00 = view;
    }
}
