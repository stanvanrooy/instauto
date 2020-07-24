package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.BJC */
public final class BJC extends BK8 implements Handler.Callback {
    public final Context A00;
    public final Handler A01;
    public final C25160B3p A02;
    public final HashMap A03 = new HashMap();

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.A03) {
                try {
                    BJP bjp = (BJP) message.obj;
                    BJD bjd = (BJD) this.A03.get(bjp);
                    if (bjd != null && bjd.A05.isEmpty()) {
                        if (bjd.A03) {
                            AnonymousClass0ZA.A04(bjd.A06.A01, 1, bjd.A04);
                            AnonymousClass0ZI.A01(bjd.A06.A00, bjd, 572429141);
                            bjd.A03 = false;
                            bjd.A00 = 2;
                        }
                        this.A03.remove(bjp);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.A03) {
                try {
                    BJP bjp2 = (BJP) message.obj;
                    BJD bjd2 = (BJD) this.A03.get(bjp2);
                    if (bjd2 != null && bjd2.A00 == 3) {
                        String valueOf = String.valueOf(bjp2);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName componentName = bjd2.A01;
                        if (componentName == null) {
                            componentName = null;
                        }
                        if (componentName == null) {
                            componentName = new ComponentName(bjp2.A02, "unknown");
                        }
                        bjd2.onServiceDisconnected(componentName);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            return true;
        }
    }

    public BJC(Context context) {
        this.A00 = context.getApplicationContext();
        this.A01 = new BCF(context.getMainLooper(), this);
        this.A02 = C25160B3p.A00();
    }
}
