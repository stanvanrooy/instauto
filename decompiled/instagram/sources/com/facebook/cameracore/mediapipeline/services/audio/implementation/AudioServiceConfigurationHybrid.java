package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformEffectHooks;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import p000X.C194478Uf;
import p000X.C29958DIn;
import p000X.C57202dk;
import p000X.C65522tF;
import p000X.C79383dJ;

public class AudioServiceConfigurationHybrid extends ServiceConfiguration {
    public final C65522tF mConfiguration;
    public final C79383dJ mPlatformReleaser = new C57202dk(this);

    private native HybridData initHybrid();

    public Reference createAudioPlatform() {
        AudioPlatformComponentHostImpl audioPlatformComponentHostImpl = new AudioPlatformComponentHostImpl(this.mConfiguration.A05, (C29958DIn) null);
        this.mConfiguration.A01(audioPlatformComponentHostImpl);
        return new C194478Uf(audioPlatformComponentHostImpl, this.mPlatformReleaser);
    }

    public AudioGraphClientProvider getAudioGraphClientProvider() {
        return this.mConfiguration.A00;
    }

    public AudioPlatformEffectHooks getAudioPlatformEffectHooks() {
        return null;
    }

    public AudioServiceConfigurationAnnouncer getAudioServiceConfigurationAnnouncer() {
        return this.mConfiguration.A01;
    }

    public AudioServiceConfigurationHybrid(C65522tF r2) {
        this.mHybridData = initHybrid();
        this.mConfiguration = r2;
    }
}
