package p000X;

import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.animated.NativeAnimatedModule;

/* renamed from: X.A93 */
public abstract class A93 extends ACP {
    public final A3N A00;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r6.A04.size() > 0) goto L_0x0020;
     */
    public void A01(long j) {
        C23136A9b a9b;
        boolean z;
        if (!(this instanceof C23123A8b)) {
            AB4 ab4 = (AB4) this;
            try {
                AB3 nodesManager = NativeAnimatedModule.getNodesManager(ab4.A00);
                if (nodesManager != null) {
                    if (nodesManager.A02.size() <= 0) {
                        z = false;
                    }
                    z = true;
                    if (z) {
                        C228039ra.A00();
                        for (int i = 0; i < nodesManager.A04.size(); i++) {
                            nodesManager.A06.add((ABX) nodesManager.A04.valueAt(i));
                        }
                        nodesManager.A04.clear();
                        boolean z2 = false;
                        for (int i2 = 0; i2 < nodesManager.A02.size(); i2++) {
                            ABK abk = (ABK) nodesManager.A02.valueAt(i2);
                            abk.A01(j);
                            nodesManager.A06.add(abk.A01);
                            if (abk.A03) {
                                z2 = true;
                            }
                        }
                        AB3.A02(nodesManager, nodesManager.A06);
                        nodesManager.A06.clear();
                        if (z2) {
                            for (int size = nodesManager.A02.size() - 1; size >= 0; size--) {
                                ABK abk2 = (ABK) nodesManager.A02.valueAt(size);
                                if (abk2.A03) {
                                    if (abk2.A02 != null) {
                                        C228259s1 A03 = C23041A0r.A03();
                                        A03.putBoolean("finished", true);
                                        abk2.A02.invoke(A03);
                                    }
                                    nodesManager.A02.removeAt(size);
                                }
                            }
                        }
                    }
                }
                if (nodesManager != null || ab4.A00.mReactChoreographer != null) {
                    ACK ack = ab4.A00.mReactChoreographer;
                    AnonymousClass0FY.A00(ack);
                    ack.A01(Constants.A0C, ab4.A00.mAnimatedFrameCallback);
                    return;
                }
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            C23123A8b a8b = (C23123A8b) this;
            if (a8b.A01.A0I) {
                AnonymousClass0CH.A07("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "dispatchNonBatchedUIOperations", 861343727);
            while (true) {
                try {
                    if (16 - ((System.nanoTime() - j) / 1000000) < ((long) a8b.A00)) {
                        break;
                    }
                    synchronized (a8b.A01.A0O) {
                        try {
                            if (!a8b.A01.A0D.isEmpty()) {
                                a9b = (C23136A9b) a8b.A01.A0D.pollFirst();
                            }
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    a9b.execute();
                    a8b.A01.A01 += SystemClock.uptimeMillis() - uptimeMillis;
                } catch (Exception e2) {
                    th = e2;
                    a8b.A01.A0I = true;
                } catch (Throwable th2) {
                    AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 482656739);
                    throw th2;
                }
            }
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1833486735);
            A8K.A00(a8b.A01);
            AnonymousClass0FY.A01(ACK.A06, "ReactChoreographer needs to be initialized.");
            ACK.A06.A01(Constants.ONE, a8b);
            return;
        }
        throw th;
    }

    public A93(A3N a3n) {
        this.A00 = a3n;
    }
}
