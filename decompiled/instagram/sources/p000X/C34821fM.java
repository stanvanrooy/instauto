package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.C0003R;

/* renamed from: X.1fM  reason: invalid class name and case insensitive filesystem */
public final class C34821fM implements C32211am {
    public final /* synthetic */ C34811fL A00;

    public C34821fM(C34811fL r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void B7G(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        C34811fL r1 = this.A00;
        r1.A02 = viewGroup;
        r1.A04 = (ImageView) viewGroup.findViewById(C0003R.C0005id.event_sticker);
        this.A00.A00 = viewGroup.findViewById(C0003R.C0005id.event_sticker_going_button);
        this.A00.A01 = viewGroup.findViewById(C0003R.C0005id.event_sticker_cant_go_button);
        C34811fL r12 = this.A00;
        r12.A03 = (ViewGroup) r12.A02.getParent();
    }
}
