package com.instagram.video.videocall.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.blur.BlurUtil;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import org.webrtc.MediaStreamTrack;
import p000X.AnonymousClass87V;
import p000X.C31691Zj;
import p000X.C72733Gu;

public class VideoCallParticipantCellView extends ConstraintLayout {
    public ImageUrl A00;
    public final View A01;
    public final CircularImageView A02;
    public final C72733Gu A03;

    public static void setBackgroundBitmap(VideoCallParticipantCellView videoCallParticipantCellView, Bitmap bitmap) {
        if (bitmap == null) {
            videoCallParticipantCellView.setBackground((Drawable) null);
            return;
        }
        videoCallParticipantCellView.setBackground(new BitmapDrawable(videoCallParticipantCellView.getResources(), BlurUtil.blur(bitmap, 0.1f, 3)));
    }

    public void setAvatar(ImageUrl imageUrl) {
        if (!imageUrl.equals(this.A00)) {
            this.A00 = imageUrl;
            CircularImageView circularImageView = this.A02;
            circularImageView.setOnLoadListener(new AnonymousClass87V(this));
            circularImageView.setUrl(imageUrl);
            this.A02.setVisibility(0);
        }
    }

    public void setVideoView(View view) {
        if (!(view == null || view.getParent() == null)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != this) {
                viewGroup.removeView(view);
            } else {
                return;
            }
        }
        View childAt = getChildAt(1);
        if (childAt != null && MediaStreamTrack.VIDEO_TRACK_KIND.equals(childAt.getTag())) {
            removeView(childAt);
        }
        if (view != null) {
            view.setLayoutParams(new C31691Zj(-2, -2));
            view.setTag(MediaStreamTrack.VIDEO_TRACK_KIND);
            addView(view, 1);
        }
    }

    public VideoCallParticipantCellView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VideoCallParticipantCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoCallParticipantCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, C0003R.layout.layout_videocall_grid_item, this);
        this.A02 = (CircularImageView) findViewById(C0003R.C0005id.videocall_participant_avatar);
        this.A01 = findViewById(C0003R.C0005id.videocall_cell_mute_indicator);
        this.A03 = C72733Gu.A00(this, C0003R.C0005id.videocall_debug_stub);
    }
}
