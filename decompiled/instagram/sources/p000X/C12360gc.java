package p000X;

import android.content.Context;
import android.iawareperf.UniPerf;
import android.os.Build;
import android.os.Bundle;
import android.util.BoostFramework;
import com.hisi.perfhub.PerfHub;
import com.lge.loader.power.ILGPowerManagerLoader;
import com.lge.systemservice.core.LGContext;
import com.mediatek.perfservice.PerfServiceWrapper;
import com.mediatek.powerhalmgr.PowerHalMgr;
import com.mediatek.powerhalmgr.PowerHalMgrFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import org.codeaurora.Performance;

/* renamed from: X.0gc  reason: invalid class name and case insensitive filesystem */
public final class C12360gc {
    public static final C12390gf A06 = C12370gd.A00;
    public static final C12440gk A07 = new C12440gk();
    public static final C12430gj A08 = new C12420gi();
    public C12450gl A00 = A07;
    public C12430gj A01 = A08;
    public boolean A02 = false;
    public final C12470gn A03 = new C12460gm(this);
    public final C12470gn A04 = new C12480go(this);
    public volatile boolean A05 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0228, code lost:
        if (p000X.C44941x1.A01(r5, "scnReg", new java.lang.Class[0]) == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0268, code lost:
        if (p000X.C44941x1.A01(r8, "getInstance", new java.lang.Class[0]) == false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0306, code lost:
        if (r0 != false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if ("mediatek".equals(r1) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        r12 = java.lang.Class.forName("com.android.internal.R$array").getDeclaredFields();
        r5 = r12.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0385, code lost:
        if (r2 >= r5) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0387, code lost:
        r1 = r12[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0393, code lost:
        if (r1.getName().endsWith("boost_param_value") == false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0395, code lost:
        r1 = r15.getResources().getIntArray(r1.getInt((java.lang.Object) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03a2, code lost:
        if (r1 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03a5, code lost:
        if (r1.length == 0) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03a7, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03ac, code lost:
        if (r1[0] < 1073741824) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03af, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03b2, code lost:
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0480, code lost:
        if (r14.A00 != r2) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b0, code lost:
        if (r1.A03 == null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0110, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0131, code lost:
        if (r1.A03 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0160, code lost:
        if (p000X.C44941x1.A01(r6, "perfLockRelease", new java.lang.Class[0]) == false) goto L_0x0162;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01d3 A[SYNTHETIC, Splitter:B:121:0x01d3] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02b8 A[Catch:{ all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x033d A[Catch:{ all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03e2 A[SYNTHETIC, Splitter:B:249:0x03e2] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x03e8 A[Catch:{ all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0448 A[Catch:{ all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x045d A[SYNTHETIC, Splitter:B:287:0x045d] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x046a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[ExcHandler: Error | Exception (unused java.lang.Throwable), SYNTHETIC, Splitter:B:57:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0115 A[SYNTHETIC, Splitter:B:77:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0120 A[Catch:{ all -> 0x0488 }] */
    public static synchronized void A00(C12360gc r14, Context context) {
        boolean z;
        C12430gj r6;
        boolean z2;
        String str;
        C12290gV r8;
        C12450gl r2;
        boolean z3;
        char c;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        C12430gj r62;
        boolean z14;
        synchronized (r14) {
            if (!r14.A05) {
                boolean z15 = false;
                if (C12260gS.A01()) {
                    C12440gk r22 = A07;
                    r22.A00 = "emulator";
                    if (!(r14.A01 == A08 || r14.A00 == r22)) {
                    }
                    r14.A02 = z15;
                    r14.A05 = true;
                } else {
                    C12260gS A002 = C12260gS.A00();
                    String str2 = A002.A00;
                    String str3 = A002.A01;
                    if (!"qualcomm".equals(str3)) {
                        z = false;
                    }
                    z = true;
                    if (z) {
                        C12290gV r5 = A002.A07;
                        if (!r5.A04()) {
                            C12440gk r23 = A07;
                            r23.A00 = "invalid_cpu_" + str2 + "_" + r5;
                            if (r14.A01 != A08) {
                            }
                            r14.A02 = z15;
                            r14.A05 = true;
                        }
                    }
                    try {
                        if (A002.A02) {
                            C12440gk r24 = A07;
                            r24.A00 = AnonymousClass000.A0E("google_device_", str2);
                            if (!(r14.A01 == A08 || r14.A00 == r24)) {
                            }
                            r14.A02 = z15;
                            r14.A05 = true;
                        } else {
                            C12260gS A003 = C12260gS.A00();
                            C44921wz.A00(C44911wy.A00);
                            String str4 = A003.A01;
                            if ("qualcomm".equals(str4)) {
                                if ("lge".equals(Build.BRAND)) {
                                    Context applicationContext = context.getApplicationContext();
                                    C44951x2 r1 = C44931x0.A01;
                                    if (!(r1.A00 == null || r1.A02 == null)) {
                                        z14 = true;
                                    }
                                    z14 = false;
                                    if (z14) {
                                        r6 = new C44961x3(applicationContext);
                                    } else {
                                        r6 = null;
                                    }
                                    if (r6 != null) {
                                        if (r6 == null && !"samsung".equals(A003.A01) && A003.A05) {
                                            r6 = C44971x4.A00(context);
                                        }
                                        z2 = A003.A04;
                                        if (z2) {
                                            if (r6 != null) {
                                                if (z2) {
                                                    String[] strArr = {"msmnile", "sdm845", "msm8998", "msm8996e", "msm8996", "msm8994", "msm8992", "kona", "atoll"};
                                                    String str5 = C12260gS.A00().A00;
                                                    int i = 0;
                                                    while (true) {
                                                        if (i < 9) {
                                                            if (strArr[i].equals(str5)) {
                                                                break;
                                                            }
                                                            i++;
                                                        } else {
                                                            z6 = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                                z6 = false;
                                            }
                                            try {
                                                LGContext.class.toString();
                                                Class<ILGPowerManagerLoader> cls = ILGPowerManagerLoader.class;
                                                cls.toString();
                                                Class<String> cls2 = String.class;
                                                Class[] clsArr = {cls2, cls2, Bundle.class};
                                                z5 = true;
                                                if (!C44941x1.A01(cls, "notifySystemEvent", clsArr)) {
                                                    z5 = false;
                                                }
                                            } catch (Error | Exception unused) {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                r6 = new C44981x5(context);
                                            } else {
                                                r6 = null;
                                            }
                                        }
                                        if (r6 == null || r6.ASC() == 0) {
                                            C12440gk r25 = A07;
                                            r25.A00 = AnonymousClass000.A0E("unknown_platform_", str2);
                                            if (!(r14.A01 == A08 || r14.A00 == r25)) {
                                            }
                                            r14.A02 = z15;
                                            r14.A05 = true;
                                        } else {
                                            C12260gS A004 = C12260gS.A00();
                                            str = A004.A00;
                                            r8 = A004.A07;
                                            int ASD = r6.ASD();
                                            if (ASD == 1) {
                                                String[] strArr2 = C44991x6.A00;
                                                int length = strArr2.length;
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 >= length) {
                                                        z3 = false;
                                                        break;
                                                    } else if (str.startsWith(strArr2[i2])) {
                                                        z3 = true;
                                                        break;
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                                String[] strArr3 = C44991x6.A03;
                                                int length2 = strArr3.length;
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 >= length2) {
                                                        break;
                                                    } else if (str.startsWith(strArr3[i3])) {
                                                        r2 = new C45001x7(r8, false, z3);
                                                        break;
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                                if (r2 == null) {
                                                    C12440gk r26 = A07;
                                                    r26.A00 = AnonymousClass000.A0E("no_suitable_model_for_", str2);
                                                    if (!(r14.A01 == A08 || r14.A00 == r26)) {
                                                    }
                                                    r14.A02 = z15;
                                                    r14.A05 = true;
                                                } else {
                                                    r14.A01 = r6;
                                                    r14.A00 = r2;
                                                    if (!(r6 == A08 || r2 == A07)) {
                                                    }
                                                    r14.A02 = z15;
                                                    r14.A05 = true;
                                                }
                                            } else {
                                                if (ASD == 2) {
                                                    r2 = new C45081xG(r8);
                                                } else if (ASD == 4) {
                                                    r2 = new C45091xH(r8);
                                                } else if (ASD == 8) {
                                                    r2 = new C45081xG(r8);
                                                } else if (ASD == 16) {
                                                    r2 = new C45081xG(r8);
                                                }
                                                if (r2 == null) {
                                                }
                                            }
                                            r2 = null;
                                            if (r2 == null) {
                                            }
                                        }
                                    }
                                }
                                Class<BoostFramework> cls3 = BoostFramework.class;
                                try {
                                    cls3.toString();
                                    if (!C44941x1.A01(cls3, "perfLockAcquire", Integer.TYPE, int[].class) || !C44941x1.A01(cls3, "perfLockRelease", new Class[0])) {
                                        z11 = false;
                                        if (!z11) {
                                            r6 = new C45021x9(context.getApplicationContext());
                                            r6 = C44971x4.A00(context);
                                            z2 = A003.A04;
                                            if (z2) {
                                            }
                                            if (r6 == null || r6.ASC() == 0) {
                                            }
                                        } else {
                                            Context applicationContext2 = context.getApplicationContext();
                                            C44951x2 r12 = C44931x0.A01;
                                            if (!(r12.A00 == null || r12.A02 == null)) {
                                                z12 = true;
                                            }
                                            z12 = false;
                                            if (z12) {
                                                r62 = new C44961x3(applicationContext2);
                                            } else {
                                                r62 = null;
                                            }
                                            if (r6 == null) {
                                                Class<Performance> cls4 = Performance.class;
                                                try {
                                                    cls4.toString();
                                                    if (C44941x1.A01(cls4, "perfLockAcquire", Integer.TYPE, int[].class)) {
                                                        z13 = true;
                                                    }
                                                    z13 = false;
                                                } catch (Error | Exception unused2) {
                                                    z13 = false;
                                                }
                                                if (z13) {
                                                    r6 = new AnonymousClass1xA();
                                                }
                                            }
                                            r6 = C44971x4.A00(context);
                                            z2 = A003.A04;
                                            if (z2) {
                                            }
                                            if (r6 == null || r6.ASC() == 0) {
                                            }
                                        }
                                    } else {
                                        Class cls5 = Integer.TYPE;
                                        C45021x9.A01 = C44941x1.A01(cls3, "perfHint", cls5, String.class, cls5, cls5);
                                        Class[] clsArr2 = {Context.class};
                                        Constructor<BoostFramework> constructor = null;
                                        if (cls3 != null) {
                                            constructor = cls3.getConstructor(clsArr2);
                                        }
                                        boolean z16 = false;
                                        if (constructor != null) {
                                            z16 = true;
                                        }
                                        C45021x9.A02 = z16;
                                        z11 = true;
                                        if (!z11) {
                                        }
                                    }
                                } catch (Error | Exception unused3) {
                                }
                            } else {
                                if ("samsung".equals(str4)) {
                                    r6 = C44971x4.A00(context);
                                } else if ("mediatek".equals(str4)) {
                                    Class<PerfServiceWrapper> cls6 = PerfServiceWrapper.class;
                                    try {
                                        cls6.toString();
                                        Class cls7 = Integer.TYPE;
                                        if (C44941x1.A01(cls6, "userReg", cls7, cls7)) {
                                            if (C44941x1.A01(cls6, "userEnable", cls7)) {
                                                if (C44941x1.A01(cls6, "userDisable", cls7)) {
                                                    C45031xB.A00 = C44941x1.A01(cls6, "userRegBigLittle", cls7, cls7, cls7, cls7);
                                                    z9 = true;
                                                    if (!z9) {
                                                        r6 = new C45031xB();
                                                    } else {
                                                        try {
                                                            PowerHalMgrFactory.class.toString();
                                                            Class<PowerHalMgr> cls8 = PowerHalMgr.class;
                                                            cls8.toString();
                                                            Class cls9 = Integer.TYPE;
                                                            if (C44941x1.A01(cls8, "scnConfig", cls9, cls9, cls9, cls9, cls9, cls9)) {
                                                                if (C44941x1.A01(cls8, "scnEnable", cls9, cls9)) {
                                                                    if (C44941x1.A01(cls8, "scnDisable", cls9)) {
                                                                        z10 = true;
                                                                    }
                                                                }
                                                            }
                                                            z10 = false;
                                                        } catch (Error | Exception unused4) {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            r6 = new C45051xD();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z9 = false;
                                    } catch (Error | Exception unused5) {
                                        z9 = false;
                                    }
                                    if (!z9) {
                                    }
                                } else if ("hisilicon".equals(str4) || A003.A03) {
                                    Class<UniPerf> cls10 = UniPerf.class;
                                    try {
                                        cls10.toString();
                                        if (C44941x1.A01(cls10, "uniPerfEvent", Integer.TYPE, String.class, int[].class)) {
                                            z7 = true;
                                        }
                                        z7 = false;
                                    } catch (Error | Exception unused6) {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        r6 = new C45061xE();
                                    } else {
                                        Class<PerfHub> cls11 = PerfHub.class;
                                        try {
                                            cls11.toString();
                                            z8 = true;
                                            if (!C44941x1.A01(cls11, "perfEvent", Integer.TYPE, String.class, int[].class)) {
                                                z8 = false;
                                            }
                                        } catch (Error | Exception unused7) {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            r6 = new C45071xF();
                                        }
                                    }
                                }
                                r6 = C44971x4.A00(context);
                                z2 = A003.A04;
                                if (z2) {
                                }
                                if (r6 == null || r6.ASC() == 0) {
                                }
                            }
                            r6 = null;
                            r6 = C44971x4.A00(context);
                            z2 = A003.A04;
                            if (z2) {
                            }
                            if (r6 == null || r6.ASC() == 0) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!(r14.A01 == A08 || r14.A00 == A07)) {
                            z15 = true;
                        }
                        r14.A02 = z15;
                        r14.A05 = true;
                        throw th;
                    }
                }
                z15 = true;
                r14.A02 = z15;
                r14.A05 = true;
            }
        }
        return;
        c = 65535;
        if (c == 65535) {
            try {
                Field[] declaredFields = Class.forName("com.android.internal.R$integer").getDeclaredFields();
                int length3 = declaredFields.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        break;
                    } else if (declaredFields[i4].getName().endsWith("boost_param")) {
                        z4 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
            } catch (Exception unused8) {
            }
            z4 = false;
            c = 65535;
            if (z4) {
                c = 2;
            }
        }
        if (c == 3) {
            if (c != 2) {
                String[] strArr4 = C44991x6.A02;
                int length4 = strArr4.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length4) {
                        String[] strArr5 = C44991x6.A01;
                        int length5 = strArr5.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length5) {
                                break;
                            } else if (str.startsWith(strArr5[i6])) {
                                r2 = new C45041xC(r8, false);
                                break;
                            } else {
                                i6++;
                            }
                        }
                    } else if (str.startsWith(strArr4[i5])) {
                        r2 = new C45001x7(r8, false, z3);
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                r2 = new C45041xC(r8, true);
            }
        } else {
            r2 = new C45001x7(r8, true, z3);
        }
        if (r2 == null) {
        }
        z4 = false;
        c = 65535;
        if (z4) {
        }
        if (c == 3) {
        }
        if (r2 == null) {
        }
    }
}
