package p000X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.1lo  reason: invalid class name and case insensitive filesystem */
public final class C38771lo {
    public static void A00(View view, AnonymousClass1NJ r9, String str, int i, int i2) {
        int i3;
        Object[] objArr;
        int i4;
        Resources resources = view.getResources();
        String str2 = r9.A1c;
        if (r9.AiO()) {
            i4 = C0003R.string.carousel_video_n_of_n;
            if (str2 != null) {
                i3 = C0003R.string.carousel_video_n_of_n_with_alt_text;
            }
            objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str};
            view.setContentDescription(resources.getString(i3, objArr));
        }
        i4 = C0003R.string.carousel_photo_n_of_n;
        if (str2 != null) {
            i3 = C0003R.string.carousel_photo_n_of_n_with_alt_text;
        }
        objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str};
        view.setContentDescription(resources.getString(i3, objArr));
        objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2};
        view.setContentDescription(resources.getString(i3, objArr));
    }

    public static void A01(AnonymousClass0C1 r8, View view, AnonymousClass1NJ r10) {
        int i;
        Object[] objArr;
        int i2;
        Resources resources = view.getResources();
        String A0B = r10.A0c(r8).A0B();
        String str = r10.A1c;
        if (r10.A1a()) {
            i2 = C0003R.string.igtv_video_description;
            if (str != null) {
                i = C0003R.string.igtv_video_description_with_alt_text;
            }
            objArr = new Object[]{A0B};
            view.setContentDescription(resources.getString(i, objArr));
        } else if (r10.AiO()) {
            i2 = C0003R.string.video_description;
            if (str != null) {
                i = C0003R.string.video_description_with_alt_text;
            }
            objArr = new Object[]{A0B};
            view.setContentDescription(resources.getString(i, objArr));
        } else {
            i2 = C0003R.string.image_description;
            if (str != null) {
                i = C0003R.string.image_description_with_alt_text;
            }
            objArr = new Object[]{A0B};
            view.setContentDescription(resources.getString(i, objArr));
        }
        objArr = new Object[]{A0B, str};
        view.setContentDescription(resources.getString(i, objArr));
    }

    public static void A02(AnonymousClass0C1 r8, View view, AnonymousClass1NJ r10, int i) {
        int i2;
        Object[] objArr;
        int i3;
        Resources resources = view.getResources();
        String A0B = r10.A0c(r8).A0B();
        String str = r10.A1c;
        if (r10.A1a()) {
            i3 = C0003R.string.list_igtv_video_description;
            if (str != null) {
                i2 = C0003R.string.list_igtv_video_description_with_alt_text;
            }
            objArr = new Object[]{A0B, Integer.valueOf(i + 1)};
            view.setContentDescription(resources.getString(i2, objArr));
        } else if (r10.AiO()) {
            i3 = C0003R.string.list_video_description;
            if (str != null) {
                i2 = C0003R.string.list_video_description_with_alt_text;
            }
            objArr = new Object[]{A0B, Integer.valueOf(i + 1)};
            view.setContentDescription(resources.getString(i2, objArr));
        } else {
            i3 = C0003R.string.list_photo_description;
            if (str != null) {
                i2 = C0003R.string.list_photo_description_with_aat;
            }
            objArr = new Object[]{A0B, Integer.valueOf(i + 1)};
            view.setContentDescription(resources.getString(i2, objArr));
        }
        objArr = new Object[]{A0B, str, Integer.valueOf(i + 1)};
        view.setContentDescription(resources.getString(i2, objArr));
    }
}
