package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.systrace.SystraceMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000X.A0i;
import p000X.A1e;
import p000X.A1k;
import p000X.A3L;
import p000X.A3W;
import p000X.A3o;
import p000X.A44;
import p000X.A47;
import p000X.A88;
import p000X.A89;
import p000X.A8A;
import p000X.A8B;
import p000X.A8C;
import p000X.A8D;
import p000X.A8E;
import p000X.A8G;
import p000X.A8I;
import p000X.A8K;
import p000X.A8h;
import p000X.A8n;
import p000X.A8q;
import p000X.A91;
import p000X.A94;
import p000X.A96;
import p000X.A99;
import p000X.A9B;
import p000X.A9C;
import p000X.A9L;
import p000X.A9N;
import p000X.A9T;
import p000X.A9U;
import p000X.A9W;
import p000X.A9X;
import p000X.ACK;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0ZJ;
import p000X.AnonymousClass90C;
import p000X.AnonymousClass951;
import p000X.C04450Ea;
import p000X.C08750Yk;
import p000X.C228039ra;
import p000X.C228259s1;
import p000X.C230099zE;
import p000X.C230109zF;
import p000X.C23041A0r;
import p000X.C23043A0y;
import p000X.C23053A3d;
import p000X.C23083A5v;
import p000X.C23122A8a;
import p000X.C23125A8d;
import p000X.C23127A8g;
import p000X.C23128A8i;
import p000X.C23129A8k;
import p000X.C23130A8l;
import p000X.C23134A8z;
import p000X.C23135A9a;
import p000X.C23141A9l;
import p000X.C23184ABm;

@ReactModule(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements A3o, A47 {
    public static final boolean DEBUG = false;
    public static final String NAME = "UIManager";
    public int mBatchId;
    public final Map mCustomDirectEvents;
    public final A9C mEventDispatcher;
    public final List mListeners;
    public final A91 mMemoryTrimCallback;
    public final Map mModuleConstants;
    public final A8G mUIImplementation;
    public final List mUIManagerListeners;
    public Map mViewManagerConstantsCache;
    public volatile int mViewManagerConstantsCacheSize;
    public final C23125A8d mViewManagerRegistry;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    private C228259s1 computeConstantsForViewManager(String str) {
        ViewManager viewManager;
        if (str != null) {
            C23125A8d a8d = this.mUIImplementation.A06;
            viewManager = (ViewManager) a8d.A01.get(str);
            if (viewManager == null) {
                A9L a9l = a8d.A00;
                if (a9l != null) {
                    viewManager = a9l.getViewManager(str);
                    if (viewManager != null) {
                        a8d.A01.put(str, viewManager);
                    }
                }
            }
            if (viewManager != null) {
                return null;
            }
            C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIManagerModule.getConstantsForViewManager");
            A02.A01("ViewManager", viewManager.getName());
            A02.A01("Lazy", true);
            A02.A02();
            try {
                return C23041A0r.A07(A8E.A00(viewManager, (Map) null, this.mCustomDirectEvents));
            } finally {
                SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
            }
        }
        viewManager = null;
        if (viewManager != null) {
        }
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        char c = 1;
        if (i % 2 == 0) {
            c = 2;
        }
        if (c == 2) {
            A3o A01 = A3W.A01(getReactApplicationContext(), 2, true);
            if (A01 != null) {
                A01.sendAccessibilityEvent(i, i2);
                return;
            }
            return;
        }
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(new A8n(a8k, i, i2));
    }

    public void synchronouslyUpdateViewOnUIThread(int i, C23043A0y a0y) {
        char c = 1;
        if (i % 2 == 0) {
            c = 2;
        }
        if (c == 2) {
            A3o A01 = A3W.A01(getReactApplicationContext(), 2, true);
            if (A01 != null) {
                A01.synchronouslyUpdateViewOnUIThread(i, a0y);
                return;
            }
            return;
        }
        A8G a8g = this.mUIImplementation;
        C230099zE r1 = new C230099zE(a0y);
        C228039ra.A00();
        a8g.A05.A0L.A05(i, r1);
    }

    public void addUIBlock(A9U a9u) {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(new A99(a8k, a9u));
    }

    public void addUIManagerEventListener(A9T a9t) {
        this.mUIManagerListeners.add(a9t);
    }

    public void addUIManagerListener(C23135A9a a9a) {
        this.mListeners.add(a9a);
    }

    @ReactMethod
    public void clearJSResponder() {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(new A8B(a8k, 0, 0, true, false));
    }

    @ReactMethod
    public void configureNextLayoutAnimation(C23043A0y a0y, Callback callback, Callback callback2) {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(new A8C(a8k, a0y, callback));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        if (p000X.A8I.A07(r5) == false) goto L_0x0070;
     */
    @ReactMethod
    public void createView(int i, String str, int i2, C23043A0y a0y) {
        boolean z;
        boolean z2 = DEBUG;
        A8G a8g = this.mUIImplementation;
        synchronized (a8g.A01) {
            ReactShadowNode createShadowNodeInstance = a8g.A06.A00(str).createShadowNodeInstance();
            ReactShadowNode A00 = a8g.A04.A00(i2);
            AnonymousClass0FY.A01(A00, AnonymousClass000.A06("Root node with tag ", i2, " doesn't exist"));
            createShadowNodeInstance.Bjz(i);
            createShadowNodeInstance.Bln(str);
            createShadowNodeInstance.BkG(A00.ATb());
            createShadowNodeInstance.BlA(A00.AY1());
            A8q a8q = a8g.A04;
            a8q.A02.A00();
            a8q.A00.put(createShadowNodeInstance.ATb(), createShadowNodeInstance);
            C230099zE r5 = null;
            if (a0y != null) {
                r5 = new C230099zE(a0y);
                createShadowNodeInstance.Bt0(r5);
            }
            if (!createShadowNodeInstance.AiS()) {
                A8I a8i = a8g.A03;
                C23053A3d AY1 = createShadowNodeInstance.AY1();
                if (createShadowNodeInstance.AaL().equals(ReactViewManager.REACT_CLASS)) {
                    z = true;
                }
                z = false;
                createShadowNodeInstance.BiA(z);
                if (createShadowNodeInstance.AQg() != Constants.A0C) {
                    a8i.A02.A01(AY1, createShadowNodeInstance.ATb(), createShadowNodeInstance.AaL(), r5);
                }
            }
        }
    }

    @ReactMethod
    public void dismissPopupMenu() {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(new A94(a8k));
    }

    @ReactMethod
    public void findSubviewIn(int i, A1e a1e, Callback callback) {
        A8G a8g = this.mUIImplementation;
        float round = (float) Math.round(C230109zF.A00((float) a1e.getDouble(0)));
        float round2 = (float) Math.round(C230109zF.A00((float) a1e.getDouble(1)));
        A8K a8k = a8g.A05;
        a8k.A0F.add(new A89(a8k, i, round, round2, callback));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public C228259s1 getConstantsForViewManager(String str) {
        Map map = this.mViewManagerConstantsCache;
        if (map == null || !map.containsKey(str)) {
            return computeConstantsForViewManager(str);
        }
        C228259s1 r1 = (C228259s1) this.mViewManagerConstantsCache.get(str);
        int i = this.mViewManagerConstantsCacheSize - 1;
        this.mViewManagerConstantsCacheSize = i;
        if (i <= 0) {
            this.mViewManagerConstantsCache = null;
        }
        return r1;
    }

    public A9X getDirectEventNamesResolver() {
        return new A9X(this);
    }

    public Map getPerformanceCounters() {
        A8K a8k = this.mUIImplementation.A05;
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(a8k.A04));
        hashMap.put("CommitEndTime", Long.valueOf(a8k.A03));
        hashMap.put("LayoutTime", Long.valueOf(a8k.A06));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(a8k.A05));
        hashMap.put("RunStartTime", Long.valueOf(a8k.A09));
        hashMap.put("RunEndTime", Long.valueOf(a8k.A08));
        hashMap.put("BatchedExecutionTime", Long.valueOf(a8k.A02));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(a8k.A07));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(a8k.A0A));
        hashMap.put("CreateViewCount", Long.valueOf(a8k.A00));
        hashMap.put("UpdatePropsCount", Long.valueOf(a8k.A0B));
        return hashMap;
    }

    public void invalidateNodeLayout(int i) {
        ReactShadowNode A00 = this.mUIImplementation.A04.A00(i);
        if (A00 == null) {
            AnonymousClass0CH.A07("ReactNative", AnonymousClass000.A05("Warning : attempted to dirty a non-existent react shadow node. reactTag=", i));
            return;
        }
        A00.ABz();
        this.mUIImplementation.A06(-1);
    }

    @ReactMethod
    public void manageChildren(int i, A1e a1e, A1e a1e2, A1e a1e3, A1e a1e4, A1e a1e5) {
        boolean z = DEBUG;
        this.mUIImplementation.A07(i, a1e, a1e2, a1e3, a1e4, a1e5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(new C23127A8g(a8k, i, callback));
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(new A88(a8k, i, callback));
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        A0i a0i;
        A8G a8g = this.mUIImplementation;
        try {
            int[] iArr = a8g.A08;
            ReactShadowNode A00 = a8g.A04.A00(i);
            ReactShadowNode A002 = a8g.A04.A00(i2);
            if (A00 == null || A002 == null) {
                if (A00 != null) {
                    i = i2;
                }
                a0i = new A0i(AnonymousClass000.A06("Tag ", i, " does not exist"));
            } else {
                if (A00 != A002) {
                    ReactShadowNode ARa = A00.ARa();
                    while (ARa != A002) {
                        if (ARa != null) {
                            ARa = ARa.ARa();
                        } else {
                            a0i = new A0i(AnonymousClass000.A07("Tag ", i2, " is not an ancestor of tag ", i));
                        }
                    }
                }
                A8G.A05(a8g, A00, A002, iArr);
                int[] iArr2 = a8g.A08;
                float f = (float) iArr2[0];
                float f2 = AnonymousClass951.A01.density;
                callback2.invoke(Float.valueOf(f / f2), Float.valueOf(((float) iArr2[1]) / f2), Float.valueOf(((float) iArr2[2]) / f2), Float.valueOf(((float) iArr2[3]) / f2));
                return;
            }
            throw a0i;
        } catch (A0i e) {
            callback.invoke(e.getMessage());
        }
    }

    @ReactMethod
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        A0i a0i;
        A8G a8g = this.mUIImplementation;
        try {
            int[] iArr = a8g.A08;
            ReactShadowNode A00 = a8g.A04.A00(i);
            if (A00 != null) {
                ReactShadowNode ARa = A00.ARa();
                if (ARa != null) {
                    A8G.A05(a8g, A00, ARa, iArr);
                    int[] iArr2 = a8g.A08;
                    float f = (float) iArr2[0];
                    float f2 = AnonymousClass951.A01.density;
                    callback2.invoke(Float.valueOf(f / f2), Float.valueOf(((float) iArr2[1]) / f2), Float.valueOf(((float) iArr2[2]) / f2), Float.valueOf(((float) iArr2[3]) / f2));
                    return;
                }
                a0i = new A0i(AnonymousClass000.A06("View with tag ", i, " doesn't have a parent!"));
            } else {
                a0i = new A0i(AnonymousClass000.A06("No native view for tag ", i, " exists!"));
            }
            throw a0i;
        } catch (A0i e) {
            callback.invoke(e.getMessage());
        }
    }

    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "onBatchCompleteUI");
        A02.A00("BatchId", i);
        A02.A02();
        Iterator it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
        for (A9T willDispatchViewUpdates : this.mUIManagerListeners) {
            willDispatchViewUpdates.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.A06(i);
        } finally {
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1916767129);
        }
    }

    public void onHostPause() {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0H = false;
        AnonymousClass0FY.A01(ACK.A06, "ReactChoreographer needs to be initialized.");
        ACK.A06.A02(Constants.ONE, a8k.A0M);
        A8K.A00(a8k);
    }

    public void onHostResume() {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0H = true;
        AnonymousClass0FY.A01(ACK.A06, "ReactChoreographer needs to be initialized.");
        ACK.A06.A01(Constants.ONE, a8k.A0M);
    }

    public void preComputeConstantsForViewManager(List list) {
        C04450Ea r3 = new C04450Ea();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C228259s1 computeConstantsForViewManager = computeConstantsForViewManager(str);
            if (computeConstantsForViewManager != null) {
                r3.put(str, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(r3);
    }

    public void prependUIBlock(A9U a9u) {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(0, new A99(a8k, a9u));
    }

    public void profileNextBatch() {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0J = true;
        a8k.A04 = 0;
        a8k.A00 = 0;
        a8k.A0B = 0;
    }

    @ReactMethod
    public void removeRootView(int i) {
        A8G a8g = this.mUIImplementation;
        synchronized (a8g.A01) {
            A8q a8q = a8g.A04;
            a8q.A02.A00();
            if (i != -1) {
                if (a8q.A01.get(i)) {
                    a8q.A00.remove(i);
                    a8q.A01.delete(i);
                } else {
                    throw new A0i(AnonymousClass000.A06("View with tag ", i, " is not registered as a root view"));
                }
            }
        }
        A8K a8k = a8g.A05;
        a8k.A0F.add(new A8D(a8k, i));
    }

    @ReactMethod
    public void removeSubviewsFromContainerWithID(int i) {
        A8G a8g = this.mUIImplementation;
        int i2 = i;
        ReactShadowNode A00 = a8g.A04.A00(i);
        if (A00 != null) {
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i3 = 0; i3 < A00.AI5(); i3++) {
                writableNativeArray.pushInt(i3);
            }
            a8g.A07(i2, (A1e) null, (A1e) null, (A1e) null, (A1e) null, writableNativeArray);
            return;
        }
        throw new A0i(AnonymousClass000.A05("Trying to remove subviews of an unknown view tag: ", i));
    }

    public void removeUIManagerEventListener(A9T a9t) {
        this.mUIManagerListeners.remove(a9t);
    }

    public void removeUIManagerListener(C23135A9a a9a) {
        this.mListeners.remove(a9a);
    }

    @ReactMethod
    public void replaceExistingNonRootView(int i, int i2) {
        A8G a8g = this.mUIImplementation;
        A8q a8q = a8g.A04;
        a8q.A02.A00();
        if (!a8q.A01.get(i)) {
            A8q a8q2 = a8g.A04;
            a8q2.A02.A00();
            if (!a8q2.A01.get(i2)) {
                ReactShadowNode A00 = a8g.A04.A00(i);
                if (A00 != null) {
                    ReactShadowNode ARa = A00.ARa();
                    if (ARa != null) {
                        int Ad0 = ARa.Ad0(A00);
                        if (Ad0 >= 0) {
                            WritableNativeArray writableNativeArray = new WritableNativeArray();
                            writableNativeArray.pushInt(i2);
                            WritableNativeArray writableNativeArray2 = new WritableNativeArray();
                            writableNativeArray2.pushInt(Ad0);
                            WritableNativeArray writableNativeArray3 = new WritableNativeArray();
                            writableNativeArray3.pushInt(Ad0);
                            a8g.A07(ARa.ATb(), (A1e) null, (A1e) null, writableNativeArray, writableNativeArray2, writableNativeArray3);
                            return;
                        }
                        throw new IllegalStateException("Didn't find child tag in parent");
                    }
                    throw new A0i(AnonymousClass000.A05("Node is not attached to a parent: ", i));
                }
                throw new A0i(AnonymousClass000.A05("Trying to replace unknown view tag: ", i));
            }
        }
        throw new A0i("Trying to add or replace a root tag!");
    }

    public int resolveRootTagFromReactTag(int i) {
        boolean z = true;
        if (i % 10 != 1) {
            z = false;
        }
        if (!z) {
            A8G a8g = this.mUIImplementation;
            A8q a8q = a8g.A04;
            a8q.A02.A00();
            if (!a8q.A01.get(i)) {
                ReactShadowNode A00 = a8g.A04.A00(i);
                if (A00 != null) {
                    return A00.AUi();
                }
                AnonymousClass0CH.A07("ReactNative", AnonymousClass000.A05("Warning : attempted to resolve a non-existent react shadow node. reactTag=", i));
                return 0;
            }
        }
        return i;
    }

    @ReactMethod
    public void setChildren(int i, A1e a1e) {
        boolean z = DEBUG;
        A8G a8g = this.mUIImplementation;
        synchronized (a8g.A01) {
            ReactShadowNode A00 = a8g.A04.A00(i);
            int i2 = 0;
            while (i2 < a1e.size()) {
                ReactShadowNode A002 = a8g.A04.A00(a1e.getInt(i2));
                if (A002 != null) {
                    A00.A2m(A002, i2);
                    i2++;
                } else {
                    throw new A0i(AnonymousClass000.A05("Trying to add unknown view tag: ", a1e.getInt(i2)));
                }
            }
            A8I a8i = a8g.A03;
            for (int i3 = 0; i3 < a1e.size(); i3++) {
                A8I.A01(a8i, A00, a8i.A01.A00(a1e.getInt(i3)), i3);
            }
        }
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        A8G a8g = this.mUIImplementation;
        int i2 = i;
        ReactShadowNode A00 = a8g.A04.A00(i);
        if (A00 != null) {
            while (A00.AQg() == Constants.A0C) {
                A00 = A00.ARa();
            }
            A8K a8k = a8g.A05;
            a8k.A0F.add(new A8B(a8k, A00.ATb(), i2, false, z));
        }
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        A8K a8k = this.mUIImplementation.A05;
        a8k.A0F.add(new A9B(a8k, z));
    }

    public void setViewHierarchyUpdateDebugListener(A9W a9w) {
        this.mUIImplementation.A05.A0C = a9w;
    }

    @ReactMethod
    public void showPopupMenu(int i, A1e a1e, Callback callback, Callback callback2) {
        A8G a8g = this.mUIImplementation;
        A8G.A04(a8g, i, "showPopupMenu");
        A8K a8k = a8g.A05;
        a8k.A0F.add(new C23122A8a(a8k, i, a1e, callback, callback2));
    }

    public int startSurface(View view, String str, C228259s1 r4, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void stopSurface(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (p000X.A8I.A07(r6) != false) goto L_0x005d;
     */
    @ReactMethod
    public void updateView(int i, String str, C23043A0y a0y) {
        boolean z;
        A3o A01;
        boolean z2 = DEBUG;
        char c = 1;
        if (i % 2 == 0) {
            c = 2;
        }
        if (c == 2) {
            A44 reactApplicationContext = getReactApplicationContext();
            if (reactApplicationContext.A0A() && (A01 = A3W.A01(reactApplicationContext, 2, true)) != null) {
                A96 a96 = new A96(this, A01, i, a0y);
                MessageQueueThread messageQueueThread = reactApplicationContext.A05;
                AnonymousClass0FY.A00(messageQueueThread);
                messageQueueThread.runOnQueue(a96);
                return;
            }
            return;
        }
        A8G a8g = this.mUIImplementation;
        if (a8g.A06.A00(str) != null) {
            ReactShadowNode A00 = a8g.A04.A00(i);
            if (A00 == null) {
                throw new A0i(AnonymousClass000.A05("Trying to update non-existent view with tag ", i));
            } else if (a0y != null) {
                C230099zE r6 = new C230099zE(a0y);
                A00.Bt0(r6);
                if (!A00.AiS()) {
                    A8I a8i = a8g.A03;
                    if (A00.Ag9()) {
                        z = true;
                    }
                    z = false;
                    if (z) {
                        A8I.A02(a8i, A00, r6);
                    } else if (!A00.Ag9()) {
                        A8K a8k = a8i.A02;
                        int ATb = A00.ATb();
                        a8k.A0B++;
                        a8k.A0F.add(new C23134A8z(a8k, ATb, r6));
                    }
                }
            }
        } else {
            throw new A0i(AnonymousClass000.A0E("Got unknown view type: ", str));
        }
    }

    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        Object[] objArr;
        boolean z;
        A8G a8g = this.mUIImplementation;
        ReactShadowNode A00 = a8g.A04.A00(i);
        ReactShadowNode A002 = a8g.A04.A00(i2);
        if (A00 == null || A002 == null) {
            objArr = new Object[1];
            z = false;
        } else {
            objArr = new Object[1];
            z = Boolean.valueOf(A00.Af0(A002));
        }
        objArr[0] = z;
        callback.invoke(objArr);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, A1k a1k, A1e a1e) {
        A44 reactApplicationContext = getReactApplicationContext();
        int i2 = 1;
        if (i % 2 == 0) {
            i2 = 2;
        }
        A3o A01 = A3W.A01(reactApplicationContext, i2, true);
        if (A01 == null) {
            return;
        }
        if (a1k.AZ8() == ReadableType.Number) {
            A01.dispatchCommand(i, a1k.A5t(), a1e);
        } else if (a1k.AZ8() == ReadableType.String) {
            A01.dispatchCommand(i, a1k.A5y(), a1e);
        }
    }

    public Map getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public C228259s1 getDefaultEventTypes() {
        Map A00 = C23083A5v.A00();
        Map A02 = C23083A5v.A02();
        HashMap hashMap = new HashMap();
        hashMap.put("bubblingEventTypes", A00);
        hashMap.put("directEventTypes", A02);
        return C23041A0r.A07(hashMap);
    }

    public A8G getUIImplementation() {
        return this.mUIImplementation;
    }

    public C23125A8d getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.BZb(1, (RCTEventEmitter) getReactApplicationContext().A01(RCTEventEmitter.class));
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.Auv();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        A9N.A00().A00();
        C23141A9l.A00.clear();
        C23141A9l.A01.clear();
        A8A.A01.clear();
        A8A.A00.clear();
    }

    public void onHostDestroy() {
    }

    public void receiveEvent(int i, String str, C228259s1 r5) {
        ((RCTEventEmitter) getReactApplicationContext().A01(RCTEventEmitter.class)).receiveEvent(i, str, r5);
    }

    public View resolveView(int i) {
        C228039ra.A00();
        return this.mUIImplementation.A05.A0L.A02(i);
    }

    public void setViewLocalData(int i, Object obj) {
        A44 reactApplicationContext = getReactApplicationContext();
        MessageQueueThread messageQueueThread = reactApplicationContext.A05;
        AnonymousClass0FY.A00(messageQueueThread);
        messageQueueThread.assertIsOnThread();
        A8h a8h = new A8h(this, reactApplicationContext, i, obj);
        MessageQueueThread messageQueueThread2 = reactApplicationContext.A04;
        AnonymousClass0FY.A00(messageQueueThread2);
        messageQueueThread2.runOnQueue(a8h);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        MessageQueueThread messageQueueThread = getReactApplicationContext().A04;
        AnonymousClass0FY.A00(messageQueueThread);
        messageQueueThread.assertIsOnThread();
        A8G a8g = this.mUIImplementation;
        ReactShadowNode A00 = a8g.A04.A00(i);
        if (A00 == null) {
            AnonymousClass0CH.A07("ReactNative", AnonymousClass000.A05("Tried to update size of non-existent tag: ", i));
            return;
        }
        A00.Bko((float) i2);
        A00.Bkn((float) i3);
        A8G.A03(a8g);
    }

    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        A44 reactApplicationContext = getReactApplicationContext();
        C23128A8i a8i = new C23128A8i(this, reactApplicationContext, i, i2, i3);
        MessageQueueThread messageQueueThread = reactApplicationContext.A04;
        AnonymousClass0FY.A00(messageQueueThread);
        messageQueueThread.runOnQueue(a8i);
    }

    public UIManagerModule(A44 a44, A9L a9l, int i) {
        this(a44, a9l, new AnonymousClass90C(), i);
    }

    public UIManagerModule(A44 a44, A9L a9l, AnonymousClass90C r6, int i) {
        super(a44);
        this.mMemoryTrimCallback = new A91(this);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new ArrayList();
        this.mBatchId = 0;
        AnonymousClass951.A02(a44);
        this.mEventDispatcher = new C23184ABm(a44);
        this.mModuleConstants = createConstants(a9l);
        this.mCustomDirectEvents = C23083A5v.A02();
        C23125A8d a8d = new C23125A8d(a9l);
        this.mViewManagerRegistry = a8d;
        this.mUIImplementation = new A8G(a44, a8d, this.mEventDispatcher, i);
        a44.A06(this);
    }

    public UIManagerModule(A44 a44, List list, int i) {
        this(a44, list, new AnonymousClass90C(), i);
    }

    public UIManagerModule(A44 a44, List list, AnonymousClass90C r6, int i) {
        super(a44);
        this.mMemoryTrimCallback = new A91(this);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new ArrayList();
        this.mBatchId = 0;
        AnonymousClass951.A02(a44);
        this.mEventDispatcher = new C23184ABm(a44);
        HashMap hashMap = new HashMap();
        this.mCustomDirectEvents = hashMap;
        this.mModuleConstants = createConstants(list, (Map) null, hashMap);
        C23125A8d a8d = new C23125A8d(list);
        this.mViewManagerRegistry = a8d;
        this.mUIImplementation = new A8G(a44, a8d, this.mEventDispatcher, i);
        a44.A06(this);
    }

    public int addRootView(View view) {
        return addRootView(view, (C228259s1) null, (String) null);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public int addRootView(android.view.View r10, p000X.C228259s1 r11, java.lang.String r12) {
        /*
            r9 = this;
            r2 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r1 = "UIManagerModule.addRootView"
            r0 = 1179112814(0x4647d56e, float:12789.357)
            p000X.AnonymousClass0ZJ.A01(r2, r1, r0)
            java.lang.Class<X.A9c> r1 = p000X.C23137A9c.class
            monitor-enter(r1)
            int r6 = p000X.C23137A9c.A00     // Catch:{ all -> 0x00bf }
            int r0 = r6 + 10
            p000X.C23137A9c.A00 = r0     // Catch:{ all -> 0x00bf }
            monitor-exit(r1)
            X.A44 r4 = r9.getReactApplicationContext()
            X.A3d r8 = new X.A3d
            android.content.Context r1 = r10.getContext()
            r0 = r10
            X.9rP r0 = (p000X.C227929rP) r0
            r0.getSurfaceID()
            r8.<init>(r4, r1)
            X.A8G r7 = r9.mUIImplementation
            java.lang.Object r4 = r7.A01
            monitor-enter(r4)
            com.facebook.react.uimanager.ReactShadowNodeImpl r5 = new com.facebook.react.uimanager.ReactShadowNodeImpl     // Catch:{ all -> 0x00bc }
            r5.<init>()     // Catch:{ all -> 0x00bc }
            com.facebook.react.modules.i18nmanager.I18nUtil r1 = com.facebook.react.modules.i18nmanager.I18nUtil.A00()     // Catch:{ all -> 0x00bc }
            X.A44 r0 = r7.A02     // Catch:{ all -> 0x00bc }
            boolean r0 = r1.A03(r0)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0044
            X.AD3 r1 = p000X.AD3.RTL     // Catch:{ all -> 0x00bc }
            X.A8M r0 = r5.A05     // Catch:{ all -> 0x00bc }
            r0.setDirection(r1)     // Catch:{ all -> 0x00bc }
        L_0x0044:
            java.lang.String r0 = "Root"
            r5.Bln(r0)     // Catch:{ all -> 0x00bc }
            r5.Bjz(r6)     // Catch:{ all -> 0x00bc }
            r5.BlA(r8)     // Catch:{ all -> 0x00bc }
            X.A8m r1 = new X.A8m     // Catch:{ all -> 0x00bc }
            r1.<init>(r7, r5)     // Catch:{ all -> 0x00bc }
            com.facebook.react.bridge.queue.MessageQueueThread r0 = r8.A04     // Catch:{ all -> 0x00bc }
            p000X.AnonymousClass0FY.A00(r0)     // Catch:{ all -> 0x00bc }
            r0.runOnQueue(r1)     // Catch:{ all -> 0x00bc }
            X.A8K r0 = r7.A05     // Catch:{ all -> 0x00bc }
            X.A83 r5 = r0.A0L     // Catch:{ all -> 0x00bc }
            monitor-enter(r5)     // Catch:{ all -> 0x00bc }
            monitor-enter(r5)     // Catch:{ all -> 0x00b9 }
            int r1 = r10.getId()     // Catch:{ all -> 0x00b6 }
            r0 = -1
            if (r1 == r0) goto L_0x0097
            java.lang.String r7 = "NativeViewHierarchyManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r1.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "Trying to add a root view with an explicit id ("
            r1.append(r0)     // Catch:{ all -> 0x00b6 }
            int r0 = r10.getId()     // Catch:{ all -> 0x00b6 }
            r1.append(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = ") already "
            r1.append(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "set. React Native uses the id field to track react tags and will overwrite this field. "
            r1.append(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "If that is fine, explicitly overwrite the id field to View.NO_ID before calling "
            r1.append(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "addRootView."
            r1.append(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b6 }
            p000X.AnonymousClass0CH.A06(r7, r0)     // Catch:{ all -> 0x00b6 }
        L_0x0097:
            android.util.SparseArray r0 = r5.A05     // Catch:{ all -> 0x00b6 }
            r0.put(r6, r10)     // Catch:{ all -> 0x00b6 }
            android.util.SparseArray r1 = r5.A04     // Catch:{ all -> 0x00b6 }
            com.facebook.react.uimanager.RootViewManager r0 = r5.A08     // Catch:{ all -> 0x00b6 }
            r1.put(r6, r0)     // Catch:{ all -> 0x00b6 }
            android.util.SparseBooleanArray r1 = r5.A06     // Catch:{ all -> 0x00b6 }
            r0 = 1
            r1.put(r6, r0)     // Catch:{ all -> 0x00b6 }
            r10.setId(r6)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r5)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r5)     // Catch:{ all -> 0x00bc }
            monitor-exit(r4)     // Catch:{ all -> 0x00bc }
            r0 = -583936991(0xffffffffdd31d421, float:-8.0086895E17)
            p000X.AnonymousClass0ZJ.A00(r2, r0)
            return r6
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00bc }
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00bc }
            throw r0
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIManagerModule.addRootView(android.view.View, X.9s1, java.lang.String):int");
    }

    public static Map createConstants(A9L a9l) {
        ReactMarker.logMarker(A3L.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "CreateUIManagerConstants");
        A02.A01("Lazy", true);
        A02.A02();
        try {
            Map A01 = C23083A5v.A01();
            A01.put("ViewManagerNames", a9l.getViewManagerNames());
            A01.put("LazyViewManagersEnabled", true);
            return A01;
        } finally {
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -657602596);
            ReactMarker.logMarker(A3L.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public static Map createConstants(List list, Map map, Map map2) {
        ReactMarker.logMarker(A3L.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "CreateUIManagerConstants");
        A02.A01("Lazy", false);
        A02.A02();
        try {
            Map A01 = C23083A5v.A01();
            Map A00 = C23083A5v.A00();
            Map A022 = C23083A5v.A02();
            if (map != null) {
                map.putAll(A00);
            }
            if (map2 != null) {
                map2.putAll(A022);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ViewManager viewManager = (ViewManager) it.next();
                String name = viewManager.getName();
                C08750Yk A023 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIManagerModuleConstantsHelper.createConstants");
                A023.A01("ViewManager", name);
                A023.A01("Lazy", false);
                A023.A02();
                Map A002 = A8E.A00(viewManager, map, map2);
                if (!A002.isEmpty()) {
                    A01.put(name, A002);
                }
                SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
            }
            A01.put("genericBubblingEventTypes", A00);
            A01.put("genericDirectEventTypes", A022);
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1809393233);
            ReactMarker.logMarker(A3L.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
            return A01;
        } catch (Throwable th) {
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1998569504);
            ReactMarker.logMarker(A3L.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
            throw th;
        }
    }

    public void dispatchCommand(int i, int i2, A1e a1e) {
        A8G a8g = this.mUIImplementation;
        A8G.A04(a8g, i, "dispatchViewManagerCommand");
        A8K a8k = a8g.A05;
        a8k.A0F.add(new C23129A8k(a8k, i, i2, a1e));
    }

    public void dispatchCommand(int i, String str, A1e a1e) {
        A8G a8g = this.mUIImplementation;
        A8G.A04(a8g, i, "dispatchViewManagerCommand");
        A8K a8k = a8g.A05;
        a8k.A0F.add(new C23130A8l(a8k, i, str, a1e));
    }

    public A9C getEventDispatcher() {
        return this.mEventDispatcher;
    }
}
