package p000X;

import android.util.Log;
import com.facebook.browser.lite.BrowserLiteFragment;
import java.lang.Thread;

/* renamed from: X.AQD */
public final class AQD implements Thread.UncaughtExceptionHandler {
    public static AQD A02;
    public C23539AQj A00;
    public Thread.UncaughtExceptionHandler A01;

    public final void uncaughtException(Thread thread, Throwable th) {
        C23539AQj aQj = this.A00;
        if (aQj != null) {
            AQA aqa = aQj.A00.A0M;
            if (aqa.A0R) {
                aqa.A0N = true;
            }
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AQA aqa2 = aQj.A00.A0M;
            if (aqa2.A0R) {
                aqa2.A0I = message;
            }
            String stackTraceString = Log.getStackTraceString(th);
            if (aqa2.A0R) {
                aqa2.A0J = stackTraceString;
            }
            ATL A002 = ATL.A00();
            BrowserLiteFragment browserLiteFragment = aQj.A00;
            A002.A04(browserLiteFragment.A0M.A01(), browserLiteFragment.A0A);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A01;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
