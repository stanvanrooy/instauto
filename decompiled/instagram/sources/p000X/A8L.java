package p000X;

import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import com.facebook.systrace.TraceDirect;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.A8L */
public final class A8L implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ A8K A05;
    public final /* synthetic */ ArrayDeque A06;
    public final /* synthetic */ ArrayList A07;
    public final /* synthetic */ ArrayList A08;

    public A8L(A8K a8k, int i, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j, long j2, long j3, long j4) {
        this.A05 = a8k;
        this.A00 = i;
        this.A08 = arrayList;
        this.A06 = arrayDeque;
        this.A07 = arrayList2;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A04 = j4;
    }

    public final void run() {
        C08750Yk A022 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "DispatchUI");
        A022.A00("BatchId", this.A00);
        A022.A02();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList = this.A08;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    A9M a9m = (A9M) it.next();
                    try {
                        a9m.ADi();
                    } catch (A9K e) {
                        if (a9m.AUc() == 0) {
                            a9m.Acz();
                            this.A05.A0G.add(a9m);
                        } else {
                            ReactSoftException.logSoftException("UIViewOperationQueue", new A0P((Throwable) e));
                        }
                    } catch (Throwable th) {
                        ReactSoftException.logSoftException("UIViewOperationQueue", th);
                    }
                }
            }
            ArrayDeque arrayDeque = this.A06;
            if (arrayDeque != null) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext()) {
                    ((C23136A9b) it2.next()).execute();
                }
            }
            ArrayList arrayList2 = this.A07;
            if (arrayList2 != null) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((C23136A9b) it3.next()).execute();
                }
            }
            A8K a8k = this.A05;
            if (a8k.A0J && a8k.A04 == 0) {
                long j = this.A01;
                a8k.A04 = j;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                a8k.A03 = uptimeMillis2;
                a8k.A06 = this.A03;
                a8k.A05 = this.A02;
                a8k.A09 = uptimeMillis;
                a8k.A08 = uptimeMillis2;
                a8k.A0A = this.A04;
                Systrace.A06(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "delayBeforeDispatchViewUpdates", 0, j * 1000000);
                long j2 = this.A05.A05 * 1000000;
                if (Systrace.A08(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED)) {
                    TraceDirect.asyncTraceEnd("delayBeforeDispatchViewUpdates", 0, C08670Yb.A00(j2));
                }
                Systrace.A06(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "delayBeforeBatchRunStart", 0, this.A05.A05 * 1000000);
                long j3 = this.A05.A09 * 1000000;
                if (Systrace.A08(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED)) {
                    TraceDirect.asyncTraceEnd("delayBeforeBatchRunStart", 0, C08670Yb.A00(j3));
                }
            }
            A8K a8k2 = this.A05;
            a8k2.A0L.A0A.A02();
            A9W a9w = a8k2.A0C;
            if (a9w != null) {
                a9w.BVj();
            }
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 448273833);
        } catch (Exception e2) {
            this.A05.A0I = true;
            throw e2;
        } catch (Throwable th2) {
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -817232817);
            throw th2;
        }
    }
}
