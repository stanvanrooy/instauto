package com.facebook.rsys.audio.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass92K;

public class AudioStream {
    public static AnonymousClass921 CONVERTER = new AnonymousClass92K();
    public final boolean hasVoiceActivity;
    public final int type;

    public static native AudioStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioStream)) {
            return false;
        }
        AudioStream audioStream = (AudioStream) obj;
        if (this.type == audioStream.type && this.hasVoiceActivity == audioStream.hasVoiceActivity) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.type) * 31) + (this.hasVoiceActivity ? 1 : 0);
    }

    public String toString() {
        return "AudioStream{type=" + this.type + "," + "hasVoiceActivity=" + this.hasVoiceActivity + "}";
    }

    public AudioStream(int i, boolean z) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Boolean.valueOf(z));
        this.type = i;
        this.hasVoiceActivity = z;
    }
}
