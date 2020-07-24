package com.facebook.react.bridge;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.systrace.SystraceMessage;
import java.util.concurrent.atomic.AtomicInteger;
import p000X.A3L;
import p000X.A42;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0IT;
import p000X.C08750Yk;
import p000X.C139155x8;
import p000X.C228139ro;

public class ModuleHolder {
    public static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    public boolean mInitializable;
    public final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    public boolean mIsCreating;
    public boolean mIsInitializing;
    public NativeModule mModule;
    public final String mName;
    public AnonymousClass0IT mProvider;
    public final A42 mReactModuleInfo;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        if (r1 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        r1 = create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.mIsCreating = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0024, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = r3.mModule;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0027, code lost:
        if (r1 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p000X.AnonymousClass0FY.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0034, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0035, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0036, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0025 */
    public NativeModule getModule() {
        synchronized (this) {
            try {
                NativeModule nativeModule = this.mModule;
                if (nativeModule != null) {
                    return nativeModule;
                }
                boolean z = true;
                if (!this.mIsCreating) {
                    this.mIsCreating = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
    }

    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.mInitializable = true;
            boolean z2 = false;
            if (this.mModule != null) {
                if (!this.mIsInitializing) {
                    z2 = true;
                }
                AnonymousClass0FY.A02(z2);
                nativeModule = this.mModule;
            } else {
                nativeModule = null;
                z = false;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }

    private NativeModule create() {
        boolean z = true;
        boolean z2 = false;
        if (this.mModule == null) {
            z2 = true;
        }
        C228139ro.A00(z2, "Creating an already created module.");
        ReactMarker.logMarker(A3L.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ModuleHolder.createModule");
        A02.A01("name", this.mName);
        A02.A02();
        try {
            AnonymousClass0IT r0 = this.mProvider;
            AnonymousClass0FY.A00(r0);
            NativeModule nativeModule = (NativeModule) r0.get();
            this.mProvider = null;
            synchronized (this) {
                this.mModule = nativeModule;
                if (!this.mInitializable || this.mIsInitializing) {
                    z = false;
                }
            }
            if (z) {
                doInitialize(nativeModule);
            }
            ReactMarker.logMarker(A3L.CREATE_MODULE_END, this.mName, this.mInstanceKey);
            SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
            return nativeModule;
        } catch (Throwable th) {
            try {
                AnonymousClass0CH.A09("NativeModuleInitError", AnonymousClass000.A0J("Failed to create NativeModule \"", this.mName, "\""), th);
                throw th;
            } catch (Throwable th2) {
                ReactMarker.logMarker(A3L.CREATE_MODULE_END, this.mName, this.mInstanceKey);
                SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
                throw th2;
            }
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ModuleHolder.initialize");
        A02.A01("name", this.mName);
        A02.A02();
        ReactMarker.logMarker(A3L.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    z = true;
                    if (!this.mInitializable || this.mIsInitializing) {
                        z = false;
                    } else {
                        this.mIsInitializing = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    try {
                        this.mIsInitializing = false;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } finally {
            ReactMarker.logMarker(A3L.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
        }
    }

    public String getName() {
        return this.mName;
    }

    public ModuleHolder(A42 a42, AnonymousClass0IT r3) {
        this.mName = a42.A01;
        this.mProvider = r3;
        this.mReactModuleInfo = a42;
        if (a42.A05) {
            this.mModule = create();
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        String name = nativeModule.getName();
        Class<?> cls = nativeModule.getClass();
        String simpleName = cls.getSimpleName();
        boolean canOverrideExistingModule = nativeModule.canOverrideExistingModule();
        boolean isAssignableFrom = CxxModuleWrapper.class.isAssignableFrom(cls);
        C139155x8.class.isAssignableFrom(cls);
        this.mReactModuleInfo = new A42(name, simpleName, canOverrideExistingModule, true, true, isAssignableFrom);
        this.mModule = nativeModule;
    }
}
