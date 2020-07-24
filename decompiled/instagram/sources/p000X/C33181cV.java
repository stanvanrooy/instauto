package p000X;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.1cV  reason: invalid class name and case insensitive filesystem */
public final class C33181cV extends FutureTask {
    public final /* synthetic */ C33161cT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33181cV(C33161cT r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public final void done() {
        try {
            Object obj = get();
            C33161cT r1 = this.A00;
            if (!r1.A02.get()) {
                r1.A03(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            C33161cT r2 = this.A00;
            if (!r2.A02.get()) {
                r2.A03((Object) null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
