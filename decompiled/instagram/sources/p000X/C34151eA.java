package p000X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.guides.intf.model.MinimalGuide;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.shopping.Product;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.reels.events.model.EventStickerModel;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.1eA  reason: invalid class name and case insensitive filesystem */
public final class C34151eA implements C34161eB {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public AnonymousClass2DG A07;
    public AnonymousClass2DG A08;
    public C51282Jz A09;
    public C51282Jz A0A;
    public C49422Cb A0B;
    public MinimalGuide A0C;
    public C1894087d A0D;
    public Hashtag A0E;
    public AnonymousClass1YR A0F;
    public C173397ay A0G;
    public C173387ax A0H;
    public Venue A0I;
    public C34561ew A0J;
    public C171577Vd A0K;
    public AnonymousClass24Q A0L;
    public C169647Nb A0M;
    public EventStickerModel A0N;
    public AnonymousClass7VB A0O;
    public AnonymousClass7N0 A0P;
    public C34181eD A0Q;
    public C34261eN A0R;
    public AnonymousClass7PX A0S;
    public C44751wh A0T;
    public AnonymousClass2ET A0U;
    public AnonymousClass23T A0V;
    public AnonymousClass7VG A0W;
    public C13300iJ A0X;
    public AnonymousClass23f A0Y;
    public AnonymousClass23f A0Z;
    public AnonymousClass23f A0a;
    public AnonymousClass23f A0b;
    public Integer A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m = "view";
    public String A0n;
    public String A0o = "";
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C34151eA r5 = (C34151eA) obj;
            if (Float.compare(r5.A03, this.A03) != 0 || Float.compare(r5.A04, this.A04) != 0 || this.A06 != r5.A06 || this.A0q != r5.A0q || Float.compare(r5.A02, this.A02) != 0 || Float.compare(r5.A00, this.A00) != 0 || Float.compare(r5.A01, this.A01) != 0 || this.A0s != r5.A0s || this.A0t != r5.A0t || this.A0r != r5.A0r || this.A0Q != r5.A0Q || this.A05 != r5.A05 || !Objects.equals(this.A0X, r5.A0X) || !Objects.equals(this.A0I, r5.A0I) || !Objects.equals(this.A0E, r5.A0E) || !Objects.equals(this.A0H, r5.A0H) || !Objects.equals(this.A0G, r5.A0G) || !Objects.equals(this.A0K, r5.A0K) || !Objects.equals(this.A0L, r5.A0L) || !Objects.equals(this.A0M, r5.A0M) || !Objects.equals(this.A0O, r5.A0O) || !Objects.equals(this.A0R, r5.A0R) || !Objects.equals(this.A0c, r5.A0c) || !Objects.equals(this.A0T, r5.A0T) || !Objects.equals(this.A0S, r5.A0S) || !Objects.equals(this.A0U, r5.A0U) || !Objects.equals(this.A0V, r5.A0V) || !Objects.equals(this.A0N, r5.A0N) || !Objects.equals(this.A0J, r5.A0J) || !Objects.equals(this.A0D, r5.A0D) || !Objects.equals(this.A0i, r5.A0i) || !Objects.equals(this.A0j, r5.A0j) || !Objects.equals(this.A0e, r5.A0e) || !Objects.equals(this.A0k, r5.A0k) || this.A0F != r5.A0F || !Objects.equals(this.A0d, r5.A0d) || !Objects.equals(this.A0g, r5.A0g) || !Objects.equals(this.A0n, r5.A0n) || !Objects.equals(this.A0h, r5.A0h) || !Objects.equals(this.A0Y, r5.A0Y) || !Objects.equals(this.A0Z, r5.A0Z) || !Objects.equals(this.A0a, r5.A0a) || !Objects.equals(this.A0b, r5.A0b) || !Objects.equals(this.A0C, r5.A0C) || !Objects.equals(this.A0o, r5.A0o)) {
                return false;
            }
        }
        return true;
    }

    public static String A00(List list) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A052 = C12890hY.A00.A05(stringWriter);
        A052.A0S();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A02((C34151eA) it.next(), A052);
        }
        A052.A0P();
        A052.close();
        return stringWriter.toString();
    }

    public static void A01(C34151eA r2) {
        if (r2.A0H == null) {
            C173387ax r1 = new C173387ax();
            r2.A0H = r1;
            r1.A02 = r2.A0j;
            C13300iJ r0 = r2.A0X;
            if (r0 != null) {
                r1.A04 = r0.getId();
            }
        }
    }

    public final Product A03() {
        return this.A0H.A00;
    }

    public final Product A04() {
        C173397ay r0 = this.A0G;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final C173377aw A05() {
        C173387ax r0 = this.A0H;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public final C34261eN A06() {
        int i;
        if (this.A0c != null) {
            C34261eN r1 = this.A0R;
            if (r1.A00 == null) {
                List list = r1.A03;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C34281eQ r12 = (C34281eQ) list.get(i2);
                    if (i2 == this.A0c.intValue()) {
                        i = r12.A01 + 1;
                    } else {
                        i = r12.A01;
                    }
                    arrayList.add(new C34281eQ(r12.A02, i, r12.A00));
                }
                C34261eN r13 = this.A0R;
                return new C34261eN(r13.A01, r13.A02, this.A0c.intValue(), false, arrayList, r13.A04, r13.A06);
            }
        }
        return this.A0R;
    }

    public final String A07() {
        List list;
        C173387ax r0 = this.A0H;
        if (r0 == null || (list = r0.A06) == null || list.isEmpty()) {
            return null;
        }
        return ((AnonymousClass4WH) this.A0H.A06.get(0)).A00;
    }

    public final String A08() {
        if (!TextUtils.isEmpty(this.A0H.A03)) {
            return this.A0H.A03;
        }
        return A03().A0I.toUpperCase(C15300mf.A03());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return r0.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r0 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        return r2.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        return r4.getString(r1);
     */
    public final String A09(AnonymousClass0C1 r3, Resources resources) {
        int i;
        C13300iJ r0;
        switch (this.A0Q.ordinal()) {
            case 9:
                return this.A0D.A00;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                if (TextUtils.isEmpty(this.A0g)) {
                    i = C0003R.string.reel_viewer_view_hashtag;
                    break;
                }
                break;
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                i = C0003R.string.reel_viewer_view_location;
                break;
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                AnonymousClass1YR r1 = this.A0F;
                if (r1 != AnonymousClass1YR.IGTV) {
                    if (r1 == AnonymousClass1YR.Clips) {
                        boolean A032 = AnonymousClass1WV.A03(r3);
                        i = C0003R.string.reel_viewer_watch_clips_video;
                        break;
                    }
                    i = C0003R.string.reel_viewer_view_post;
                    break;
                } else {
                    i = C0003R.string.reel_viewer_watch_igtv_video;
                    break;
                }
            case 15:
            case 16:
                r0 = this.A0X;
                break;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                r0 = this.A0J.A06;
                if (r0 == null) {
                    return null;
                }
                break;
            case 20:
            case 31:
                if (TextUtils.isEmpty(this.A0g)) {
                    i = C0003R.string.reel_viewer_view_product;
                    break;
                }
                break;
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                if (TextUtils.isEmpty(this.A0g)) {
                    i = C0003R.string.reel_viewer_view_shared_product;
                    break;
                }
                break;
            case 30:
                i = C0003R.string.reel_viewer_view_guide;
                break;
            default:
                return null;
        }
    }

    public final boolean A0B() {
        C173387ax r0 = this.A0H;
        if (r0 == null || !r0.A07) {
            return false;
        }
        return true;
    }

    public final float AMp() {
        return this.A00;
    }

    public final float AUj() {
        return this.A01;
    }

    public final float Aai() {
        return this.A02;
    }

    public final float Aat() {
        return this.A03;
    }

    public final float Aax() {
        return this.A04;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A0Q, Float.valueOf(this.A03), Float.valueOf(this.A04), Integer.valueOf(this.A06), Float.valueOf(this.A02), Float.valueOf(this.A00), Float.valueOf(this.A01), this.A0X, this.A0I, this.A0E, this.A0H, this.A0G, this.A0K, this.A0L, this.A0M, this.A0O, this.A0W, this.A0R, this.A0c, this.A0T, this.A0S, this.A0U, this.A0V, this.A0N, this.A0J, this.A0D, this.A0i, this.A0j, this.A0e, this.A0k, this.A0F, this.A0d, Boolean.valueOf(this.A0s), Boolean.valueOf(this.A0t), this.A0g, this.A0n, this.A0h, Boolean.valueOf(this.A0r), this.A0Y, this.A0Z, this.A0b, this.A0C, this.A0a, Boolean.valueOf(this.A0q), Integer.valueOf(this.A05), this.A0o});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReelInteractiveType: ");
        sb.append(this.A0Q.A00);
        sb.append("\tx: ");
        sb.append(Aat());
        sb.append("\ty: ");
        sb.append(Aax());
        sb.append("\tz: ");
        sb.append(this.A06);
        sb.append("\twidth: ");
        sb.append(Aai());
        sb.append("\theight: ");
        sb.append(AMp());
        sb.append("\trotation: ");
        sb.append(AUj());
        C13300iJ r1 = this.A0X;
        if (r1 != null) {
            sb.append("\nuser: ");
            sb.append(r1.getId());
        }
        Venue venue = this.A0I;
        if (venue != null) {
            sb.append("\nlocation: ");
            sb.append(venue.A0B);
        }
        Hashtag hashtag = this.A0E;
        if (hashtag != null) {
            sb.append("\nhashtag: ");
            sb.append(hashtag.A0A);
        }
        C173387ax r12 = this.A0H;
        if (r12 != null) {
            sb.append("\nproduct_sticker: ");
            sb.append(r12.A03);
        }
        C173397ay r13 = this.A0G;
        if (r13 != null) {
            sb.append("\nproduct_share_sticker: ");
            sb.append(r13.A00);
        }
        C171577Vd r14 = this.A0K;
        if (r14 != null) {
            sb.append("\nchat_sticker: ");
            sb.append(r14.A04);
        }
        AnonymousClass24Q r15 = this.A0L;
        if (r15 != null) {
            sb.append("\ncountdown_sticker: ");
            sb.append(r15.A09);
        }
        C169647Nb r16 = this.A0M;
        if (r16 != null) {
            sb.append("\ndiscussion_sticker: ");
            sb.append(r16.A02);
        }
        AnonymousClass7VB r17 = this.A0O;
        if (r17 != null) {
            sb.append("\nfundraiser_sticker: ");
            sb.append(r17.A05);
        }
        AnonymousClass7VG r18 = this.A0W;
        if (r18 != null) {
            sb.append("\nsmb_support_sticker: ");
            sb.append(r18.A02.getId());
        }
        C34261eN r19 = this.A0R;
        if (r19 != null) {
            sb.append("\npoll_sticker: ");
            sb.append(r19.A01);
        }
        Integer num = this.A0c;
        if (num != null) {
            sb.append("\npending_viewer_vote: ");
            sb.append(num);
        }
        C44751wh r110 = this.A0T;
        if (r110 != null) {
            sb.append("\nquestion_sticker: ");
            sb.append(r110.A04);
        }
        AnonymousClass7PX r111 = this.A0S;
        if (r111 != null) {
            sb.append("\nquestion_response: ");
            sb.append(r111.A02);
        }
        AnonymousClass2ET r112 = this.A0U;
        if (r112 != null) {
            sb.append("\nquiz_sticker: ");
            sb.append(r112.A06);
        }
        AnonymousClass23T r113 = this.A0V;
        if (r113 != null) {
            sb.append("\nslider_sticker: ");
            sb.append(r113.A05);
        }
        EventStickerModel eventStickerModel = this.A0N;
        if (eventStickerModel != null) {
            sb.append("\nevent_sticker: ");
            sb.append(eventStickerModel.A01);
        }
        C34561ew r114 = this.A0J;
        if (r114 != null) {
            sb.append("\nmusic_overlay_sticker: ");
            sb.append(r114.A0I);
        }
        C1894087d r115 = this.A0D;
        if (r115 != null) {
            sb.append("\nelection_sticker: ");
            sb.append(r115.A00);
        }
        AnonymousClass23f r116 = this.A0Y;
        if (r116 != null) {
            sb.append("\nanti_bully_eng_only: ");
            sb.append(r116.A05);
        }
        AnonymousClass23f r117 = this.A0Z;
        if (r117 != null) {
            sb.append("\nanti_bully_global: ");
            sb.append(r117.A05);
        }
        AnonymousClass23f r118 = this.A0b;
        if (r118 != null) {
            sb.append("\nvoter_registration: ");
            sb.append(r118.A05);
        }
        MinimalGuide minimalGuide = this.A0C;
        if (minimalGuide != null) {
            sb.append("\nguide: ");
            sb.append(minimalGuide.A03);
        }
        C51282Jz r119 = this.A09;
        if (r119 != null) {
            sb.append("\nbloks_data: ");
            sb.append(r119);
        }
        C51282Jz r120 = this.A0A;
        if (r120 != null) {
            sb.append("\nshadow_bloks_data: ");
            sb.append(r120);
        }
        AnonymousClass23f r121 = this.A0a;
        if (r121 != null) {
            sb.append("\nbloks: ");
            sb.append(r121.A05);
        }
        String str = this.A0i;
        if (str != null) {
            sb.append("\nsound_on: ");
            sb.append(str);
        }
        String str2 = this.A0j;
        if (str2 != null) {
            sb.append("\nmedia_id: ");
            sb.append(str2);
        }
        String str3 = this.A0e;
        if (str3 != null) {
            sb.append("\ncarousel_share_child_media_id: ");
            sb.append(str3);
        }
        String str4 = this.A0k;
        if (str4 != null) {
            sb.append("\nmedia_owner_id: ");
            sb.append(str4);
        }
        AnonymousClass1YR r0 = this.A0F;
        if (r0 != null) {
            sb.append("\nproduct_type: ");
            sb.append(r0.A00);
        }
        String str5 = this.A0d;
        if (str5 != null) {
            sb.append("\nattribution: ");
            sb.append(str5);
        }
        String str6 = this.A0g;
        if (str6 != null) {
            sb.append("\nproduct_type: ");
            sb.append(str6);
        }
        String str7 = this.A0n;
        if (str7 != null) {
            sb.append("\nsticker_display_type: ");
            sb.append(str7);
        }
        String str8 = this.A0h;
        if (str8 != null) {
            sb.append("\nhighlighted_media_ids: ");
            sb.append(str8);
        }
        if (this.A0s) {
            sb.append("\nis_sticker");
        }
        if (this.A0t) {
            sb.append("\nuse_custom_title");
        }
        if (this.A0r) {
            sb.append("\nis_hidden");
        }
        if (this.A0q) {
            sb.append("\nis_fb_sticker");
        }
        return sb.toString();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a7, code lost:
        if (r0.A08 == false) goto L_0x01a9;
     */
    public static void A02(C34151eA r5, C13460iZ r6) {
        String str;
        String str2;
        boolean z;
        String str3;
        r6.A0T();
        r6.A0E("x", r5.Aat());
        r6.A0E("y", r5.Aax());
        r6.A0F("z", r5.A06);
        r6.A0E(IgReactMediaPickerNativeModule.WIDTH, r5.Aai());
        r6.A0E(IgReactMediaPickerNativeModule.HEIGHT, r5.AMp());
        r6.A0E("rotation", r5.AUj());
        r6.A0H("type", r5.A0Q.A00);
        C34181eD r4 = r5.A0Q;
        switch (r4.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 9:
            case 18:
            case 27:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                break;
            case 4:
                str2 = r5.A0a.A05;
                str = "bloks_tappable_id";
            case 5:
                AnonymousClass2K8.A00(r6, r5.A0K, false);
                break;
            case 6:
                C49412Ca.A00(r6, r5.A0B, false);
                break;
            case 7:
                AnonymousClass24Q r3 = r5.A0L;
                String str4 = r3.A0C;
                if (str4 != null) {
                    r6.A0H("text", str4);
                }
                String str5 = r3.A0B;
                if (str5 != null) {
                    r6.A0H("text_color", str5);
                }
                String str6 = r3.A08;
                if (str6 != null) {
                    r6.A0H("start_background_color", str6);
                }
                String str7 = r3.A07;
                if (str7 != null) {
                    r6.A0H("end_background_color", str7);
                }
                String str8 = r3.A06;
                if (str8 != null) {
                    r6.A0H("digit_color", str8);
                }
                String str9 = r3.A05;
                if (str9 != null) {
                    r6.A0H("digit_card_color", str9);
                }
                r6.A0G("end_ts", r3.A00);
                String str10 = r3.A09;
                if (str10 != null) {
                    r6.A0H("countdown_id", str10);
                }
                String str11 = r3.A0A;
                if (str11 != null) {
                    r6.A0H("suggestion_id", str11);
                }
                r6.A0I("following_enabled", r3.A0D);
                break;
            case 8:
                AnonymousClass2K7.A00(r6, r5.A0M, false);
                break;
            case 10:
                AnonymousClass2K3.A00(r6, r5.A0N, false);
                break;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                AnonymousClass2K6.A00(r6, r5.A0O, false);
                break;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                r6.A0H("tag_name", r5.A0E.A0A);
                if (r5.A0p) {
                    r6.A0I("heirloom", true);
                }
                if (!TextUtils.isEmpty(r5.A0f)) {
                    str2 = r5.A0f;
                    str = "nominated_by";
                }
                break;
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                str2 = r5.A0I.A04;
                str = "location_id";
                r6.A0H(str, str2);
                break;
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                r6.A0H("media_id", r5.A0j);
                r6.A0H("media_owner_id", r5.A0k);
                String str12 = r5.A0e;
                String str13 = str12;
                if (!(str12 == null || (str3 = r5.A0j) == null || str13.equals(str3))) {
                    r6.A0H("carousel_share_child_media_id", str13);
                }
                AnonymousClass1YR r0 = r5.A0F;
                if (r0 != null) {
                    str2 = r0.A00;
                    str = "product_type";
                }
                break;
            case 15:
            case 16:
                str2 = r5.A0X.getId();
                str = MemoryDumpUploadJob.EXTRA_USER_ID;
                r6.A0H(str, str2);
                break;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                C34541eu.A00(r6, r5.A0J, false);
                str2 = r5.A0J.A04.A00();
                str = "product";
                r6.A0H(str, str2);
                break;
            case 19:
                C34251eM.A00(r6, r5.A06(), false);
                break;
            case 20:
                r6.A0H("product_id", r5.A03().getId());
                r6.A0H("sticker_style", r5.A07());
                r6.A0H("text", r5.A08());
                C173387ax r02 = r5.A0H;
                if (r02 != null) {
                    z = true;
                    break;
                }
                z = false;
                r6.A0I("was_text_edited", z);
                r6.A0H("merchant_id", r5.A03().A02.A02);
                String str14 = r5.A0H.A05;
                String str15 = str14;
                if (str14 != null) {
                    r6.A0H("vibrant_text_color", str15);
                    break;
                }
                break;
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                r6.A0H("product_id", r5.A04().getId());
                r6.A0H("merchant_id", r5.A04().A02.A02);
                break;
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                C44741wg.A00(r6, r5.A0T, false);
                break;
            case 24:
                AnonymousClass2ES.A00(r6, r5.A0U, false);
                break;
            case 25:
                AnonymousClass23S.A00(r6, r5.A0V, false);
                break;
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                AnonymousClass2K5.A00(r6, r5.A0W, false);
                break;
            case 30:
                str2 = r5.A0C.A03;
                str = "guide_id";
                r6.A0H(str, str2);
                break;
            case 32:
                AnonymousClass2K1.A00(r6, r5.A0P, false);
                break;
            default:
                throw new UnsupportedOperationException(AnonymousClass000.A0E("Unknown interactive type: ", r4.A00));
        }
        r6.A0H(str, str2);
        if (!TextUtils.isEmpty(r5.A0d)) {
            r6.A0H("attribution", r5.A0d);
        }
        r6.A0I("is_sticker", r5.A0s);
        boolean z2 = r5.A0t;
        boolean z3 = z2;
        if (z2) {
            r6.A0I("use_custom_title", z3);
        }
        if (!TextUtils.isEmpty(r5.A0n)) {
            r6.A0H("display_type", r5.A0n);
        }
        if (!TextUtils.isEmpty(r5.A0h)) {
            r6.A0H("highlighted_media_ids", r5.A0h);
        }
        r6.A0F("tap_state", r5.A05);
        r6.A0H("tap_state_str_id", r5.A0o);
        r6.A0Q();
    }

    public final void A0A(C34181eD r1) {
        this.A0Q = r1;
    }

    public C34151eA() {
    }

    public C34151eA(C13300iJ r2) {
        this.A0X = r2;
        this.A0Q = C34181eD.MENTION;
    }

    public C34151eA(Hashtag hashtag) {
        this.A0E = hashtag;
        this.A0Q = C34181eD.HASHTAG;
    }
}
