package com.facebook.rsys.audio.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass92I;

public class AudioModel {
    public static AnonymousClass921 CONVERTER = new AnonymousClass92I();
    public final int audioActivationState;
    public final int audioOutputRoute;
    public final boolean hasUsedBluetoothAudioRoute;
    public final boolean micOn;

    public static native AudioModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioModel)) {
            return false;
        }
        AudioModel audioModel = (AudioModel) obj;
        if (this.audioActivationState == audioModel.audioActivationState && this.micOn == audioModel.micOn && this.audioOutputRoute == audioModel.audioOutputRoute && this.hasUsedBluetoothAudioRoute == audioModel.hasUsedBluetoothAudioRoute) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.audioActivationState) * 31) + (this.micOn ? 1 : 0)) * 31) + this.audioOutputRoute) * 31) + (this.hasUsedBluetoothAudioRoute ? 1 : 0);
    }

    public String toString() {
        return "AudioModel{audioActivationState=" + this.audioActivationState + "," + "micOn=" + this.micOn + "," + "audioOutputRoute=" + this.audioOutputRoute + "," + "hasUsedBluetoothAudioRoute=" + this.hasUsedBluetoothAudioRoute + "}";
    }

    public AudioModel(int i, boolean z, int i2, boolean z2) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(Boolean.valueOf(z2));
        this.audioActivationState = i;
        this.micOn = z;
        this.audioOutputRoute = i2;
        this.hasUsedBluetoothAudioRoute = z2;
    }
}
