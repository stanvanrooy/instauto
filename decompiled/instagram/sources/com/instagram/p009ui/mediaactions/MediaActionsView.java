package com.instagram.p009ui.mediaactions;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.videothumbnail.ThumbView;
import java.util.Locale;
import p000X.AnonymousClass11J;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C149436aK;
import p000X.C15960no;
import p000X.C168237Gj;
import p000X.C32131ad;
import p000X.C32141af;

/* renamed from: com.instagram.ui.mediaactions.MediaActionsView */
public class MediaActionsView extends FrameLayout {
    public int A00;
    public int A01;
    public TransitionDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewStub A07;
    public ViewStub A08;
    public ViewStub A09;
    public ViewStub A0A;
    public ProgressBar A0B;
    public TextView A0C;
    public ScrubberPreviewThumbnailView A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public float A0I;
    public ObjectAnimator A0J;
    public View A0K;
    public View A0L;
    public ViewStub A0M;
    public ViewStub A0N;
    public ImageView A0O;
    public TextView A0P;
    public C32141af A0Q;

    public final void A06() {
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView;
        ThumbView thumbView;
        setProgress(0);
        if (this.A0H && (scrubberPreviewThumbnailView = this.A0D) != null && (thumbView = scrubberPreviewThumbnailView.A02) != null) {
            ThumbView.A00(thumbView);
        }
    }

    private void A00() {
        if (this.A0C == null) {
            TextView textView = (TextView) this.A0M.inflate();
            this.A0C = textView;
            this.A0I = textView.getX();
            this.A0C.setText(C15960no.A03(0));
            this.A0C.setBackground(new C168237Gj(C019000b.A00(getContext(), C0003R.color.white)));
        }
    }

    private void A01() {
        if (this.A04 == null) {
            View inflate = this.A0N.inflate();
            this.A04 = inflate;
            this.A02 = (TransitionDrawable) inflate.getBackground();
            View findViewById = this.A04.findViewById(C0003R.C0005id.video_states);
            this.A06 = findViewById;
            this.A0O = (ImageView) findViewById.findViewById(C0003R.C0005id.video_icon);
            this.A0P = (TextView) this.A06.findViewById(C0003R.C0005id.countdown_timer);
            View findViewById2 = this.A06.findViewById(C0003R.C0005id.caminner);
            this.A0K = findViewById2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById2, "alpha", new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
            this.A0J = ofFloat;
            ofFloat.setDuration(750);
            this.A0J.setRepeatMode(2);
            this.A0J.setRepeatCount(-1);
            this.A0J.setInterpolator(new AccelerateInterpolator());
            this.A0L = this.A06.findViewById(C0003R.C0005id.retry);
            this.A07 = (ViewStub) this.A04.findViewById(C0003R.C0005id.progress_bar_gradient_stub);
            this.A08 = (ViewStub) this.A04.findViewById(C0003R.C0005id.progress_bar_stub);
            this.A0M = (ViewStub) this.A04.findViewById(C0003R.C0005id.time_pill_stub);
            this.A0A = (ViewStub) this.A04.findViewById(C0003R.C0005id.video_controls_nux_stub);
            this.A09 = (ViewStub) this.A04.findViewById(C0003R.C0005id.thumbnail_preview_stub);
        }
    }

    public static void A02(MediaActionsView mediaActionsView) {
        ProgressBar progressBar = mediaActionsView.A0B;
        if (progressBar != null) {
            int max = progressBar.getMax();
            int i = mediaActionsView.A01;
            if (max != i) {
                mediaActionsView.A0B.setMax(i);
            }
            mediaActionsView.setProgress(mediaActionsView.A00);
        }
    }

    public static void A03(MediaActionsView mediaActionsView, boolean z) {
        if (mediaActionsView.A0B == null) {
            mediaActionsView.A0B = (ProgressBar) mediaActionsView.A08.inflate();
            A02(mediaActionsView);
        }
        Context context = mediaActionsView.getContext();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0003R.dimen.progress_bar_margin);
        ViewPropertyAnimator animate = mediaActionsView.A0B.animate();
        float f = 1.0f;
        if (z) {
            f = 0.93f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f);
        float f2 = (float) dimensionPixelOffset;
        if (!z) {
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        scaleX.y(f2).setDuration(160);
        ProgressBar progressBar = mediaActionsView.A0B;
        mediaActionsView.getContext();
        int i = C0003R.C0004drawable.view_media_actions_progress_bar_progress;
        if (z) {
            i = C0003R.C0004drawable.view_media_actions_progress_bar_progress_active;
        }
        progressBar.setProgressDrawable(C019000b.A03(context, i));
    }

    private void setProgress(int i) {
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView;
        ProgressBar progressBar = this.A0B;
        if (progressBar != null && progressBar.getProgress() != i) {
            this.A0B.setProgress(i);
            boolean z = this.A0H;
            if (!z && !this.A0F) {
                A00();
                this.A0C.setText(C15960no.A03((long) i));
                TextView textView = this.A0C;
                A00();
                float width = (((float) this.A04.getWidth()) * 0.06999999f) / 2.0f;
                textView.setX(Math.min(Math.max((((((float) i) / ((float) this.A01)) * (((float) this.A04.getWidth()) * 0.93f)) + width) - ((float) (this.A0C.getWidth() >> 1)), width), ((float) (this.A04.getWidth() - this.A0C.getWidth())) - width));
            } else if (z && (scrubberPreviewThumbnailView = this.A0D) != null) {
                int progress = this.A0B.getProgress();
                int max = this.A0B.getMax();
                ThumbView thumbView = scrubberPreviewThumbnailView.A02;
                if (thumbView != null) {
                    thumbView.A02(progress, max);
                }
            }
        }
    }

    private void setVideoIconVisibility(C32141af r6) {
        View view = this.A0L;
        int i = 8;
        if (r6 == C32141af.RETRY) {
            i = 0;
        }
        view.setVisibility(i);
        if (r6 == C32141af.PLAY) {
            this.A0O.setVisibility(0);
            this.A0O.setImageResource(C0003R.C0004drawable.feed_play);
            this.A0K.setVisibility(8);
        } else if (r6 == C32141af.LOADING || r6 == C32141af.AUTOPLAY) {
            this.A0O.setVisibility(0);
            this.A0O.setImageResource(C0003R.C0004drawable.feed_camera);
            this.A0K.setVisibility(0);
        } else {
            this.A0O.setVisibility(8);
            this.A0K.setVisibility(8);
        }
        if (r6 == C32141af.LOADING) {
            this.A0J.setTarget(this.A0K);
            this.A0J.start();
        } else if (r6 == C32141af.LOADING_ANIMATE_TIMER) {
            this.A0J.setTarget(this.A0P);
            this.A0J.start();
        } else {
            this.A0J.end();
            this.A0K.setAlpha(1.0f);
            this.A0P.setAlpha(1.0f);
        }
        if (r6 == C32141af.TIMER || r6 == C32141af.LOADING_ANIMATE_TIMER || r6 == C32141af.AUTOPLAY_USING_TIMER) {
            this.A0P.setVisibility(0);
        } else {
            C32131ad.A00(this.A0P, 250, false);
        }
    }

    public final void A05() {
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView;
        if (this.A04 != null) {
            if (this.A0G) {
                this.A02.reverseTransition(100);
                this.A0G = false;
            }
            C32131ad.A00(this.A05, 100, false);
            A03(this, false);
            C32131ad.A00(this.A0B, 100, false);
            C32131ad.A00(this.A03, 100, false);
            A04(this, false);
            if (this.A0H && (scrubberPreviewThumbnailView = this.A0D) != null) {
                scrubberPreviewThumbnailView.setVisibility(8);
                ThumbView thumbView = this.A0D.A02;
                if (thumbView != null) {
                    thumbView.A01++;
                }
            }
        }
    }

    public final void A07(int i) {
        if (this.A04 != null) {
            setProgress(i);
        }
    }

    public void setVideoIconState(C32141af r4) {
        if (this.A0Q != r4) {
            A01();
            setVideoIconVisibility(r4);
            if (this.A06.getVisibility() == 0 && r4 == C32141af.PROGRESS_BAR_ONLY) {
                C32131ad.A00(this.A06, 250, false);
            } else if (!(this.A06.getVisibility() == 0 || r4 == C32141af.PROGRESS_BAR_ONLY)) {
                C32131ad.A00(this.A06, 250, true);
            }
            View view = this.A04;
            int i = 0;
            if (r4 == C32141af.HIDDEN) {
                i = 8;
            }
            view.setVisibility(i);
            this.A0Q = r4;
        }
    }

    public void setVisibility(int i) {
        if (i == 0 || !this.A0E) {
            C32131ad.A00(this.A06, 250, true);
            C06220Of.A0T(this.A04, i);
            return;
        }
        C32131ad.A00(this.A06, 250, false);
    }

    public static void A04(MediaActionsView mediaActionsView, boolean z) {
        mediaActionsView.A00();
        if (z && mediaActionsView.A0C.getVisibility() == 0) {
            return;
        }
        if (z || mediaActionsView.A0C.getVisibility() != 8) {
            mediaActionsView.A0F = true;
            mediaActionsView.A0C.setVisibility(0);
            AnimationSet animationSet = new AnimationSet(true);
            float f = 1.0f;
            if (z) {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (z) {
                f2 = 1.0f;
            }
            animationSet.addAnimation(new AlphaAnimation(f, f2));
            float f3 = 1.0f;
            if (z) {
                f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            float f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (z) {
                f4 = 1.0f;
            }
            float f5 = 1.0f;
            if (z) {
                f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            float f6 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (z) {
                f6 = 1.0f;
            }
            animationSet.addAnimation(new ScaleAnimation(f3, f4, f5, f6, 1, mediaActionsView.getTimePillScalePivotX(), 1, 0.5f));
            animationSet.setDuration(160);
            animationSet.setAnimationListener(new C149436aK(mediaActionsView, z));
            mediaActionsView.A0C.clearAnimation();
            mediaActionsView.A0C.setAnimation(animationSet);
        }
    }

    private float getTimePillScalePivotX() {
        A00();
        return ((this.A0C.getX() - this.A0I) / ((float) this.A0C.getWidth())) + 0.5f;
    }

    public final void A08(int i, boolean z) {
        A01();
        AnonymousClass11J.A00(this.A0P);
        String A032 = C15960no.A03((long) i);
        if (z) {
            A032 = String.format(Locale.getDefault(), this.A0P.getResources().getString(C0003R.string.video_time_remaining), new Object[]{A032});
        }
        this.A0P.setText(A032);
        this.A0P.requestLayout();
    }

    public MediaActionsView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MediaActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0Q = C32141af.HIDDEN;
        LayoutInflater.from(context).inflate(C0003R.layout.view_media_actions, this);
        this.A0N = (ViewStub) findViewById(C0003R.C0005id.video_actions_view_stub);
    }
}
