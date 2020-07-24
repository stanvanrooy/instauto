package com.facebook.graphservice.interfaces;

import com.facebook.proxygen.TraceFieldType;
import p000X.C13540ik;
import p000X.C197448cd;

public class Summary {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public final String toString() {
        C197448cd A002 = C13540ik.A00(this);
        C197448cd.A00(A002, "source", this.A0I);
        C197448cd.A00(A002, "isFinal", String.valueOf(this.A0K));
        A002.A02("attempts", this.A00);
        C197448cd.A00(A002, "fbRequestId", this.A0G);
        A002.A03("requestStart", this.A0A);
        A002.A03("networkStart", this.A07);
        A002.A03("networkEnd", this.A06);
        A002.A03("parseStart", this.A08);
        A002.A03("requestEnd", this.A09);
        A002.A02("parsedDataSize", this.A01);
        A002.A03("additiveParseTimeMs", this.A02);
        A002.A03("fetchCachedResponseStart", this.A05);
        A002.A03("fetchCachedResponseEnd", this.A04);
        A002.A03("cachedResponseAge", this.A03);
        C197448cd.A00(A002, "freshResponse", String.valueOf(this.A0J));
        C197448cd.A00(A002, "consistencySource", this.A0F);
        A002.A03("serverStartTime", this.A0D);
        A002.A03("serverFlushTime", this.A0C);
        C197448cd.A00(A002, "rejectedFromAdaptiveFetch", String.valueOf(this.A0L));
        C197448cd.A00(A002, "prefetchPredictionID", this.A0H);
        A002.A03(TraceFieldType.RTT, this.A0B);
        A002.A03("upstreamLatency", this.A0E);
        return A002.toString();
    }

    public Summary(String str, boolean z, boolean z2, String str2, int i, long j, long j2, long j3, long j4, long j5, int i2, long j6, long j7, long j8, long j9, boolean z3, int i3, int i4, String str3, String str4, String str5, boolean z4, boolean z5, boolean z6, String str6, long j10, long j11, long j12, long j13, boolean z7, String str7, long j14, long j15) {
        this.A0I = str;
        this.A0K = z;
        this.A0G = str2;
        this.A00 = i;
        this.A0A = j;
        this.A07 = j2;
        this.A06 = j3;
        this.A08 = j4;
        this.A09 = j5;
        this.A01 = i2;
        this.A02 = j6;
        this.A05 = j7;
        this.A04 = j8;
        this.A03 = j9;
        this.A0J = z3;
        this.A0F = str6;
        this.A0D = j10;
        this.A0C = j11;
        this.A0L = z7;
        this.A0H = str7;
        this.A0B = j14;
        this.A0E = j15;
    }
}
