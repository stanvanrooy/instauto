package p000X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;

/* renamed from: X.1ax  reason: invalid class name and case insensitive filesystem */
public final class C32321ax {
    public final C26571Ea A00;

    public final void A00() {
        C26571Ea r1 = this.A00;
        if (r1.A04()) {
            r1.A01().setVisibility(8);
        }
    }

    public C32321ax(View view) {
        this.A00 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.row_feed_carousel_edit_tags_indicator_stub));
    }
}
