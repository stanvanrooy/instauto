package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.1lb  reason: invalid class name and case insensitive filesystem */
public final class C38641lb {
    public static void A00(AnonymousClass0C1 r3, AnonymousClass1NJ r4, IgProgressImageView igProgressImageView, AnonymousClass0RN r6, Context context) {
        ImageUrl A0S;
        igProgressImageView.setTag(C0003R.C0005id.key_media_id, r4.getId());
        igProgressImageView.clearAnimation();
        igProgressImageView.setMiniPreviewBlurRadius(2);
        igProgressImageView.setMiniPreviewPayload(r4.A26);
        if (r4.AiO() && Build.VERSION.SDK_INT >= 21 && C45521y4.A02(C45521y4.A01(r4, r3))) {
            igProgressImageView.A07(Uri.fromFile(C45521y4.A00(igProgressImageView.getContext(), C45521y4.A01(r4, r3))).toString(), r6.getModuleName(), true);
        } else if (r4.A1M()) {
            igProgressImageView.setUrl(r4.A0E.toString());
        } else {
            boolean z = ((C36991iw) r3.AVA(C36991iw.class, new C37001ix(r3))).A00.getBoolean("low_data_mode_enable", false);
            C38651lc.A00();
            boolean contains = C38651lc.A00.contains(r4.APo());
            if (!z || contains) {
                A0S = r4.A0S(igProgressImageView.getContext());
            } else {
                A0S = r4.A0F();
            }
            igProgressImageView.setUrlWithFallback(A0S, r4.A0F(), r6.getModuleName());
        }
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (!r4.A1a()) {
            return;
        }
        if (r4.A0E() != null) {
            ImageUrl A0E = r4.A0E();
            igProgressImageView.setUrl(A0E.AZc(), r6.getModuleName());
            if (r4.A0g.A00 != null && r4.A0J() != null) {
                AnonymousClass2XS A0J = r4.A0J();
                int i = A0J.A00;
                int i2 = A0J.A01;
                boolean z2 = false;
                if (i > i2) {
                    z2 = true;
                }
                if (z2) {
                    igProgressImageView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass7K6(igProgressImageView, A0E, r4));
                }
            }
        } else if (r4.A0J() != null && r4.A0J().A00()) {
            igProgressImageView.A05.setImageBitmap((Bitmap) null);
            igProgressImageView.setBackgroundColor(C019000b.A00(context, C0003R.color.grey_1));
        }
    }
}
