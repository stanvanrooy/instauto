package com.instagram.archive.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.p004ui.widget.touchimageview.TouchImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass18C;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1GH;
import p000X.AnonymousClass1GK;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass5O6;
import p000X.AnonymousClass69H;
import p000X.AnonymousClass6A0;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C122915Oq;
import p000X.C122935Os;
import p000X.C1428869d;
import p000X.C1428969f;
import p000X.C1429169h;
import p000X.C1429269i;
import p000X.C1429369j;
import p000X.C1429469l;
import p000X.C1430269t;
import p000X.C16330oQ;
import p000X.C26441Dh;
import p000X.C27341Hl;
import p000X.C31131Wo;
import p000X.C32481bK;
import p000X.C33431cu;
import p000X.C36591iI;
import p000X.C44541wK;
import p000X.C72663Gk;

public class SelectHighlightsCoverFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass18C, C31131Wo, C33431cu {
    public Bitmap A00;
    public AnonymousClass6A0 A01;
    public AnonymousClass5O6 A02;
    public C122935Os A03;
    public AnonymousClass0C1 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public C1429469l A08;
    public AnonymousClass1GK A09;
    public PunchedOverlayView mPunchedOverlayView;
    public View mRootView;
    public TouchImageView mTouchImageView;
    public ReboundViewPager mViewPager;

    public final void AbX(Intent intent) {
    }

    public final boolean Ae1() {
        return true;
    }

    public final void Ar4(int i, int i2) {
    }

    public final void Ar5(int i, int i2) {
    }

    public final void B70(AnonymousClass1GK r1) {
    }

    public final void B72(AnonymousClass1GK r1, int i) {
    }

    public final void BpW(File file, int i) {
    }

    public final String getModuleName() {
        return "reel_highlights_cover_pic";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        AnonymousClass1GH A0D = AnonymousClass12C.A0c.A0D(selectHighlightsCoverFragment.A03.A02, selectHighlightsCoverFragment.getModuleName());
        A0D.A02(selectHighlightsCoverFragment);
        AnonymousClass1GK A002 = A0D.A00();
        selectHighlightsCoverFragment.A09 = A002;
        A002.A04();
    }

    public final void AtI(AnonymousClass1GK r3, C36591iI r4) {
        TouchImageView touchImageView = this.mTouchImageView;
        if (touchImageView != null && this.A09 == r3) {
            this.A00 = r4.A00;
            touchImageView.post(new C1429269i(this, r4));
        }
    }

    public final void Bps(Intent intent, int i) {
        C26441Dh.A00(this.A04).A03(getActivity(), "new_highlight_cover_photo");
        Context context = getContext();
        if (context != null && C16330oQ.A00.A06(context, intent)) {
            AnonymousClass1BH.A0B(intent, i, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r1 == false) goto L_0x0058;
     */
    public final boolean onBackPressed() {
        boolean z;
        if (this.A05) {
            this.A05 = false;
            return false;
        }
        Rect rect = this.A03.A00;
        Rect cropRect = this.mTouchImageView.getCropRect();
        boolean z2 = false;
        if (Math.abs(rect.bottom - cropRect.bottom) < 10) {
            z2 = true;
        }
        if (z2) {
            boolean z3 = false;
            if (Math.abs(rect.left - cropRect.left) < 10) {
                z3 = true;
            }
            if (z3) {
                boolean z4 = false;
                if (Math.abs(rect.right - cropRect.right) < 10) {
                    z4 = true;
                }
                if (z4) {
                    boolean z5 = false;
                    if (Math.abs(rect.top - cropRect.top) < 10) {
                        z5 = true;
                    }
                    z = true;
                }
            }
        }
        z = false;
        if (z && AnonymousClass17M.A00(this.A03.A03, this.A02.A00.A03) && AnonymousClass17M.A00(this.A03.A04, this.A02.A00.A04)) {
            return false;
        }
        AnonymousClass2OA r3 = new AnonymousClass2OA(getContext());
        r3.A07(C0003R.string.unsaved_changes_title);
        r3.A06(C0003R.string.unsaved_changes_message);
        r3.A0S(getString(C0003R.string.discard_changes), new C1429169h(this), true, Constants.A0Y);
        r3.A09(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
        r3.A03().show();
        return true;
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        if (getContext() != null) {
            r4.Bo6(true);
            r4.Bo0(false);
            r4.setTitle(getContext().getResources().getString(C0003R.string.highlights_select_image));
            AnonymousClass1EW.A03(getActivity()).A4S(getContext().getResources().getString(C0003R.string.done), new C1428869d(this));
        }
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            Uri fromFile = Uri.fromFile(new File(intent.getAction()));
            PendingMedia A042 = PendingMediaStore.A01(this.A04).A04(intent.getStringExtra("pending_media_key"));
            Rect A0D = C72663Gk.A0D(fromFile.getPath());
            ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(fromFile.toString());
            extendedImageUrl.A01 = A0D.width();
            extendedImageUrl.A00 = A0D.height();
            this.A03 = new C122935Os(extendedImageUrl, C122915Oq.A02(new Rect(0, 0, extendedImageUrl.getWidth(), extendedImageUrl.getHeight())), (String) null, A042.A24);
            A00(this);
            ReboundViewPager reboundViewPager = this.mViewPager;
            String str = this.A03.A03;
            int i3 = 0;
            if (str != null) {
                i3 = 1;
            }
            reboundViewPager.setCustomMinimumOffset(Integer.valueOf(i3));
            reboundViewPager.A0I(this.A01.A00(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (r2.contains(r1) != false) goto L_0x0031;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(-341543928);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A04 = A062;
        AnonymousClass5O6 A002 = AnonymousClass5O6.A00(A062);
        this.A02 = A002;
        Set keySet = A002.A05.keySet();
        String str = A002.A00.A03;
        if (str != null && !keySet.isEmpty()) {
            z = false;
        }
        z = true;
        if (!z) {
            this.A02.A05(getContext());
        }
        this.A03 = this.A02.A00;
        getActivity().getWindow().setSoftInputMode(48);
        Bundle bundle2 = this.mArguments;
        boolean z2 = false;
        if (bundle2 != null && bundle2.getBoolean("EXTRA_CAPTURE_INPUT_ONLY", false)) {
            z2 = true;
        }
        this.A06 = z2;
        this.A07 = !z2;
        AnonymousClass0Z0.A09(1387928429, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1037935326);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_highlights_cover_frame_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1268641305, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-987346653);
        super.onDestroyView();
        SelectHighlightsCoverFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-1625114656, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(605428199);
        super.onPause();
        getActivity().getWindow().setSoftInputMode(0);
        AnonymousClass0Z0.A09(-1189756124, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRootView = view;
        PunchedOverlayView punchedOverlayView = (PunchedOverlayView) view.findViewById(C0003R.C0005id.punched_overlay_view);
        this.mPunchedOverlayView = punchedOverlayView;
        punchedOverlayView.setDarkenColor(AnonymousClass1BA.A01(getContext(), C0003R.attr.profileHighlightThumbnailEditBackground));
        this.mPunchedOverlayView.addOnLayoutChangeListener(new C1430269t(this));
        this.mTouchImageView = (TouchImageView) view.findViewById(C0003R.C0005id.highlights_cover_image_preview);
        C1429469l r1 = new C1429469l();
        this.A08 = r1;
        TouchImageView touchImageView = this.mTouchImageView;
        touchImageView.setBoundsDelegate(r1);
        touchImageView.setTouchEnabled(true);
        A00(this);
        this.mViewPager = (ReboundViewPager) view.findViewById(C0003R.C0005id.media_view_pager);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.image_selector_thumbnail_size);
        int round = Math.round(((float) C06220Of.A09(getContext())) / ((float) dimensionPixelSize));
        ReboundViewPager reboundViewPager = this.mViewPager;
        reboundViewPager.setOverridePageSize(dimensionPixelSize);
        reboundViewPager.setExtraBufferSize(((round - 1) >> 1) + 2);
        this.mViewPager.setPageSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.mViewPager.setScrollMode(C32481bK.WHEEL_OF_FORTUNE);
        this.mViewPager.A0L(new C1428969f(this));
        this.mViewPager.setItemPositioner(new C44541wK(dimensionPixelSize, 0, 1.0f));
        this.mViewPager.A0L(new C1429369j(this));
        ReboundViewPager reboundViewPager2 = this.mViewPager;
        int i = 0;
        if (this.A03.A03 != null) {
            i = 1;
        }
        reboundViewPager2.setCustomMinimumOffset(Integer.valueOf(i));
        AnonymousClass6A0 r2 = new AnonymousClass6A0(new ArrayList(this.A02.A07.values()), new AnonymousClass69H(this));
        this.A01 = r2;
        this.mViewPager.setAdapter((Adapter) r2);
        this.mViewPager.A0I(this.A01.A00(this.A03.A03));
    }
}
