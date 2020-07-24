package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.video.live.api.IgLiveBroadcastType;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AQ5 */
public final class AQ5 extends AOA {
    public static final long A0Z = TimeUnit.SECONDS.toMillis(20);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Bitmap A04;
    public Surface A05;
    public AWN A06;
    public AWZ A07;
    public ASS A08;
    public C23470ANr A09;
    public AVL A0A = new AQ9(this);
    public ARK A0B;
    public C23674AXl A0C;
    public ASW A0D;
    public AVQ A0E;
    public C23502AOy A0F;
    public Integer A0G = Constants.ZERO;
    public boolean A0H;
    public boolean A0I = true;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final AnonymousClass1L8 A0O;
    public final AUZ A0P;
    public final AO0 A0Q;
    public final AnonymousClass79M A0R;
    public final AXY A0S;
    public final AQK A0T;
    public final AS6 A0U;
    public final AR0 A0V;
    public final boolean A0W;
    public final C23684AXv A0X = new C23531AQb(this);
    public final AY4 A0Y = new AQF(this);

    public final void A0C(A52 a52, Exception exc) {
        Integer num;
        Integer num2;
        boolean z = false;
        if (exc == null) {
            z = true;
        }
        if (z) {
            boolean z2 = a52.A04;
            AnonymousClass79M r1 = this.A0R;
            if (z2) {
                num = Constants.ZERO;
            } else {
                num = Constants.ONE;
            }
            r1.A07 = num;
            C16180oA A002 = C16180oA.A00(this.A05);
            A002.A00.edit().putBoolean(AnonymousClass40t.$const$string(8), a52.A04).apply();
            AnonymousClass79M r4 = this.A0R;
            if (a52.A04) {
                num2 = Constants.ZERO;
            } else {
                num2 = Constants.ONE;
            }
            r4.A0c.incrementAndGet();
            AnonymousClass0P4 A003 = AnonymousClass79M.A00(r4, Constants.A0L);
            A003.A0G("camera", AQ3.A00(num2));
            AnonymousClass0WN.A01(r4.A0N).BcG(A003);
            this.A0R.A0C("switchCamera", StringFormatUtil.formatStrLocaleSafe("{'width': %d, 'height': %d, 'front':'%b'}", Integer.valueOf(a52.A01), Integer.valueOf(a52.A00), Boolean.valueOf(a52.A04)));
        } else {
            this.A0V.A00(new C23588ASm("switchCamera", (String) null, exc));
        }
        if (z) {
            A0B(a52);
        }
    }

    public final void B7Y() {
    }

    public static ARK A00(AQ5 aq5) {
        int intValue;
        float intValue2;
        int intValue3;
        AQ5 aq52 = aq5;
        if (aq52.A0C == null) {
            Context context = aq52.A03;
            AnonymousClass0C1 r10 = aq52.A05;
            String A052 = aq52.A0R.A0M.A05();
            double d = aq52.A07.A01;
            if (d > 0.0d) {
                intValue = (int) d;
            } else {
                intValue = ((Integer) AnonymousClass0L6.A02(aq52.A05, AnonymousClass0L7.LIVE_WEBRTC_LIVEWITH_PARAMS, "video_start_bitrate", 500, (AnonymousClass04H) null)).intValue();
            }
            ASS ass = aq52.A08;
            int i = (int) ((((float) ass.A05) * 1.2f) / 1000.0f);
            C23549AQt aQt = new C23549AQt(Math.min(intValue, i), i, i);
            Pair pair = aq52.A07.A07;
            if (pair == null) {
                intValue2 = (float) aq52.A00;
                intValue3 = aq52.A01;
            } else {
                intValue2 = (float) ((Integer) pair.second).intValue();
                intValue3 = ((Integer) pair.first).intValue();
            }
            float f = (float) ass.A07;
            int round = Math.round(f * 0.5f) << 1;
            int round2 = Math.round((f * (intValue2 / ((float) intValue3))) * 0.5f) << 1;
            C23711AZq A012 = C23712AZr.A01(aq52.A05);
            A012.A04 = aQt;
            A012.A02 = round;
            A012.A01 = round2;
            AZi A002 = A012.A00();
            C23724Aa8 aa8 = aq52.A07;
            AXY axy = aq52.A0S;
            C23502AOy aOy = aq52.A0F;
            C23684AXv aXv = aq52.A0X;
            C23684AXv aXv2 = aXv;
            C23674AXl aXl = new C23674AXl(context, r10, A052, A002, aa8, axy, aOy, aXv2, aq52.A0Q, aq52.A0A, aq52.A0Y, aq52.A08.A0G);
            aq52.A0C = aXl;
            aXl.A02 = aq52.A08.A08.booleanValue();
        }
        return aq52.A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bf, code lost:
        if (r2.isEmpty() != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c2, code lost:
        if (r0 != false) goto L_0x00c4;
     */
    public static void A02(AQ5 aq5) {
        Surface surface;
        IgLiveBroadcastType igLiveBroadcastType;
        String str;
        boolean z;
        Integer num = aq5.A0G;
        Integer num2 = Constants.ZERO;
        if (num == num2) {
            aq5.A0G = Constants.ONE;
            if (aq5.A0W) {
                igLiveBroadcastType = IgLiveBroadcastType.RTC;
            } else {
                igLiveBroadcastType = IgLiveBroadcastType.RTMP_SWAP_ENABLED;
            }
            int i = aq5.A01;
            int i2 = aq5.A00;
            AnonymousClass79M r3 = aq5.A0R;
            r3.A01 = SystemClock.elapsedRealtime();
            AnonymousClass0P4 A032 = AnonymousClass79M.A03(r3, num2);
            AWM.A01(A032, r3.A0J, r3.A05);
            AnonymousClass0WN.A01(r3.A0N).BcG(A032);
            AnonymousClass79M.A05(r3, Constants.ZERO);
            if (aq5.A0T.A06) {
                C2114199x A002 = C2114299y.A00(aq5.A05);
                Integer num3 = Constants.A04;
                Integer num4 = Constants.ONE;
                AnonymousClass9A1 r1 = new AnonymousClass9A1();
                r1.A02(Constants.ZERO);
                r1.A01(num4);
                A002.A00(num3, num4, r1.A00());
                A002.A01.ADB(A002.A00);
            }
            AnonymousClass0C1 r12 = aq5.A05;
            AQK aqk = aq5.A0T;
            boolean z2 = aqk.A0B;
            String str2 = aqk.A0A;
            boolean z3 = aqk.A05;
            boolean z4 = aqk.A06;
            String str3 = aqk.A03;
            ArrayList arrayList = aqk.A04;
            String str4 = aqk.A02;
            String str5 = aqk.A01;
            C15890nh r8 = new C15890nh(r12);
            r8.A09 = Constants.ONE;
            r8.A0C = "live/create/";
            r8.A09(C193418Ps.$const$string(87), igLiveBroadcastType.name());
            if (z2) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            r8.A09(AnonymousClass0C5.$const$string(253), str);
            r8.A09("preview_width", Integer.toString(i));
            r8.A09("preview_height", Integer.toString(i2));
            r8.A0C("user_pay_enabled", z4);
            String str6 = str5;
            String str7 = null;
            if (str5 != null) {
                if (str4 == null) {
                    if (arrayList != null) {
                        z = false;
                    }
                    z = true;
                }
                long parseLong = Long.parseLong(str6);
                StringWriter stringWriter = new StringWriter();
                try {
                    C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                    A052.A0T();
                    if (str4 != null) {
                        A052.A0H("product_collection_id", str4);
                    } else {
                        A052.A0B("products");
                        if (arrayList == null) {
                            C13150hy.A00();
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str8 = (String) it.next();
                            A052.A0T();
                            A052.A0G("merchant_id", parseLong);
                            C13150hy.A01(str8, "productId");
                            A052.A0G("product_id", Long.parseLong(str8));
                            A052.A0Q();
                        }
                        A052.A0P();
                    }
                    A052.A0Q();
                    A052.close();
                    str7 = stringWriter.toString();
                } catch (IOException unused) {
                }
            }
            r8.A0A("shopping_data", str7);
            if (!str2.isEmpty()) {
                r8.A09(AnonymousClass40t.$const$string(211), str2);
            }
            if (z3) {
                AnonymousClass5BE.A00(r12, r8, (String) null, (String) null, true);
            }
            if (str3 != null) {
                r8.A09("broadcast_message", str3);
            }
            r8.A06(AST.class, true);
            C17850qu A033 = r8.A03();
            A033.A00 = new ASR(aq5);
            C28351Lj.A00(aq5.A03, aq5.A0O, A033);
        }
        if (!A07(aq5) && (surface = aq5.A05) != null) {
            aq5.A08.A07.obtainMessage(1, surface).sendToTarget();
        }
    }

    public static void A03(AQ5 aq5, C23486AOi aOi) {
        AS6 as6 = aq5.A0U;
        if (as6.A00 && aq5.A0G == Constants.A0C && !aq5.A0K && !aq5.A0I) {
            as6.A00 = false;
            AQB aqb = new AQB(aq5, aOi);
            ARK ark = aq5.A0B;
            if (ark != null) {
                ark.Bpb(new AQQ(aq5, aqb));
            } else {
                aqb.A03(new IllegalStateException("mCurrentStreamingSession == NULL"));
            }
        }
    }

    public static void A04(AQ5 aq5, BroadcastType broadcastType) {
        AnonymousClass79M r0 = aq5.A0R;
        String name = broadcastType.name();
        r0.A09 = name;
        AnonymousClass0QD.A00().BYg(C193418Ps.$const$string(120), name);
        C23724Aa8 aa8 = aq5.A07;
        aa8.A0C = name;
        C23724Aa8.A01(aa8);
    }

    public static void A05(AQ5 aq5, APC apc, boolean z, String str, AWN awn) {
        C23486AOi aOi;
        if (aq5.A0G == Constants.A0C) {
            AS6 as6 = aq5.A0U;
            if (!as6.A00) {
                as6.A00 = true;
                aq5.A08.A03();
                aq5.A06 = new C23532AQc(aq5, z, awn);
                AnonymousClass79M r2 = aq5.A0R;
                AnonymousClass0ZA.A08(r2.A0K, r2.A0O);
                AnonymousClass79M.A04(r2);
                AnonymousClass79M r3 = aq5.A0R;
                switch (apc.ordinal()) {
                    case 1:
                        aOi = C23486AOi.APP_INACTIVE;
                        break;
                    case 2:
                        aOi = C23486AOi.LIVE_SWAP;
                        break;
                    case 4:
                        aOi = C23486AOi.CONNECTION;
                        break;
                    default:
                        aOi = C23486AOi.UNKNOWN;
                        break;
                }
                if (aOi == C23486AOi.CONNECTION) {
                    r3.A0V.incrementAndGet();
                }
                AnonymousClass0P4 A012 = AnonymousClass79M.A01(r3, Constants.A0u);
                A012.A0G("reason", aOi.A00);
                A012.A0G("reason_info", str);
                AnonymousClass0WN.A01(r3.A0N).BcG(A012);
                aq5.A0E(apc);
            }
        }
    }

    public static void A06(AQ5 aq5, String str, Exception exc) {
        AnonymousClass0DB.A0G("IgLiveStreamingController", AnonymousClass000.A0E("Rollback Live Swap: ", str), exc);
        AnonymousClass79M r4 = aq5.A0R;
        String message = exc.getMessage();
        AnonymousClass0P4 A002 = AnonymousClass79M.A00(r4, Constants.A0R);
        A002.A0G("reason", str);
        A002.A0G("error", message);
        Boolean bool = false;
        A002.A0E("remote_ended", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        AnonymousClass0WN.A01(r4.A0N).BcG(A002);
        A04(aq5, BroadcastType.LIVESWAP_RTMP);
        AWZ.A00(aq5.A07, exc);
        aq5.A07 = null;
        aq5.A0J = false;
        A03(aq5, C23486AOi.LIVE_SWAP);
        C23674AXl aXl = aq5.A0C;
        if (aXl != null) {
            aXl.BaJ(false, (AWZ) null);
            aq5.A0C = null;
        }
    }

    public static boolean A07(AQ5 aq5) {
        if (aq5.A0G == Constants.A0N) {
            return true;
        }
        return false;
    }

    public final ARH A09() {
        String str;
        ASS ass = this.A08;
        if (ass != null) {
            str = ass.A0G;
        } else {
            str = null;
        }
        boolean z = false;
        if (this.A0B == this.A0C) {
            z = true;
        }
        return new ARH(str, z);
    }

    public final void A0B(A52 a52) {
        AWQ awq = this.A08;
        awq.A07.obtainMessage(2, a52.A03, a52.A02, (Object) null).sendToTarget();
        C23724Aa8 aa8 = this.A07;
        aa8.A04 = new Pair(Integer.valueOf(a52.A01), Integer.valueOf(a52.A00));
        C23724Aa8.A01(aa8);
    }

    public final void A0E(APC apc) {
        if (!this.A0U.A00 || this.A0J) {
            C12670hC.A04(new AOI(this, apc));
            return;
        }
        if (apc == null) {
            apc = APC.UNKNOWN;
        }
        C12670hC.A04(new AO5(this, apc));
    }

    public final void B2K() {
        AWN awn = this.A06;
        if (awn != null) {
            awn.A02();
            this.A06 = null;
        }
    }

    public final void B5W(int i, int i2, int i3, int i4) {
        C23724Aa8 aa8 = this.A07;
        aa8.A0B = Integer.valueOf(i4);
        C23724Aa8.A01(aa8);
    }

    public final void B7X(SurfaceTexture surfaceTexture) {
        this.A06.BpX(this.A03, surfaceTexture, this.A01, this.A00, C16180oA.A00(this.A05).A00.getBoolean(AnonymousClass40t.$const$string(8), true), new AQH(this));
        A03(this, C23486AOi.APP_INACTIVE);
    }

    public final void BCt() {
        ARK ark = this.A0B;
        if (ark != null) {
            ark.App();
        }
    }

    public AQ5(Context context, AnonymousClass0C1 r8, AnonymousClass1L8 r9, AnonymousClass79M r10, AO0 ao0, AQK aqk, AXY axy, C191188Ff r14, C87023q3 r15) {
        super(context, r8, r15, r14);
        this.A0S = axy;
        this.A0T = aqk;
        this.A0R = r10;
        r10.A06 = this.A07;
        this.A0Q = ao0;
        this.A0V = new AR0(r10);
        this.A0O = r9;
        this.A0W = ((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.LIVE_USE_RTC_UPLOAD, "enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0U = new AS6(A0Z, new C23533AQd(this), new AQC(this));
        this.A0P = new AUZ(new C23548AQs(new XAnalyticsAdapterHolder(new C209348zw(r8))));
        this.A0U.A00 = true;
    }

    public static String A01(C43791v5 r1) {
        if (r1.A03() && ((C28691Ms) r1.A00).getErrorMessage() != null) {
            return ((C28691Ms) r1.A00).getErrorMessage();
        }
        if (r1.A02()) {
            return r1.A01.getMessage();
        }
        return null;
    }

    public final void A08() {
        super.A08();
        this.A0R.A0L.ADB(C35051fj.A0U);
        A0A();
        this.A0F = null;
    }

    public final void A0A() {
        if (!A07(this)) {
            this.A0U.A00();
            this.A08.A02();
            this.A06.BqM();
            ARJ arj = new ARJ(this);
            this.A08.A03();
            this.A06 = new C23532AQc(this, true, arj);
            this.A0G = Constants.A0N;
        }
    }

    public final void A0D(BroadcastFailureType broadcastFailureType, LiveStreamingError liveStreamingError) {
        A0A();
        AnonymousClass0DB.A0K("IgLiveStreamingController", "endBroadcastWithFailure(%s): %s", broadcastFailureType, liveStreamingError);
        this.A0V.A00(liveStreamingError);
        AUZ auz = this.A0P;
        LiveStreamingError liveStreamingError2 = liveStreamingError.innerError;
        if (liveStreamingError2 == null) {
            liveStreamingError2 = liveStreamingError;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_class", liveStreamingError.domain);
        hashMap.put(TraceFieldType.ErrorCode, Integer.toString(liveStreamingError.errorCode));
        hashMap.put("error_message", liveStreamingError.reason);
        hashMap.put("error_trace", liveStreamingError.fullDescription);
        hashMap.put("inner_error_class", liveStreamingError2.domain);
        hashMap.put("inner_error_code", Integer.toString(liveStreamingError2.errorCode));
        hashMap.put("inner_error_message", liveStreamingError2.reason);
        hashMap.put("inner_error_trace", liveStreamingError2.fullDescription);
        auz.A00("started", "failed", "broadcast_session_failed", new B34(hashMap).toString());
        if (!this.A0H) {
            this.A0H = true;
            C12670hC.A04(new AOB(this, broadcastFailureType, liveStreamingError));
        }
    }
}
