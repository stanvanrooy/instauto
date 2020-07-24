package com.instagram.rtc.presentation.participants;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.blur.BlurUtil;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import p000X.AnonymousClass7BR;
import p000X.C13150hy;
import p000X.C208558xL;

public final class RtcCallParticipantCellView extends ConstraintLayout {
    public ImageUrl A00;
    public final TextureView A01;
    public final View A02;
    public final CircularImageView A03;

    public RtcCallParticipantCellView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (AnonymousClass7BR) null);
    }

    public RtcCallParticipantCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (AnonymousClass7BR) null);
    }

    public static final void setBackgroundBitmap(RtcCallParticipantCellView rtcCallParticipantCellView, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = null;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable(rtcCallParticipantCellView.getResources(), BlurUtil.blur(bitmap, 0.1f, 3));
        }
        rtcCallParticipantCellView.setBackground(bitmapDrawable);
    }

    public final void setAvatar(ImageUrl imageUrl) {
        C13150hy.A02(imageUrl, "avatarUrl");
        if (!C13150hy.A05(imageUrl, this.A00)) {
            this.A00 = imageUrl;
            CircularImageView circularImageView = this.A03;
            circularImageView.setOnLoadListener(new C208558xL(this));
            circularImageView.setUrl(imageUrl);
            this.A03.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13150hy.A02(context, "context");
        View.inflate(context, C0003R.layout.layout_call_participant_item, this);
        View findViewById = findViewById(C0003R.C0005id.call_participant_avatar);
        C13150hy.A01(findViewById, "findViewById(R.id.call_participant_avatar)");
        this.A03 = (CircularImageView) findViewById;
        View findViewById2 = findViewById(C0003R.C0005id.call_participant_mute_indicator);
        C13150hy.A01(findViewById2, "findViewById(R.id.call_participant_mute_indicator)");
        this.A02 = findViewById2;
        View findViewById3 = findViewById(C0003R.C0005id.call_participant_video_view);
        C13150hy.A01(findViewById3, "findViewById(R.id.call_participant_video_view)");
        this.A01 = (TextureView) findViewById3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RtcCallParticipantCellView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass7BR r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
