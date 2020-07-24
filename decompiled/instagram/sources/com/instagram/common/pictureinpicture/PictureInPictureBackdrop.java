package com.instagram.common.pictureinpicture;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import p000X.C182187qE;

public class PictureInPictureBackdrop {
    public static boolean A00;
    public View mDecorView;
    public View.OnAttachStateChangeListener mOnAttachStateChangeListener;
    public View mTransparentPipBackdrop;
    public WindowManager mWindowManager;

    public static void A00(PictureInPictureBackdrop pictureInPictureBackdrop, IBinder iBinder) {
        if (pictureInPictureBackdrop.mTransparentPipBackdrop == null) {
            pictureInPictureBackdrop.mTransparentPipBackdrop = new View(pictureInPictureBackdrop.mDecorView.getContext());
        }
        if (pictureInPictureBackdrop.mTransparentPipBackdrop.getParent() == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, 131096, -3);
            layoutParams.token = iBinder;
            pictureInPictureBackdrop.mWindowManager.addView(pictureInPictureBackdrop.mTransparentPipBackdrop, layoutParams);
        }
    }

    public final void A01() {
        if (A00) {
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.mOnAttachStateChangeListener;
            if (onAttachStateChangeListener != null) {
                this.mDecorView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                this.mOnAttachStateChangeListener = null;
            }
            View view = this.mTransparentPipBackdrop;
            if (view != null && view.getParent() != null) {
                this.mWindowManager.removeViewImmediate(this.mTransparentPipBackdrop);
            }
        }
    }

    public final void A02() {
        if (!A00) {
            return;
        }
        if (this.mDecorView.getWindowToken() != null) {
            A00(this, this.mDecorView.getWindowToken());
        } else if (this.mOnAttachStateChangeListener == null) {
            C182187qE r1 = new C182187qE(this);
            this.mOnAttachStateChangeListener = r1;
            this.mDecorView.addOnAttachStateChangeListener(r1);
        }
    }

    public PictureInPictureBackdrop(Activity activity) {
        this.mWindowManager = (WindowManager) activity.getSystemService("window");
        this.mDecorView = activity.getWindow().getDecorView();
    }
}
