package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackerDataProviderConfig;
import p000X.C55582av;

public class WorldTrackerDataProviderConfigWithSlam {
    public WorldTrackerDataProviderConfig config;
    public ExternalSLAMDataInput externalSLAMDataInput;
    public boolean isARCoreEnabled;
    public boolean isSlamSupported;
    public WorldTrackerSlamFactoryProvider slamFactoryProvider;
    public boolean useFirstframe;
    public boolean useVega;
    public boolean virtualTimeProfiling;
    public boolean virtualTimeReplay;

    public WorldTrackerDataProviderConfigWithSlam(C55582av r2) {
        this.config = r2.config;
        this.isSlamSupported = r2.isSlamSupported;
        this.isARCoreEnabled = r2.isARCoreEnabled;
        this.useVega = r2.useVega;
        this.useFirstframe = r2.useFirstframe;
        this.virtualTimeProfiling = r2.virtualTimeProfiling;
        this.virtualTimeReplay = r2.virtualTimeReplay;
        this.externalSLAMDataInput = r2.externalSLAMDataInput;
        this.slamFactoryProvider = r2.slamFactoryProvider;
    }
}
