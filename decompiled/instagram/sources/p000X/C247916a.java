package p000X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import java.io.File;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.16a  reason: invalid class name and case insensitive filesystem */
public final class C247916a implements AnonymousClass0C2 {
    public AnonymousClass0Q6 A00;
    public boolean A01;

    public final void onUserSessionWillEnd(boolean z) {
        if (this.A01) {
            AnonymousClass0Q7.A03().A0D(this.A00);
        }
    }

    public C247916a(Context context, AnonymousClass0C1 r8) {
        AnonymousClass0L7 r3;
        int i;
        String str;
        if (((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.DEAD_CODE_DETECTION, "is_class_logging_allowed", false, (AnonymousClass04H) null)).booleanValue()) {
            if (ClassTracingLogger.isEnabled()) {
                this.A01 = true;
                if (AnonymousClass0DA.A02(context)) {
                    File A012 = AnonymousClass0DA.A01(context);
                    if (A012.exists()) {
                        File A002 = AnonymousClass0DA.A00(context);
                        File[] listFiles = A012.listFiles();
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                if (!file.equals(A002)) {
                                    C44731wf.A02(file);
                                }
                            }
                        }
                    }
                }
                this.A00 = new C248216d(this, context, r8);
            }
            if (C14090jk.A01(r8)) {
                r3 = AnonymousClass0L7.DEAD_CODE_DETECTION;
                i = 10;
                str = "class_logging_coinflip_rate_employees";
            } else if (C06610Ps.A01() || C06610Ps.A02()) {
                r3 = AnonymousClass0L7.DEAD_CODE_DETECTION;
                i = 25;
                str = "class_logging_coinflip_rate_beta";
            } else {
                r3 = AnonymousClass0L7.DEAD_CODE_DETECTION;
                i = 100;
                str = "class_logging_coinflip_rate";
            }
            boolean z = new Random().nextInt(((Integer) AnonymousClass0L6.A02(r8, r3, str, i, (AnonymousClass04H) null)).intValue()) == 0;
            try {
                HashSet<String> hashSet = new HashSet<>();
                for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services) {
                    hashSet.add(serviceInfo.processName);
                }
                for (String A0E : hashSet) {
                    AnonymousClass0FU.A05(context, AnonymousClass000.A0E("classtracinglogger_enable_", A0E), z);
                }
            } catch (PackageManager.NameNotFoundException e) {
                AnonymousClass0DB.A05(ClassTracingLogger.TAG, "Package manager failed. Not logging.", e);
            }
            AnonymousClass0FU.A05(context, "mdcd_multiprocess_enable", z ? 1 : 0);
            Boolean valueOf = Boolean.valueOf(z);
            for (String A0E2 : C06600Pr.A00(context)) {
                AnonymousClass0FU.A05(context, AnonymousClass000.A0E("nativemetrics_", A0E2), valueOf.booleanValue() ? 1 : 0);
            }
        }
    }

    public final void onUserSessionStart(boolean z) {
        int A03 = AnonymousClass0Z0.A03(-1492744420);
        if (this.A01) {
            AnonymousClass0Q7.A03().A0B(this.A00);
        }
        AnonymousClass0Z0.A0A(609069902, A03);
    }
}
