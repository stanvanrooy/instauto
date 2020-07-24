package com.facebook.iabeventlogging.model;

import android.os.Parcel;
import p000X.C25080AzM;

public class IABDialogActionEvent extends IABEvent {
    public final String A00;
    public final boolean A01;

    public IABDialogActionEvent(String str, long j, long j2, String str2, boolean z) {
        super(C25080AzM.IAB_DIALOG_ACTION, str, j, j2);
        this.A00 = str2;
        this.A01 = z;
    }

    public final String toString() {
        return "IABDialogActionEvent{" + "dialogType='" + this.A00 + '\'' + ", isDialogAccepted=" + this.A01 + ", type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
