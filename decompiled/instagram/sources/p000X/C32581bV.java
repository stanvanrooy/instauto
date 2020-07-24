package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1bV  reason: invalid class name and case insensitive filesystem */
public final class C32581bV {
    public View A00;
    public ViewGroup A01;
    public boolean A02 = false;
    public final int A03;
    public final List A04 = new ArrayList();

    public final void A00() {
        for (FrameLayout visibility : this.A04) {
            visibility.setVisibility(8);
        }
        View view = this.A00;
        AnonymousClass0a4.A06(view);
        view.setVisibility(8);
    }

    public final void A01(ViewGroup viewGroup) {
        this.A01 = viewGroup;
        AnonymousClass0a4.A06(viewGroup);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(C0003R.C0005id.row_feed_emoji_picker_emoji_1);
        frameLayout.setTag(new C36611iK(frameLayout, this.A03));
        this.A04.add(frameLayout);
        ViewGroup viewGroup2 = this.A01;
        AnonymousClass0a4.A06(viewGroup2);
        FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(C0003R.C0005id.row_feed_emoji_picker_emoji_2);
        frameLayout2.setTag(new C36611iK(frameLayout2, this.A03));
        this.A04.add(frameLayout2);
        this.A00 = this.A01.findViewById(C0003R.C0005id.row_feed_emoji_picker_plus_icon);
    }

    public C32581bV(int i) {
        this.A03 = i;
    }
}
