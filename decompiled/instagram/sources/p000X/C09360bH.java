package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.MessageQueue;

/* renamed from: X.0bH  reason: invalid class name and case insensitive filesystem */
public final class C09360bH extends C09790c1 {
    public C12600h4 A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Context A06;
    public final MessageQueue A07 = Looper.myQueue();

    public C09360bH(Context context, long j, long j2, long j3, long j4, long j5) {
        this.A06 = context;
        this.A02 = j;
        this.A04 = j2;
        this.A05 = j3;
        this.A03 = j4;
        this.A01 = j5;
    }

    public final void A06() {
        super.A06();
        this.A04.add(C08560Xo.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    public final void A07() {
        long j;
        String str;
        String str2;
        Intent A002;
        String str3;
        int A032 = AnonymousClass0Z0.A03(941162308);
        C12600h4 A003 = C12600h4.A00();
        this.A00 = A003;
        Context context = this.A06;
        C12600h4.A01(A003, context, Constants.ZERO, this.A02, this.A07);
        AnonymousClass0h8 r0 = A003.A00;
        if (!(r0 == null || !r0.A04 || (A002 = A003.A05.A00()) == null)) {
            String str4 = "null";
            if (A002.getComponent() != null) {
                str3 = A002.getComponent().getClassName();
            } else {
                str3 = str4;
            }
            if (A002.getAction() != null) {
                str4 = A002.getAction();
            }
            A003.A04.markerAnnotate(25100291, "cold_start_intent", AnonymousClass000.A0J(str3, ":", str4));
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            long j2 = C05790Ly.A00(context).getLong("first_app_start_after_install_or_upgrade_timestamp", -1);
            long j3 = packageInfo.firstInstallTime;
            long max = Math.max(j3, packageInfo.lastUpdateTime);
            if (max > j2) {
                boolean z = true;
                int i = (max > j3 ? 1 : (max == j3 ? 0 : -1));
                boolean z2 = false;
                if (i == 0) {
                    z2 = true;
                }
                A003.A06 = z2;
                if (max != packageInfo.lastUpdateTime) {
                    z = false;
                }
                A003.A07 = z;
                C05790Ly.A00(context).edit().putLong("first_app_start_after_install_or_upgrade_timestamp", max).apply();
            }
        } catch (PackageManager.NameNotFoundException e) {
            th = e;
            str = "AppStartupTracker";
            str2 = "NameNotFoundException";
            AnonymousClass0DB.A0I(str, str2, th);
            this.A00.A08("RELIABILITY_INITIALIZED", this.A04);
            j = this.A05;
            if (j != -1) {
            }
            this.A00.A08("MULTIDEX_INSTALLED", this.A03);
            this.A00.A08("APP_ONCREATE_START", this.A01);
            AnonymousClass0Z0.A0A(-1647351129, A032);
        } catch (Throwable th) {
            th = th;
            str = "AppStartupTracker";
            str2 = "unknown throwable when checking first run state";
            AnonymousClass0DB.A0I(str, str2, th);
            this.A00.A08("RELIABILITY_INITIALIZED", this.A04);
            j = this.A05;
            if (j != -1) {
            }
            this.A00.A08("MULTIDEX_INSTALLED", this.A03);
            this.A00.A08("APP_ONCREATE_START", this.A01);
            AnonymousClass0Z0.A0A(-1647351129, A032);
        }
        this.A00.A08("RELIABILITY_INITIALIZED", this.A04);
        j = this.A05;
        if (j != -1) {
            this.A00.A08("SOLOADER_INITIALIZED", j);
        }
        this.A00.A08("MULTIDEX_INSTALLED", this.A03);
        this.A00.A08("APP_ONCREATE_START", this.A01);
        AnonymousClass0Z0.A0A(-1647351129, A032);
    }
}
