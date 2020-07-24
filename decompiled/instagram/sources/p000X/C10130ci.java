package p000X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.rti.push.service.FbnsService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0ci  reason: invalid class name and case insensitive filesystem */
public final class C10130ci extends AnonymousClass0VD {
    public static final List A01 = new ArrayList(AnonymousClass0UP.A00);
    public final FbnsService A00;

    public C10130ci(FbnsService fbnsService, AnonymousClass0UR r8, C10930e7 r9) {
        super(fbnsService, r8, r9, AnonymousClass0VH.A00(fbnsService.A0D()), Constants.ZERO);
        this.A00 = fbnsService;
    }

    public final void A03(String str, Intent intent) {
        FbnsService fbnsService = this.A00;
        String str2 = intent.getPackage();
        AnonymousClass0X1 r2 = fbnsService.A01;
        Map A002 = C07200Sd.A00("event_type", C08420Wy.A00(Constants.A15));
        if (!TextUtils.isEmpty(str)) {
            A002.put("event_extra_info", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            A002.put("dpn", str2);
        }
        r2.A04("fbns_message_event", A002);
        fbnsService.A02.Aj2(AnonymousClass000.A0N("Redeliver Notif: notifId = ", str, "; target = ", str2));
    }

    public final void A04(String str, String str2, AnonymousClass0UM r9) {
        FbnsService fbnsService = this.A00;
        String r5 = r9.toString();
        AnonymousClass0X1 r3 = fbnsService.A01;
        Map A002 = C07200Sd.A00("event_type", C08420Wy.A00(Constants.A0N));
        if (!TextUtils.isEmpty(str)) {
            A002.put("event_extra_info", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            A002.put("dpn", str2);
        }
        A002.put("result", r5);
        r3.A04("fbns_message_event", A002);
        fbnsService.A02.Aj2(AnonymousClass000.A0E("Error: Fail to deliver notifId = ", str));
    }

    public final boolean A05(AnonymousClass0VF r4) {
        AnonymousClass0UM A002 = A00(this, r4.A00);
        if (A002.A00()) {
            A01().A00(r4.A01);
            A04(r4.A01, r4.A00.getPackage(), A002);
        } else if (!A002.A01()) {
            r4.A00.getPackage();
        }
        return A002.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (p000X.AnonymousClass0UP.A01.contains(r5) != false) goto L_0x0050;
     */
    public static AnonymousClass0UM A00(C10130ci r6, Intent intent) {
        AnonymousClass0UM r4;
        boolean z;
        String str = intent.getPackage();
        if (!"com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction())) {
            return AnonymousClass0UM.DATA_INVALID;
        }
        AnonymousClass0UR r2 = r6.A04;
        if (TextUtils.isEmpty(str)) {
            r4 = AnonymousClass0UM.PACKAGE_INVALID;
        } else {
            if (!str.equals(r2.A00.getPackageName())) {
                if (!AnonymousClass0UP.A00.contains(str)) {
                    z = false;
                }
                z = true;
                if (z) {
                    switch (AnonymousClass0TR.A00(r2.A00, str, 64).A02.intValue()) {
                        case 1:
                            r4 = AnonymousClass0UM.PACKAGE_NOT_INSTALLED;
                            break;
                        case 2:
                            r4 = AnonymousClass0UM.PACKAGE_DISABLED;
                            break;
                        case 3:
                            r4 = AnonymousClass0UM.PACKAGE_UNSUPPORTED;
                            break;
                        case 5:
                            r4 = AnonymousClass0UM.PACKAGE_NOT_TRUSTED;
                            break;
                        case 6:
                            break;
                        default:
                            r4 = AnonymousClass0UM.PACKAGE_FAILED;
                            break;
                    }
                } else {
                    r4 = AnonymousClass0UM.PACKAGE_INCOMPATIBLE;
                }
            }
            r4 = AnonymousClass0UM.PACKAGE_TRUSTED;
        }
        if (r4 != AnonymousClass0UM.PACKAGE_TRUSTED) {
            FbnsService fbnsService = r6.A00;
            fbnsService.A01.A02(Constants.A12, r4.name(), str);
            fbnsService.A02.Aj2("Error: isTrusted() failed");
            return r4;
        }
        AnonymousClass0UM A012 = r6.A04.A01(intent, str);
        if (!A012.A01()) {
            FbnsService fbnsService2 = r6.A00;
            fbnsService2.A01.A02(Constants.A14, (String) null, str);
            fbnsService2.A02.Aj2("Error: secure-broadcast failed");
        }
        return A012;
    }

    public final long A02(String str, String str2, boolean z) {
        long A02 = super.A02(str, str2, z);
        FbnsService fbnsService = this.A00;
        AnonymousClass0X1 r5 = fbnsService.A01;
        Map A002 = C07200Sd.A00("event_type", C08420Wy.A00(Constants.A0Y));
        if (!TextUtils.isEmpty(str)) {
            A002.put("event_extra_info", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            A002.put("dpn", str2);
        }
        A002.put("delivery_delay", String.valueOf(A02));
        r5.A04("fbns_message_event", A002);
        C10140cj r4 = fbnsService.A02;
        r4.Aj2("ACK from " + str2 + ": notifId = " + str + "; delay = " + A02);
        return A02;
    }
}
