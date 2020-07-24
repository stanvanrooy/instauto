package com.facebook.cameracore.mediapipeline.services.date.implementation;

import android.content.Context;
import android.text.format.DateUtils;
import com.facebook.cameracore.mediapipeline.services.date.interfaces.DateService;
import com.facebook.jni.HybridData;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateServiceImpl extends DateService {
    public final Context mContext;
    public final SimpleDateFormat mDateShortFormat;
    public final SimpleDateFormat mTimeLongFormat;

    private native HybridData initHybrid();

    public void destroy() {
        this.mHybridData.resetNative();
    }

    public String getDateFullStyle() {
        return DateUtils.formatDateTime(this.mContext, Calendar.getInstance().getTimeInMillis(), 22);
    }

    public String getDateLongStyle() {
        return DateUtils.formatDateTime(this.mContext, Calendar.getInstance().getTimeInMillis(), 20);
    }

    public String getDateMediumStyle() {
        return DateUtils.formatDateTime(this.mContext, Calendar.getInstance().getTimeInMillis(), 65556);
    }

    public String getDateShortStyle() {
        return this.mDateShortFormat.format(Calendar.getInstance().getTime());
    }

    public String getDayOfWeek() {
        return DateUtils.formatDateTime(this.mContext, Calendar.getInstance().getTimeInMillis(), 2);
    }

    public String getTimeLongStyle() {
        return this.mTimeLongFormat.format(Calendar.getInstance().getTime());
    }

    public String getTimeShortStyle() {
        return DateUtils.formatDateTime(this.mContext, Calendar.getInstance().getTimeInMillis(), 2561);
    }

    public DateServiceImpl(Context context) {
        this.mContext = context;
        this.mHybridData = initHybrid();
        Locale locale = this.mContext.getResources().getConfiguration().locale;
        this.mTimeLongFormat = new SimpleDateFormat("h:mm:ss a", locale);
        this.mDateShortFormat = new SimpleDateFormat("M/d/yy", locale);
    }
}
