package com.facebook.browser.lite.extensions.watchandbrowse;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class BrowserLiteHeaderLoadingScreen extends FrameLayout {
    public ObjectAnimator A00;
    public View A01 = this.A04.findViewById(0);
    public View A02 = this.A04.findViewById(0);
    public View A03 = this.A04.findViewById(0);
    public View A04;
    public ImageView A05 = ((ImageView) this.A04.findViewById(0));
    public TextView A06 = ((TextView) this.A04.findViewById(0));
    public TextView A07 = ((TextView) this.A04.findViewById(0));
    public TextView A08 = ((TextView) this.A04.findViewById(0));
    public TextView A09;
    public TextView A0A = ((TextView) this.A04.findViewById(0));
    public TextView A0B = ((TextView) this.A04.findViewById(0));
    public BrowserLiteProgressBar A0C;
    public ArrayList A0D;
    public boolean A0E;
    public boolean A0F;

    public void setSocialContextCommentString(String str) {
        if (str != null) {
            getContext().getString(0, new Object[]{str});
        }
    }

    public void setSocialContextMessageVisibility(int i) {
        this.A03.setVisibility(i);
    }

    public void setSocialContextReactionString(String str) {
        if (str != null) {
            getContext().getString(0, new Object[]{str});
        }
    }

    public void setSocialContextReshareString(String str) {
        if (str != null) {
            getContext().getString(0, new Object[]{str});
        }
    }

    public void setTitleText(String str) {
        if (!this.A0F) {
            this.A0A.setText(str);
            this.A0A.setVisibility(0);
            this.A0B.setVisibility(0);
            this.A09.setVisibility(8);
        }
    }

    public BrowserLiteHeaderLoadingScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(getContext()).inflate(0, this, false);
        this.A04 = inflate;
        addView(inflate);
        TextView textView = (TextView) this.A04.findViewById(0);
        this.A09 = textView;
        textView.setText(0);
        BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) ((ViewStub) findViewById(0)).inflate();
        this.A0C = browserLiteProgressBar;
        browserLiteProgressBar.getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.A0C.setProgress(0);
        this.A0C.setVisibility(0);
        this.A0C.setMax(1000);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.A0C, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{0, 990});
        this.A00 = ofInt;
        ofInt.setDuration(10000);
        this.A00.setInterpolator(new DecelerateInterpolator(4.0f));
        this.A00.start();
        this.A04.setVisibility(0);
        this.A0E = true;
        this.A0D = new ArrayList();
    }

    public int getBottomCallToActionButtonHeight() {
        return getContext().getResources().getDimensionPixelSize(0);
    }

    public int getHeaderLoadingScreenProfilePictureHeight() {
        return getContext().getResources().getDimensionPixelSize(0);
    }

    public ImageView getProfilePictureImageView() {
        return this.A05;
    }

    public void setBottomCallToActionButton(String str, View.OnClickListener onClickListener) {
        if (!TextUtils.isEmpty(str)) {
            this.A01.setVisibility(0);
            this.A01.setOnClickListener(onClickListener);
            this.A06.setText(str);
            this.A03.setVisibility(0);
            if (this.A0E) {
                this.A08.setText(getContext().getString(0));
            }
        }
    }

    public void setCallToActionButton(String str, View.OnClickListener onClickListener) {
        if (!TextUtils.isEmpty(str)) {
            this.A02.setVisibility(0);
            this.A02.setOnClickListener(onClickListener);
            this.A07.setText(str);
        }
    }

    public void setURLText(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = new URI(str).getHost();
            } catch (URISyntaxException unused) {
            }
            this.A09.setText(getContext().getString(0, new Object[]{str}));
            this.A0B.setText(str);
        }
    }

    public void setAnimationSocialContextFirst(boolean z) {
    }

    public void setLoadingScreenDisplayUrlEnabled(boolean z) {
        this.A0F = z;
    }

    public void setSocialContextSupplementalString(String str) {
    }

    public void setWatchAndBrowseSocialContextEnabled(boolean z) {
    }

    public void setWatchAndInstallDefaultMessageEnabled(boolean z) {
        this.A0E = z;
    }
}
