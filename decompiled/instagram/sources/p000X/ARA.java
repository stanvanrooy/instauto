package p000X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.ARA */
public final class ARA extends Exception {
    public final BroadcastFailureType A00;
    public final String A01;

    public ARA(BroadcastFailureType broadcastFailureType, String str, String str2) {
        super(str2);
        this.A00 = broadcastFailureType;
        this.A01 = str;
    }
}
