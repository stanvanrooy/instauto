package p000X;

import android.os.Bundle;

/* renamed from: X.CJV */
public final class CJV {
    public final AK5 A00(AnonymousClass0C1 r7, instagramComment r8, boolean z, boolean z2) {
        CJM cjm = new CJM();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
        bundle.putString("SelfRemediationBottomSheetFragment.COMMENTER_USER_ID", r8.AZf().getId());
        bundle.putString("SelfRemediationBottomSheetFragment.ARG_COMMENT_ID", r8.AS8());
        bundle.putString("SelfRemediationBottomSheetFragment.COMMENT_MEDIA_ID", r8.mediaId);
        bundle.putBoolean("SelfRemediationBottomSheetFragment.ARG_SHOW_RESTRICT_ACTIONS", z);
        bundle.putBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED", true);
        bundle.putFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO", 0.7f);
        bundle.putBoolean("SelfRemediationBottomSheetFragment.ARG_KEEP_OPEN_AFTER_ACTION", z2);
        cjm.setArguments(bundle);
        return cjm;
    }
}
