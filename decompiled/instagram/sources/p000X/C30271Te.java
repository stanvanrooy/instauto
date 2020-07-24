package p000X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.clips.audio.model.AudioPageModelType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.UnavailableProduct;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.p009ui.listview.StickyHeaderListView;
import com.instagram.p009ui.mediaactions.MediaActionsView;
import com.instagram.p009ui.mediaactions.ScrubberPreviewThumbnailView;
import com.instagram.p009ui.videothumbnail.ThumbView;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* renamed from: X.1Te  reason: invalid class name and case insensitive filesystem */
public class C30271Te implements C30281Tf {
    public AnonymousClass2XK A00;
    public AnonymousClass1I6 A01;
    public boolean A02;
    public final AnonymousClass1HD A03;
    public final AnonymousClass1AM A04;
    public final C23300zv A05;
    public final C28051Kf A06;
    public final C27371Ho A07;
    public final AnonymousClass1RA A08;
    public final AnonymousClass1PL A09;
    public final C29181Ox A0A;
    public final AnonymousClass1RJ A0B;
    public final AnonymousClass1LY A0C;
    public final AnonymousClass0C1 A0D;
    public final boolean A0E;
    public final AnonymousClass1LO A0F;
    public final AnonymousClass1US A0G;
    public final C30571Uj A0H;
    public final AnonymousClass1R8 A0I;
    public final AnonymousClass0QT A0J;
    public final AnonymousClass1S3 A0K;
    public final AnonymousClass1U2 A0L;
    public final AnonymousClass30N A0M;
    public final AnonymousClass1RD A0N;
    public final AnonymousClass1ST A0O;
    public final AnonymousClass1UY A0P;
    public final C30581Uk A0Q;
    public final C30601Um A0R;
    public final C29791Rg A0S;
    public final C13300iJ A0T;
    public final C29851Rn A0U;
    public final String A0V = UUID.randomUUID().toString();
    public final String A0W;
    public final String A0X;
    public final boolean A0Y;

    public void Auu(AnonymousClass1NJ r11, AnonymousClass1NJ r12, AnonymousClass1NJ r13, int i, int i2, int i3) {
        int height;
        AnonymousClass1NJ r4 = r11;
        if (C36971iu.A01(r11)) {
            this.A09.AqE(r11);
        }
        this.A0K.A03.Ajs(r4, r12, r13, i, i2, i3);
        AnonymousClass1LO r42 = this.A0F;
        if (r42 != null) {
            AnonymousClass1LO.A01(r42, r42.A04, r12, true, Constants.A0C);
            if (!(r13 == null || r13.A0T() == null)) {
                ExtendedImageUrl A0S2 = r13.A0S(r42.A04);
                int i4 = 0;
                if (A0S2 == null) {
                    height = 0;
                } else {
                    height = A0S2.getHeight();
                }
                if (A0S2 != null) {
                    i4 = A0S2.getWidth();
                }
                r42.A06(r13, height, i4);
            }
        }
        AnonymousClass1F6.A00(this.A0D).A09(r12.APo(), this.A07.getModuleName());
        AnonymousClass1F6.A00(this.A0D).A0A(r13.APo(), this.A07.getModuleName());
    }

    public final void AvJ(String str, String str2, String str3, int i, int i2) {
    }

    public final void AwC(AnonymousClass1NJ r10, C36841ih r11, int i) {
        Integer num;
        AnonymousClass1NJ r4 = r10;
        if (r10.A1R()) {
            num = Constants.A0C;
        } else {
            num = Constants.ZERO;
        }
        C36841ih r5 = r11;
        A09(r10, new C37111j8(this.A0D, r10, r11), num, "icon");
        A07(r10);
        if (r10.Aho()) {
            C46401zg.A01(this.A0D).A04(C46401zg.A00(r10), "photo");
        }
        A0E(r4, r5, r10.A0c(this.A0D).getId(), i, (String) null);
    }

    public final void AwS(AnonymousClass1NJ r10, C36841ih r11, int i, String str) {
        Integer num;
        String str2;
        AnonymousClass1NJ r4 = r10;
        if (r10.A1R()) {
            num = Constants.A0C;
        } else {
            num = Constants.ZERO;
        }
        if (r10.A1R()) {
            str2 = "influencer_in_header";
        } else {
            str2 = "name";
        }
        C36841ih r5 = r11;
        A09(r10, new C37111j8(this.A0D, r10, r11), num, str2);
        A07(r10);
        if (r10.Aho()) {
            C46401zg.A01(this.A0D).A04(C46401zg.A00(r10), "username");
        }
        A0E(r4, r5, r10.A0c(this.A0D).getId(), i, str);
    }

    public final void Awn(AnonymousClass0RN r18, AnonymousClass1NJ r19, int i) {
        AnonymousClass0RN r5;
        ClipsViewerSource clipsViewerSource;
        ClipsViewerSource[] values = ClipsViewerSource.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            r5 = r18;
            if (i2 >= length) {
                clipsViewerSource = ClipsViewerSource.UNKNOWN;
                break;
            }
            clipsViewerSource = values[i2];
            if (r5.getModuleName().equals(clipsViewerSource.A00)) {
                break;
            }
            i2++;
        }
        C18600s7.A00.A06(this.A0D, this.A03.getActivity(), new ClipsViewerConfig(clipsViewerSource, r19.APo(), (String) null, (String) null, (String) null, i, (String) null, (AudioPageModelType) null, (String) null, (String) null), r5);
    }

    public final void Ax1(AnonymousClass1NJ r2, C36841ih r3, int i, C36411i0 r5) {
        A0C(r2, r3, 0, r5);
    }

    public void B3K(AnonymousClass1NJ r1) {
    }

    public final void BFl(Product product) {
    }

    public final void BFn(ProductFeedItem productFeedItem, int i, int i2, C06270Ok r4, String str, String str2) {
    }

    public final boolean BFp(ProductFeedItem productFeedItem, int i, int i2) {
        return false;
    }

    public final void BFq(Product product, int i, int i2) {
    }

    public final void BFr(C215309Ps r1, Product product, int i, int i2, AnonymousClass9QP r5) {
    }

    public final void BFs(Product product, String str, int i, int i2) {
    }

    public void BNN(AnonymousClass1NJ r1, C36841ih r2) {
    }

    public final void BT1(UnavailableProduct unavailableProduct, int i, int i2) {
    }

    public final void BT2(ProductFeedItem productFeedItem) {
    }

    public final void BVk(C215309Ps r1) {
    }

    public final void BVn(C215309Ps r1, AnonymousClass9Q3 r2, int i) {
    }

    public final void BVy(C215309Ps r1) {
    }

    public final void BVz(C215309Ps r1) {
    }

    public static void A03(C30271Te r2, instagramComment r3) {
        C16980pU.A00.A06(r3, r3.A0C);
        if (r2.A03.isVisible()) {
            r2.A09.AqE(r3.A0C);
        }
    }

    public static void A04(C30271Te r1, AnonymousClass1NJ r2, C36841ih r3, Integer num) {
        r3.A0K = num;
        C36791ic.A00(r1.A0D).A01(r2, true);
    }

    public static void A05(C30271Te r7, String str, AnonymousClass1NJ r9, C36841ih r10, int i) {
        C36901in.A0L(r7.A0D, str, (AnonymousClass1I6) null, r9, r7.A07, r10.AHt(), Integer.valueOf(i), (Integer) null);
    }

    public static void A06(C30271Te r8, String str, String str2, AnonymousClass1NJ r11, C36841ih r12) {
        AnonymousClass0C1 r5 = r8.A0D;
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(r5);
        int AHt = r12.AHt();
        C27371Ho r82 = r8.A07;
        String APo = r11.APo();
        C13300iJ A0c = r11.A0c(r5);
        C37141jB r1 = new C37141jB(AnonymousClass000.A0E("instagram_ad_", "hide_response"), r82, (C37121j9) null);
        r1.A50 = r11.AYw();
        r1.A4i = str;
        r1.A3v = APo;
        r1.A2y = C30671Ut.A02(r5, r11);
        r1.A33 = A0c.getId();
        r1.A3V = C13300iJ.A02(A0c.A0M);
        r1.A1A = r11.APx().A00;
        if (str2 != null) {
            r1.A4Y = str2;
        }
        C36901in.A0E(r1, AnonymousClass1PZ.A00(r5).A02(APo), AHt);
        C36901in.A03(A012, r1.A03(), Constants.ONE);
    }

    private void A07(AnonymousClass1NJ r6) {
        if (this.A03 instanceof AnonymousClass0RN) {
            C26441Dh A002 = C26441Dh.A00(this.A0D);
            AnonymousClass1HD r0 = this.A03;
            A002.A0A((AnonymousClass0RN) r0, "viewport_pk", r6.getId(), r0.getActivity());
        }
    }

    private void A08(AnonymousClass1NJ r11) {
        Context context = this.A03.getContext();
        if (context != null && !AnonymousClass0NT.A07(context) && !C16180oA.A00(this.A0D).A00.getBoolean("seen_offline_like_nux", false)) {
            C54252Wm.A01(((C27361Hn) this.A03).getScrollingViewProxy(), (StickyHeaderListView) this.A03.mView.findViewById(C0003R.C0005id.sticky_header_list), r11, Constants.ZERO, this.A0N, C0003R.string.offline_like_nux_title, 500);
        }
    }

    private void A09(AnonymousClass1NJ r11, C37111j8 r12, Integer num, String str) {
        AnonymousClass0C1 r1 = this.A0D;
        C36901in.A0F(r1, AnonymousClass0WN.A01(r1), this.A07, r11, new C148726Xs(this, r12, r11), r11.A0c(this.A0D).A0r(), num, str, this.A01);
    }

    private void A0A(AnonymousClass1NJ r9, C36841ih r10) {
        if (!(!AnonymousClass1H4.A01(this.A04))) {
            AnonymousClass0C1 r1 = this.A0D;
            C225409n6.A00(r1, r9, this.A07, new C37111j8(r1, r9, r10), this.A03.requireActivity(), 1, (C38691lg) null);
        }
    }

    private void A0B(AnonymousClass1NJ r21, C36841ih r22, int i, View view) {
        AnonymousClass2F2 r0;
        AnonymousClass1NJ r8 = r21;
        if (!r8.A3Q && !this.A0Y) {
            A08(r8);
            C36841ih r2 = r22;
            r2.A0P(C26611Ee.A00(this.A0D).A0K(r8), true, true);
            if (C36461i5.A00(this.A0D).A02(r8.A0N()) && ((Boolean) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.DAISY_HAPTICS_AB_TEST_UNIVERSE_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                View view2 = view;
                view2.setHapticFeedbackEnabled(true);
                view2.performHapticFeedback(1);
            }
            AnonymousClass1HD r02 = this.A03;
            Context context = r02.getContext();
            int AHt = r2.AHt();
            Integer num = Constants.ZERO;
            Integer num2 = Constants.ONE;
            C27371Ho r14 = this.A07;
            FragmentActivity activity = r02.getActivity();
            AnonymousClass0C1 r5 = this.A0D;
            AnonymousClass1I6 r4 = this.A01;
            boolean z = r2.A0m;
            if (!this.A0E || this.A0C == null || r2.A0E != C17070pd.MAIN_FEED) {
                r0 = null;
            } else {
                r0 = new AnonymousClass2F2(this, r8);
            }
            AnonymousClass2F3.A00(context, r8, i, AHt, -1, num, num2, r14, activity, r5, r4, z, r0);
            if (C17050pb.A08(r8, r2.AHt())) {
                r2.A0O(true, true);
                r2.A0P = "like_media";
            }
        }
    }

    private void A0C(AnonymousClass1NJ r10, C36841ih r11, int i, C36411i0 r13) {
        String id = ((AnonymousClass1NJ) r10.A2X.get(i + 1)).getId();
        if (r10.A0O().AiO()) {
            this.A0B.A0T.A0M("fragment_paused", true, true);
        }
        int[] iArr = new int[2];
        r13.A0A.getLocationInWindow(iArr);
        AnonymousClass0C1 r4 = this.A0D;
        FragmentActivity activity = this.A03.getActivity();
        Integer num = Constants.A0j;
        C27371Ho r7 = this.A07;
        C37111j8 r8 = new C37111j8(r4, r10, r11);
        r8.A04 = r11.A0P;
        r8.A03 = id;
        C215679Rh r3 = new C215679Rh(r4, activity, num, r7, r8);
        r3.A06 = r10;
        r3.A00 = r11.AHt();
        r3.A02 = r11.getPosition();
        r3.A0E = iArr;
        r3.A01 = r11.A02();
        new C215639Rd(r3).A02();
    }

    private void A0D(AnonymousClass1NJ r8, C36841ih r9, String str) {
        A09(r8, new C37111j8(this.A0D, r8, r9), Constants.ZERO, str);
        if (C30671Ut.A02(this.A0D, r8) != null) {
            C52362Om r6 = new C52362Om(this.A03.getActivity(), this.A0D);
            r6.A0B = true;
            C22060xm.A00.A00();
            String APo = r8.APo();
            String A022 = C30671Ut.A02(this.A0D, r8);
            int position = r9.getPosition();
            int AHt = r9.AHt();
            Bundle bundle = new Bundle();
            bundle.putString("PBIAProxyProfileFragment.MEDIA_ID", APo);
            bundle.putString("PBIAProxyProfileFragment.AD_ID", A022);
            bundle.putInt("PBIAProxyProfileFragment.FEED_POSITION", position);
            bundle.putInt("PBIAProxyProfileFragment.CAROUSEL_INDEX", AHt);
            C147696Sz r0 = new C147696Sz();
            r0.setArguments(bundle);
            r6.A02 = r0;
            r6.A02();
        } else if (r8.A0c(this.A0D).A0r() && C17050pb.A08(r8, r9.AHt())) {
            r9.A0O(!r9.A0a, true);
            if (r9.A0a) {
                r9.A0P = "pbia_profile_tap";
            }
        }
    }

    private void A0E(AnonymousClass1NJ r6, C36841ih r7, String str, int i, String str2) {
        String str3;
        Hashtag hashtag;
        if (!(!AnonymousClass1H4.A01(this.A04))) {
            Hashtag hashtag2 = r6.A0m;
            C52902Qq A012 = C52902Qq.A01(this.A0D, str, "feed_story_header", ((AnonymousClass0RN) this.A03).getModuleName());
            A012.A03 = new SourceModelInfoParams(r6.getId(), i, r7.AHt());
            String str4 = null;
            if (hashtag2 == null) {
                str3 = null;
            } else {
                str3 = hashtag2.A07;
            }
            if (hashtag2 != null) {
                str4 = hashtag2.A0A;
            }
            if (!(str3 == null || str4 == null)) {
                A012.A07 = str3;
                A012.A08 = str4;
            }
            A012.A0B = this.A0W;
            AnonymousClass1HD r1 = this.A03;
            if (((r1 instanceof AnonymousClass2KH) && (hashtag = ((AnonymousClass2KH) r1).AMl()) != null) || (hashtag = r6.A0m) != null) {
                A012.A02 = C28797Cms.A00(hashtag);
            }
            if (str2 != null) {
                A012.A0C = str2;
                A012.A0N = true;
            }
            C52362Om r2 = new C52362Om(r1.getActivity(), this.A0D);
            r2.A0B = true;
            r2.A02 = C18980sj.A00.A00().A02(A012.A03());
            r2.A05 = "media_owner";
            r2.A02();
        }
    }

    private void A0F(AnonymousClass1NJ r15, C36841ih r16, boolean z, String str) {
        String str2;
        AnonymousClass1NJ r3 = r15;
        String A002 = C100994Xy.A00(this.A03.getContext(), C30671Ut.A06(this.A0D, r15), false);
        AnonymousClass0a4.A06(A002);
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(this.A0D);
        C27371Ho r4 = this.A07;
        C37111j8 r5 = new C37111j8(this.A0D, r15, r16);
        boolean z2 = z;
        if (z) {
            str2 = "open_iab_url";
        } else {
            str2 = "open_disclaimer_fragment";
        }
        String str3 = null;
        String str4 = str;
        if (z) {
            str3 = str4;
        }
        String str5 = str4;
        if (z) {
            str5 = null;
        }
        C36901in.A08(A012, r3, r4, r5, str2, A002, str3, str5);
        FragmentActivity activity = this.A03.getActivity();
        AnonymousClass0a4.A06(activity);
        C52362Om r2 = new C52362Om(activity, this.A0D);
        r2.A0B = true;
        C227559qh A003 = C18920sd.A00.A00();
        AnonymousClass0C1 r9 = this.A0D;
        r2.A02 = A003.A00(r9, z2, A002, str4, C30671Ut.A0B(r9, r15));
        r2.A02();
    }

    private void A0G(AnonymousClass1NJ r5, String str, AnonymousClass2U6 r7) {
        if (!this.A02) {
            this.A02 = true;
            HashMap hashMap = new HashMap();
            hashMap.put("media_id", r5.A27);
            hashMap.put("module", this.A07.getModuleName());
            C53562Th A002 = C53572Ti.A00(this.A0D, str, hashMap);
            A002.A00 = new C109894oM(this, r7);
            ((C12830hS) this.A03).schedule(A002);
        }
    }

    public void A0H(AnonymousClass1NJ r6, C36841ih r7) {
        boolean z;
        AnonymousClass1HD r1 = this.A03;
        if (r1.getActivity() == null) {
            z = false;
        } else {
            View view = r1.mView;
            if (view != null) {
                C06220Of.A0E(view);
            }
            z = true;
        }
        if (z) {
            C16180oA.A00(this.A0D).A0E();
            AnonymousClass5BO A012 = C19020sn.A00.A04().A01(this.A0D, (AnonymousClass0RN) this.A03, "feed_ufi");
            A012.A00.putString("DirectReplyModalFragment.content_id", r6.APo());
            A012.A00.putBoolean("DirectReplyModalFragment.allow_swipe_down_to_dismiss", true);
            C31221Wz A013 = C31201Wx.A01(this.A03.getContext());
            A013.A07(new C149626ag(this));
            A013.A0F(A012.A00());
            if (r6.Aho()) {
                C22760yx.A00(this.A0D).A00.A5H(C35051fj.A00, C46401zg.A00(r6), "direct_reply_to_author");
            }
            if (C17050pb.A08(r6, r7.AHt())) {
                r7.A0O(true, true);
            }
            this.A05.A04(new C149706ao(true));
        }
    }

    public final void A2l(int i) {
        AnonymousClass1ST r6 = this.A0O;
        if (r6 != null) {
            AnonymousClass1TX r5 = r6.A00;
            Object obj = r5.A01;
            String A012 = AnonymousClass1ST.A01(i, (AnonymousClass1NJ) obj);
            AnonymousClass1TZ r3 = new AnonymousClass1TZ(r6.A04, obj, r5.A02, A012);
            r3.A04(r5);
            C30241Tb r2 = r6.A03;
            AnonymousClass1TX r0 = r6.A00;
            r2.AqR(r3, (AnonymousClass1NJ) r0.A01, (C36841ih) r0.A02);
            r6.A02.A01(A012, new AnonymousClass1TX(r3));
        }
    }

    public final void A2n(C37131jA r7) {
        AnonymousClass1ST r5 = this.A0O;
        if (r5 != null) {
            String AS8 = r7.A01.AS8();
            AnonymousClass0C1 r3 = r5.A04;
            AnonymousClass1TX r1 = r5.A00;
            AnonymousClass1TZ r2 = new AnonymousClass1TZ(r3, r1.A01, r7, AS8);
            r2.A04(r1);
            r5.A03.AqT(r2, (AnonymousClass1NJ) r5.A00.A01, r7);
            r5.A02.A01(AS8, new AnonymousClass1TX(r2));
        }
    }

    public final void A2o(int i) {
        AnonymousClass1ST r6 = this.A0O;
        if (r6 != null) {
            AnonymousClass1TX r5 = r6.A00;
            Object obj = r5.A01;
            String A012 = AnonymousClass1ST.A01(i, (AnonymousClass1NJ) obj);
            AnonymousClass1TZ r3 = new AnonymousClass1TZ(r6.A04, obj, r5.A02, A012);
            r3.A04(r5);
            C30241Tb r2 = r6.A03;
            AnonymousClass1TX r0 = r6.A00;
            r2.AqU(r3, (AnonymousClass1NJ) r0.A01, (C36841ih) r0.A02);
            r6.A02.A01(A012, new AnonymousClass1TX(r3));
        }
    }

    public final void A3G(int i) {
        AnonymousClass1ST r6 = this.A0O;
        if (r6 != null) {
            AnonymousClass1TX r5 = r6.A00;
            Object obj = r5.A01;
            String A012 = AnonymousClass1ST.A01(i, (AnonymousClass1NJ) obj);
            AnonymousClass1TZ r3 = new AnonymousClass1TZ(r6.A04, obj, r5.A02, A012);
            r3.A04(r5);
            C30241Tb r2 = r6.A03;
            AnonymousClass1TX r0 = r6.A00;
            r2.AqV(r3, (AnonymousClass1NJ) r0.A01, (C36841ih) r0.A02);
            r6.A02.A01(A012, new AnonymousClass1TX(r3));
        }
    }

    public final void A48(C215309Ps r3, ProductFeedItem productFeedItem, AnonymousClass9Q0 r5) {
        this.A0R.A03(productFeedItem, r3.getId(), r5);
    }

    public final void A4B(C215309Ps r3, int i) {
        this.A0R.A04(r3, r3.getId(), i);
    }

    public final void A4T(int i) {
        AnonymousClass1ST r6 = this.A0O;
        if (r6 != null) {
            AnonymousClass1TX r5 = r6.A00;
            Object obj = r5.A01;
            String A012 = AnonymousClass1ST.A01(i, (AnonymousClass1NJ) obj);
            AnonymousClass1TZ r3 = new AnonymousClass1TZ(r6.A04, obj, r5.A02, A012);
            r3.A04(r5);
            C30241Tb r2 = r6.A03;
            AnonymousClass1TX r0 = r6.A00;
            r2.AqX(i, r3, (AnonymousClass1NJ) r0.A01, (C36841ih) r0.A02);
            r6.A02.A01(A012, new AnonymousClass1TX(r3));
        }
    }

    public final AnonymousClass2OA AAQ(AnonymousClass2OA r2) {
        r2.A0K(this.A03);
        return r2;
    }

    public final void ACC(C215309Ps r11, int i) {
        C27371Ho r1 = this.A07;
        AnonymousClass0C1 r2 = this.A0D;
        String AVo = this.A01.AVo();
        String AVo2 = this.A01.AVo();
        String str = this.A0W;
        String AWN = r11.AWN();
        AnonymousClass0a4.A06(AWN);
        C215299Pr.A03(r1, r2, r11, (ExploreTopicCluster) null, i, AVo, AVo2, str, AWN);
        Map map = C68102yR.A00(this.A0D).A00;
        String AWN2 = r11.AWN();
        AnonymousClass0a4.A06(AWN2);
        map.remove(AWN2);
        this.A09.AE6();
    }

    public final boolean Acu() {
        return this.A0L.Acu();
    }

    public final void ArR(AnonymousClass1NJ r5) {
        AnonymousClass0C1 r3 = this.A0D;
        C27371Ho r2 = this.A07;
        Integer num = Constants.ONE;
        C168297Gq.A01(r3, r5, r2, num, Constants.A0Y);
        AnonymousClass0C1 r0 = this.A0D;
        String id = r5.getId();
        C15890nh r22 = new C15890nh(r0);
        r22.A09 = num;
        r22.A0E("media/%s/mark_overage/", id);
        r22.A06(AnonymousClass1N4.class, false);
        r22.A0G = true;
        C17850qu A032 = r22.A03();
        A032.A00 = new AnonymousClass541(r5.getId(), this.A0D);
        C12810hQ.A02(A032);
    }

    public final void ArS(AnonymousClass1NJ r5) {
        AnonymousClass0C1 r3 = this.A0D;
        C27371Ho r2 = this.A07;
        Integer num = Constants.ONE;
        C168297Gq.A01(r3, r5, r2, num, Constants.A0N);
        AnonymousClass0C1 r0 = this.A0D;
        String id = r5.getId();
        C15890nh r22 = new C15890nh(r0);
        r22.A09 = num;
        r22.A0E("media/%s/mark_underage/", id);
        r22.A06(AnonymousClass1N4.class, false);
        r22.A0G = true;
        C17850qu A032 = r22.A03();
        A032.A00 = new AnonymousClass541(r5.getId(), this.A0D);
        C12810hQ.A02(A032);
    }

    public final void AsT(C31941aH r10) {
        new C59032gv(this.A0D, TransparentModalActivity.class, "audio_page", C18600s7.A00.A00().A00(r10.A00, r10.A01), this.A03.getActivity()).A06(this.A03.getActivity());
    }

    public void Ate() {
        AnonymousClass2UC r4 = new AnonymousClass2UC(this.A03.getActivity(), this.A0D, "https://www.facebook.com/policies/brandedcontent/", AnonymousClass2UD.BRANDED_CONTENT_VIOLATION_CTA);
        r4.A04(((AnonymousClass0RN) this.A03).getModuleName());
        r4.A01();
    }

    public final void Avh(AnonymousClass1NJ r3) {
        C23300zv.A00(this.A0D).BXT(new C35381gH(r3));
    }

    public final void Avj(AnonymousClass1NJ r15, C36841ih r16, int i) {
        C36841ih r10 = r16;
        C37111j8 r5 = new C37111j8(this.A0D, r15, r10);
        r5.A05 = r15.A0b().getId();
        AnonymousClass0C1 r1 = this.A0D;
        C36901in.A0F(r1, AnonymousClass0WN.A01(r1), this.A07, r15, r5, r15.A0c(this.A0D).A0r(), Constants.ZERO, "sponsor_above_caption", this.A01);
        A07(r15);
        A0E(r15, r10, r15.A0b().getId(), i, (String) null);
    }

    public final void Avo(AnonymousClass1NJ r2, C36841ih r3, int i) {
        A0D(r2, r3, "name");
    }

    public final void Avp(AnonymousClass1NJ r2, C36841ih r3, int i) {
        A0D(r2, r3, "icon");
    }

    public void Avw(AnonymousClass1NJ r7, C36841ih r8) {
        AnonymousClass30N r5 = this.A0M;
        if (r5 != null) {
            C13300iJ A0c = r7.A0c(r5.A00.A05);
            if (A0c.A0N == C13390iS.FollowStatusNotFollowing) {
                AnonymousClass2KG r3 = r5.A00;
                C17850qu A002 = C1188858g.A00(r3.A05, A0c.getId());
                A002.A00 = new AnonymousClass6SR(r5.A00, A0c, r8);
                r3.schedule(A002);
            }
        }
    }

    public final void Avz(AnonymousClass1NJ r5, Hashtag hashtag, C36841ih r7, int i) {
        if (!(!AnonymousClass1H4.A01(this.A04))) {
            C52362Om r3 = new C52362Om(this.A03.getActivity(), this.A0D);
            r3.A0B = true;
            r3.A02 = C17910r0.A00.A01().A01(hashtag, this.A07.getModuleName(), "feed_story_media");
            r3.A05 = "media_header_hashtag";
            r3.A02();
        }
    }

    public final void Aw3(AnonymousClass1NJ r5) {
        String str;
        C57922f1 r0 = r5.A0X;
        if (r0 != null) {
            str = r0.A03;
        } else {
            str = null;
        }
        if (str != null) {
            AnonymousClass270.A04(this.A03.getActivity(), this.A0D, str, r5.APo());
        }
    }

    public final void Aw4(AnonymousClass1NJ r22, C36841ih r23, int i) {
        AnonymousClass1NJ r11 = r22;
        AnonymousClass1NJ r7 = r11;
        if (r11.Aho()) {
            C22760yx.A00(this.A0D).A00.A5H(C35051fj.A00, C46401zg.A00(r11), "tap_option");
        }
        C36841ih r12 = r23;
        AnonymousClass6Q5 r1 = new AnonymousClass6Q5(r11, r12);
        int i2 = i;
        if (C17050pb.A0A(r11, r12.A0E) && ((Boolean) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.ADS_BOTTOM_SHEET_REPORT_FLOW, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass2TH r2 = new AnonymousClass2TH(this.A0D);
            r2.A0G = new AnonymousClass6DT(this, r11);
            AnonymousClass2TI A002 = r2.A00();
            C146146Mp A003 = C22250y6.A00.A00().A00(this.A0D, r11.getId(), true);
            A003.A00(new C145996Ma(this, r11, r12, i2, A002));
            AnonymousClass1HD r13 = this.A03;
            FragmentActivity activity = r13.getActivity();
            AnonymousClass0a4.A06(activity);
            Context context = r13.getContext();
            C31201Wx.A00(activity);
            A002.A01(context, A003);
            C36901in.A0L(this.A0D, "action_menu", (AnonymousClass1I6) null, r7, this.A07, r12.AHt(), Integer.valueOf(i2), (Integer) null);
        } else if (((Boolean) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.ACTION_SHEET_MIGRATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C144246Ew r72 = new C144246Ew(this.A03, this.A04, this.A07, r11, r12, this.A0D, i2, this.A01, this.A0A);
            r72.A01 = new AnonymousClass6Q3(this, r11, r12, r1);
            r72.A00 = new C149646ai(this);
            AnonymousClass5EO r6 = new AnonymousClass5EO(this.A0D, this.A03.getContext());
            List A072 = r72.A07();
            for (int i3 = 0; i3 < A072.size(); i3++) {
                Pair pair = (Pair) A072.get(i3);
                r6.A05(((CharSequence) pair.second).toString(), new AnonymousClass6FA(this, r72, pair, i3));
            }
            if (!(this.A04 == null || this.A03.getContext() == null)) {
                r6.A00().A01(this.A03.getContext());
            }
        } else {
            AnonymousClass6FC r73 = new AnonymousClass6FC(this.A03, this.A04, this.A07, r11, r12, this.A0D, i2, this.A01, this.A0A);
            AnonymousClass6Q3 r3 = new AnonymousClass6Q3(this, r11, r12, r1);
            C144246Ew r24 = r73.A01;
            r24.A01 = r3;
            C149646ai r14 = new C149646ai(this);
            r73.A00 = r14;
            r24.A00 = r14;
            C36901in.A0L(r73.A02, "action_menu", (AnonymousClass1I6) null, r73.A07, r73.A08, r73.A03, Integer.valueOf(r73.A04), (Integer) null);
            AnonymousClass6E8.A00(r73.A02, r73.A08, r73.A07.APo(), "feed_action_sheet");
            List A073 = r73.A01.A07();
            int size = A073.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            for (int i4 = 0; i4 < size; i4++) {
                charSequenceArr[i4] = (CharSequence) ((Pair) A073.get(i4)).second;
            }
            AnonymousClass2OA r25 = new AnonymousClass2OA(r73.A05);
            r25.A0K(r73.A06);
            r25.A0W(charSequenceArr, new AnonymousClass6FB(r73, A073));
            r25.A0U(true);
            r25.A0V(true);
            r25.A0F(new AnonymousClass6FR(r73));
            r25.A0E(new AnonymousClass6FD(r73));
            r25.A03().show();
            C145636Km.A00(r73.A08, r73.A07.A0u(), r73.A07.APx(), r73.A02, Constants.ONE);
            AnonymousClass6N8.A02(r73.A05, r73.A08, r73.A07.APo(), Constants.ONE, r73.A02);
            boolean z = false;
            if (r73.A09 == C17070pd.MAIN_FEED) {
                z = true;
            }
            if (z) {
                AnonymousClass0C1 r26 = r73.A02;
                AnonymousClass6GE.A00(r26, r73.A08, Constants.ZERO, r73.A07.A0c(r26), r73.A07.A0u(), (String) null);
            }
        }
        this.A05.A04(new C149706ao(true));
    }

    public void AwE(Reel reel, AnonymousClass1NJ r17, C36841ih r18, C31811a0 r19) {
        AnonymousClass1OY r14;
        String str;
        Integer num;
        String str2;
        String str3;
        C36841ih r6 = r18;
        C17070pd r1 = r6.A0E;
        Reel reel2 = reel;
        if (reel != null) {
            List singletonList = Collections.singletonList(reel2);
            if (r1 == C17070pd.SINGLE_MEDIA_FEED) {
                r14 = AnonymousClass1OY.SINGLE_FEED_ITEM_HEADER;
            } else {
                r14 = AnonymousClass1OY.FEED_ITEM_HEADER;
            }
            C27371Ho r9 = this.A07;
            AnonymousClass0C1 r2 = this.A0D;
            AnonymousClass1I6 r0 = this.A01;
            if (r0 != null) {
                str = r0.AVo();
            } else {
                str = null;
            }
            int position = r6.getPosition();
            AnonymousClass1NJ r5 = r17;
            if (r5.A1W()) {
                num = Integer.valueOf(r6.AHt());
            } else {
                num = null;
            }
            C37141jB A012 = C37591ju.A01("profile_story_tap", r5, r9);
            if (C36901in.A0O(r5, r9)) {
                str2 = C30671Ut.A0A(r2, r5);
            } else {
                str2 = r5.A29;
            }
            A012.A50 = str2;
            A012.A3v = r5.APo();
            A012.A4c = str;
            A012.A14 = position;
            String str4 = r5.A21;
            if (str4 != null) {
                A012.A3p = str4;
            }
            String str5 = r5.A2D;
            if (str5 != null) {
                A012.A4e = str5;
            }
            if (!r5.A3G.isEmpty()) {
                A012.A3J = C06360Ot.A04(",", r5.A3G);
            }
            if (r5.A1W() && num != null) {
                int intValue = num.intValue();
                AnonymousClass1NJ A0P2 = r5.A0P(intValue);
                A012.A0k = intValue;
                A012.A3A = A0P2.APo();
                A012.A39 = r5.A0P(0).APo();
                A012.A3u = r5.A24;
            }
            if (r5.A1W()) {
                str3 = r5.A0P(0).A1e;
            } else {
                str3 = r5.A1e;
            }
            String A022 = C30671Ut.A02(r2, r5);
            if (str3 != null) {
                A012.A2w = str3;
            }
            if (A022 != null) {
                A012.A2y = A022;
            }
            Integer num2 = reel2.A0R;
            if (num2 != null) {
                A012.A1P = num2.intValue();
            }
            C36901in.A09(AnonymousClass0WN.A01(this.A0D), this.A07, r5, A012.A03(), (Integer) null);
            AnonymousClass1UY r8 = this.A0P;
            r8.A0A = this.A0V;
            C31811a0 r92 = r19;
            r8.A04 = new C124685Vw((Activity) this.A03.getActivity(), r92.AGS(), (AnonymousClass1W5) new AnonymousClass6FE(this));
            r8.A03(r92, reel2, singletonList, singletonList, singletonList, r14);
        }
    }

    public final void AwN(AnonymousClass1NJ r9, C36841ih r10, int i) {
        C37111j8 r2 = new C37111j8(this.A0D, r9, r10);
        r2.A05 = r9.A0b().getId();
        A09(r9, r2, Constants.ZERO, "sponsor_in_header");
        A07(r9);
        A0E(r9, r10, r9.A0b().getId(), i, (String) null);
    }

    public final void AwO(AnonymousClass1NJ r9, C36841ih r10) {
        C36901in.A0L(this.A0D, "sponsored_label", (AnonymousClass1I6) null, r9, this.A07, r10.AHt(), (Integer) null, (Integer) null);
    }

    public void AwU(AnonymousClass1NJ r11, C36841ih r12, View view) {
        Pair A002 = AnonymousClass23U.A00(r11, r12, this.A03.getContext(), this.A0D);
        this.A0U.A04(r11, r12, (AnonymousClass1UP) A002.second, (View) view.getParent(), (C31831a3) view.getParent().getParent(), (AnonymousClass2E3) A002.first, this.A07);
    }

    public final void Ax3(C38511lO r6, AnonymousClass1NJ r7, C36841ih r8, int i, C36411i0 r10) {
        boolean z = false;
        if (this.A0S.A07.A08 == Constants.ONE) {
            z = true;
        }
        if (!z && (r10.A0A.getParent() instanceof C31831a3)) {
            C29791Rg r3 = this.A0S;
            MediaFrameLayout mediaFrameLayout = r10.A0A;
            r3.A00 = r8.AHt();
            r3.A01 = i;
            r3.A03 = r7;
            r3.A02 = System.currentTimeMillis();
            r3.A07.A03((C31831a3) r10.A0A.getParent(), mediaFrameLayout, r6);
        }
    }

    public final void Ax4(boolean z, AnonymousClass1NJ r27, C36841ih r28) {
        AnonymousClass1NJ r2 = r27;
        if (z) {
            AnonymousClass1HD r1 = this.A03;
            AnonymousClass0C1 r5 = this.A0D;
            C27371Ho r9 = this.A07;
            String str = this.A0W;
            ArrayList<Product> A072 = C52952Qw.A07(r5, r2.A0x());
            AnonymousClass0a4.A09(!A072.isEmpty());
            FragmentActivity activity = r1.getActivity();
            AnonymousClass0a4.A06(activity);
            AnonymousClass8VY r4 = new AnonymousClass8VY(activity, r5, r9, A072);
            AnonymousClass0a4.A06(activity);
            ArrayList<Product> A073 = C52952Qw.A07(r5, A072);
            String moduleName = r9.getModuleName();
            JSONArray jSONArray = new JSONArray();
            for (Product product : A073) {
                jSONArray.put(product.A0B);
            }
            C15890nh r3 = new C15890nh(r5);
            r3.A09 = Constants.ONE;
            r3.A0C = "save/products/bulk_save/";
            r3.A09("module_name", moduleName);
            r3.A09("compound_product_ids", jSONArray.toString());
            r3.A06(AnonymousClass1N4.class, false);
            C17850qu A032 = r3.A03();
            A032.A00 = new C194538Um(r4, A072, r5);
            boolean z2 = false;
            if (r27 != null) {
                z2 = true;
            }
            AnonymousClass0a4.A09(z2);
            for (Product product2 : A072) {
                String str2 = "product_upsell";
                AnonymousClass8XH.A04(r9, r5, Constants.ZERO, product2, product2.A02.A02, (String) null, (String) null, r2, str2, (String) null, str, (C06270Ok) null, r2.getId(), (C219489d9) null, (Long) null, (String) null);
            }
            C37141jB A012 = C37591ju.A01("bulk_save", r2, r9);
            A012.A2u = Constants.ONE;
            A012.A0B(r5, r2);
            A012.A4E = null;
            A012.A3W = "product_upsell";
            A012.A07((C06270Ok) null);
            C36901in.A04(AnonymousClass0WN.A01(r5), A012, r2, r9);
            C12810hQ.A02(A032);
            return;
        }
        C36841ih r32 = r28;
        this.A0L.BKn(r2, r32, r32.getPosition());
    }

    public final void Ax5(boolean z, AnonymousClass1NJ r11, C36841ih r12) {
        if (z) {
            C17510qM.A00.A0u(this.A03.getActivity(), this.A07, this.A0D, this.A0W, r11, r12, (C38691lg) null);
        } else {
            C17430qE.A00.A03(this.A03.getActivity(), this.A0D);
        }
    }

    public void AxG(AnonymousClass1NJ r6, C36841ih r7, int i, C32351b1 r9) {
        Bundle A012;
        if (!(!AnonymousClass1H4.A01(this.A04))) {
            if (C36901in.A0M(r6, this.A07)) {
                AnonymousClass0C1 r2 = this.A0D;
                C37141jB A013 = C37591ju.A01("comment_button", r6, this.A07);
                A013.A0B(r2, r6);
                A013.A14 = i;
                A013.A0s = r7.A08;
                A013.A5I = r6.A3k.A06(r6.A0H()).A00;
                C36901in.A0H(this.A0D, A013, r6, this.A07, r7.AHt());
            }
            A07(r6);
            if (r6.Aho()) {
                C46401zg.A01(this.A0D).A03(C46401zg.A00(r6), "button");
            }
            C27371Ho r1 = this.A07;
            if (r1 instanceof C30541Ug) {
                A012 = AnonymousClass6N9.A00(((C30541Ug) r1).BYO(r6));
            } else {
                A012 = AnonymousClass6N9.A01((Hashtag) null);
            }
            AnonymousClass2VA A002 = C16980pU.A00.A00().A00(r6.APo());
            A002.A05(this.A0T.equals(r6.A0c(this.A0D)));
            A002.A01(this.A07);
            A002.A00.putInt("CommentThreadFragment.MEDIA_POSITION_IN_FEED", r7.getPosition());
            A002.A00.putInt("CommentThreadFragment.MEDIA_CAROUSEL_INDEX", r7.AHt());
            A002.A00.putBoolean("CommentThreadFragment.INTENT_EXTRA_MEDIA_IS_CAROUSEL_BUMPED_POST", r7.A0m);
            A002.A00.putBoolean("CommentThreadFragment.SHOW_KEYBOARD", true);
            AnonymousClass1I6 r0 = this.A01;
            if (r0 != null) {
                A002.A02(r0);
            }
            C52362Om r22 = new C52362Om(this.A03.getActivity(), this.A0D);
            r22.A0B = true;
            r22.A08(A002.A00(), A012);
            r22.A02();
        }
    }

    public final void AxL(instagramComment r11, C36841ih r12) {
        C17850qu A012;
        boolean z = r11.A0b;
        if (z) {
            A012 = AnonymousClass6UD.A02(this.A0D, r11.AS8(), this.A07.getModuleName(), r11.A0C.A21, r12.A0m, r12.getPosition(), r12.AHt(), r11.A0C.A0i());
        } else {
            A012 = AnonymousClass6UD.A01(this.A0D, r11.AS8(), this.A07.getModuleName(), r11.A0C.A21, r12.A0m, r12.getPosition(), r12.AHt(), r11.A0C.A0i());
        }
        A012.A00 = new AnonymousClass6QD(this, r11);
        ((C12830hS) this.A03).schedule(A012);
        A03(this, r11);
        if (z) {
            this.A0I.A03(r11.A0C, r11, r12.AHt(), r12.getPosition());
        } else {
            this.A0I.A02(r11.A0C, r11, r12.AHt(), r12.getPosition());
        }
    }

    public final void B00(AnonymousClass1NJ r12, C36841ih r13) {
        AnonymousClass1NJ r2;
        if (!(!AnonymousClass1H4.A01(this.A04))) {
            AnonymousClass1NJ r4 = r12;
            if (r12.A1W()) {
                r2 = r12.A0P(r13.AHt());
            } else {
                r2 = r12;
            }
            String A072 = C30671Ut.A07(this.A0D, r2);
            if (A072 != null) {
                A0F(r2, r13, true, A072);
                return;
            }
            String A052 = C30671Ut.A05(this.A0D, r2);
            if (A052 != null) {
                A0F(r2, r13, false, A052);
            } else {
                C36901in.A08(AnonymousClass0WN.A01(this.A0D), r4, this.A07, new C37111j8(this.A0D, r2, r13), "disclaimer_click_failure", C30671Ut.A06(this.A0D, r2), (String) null, (String) null);
            }
        }
    }

    public final void B0Y(AnonymousClass1NJ r2, C36841ih r3, int i, C36411i0 r5) {
        if (r5.A0G.A08()) {
            A0B(r2, r3, i, r5.A02);
        }
    }

    public void B0b(AnonymousClass1NJ r2, C36841ih r3, int i, C44461wC r5) {
        if (r5.A02.A08()) {
            A0B(r2, r3, i, r5.A03);
        }
    }

    public void B0c(AnonymousClass1NJ r2, C36841ih r3, int i, AnonymousClass2Z9 r5) {
        A0B(r2, r3, i, r5.A01);
    }

    public void B0e(AnonymousClass1NJ r10, C36841ih r11, int i, C32151ag r13) {
        if (r13.A0D.A08()) {
            A0B(r10, r11, i, r13.A07);
            AnonymousClass2LS.A00(r10, r11, r13.A0E, this.A0D, this.A07, true, this, this.A0W);
        }
    }

    public final void B48(Bitmap bitmap, AnonymousClass1NJ r3) {
        AnonymousClass1LO r0;
        if (bitmap != null && (r0 = this.A0F) != null) {
            r0.A04(r3);
        }
    }

    public void B4F(AnonymousClass1NK r4) {
        AnonymousClass1RA r2 = this.A08;
        r2.A03 = true;
        if (r4 instanceof AnonymousClass1NJ) {
            r2.A09.put(r4, new AnonymousClass6Q2(this));
        }
        this.A08.A0A();
    }

    public final void B5o(AnonymousClass1NJ r5) {
        AnonymousClass2OA r3 = new AnonymousClass2OA(this.A03.getActivity());
        C38091ki r1 = r5.A0N;
        r3.A03 = r1.A04;
        String str = r1.A02;
        if (!str.isEmpty()) {
            r3.A0M(str);
        }
        C38091ki r2 = r5.A0N;
        if (r2.A00 == C49042Am.APPEALABLE) {
            r3.A0O((String) r2.A05.get(0), new C109914oO(this, r5));
            r3.A0P((String) r5.A0N.A05.get(1), new C109904oN(this, r5));
        }
        r3.A03().show();
    }

    public final void B5p(AnonymousClass1NJ r4) {
        AnonymousClass0C1 r2 = this.A0D;
        C27371Ho r1 = this.A07;
        Integer num = Constants.A0C;
        C168297Gq.A01(r2, r4, r1, num, num);
        A0G(r4, "com.instagram.misinformation.fact_check_sheet.action", (AnonymousClass2U6) null);
    }

    public final void B6u(AnonymousClass1NJ r4, C36841ih r5) {
        this.A0L.BKm(r4, r5, r5.getPosition(), this.A0L);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a2, code lost:
        if (r3.equals("video_view") == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01ad, code lost:
        if (r3.equals("self_profile") == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b7, code lost:
        if (r3.equals("photo_view") == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c1, code lost:
        if (r3.equals("media_view") == false) goto L_0x017e;
     */
    public final void B7W(AnonymousClass1NJ r9) {
        char c;
        C22290yA r2;
        AnonymousClass0C1 r3;
        String id;
        if (this.A03.getActivity() != null) {
            boolean z = false;
            if (!((Boolean) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.PROMOTION_INSIGHTS_BLOKS, "is_bloks_enabled", false, (AnonymousClass04H) null)).booleanValue() || AnonymousClass1BX.A00((String) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.PROMOTION_INSIGHTS_BLOKS, "bloks_app_id", "com.instagram.promote.screens.promotion_insights", (AnonymousClass04H) null))) {
                if (r9.A1d()) {
                    id = r9.A28.split("_")[0];
                    r2 = C22290yA.A00;
                    r3 = this.A0D;
                } else {
                    if (this.A0T.A0P()) {
                        if (!Arrays.asList(new C34101e2[]{C34101e2.NOT_BOOSTED, C34101e2.UNAVAILABLE, C34101e2.UNKNOWN}).contains(r9.A0M())) {
                            r2 = C22290yA.A00;
                            r3 = this.A0D;
                            id = r9.getId();
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("ARG.mediaId", r9.APo());
                    if (r9.A0M() != C34101e2.UNAVAILABLE && r9.A0c(this.A0D).A0Q()) {
                        z = true;
                    }
                    bundle.putBoolean("ARG.isPromoteAvailable", z);
                    ArrayList A0x = r9.A0x();
                    if (A0x != null) {
                        bundle.putParcelableArrayList("ARG.taggedProducts", A0x);
                    }
                    bundle.putString("ARG.mediaOwnerUsername", r9.A0c(this.A0D).AZn());
                    AnonymousClass00B.A01.markerStart(39124994);
                    C96 c96 = new C96();
                    c96.setArguments(bundle);
                    AnonymousClass2TH r22 = new AnonymousClass2TH(this.A0D);
                    r22.A03 = this.A03.getContext().getResources().getDimensionPixelSize(C0003R.dimen.post_insights_bottomsheet_height);
                    r22.A0T = true;
                    r22.A0H = new C149636ah(this);
                    r22.A0F = c96;
                    AnonymousClass2TI A002 = r22.A00();
                    c96.A08 = A002;
                    A002.A01(this.A03.getContext(), c96);
                    this.A05.A04(new C149706ao(true));
                    AnonymousClass0C1 r4 = this.A0D;
                    String moduleName = this.A07.getModuleName();
                    switch (moduleName.hashCode()) {
                        case -1617792023:
                            c = 2;
                            break;
                        case -815402058:
                            c = 0;
                            break;
                        case -507525998:
                            c = 1;
                            break;
                        case 1939919392:
                            c = 3;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        moduleName = "profile";
                    } else if (c == 1 || c == 2 || c == 3) {
                        moduleName = "p_page";
                    }
                    C27355CAa.A02(r4, "view_insights_button", moduleName, C14100jl.A01(this.A0D));
                    return;
                }
                r2.A01(r3, id, this.A03.getContext().getString(C0003R.string.insights), "business_ribbon", this.A03.getActivity());
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("media_id", r9.APo().split("_")[0]);
            C52362Om r42 = new C52362Om(this.A03.getActivity(), this.A0D);
            AnonymousClass0C1 r23 = this.A0D;
            C139165x9 r32 = new C139165x9(r23);
            r32.A03((String) AnonymousClass0L6.A02(r23, AnonymousClass0L7.PROMOTION_INSIGHTS_BLOKS, "bloks_app_id", "com.instagram.promote.screens.promotion_insights", (AnonymousClass04H) null));
            r32.A05(hashMap);
            r32.A04("insights");
            r42.A02 = r32.A02();
            r42.A02();
        }
    }

    public void B8o(AnonymousClass1NJ r7, int i, AnonymousClass0RN r9, String str) {
        C163636yU.A00(this.A03.getActivity(), C28511Ma.A00(r9), this.A0D, r7, i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r6.A0D, p000X.AnonymousClass0L7.INTERACTIONS_SHOW_BIG_HEART_ANIM_FOR_LIKE_UFI_CLICK, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0032;
     */
    public void B92(AnonymousClass1NJ r21, C36841ih r22, int i, String str, View view) {
        boolean z;
        Integer num;
        AnonymousClass2F2 r0;
        AnonymousClass1NJ r8 = r21;
        A08(r8);
        if (C36461i5.A00(this.A0D).A02(r8.A0N())) {
            z = true;
        }
        z = false;
        C36841ih r2 = r22;
        r2.A0P(C26611Ee.A00(this.A0D).A0K(r8), false, z);
        if (C36461i5.A00(this.A0D).A02(r8.A0N()) && !C26611Ee.A00(this.A0D).A0K(r8) && ((Boolean) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.DAISY_HAPTICS_AB_TEST_UNIVERSE_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            View view2 = view;
            view2.setHapticFeedbackEnabled(true);
            view2.performHapticFeedback(1);
        }
        Context context = this.A03.getContext();
        int AHt = r2.AHt();
        int i2 = r2.A08;
        if (C26611Ee.A00(this.A0D).A0K(r8)) {
            num = Constants.ONE;
        } else {
            num = Constants.ZERO;
        }
        Integer num2 = Constants.ZERO;
        C27371Ho r14 = this.A07;
        FragmentActivity activity = this.A03.getActivity();
        AnonymousClass0C1 r5 = this.A0D;
        AnonymousClass1I6 r4 = this.A01;
        boolean z2 = r2.A0m;
        if (!this.A0E || this.A0C == null || r2.A0E != C17070pd.MAIN_FEED) {
            r0 = null;
        } else {
            r0 = new AnonymousClass2F2(this, r8);
        }
        AnonymousClass2F3.A00(context, r8, i, AHt, i2, num, num2, r14, activity, r5, r4, z2, r0);
        if (C17050pb.A08(r8, r2.AHt())) {
            boolean z3 = false;
            if (r8.A1R == num2) {
                z3 = true;
            }
            if (z3) {
                r2.A0O(true, true);
                r2.A0P = "like_media";
            }
        }
    }

    public final void BA7() {
        this.A0B.A0A();
    }

    public final void BA8(float f) {
        float min;
        AnonymousClass1RS r5 = this.A0B.A0T;
        C45871yi r2 = r5.A02;
        if (r2 != null && r5.A0M && r5.A05 == Constants.ONE) {
            r2.A07.APf().removeCallbacks(r5.A0J);
            r5.A02.A07.APf().removeCallbacks(r5.A0I);
            r5.A02.A07.APf().postDelayed(r5.A0J, 2000);
            C45891yk r4 = r5.A03;
            r4.A01 = f;
            int i = r4.A02;
            int i2 = r4.A03;
            if (i2 == 0) {
                min = (float) r4.A07;
            } else {
                float f2 = (float) (i / i2);
                float f3 = (float) r4.A06;
                min = Math.min(Math.max(Math.min((f - f3) / f2, ((((float) r4.A07) - f) - f3) / (1.0f - f2)), (float) r4.A05), (float) r4.A04);
            }
            r4.A00 = min;
            C45871yi r1 = r5.A02;
            MediaActionsView APf = r1.A07.APf();
            C37671k2 A0e = r1.A00().A0e();
            View view = APf.A04;
            if (view != null) {
                view.setHapticFeedbackEnabled(true);
                APf.A04.performHapticFeedback(0);
                MediaActionsView.A03(APf, true);
                if (APf.A0H) {
                    if (APf.A0D == null) {
                        APf.A0D = (ScrubberPreviewThumbnailView) APf.A09.inflate();
                    }
                    APf.A0D.setVisibility(4);
                    ScrubberPreviewThumbnailView scrubberPreviewThumbnailView = APf.A0D;
                    ThumbView thumbView = scrubberPreviewThumbnailView.A02;
                    if (thumbView != null) {
                        thumbView.A03(A0e);
                        scrubberPreviewThumbnailView.A02.setScrubberThumbnailCallback(scrubberPreviewThumbnailView);
                    }
                } else {
                    MediaActionsView.A04(APf, true);
                }
            }
            r5.A05 = Constants.A0C;
        }
    }

    public final void BA9(float f) {
        AnonymousClass1RJ r1 = this.A0B;
        r1.A0F = false;
        AnonymousClass1RS r2 = r1.A0T;
        C45871yi r4 = r2.A02;
        if (r4 != null && r2.A0M) {
            Integer num = r2.A05;
            if (num == Constants.A0C || num == Constants.A0N) {
                int A002 = r2.A03.A00(f);
                if (r4 != null && ((AnonymousClass1NJ) r4.A03).Aho()) {
                    if (r2.A0A) {
                        r4.A06 = A002;
                    }
                    if (r2.A08) {
                        r4.A05 = A002;
                    }
                }
                r2.A04.A0E(A002, true);
                AnonymousClass1RS.A08(r2, "resume", true);
                r2.A02.A07.APf().A05();
                r2.A05 = Constants.ZERO;
            }
        }
    }

    public final void BAA(float f) {
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView;
        AnonymousClass1RS r3 = this.A0B.A0T;
        C45871yi r2 = r3.A02;
        if (r2 != null && r3.A0M) {
            Integer num = r3.A05;
            if (num == Constants.A0C || num == Constants.A0N) {
                switch (num.intValue()) {
                    case 2:
                        MediaActionsView APf = r2.A07.APf();
                        if (APf.A04 != null) {
                            if (APf.A0H && (scrubberPreviewThumbnailView = APf.A0D) != null) {
                                scrubberPreviewThumbnailView.setVisibility(0);
                            }
                            C32131ad.A00(APf.A05, 100, false);
                            APf.A02.startTransition(100);
                            APf.A0G = true;
                        }
                        r3.A05 = Constants.A0N;
                        break;
                    case 3:
                        break;
                    default:
                        return;
                }
                r3.A02.A07.APf().A07(r3.A03.A00(f));
            }
        }
    }

    public final void BAB(String str) {
        AnonymousClass1RJ r1 = this.A0B;
        r1.A0F = true;
        AnonymousClass1RS r3 = r1.A0T;
        if (r3.A02 != null && r3.A0M && r3.A04.A0A.A0d()) {
            C45871yi r2 = r3.A02;
            if (((AnonymousClass1NJ) r2.A03).APo().equals(str)) {
                if (r3.A05 != Constants.ZERO) {
                    r2.A07.APf().A05();
                }
                r3.A0L("seek");
                if (((AnonymousClass1NJ) r3.A02.A03).Aho() && r3.A04.A0O()) {
                    if (r3.A0A) {
                        AnonymousClass1RS.A07(r3);
                    }
                    if (r3.A08) {
                        AnonymousClass1RS.A06(r3);
                    }
                }
                MediaActionsView APf = r3.A02.A07.APf();
                if (APf.A04 != null) {
                    C32131ad.A00(APf.A06, 250, false);
                    if (APf.A0B == null) {
                        APf.A0B = (ProgressBar) APf.A08.inflate();
                        MediaActionsView.A02(APf);
                    }
                    if (APf.A03 == null) {
                        APf.A03 = APf.A07.inflate();
                    }
                    C32131ad.A00(APf.A0B, 100, true);
                    C32131ad.A00(APf.A03, 100, true);
                }
                r3.A05 = Constants.ONE;
            }
        }
    }

    public final void BAZ(AnonymousClass1NJ r2, IgProgressImageView igProgressImageView) {
        AnonymousClass1LO r0 = this.A0F;
        if (r0 != null) {
            r0.A07(r2, igProgressImageView);
        }
    }

    public final void BAx(AnonymousClass1NJ r9) {
        String str;
        FragmentActivity activity;
        String str2;
        String str3;
        String str4;
        C49052An r0 = r9.A0h;
        if (r0 == null || r0.A00() == null) {
            AnonymousClass0QD.A02("onMediaOverlayCTAClick", "Media has no overlay banner!");
            return;
        }
        C49062Ao A002 = r9.A0h.A00();
        if (A002.A01.intValue() == 0 && (str = A002.A03) != null && (activity = this.A03.getActivity()) != null) {
            AnonymousClass2UC r3 = new AnonymousClass2UC(activity, this.A0D, str, AnonymousClass2UD.MEDIA_OVERLAY_CTA);
            r3.A03(this.A0D.A04());
            r3.A04(((AnonymousClass0RN) this.A03).getModuleName());
            r3.A01();
            AnonymousClass0C1 r02 = this.A0D;
            C27371Ho r7 = this.A07;
            C49052An r6 = r9.A0h;
            if (r6 != null && A002 != null) {
                C91843yC r32 = new C91843yC(AnonymousClass0QT.A00(r02, r7).A02("instagram_media_overlay"));
                if (r32.A0B()) {
                    r32.A08("client_event_name", "action");
                    r32.A08("container_module", r7.getModuleName());
                    r32.A07("entity_id", Long.valueOf(Long.parseLong(r9.A27)));
                    r32.A08("overlay_type", "COVID_19_BOTTOM_BANNER");
                    if (r6.A00.intValue() != 0) {
                        str2 = null;
                    } else {
                        str2 = "BOTTOM_BANNER";
                    }
                    r32.A08("overlay_layout_type", str2);
                    if (A002.A01.intValue() != 0) {
                        str3 = null;
                    } else {
                        str3 = "OPEN_EXTERNAL_URL";
                    }
                    r32.A08("action", str3);
                    if (A002.A02.intValue() != 0) {
                        str4 = null;
                    } else {
                        str4 = "BANNER";
                    }
                    r32.A08("source_of_action", str4);
                    r32.A08("action_url", A002.A03);
                    r32.A01();
                }
            }
        }
    }

    public final void BBl(AnonymousClass1NJ r5) {
        C168297Gq.A01(this.A0D, r5, this.A07, Constants.ZERO, Constants.A0C);
        A0G(r5, "com.instagram.misinformation.fact_check_sheet.action", (AnonymousClass2U6) null);
    }

    public final void BE7(AnonymousClass1NJ r8, C38691lg r9) {
        if (this.A03.getActivity() != null) {
            boolean z = false;
            if (C38721lj.A00(r8, this.A0D) == Constants.ONE) {
                z = true;
            }
            AnonymousClass0a4.A09(z);
            AnonymousClass1HD r4 = this.A03;
            C27371Ho r6 = this.A07;
            AnonymousClass0C1 r5 = this.A0D;
            Bundle bundle = new Bundle();
            bundle.putString("media_id", r8.getId());
            bundle.putSerializable("media_type", r8.APx());
            bundle.putString("prior_module", r6.getModuleName());
            bundle.putParcelableArrayList("tagged_people", r8.A10());
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken());
            C151646e3 r3 = new C151646e3();
            r3.setArguments(bundle);
            C26441Dh.A00(r5).A07(r6, r4.mFragmentManager.A0I(), (String) null);
            AnonymousClass2TH r2 = new AnonymousClass2TH(r5);
            boolean AiO = r8.AiO();
            int i = C0003R.string.title_tags_photo;
            if (AiO) {
                i = C0003R.string.title_tags_video;
            }
            r2.A0L = r4.getString(i);
            r2.A0F = r3;
            if (r9 != null) {
                r2.A0H = r9;
            }
            r2.A00().A02(r4.getActivity(), r3);
        }
    }

    public final void BF6() {
        this.A08.BE0();
    }

    public final void BFm(ProductFeedItem productFeedItem, int i, int i2, C06270Ok r25, String str, C215309Ps r27, int i3, String str2) {
        Product product;
        if (r25 == null) {
            C06270Ok.A00();
        }
        ProductFeedItem productFeedItem2 = productFeedItem;
        ProductTile productTile = productFeedItem2.A03;
        if (productTile != null) {
            product = productTile.A00;
        } else {
            product = productFeedItem2.A00;
        }
        AnonymousClass0C1 r6 = this.A0D;
        C27371Ho r7 = this.A07;
        AnonymousClass9RJ A002 = new C30661Us(r6, r7, this.A0W, (String) null, (String) null, r7.getModuleName(), (String) null, (ExploreTopicCluster) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C219489d9) null, (Long) null).A00(productFeedItem2, i, i2);
        A002.A01(r27);
        A002.A02(str2, Integer.valueOf(i3));
        A002.A00();
        C17510qM r4 = C17510qM.A00;
        FragmentActivity activity = this.A03.getActivity();
        AnonymousClass0a4.A06(activity);
        AnonymousClass0C1 r3 = this.A0D;
        r4.A0Q(activity, product, r3, this.A07, str, this.A0W).A02();
    }

    public final void BFt(C215309Ps r10, Product product, C195188Xa r12) {
        C17510qM r1 = C17510qM.A00;
        AnonymousClass1HD r0 = this.A03;
        FragmentActivity activity = r0.getActivity();
        Context context = r0.getContext();
        AnonymousClass0C1 r4 = this.A0D;
        C27371Ho r5 = this.A07;
        AnonymousClass8XV A002 = r1.A0B(activity, context, r4, r5, this.A0W, r5.getModuleName(), (String) null).A00(product, product.A02.A02, (AnonymousClass1NJ) null, Constants.ZERO);
        String id = r10.getId();
        A002.A04 = id;
        A002.A06 = id;
        A002.A02 = r12;
        A002.A00();
    }

    public final void BG4(AnonymousClass1NJ r10, Merchant merchant, C36841ih r12, C38691lg r13) {
        AnonymousClass1RO r1;
        if (this.A03.getActivity() != null) {
            AnonymousClass1NJ r5 = r10;
            C36841ih r6 = r12;
            if (!r10.A0Q(this.A0D).Aho() || r10.A0w().size() != 1 || !((Boolean) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.SHOPPING_ADS_PILL_BUTTON_TO_PDP, "enable_ads", false, (AnonymousClass04H) null)).booleanValue()) {
                C17510qM.A00.A0t(this.A03.getActivity(), this.A07, this.A0D, r5, r6, this.A0W, r13);
            } else {
                C17510qM.A00.A0s(this.A03.getActivity(), this.A07, this.A0D, r5, r6);
            }
            AnonymousClass0C1 r2 = this.A0D;
            C154446ij r3 = (C154446ij) r2.AVA(C154446ij.class, new C154456ik(r2));
            C36841ih r22 = r3.A01;
            if (!(r22 == null || (r1 = r3.A00) == null)) {
                r22.A0C(r1, false);
            }
            r3.A01 = null;
            r3.A00 = null;
        }
    }

    public final void BGW(AnonymousClass1NJ r5, C36841ih r6, View view, String str, String str2, String str3, String str4) {
        if (!(!AnonymousClass1H4.A01(this.A04))) {
            if (r5.A1d()) {
                AnonymousClass0C1 r3 = this.A0D;
                AnonymousClass0P4 A002 = AnonymousClass6F9.A00(Constants.A0Y);
                A002.A0G("step", "promotion_media");
                AnonymousClass0WN.A01(r3).BcG(A002);
            } else {
                switch (r5.A0M().ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 5:
                        if (!r6.A0x) {
                            BoY(r5, r6, view, Constants.ZERO);
                            return;
                        }
                        return;
                    default:
                        AnonymousClass2VK A012 = C18360rj.A00.A01(r5.APo(), str, this.A0D, this.A03.getContext());
                        A012.A08 = str4;
                        A012.A0B = str2;
                        A012.A0C = str3;
                        A012.A01();
                        return;
                }
            }
            AnonymousClass609.A00(this.A03.getActivity(), this.A0D);
        }
    }

    public final void BJE(AnonymousClass1NJ r6, View view, int i) {
        if (this.A00 == null) {
            AnonymousClass0a4.A0B(this.A09 instanceof AnonymousClass2KI, "To Support comment lazy loading, implement MediaListProviderAdapter for your adapter");
            this.A00 = new AnonymousClass2XK((C12830hS) this.A03, this.A06, this.A0D, (AnonymousClass2KI) this.A09);
        }
        AnonymousClass2XK r3 = this.A00;
        String A0E2 = AnonymousClass000.A0E("shop_entry_point_impression_", r6.getId());
        C28051Kf r2 = r3.A02;
        C30231Ta A002 = AnonymousClass1TY.A00(r6, Integer.valueOf(i), A0E2);
        A002.A00(r3.A01);
        r2.A03(view, A002.A02());
    }

    public final void BKD(AnonymousClass1NJ r4) {
        AnonymousClass0C1 r2 = this.A0D;
        C27371Ho r1 = this.A07;
        Integer num = Constants.ONE;
        C168297Gq.A01(r2, r4, r1, num, num);
        C36971iu.A00(this.A0D, r4);
        this.A09.AqE(r4);
    }

    public void BKm(AnonymousClass1NJ r2, C36841ih r3, int i, AnonymousClass1U3 r5) {
        this.A0L.BKm(r2, r3, i, r5);
    }

    public void BKn(AnonymousClass1NJ r2, C36841ih r3, int i) {
        this.A0L.BKn(r2, r3, i);
    }

    public final void BKw(C38511lO r5, AnonymousClass1NJ r6, C36841ih r7, int i, MediaFrameLayout mediaFrameLayout) {
        boolean z = false;
        if (this.A0S.A07.A08 == Constants.ONE) {
            z = true;
        }
        if (!z && (mediaFrameLayout.getParent() instanceof C31831a3)) {
            C29791Rg r2 = this.A0S;
            r2.A00 = r7.AHt();
            r2.A01 = i;
            r2.A03 = r6;
            r2.A02 = System.currentTimeMillis();
            r2.A07.A03((C31831a3) mediaFrameLayout.getParent(), mediaFrameLayout, r5);
        }
    }

    public final void BMQ(AnonymousClass1NJ r3, C36841ih r4, int i) {
        A0G(r3, "com.instagram.ecosa.sensitive_reshare_friction.action", new C30581Df8(this, r3, r4, i));
    }

    public void BMo(AnonymousClass1NJ r14, C36841ih r15, int i) {
        boolean z;
        boolean z2;
        String str;
        C58022fB r5;
        C06270Ok r0;
        AnonymousClass1HD r1 = this.A03;
        if (r1.getActivity() == null) {
            z = false;
        } else {
            View view = r1.mView;
            if (view != null) {
                C06220Of.A0E(view);
            }
            z = true;
        }
        if (z) {
            AnonymousClass0C1 r2 = this.A0D;
            AnonymousClass52E r3 = (AnonymousClass52E) r2.AVA(AnonymousClass52E.class, new C1173152b(r2));
            long currentTimeMillis = System.currentTimeMillis();
            if (r3.A02) {
                r3.A00 = currentTimeMillis;
            }
            AnonymousClass1NJ r8 = r14;
            boolean z3 = false;
            if (r14.AiO() || ((r14.A1X() && r14.A0O().AiO()) || (r14.A1W() && r14.A0P(r15.AHt()) != null && r14.A0P(r15.AHt()).AiO()))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && ((Boolean) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.FEED_VIDEO_SHARE_AUTOPLAY_FIX, "should_stop_video_after_share", false, (AnonymousClass04H) null)).booleanValue()) {
                z3 = true;
            }
            if (z3) {
                this.A0B.A0T.A0L("share");
            }
            C06270Ok r12 = null;
            C36901in.A0L(this.A0D, "share_button", this.A01, r8, this.A07, r15.AHt(), Integer.valueOf(i), (Integer) null);
            AnonymousClass0C1 r52 = this.A0D;
            AnonymousClass1I6 r02 = this.A01;
            if (r02 != null) {
                str = r02.AVo();
            } else {
                str = null;
            }
            C104494fI.A02(r52, r14, str, (AnonymousClass0RN) this.A03, (Integer) null);
            if (r14.A1a()) {
                r5 = C58022fB.FELIX_SHARE;
            } else {
                r5 = C58022fB.MEDIA_SHARE;
            }
            C103844eE A022 = C19020sn.A00.A04().A02(this.A0D, r5, this.A07);
            A022.A02(r14.getId());
            A022.A01(this.A07);
            A022.A00.putInt("DirectShareSheetFragment.carousel_index", r15.AHt());
            String str2 = this.A0X;
            if (str2 != null) {
                A022.A00.putString("DirectShareSheetFragment.prioritized_thread_key", str2);
            }
            C27371Ho r13 = this.A07;
            if (r13 instanceof C30541Ug) {
                r0 = ((C30541Ug) r13).BYO(r14);
                r12 = r0;
            } else {
                r0 = null;
            }
            if (r0 != null) {
                A022.A00.putSerializable("DirectShareSheetFragment.analytics_extras", AnonymousClass0RA.A04(r12));
            }
            C27341Hl A002 = A022.A00();
            C31221Wz A012 = C31201Wx.A01(this.A03.getContext());
            A012.A07(new C149596ad(this, z3));
            A012.A0F(A002);
            if (r14.Aho()) {
                C22760yx.A00(this.A0D).A00.A5H(C35051fj.A00, C46401zg.A00(r14), "share");
            }
            if (C17050pb.A08(r14, r15.AHt())) {
                r15.A0O(true, true);
            }
            this.A05.A04(new C149706ao(true));
        }
    }

    public void BN9(AnonymousClass1NJ r2, C36841ih r3) {
        this.A08.A09.remove(r2);
        r3.A0K = Constants.A08;
        this.A09.AqE(r2);
    }

    public final void BNP(String str) {
        List<C13300iJ> list;
        if (!(!AnonymousClass1H4.A01(this.A04)) && (list = (List) AnonymousClass6SU.A00(this.A0D).A00.get(str)) != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C13300iJ id : list) {
                arrayList.add(id.getId());
            }
            C52362Om r2 = new C52362Om(this.A03.getActivity(), this.A0D);
            r2.A0B = true;
            r2.A02 = C17530qO.A00.A00().A06(this.A0D, str, arrayList);
            r2.A02();
        }
    }

    public final void BNQ(C13300iJ r7) {
        if (!(!AnonymousClass1H4.A01(this.A04))) {
            C52362Om r5 = new C52362Om(this.A03.getActivity(), this.A0D);
            r5.A0B = true;
            C52892Qp A002 = C18980sj.A00.A00();
            C52902Qq A012 = C52902Qq.A01(this.A0D, r7.getId(), "feed_similar_accounts_user", this.A07.getModuleName());
            A012.A0B = this.A0W;
            r5.A02 = A002.A02(A012.A03());
            r5.A02();
        }
    }

    public final void BNW(AnonymousClass1NJ r5, C36841ih r6, int i, C36411i0 r8) {
        AnonymousClass0C1 r2 = this.A0D;
        C37141jB A012 = C37591ju.A01("collection_main_media_tap", r5, this.A07);
        A012.A0B(r2, r5);
        A012.A4g = C215779Rt.A00(Constants.A0Y);
        C36901in.A0H(this.A0D, A012, r5, this.A07, r6.AHt());
        if (r8.A0G.A08()) {
            AnonymousClass1NJ A0O2 = r5.A0O();
            if (C17050pb.A08(r5, r6.AHt()) && !A0O2.AiO()) {
                r8.A05.startAnimation(r8.A07);
                r6.A0P = "tap_media";
            }
            if (A0O2.APx() == MediaType.VIDEO) {
                this.A0B.A0C(r5, r6, i, r8);
            }
        }
    }

    public void BNb(AnonymousClass1NJ r20, C36841ih r21, int i, C44461wC r23) {
        C44461wC r3 = r23;
        if (r3.A02.A08()) {
            C36841ih r12 = r21;
            AnonymousClass1NJ r7 = r20;
            C36901in.A0L(this.A0D, "media_tap", (AnonymousClass1I6) null, r7, this.A07, r12.AHt(), Integer.valueOf(i), (Integer) null);
            AnonymousClass1NJ A0P2 = r7.A0P(r12.AHt());
            if (C17050pb.A08(r7, r12.AHt())) {
                r12.A0O(!r12.A0a, true);
                r12.A0P = "tap_media";
            }
            AnonymousClass2LS.A00(A0P2, r12, r3.A04, this.A0D, this.A07, false, this, this.A0W);
        }
    }

    public void BNc(AnonymousClass1NJ r9, C36841ih r10, int i, AnonymousClass2Z9 r12) {
        C36901in.A0L(this.A0D, "media_tap", (AnonymousClass1I6) null, r9, this.A07, r10.AHt(), Integer.valueOf(i), (Integer) null);
        if (C17050pb.A08(r9, r10.AHt())) {
            r10.A0O(!r10.A0a, true);
            r10.A0P = "tap_media";
        }
    }

    public void BNd(AnonymousClass1NJ r9, C36841ih r10, int i, AnonymousClass24E r12) {
        C36901in.A0L(this.A0D, "media_tap", (AnonymousClass1I6) null, r9, this.A07, r10.AHt(), Integer.valueOf(i), (Integer) null);
        this.A0B.A0C(r9, r10, i, r12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (r7.A1L() == false) goto L_0x0076;
     */
    public void BNe(AnonymousClass1NJ r20, C36841ih r21, int i, C32151ag r23) {
        boolean z;
        if (this.A03.getActivity() != null) {
            C32151ag r2 = r23;
            if (r2.A0D.A08()) {
                C36841ih r12 = r21;
                int i2 = i;
                AnonymousClass1NJ r7 = r20;
                C36901in.A0L(this.A0D, "media_tap", (AnonymousClass1I6) null, r7, this.A07, r12.AHt(), Integer.valueOf(i2), (Integer) null);
                if (C17050pb.A08(r7, r12.AHt()) && !r7.AiO()) {
                    r12.A0O(!r12.A0a, true);
                    if (r12.A0a) {
                        r12.A0P = "tap_media";
                    }
                }
                if (r7.APx() == MediaType.PHOTO) {
                    AnonymousClass2LS.A00(r7, r12, r2.A0E, this.A0D, this.A07, false, this, this.A0W);
                    return;
                }
                if (r7.AiO()) {
                    z = true;
                }
                z = false;
                if (z && AnonymousClass23U.A00(r7, r12, this.A03.getContext(), this.A0D).first != null) {
                    r12.A0N(true);
                }
                this.A0B.A0C(r7, r12, i2, r2);
            }
        }
    }

    public final void BOE(String str, String str2, int i, String str3, C29261Pf r19, String str4) {
        if (!(!AnonymousClass1H4.A01(this.A04))) {
            String str5 = "inappropriate";
            String str6 = str2;
            String str7 = str;
            switch (r19.ordinal()) {
                case 1:
                    int i2 = i;
                    if (str3 == null) {
                        C52362Om r2 = new C52362Om(this.A03.getActivity(), this.A0D);
                        r2.A02 = AnonymousClass2UZ.A00().A0L(str, i2, str6, "hide_button", str4);
                        r2.A02();
                    }
                    AnonymousClass0C1 r1 = this.A0D;
                    AnonymousClass0RU A012 = AnonymousClass0WN.A01(r1);
                    C27371Ho r5 = this.A07;
                    if (str3 != null) {
                        str5 = str3;
                    }
                    C36901in.A0G(r1, A012, str7, str6, r5, i2, str5, "hide_button");
                    return;
                case 15:
                    if (str3 == null) {
                        C52362Om r22 = new C52362Om(this.A03.getActivity(), this.A0D);
                        r22.A0B = true;
                        r22.A02 = AnonymousClass2UZ.A00().A0M(str, str6);
                        r22.A02();
                    }
                    AnonymousClass0C1 r12 = this.A0D;
                    if (str3 != null) {
                        str5 = str3;
                    }
                    C154226iN.A01(r12, str, str5, str6, this.A07);
                    return;
                default:
                    return;
            }
        }
    }

    public final void BRq() {
        this.A09.AE6();
    }

    public final void BVG() {
        this.A0B.A0A();
    }

    public final void BVu(C215309Ps r11, Merchant merchant) {
        C17510qM.A00.A0S(this.A03.getActivity(), this.A0D, "shopping_feed_product_pivots", this.A07, this.A0W, (String) null, ((AnonymousClass9VP) r11).A01(), merchant).A02();
    }

    public final void BY3(AnonymousClass1NJ r5, C36841ih r6) {
        AnonymousClass1ST r3 = this.A0O;
        if (r3 != null) {
            C36331hs r0 = r3.A00.A00;
            if (r0 == null || !r5.equals(r0.APe())) {
                AnonymousClass1TZ r1 = new AnonymousClass1TZ(r3.A04, r5, r6, r5.getId());
                r3.A03.AqW(r1, r5, r6);
                r3.A00 = new AnonymousClass1TX(r1);
            }
        }
    }

    public final void BY4(C36331hs r7, C36841ih r8) {
        AnonymousClass1ST r5 = this.A0O;
        if (r5 != null) {
            AnonymousClass0C1 r4 = r5.A04;
            AnonymousClass1NJ APe = r7.APe();
            AnonymousClass1TZ r1 = new AnonymousClass1TZ(r4, APe, r8, APe.getId());
            r1.A00 = r7;
            r5.A03.AqW(r1, APe, r8);
            r5.A00 = new AnonymousClass1TX(r1);
        }
    }

    public final void BZi(AnonymousClass1NJ r5, View view) {
        if (C38721lj.A00(r5, this.A0D) == Constants.A0C) {
            C30581Uk r3 = this.A0Q;
            String A0E2 = AnonymousClass000.A0E("tags_list_entry_point_impression_", r5.getId());
            C28051Kf r2 = r3.A01;
            C30231Ta A002 = AnonymousClass1TY.A00(r5, (Object) null, A0E2);
            A002.A00(r3.A00);
            r2.A03(view, A002.A02());
        }
    }

    public final void BZr(View view, ProductFeedItem productFeedItem, String str) {
        this.A0R.A01(view, productFeedItem, str);
    }

    public final void BZu(View view, C215309Ps r4) {
        this.A0R.A02(view, r4, r4.getId());
    }

    public void Ba4(View view, int i, Object obj, Object obj2) {
        String A012;
        AnonymousClass1ST r3 = this.A0O;
        if (r3 != null) {
            if (obj2 instanceof C37131jA) {
                A012 = ((C37131jA) obj2).A01.AS8();
            } else {
                AnonymousClass1NJ A022 = AnonymousClass1NG.A02(obj);
                if (A022 != null) {
                    A012 = AnonymousClass1ST.A01(i, A022);
                } else {
                    throw new IllegalStateException("Tried to to register view with unknown model");
                }
            }
            r3.A03.BI4(view, i, obj, obj2);
            r3.A01.A03(view, r3.A02.A00(A012));
        }
    }

    public final void Ba8(View view, AnonymousClass1NJ r7, C36841ih r8, int i) {
        AnonymousClass1ST r4 = this.A0O;
        if (r4 != null) {
            String A0G2 = AnonymousClass000.A0G(r7.A0P(i).getId(), ":carousel_item:", i);
            C44521wI r1 = new C44521wI(r8, i);
            AnonymousClass1TZ r2 = new AnonymousClass1TZ(r4.A04, r7, r1, A0G2);
            r4.A03.AqS(r2, r7, r1);
            r4.A01.A03(view, new AnonymousClass1TX(r2));
        }
    }

    public final void Bay(AnonymousClass1NJ r2, C36841ih r3, int i, int i2) {
        this.A0L.Bay(r2, r3, i, i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final void BoY(AnonymousClass1NJ r7, C36841ih r8, View view, Integer num) {
        String str;
        int i;
        AnonymousClass1HD r3 = this.A03;
        FragmentActivity activity = r3.getActivity();
        AnonymousClass0C1 r2 = this.A0D;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                if (!TextUtils.isEmpty(r7.A1h)) {
                    str = r7.A1h;
                    break;
                } else {
                    i = C0003R.string.default_promote_unavailable_reason;
                }
            case 1:
                i = C0003R.string.promote_new_user_tooltip;
                str = r3.getString(i);
                break;
            default:
                throw new UnsupportedOperationException("tooltip type type unhandled");
        }
        str = r3.getString(i);
        View view2 = r3.mView;
        C108854mX r32 = new C108854mX(view, activity, str, r8);
        if (view2 != null) {
            switch (intValue) {
                case 0:
                    r8.A0x = true;
                    view2.post(r32);
                    return;
                case 1:
                    C16180oA.A00(r2).A00.edit().putBoolean("seen_promote_new_user_tooltip", true).apply();
                    view2.postDelayed(r32, 500);
                    return;
            }
            throw new UnsupportedOperationException("tooltip type type unhandled");
        }
    }

    public final void BsD(View view) {
        AnonymousClass1ST r0 = this.A0O;
        if (r0 != null) {
            r0.A01.A02(view);
        }
    }

    public final void BsE(AnonymousClass1NJ r2, C36841ih r3, int i, int i2) {
        this.A0L.BsE(r2, r3, i, i2);
    }

    public final void Aor(Map map) {
        if (C16170o9.A00()) {
            C16170o9.A00.A02(this.A03.getActivity(), this.A0D, "2248469498800720", map);
        }
    }

    public void Ar7(AnonymousClass1NJ r8, C36841ih r9, View view) {
        AnonymousClass1UR r1;
        AnonymousClass1UP A002 = C37201jH.A00(r8, r9.AHt(), this.A03.getContext());
        C17070pd r12 = r9.A0E;
        if ((r12 == C17070pd.SAVE_HOME || r12 == C17070pd.AD_RATING || r12 == C17070pd.SINGLE_MEDIA_FEED || r12 == C17070pd.MAIN_FEED) && A002 != null && (((r1 = A002.A00) == AnonymousClass1UR.AD_DESTINATION_APP_STORE || r1 == AnonymousClass1UR.AD_DESTINATION_DEEPLINK) && (view instanceof TextView))) {
            ((TextView) view).setText(view.getResources().getString(C0003R.string.loading));
        }
        if (AnonymousClass1UR.AD_DESTINATION_DIRECT_MESSAGE.equals(C37201jH.A00(r8, r9.AHt(), this.A03.getContext()).A00)) {
            A0H(r8, r9);
        }
        AnonymousClass0C1 r2 = this.A0D;
        FragmentActivity activity = this.A03.getActivity();
        Integer num = Constants.ZERO;
        C27371Ho r5 = this.A07;
        C37111j8 r6 = new C37111j8(r2, r8, r9);
        r6.A04 = r9.A0P;
        C215679Rh r13 = new C215679Rh(r2, activity, num, r5, r6);
        r13.A06 = r8;
        r13.A00 = r9.AHt();
        r13.A02 = r9.getPosition();
        r13.A0D = true;
        r13.A0A = this.A01.AVo();
        new C215639Rd(r13).A02();
    }

    public final void ArL(AnonymousClass1NJ r9, C36841ih r10) {
        r10.A04(r10.AHt()).A05 = true;
        AnonymousClass1UP A002 = C37201jH.A00(r9, r10.AHt(), this.A03.getContext());
        if (A002 == null) {
            AnonymousClass0QD.A01("AdsUASTag#link is null when tag is clicked", "Media Id: " + r9.APo() + "|| Ad Id: " + C30671Ut.A02(this.A0D, r9) + "|| User Id: " + this.A0D.A04() + "|| Session Id: " + this.A01.AVo() + "|| Timestamp: " + System.currentTimeMillis());
            AnonymousClass1HD r0 = this.A03;
            Context context = r0.getContext();
            if (context != null) {
                C53642Tq.A01(context, r0.getResources().getText(C0003R.string.open_link_generic_error), 0).show();
                return;
            }
            return;
        }
        if (AnonymousClass1UR.AD_DESTINATION_DIRECT_MESSAGE.equals(A002.A00)) {
            A0H(r9, r10);
        }
        AnonymousClass0C1 r3 = this.A0D;
        FragmentActivity activity = this.A03.getActivity();
        Integer num = Constants.ONE;
        C27371Ho r6 = this.A07;
        C37111j8 r7 = new C37111j8(r3, r9, r10);
        r7.A04 = r10.A0P;
        C215679Rh r2 = new C215679Rh(r3, activity, num, r6, r7);
        r2.A06 = r9;
        r2.A00 = r10.AHt();
        r2.A02 = r10.getPosition();
        r2.A0D = true;
        new C215639Rd(r2).A02();
    }

    public final void Aw2(AnonymousClass1NJ r6) {
        A07(r6);
        if (r6.Aho()) {
            C22760yx.A00(this.A0D).A00.A5H(C35051fj.A00, C46401zg.A00(r6), "location");
        }
        Integer A0j = r6.A0j();
        if (A0j == Constants.A0C) {
            AnonymousClass17V r3 = AnonymousClass17X.A00;
            FragmentActivity activity = this.A03.getActivity();
            C27371Ho r1 = this.A07;
            r3.A02(activity, r6.A0z.getId());
            AnonymousClass17V.A00(r3, r6, r1);
        } else if (A0j == Constants.ONE) {
            AnonymousClass17V r4 = AnonymousClass17X.A00;
            Context context = this.A03.getContext();
            C27371Ho r2 = this.A07;
            r4.A01(context, r6.A0g(), r6.A0h());
            AnonymousClass17V.A00(r4, r6, r2);
        }
    }

    public void B0d(AnonymousClass1NJ r2, C36841ih r3, int i, AnonymousClass24E r5) {
        if (r5.ANP().A08()) {
            A0B(r2, r3, i, r5.A0A);
        }
    }

    public void B7B(C37371jY r5, AnonymousClass1NJ r6, C36841ih r7, C32151ag r8) {
        r7.A0A(r5);
        if (r5.A00 != null) {
            if (!this.A09.Aey() && r6.AiO()) {
                this.A0B.A0B();
            }
            int byteCount = r5.A00.getByteCount() >> 10;
            AnonymousClass1LO r2 = this.A0F;
            if (r2 != null) {
                r2.A08(r6, r5.A02, byteCount, r5.A01);
            }
        }
    }

    public final void BBk(AnonymousClass1NJ r5, int i) {
        AnonymousClass1NJ A0P2 = r5.A0P(i);
        if (A0P2 == null) {
            A0P2 = r5;
        }
        AnonymousClass0C1 r2 = this.A0D;
        C27371Ho r1 = this.A07;
        Integer num = Constants.ONE;
        C168297Gq.A01(r2, A0P2, r1, num, num);
        C36971iu.A00(this.A0D, A0P2);
        if (this.A03.isVisible()) {
            this.A09.AqE(r5);
        }
    }

    public final void BBm(AnonymousClass1NJ r4, C36841ih r5, int i) {
        AnonymousClass1NJ A0P2 = r4.A0P(r5.AHt());
        if (A0P2 == null) {
            A0P2 = r4;
        }
        A0G(A0P2, "com.instagram.misinformation.sharing_friction.action", new C30580Df7(this, r4, r5, i));
    }

    public final void BIB(AnonymousClass1NJ r5) {
        if (r5.A1W()) {
            int A072 = r5.A07();
            for (int i = 0; i < A072; i++) {
                C38651lc.A00();
                C38651lc.A00.add(r5.A0P(i).APo());
            }
        }
        C38651lc.A00();
        C38651lc.A00.add(r5.APo());
        r5.A6t(this.A0D);
    }

    public final void BNX(AnonymousClass1NJ r5, C36841ih r6, int i, C36411i0 r8) {
        if (AnonymousClass6QW.A00(r5) == Constants.ZERO) {
            A0C(r5, r6, i, r8);
            return;
        }
        C92013yT r3 = new C92013yT(this.A0J.A02("instagram_ad_product_tile_tap"));
        r3.A08("a_pk", r5.A0c(this.A0D).getId());
        r3.A08("follow_status", C13300iJ.A02(r5.A0c(this.A0D).A0M));
        r3.A08("m_pk", r5.getId());
        r3.A07("m_t", Long.valueOf((long) r5.APx().A00));
        r3.A08("source_of_action", ((AnonymousClass0RN) this.A03).getModuleName());
        r3.A08("tracking_token", r5.AYw());
        r3.A07("thumbnail_index", Long.valueOf((long) i));
        r3.A01();
    }

    public final void AwA(AnonymousClass1NJ r1, C36841ih r2) {
        A0A(r1, r2);
    }

    public final void BEb(AnonymousClass1NJ r1, C36841ih r2) {
        A0A(r1, r2);
    }

    public final void B0Z(AnonymousClass1NJ r1, C36841ih r2, int i, View view) {
        A0B(r1, r2, i, view);
    }

    public final void B6x(AnonymousClass1NJ r1, int i, AnonymousClass0RN r3, String str) {
        B8o(r1, i, r3, str);
    }

    public final void B78(C37371jY r1, AnonymousClass1NJ r2, C36841ih r3, C36411i0 r4) {
        r3.A0A(r1);
    }

    public void B79(C37371jY r1, AnonymousClass1NJ r2, C36841ih r3, C44461wC r4) {
        r3.A0A(r1);
    }

    public void B7A(C37371jY r1, AnonymousClass1NJ r2, C36841ih r3, AnonymousClass24E r4) {
        r3.A0A(r1);
    }

    public C30271Te(AnonymousClass1HD r21, AnonymousClass1AM r22, C27371Ho r23, AnonymousClass1PL r24, AnonymousClass1RJ r25, AnonymousClass1S3 r26, AnonymousClass1RA r27, C29791Rg r28, AnonymousClass0C1 r29, AnonymousClass1I6 r30, AnonymousClass1LO r31, C29851Rn r32, AnonymousClass1RD r33, AnonymousClass1U2 r34, AnonymousClass1US r35, C29181Ox r36, boolean z, AnonymousClass30N r38, C28051Kf r39, AnonymousClass1ST r40, String str, String str2, AnonymousClass1LY r43) {
        this.A09 = r24;
        AnonymousClass1HD r7 = r21;
        this.A03 = r7;
        this.A04 = r22;
        C27371Ho r3 = r23;
        this.A07 = r3;
        this.A0B = r25;
        this.A0K = r26;
        this.A08 = r27;
        this.A0S = r28;
        this.A0F = r31;
        this.A0U = r32;
        AnonymousClass0C1 r6 = r29;
        this.A0D = r6;
        this.A0T = r6.A06;
        this.A01 = r30;
        this.A05 = C23300zv.A00(r6);
        this.A0N = r33;
        this.A0L = r34;
        this.A0A = r36;
        this.A0M = r38;
        this.A0P = new AnonymousClass1UY(this.A0D, new AnonymousClass1UZ(r7), (AnonymousClass0RN) this.A03);
        AnonymousClass1US r2 = r35;
        this.A0G = r2;
        FragmentActivity activity = r7.getActivity();
        AnonymousClass0C1 r4 = this.A0D;
        this.A0H = new C30571Uj(activity, r4, r2);
        this.A0Y = z;
        this.A0I = new AnonymousClass1R8(this.A07, r4, this.A01);
        this.A0J = AnonymousClass0QT.A00(r6, (AnonymousClass0RN) this.A03);
        C28051Kf r42 = r39;
        this.A06 = r42;
        this.A0O = r40;
        String str3 = str2;
        this.A0Q = new C30581Uk(r42, this.A0D, this.A07, str3);
        if (this.A01 == null) {
            this.A01 = new C67352x1(this);
        }
        this.A0R = new C30601Um(this.A06, this.A07, this.A0D, str3, (String) null, (String) null, (AnonymousClass2KX) null, (ExploreTopicCluster) null, (String) null, r3.getModuleName(), (String) null, (String) null, (String) null);
        this.A0X = str;
        this.A0W = str3;
        this.A0C = r43;
        this.A0E = ((Boolean) AnonymousClass0L6.A02(this.A0D, AnonymousClass0L7.FEED_CACHE_UPDATE, "update_on_like", false, (AnonymousClass04H) null)).booleanValue();
    }
}
