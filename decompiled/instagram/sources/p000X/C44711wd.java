package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1wd  reason: invalid class name and case insensitive filesystem */
public final class C44711wd extends C35981hF {
    public final int[] A00;

    public final String A02() {
        return "close_friends";
    }

    public final float[] A03() {
        return new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f};
    }

    public final C36001hH A00() {
        C36001hH r1 = new C36001hH();
        r1.A00 = 1.0f;
        r1.A01 = 1.0f;
        return r1;
    }

    public final C36001hH A01() {
        C36001hH r1 = new C36001hH();
        r1.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        r1.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        return r1;
    }

    public final int[] A04() {
        return this.A00;
    }

    public C44711wd() {
        Context context = StoredPreferences.A00;
        this.A00 = new int[]{C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.closeFriendsGradientStartColor)), C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.closeFriendsGradientEndColor))};
    }
}
