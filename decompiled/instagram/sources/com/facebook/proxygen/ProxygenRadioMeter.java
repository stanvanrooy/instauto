package com.facebook.proxygen;

public class ProxygenRadioMeter extends NativeHandleImpl {
    private native void close();

    private native void init(boolean z);

    public native String getAndClearHTTPAttributionData();

    public native String getAndClearMQTTAttributionData();

    public native Metrics getSnapshot();

    public class Metrics {
        public final long httpActiveRadioTimeMs;
        public final long httpDownBytes;
        public final int httpRequestCount;
        public final long httpTailRadioTimeMs;
        public final long httpUpBytes;
        public final int httpWakeupCount;
        public final long mqttActiveRadioTimeMs;
        public final long mqttDownBytes;
        public final int mqttRequestCount;
        public final long mqttTailRadioTimeMs;
        public final long mqttUpBytes;
        public final int mqttWakeupCount;
        public final long totalActiveRadioTimeMs;
        public final long totalTailRadioTimeMs;
        public final int totalWakeupCount;

        public Metrics(long j, long j2, int i, long j3, long j4, int i2, int i3, long j5, long j6, long j7, long j8, int i4, int i5, long j9, long j10) {
            this.totalActiveRadioTimeMs = j;
            this.totalTailRadioTimeMs = j2;
            this.totalWakeupCount = i;
            this.httpUpBytes = j3;
            this.httpDownBytes = j4;
            this.httpWakeupCount = i2;
            this.httpRequestCount = i3;
            this.httpActiveRadioTimeMs = j5;
            this.httpTailRadioTimeMs = j6;
            this.mqttUpBytes = j7;
            this.mqttDownBytes = j8;
            this.mqttWakeupCount = i4;
            this.mqttRequestCount = i5;
            this.mqttActiveRadioTimeMs = j9;
            this.mqttTailRadioTimeMs = j10;
        }
    }

    public ProxygenRadioMeter(boolean z) {
        init(z);
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
