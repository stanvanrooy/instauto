package com.instagram.creation.photo.edit.effectfilter;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.math.Matrix3;
import com.instagram.common.math.Matrix4;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.model.filterkit.TextureAsset;
import java.util.LinkedList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass4K6;
import p000X.AnonymousClass81O;
import p000X.AnonymousClass839;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U4;
import p000X.AnonymousClass8U6;
import p000X.AnonymousClass8U7;
import p000X.AnonymousClass8UE;
import p000X.C18550s2;
import p000X.C26901Fs;
import p000X.C89003tL;
import p000X.C89013tM;
import p000X.C89133th;
import p000X.C89173tm;
import p000X.C89383u8;
import p000X.C89393u9;
import p000X.C89403uA;
import p000X.C89433uD;

public class PhotoFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(31);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Matrix4 A06;
    public Matrix4 A07;
    public AnonymousClass81O A08;
    public C89393u9 A09;
    public AnonymousClass8UE A0A;
    public AnonymousClass8UE A0B;
    public AnonymousClass8UE A0C;
    public AnonymousClass8UE A0D;
    public AnonymousClass8UE A0E;
    public AnonymousClass8U7 A0F;
    public AnonymousClass8U4 A0G;
    public AnonymousClass8U4 A0H;
    public AnonymousClass8U6 A0I;
    public AnonymousClass8U6 A0J;
    public AnonymousClass8U6 A0K;
    public AnonymousClass8U6 A0L;
    public AnonymousClass8U6 A0M;
    public AnonymousClass8U6 A0N;
    public AnonymousClass8U6 A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final int A0V;
    public final Rect A0W;
    public final Matrix3 A0X;
    public final String A0Y;
    public final List A0Z;
    public final boolean A0a;
    public final C89133th[] A0b;
    public final Integer A0c;
    public final boolean A0d;
    public final boolean A0e;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    public void A0E(AnonymousClass8U1 r8, C89433uD r9, C89133th r10, AnonymousClass85B r11) {
        AnonymousClass8UE r0;
        AnonymousClass8UE r02;
        C89393u9 r1;
        float f;
        AnonymousClass81O r3;
        boolean z = false;
        if (this.A0U) {
            this.A0U = false;
            AnonymousClass839.A00(((float) (this.A01 + this.A05)) + this.A00, this.A0X);
        }
        this.A0D.A02(this.A0T);
        AnonymousClass8U7 r12 = this.A0F;
        r12.A00 = this.A0X.A00;
        r12.A01();
        AnonymousClass8U6 r2 = this.A0K;
        if (r2 != null) {
            r2.A02(((float) this.A02) / 100.0f);
        }
        AnonymousClass8U6 r13 = this.A0O;
        AnonymousClass85B r4 = r11;
        if (!(r13 == null || this.A0L == null)) {
            r13.A02((float) r11.AU9());
            this.A0L.A02((float) r11.AU6());
        }
        AnonymousClass8U6 r14 = this.A0N;
        if (r14 != null) {
            r14.A02((float) this.A04);
        }
        AnonymousClass8U6 r15 = this.A0M;
        if (r15 != null) {
            r15.A02((float) this.A03);
        }
        boolean z2 = true;
        if (this.A07 != null) {
            this.A0E.A02(true);
            this.A0H.A02(this.A07.A00);
        } else {
            this.A0E.A02(false);
        }
        if (this.A06 != null) {
            this.A0C.A02(true);
            this.A0G.A02(this.A06.A00);
        } else {
            this.A0C.A02(false);
        }
        if (this.A0S && this.A0T) {
            int i = this.A01;
            if (!(i == 90 || i == 270)) {
                z = true;
            }
            r0 = this.A0B;
            if (r0 != null) {
                r0.A02(z);
            }
            r02 = this.A0A;
            if (r02 != null) {
                r02.A02(z2);
            }
            C89133th r32 = r10;
            AnonymousClass8U1 r22 = r8;
            r8.A03("image", r10.getTextureId());
            r1 = this.A09;
            if (r1 != null) {
                r1.A04(this.A06);
                this.A09.A0A(r22, r32, r4, this.A0b, r9);
            }
            if (this.A0e) {
                boolean z3 = this.A0Q;
                float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (z3 && (r3 = this.A08) != null) {
                    PointF pointF = r3.A00;
                    if (pointF.x == -1.0f || pointF.y == -1.0f) {
                        try {
                            r3.A00.set((PointF) r3.A04.take());
                        } catch (InterruptedException unused) {
                        }
                    }
                    PointF pointF2 = r3.A00;
                    float f3 = pointF2.x;
                    f = pointF2.y;
                    if (!(f == -1.0f || f3 == -1.0f)) {
                        f2 = f3;
                        float min = Math.min(1.0f / (f - f2), 3.0f);
                        this.A0J.A02(min);
                        this.A0I.A02(1.0f - (f * min));
                        return;
                    }
                }
                f = 1.0f;
                float min2 = Math.min(1.0f / (f - f2), 3.0f);
                this.A0J.A02(min2);
                this.A0I.A02(1.0f - (f * min2));
                return;
            }
            return;
        }
        z2 = false;
        r0 = this.A0B;
        if (r0 != null) {
        }
        r02 = this.A0A;
        if (r02 != null) {
        }
        C89133th r322 = r10;
        AnonymousClass8U1 r222 = r8;
        r8.A03("image", r10.getTextureId());
        r1 = this.A09;
        if (r1 != null) {
        }
        if (this.A0e) {
        }
    }

    public Parcelable A0H() {
        if (!(this instanceof GradientBackgroundPhotoFilter)) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return new PhotoFilter(obtain);
        }
        Parcel obtain2 = Parcel.obtain();
        ((GradientBackgroundPhotoFilter) this).writeToParcel(obtain2, 0);
        obtain2.setDataPosition(0);
        return new GradientBackgroundPhotoFilter(obtain2);
    }

    public final void A0I(float f) {
        this.A00 = f;
        this.A0U = true;
        invalidate();
    }

    public final void A0J(int i) {
        this.A01 = i;
        this.A0U = true;
        A0O(this.A0S);
        invalidate();
    }

    public final void A0K(int i) {
        this.A02 = i;
        invalidate();
    }

    public final void A0L(int i) {
        this.A05 = i;
        this.A0U = true;
        invalidate();
    }

    public void A0M(int i, int i2, boolean z) {
        this.A04 = i;
        this.A03 = i2;
        this.A0R = z;
        C89393u9 r0 = this.A09;
        if (r0 != null) {
            r0.A02 = i;
            r0.A01 = i2;
        }
        invalidate();
    }

    public final void A0N(Matrix4 matrix4) {
        Matrix4 matrix42;
        if (matrix4 == null) {
            this.A07 = null;
        } else if (!this.A06 || (matrix42 = this.A07) == null) {
            this.A07 = new Matrix4(matrix4);
        } else {
            matrix42.A07(matrix4);
        }
    }

    public final void A0O(boolean z) {
        this.A0S = z;
        invalidate();
    }

    public final void A8Y(C89433uD r5) {
        super.A8Y(r5);
        for (C89133th cleanup : this.A0b) {
            cleanup.cleanup();
        }
    }

    public final String toString() {
        return AnonymousClass000.A0J(super.toString(), " ", this.A0Y);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A0V);
        parcel.writeTypedList(this.A0Z);
        parcel.writeString(this.A0Y);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A05);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0R ? 1 : 0);
        switch (this.A0c.intValue()) {
            case 1:
                str = "REEL";
                break;
            case 2:
                str = "COVER_FRAME";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeByte(this.A0d ? (byte) 1 : 0);
        C89393u9 r1 = this.A09;
        if (r1 instanceof C89003tL) {
            C89003tL r12 = (C89003tL) r1;
            parcel.writeFloat(r12.A00);
            parcel.writeFloat(r12.A01);
            parcel.writeFloat(r12.A02);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public PhotoFilter(AnonymousClass0C1 r8, C89403uA r9, Integer num, C89173tm r11) {
        this(r8, r2, num, !C26901Fs.A00(r8, num).A01, C26901Fs.A00(r8, Constants.ZERO).A02, r11);
        C89403uA r2 = r9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        if (r8.A06 == false) goto L_0x0059;
     */
    public PhotoFilter(AnonymousClass0C1 r9, C89403uA r10, Integer num, boolean z, boolean z2, C89173tm r14) {
        super(r9);
        boolean z3;
        this.A0X = new Matrix3();
        Rect rect = null;
        this.A08 = null;
        this.A0Q = false;
        this.A0V = r10.A00;
        List list = r10.A06;
        this.A0Z = list;
        this.A0b = new C89133th[list.size()];
        this.A0Y = r10.A05;
        A0K(100);
        A0O(false);
        A0M(0, Integer.MAX_VALUE, false);
        this.A0c = num;
        this.A09 = C89383u8.A00(r10, r14);
        this.A0a = z;
        this.A0e = z2;
        this.A0W = this.A06 ? new Rect() : rect;
        if (r14 != null) {
            z3 = r14.A00;
        } else {
            z3 = false;
        }
        this.A0d = z3;
        boolean z4 = true;
        boolean z5 = num == Constants.ONE ? false : z5;
        z5 = true;
        this.A0T = z5;
        this.A0P = (num != Constants.ZERO || !((Boolean) AnonymousClass0L6.A02(r9, AnonymousClass0L7.FS_NEW_GALLERY, "gl_blend_tweak_enabled", false, (AnonymousClass04H) null)).booleanValue()) ? false : z4;
        if (this.A09 instanceof C89003tL) {
            AnonymousClass0L7 r3 = AnonymousClass0L7.CAMERA_ANDROID_SUBTLE_FILTER;
            double doubleValue = ((Double) AnonymousClass0L6.A02(r9, r3, "brightness", Double.valueOf(0.02d), (AnonymousClass04H) null)).doubleValue();
            double doubleValue2 = ((Double) AnonymousClass0L6.A02(r9, r3, "contrast", Double.valueOf(0.2d), (AnonymousClass04H) null)).doubleValue();
            double doubleValue3 = ((Double) AnonymousClass0L6.A02(r9, AnonymousClass0L7.CAMERA_ANDROID_SUBTLE_FILTER, "saturation", Double.valueOf(0.05d), (AnonymousClass04H) null)).doubleValue();
            C89003tL r7 = (C89003tL) this.A09;
            r7.A00 = (float) doubleValue;
            r7.A01 = (float) doubleValue2;
            r7.A02 = (float) doubleValue3;
        }
        C89393u9 r0 = this.A09;
        this.A02 = r0;
        if (r0 != null) {
            this.A01 = new C89013tM(this);
        }
    }

    public PhotoFilter(Parcel parcel) {
        super(parcel);
        this.A0X = new Matrix3();
        Rect rect = null;
        this.A08 = null;
        boolean z = false;
        this.A0Q = false;
        this.A0V = parcel.readInt();
        LinkedList linkedList = new LinkedList();
        this.A0Z = linkedList;
        parcel.readTypedList(linkedList, TextureAsset.CREATOR);
        this.A0b = new C89133th[this.A0Z.size()];
        this.A0Y = parcel.readString();
        A0K(parcel.readInt());
        A0J(parcel.readInt());
        A0L(parcel.readInt());
        A0I(parcel.readFloat());
        A0O(parcel.readInt() == 1);
        this.A0Q = parcel.readInt() == 1;
        A0M(parcel.readInt(), parcel.readInt(), parcel.readInt() == 1);
        this.A0c = AnonymousClass4K6.A00(parcel.readString());
        Class<Matrix4> cls = Matrix4.class;
        this.A07 = (Matrix4) parcel.readParcelable(cls.getClassLoader());
        this.A06 = (Matrix4) parcel.readParcelable(cls.getClassLoader());
        this.A0a = parcel.readInt() == 1;
        this.A0e = parcel.readInt() == 1;
        this.A0P = parcel.readInt() == 1;
        this.A0T = parcel.readInt() == 1;
        this.A0d = parcel.readByte() == 1 ? true : z;
        this.A0W = this.A06 ? new Rect() : rect;
        C89403uA A042 = C18550s2.A00().A04(this.A0V);
        if (A042 != null) {
            C89173tm r1 = new C89173tm();
            r1.A00 = this.A0d;
            C89393u9 A002 = C89383u8.A00(A042, r1);
            this.A09 = A002;
            if (A002 instanceof C89003tL) {
                C89003tL r12 = (C89003tL) A002;
                r12.A00 = parcel.readFloat();
                r12.A01 = parcel.readFloat();
                r12.A02 = parcel.readFloat();
            }
        }
        C89393u9 r0 = this.A09;
        this.A02 = r0;
        if (r0 != null) {
            this.A01 = new C89013tM(this);
        }
    }
}
