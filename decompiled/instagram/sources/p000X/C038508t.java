package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.08t  reason: invalid class name and case insensitive filesystem */
public final class C038508t extends AnonymousClass2MK {
    public final /* bridge */ /* synthetic */ AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass44I(layoutInflater.inflate(C0003R.layout.layout_shhmode_thread_title, viewGroup, false));
    }

    public final Class A02() {
        return AnonymousClass4AS.class;
    }

    public final void A04(C40371oY r3, AnonymousClass1ZK r4) {
        AnonymousClass4AS r32 = (AnonymousClass4AS) r3;
        AnonymousClass44I r42 = (AnonymousClass44I) r4;
        r42.A01.setText(r32.A02);
        r42.A00.setText(r32.A01);
    }
}
