package com.instagram.wellbeing.idverification.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import com.facebook.smartcapture.resources.ResourcesProvider;
import p000X.AnonymousClass95Z;
import p000X.C27253C5f;
import p000X.C27254C5g;

public class IgIdCaptureResourcesProvider extends C27253C5f implements ResourcesProvider {
    public static final Parcelable.Creator CREATOR = new AnonymousClass95Z(IgIdCaptureResourcesProvider.class);
    public Resources A00;
    public C27254C5g A01;

    public final C27254C5g AKW() {
        return this.A01;
    }

    public final Resources AUW() {
        return this.A00;
    }

    public final void Ada(Context context) {
        this.A00 = context.getResources();
        this.A01 = new C27254C5g();
    }
}
