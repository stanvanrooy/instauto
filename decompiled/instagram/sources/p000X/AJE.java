package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.AJE */
public final class AJE extends AnonymousClass1ZK {
    public AJO A00;
    public String A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final C72733Gu A06;

    public AJE(View view, AJO ajo) {
        super(view);
        this.A00 = ajo;
        this.A05 = (CircularImageView) view.findViewById(C0003R.C0005id.profile_picture);
        this.A03 = (TextView) view.findViewById(C0003R.C0005id.username);
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.donation_amount);
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.wave_button);
        this.A04 = textView;
        textView.setOnClickListener(new AJD(this));
        this.A06 = C72733Gu.A00(view, C0003R.C0005id.profile_emoji_overlay_stub);
    }
}
