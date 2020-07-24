package p000X;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.B5D */
public final class B5D implements Runnable {
    public final Bundle A00;
    public final B5R A01;
    public final String A02;
    public final /* synthetic */ B5B A03;

    public B5D(B5B b5b, String str, B5R b5r, Bundle bundle) {
        this.A03 = b5b;
        this.A02 = str;
        this.A01 = b5r;
        this.A00 = bundle;
    }

    private void A00(int i) {
        B5B b5b;
        String str;
        synchronized (this.A03.mActiveTags) {
            try {
                this.A01.AiU(i);
                b5b = this.A03;
                str = this.A02;
            } catch (RemoteException e) {
                AnonymousClass0DB.A0J(B5B.TAG, "Error reporting result of operation to scheduler for %s", this.A02, e);
                b5b = this.A03;
                str = this.A02;
            } catch (Throwable th) {
                B5B.stopIfDone(this.A03, this.A02);
                throw th;
            }
            B5B.stopIfDone(b5b, str);
        }
    }

    public final void A01() {
        try {
            AnonymousClass0Z9.A03(this.A03.getExecutorService(), this, 702358699);
        } catch (RejectedExecutionException e) {
            AnonymousClass0DB.A0G(B5B.TAG, "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            A00(1);
        }
    }

    public final void run() {
        A00(this.A03.onRunTask(new B5G(this.A02, this.A00)));
    }
}
