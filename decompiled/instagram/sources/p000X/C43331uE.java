package p000X;

import android.graphics.PointF;

/* renamed from: X.1uE  reason: invalid class name and case insensitive filesystem */
public final class C43331uE {
    public static C43341uF parseFromJson(C13080hr r4) {
        C43341uF r3 = new C43341uF();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("filter_type".equals(A0i)) {
                r3.A0P = Integer.valueOf(r4.A0I());
            } else if ("filter_strength".equals(A0i)) {
                r3.A07 = new Float(r4.A0H());
            } else if ("border_enabled".equals(A0i)) {
                r3.A0N = Integer.valueOf(r4.A0I());
            } else if ("lux".equals(A0i)) {
                r3.A09 = new Float(r4.A0H());
            } else if ("structure".equals(A0i)) {
                r3.A0G = new Float(r4.A0H());
            } else if ("brightness".equals(A0i)) {
                r3.A03 = new Float(r4.A0H());
            } else if ("contrast".equals(A0i)) {
                r3.A04 = new Float(r4.A0H());
            } else if ("temperature".equals(A0i)) {
                r3.A0H = new Float(r4.A0H());
            } else if ("saturation".equals(A0i)) {
                r3.A0D = new Float(r4.A0H());
            } else if ("highlights".equals(A0i)) {
                r3.A08 = new Float(r4.A0H());
            } else if ("shadows".equals(A0i)) {
                r3.A0E = new Float(r4.A0H());
            } else if ("vignette".equals(A0i)) {
                r3.A0M = new Float(r4.A0H());
            } else if ("fade".equals(A0i)) {
                r3.A06 = new Float(r4.A0H());
            } else if ("tintShadows".equals(A0i)) {
                r3.A0L = new Float(r4.A0H());
            } else if ("tintHighlights".equals(A0i)) {
                r3.A0K = new Float(r4.A0H());
            } else if ("tintShadowsColor".equals(A0i)) {
                r3.A0S = Integer.valueOf(r4.A0I());
            } else if ("tintHighlightsColor".equals(A0i)) {
                r3.A0R = Integer.valueOf(r4.A0I());
            } else if ("sharpen".equals(A0i)) {
                r3.A0F = new Float(r4.A0H());
            } else if ("tiltshift_type".equals(A0i)) {
                r3.A0Q = Integer.valueOf(r4.A0I());
            } else if ("tiltshift_center".equals(A0i)) {
                r3.A02 = AnonymousClass1XZ.A00(r4);
            } else if ("tiltshift_radius".equals(A0i)) {
                r3.A0J = new Float(r4.A0H());
            } else if ("tiltshift_angle".equals(A0i)) {
                r3.A0I = new Float(r4.A0H());
            } else if ("crop_original_size".equals(A0i)) {
                r3.A01 = AnonymousClass1XZ.A00(r4);
            } else if ("crop_center".equals(A0i)) {
                r3.A00 = AnonymousClass1XZ.A00(r4);
            } else if ("crop_zoom".equals(A0i)) {
                r3.A05 = new Float(r4.A0H());
            } else if ("crop_orientation_angle".equals(A0i)) {
                r3.A0O = Integer.valueOf(r4.A0I());
            } else if ("perspective_rotation_x".equals(A0i)) {
                r3.A0A = new Float(r4.A0H());
            } else if ("perspective_rotation_y".equals(A0i)) {
                r3.A0B = new Float(r4.A0H());
            } else if ("perspective_rotation_z".equals(A0i)) {
                r3.A0C = new Float(r4.A0H());
            }
            r4.A0f();
        }
        return r3;
    }

    public static void A00(C13460iZ r2, C43341uF r3) {
        r2.A0T();
        Integer num = r3.A0P;
        if (num != null) {
            r2.A0F("filter_type", num.intValue());
        }
        Float f = r3.A07;
        if (f != null) {
            r2.A0E("filter_strength", f.floatValue());
        }
        Integer num2 = r3.A0N;
        if (num2 != null) {
            r2.A0F("border_enabled", num2.intValue());
        }
        Float f2 = r3.A09;
        if (f2 != null) {
            r2.A0E("lux", f2.floatValue());
        }
        Float f3 = r3.A0G;
        if (f3 != null) {
            r2.A0E("structure", f3.floatValue());
        }
        Float f4 = r3.A03;
        if (f4 != null) {
            r2.A0E("brightness", f4.floatValue());
        }
        Float f5 = r3.A04;
        if (f5 != null) {
            r2.A0E("contrast", f5.floatValue());
        }
        Float f6 = r3.A0H;
        if (f6 != null) {
            r2.A0E("temperature", f6.floatValue());
        }
        Float f7 = r3.A0D;
        if (f7 != null) {
            r2.A0E("saturation", f7.floatValue());
        }
        Float f8 = r3.A08;
        if (f8 != null) {
            r2.A0E("highlights", f8.floatValue());
        }
        Float f9 = r3.A0E;
        if (f9 != null) {
            r2.A0E("shadows", f9.floatValue());
        }
        Float f10 = r3.A0M;
        if (f10 != null) {
            r2.A0E("vignette", f10.floatValue());
        }
        Float f11 = r3.A06;
        if (f11 != null) {
            r2.A0E("fade", f11.floatValue());
        }
        Float f12 = r3.A0L;
        if (f12 != null) {
            r2.A0E("tintShadows", f12.floatValue());
        }
        Float f13 = r3.A0K;
        if (f13 != null) {
            r2.A0E("tintHighlights", f13.floatValue());
        }
        Integer num3 = r3.A0S;
        if (num3 != null) {
            r2.A0F("tintShadowsColor", num3.intValue());
        }
        Integer num4 = r3.A0R;
        if (num4 != null) {
            r2.A0F("tintHighlightsColor", num4.intValue());
        }
        Float f14 = r3.A0F;
        if (f14 != null) {
            r2.A0E("sharpen", f14.floatValue());
        }
        Integer num5 = r3.A0Q;
        if (num5 != null) {
            r2.A0F("tiltshift_type", num5.intValue());
        }
        PointF pointF = r3.A02;
        if (pointF != null) {
            AnonymousClass1XZ.A01(r2, "tiltshift_center", pointF);
        }
        Float f15 = r3.A0J;
        if (f15 != null) {
            r2.A0E("tiltshift_radius", f15.floatValue());
        }
        Float f16 = r3.A0I;
        if (f16 != null) {
            r2.A0E("tiltshift_angle", f16.floatValue());
        }
        PointF pointF2 = r3.A01;
        if (pointF2 != null) {
            AnonymousClass1XZ.A01(r2, "crop_original_size", pointF2);
        }
        PointF pointF3 = r3.A00;
        if (pointF3 != null) {
            AnonymousClass1XZ.A01(r2, "crop_center", pointF3);
        }
        Float f17 = r3.A05;
        if (f17 != null) {
            r2.A0E("crop_zoom", f17.floatValue());
        }
        Integer num6 = r3.A0O;
        if (num6 != null) {
            r2.A0F("crop_orientation_angle", num6.intValue());
        }
        Float f18 = r3.A0A;
        if (f18 != null) {
            r2.A0E("perspective_rotation_x", f18.floatValue());
        }
        Float f19 = r3.A0B;
        if (f19 != null) {
            r2.A0E("perspective_rotation_y", f19.floatValue());
        }
        Float f20 = r3.A0C;
        if (f20 != null) {
            r2.A0E("perspective_rotation_z", f20.floatValue());
        }
        r2.A0Q();
    }
}
