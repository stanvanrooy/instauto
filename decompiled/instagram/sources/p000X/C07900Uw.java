package p000X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0Uw  reason: invalid class name and case insensitive filesystem */
public class C07900Uw extends Handler {
    public volatile boolean A00;
    public final /* synthetic */ C07910Ux A01;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000e */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e A[LOOP:0: B:5:0x000e->B:15:0x000e, LOOP_START, SYNTHETIC] */
    public void A00() {
        if (AnonymousClass0ZA.A0D(this, obtainMessage(3))) {
            synchronized (this) {
                while (!this.A00) {
                    wait();
                }
            }
        }
    }

    public void A01() {
        AnonymousClass0ZA.A0D(this, obtainMessage(1));
    }

    public void A02(Intent intent, int i, int i2) {
        AnonymousClass0ZA.A0D(this, obtainMessage(2, i, i2, intent));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07900Uw(C07910Ux r1, Looper looper) {
        super(looper);
        this.A01 = r1;
    }

    public final void handleMessage(Message message) {
        if (message != null) {
            int i = message.what;
            if (i == 1) {
                this.A01.A06();
            } else if (i == 2) {
                this.A01.A0A((Intent) message.obj, message.arg1, message.arg2);
            } else if (i == 3) {
                this.A01.A09();
                synchronized (this) {
                    this.A00 = true;
                    notifyAll();
                }
            } else {
                throw new IllegalStateException("Unsupported message");
            }
        } else {
            throw new IllegalStateException("Message is null");
        }
    }
}
