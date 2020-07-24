package com.facebook.react.uimanager.events;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactSoftException;
import p000X.A0P;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0FY;
import p000X.C206608tl;
import p000X.C228259s1;

public class ReactEventEmitter implements RCTEventEmitter {
    public static final String TAG = "ReactEventEmitter";
    public final SparseArray mEventEmitters = new SparseArray();
    public final A44 mReactContext;

    private RCTEventEmitter getEventEmitter(int i) {
        int i2 = 1;
        if (i % 2 == 0) {
            i2 = 2;
        }
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) this.mEventEmitters.get(i2);
        if (rCTEventEmitter != null) {
            return rCTEventEmitter;
        }
        AnonymousClass0CH.A0B(TAG, "Unable to find event emitter for reactTag: %d - uiManagerType: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.mReactContext.A0A()) {
            return (RCTEventEmitter) this.mReactContext.A01(RCTEventEmitter.class);
        }
        ReactSoftException.logSoftException(TAG, new A0P(AnonymousClass000.A08("Cannot get RCTEventEmitter from Context for reactTag: ", i, " - uiManagerType: ", i2, " - No active Catalyst instance!")));
        return rCTEventEmitter;
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mEventEmitters.put(i, rCTEventEmitter);
    }

    public void unregister(int i) {
        this.mEventEmitters.remove(i);
    }

    public ReactEventEmitter(A44 a44) {
        this.mReactContext = a44;
    }

    public void receiveEvent(int i, String str, C228259s1 r4) {
        RCTEventEmitter eventEmitter = getEventEmitter(i);
        if (eventEmitter != null) {
            eventEmitter.receiveEvent(i, str, r4);
        }
    }

    public void receiveTouches(String str, C206608tl r5, C206608tl r6) {
        boolean z = false;
        if (r5.size() > 0) {
            z = true;
        }
        AnonymousClass0FY.A02(z);
        RCTEventEmitter eventEmitter = getEventEmitter(r5.getMap(0).getInt("target"));
        if (eventEmitter != null) {
            eventEmitter.receiveTouches(str, r5, r6);
        }
    }
}
