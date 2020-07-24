package p000X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.heroplayer.ipc.VideoSource;
import java.util.Locale;

/* renamed from: X.1ot  reason: invalid class name and case insensitive filesystem */
public final class C40581ot {
    public int A00 = -1;
    public long A01 = 0;
    public String A02;
    public final C40591ou A03;
    public final String A04;

    public C40581ot(AnonymousClass0C1 r4, String str) {
        C40591ou r2 = new C40591ou(r4, C40611ow.A03.A01);
        this.A04 = str;
        this.A03 = r2;
    }

    public final void A00(int i, VideoSource videoSource, Integer num, int i2, int i3) {
        C06270Ok r5;
        if (i2 > 0) {
            r5 = C06270Ok.A00();
            r5.A07("stall_count", Integer.valueOf(i2));
            r5.A07("stall_time", Integer.valueOf(i3));
        } else {
            r5 = null;
        }
        A01("live_video_finished_playing", i, videoSource, num, r5);
    }

    public final void A01(String str, int i, VideoSource videoSource, Integer num, C06270Ok r15) {
        String str2;
        C40591ou r5 = this.A03;
        String str3 = this.A04;
        String str4 = this.A02;
        int i2 = this.A00;
        long j = this.A01;
        this.A01 = 1 + j;
        String str5 = null;
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00(str, (AnonymousClass0RN) null);
        A002.A0G(TraceFieldType.VideoId, str3);
        if (videoSource == null) {
            str2 = null;
        } else {
            str2 = videoSource.A08;
        }
        A002.A0G("player_origin", str2);
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str5 = "StoriesVod";
                    break;
                case 2:
                    str5 = "DirectVod";
                    break;
                case 3:
                    str5 = "Live";
                    break;
                case 4:
                    str5 = "LiveVod";
                    break;
                case 5:
                    str5 = "DirectAudio";
                    break;
                case 6:
                    str5 = "Music";
                    break;
                case 7:
                    str5 = "Local";
                    break;
                case 8:
                    str5 = "CoWatchLocal";
                    break;
                default:
                    str5 = "Vod";
                    break;
            }
        }
        A002.A0G("player", str5);
        A002.A0E("video_time_position_ms", Integer.valueOf(i));
        A002.A0G("event_name", str.substring(11).toUpperCase(Locale.ROOT));
        A002.A0G("stream_id", str4);
        A002.A0E(TraceFieldType.StreamType, Integer.valueOf(i2));
        A002.A0G("source", r5.A01);
        A002.A0G("trace_id", "0");
        A002.A0F("event_id", Long.valueOf(j));
        A002.A0F("event_creation_time", Long.valueOf(System.currentTimeMillis()));
        if (r15 != null) {
            A002.A08("metadata", r15);
        }
        A002.A0G("event_severity", "INFO");
        AnonymousClass0WN.A01(r5.A00).BcG(A002);
    }
}
