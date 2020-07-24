package p000X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.1Zz  reason: invalid class name and case insensitive filesystem */
public final class C31801Zz implements C31811a0 {
    public ViewGroup A00;
    public ViewStub A01;
    public ViewStub A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ColorFilterAlphaImageView A06;
    public CircularImageView A07;
    public C26571Ea A08;
    public AnonymousClass1NJ A09;
    public AnonymousClass420 A0A;
    public GradientSpinner A0B;
    public FollowButton A0C;

    public final boolean BnP() {
        return true;
    }

    public final RectF AGQ() {
        return C06220Of.A0A(this.A07);
    }

    public final View AGS() {
        return this.A07;
    }

    public final GradientSpinner ATs() {
        return this.A0B;
    }

    public final void AcW() {
        this.A07.setVisibility(4);
    }

    public final void Bo5() {
        this.A07.setVisibility(0);
    }
}
