package com.facebook.msys.mci;

public interface Settings {
    boolean readBooleanSetting(String str, boolean z);

    long readLongSetting(String str, long j);

    String readStringSetting(String str, String str2);

    void writeBooleanSetting(String str, boolean z);

    void writeLongSetting(String str, long j);

    void writeStringSetting(String str, String str2);
}
