package p000X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.voltron.metadata.VoltronModuleMetadataHelper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.0bT  reason: invalid class name and case insensitive filesystem */
public abstract class C09470bT implements AnonymousClass0BJ {
    public String A00;
    public final Set A01 = new HashSet();
    public final Context A02;
    public final AnonymousClass0Ba A03;
    public final C09030Zt A04;

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01aa, code lost:
        if (r8 == p000X.Constants.A0C) goto L_0x01ac;
     */
    public final boolean AvY(String str, Throwable th) {
        boolean contains;
        boolean z;
        String str2;
        synchronized (this) {
            contains = this.A01.contains(Long.valueOf(Thread.currentThread().getId()));
        }
        if (!contains) {
            if (str.equals(this.A00)) {
                AnonymousClass0DB.A0J("AppModuleFallbackLoader", "Same class failed twice %s", str);
                return false;
            }
            this.A00 = str;
            if (AnonymousClass0ZT.A00(this.A02)) {
                String packageNameForClass = VoltronModuleMetadataHelper.getPackageNameForClass(str);
                String str3 = null;
                char c = 65535;
                if (!"X".equals(packageNameForClass)) {
                    switch (packageNameForClass.hashCode()) {
                        case -2039749943:
                            if (packageNameForClass.equals("com.instagram.debug.devoptions.search.bootstrap")) {
                                c = 15;
                                break;
                            }
                            break;
                        case -1710790540:
                            if (packageNameForClass.equals("com.facebook.flipper.android.diagnostics")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1565760779:
                            if (packageNameForClass.equals("com.facebook.cameracore.mediapipeline.dataproviders.targettracking")) {
                                c = 22;
                                break;
                            }
                            break;
                        case -1198894988:
                            if (packageNameForClass.equals("com.instagram.payments.inapp.sample")) {
                                c = 17;
                                break;
                            }
                            break;
                        case -1114469537:
                            if (packageNameForClass.equals("com.facebook.mobileboost.apps.debug")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -1047771569:
                            if (packageNameForClass.equals("com.facebook.cameracore.mediapipeline.dataproviders.hairsegmentation.implementation")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -957607558:
                            if (packageNameForClass.equals("com.instagram.wellbeing.selfiecaptcha.videoupload")) {
                                c = 21;
                                break;
                            }
                            break;
                        case -954440878:
                            if (packageNameForClass.equals("com.instagram.debug.devoptions.debughead.tasks")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -879835869:
                            if (packageNameForClass.equals("com.instagram.debug.devoptions.ingestion")) {
                                c = 14;
                                break;
                            }
                            break;
                        case -813327009:
                            if (packageNameForClass.equals("com.facebook.cameracore.mediapipeline.dataproviders.recognitiontracking.implementation")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -376285500:
                            if (packageNameForClass.equals("com.instagram.ui.animation.pushlayout.debug")) {
                                c = 19;
                                break;
                            }
                            break;
                        case -83525045:
                            if (packageNameForClass.equals("com.instagram.bloks.native_hybrid_shell")) {
                                c = 8;
                                break;
                            }
                            break;
                        case -26640178:
                            if (packageNameForClass.equals("com.instagram.debug.devoptions.igds")) {
                                c = 13;
                                break;
                            }
                            break;
                        case 398632410:
                            if (packageNameForClass.equals("com.instagram.redrawable")) {
                                c = 18;
                                break;
                            }
                            break;
                        case 409872045:
                            if (packageNameForClass.equals("com.instagram.debug.devoptions")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 788498429:
                            if (packageNameForClass.equals("com.facebook.cameracore.mediapipeline.dataproviders.movingtargettracking.implementation")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 939672166:
                            if (packageNameForClass.equals("com.instagram.debug.quickexperiment")) {
                                c = 16;
                                break;
                            }
                            break;
                        case 993907953:
                            if (packageNameForClass.equals("com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1301955295:
                            if (packageNameForClass.equals("com.facebook.cameracore.mediapipeline.services.wolf.ig.implementation")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1366149298:
                            if (packageNameForClass.equals("com.instagram.debug.devoptions.debughead")) {
                                c = 10;
                                break;
                            }
                            break;
                        case 1384612331:
                            if (packageNameForClass.equals("com.instagram.debug.devoptions.gpu")) {
                                c = 12;
                                break;
                            }
                            break;
                        case 1595850074:
                            if (packageNameForClass.equals("com.facebook.cameracore.mediapipeline.dataproviders.bodytracking.implementation")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2109670020:
                            if (packageNameForClass.equals("com.instagram.wellbeing.selfiecaptcha.util")) {
                                c = 20;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            str3 = "arservicesforbodytracking";
                            break;
                        case 1:
                            str3 = "arservicesforhairsegmentation";
                            break;
                        case 2:
                            str3 = "arservicesforpersonsegmentation";
                            break;
                        case 3:
                        case 4:
                            str3 = "arservicesfortargettracking";
                            break;
                        case 5:
                            str3 = "arservicesforwolf";
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                        case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                        case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                        case C120125Dh.VIEW_TYPE_LINK /*14*/:
                        case 15:
                        case 16:
                        case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                        case 18:
                        case 19:
                        case 20:
                        case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                            str3 = "devoptions";
                            break;
                        case C120125Dh.NUM_VIEW_TYPES /*22*/:
                            str3 = "slam";
                            break;
                    }
                } else {
                    int moduleRangeIndexForRedexClassName = VoltronModuleMetadataHelper.getModuleRangeIndexForRedexClassName(str, AnonymousClass0ZV.APP_MODULE_RANGES);
                    if (moduleRangeIndexForRedexClassName != -1) {
                        str3 = AnonymousClass0ZV.A02(AnonymousClass0ZV.APP_MODULE_INDICES[moduleRangeIndexForRedexClassName]);
                    }
                }
                if (str3 != null) {
                    C08900Ze A002 = C08900Ze.A00();
                    if (A002.A05(str3)) {
                        AnonymousClass0DB.A0K("AppModuleFallbackLoader", "App module %s already loaded. Class load will fail for %s", str3, str);
                        return false;
                    }
                    String str4 = "UNAVAILABLE";
                    try {
                        boolean A003 = AnonymousClass0ZU.A00(AnonymousClass0ZV.A01(str3));
                        Integer A012 = A002.A01(str3);
                        if (!A003) {
                            z = false;
                        }
                        z = true;
                        if (z || A012 == Constants.ZERO) {
                            try {
                                C09030Zt r1 = this.A04;
                                synchronized (r1) {
                                    r1.A02(str3, true);
                                }
                                AnonymousClass0DB.A0K("AppModuleFallbackLoader", "Loaded app module %s for %s", str3, str);
                                A01(str3, str, "LOAD_SUCCESS");
                                return true;
                            } catch (IOException e) {
                                str4 = "LOAD_FAIL";
                                AnonymousClass0DB.A0P("AppModuleFallbackLoader", e, "Failed to load app module %s for %s", str3, str);
                            }
                        } else {
                            Object[] objArr = new Object[3];
                            objArr[0] = str3;
                            switch (A012.intValue()) {
                                case 1:
                                    str2 = "DISABLED";
                                    break;
                                case 2:
                                    str2 = "LOCAL";
                                    break;
                                case 3:
                                    str2 = "REMOTE";
                                    break;
                                case 4:
                                    str2 = "DOWNLOADING";
                                    break;
                                default:
                                    str2 = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                                    break;
                            }
                            objArr[1] = str2;
                            objArr[2] = str;
                            AnonymousClass0DB.A0K("AppModuleFallbackLoader", "App module %s is unavailable (download state = %s). Class load will fail for %s.", objArr);
                            return false;
                        }
                    } finally {
                        A01(str3, str, str4);
                    }
                }
            }
        }
        return false;
    }

    private void A01(String str, String str2, String str3) {
        String str4;
        if (str2.startsWith("X.")) {
            str4 = "unsymbolicated";
        } else {
            str4 = str2;
        }
        Locale locale = Locale.US;
        String format = String.format(locale, "unloaded_app_module=%s:class=%s", new Object[]{str, str4});
        String format2 = String.format(locale, "class=%s, load_result=%s", new Object[]{str2, str3});
        AnonymousClass0Ba r2 = this.A03;
        AnonymousClass0Bc A002 = AnonymousClass0Bb.A00(format, format2);
        A002.A05 = true;
        r2.Bp3(new AnonymousClass0Bb(A002));
    }

    public C09470bT(Context context, C09030Zt r3, AnonymousClass0Ba r4) {
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext != null ? applicationContext : context;
        this.A04 = r3;
        this.A03 = r4;
    }
}
