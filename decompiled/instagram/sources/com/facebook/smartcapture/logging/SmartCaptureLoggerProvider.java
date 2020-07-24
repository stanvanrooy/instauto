package com.facebook.smartcapture.logging;

import android.content.Context;
import android.os.Parcelable;
import p000X.BYN;

public interface SmartCaptureLoggerProvider extends Parcelable {
    BYN get(Context context);
}
