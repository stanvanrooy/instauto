package p000X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0wp  reason: invalid class name and case insensitive filesystem */
public final class C21500wp implements C19560tg {
    public static final C05110Id A01 = new C21510wq();
    public final AnonymousClass0IT A00;

    /* access modifiers changed from: private */
    /* renamed from: A00 */
    public void BCL(C21460wl r9, AnonymousClass3LS r10) {
        C34151eA r7;
        C61412ll r0;
        List emptyList;
        Object obj;
        C65882uZ r2 = (C65882uZ) this.A00.get();
        String str = r10.A02;
        DirectThreadKey AY6 = r9.AY6();
        if (r2.AY2(AY6) != null) {
            C58012fA AQ7 = r2.AQ7(AY6, r9.A03);
            if (AQ7 == null || (r0 = AQ7.A0P) == null) {
                r7 = null;
            } else {
                List list = r0.A09;
                if (list != null) {
                    emptyList = Collections.unmodifiableList(list);
                } else {
                    emptyList = Collections.emptyList();
                }
                C123095Pm r22 = new C123095Pm();
                Iterator it = emptyList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (r22.apply(obj)) {
                        break;
                    }
                }
                r7 = (C34151eA) obj;
            }
            if (r7 != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1090974990:
                        if (str.equals("executing")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -948696717:
                        if (str.equals("queued")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1501196714:
                        if (str.equals("upload_failed_permanent")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1563991648:
                        if (str.equals("uploaded")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1885454214:
                        if (str.equals("upload_failed_transient")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0 || c == 1) {
                    r7.A0c = Integer.valueOf(r9.A00);
                } else if (c == 2 || c == 3) {
                    r7.A0c = null;
                } else if (c != 4) {
                    throw new IllegalStateException(AnonymousClass000.A0E("Invalid lifecycleState: ", str));
                }
            }
        }
    }

    public final void BCP(C17090pf r3, AnonymousClass3LS r4) {
        throw new IllegalStateException("Cancellations are unsupported");
    }

    public final /* bridge */ /* synthetic */ void BCQ(C17090pf r1, AnonymousClass3LS r2, AnonymousClass3LS r3) {
        BCL((C21460wl) r1, r3);
    }

    public C21500wp(AnonymousClass0IT r1) {
        this.A00 = r1;
    }
}
