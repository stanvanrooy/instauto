package p000X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.mediatype.MediaType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.1yN  reason: invalid class name and case insensitive filesystem */
public final class C45711yN implements C45721yO {
    public int A00;
    public C45951yt A01;
    public Boolean A02;
    public final AnonymousClass0C1 A03;
    public final AnonymousClass1RY A04;
    public final C40441of A05;

    public static int A00(C45951yt r1, C45941ys r2) {
        if (r1.A02 == MediaType.LIVE) {
            return r2.A03;
        }
        return Math.min(r2.A03, r2.A04);
    }

    private C45951yt A01(Object obj) {
        if (obj != null) {
            return this.A04.A00(obj);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r3.equals("video_playing_update") != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r0 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r6.A0F != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3.equals("video_playing_update") != false) goto L_0x0028;
     */
    public static void A02(AnonymousClass0C1 r4, AnonymousClass0P4 r5, C45951yt r6) {
        boolean z;
        boolean z2;
        if (!r6.A0E) {
            if (r6.A02 == MediaType.LIVE) {
                String str = r5.A04;
                boolean equals = str.equals("video_viewed");
                if (!equals && !str.equals("video_paused")) {
                    z = false;
                }
                z = true;
                if (z) {
                    if (!equals && !str.equals("video_paused")) {
                        z2 = false;
                    }
                    z2 = true;
                }
            }
            AnonymousClass0WN.A01(r4).BdB(r5);
            return;
        }
        AnonymousClass0WN.A01(r4).BcG(r5);
    }

    public static boolean A04(C45951yt r0, C45941ys r1) {
        if (!r0.A0C || !r1.A0H) {
            return false;
        }
        return true;
    }

    public final void Bby(C60222jW r36) {
        C40521on r7 = this.A05.A04;
        if (r7.A02.A00()) {
            r7.A01.A0M(28180481, 1);
            C60222jW r8 = r36;
            int hashCode = r8.A0O.hashCode();
            r7.A01.markerStart(28180481, hashCode);
            HashMap hashMap = new HashMap();
            hashMap.put("time_ms", Long.toString(r8.A0D));
            String str = r8.A0O;
            int indexOf = str.indexOf(95);
            if (indexOf > -1) {
                str = str.substring(0, indexOf);
            }
            hashMap.put(TraceFieldType.VideoId, str);
            hashMap.put("ig_video_id", r8.A0O);
            hashMap.put("player_id", Long.toString(r8.A0A));
            hashMap.put("is_live", Boolean.toString(r8.A0R));
            hashMap.put("video_position_ms", Long.toString(r8.A0E));
            hashMap.put("buffer_duration_ms", Long.toString(r8.A09));
            hashMap.put("segment_start_ms", Long.toString(r8.A0C));
            hashMap.put("segment_duration_ms", Long.toString(r8.A0B));
            hashMap.put("bandwidth_estimate", Long.toString(r8.A07));
            hashMap.put("current_bitrate", Integer.toString(r8.A04));
            hashMap.put("next_bitrate", Integer.toString(r8.A06));
            hashMap.put("constraint_bitrate", Integer.toString(r8.A02));
            hashMap.put("decision_reasons", r8.A0J);
            hashMap.put("constraint_width", Integer.toString(r8.A03));
            hashMap.put("constraint_reasons", r8.A0G);
            hashMap.put("format_bandwidth_estimate", r8.A0K);
            hashMap.put("is_prefetch", Boolean.toString(r8.A0S));
            hashMap.put("is_buffer_falling", Boolean.toString(r8.A0Q));
            hashMap.put("bandwidth_confidence_pct", Integer.toString(r8.A01));
            hashMap.put("bandwidth_estimate_confidence_based", Long.toString(r8.A08));
            hashMap.put("min_viewport_dimension", Integer.toString(r8.A05));
            hashMap.put("format_mos", Float.toString(r8.A00));
            hashMap.put("player_origin", r8.A0N);
            hashMap.put("is_audio", Boolean.toString(r8.A0P));
            hashMap.put("is_wifi", Boolean.toString(r8.A0T));
            String str2 = r8.A0H;
            if (str2 != null) {
                hashMap.put("current_quality_label", str2);
            }
            String str3 = r8.A0M;
            if (str3 != null) {
                hashMap.put("next_quality_label", str3);
            }
            String str4 = r8.A0L;
            if (str4 != null) {
                hashMap.put("highest_quality_label_from_manifest", str4);
            }
            String str5 = r8.A0F;
            if (str5 != null) {
                hashMap.put("constraint_quality_label", str5);
            }
            String str6 = r8.A0I;
            if (str6 != null) {
                hashMap.put("data_connection_quality", str6);
            }
            hashMap.put("kbps_estimate", Long.toString(r8.A07));
            C40441of.A00(28180481, hashCode, hashMap);
            r7.A01.markerEnd(28180481, hashCode, 2);
            if (r7.A02.A00()) {
                String str7 = r8.A0O;
                if (!str7.equals(r7.A00)) {
                    r7.A00 = str7;
                    for (C60232jX r13 : r8.A0U) {
                        r7.A01.A0M(28180484, 1);
                        int hashCode2 = AnonymousClass000.A0E(r8.A0O, r13.A06).hashCode();
                        r7.A01.markerStart(28180484, hashCode2);
                        String str8 = r13.A06;
                        long j = r8.A0D;
                        String str9 = r8.A0O;
                        String str10 = str9;
                        int indexOf2 = str10.indexOf(95);
                        if (indexOf2 > -1) {
                            str9 = str10.substring(0, indexOf2);
                        }
                        int i = r13.A00;
                        int i2 = r13.A02;
                        int i3 = r13.A01;
                        boolean z = r13.A09;
                        boolean z2 = r13.A0A;
                        boolean z3 = r13.A08;
                        boolean z4 = r13.A07;
                        String str11 = r13.A05;
                        String str12 = r13.A03;
                        String str13 = r13.A04;
                        long j2 = r8.A0A;
                        String str14 = str13;
                        HashMap hashMap2 = new HashMap();
                        boolean endsWith = str8.endsWith("vd");
                        hashMap2.put("is_audio", Boolean.toString(false));
                        hashMap2.put("time_ms", Long.toString(j));
                        hashMap2.put(TraceFieldType.VideoId, str9);
                        hashMap2.put("format_id", str8);
                        hashMap2.put(TraceFieldType.Bitrate, Integer.toString(i));
                        hashMap2.put(IgReactMediaPickerNativeModule.WIDTH, Integer.toString(i2));
                        hashMap2.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.toString(i3));
                        hashMap2.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, Boolean.toString(endsWith));
                        hashMap2.put("hvq_landscape", Boolean.toString(z));
                        hashMap2.put("hvq_portrait", Boolean.toString(z2));
                        hashMap2.put("avoid_on_cell", Boolean.toString(z3));
                        hashMap2.put("avoid_on_cell_intentional", Boolean.toString(z4));
                        if (str11 != null) {
                            hashMap2.put("quality_label", str11);
                        }
                        if (str12 != null) {
                            hashMap2.put("mos", str12.replaceAll(",", ";"));
                        }
                        if (str13 != null) {
                            hashMap2.put("mos_confidence", str14);
                        }
                        hashMap2.put("player_id", Long.toString(j2));
                        hashMap2.put("ig_video_id", r8.A0O);
                        C40441of.A00(28180484, hashCode2, hashMap2);
                        r7.A01.markerEnd(28180484, hashCode2, 2);
                    }
                }
            }
        }
    }

    public final void Bcr(Object obj, C45941ys r21, List list) {
        C06170Oa r13;
        C06170Oa r12;
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C06170Oa r11 = null;
            if (list == null || list.size() <= 0) {
                r12 = null;
                r13 = null;
            } else {
                r13 = C06170Oa.A00();
                r12 = C06170Oa.A00();
                r11 = C06170Oa.A00();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C51002Is r2 = (C51002Is) it.next();
                    r13.A02(r2.A00);
                    r12.A03(r2.A02);
                    r11.A02(r2.A01);
                }
            }
            C45941ys r4 = r21;
            int A002 = A00(A012, r4);
            int i = r4.A07;
            int i2 = r4.A04;
            int i3 = r4.A05;
            int i4 = r4.A08;
            boolean A042 = A04(A012, r4);
            C42991ta r7 = new C42991ta("video_buffering_started", this.A04.A00, this.A03);
            r7.A0E = i3;
            r7.A0B = A002;
            r7.A0C = i2;
            r7.A01((double) A002, (double) i2);
            r7.A0H = i;
            r7.A01 = (float) i4;
            r7.A0q = null;
            r7.A0Y = Boolean.valueOf(A042);
            r7.A03(A012);
            AnonymousClass1RY r22 = this.A04;
            r7.A0t = r22.A01();
            r7.A0T = r4.A0A;
            r7.A0M = r4.A00;
            r7.A0A = r4.A02;
            r7.A0G = r4.A06;
            r7.A0W = r13;
            r7.A0V = r12;
            r7.A0X = r11;
            int i5 = this.A00 + 1;
            this.A00 = i5;
            r7.A0P = i5;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A003 = r7.A00();
            r22.A04(A003);
            A02(r1, A003, A012);
            C40441of r8 = this.A05;
            String str = A012.A06;
            int i6 = r4.A03;
            int i7 = r4.A07;
            int i8 = r4.A04;
            String str2 = r4.A0F;
            String str3 = r4.A0G;
            if (C40441of.A03(r8)) {
                C40561or r0 = r8.A02;
                int hashCode = str.hashCode();
                long uptimeMillis = SystemClock.uptimeMillis();
                r0.A00.markerStart(1900562, hashCode);
                HashMap hashMap = new HashMap();
                hashMap.put(TraceFieldType.VideoId, str);
                hashMap.put("start_buffering_current_position_ms", Integer.toString(i6));
                hashMap.put("start_buffering_last_start_position_ms", Integer.toString(i7));
                hashMap.put("start_buffering_duration_sec", Float.toString((float) (((long) i8) / 1000)));
                if (!(r13 == null || r12 == null || r11 == null)) {
                    hashMap.put("start_buffering_historical_requested_bytes", r13.toString());
                    hashMap.put("start_buffering_historical_bitrates", r12.toString());
                    hashMap.put("start_buffering_historical_stream_types", r11.toString());
                }
                C40441of.A00(1900562, hashCode, hashMap);
                Map map = C40441of.A09;
                Integer valueOf = Integer.valueOf(hashCode);
                C30690Dhe dhe = (C30690Dhe) map.get(valueOf);
                if (dhe == null) {
                    dhe = new C30690Dhe();
                }
                long j = (long) i6;
                synchronized (dhe) {
                    C30691Dhf dhf = new C30691Dhf(j, uptimeMillis);
                    C30691Dhf dhf2 = dhe.A02;
                    if (dhf2 == null) {
                        dhe.A02 = dhf;
                    } else {
                        if (dhf2.A01 == 0) {
                            dhf2.A01 = SystemClock.uptimeMillis();
                        }
                        dhe.A03 = dhf;
                    }
                    dhe.A06 = true;
                    dhe.A00++;
                }
                C40441of.A09.put(valueOf, dhe);
                C40541op r3 = r8.A03;
                C54382Xb r23 = new C54382Xb(Constants.A0u, str, str2, i6);
                r23.A07 = str3;
                C40541op.A01(r3, new C54392Xc(r23));
            }
        }
    }

    public final void Bcx(Object obj) {
        if (obj != null) {
            C45951yt A002 = this.A04.A00(obj);
            C45951yt r0 = this.A01;
            if (r0 != null && A002.A06.equals(r0.A06)) {
                this.A01 = null;
                this.A02 = null;
                C42991ta r3 = new C42991ta("video_exited", this.A04.A00, this.A03);
                r3.A03(A002);
                AnonymousClass1RY r2 = this.A04;
                r3.A0t = r2.A01();
                int i = this.A00 + 1;
                this.A00 = i;
                r3.A0P = i;
                AnonymousClass0C1 r1 = this.A03;
                AnonymousClass0P4 A003 = r3.A00();
                r2.A04(A003);
                A02(r1, A003, A002);
                C40531oo r6 = this.A05.A01;
                String str = A002.A06;
                if (r6.A01.A00()) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int hashCode = str.hashCode();
                    if (!r6.A00.isMarkerOn(1900557, hashCode)) {
                        C40441of.A09.remove(Integer.valueOf(hashCode));
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    C40441of.A01(hashCode, hashMap, uptimeMillis);
                    C40441of.A00(1900557, hashCode, hashMap);
                    r6.A00.markerEnd(1900557, hashCode, 477);
                }
            }
        }
    }

    public final void Bcy(Object obj, String str, String str2, C45941ys r21) {
        Float f;
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C45941ys r2 = r21;
            int A002 = A00(A012, r2);
            C42991ta r7 = new C42991ta("video_paused", this.A04.A00, this.A03);
            r7.A0E = r2.A05;
            r7.A0B = A002;
            int i = r2.A04;
            r7.A0C = i;
            r7.A01((double) A002, (double) i);
            r7.A0H = r2.A07;
            r7.A01 = (float) r2.A08;
            r7.A0q = null;
            r7.A0Y = Boolean.valueOf(A04(A012, r2));
            r7.A0Z = Boolean.valueOf(r2.A0I);
            r7.A0m = this.A04.A03(str);
            String str3 = str2;
            r7.A0o = str3;
            r7.A03(A012);
            AnonymousClass1RY r5 = this.A04;
            r7.A0t = r5.A01();
            r7.A0T = r2.A0A;
            r7.A0M = r2.A00;
            r7.A0A = r2.A02;
            r7.A0G = r2.A06;
            int i2 = this.A00 + 1;
            this.A00 = i2;
            r7.A0P = i2;
            Boolean bool = r2.A0B;
            if (bool != null) {
                r7.A0J = bool.booleanValue() ? 1 : 0;
            }
            Float f2 = r2.A0D;
            if (!(f2 == null || (f = r2.A0C) == null)) {
                r7.A03 = f2.floatValue();
                r7.A02 = f.floatValue();
            }
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A003 = r7.A00();
            r5.A04(A003);
            A02(r1, A003, A012);
            C37671k2 r8 = A012.A04;
            if (r8 != null) {
                C40541op r4 = this.A05.A03;
                String str4 = A012.A06;
                int i3 = r2.A03;
                int i4 = r2.A07;
                int i5 = r2.A04;
                int i6 = r2.A01;
                String str5 = r2.A0F;
                String str6 = r2.A0G;
                if (r4.A03.A00()) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int hashCode = str4.hashCode();
                    HashMap hashMap = new HashMap();
                    hashMap.put("last_bitrate", Integer.toString(i6));
                    hashMap.put("duration", Integer.toString((int) (((long) i5) / 1000)));
                    hashMap.put("last_start_video_time_position_ms", Integer.toString(i4));
                    hashMap.put("end_video_time_position_ms", Integer.toString(i3));
                    hashMap.put("pause_reason", str3);
                    C40441of.A01(hashCode, hashMap, uptimeMillis);
                    C40441of.A00(1900557, hashCode, hashMap);
                    r4.A01.markerEnd(1900557, hashCode, 237);
                    Integer num = Constants.A0N;
                    C54382Xb r3 = new C54382Xb(num, str4, str5, i3);
                    r3.A04 = C40451og.A00(r8);
                    r3.A05 = Integer.valueOf(i5);
                    boolean z = false;
                    if (r8.A03 == num) {
                        z = true;
                    }
                    r3.A00 = Boolean.valueOf(z);
                    r3.A07 = str6;
                    C40541op.A00(r4, r3);
                    C40541op.A01(r4, new C54392Xc(r3));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r6 == false) goto L_0x0032;
     */
    public final void Bcz(Object obj, int i, C45941ys r15) {
        int i2;
        if (obj != null) {
            C45951yt A002 = this.A04.A00(obj);
            this.A01 = A002;
            this.A02 = null;
            C37671k2 r9 = A002.A04;
            if (r9 != null) {
                C40541op r5 = this.A05.A03;
                String str = A002.A06;
                String str2 = r15.A0F;
                String str3 = r15.A0G;
                boolean z = A002.A0F;
                if (r5.A03.A00()) {
                    C40461oh r11 = r5.A02;
                    if (r9.A03 == Constants.ONE) {
                        i2 = 1900621;
                    }
                    i2 = 1900596;
                    if (!r11.A00()) {
                        r11.A01.markerStart(i2, false);
                        if (!r11.A00()) {
                            r11.A01.markerEnd(i2, 2);
                        } else {
                            AnonymousClass0ZA.A09(r11.A00, new C196088aE(r11, i2), 120000, -1598458584);
                        }
                    }
                    C54382Xb r3 = new C54382Xb(Constants.ZERO, str, str2, i);
                    r3.A04 = C40451og.A00(r9);
                    boolean z2 = false;
                    if (r9.A03 == Constants.A0N) {
                        z2 = true;
                    }
                    r3.A00 = Boolean.valueOf(z2);
                    r3.A07 = str3;
                    r3.A01 = Boolean.valueOf(z);
                    C40541op.A00(r5, r3);
                    C40541op.A01(r5, new C54392Xc(r3));
                }
            }
        }
    }

    public final void Bd0(Object obj, String str, C45941ys r12) {
        if (obj != null) {
            C45951yt A002 = this.A04.A00(obj);
            this.A01 = A002;
            this.A02 = null;
            this.A00 = 1;
            String A022 = this.A04.A02(str);
            C42991ta r3 = new C42991ta("video_should_start", this.A04.A00, this.A03);
            r3.A03(A002);
            r3.A0C = r12.A04;
            r3.A0o = A022;
            AnonymousClass1RY r2 = this.A04;
            r3.A0t = r2.A01();
            r3.A0P = this.A00;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A003 = r3.A00();
            r2.A04(A003);
            A02(r1, A003, A002);
            if (A002.A04 != null) {
                C40531oo r22 = this.A05.A01;
                String str2 = A002.A06;
                AnonymousClass1RY r0 = this.A04;
                r22.A00(str2, A022, r0.A01(), r12.A03, r0.A00.getModuleName(), A002);
            }
        }
    }

    public final void Bd1(Object obj, int i, C45941ys r8) {
        C45951yt r3;
        if (obj != null) {
            r3 = this.A04.A00(obj);
        } else {
            r3 = null;
        }
        if (r3 != null) {
            C42991ta r4 = new C42991ta("video_seek", this.A04.A00, this.A03);
            r4.A03(r3);
            int i2 = r8.A03;
            r4.A0B = i2;
            r4.A0N = i2;
            r4.A0O = i;
            r4.A0H = r8.A07;
            r4.A0C = r8.A04;
            r4.A01 = (float) r8.A08;
            r4.A0Y = Boolean.valueOf(A04(r3, r8));
            r4.A0Z = Boolean.valueOf(r8.A0I);
            AnonymousClass1RY r2 = this.A04;
            r4.A0t = r2.A01();
            r4.A0T = r8.A0A;
            r4.A0M = r8.A00;
            int i3 = this.A00 + 1;
            this.A00 = i3;
            r4.A0P = i3;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A002 = r4.A00();
            r2.A04(A002);
            A02(r1, A002, r3);
        }
    }

    public final void Bd2(Object obj, int i, String str, C45941ys r13) {
        if (obj != null) {
            C45951yt A002 = this.A04.A00(obj);
            this.A01 = A002;
            this.A02 = null;
            this.A00 = 1;
            String A022 = this.A04.A02(str);
            C42991ta r3 = new C42991ta("video_should_start", this.A04.A00, this.A03);
            r3.A03(A002);
            r3.A0o = A022;
            AnonymousClass1RY r2 = this.A04;
            r3.A0t = r2.A01();
            r3.A0P = this.A00;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A003 = r3.A00();
            r2.A04(A003);
            A02(r1, A003, A002);
            if (A002.A04 != null) {
                C40531oo r22 = this.A05.A01;
                String str2 = A002.A06;
                AnonymousClass1RY r0 = this.A04;
                r22.A00(str2, A022, r0.A01(), i, r0.A00.getModuleName(), A002);
            }
        }
    }

    public final void Bd3(Object obj, long j, boolean z, boolean z2, String str, C45941ys r24) {
        Integer num;
        String str2;
        Float f;
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C42991ta r8 = new C42991ta("video_started_playing", this.A04.A00, this.A03);
            r8.A0q = null;
            C45941ys r3 = r24;
            r8.A0E = r3.A05;
            r8.A0Y = Boolean.valueOf(A04(A012, r3));
            r8.A0Z = Boolean.valueOf(r3.A0I);
            r8.A0o = this.A04.A03(str);
            long j2 = j;
            r8.A0U = j2;
            r8.A0a = Boolean.valueOf(z);
            r8.A0d = Boolean.valueOf(z2);
            r8.A0c = true;
            r8.A0L = 512;
            r8.A03(A012);
            AnonymousClass1RY r7 = this.A04;
            r8.A0t = r7.A01();
            r8.A0T = r3.A0A;
            r8.A0S = r3.A09;
            r8.A0M = r3.A00;
            r8.A0C = r3.A04;
            r8.A0e = r3.A0E;
            int i = this.A00 + 1;
            this.A00 = i;
            r8.A0P = i;
            Boolean bool = r3.A0B;
            if (bool != null) {
                r8.A0J = bool.booleanValue() ? 1 : 0;
            }
            Float f2 = r3.A0D;
            if (!(f2 == null || (f = r3.A0C) == null)) {
                r8.A03 = f2.floatValue();
                r8.A02 = f.floatValue();
            }
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A002 = r8.A00();
            r7.A04(A002);
            A02(r1, A002, A012);
            C37671k2 r14 = A012.A04;
            if (r14 != null) {
                C40541op r13 = this.A05.A03;
                String str3 = A012.A06;
                int i2 = r3.A01;
                int i3 = r3.A03;
                String str4 = r3.A0F;
                String str5 = r3.A0G;
                boolean z3 = A012.A0F;
                if (r13.A03.A00()) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int hashCode = str3.hashCode();
                    HashMap hashMap = new HashMap();
                    hashMap.put("start_bitrate", Integer.toString(i2));
                    hashMap.put("start_video_time_position_ms", Integer.toString(i3));
                    if (z) {
                        num = Constants.ONE;
                    } else {
                        num = Constants.ZERO;
                    }
                    if (1 - num.intValue() != 0) {
                        str2 = "stream";
                    } else {
                        str2 = "from_cache";
                    }
                    hashMap.put(TraceFieldType.StreamType, str2);
                    hashMap.put("start_delay", Long.toString(j2));
                    hashMap.put("prefetch_size", Integer.toString(512));
                    Map map = C40441of.A09;
                    Integer valueOf = Integer.valueOf(hashCode);
                    C30690Dhe dhe = (C30690Dhe) map.get(valueOf);
                    if (dhe != null) {
                        dhe.A03(uptimeMillis);
                        C40441of.A02(hashMap, dhe, uptimeMillis);
                    } else {
                        dhe = new C30690Dhe();
                        C40441of.A09.put(valueOf, dhe);
                    }
                    dhe.A02();
                    C40441of.A00(1900557, hashCode, hashMap);
                    C54382Xb r32 = new C54382Xb(Constants.ONE, str3, str4, i3);
                    r32.A04 = C40451og.A00(r14);
                    r32.A02 = Integer.valueOf(i2);
                    boolean z4 = false;
                    if (r14.A03 == Constants.A0N) {
                        z4 = true;
                    }
                    r32.A00 = Boolean.valueOf(z4);
                    r32.A07 = str5;
                    r32.A01 = Boolean.valueOf(z3);
                    C40541op.A00(r13, r32);
                    C40541op.A01(r13, new C54392Xc(r32));
                }
            }
        }
    }

    public C45711yN(AnonymousClass1RY r2, AnonymousClass0C1 r3) {
        this.A04 = r2;
        this.A03 = r3;
        this.A05 = new C40441of(r3);
    }

    private void A03(C45951yt r8, int i, C45941ys r10, int i2, boolean z) {
        String str;
        String str2;
        Integer num;
        Boolean valueOf = Boolean.valueOf(z);
        this.A02 = valueOf;
        if (z) {
            str = "video_audio_enabled";
        } else {
            str = "video_audio_disabled";
        }
        C42991ta r4 = new C42991ta(str, this.A04.A00, this.A03);
        r4.A0B = i2;
        int i3 = r10.A04;
        r4.A0C = i3;
        r4.A01((double) i2, (double) i3);
        r4.A01 = (float) r10.A08;
        r4.A0q = null;
        r4.A03(r8);
        AnonymousClass1RY r2 = this.A04;
        r4.A0t = r2.A01();
        r4.A0T = r10.A0A;
        r4.A0M = r10.A00;
        if (i == -1) {
            str2 = "video_tapped";
        } else if (i == 4) {
            str2 = "back";
        } else if (i == 24) {
            str2 = "volume_up";
        } else if (i != 25) {
            str2 = null;
        } else {
            str2 = "volume_down";
        }
        r4.A0h = str2;
        r4.A0Y = valueOf;
        r4.A0Z = Boolean.valueOf(r10.A0I);
        r4.A0E = r10.A05;
        r4.A0A = r10.A02;
        int i4 = this.A00 + 1;
        this.A00 = i4;
        r4.A0P = i4;
        AnonymousClass0C1 r1 = this.A03;
        AnonymousClass0P4 A002 = r4.A00();
        r2.A04(A002);
        A02(r1, A002, r8);
        C40541op r6 = this.A05.A03;
        String str3 = r8.A06;
        String str4 = r10.A0F;
        int i5 = r10.A03;
        String str5 = r10.A0G;
        if (r6.A03.A00()) {
            if (z) {
                num = Constants.A02;
            } else {
                num = Constants.A03;
            }
            C54382Xb r12 = new C54382Xb(num, str3, str4, i5);
            r12.A07 = str5;
            C40541op.A01(r6, new C54392Xc(r12));
        }
    }

    public final void BcC(Object obj, int i, int i2, int i3, int i4, String str) {
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C42991ta r4 = new C42991ta("video_decoder_perf", this.A04.A00, this.A03);
            r4.A03(A012);
            r4.A0T = i2;
            r4.A0S = i3;
            r4.A00 = (float) i4;
            r4.A04 = i;
            r4.A0r = str;
            int i5 = this.A00 + 1;
            this.A00 = i5;
            r4.A0P = i5;
            AnonymousClass0C1 r2 = this.A03;
            AnonymousClass1RY r1 = this.A04;
            AnonymousClass0P4 A002 = r4.A00();
            r1.A04(A002);
            A02(r2, A002, A012);
        }
    }

    public final void Bco(Object obj, int i, C45941ys r9) {
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            A03(A012, i, r9, A00(A012, r9), A04(A012, r9));
        }
    }

    public final void Bcp(Object obj, int i, C45941ys r13) {
        Boolean bool;
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C45941ys r7 = r13;
            int A002 = A00(A012, r13);
            boolean A042 = A04(A012, r13);
            if (!((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.IGTV_AUDIO_LOGGING_FIX, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || (bool = this.A02) == null || bool.booleanValue() != A042) {
                A03(A012, i, r7, A002, A042);
            }
        }
    }

    public final void Bcq(Object obj, int i, C45941ys r17) {
        boolean z;
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C45941ys r3 = r17;
            int A002 = A00(A012, r3);
            int i2 = r3.A07;
            int i3 = r3.A04;
            int i4 = r3.A05;
            int i5 = r3.A08;
            boolean A042 = A04(A012, r3);
            C42991ta r6 = new C42991ta("video_buffering_finished", this.A04.A00, this.A03);
            r6.A0E = i4;
            r6.A0B = A002;
            r6.A0C = i3;
            r6.A01((double) A002, (double) i3);
            r6.A0H = i2;
            r6.A01 = (float) i5;
            r6.A0q = null;
            r6.A0Y = Boolean.valueOf(A042);
            r6.A03(A012);
            AnonymousClass1RY r4 = this.A04;
            r6.A0t = r4.A01();
            r6.A0T = r3.A0A;
            r6.A0M = r3.A00;
            int i6 = i;
            r6.A06 = i6;
            r6.A0D = i6;
            r6.A0A = r3.A02;
            r6.A0G = r3.A06;
            int i7 = this.A00 + 1;
            this.A00 = i7;
            r6.A0P = i7;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A003 = r6.A00();
            r4.A04(A003);
            A02(r1, A003, A012);
            C40441of r9 = this.A05;
            String str = A012.A06;
            int i8 = r3.A03;
            int i9 = r3.A07;
            int i10 = r3.A04;
            String str2 = r3.A0F;
            String str3 = r3.A0G;
            if (C40441of.A03(r9)) {
                C40561or r10 = r9.A02;
                int hashCode = str.hashCode();
                HashMap hashMap = new HashMap();
                hashMap.put("end_buffering_current_position_ms", Integer.toString(i8));
                hashMap.put("end_buffering_last_start_position_ms", Integer.toString(i9));
                hashMap.put("end_buffering_duration_sec", Float.toString((float) (((long) i10) / 1000)));
                hashMap.put("buffering_duration_sec", Float.toString((float) (((long) i6) / 1000)));
                C40441of.A00(1900562, hashCode, hashMap);
                r10.A00.markerEnd(1900562, hashCode, 291);
                C40541op r2 = r9.A03;
                C54382Xb r12 = new C54382Xb(Constants.A12, str, str2, i8);
                r12.A07 = str3;
                C40541op.A01(r2, new C54392Xc(r12));
                long uptimeMillis = SystemClock.uptimeMillis();
                C30690Dhe dhe = (C30690Dhe) C40441of.A09.get(Integer.valueOf(hashCode));
                if (dhe != null) {
                    dhe.A03(uptimeMillis);
                    synchronized (dhe) {
                        z = dhe.A05;
                    }
                    if (z && dhe.A00() != null && dhe.A00().A02 == 0) {
                        HashMap hashMap2 = new HashMap();
                        C40441of.A02(hashMap2, dhe, uptimeMillis);
                        C40441of.A00(1900557, hashCode, hashMap2);
                        dhe.A02();
                    }
                }
            }
        }
    }

    public final void Bcs(Object obj, String str, int i, int i2, String str2, C45941ys r15) {
        C45951yt A012 = A01(obj);
        if (A012 != null && str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            C42991ta r4 = new C42991ta("video_format_changed", this.A04.A00, this.A03);
            r4.A03(A012);
            r4.A0p = str;
            r4.A0T = r15.A0A;
            r4.A0S = r15.A09;
            r4.A00 = (float) i;
            r4.A0l = str2;
            r4.A0C = r15.A04;
            r4.A0B = r15.A03;
            r4.A0H = r15.A07;
            r4.A01 = (float) r15.A08;
            r4.A0A = r15.A02;
            r4.A0G = r15.A06;
            int i3 = this.A00 + 1;
            this.A00 = i3;
            r4.A0P = i3;
            AnonymousClass0C1 r2 = this.A03;
            AnonymousClass1RY r1 = this.A04;
            AnonymousClass0P4 A002 = r4.A00();
            r1.A04(A002);
            A02(r2, A002, A012);
            C40541op r22 = this.A05.A03;
            String str3 = A012.A06;
            String str4 = r15.A0F;
            int i4 = r15.A03;
            String str5 = r15.A0G;
            if (r22.A03.A00()) {
                AnonymousClass42W r3 = new AnonymousClass42W(str, i, i2 + "w_" + str);
                AnonymousClass42W r42 = r22.A00;
                if (r42 != null && !r42.equals(r3)) {
                    C54382Xb r12 = new C54382Xb(Constants.A0j, str3, str4, i4);
                    r12.A02 = Integer.valueOf(r42.A00);
                    r12.A08 = r42.A02;
                    r12.A03 = Integer.valueOf(r3.A00);
                    r12.A06 = r3.A02;
                    r12.A07 = str5;
                    r12.A09 = r42.A01;
                    C40541op.A01(r22, new C54392Xc(r12));
                }
                r22.A00 = r3;
            }
        }
    }

    public final void Bct(Object obj, String str, String str2) {
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C42991ta r3 = new C42991ta("video_failed_playing", this.A04.A00, this.A03);
            r3.A03(A012);
            r3.A0o = str;
            r3.A0k = str2;
            int i = this.A00 + 1;
            this.A00 = i;
            r3.A0P = i;
            AnonymousClass0C1 r2 = this.A03;
            AnonymousClass1RY r1 = this.A04;
            AnonymousClass0P4 A002 = r3.A00();
            r1.A04(A002);
            A02(r2, A002, A012);
        }
    }

    public final void Bcu(Object obj, boolean z) {
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C42991ta r3 = new C42991ta("video_fetched", this.A04.A00, this.A03);
            r3.A03(A012);
            r3.A0a = Boolean.valueOf(z);
            int i = this.A00 + 1;
            this.A00 = i;
            r3.A0P = i;
            AnonymousClass0C1 r2 = this.A03;
            AnonymousClass1RY r1 = this.A04;
            AnonymousClass0P4 A002 = r3.A00();
            r1.A04(A002);
            A02(r2, A002, A012);
        }
    }

    public final void Bcv(Object obj, String str, C45941ys r16) {
        String str2;
        C45951yt A012 = A01(obj);
        if (A012 != null && A012.A04 != null) {
            C40531oo r11 = this.A05.A01;
            String str3 = A012.A06;
            String A013 = C40451og.A01(A012);
            C45941ys r2 = r16;
            int i = r2.A01;
            C37671k2 r8 = A012.A04;
            String moduleName = this.A04.A00.getModuleName();
            long j = (long) r2.A04;
            String A032 = this.A04.A03(str);
            if (r11.A01.A00()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                int hashCode = str3.hashCode();
                HashMap hashMap = new HashMap();
                C40441of.A01(hashCode, hashMap, uptimeMillis);
                hashMap.put("duration", Integer.toString((int) (j / 1000)));
                C40441of.A00(1900557, hashCode, hashMap);
                r11.A00.markerEnd(1900557, hashCode, 2);
                if (r11.A01.A00()) {
                    r11.A00.markerStart(1900557, hashCode);
                }
                C30690Dhe dhe = new C30690Dhe();
                synchronized (dhe) {
                    dhe.A05 = true;
                }
                C40441of.A09.put(Integer.valueOf(hashCode), dhe);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(TraceFieldType.VideoId, str3);
                hashMap2.put("player_type", A013);
                hashMap2.put("start_bitrate", Integer.toString(i));
                if (r8 != null) {
                    hashMap2.put("streaming_format", C37671k2.A03(r8));
                }
                if (A013.equals(C43001tb.A00(Constants.A0N))) {
                    str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str2 = "0";
                }
                hashMap2.put("is_live_streaming", str2);
                hashMap2.put("player_origin", moduleName);
                hashMap2.put("original_play_reason", A032);
                C40441of.A00(1900557, hashCode, hashMap2);
            }
        }
    }

    public final void Bcw(Object obj, int i) {
        C45951yt A012 = A01(obj);
        if (A012 != null && i != 0) {
            C42991ta r3 = new C42991ta("video_played_time", this.A04.A00, this.A03);
            r3.A03(A012);
            r3.A0K = i;
            AnonymousClass1RY r2 = this.A04;
            r3.A0t = r2.A01();
            int i2 = this.A00 + 1;
            this.A00 = i2;
            r3.A0P = i2;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A002 = r3.A00();
            r2.A04(A002);
            A02(r1, A002, A012);
        }
    }

    public final void Bd4(Object obj, int i, int i2, int i3, C45941ys r10) {
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C42991ta r4 = new C42991ta("video_playing_update", this.A04.A00, this.A03);
            r4.A03(A012);
            r4.A0q = null;
            r4.A0Y = Boolean.valueOf(A04(A012, r10));
            r4.A0Z = Boolean.valueOf(r10.A0I);
            r4.A0B = r10.A03;
            r4.A0H = r10.A07;
            r4.A0C = r10.A04;
            r4.A0Q = i3;
            AnonymousClass1RY r2 = this.A04;
            r4.A0t = r2.A01();
            r4.A0T = r10.A0A;
            r4.A0M = r10.A00;
            r4.A0A = r10.A02;
            r4.A0G = r10.A06;
            r4.A05 = i;
            r4.A0I = i2;
            int i4 = this.A00 + 1;
            this.A00 = i4;
            r4.A0P = i4;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A002 = r4.A00();
            r2.A04(A002);
            A02(r1, A002, A012);
        }
    }

    public final void Bd5(Object obj, long j, String str, String str2, int i) {
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C42991ta r4 = new C42991ta("video_rendered", this.A04.A00, this.A03);
            r4.A03(A012);
            AnonymousClass1RY r2 = this.A04;
            r4.A0t = r2.A01();
            r4.A0U = j;
            r4.A0r = str;
            r4.A0g = str2;
            r4.A0R = i;
            int i2 = this.A00 + 1;
            this.A00 = i2;
            r4.A0P = i2;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A002 = r4.A00();
            r2.A04(A002);
            A02(r1, A002, A012);
            C40531oo r0 = this.A05.A01;
            String str3 = A012.A06;
            if (r0.A01.A00()) {
                int hashCode = str3.hashCode();
                HashMap hashMap = new HashMap();
                hashMap.put(TraceFieldType.VideoId, str3);
                hashMap.put("render_delay", Long.toString(j));
                C40441of.A00(1900557, hashCode, hashMap);
            }
        }
    }

    public final void Bd6(Object obj, C45941ys r8) {
        Float f;
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            int A002 = A00(A012, r8);
            C42991ta r4 = new C42991ta("video_view_size_changed", this.A04.A00, this.A03);
            r4.A03(A012);
            r4.A0T = r8.A0A;
            r4.A0S = r8.A09;
            r4.A0e = r8.A0E;
            r4.A0B = A002;
            r4.A0H = r8.A07;
            r4.A01 = (float) r8.A08;
            int i = this.A00 + 1;
            this.A00 = i;
            r4.A0P = i;
            Boolean bool = r8.A0B;
            if (bool != null) {
                r4.A0J = bool.booleanValue() ? 1 : 0;
            }
            Float f2 = r8.A0D;
            if (!(f2 == null || (f = r8.A0C) == null)) {
                r4.A03 = f2.floatValue();
                r4.A02 = f.floatValue();
            }
            AnonymousClass0C1 r2 = this.A03;
            AnonymousClass1RY r1 = this.A04;
            AnonymousClass0P4 A003 = r4.A00();
            r1.A04(A003);
            A02(r2, A003, A012);
        }
    }

    public final void Bd7(Object obj, C45941ys r7) {
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C42991ta r4 = new C42991ta("video_viewed", this.A04.A00, this.A03);
            r4.A03(A012);
            r4.A0q = null;
            r4.A0Y = Boolean.valueOf(A04(A012, r7));
            r4.A0Z = Boolean.valueOf(r7.A0I);
            r4.A0B = r7.A03;
            r4.A0H = r7.A07;
            r4.A0C = r7.A04;
            AnonymousClass1RY r2 = this.A04;
            r4.A0t = r2.A01();
            r4.A0T = r7.A0A;
            r4.A0M = r7.A00;
            r4.A0A = r7.A02;
            r4.A0G = r7.A06;
            int i = this.A00 + 1;
            this.A00 = i;
            r4.A0P = i;
            AnonymousClass0C1 r1 = this.A03;
            AnonymousClass0P4 A002 = r4.A00();
            r2.A04(A002);
            A02(r1, A002, A012);
        }
    }

    public final void Bd8(Object obj, String str, String str2) {
        C45951yt A012 = A01(obj);
        if (A012 != null) {
            C42991ta r3 = new C42991ta("video_playback_warning", this.A04.A00, this.A03);
            r3.A03(A012);
            r3.A0o = str;
            r3.A0k = str2;
            int i = this.A00 + 1;
            this.A00 = i;
            r3.A0P = i;
            AnonymousClass0C1 r2 = this.A03;
            AnonymousClass1RY r1 = this.A04;
            AnonymousClass0P4 A002 = r3.A00();
            r1.A04(A002);
            A02(r2, A002, A012);
        }
    }
}
