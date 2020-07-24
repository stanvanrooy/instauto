package com.instagram.camera.effect.p016mq;

import android.content.Context;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass37O;
import p000X.AnonymousClass37Q;
import p000X.AnonymousClass37R;
import p000X.AnonymousClass3UU;
import p000X.AnonymousClass3UZ;
import p000X.AnonymousClass3V9;
import p000X.AnonymousClass3VH;
import p000X.AnonymousClass3VL;
import p000X.AnonymousClass3VM;
import p000X.AnonymousClass8P1;
import p000X.C235310t;
import p000X.C44821wo;
import p000X.C55522an;
import p000X.C56932dI;
import p000X.C64222qp;
import p000X.C64302rG;
import p000X.C65502tD;
import p000X.C708237v;
import p000X.C72213Ef;
import p000X.C76303Vi;
import p000X.C77543aB;
import p000X.C78823cN;
import p000X.C79123cr;
import p000X.C79153cu;
import p000X.C79673dq;
import p000X.C79693ds;
import p000X.C79863eE;
import p000X.C79883eH;
import p000X.C79893eI;
import p000X.C79903eJ;
import p000X.C79913eK;
import p000X.C80003eT;
import p000X.C85513nV;
import p000X.C86073oR;
import p000X.C86263ok;
import p000X.C88453sR;

/* renamed from: com.instagram.camera.effect.mq.IgCameraEffectsController */
public class IgCameraEffectsController implements C79883eH {
    public C56932dI A00;
    public C708237v A01;
    public C79153cu A02;
    public C76303Vi A03;
    public CameraAREffect A04 = null;
    public C86263ok A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final C85513nV A0A;
    public final C79913eK A0B;
    public final C86073oR A0C;
    public final AnonymousClass37Q A0D;
    public final C79863eE A0E;
    public final AnonymousClass0C1 A0F;
    public final Set A0G = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0H = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0I = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Context A0J;
    public final C79693ds A0K = new C79893eI(this);
    public final C77543aB A0L;

    public final void B1z(String str) {
    }

    public static void A00(IgCameraEffectsController igCameraEffectsController, C72213Ef r19) {
        AnonymousClass3V9 r10;
        AudioGraphClientProvider audioGraphClientProvider;
        C64302rG r11;
        AnonymousClass37R AKs;
        String str;
        IgCameraEffectsController igCameraEffectsController2 = igCameraEffectsController;
        AnonymousClass37Q r2 = igCameraEffectsController2.A0D;
        if (r2 == null) {
            str = "refreshMQEffectSetup() EffectManager does not exist";
        } else {
            AnonymousClass3UU r0 = igCameraEffectsController2.A0C.A01;
            if (r0 == null) {
                str = "refreshMQEffectSetup() mCoordinator is null";
            } else {
                AnonymousClass3UZ r02 = r0.A03;
                if (r02 == null) {
                    str = "refreshMQEffectSetup() mediaPipeController is null";
                } else {
                    CameraAREffect cameraAREffect = igCameraEffectsController2.A04;
                    AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer = null;
                    if (cameraAREffect != null && ((AKs = r2.AKs()) == null || !AKs.A00(cameraAREffect))) {
                        cameraAREffect = null;
                    }
                    if (cameraAREffect != null && igCameraEffectsController2.A02 == null) {
                        Context context = igCameraEffectsController2.A0J;
                        AnonymousClass0C1 r8 = igCameraEffectsController2.A0F;
                        C79913eK r9 = igCameraEffectsController2.A0B;
                        C79693ds r102 = igCameraEffectsController2.A0K;
                        C78823cN r1 = r02.A08;
                        if (r1 != null) {
                            r11 = r1.A0K.A02.A09;
                        } else {
                            r11 = null;
                        }
                        C79153cu A002 = C55522an.A00(context, r8, r9, r102, r11, false, 0);
                        igCameraEffectsController2.A02 = A002;
                        A002.A0A(igCameraEffectsController2.A05);
                        igCameraEffectsController2.A02.A0B(igCameraEffectsController2.A08);
                        List asList = Arrays.asList(new C79123cr[]{new C79123cr(igCameraEffectsController2.A02)});
                        C78823cN r12 = r02.A08;
                        if (r12 != null) {
                            r12.A07(asList);
                        }
                    }
                    C76303Vi r13 = igCameraEffectsController2.A03;
                    if (r13 != null) {
                        r10 = new AnonymousClass3V9(r13);
                    } else {
                        r10 = null;
                    }
                    AnonymousClass37Q r4 = igCameraEffectsController2.A0D;
                    C77543aB r7 = igCameraEffectsController2.A0L;
                    String str2 = igCameraEffectsController2.A06;
                    C85513nV r92 = igCameraEffectsController2.A0A;
                    Integer num = Constants.ZERO;
                    C708237v r132 = igCameraEffectsController2.A01;
                    C56932dI r15 = igCameraEffectsController2.A00;
                    String str3 = igCameraEffectsController2.A07;
                    if (cameraAREffect != null) {
                        C88453sR r22 = r02.A07;
                        if (r22 != null) {
                            if (r22.A0A.A00.Bnn() && C88453sR.A03(C88453sR.A00(r22)) && r22.A0I == null) {
                                r22.A0I = r22.A02.getAudioGraphClientProvider();
                            }
                            audioGraphClientProvider = r22.A0I;
                        } else {
                            audioGraphClientProvider = null;
                        }
                    } else {
                        audioGraphClientProvider = null;
                    }
                    if (cameraAREffect != null && cameraAREffect.A0G()) {
                        audioServiceConfigurationAnnouncer = r02.A01();
                    }
                    AnonymousClass3VL AAv = r4.AAv(cameraAREffect, igCameraEffectsController2, r7, str2, r92, r10, num, num, r132, r19, r15, str3, audioGraphClientProvider, audioServiceConfigurationAnnouncer);
                    if (AAv != null) {
                        if (cameraAREffect != null) {
                            igCameraEffectsController2.A0E.AoU(cameraAREffect.getId(), igCameraEffectsController2.A09);
                        }
                        r02.A03(AAv);
                        r02.A03(new AnonymousClass3VM(Constants.ONE));
                        return;
                    }
                    AnonymousClass3VL AAu = igCameraEffectsController2.A0D.AAu((CameraAREffect) null, igCameraEffectsController2.A07);
                    if (AAu != null) {
                        r02.A03(AAu);
                        return;
                    }
                    return;
                }
            }
        }
        AnonymousClass0DB.A0D("IgCameraEffectsController", str);
    }

    public static void A01(IgCameraEffectsController igCameraEffectsController, boolean z) {
        boolean z2;
        C76303Vi r0 = igCameraEffectsController.A03;
        if (r0 != null && r0.Afs()) {
            boolean Aec = igCameraEffectsController.A03.Aec();
            if ((!Aec || !C44821wo.A05(igCameraEffectsController.A0F)) && (Aec || !C44821wo.A06(igCameraEffectsController.A0F))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (z) {
                    z2 = ((Boolean) AnonymousClass0L6.A02(igCameraEffectsController.A0F, AnonymousClass0L7.OPTIC_FACE_DETECTION, "enable_for_ar_effects", false, (AnonymousClass04H) null)).booleanValue();
                }
                igCameraEffectsController.A03.BhU(z2, new AnonymousClass3VH(igCameraEffectsController, z));
            }
        }
    }

    public final void A02(boolean z) {
        C72213Ef r0;
        AnonymousClass37Q r1 = this.A0D;
        if (!(r1 == null || this.A04 == null)) {
            r1.AFD().B1u(this.A04.getId());
        }
        CameraAREffect cameraAREffect = this.A04;
        for (C80003eT B1y : this.A0H) {
            B1y.B1y((CameraAREffect) null, cameraAREffect);
        }
        this.A04 = null;
        this.A06 = null;
        this.A0A.A03((String) null);
        A01(this, false);
        if (z) {
            r0 = C72213Ef.UserInteraction;
        } else {
            r0 = C72213Ef.System;
        }
        A00(this, r0);
    }

    public final void B1s(String str) {
        AnonymousClass37Q r0 = this.A0D;
        if (r0 != null) {
            r0.AFD().B1s(str);
        }
        if (this.A04 != null) {
            this.A0E.AoR(str);
            for (C79673dq r3 : this.A0G) {
                if (r3 != null) {
                    r3.B1t(str, this.A04.A07(), this.A09, true);
                }
            }
        }
    }

    public final void B1x(String str, EffectServiceHost effectServiceHost) {
        LocationDataProvider locationDataProvider;
        C64222qp r0;
        C65502tD r02 = effectServiceHost.mServicesHostConfiguration;
        if (r02 == null || (r0 = r02.A05) == null) {
            locationDataProvider = null;
        } else {
            locationDataProvider = r0.A00;
        }
        if (locationDataProvider != null) {
            locationDataProvider.setDataSource(new AnonymousClass8P1(this.A0J, this.A0F));
        }
    }

    public IgCameraEffectsController(Context context, AnonymousClass0C1 r5, C86073oR r6, C79863eE r7, String str) {
        AnonymousClass37Q r2 = null;
        this.A0J = context.getApplicationContext();
        this.A0F = r5;
        this.A0C = r6;
        this.A0E = r7;
        r6.A04.A00 = new C79903eJ(this);
        this.A0B = new C79913eK();
        this.A0L = new C77543aB(context, r5);
        this.A0A = new C85513nV();
        this.A0D = C235310t.A00(this.A0J) ? AnonymousClass37O.A00(this.A0J, r5) : r2;
        this.A07 = str;
    }
}
