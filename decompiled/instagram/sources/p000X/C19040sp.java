package p000X;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.ArrayList;

/* renamed from: X.0sp  reason: invalid class name and case insensitive filesystem */
public final class C19040sp {
    public final Bundle A00(DirectThreadKey directThreadKey, String str, String str2, boolean z, boolean z2, RectF rectF, String str3, String str4, boolean z3, ReelViewerConfig reelViewerConfig) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY", directThreadKey);
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID", str);
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT", str2);
        bundle.putBoolean("DirectStoryViewerFragment.ARGUMENTS_IS_REPLAY", z);
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
        bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FRAGMENT_ENTER_ANIMATION", 0);
        bundle.putString("DirectVisualMessageViewerFragment.REPLAY_SESSION_ID", str3);
        bundle.putString("DirectFragment.ENTRY_POINT", str4);
        bundle.putBoolean("DirectVisualMessageViewerFragment.NEEDS_THUMBNAIL_ANIMATION", z2);
        bundle.putBoolean("DirectVisualMessageViewerFragment.VISUAL_REPLIES_ENABLED", z3);
        bundle.putParcelable("DirectVisualMessageViewerFragment.VISUAL_MESSAGE_VIEWER_ARGUMENT_REEL_VIEWER_CONFIG", reelViewerConfig);
        return bundle;
    }

    public final Bundle A01(DirectCameraViewModel directCameraViewModel, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, RectF rectF, RectF rectF2) {
        C86323oq.A07(str4);
        Bundle bundle = new Bundle();
        bundle.putParcelable("DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL", directCameraViewModel);
        bundle.putParcelable("DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY", directThreadKey);
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID", str);
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT", str2);
        bundle.putString("DirectVisualReplyFragment.REPLY_CAM_ARG_REPLY_TYPE", str3);
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_EXIT_VIEW_BOUNDS", rectF2);
        bundle.putString("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", str4);
        bundle.putBoolean("DirectVisualReplyFragment.REPLY_CAM_ARG_OPEN_TEXT_MODE", false);
        bundle.putBoolean("DirectVisualReplyFragment.REPLY_CAM_ARG_OPEN_TEXT_MODE_WITH_OPAQUE_TRANSPARENCY", false);
        return bundle;
    }

    public final Bundle A02(String str, String str2, ArrayList arrayList, boolean z, int i, String str3, String str4, String str5, Uri uri, Bundle bundle, String str6) {
        if (str == null && arrayList == null) {
            AnonymousClass0QD.A02("DirectFragmentArgumentsImpl", "Both thread ID and recipients are null.");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", str);
        if (str2 != null) {
            bundle2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID", str2);
        }
        if (arrayList != null) {
            bundle2.putParcelableArrayList("DirectFragment.ARGUMENT_RECIPIENTS", arrayList);
        }
        bundle2.putBoolean("DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS", z);
        bundle2.putInt("DirectThreadFragment.ARGUMENT_OPEN_TO", i);
        bundle2.putString("DirectFragment.ENTRY_POINT", str3);
        if (str4 != null) {
            bundle2.putString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID", str4);
        }
        if (str5 != null) {
            bundle2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PREFILL_TEXT", str5);
        }
        if (uri != null) {
            bundle2.putParcelable("DirectFragment.DIRECT_FRAGMENT_EXTERNAL_SHARE_PHOTO_URI", uri);
        }
        if (bundle != null) {
            bundle2.putBundle("DirectFragment.DIRECT_FRAGMENT_EXTERNAL_SHARE_PHOTO_BUNDLE", bundle);
        }
        if (str6 != null) {
            bundle2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ORIGIN_FILTER", str6);
        }
        return bundle2;
    }
}
