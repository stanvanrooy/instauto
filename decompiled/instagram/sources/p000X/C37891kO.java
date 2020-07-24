package p000X;

import com.instagram.quickpromotion.intf.Trigger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1kO  reason: invalid class name and case insensitive filesystem */
public final class C37891kO {
    public static final long A03 = TimeUnit.HOURS.toMillis(2);
    public static final long UNSET_LAST_SUCCESSFUL_REQUEST_TIME = -1;
    public Trigger A00;
    public Long A01;
    public List A02;

    static {
        TimeUnit.SECONDS.toMillis(30);
    }

    public long getLastSuccessfulRequestTime() {
        return this.A01.longValue();
    }

    public static long getTtl(AnonymousClass0C1 r0, Trigger trigger) {
        return A03;
    }

    public C37891kO() {
    }

    public C37891kO(Trigger trigger) {
        this.A00 = trigger;
        this.A02 = new ArrayList();
        this.A01 = -1L;
    }
}
