package com.facebook.analytics.appstatelogger;

import android.os.SystemClock;
import p000X.C04290Dj;

public final class AppState {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public C04290Dj A0E;
    public Boolean A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public Throwable A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final int A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final boolean A0Y;

    public final String A00() {
        StringBuilder sb;
        String str = this.A0I;
        if (!str.isEmpty()) {
            String str2 = this.A0N;
            if (!str2.isEmpty()) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                return sb.toString();
            }
        }
        sb = new StringBuilder();
        sb.append(str);
        sb.append(this.A0N);
        return sb.toString();
    }

    public AppState(AppState appState) {
        this.A0X = appState.A0X;
        this.A0U = appState.A0U;
        this.A0V = appState.A0V;
        this.A0T = appState.A0T;
        this.A0K = appState.A0K;
        this.A0N = appState.A0N;
        this.A0I = appState.A0I;
        this.A08 = appState.A08;
        this.A0Y = appState.A0Y;
        this.A07 = appState.A07;
        this.A04 = appState.A04;
        this.A05 = appState.A05;
        this.A09 = appState.A09;
        this.A0A = appState.A0A;
        this.A0G = appState.A0G;
        this.A06 = appState.A06;
        this.A0F = appState.A0F;
        this.A01 = appState.A01;
        this.A0J = appState.A0J;
        this.A00 = appState.A00;
        this.A0R = appState.A0R;
        this.A0Q = appState.A0Q;
        this.A02 = appState.A02;
        this.A0O = appState.A0O;
        this.A0L = appState.A0L;
        this.A0M = appState.A0M;
        this.A0H = appState.A0H;
        this.A0E = new C04290Dj(appState.A0E);
        this.A0W = appState.A0W;
        this.A03 = appState.A03;
        this.A0D = appState.A0D;
        this.A0B = appState.A0B;
        this.A0C = appState.A0C;
        this.A0S = appState.A0S;
    }

    public AppState(String str, int i, String str2, int i2, String str3, long j, long j2, long j3) {
        this.A0B = SystemClock.uptimeMillis() - j2;
        this.A0X = str;
        this.A0U = i;
        this.A0V = str2;
        this.A0T = i2;
        this.A0W = str3;
        this.A0K = "";
        this.A0N = "coldstart";
        this.A0I = "";
        this.A0Y = false;
        this.A07 = -1;
        this.A0D = -1;
        this.A05 = j2;
        this.A09 = j3;
        this.A04 = j;
        this.A0F = null;
        this.A01 = -1;
        this.A0J = "";
        this.A0R = false;
        this.A0E = new C04290Dj();
        this.A0M = "{}";
    }
}
