package com.instagram.creation.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.p029ui.effectpicker.FilterPicker;
import com.instagram.creation.base.p029ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1H3;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass802;
import p000X.AnonymousClass803;
import p000X.AnonymousClass804;
import p000X.AnonymousClass80F;
import p000X.AnonymousClass80T;
import p000X.AnonymousClass81L;
import p000X.AnonymousClass81O;
import p000X.AnonymousClass82K;
import p000X.AnonymousClass8Gy;
import p000X.C05760Lv;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C145206Is;
import p000X.C161106u5;
import p000X.C176547gN;
import p000X.C182797rM;
import p000X.C182887rW;
import p000X.C182977rh;
import p000X.C183027rm;
import p000X.C183867tM;
import p000X.C183957tX;
import p000X.C184057ti;
import p000X.C185947ww;
import p000X.C186047x8;
import p000X.C186297xX;
import p000X.C186337xb;
import p000X.C186707yC;
import p000X.C186727yF;
import p000X.C186747yH;
import p000X.C186807yN;
import p000X.C186857yS;
import p000X.C186947yb;
import p000X.C187047yl;
import p000X.C187057ym;
import p000X.C187087yp;
import p000X.C187137yu;
import p000X.C187167yx;
import p000X.C187197z0;
import p000X.C187207z1;
import p000X.C187217z2;
import p000X.C187387zK;
import p000X.C187397zL;
import p000X.C187447zQ;
import p000X.C187517zX;
import p000X.C187727zv;
import p000X.C1878280g;
import p000X.C1881781s;
import p000X.C1884582v;
import p000X.C23300zv;
import p000X.C26101Br;
import p000X.C26901Fs;
import p000X.C27341Hl;
import p000X.C56202c6;
import p000X.C88633sj;
import p000X.C88953tG;

public class AlbumEditFragment extends C27341Hl implements AnonymousClass1HK {
    public int A00;
    public ViewGroup A01;
    public ImageView A02;
    public ViewSwitcher A03;
    public C186337xb A04;
    public C1881781s A05;
    public CreationSession A06;
    public C187167yx A07;
    public C187197z0 A08;
    public C56202c6 A09;
    public C161106u5 A0A;
    public AnonymousClass0C1 A0B;
    public List A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F;
    public final C11200ea A0G = new C187047yl(this);
    public ImageView mAspectButton;
    public FilterPicker mFilterPicker;
    public C186707yC mRenderViewController;

    public static int A00(AlbumEditFragment albumEditFragment) {
        int i;
        int i2 = -1;
        for (int i3 = 0; i3 < albumEditFragment.A0C.size(); i3++) {
            MediaSession mediaSession = (MediaSession) albumEditFragment.A0C.get(i3);
            Integer num = mediaSession.A02;
            if (num == Constants.ZERO) {
                i = ((PhotoFilter) mediaSession.A00.A04.A03(15)).A0V;
            } else if (num == Constants.ONE) {
                i = albumEditFragment.A0A.ARi(mediaSession.A01()).A13.A01;
            } else {
                i = -1;
            }
            if (i3 == 0) {
                i2 = i;
            } else if (i2 != i) {
                return -1;
            }
        }
        return i2;
    }

    public static void A02(AlbumEditFragment albumEditFragment) {
        AlbumEditFragment albumEditFragment2 = albumEditFragment;
        if (albumEditFragment.A00 > 0) {
            albumEditFragment.A08.AKF().A04(Constants.ZERO);
            return;
        }
        int i = 0;
        C186707yC r0 = albumEditFragment.mRenderViewController;
        if (r0 != null) {
            albumEditFragment.unregisterLifecycleListener(r0);
            i = albumEditFragment.mRenderViewController.A0H.getCurrentChildIndex();
            albumEditFragment.mRenderViewController.BE0();
            albumEditFragment.mRenderViewController.Azh();
        }
        C186707yC r5 = new C186707yC(albumEditFragment.getActivity(), albumEditFragment.getContext(), albumEditFragment.A08, albumEditFragment.A0A, (ReboundHorizontalScrollView) albumEditFragment.mView.findViewById(C0003R.C0005id.render_scroll_view), albumEditFragment2, albumEditFragment.A06, (C186337xb) albumEditFragment.getActivity(), albumEditFragment);
        albumEditFragment.mRenderViewController = r5;
        albumEditFragment.registerLifecycleListener(r5);
        if (albumEditFragment.isResumed()) {
            albumEditFragment.mRenderViewController.BJx();
        }
        C187087yp r3 = new C187087yp(albumEditFragment);
        if (i != 0) {
            C186707yC r2 = albumEditFragment.mRenderViewController;
            r2.A0H.getViewTreeObserver().addOnPreDrawListener(new C187207z1(r2, i, r3));
            r2.A0H.invalidate();
            return;
        }
        r3.run();
    }

    public final String getModuleName() {
        return "albums_filter";
    }

    public static void A03(AlbumEditFragment albumEditFragment, float f) {
        C183027rm r0;
        CreationSession creationSession = albumEditFragment.A06;
        float f2 = f;
        creationSession.A00 = f;
        if (f == 1.0f) {
            r0 = C183027rm.SQUARE;
        } else {
            r0 = C183027rm.RECTANGULAR;
        }
        creationSession.A05 = r0;
        for (MediaSession mediaSession : creationSession.A08()) {
            Integer num = mediaSession.A02;
            if (num == Constants.ZERO) {
                PhotoSession photoSession = mediaSession.A00;
                CropInfo cropInfo = photoSession.A03;
                CropInfo A002 = C88633sj.A00(cropInfo.A01, cropInfo.A00, (Rect) null, photoSession.A01, false, f2);
                photoSession.A03 = A002;
                SurfaceCropFilter surfaceCropFilter = (SurfaceCropFilter) photoSession.A04.A03(1);
                surfaceCropFilter.A0N(A002.A01, A002.A00, A002.A02, photoSession.A01);
                C1884582v r1 = new C1884582v();
                surfaceCropFilter.A0P(r1);
                if (surfaceCropFilter.A0U(r1)) {
                    surfaceCropFilter.A0Q(r1);
                }
                albumEditFragment.A08.ABr(photoSession.A07);
            } else if (num == Constants.ONE) {
                VideoSession videoSession = mediaSession.A01;
                PendingMedia A042 = PendingMediaStore.A01(albumEditFragment.A0B).A04(videoSession.A0A);
                ClipInfo clipInfo = A042.A0l;
                clipInfo.A02 = f;
                A042.A04 = f;
                videoSession.A00 = f;
                Context context = albumEditFragment.getContext();
                AnonymousClass0a4.A06(context);
                Point A012 = AnonymousClass8Gy.A01(context, f, clipInfo.A0A);
                int i = A012.x;
                int i2 = A012.y;
                albumEditFragment.A00++;
                albumEditFragment.schedule(new C184057ti(albumEditFragment, A042, i, i2));
            }
        }
        A02(albumEditFragment);
    }

    public static void A04(AlbumEditFragment albumEditFragment, MediaSession mediaSession, boolean z) {
        C187517zX.A03(albumEditFragment.A0B, albumEditFragment.getContext());
        C187517zX A002 = C187517zX.A00(albumEditFragment.A0B);
        A002.A05(albumEditFragment.getContext());
        A002.A0B(z);
        switch (mediaSession.A02.intValue()) {
            case 0:
                PhotoSession photoSession = mediaSession.A00;
                CropInfo cropInfo = photoSession.A03;
                if (cropInfo != null) {
                    A002.A07(cropInfo, false, photoSession.A01);
                    A002.A08(photoSession.A07);
                    return;
                }
                return;
            case 1:
                int A003 = AnonymousClass80T.A00(albumEditFragment.getContext(), AnonymousClass80F.A00());
                PendingMedia ARi = albumEditFragment.A0A.ARi(mediaSession.A01());
                File file = new File(albumEditFragment.getContext().getExternalFilesDir((String) null), "icon_zero_frame.jpg");
                AnonymousClass802.A00(ARi, file, A003, A003, 50);
                A002.A07(new CropInfo(A003, A003, new Rect(0, 0, A003, A003)), false, 0);
                A002.A08(file.getAbsolutePath());
                return;
            default:
                return;
        }
    }

    public static void A05(AlbumEditFragment albumEditFragment, boolean z) {
        C185947ww.A00(albumEditFragment.A0B, new C145206Is());
        C187167yx r1 = albumEditFragment.A07;
        boolean z2 = false;
        if (r1 != null) {
            z2 = true;
        }
        if (z2) {
            r1.ArK(z);
            albumEditFragment.A07 = null;
            albumEditFragment.A03.setDisplayedChild(0);
            albumEditFragment.A01.removeAllViews();
            albumEditFragment.mRenderViewController.A02();
        }
    }

    public static boolean A06(AlbumEditFragment albumEditFragment) {
        for (VideoSession videoSession : albumEditFragment.A06.A0B()) {
            if (!albumEditFragment.A0A.ARi(videoSession.A0A).A33) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011d  */
    public final boolean onBackPressed() {
        boolean z;
        C183867tM r3;
        boolean z2;
        IgFilterGroup A042;
        IgFilterGroup A043;
        Integer num;
        boolean z3 = false;
        if (this.A07 != null) {
            z3 = true;
        }
        boolean z4 = false;
        if (z3) {
            A05(this, false);
            return true;
        }
        if ((this.A0F || !this.A0A.ARi(this.A06.A0B).A0m()) && !this.A06.A0F) {
            Iterator it = this.A0C.iterator();
            while (true) {
                if (it.hasNext()) {
                    MediaSession mediaSession = (MediaSession) it.next();
                    String A012 = mediaSession.A01();
                    PendingMedia ARi = this.A0A.ARi(A012);
                    Iterator it2 = this.A06.A0N.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            r3 = (C183867tM) it2.next();
                            if (r3.A06.equals(A012)) {
                            }
                        } else {
                            r3 = null;
                        }
                    }
                    if (!ARi.A0m()) {
                        switch (mediaSession.A02.intValue()) {
                            case 0:
                                IgFilterGroup igFilterGroup = mediaSession.A00.A04;
                                if (ARi.A2u && r3 != null) {
                                    AnonymousClass0C1 r4 = this.A0B;
                                    IgFilterGroup igFilterGroup2 = r3.A05;
                                    if (igFilterGroup2 == null) {
                                        AnonymousClass0QD.A01("MediaSessionState", "Called getFilterGroup() when filter group was null.");
                                        A042 = null;
                                    } else {
                                        A042 = igFilterGroup2.A04();
                                    }
                                    z2 = C88953tG.A07(r4, igFilterGroup, A042);
                                    break;
                                } else {
                                    z2 = C88953tG.A06(this.A0B, igFilterGroup);
                                    break;
                                }
                            case 1:
                                if (ARi.A2u && r3 != null) {
                                    z2 = AnonymousClass802.A02(ARi, r3.A03, r3.A02, r3.A01, r3.A00, r3.A07);
                                    break;
                                } else {
                                    z2 = AnonymousClass802.A01(ARi);
                                    break;
                                }
                        }
                        if (z2) {
                        }
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                C187057ym AKF = this.A08.AKF();
                if (!this.A0F) {
                    num = Constants.A04;
                } else {
                    num = Constants.A0C;
                }
                if (AKF.A04(num)) {
                    z4 = true;
                    if (!z4) {
                        C182887rW.A01().A04(this.A0B, "gallery");
                    }
                    return z4;
                }
            }
            CreationSession creationSession = this.A06;
            C161106u5 r6 = this.A0A;
            creationSession.A0E.clear();
            for (C183867tM r9 : creationSession.A0N) {
                MediaSession mediaSession2 = r9.A04;
                PendingMedia ARi2 = r6.ARi(mediaSession2.A01());
                Integer num2 = mediaSession2.A02;
                if (num2 == Constants.ZERO) {
                    PhotoSession photoSession = mediaSession2.A00;
                    IgFilterGroup igFilterGroup3 = r9.A05;
                    if (igFilterGroup3 == null) {
                        AnonymousClass0QD.A01("MediaSessionState", "Called getFilterGroup() when filter group was null.");
                        A043 = null;
                    } else {
                        A043 = igFilterGroup3.A04();
                    }
                    if (A043 != null) {
                        photoSession.A04 = A043;
                    }
                } else if (num2 == Constants.ONE) {
                    ARi2.A13.A01 = r9.A03;
                    ARi2.A05 = r9.A02;
                    ClipInfo clipInfo = ARi2.A0l;
                    clipInfo.A08 = r9.A01;
                    clipInfo.A06 = r9.A00;
                    ARi2.A33 = r9.A07;
                }
                creationSession.A0E.add(mediaSession2);
            }
            creationSession.A0F = false;
            ArrayList arrayList = new ArrayList();
            for (MediaSession mediaSession3 : this.A0C) {
                PendingMedia ARi3 = this.A0A.ARi(mediaSession3.A01());
                if (ARi3 != null) {
                    if (!ARi3.A2t) {
                        ARi3.A1q = null;
                    }
                    Integer num3 = mediaSession3.A02;
                    if (num3 == Constants.ZERO) {
                        PhotoSession photoSession2 = mediaSession3.A00;
                        AnonymousClass0C1 r8 = this.A0B;
                        IgFilterGroup igFilterGroup4 = photoSession2.A04;
                        AnonymousClass81O AHx = this.A08.AHx(photoSession2.A07);
                        AnonymousClass82K AP9 = this.A08.AP9(photoSession2.A07);
                        CropInfo cropInfo = photoSession2.A03;
                        C88953tG.A04(r8, igFilterGroup4, AHx, AP9, cropInfo.A01, cropInfo.A00, cropInfo.A02, photoSession2.A01);
                    } else if (num3 == Constants.ONE) {
                        C26101Br.A0F(ARi3.A28, getContext());
                    }
                    arrayList.add(ARi3.A1e);
                }
            }
            if (this.A0F) {
                C182977rh A002 = C182977rh.A00();
                ArrayList arrayList2 = new ArrayList();
                A002.A01 = arrayList2;
                arrayList2.addAll(arrayList);
            }
            if (!z4) {
            }
            return z4;
        }
        z = true;
        if (z) {
        }
        CreationSession creationSession2 = this.A06;
        C161106u5 r62 = this.A0A;
        creationSession2.A0E.clear();
        while (r10.hasNext()) {
        }
        creationSession2.A0F = false;
        ArrayList arrayList3 = new ArrayList();
        while (r7.hasNext()) {
        }
        if (this.A0F) {
        }
        if (!z4) {
        }
        return z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x025b, code lost:
        if (java.lang.Math.abs(1.0f - r3) >= 0.01f) goto L_0x025d;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        C186047x8 r0;
        boolean z;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        LayoutInflater from = LayoutInflater.from(getContext());
        if (C26901Fs.A00(this.A0B, Constants.ZERO).A00) {
            A04(this, (MediaSession) this.A0C.get(0), true);
            C187517zX.A00(this.A0B).A0A(C187137yu.A00(this.A0B));
        }
        for (PhotoSession photoSession : this.A06.A0A()) {
            C88953tG.A03(this.A0B, photoSession.A04, this.A08.AHx(photoSession.A07), this.A08.AP9(photoSession.A07));
        }
        ReboundHorizontalScrollView reboundHorizontalScrollView = (ReboundHorizontalScrollView) view2.findViewById(C0003R.C0005id.render_scroll_view);
        AnonymousClass1EA A012 = AnonymousClass1EA.A01(28.0d, 15.0d);
        AnonymousClass1EA A013 = AnonymousClass1EA.A01(0.0d, 3.8d);
        reboundHorizontalScrollView.setSnappingSpringConfig(A012);
        reboundHorizontalScrollView.setScrollingSpringConfig(A013);
        reboundHorizontalScrollView.setDeceleratingVelocity(((float) ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) * 2.0f);
        FragmentActivity activity = getActivity();
        C186707yC r8 = new C186707yC(activity, getContext(), this.A08, this.A0A, reboundHorizontalScrollView, this, this.A06, (C186337xb) activity, this);
        this.mRenderViewController = r8;
        registerLifecycleListener(r8);
        this.A03 = (ViewSwitcher) view2.findViewById(C0003R.C0005id.album_edit_filter_view_switcher);
        this.A01 = (ViewGroup) view2.findViewById(C0003R.C0005id.adjust_container);
        View findViewById = getActivity().findViewById(C0003R.C0005id.action_bar);
        ViewGroup viewGroup = (ViewGroup) this.A03.findViewById(C0003R.C0005id.accept_buttons_container);
        viewGroup.getLayoutParams().height = findViewById.getLayoutParams().height;
        View inflate = from.inflate(C0003R.layout.accept_reject_edit_buttons, viewGroup, false);
        inflate.setId(C0003R.C0005id.primary_accept_buttons);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        getActivity().findViewById(C0003R.C0005id.button_accept_adjust).setOnClickListener(new C187387zK(this));
        getActivity().findViewById(C0003R.C0005id.button_cancel_adjust).setOnClickListener(new C187397zL(this));
        int A002 = A00(this);
        FilterPicker filterPicker = (FilterPicker) view2.findViewById(C0003R.C0005id.album_filter_picker);
        this.mFilterPicker = filterPicker;
        filterPicker.A01 = AnonymousClass803.A00(this.A0B);
        this.mFilterPicker.A04 = new C186727yF(this, A002);
        ArrayList arrayList = new ArrayList(A01(this.A0B));
        this.mFilterPicker.setEffects(arrayList);
        if (A002 >= 0) {
            int A003 = C187217z2.A00(arrayList, A002);
            FilterPicker filterPicker2 = this.mFilterPicker;
            if (A003 < 0) {
                A003 = 0;
            }
            filterPicker2.A01 = A003;
        }
        if (C26901Fs.A00(this.A0B, Constants.ZERO).A00) {
            ArrayList arrayList2 = new ArrayList();
            for (C187727zv r2 : this.mFilterPicker.A05) {
                int ANC = r2.A03.ANC();
                if (ANC != -1) {
                    arrayList2.add(new C187447zQ(ANC, r2));
                }
            }
            C187517zX.A00(this.A0B).A09(arrayList2);
        }
        MediaEditActionBar APl = this.A08.APl();
        if (this.A0F) {
            r0 = C186047x8.CANCEL;
        } else {
            r0 = C186047x8.BACK;
        }
        APl.setupBackButton(r0);
        TextView textView = (TextView) getActivity().findViewById(C0003R.C0005id.next_button_textview);
        Resources resources = getContext().getResources();
        boolean z2 = this.A0F;
        int i = C0003R.string.next;
        if (z2) {
            i = C0003R.string.done;
        }
        String string = resources.getString(i);
        textView.setText(string);
        textView.setContentDescription(string);
        textView.setOnClickListener(new C186947yb(this));
        boolean z3 = false;
        if (C05760Lv.A01.A00.getInt("album_filter_tooltip_impressions", 0) < 2) {
            z3 = true;
        }
        if (z3) {
            View view3 = this.mView;
            if (view3 != null) {
                view3.postDelayed(new C176547gN(this), 500);
            }
            C05760Lv r3 = C05760Lv.A01;
            r3.A00.edit().putInt("album_filter_tooltip_impressions", r3.A00.getInt("album_filter_tooltip_impressions", 0) + 1).apply();
        }
        LinearLayout linearLayout = (LinearLayout) getActivity().findViewById(C0003R.C0005id.creation_secondary_actions);
        linearLayout.removeAllViews();
        if (AnonymousClass1H3.A02(this.A0B)) {
            CreationSession creationSession = this.A06;
            AnonymousClass0C1 r1 = this.A0B;
            float A032 = creationSession.A03(r1);
            float A022 = creationSession.A02(r1);
            if (Math.abs(1.0f - A032) < 0.01f) {
                z = true;
            }
            z = false;
            if (!z) {
                ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0003R.layout.media_edit_button, linearLayout, false);
                imageView.setImageResource(C0003R.C0004drawable.instagram_crop_outline_24);
                imageView.setContentDescription(getString(C0003R.string.aspect));
                this.mAspectButton = imageView;
                linearLayout.addView(imageView);
                this.mAspectButton.setOnClickListener(new C183957tX(this));
            }
        }
        boolean A023 = AnonymousClass1H3.A02(this.A0B);
        int i2 = C0003R.layout.mute_audio_button;
        if (A023) {
            i2 = C0003R.layout.mute_audio_button_new;
        }
        from.inflate(i2, linearLayout);
        this.A02 = (ImageView) getActivity().findViewById(C0003R.C0005id.button_mode_mute);
        if (!this.A06.A0L()) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        this.A02.setSelected(A06(this));
        this.A02.setOnClickListener(new C186747yH(this));
    }

    public static List A01(AnonymousClass0C1 r5) {
        List<C1878280g> A012 = AnonymousClass804.A01(r5);
        C186857yS r4 = new C186857yS();
        ArrayList arrayList = new ArrayList();
        for (C1878280g r1 : A012) {
            arrayList.add(new C186807yN(r5, r1, r4));
        }
        return arrayList;
    }

    public final C06590Pq getSession() {
        return this.A0B;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            C182797rM r0 = (C182797rM) getActivity();
            CreationSession AJ7 = r0.AJ7();
            this.A06 = AJ7;
            this.A0B = r0.AZl();
            this.A0C = AJ7.A08();
            FragmentActivity activity = getActivity();
            this.A08 = (C187197z0) activity;
            this.A04 = (C186337xb) activity;
            this.A0A = (C161106u5) activity;
            this.A05 = (C1881781s) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass000.A0E(context.toString(), " must implement CreationProvider"));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-2005487848);
        super.onCreate(bundle);
        this.A0F = this.mArguments.getBoolean("standalone_mode", false);
        C23300zv.A00(this.A0B).A02(C186297xX.class, this.A0G);
        AnonymousClass0Z0.A09(358172979, A022);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AnonymousClass81L.A02(this, z, i2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1280810336);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_album_filter, viewGroup, false);
        AnonymousClass0Z0.A09(525299944, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-594881771);
        super.onDestroy();
        C23300zv.A00(this.A0B).A03(C186297xX.class, this.A0G);
        AnonymousClass0Z0.A09(1150066134, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1726943142);
        super.onDestroyView();
        ImageView imageView = this.mAspectButton;
        if (imageView != null) {
            imageView.setOnTouchListener((View.OnTouchListener) null);
        }
        unregisterLifecycleListener(this.mRenderViewController);
        AlbumEditFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-827813553, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1010694696);
        super.onPause();
        C56202c6 r1 = this.A09;
        if (r1 != null) {
            r1.A06(false);
            this.A09 = null;
        }
        AnonymousClass0Z0.A09(754059713, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1093514100);
        super.onResume();
        getActivity().setRequestedOrientation(1);
        if (!AnonymousClass0PB.A06()) {
            getActivity().getWindow().addFlags(1024);
        }
        AnonymousClass0Z0.A09(658541008, A022);
    }
}
