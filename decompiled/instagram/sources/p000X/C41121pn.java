package p000X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher;
import com.google.common.collect.ImmutableMap;
import com.instagram.igpermissionsnapshots.IGPrivacyPermissionSnapshotsLogger;

/* renamed from: X.1pn  reason: invalid class name and case insensitive filesystem */
public final class C41121pn extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41121pn(C37531jo r3) {
        super("igPermissionSnapshots", 622);
        this.A00 = r3;
    }

    public final void A00() {
        PackageInfo packageInfo;
        ImmutableMap immutableMap;
        C37531jo r0 = this.A00;
        AnonymousClass285 r9 = new AnonymousClass285(r0.A06, r0.A07);
        PackageInfo packageInfo2 = null;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r9.A02, AnonymousClass0L7.CLIENT_PERMISSION_SNAPSHOTS_ANDROID, "enabled", false, (AnonymousClass04H) null)).booleanValue();
        AnonymousClass28D r02 = r9.A01;
        int A002 = r02.A00() - r02.A01();
        boolean z = false;
        if (A002 >= 604800) {
            z = true;
        }
        if (booleanValue && z) {
            IGPrivacyPermissionSnapshotsLogger iGPrivacyPermissionSnapshotsLogger = new IGPrivacyPermissionSnapshotsLogger(r9.A00, r9.A02);
            AnonymousClass0C1 r8 = r9.A02;
            try {
                PrivacyPermissionStatusesFetcher privacyPermissionStatusesFetcher = iGPrivacyPermissionSnapshotsLogger.A02;
                try {
                    packageInfo = privacyPermissionStatusesFetcher.A00.getPackageManager().getPackageInfo(privacyPermissionStatusesFetcher.A01, 4096);
                    packageInfo2 = packageInfo;
                } catch (PackageManager.NameNotFoundException e) {
                    AnonymousClass0DB.A0R("com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher", e, "Package name not found %s", privacyPermissionStatusesFetcher.A01);
                    packageInfo = null;
                }
                if (packageInfo == null) {
                    immutableMap = ImmutableMap.A01(PrivacyPermissionStatusesFetcher.A02);
                } else {
                    immutableMap = ImmutableMap.A01(privacyPermissionStatusesFetcher.getAppPermissionsAndStatuses(packageInfo2));
                }
                Long valueOf = Long.valueOf((long) iGPrivacyPermissionSnapshotsLogger.A03.A01());
                if (valueOf.longValue() == 0) {
                    valueOf = Long.valueOf((long) iGPrivacyPermissionSnapshotsLogger.A03.A00());
                }
                C51992Mz r2 = new C51992Mz(AnonymousClass0QT.A00(r8, r9).A02("ig_privacy_permissions_snapshot"));
                if (r2.A0B()) {
                    r2.A07("last_lookup_timestamp", valueOf);
                    r2.A0A("permission_statuses", immutableMap);
                    r2.A01();
                    AnonymousClass28D r1 = iGPrivacyPermissionSnapshotsLogger.A03;
                    int A003 = r1.A00();
                    if (A003 < 0) {
                        try {
                            AnonymousClass0DB.A0F("IGPrivacyPermissionLastLookupStore", "OverflowError - Saving negative timestamp values");
                            A003 = 0;
                        } catch (ClassCastException e2) {
                            AnonymousClass0DB.A0O("IGPrivacyPermissionLastLookupStore", e2, "ClassCastException while saving last lookup timestamp");
                            return;
                        }
                    }
                    r1.A00.edit().putInt("ig_pps_last_lookup_time_seconds", A003).apply();
                }
            } catch (NullPointerException e3) {
                AnonymousClass0DB.A0M("com.instagram.igpermissionsnapshots.IGPrivacyPermissionSnapshotsLogger", e3, "Last lookup stamp might not be available.");
            }
        }
    }
}
