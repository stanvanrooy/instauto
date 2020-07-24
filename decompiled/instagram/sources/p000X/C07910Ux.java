package p000X;

import android.app.Service;
import android.content.Intent;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0Ux  reason: invalid class name and case insensitive filesystem */
public abstract class C07910Ux extends Service {
    public boolean A00;
    public final Object A01 = new Object();
    public volatile C07900Uw A02;

    public abstract Looper A07();

    public abstract void A08();

    public abstract void A09();

    public abstract void A0A(Intent intent, int i, int i2);

    public final void onStart(Intent intent, int i) {
        onStartCommand(intent, -1, i);
    }

    public final void A06() {
        synchronized (this.A01) {
            if (!this.A00) {
                A08();
                this.A00 = true;
            }
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        A06();
        A0B(fileDescriptor, printWriter, strArr);
    }

    public void onCreate() {
        int A04 = AnonymousClass0Z0.A04(113381559);
        super.onCreate();
        Looper A07 = A07();
        if (A07 == null || A07 == Looper.getMainLooper()) {
            this.A02 = new C10620db(this, Looper.getMainLooper());
        } else {
            this.A02 = new C07900Uw(this, A07);
        }
        this.A02.A01();
        AnonymousClass0Z0.A0B(-693646734, A04);
    }

    public void onDestroy() {
        int A04 = AnonymousClass0Z0.A04(-176630759);
        this.A02.A00();
        super.onDestroy();
        AnonymousClass0Z0.A0B(490435558, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(-1099767358);
        this.A02.A02(intent, i, i2);
        AnonymousClass0Z0.A0B(-447248196, A04);
        return 1;
    }

    public void A0B(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }
}
