package p000X;

import com.facebook.flipper.core.StateSummary;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.react.modules.product.IgReactInsightsModule;

/* renamed from: X.AC5 */
public final class AC5 {
    public final /* synthetic */ IgReactInsightsModule A00;

    public AC5(IgReactInsightsModule igReactInsightsModule) {
        this.A00 = igReactInsightsModule;
    }

    public final void A00(String str, String str2, String str3) {
        C228259s1 A03 = C23041A0r.A03();
        A03.putString("selectedMediaType", str);
        A03.putString(StateSummary.$const$string(75), str2);
        A03.putString(StateSummary.$const$string(76), str3);
        A44 reactApplicationContextIfActiveOrWarn = this.A00.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("IGInsightsFilterApplyEvent", A03);
        }
    }
}
