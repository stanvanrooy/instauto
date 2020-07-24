package p000X;

import android.os.Handler;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportSinkFactoryHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AVU */
public final class AVU {
    public TransportCallbacks A00;
    public TransportSinkFactoryHolder A01;
    public final Handler A02;
    public final LiveStreamingClient.LiveStreamingSessionCallbacks A03;
    public final LiveStreamingConfig A04;
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();

    public AVU(LiveStreamingConfig liveStreamingConfig, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, Handler handler) {
        this.A04 = liveStreamingConfig;
        this.A03 = liveStreamingSessionCallbacks;
        this.A02 = handler;
    }
}
