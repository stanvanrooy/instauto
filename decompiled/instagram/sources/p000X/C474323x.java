package p000X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.23x  reason: invalid class name and case insensitive filesystem */
public final class C474323x {
    public static ColorStateList A00(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof C34351eb) {
            return ((C34351eb) imageView).getSupportImageTintList();
        }
        return null;
    }

    public static PorterDuff.Mode A01(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof C34351eb) {
            return ((C34351eb) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void A02(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintList(colorStateList);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C34351eb) {
            ((C34351eb) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static void A03(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintMode(mode);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C34351eb) {
            ((C34351eb) imageView).setSupportImageTintMode(mode);
        }
    }
}
