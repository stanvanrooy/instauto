package p000X;

import android.os.Bundle;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.0pa  reason: invalid class name and case insensitive filesystem */
public final class C17040pa {
    public final AnonymousClass1HD A00() {
        AnonymousClass5DA r3 = AnonymousClass5DA.ALL_SETTINGS;
        C119965Cr r2 = new C119965Cr();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_MODE", r3);
        r2.setArguments(bundle);
        return r2;
    }

    public final AnonymousClass1HD A01(Bundle bundle) {
        ReelViewerFragment reelViewerFragment = new ReelViewerFragment();
        reelViewerFragment.setArguments(bundle);
        return reelViewerFragment;
    }
}
