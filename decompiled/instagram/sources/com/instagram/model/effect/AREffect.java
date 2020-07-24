package com.instagram.model.effect;

import android.os.Parcelable;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ThumbnailImage;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass1NN;

public abstract class AREffect implements Parcelable, AnonymousClass1NN {
    public ImageUrl A02() {
        return !(this instanceof AttributedAREffect) ? ((CameraAREffect) this).A05 : ((AttributedAREffect) this).A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = (r0 = r0.A00.A01.A00).A00;
     */
    public ImageUrl A03() {
        ThumbnailImage thumbnailImage;
        ImageUrl imageUrl;
        if (!(this instanceof AttributedAREffect)) {
            return ((CameraAREffect) this).A06;
        }
        AttributedAREffect attributedAREffect = (AttributedAREffect) this;
        ProductAREffectContainer productAREffectContainer = attributedAREffect.A04;
        return (productAREffectContainer == null || thumbnailImage == null || imageUrl == null) ? attributedAREffect.A02 : imageUrl;
    }

    public String A04() {
        return !(this instanceof AttributedAREffect) ? ((CameraAREffect) this).A09 : ((AttributedAREffect) this).A06;
    }

    public String A05() {
        if (!(this instanceof AttributedAREffect)) {
            return ((CameraAREffect) this).A0B;
        }
        return null;
    }

    public String A06() {
        if (!(this instanceof AttributedAREffect)) {
            return ((CameraAREffect) this).A0L;
        }
        AttributedAREffect attributedAREffect = (AttributedAREffect) this;
        ProductAREffectContainer productAREffectContainer = attributedAREffect.A04;
        return productAREffectContainer != null ? productAREffectContainer.A00.A00.A0I : attributedAREffect.A09;
    }

    public String A07() {
        if (!(this instanceof AttributedAREffect)) {
            return ((CameraAREffect) this).A0H;
        }
        return null;
    }

    public List A08() {
        return !(this instanceof AttributedAREffect) ? ((CameraAREffect) this).A0O : ((AttributedAREffect) this).A0D;
    }

    public List A09() {
        return !(this instanceof AttributedAREffect) ? ((CameraAREffect) this).A0P : ((AttributedAREffect) this).A0F;
    }

    public boolean A0A() {
        if (!(this instanceof AttributedAREffect)) {
            return ((CameraAREffect) this).A0V;
        }
        return false;
    }

    public boolean A0B() {
        if (!(this instanceof AttributedAREffect)) {
            return ((CameraAREffect) this).A0X;
        }
        return false;
    }

    public Integer AV3() {
        return !(this instanceof AttributedAREffect) ? ((CameraAREffect) this).A02 == 1 ? Constants.ZERO : Constants.ONE : ((AttributedAREffect) this).A05;
    }

    public String getId() {
        return !(this instanceof AttributedAREffect) ? ((CameraAREffect) this).A0F : ((AttributedAREffect) this).A08;
    }
}
