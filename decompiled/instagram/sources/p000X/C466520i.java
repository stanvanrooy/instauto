package p000X;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.p009ui.widget.textview.UpdatableButton;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.20i  reason: invalid class name and case insensitive filesystem */
public final class C466520i extends AnonymousClass1ZK {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final UpdatableButton A07;
    public final C466620j A08;
    public final FollowButton A09;

    public C466520i(Activity activity, AnonymousClass0RN r8, C12830hS r9, AnonymousClass0C1 r10, View view) {
        super(view);
        this.A00 = view.findViewById(C0003R.C0005id.suggested_entity_card_container);
        this.A06 = (CircularImageView) view.findViewById(C0003R.C0005id.suggested_entity_card_image);
        this.A05 = (TextView) view.findViewById(C0003R.C0005id.suggested_entity_card_name);
        this.A04 = (TextView) view.findViewById(C0003R.C0005id.suggested_entity_card_context);
        this.A01 = view.findViewById(C0003R.C0005id.dismiss_button);
        FollowButton followButton = (FollowButton) view.findViewById(C0003R.C0005id.suggested_user_card_follow_button);
        this.A09 = followButton;
        followButton.A02.A03 = "feed_suggested_user_carousel";
        UpdatableButton updatableButton = (UpdatableButton) view.findViewById(C0003R.C0005id.suggested_entity_card_close_friend_button);
        this.A07 = updatableButton;
        if (updatableButton != null) {
            this.A08 = new C466620j(activity, r8, r9, r10, updatableButton);
        }
        this.A02 = view.findViewById(C0003R.C0005id.suggested_user_card_new_badge);
        this.A03 = view.findViewById(C0003R.C0005id.suggested_entity_card_small_circle_new_badge);
    }
}
