package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C228569vD;
import p000X.C228589vH;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Comparator A03 = new C228569vD();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(215);
    public final String A00;
    public final List A01;
    public final List A02;

    public ActivityTransitionRequest(List list, String str, List list2) {
        AnonymousClass0a2.A03(list, "transitions can't be null");
        AnonymousClass0a2.A08(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(A03);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            AnonymousClass0a2.A08(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = str;
        this.A02 = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
                if (!C228589vH.A00(this.A01, activityTransitionRequest.A01) || !C228589vH.A00(this.A00, activityTransitionRequest.A00) || !C228589vH.A00(this.A02, activityTransitionRequest.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        String str = this.A00;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A01);
        String str = this.A00;
        String valueOf2 = String.valueOf(this.A02);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61 + String.valueOf(str).length() + valueOf2.length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0C(parcel, 1, this.A01, false);
        C228479tj.A0A(parcel, 2, this.A00, false);
        C228479tj.A0C(parcel, 3, this.A02, false);
        C228479tj.A02(parcel, A002);
    }
}
