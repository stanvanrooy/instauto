package com.facebook.proxygen;

public interface HTTPTransportCallback {
    public static final int BODY_BYTES_GENERATED = 64;
    public static final int BODY_BYTES_RECEIVED = 128;
    public static final int FIRST_BODY_BYTE_FLUSHED = 2;
    public static final int FIRST_HEADER_BYTE_FLUSHED = 1;
    public static final int HEADER_BYTES_GENERATED = 16;
    public static final int HEADER_BYTES_RECEIVED = 32;
    public static final int LAST_BODY_BYTE_ACKED = 8;
    public static final int LAST_BODY_BYTE_FLUSHED = 4;

    void bodyBytesGenerated(long j);

    void bodyBytesReceived(long j);

    void firstByteFlushed();

    void firstHeaderByteFlushed();

    int getEnabledCallbackFlag();

    void headerBytesGenerated(long j, long j2);

    void headerBytesReceived(long j, long j2);

    void lastByteAcked(long j);

    void lastByteFlushed();
}
