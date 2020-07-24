package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import android.content.Context;
import android.util.Pair;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.location.implementation.LocationDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.speed.implementation.SpeedDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.volume.interfaces.VolumeDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.implementation.CameraControlServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.camerashare.implementation.CameraShareServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.captureevent.implementation.CaptureEventServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.date.interfaces.DateService;
import com.facebook.cameracore.mediapipeline.services.externalasset.implementation.ExternalAssetProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.implementation.GalleryPickerServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.interfaces.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.instruction.implementation.InstructionServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.locale.implementation.LocaleServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid;
import com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid;
import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkPolicyConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import com.facebook.cameracore.mediapipeline.services.persistence.implementation.PersistenceServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.targeteffect.implementation.TargetEffectServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.cameracore.mediapipeline.services.uicontrol.implementation.UIControlServiceConfigurationHybrid;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p000X.AnonymousClass000;
import p000X.AnonymousClass89X;
import p000X.AnonymousClass8Pg;
import p000X.C193298Oz;
import p000X.C193378Pj;
import p000X.C194478Uf;
import p000X.C202668lk;
import p000X.C23626AUn;
import p000X.C30511Ddi;
import p000X.C30689Dhd;
import p000X.C30771Djc;
import p000X.C64012qR;
import p000X.C64032qU;
import p000X.C64132qg;
import p000X.C64142qh;
import p000X.C64172qk;
import p000X.C64222qp;
import p000X.C64282qy;
import p000X.C65492tB;
import p000X.C65502tD;
import p000X.C65532tG;
import p000X.C65542tI;
import p000X.C65552tJ;
import p000X.C65582tM;
import p000X.C65602tQ;
import p000X.C65622tS;
import p000X.C66872wE;
import p000X.C72333Et;
import p000X.C76013Ud;

public abstract class EffectServiceHost {
    public C72333Et mArExperimentUtil;
    public EffectAttribution mAttribution;
    public final Context mContext;
    public EffectManifest mEffectManifest;
    public final EffectServiceHostConfig mEffectServiceHostConfig;
    public HybridData mHybridData;
    public String mProductSessionId;
    public final C64282qy mServiceConfigurationHybridBuilder;
    public List mServiceConfigurations = new ArrayList();
    public final List mServiceModules;
    public C65502tD mServicesHostConfiguration;

    public EffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig, C64282qy r5, Collection collection, String str, C72333Et r8) {
        this.mContext = context;
        this.mEffectServiceHostConfig = effectServiceHostConfig;
        this.mServiceConfigurationHybridBuilder = r5;
        this.mServiceModules = new ArrayList(collection);
        this.mProductSessionId = null;
        this.mArExperimentUtil = r8;
    }

    private native int nativeGetFrameFormat();

    private native void nativeSetCameraSensorRotation(int i);

    private native void nativeSetCurrentOptimizationMode(int i);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    public native void cleanupServices();

    public abstract DateService createDateService();

    public abstract TouchService createTouchService();

    public abstract VolumeDataProvider createVolumeDataProvider();

    public abstract void destroyDateService();

    public abstract void destroyTouchService();

    public abstract void destroyVolumeDataProvider();

    public abstract AnalyticsLogger getAnalyticsLogger();

    public abstract PluginConfigProvider getEnginePluginConfigProvider();

    public abstract TouchService getTouchService();

    public native boolean isFrameDataNeeded();

    public native boolean isMultipleOutputsSupported();

    public native boolean isWorldTrackerNeeded();

    public native void resetServices();

    public abstract void setTouchInput(C76013Ud r1);

    public native void stopEffect();

    public void updateExternalWorldTrackingData(float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int[] iArr2, int i, int i2) {
    }

    public static ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new C23626AUn(str));
    }

    public List createServiceConfigurations(C65502tD r6) {
        for (ServiceConfiguration destroy : this.mServiceConfigurations) {
            destroy.destroy();
        }
        this.mServiceConfigurations.clear();
        this.mServicesHostConfiguration = r6;
        ArrayList arrayList = new ArrayList();
        if (r6 != null) {
            C65542tI r0 = r6.A0L;
            C65542tI r1 = r0;
            if (r0 != null) {
                arrayList.add(new ExternalAssetProviderConfigurationHybrid(r1));
            }
            C65492tB r02 = r6.A0I;
            C65492tB r12 = r02;
            if (r02 != null) {
                arrayList.add(new CameraControlServiceConfigurationHybrid(r12));
            }
            C30771Djc djc = r6.A0J;
            C30771Djc djc2 = djc;
            if (djc != null) {
                arrayList.add(new CameraShareServiceConfigurationHybrid(djc2));
            }
            C64012qR r03 = r6.A0K;
            C64012qR r13 = r03;
            if (r03 != null) {
                arrayList.add(new CaptureEventServiceConfigurationHybrid(r13));
            }
            C65602tQ r04 = r6.A01;
            C65602tQ r14 = r04;
            if (r04 != null) {
                arrayList.add(new FaceTrackerDataProviderConfigurationHybrid(r14));
            }
            C65532tG r05 = r6.A0O;
            C65532tG r15 = r05;
            if (r05 != null) {
                arrayList.add(new InstructionServiceConfigurationHybrid(r15));
            }
            C64032qU r06 = r6.A06;
            C64032qU r16 = r06;
            if (r06 != null) {
                arrayList.add(new MotionDataProviderConfigurationHybrid(r16));
            }
            C65622tS r07 = r6.A0E;
            C65622tS r17 = r07;
            if (r07 != null) {
                arrayList.add(new WorldTrackerDataProviderConfigurationHybrid(r17));
            }
            C64132qg r08 = r6.A09;
            C64132qg r18 = r08;
            if (r08 != null) {
                arrayList.add(new PlatformEventsDataProviderConfigurationHybrid(r18));
            }
            C64142qh r09 = r6.A0S;
            C64142qh r19 = r09;
            if (r09 != null) {
                arrayList.add(new PersistenceServiceConfigurationHybrid(r19));
            }
            C65582tM r010 = r6.A0U;
            C65582tM r110 = r010;
            if (r010 != null) {
                arrayList.add(new UIControlServiceConfigurationHybrid(r110));
            }
            C64172qk r011 = r6.A0D;
            C64172qk r111 = r011;
            if (r011 != null) {
                arrayList.add(new SpeedDataProviderConfigurationHybrid(r111));
            }
            C65552tJ r012 = r6.A0P;
            C65552tJ r112 = r012;
            if (r012 != null) {
                arrayList.add(new LocaleServiceConfigurationHybrid(r112));
            }
            C64222qp r013 = r6.A05;
            C64222qp r113 = r013;
            if (r013 != null) {
                arrayList.add(new LocationDataProviderConfigurationHybrid(r113));
            }
            C193378Pj r014 = r6.A0T;
            C193378Pj r114 = r014;
            if (r014 != null) {
                arrayList.add(new TargetEffectServiceConfigurationHybrid(r114));
            }
            NetworkPolicyConfiguration networkPolicyConfiguration = r6.A0R;
            NetworkPolicyConfiguration networkPolicyConfiguration2 = networkPolicyConfiguration;
            if (networkPolicyConfiguration != null) {
                arrayList.add(new NetworkPolicyConfigurationHybrid(networkPolicyConfiguration2));
            }
            GalleryPickerServiceConfiguration galleryPickerServiceConfiguration = r6.A0M;
            GalleryPickerServiceConfiguration galleryPickerServiceConfiguration2 = galleryPickerServiceConfiguration;
            if (galleryPickerServiceConfiguration != null) {
                arrayList.add(new GalleryPickerServiceConfigurationHybrid(galleryPickerServiceConfiguration2));
            }
            for (AnonymousClass89X r2 : Collections.unmodifiableMap(r6.A00).values()) {
                C30689Dhd dhd = r2.A01;
                if (dhd != null) {
                    ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid = new ServiceMessageDataSourceHybrid(dhd);
                    dhd.A00(serviceMessageDataSourceHybrid);
                    arrayList.add(new ServiceMessageChannelHybrid(r2, serviceMessageDataSourceHybrid));
                }
            }
        }
        this.mServiceConfigurations = arrayList;
        for (ServiceModule createConfiguration : this.mServiceModules) {
            ServiceConfiguration createConfiguration2 = createConfiguration.createConfiguration(r6);
            if (createConfiguration2 != null) {
                this.mServiceConfigurations.add(createConfiguration2);
            }
        }
        return this.mServiceConfigurations;
    }

    public void destroy() {
        this.mHybridData.resetNative();
        for (ServiceConfiguration destroy : this.mServiceConfigurations) {
            destroy.destroy();
        }
        this.mServiceConfigurations.clear();
        for (ServiceModule serviceModule : this.mServiceModules) {
            serviceModule.mHybridData.resetNative();
        }
        this.mServiceModules.clear();
    }

    public void setCurrentOptimizationMode(C202668lk r2) {
        nativeSetCurrentOptimizationMode(r2.A00);
    }

    public void setManifest(EffectManifest effectManifest) {
        this.mEffectManifest = effectManifest;
        TouchService touchService = getTouchService();
        if (touchService != null) {
            touchService.setTouchConfig(new C30511Ddi(effectManifest.supportsTapGesture, effectManifest.supportsPanGesture, effectManifest.supportsPinchGesture, effectManifest.supportsRotateGesture, effectManifest.supportsLongPressGesture, effectManifest.supportsRawTouchGesture));
        }
    }

    public C66872wE getFrameFormatForPostProcessing() {
        int nativeGetFrameFormat = nativeGetFrameFormat();
        if (nativeGetFrameFormat == 0) {
            return C66872wE.NONE;
        }
        if (nativeGetFrameFormat == 1) {
            return C66872wE.YUV;
        }
        if (nativeGetFrameFormat == 2) {
            return C66872wE.Y;
        }
        throw new IllegalArgumentException(AnonymousClass000.A05("Received incorrect value: ", nativeGetFrameFormat));
    }

    public void updateFrame(C194478Uf r35, int i, boolean z) {
        int length;
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBuffer;
        C193298Oz r4 = (C193298Oz) r35.get();
        int width = r4.getWidth();
        int height = r4.getHeight();
        AnonymousClass8Pg[] AS9 = r4.AS9();
        Pair ALx = r4.ALx();
        ByteBuffer byteBuffer2 = null;
        float[] fArr = ALx != null ? new float[]{((Float) ALx.first).floatValue(), ((Float) ALx.second).floatValue()} : null;
        byte[] AJo = r4.AJo();
        int i5 = 0;
        int i6 = i;
        boolean z2 = z;
        if (AJo != null) {
            nativeUpdateFrame(width, height, width, 0, width, 0, width, 0, i6, z2, r4.AS6(), AJo, r4.AYL(), r4.AhD(), r4.ANx(), fArr, r4.ALw(), (double) r4.AMF(), (double) r4.getExposureTime(), r35.A00());
        } else if (AS9 != null && (length = AS9.length) > 0) {
            AnonymousClass8Pg r7 = AS9[0];
            int AUr = r7.AUr();
            int i7 = width;
            if (AUr != 0) {
                i7 = AUr;
            }
            int AS7 = r7.AS7();
            if (length > 1) {
                AnonymousClass8Pg r6 = AS9[1];
                i2 = r6.AUr();
                if (i2 == 0) {
                    i2 = width;
                }
                i3 = r6.AS7();
            } else {
                i2 = width;
                i3 = 0;
            }
            if (length > 2) {
                AnonymousClass8Pg r62 = AS9[2];
                i4 = r62.AUr();
                if (i4 == 0) {
                    i4 = width;
                }
                i5 = r62.AS7();
            } else {
                i4 = width;
            }
            int AS6 = r4.AS6();
            ByteBuffer AJm = r7.AJm();
            if (length > 1) {
                byteBuffer = AS9[1].AJm();
            } else {
                byteBuffer = null;
            }
            if (length > 2) {
                byteBuffer2 = AS9[2].AJm();
            }
            nativeUpdateFrame(width, height, i7, AS7, i2, i3, i4, i5, i6, z2, AS6, AJm, byteBuffer, byteBuffer2, r4.AYL(), r4.AhD(), r4.ANx(), fArr, r4.ALw(), (double) r4.AMF(), (double) r4.getExposureTime(), r35.A00());
        }
    }

    public void setAttribution(EffectAttribution effectAttribution) {
        this.mAttribution = effectAttribution;
    }

    public void setCameraSensorRotation(int i) {
        nativeSetCameraSensorRotation(i);
    }
}
