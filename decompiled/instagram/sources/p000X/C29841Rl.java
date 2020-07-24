package p000X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.1Rl  reason: invalid class name and case insensitive filesystem */
public final class C29841Rl {
    public static VideoUrlImpl parseFromJson(C13080hr r4) {
        VideoUrlImpl videoUrlImpl = new VideoUrlImpl();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if (IgReactNavigatorModule.URL.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                videoUrlImpl.A05 = str;
            } else if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                videoUrlImpl.A04 = str;
            } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0i)) {
                videoUrlImpl.A02 = r4.A0I();
            } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0i)) {
                videoUrlImpl.A00 = r4.A0I();
            } else if ("type".equals(A0i)) {
                videoUrlImpl.A01 = r4.A0I();
            } else if (TraceFieldType.BandwidthKbps.equals(A0i)) {
                videoUrlImpl.A03 = Integer.valueOf(r4.A0I());
            }
            r4.A0f();
        }
        return videoUrlImpl;
    }

    public static void A00(C13460iZ r2, VideoUrlImpl videoUrlImpl) {
        r2.A0T();
        String str = videoUrlImpl.A05;
        if (str != null) {
            r2.A0H(IgReactNavigatorModule.URL, str);
        }
        String str2 = videoUrlImpl.A04;
        if (str2 != null) {
            r2.A0H("id", str2);
        }
        r2.A0F(IgReactMediaPickerNativeModule.WIDTH, videoUrlImpl.A02);
        r2.A0F(IgReactMediaPickerNativeModule.HEIGHT, videoUrlImpl.A00);
        r2.A0F("type", videoUrlImpl.A01);
        Integer num = videoUrlImpl.A03;
        if (num != null) {
            r2.A0F(TraceFieldType.BandwidthKbps, num.intValue());
        }
        r2.A0Q();
    }
}
