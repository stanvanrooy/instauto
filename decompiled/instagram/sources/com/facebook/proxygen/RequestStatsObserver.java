package com.facebook.proxygen;

public class RequestStatsObserver implements TraceEventObserver {
    public TraceEvent[] mEvents;

    public RequestStats getRequestStats() {
        TraceEvent[] traceEventArr = this.mEvents;
        if (traceEventArr == null || traceEventArr.length == 0) {
            return null;
        }
        return new RequestStats(traceEventArr);
    }

    public void traceEventAvailable(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }
}
