package p000X;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.concurrent.FutureTask;

/* renamed from: X.BSZ */
public final class BSZ extends C24842AuX {
    public static final SparseArray A00 = new SparseArray();

    public final boolean onStartJob(int i, Bundle bundle, C2095190p r7) {
        C25628BSj bSj = new C25628BSj();
        bSj.A00 = new FutureTask(new BSW(this, i, bSj, r7), (Object) null);
        A00.append(i, bSj);
        AnonymousClass0Z9.A03(AnonymousClass184.A00().A05().A04, bSj.A00, 1884508772);
        return true;
    }

    public final boolean onStopJob(int i) {
        SparseArray sparseArray = A00;
        C25628BSj bSj = (C25628BSj) sparseArray.get(i);
        if (bSj == null) {
            return true;
        }
        sparseArray.remove(i);
        if (bSj.A00.isDone()) {
            return false;
        }
        if (bSj.A01) {
            AnonymousClass0DB.A0K("DumpUploadJob", "Job %d running past cancel - interrupt not supported", Integer.valueOf(i));
            AnonymousClass184.A00().A08().A00("DumpUploadJob", "Job running past cancel", (Throwable) null);
            return false;
        }
        bSj.A00.cancel(false);
        return true;
    }
}
