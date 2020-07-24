package com.instagram.business.controller.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass267;

public class BusinessConversionFlowStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(257);
    public final int A00;
    public final ImmutableList A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BusinessConversionFlowStatus)) {
            return false;
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = (BusinessConversionFlowStatus) obj;
        return businessConversionFlowStatus.A00 == this.A00 && AnonymousClass17M.A00(businessConversionFlowStatus.A01, this.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public final BusinessConversionStep A00() {
        int i = this.A00;
        boolean z = false;
        if (i > -1) {
            z = true;
        }
        if (!z) {
            return null;
        }
        boolean z2 = false;
        if (i == this.A01.size()) {
            z2 = true;
        }
        if (!z2) {
            return (BusinessConversionStep) this.A01.get(this.A00);
        }
        return null;
    }

    public final BusinessConversionStep A01() {
        int i = this.A00;
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        if (z) {
            return (BusinessConversionStep) this.A01.get(i - 1);
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeList(this.A01);
    }

    public BusinessConversionFlowStatus(Parcel parcel) {
        this.A00 = parcel.readInt();
        AnonymousClass267 r2 = new AnonymousClass267();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, BusinessConversionStep.class.getClassLoader());
        r2.A07(arrayList);
        this.A01 = r2.A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.isEmpty() != false) goto L_0x000c;
     */
    public BusinessConversionFlowStatus(List list) {
        boolean z = list != null ? true : z;
        z = false;
        AnonymousClass0a4.A0A(z);
        AnonymousClass267 r0 = new AnonymousClass267();
        r0.A07(list);
        this.A01 = r0.A06();
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.isEmpty() != false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r4 > r1.size()) goto L_0x0028;
     */
    public BusinessConversionFlowStatus(List list, int i) {
        boolean z = list != null ? true : z;
        z = false;
        AnonymousClass0a4.A0A(z);
        AnonymousClass267 r0 = new AnonymousClass267();
        r0.A07(list);
        ImmutableList A06 = r0.A06();
        this.A01 = A06;
        boolean z2 = i >= -1 ? true : z2;
        z2 = false;
        AnonymousClass0a4.A0A(z2);
        this.A00 = i;
    }
}
