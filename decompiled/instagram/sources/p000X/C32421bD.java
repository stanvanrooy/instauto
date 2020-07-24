package p000X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.p009ui.widget.textview.IgTextLayoutView;

/* renamed from: X.1bD  reason: invalid class name and case insensitive filesystem */
public final class C32421bD implements AnonymousClass1RO {
    public View A00;
    public AnonymousClass0RN A01;
    public AnonymousClass1NJ A02;
    public C36841ih A03;
    public AnonymousClass0C1 A04;
    public IgBouncyUfiButtonImageView A05;
    public AnonymousClass29R A06;
    public final View A07;
    public final IgTextLayoutView A08;
    public final ViewStub A09;

    public final void BB7(C36841ih r2, int i) {
        if (i == 4) {
            AnonymousClass1VS.A01(this);
        }
    }

    public C32421bD(View view) {
        this.A07 = view.findViewById(C0003R.C0005id.row_feed_comment_textview_child_comment_indent);
        this.A08 = (IgTextLayoutView) view.findViewById(C0003R.C0005id.row_feed_comment_textview_layout);
        this.A09 = (ViewStub) view.findViewById(C0003R.C0005id.row_feed_comment_like_button_stub);
    }
}
