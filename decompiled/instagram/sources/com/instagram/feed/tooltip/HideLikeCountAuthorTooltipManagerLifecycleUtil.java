package com.instagram.feed.tooltip;

public final class HideLikeCountAuthorTooltipManagerLifecycleUtil {
    public static void cleanupReferences(HideLikeCountAuthorTooltipManager hideLikeCountAuthorTooltipManager) {
        hideLikeCountAuthorTooltipManager.mContext = null;
    }
}
