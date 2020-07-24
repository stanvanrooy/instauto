package com.facebook.cameracore.mediapipeline.services.date.interfaces;

import com.facebook.jni.HybridData;

public abstract class DateService {
    public HybridData mHybridData;

    public abstract void destroy();

    public abstract String getDateFullStyle();

    public abstract String getDateLongStyle();

    public abstract String getDateMediumStyle();

    public abstract String getDateShortStyle();

    public abstract String getDayOfWeek();

    public abstract String getTimeLongStyle();

    public abstract String getTimeShortStyle();
}
