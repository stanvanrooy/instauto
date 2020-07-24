package p000X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import java.util.Random;

/* renamed from: X.AO0 */
public final class AO0 {
    public static final C06180Ob A06 = C06190Oc.A00;
    public static final Random A07 = new Random();
    public long A00;
    public Integer A01 = Constants.ZERO;
    public final AnonymousClass0C1 A02;
    public final String A03;
    public final AnonymousClass0RN A04;
    public volatile String A05;

    public static void A00(AO0 ao0, String str, String str2, C06270Ok r8) {
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("facecast_trace_id_embedded", ao0.A04);
        if (ao0.A05 != null) {
            A002.A0G("stream_id", ao0.A05);
        }
        A002.A0E(TraceFieldType.StreamType, 0);
        A002.A0E("trace_id", 0);
        A002.A0G("source", "BROADCASTER");
        A002.A0C("event_id", Double.valueOf(((double) A07.nextLong()) - -9.223372036854776E18d));
        A002.A0F("event_creation_time", Long.valueOf(System.currentTimeMillis()));
        A002.A0G("event_severity", str2);
        A002.A0G("event_name", str);
        A002.A0G("parent_source", "");
        if (r8 != null) {
            A002.A08("metadata", r8);
        }
        AnonymousClass0WN.A01(ao0.A02).BcG(A002);
    }

    public final void A01() {
        Integer num = this.A01;
        if ((num == Constants.ONE || num == Constants.A0u) && this.A05 != null) {
            long j = this.A00;
            if (j < 0) {
                this.A01 = Constants.A0C;
                A00(this, "BEGIN", "INFO", (C06270Ok) null);
                return;
            }
            C06270Ok A002 = C06270Ok.A00();
            A002.A09("dur", AnonymousClass000.A0B("", System.currentTimeMillis() - j));
            this.A01 = Constants.A0Y;
            A00(this, "RESUME", "INFO", A002);
            this.A00 = -1;
        }
    }

    public final void A02(Integer num) {
        String str;
        if (this.A01 == Constants.ONE) {
            A01();
        }
        C06270Ok A002 = C06270Ok.A00();
        switch (num.intValue()) {
            case 0:
                str = "rtmp";
                break;
            case 2:
                str = "rtc";
                break;
            default:
                str = "";
                break;
        }
        A002.A09("t", str);
        this.A01 = Constants.A0N;
        A00(this, "SESSION_BEGIN", "INFO", A002);
    }

    public final void A03(String str) {
        String str2;
        C06270Ok r2;
        if (this.A05 != null) {
            this.A01 = Constants.A12;
            if (str != null) {
                r2 = C06270Ok.A00();
                r2.A09("e", str);
                str2 = "ERROR";
            } else {
                str2 = "INFO";
                r2 = null;
            }
            A00(this, "END", str2, r2);
            this.A05 = null;
        }
    }

    public AO0(AnonymousClass0C1 r2, Context context, AnonymousClass0RN r4) {
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = C06630Pu.A01(context);
    }
}
