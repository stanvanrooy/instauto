package com.facebook.cameracore.mediapipeline.services.music.interfaces;

import com.facebook.native_bridge.NativeDataPromise;

public interface MusicServiceDataSource {
    void getCurrentPlayingItem(NativeDataPromise nativeDataPromise);

    void getCurrentSongArtist(NativeDataPromise nativeDataPromise);

    void getCurrentSongGenre(NativeDataPromise nativeDataPromise);

    void getCurrentSongPlaybackTimeMs(NativeDataPromise nativeDataPromise);

    void getCurrentSongTitle(NativeDataPromise nativeDataPromise);

    void stop();
}
