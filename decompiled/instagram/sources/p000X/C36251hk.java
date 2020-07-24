package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.zero.cms.ZeroCmsTextView;

/* renamed from: X.1hk  reason: invalid class name and case insensitive filesystem */
public final class C36251hk extends C27591Il {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public ImageView A02;
    public LinearLayout A03;
    public TextView A04;
    public C11200ea A05;
    public ZeroCmsTextView A06;
    public boolean A07 = true;

    public C36251hk(LinearLayout linearLayout) {
        this.A03 = linearLayout;
        this.A06 = (ZeroCmsTextView) linearLayout.findViewById(C0003R.C0005id.free_photo_text);
        this.A04 = (TextView) this.A03.findViewById(C0003R.C0005id.video_setting_status_text);
        this.A02 = (ImageView) this.A03.findViewById(C0003R.C0005id.video_setting_icon);
        this.A03.getResources();
        Drawable A032 = C019000b.A03(this.A03.getContext(), C0003R.C0004drawable.video_setting_banner_background_blue);
        Drawable A033 = C019000b.A03(this.A03.getContext(), C0003R.C0004drawable.video_setting_banner_background_white);
        this.A01 = new TransitionDrawable(new Drawable[]{A033, A032});
        this.A00 = new TransitionDrawable(new Drawable[]{A032, A033});
        this.A05 = new C105484gw(this);
    }

    public final void A09(C255119b r6, int i, int i2, int i3, int i4, int i5) {
        TransitionDrawable transitionDrawable;
        int A032 = AnonymousClass0Z0.A03(1833043501);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        if (z != this.A07) {
            this.A07 = z;
            if (z) {
                transitionDrawable = this.A01;
            } else {
                transitionDrawable = this.A00;
            }
            this.A03.setBackgroundDrawable(transitionDrawable);
            transitionDrawable.startTransition(200);
            ZeroCmsTextView zeroCmsTextView = this.A06;
            Context context = this.A03.getContext();
            int i6 = C0003R.color.zero_rating_video_settings_drawer_cancel_button_color;
            if (z) {
                i6 = C0003R.color.white;
            }
            zeroCmsTextView.setTextColor(C019000b.A00(context, i6));
            TextView textView = this.A04;
            Context context2 = this.A03.getContext();
            int i7 = C0003R.color.zero_rating_video_settings_drawer_subtitle_color;
            if (z) {
                i7 = C0003R.color.white_60_transparent;
            }
            textView.setTextColor(C019000b.A00(context2, i7));
            ImageView imageView = this.A02;
            Context context3 = this.A03.getContext();
            int i8 = C0003R.color.grey_3;
            if (z) {
                i8 = C0003R.color.white;
            }
            imageView.setColorFilter(C26771Ff.A00(C019000b.A00(context3, i8)));
        }
        AnonymousClass0Z0.A0A(209932255, A032);
    }
}
