package p000X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;

/* renamed from: X.1gr  reason: invalid class name and case insensitive filesystem */
public final class C35741gr implements C35751gs {
    public AnonymousClass420 A00;
    public final C26571Ea A01;
    public final C26571Ea A02;
    public final C26571Ea A03;
    public final C26571Ea A04;
    public final C26571Ea A05;
    public final C35761gt A06;

    public final View AGS() {
        return this.A06.AGS();
    }

    public C35741gr(View view) {
        this.A06 = new C35761gt(view);
        this.A03 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.own_reel_badge_stub));
        this.A02 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.branding_badge_stub));
        this.A01 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.avatar_checkmark_overlay_stub));
        this.A05 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.suggested_highlight_add_icon));
        this.A04 = new C26571Ea((ViewStub) view.findViewById(C0003R.C0005id.reel_glyph_stub));
    }
}
