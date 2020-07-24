package com.instagram.creation.capture;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.p029ui.mediatabbar.MediaTabHost;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.p009ui.widget.mediapicker.Folder;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0P6;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0ZH;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1OC;
import p000X.AnonymousClass2M5;
import p000X.AnonymousClass2VU;
import p000X.AnonymousClass3XA;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass6AF;
import p000X.AnonymousClass6B2;
import p000X.AnonymousClass6B3;
import p000X.AnonymousClass7r9;
import p000X.AnonymousClass848;
import p000X.AnonymousClass8FD;
import p000X.AnonymousClass95U;
import p000X.C019000b;
import p000X.C05700Lp;
import p000X.C06220Of;
import p000X.C06270Ok;
import p000X.C06400Ox;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C137535to;
import p000X.C161946vc;
import p000X.C16230oG;
import p000X.C17640qZ;
import p000X.C17660qb;
import p000X.C180637nR;
import p000X.C180657nT;
import p000X.C180667nU;
import p000X.C180677nV;
import p000X.C180687nW;
import p000X.C180697nX;
import p000X.C180717nb;
import p000X.C180757nf;
import p000X.C180767ng;
import p000X.C181987pp;
import p000X.C182027pt;
import p000X.C182047pv;
import p000X.C182637r3;
import p000X.C182647r4;
import p000X.C182667r8;
import p000X.C182677rA;
import p000X.C182687rB;
import p000X.C182697rC;
import p000X.C182717rE;
import p000X.C182737rG;
import p000X.C182757rI;
import p000X.C182767rJ;
import p000X.C182787rL;
import p000X.C182797rM;
import p000X.C182847rR;
import p000X.C182857rS;
import p000X.C182887rW;
import p000X.C182977rh;
import p000X.C182987ri;
import p000X.C183707sw;
import p000X.C183757t1;
import p000X.C183997tb;
import p000X.C1885683i;
import p000X.C190948Ed;
import p000X.C191048Ep;
import p000X.C23300zv;
import p000X.C26441Dh;
import p000X.C27341Hl;
import p000X.C27651Ir;
import p000X.C56142c0;
import p000X.C56162c2;
import p000X.C56172c3;
import p000X.C76723Xa;
import p000X.C77433Zu;
import p000X.C79603dj;
import p000X.C85423nK;
import p000X.C88583se;

public class MediaCaptureFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass8FD, C182987ri, C180657nT, C180667nU, C180677nV, C182637r3, AnonymousClass848 {
    public float A00;
    public SharedPreferences A01;
    public CreationSession A02;
    public C180697nX A03;
    public C182717rE A04;
    public C161946vc A05;
    public C182767rJ A06;
    public C77433Zu A07;
    public AnonymousClass0C1 A08;
    public C76723Xa A09;
    public C183707sw A0A;
    public File A0B;
    public boolean A0C;
    public boolean A0D;
    public C180697nX A0E;
    public AnonymousClass1OC A0F;
    public C183757t1 A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final C11200ea A0N = new C180717nb(this);
    public final C182667r8 A0O = new C182667r8(this);
    public C180637nR mActionBar;
    public View mActionBarShadow;
    public C182687rB mCaptureProvider;
    public View mCaptureView;
    public AnonymousClass7r9 mGalleryPickerView;
    public MediaTabHost mMediaTabHost;
    public C182047pv mUnifiedCaptureView;

    public final String getModuleName() {
        return "tabbed_gallery_camera";
    }

    private void A00() {
        if (this.mCaptureProvider.Abh()) {
            this.mMediaTabHost.A02(C180687nW.A02, false);
            this.mMediaTabHost.A05(false, true);
        } else {
            this.mMediaTabHost.A05(true, true);
        }
        this.mActionBar.A01();
    }

    public static void A01(MediaCaptureFragment mediaCaptureFragment, float f) {
        float f2;
        float right;
        AnonymousClass7r9 r2 = mediaCaptureFragment.mGalleryPickerView;
        if (mediaCaptureFragment.A0I) {
            f2 = ((float) ((mediaCaptureFragment.mMediaTabHost.A0G.getChildCount() - 1) * mediaCaptureFragment.mActionBar.getWidth())) - f;
        } else {
            f2 = -f;
        }
        r2.setTranslationX(f2);
        View view = mediaCaptureFragment.mCaptureView;
        if (mediaCaptureFragment.A0I) {
            right = ((float) ((mediaCaptureFragment.mMediaTabHost.A0G.getChildCount() - 2) * mediaCaptureFragment.mActionBar.getWidth())) - f;
        } else {
            right = ((float) mediaCaptureFragment.mGalleryPickerView.getRight()) + (-f);
        }
        view.setTranslationX(right);
    }

    public final boolean AcR() {
        return this.mCaptureProvider.Abh();
    }

    public final boolean AgT() {
        return this.mGalleryPickerView.A0X();
    }

    public final boolean AhE() {
        return this.mCaptureProvider.AhE();
    }

    public final void ArW() {
        C181987pp A012 = C181987pp.A01(this.A08);
        C181987pp.A02(A012, C181987pp.A00(A012, "ig_feed_gallery_tap_album_picker", 2));
    }

    public final void AtS() {
        if (this.A0A == null) {
            this.A0A = new C183707sw(this, this.A08);
        }
        this.A0A.A00(getContext(), "ig_gallery_upsell");
    }

    public final void AuK() {
        this.mMediaTabHost.A02(C180687nW.A00, true);
    }

    public final void AuW() {
        C181987pp A012 = C181987pp.A01(this.A08);
        C181987pp.A02(A012, C181987pp.A00(A012, "ig_feed_gallery_tap_cancel", 2));
        this.A0H = true;
        ((Activity) getContext()).onBackPressed();
    }

    public final void Awq() {
        this.mMediaTabHost.A05(!this.mCaptureProvider.Abh(), false);
    }

    public final void B54(AnonymousClass7r9 r2, Folder folder) {
        this.mActionBar.setSelectedFolder(folder);
    }

    public final void B5k(AnonymousClass7r9 r3, float f) {
        if (!this.A0K) {
            float min = Math.min(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A00 = min;
            this.mActionBar.setTranslationY(min);
            this.mActionBarShadow.setTranslationY(this.A00);
        }
    }

    public final void B5l(AnonymousClass7r9 r2) {
        this.A0G.A00();
        this.mActionBar.A01();
    }

    public final void BAq(AnonymousClass7r9 r4, List list, List list2) {
        C180697nX currentTab = this.mMediaTabHost.getCurrentTab();
        if (!this.A0J && list.isEmpty() && currentTab == C180687nW.A00) {
            this.mMediaTabHost.A02(C180687nW.A01, false);
        }
        this.A0J = true;
        AnonymousClass0Z1.A00(this.mActionBar.A02, -2070677495);
        this.A06.A01.A04();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r7.A05.A00();
     */
    public final void BD1() {
        C182697rC r0;
        C182687rB r1 = this.mCaptureProvider;
        if (r1 != null) {
            r0 = r1.getCaptureMode();
        } else {
            r0 = C182697rC.GALLERY;
        }
        int i = 1;
        switch (r0.ordinal()) {
            case 0:
                AnonymousClass7r9 r12 = this.mGalleryPickerView;
                if (r12.A0X()) {
                    i = r12.getSelectedMediaCount();
                    this.mGalleryPickerView.A0T();
                }
                break;
            case 2:
                if (!r1.AcB()) {
                    C190948Ed r5 = (C190948Ed) this.mCaptureProvider;
                    Context context = r5.getContext();
                    r5.getContext();
                    C56142c0 r4 = new C56142c0((Activity) context, new AnonymousClass95U((CharSequence) context.getString(C0003R.string.video_minimum_warning)));
                    r4.A02(r5.A03);
                    r4.A07 = C56172c3.A04;
                    r4.A05 = C56162c2.ABOVE_ANCHOR;
                    View rootView = r5.getRootView();
                    if (rootView != null) {
                        rootView.post(new C182737rG(r5, r4));
                    }
                    C190948Ed.A04(r5, true);
                    break;
                } else {
                    this.mCaptureProvider.BYF();
                }
        }
        C181987pp A012 = C181987pp.A01(this.A08);
        C06270Ok A002 = C06270Ok.A00();
        A002.A07("number_of_media", Integer.valueOf(i));
        AnonymousClass0P4 A003 = C181987pp.A00(A012, "ig_feed_gallery_tap_next", 2);
        A003.A08("extra_data", A002);
        C181987pp.A02(A012, A003);
    }

    public final boolean BEI(C180637nR r4, Folder folder) {
        String str;
        AnonymousClass0P4 A002 = C137535to.A00(Constants.A06);
        int i = folder.A01;
        if (i == -10) {
            str = "videos_over_60_sec";
        } else if (i == -9) {
            str = "favorites";
        } else if (i == -6) {
            str = "instagram";
        } else if (i == -5) {
            str = "external";
        } else if (i == -3) {
            str = "videos";
        } else if (i == -2) {
            str = "photos";
        } else if (i != -1) {
            str = "user_folder";
        } else {
            str = "all";
        }
        A002.A0G("folder_name", str);
        A002.A0E("folder_size", Integer.valueOf(folder.A03.size()));
        AnonymousClass0WN.A01(this.A08).BcG(A002);
        C181987pp A012 = C181987pp.A01(this.A08);
        C181987pp.A02(A012, C181987pp.A00(A012, "ig_feed_gallery_select_album", 2));
        if (folder.A01 == -5) {
            File A042 = AnonymousClass0P6.A04(getContext());
            this.A0B = A042;
            AnonymousClass6AF.A03(this, 0, A042);
            return false;
        } else if (folder.A02()) {
            return false;
        } else {
            this.mGalleryPickerView.setCurrentFolderById(folder.A01);
            return true;
        }
    }

    public final void BEP(Exception exc) {
        AnonymousClass0QD.A05("MediaCaptureFragment.PictureTakenError", "An exception happened while attempting to take a photo", exc);
    }

    public final void BHJ() {
        C182687rB r2 = this.mCaptureProvider;
        if (r2.getCaptureMode() == C182697rC.CAMCORDER) {
            r2.BYF();
            this.A05.A00();
        }
    }

    public final void BMu(Uri uri) {
        this.A0G.A01(Constants.ZERO, uri, "ig_gallery_upsell");
    }

    public final void BOi() {
        this.mMediaTabHost.A02(C180687nW.A02, true);
    }

    public final Folder getCurrentFolder() {
        return this.mGalleryPickerView.getCurrentFolder();
    }

    public final List getFolders() {
        return this.mGalleryPickerView.getFolders();
    }

    public final boolean onBackPressed() {
        if (this.mGalleryPickerView.A0Y()) {
            return true;
        }
        C182047pv r0 = this.mUnifiedCaptureView;
        if (r0 != null) {
            C79603dj r02 = r0.A00;
            if (r02 == null || !r02.onBackPressed()) {
                return false;
            }
            return true;
        }
        C182687rB r2 = this.mCaptureProvider;
        if (r2 == null) {
            return false;
        }
        if (!this.A0H) {
            return r2.BdS();
        }
        this.A0H = false;
        return r2.BdN();
    }

    public final void AyO(Medium medium) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C17660qb.A00.A0E(activity, this.A08, AnonymousClass2VU.FEED_UPLOAD, medium, 9);
        }
    }

    public final boolean BAb(List list) {
        List A012 = C1885683i.A01(list);
        C182757rI r1 = (C182757rI) getActivity();
        if (r1 != null) {
            r1.A9k(A012, false);
        }
        return false;
    }

    public final void BEO(byte[] bArr, C88583se r5) {
        C05700Lp.A00().ADc(new C182857rS(this, getContext(), bArr, r5));
    }

    public final void BR6() {
        File A042 = AnonymousClass0P6.A04(getContext());
        this.A0B = A042;
        AnonymousClass0C1 r4 = this.A08;
        FragmentActivity activity = getActivity();
        Integer A002 = AnonymousClass6B2.A00(activity, r4);
        if (A002 != Constants.A0N) {
            C182887rW A012 = C182887rW.A01();
            A012.A0E = AnonymousClass6B3.A00(A002);
            A012.A06(r4, "external_gallery");
            A012.A0b = true;
        }
        switch (A002.intValue()) {
            case 0:
                String $const$string = AnonymousClass40t.$const$string(207);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.PICK");
                intent.setType("image/*");
                intent.putExtra("output", Uri.fromFile(A042));
                intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.name());
                List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i);
                    if (queryIntentActivities.get(i) != null) {
                        String str = resolveInfo.activityInfo.packageName;
                        if ($const$string.equals(str)) {
                            intent.setComponent(new ComponentName(str, queryIntentActivities.get(i).activityInfo.name));
                            AnonymousClass1BH.A00(intent, 0, activity);
                            return;
                        }
                    }
                }
                return;
            case 1:
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.PICK");
                intent2.setType("image/*");
                intent2.putExtra("output", Uri.fromFile(A042));
                intent2.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.name());
                AnonymousClass1BH.A00(intent2, 0, activity);
                return;
            case 2:
                Intent intent3 = new Intent();
                intent3.setAction(AnonymousClass40t.$const$string(5));
                intent3.setType("image/*");
                intent3.putExtra("output", Uri.fromFile(A042));
                intent3.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.name());
                AnonymousClass1BH.A00(Intent.createChooser(intent3, activity.getResources().getString(C0003R.string.choose_from_another_app)), 0, activity);
                return;
            default:
                return;
        }
    }

    public final void afterOnDestroyView() {
        super.afterOnDestroyView();
        unregisterLifecycleListener(this.A07);
    }

    public final C06590Pq getSession() {
        return this.A08;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 0) {
            Uri A012 = AnonymousClass6AF.A01(intent, this.A0B);
            C182887rW A013 = C182887rW.A01();
            if (A013.A0b) {
                A013.A0E = AnonymousClass6B3.A00(AnonymousClass6B2.A00(getContext(), this.A08));
                AnonymousClass0C1 r3 = this.A08;
                AnonymousClass0P4 A002 = C182887rW.A00(A013, "external_gallery", "media_crop");
                A002.A0H("launched_external_gallery_type", A013.A0E);
                AnonymousClass0WN.A01(r3).BcG(A002);
                A013.A0b = false;
                A013.A0E = null;
            }
            ((C182757rI) getActivity()).ApM(A012);
        } else if (i == 1) {
            FragmentActivity activity2 = getActivity();
            C182797rM r6 = (C182797rM) activity2;
            C182757rI r4 = (C182757rI) activity2;
            Location location = this.A05.A01;
            if (intent == null || intent.getData() == null) {
                AnonymousClass0QD.A01("layout_import_failed", "failed to copy uri intent from intent");
            } else {
                C137535to.A01(Constants.A0q, r6.AZl());
                try {
                    File A042 = AnonymousClass0P6.A04(activity2);
                    AnonymousClass0P6.A08(activity2.getContentResolver().openInputStream(intent.getData()), A042);
                    Uri fromFile = Uri.fromFile(A042);
                    r6.AJ7().A0H(fromFile.getPath());
                    r4.BEG(fromFile.getPath(), location, 0, 2);
                    return;
                } catch (FileNotFoundException e) {
                    if (e != null) {
                        AnonymousClass0QD.A05("layout_import_failed", "failed to copy uri intent from intent", e);
                    } else {
                        AnonymousClass0QD.A01("layout_import_failed", "failed to copy uri intent from intent");
                    }
                }
            }
            AnonymousClass5F9.A00(activity2, C0003R.string.layout_import_failed);
        } else if (i == 2) {
            AnonymousClass0C1 r1 = this.A08;
            if (intent != null && intent.getData() != null) {
                C137535to.A01(Constants.A0y, r1);
                ((C182757rI) getActivity()).Apc(intent.getData());
            }
        } else if (i == 9 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009c, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r5, p000X.AnonymousClass0L7.FS_NEW_GALLERY, "old_gallery_enable_new_camera", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004e, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r4, p000X.AnonymousClass0L7.FS_NEW_GALLERY, "old_gallery_hide_preview", false, (p000X.AnonymousClass04H) null)).booleanValue() != false) goto L_0x0050;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int intExtra;
        int A022 = AnonymousClass0Z0.A02(679246545);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A08 = A062;
        C182767rJ r3 = new C182767rJ(AnonymousClass00B.A01);
        this.A06 = r3;
        r3.A0F(getContext(), this, C26441Dh.A00(A062));
        AnonymousClass0C1 r4 = this.A08;
        if (!((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.FS_CREATION_FLOW_TWEAKS, "start_gallery_preview_offscreen", false, (AnonymousClass04H) null)).booleanValue()) {
            z = false;
        }
        z = true;
        this.A0K = z;
        this.A01 = getActivity().getPreferences(0);
        this.A03 = C180687nW.A00;
        this.A04 = new C182717rE(this, getActivity());
        AnonymousClass0C1 r5 = this.A08;
        this.A0G = new C183757t1(this, r5);
        CreationSession AJ7 = ((C182797rM) getContext()).AJ7();
        this.A02 = AJ7;
        MediaCaptureConfig mediaCaptureConfig = AJ7.A09;
        if (mediaCaptureConfig.A01 && mediaCaptureConfig.A02) {
            z2 = true;
        }
        z2 = false;
        this.A0M = z2;
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.A0C = bundle2.getBoolean("standalone_mode", false);
        if (bundle == null && (intExtra = getActivity().getIntent().getIntExtra("mediaCaptureTab", -1)) >= 0 && !this.A0C && !this.A0M) {
            this.A0E = C180687nW.A00(intExtra);
        }
        this.A0I = C06400Ox.A02(getContext());
        C17640qZ r32 = C17640qZ.A00;
        AnonymousClass1OC A092 = r32.A09(this, this, this.A08, QuickPromotionSlot.MEDIA_CAPTURE, r32.A03().A00());
        this.A0F = A092;
        registerLifecycleListener(A092);
        AnonymousClass0Z0.A09(-1004418587, A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0186  */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C180697nX r0;
        int i;
        int A022 = AnonymousClass0Z0.A02(810733209);
        Context context = getContext();
        this.mMediaTabHost = new MediaTabHost(context, (AttributeSet) null);
        this.A06.A01.A03();
        C182847rR r8 = new C182847rR(context, this.A0C, this.A08, this.A0K, this);
        this.mGalleryPickerView = r8;
        boolean z = true;
        if (this.A02.A0M()) {
            List list = C182977rh.A00().A01;
            AnonymousClass3XA r6 = r8.A14;
            C182647r4 r5 = new C182647r4(r8, -1, list);
            if (r6.A04) {
                r5.run();
            } else {
                r6.A02 = r5;
            }
        } else {
            boolean z2 = this.A0K;
            if (!z2) {
                r8.setCurrentFolderByIdAndSelectFirstItem(-1);
            } else if (z2 && !this.A0L) {
                this.A0L = true;
                r8.A0W(false);
            }
        }
        this.mGalleryPickerView.setId(C0003R.C0005id.gallery_picker_view);
        this.mGalleryPickerView.setTopOffset(C27651Ir.A00(getContext()));
        this.mGalleryPickerView.setTabBarHeight(this.mMediaTabHost.getTabHeight());
        boolean z3 = false;
        if (C183997tb.A00(getContext()) == Constants.A0N) {
            z3 = true;
        }
        this.A0D = z3;
        View inflate = layoutInflater.inflate(C0003R.layout.delete_clip_button, this.mMediaTabHost, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, 0);
        inflate.setLayoutParams(layoutParams);
        if (this.A0D) {
            layoutParams.height = C27651Ir.A00(getContext());
            layoutParams.gravity = 49;
            C06220Of.A0L(inflate, (int) C06220Of.A03(getContext(), 2));
        } else {
            layoutParams.height = this.mMediaTabHost.getTabHeight();
            layoutParams.gravity = 81;
        }
        if (this.A0M) {
            C182047pv r7 = new C182047pv(getContext());
            r7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            C06220Of.A0I(r7, this.mMediaTabHost.getTabHeight());
            this.mCaptureView = r7;
            this.mUnifiedCaptureView = r7;
        } else {
            C190948Ed r4 = new C190948Ed(context, this.A06.A00);
            r4.setDeleteClipButton(inflate, new C182677rA(this, inflate));
            this.mCaptureView = r4;
            this.mCaptureProvider = r4;
            r4.setListener(this);
            r4.setNavigationDelegate((C182757rI) getActivity());
        }
        C180637nR r72 = new C180637nR(context);
        this.mActionBar = r72;
        if (this.A0C) {
            r72.A04 = true;
            C180697nX r42 = C180687nW.A00;
            r72.A00 = r42;
            if (r72.A03) {
                i = (r72.getChildCount() - 1) - r72.A00.A00;
            } else {
                i = r42.A00;
            }
            r72.BQe((float) i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            r72.BQe((float) r72.A00.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            C180637nR.A00(r72, true, true, false);
            r72.A08.setImageResource(C0003R.C0004drawable.instagram_arrow_back_24);
            r72.A0A.setText(C0003R.string.done);
        }
        this.mActionBar.setBaseDelegate(this);
        this.mActionBar.setGalleryDelegate(this);
        this.mActionBar.setFeedCaptureDelegate(this);
        this.mMediaTabHost.A03(this.mGalleryPickerView);
        this.mMediaTabHost.addView(this.mGalleryPickerView, 0);
        C182687rB r43 = this.mCaptureProvider;
        if (r43 != null) {
            this.mMediaTabHost.A03(r43);
        }
        this.mMediaTabHost.addView(this.mCaptureView, 1);
        this.mMediaTabHost.A03(this.mActionBar);
        this.mMediaTabHost.addView(this.mActionBar, 2);
        this.mMediaTabHost.addView(inflate, 3);
        View inflate2 = layoutInflater.inflate(C0003R.layout.action_bar_shadow, this.mMediaTabHost, false);
        this.mActionBarShadow = inflate2;
        this.mMediaTabHost.addView(inflate2);
        C182027pt r44 = new C182027pt(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C180687nW.A00);
        if (this.A0M) {
            r0 = C180687nW.A01;
        } else {
            if (this.A02.A09.A01) {
                arrayList.add(C180687nW.A01);
            }
            if (this.A02.A09.A02) {
                r0 = C180687nW.A02;
            }
            MediaTabHost mediaTabHost = this.mMediaTabHost;
            mediaTabHost.A0G.setTabs(arrayList, new C180767ng(mediaTabHost, true));
            MediaTabHost mediaTabHost2 = this.mMediaTabHost;
            if (arrayList.size() <= 1) {
                z = false;
            }
            mediaTabHost2.A04(z);
            this.mMediaTabHost.A03(r44);
            this.mGalleryPickerView.A00 = this;
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            C23300zv.A00(this.A08).A02(C180757nf.class, this.A0N);
            this.A0F.BL4();
            MediaTabHost mediaTabHost3 = this.mMediaTabHost;
            AnonymousClass0Z0.A09(-2134920274, A022);
            return mediaTabHost3;
        }
        arrayList.add(r0);
        MediaTabHost mediaTabHost4 = this.mMediaTabHost;
        mediaTabHost4.A0G.setTabs(arrayList, new C180767ng(mediaTabHost4, true));
        MediaTabHost mediaTabHost22 = this.mMediaTabHost;
        if (arrayList.size() <= 1) {
        }
        mediaTabHost22.A04(z);
        this.mMediaTabHost.A03(r44);
        this.mGalleryPickerView.A00 = this;
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        C23300zv.A00(this.A08).A02(C180757nf.class, this.A0N);
        this.A0F.BL4();
        MediaTabHost mediaTabHost32 = this.mMediaTabHost;
        AnonymousClass0Z0.A09(-2134920274, A022);
        return mediaTabHost32;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1748398873);
        super.onDestroy();
        this.A0G.A00();
        this.A05 = null;
        unregisterLifecycleListener(this.A0F);
        AnonymousClass0Z0.A09(-68504693, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1138467989);
        super.onDestroyView();
        C23300zv.A00(this.A08).A03(C180757nf.class, this.A0N);
        this.mGalleryPickerView.A00 = null;
        this.mMediaTabHost.A0H.clear();
        this.mActionBar.setBaseDelegate((C180667nU) null);
        this.mActionBar.setGalleryDelegate((C180657nT) null);
        this.mActionBar.setFeedCaptureDelegate((C180677nV) null);
        C182687rB r0 = this.mCaptureProvider;
        if (r0 != null) {
            r0.setListener((AnonymousClass8FD) null);
        }
        getActivity().getWindow().setBackgroundDrawableResource(AnonymousClass1BA.A03(getContext(), C0003R.attr.backgroundColorPrimary));
        MediaCaptureFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(695626853, A022);
    }

    public final void onPause() {
        C85423nK r0;
        Dialog dialog;
        int A022 = AnonymousClass0Z0.A02(2027390713);
        super.onPause();
        SharedPreferences.Editor edit = this.A01.edit();
        edit.putInt("__CAPTURE_TAB_V2__", this.mMediaTabHost.getCurrentTab().A00);
        C182687rB r1 = this.mCaptureProvider;
        if (r1 != null) {
            r0 = r1.getCameraFacing();
        } else {
            r0 = null;
        }
        if (r0 != null) {
            edit.putInt("__CAMERA_FACING__", r1.getCameraFacing().A03);
        }
        edit.apply();
        C16230oG.A00.removeLocationUpdates(this.A08, this.A05);
        C16230oG.A00.cancelSignalPackageRequest(this.A08, this.A05);
        AnonymousClass0ZA.A02(this.A0O, 1);
        C183707sw r02 = this.A0A;
        if (!(r02 == null || (dialog = r02.A00) == null)) {
            dialog.dismiss();
        }
        C182717rE r2 = this.A04;
        if (r2.A02 == null) {
            AnonymousClass0DB.A0E("PreciseOrientationEventListener", "Cannot detect sensors. Invalid disable");
        } else if (r2.A05) {
            AnonymousClass0ZH.A00(r2.A04, r2.A03);
            r2.A05 = false;
        }
        this.mGalleryPickerView.A0U();
        C182687rB r03 = this.mCaptureProvider;
        if (r03 != null) {
            r03.BE0();
        }
        AnonymousClass0Z0.A09(-2049000454, A022);
    }

    public final void onResume() {
        AnonymousClass2M5 r1;
        String str;
        int A022 = AnonymousClass0Z0.A02(396772774);
        super.onResume();
        C182787rL r3 = new C182787rL();
        r3.A01 = C180687nW.A00(this.A01.getInt("__CAPTURE_TAB_V2__", this.A03.A00));
        r3.A00 = C85423nK.A00(this.A01.getInt("__CAMERA_FACING__", C85423nK.BACK.A03));
        if (!AnonymousClass0PB.A06()) {
            getActivity().getWindow().addFlags(1024);
        }
        getActivity().getWindow().setBackgroundDrawable(new ColorDrawable(C019000b.A00(getContext(), C0003R.color.igds_secondary_background)));
        if (!this.A0C) {
            this.A02.A0M.clear();
        }
        CreationSession creationSession = this.A02;
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r2 = this.A08;
        C161946vc r6 = new C161946vc(creationSession, activity, r2, this.A04);
        this.A05 = r6;
        C16230oG.A00.requestLocationUpdates(r2, r6, "MediaCaptureFragment");
        C180697nX r22 = this.A0E;
        if (r22 == null) {
            r22 = r3.A01;
        }
        this.mMediaTabHost.A02(r22, false);
        C182767rJ r5 = this.A06;
        boolean equals = r22.equals(C180687nW.A00);
        if (equals) {
            r1 = r5.A01;
        } else {
            r1 = r5.A00;
        }
        r5.A05.add(r1);
        r5.A04.add(r1);
        if (equals) {
            str = "gallery";
        } else {
            str = "camera";
        }
        r5.A0A(DatePickerDialogModule.ARG_MODE, str);
        AnonymousClass0ZA.A0B(this.A0O, 1);
        this.mGalleryPickerView.A0V();
        C182687rB r12 = this.mCaptureProvider;
        if (r12 != null) {
            r12.setInitialCameraFacing(r3.A00);
            this.mCaptureProvider.BJx();
        }
        getActivity().setRequestedOrientation(1);
        if (this.A09 == null) {
            this.A09 = new C76723Xa(this.A08, getContext(), AnonymousClass1L8.A00(this));
        }
        this.A09.A00();
        AnonymousClass0Z0.A09(1797210174, A022);
    }

    public final void AwX(C191048Ep r1, Integer num) {
        A00();
    }

    public final void AwW(C191048Ep r1) {
        A00();
    }

    public final void Awb(C191048Ep r1) {
        A00();
    }
}
