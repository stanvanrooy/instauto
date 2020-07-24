package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Iterator;
import p000X.A44;
import p000X.A47;
import p000X.ACK;
import p000X.AG6;
import p000X.AGC;
import p000X.AGJ;
import p000X.AGK;
import p000X.Constants;
import p000X.AnonymousClass0FY;
import p000X.C228089rf;

@ReactModule(name = "Timing")
public final class TimingModule extends NativeTimingSpec implements A47 {
    public static final String NAME = "Timing";
    public final AGC mJavaTimerManager;

    public void createTimer(double d, double d2, double d3, boolean z) {
        A44 reactApplicationContextIfActiveOrWarn;
        int i = (int) d;
        int i2 = (int) d2;
        AGC agc = this.mJavaTimerManager;
        long currentTimeMillis = System.currentTimeMillis();
        long j = (long) d3;
        if (agc.A06.AKB() && Math.abs(j - currentTimeMillis) > 60000 && (reactApplicationContextIfActiveOrWarn = agc.A0A.A00.getReactApplicationContextIfActiveOrWarn()) != null) {
            ((JSTimers) reactApplicationContextIfActiveOrWarn.A01(JSTimers.class)).emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0, (j - currentTimeMillis) + ((long) i2));
        boolean z2 = z;
        if (i2 != 0 || z) {
            agc.createTimer(i, max, z2);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        A44 reactApplicationContextIfActiveOrWarn2 = agc.A0A.A00.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn2 != null) {
            ((JSTimers) reactApplicationContextIfActiveOrWarn2.A01(JSTimers.class)).callTimers(writableNativeArray);
        }
    }

    public void deleteTimer(double d) {
        this.mJavaTimerManager.deleteTimer((int) d);
    }

    public String getName() {
        return NAME;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (((long) r1.A02) >= r7) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003f A[SYNTHETIC] */
    public boolean hasActiveTimersInRange(long j) {
        boolean z;
        boolean z2;
        AGC agc = this.mJavaTimerManager;
        synchronized (agc.A0C) {
            AGJ agj = (AGJ) agc.A0D.peek();
            if (agj != null) {
                if (!agj.A03) {
                    z = true;
                }
                z = false;
                if (!z) {
                    Iterator it = agc.A0D.iterator();
                    while (it.hasNext()) {
                        AGJ agj2 = (AGJ) it.next();
                        if (!agj2.A03) {
                            z2 = true;
                            if (((long) agj2.A02) < j) {
                                continue;
                                if (z2) {
                                }
                            }
                        }
                        z2 = false;
                        continue;
                        if (z2) {
                        }
                    }
                }
            }
        }
    }

    public void onHeadlessJsTaskFinish(int i) {
        AGC agc = this.mJavaTimerManager;
        boolean z = false;
        if (AG6.A00(agc.A05).A04.size() > 0) {
            z = true;
        }
        if (!z) {
            agc.A0F.set(false);
            AGC.A00(agc);
            AGC.A01(agc);
        }
    }

    public void onHeadlessJsTaskStart(int i) {
        AGC agc = this.mJavaTimerManager;
        if (!agc.A0F.getAndSet(true)) {
            if (!agc.A01) {
                agc.A09.A01(Constants.A0N, agc.A08);
                agc.A01 = true;
            }
            AGC.A02(agc);
        }
    }

    public void onHostDestroy() {
        AGC agc = this.mJavaTimerManager;
        AGC.A00(agc);
        AGC.A01(agc);
    }

    public void onHostPause() {
        AGC agc = this.mJavaTimerManager;
        agc.A0E.set(true);
        AGC.A00(agc);
        AGC.A01(agc);
    }

    public void onHostResume() {
        AGC agc = this.mJavaTimerManager;
        agc.A0E.set(false);
        if (!agc.A01) {
            agc.A09.A01(Constants.A0N, agc.A08);
            agc.A01 = true;
        }
        AGC.A02(agc);
    }

    public void setSendIdleEvents(boolean z) {
        this.mJavaTimerManager.setSendIdleEvents(z);
    }

    public TimingModule(A44 a44, C228089rf r6) {
        super(a44);
        AGK agk = new AGK(this);
        AnonymousClass0FY.A01(ACK.A06, "ReactChoreographer needs to be initialized.");
        this.mJavaTimerManager = new AGC(a44, agk, ACK.A06, r6);
    }

    public void initialize() {
        getReactApplicationContext().A06(this);
        AG6.A00(getReactApplicationContext()).A05.add(this);
    }

    public void onCatalystInstanceDestroy() {
        AG6.A00(getReactApplicationContext()).A05.remove(this);
        AGC agc = this.mJavaTimerManager;
        AGC.A00(agc);
        if (agc.A02) {
            agc.A09.A02(Constants.A0Y, agc.A07);
            agc.A02 = false;
        }
    }
}
