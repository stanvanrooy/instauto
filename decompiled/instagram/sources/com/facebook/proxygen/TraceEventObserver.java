package com.facebook.proxygen;

public interface TraceEventObserver {
    void traceEventAvailable(TraceEvent[] traceEventArr);
}
