package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.forker.Process;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.12u  reason: invalid class name and case insensitive filesystem */
public final class C239912u extends C240012v {
    public final QuickPerformanceLogger A00;
    public final C240212x A01;
    public final String A02 = "GooglePlay";

    public C239912u(QuickPerformanceLogger quickPerformanceLogger, C240212x r3) {
        this.A00 = quickPerformanceLogger;
        this.A01 = r3;
    }

    private void A00(int i, String str) {
        String str2;
        C240212x r3 = this.A01;
        String str3 = null;
        String str4 = str;
        if (r3 != null) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (r3 == null) {
                str2 = "unknown";
            } else if (AnonymousClass0Q7.A03().A0H()) {
                str2 = AppStateModule.APP_STATE_BACKGROUND;
            } else {
                str2 = "foreground";
            }
            objArr[1] = str2;
            str3 = String.format("%s_foreground_state: %s", objArr);
        }
        this.A00.markerPoint(11337732, i, str4, str3, -1);
    }

    private void A01(int i, String str, String str2) {
        this.A00.markerAnnotate(11337732, i, str, str2);
    }

    public final void A02(int i, AnonymousClass917 r6) {
        String str;
        this.A00.markerStart(11337732, i);
        A01(i, "downloader", this.A02);
        Set set = r6.A02;
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        Arrays.sort(strArr);
        this.A00.markerAnnotate(11337732, i, "module_names", strArr);
        A01(i, "use_case", r6.A00());
        C240212x r0 = this.A01;
        if (r0 != null) {
            if (r0 == null) {
                str = "unknown";
            } else if (AnonymousClass0Q7.A03().A0H()) {
                str = AppStateModule.APP_STATE_BACKGROUND;
            } else {
                str = "foreground";
            }
            A01(i, "app_state", str);
        }
    }

    public final void A03(int i) {
        A00(i, "downloadModules");
    }

    public final void A06(int i, int i2) {
        this.A00.markerAnnotate(11337732, i, "googleDownloadId", i2);
    }

    public final void A07(int i, AnonymousClass917 r6) {
        this.A00.markerStart(11337732, i);
        A01(i, "downloader", this.A02);
        this.A00.markerAnnotate(11337732, i, "isOutOfProcess", 1);
        Set set = r6.A02;
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        Arrays.sort(strArr);
        this.A00.markerAnnotate(11337732, i, "module_names", strArr);
    }

    public final void A09(AnonymousClass917 r5, int i, int i2) {
        String str;
        int i3 = r5.A00;
        if (i2 == -200) {
            str = "unpack_error";
        } else if (i2 != -100) {
            switch (i2) {
                case -9:
                    str = "service_died";
                    break;
                case -8:
                    str = "incompatible_with_existing_session";
                    break;
                case -7:
                    str = "access_denied";
                    break;
                case -6:
                    str = "network_error";
                    break;
                case Process.SD_STDOUT /*-5*/:
                    str = "api_not_available";
                    break;
                case Process.SD_PIPE /*-4*/:
                    str = "session_not_found";
                    break;
                case Process.SD_BLACK_HOLE /*-3*/:
                    str = "invalid_request";
                    break;
                case -2:
                    str = "module_unavailable";
                    break;
                case -1:
                    str = "active_sessions_limit_exceeded";
                    break;
                case 0:
                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str = String.valueOf(i2);
                    break;
            }
        } else {
            str = "internal_error";
        }
        AnonymousClass8pN.A00(i);
        if (i2 != 0) {
            A01(i3, "error", str);
        }
        this.A00.markerEnd(11337732, i3, AnonymousClass8pN.A00(i));
    }

    public final void A04(int i) {
        A00(i, "showUserAck");
    }

    public final void A05(int i) {
        A00(i, "updateContext");
    }

    public final void A08(int i, BFP bfp) {
        String str;
        if (bfp.A06()) {
            A01(i, "deferred", "scheduled");
            return;
        }
        if (("failed: " + bfp.A04()) != null) {
            str = bfp.A04().getMessage();
        } else {
            str = "Unknown";
        }
        A01(i, "deferred", str);
    }

    public final void A0A(AnonymousClass917 r1, int i, int i2, long j, long j2) {
        A09(r1, i, i2);
    }
}
