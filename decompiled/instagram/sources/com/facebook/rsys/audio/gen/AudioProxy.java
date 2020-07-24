package com.facebook.rsys.audio.gen;

public abstract class AudioProxy {
    public abstract void setApi(AudioApi audioApi);

    public abstract void setAudioOn(boolean z);

    public abstract void setIsCallActive(boolean z);

    public abstract void setRoute(int i, boolean z);
}
