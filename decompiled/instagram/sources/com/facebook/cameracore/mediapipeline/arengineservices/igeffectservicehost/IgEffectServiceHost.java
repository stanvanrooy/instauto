package com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClassSource;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ExternalSLAMDataInput;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.WorldTrackerDataProviderConfigWithSlam;
import com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule;
import com.facebook.cameracore.mediapipeline.dataproviders.volume.implementation.VolumeDataProviderImpl;
import com.facebook.cameracore.mediapipeline.dataproviders.volume.interfaces.VolumeDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderModule;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceModule;
import com.facebook.cameracore.mediapipeline.services.date.implementation.DateServiceImpl;
import com.facebook.cameracore.mediapipeline.services.date.interfaces.DateService;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.jni.HybridData;
import com.instagram.camera.effect.p016mq.voltron.IgArVoltronModuleLoader;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass0Ba;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass3GG;
import p000X.C06080Nr;
import p000X.C17620qX;
import p000X.C22470yU;
import p000X.C30502DdS;
import p000X.C64282qy;
import p000X.C64292rE;
import p000X.C72203Ee;
import p000X.C72333Et;
import p000X.C76013Ud;
import p000X.C79923eL;

public class IgEffectServiceHost extends EffectServiceHost {
    public static volatile boolean sIsLibraryLoaded;
    public ARClassSource mARClassSource;
    public ARExperimentConfig mARExperimentConfig;
    public AnalyticsLogger mAnalyticsLogger;
    public DateService mDateService;
    public NetworkClient mNetworkClient;
    public ExternalSLAMDataInput mSlamDataInput;
    public C76013Ud mTouchInput;
    public TouchService mTouchService;
    public final AnonymousClass0C1 mUserSession;
    public VolumeDataProvider mVolumeDataProvider;

    private native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger, NetworkClient networkClient, ARExperimentConfig aRExperimentConfig, ARClassSource aRClassSource, List list);

    public void destroyObjectTrackerDataProvider() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public IgEffectServiceHost(Context context, AnonymousClass0C1 r15, EffectServiceHostConfig effectServiceHostConfig, C72333Et r17, ARClassSource aRClassSource, C72203Ee r19, C79923eL r20) {
        super(r6, r7, r8, Arrays.asList(new ServiceModule[]{new AudioServiceModule(), new WorldTrackerDataProviderModule(), new DynamicServiceModule(C64292rE.A06, IgArVoltronModuleLoader.getInstance(r15).getModuleLoader(C22470yU.AR_SERVICES_FOR_HAIR_SEGMENTATION), r4), new DynamicServiceModule(C64292rE.A0F, IgArVoltronModuleLoader.getInstance(r15).getModuleLoader(C22470yU.AR_SERVICES_FOR_PERSON_SEGMENTATION), r4), new DynamicServiceModule(C64292rE.A0H, IgArVoltronModuleLoader.getInstance(r15).getModuleLoader(C22470yU.SLAM), AnonymousClass0QD.A00()), new DynamicServiceModule(C64292rE.A0E, IgArVoltronModuleLoader.getInstance(r15).getModuleLoader(C22470yU.AR_SERVICES_FOR_MOVING_RECOGNITION_TRACKING), r4), new DynamicServiceModule(C64292rE.A02, IgArVoltronModuleLoader.getInstance(r15).getModuleLoader(C22470yU.AR_SERVICES_FOR_BODY_TRACKING), r4), new DynamicServiceModule(C64292rE.A0A, IgArVoltronModuleLoader.getInstance(r15).getModuleLoader(C22470yU.AR_SERVICES_FOR_MOVING_RECOGNITION_TRACKING), r4), new DynamicServiceModule(C64292rE.A08, IgArVoltronModuleLoader.getInstance(r15).getModuleLoader(C22470yU.AR_SERVICES_FOR_WOLF), r4)}), (String) null, r11);
        Context context2;
        C64282qy r8 = new C64282qy();
        AnonymousClass0Ba A00 = AnonymousClass0QD.A00();
        synchronized (IgEffectServiceHost.class) {
            context2 = context;
            if (!sIsLibraryLoaded) {
                if (!C06080Nr.A07(context)) {
                    try {
                        AnonymousClass0Y1.A09("caffe2_ig_ops", 16);
                    } catch (UnsatisfiedLinkError e) {
                        AnonymousClass0DB.A0I("IgEffectServiceHost", "caffe2 ops lib soloader load error: ", e);
                    }
                }
                AnonymousClass0Y1.A08("graphicsengine-arengineservices-igeffectservicehost-native");
                sIsLibraryLoaded = true;
            }
        }
        EffectServiceHostConfig effectServiceHostConfig2 = effectServiceHostConfig;
        C72333Et r11 = r17;
        this.mUserSession = r15;
        AnalyticsLoggerImpl analyticsLoggerImpl = new AnalyticsLoggerImpl(r19, C17620qX.A00);
        this.mAnalyticsLogger = analyticsLoggerImpl;
        analyticsLoggerImpl.setSessionListener(r20);
        this.mARExperimentConfig = new ARExperimentConfigImpl(r11);
        this.mARClassSource = aRClassSource;
        NetworkClientImpl networkClientImpl = new NetworkClientImpl(new AnonymousClass3GG());
        this.mNetworkClient = networkClientImpl;
        this.mHybridData = initHybrid(effectServiceHostConfig2, this.mAnalyticsLogger, networkClientImpl, this.mARExperimentConfig, this.mARClassSource, this.mServiceModules);
    }

    public DateService createDateService() {
        if (this.mDateService == null) {
            this.mDateService = new DateServiceImpl(this.mContext);
        }
        return this.mDateService;
    }

    public TouchService createTouchService() {
        if (this.mTouchService == null) {
            TouchServiceImpl touchServiceImpl = new TouchServiceImpl();
            this.mTouchService = touchServiceImpl;
            C76013Ud r1 = this.mTouchInput;
            if (r1 != null) {
                r1.A00(touchServiceImpl.getGestureProcessor());
            }
        }
        return this.mTouchService;
    }

    public VolumeDataProvider createVolumeDataProvider() {
        if (this.mVolumeDataProvider == null) {
            this.mVolumeDataProvider = new VolumeDataProviderImpl(this.mContext);
        }
        return this.mVolumeDataProvider;
    }

    public void destroyDateService() {
        DateService dateService = this.mDateService;
        if (dateService != null) {
            dateService.destroy();
            this.mDateService = null;
        }
    }

    public void destroyTouchService() {
        C76013Ud r1 = this.mTouchInput;
        if (r1 != null) {
            r1.A00((C30502DdS) null);
        }
        this.mTouchService = null;
    }

    public void destroyVolumeDataProvider() {
        VolumeDataProvider volumeDataProvider = this.mVolumeDataProvider;
        if (volumeDataProvider != null) {
            volumeDataProvider.destroy();
        }
        this.mVolumeDataProvider = null;
    }

    public AnalyticsLogger getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    public DateService getDateService() {
        return this.mDateService;
    }

    public PluginConfigProvider getEnginePluginConfigProvider() {
        return new IgPluginConfigProvider(this.mContext, this.mUserSession);
    }

    public TouchService getTouchService() {
        return this.mTouchService;
    }

    public void setTouchInput(C76013Ud r2) {
        this.mTouchInput = r2;
        TouchService touchService = this.mTouchService;
        if (touchService != null) {
            r2.A00(touchService.getGestureProcessor());
        }
    }

    public void updateExternalWorldTrackingData(float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int[] iArr2, int i, int i2) {
        ExternalSLAMDataInput externalSLAMDataInput;
        if (this.mSlamDataInput == null) {
            WorldTrackerDataProviderConfigWithSlam worldTrackerDataProviderConfigWithSlam = this.mEffectServiceHostConfig.mWorldTrackerDataProviderConfigWithSlam;
            if (worldTrackerDataProviderConfigWithSlam != null) {
                externalSLAMDataInput = worldTrackerDataProviderConfigWithSlam.externalSLAMDataInput;
            } else {
                externalSLAMDataInput = null;
            }
            this.mSlamDataInput = externalSLAMDataInput;
        }
        ExternalSLAMDataInput externalSLAMDataInput2 = this.mSlamDataInput;
        if (externalSLAMDataInput2 != null) {
            float[] fArr4 = fArr;
            externalSLAMDataInput2.consumeWorldTrackingData(fArr4, fArr2, fArr3, iArr, iArr2, i, i2);
        }
    }

    public void destroy() {
        super.destroy();
        this.mARExperimentConfig.release();
        AnalyticsLogger analyticsLogger = this.mAnalyticsLogger;
        if (analyticsLogger != null) {
            analyticsLogger.release();
        }
        this.mAnalyticsLogger = null;
        NetworkClient networkClient = this.mNetworkClient;
        if (networkClient != null) {
            networkClient.release();
        }
        this.mNetworkClient = null;
    }
}
