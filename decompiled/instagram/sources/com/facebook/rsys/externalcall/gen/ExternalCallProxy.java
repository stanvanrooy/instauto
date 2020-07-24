package com.facebook.rsys.externalcall.gen;

public abstract class ExternalCallProxy {
    public abstract int isExternalCallConflict();

    public abstract void setExternalCallDelegate(ExternalCallDelegate externalCallDelegate);

    public abstract void startMonitoringExternalCalls();

    public abstract void stopMonitoringExternalCalls();
}
