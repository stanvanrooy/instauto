package p000X;

import android.os.Looper;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import java.io.Serializable;

/* renamed from: X.0sL  reason: invalid class name and case insensitive filesystem */
public final class C18740sL implements C18750sM, Serializable {
    public static final C18760sN A01 = new C18760sN();
    public static final Thread A02;
    public final C18750sM A00;

    static {
        Looper mainLooper = Looper.getMainLooper();
        C13150hy.A01(mainLooper, "Looper.getMainLooper()");
        Thread thread = mainLooper.getThread();
        C13150hy.A01(thread, "Looper.getMainLooper().thread");
        A02 = thread;
    }

    public C18740sL(C18720sJ r4) {
        C18750sM r0;
        C13150hy.A02(r4, "initializer");
        Integer num = Constants.A0C;
        C13150hy.A02(num, DatePickerDialogModule.ARG_MODE);
        C13150hy.A02(r4, "initializer");
        int i = C18770sO.A00[num.intValue()];
        if (i == 1) {
            r0 = new C29051Ok(r4);
        } else if (i == 2) {
            r0 = new AnonymousClass93X(r4);
        } else if (i == 3) {
            r0 = new C18780sP(r4);
        } else {
            throw new C191608Hd();
        }
        this.A00 = r0;
    }

    public final boolean Aft() {
        return this.A00.Aft();
    }

    public final Object getValue() {
        if (C13150hy.A05(A02, Thread.currentThread())) {
            return this.A00.getValue();
        }
        throw new IllegalStateException("LazyUi block must be accessed only on UI thread.".toString());
    }
}
