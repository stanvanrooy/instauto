package com.instagram.filterkit.filter.resize;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filter.IgFilter;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass838;
import p000X.AnonymousClass83K;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass85G;
import p000X.C137535to;
import p000X.C89103tc;
import p000X.C89133th;
import p000X.C89433uD;

public class ResizeFilter implements IgFilter {
    public static final Class A05 = ResizeFilter.class;
    public static final Parcelable.Creator CREATOR = new AnonymousClass838();
    public AnonymousClass0C1 A00;
    public boolean A01;
    public final IgFilter A02;
    public final IdentityFilter A03;
    public final boolean A04;

    public final boolean Ags() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void A8Y(C89433uD r2) {
        this.A02.A8Y(r2);
        this.A03.A8Y(r2);
    }

    public final boolean Ag0() {
        if (this.A01) {
            return this.A02.Ag0();
        }
        return this.A03.Ag0();
    }

    public final void AoY() {
        this.A03.AoY();
        this.A02.AoY();
    }

    public final void Bbg(C89433uD r4, C89133th r5, AnonymousClass85B r6) {
        if (this.A01) {
            try {
                this.A02.Bbg(r4, r5, r6);
                C137535to.A01(Constants.A0S, this.A00);
            } catch (AnonymousClass85G e) {
                AnonymousClass0DB.A05(A05, "Advanced resize failed", e);
                AnonymousClass0QD.A09("ResizeFilter Render exception", e);
                this.A01 = false;
                this.A02.A8Y(r4);
                C137535to.A01(Constants.A0T, this.A00);
                A00(r4, r5, r6);
            }
        } else {
            C137535to.A01(Constants.A0U, this.A00);
            A00(r4, r5, r6);
        }
    }

    public final void Bio(int i) {
        this.A02.Bio(i);
        this.A03.Bio(i);
    }

    public final void invalidate() {
        this.A02.invalidate();
        this.A03.invalidate();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.getToken());
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public ResizeFilter(AnonymousClass0C1 r6, boolean z, boolean z2) {
        IgFilter lanczosFilter;
        this.A00 = r6;
        this.A01 = z;
        this.A04 = z2;
        this.A03 = new IdentityFilter(z2);
        AnonymousClass0L7 r4 = AnonymousClass0L7.CAMERA_FILTER_KIT_RESIZE_ALGORITHM;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r6, r4, "is_linear_space_enabled", false, (AnonymousClass04H) null)).booleanValue();
        if (((Boolean) AnonymousClass0L6.A02(r6, r4, "use_bicubic_filter", false, (AnonymousClass04H) null)).booleanValue()) {
            lanczosFilter = new BicubicFilter(booleanValue);
        } else {
            lanczosFilter = new LanczosFilter(booleanValue);
        }
        this.A02 = lanczosFilter;
    }

    private void A00(C89433uD r8, C89133th r9, AnonymousClass85B r10) {
        int i = 1;
        for (int AU9 = (int) ((((float) r10.AU9()) * 1.9f) + 0.5f); r9.getWidth() > AU9; AU9 = (int) ((((float) AU9) * 1.9f) + 0.5f)) {
            i++;
        }
        while (i > 1) {
            AnonymousClass83K A012 = r8.A01((int) ((((float) r9.getWidth()) / 1.9f) + 0.5f), (int) ((((float) r9.getHeight()) / 1.9f) + 0.5f));
            this.A03.Bbg(r8, r9, A012);
            r8.A05(r9, (C89103tc) null);
            i--;
            r9 = A012;
        }
        this.A03.Bbg(r8, r9, r10);
        r8.A05(r9, (C89103tc) null);
    }
}
