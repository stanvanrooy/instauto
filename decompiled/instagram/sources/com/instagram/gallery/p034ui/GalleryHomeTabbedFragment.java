package com.instagram.gallery.p034ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.gallery.Medium;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.p009ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1GH;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass2MT;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass3TZ;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass7H0;
import p000X.AnonymousClass7o5;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06420Oz;
import p000X.C06590Pq;
import p000X.C175037do;
import p000X.C175317eG;
import p000X.C175327eH;
import p000X.C175337eI;
import p000X.C180957nz;
import p000X.C180967o0;
import p000X.C180987o3;
import p000X.C180997o6;
import p000X.C181027o9;
import p000X.C181057oC;
import p000X.C181077oE;
import p000X.C181087oF;
import p000X.C181097oG;
import p000X.C181107oH;
import p000X.C181117oI;
import p000X.C181127oJ;
import p000X.C181427ot;
import p000X.C181487p0;
import p000X.C181837pZ;
import p000X.C181987pp;
import p000X.C182017ps;
import p000X.C18380rl;
import p000X.C1892886q;
import p000X.C27341Hl;
import p000X.C62192n6;
import p000X.C62202n7;
import p000X.C68172yZ;
import p000X.C76523Wf;
import p000X.C83193jd;
import p000X.C83213jf;

/* renamed from: com.instagram.gallery.ui.GalleryHomeTabbedFragment */
public class GalleryHomeTabbedFragment extends C27341Hl implements C76523Wf, AnonymousClass1HK, C181107oH, C181087oF, C83213jf, AnonymousClass2NF, C181097oG, C175337eI {
    public static final Pattern A0D = Pattern.compile(".*[0-9]+.*");
    public int A00;
    public C175327eH A01;
    public C181027o9 A02 = C181027o9.LOCAL_MEDIA;
    public AnonymousClass0C1 A03;
    public Folder A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public int A0A;
    public final Map A0B = new HashMap();
    public final List A0C = new ArrayList();
    public AnonymousClass7H0 mActionBarController;
    public C180987o3 mCardFragmentNavigator;
    public View mInnerContainer;
    public C180957nz mPeekController;
    public FixedTabBar mTabBar;
    public View mTabBarAndThumbnailTrayContainer;
    public View mTabBarShadow;
    public AnonymousClass3DK mTabController;
    public C83193jd mThumbnailTrayController;
    public ViewPager mViewPager;

    public final void B1e(int i) {
    }

    public final void BM4() {
    }

    public static void A00(GalleryHomeTabbedFragment galleryHomeTabbedFragment) {
        int round = Math.round((((float) galleryHomeTabbedFragment.A00) - galleryHomeTabbedFragment.mTabBarAndThumbnailTrayContainer.getTranslationY()) + (((float) galleryHomeTabbedFragment.A0A) - galleryHomeTabbedFragment.A09));
        for (AnonymousClass1HD r1 : galleryHomeTabbedFragment.getChildFragmentManager().A0Q.A02()) {
            if (r1 instanceof C181127oJ) {
                ((C181127oJ) r1).A4x(round);
            }
        }
    }

    public static void A01(GalleryHomeTabbedFragment galleryHomeTabbedFragment, List list, C181837pZ r8) {
        boolean z;
        if (!galleryHomeTabbedFragment.A07) {
            C175317eG AU3 = galleryHomeTabbedFragment.AU3();
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AU3.A01.containsKey(((Medium) it.next()).AOA())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                galleryHomeTabbedFragment.A07 = true;
                C68172yZ r4 = new C68172yZ(galleryHomeTabbedFragment.getActivity());
                r4.A00(galleryHomeTabbedFragment.getResources().getString(C0003R.string.loading));
                AnonymousClass2MT r3 = new AnonymousClass2MT(583, new C1892886q(AU3.A00, AU3.A01, list));
                r3.A00 = new AnonymousClass7o5(galleryHomeTabbedFragment, r4, r8);
                galleryHomeTabbedFragment.schedule(r3);
                return;
            }
            if (r8 != null) {
                C181987pp.A01(galleryHomeTabbedFragment.A03).A06.put(r8.A02, r8);
            }
            ((MediaCaptureActivity) galleryHomeTabbedFragment.getActivity()).A9k(list, galleryHomeTabbedFragment.A05);
        }
    }

    public final void A02() {
        C180957nz r2 = this.mPeekController;
        if (r2 != null && r2.A0D) {
            r2.A0D = false;
            if (!r2.A0C) {
                r2.A0P.A03("end_peek");
            }
            r2.A0L.A03(0.0d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (getCurrentFolder().A02() != false) goto L_0x0025;
     */
    public final void A03() {
        boolean z;
        TextView textView;
        int i;
        AnonymousClass7H0 r2 = this.mActionBarController;
        if (r2 != null) {
            r2.A01.setSelected(this.A01.A01);
            C181427ot AMT = AMT();
            AnonymousClass7H0 r3 = this.mActionBarController;
            if (AMT.A02 == Constants.A0C) {
                z = true;
            }
            z = false;
            ImageView imageView = r3.A01;
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            AnonymousClass7H0 r22 = this.mActionBarController;
            switch (this.A02.ordinal()) {
                case 0:
                    r22.A05.setVisibility(0);
                    r22.A02.setVisibility(8);
                    break;
                case 1:
                    textView = r22.A02;
                    i = C0003R.string.stories;
                    break;
                case 2:
                    textView = r22.A02;
                    i = C0003R.string.camera;
                    break;
            }
            textView.setText(i);
            r22.A02.setVisibility(0);
            r22.A05.setVisibility(8);
            AnonymousClass0Z1.A00(this.mActionBarController.A03, -216671080);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r10 == null) goto L_0x0015;
     */
    public final void A04(View view, Medium medium, PointF pointF) {
        boolean z;
        C180957nz r3 = this.mPeekController;
        if (r3 != null && !A07()) {
            if (r3.A0L.A09()) {
                z = true;
            }
            z = false;
            if (z) {
                r3.A0A = medium;
                C181987pp A012 = C181987pp.A01(r3.A0N);
                C181987pp.A02(A012, C181987pp.A00(A012, "ig_feed_gallery_long_press_preview", 2));
                r3.A0D = true;
                r3.A09 = view;
                r3.A08 = pointF;
                view.getDrawingRect(r3.A0G);
                r3.A0I.offsetDescendantRectToMyCoords(r3.A09, r3.A0G);
                r3.A05 = view.getWidth();
                r3.A04 = view.getHeight();
                r3.A03 = Math.round((float) (r3.A0I.getWidth() - (r3.A0E << 1)));
                r3.A00 = r3.A0G.exactCenterX() - (((float) r3.A0I.getWidth()) / 2.0f);
                r3.A01 = r3.A0G.exactCenterY() - (((float) r3.A0I.getHeight()) / 2.0f);
                C62192n6 r1 = new C62192n6(r3.A0F);
                r1.A06 = 0;
                r1.A05 = 0;
                r1.A0A = false;
                r1.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r1.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r1.A08 = false;
                r1.A09 = false;
                C62202n7 r2 = new C62202n7(r1);
                r3.A0B = r2;
                int AUk = medium.AUk();
                r2.A06 = AUk;
                C180967o0 r12 = new C180967o0(r3, AUk);
                r2.A0F = r12;
                Bitmap bitmap = r2.A09;
                if (bitmap != null) {
                    r12.AtK(r2, bitmap);
                }
                C62202n7 r7 = r3.A0B;
                int i = medium.A09;
                int i2 = medium.A04;
                int AUk2 = medium.AUk();
                int i3 = r3.A03;
                int i4 = AUk2 % 180;
                int i5 = i2;
                if (i4 == 0) {
                    i5 = i;
                }
                if (i4 == 0) {
                    i = i2;
                }
                int i6 = 1;
                while (i5 / i6 > i3 && i / i6 > Integer.MAX_VALUE) {
                    i6 <<= 1;
                }
                r7.A05 = i6;
                r7.A00(r3.A0M.A02(medium));
                if (r3.A0M.A03(medium)) {
                    AnonymousClass1GH A0D2 = AnonymousClass12C.A0c.A0D(r3.A0M.A01(medium), r3.A0Q);
                    A0D2.A02(r3);
                    A0D2.A05 = r3.A0A;
                    A0D2.A01();
                }
                r3.A0K.setImageDrawable(r3.A0B);
            }
        }
    }

    public final void A06(Folder folder) {
        Folder folder2 = this.A04;
        if (!(folder2 == null || folder == folder2)) {
            C181987pp A012 = C181987pp.A01(this.A03);
            C181987pp.A02(A012, C181987pp.A00(A012, "ig_feed_gallery_select_album", 2));
        }
        this.A04 = folder;
        AMT().A00();
    }

    public final boolean A07() {
        C180957nz r0 = this.mPeekController;
        if (r0 == null || !r0.A0D) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        AnonymousClass1HD r1;
        C181027o9 r4 = (C181027o9) obj;
        switch (r4.ordinal()) {
            case 0:
                r1 = new GalleryHomeFragment();
                break;
            case 1:
                r1 = new StoriesArchiveFragment();
                break;
            case 2:
                C18380rl.A00.A00();
                Bundle bundle = this.mArguments;
                r1 = new C182017ps();
                r1.setArguments(bundle);
                break;
            default:
                throw new IllegalArgumentException(AnonymousClass40t.$const$string(253) + r4);
        }
        r1.setArguments(this.mArguments);
        return r1;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3DN AB4(Object obj) {
        return (AnonymousClass3DN) this.A0B.get((C181027o9) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3.isEmpty() != false) goto L_0x000b;
     */
    public final void BBz(C175327eH r3) {
        boolean z;
        if (r3.A01) {
            z = true;
        }
        z = false;
        if (z) {
            this.mThumbnailTrayController.A07(true);
        } else {
            this.mThumbnailTrayController.A06(true);
        }
    }

    public final /* bridge */ /* synthetic */ void BDg(Object obj, int i, float f, float f2) {
        C181027o9 r4 = (C181027o9) obj;
        if (!this.A06) {
            return;
        }
        if (r4 == C181027o9.CAMERA) {
            float A012 = C06420Oz.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, (float) this.mTabBarAndThumbnailTrayContainer.getMeasuredWidth(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.mTabBarAndThumbnailTrayContainer.setTranslationX(A012);
            this.mActionBarController.A00.setTranslationX(A012);
            return;
        }
        this.mTabBarAndThumbnailTrayContainer.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.mActionBarController.A00.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final /* bridge */ /* synthetic */ void BQo(Object obj) {
        this.A02 = (C181027o9) obj;
        A03();
    }

    public final void BSm() {
        C175327eH r4 = this.A01;
        ArrayList arrayList = new ArrayList();
        for (String str : r4.A02) {
            arrayList.add(r4.A03.get(str));
        }
        A01(this, arrayList, (C181837pZ) null);
    }

    public final void BSp(float f, float f2, int i) {
        this.A09 = f2;
        this.A0A = i;
        A00(this);
    }

    public final String getModuleName() {
        AnonymousClass3DK r1 = this.mTabController;
        if (r1 == null || r1.A02(this.A02) == null) {
            return "gallery_home_photos_tab";
        }
        return ((C27341Hl) this.mTabController.A02(this.A02)).getModuleName();
    }

    public final boolean onBackPressed() {
        boolean z;
        C180987o3 r3 = this.mCardFragmentNavigator;
        if (r3.A06.A0I() == 0 || r3.A02) {
            z = false;
        } else {
            r3.A02 = true;
            C180987o3.A01(r3, (float) r3.A03, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true);
            z = true;
        }
        if (z || ((AnonymousClass1HK) this.mTabController.A01()).onBackPressed()) {
            return true;
        }
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
        AnonymousClass3DK r0;
        if (i == 0 && (r0 = this.mTabController) != null) {
            AnonymousClass1HD A012 = r0.A01();
            if (A012 instanceof C181077oE) {
                ((C181077oE) A012).A00();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0142, code lost:
        if (r1.A06 != false) goto L_0x0144;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        view2.setOnTouchListener(new C181057oC(this));
        this.A01.A04.add(this);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) view2.findViewById(C0003R.C0005id.media_thumbnail_tray_container);
        touchInterceptorFrameLayout.setBackgroundColor(C019000b.A00(getContext(), C0003R.color.black_60_transparent));
        Resources resources = getContext().getResources();
        C83193jd r6 = new C83193jd(getContext(), this.A03, touchInterceptorFrameLayout, this.A01, C0003R.string.next, 0, 2, this, (C181117oI) null, 1.0f, resources.getDimensionPixelSize(C0003R.dimen.media_thumbnail_tray_height_square), resources.getDimensionPixelSize(C0003R.dimen.media_thumbnail_tray_item_spacing));
        this.mThumbnailTrayController = r6;
        C175327eH r5 = this.A01;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < r5.getCount(); i++) {
            arrayList.add(r5.AO7(i));
        }
        r6.B8W(arrayList);
        touchInterceptorFrameLayout.getViewTreeObserver().addOnPreDrawListener(new C180997o6(this, touchInterceptorFrameLayout));
        this.mPeekController = new C180957nz(this.A03, AU3(), getModuleName(), (ViewGroup) view2);
        this.mInnerContainer = view2.findViewById(C0003R.C0005id.inner_container);
        FixedTabBar fixedTabBar = (FixedTabBar) view2.findViewById(C0003R.C0005id.fixed_tabbar_view);
        this.mTabBar = fixedTabBar;
        fixedTabBar.setIndicatorEnabled(false);
        this.mTabBarShadow = view2.findViewById(C0003R.C0005id.bottom_tab_bar_shadow);
        ViewPager viewPager = (ViewPager) view2.findViewById(C0003R.C0005id.view_pager);
        this.mViewPager = viewPager;
        if (this.A06) {
            viewPager.setOffscreenPageLimit(2);
        }
        AnonymousClass1AM childFragmentManager = getChildFragmentManager();
        ViewPager viewPager2 = this.mViewPager;
        this.mTabController = new AnonymousClass3DK(this, childFragmentManager, viewPager2, this.mTabBar, this.A0C);
        this.mViewPager.setPageMargin(getResources().getDimensionPixelSize(C0003R.dimen.floating_divider_width));
        this.mTabController.A03(this.A02);
        AnonymousClass7H0 r4 = new AnonymousClass7H0(view2, this);
        this.mActionBarController = r4;
        r4.A01.setSelected(!this.A01.isEmpty());
        AnonymousClass7H0 r7 = this.mActionBarController;
        Folder currentFolder = getCurrentFolder();
        if (currentFolder != null) {
            List folders = r7.A04.getFolders();
            int i2 = 0;
            while (true) {
                if (i2 >= folders.size()) {
                    break;
                } else if (((Folder) folders.get(i2)).A01 == currentFolder.A01) {
                    r7.A05.setSelection(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.mTabBarAndThumbnailTrayContainer = view2.findViewById(C0003R.C0005id.tabbar_and_thumbnail_tray_container);
        if (!this.A08) {
            z = false;
        }
        z = true;
        if (z) {
            this.mTabBar.setVisibility(0);
            this.mTabBarShadow.setVisibility(0);
            C06220Of.A0I(touchInterceptorFrameLayout, getResources().getDimensionPixelSize(C0003R.dimen.top_tabbar_height));
        }
        this.mCardFragmentNavigator = new C180987o3(this, (TouchInterceptorFrameLayout) view2.findViewById(C0003R.C0005id.card_navigation_drag_container), (ViewGroup) view2.findViewById(C0003R.C0005id.card_navigation_container), this);
        A00(this);
    }

    public final void A05(Medium medium, int i, C181837pZ r6) {
        if (getActivity() != null && !A07()) {
            C175327eH r2 = this.A01;
            if (r2.A01) {
                r2.A01(medium, !r2.A03.containsKey(medium.AOA()));
                if (r6 == null) {
                    return;
                }
                if (this.A01.A03.containsKey(medium.AOA())) {
                    C181987pp.A01(this.A03).A06.put(r6.A02, r6);
                    return;
                }
                C181987pp A012 = C181987pp.A01(this.A03);
                A012.A06.remove(medium.AOA());
                return;
            }
            C181987pp A013 = C181987pp.A01(this.A03);
            int i2 = 1;
            if (medium.AiO()) {
                i2 = 2;
            }
            A013.A06(i2, i);
            A01(this, Collections.singletonList(medium), r6);
        }
    }

    public final C181427ot AMT() {
        return ((C181107oH) getActivity()).AMT();
    }

    public final C175327eH AMU() {
        return ((C181087oF) getActivity()).AMU();
    }

    public final C175317eG AU3() {
        return ((C181097oG) getActivity()).AU3();
    }

    public final void BM9(C175327eH r3) {
        boolean z = false;
        if (r3.getCount() > 0) {
            z = true;
        }
        if (z) {
            this.mThumbnailTrayController.A07(true);
        } else {
            this.mThumbnailTrayController.A06(true);
        }
    }

    public final Folder getCurrentFolder() {
        return this.A04;
    }

    public final List getFolders() {
        C181427ot AMT = AMT();
        ArrayList arrayList = new ArrayList(AMT.A01.A0A);
        C181487p0 r4 = AMT.A01;
        ArrayList arrayList2 = new ArrayList();
        for (Folder folder : r4.A09.values()) {
            if (!folder.A02() && !r4.A0A.contains(folder)) {
                arrayList2.add(folder);
            }
        }
        return AnonymousClass3TZ.A01(arrayList, arrayList2, new C175037do(this), AnonymousClass3TZ.A01);
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        if (r1 != false) goto L_0x0040;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int A022 = AnonymousClass0Z0.A02(1911077473);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A03 = A062;
        AnonymousClass0L7 r2 = AnonymousClass0L7.FS_NEW_GALLERY;
        this.A08 = ((Boolean) AnonymousClass0L6.A02(A062, r2, "stories_archive", false, (AnonymousClass04H) null)).booleanValue();
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A03, r2, "enable_camera_tab", false, (AnonymousClass04H) null)).booleanValue();
        this.A06 = booleanValue;
        if (!this.A08) {
            z = false;
        }
        z = true;
        boolean z2 = false;
        if (z) {
            i = getResources().getDimensionPixelSize(C0003R.dimen.top_tabbar_height);
        } else {
            i = 0;
        }
        this.A00 = i;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean("arg_add_to_album")) {
            z2 = true;
        }
        this.A05 = z2;
        if (this.A06) {
            List list = this.A0C;
            C181027o9 r22 = C181027o9.CAMERA;
            list.add(r22);
            this.A0B.put(r22, AnonymousClass3DN.A00(C0003R.string.camera));
        }
        List list2 = this.A0C;
        C181027o9 r23 = C181027o9.LOCAL_MEDIA;
        list2.add(r23);
        this.A0B.put(r23, AnonymousClass3DN.A00(C0003R.string.photos));
        if (this.A08) {
            List list3 = this.A0C;
            C181027o9 r24 = C181027o9.STORIES_ARCHIVE_MEDIA;
            list3.add(r24);
            this.A0B.put(r24, AnonymousClass3DN.A00(C0003R.string.stories));
        }
        this.A01 = ((C181087oF) getActivity()).AMU();
        AnonymousClass0Z0.A09(-1860068255, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1335063440);
        View inflate = layoutInflater.inflate(C0003R.layout.gallery_home_tabbed_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-136547512, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-790077985);
        super.onDestroyView();
        C180957nz r1 = this.mPeekController;
        if (r1 != null) {
            r1.A0C = true;
            r1.A0P.A04("end_peek");
        }
        this.A01.A04.remove(this);
        GalleryHomeTabbedFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(2091269763, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1136425251);
        super.onResume();
        this.A01.A00 = this;
        AnonymousClass3DK r0 = this.mTabController;
        if (r0 != null) {
            AnonymousClass1HD A012 = r0.A01();
            if (A012 instanceof C181077oE) {
                ((C181077oE) A012).A00();
            }
        }
        AnonymousClass0Z0.A09(-1182118699, A022);
    }
}
