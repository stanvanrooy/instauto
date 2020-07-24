package p000X;

import android.content.Context;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;
import java.util.concurrent.TimeUnit;

/* renamed from: X.B67 */
public final class B67 extends C252017t {
    public final Context A00;

    public B67(Context context) {
        super(context, 1);
        this.A00 = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.B6A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.B6B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.B6A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.B6A} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A04(AnonymousClass238 r11, Class cls) {
        B6A b6a;
        long j = r11.A03;
        if (j < 0) {
            B6B b6b = new B6B();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(r11.A02);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long j2 = r11.A04;
            if (j2 < 0) {
                j2 = -1;
            }
            long max = Math.max(timeUnit.toSeconds(j2), 1 + seconds);
            b6b.A01 = seconds;
            b6b.A00 = max;
            b6a = b6b;
        } else {
            B6A b6a2 = new B6A();
            b6a2.A01 = TimeUnit.MILLISECONDS.toSeconds(j);
            b6a = b6a2;
        }
        b6a.A02 = cls.getName();
        b6a.A03 = String.valueOf(r11.A00);
        b6a.A06 = r11.A07;
        int i = r11.A01;
        if (i == 0) {
            b6a.A00 = 2;
        } else if (i == 1) {
            b6a.A00 = 0;
        } else if (i == 2) {
            b6a.A00 = 1;
        }
        b6a.A05 = r11.A06;
        AnonymousClass236 r0 = r11.A05;
        if (r0 != null) {
            b6a.A01 = ((AnonymousClass24O) r0).A00;
        }
        GcmTaskServiceCompat.scheduleJobWithPossibleJobFallback(this.A00, b6a.A00(), 0);
    }

    public final void A02(int i, Class cls) {
        GcmTaskServiceCompat.cancelJob(this.A00, String.valueOf(i), cls);
    }
}
