package com.facebook.mediastreaming.client.livestreaming;

public interface LiveStreamingClient {

    public interface LiveStreamingSessionCallbacks {
        void onError(int i, String str, String str2, String str3, String str4);

        void onInitialized();

        void onPaused();

        void onReleased();

        void onResumed();

        void onStarted();

        void onStopped();
    }

    void pause(boolean z);

    void start();

    void stop(boolean z);

    void updateAspectRatio(float f);
}
