package p000X;

import android.content.Context;
import android.location.Location;
import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: X.1lQ  reason: invalid class name and case insensitive filesystem */
public final class C38531lQ {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public C38571lU A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final C04140Cp A0D;
    public final AnonymousClass0C1 A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final int A0H;
    public final String A0I;
    public final boolean A0J;

    public static void A00(C38531lQ r5, Context context, AnonymousClass0RN r7, AnonymousClass1NJ r8, String str, boolean z, boolean z2) {
        long j;
        String str2;
        C40851pM r2 = new C40851pM(AnonymousClass0QT.A00(r5.A0E, r7).A02("perf_percent_photos_rendered"));
        r2.A08("media_id", str);
        r2.A04("is_grid_view", Boolean.valueOf(z));
        r2.A04("rendered", Boolean.valueOf(r5.A09));
        r2.A04("is_carousel", Boolean.valueOf(z2));
        r2.A04("did_fallback_render", Boolean.valueOf(r5.A0A));
        if (r5.A0J && (str2 = r5.A08) != null) {
            r2.A08("rendered_url", str2);
        }
        String str3 = r5.A07;
        if (str3 != null) {
            r2.A08("load_source", str3);
        }
        if (r8 != null) {
            AnonymousClass18O BWk = AnonymousClass18D.A03.BWk(r8.A0v(context));
            String str4 = BWk.A02;
            if (r8.A0q() != null) {
                r8 = r8.A0Q(r5.A0E);
            }
            r2.A04("is_ad", Boolean.valueOf(r8.Aho()));
            if (str4 != null) {
                r2.A08("trace_token", str4);
            }
            int A002 = AnonymousClass18D.A00(BWk);
            if (A002 != -1) {
                r2.A06("target_scan", Integer.valueOf(A002));
            }
        }
        C38571lU r0 = r5.A06;
        if (r0 != null) {
            r2.A06("scan_number", Integer.valueOf(r0.A00.getCurrentScans()));
        }
        if (!r5.A09) {
            r2.A05("image_attempted_height", Double.valueOf((double) r5.A00));
            r2.A05("image_attempted_width", Double.valueOf((double) r5.A01));
            j = r5.A03;
        } else {
            j = r5.A04;
        }
        r2.A07("load_time_ms", Long.valueOf(j));
        int i = r5.A02;
        if (i > 0) {
            r2.A06("image_size_kb", Integer.valueOf(i));
        }
        C15700nO A003 = C15700nO.A00();
        double A012 = A003.A01();
        long A022 = A003.A02();
        long A032 = A003.A03();
        if (A012 != -1.0d) {
            r2.A05("estimated_bandwidth", Double.valueOf(A012));
            r2.A07("estimated_bandwidth_totalBytes_b", Long.valueOf(A022));
            r2.A07("estimated_bandwidth_totalTime_ms", Long.valueOf(A032));
        }
        r2.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0134, code lost:
        if (r11.A0A != false) goto L_0x0136;
     */
    public static void A01(C38531lQ r11, Context context, AnonymousClass0RN r13, AnonymousClass1NJ r14, String str, boolean z, boolean z2, Integer num) {
        String str2;
        short s;
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "URL", r11.A0I);
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "TIME_ON_VIEWPORT", r11.A03);
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "MODULE", r13.getModuleName());
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "MEDIA_ID", str);
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "IS_GRID_VIEW", z);
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "RENDERED", r11.A09);
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "IS_CAROUSEL", z2);
        AnonymousClass00B r4 = AnonymousClass00B.A01;
        int i = r11.A0C;
        switch (num.intValue()) {
            case 1:
                str2 = "old_impression_tracker";
                break;
            case 2:
                str2 = "others";
                break;
            default:
                str2 = "viewpoint";
                break;
        }
        r4.markerAnnotate(23396355, i, "LOGGING_FRAMEWORK", str2);
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "DID_FALLBACK_RENDER", r11.A0A);
        String str3 = r11.A07;
        if (str3 != null) {
            AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "LOAD_SOURCE", str3);
        }
        if (r14 != null) {
            AnonymousClass18O BWk = AnonymousClass18D.A03.BWk(r14.A0v(context));
            String str4 = BWk.A02;
            AnonymousClass00B r42 = AnonymousClass00B.A01;
            int i2 = r11.A0C;
            if (r14.A0q() != null) {
                r14 = r14.A0Q(r11.A0E);
            }
            r42.markerAnnotate(23396355, i2, "IS_AD", r14.Aho());
            if (str4 != null) {
                AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "TRACE_TOKEN", str4);
            }
            int A002 = AnonymousClass18D.A00(BWk);
            if (A002 != -1) {
                AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "TARGET_SCAN", A002);
            }
        }
        C38571lU r1 = r11.A06;
        if (r1 != null) {
            AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "SCAN_NUMBER", r1.A00.getCurrentScans());
        }
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, StatusBarModule.HEIGHT_KEY, r11.A00);
        AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "WIDTH", r11.A01);
        int i3 = r11.A02;
        if (i3 > 0) {
            AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "BYTE_SIZE", i3);
        }
        C15700nO A003 = C15700nO.A00();
        double A012 = A003.A01();
        long A022 = A003.A02();
        long A032 = A003.A03();
        if (A012 != -1.0d) {
            AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "BANDWIDTH_KBPS", A012);
            AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "ESTIMATED_BANDWIDTH_TOTAL_BYTES_B", A022);
            AnonymousClass00B.A01.markerAnnotate(23396355, r11.A0C, "ESTIMATED_BANDWIDTH_TOTAL_TIME_MS", A032);
        }
        if (!r11.A09) {
            s = 477;
        }
        s = 2;
        AnonymousClass00B.A01.markerEnd(23396355, r11.A0C, s);
    }

    public static void A02(C38531lQ r11, Context context, AnonymousClass0RN r13, AnonymousClass1NJ r14, boolean z, boolean z2) {
        String str;
        Location lastLocation;
        int i = r11.A0H;
        if (i != 0 && new Random().nextInt(i) == 0 && !AnonymousClass0Q7.A03().A0H() && C16230oG.isLocationEnabled(context) && C16230oG.isLocationPermitted(context)) {
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("fbc_ig_image_render", r13);
            A002.A0A("is_grid_view", Boolean.valueOf(z));
            A002.A0A("rendered", Boolean.valueOf(r11.A09));
            A002.A0A("is_carousel", Boolean.valueOf(z2));
            A002.A0A("did_fallback_render", Boolean.valueOf(r11.A0A));
            if (r14 != null) {
                if (r14.A0q() != null) {
                    r14 = r14.A0Q(r11.A0E);
                }
                A002.A0A("is_ad", Boolean.valueOf(r14.Aho()));
            }
            C38571lU r0 = r11.A06;
            if (r0 != null) {
                A002.A0E("scan_number", Integer.valueOf(r0.A00.getCurrentScans()));
            }
            A002.A0E("image_attempted_height", Integer.valueOf(r11.A00));
            A002.A0E("image_attempted_width", Integer.valueOf(r11.A01));
            int i2 = r11.A02;
            if (i2 > 0) {
                A002.A0E("image_size_kb", Integer.valueOf(i2));
            }
            if (r11.A09) {
                A002.A0F("render_latency", Long.valueOf(r11.A04));
            }
            A002.A0F("on_screen_duration", Long.valueOf(r11.A03));
            if (r11.A09 || r11.A0A) {
                str = "SUCCESS";
            } else {
                str = "ABANDONED";
            }
            A002.A0G("action", str);
            C15700nO A003 = C15700nO.A00();
            double A012 = A003.A01();
            long A022 = A003.A02();
            long A032 = A003.A03();
            if (A012 != -1.0d) {
                A002.A0C("estimated_bandwidth", Double.valueOf(A012));
                A002.A0F("estimated_bandwidth_totalBytes_b", Long.valueOf(A022));
                A002.A0F("estimated_bandwidth_totalTime_ms", Long.valueOf(A032));
            }
            Pair A023 = AnonymousClass0NT.A02(context);
            A002.A0G(TraceFieldType.NetworkType, (String) A023.first);
            A002.A0G("network_subtype", (String) A023.second);
            HashMap hashMap = new HashMap();
            AnonymousClass2ZZ.A01(r11.A0E).A06(hashMap);
            for (Map.Entry entry : hashMap.entrySet()) {
                A002.A0G((String) entry.getKey(), (String) entry.getValue());
            }
            String A013 = C54812Za.A00().A01();
            if (A013 != null && !A013.isEmpty()) {
                A002.A0G("hardware_address", A013);
            }
            C16230oG r1 = C16230oG.A00;
            if (!(r1 == null || (lastLocation = r1.getLastLocation(r11.A0E)) == null)) {
                A002.A0C("device_lat", Double.valueOf(lastLocation.getLatitude()));
                A002.A0C("device_long", Double.valueOf(lastLocation.getLongitude()));
            }
            A002.A0E("client_sample_rate", Integer.valueOf(r11.A0H));
            AnonymousClass0WN.A01(r11.A0E).BcG(A002);
        }
    }

    public final void A03(Context context, AnonymousClass0RN r24, AnonymousClass1NJ r25, boolean z, boolean z2, Integer num) {
        if (this.A03 == -1 && this.A05 != -1) {
            this.A03 = this.A0D.now() - this.A05;
            AnonymousClass0RN r9 = r24;
            Context context2 = context;
            AnonymousClass1NJ r10 = r25;
            boolean z3 = z;
            Integer num2 = num;
            boolean z4 = z2;
            if (((Boolean) AnonymousClass0L6.A02(this.A0E, AnonymousClass0L7.LAUNCHER_PPR_BACKGROUND_THREAD, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                C05700Lp.A00().ADc(new C100254Va(this, context2, r9, r10, z3, z4, num2));
            } else {
                if (this.A03 >= 250) {
                    A00(this, context2, r9, r10, r10.APo(), z3, z4);
                }
                if (this.A0G) {
                    A01(this, context2, r9, r10, r10.APo(), z3, z4, num2);
                }
                if (this.A0F) {
                    C05700Lp.A00().ADc(new C40861pN(this, context2, r9, r10, z3, z4));
                }
            }
        }
        this.A06 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if ((r2 < 0 ? r2 + r0 : r2) == r9.A00) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (p000X.AnonymousClass1CU.A00() != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (p000X.AnonymousClass1CU.A00() != false) goto L_0x0039;
     */
    public C38531lQ(AnonymousClass0C1 r6, String str, C04140Cp r8, C38551lS r9, boolean z) {
        boolean z2 = false;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A0E = r6;
        this.A0I = str;
        this.A0D = r8;
        this.A0C = str.hashCode();
        boolean z3 = !r9.A02 ? false : z3;
        z3 = true;
        if (z3) {
            int i = this.A0C;
            boolean z4 = !r9.A02 ? false : z4;
            z4 = true;
            boolean z5 = false;
            if (z4) {
                if (!AnonymousClass1CU.A00()) {
                    int i2 = r9.A01;
                    int i3 = i % i2;
                }
                z5 = true;
            }
            if (z5) {
                z2 = true;
            }
        }
        this.A0G = z2;
        this.A0J = z;
        this.A0F = ((Boolean) AnonymousClass0L6.A02(this.A0E, AnonymousClass0L7.PHOTO_LOG_FBC_EVENT, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0H = ((Integer) AnonymousClass0L6.A02(this.A0E, AnonymousClass0L7.PHOTO_FBC_EVENT, "sample_rate", 1000, (AnonymousClass04H) null)).intValue();
    }

    public static int getQPLId(String str) {
        return str.hashCode();
    }
}
