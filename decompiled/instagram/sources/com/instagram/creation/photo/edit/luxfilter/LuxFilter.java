package com.instagram.creation.photo.edit.luxfilter;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;
import com.instagram.util.jpeg.JpegBridge;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass81O;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U6;
import p000X.C89133th;
import p000X.C89433uD;

public class LuxFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(308);
    public int A00 = -1;
    public AnonymousClass81O A01;
    public AnonymousClass8U6 A02;

    public final AnonymousClass8U1 A0C(C89433uD r3) {
        int A002 = ShaderBridge.A00("StarLight");
        if (A002 == 0) {
            return null;
        }
        AnonymousClass8U1 r1 = new AnonymousClass8U1(A002);
        this.A02 = (AnonymousClass8U6) r1.A00("u_strength");
        return r1;
    }

    public final void A0E(AnonymousClass8U1 r5, C89433uD r6, C89133th r7, AnonymousClass85B r8) {
        int i;
        this.A02.A02(((float) this.A00) / 100.0f);
        AnonymousClass81O r3 = this.A01;
        if (r3.A07.get() == -1) {
            try {
                Integer num = (Integer) r3.A05.take();
                synchronized (r3) {
                    int intValue = num.intValue();
                    r3.A07.set(JpegBridge.loadCDF(intValue));
                    JpegBridge.releaseNativeBuffer(intValue);
                    r3.A03.add(this);
                    i = r3.A07.get();
                }
            } catch (InterruptedException unused) {
                i = -1;
            }
        } else {
            synchronized (r3) {
                r3.A03.add(this);
                i = r3.A07.get();
            }
        }
        r5.A03("cdf", i);
        r5.A04("image", r7.getTextureId(), Constants.ZERO, Constants.ONE);
    }

    public final void A8Y(C89433uD r2) {
        super.A8Y(r2);
        this.A01.A01(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public LuxFilter(AnonymousClass0C1 r2) {
        super(r2);
    }

    public LuxFilter(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        invalidate();
    }
}
