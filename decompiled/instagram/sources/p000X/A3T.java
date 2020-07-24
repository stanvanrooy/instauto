package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.CoreModulesPackage;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.bundleloader.NativeDevSplitBundleLoaderModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.A3T */
public abstract class A3T implements A48 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r13.equals(com.facebook.react.modules.core.HeadlessJsTaskSupportModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r13.equals(com.facebook.react.modules.debug.SourceCodeModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r13.equals("ExceptionsManager") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r13.equals(com.facebook.react.modules.bundleloader.NativeDevSplitBundleLoaderModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r13.equals(com.facebook.react.modules.systeminfo.AndroidInfoModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r13.equals(com.facebook.react.modules.core.DeviceEventManagerModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r13.equals(com.facebook.react.modules.deviceinfo.DeviceInfoModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r13.equals(com.facebook.react.modules.debug.DevSettingsModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (r13.equals(com.facebook.react.modules.core.TimingModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r13.equals(com.facebook.react.devsupport.LogBoxModule.NAME) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r13.equals(com.facebook.react.devsupport.JSCHeapCapture.TAG) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r13.equals(com.facebook.react.uimanager.UIManagerModule.NAME) == false) goto L_0x000e;
     */
    public NativeModule A00(String str, A44 a44) {
        char c;
        char c2;
        List list;
        int i;
        if (!(this instanceof DebugCorePackage)) {
            CoreModulesPackage coreModulesPackage = (CoreModulesPackage) this;
            switch (str.hashCode()) {
                case -2013505529:
                    c2 = 4;
                    break;
                case -1789797270:
                    c2 = 7;
                    break;
                case -1633589448:
                    c2 = 2;
                    break;
                case -1520650172:
                    c2 = 9;
                    break;
                case -1037217463:
                    c2 = 1;
                    break;
                case -790603268:
                    c2 = 0;
                    break;
                case -508954630:
                    c2 = 10;
                    break;
                case 512434409:
                    c2 = 3;
                    break;
                case 881516744:
                    c2 = 6;
                    break;
                case 1256514152:
                    c2 = 5;
                    break;
                case 1861242489:
                    c2 = 8;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return new AndroidInfoModule(a44);
                case 1:
                    return new DeviceEventManagerModule(a44, coreModulesPackage.A02);
                case 2:
                    return new DevSettingsModule(a44, coreModulesPackage.A01.A09);
                case 3:
                    return new ExceptionsManagerModule(coreModulesPackage.A01.A09);
                case 4:
                    return new LogBoxModule(a44, coreModulesPackage.A01.A09);
                case 5:
                    return new HeadlessJsTaskSupportModule(a44);
                case 6:
                    return new SourceCodeModule(a44);
                case 7:
                    return new TimingModule(a44, coreModulesPackage.A01.A09);
                case 8:
                    ReactMarker.logMarker(A3L.CREATE_UI_MANAGER_MODULE_START);
                    AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createUIManagerModule", -1318039336);
                    try {
                        C227889rL r11 = coreModulesPackage.A01;
                        ReactMarker.logMarker(A3L.CREATE_VIEW_MANAGERS_START);
                        AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createAllViewManagers", -1925276048);
                        try {
                            if (r11.A03 == null) {
                                synchronized (r11.A0C) {
                                    if (r11.A03 == null) {
                                        r11.A03 = new ArrayList();
                                        for (A48 ABF : r11.A0C) {
                                            r11.A03.addAll(ABF.ABF(a44));
                                        }
                                        list = r11.A03;
                                        i = 976339579;
                                    }
                                }
                                AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i);
                                ReactMarker.logMarker(A3L.CREATE_VIEW_MANAGERS_END);
                                return new UIManagerModule(a44, list, coreModulesPackage.A00);
                            }
                            list = r11.A03;
                            i = -1670965249;
                            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i);
                            ReactMarker.logMarker(A3L.CREATE_VIEW_MANAGERS_END);
                            return new UIManagerModule(a44, list, coreModulesPackage.A00);
                        } catch (Throwable th) {
                            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 142818296);
                            ReactMarker.logMarker(A3L.CREATE_VIEW_MANAGERS_END);
                            throw th;
                        }
                    } finally {
                        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1283444191);
                        ReactMarker.logMarker(A3L.CREATE_UI_MANAGER_MODULE_END);
                    }
                case 9:
                    return new DeviceInfoModule(a44);
                case 10:
                    return new NativeDevSplitBundleLoaderModule(a44, coreModulesPackage.A01.A09);
            }
        } else {
            if (str.hashCode() == 133931840) {
                c = 0;
            }
            c = 65535;
            if (c == 0) {
                return new JSCHeapCapture(a44);
            }
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("In CoreModulesPackage, could not find Native module for ", str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ad, code lost:
        throw new java.lang.RuntimeException(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ae, code lost:
        r4 = 0;
        r5 = new java.lang.Class[]{com.facebook.react.devsupport.JSCHeapCapture.class, com.facebook.react.devsupport.JSDevSupport.class};
        r3 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c1, code lost:
        if (r4 < 2) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c3, code lost:
        r1 = r5[r4];
        r0 = (com.facebook.react.module.annotations.ReactModule) r1.getAnnotation(com.facebook.react.module.annotations.ReactModule.class);
        r8 = r0.name();
        r9 = r1.getName();
        r10 = r0.canOverrideExistingModule();
        r11 = r0.needsEagerInit();
        r12 = r0.hasConstants();
        r13 = r0.isCxxModule();
        p000X.C139155x8.class.isAssignableFrom(r1);
        r3.put(r8, new p000X.A42(r8, r9, r10, r11, r12, r13));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fa, code lost:
        return new p000X.A46(r6, r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x000b, B:13:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a7 A[ExcHandler: IllegalAccessException | InstantiationException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r2 
      PHI: (r2v0 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String) binds: [B:13:0x009c, B:3:0x000b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x000b] */
    public C23073A4r A01() {
        String str;
        if (!(this instanceof DebugCorePackage)) {
            CoreModulesPackage coreModulesPackage = (CoreModulesPackage) this;
            str = "No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider";
            try {
                return (C23073A4r) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
            } catch (ClassNotFoundException unused) {
                Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class, NativeDevSplitBundleLoaderModule.class};
                HashMap hashMap = new HashMap();
                for (int i = 0; i < 11; i++) {
                    Class cls = clsArr[i];
                    ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                    String name = reactModule.name();
                    String name2 = cls.getName();
                    boolean canOverrideExistingModule = reactModule.canOverrideExistingModule();
                    boolean needsEagerInit = reactModule.needsEagerInit();
                    boolean hasConstants = reactModule.hasConstants();
                    boolean isCxxModule = reactModule.isCxxModule();
                    C139155x8.class.isAssignableFrom(cls);
                    hashMap.put(name, new A42(name, name2, canOverrideExistingModule, needsEagerInit, hasConstants, isCxxModule));
                }
                return new A45(coreModulesPackage, hashMap);
            } catch (IllegalAccessException | InstantiationException e) {
            }
        } else {
            DebugCorePackage debugCorePackage = (DebugCorePackage) this;
            str = "No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider";
            return (C23073A4r) Class.forName("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
        }
    }

    public final List AAi(A44 a44) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    public final List ABF(A44 a44) {
        List<A3X> emptyList = Collections.emptyList();
        if (emptyList == null || emptyList.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (A3X a3x : emptyList) {
            arrayList.add((ViewManager) a3x.A01.get());
        }
        return arrayList;
    }
}
