package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.1hE  reason: invalid class name and case insensitive filesystem */
public final class C35971hE extends C35981hF {
    public final int[] A00;

    public final String A02() {
        return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    }

    public final float[] A03() {
        return new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.27f, 0.51f, 0.75f, 1.0f};
    }

    public final C36001hH A00() {
        C36001hH r1 = new C36001hH();
        r1.A00 = 0.78195995f;
        r1.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        return r1;
    }

    public final C36001hH A01() {
        C36001hH r1 = new C36001hH();
        r1.A00 = 0.19269334f;
        r1.A01 = 1.0f;
        return r1;
    }

    public final int[] A04() {
        return this.A00;
    }

    public C35971hE() {
        Context context = StoredPreferences.A00;
        this.A00 = new int[]{C019000b.A00(context, C0003R.color.igds_gradient_yellow), C019000b.A00(context, C0003R.color.igds_gradient_orange), C019000b.A00(context, C0003R.color.igds_gradient_red), C019000b.A00(context, C0003R.color.igds_gradient_pink), C019000b.A00(context, C0003R.color.igds_gradient_purple)};
    }
}
