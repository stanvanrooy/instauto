package com.facebook.ads.internal.androidx.support.p043v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import p000X.AnonymousClass000;
import p000X.C29286CvD;

/* renamed from: com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState */
public class ViewPager$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C29286CvD();
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public final String toString() {
        return AnonymousClass000.A0L("FragmentPager.SavedState{", Integer.toHexString(System.identityHashCode(this)), " position=", this.A00, "}");
    }

    public ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }
}
