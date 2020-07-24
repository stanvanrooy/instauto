package p000X;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.BO6 */
public final class BO6 extends BOA {
    public final BatteryManager A00;

    public final C25521BOf A0A(int i) {
        if (Build.VERSION.SDK_INT < 21) {
            return A05(Constants.A0N);
        }
        BatteryManager batteryManager = this.A00;
        if (batteryManager != null) {
            return A03(batteryManager.getIntProperty(i));
        }
        return A05(Constants.A0C);
    }

    public final C25521BOf A0B(HashMap hashMap) {
        Integer num;
        if (Build.VERSION.SDK_INT < 21) {
            num = Constants.A0N;
        } else if (this.A00 != null) {
            Set<String> keySet = hashMap.keySet();
            HashMap hashMap2 = new HashMap();
            for (String str : keySet) {
                hashMap2.put(str, Integer.valueOf(this.A00.getIntProperty(((Integer) hashMap.get(str)).intValue())));
            }
            return new C25502BNm(SystemClock.elapsedRealtime(), A01(), hashMap2);
        } else {
            num = Constants.A0C;
        }
        return A05(num);
    }

    public BO6(Context context, BQH bqh) {
        super(context, bqh);
        this.A00 = (BatteryManager) context.getSystemService("batterymanager");
    }
}
