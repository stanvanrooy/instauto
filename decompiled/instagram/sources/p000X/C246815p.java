package p000X;

/* renamed from: X.15p  reason: invalid class name and case insensitive filesystem */
public final class C246815p implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C246715o r4 = (C246715o) obj;
        r3.A0T();
        String str = r4.A05;
        if (str != null) {
            r3.A0H("face_effect_id", str);
        }
        r3.A0I("needs_landscape_transform", r4.A09);
        if (r4.A00 != null) {
            r3.A0d("background_gradient_colors");
            C06020Nk.A00(r3, r4.A00);
        }
        String str2 = r4.A03;
        if (str2 != null) {
            r3.A0H("background_image_file", str2);
        }
        if (r4.A01 != null) {
            r3.A0d("audio_mix");
            C52202Nw.A00(r3, r4.A01);
        }
        String str3 = r4.A06;
        if (str3 != null) {
            r3.A0H("post_capture_ar_effect_id", str3);
        }
        if (r4.A08 != null) {
            r3.A0d("vertex_transform_params");
            r3.A0S();
            for (C43391uK r0 : r4.A08) {
                if (r0 != null) {
                    C43381uJ.A00(r3, r0);
                }
            }
            r3.A0P();
        }
        String str4 = r4.A04;
        if (str4 != null) {
            r3.A0H("decor_image_file_path", str4);
        }
        if (r4.A07 != null) {
            r3.A0d("reel_image_regions");
            r3.A0S();
            for (AnonymousClass206 r02 : r4.A07) {
                if (r02 != null) {
                    AnonymousClass205.A00(r3, r02);
                }
            }
            r3.A0P();
        }
        if (r4.A02 != null) {
            r3.A0d("video_filter");
            C42441sM.A00(r3, r4.A02);
        }
        r3.A0I("should_render_dynamic_drawables_first", r4.A0A);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C107344jz.parseFromJson(r2);
    }
}
