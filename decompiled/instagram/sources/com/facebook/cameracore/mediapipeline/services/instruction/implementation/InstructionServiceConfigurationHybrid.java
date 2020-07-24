package com.facebook.cameracore.mediapipeline.services.instruction.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.instruction.interfaces.InstructionServiceListenerWrapper;
import com.facebook.jni.HybridData;
import p000X.C65532tG;

public class InstructionServiceConfigurationHybrid extends ServiceConfiguration {
    public final C65532tG mConfiguration;

    public static native HybridData initHybrid(InstructionServiceListenerWrapper instructionServiceListenerWrapper);

    public InstructionServiceConfigurationHybrid(C65532tG r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
