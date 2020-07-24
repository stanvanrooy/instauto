package p000X;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.BJB */
public final class BJB extends BCF {
    public final /* synthetic */ BJA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BJB(BJA bja, Looper looper) {
        super(looper);
        this.A00 = bja;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f1, code lost:
        if (r3 == 7) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r2 == 7) goto L_0x0018;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b0  */
    public final void handleMessage(Message message) {
        ConnectionResult connectionResult;
        BKi bKi;
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        if (this.A00.A09.get() != message.arg1) {
            int i = message.what;
            if (!(i == 2 || i == 1)) {
                z3 = false;
            }
            z3 = true;
            if (z3) {
                ((C25421BJc) message.obj).A00();
                return;
            }
            return;
        }
        int i2 = message.what;
        if (!(i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) || this.A00.Aen()) {
            int i3 = message.what;
            PendingIntent pendingIntent = null;
            if (i3 == 4) {
                BJA bja = this.A00;
                bja.A06 = new ConnectionResult(message.arg2);
                if (bja.A0A || TextUtils.isEmpty(bja.A06()) || TextUtils.isEmpty((CharSequence) null)) {
                    z2 = false;
                } else {
                    try {
                        Class.forName(bja.A06());
                        z2 = true;
                    } catch (ClassNotFoundException unused) {
                        z2 = false;
                    }
                }
                if (z2) {
                    BJA bja2 = this.A00;
                    if (!bja2.A0A) {
                        BJA.A00(bja2, 3, (IInterface) null);
                        return;
                    }
                }
                BJA bja3 = this.A00;
                connectionResult = bja3.A06;
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(8);
                }
                bKi = bja3.A07;
            } else {
                if (i3 != 5) {
                    if (i3 == 3) {
                        Object obj2 = message.obj;
                        if (obj2 instanceof PendingIntent) {
                            pendingIntent = obj2;
                        }
                        connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                        bKi = this.A00.A07;
                    } else if (i3 == 6) {
                        BJA.A00(this.A00, 5, (IInterface) null);
                        C25438BKb bKb = this.A00.A0G;
                        if (bKb != null) {
                            bKb.Ay8(message.arg2);
                        }
                        BJA bja4 = this.A00;
                        bja4.A00 = message.arg2;
                        bja4.A03 = System.currentTimeMillis();
                        BJA.A01(bja4, 5, 1, (IInterface) null);
                        return;
                    } else if (i3 != 2 || this.A00.isConnected()) {
                        int i4 = message.what;
                        if (!(i4 == 2 || i4 == 1)) {
                            z = false;
                        }
                        z = true;
                        if (z) {
                            C25421BJc bJc = (C25421BJc) message.obj;
                            synchronized (bJc) {
                                try {
                                    obj = bJc.A00;
                                    if (bJc.A01) {
                                        String valueOf = String.valueOf(bJc);
                                        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                                        sb.append("Callback proxy ");
                                        sb.append(valueOf);
                                        sb.append(" being reused. This is not safe.");
                                        Log.w("GmsClient", sb.toString());
                                    }
                                } catch (Throwable th) {
                                    while (true) {
                                        th = th;
                                    }
                                }
                            }
                            if (obj != null) {
                                try {
                                    bJc.A01(obj);
                                } catch (RuntimeException e) {
                                    throw e;
                                }
                            }
                            synchronized (bJc) {
                                try {
                                    bJc.A01 = true;
                                } catch (Throwable th2) {
                                    while (true) {
                                        th = th2;
                                        break;
                                    }
                                }
                            }
                            bJc.A00();
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(45);
                        sb2.append("Don't know how to handle message: ");
                        sb2.append(i4);
                        Log.wtf("GmsClient", sb2.toString(), new Exception());
                        return;
                    }
                }
                BJA bja32 = this.A00;
                connectionResult = bja32.A06;
                if (connectionResult == null) {
                }
                bKi = bja32.A07;
            }
            bKi.BIm(connectionResult);
            BJA bja5 = this.A00;
            bja5.A01 = connectionResult.A00;
            bja5.A05 = System.currentTimeMillis();
            return;
        }
        ((C25421BJc) message.obj).A00();
        return;
        throw th;
    }
}
