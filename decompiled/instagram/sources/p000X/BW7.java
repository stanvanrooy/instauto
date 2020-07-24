package p000X;

import android.os.Process;
import com.facebook.video.heroplayer.service.HeroService;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.BW7 */
public final class BW7 implements Runnable {
    public final /* synthetic */ HeroService.C01067 A00;
    public final /* synthetic */ boolean A01;

    public BW7(HeroService.C01067 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0064, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0082=Splitter:B:27:0x0082, B:15:0x0044=Splitter:B:15:0x0044} */
    public final void run() {
        Set set;
        Iterator it;
        BW6 bw6 = BW6.A03;
        boolean z = this.A01;
        synchronized (bw6) {
            if (z) {
                if (bw6.A02.get() == 0) {
                    bw6.A02.set(1);
                    Set set2 = bw6.A01;
                    Map map = bw6.A00;
                    it = set2.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        if (!map.containsKey(num)) {
                            try {
                                int intValue = num.intValue();
                                Integer valueOf = Integer.valueOf(Process.getThreadPriority(intValue));
                                Process.setThreadPriority(intValue, 19);
                                map.put(num, valueOf);
                            } catch (IllegalArgumentException ) {
                                it.remove();
                            } catch (Exception unused) {
                                continue;
                            }
                            it.remove();
                        }
                    }
                }
            }
            if (!z && bw6.A02.get() == 1) {
                bw6.A02.set(0);
                set = bw6.A01;
                Map map2 = bw6.A00;
                for (Integer num2 : map2.keySet()) {
                    try {
                        Process.setThreadPriority(num2.intValue(), ((Integer) map2.get(num2)).intValue());
                    } catch (IllegalArgumentException ) {
                        set.remove(num2);
                    } catch (Exception unused2) {
                    }
                    set.remove(num2);
                }
                map2.clear();
            }
        }
    }
}
