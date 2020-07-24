package com.facebook.cameracore.mediapipeline.services.weather.interfaces;

import com.facebook.native_bridge.NativeDataPromise;

public interface WeatherServiceDataSource {
    void getAltitude(NativeDataPromise nativeDataPromise);

    void getWeather(NativeDataPromise nativeDataPromise);

    void stop();
}
