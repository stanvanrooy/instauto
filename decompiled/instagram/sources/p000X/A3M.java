package p000X;

import android.os.Process;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.CoreModulesPackage;
import com.facebook.react.LazyReactPackage;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import java.util.List;

/* renamed from: X.A3M */
public final class A3M implements Runnable {
    public final /* synthetic */ C227959rS A00;
    public final /* synthetic */ C227889rL A01;

    public A3M(C227889rL r1, C227959rS r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 196 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x000c A[LOOP:0: B:2:0x000c->B:93:0x000c, LOOP_START, SYNTHETIC] */
    public final void run() {
        List AAi;
        Iterable<ModuleHolder> a41;
        ReactMarker.logMarker(A3L.REACT_CONTEXT_THREAD_END);
        synchronized (this.A01.A0F) {
            while (this.A01.A0F.booleanValue()) {
                this.A01.A0F.wait();
            }
        }
        this.A01.A0I = true;
        try {
            Process.setThreadPriority(-4);
            ReactMarker.logMarker(A3L.VM_INIT);
            C227889rL r3 = this.A01;
            JavaScriptExecutor AA3 = this.A00.A01.AA3();
            AnonymousClass90G r14 = this.A00.A00;
            ReactMarker.logMarker(A3L.CREATE_REACT_CONTEXT_START, AA3.getName(), 0);
            A44 a44 = new A44(r3.A04);
            C227799rA r8 = r3.A08;
            if (r8 == null) {
                r8 = r3.A09;
            }
            a44.A02 = r8;
            List<A48> list = r3.A0C;
            C23056A3l a3l = new C23056A3l(a44, r3);
            ReactMarker.logMarker(A3L.PROCESS_PACKAGES_START);
            synchronized (r3.A0C) {
                for (A48 a48 : list) {
                    AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createAndProcessCustomReactPackage", 1435935425);
                    try {
                        C08750Yk A02 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "processPackage");
                        A02.A01("className", a48.getClass().getSimpleName());
                        A02.A02();
                        boolean z = a48 instanceof CoreModulesPackage;
                        if (z) {
                            ReactMarker.logMarker(A3L.PROCESS_CORE_REACT_PACKAGE_START);
                        }
                        if (a48 instanceof LazyReactPackage) {
                            LazyReactPackage lazyReactPackage = (LazyReactPackage) a48;
                            A44 a442 = a3l.A01;
                            a41 = new C23055A3k(lazyReactPackage, lazyReactPackage.A01(a442), lazyReactPackage.A00().ATa());
                        } else if (a48 instanceof A3T) {
                            A3T a3t = (A3T) a48;
                            a41 = new C23060A3r(a3t, a3t.A01().ATa().entrySet().iterator(), a3l.A01);
                        } else {
                            A44 a443 = a3l.A01;
                            C227889rL r6 = a3l.A00;
                            if (a48 instanceof A3u) {
                                AAi = ((A3u) a48).A00(a443, r6);
                            } else {
                                AAi = a48.AAi(a443);
                            }
                            a41 = new A41(AAi);
                        }
                        for (ModuleHolder moduleHolder : a41) {
                            String str = moduleHolder.mName;
                            if (a3l.A02.containsKey(str)) {
                                ModuleHolder moduleHolder2 = (ModuleHolder) a3l.A02.get(str);
                                if (moduleHolder.mReactModuleInfo.A02) {
                                    a3l.A02.remove(moduleHolder2);
                                } else {
                                    throw new IllegalStateException(AnonymousClass000.A0P("Native module ", str, " tried to override ", moduleHolder2.mReactModuleInfo.A00, ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. ", "This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild."));
                                }
                            }
                            a3l.A02.put(str, moduleHolder);
                        }
                        if (z) {
                            ReactMarker.logMarker(A3L.PROCESS_CORE_REACT_PACKAGE_END);
                        }
                        SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
                        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 789922124);
                    } catch (Throwable th) {
                        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 700045201);
                        throw th;
                    }
                }
            }
            ReactMarker.logMarker(A3L.PROCESS_PACKAGES_END);
            ReactMarker.logMarker(A3L.BUILD_NATIVE_MODULE_REGISTRY_START);
            AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "buildNativeModuleRegistry", -2095109627);
            try {
                A3R a3r = new A3R(a3l.A01, a3l.A02);
                AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1557742919);
                ReactMarker.logMarker(A3L.BUILD_NATIVE_MODULE_REGISTRY_END);
                A4M A002 = A4M.A00();
                ReactMarker.logMarker(A3L.CREATE_CATALYST_INSTANCE_START);
                AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "createCatalystInstance", 1387698763);
                try {
                    AnonymousClass0FY.A00(A002);
                    AnonymousClass0FY.A00(AA3);
                    AnonymousClass0FY.A00(a3r);
                    AnonymousClass0FY.A00(r14);
                    AnonymousClass0FY.A00(r8);
                    CatalystInstanceImpl catalystInstanceImpl = new CatalystInstanceImpl(A002, AA3, a3r, r14, r8);
                    AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 60289572);
                    ReactMarker.logMarker(A3L.CREATE_CATALYST_INSTANCE_END);
                    a44.A05(catalystInstanceImpl);
                    if (Systrace.A08(134348800)) {
                        catalystInstanceImpl.setGlobalVariable("__RCTProfileIsProfiling", "true");
                    }
                    ReactMarker.logMarker(A3L.PRE_RUN_JS_BUNDLE_START);
                    AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "runJSBundle", -1779549206);
                    catalystInstanceImpl.runJSBundle();
                    AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 428111720);
                    this.A01.A0H = null;
                    ReactMarker.logMarker(A3L.PRE_SETUP_REACT_CONTEXT_START);
                    C227969rT r2 = new C227969rT(this);
                    C227899rM r1 = new C227899rM(this, a44);
                    MessageQueueThread messageQueueThread = a44.A04;
                    AnonymousClass0FY.A00(messageQueueThread);
                    messageQueueThread.runOnQueue(r1);
                    C228039ra.A01(r2);
                } catch (Throwable th2) {
                    th = th2;
                    AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1765565825);
                    ReactMarker.logMarker(A3L.CREATE_CATALYST_INSTANCE_END);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1214922542);
                ReactMarker.logMarker(A3L.BUILD_NATIVE_MODULE_REGISTRY_END);
                throw th;
            }
        } catch (Exception e) {
            this.A01.A09.handleException(e);
        }
    }
}
