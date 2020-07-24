package com.facebook.react.bridge;

import android.content.res.AssetManager;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000X.A3K;
import p000X.A3L;
import p000X.A3Q;
import p000X.A3R;
import p000X.A3e;
import p000X.A4E;
import p000X.A4F;
import p000X.A4G;
import p000X.A4L;
import p000X.A4M;
import p000X.A4Q;
import p000X.A4U;
import p000X.A4Z;
import p000X.A55;
import p000X.ACE;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0Yw;
import p000X.AnonymousClass0ZJ;
import p000X.AnonymousClass90G;
import p000X.C08800Yq;
import p000X.C227799rA;
import p000X.C228039ra;
import p000X.C23046A1d;
import p000X.C23061A3s;
import p000X.C23069A4m;
import p000X.C23071A4p;
import p000X.C23076A4w;
import p000X.C23077A4x;

public class CatalystInstanceImpl implements CatalystInstance {
    public static final AtomicInteger sNextInstanceIdForTrace = new AtomicInteger(1);
    public volatile boolean mAcceptCalls = false;
    public final CopyOnWriteArrayList mBridgeIdleListeners;
    public volatile boolean mDestroyed = false;
    public final HybridData mHybridData;
    public boolean mInitialized = false;
    public boolean mJSBundleHasLoaded;
    public final AnonymousClass90G mJSBundleLoader;
    public final ArrayList mJSCallsPendingInit = new ArrayList();
    public final Object mJSCallsPendingInitLock = new Object();
    public final A4G mJSIModuleRegistry = new A4G();
    public final C23069A4m mJSModuleRegistry;
    public volatile boolean mJSThreadDestructionComplete = false;
    public C23077A4x mJavaScriptContextHolder;
    public final String mJsPendingCallsTitleForTrace = AnonymousClass000.A05("pending_js_calls_instance", sNextInstanceIdForTrace.getAndIncrement());
    public final C227799rA mNativeModuleCallExceptionHandler;
    public final A3R mNativeModuleRegistry;
    public final MessageQueueThread mNativeModulesQueueThread;
    public volatile boolean mNativeModulesThreadDestructionComplete = false;
    public final AtomicInteger mPendingJSCalls = new AtomicInteger(0);
    public final A4U mReactQueueConfiguration;
    public String mSourceURL;
    public final AnonymousClass0Yw mTraceListener;
    public C23076A4w mTurboModuleManagerJSIModule = null;
    public volatile A55 mTurboModuleRegistry = null;

    private native long getJavaScriptContext();

    public static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection collection, Collection collection2);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    private native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection collection, Collection collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    public native CallInvokerHolderImpl getJSCallInvokerHolder();

    public native CallInvokerHolderImpl getNativeCallInvokerHolder();

    public native RuntimeExecutor getRuntimeExecutor();

    public native void setGlobalVariable(String str, String str2);

    public void addBridgeIdleDebugListener(ACE ace) {
        this.mBridgeIdleListeners.add(ace);
    }

    public void callFunction(String str, String str2, NativeArray nativeArray) {
        A4L a4l = new A4L(str, str2, nativeArray);
        if (this.mDestroyed) {
            AnonymousClass0CH.A07("ReactNative", AnonymousClass000.A0E("Calling JS function after bridge has been destroyed: ", a4l.toString()));
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(a4l);
                    return;
                }
            }
        }
        NativeArray nativeArray2 = a4l.A00;
        if (nativeArray2 == null) {
            nativeArray2 = new WritableNativeArray();
        }
        jniCallJSFunction(a4l.A02, a4l.A01, nativeArray2);
    }

    public C23076A4w getJSIModule(C23061A3s a3s) {
        this.mJSIModuleRegistry.A00.get(a3s);
        throw new IllegalArgumentException("Unable to find JSIModule for class " + a3s);
    }

    public JavaScriptModule getJSModule(Class cls) {
        JavaScriptModule javaScriptModule;
        C23069A4m a4m = this.mJSModuleRegistry;
        synchronized (a4m) {
            javaScriptModule = (JavaScriptModule) a4m.A00.get(cls);
            if (javaScriptModule == null) {
                javaScriptModule = (JavaScriptModule) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new A3e(this, cls));
                a4m.A00.put(cls, javaScriptModule);
            }
        }
        return javaScriptModule;
    }

    public NativeModule getNativeModule(Class cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            String name = reactModule.name();
            if (!this.mNativeModuleRegistry.A01.containsKey(name)) {
                return null;
            }
            Object obj = this.mNativeModuleRegistry.A01.get(name);
            AnonymousClass0FY.A01(obj, AnonymousClass000.A0E("Could not find module with name ", name));
            return ((ModuleHolder) obj).getModule();
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("Could not find @ReactModule annotation in ", cls.getCanonicalName()));
    }

    public void handleMemoryPressure(int i) {
        if (!this.mDestroyed) {
            jniHandleMemoryPressure(i);
        }
    }

    public void initialize() {
        AnonymousClass0FY.A03(!this.mInitialized, "This catalyst instance has already been initialized");
        AnonymousClass0FY.A03(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new A3Q(this));
    }

    public void invokeCallback(int i, C23046A1d a1d) {
        if (this.mDestroyed) {
            AnonymousClass0CH.A07("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) a1d);
        }
    }

    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    public void removeBridgeIdleDebugListener(ACE ace) {
        this.mBridgeIdleListeners.remove(ace);
    }

    public void runJSBundle() {
        AnonymousClass0FY.A03(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.A00(this);
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            Iterator it = this.mJSCallsPendingInit.iterator();
            while (it.hasNext()) {
                A4L a4l = (A4L) it.next();
                NativeArray nativeArray = a4l.A00;
                if (nativeArray == null) {
                    nativeArray = new WritableNativeArray();
                }
                jniCallJSFunction(a4l.A02, a4l.A01, nativeArray);
            }
            this.mJSCallsPendingInit.clear();
            this.mJSBundleHasLoaded = true;
        }
        C08800Yq.A00(this.mTraceListener);
    }

    static {
        A3K.A00();
    }

    public CatalystInstanceImpl(A4M a4m, JavaScriptExecutor javaScriptExecutor, A3R a3r, AnonymousClass90G r17, C227799rA r18) {
        AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createCatalystInstanceImpl", -2015262536);
        this.mHybridData = initHybrid();
        C23071A4p a4p = new C23071A4p(this);
        HashMap hashMap = new HashMap();
        A4Z a4z = A4Z.A03;
        MessageQueueThreadImpl A00 = MessageQueueThreadImpl.A00(a4z, a4p);
        hashMap.put(a4z, A00);
        MessageQueueThreadImpl messageQueueThreadImpl = (MessageQueueThreadImpl) hashMap.get(a4m.A00);
        messageQueueThreadImpl = messageQueueThreadImpl == null ? MessageQueueThreadImpl.A00(a4m.A00, a4p) : messageQueueThreadImpl;
        MessageQueueThreadImpl messageQueueThreadImpl2 = (MessageQueueThreadImpl) hashMap.get(a4m.A01);
        this.mReactQueueConfiguration = new A4U(A00, messageQueueThreadImpl2 == null ? MessageQueueThreadImpl.A00(a4m.A01, a4p) : messageQueueThreadImpl2, messageQueueThreadImpl);
        this.mBridgeIdleListeners = new CopyOnWriteArrayList();
        this.mNativeModuleRegistry = a3r;
        this.mJSModuleRegistry = new C23069A4m();
        this.mJSBundleLoader = r17;
        this.mNativeModuleCallExceptionHandler = r18;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.A01;
        this.mTraceListener = new A4Q(this);
        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 126131701);
        AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "initializeCxxBridge", -34903556);
        A4E a4e = new A4E(this);
        MessageQueueThreadImpl messageQueueThreadImpl3 = this.mReactQueueConfiguration.A00;
        MessageQueueThread messageQueueThread = this.mNativeModulesQueueThread;
        A3R a3r2 = this.mNativeModuleRegistry;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a3r2.A01.entrySet()) {
            if (!((ModuleHolder) entry.getValue()).mReactModuleInfo.A04) {
                arrayList.add(new JavaModuleWrapper(this, (ModuleHolder) entry.getValue()));
            }
        }
        A3R a3r3 = this.mNativeModuleRegistry;
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : a3r3.A01.entrySet()) {
            if (((ModuleHolder) entry2.getValue()).mReactModuleInfo.A04) {
                arrayList2.add(entry2.getValue());
            }
        }
        initializeBridge(a4e, javaScriptExecutor, messageQueueThreadImpl3, messageQueueThread, arrayList, arrayList2);
        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1141501243);
        getJavaScriptContext();
        this.mJavaScriptContextHolder = new C23077A4x();
    }

    public void destroy() {
        C228039ra.A00();
        C228039ra.A00();
        if (!this.mDestroyed) {
            ReactMarker.logMarker(A3L.DESTROY_CATALYST_INSTANCE_START);
            this.mDestroyed = true;
            this.mNativeModulesQueueThread.runOnQueue(new A4F(this));
            C08800Yq.A01(this.mTraceListener);
        }
    }

    public A4U getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    public String getSourceURL() {
        return this.mSourceURL;
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }
}
