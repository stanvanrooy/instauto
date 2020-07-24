package p000X;

import android.view.View;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.p009ui.mediaactions.MediaActionsView;

/* renamed from: X.CAD */
public final class CAD extends AnonymousClass1ZK implements C32161ah {
    public C36841ih A00;
    public final View A01;
    public final C32231ao A02;
    public final C31841a5 A03;
    public final C32221an A04;
    public final IgProgressImageView A05;
    public final MediaActionsView A06;

    public final C36841ih APt() {
        C36841ih r0 = this.A00;
        AnonymousClass0a4.A06(r0);
        return r0;
    }

    public CAD(View view, View view2, IgProgressImageView igProgressImageView, C31841a5 r4, MediaActionsView mediaActionsView, C32221an r6, C32231ao r7) {
        super(view);
        view.setTag(this);
        this.A01 = view2;
        this.A05 = igProgressImageView;
        this.A03 = r4;
        this.A06 = mediaActionsView;
        this.A04 = r6;
        this.A02 = r7;
    }

    public final C32221an AGJ() {
        return this.A04;
    }

    public final IgProgressImageView ANP() {
        return this.A05;
    }

    public final MediaActionsView APf() {
        return this.A06;
    }

    public final View APn() {
        return this.A01;
    }

    public final C32231ao APv() {
        return this.A02;
    }

    public final C31841a5 AXz() {
        return this.A03;
    }
}
