package com.instagram.process.instagram;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import com.facebook.profilo.logger.api.ProfiloLogger;
import com.facebook.profilo.mmapbuf.MmapBufferManager;
import com.facebook.profilo.provider.class_load.ClassLoadProvider;
import com.facebook.profilo.provider.device_info.DeviceInfoProvider;
import com.facebook.profilo.provider.libcio.LibcIOProvider;
import com.facebook.profilo.provider.mappings.MemoryMappingsProvider;
import com.facebook.profilo.provider.stacktrace.StackFrameThread;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;
import com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider;
import com.instagram.perf.classpreload.CameraClassPreloadController;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000X.Constants;
import p000X.AnonymousClass00D;
import p000X.AnonymousClass00E;
import p000X.AnonymousClass00Z;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass05F;
import p000X.AnonymousClass05G;
import p000X.AnonymousClass05H;
import p000X.AnonymousClass05I;
import p000X.AnonymousClass05L;
import p000X.AnonymousClass05M;
import p000X.AnonymousClass05N;
import p000X.AnonymousClass05P;
import p000X.AnonymousClass05Q;
import p000X.AnonymousClass05S;
import p000X.AnonymousClass05V;
import p000X.AnonymousClass05W;
import p000X.AnonymousClass05X;
import p000X.AnonymousClass05Z;
import p000X.AnonymousClass068;
import p000X.AnonymousClass069;
import p000X.AnonymousClass06C;
import p000X.AnonymousClass0C8;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0G8;
import p000X.AnonymousClass0GC;
import p000X.AnonymousClass0GK;
import p000X.AnonymousClass0GW;
import p000X.AnonymousClass0I1;
import p000X.AnonymousClass0IB;
import p000X.AnonymousClass0J3;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0QD;
import p000X.StoredPreferences;
import p000X.AnonymousClass0QQ;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0RU;
import p000X.AnonymousClass0S2;
import p000X.AnonymousClass0SD;
import p000X.AnonymousClass0SV;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0YK;
import p000X.AnonymousClass0YY;
import p000X.AnonymousClass0YZ;
import p000X.AnonymousClass0ZB;
import p000X.AnonymousClass0Zr;
import p000X.AnonymousClass0aA;
import p000X.AnonymousClass0aM;
import p000X.AnonymousClass0b0;
import p000X.AnonymousClass0b1;
import p000X.AnonymousClass0b2;
import p000X.AnonymousClass0b5;
import p000X.AnonymousClass0b8;
import p000X.AnonymousClass0c3;
import p000X.AnonymousClass0c9;
import p000X.AnonymousClass0fJ;
import p000X.AnonymousClass1A3;
import p000X.C019700l;
import p000X.C030105a;
import p000X.C04850Gi;
import p000X.C04890Gq;
import p000X.C05000Hl;
import p000X.C05630Li;
import p000X.C05760Lv;
import p000X.C06530Pk;
import p000X.C06550Pm;
import p000X.C07050Ro;
import p000X.C07170Sa;
import p000X.C08540Xm;
import p000X.C08560Xo;
import p000X.C08650Xz;
import p000X.C08940Zi;
import p000X.C09150ai;
import p000X.C09200ao;
import p000X.C09330bE;
import p000X.C09350bG;
import p000X.C09360bH;
import p000X.C09370bI;
import p000X.C09380bJ;
import p000X.C09570bd;
import p000X.C09590bf;
import p000X.C09600bg;
import p000X.C09610bh;
import p000X.C09640bk;
import p000X.C09650bl;
import p000X.C09660bm;
import p000X.C09680bp;
import p000X.C09690bq;
import p000X.C09710bs;
import p000X.C09730bu;
import p000X.C09770bz;
import p000X.C09790c1;
import p000X.C09870cF;
import p000X.C11070eN;
import p000X.C11100eQ;
import p000X.C11110eR;
import p000X.C11120eS;
import p000X.C11130eT;
import p000X.C11190eZ;
import p000X.C11210eb;
import p000X.C11270eh;
import p000X.C11280ei;
import p000X.C11300ek;
import p000X.C11530f7;
import p000X.C11540f8;
import p000X.C11550f9;
import p000X.C11890fq;
import p000X.C11920ft;
import p000X.C12600h4;
import p000X.C15300mf;
import p000X.C15330mi;

public class InstagramApplicationForMainProcess extends AnonymousClass0QQ implements C07170Sa {
    public static boolean sInstanceAlreadyCreated;
    public final Context mContext;

    public static synchronized void ensureOnlyInstance() {
        synchronized (InstagramApplicationForMainProcess.class) {
            if (!sInstanceAlreadyCreated) {
                sInstanceAlreadyCreated = true;
            } else {
                throw new IllegalStateException("Multiple instances of the Application object were created.");
            }
        }
    }

    public Resources getOverridingResources() {
        if (C11540f8.A01) {
            return C11540f8.A00().A01();
        }
        return null;
    }

    public InstagramApplicationForMainProcess(Context context) {
        ensureOnlyInstance();
        this.mContext = context;
    }

    public void onConfigurationChangedCallback(Configuration configuration) {
        Integer num;
        C15300mf.A05();
        int i = configuration.uiMode & 48;
        Context context = this.mContext;
        AnonymousClass0RU A00 = AnonymousClass0WN.A00();
        int i2 = C15330mi.A00().getInt("KEY_CONFIG_UI_MODE", -1);
        if (i != i2 && C05760Lv.A01.A00.getInt("dark_mode_toggle_setting", -1) == -1) {
            C15330mi.A00().edit().putInt("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", i).apply();
            if (i == 16 || !(i == 32 || i2 == 32)) {
                num = Constants.ZERO;
            } else {
                num = Constants.ONE;
            }
            C15330mi.A02(context, i);
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("dark_mode_os_toggled", (AnonymousClass0RN) null);
            boolean z = false;
            if (num == Constants.ONE) {
                z = true;
            }
            A002.A0A("is_dark_mode", Boolean.valueOf(z));
            A002.A0A("is_backgrounded", Boolean.valueOf(AnonymousClass0Q7.A03().A0H()));
            A00.BcG(A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0174, code lost:
        if (r7.AXX().Aga() == false) goto L_0x0176;
     */
    public final void onCreate(String str, long j, long j2, long j3, long j4) {
        AnonymousClass0GC AML;
        int i;
        boolean z;
        boolean z2;
        C09790c1 r10;
        AnonymousClass0aA r14;
        long j5 = j4;
        long j6 = j;
        long j7 = j3;
        long j8 = j2;
        super.onCreate(str, j6, j8, j7, j5);
        Context context = this.mContext;
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("initProfilo", 1341142336);
        }
        SparseArray sparseArray = new SparseArray(1);
        sparseArray.put(C09600bg.A01, new C09600bg());
        sparseArray.put(C09590bf.A01, new C09590bf());
        sparseArray.put(C09610bh.A00, C09610bh.A01);
        sparseArray.put(C09570bd.A01, new C09570bd());
        AnonymousClass0GW[] r6 = {new C09680bp(), new ThreadMetadataProvider(), C09730bu.A01, AnonymousClass0c9.A06, new C09690bq(), new C11100eQ(context), new StackFrameThread(context), new SystemCounterThread(), new AnonymousClass0c3(), C09870cF.A00(), new ClassLoadProvider(), new C09660bm(), new LibcIOProvider(), new AnonymousClass068(context), new MemoryMappingsProvider(), new AnonymousClass069(context), new DeviceInfoProvider(context), new C09710bs(context)};
        C11070eN.A00 = new C11110eR(context);
        AnonymousClass0b8 r1 = new AnonymousClass0b8(context);
        C09650bl[] r4 = {new C11120eS(context)};
        if (context == null) {
            throw new IllegalArgumentException("Null Context");
        } else if (r1.AML() == null || r1.AML().AXX() == null || r1.AML().AJ0() == null) {
            throw new IllegalArgumentException("Non-null config provider with null sub-configs");
        } else if (TextUtils.isEmpty("main")) {
            throw new IllegalArgumentException("Null or empty process name");
        } else if (sparseArray.size() >= 1) {
            C09640bk r2 = new C09640bk(context, r1, r6);
            if (C09640bk.A0D.compareAndSet((Object) null, r2)) {
                synchronized (r2) {
                    try {
                        AML = r2.A00.AML();
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                    }
                }
                if (C04850Gi.A07 == null) {
                    synchronized (C04850Gi.class) {
                        try {
                            if (C04850Gi.A07 == null) {
                                C04850Gi.A07 = new C04850Gi(sparseArray, AML, r2);
                            } else {
                                throw new IllegalStateException("TraceControl already initialized");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    synchronized (r2) {
                        try {
                            File file = r2.A02.A06;
                            boolean z3 = r2.A09;
                            if (z3) {
                                i = AML.AXX().AHF();
                                if (i == -1) {
                                    i = 5000;
                                }
                            } else {
                                i = 1000;
                            }
                            if (z3) {
                                z = true;
                            }
                            z = false;
                            if (z) {
                                MmapBufferManager mmapBufferManager = new MmapBufferManager(AML.AIb(), r2.A02.A04, context);
                                r2.A03 = mmapBufferManager;
                                AnonymousClass00Z r12 = new AnonymousClass00Z(mmapBufferManager);
                                r2.A06.A00.add(r12);
                                r12.B9E();
                            }
                            String str2 = r2.A08;
                            MmapBufferManager mmapBufferManager2 = r2.A03;
                            AnonymousClass0Y1.A08("profilo");
                            TraceEvents.sInitialized = true;
                            Logger.sInitialized = true;
                            Logger.sTraceDirectory = file;
                            Logger.sFilePrefix = str2;
                            Logger.sLoggerCallbacks = r2;
                            Logger.sNativeTraceWriterCallbacks = r2;
                            Logger.sRingBufferSize = i;
                            Logger.sWorker = new AtomicReference((Object) null);
                            Logger.sMmapBufferManager = mmapBufferManager2;
                            C09640bk.A01(r2, AML);
                            r2.A02.A01 = TimeUnit.DAYS.toSeconds(1) * 1000;
                            r2.A02.A00 = 10;
                            AnonymousClass06C r0 = r2.A06;
                            r0.A00.add(new C019700l());
                        } catch (Throwable th3) {
                            while (true) {
                                th = th3;
                                break;
                            }
                        }
                    }
                    for (int i2 = 0; i2 < 1; i2++) {
                        C09650bl r13 = r4[i2];
                        C09640bk.A00().A06.A00.add(r13);
                        r13.B9E();
                    }
                    ProfiloLogger.sHasProfilo = true;
                    C04890Gq.A00 = true;
                    AnonymousClass0G8.A00 = true;
                    C11130eT.A01.A02(AnonymousClass0J3.class, new C11190eZ(context));
                    C11070eN.A01 = true;
                    if (!C09770bz.A00(context)) {
                        try {
                            C04850Gi r42 = C04850Gi.A07;
                            if (r42 != null) {
                                r42.A08(C09590bf.A01, 0, 15335435);
                            }
                        } catch (Throwable th4) {
                            AnonymousClass0QD.A05("IgProfiloInitializer", "failed to initialize profilo", th4);
                        }
                    }
                    AnonymousClass0G8.A00();
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-336492124);
                    }
                    AnonymousClass0DB.A00(5);
                    synchronized (C11210eb.class) {
                    }
                    Context context2 = this.mContext;
                    if (!new File(new File(context2.getDir("appcomponents", 0), "versions"), Integer.toString(227299068)).exists()) {
                        try {
                            int i3 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
                            if (i3 != 227299068) {
                                AnonymousClass0DB.A0F("AppComponentManager", String.format(Locale.US, "Android PackageManager returned version code: %d, apk version code is: %d", new Object[]{Integer.valueOf(i3), 227299068}));
                            }
                            z2 = true;
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new IllegalStateException("Can't get package info for this package.");
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C11270eh.A03(context2, "cold_start");
                    }
                    Context context3 = this.mContext;
                    StoredPreferences.A00 = context3;
                    long now = AwakeTimeSinceBootClock.INSTANCE.now();
                    AnonymousClass0C8 r02 = new AnonymousClass0C8();
                    C09360bH r47 = r10;
                    C09360bH r102 = new C09360bH(context3, j6, j8, j7, j5, now);
                    AnonymousClass0SD r62 = new AnonymousClass0SD(now);
                    C09150ai r15 = new C09150ai(this.mContext, new C11280ei(), new C11300ek());
                    C08650Xz r63 = new C08650Xz(this.mContext);
                    C08540Xm r3 = new C08540Xm(this, r02, r63);
                    AnonymousClass00D r16 = new AnonymousClass00D(this.mContext, r3);
                    AnonymousClass0SV r17 = new AnonymousClass0SV(this.mContext);
                    CameraClassPreloadController cameraClassPreloadController = new CameraClassPreloadController();
                    Context context4 = this.mContext;
                    CameraClassPreloadController cameraClassPreloadController2 = null;
                    if (C05630Li.A03(new C05000Hl("preload_after_navigation", AnonymousClass0L7.CAMERA_CLASS_PRELOADING, false, (String[]) null, (AnonymousClass04H) null))) {
                        cameraClassPreloadController2 = cameraClassPreloadController;
                    }
                    C08560Xo r22 = new C08560Xo(context4, cameraClassPreloadController2);
                    AnonymousClass05H r18 = new AnonymousClass05H(this.mContext, r22);
                    C09200ao r7 = new C09200ao(this.mContext);
                    AnonymousClass0YZ r72 = new AnonymousClass0YZ(this.mContext);
                    AnonymousClass00E r11 = new AnonymousClass00E(this.mContext, r3, cameraClassPreloadController);
                    AnonymousClass0aM r19 = new AnonymousClass0aM(new C11530f7(this.mContext, new C11550f9(), AnonymousClass0QT.A00(C06550Pm.A00().A00, new AnonymousClass0fJ()), C05630Li.A00(new AnonymousClass0I1("sampling_rate", AnonymousClass0L7.DRAWABLE_USAGE_LOGGING, (Object) null, new String[]{"0", "5000"}))));
                    C09330bE r37 = new C09330bE();
                    if (C05630Li.A03(new AnonymousClass0I1("is_enabled", AnonymousClass0L7.LACRIMA, false, (String[]) null))) {
                        r10 = new AnonymousClass0IB();
                    } else {
                        r10 = new AnonymousClass0GK(this.mContext);
                    }
                    AnonymousClass05L r110 = new AnonymousClass05L(r3);
                    AnonymousClass0b1 r132 = new AnonymousClass0b1(this.mContext);
                    AnonymousClass05N r122 = new AnonymousClass05N(this.mContext, r3);
                    C09380bJ r73 = new C09380bJ(this.mContext);
                    AnonymousClass0b5 r34 = new AnonymousClass0b5();
                    C08940Zi r33 = new C08940Zi();
                    C08540Xm r182 = r3;
                    AnonymousClass05W r162 = new AnonymousClass05W(this.mContext, r182);
                    C09360bH r192 = r47;
                    AnonymousClass05X r163 = new AnonymousClass05X(this.mContext, r182, r192);
                    C030105a r164 = new C030105a(this.mContext, r182);
                    AnonymousClass05M r165 = new AnonymousClass05M(r3, r47);
                    AnonymousClass0b0 r28 = new AnonymousClass0b0();
                    AnonymousClass0YY r27 = new AnonymousClass0YY();
                    C08540Xm r183 = r3;
                    AnonymousClass05Q r166 = new AnonymousClass05Q(this.mContext, r183, r192);
                    C11890fq r74 = new C11890fq(r3);
                    AnonymousClass05P r75 = new AnonymousClass05P(r3);
                    AnonymousClass05V r167 = new AnonymousClass05V(this.mContext, r183);
                    AnonymousClass0S2 r222 = new AnonymousClass0S2();
                    AnonymousClass0Zr r76 = new AnonymousClass0Zr(this.mContext);
                    AnonymousClass05S r168 = new AnonymousClass05S(this.mContext, r183, Choreographer.getInstance());
                    AnonymousClass05Z r169 = new AnonymousClass05Z(this.mContext, r183);
                    C07050Ro r8 = new C07050Ro(this.mContext);
                    AnonymousClass05F r1610 = new AnonymousClass05F(this.mContext);
                    AnonymousClass05G r77 = new AnonymousClass05G(this.mContext, r02);
                    AnonymousClass05I r111 = new AnonymousClass05I(this.mContext, r02);
                    AnonymousClass0YK r172 = new AnonymousClass0YK();
                    AnonymousClass0b2 r1611 = new AnonymousClass0b2();
                    C09350bG r112 = new C09350bG(this.mContext);
                    C11920ft r03 = new C11920ft(this.mContext);
                    if (C05630Li.A03(new C05000Hl("is_enabled", AnonymousClass0L7.CONCURRENT_COLDSTART_V2, (Object) null, (String[]) null, (AnonymousClass04H) null))) {
                        r14 = new C09370bI();
                    } else {
                        r14 = new AnonymousClass0aA();
                    }
                    r14.A00(r10, r37, r62, r22, r47, r72, r7, r132, r63, r3, r122, r73, r34, r33, r18, r162, r19, r8, r1610, r112, r163, r77, r164, r165, r28, r27, r111, r74, r166, r75, r167, r222, r16, r17, r76, r1611, r168, r169, r11, r15, r172, r03, r110);
                    AnonymousClass1A3 r113 = AnonymousClass1A3.A01;
                    synchronized (r113) {
                        r113.A00 = true;
                        r113.notifyAll();
                    }
                    C12600h4.A02(C12600h4.A00(), "APP_ONCREATE_END");
                    return;
                }
                throw new IllegalStateException("TraceControl already initialized");
            }
            throw new IllegalStateException("Orchestrator already initialized");
        } else {
            throw new IllegalArgumentException("Null or empty list of controllers");
        }
    }
}
