package com.instagram.creation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.actionbar.ActionButton;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.venue.Venue;
import com.instagram.p009ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.p009ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.tagging.activity.MediaTaggingInfo;
import com.instagram.tagging.model.TagSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0OX;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass1RJ;
import p000X.AnonymousClass22V;
import p000X.AnonymousClass2YM;
import p000X.AnonymousClass58B;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass6w0;
import p000X.AnonymousClass6w1;
import p000X.C05860Mt;
import p000X.C06220Of;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C107994l3;
import p000X.C111334qn;
import p000X.C11200ea;
import p000X.C1193159x;
import p000X.C122965Ox;
import p000X.C123395Qq;
import p000X.C124985Xc;
import p000X.C13300iJ;
import p000X.C133865nb;
import p000X.C144886Hm;
import p000X.C144936Hr;
import p000X.C147856Tq;
import p000X.C155516kX;
import p000X.C155526kY;
import p000X.C155876l8;
import p000X.C15890nh;
import p000X.C160306sh;
import p000X.C161156uB;
import p000X.C161216uH;
import p000X.C16160o8;
import p000X.C161696v9;
import p000X.C16180oA;
import p000X.C161956vd;
import p000X.C161986vg;
import p000X.C162006vi;
import p000X.C162016vj;
import p000X.C162026vk;
import p000X.C162036vl;
import p000X.C162046vn;
import p000X.C162056vo;
import p000X.C162066vp;
import p000X.C162076vq;
import p000X.C162086vr;
import p000X.C162096vs;
import p000X.C162106vt;
import p000X.C162116vu;
import p000X.C162156vy;
import p000X.C162176w2;
import p000X.C162206w5;
import p000X.C162226w9;
import p000X.C16230oG;
import p000X.C17050pb;
import p000X.C17510qM;
import p000X.C17850qu;
import p000X.C18510ry;
import p000X.C215299Pr;
import p000X.C23300zv;
import p000X.C26301Cs;
import p000X.C26441Dh;
import p000X.C26571Ea;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C27665CMj;
import p000X.C27666CMk;
import p000X.C27673CMr;
import p000X.C27738CPh;
import p000X.C28351Lj;
import p000X.C28654CkW;
import p000X.instagramComment;
import p000X.C32161ah;
import p000X.C32221an;
import p000X.C36841ih;
import p000X.C38311l4;
import p000X.C38781lp;
import p000X.C44441wA;
import p000X.C51522Kz;
import p000X.C52952Qw;
import p000X.C67122we;
import p000X.C67672xe;
import p000X.C67682xf;

public class EditMediaInfoFragment extends C27341Hl implements C27371Ho, AnonymousClass1HM, C27673CMr {
    public int A00 = 5;
    public Location A01;
    public Handler A02;
    public Editable A03;
    public C27666CMk A04;
    public AnonymousClass1NJ A05;
    public C36841ih A06;
    public C67682xf A07;
    public C51522Kz A08;
    public LocationSignalPackage A09;
    public Venue A0A;
    public BrandedContentTag A0B = null;
    public AnonymousClass0C1 A0C;
    public C161956vd A0D;
    public C28654CkW A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public ArrayList A0I = new ArrayList();
    public ArrayList A0J = new ArrayList();
    public HashMap A0K = new HashMap();
    public HashMap A0L = new HashMap();
    public LinkedHashMap A0M = new LinkedHashMap();
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public int A0U;
    public int A0V;
    public C26571Ea A0W;
    public C26571Ea A0X;
    public C162096vs A0Y;
    public C123395Qq A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final View.OnClickListener A0d = new C162016vj(this);
    public final View.OnLayoutChangeListener A0e = new C162206w5(this);
    public final AnonymousClass22V A0f = new C147856Tq(this);
    public final TextWatcher A0g = new C162036vl(this);
    public final C11200ea A0h = new C162026vk(this);
    public final C11200ea A0i = new C162226w9(this);
    public final C11200ea A0j = new C162156vy(this);
    public final C107994l3 A0k = new C133865nb(this);
    public final C161986vg A0l = new C162056vo(this);
    public TextView mBelowUsernameLabel;
    public IgAutoCompleteTextView mCaption;
    public TextView mExtraLocationLabel;
    public View mFailedView;
    public View mPostOverlayView;
    public View mScrollView;
    public View mTextContainer;
    public TextView mTimestamp;
    public CircularImageView mUserImageView;
    public TextView mUsername;

    public static boolean A0D(List list, List list2) {
        boolean isEmpty;
        if (list == null) {
            if (list2 == null) {
                return false;
            }
            isEmpty = list2.isEmpty();
        } else if (list2 == null) {
            return true;
        } else {
            ArrayList arrayList = new ArrayList(list);
            arrayList.removeAll(list2);
            ArrayList arrayList2 = new ArrayList(list2);
            arrayList2.removeAll(list);
            if (arrayList.isEmpty()) {
                isEmpty = arrayList2.isEmpty();
            }
        }
        return !isEmpty;
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "edit_media_info";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static C15890nh A00(Context context, AnonymousClass1NJ r6, AnonymousClass0C1 r7, String str, List list, Venue venue, int i, int i2, boolean z) {
        C15890nh r2 = new C15890nh(r7);
        r2.A09 = Constants.ONE;
        r2.A0C = C06360Ot.formatString("media/%s/edit_media/", r6.getId());
        r2.A09("caption_text", str);
        r2.A09("device_id", C05860Mt.A00(context));
        r2.A09("inventory_source", r6.A21);
        r2.A0C("is_carousel_bumped_post", z);
        r2.A06(C144936Hr.class, false);
        r2.A0G = true;
        if (i != -1) {
            r2.A09("feed_position", String.valueOf(i));
        }
        if (i2 != -1) {
            r2.A09("carousel_index", String.valueOf(i2));
        }
        try {
            String A002 = C160306sh.A00(venue);
            r2.A09("location", A002);
            if (venue != null && "facebook_events".equals(venue.A05)) {
                r2.A09("event", A002);
            }
        } catch (IOException e) {
            AnonymousClass0DB.A0G("EditMediaInfoFragment", "Unable to parse location", e);
        }
        try {
            r2.A0A(AnonymousClass0C5.$const$string(36), C155876l8.A00(list));
            return r2;
        } catch (IOException e2) {
            AnonymousClass0DB.A0G("EditMediaInfoFragment", "Unable to serialize product mentions", e2);
            return r2;
        }
    }

    public static void A03(EditMediaInfoFragment editMediaInfoFragment) {
        long j;
        C16230oG.A00.removeLocationUpdates(editMediaInfoFragment.A0C, editMediaInfoFragment.A0f);
        C16230oG.A00.cancelSignalPackageRequest(editMediaInfoFragment.A0C, editMediaInfoFragment.A0k);
        FragmentActivity activity = editMediaInfoFragment.getActivity();
        AnonymousClass0C1 r4 = editMediaInfoFragment.A0C;
        Location location = editMediaInfoFragment.A01;
        LocationSignalPackage locationSignalPackage = editMediaInfoFragment.A09;
        AnonymousClass1NJ r0 = editMediaInfoFragment.A05;
        if (r0 != null) {
            j = r0.A0k().longValue();
        } else {
            j = -1;
        }
        NearbyVenuesService.A01(activity, r4, location, locationSignalPackage, Long.valueOf(j));
    }

    public static void A06(EditMediaInfoFragment editMediaInfoFragment) {
        if (!editMediaInfoFragment.A0a) {
            editMediaInfoFragment.A0a = true;
            Activity activity = editMediaInfoFragment.getActivity();
            while (activity.getParent() != null) {
                activity = activity.getParent();
            }
            activity.getWindow().setSoftInputMode(21);
            editMediaInfoFragment.mCaption.requestFocus();
            C06220Of.A0G(editMediaInfoFragment.mCaption);
            return;
        }
        A04(editMediaInfoFragment);
    }

    public static void A07(EditMediaInfoFragment editMediaInfoFragment) {
        String str;
        BrandedContentTag brandedContentTag;
        C15890nh r3;
        boolean equals;
        boolean z;
        EditMediaInfoFragment editMediaInfoFragment2 = editMediaInfoFragment;
        if (editMediaInfoFragment2.mCaption.getText() != null) {
            str = editMediaInfoFragment2.mCaption.getText().toString();
        } else {
            str = "";
        }
        if (editMediaInfoFragment2.A05.A1R()) {
            brandedContentTag = new BrandedContentTag(editMediaInfoFragment2.A05.A0b(), editMediaInfoFragment2.A05.A1F());
        } else {
            brandedContentTag = null;
        }
        if (editMediaInfoFragment2.A05.A1U()) {
            Context context = editMediaInfoFragment2.getContext();
            AnonymousClass1NJ r12 = editMediaInfoFragment2.A05;
            AnonymousClass0C1 r11 = editMediaInfoFragment2.A0C;
            ArrayList A012 = C162116vu.A01(r11, editMediaInfoFragment2.A03);
            Venue venue = editMediaInfoFragment2.A0A;
            HashMap A12 = editMediaInfoFragment2.A05.A12();
            HashMap hashMap = editMediaInfoFragment2.A0K;
            HashMap A13 = editMediaInfoFragment2.A05.A13();
            HashMap hashMap2 = editMediaInfoFragment2.A0L;
            BrandedContentTag brandedContentTag2 = editMediaInfoFragment2.A0B;
            LinkedHashMap linkedHashMap = editMediaInfoFragment2.A0M;
            r3 = A00(context, r12, r11, str, A012, venue, editMediaInfoFragment2.A0V, editMediaInfoFragment2.A0U, editMediaInfoFragment2.A0b);
            try {
                HashMap hashMap3 = new HashMap();
                for (String str2 : A12.keySet()) {
                    List list = (List) hashMap.get(str2);
                    hashMap3.put(str2, TagSerializer.A01(list, C111334qn.A00((List) A12.get(str2), list)));
                }
                r3.A0B("children_usertags", new JSONObject(hashMap3).toString());
            } catch (IOException e) {
                AnonymousClass0DB.A0G("EditMediaInfoFragment", "Unable to parse carousel people tag", e);
            }
            try {
                HashMap hashMap4 = new HashMap();
                for (Map.Entry entry : A13.entrySet()) {
                    String str3 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    List list3 = (List) hashMap2.get(str3);
                    List list4 = list2;
                    List list5 = list3;
                    if (list2 == list3) {
                        z = true;
                    } else {
                        if (list2 == null) {
                            list4 = new ArrayList();
                        }
                        if (list3 == null) {
                            list5 = new ArrayList();
                        }
                        z = list4.equals(list5);
                    }
                    if (!z) {
                        List<ProductTag> A002 = C111334qn.A00(list2, list3);
                        for (ProductTag productTag : A002) {
                            C215299Pr.A0B(productTag.A01, r12, editMediaInfoFragment2, r11);
                        }
                        hashMap4.put(str3, TagSerializer.A00(list3, A002));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    r3.A0B("children_product_tags", new JSONObject(hashMap4).toString());
                }
            } catch (IOException e2) {
                AnonymousClass0DB.A0G("EditMediaInfoFragment", "Unable to parse carousel product tag", e2);
            }
            A02(r3, brandedContentTag, brandedContentTag2);
            r3.A0B("children_custom_accessibility_caption", new JSONObject(linkedHashMap).toString());
        } else {
            Context context2 = editMediaInfoFragment2.getContext();
            AnonymousClass1NJ r122 = editMediaInfoFragment2.A05;
            AnonymousClass0C1 r112 = editMediaInfoFragment2.A0C;
            ArrayList A013 = C162116vu.A01(r112, editMediaInfoFragment2.A03);
            Venue venue2 = editMediaInfoFragment2.A0A;
            ArrayList arrayList = editMediaInfoFragment2.A0I;
            ArrayList arrayList2 = editMediaInfoFragment2.A0J;
            BrandedContentTag brandedContentTag3 = editMediaInfoFragment2.A0B;
            String str4 = editMediaInfoFragment2.A0H;
            String moduleName = editMediaInfoFragment2.getModuleName();
            int i = editMediaInfoFragment2.A0V;
            Venue venue3 = venue2;
            int i2 = i;
            r3 = A00(context2, r122, r112, str, A013, venue3, i2, editMediaInfoFragment2.A0U, editMediaInfoFragment2.A0b);
            try {
                r3.A09("usertags", TagSerializer.A01(arrayList, C111334qn.A00(r122.A10(), arrayList)));
                r3.A09("container_module", moduleName);
            } catch (IOException e3) {
                AnonymousClass0DB.A0G("EditMediaInfoFragment", "Unable to parse people tag", e3);
            }
            r3.A0A("custom_accessibility_caption", str4);
            ArrayList A11 = r122.A11();
            if (arrayList2 != null) {
                ArrayList arrayList3 = A11;
                ArrayList arrayList4 = arrayList2;
                if (A11 == arrayList2) {
                    equals = true;
                } else {
                    if (A11 == null) {
                        arrayList3 = new ArrayList();
                    }
                    if (arrayList2 == null) {
                        arrayList4 = new ArrayList();
                    }
                    equals = arrayList3.equals(arrayList4);
                }
                if (!equals) {
                    try {
                        List<ProductTag> A003 = C111334qn.A00(A11, arrayList2);
                        for (ProductTag productTag2 : A003) {
                            C215299Pr.A0B(productTag2.A01, r122, editMediaInfoFragment2, r112);
                        }
                        r3.A09("product_tags", TagSerializer.A00(arrayList2, A003));
                    } catch (IOException e4) {
                        AnonymousClass0DB.A0G("EditMediaInfoFragment", "Unable to parse product tag", e4);
                    }
                }
            }
            A02(r3, brandedContentTag, brandedContentTag3);
        }
        C17850qu A032 = r3.A03();
        A032.A00 = new AnonymousClass6w1(editMediaInfoFragment2);
        editMediaInfoFragment2.schedule(A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r3.A0P != false) goto L_0x0019;
     */
    public static void A08(EditMediaInfoFragment editMediaInfoFragment) {
        boolean z;
        if (editMediaInfoFragment.mView != null) {
            AnonymousClass1EW A032 = AnonymousClass1EW.A03(editMediaInfoFragment.getActivity());
            if (editMediaInfoFragment.A0O && !editMediaInfoFragment.A0R) {
                z = true;
            }
            z = false;
            A032.ACu(z);
        }
    }

    public static void A09(EditMediaInfoFragment editMediaInfoFragment) {
        View view = editMediaInfoFragment.mView;
        if (view == null) {
            return;
        }
        if (editMediaInfoFragment.A0Q) {
            if (editMediaInfoFragment.mFailedView == null) {
                View inflate = ((ViewStub) view.findViewById(C0003R.C0005id.edit_media_failed_view_stub)).inflate();
                editMediaInfoFragment.mFailedView = inflate;
                ((ViewGroup) inflate).getChildAt(0).setOnClickListener(new C162176w2(editMediaInfoFragment));
            }
            MediaType A002 = MediaType.A00(editMediaInfoFragment.mArguments.getInt("EditMediaFragment.ARGUMENT_MEDIA_TYPE"));
            MediaType mediaType = MediaType.PHOTO;
            int i = C0003R.string.edit_failed_subtitle_video;
            if (A002 == mediaType) {
                i = C0003R.string.edit_failed_subtitle_photo;
            }
            AnonymousClass5F9.A01(editMediaInfoFragment.getActivity(), i, 0);
            BaseFragmentActivity.A00(AnonymousClass1EW.A03(editMediaInfoFragment.getActivity()));
            return;
        }
        View view2 = editMediaInfoFragment.mFailedView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x024d, code lost:
        if (r8.A06.A0T() != false) goto L_0x024f;
     */
    public static void A0A(EditMediaInfoFragment editMediaInfoFragment) {
        boolean z;
        EditMediaInfoFragment editMediaInfoFragment2 = editMediaInfoFragment;
        if (editMediaInfoFragment2.A05 != null) {
            C13300iJ r3 = editMediaInfoFragment2.A0C.A06;
            CircularImageView circularImageView = editMediaInfoFragment2.mUserImageView;
            ImageUrl ASv = r3.ASv();
            String moduleName = editMediaInfoFragment2.getModuleName();
            circularImageView.setUrl(ASv, moduleName);
            editMediaInfoFragment2.mUsername.setText(r3.AZn());
            editMediaInfoFragment2.mBelowUsernameLabel.setVisibility(0);
            editMediaInfoFragment2.mUsername.setGravity(80);
            editMediaInfoFragment2.mTimestamp.setGravity(80);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if ("eligible".equals(editMediaInfoFragment2.A0F) || editMediaInfoFragment2.A0B != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                BrandedContentTag brandedContentTag = editMediaInfoFragment2.A0B;
                if (brandedContentTag != null) {
                    spannableStringBuilder2.append(C17050pb.A01(brandedContentTag.A02, editMediaInfoFragment2.getString(C0003R.string.sponsor_tag_label), new C38311l4()));
                } else {
                    spannableStringBuilder2.append(editMediaInfoFragment2.getString(C0003R.string.add_partner));
                }
                SpannableString spannableString = new SpannableString(spannableStringBuilder2);
                spannableString.setSpan(new C162046vn(editMediaInfoFragment2), 0, spannableString.length(), 33);
                spannableStringBuilder.append(spannableString);
                editMediaInfoFragment2.mBelowUsernameLabel.setText(spannableStringBuilder);
                editMediaInfoFragment2.mBelowUsernameLabel.getViewTreeObserver().addOnPreDrawListener(new C162076vq(editMediaInfoFragment2));
            } else {
                C06220Of.A0F(editMediaInfoFragment2.mExtraLocationLabel);
                spannableStringBuilder.append(A01(editMediaInfoFragment2));
            }
            editMediaInfoFragment2.mBelowUsernameLabel.setHighlightColor(0);
            editMediaInfoFragment2.mBelowUsernameLabel.setText(spannableStringBuilder);
            editMediaInfoFragment2.mBelowUsernameLabel.setMovementMethod(LinkMovementMethod.getInstance());
            if (editMediaInfoFragment2.mTimestamp.getVisibility() == 0) {
                editMediaInfoFragment2.mTimestamp.setText(editMediaInfoFragment2.A05.A0f(editMediaInfoFragment2.getContext()));
            }
            Editable editable = editMediaInfoFragment2.A03;
            if (editable != null) {
                editMediaInfoFragment2.mCaption.setText(editable);
            } else {
                instagramComment r0 = editMediaInfoFragment2.A05.A0K;
                if (r0 != null) {
                    editMediaInfoFragment2.mCaption.setText(r0.commentText);
                    C27666CMk cMk = editMediaInfoFragment2.A04;
                    if (cMk != null) {
                        cMk.A05(editMediaInfoFragment2.A05.A0K.A04());
                    }
                }
            }
            if (editMediaInfoFragment2.A05.A1U()) {
                View A012 = editMediaInfoFragment2.A0W.A01();
                C155526kY r4 = (C155526kY) A012.getTag();
                if (r4 == null) {
                    r4 = new C155526kY();
                    r4.A00 = (ViewGroup) A012.findViewById(C0003R.C0005id.carousel_media_group);
                    r4.A02 = new C32221an((ViewStub) A012.findViewById(C0003R.C0005id.audio_icon_view_stub));
                    r4.A01 = (ReboundViewPager) A012.findViewById(C0003R.C0005id.carousel_viewpager);
                    r4.A04 = (CirclePageIndicator) A012.findViewById(C0003R.C0005id.carousel_page_indicator);
                    r4.A01.setPageSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    A012.setTag(r4);
                }
                if (editMediaInfoFragment2.A06 == null) {
                    C36841ih r5 = new C36841ih(editMediaInfoFragment2.A05);
                    editMediaInfoFragment2.A06 = r5;
                    r5.A06(editMediaInfoFragment2.mArguments.getInt("EditMediaFragment.ARGUMENT_MEDIA_CAROUSEL_INDEX", 0));
                    editMediaInfoFragment2.A06.Bja(0);
                }
                C123395Qq r6 = editMediaInfoFragment2.A0Z;
                AnonymousClass1NJ r52 = editMediaInfoFragment2.A05;
                C36841ih r32 = editMediaInfoFragment2.A06;
                HashMap hashMap = editMediaInfoFragment2.A0K;
                HashMap hashMap2 = editMediaInfoFragment2.A0L;
                C36841ih r1 = r4.A03;
                if (!(r1 == null || r1 == r32)) {
                    r1.A0H(r4.A02.A00());
                }
                r4.A03 = r32;
                C38781lp.A00(r4.A02, r52, r32);
                r4.A01.A0C();
                r4.A04.A00(r32.AHt(), Math.max(r52.A04, r52.A07()));
                r4.A01.A0L(r4.A04);
                C162086vr r7 = new C162086vr(r6.A00, r52, r32, hashMap, hashMap2, r6.A02, r4.A02, r6.A01, r6.A03, editMediaInfoFragment);
                r4.A01.setExtraBufferSize(0);
                r4.A01.setAdapter((Adapter) r7);
                r4.A01.A0I(r32.AHt());
                ReboundViewPager reboundViewPager = r4.A01;
                reboundViewPager.setOverScrollOnEdgeItems(false);
                reboundViewPager.A0L(new AnonymousClass2YM(r6, r32, r4, r52));
                AnonymousClass1NJ A0P2 = r52.A0P(r32.AHt());
                if (A0P2 == null) {
                    AnonymousClass0QD.A01("EditMediaInfoCarouselMediaViewBinder", "Current carousel media is null.");
                } else if (A0P2.AiO()) {
                    r6.A02.A0D(r52, r32, (C32161ah) r4.A01.A0C.getTag(), r32.A12);
                }
                ReboundViewPager reboundViewPager2 = r4.A01;
                AnonymousClass1E1.A0b(reboundViewPager2, new C44441wA(reboundViewPager2));
            } else if (!editMediaInfoFragment2.A05.A1U()) {
                MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) editMediaInfoFragment2.A0X.A01();
                IgImageView igImageView = (IgImageView) mediaFrameLayout.findViewById(C0003R.C0005id.edit_media_imageview);
                View findViewById = mediaFrameLayout.findViewById(C0003R.C0005id.edit_media_video_indicator);
                if (!editMediaInfoFragment2.A05.AiO()) {
                    View findViewById2 = mediaFrameLayout.findViewById(C0003R.C0005id.edit_alt_text_button);
                    findViewById2.setVisibility(0);
                    findViewById2.setOnClickListener(editMediaInfoFragment2.A0d);
                }
                if (editMediaInfoFragment2.A05.A1M()) {
                    igImageView.setUrl(editMediaInfoFragment2.A05.A0E.toString(), moduleName);
                } else {
                    igImageView.setUrl((ImageUrl) editMediaInfoFragment2.A05.A0S(editMediaInfoFragment2.getContext()), moduleName);
                }
                mediaFrameLayout.setAspectRatio(editMediaInfoFragment2.A05.A05());
                View findViewById3 = mediaFrameLayout.findViewById(C0003R.C0005id.tag_indicator_button);
                AnonymousClass0C1 r8 = editMediaInfoFragment2.A0C;
                AnonymousClass1NJ r02 = editMediaInfoFragment2.A05;
                ArrayList arrayList = editMediaInfoFragment2.A0I;
                ArrayList arrayList2 = editMediaInfoFragment2.A0J;
                C162096vs r62 = editMediaInfoFragment2.A0Y;
                if (r02.Aho()) {
                    findViewById3.setVisibility(8);
                } else if (A0C(r62.A00)) {
                    C162066vp.A04(findViewById3, arrayList, arrayList2, r62);
                } else {
                    if (!C162066vp.A05(arrayList)) {
                        if (C162066vp.A05(arrayList2)) {
                            C162066vp.A03(findViewById3, arrayList2, r62);
                        } else {
                            if (!C52952Qw.A0F(r8)) {
                                z = false;
                            }
                            z = true;
                            if (z) {
                                C162066vp.A00(findViewById3, C0003R.C0004drawable.instagram_add_outline_24, findViewById3.getResources().getString(C0003R.string.tag), new C1193159x(r62));
                            }
                        }
                    }
                    C162066vp.A02(findViewById3, arrayList, r62);
                }
                if (editMediaInfoFragment2.A05.APx() == MediaType.VIDEO) {
                    findViewById.setVisibility(0);
                }
            }
        }
    }

    public static void A0B(EditMediaInfoFragment editMediaInfoFragment, boolean z) {
        editMediaInfoFragment.A0c = z;
        if (editMediaInfoFragment.mView != null) {
            AnonymousClass1EW.A03(editMediaInfoFragment.getActivity()).setIsLoading(editMediaInfoFragment.A0c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1.A06.A0T() != false) goto L_0x001d;
     */
    public static boolean A0C(EditMediaInfoFragment editMediaInfoFragment) {
        boolean z;
        AnonymousClass0C1 r1 = editMediaInfoFragment.A0C;
        if (C52952Qw.A0F(r1) || r1.A06.A0T()) {
            if (editMediaInfoFragment.A0B != null) {
                z = true;
            }
            z = false;
            if (z || !editMediaInfoFragment.A0D.A07()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final TextView A0E() {
        if (this.mExtraLocationLabel == null) {
            this.mExtraLocationLabel = (TextView) ((ViewStub) this.mView.findViewById(C0003R.C0005id.extra_location_label_stub)).inflate();
        }
        return this.mExtraLocationLabel;
    }

    public final void A0F() {
        C161216uH r2;
        if (this.A05.A1U()) {
            r2 = new C161216uH(getContext(), C27738CPh.PEOPLE);
            AnonymousClass1NJ r3 = this.A05;
            r2.A03(r3, r3.A0P(this.A06.AHt()), this.A0K, this.A0L, C162116vu.A01(this.A0C, this.A03), this.A0B);
        } else {
            r2 = new C161216uH(getContext(), C27738CPh.PEOPLE);
            r2.A04(this.A05, this.A0I, this.A0J, C162116vu.A01(this.A0C, this.A03), this.A0B);
        }
        r2.A02 = this.A0C.getToken();
        r2.A04 = A0C(this);
        Intent A002 = r2.A00();
        C26441Dh.A00(this.A0C).A02(getActivity());
        AnonymousClass1BH.A0B(A002, 1000, this);
    }

    public final String AH5() {
        BrandedContentTag brandedContentTag = this.A0B;
        if (brandedContentTag != null) {
            return brandedContentTag.A01;
        }
        return null;
    }

    public final String AXj() {
        Object obj;
        if (!this.A0J.isEmpty()) {
            obj = this.A0J.get(0);
        } else {
            if (!this.A0L.isEmpty()) {
                for (List list : this.A0L.values()) {
                    if (!AnonymousClass0OX.A00(list)) {
                        obj = list.get(0);
                    }
                }
            }
            String A002 = C162116vu.A00(this.A03);
            if (A002 != null) {
                return A002;
            }
            return null;
        }
        return ((ProductTag) obj).A01.A02.A02;
    }

    public static CharSequence A01(EditMediaInfoFragment editMediaInfoFragment) {
        String string = editMediaInfoFragment.getString(C0003R.string.add_location);
        if (editMediaInfoFragment.A0T) {
            string = editMediaInfoFragment.getString(C0003R.string.add_location);
        } else {
            Venue venue = editMediaInfoFragment.A0A;
            if (venue != null) {
                string = venue.A0B;
            } else {
                Venue venue2 = editMediaInfoFragment.A05.A0z;
                if (venue2 != null) {
                    editMediaInfoFragment.A0A = venue2;
                    string = venue2.A0B;
                }
            }
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C162006vi(editMediaInfoFragment), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static void A02(C15890nh r2, BrandedContentTag brandedContentTag, BrandedContentTag brandedContentTag2) {
        if (C144886Hm.A04(brandedContentTag, brandedContentTag2)) {
            try {
                r2.A09("sponsor_tags", C144886Hm.A01(brandedContentTag2, brandedContentTag));
            } catch (IOException e) {
                AnonymousClass0DB.A0G("EditMediaInfoFragment", "Unable to retrieve branded content tag", e);
            }
        }
    }

    public static void A04(EditMediaInfoFragment editMediaInfoFragment) {
        Activity activity = editMediaInfoFragment.getActivity();
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        activity.getWindow().setSoftInputMode(16);
        editMediaInfoFragment.mCaption.clearFocus();
        C06220Of.A0E(editMediaInfoFragment.mCaption);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (A0D(r4.A11(), r2) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        if (r0 == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0170, code lost:
        if (A0D(r4.A11(), r2) != false) goto L_0x006c;
     */
    public static void A05(EditMediaInfoFragment editMediaInfoFragment) {
        AnonymousClass1NJ r0;
        String str;
        boolean z;
        BrandedContentTag brandedContentTag;
        boolean z2;
        List list;
        boolean z3;
        boolean z4;
        if (editMediaInfoFragment.isVisible() && (r0 = editMediaInfoFragment.A05) != null) {
            instagramComment r02 = r0.A0K;
            String str2 = "";
            if (r02 == null) {
                str = str2;
            } else {
                str = r02.commentText;
            }
            IgAutoCompleteTextView igAutoCompleteTextView = editMediaInfoFragment.mCaption;
            if (!(igAutoCompleteTextView == null || igAutoCompleteTextView.getText() == null)) {
                str2 = editMediaInfoFragment.mCaption.getText().toString();
            }
            boolean z5 = false;
            if (editMediaInfoFragment.A05.A1U()) {
                int i = 0;
                while (true) {
                    if (i >= editMediaInfoFragment.A05.A07()) {
                        z = false;
                        break;
                    }
                    AnonymousClass1NJ A0P2 = editMediaInfoFragment.A05.A0P(i);
                    String id = A0P2.getId();
                    List list2 = (List) editMediaInfoFragment.A0L.get(id);
                    if (!A0D(A0P2.A10(), (List) editMediaInfoFragment.A0K.get(id))) {
                        z4 = false;
                    }
                    z4 = true;
                    i++;
                    if (z4) {
                        break;
                    }
                }
            } else {
                AnonymousClass1NJ r4 = editMediaInfoFragment.A05;
                ArrayList arrayList = editMediaInfoFragment.A0I;
                ArrayList arrayList2 = editMediaInfoFragment.A0J;
                if (!A0D(r4.A10(), arrayList)) {
                    z = false;
                }
            }
            z = true;
            if (editMediaInfoFragment.A05.A1R()) {
                brandedContentTag = new BrandedContentTag(editMediaInfoFragment.A05.A0b(), editMediaInfoFragment.A05.A1F());
            } else {
                brandedContentTag = null;
            }
            boolean A042 = C144886Hm.A04(brandedContentTag, editMediaInfoFragment.A0B);
            if (editMediaInfoFragment.A05.A1U()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= editMediaInfoFragment.A05.A07()) {
                        z2 = false;
                        break;
                    }
                    AnonymousClass1NJ A0P3 = editMediaInfoFragment.A05.A0P(i2);
                    i2++;
                    if (!AnonymousClass17M.A00(A0P3.A1c, editMediaInfoFragment.A0M.get(A0P3.getId()))) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = !AnonymousClass17M.A00(editMediaInfoFragment.A05.A1c, editMediaInfoFragment.A0H);
            }
            if (str2.equals(str) && AnonymousClass17M.A00(editMediaInfoFragment.A05.A0z, editMediaInfoFragment.A0A) && !z && !A042 && !z2) {
                instagramComment r03 = editMediaInfoFragment.A05.A0K;
                if (r03 != null) {
                    list = r03.A04();
                } else {
                    list = null;
                }
                ArrayList A012 = C162116vu.A01(editMediaInfoFragment.A0C, editMediaInfoFragment.A03);
                if (!AnonymousClass0OX.A00(list) || !AnonymousClass0OX.A00(A012)) {
                    if (!AnonymousClass0OX.A00(list) && !AnonymousClass0OX.A00(A012) && list.size() == A012.size()) {
                        AnonymousClass58B r04 = new AnonymousClass58B();
                        ArrayList arrayList3 = new ArrayList(list);
                        ArrayList arrayList4 = new ArrayList(A012);
                        Collections.sort(arrayList3, r04);
                        Collections.sort(arrayList4, r04);
                        int i3 = 0;
                        while (true) {
                            if (i3 < arrayList3.size()) {
                                if (!((ProductMention) arrayList3.get(i3)).equals(arrayList4.get(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                break;
                            }
                        }
                    }
                    z3 = true;
                }
                z3 = false;
            }
            z5 = true;
            editMediaInfoFragment.A0O = z5;
            A08(editMediaInfoFragment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3.A0P != false) goto L_0x0028;
     */
    public final void configureActionBar(AnonymousClass1EX r4) {
        boolean z;
        ActionButton BmH = r4.BmH(C0003R.string.edit_info, new C155516kX(this));
        if (this.A0Q) {
            BmH.setVisibility(8);
            return;
        }
        r4.setIsLoading(this.A0c);
        if (this.A0O && !this.A0R) {
            z = true;
        }
        z = false;
        BmH.setEnabled(z);
    }

    public final C06590Pq getSession() {
        return this.A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r7 == 1001) goto L_0x000d;
     */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        ProductSource A012;
        super.onActivityResult(i, i2, intent);
        if (i != 1000) {
            z = false;
        }
        z = true;
        if (i2 == -1 && z) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_tagging_info_list");
            if (this.A05.A1U()) {
                Iterator it = parcelableArrayListExtra.iterator();
                while (it.hasNext()) {
                    MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
                    this.A0K.put(this.A05.A0P(mediaTaggingInfo.A01).getId(), mediaTaggingInfo.A07);
                    this.A0L.put(this.A05.A0P(mediaTaggingInfo.A01).getId(), mediaTaggingInfo.A09);
                }
                this.A06.A06(intent.getIntExtra("last_page", 0));
            } else {
                MediaTaggingInfo mediaTaggingInfo2 = (MediaTaggingInfo) parcelableArrayListExtra.get(0);
                this.A0I = mediaTaggingInfo2.A07;
                this.A0J = mediaTaggingInfo2.A09;
            }
            A05(this);
        } else if (i == 1003 && i2 == -1 && this.A04 != null && (A012 = C27665CMj.A01(this.A0C)) != null) {
            this.A04.A03(A012);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1118663305);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A0C = A062;
        this.A0F = C16180oA.A00(A062).A04();
        C23300zv A002 = C23300zv.A00(this.A0C);
        A002.A02(C122965Ox.class, this.A0j);
        A002.A02(C161696v9.class, this.A0i);
        A002.A02(C161156uB.class, this.A0h);
        this.A02 = new Handler();
        if (bundle != null) {
            this.A0I = bundle.getParcelableArrayList("people_tags");
            this.A0J = bundle.getParcelableArrayList("product_tags");
            this.A0H = (String) bundle.getParcelable("alt_text");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("carousel_media_ids");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(AnonymousClass000.A0E("carousel_people_tags", next));
                    if (parcelableArrayList != null) {
                        this.A0K.put(next, parcelableArrayList);
                    }
                    ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(AnonymousClass000.A0E("carousel_product_tags", next));
                    if (parcelableArrayList2 != null) {
                        this.A0L.put(next, parcelableArrayList2);
                    }
                    String str = (String) bundle.getParcelable(AnonymousClass000.A0E("carousel_alt_text", next));
                    if (str != null) {
                        this.A0M.put(next, str);
                    }
                }
            }
            this.A0S = true;
            this.A0N = true;
            this.A0A = (Venue) bundle.getParcelable("venue");
            this.A0T = bundle.getBoolean("venue_cleared");
        }
        this.A0G = this.mArguments.getString("EditMediaFragment.ARGUMENT_MEDIA_ID");
        AnonymousClass1NJ A023 = AnonymousClass1PZ.A00(this.A0C).A02(this.A0G);
        this.A05 = A023;
        if (A023 == null) {
            C17850qu A032 = C16160o8.A03(this.A0G, this.A0C);
            A032.A00 = new C162106vt(this);
            schedule(A032);
        } else {
            if (!this.A0S) {
                if (A023.A1U()) {
                    this.A0K = this.A05.A12();
                    this.A0L = this.A05.A13();
                } else {
                    AnonymousClass1NJ r1 = this.A05;
                    ArrayList A10 = r1.A10();
                    if (A10 != null) {
                        this.A0I = A10;
                    }
                    ArrayList A11 = r1.A11();
                    if (A11 != null) {
                        this.A0J = A11;
                    }
                }
            }
            if (!this.A0N) {
                if (this.A05.A1U()) {
                    this.A0M = this.A05.A14();
                } else {
                    String str2 = this.A05.A1c;
                    if (str2 != null) {
                        this.A0H = str2;
                    }
                }
            }
            if (this.A05.A1R()) {
                this.A0B = new BrandedContentTag(this.A05.A0b(), this.A05.A1F());
            }
        }
        this.A0V = this.mArguments.getInt("EditMediaFragment.ARGUMENT_MEDIA_POSITION_IN_FEED", -1);
        this.A0U = this.mArguments.getInt("EditMediaFragment.ARGUMENT_MEDIA_CAROUSEL_INDEX", -1);
        this.A0b = this.mArguments.getBoolean("EditMediaFragment.ARGUMENT_MEDIA_IS_CAROUSEL_BUMPED_POST", false);
        this.A0Y = new C162096vs(this);
        Context context = getContext();
        this.A0Z = new C123395Qq(context, new AnonymousClass1RJ(context, this.A0C, this, new C124985Xc(this.A05), (String) null), this.A0Y, this.A0C);
        C17510qM r4 = C17510qM.A00;
        Context context2 = getContext();
        AnonymousClass0a4.A06(context2);
        AnonymousClass1L8 A003 = AnonymousClass1L8.A00(this);
        AnonymousClass0C1 r5 = this.A0C;
        C161956vd A0N2 = r4.A0N(context2, A003, r5, this.A0l);
        this.A0D = A0N2;
        A0N2.A04(this.A0B);
        this.A00 = ((Integer) AnonymousClass0L6.A02(r5, AnonymousClass0L7.SHOPPING_PRODUCT_MENTION_CREATION_ANDROID, "max_mentions_allowed", 5, (AnonymousClass04H) null)).intValue();
        AnonymousClass0Z0.A09(1215713838, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0090, code lost:
        if (p000X.C52952Qw.A0E(r9) != false) goto L_0x0092;
     */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(-1008489550);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_edit_media_info, viewGroup, false);
        this.mScrollView = inflate.findViewById(C0003R.C0005id.edit_media_scroll_view);
        this.mUserImageView = (CircularImageView) inflate.findViewById(C0003R.C0005id.edit_media_user_imageview);
        this.mUsername = (TextView) inflate.findViewById(C0003R.C0005id.edit_media_username);
        this.mBelowUsernameLabel = (TextView) inflate.findViewById(C0003R.C0005id.below_username_label);
        this.mTimestamp = (TextView) inflate.findViewById(C0003R.C0005id.edit_media_timestamp);
        this.mCaption = (IgAutoCompleteTextView) inflate.findViewById(C0003R.C0005id.edit_media_caption);
        this.mTextContainer = inflate.findViewById(C0003R.C0005id.edit_media_linear_layout);
        this.A0X = new C26571Ea((ViewStub) inflate.findViewById(C0003R.C0005id.single_media_group_stub));
        this.A0W = new C26571Ea((ViewStub) inflate.findViewById(C0003R.C0005id.carousel_media_group_stub));
        this.mCaption.addTextChangedListener(this.A0g);
        AnonymousClass0C1 r9 = this.A0C;
        if (!r9.A06.A0T()) {
            z = false;
        }
        z = true;
        if (z && ((Boolean) AnonymousClass0L6.A02(r9, AnonymousClass0L7.SHOPPING_PRODUCT_MENTION_CREATION_ANDROID, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C27666CMk cMk = new C27666CMk(this, this, this.A0C, this);
            this.A04 = cMk;
            cMk.A04(this.mCaption, AnonymousClass1EW.A03(getActivity()).AFR(), new C67122we(), true);
        } else if (((Boolean) AnonymousClass0L6.A02(this.A0C, AnonymousClass0L7.MENTION_HASHTAG_SEARCH_MIGRATION, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C27666CMk cMk2 = new C27666CMk(this, this, this.A0C, this);
            this.A04 = cMk2;
            cMk2.A04(this.mCaption, AnonymousClass1EW.A03(getActivity()).AFR(), new C67122we(), false);
        } else {
            Context context = getContext();
            C67682xf A002 = C67682xf.A00(context, this.A0C, new C28351Lj(context, AnonymousClass1L8.A00(this)), (List) null, false, "edit_post_page", new C67672xe(getActivity(), this.A0C, AnonymousClass0C5.$const$string(110)));
            this.A07 = A002;
            IgAutoCompleteTextView igAutoCompleteTextView = this.mCaption;
            igAutoCompleteTextView.setAlwaysShowWhenEnoughToFilter(true);
            igAutoCompleteTextView.setAdapter(A002);
        }
        this.mScrollView.addOnLayoutChangeListener(this.A0e);
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(8);
        }
        this.mPostOverlayView = inflate.findViewById(C0003R.C0005id.content_overlay);
        C18510ry r5 = C18510ry.A00;
        this.A0E = r5.A02(this.A0C, this, r5.A01(false), (ViewStub) inflate.findViewById(C0003R.C0005id.warning_nudge), new AnonymousClass6w0(this));
        AnonymousClass0Z0.A09(-911550738, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(931004003);
        super.onDestroy();
        C23300zv A002 = C23300zv.A00(this.A0C);
        A002.A03(C122965Ox.class, this.A0j);
        A002.A03(C161696v9.class, this.A0i);
        A002.A03(C161156uB.class, this.A0h);
        AnonymousClass0Z0.A09(66184387, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1496428916);
        super.onDestroyView();
        this.mCaption.removeTextChangedListener(this.A0g);
        this.mUserImageView = null;
        this.mUsername = null;
        this.mBelowUsernameLabel = null;
        this.mExtraLocationLabel = null;
        this.mTimestamp = null;
        this.mCaption = null;
        this.mFailedView = null;
        this.A0X = null;
        this.A0W = null;
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(0);
        }
        C28654CkW ckW = this.A0E;
        if (ckW != null) {
            ckW.A05();
            this.A0E = null;
        }
        AnonymousClass0Z0.A09(-1209876219, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(1066294855);
        super.onPause();
        Activity activity = getActivity();
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        activity.getWindow().setSoftInputMode(48);
        C06220Of.A0E(this.mCaption);
        C16230oG.A00.removeLocationUpdates(this.A0C, this.A0f);
        C16230oG.A00.cancelSignalPackageRequest(this.A0C, this.A0k);
        AnonymousClass0Z0.A09(1530373287, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-890600391);
        super.onResume();
        if (this.A0Q) {
            A09(this);
        } else {
            A0A(this);
            if (this.A01 == null) {
                Location lastLocation = C16230oG.A00.getLastLocation(this.A0C);
                if (lastLocation == null || !C16230oG.A00.isLocationValid(lastLocation)) {
                    C16230oG.A00.requestLocationUpdates(this.A0C, this.A0f, "EditMediaInfoFragment");
                } else {
                    this.A01 = lastLocation;
                    C16230oG.A00.removeLocationUpdates(this.A0C, this.A0f);
                }
            }
        }
        A06(this);
        AnonymousClass0Z0.A09(-1743298891, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("people_tags", this.A0I);
        bundle.putParcelableArrayList("product_tags", this.A0J);
        bundle.putParcelable("venue", this.A0A);
        bundle.putBoolean("venue_cleared", this.A0T);
        bundle.putCharSequence("alt_text", this.A0H);
        ArrayList arrayList = new ArrayList(this.A0K.keySet());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bundle.putParcelableArrayList(AnonymousClass000.A0E("carousel_people_tags", str), (ArrayList) this.A0K.get(str));
        }
        ArrayList arrayList2 = new ArrayList(this.A0L.keySet());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            bundle.putParcelableArrayList(AnonymousClass000.A0E("carousel_product_tags", str2), (ArrayList) this.A0L.get(str2));
        }
        ArrayList arrayList3 = new ArrayList(this.A0M.keySet());
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            bundle.putCharSequence(AnonymousClass000.A0E("carousel_alt_text", str3), (String) this.A0M.get(str3));
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        bundle.putStringArrayList("carousel_media_ids", arrayList4);
    }
}
