package p000X;

import com.facebook.common.networkreachability.AndroidReachabilityListener;
import com.facebook.common.networkreachability.NetworkStateInfo;

/* renamed from: X.BV7 */
public final class BV7 implements NetworkStateInfo {
    public final /* synthetic */ AndroidReachabilityListener A00;

    public BV7(AndroidReachabilityListener androidReachabilityListener) {
        this.A00 = androidReachabilityListener;
    }

    public final int getNetworkState() {
        return this.A00.mNetworkTypeProvider.A00();
    }
}
