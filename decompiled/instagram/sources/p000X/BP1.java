package p000X;

import android.app.KeyguardManager;

/* renamed from: X.BP1 */
public final class BP1 implements C25584BQq {
    public final /* synthetic */ C25554BPm A00;

    public BP1(C25554BPm bPm) {
        this.A00 = bPm;
    }

    public final C25521BOf ADg() {
        C25554BPm bPm = this.A00;
        KeyguardManager keyguardManager = bPm.A00;
        if (keyguardManager == null) {
            return bPm.A05(Constants.A0C);
        }
        return bPm.A09(keyguardManager.isKeyguardLocked());
    }
}
