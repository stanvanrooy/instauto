package com.facebook.quicklog;

import com.facebook.common.util.TriState;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0Hz;
import p000X.AnonymousClass0I7;

public interface QuickPerformanceLogger {
    long currentMonotonicTimestamp();

    long currentMonotonicTimestampNanos();

    void endAllInstancesOfMarker(int i, short s);

    boolean isMarkerOn(int i);

    boolean isMarkerOn(int i, int i2);

    EventBuilder markEventBuilder(int i, String str);

    void markerAnnotate(int i, int i2, String str, double d);

    void markerAnnotate(int i, int i2, String str, int i3);

    void markerAnnotate(int i, int i2, String str, long j);

    void markerAnnotate(int i, int i2, String str, String str2);

    void markerAnnotate(int i, int i2, String str, boolean z);

    void markerAnnotate(int i, int i2, String str, double[] dArr);

    void markerAnnotate(int i, int i2, String str, int[] iArr);

    void markerAnnotate(int i, int i2, String str, long[] jArr);

    void markerAnnotate(int i, int i2, String str, String[] strArr);

    void markerAnnotate(int i, int i2, String str, boolean[] zArr);

    void markerAnnotate(int i, String str, double d);

    void markerAnnotate(int i, String str, int i2);

    void markerAnnotate(int i, String str, long j);

    void markerAnnotate(int i, String str, String str2);

    void markerAnnotate(int i, String str, boolean z);

    void markerAnnotate(int i, String str, double[] dArr);

    void markerAnnotate(int i, String str, int[] iArr);

    void markerAnnotate(int i, String str, long[] jArr);

    void markerAnnotate(int i, String str, String[] strArr);

    void markerAnnotate(int i, String str, boolean[] zArr);

    void markerCancel(int i);

    void markerCancel(int i, int i2);

    void markerCancel(int i, int i2, short s);

    void markerCancel(int i, short s);

    void markerDrop(int i);

    void markerDrop(int i, int i2);

    void markerEnd(int i, int i2, short s);

    void markerEnd(int i, int i2, short s, long j);

    void markerEnd(int i, int i2, short s, long j, TriState triState);

    void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit);

    void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit, TriState triState);

    void markerEnd(int i, short s);

    void markerEnd(int i, short s, long j);

    void markerEnd(int i, short s, long j, TimeUnit timeUnit);

    void markerGenerate(int i, short s, int i2);

    void markerGenerateWithAnnotations(int i, short s, int i2, Map map);

    void markerPoint(int i, int i2, int i3, String str, AnonymousClass0I7 r5, long j, int i4);

    void markerPoint(int i, int i2, int i3, String str, AnonymousClass0I7 r5, long j, TimeUnit timeUnit, int i4);

    void markerPoint(int i, int i2, String str);

    void markerPoint(int i, int i2, String str, long j);

    void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit);

    void markerPoint(int i, int i2, String str, String str2);

    void markerPoint(int i, int i2, String str, String str2, long j);

    void markerPoint(int i, int i2, String str, String str2, long j, int i3);

    void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit);

    void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3);

    void markerPoint(int i, String str);

    void markerPoint(int i, String str, long j);

    void markerPoint(int i, String str, long j, TimeUnit timeUnit);

    void markerPoint(int i, String str, String str2);

    void markerPoint(int i, String str, String str2, long j);

    void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i);

    void markerStart(int i, int i2);

    void markerStart(int i, int i2, long j);

    void markerStart(int i, int i2, long j, int i3);

    void markerStart(int i, int i2, long j, TimeUnit timeUnit);

    void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3);

    void markerStart(int i, int i2, String str, String str2);

    void markerStart(int i, int i2, String str, String str2, long j);

    void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i, int i2, boolean z);

    void markerStart(int i, String str, String str2);

    void markerStart(int i, String str, String str2, long j);

    void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit);

    void markerStart(int i, boolean z);

    void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit);

    void markerTag(int i, int i2, String str);

    void markerTag(int i, String str);

    int sampleRateForMarker(int i);

    void updateListenerMarkers();

    AnonymousClass0Hz withMarker(int i);

    AnonymousClass0Hz withMarker(int i, int i2);
}
