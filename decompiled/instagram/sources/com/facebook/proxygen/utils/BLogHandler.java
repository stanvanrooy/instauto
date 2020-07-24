package com.facebook.proxygen.utils;

import com.facebook.proxygen.utils.GLogHandler;

public interface BLogHandler {
    void log(GLogHandler.GLogSeverity gLogSeverity, String str);
}
