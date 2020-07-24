package com.instagram.filterkit.filter.resize;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.C89133th;
import p000X.C89433uD;

public class IdentityFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(334);

    public final AnonymousClass8U1 A0C(C89433uD r3) {
        int A00 = ShaderBridge.A00("Identity");
        if (A00 == 0) {
            return null;
        }
        return new AnonymousClass8U1(A00);
    }

    public final void A0E(AnonymousClass8U1 r3, C89433uD r4, C89133th r5, AnonymousClass85B r6) {
        r3.A03("image", r5.getTextureId());
    }

    public IdentityFilter(Parcel parcel) {
        super(parcel);
    }

    public IdentityFilter(boolean z) {
        super(z);
    }
}
