package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.avatarlike.AvatarLikesView;

/* renamed from: X.AMQ */
public final class AMQ {
    public final View A00 = this.A05.findViewById(C0003R.C0005id.avatar_likes_container);
    public final View A01 = this.A05.findViewById(C0003R.C0005id.iglive_comment_composer_container);
    public final View A02 = this.A05.findViewById(C0003R.C0005id.dismiss_view_background);
    public final View A03 = this.A05.findViewById(C0003R.C0005id.iglive_reactions_composer);
    public final View A04;
    public final ViewGroup A05;
    public final EditText A06 = ((EditText) this.A05.findViewById(C0003R.C0005id.comment_composer_edit_text));
    public final AvatarLikesView A07 = ((AvatarLikesView) this.A05.findViewById(C0003R.C0005id.avatar_likes_view));

    public final void A00() {
        int A062 = C06220Of.A06(this.A05.getContext()) >> 1;
        ViewGroup.LayoutParams layoutParams = this.A04.getLayoutParams();
        if (layoutParams.height != A062) {
            layoutParams.height = A062;
            this.A04.setLayoutParams(layoutParams);
        }
    }

    public AMQ(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0003R.C0005id.iglive_reactions_layout);
        this.A05 = viewGroup;
        this.A04 = viewGroup.findViewById(C0003R.C0005id.reactions_container);
    }
}
