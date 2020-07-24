package p000X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.0Ui  reason: invalid class name and case insensitive filesystem */
public final class C07760Ui implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C07890Uv A01;

    public C07760Ui(C07890Uv r1, Pair pair) {
        this.A01 = r1;
        this.A00 = pair;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        if (r6.A06() == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r6.A06() == false) goto L_0x001b;
     */
    public final void run() {
        boolean z;
        boolean z2;
        C07890Uv r3 = this.A01;
        List list = (List) this.A00.first;
        if (list != null && !list.isEmpty()) {
            C07990Vf r6 = r3.A0l;
            if (r6 != null) {
                z2 = true;
            }
            z2 = false;
            if (z2) {
                try {
                    int andIncrement = C07990Vf.A0c.getAndIncrement() & 65535;
                    r3.A0L.A01(r6, "callSub", AnonymousClass0W6.SUBACK, andIncrement, r3.A0B.A00().A0I);
                    synchronized (r6) {
                        if (r6.A06()) {
                            AnonymousClass0Z9.A03(r6.A0J, new AnonymousClass0VY(r6, list, andIncrement), 1495634195);
                        } else {
                            throw new C08040Vk(Constants.ZERO);
                        }
                    }
                } catch (C08040Vk e) {
                    AnonymousClass0DB.A0N("FbnsConnectionManager", e, "exception/subscribe");
                    r3.A0E(r6, C07450Td.SEND_FAILURE, C07880Uu.CONNECTION_LOST);
                }
            }
        }
        C07890Uv r32 = this.A01;
        List list2 = (List) this.A00.second;
        if (list2 != null && !list2.isEmpty()) {
            C07990Vf r62 = r32.A0l;
            if (r62 != null) {
                z = true;
            }
            z = false;
            if (z) {
                try {
                    int andIncrement2 = C07990Vf.A0c.getAndIncrement() & 65535;
                    r32.A0L.A01(r62, "callUnSub", AnonymousClass0W6.UNSUBACK, andIncrement2, r32.A0B.A00().A0I);
                    synchronized (r62) {
                        if (r62.A06()) {
                            AnonymousClass0Z9.A03(r62.A0J, new AnonymousClass0VZ(r62, list2, andIncrement2), 167544367);
                        } else {
                            throw new C08040Vk(Constants.ZERO);
                        }
                    }
                } catch (C08040Vk e2) {
                    AnonymousClass0DB.A0N("FbnsConnectionManager", e2, "exception/unsubscribe");
                    r32.A0E(r62, C07450Td.SEND_FAILURE, C07880Uu.CONNECTION_LOST);
                }
            }
        }
    }
}
