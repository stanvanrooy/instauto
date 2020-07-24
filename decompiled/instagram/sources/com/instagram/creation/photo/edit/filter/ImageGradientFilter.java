package com.instagram.creation.photo.edit.filter;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U3;
import p000X.AnonymousClass8U5;
import p000X.C89133th;
import p000X.C89433uD;

public class ImageGradientFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(32);
    public AnonymousClass8U5 A00;
    public AnonymousClass8U3 A01;
    public AnonymousClass8U3 A02;
    public boolean A03;
    public final int A04;
    public final float[] A05;
    public final float[] A06;

    public static float[] A00(int i) {
        return new float[]{((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f};
    }

    public final void A0E(AnonymousClass8U1 r9, C89433uD r10, C89133th r11, AnonymousClass85B r12) {
        r9.A03("image", r11.getTextureId());
        AnonymousClass8U3 r3 = this.A02;
        if (r3 != null) {
            float[] fArr = this.A05;
            r3.A02(fArr[0], fArr[1], fArr[2], 1.0f);
        }
        AnonymousClass8U3 r32 = this.A01;
        if (r32 != null) {
            float[] fArr2 = this.A06;
            r32.A02(fArr2[0], fArr2[1], fArr2[2], 1.0f);
        }
        AnonymousClass8U5 r2 = this.A00;
        if (r2 != null) {
            r2.A02((float) r12.getWidth(), (float) r12.getHeight());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeFloatArray(this.A06);
        parcel.writeFloatArray(this.A05);
        parcel.writeInt(this.A04);
    }

    public ImageGradientFilter(AnonymousClass0C1 r2, int i, int i2, int i3) {
        super(r2);
        this.A06 = A00(i);
        this.A05 = A00(i2);
        this.A04 = i3;
    }

    public ImageGradientFilter(Parcel parcel) {
        super(parcel);
        this.A03 = parcel.readInt() != 1 ? false : true;
        float[] fArr = new float[3];
        this.A06 = fArr;
        parcel.readFloatArray(fArr);
        float[] fArr2 = new float[3];
        this.A05 = fArr2;
        parcel.readFloatArray(fArr2);
        this.A04 = parcel.readInt();
    }
}
