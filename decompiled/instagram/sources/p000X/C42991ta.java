package p000X;

import android.location.Location;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1ta  reason: invalid class name and case insensitive filesystem */
public final class C42991ta {
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public float A02 = Float.NaN;
    public float A03 = Float.NaN;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A07 = -1;
    public int A08 = -1;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = -1;
    public int A0F = -1;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = -1;
    public int A0P = -1;
    public int A0Q = -1;
    public int A0R = -1;
    public int A0S = -1;
    public int A0T = -1;
    public long A0U = -1;
    public C06170Oa A0V;
    public C06170Oa A0W;
    public C06170Oa A0X;
    public Boolean A0Y;
    public Boolean A0Z;
    public Boolean A0a;
    public Boolean A0b;
    public Boolean A0c;
    public Boolean A0d;
    public String A0e = null;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public double A0u = Double.NaN;
    public C06270Ok A0v;
    public Long A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public String A18;
    public String A19;
    public List A1A;
    public boolean A1B;
    public final AnonymousClass0C1 A1C;
    public final C27371Ho A1D;
    public final String A1E;
    public final boolean A1F;
    public final boolean A1G;

    public final AnonymousClass0P4 A00() {
        C43011tc r4;
        int i;
        Location lastLocation;
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00(this.A1E, this.A1D);
        String str = this.A19;
        if (str != null && !this.A1F) {
            A002.A0G("video_type", str);
        }
        String str2 = this.A17;
        if (str2 != null) {
            A002.A0G("upload_id", str2);
        }
        String str3 = this.A13;
        if (str3 != null) {
            A002.A0G("m_pk", str3);
        }
        String str4 = this.A0p;
        if (str4 != null) {
            A002.A0G("representation_id", str4);
        }
        String str5 = this.A0x;
        if (str5 != null) {
            A002.A0G("a_pk", str5);
        }
        Long l = this.A0w;
        if (l != null) {
            A002.A0F("m_ts", l);
        }
        String str6 = this.A15;
        if (str6 != null) {
            A002.A0G("tracking_token", str6);
        }
        String str7 = this.A12;
        if (str7 != null) {
            A002.A0G("follow_status", str7);
        }
        int i2 = this.A0E;
        if (i2 != -1) {
            A002.A0E("m_ix", Integer.valueOf(i2));
        }
        int i3 = this.A0K;
        if (i3 != -1) {
            A002.A0D("played_time_on_clock", Float.valueOf(((float) i3) / 1000.0f));
        }
        int i4 = this.A0B;
        if (i4 != -1) {
            A002.A0D("time", Float.valueOf(((float) i4) / 1000.0f));
        }
        int i5 = this.A0N;
        if (i5 != -1) {
            A002.A0D("from_time", Float.valueOf(((float) i5) / 1000.0f));
        }
        int i6 = this.A0O;
        if (i6 != -1) {
            A002.A0D("to_time", Float.valueOf(((float) i6) / 1000.0f));
        }
        int i7 = this.A0A;
        if (i7 != -1) {
            A002.A0D("broadcast_time", Float.valueOf(((float) i7) / 1000.0f));
        }
        int i8 = this.A0C;
        if (i8 != -1) {
            A002.A0D("duration", Float.valueOf(((float) i8) / 1000.0f));
        }
        double d = this.A0u;
        if (!Double.isNaN(d)) {
            A002.A0C("timeAsPercent", Double.valueOf(d));
        }
        Boolean bool = this.A0Y;
        String str8 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        if (bool != null) {
            String str9 = "0";
            if (bool.booleanValue()) {
                str9 = str8;
            }
            A002.A0G("playing_audio", str9);
        }
        Boolean bool2 = this.A0Z;
        if (bool2 != null) {
            String str10 = "0";
            if (bool2.booleanValue()) {
                str10 = str8;
            }
            A002.A0G("audio_fetched", str10);
        }
        String str11 = this.A0m;
        if (str11 != null) {
            A002.A0G("original_start_reason", str11);
        }
        String str12 = this.A0o;
        if (str12 != null) {
            A002.A0G("reason", str12);
        }
        String str13 = this.A0k;
        if (str13 != null) {
            A002.A0G("error_message", str13);
        }
        Boolean bool3 = this.A0b;
        if (bool3 != null) {
            if (!bool3.booleanValue()) {
                str8 = "0";
            }
            A002.A0G("initial", str8);
        }
        long j = this.A0U;
        if (j != -1) {
            A002.A0F("start_delay", Long.valueOf(j));
        }
        Boolean bool4 = this.A0a;
        if (bool4 != null) {
            A002.A0A("cached", bool4);
        }
        Boolean bool5 = this.A0d;
        if (bool5 != null) {
            A002.A0A("warmed", bool5);
        }
        int i9 = this.A0H;
        if (i9 != -1) {
            A002.A0D("lsp", Float.valueOf(((float) i9) / 1000.0f));
        }
        int i10 = this.A0G;
        if (i10 != -1) {
            A002.A0D("broadcast_lsp", Float.valueOf(((float) i10) / 1000.0f));
        }
        int i11 = this.A05;
        if (i11 != -1) {
            A002.A0D("buffered_position", Float.valueOf(((float) i11) / 1000.0f));
        }
        int i12 = this.A0I;
        if (i12 != -1) {
            A002.A0D("live_edge_position", Float.valueOf(((float) i12) / 1000.0f));
        }
        int i13 = this.A06;
        if (i13 != -1) {
            A002.A0D("buffering_duration", Float.valueOf(((float) i13) / 1000.0f));
        }
        String str14 = this.A0q;
        if (str14 != null) {
            A002.A0G("system_volume", str14);
        }
        String str15 = this.A0s;
        if (str15 != null) {
            A002.A0G("video_player_state", str15);
        }
        float f = this.A01;
        if (!Float.isNaN(f)) {
            A002.A0D("loop_count", Float.valueOf(f));
        }
        Boolean bool6 = this.A0c;
        if (bool6 != null) {
            A002.A0A("streaming", bool6);
        }
        int i14 = this.A0L;
        if (i14 != -1) {
            A002.A0E("prefetch_size", Integer.valueOf(i14));
        }
        String str16 = this.A0h;
        if (str16 != null) {
            A002.A0G("source", str16);
        }
        int i15 = this.A0D;
        if (i15 != -1) {
            A002.A0E("elapsed_time", Integer.valueOf(i15));
        }
        int i16 = this.A07;
        if (i16 != -1) {
            A002.A0E("carousel_index", Integer.valueOf(i16));
        }
        int i17 = this.A08;
        if (i17 != -1) {
            A002.A0E("carousel_m_t", Integer.valueOf(i17));
        }
        String str17 = this.A0j;
        if (str17 != null) {
            A002.A0G("carousel_media_id", str17);
        }
        String str18 = this.A0i;
        if (str18 != null) {
            A002.A0G("carousel_cover_media_id", str18);
        }
        int i18 = this.A09;
        if (i18 != -1) {
            A002.A0E("carousel_size", Integer.valueOf(i18));
        }
        int i19 = this.A0Q;
        if (i19 != -1) {
            A002.A0E("update_counter", Integer.valueOf(i19));
        }
        String str19 = this.A0t;
        if (str19 != null) {
            A002.A0G("viewer_session_id", str19);
        }
        int i20 = this.A0T;
        if (i20 != -1) {
            A002.A0E("video_width", Integer.valueOf(i20));
        }
        int i21 = this.A0S;
        if (i21 != -1) {
            A002.A0E("video_height", Integer.valueOf(i21));
        }
        float f2 = this.A00;
        if (!Float.isNaN(f2)) {
            A002.A0D(TraceFieldType.Bitrate, Float.valueOf(f2));
        }
        String str20 = this.A0l;
        if (str20 != null) {
            A002.A0G("mime_type", str20);
        }
        int i22 = this.A0M;
        if (i22 != -1) {
            A002.A0E("recent_bandwidth", Integer.valueOf(i22));
        }
        int i23 = this.A0F;
        if (i23 != -1) {
            A002.A0E("is_dash_eligible", Integer.valueOf(i23));
        }
        String str21 = this.A18;
        if (str21 != null) {
            A002.A0G("video_codec", str21);
        }
        String str22 = this.A0n;
        if (str22 != null) {
            A002.A0G("playback_format", str22);
        }
        String str23 = this.A0f;
        if (str23 != null) {
            A002.A0G("audience", str23);
        }
        String str24 = this.A14;
        if (str24 != null) {
            A002.A0G("tracker_id", str24);
        }
        C06170Oa r1 = this.A0W;
        if (r1 != null) {
            A002.A09("historical_requested_bytes", r1);
        }
        C06170Oa r12 = this.A0V;
        if (r12 != null) {
            A002.A09("historical_avg_bitrate", r12);
        }
        C06170Oa r13 = this.A0X;
        if (r13 != null) {
            A002.A09("historical_stream_type", r13);
        }
        String str25 = this.A0r;
        if (str25 != null) {
            A002.A0G("video_decoder", str25);
        }
        String str26 = this.A0g;
        if (str26 != null) {
            A002.A0G("audio_decoder", str26);
        }
        int i24 = this.A0R;
        if (i24 != -1) {
            A002.A0E("video_decoder_init_time", Integer.valueOf(i24));
        }
        int i25 = this.A04;
        if (i25 != -1) {
            A002.A0E("decode_time_per_frame", Integer.valueOf(i25));
        }
        int i26 = this.A0P;
        if (i26 != -1) {
            A002.A0E("seq_num", Integer.valueOf(i26));
        }
        int i27 = this.A0J;
        if (i27 != -1) {
            A002.A0E("pip", Integer.valueOf(i27));
        }
        float f3 = this.A03;
        if (!Float.isNaN(f3)) {
            A002.A0D("view_width", Float.valueOf(f3));
        }
        float f4 = this.A02;
        if (!Float.isNaN(f4)) {
            A002.A0D("view_height", Float.valueOf(f4));
        }
        String str27 = this.A0e;
        if (str27 != null) {
            A002.A0G("app_orientation", str27);
        }
        String str28 = this.A11;
        if (str28 != null) {
            A002.A0G("effect_id", str28);
            String str29 = this.A0z;
            if (str29 == null) {
                str29 = "";
            }
            A002.A0G("channel_pk", str29);
        }
        String str30 = this.A10;
        if (str30 != null) {
            A002.A0G("discovery_session_id", str30);
        }
        String str31 = this.A0y;
        if (str31 != null) {
            A002.A0G("camera_session_id", str31);
        }
        A002.A0A("is_video_to_carousel", Boolean.valueOf(this.A1B));
        List list = this.A1A;
        if (list != null) {
            A002.A0I("video_to_carousel_cut_secs", list);
            A002.A0E("segment_count", Integer.valueOf(this.A1A.size()));
        }
        A002.A0G("a_i", this.A16);
        C06270Ok r0 = this.A0v;
        if (r0 != null) {
            A002.A04(r0);
        }
        if (this.A1G) {
            AnonymousClass0C1 r2 = this.A1C;
            Class<C43011tc> cls = C43011tc.class;
            synchronized (cls) {
                r4 = (C43011tc) r2.AVA(cls, new C43021td(r2));
            }
            String str32 = this.A13;
            if (str32 != null && !str32.isEmpty() && (i = r4.A01) != 0 && Math.abs(str32.hashCode() % i) == r4.A00 && C43011tc.A05.contains(A002.A04) && !AnonymousClass0Q7.A03().A0H() && C16230oG.isLocationEnabled(r4.A02) && C16230oG.isLocationPermitted(r4.A02)) {
                String str33 = (String) r4.A03.get(str32);
                if (str33 == null) {
                    str33 = AnonymousClass2ZY.A00().toString();
                    r4.A03.put(str32, str33);
                }
                A002.A0G("random_session_id", str33);
                A002.A0G("connection_type", (String) AnonymousClass0NT.A02(r4.A02).first);
                HashMap hashMap = new HashMap();
                AnonymousClass2ZZ.A01(r4.A04).A06(hashMap);
                A002.A0K(hashMap);
                String A012 = C54812Za.A00().A01();
                if (A012 != null && !A012.isEmpty()) {
                    A002.A0G("hardware_address", A012);
                }
                C16230oG r02 = C16230oG.A00;
                C16230oG r14 = r02;
                if (!(r02 == null || (lastLocation = r14.getLastLocation(r4.A04)) == null)) {
                    A002.A0C("device_lat", Double.valueOf(lastLocation.getLatitude()));
                    A002.A0C("device_long", Double.valueOf(lastLocation.getLongitude()));
                }
                A002.A0E("client_sample_weight", Integer.valueOf(r4.A01));
            }
        }
        return A002;
    }

    public final void A01(double d, double d2) {
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = d / d2;
        }
        this.A0u = d3;
    }

    public final void A02(AnonymousClass0C1 r3, AnonymousClass1NJ r4) {
        String str;
        String str2;
        String str3;
        String str4;
        this.A19 = C43001tb.A00(Constants.ZERO);
        this.A13 = r4.getId();
        this.A0w = r4.A0k();
        C27371Ho r1 = this.A1D;
        if (C36901in.A0O(r4, r1)) {
            str = C30671Ut.A0A(this.A1C, r4);
        } else if (C36901in.A0N(r4, r1)) {
            str = r4.A29;
        } else if (r4.Afk()) {
            str = r4.A1y;
        } else {
            str = null;
        }
        this.A15 = str;
        C27371Ho r12 = this.A1D;
        if (C36901in.A0O(r4, r12)) {
            str2 = "ad";
        } else if (C36901in.A0N(r4, r12)) {
            str2 = "organic";
        } else {
            str2 = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        this.A16 = str2;
        this.A0x = r4.A0Q(r3).A0c(r3).getId();
        this.A12 = C13300iJ.A02(r4.A0Q(r3).A0c(r3).A0M);
        C37171jE A0U2 = r4.A0U();
        if (A0U2 != C37171jE.DEFAULT) {
            this.A0f = A0U2.A00;
        }
        if (r4.AiO()) {
            C37671k2 A0e2 = r4.A0e();
            if (A0e2.A06()) {
                this.A0F = 1;
                if (A0e2.A04 != null) {
                    str4 = "dash";
                } else {
                    str4 = "progressive";
                }
                this.A0n = str4;
            }
            if (!A0e2.A06()) {
                C37661k1 r0 = A0e2.A01;
                if (r0 != null) {
                    str3 = r0.A03;
                } else {
                    str3 = null;
                }
                this.A0p = str3;
            }
            this.A18 = A0e2.A08;
        }
        C27371Ho r13 = this.A1D;
        if (r13 instanceof C30541Ug) {
            this.A0v = ((C30541Ug) r13).BYO(r4);
        }
    }

    public final void A03(C45951yt r5) {
        String str;
        C37671k2 r3;
        String str2;
        String str3;
        if (r5.A0D) {
            str = "organic";
        } else if (r5.A0F) {
            str = "ad";
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        this.A16 = str;
        this.A17 = r5.A09;
        this.A13 = r5.A07;
        this.A15 = r5.A08;
        this.A0w = Long.valueOf(r5.A00);
        this.A19 = C40451og.A01(r5);
        boolean z = true;
        if (!r5.A0E && (r3 = r5.A04) != null) {
            if (r3.A06()) {
                this.A0F = 1;
                this.A0n = "dash";
            } else {
                C37661k1[] r0 = r3.A0E;
                if (r0 != null && r0.length > 0) {
                    C37661k1 r02 = r3.A01;
                    if (r02 != null) {
                        str2 = r02.A03;
                    } else {
                        str2 = null;
                    }
                    this.A0p = str2;
                }
            }
            if (r3.A03 == Constants.A0N) {
                str3 = r3.A07;
            } else {
                str3 = null;
            }
            this.A14 = str3;
            this.A18 = r3.A08;
        }
        this.A12 = C13300iJ.A02(r5.A03);
        this.A0x = r5.A0A;
        List list = r5.A0B;
        if (list == null || list.isEmpty()) {
            z = false;
        }
        this.A1B = z;
        List list2 = r5.A0B;
        if (list2 != null) {
            this.A1A = new ArrayList(list2.size());
            for (Double d : r5.A0B) {
                this.A1A.add(d.toString());
            }
        }
        C37171jE r1 = r5.A01;
        if (r1 != C37171jE.DEFAULT) {
            this.A0f = r1.A00;
        }
        String str4 = r5.A05;
        this.A11 = str4;
        if (str4 != null) {
            this.A10 = AnonymousClass72T.A00(this.A1C).AVp(this.A11);
            this.A0y = C85393nH.A00(this.A1C).AHj();
            this.A0z = AnonymousClass72T.A00(this.A1C).AHv(this.A11);
        }
    }

    public C42991ta(String str, C27371Ho r7, AnonymousClass0C1 r8) {
        this.A1E = str;
        this.A1D = r7;
        this.A1C = r8;
        this.A1F = ((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.VIDEO_PRODUCT_SPECIFIC_ABR, "remove_video_type", false, (AnonymousClass04H) null)).booleanValue();
        this.A1G = ((Boolean) AnonymousClass0L6.A02(this.A1C, AnonymousClass0L7.VIDEO_REPORT_NI_DATA, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
    }
}
