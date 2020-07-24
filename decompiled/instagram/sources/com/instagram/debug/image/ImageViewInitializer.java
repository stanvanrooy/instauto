package com.instagram.debug.image;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.debug.image.DebugImageViewsTrackerImpl;
import p000X.C53642Tq;

public class ImageViewInitializer {
    public final ImageDebugConfiguration mConfiguration;
    public final DebugImageViewsTrackerImpl.ImageViewRunnable mImageViewInitializer = new DebugImageViewsTrackerImpl.ImageViewRunnable() {
        public void run(IgImageView igImageView) {
            if (ImageViewInitializer.this.mConfiguration.mLongClickToCopyUrl) {
                igImageView.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        ImageViewInitializer.setCopyUrlOnLongClick((IgImageView) view);
                        return false;
                    }
                });
            }
        }
    };
    public final DebugImageViewsTrackerImpl.ImageViewRunnable mImageViewResetter = new DebugImageViewsTrackerImpl.ImageViewRunnable() {
        public void run(IgImageView igImageView) {
            if (ImageViewInitializer.this.mConfiguration.mLongClickToCopyUrl) {
                igImageView.setOnLongClickListener((View.OnLongClickListener) null);
            }
        }
    };

    public ImageViewInitializer(ImageDebugConfiguration imageDebugConfiguration) {
        this.mConfiguration = imageDebugConfiguration;
    }

    public static void setCopyUrlOnLongClick(IgImageView igImageView) {
        String str;
        if (igImageView.getTypedUrl() != null) {
            str = igImageView.getTypedUrl().AZc();
        } else {
            str = null;
        }
        Context context = igImageView.getContext();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (str == null) {
            str = "null";
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Image URL", str));
        igImageView.getContext();
        C53642Tq.A01(context, "Copied URL to clipboard", 0).show();
    }

    public DebugImageViewsTrackerImpl.ImageViewRunnable getInitializer() {
        return this.mImageViewInitializer;
    }

    public DebugImageViewsTrackerImpl.ImageViewRunnable getResetter() {
        return this.mImageViewResetter;
    }
}
