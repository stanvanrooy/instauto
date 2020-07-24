package p000X;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0nY  reason: invalid class name and case insensitive filesystem */
public abstract class C15800nY {
    public static Application A00;
    public static C30788DkB A01;
    public static C15800nY A02;

    public abstract boolean getShouldShowSmartLockForLogin();

    public abstract void getSmartLockBroker(FragmentActivity fragmentActivity, C138525vP r2, C06590Pq r3);

    public abstract C136355rr listenForSmsResponse(Activity activity, boolean z);

    public abstract void setShouldShowSmartLockForLogin(boolean z);

    public static synchronized C15800nY getInstance() {
        C15800nY r0;
        synchronized (C15800nY.class) {
            if (A02 == null) {
                try {
                    A02 = (C15800nY) Class.forName("com.instagram.login.smartlock.impl.SmartLockPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    return null;
                }
            }
            r0 = A02;
        }
        return r0;
    }

    public static AnonymousClass2MT getInstanceAsync() {
        return new AnonymousClass2MT(486, new C136345rq());
    }

    public static synchronized void resetState() {
        synchronized (C15800nY.class) {
            A02 = null;
        }
    }

    public static void setApplication(Application application) {
        A00 = application;
    }

    public static void setInstanceObserver(C30788DkB dkB) {
        A01 = dkB;
    }
}
