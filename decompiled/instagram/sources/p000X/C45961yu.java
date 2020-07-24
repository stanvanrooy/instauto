package p000X;

import android.content.Context;
import com.instagram.model.mediatype.MediaType;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.1yu  reason: invalid class name and case insensitive filesystem */
public final class C45961yu extends AnonymousClass1RY {
    public final AnonymousClass0C1 A00;
    public final Context A01;
    public final RealtimeClientManager A02;
    public final AnonymousClass35C A03;
    public final AnonymousClass2OR A04;
    public final C72023Df A05;
    public final String A06;
    public final AnonymousClass0IT A07;
    public final AnonymousClass0IT A08;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r2.A0K == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (r3 != false) goto L_0x0089;
     */
    public final /* bridge */ /* synthetic */ C45951yt A00(Object obj) {
        boolean z;
        String str;
        long longValue;
        String str2;
        boolean z2;
        boolean z3;
        char booleanValue;
        String str3;
        C39941no r0 = (C39941no) obj;
        boolean z4 = true;
        String str4 = null;
        boolean z5 = false;
        if (r0.A0y()) {
            str2 = r0.A0C().AZV();
            longValue = r0.A03();
            str = null;
        } else {
            if (!r0.A0n() && !r0.A0o()) {
                C38031kc r2 = r0.A09;
                if (r2 != null) {
                    z2 = true;
                }
                z2 = false;
                z = false;
            }
            z = true;
            if (z) {
                C38031kc r3 = r0.A09;
                String str5 = r3.A0P;
                str = r3.A0Q;
                longValue = r0.A03();
                str2 = null;
                str4 = str5;
            } else {
                AnonymousClass1NJ r4 = r0.A08;
                AnonymousClass0a4.A06(r4);
                if (C36901in.A0O(r4, this.A00)) {
                    str = C30671Ut.A0A(this.A00, r4);
                    z4 = false;
                    z5 = true;
                } else if (C36901in.A0N(r4, this.A00)) {
                    str = r4.A29;
                } else {
                    if (r4.Afk()) {
                        str = r4.A1y;
                    } else {
                        str = null;
                    }
                    z4 = false;
                }
                String id = r4.getId();
                longValue = r4.A0k().longValue();
                str2 = null;
                str4 = id;
            }
        }
        C13300iJ r22 = r0.A0D;
        AnonymousClass0a4.A06(r22);
        String id2 = r0.getId();
        boolean A0y = r0.A0y();
        String id3 = r22.getId();
        C13390iS r13 = r22.A0M;
        C37171jE A0A = r0.A0A();
        AnonymousClass1NJ r23 = r0.A08;
        if (r23 != null) {
            z3 = r23.A1G();
        } else {
            C38031kc r24 = r0.A09;
            z3 = false;
            if (r24 != null) {
                Boolean bool = r24.A0E;
                if (bool == null) {
                    booleanValue = 65535;
                } else {
                    booleanValue = bool.booleanValue();
                }
                if (booleanValue != 1) {
                    z3 = true;
                }
            }
        }
        MediaType A0B = r0.A0B();
        C37671k2 A0J = r0.A0J(this.A00);
        C43531uZ A082 = r0.A08();
        if (A082 != null) {
            str3 = A082.A00();
        } else {
            str3 = null;
        }
        return new C45951yt(id2, A0y, z4, z5, str2, str4, str, id3, r13, A0A, z3, longValue, A0B, A0J, str3, r0.A03);
    }

    public final String A01() {
        return this.A04.AaT();
    }

    public final String A02(String str) {
        if (this.A05.AhK()) {
            return "cobroadcast_finish";
        }
        return str;
    }

    public final String A03(String str) {
        if (this.A05.AhK()) {
            return "cobroadcast_finish";
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0181, code lost:
        if (r1 == null) goto L_0x0183;
     */
    public final void A04(AnonymousClass0P4 r11) {
        int i;
        int i2;
        int A072;
        C39941no A082;
        String str;
        AnonymousClass1YR r1;
        boolean A0n;
        int i3;
        boolean z;
        int intValue;
        r11.A0E("session_reel_counter", Integer.valueOf(this.A03.A00));
        r11.A0G("tray_session_id", this.A06);
        C50282Fr r2 = (C50282Fr) this.A07.get();
        if (r2 == null) {
            i = 0;
        } else {
            i = r2.A09;
        }
        r11.A0E("tray_position", Integer.valueOf(i));
        if (r2 == null) {
            i2 = -1;
        } else {
            i2 = r2.A02;
        }
        r11.A0E("reel_position", Integer.valueOf(i2));
        if (r2 == null) {
            A072 = -1;
        } else {
            A072 = r2.A0A.A07(this.A00);
        }
        r11.A0E("reel_size", Integer.valueOf(A072));
        if (r2 == null) {
            A082 = null;
        } else {
            A082 = r2.A08(this.A00);
        }
        String str2 = "0";
        if (A082 != null && A082.A0n()) {
            String str3 = str2;
            if (this.A02.isMqttConnected()) {
                str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            r11.A0G("mqtt_connection_status", str3);
            C15780nW r6 = new C15780nW(this.A01);
            C15780nW.A00(r6);
            int i4 = r6.A00;
            if (i4 != -1) {
                r11.A0E("battery_level", Integer.valueOf(i4));
            }
            C15780nW.A00(r6);
            String str4 = r6.A03;
            if (str4 != null) {
                r11.A0G("battery_status", str4);
            }
            String str5 = r11.A04;
            if (("video_paused".equals(str5) || "video_buffering_started".equals(str5)) && (intValue = ((Integer) this.A08.get()).intValue()) != -1) {
                r11.A0E("stale_mpd_count", Integer.valueOf(intValue));
            }
            C38031kc r0 = A082.A09;
            if (r0 != null) {
                C23520APq aPq = r0.A09;
                String str6 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                if (aPq == null) {
                    str6 = str2;
                }
                r11.A0G("live_donation", str6);
            }
        }
        if (A082 != null) {
            if (A082.A0o()) {
                i3 = Integer.valueOf(A082.A09.A01).intValue();
            } else if (A082.A0n()) {
                C38031kc r02 = A082.A09;
                if (r02 != null) {
                    String str7 = r02.A0K;
                    z = true;
                }
                z = false;
                i3 = 1;
                if (z) {
                    i3 = 2;
                }
            } else {
                i3 = -1;
            }
            if (i3 != -1) {
                r11.A0E("number_of_qualities", Integer.valueOf(i3));
            }
            if ("video_should_start".equals(r11.A04)) {
                r11.A0G("trigger", "auto");
            }
        }
        if (A082 != null && ((A0n = A082.A0n()) || A082.A0o())) {
            if (A0n) {
                str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            r11.A0G("is_live_streaming", str2);
        }
        if (A082 != null && A082.A0U() != null) {
            for (C34151eA r4 : A082.A0U()) {
                AnonymousClass1NJ r03 = A082.A08;
                boolean z2 = false;
                if (r03 != null && r03.A0D() > 0 && ((r1 = r4.A0F) == AnonymousClass1YR.IGTV || r1 == AnonymousClass1YR.Clips)) {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    C06270Ok A002 = C06270Ok.A00();
                    C13300iJ r04 = A082.A0D;
                    if (r04 != null) {
                        A002.A09("story_preview_media_owner_id", r04.getId());
                    }
                    A002.A09("story_preview_media_id", A082.A08.A0u());
                    r11.A08("adhoc_data", A002);
                    if (r4.A0F == AnonymousClass1YR.IGTV) {
                        str = "has_igtv_video";
                    } else {
                        str = "has_reshared_clips_video";
                    }
                    r11.A0G(str, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    return;
                }
            }
        }
    }

    public C45961yu(Context context, AnonymousClass0C1 r3, AnonymousClass0IT r4, AnonymousClass0IT r5, AnonymousClass35C r6, RealtimeClientManager realtimeClientManager, C72023Df r8, C27371Ho r9, String str, AnonymousClass2OR r11) {
        super(r9, r11.AaT());
        this.A01 = context;
        this.A00 = r3;
        this.A07 = r4;
        this.A08 = r5;
        this.A03 = r6;
        this.A02 = realtimeClientManager;
        this.A05 = r8;
        this.A04 = r11;
        this.A06 = str;
    }
}
