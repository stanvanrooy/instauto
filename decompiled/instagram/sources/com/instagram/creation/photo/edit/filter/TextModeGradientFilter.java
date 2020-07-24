package com.instagram.creation.photo.edit.filter;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U3;
import p000X.AnonymousClass8U5;
import p000X.AnonymousClass8U6;
import p000X.AnonymousClass8UD;
import p000X.C89133th;
import p000X.C89433uD;

public class TextModeGradientFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(306);
    public AnonymousClass8U6 A00;
    public AnonymousClass8U6 A01;
    public AnonymousClass8U5 A02;
    public AnonymousClass8UD A03;
    public List A04;
    public final int A05;
    public final ArrayList A06;
    public final boolean A07;

    public final void A0F(AnonymousClass85B r1) {
    }

    public final AnonymousClass8U1 A0C(C89433uD r5) {
        int A002 = ShaderBridge.A00("ImageComplexGradientBackground");
        if (A002 == 0) {
            return null;
        }
        AnonymousClass8U1 r2 = new AnonymousClass8U1(A002);
        this.A04 = new ArrayList();
        for (int i = 0; i < this.A06.size(); i++) {
            this.A04.add((AnonymousClass8U3) r2.A00(AnonymousClass000.A05("color_", i)));
        }
        this.A00 = (AnonymousClass8U6) r2.A00("numIntervals");
        this.A01 = (AnonymousClass8U6) r2.A00("photoAlpha");
        this.A03 = (AnonymousClass8UD) r2.A00("displayType");
        this.A02 = (AnonymousClass8U5) r2.A00("resolution");
        return r2;
    }

    public final void A0E(AnonymousClass8U1 r11, C89433uD r12, C89133th r13, AnonymousClass85B r14) {
        float f;
        r11.A03("image", r13.getTextureId());
        int i = 0;
        while (true) {
            f = 1.0f;
            if (i >= this.A06.size()) {
                break;
            }
            int intValue = ((Integer) this.A06.get(i)).intValue();
            float[] fArr = {((float) Color.red(intValue)) / 255.0f, ((float) Color.green(intValue)) / 255.0f, ((float) Color.blue(intValue)) / 255.0f};
            ((AnonymousClass8U3) this.A04.get(i)).A02(fArr[0], fArr[1], fArr[2], 1.0f);
            i++;
        }
        this.A00.A02((float) (this.A06.size() - 1));
        AnonymousClass8U6 r1 = this.A01;
        if (!this.A07) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        r1.A02(f);
        this.A03.A02(this.A05);
        this.A02.A02((float) r14.getWidth(), (float) r14.getHeight());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public TextModeGradientFilter(AnonymousClass0C1 r4, ArrayList arrayList, int i, boolean z) {
        super(r4);
        boolean z2 = true;
        AnonymousClass0a4.A0C((arrayList.size() <= 1 || arrayList.size() > 10) ? false : z2, AnonymousClass000.A05("TextModeGradientFilter only supports rendering color lists of size 2-10, color list passed was of size ", arrayList.size()));
        this.A06 = arrayList;
        this.A05 = i;
        this.A07 = z;
    }

    public TextModeGradientFilter(Parcel parcel) {
        super(parcel);
        this.A06 = parcel.readArrayList(ArrayList.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A07 = parcel.readInt() != 1 ? false : true;
    }
}
