package p000X;

import android.content.Context;
import com.facebook.redex.dynamicanalysis.DynamicAnalysis;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.1pl  reason: invalid class name and case insensitive filesystem */
public final class C41101pl extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41101pl(C37531jo r3) {
        super("maybeSetupDynamicAnalysis", 369);
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r1 == false) goto L_0x0067;
     */
    public final void A00() {
        boolean z;
        boolean z2;
        String str;
        C37531jo r0 = this.A00;
        Context context = r0.A06;
        AnonymousClass0C1 r6 = r0.A07;
        boolean z3 = false;
        if (DynamicAnalysis.sNumStaticallyInstrumented > 0) {
            z3 = true;
        }
        if (z3) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date());
            int i = instance.get(7);
            AnonymousClass0L7 r3 = AnonymousClass0L7.REDEX_DYNAMIC_ANALYSIS;
            int intValue = ((Integer) AnonymousClass0L6.A02(r6, r3, "enabled_days_of_week", 167, (AnonymousClass04H) null)).intValue();
            int i2 = intValue;
            while (true) {
                if (i2 == 0) {
                    z = false;
                    break;
                } else if (i2 % 10 == i) {
                    z = true;
                    break;
                } else {
                    i2 /= 10;
                }
            }
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r6, r3, "is_enabled", true, (AnonymousClass04H) null)).booleanValue();
            boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(r6, r3, "is_method_traces_upload_enabled", false, (AnonymousClass04H) null)).booleanValue();
            if (z && booleanValue) {
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                Object[] objArr = new Object[6];
                objArr[0] = Boolean.valueOf(booleanValue);
                objArr[1] = Boolean.valueOf(booleanValue2);
                objArr[2] = Boolean.valueOf(z);
                objArr[3] = Integer.valueOf(i);
                if (z) {
                    str = " ";
                } else {
                    str = " not ";
                }
                objArr[4] = str;
                objArr[5] = Integer.valueOf(intValue);
                AnonymousClass0DB.A0K("DYNA|IgDynamicAnalysisManager", "The app is instrumented, but uploading is disabled: enabled: %b, upload: %b, enabledDay: %b (%d%sin %d)", objArr);
                DynamicAnalysis.A00();
                return;
            }
            AnonymousClass0Q7.A03().A03.add(new A1m(context, r6));
            AnonymousClass0DB.A0K("DYNA|IgDynamicAnalysisManager", "The app is instrumented, and uploading is scheduled: today (%d) is in enabled days (%d)", Integer.valueOf(i), Integer.valueOf(intValue));
        }
    }
}
