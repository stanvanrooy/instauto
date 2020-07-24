package com.facebook.common.jit.common;

public class PgoMethodInfo {
    public final double A00;
    public final double A01;
    public final int A02;
    public final int A03;
    public final MethodInfo A04;
    public final boolean A05;

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ PgoMethodInfo ");
        sb.append("methodInfo: ");
        sb.append(this.A04);
        sb.append(", ");
        sb.append("hasExtraInfo: ");
        boolean z = this.A05;
        sb.append(z);
        sb.append(" ");
        if (z) {
            sb.append("[ ");
            sb.append("count: ");
            sb.append(this.A02);
            sb.append(", ");
            sb.append("methodSize: ");
            sb.append(this.A03);
            sb.append(", ");
            sb.append("usedPercent: ");
            sb.append(this.A01);
            sb.append(", ");
            sb.append("topKUsedPercentage: ");
            sb.append(this.A00);
            sb.append(" ]");
        }
        sb.append(']');
        return sb.toString();
    }

    public PgoMethodInfo(MethodInfo methodInfo) {
        this.A04 = methodInfo;
        this.A05 = false;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
    }

    public PgoMethodInfo(MethodInfo methodInfo, int i, int i2, double d, double d2) {
        this.A04 = methodInfo;
        this.A05 = true;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = d;
        this.A00 = d2;
    }
}
