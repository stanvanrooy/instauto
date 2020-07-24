package com.instagram.debug.image;

import com.instagram.debug.network.DebugNetworkShapingRequestCallbackWrapper;
import p000X.C169377Lu;
import p000X.C177437hx;

public class ImageDebugHelper {
    public static final String TAG = "IgImageDebugDevTools";
    public static ImageDebugHelper sInstance;
    public ImageDebugConfiguration mConfiguration;
    public DebugImageViewsTrackerImpl mDebugImageViewsTracker;
    public boolean mIsEnabled = false;

    public static ImageDebugHelper getInstance() {
        if (sInstance == null) {
            sInstance = new ImageDebugHelper();
        }
        return sInstance;
    }

    public C177437hx getDebugImageViewsTracker() {
        if (!this.mIsEnabled || !this.mConfiguration.shouldTrackViews()) {
            return null;
        }
        return this.mDebugImageViewsTracker;
    }

    public DebugNetworkShapingRequestCallbackWrapper getDebugNetworkCallbackWrapper() {
        if (!this.mIsEnabled || !this.mConfiguration.mNetworkShapingConfig.isNetworkShapingOn()) {
            return null;
        }
        return new DebugNetworkShapingRequestCallbackWrapper(this.mConfiguration.mNetworkShapingConfig, TAG);
    }

    public C169377Lu getDebugOverlayDrawer() {
        if (!this.mIsEnabled) {
            return null;
        }
        ImageDebugConfiguration imageDebugConfiguration = this.mConfiguration;
        if (imageDebugConfiguration.isImageOverlayOn()) {
            return new DebugOverlayDrawerImpl(imageDebugConfiguration);
        }
        return null;
    }

    public void setEnabled(boolean z) {
        this.mIsEnabled = z;
        ImageDebugConfiguration imageDebugConfiguration = new ImageDebugConfiguration();
        this.mConfiguration = imageDebugConfiguration;
        if (this.mIsEnabled) {
            if (this.mDebugImageViewsTracker == null) {
                this.mDebugImageViewsTracker = new DebugImageViewsTrackerImpl();
            }
            this.mDebugImageViewsTracker.setImageViewInitializer(new ImageViewInitializer(imageDebugConfiguration));
            if (!this.mConfiguration.shouldTrackViews()) {
                this.mDebugImageViewsTracker.reset();
                return;
            }
            return;
        }
        DebugImageViewsTrackerImpl debugImageViewsTrackerImpl = this.mDebugImageViewsTracker;
        if (debugImageViewsTrackerImpl != null) {
            debugImageViewsTrackerImpl.reset();
        }
    }

    public static void log(String str) {
    }
}
