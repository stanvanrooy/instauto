package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.flipper.core.StateSummary;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.AC6 */
public final class AC6 extends BroadcastReceiver {
    public final /* synthetic */ IgReactBoostPostModule A00;

    public AC6(IgReactBoostPostModule igReactBoostPostModule) {
        this.A00 = igReactBoostPostModule;
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = AnonymousClass0Z0.A01(1161616192);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.A00.mReactContext.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(StateSummary.$const$string(28), (Object) null);
        AnonymousClass0Z0.A0E(intent, 714379233, A01);
    }
}
