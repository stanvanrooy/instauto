package com.instagram.debug.image;

import android.widget.ImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000X.C177437hx;
import p000X.C51442Kr;

public class DebugImageViewsTrackerImpl implements C177437hx {
    public ImageViewRunnable mImageViewInitializer;
    public ImageViewRunnable mImageViewResetter;
    public final Map mUrlToViews = new HashMap();

    public interface ImageViewRunnable {
        void run(IgImageView igImageView);
    }

    public void updateDebugInfo(String str, C51442Kr r2) {
    }

    private void iterateAllImageViews(ImageViewRunnable imageViewRunnable) {
        if (imageViewRunnable != null) {
            for (Set<IgImageView> set : this.mUrlToViews.values()) {
                if (set != null) {
                    for (IgImageView run : set) {
                        imageViewRunnable.run(run);
                    }
                }
            }
        }
    }

    private void removeViewFromUrl(IgImageView igImageView, String str) {
        Set set;
        if (str != null && (set = (Set) this.mUrlToViews.get(str)) != null) {
            set.remove(igImageView);
            if (set.isEmpty()) {
                this.mUrlToViews.remove(str);
            }
        }
    }

    public void registerView(ImageView imageView) {
        ImageViewRunnable imageViewRunnable = this.mImageViewInitializer;
        if (imageViewRunnable != null && (imageView instanceof IgImageView)) {
            imageViewRunnable.run((IgImageView) imageView);
        }
    }

    public void reset() {
        iterateAllImageViews(this.mImageViewResetter);
        this.mUrlToViews.clear();
    }

    public void setImageViewInitializer(ImageViewInitializer imageViewInitializer) {
        iterateAllImageViews(this.mImageViewResetter);
        ImageViewRunnable imageViewRunnable = imageViewInitializer.mImageViewInitializer;
        this.mImageViewInitializer = imageViewRunnable;
        this.mImageViewResetter = imageViewInitializer.mImageViewResetter;
        iterateAllImageViews(imageViewRunnable);
    }

    public void unregisterView(ImageView imageView) {
        String str;
        if (imageView instanceof IgImageView) {
            IgImageView igImageView = (IgImageView) imageView;
            if (igImageView.getTypedUrl() != null) {
                str = igImageView.getTypedUrl().AZc();
            } else {
                str = null;
            }
            removeViewFromUrl(igImageView, str);
        }
    }

    public void updateUrl(ImageView imageView, String str, String str2) {
        registerView(imageView);
        if (imageView instanceof IgImageView) {
            IgImageView igImageView = (IgImageView) imageView;
            removeViewFromUrl(igImageView, str);
            Set set = (Set) this.mUrlToViews.get(str2);
            if (set == null) {
                set = new HashSet();
                this.mUrlToViews.put(str2, set);
            }
            set.add(igImageView);
        }
    }
}
