package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.RoundedCornerImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CQ1 */
public final class CQ1 {
    public static final CQ7 A00 = new CQ7();

    public static final AnonymousClass5EO A00(Context context, AnonymousClass0C1 r6, CQ6 cq6, boolean z, boolean z2, ImageUrl imageUrl) {
        C13150hy.A02(context, "context");
        C13150hy.A02(r6, "userSession");
        C13150hy.A02(cq6, "delegate");
        AnonymousClass5EO r4 = new AnonymousClass5EO(r6, context);
        if (z) {
            r4.A02(C0003R.string.try_the_challenge_label, new CQ5(cq6));
        } else {
            Boolean bool = (Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.STORIES_REMIXES, "enabled", false, (AnonymousClass04H) null);
            C13150hy.A01(bool, "L.ig_android_stories_rem…getAndExpose(userSession)");
            if (bool.booleanValue()) {
                if (imageUrl != null) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    View inflate = LayoutInflater.from(context).inflate(C0003R.layout.add_to_story_action_sheet_reel_thumbnail, frameLayout, false);
                    if (inflate != null) {
                        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) inflate;
                        roundedCornerImageView.setUrl(imageUrl, "add_to_story_action_sheet");
                        frameLayout.addView(roundedCornerImageView);
                        r4.A00 = frameLayout;
                    } else {
                        throw new C183227s6("null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.RoundedCornerImageView");
                    }
                }
                int i = C0003R.string.remix_this_photo_label;
                if (z2) {
                    i = C0003R.string.remix_this_video_label;
                }
                r4.A02(i, new CQ4(cq6));
            }
        }
        r4.A02(C0003R.string.mention_reshare_button_label, new CQ3(cq6));
        r4.A01(C0003R.string.cancel, new CQ2(cq6));
        r4.A00();
        return r4;
    }
}
