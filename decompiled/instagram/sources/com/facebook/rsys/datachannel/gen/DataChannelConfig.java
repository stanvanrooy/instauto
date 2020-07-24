package com.facebook.rsys.datachannel.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass92Q;

public class DataChannelConfig {
    public static AnonymousClass921 CONVERTER = new AnonymousClass92Q();
    public final byte[] initialStateSyncData;
    public final Long maxRetransmitTime;
    public final Long maxRetransmits;
    public final boolean ordered;
    public final int transportType;

    public static native DataChannelConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof DataChannelConfig)) {
            return false;
        }
        DataChannelConfig dataChannelConfig = (DataChannelConfig) obj;
        if (this.ordered != dataChannelConfig.ordered) {
            return false;
        }
        Long l = this.maxRetransmitTime;
        if ((l != null || dataChannelConfig.maxRetransmitTime != null) && (l == null || !l.equals(dataChannelConfig.maxRetransmitTime))) {
            return false;
        }
        Long l2 = this.maxRetransmits;
        if (((l2 != null || dataChannelConfig.maxRetransmits != null) && (l2 == null || !l2.equals(dataChannelConfig.maxRetransmits))) || this.transportType != dataChannelConfig.transportType) {
            return false;
        }
        byte[] bArr = this.initialStateSyncData;
        if ((bArr != null || dataChannelConfig.initialStateSyncData != null) && (bArr == null || !Arrays.equals(bArr, dataChannelConfig.initialStateSyncData))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = (true + (this.ordered ? 1 : 0)) * 31;
        Long l = this.maxRetransmitTime;
        int i2 = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Long l2 = this.maxRetransmits;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int i4 = (((i3 + hashCode2) * 31) + this.transportType) * 31;
        byte[] bArr = this.initialStateSyncData;
        if (bArr != null) {
            i2 = bArr.hashCode();
        }
        return i4 + i2;
    }

    public String toString() {
        return "DataChannelConfig{ordered=" + this.ordered + "," + "maxRetransmitTime=" + this.maxRetransmitTime + "," + "maxRetransmits=" + this.maxRetransmits + "," + "transportType=" + this.transportType + "," + "initialStateSyncData=" + this.initialStateSyncData + "}";
    }

    public DataChannelConfig(boolean z, Long l, Long l2, int i, byte[] bArr) {
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Integer.valueOf(i));
        this.ordered = z;
        this.maxRetransmitTime = l;
        this.maxRetransmits = l2;
        this.transportType = i;
        this.initialStateSyncData = bArr;
    }
}
