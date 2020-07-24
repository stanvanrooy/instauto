package p000X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.1fc  reason: invalid class name and case insensitive filesystem */
public final class C34981fc implements View.OnClickListener, Animator.AnimatorListener, C32211am {
    public int A00 = 8;
    public TextView A01;
    public CircularImageView A02;
    public AnonymousClass2OO A03;
    public View A04;
    public View A05;
    public final C26571Ea A06;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A00 == 8) {
            this.A06.A02(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.A06.A02(0);
    }

    public C34981fc(ViewStub viewStub) {
        C26571Ea r0 = new C26571Ea(viewStub);
        this.A06 = r0;
        r0.A03(this);
    }

    public final void B7G(View view) {
        this.A02 = (CircularImageView) view.findViewById(C0003R.C0005id.suggested_highlight_end_card_cover_image);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.suggested_highlight_end_card_title);
        View findViewById = view.findViewById(C0003R.C0005id.suggested_highlight_end_card_publish_button);
        this.A04 = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = view.findViewById(C0003R.C0005id.suggested_highlight_end_card_remove_suggestion_button);
        this.A05 = findViewById2;
        findViewById2.setOnClickListener(this);
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(-317438823);
        if (view == this.A04) {
            ((AnonymousClass2OJ) this.A03).BGe();
        } else if (view == this.A05) {
            this.A03.BIO();
        }
        AnonymousClass0Z0.A0C(-85488644, A052);
    }
}
