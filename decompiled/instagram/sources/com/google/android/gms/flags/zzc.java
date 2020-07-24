package com.google.android.gms.flags;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzc extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(IObjectWrapper iObjectWrapper);
}
