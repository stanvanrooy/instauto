package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.0Di  reason: invalid class name and case insensitive filesystem */
public final class C04280Di extends AnonymousClass2MK {
    public final Class A02() {
        return C109414nS.class;
    }

    public final /* bridge */ /* synthetic */ void A04(C40371oY r3, AnonymousClass1ZK r4) {
        C109414nS r32 = (C109414nS) r3;
        AnonymousClass442 r42 = (AnonymousClass442) r4;
        r42.A01.setText(r32.A00);
        if (r32.A01 != null) {
            r42.A00.setText(C0003R.string.inbox_search_section_title_see_all_action_text);
            r42.A00.setOnClickListener(new C109434nU(this, r32));
            r42.A00.setVisibility(0);
            return;
        }
        r42.A00.setVisibility(8);
    }

    public final AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C0003R.layout.layout_header_with_action_text, viewGroup, false);
        AnonymousClass442 r1 = new AnonymousClass442(inflate);
        r1.A01 = (TextView) inflate.findViewById(C0003R.C0005id.header_text);
        r1.A00 = (TextView) inflate.findViewById(C0003R.C0005id.header_action_button);
        return r1;
    }
}
