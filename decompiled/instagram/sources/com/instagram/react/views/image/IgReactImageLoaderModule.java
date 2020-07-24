package com.instagram.react.views.image;

import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass1GH;
import p000X.C206648tr;
import p000X.C2102594w;
import p000X.C23043A0y;

@ReactModule(name = "ImageLoader")
public class IgReactImageLoaderModule extends NativeImageLoaderAndroidSpec {
    public static final String ERROR_INVALID_URI = "E_INVALID_URI";
    public static final String MODULE_NAME = "ImageLoader";

    public void abortRequest(double d) {
    }

    public String getName() {
        return MODULE_NAME;
    }

    public void getSizeWithHeaders(String str, C23043A0y a0y, C2102594w r3) {
    }

    public void prefetchImage(String str, double d, C2102594w r4) {
    }

    public void queryCache(A1e a1e, C2102594w r2) {
    }

    public void getSize(String str, C2102594w r4) {
        if (TextUtils.isEmpty(str)) {
            r4.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        AnonymousClass1GH A0C = AnonymousClass12C.A0c.A0C(new SimpleImageUrl(str));
        A0C.A0G = false;
        A0C.A02(new C206648tr(this, r4));
        A0C.A00().A04();
    }

    public IgReactImageLoaderModule(A44 a44) {
        super(a44);
    }
}
