package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.device.messaging.ADM;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.B5K */
public final class B5K implements C41981rI {
    public final Context A00;

    public final void BA0() {
    }

    public final void AdL(String str, boolean z) {
        ComponentName componentName = new ComponentName(this.A00, "com.instagram.notifications.push.ADMMessageHandler$Receiver");
        PackageManager packageManager = this.A00.getPackageManager();
        componentName.getClassName();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    public final void AqO(B5P b5p) {
        if (b5p != null) {
            b5p.A00.B8Z(false);
        }
    }

    public final void BZU() {
        new ADM(this.A00).startRegister();
    }

    public B5K(Context context) {
        this.A00 = context;
    }

    public final PushChannelType ATL() {
        return PushChannelType.AMAZON;
    }
}
