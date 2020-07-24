package com.facebook.proxygen.utils;

import java.nio.charset.Charset;

public class GLogHandler {
    public BLogHandler handler;
    public final GLogSeverity[] severities = GLogSeverity.values();

    public enum GLogSeverity {
        INFO,
        WARNING,
        ERROR,
        FATAL
    }

    public GLogHandler(BLogHandler bLogHandler) {
        this.handler = bLogHandler;
    }

    public void log(int i, String str) {
        if (i >= 0) {
            GLogSeverity[] gLogSeverityArr = this.severities;
            if (i < gLogSeverityArr.length) {
                this.handler.log(gLogSeverityArr[i], str);
            }
        }
    }

    public void log(int i, byte[] bArr) {
        log(i, new String(bArr, Charset.forName("UTF-8")));
    }
}
