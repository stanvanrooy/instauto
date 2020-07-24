package com.instagram.igpermissionsnapshots;

import android.content.Context;
import com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass28D;

public final class IGPrivacyPermissionSnapshotsLogger {
    public Context A00;
    public AnonymousClass0C1 A01;
    public final PrivacyPermissionStatusesFetcher A02 = new PrivacyPermissionStatusesFetcher(this.A00);
    public final AnonymousClass28D A03;

    public IGPrivacyPermissionSnapshotsLogger(Context context, AnonymousClass0C1 r4) {
        this.A00 = context;
        this.A01 = r4;
        this.A03 = new AnonymousClass28D(r4);
    }
}
