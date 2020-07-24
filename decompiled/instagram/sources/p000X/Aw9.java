package p000X;

import android.graphics.Bitmap;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Aw9 */
public final class Aw9 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Bitmap A05;
    public final Bitmap A06;
    public final ImageUrl A07;
    public final ImageUrl A08;
    public final C32141af A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public static /* synthetic */ Aw9 A00(Aw9 aw9, boolean z, List list, Bitmap bitmap, boolean z2, boolean z3, C32141af r52, int i) {
        int i2 = i;
        List list2 = list;
        boolean z4 = z;
        Bitmap bitmap2 = bitmap;
        boolean z5 = z2;
        boolean z6 = z3;
        C32141af r26 = r52;
        String str = null;
        ImageUrl imageUrl = null;
        ImageUrl imageUrl2 = null;
        Bitmap bitmap3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Aw9 aw92 = aw9;
        boolean z7 = (i & 1) != 0 ? aw92.A0G : false;
        float f = (i & 2) != 0 ? aw92.A00 : BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if ((i & 4) != 0) {
            z4 = aw92.A0J;
        }
        if ((i & 8) != 0) {
            list2 = aw92.A0E;
        }
        if ((i & 16) != 0) {
            str = aw92.A0D;
        }
        if ((i & 32) != 0) {
            imageUrl = aw92.A07;
        }
        if ((i & 64) != 0) {
            imageUrl2 = aw92.A08;
        }
        if ((i2 & 128) != 0) {
            bitmap2 = aw92.A05;
        }
        if ((i2 & 256) != 0) {
            z5 = aw92.A0I;
        }
        boolean z8 = (i2 & 512) != 0 ? aw92.A0F : false;
        boolean z9 = (i2 & 1024) != 0 ? aw92.A0L : false;
        if ((i2 & 2048) != 0) {
            z6 = aw92.A0N;
        }
        boolean z10 = (i2 & 4096) != 0 ? aw92.A0P : false;
        boolean z11 = (i2 & 8192) != 0 ? aw92.A0O : false;
        boolean z12 = (i2 & DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? aw92.A0H : false;
        boolean z13 = (i & DexStore.LOAD_RESULT_PGO) != 0 ? aw92.A0Q : false;
        boolean z14 = (i & DexStore.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? aw92.A0R : false;
        boolean z15 = (i & DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? aw92.A0M : false;
        if ((i & DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            r26 = aw92.A09;
        }
        boolean z16 = (i & DexStore.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? aw92.A0K : false;
        if ((i & 1048576) != 0) {
            bitmap3 = aw92.A06;
        }
        float f2 = (i & 2097152) != 0 ? aw92.A02 : BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f3 = (i & 4194304) != 0 ? aw92.A03 : BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f4 = (i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? aw92.A04 : BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f5 = (i & 16777216) != 0 ? aw92.A01 : BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if ((i & 33554432) != 0) {
            str2 = aw92.A0C;
        }
        if ((i & 67108864) != 0) {
            str3 = aw92.A0B;
        }
        if ((i & 134217728) != 0) {
            str4 = aw92.A0A;
        }
        C13150hy.A02(list2, AppStateModule.APP_STATE_BACKGROUND);
        C32141af r14 = r26;
        C13150hy.A02(r14, "videoIconState");
        return new Aw9(z7, f, z4, list2, str, imageUrl, imageUrl2, bitmap2, z5, z8, z9, z6, z10, z11, z12, z13, z14, z15, r14, z16, bitmap3, f2, f3, f4, f5, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aw9)) {
            return false;
        }
        Aw9 aw9 = (Aw9) obj;
        return this.A0G == aw9.A0G && Float.compare(this.A00, aw9.A00) == 0 && this.A0J == aw9.A0J && C13150hy.A05(this.A0E, aw9.A0E) && C13150hy.A05(this.A0D, aw9.A0D) && C13150hy.A05(this.A07, aw9.A07) && C13150hy.A05(this.A08, aw9.A08) && C13150hy.A05(this.A05, aw9.A05) && this.A0I == aw9.A0I && this.A0F == aw9.A0F && this.A0L == aw9.A0L && this.A0N == aw9.A0N && this.A0P == aw9.A0P && this.A0O == aw9.A0O && this.A0H == aw9.A0H && this.A0Q == aw9.A0Q && this.A0R == aw9.A0R && this.A0M == aw9.A0M && C13150hy.A05(this.A09, aw9.A09) && this.A0K == aw9.A0K && C13150hy.A05(this.A06, aw9.A06) && Float.compare(this.A02, aw9.A02) == 0 && Float.compare(this.A03, aw9.A03) == 0 && Float.compare(this.A04, aw9.A04) == 0 && Float.compare(this.A01, aw9.A01) == 0 && C13150hy.A05(this.A0C, aw9.A0C) && C13150hy.A05(this.A0B, aw9.A0B) && C13150hy.A05(this.A0A, aw9.A0A);
    }

    public final int hashCode() {
        boolean z = this.A0G;
        int i = 1;
        if (z) {
            z = true;
        }
        int floatToIntBits = (((z ? 1 : 0) * true) + Float.floatToIntBits(this.A00)) * 31;
        boolean z2 = this.A0J;
        if (z2) {
            z2 = true;
        }
        int i2 = (floatToIntBits + (z2 ? 1 : 0)) * 31;
        List list = this.A0E;
        int i3 = 0;
        int hashCode = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.A0D;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ImageUrl imageUrl = this.A07;
        int hashCode3 = (hashCode2 + (imageUrl != null ? imageUrl.hashCode() : 0)) * 31;
        ImageUrl imageUrl2 = this.A08;
        int hashCode4 = (hashCode3 + (imageUrl2 != null ? imageUrl2.hashCode() : 0)) * 31;
        Bitmap bitmap = this.A05;
        int hashCode5 = (hashCode4 + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        boolean z3 = this.A0I;
        if (z3) {
            z3 = true;
        }
        int i4 = (hashCode5 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A0F;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A0L;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.A0N;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.A0P;
        if (z7) {
            z7 = true;
        }
        int i8 = (i7 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.A0O;
        if (z8) {
            z8 = true;
        }
        int i9 = (i8 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.A0H;
        if (z9) {
            z9 = true;
        }
        int i10 = (i9 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.A0Q;
        if (z10) {
            z10 = true;
        }
        int i11 = (i10 + (z10 ? 1 : 0)) * 31;
        boolean z11 = this.A0R;
        if (z11) {
            z11 = true;
        }
        int i12 = (i11 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.A0M;
        if (z12) {
            z12 = true;
        }
        int i13 = (i12 + (z12 ? 1 : 0)) * 31;
        C32141af r0 = this.A09;
        int hashCode6 = (i13 + (r0 != null ? r0.hashCode() : 0)) * 31;
        if (!this.A0K) {
            i = 0;
        }
        int i14 = (hashCode6 + i) * 31;
        Bitmap bitmap2 = this.A06;
        int hashCode7 = (((((((((i14 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A01)) * 31;
        String str2 = this.A0C;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A0B;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.A0A;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return hashCode9 + i3;
    }

    public final String toString() {
        return "RtcCoWatchPlaybackViewModel(show=" + this.A0G + ", aspectRatio=" + this.A00 + ", showControls=" + this.A0J + ", background=" + this.A0E + AnonymousClass40t.$const$string(1) + this.A0D + ", avatarUrl=" + this.A07 + ", coverImageUrl=" + this.A08 + ", coverImageBitmap=" + this.A05 + ", showAudioOn=" + this.A0I + ", enableLoadingIndicator=" + this.A0F + ", showMediaStateIndicator=" + this.A0L + ", showPaused=" + this.A0N + ", showPlaceholder=" + this.A0P + ", showPendingUploadText=" + this.A0O + ", showAudioButton=" + this.A0H + ", showVideoControls=" + this.A0Q + ", showVideoControlsAtTop=" + this.A0R + ", showOptionsButton=" + this.A0M + ", videoIconState=" + this.A09 + ", showFromGallerySource=" + this.A0K + ", pendingCoverImage=" + this.A06 + ", insetLeftPercent=" + this.A02 + ", insetRightPercent=" + this.A03 + ", insetTopPercent=" + this.A04 + ", insetBottomPercent=" + this.A01 + ", placeholderTitle=" + this.A0C + ", placeholderSubtitle=" + this.A0B + ", pendingUploadText=" + this.A0A + ")";
    }

    public Aw9(boolean z, float f, boolean z2, List list, String str, ImageUrl imageUrl, ImageUrl imageUrl2, Bitmap bitmap, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, C32141af r21, boolean z13, Bitmap bitmap2, float f2, float f3, float f4, float f5, String str2, String str3, String str4) {
        C13150hy.A02(list, AppStateModule.APP_STATE_BACKGROUND);
        C32141af r1 = r21;
        C13150hy.A02(r1, "videoIconState");
        this.A0G = z;
        this.A00 = f;
        this.A0J = z2;
        this.A0E = list;
        this.A0D = str;
        this.A07 = imageUrl;
        this.A08 = imageUrl2;
        this.A05 = bitmap;
        this.A0I = z3;
        this.A0F = z4;
        this.A0L = z5;
        this.A0N = z6;
        this.A0P = z7;
        this.A0O = z8;
        this.A0H = z9;
        this.A0Q = z10;
        this.A0R = z11;
        this.A0M = z12;
        this.A09 = r1;
        this.A0K = z13;
        this.A06 = bitmap2;
        this.A02 = f2;
        this.A03 = f3;
        this.A04 = f4;
        this.A01 = f5;
        this.A0C = str2;
        this.A0B = str3;
        this.A0A = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (r8 >= 0.8f) goto L_0x00c3;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ Aw9(boolean z, float f, boolean z2, List list, String str, ImageUrl imageUrl, ImageUrl imageUrl2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, C32141af r51, boolean z11, Bitmap bitmap, String str2, String str3, String str4, int i) {
        this(z, r8, r9, r10, r11, r12, r13, r14, false, r16, r17, false, r19, r20, r21, r22, r23, r24, r25, r26, r5, r28, r29, r30, r31, (i & 33554432) != 0 ? null : r4, (i & 67108864) != 0 ? null : r3, (i & 134217728) != 0 ? null : r2);
        float f2;
        String str5 = str4;
        int i2 = i;
        String str6 = str3;
        String str7 = str2;
        Bitmap bitmap2 = bitmap;
        ImageUrl imageUrl3 = imageUrl2;
        ImageUrl imageUrl4 = imageUrl;
        String str8 = str;
        List list2 = list;
        boolean z12 = z2;
        boolean z13 = z4;
        boolean z14 = z5;
        boolean z15 = z6;
        boolean z16 = z7;
        boolean z17 = z8;
        boolean z18 = z9;
        boolean z19 = z3;
        C32141af r25 = r51;
        boolean z20 = z10;
        boolean z21 = z11;
        Bitmap bitmap3 = null;
        float f3 = (i & 2) != 0 ? 1.0f : f;
        z12 = (i & 4) != 0 ? true : z12;
        list2 = (i & 8) != 0 ? AnonymousClass10M.A06(-16777216) : list2;
        str8 = (i & 16) != 0 ? null : str8;
        imageUrl4 = (i & 32) != 0 ? null : imageUrl4;
        imageUrl3 = (i & 64) != 0 ? null : imageUrl3;
        bitmap3 = (i2 & 128) != 0 ? null : bitmap3;
        z19 = (i2 & 512) != 0 ? false : z19;
        z13 = (i2 & 1024) != 0 ? false : z13;
        z14 = (i2 & 4096) != 0 ? false : z14;
        z15 = (i2 & 8192) != 0 ? false : z15;
        z16 = (i2 & DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? false : z16;
        z17 = (i & DexStore.LOAD_RESULT_PGO) != 0 ? false : z17;
        z18 = (i & DexStore.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? false : z18;
        z20 = (i & DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? false : z20;
        r25 = (i & DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 ? C32141af.HIDDEN : r25;
        z21 = (i & DexStore.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? false : z21;
        bitmap2 = (i & 1048576) != 0 ? null : bitmap2;
        int i3 = i & 2097152;
        float f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f5 = i3 != 0 ? 0.07f : f5;
        f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        int i4 = i & 4194304;
        float f6 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (i4 != 0) {
            f6 = 1.0f;
            if (f3 < 0.8f) {
                f6 = 0.93f;
            }
        }
        if ((i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 && f3 < 0.8f) {
            f4 = 0.05f;
        }
        if ((i & 16777216) != 0) {
            f2 = 1.0f;
            if (f3 < 0.8f) {
                f2 = 0.92f;
            }
        } else {
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
    }
}
