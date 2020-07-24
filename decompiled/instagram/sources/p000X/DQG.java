package p000X;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* renamed from: X.DQG */
public final class DQG {
    public final PhoneStateListener A00;
    public final TelephonyManager A01;

    public DQG(Context context, DQK dqk) {
        this.A01 = (TelephonyManager) context.getSystemService("phone");
        this.A00 = new DQH(dqk);
    }
}
