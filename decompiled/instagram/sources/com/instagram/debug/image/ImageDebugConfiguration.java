package com.instagram.debug.image;

import com.instagram.debug.network.DebugNetworkShapingConfigurationFactory;
import com.instagram.debug.network.NetworkShapingConfiguration;
import p000X.C05770Lw;

public class ImageDebugConfiguration {
    public final boolean mLongClickToCopyUrl;
    public final NetworkShapingConfiguration mNetworkShapingConfig;
    public final OverlayDisplayMode mOverlayDisplayMode;
    public final boolean mShowCacheKey;
    public final boolean mShowFileSize;
    public final LoadSourceDisplayMode mShowLoadSource;
    public final boolean mShowOffscreenPixelsPerc;
    public final boolean mShowRes;
    public final boolean mShowResPerc;
    public final boolean mShowScans;

    public enum LoadSourceDisplayMode {
        HIDE,
        NAME,
        COLOR
    }

    public enum OverlayDisplayMode {
        NORMAL,
        TINY
    }

    public boolean isImageOverlayOn() {
        if (this.mShowLoadSource != LoadSourceDisplayMode.HIDE || this.mShowRes || this.mShowResPerc || this.mShowOffscreenPixelsPerc || this.mShowScans || this.mShowFileSize || this.mShowCacheKey) {
            return true;
        }
        return false;
    }

    public boolean isNetworkShapingOn() {
        return this.mNetworkShapingConfig.isNetworkShapingOn();
    }

    public boolean shouldOverrideLongClick() {
        return this.mLongClickToCopyUrl;
    }

    public ImageDebugConfiguration() {
        C05770Lw A00 = C05770Lw.A00();
        this.mOverlayDisplayMode = (OverlayDisplayMode) getEnumFromInt(OverlayDisplayMode.class, A00.A00.getInt("debug_image_overlay_display_mode", 0));
        this.mShowLoadSource = (LoadSourceDisplayMode) getEnumFromInt(LoadSourceDisplayMode.class, A00.A00.getInt("debug_image_overlay_load_source", 0));
        this.mShowRes = A00.A00.getBoolean("debug_image_overlay_image_res", false);
        this.mShowResPerc = A00.A00.getBoolean("debug_image_overlay_image_res_perc", false);
        this.mShowOffscreenPixelsPerc = A00.A00.getBoolean("debug_image_overlay_offscreen_pixels_perc", false);
        this.mShowScans = A00.A00.getBoolean("debug_image_overlay_scan_num", false);
        this.mShowFileSize = A00.A00.getBoolean("debug_image_overlay_file_size", false);
        this.mShowCacheKey = A00.A00.getBoolean("debug_image_overlay_cache_key", false);
        this.mNetworkShapingConfig = DebugNetworkShapingConfigurationFactory.createStaticConfiguration((long) A00.A00.getInt("debug_image_network_shaping_delay_per_chunk", 0), A00.A00.getInt("debug_image_network_shaping_fail_after_bytes", -1), A00.A00.getInt("debug_image_network_shaping_fail_probability", 1));
        this.mLongClickToCopyUrl = A00.A00.getInt("debug_image_interaction_long_click", 0) != 0;
    }

    public static Enum getEnumFromInt(Class cls, int i) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (i < 0 || i >= enumArr.length) {
            i = 0;
        }
        return ((Enum[]) cls.getEnumConstants())[i];
    }

    public boolean shouldTrackViews() {
        if (isImageOverlayOn() || this.mLongClickToCopyUrl) {
            return true;
        }
        return false;
    }
}
