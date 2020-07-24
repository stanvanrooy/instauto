package com.facebook.hermes.instrumentation;

public interface HermesSynthTraceSupport {
    boolean isEnabled();

    boolean registerTrace(String str);

    String resultPath(String str);

    String scratchPath();
}
