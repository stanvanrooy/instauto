package p000X;

import com.instagram.model.mediatype.MediaType;

/* renamed from: X.0v7  reason: invalid class name and case insensitive filesystem */
public final class C20450v7 implements C17120pi {
    public final void BfU(C13460iZ r4, Object obj) {
        C20440v6 r5 = (C20440v6) obj;
        r4.A0T();
        if (r5.A00 != null) {
            r4.A0d("direct_pending_media");
            C98724Oo r2 = r5.A00;
            r4.A0T();
            MediaType mediaType = r2.A02;
            if (mediaType != null) {
                r4.A0H("mediaType", AnonymousClass4S8.A01(mediaType));
            }
            String str = r2.A05;
            if (str != null) {
                r4.A0H("photo_path", str);
            }
            String str2 = r2.A07;
            if (str2 != null) {
                r4.A0H("video_path", str2);
            }
            r4.A0E("aspectPostCrop", r2.A00);
            if (r2.A09 != null) {
                r4.A0d("tap_models");
                r4.A0S();
                for (C34151eA r0 : r2.A09) {
                    if (r0 != null) {
                        C34141e9.A00(r4, r0);
                    }
                }
                r4.A0P();
            }
            r4.A0I("is_awaiting_burn_in", r2.A0A);
            String str3 = r2.A08;
            if (str3 != null) {
                r4.A0H("view_mode", str3);
            }
            if (r2.A03 != null) {
                r4.A0d("pending_media");
                C42271s4.A01(r4, r2.A03);
            }
            String str4 = r2.A04;
            if (str4 != null) {
                r4.A0H("pending_media_key", str4);
            }
            String str5 = r2.A06;
            if (str5 != null) {
                r4.A0H("txnId", str5);
            }
            if (r2.A01 != null) {
                r4.A0d("publish_token");
                AnonymousClass4QB.A00(r4, r2.A01);
            }
            r4.A0Q();
        }
        if (r5.A02 != null) {
            r4.A0d("media_share_params");
            C160426st.A00(r4, r5.A02);
        }
        if (r5.A01 != null) {
            r4.A0d("story_share_params");
            C185737wb.A00(r4, r5.A01);
        }
        String str6 = r5.A05;
        if (str6 != null) {
            r4.A0H("view_mode", str6);
        }
        String str7 = r5.A03;
        if (str7 != null) {
            r4.A0H("reply_type", str7);
        }
        String str8 = r5.A04;
        if (str8 != null) {
            r4.A0H("source_media_id", str8);
        }
        AnonymousClass4RD.A00(r4, r5);
        r4.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C100024Ty.parseFromJson(r2);
    }
}
