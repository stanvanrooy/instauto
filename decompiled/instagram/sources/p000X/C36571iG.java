package p000X;

import android.os.Process;
import android.util.LruCache;
import com.facebook.common.util.TriState;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1iG  reason: invalid class name and case insensitive filesystem */
public final class C36571iG extends AnonymousClass0O9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass17R A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36571iG(AnonymousClass17R r4, int i, String str, long j) {
        super(10, 4, false, false);
        this.A02 = r4;
        this.A00 = i;
        this.A03 = str;
        this.A01 = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005b */
    public final void run() {
        boolean z;
        Integer valueOf;
        AnonymousClass17R r3 = this.A02;
        int i = this.A00;
        String str = this.A03;
        long j = this.A01;
        if (AnonymousClass1CU.A00()) {
            z = true;
        } else {
            z = r3.A01;
        }
        if (z) {
            LruCache lruCache = AnonymousClass17R.A04;
            synchronized (lruCache) {
                try {
                    valueOf = Integer.valueOf(i);
                    lruCache.remove(valueOf);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            Set set = AnonymousClass17R.A05;
            synchronized (set) {
                try {
                    if (set.contains(valueOf) && str.equals("DISK")) {
                        if (AnonymousClass00B.A01.isMarkerOn(25624577, i)) {
                            AnonymousClass00B.A01.markerAnnotate(25624577, i, "SOURCE", "DISK");
                            AnonymousClass00B.A01.A0K(25624577, i, 467, -1, TimeUnit.NANOSECONDS, (TriState) null, "DISK", Process.myTid(), (AnonymousClass0IA) null);
                            AnonymousClass00B.A01.markerEnd(25624577, i, 3, j);
                        }
                        set.remove(valueOf);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            if (AnonymousClass00B.A01.isMarkerOn(25624577, i)) {
                AnonymousClass00B.A01.markerDrop(25624577, i);
            }
        }
    }
}
