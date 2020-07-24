package com.facebook.mediastreaming.opt.source.audio;

public interface AndroidAudioInput {
    void setHost(AndroidAudioInputHost androidAudioInputHost);

    void startAudioStreaming();

    void stopAudioStreaming();
}
