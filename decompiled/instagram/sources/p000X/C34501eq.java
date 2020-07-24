package p000X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1eq  reason: invalid class name and case insensitive filesystem */
public final class C34501eq {
    public View A00;
    public ViewStub A01;
    public ImageView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public C26571Ea A07;
    public C26571Ea A08;

    public final void A00() {
        if (this.A00 == null) {
            View inflate = this.A01.inflate();
            this.A00 = inflate;
            this.A06 = (TextView) inflate.findViewById(C0003R.C0005id.restricted_media_title);
            this.A05 = (TextView) this.A00.findViewById(C0003R.C0005id.restricted_media_subtitle);
            this.A02 = (ImageView) this.A00.findViewById(C0003R.C0005id.icon_imageview);
            C26571Ea r2 = new C26571Ea((ViewStub) this.A00.findViewById(C0003R.C0005id.misinfo_center_button_view_stub));
            this.A08 = r2;
            r2.A03(new C158386pX(this));
            C26571Ea r22 = new C26571Ea((ViewStub) this.A00.findViewById(C0003R.C0005id.misinfo_bottom_banner_view_stub));
            this.A07 = r22;
            r22.A03(new C158376pW(this));
        }
    }

    public C34501eq(ViewStub viewStub) {
        this.A01 = viewStub;
    }
}
