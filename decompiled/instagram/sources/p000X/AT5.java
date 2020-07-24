package p000X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;

/* renamed from: X.AT5 */
public final class AT5 implements ServiceConnection {
    public final /* synthetic */ AT3 A00;

    public AT5(AT3 at3) {
        this.A00 = at3;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.A00 = new Messenger(iBinder);
        AT3.A00(this.A00);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A00 = null;
    }
}
