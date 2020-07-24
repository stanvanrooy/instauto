package com.instagram.reels.p008ui.badge;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C0003R;
import p000X.Constants;
import p000X.C019000b;
import p000X.C249916w;
import p000X.C31791Zy;
import p000X.C43601uh;

/* renamed from: com.instagram.reels.ui.badge.ReelBrandingBadgeView */
public class ReelBrandingBadgeView extends C43601uh {
    public int[] A00;
    public final int[] A01;

    public void setActiveColorState(boolean z) {
        int[] iArr = this.A04;
        int[] iArr2 = this.A00;
        boolean z2 = false;
        if (iArr == iArr2) {
            z2 = true;
        }
        if (z && z2) {
            return;
        }
        if (z || z2) {
            if (!z) {
                iArr2 = this.A01;
            }
            setBackgroundColorGradient(iArr2);
        }
    }

    public static boolean A00(C249916w r2) {
        if (r2.AH7() != Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final void A02(Integer num) {
        int i;
        int i2 = C0003R.style.GradientPatternStyle;
        switch (num.intValue()) {
            case 1:
                i = C0003R.C0004drawable.reel_location_branding_icon;
                break;
            case 2:
                i = C0003R.C0004drawable.reel_hash_branding_icon;
                break;
            case 3:
                i = C0003R.C0004drawable.instagram_trophy_filled_24;
                i2 = C0003R.style.OrangeYellowGradientPatternStyle;
                break;
            case 4:
                i = C0003R.C0004drawable.reel_sticker_branding_icon;
                break;
            case 5:
                i = C0003R.C0004drawable.reel_pbia_branding_icon;
                break;
            case 6:
                i = C0003R.C0004drawable.instagram_shopping_filled_24;
                break;
            case 7:
                i = C0003R.C0004drawable.instagram_story_mention_filled_16;
                break;
            default:
                i = 0;
                break;
        }
        setIconDrawable(i);
        setIconTintColorResource(C0003R.color.white);
        int[] iArr = new int[5];
        C31791Zy.A03(getContext(), (AttributeSet) null, i2, iArr);
        int[] iArr2 = {iArr[1], iArr[3]};
        this.A00 = iArr2;
        setBackgroundColorGradient(iArr2);
    }

    public ReelBrandingBadgeView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ReelBrandingBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReelBrandingBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int A002 = C019000b.A00(getContext(), C0003R.color.grey_3);
        this.A01 = new int[]{A002, A002};
        int[] iArr = new int[5];
        C31791Zy.A03(context, (AttributeSet) null, C0003R.style.GradientPatternStyle, iArr);
        int[] iArr2 = {iArr[1], iArr[3]};
        this.A00 = iArr2;
        setBackgroundColorGradient(iArr2);
        A01((float) getMeasuredWidth(), (float) getMeasuredHeight());
    }
}
