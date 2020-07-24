package com.instagram.clips.capture.sharesheet.coverphoto.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.base.TriangleSpinner;
import com.instagram.p009ui.widget.mediapicker.Folder;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2WY;
import p000X.AnonymousClass3TZ;
import p000X.AnonymousClass3X7;
import p000X.AnonymousClass3X8;
import p000X.AnonymousClass3X9;
import p000X.AnonymousClass3XA;
import p000X.AnonymousClass7FF;
import p000X.AnonymousClass7FI;
import p000X.AnonymousClass7FJ;
import p000X.AnonymousClass7FK;
import p000X.AnonymousClass7FN;
import p000X.AnonymousClass7FO;
import p000X.AnonymousClass7FT;
import p000X.C06220Of;
import p000X.C178347jX;
import p000X.C27291Hg;
import p000X.C35251g3;
import p000X.C51742Ly;
import p000X.C76523Wf;
import p000X.C76573Wk;
import p000X.C84823mM;
import p000X.C84833mN;

public class GalleryCoverPhotoPickerController extends C27291Hg implements C76523Wf, C51742Ly, C76573Wk, AdapterView.OnItemSelectedListener {
    public final Context A00;
    public final AnonymousClass7FJ A01;
    public final AnonymousClass7FF A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass1HD A05;
    public final AnonymousClass7FT A06;
    public final AnonymousClass3XA A07;
    public FrameLayout mContainerView;
    public AnonymousClass7FI mCoverPhotoEmptyStateController;
    public RecyclerView mGalleryRecycler;
    public TriangleSpinner mTitleFolderPicker;

    public final void B2r(Exception exc) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void BAr(AnonymousClass3XA r3, List list, List list2) {
        AnonymousClass7FF r1 = this.A02;
        if (r1 != null) {
            AnonymousClass0Z1.A00(r1, 1949845496);
        }
    }

    public final void BE9(Map map) {
        if (map.containsKey("android.permission.READ_EXTERNAL_STORAGE")) {
            AnonymousClass2WY r4 = (AnonymousClass2WY) map.get("android.permission.READ_EXTERNAL_STORAGE");
            if (r4 == AnonymousClass2WY.GRANTED) {
                AnonymousClass7FI r1 = this.mCoverPhotoEmptyStateController;
                C178347jX r0 = r1.A00;
                if (r0 != null) {
                    r0.A00();
                    r1.A00 = null;
                }
                this.A07.A04();
                return;
            }
            AnonymousClass7FI r3 = this.mCoverPhotoEmptyStateController;
            C178347jX r02 = r3.A00;
            if (r02 != null) {
                r02.A00();
                r3.A00 = null;
            }
            C178347jX r2 = new C178347jX(r3.A01, C0003R.layout.permission_empty_state_view);
            r3.A00 = r2;
            r2.A04.setText(r3.A04);
            r2.A03.setText(r3.A03);
            r2.A02.setText(C0003R.string.cover_photo_storage_permission_link);
            r2.A02.setOnClickListener(new AnonymousClass7FK(r3, r4));
        }
    }

    public final void BJx() {
        if (C35251g3.A07(this.A00, "android.permission.READ_EXTERNAL_STORAGE")) {
            AnonymousClass7FI r1 = this.mCoverPhotoEmptyStateController;
            C178347jX r0 = r1.A00;
            if (r0 != null) {
                r0.A00();
                r1.A00 = null;
            }
            this.A07.A04();
            return;
        }
        C35251g3.A02(this.A01.getActivity(), this, "android.permission.READ_EXTERNAL_STORAGE");
    }

    public final Folder getCurrentFolder() {
        return this.A07.A01;
    }

    public final List getFolders() {
        return AnonymousClass3TZ.A00(this.A07, new AnonymousClass7FN(this), AnonymousClass3TZ.A01);
    }

    public GalleryCoverPhotoPickerController(AnonymousClass1HD r15, AnonymousClass7FJ r16) {
        this.A05 = r15;
        this.A01 = r16;
        this.A00 = r15.getContext();
        AnonymousClass7FF r1 = new AnonymousClass7FF(this);
        this.A02 = r1;
        r1.A01 = C0003R.layout.layout_folder_picker_title;
        r1.A00 = C0003R.layout.layout_folder_picker_item;
        Context context = this.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        this.A04 = (C06220Of.A09(context) - ((i != 0 ? dimensionPixelSize + (3 - i) : dimensionPixelSize) * 2)) / 3;
        Context context2 = this.A00;
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(C0003R.dimen.photo_grid_spacing);
        int i2 = dimensionPixelSize2 % 3;
        this.A03 = Math.round(((float) ((C06220Of.A09(context2) - ((i2 != 0 ? dimensionPixelSize2 + (3 - i2) : dimensionPixelSize2) * 2)) / 3)) / 0.5625f);
        boolean A002 = C84833mN.A00();
        C84823mM r8 = new C84823mM(this.A00, this.A04, this.A03, true, A002);
        this.A06 = new AnonymousClass7FT(this.A04, this.A03, r8, this);
        AnonymousClass3X7 r12 = new AnonymousClass3X7(AnonymousClass1L8.A00(this.A05), r8);
        r12.A02 = AnonymousClass3X8.STATIC_PHOTO_ONLY;
        r12.A03 = this;
        this.A07 = new AnonymousClass3XA(new AnonymousClass3X9(r12), this.A06, this.A00, false, A002, false);
    }

    public final void Azh() {
        super.Azh();
        GalleryCoverPhotoPickerControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void BE0() {
        super.BE0();
        this.A07.A05();
    }

    public final void BVf(View view, Bundle bundle) {
        this.mContainerView = (FrameLayout) view.findViewById(C0003R.C0005id.root_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        this.mGalleryRecycler = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(3));
        this.mGalleryRecycler.setAdapter(this.A06);
        RecyclerView recyclerView2 = this.mGalleryRecycler;
        int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(C0003R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        recyclerView2.A0r(new AnonymousClass7FO(dimensionPixelSize, false));
        this.mCoverPhotoEmptyStateController = new AnonymousClass7FI(this.A01.getActivity(), this.mContainerView, this);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int i2;
        Folder folder = (Folder) getFolders().get(i);
        Folder currentFolder = getCurrentFolder();
        if (currentFolder != null && currentFolder.A01 != (i2 = folder.A01)) {
            this.A07.A06(i2);
            this.mGalleryRecycler.A0g(0);
        }
    }
}
