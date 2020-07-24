package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.BOA */
public class BOA {
    public final Intent A00;
    public final Context A01;
    public final BQH A02;

    public final BR8 A01() {
        String packageName;
        if (this.A02.A08 == C25520BOe.OFFSITE) {
            return null;
        }
        Context context = this.A01;
        if (context == null) {
            packageName = "";
        } else {
            packageName = context.getPackageName();
        }
        return new BR8(packageName);
    }

    public final C25521BOf A02(float f) {
        return new BOB(SystemClock.elapsedRealtime(), A01(), f);
    }

    public final C25521BOf A03(int i) {
        return new BOC(SystemClock.elapsedRealtime(), A01(), i);
    }

    public final C25521BOf A04(long j) {
        return new BO4(SystemClock.elapsedRealtime(), A01(), j);
    }

    public final C25521BOf A05(Integer num) {
        return new C25523BOh(SystemClock.elapsedRealtime(), A01(), new C25522BOg(num));
    }

    public final C25521BOf A06(String str) {
        return new BO5(SystemClock.elapsedRealtime(), A01(), str);
    }

    public final C25521BOf A07(String str, int i) {
        Intent intent = this.A00;
        if (intent != null) {
            return A03(intent.getIntExtra(str, i));
        }
        return A05(Constants.A0C);
    }

    public final C25521BOf A08(List list) {
        return new BOP(SystemClock.elapsedRealtime(), A01(), list, Constants.A0N);
    }

    public final C25521BOf A09(boolean z) {
        return new BO1(SystemClock.elapsedRealtime(), A01(), z);
    }

    public BOA(Context context, BQH bqh) {
        this.A01 = context;
        this.A02 = bqh;
        this.A00 = context != null ? context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) : null;
    }
}
