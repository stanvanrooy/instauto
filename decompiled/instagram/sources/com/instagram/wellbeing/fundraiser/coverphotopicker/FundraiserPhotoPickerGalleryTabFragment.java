package com.instagram.wellbeing.fundraiser.coverphotopicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass3X7;
import p000X.AnonymousClass3X8;
import p000X.AnonymousClass3X9;
import p000X.AnonymousClass3XA;
import p000X.AnonymousClass6WN;
import p000X.C06590Pq;
import p000X.C178347jX;
import p000X.C182097q1;
import p000X.C182107q2;
import p000X.C182127q5;
import p000X.C182167qC;
import p000X.C182177qD;
import p000X.C27341Hl;
import p000X.C35251g3;
import p000X.C49672Dd;
import p000X.C51412Ko;
import p000X.C51422Kp;
import p000X.C51432Kq;
import p000X.C84823mM;

public class FundraiserPhotoPickerGalleryTabFragment extends C27341Hl implements C182107q2 {
    public AnonymousClass6WN A00;
    public ViewGroup A01;
    public C178347jX A02;
    public AnonymousClass0C1 A03;
    public AnonymousClass3XA A04;
    public RecyclerView mRecyclerView;

    public final boolean B8A(GalleryItem galleryItem, C182097q1 r3) {
        return false;
    }

    public final String getModuleName() {
        return "fundraiser_photo_picker_library_tab";
    }

    public final void B83(GalleryItem galleryItem, C182097q1 r8) {
        AnonymousClass6WN r1 = this.A00;
        if (r1 != null) {
            Medium medium = galleryItem.A01;
            r1.A00.A0W();
            C51432Kq r5 = new C51432Kq(r1.A03);
            C49672Dd r4 = r1.A02;
            ArrayList arrayList = new ArrayList();
            String A0E = AnonymousClass000.A0E("file://", medium.A0P);
            if (arrayList.size() == 0) {
                arrayList.add(C51412Ko.A00(A0E));
                if (arrayList.size() == 1) {
                    arrayList.add(C51412Ko.A00((Object) null));
                    r5.A00(r4, new C51422Kp(arrayList));
                    return;
                }
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }

    public static void A00(FundraiserPhotoPickerGalleryTabFragment fundraiserPhotoPickerGalleryTabFragment) {
        if (C35251g3.A07(fundraiserPhotoPickerGalleryTabFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            fundraiserPhotoPickerGalleryTabFragment.A04.A04();
            C178347jX r0 = fundraiserPhotoPickerGalleryTabFragment.A02;
            if (r0 != null) {
                r0.A00();
                fundraiserPhotoPickerGalleryTabFragment.A02 = null;
            }
        } else if (fundraiserPhotoPickerGalleryTabFragment.A02 == null) {
            String A06 = AnonymousClass1BA.A06(fundraiserPhotoPickerGalleryTabFragment.requireContext());
            C178347jX r4 = new C178347jX(fundraiserPhotoPickerGalleryTabFragment.A01, C0003R.layout.fundraiser_photo_picker_no_permission_layout);
            r4.A04.setText(fundraiserPhotoPickerGalleryTabFragment.getString(C0003R.string.storage_permission_rationale_title, A06));
            r4.A03.setText(fundraiserPhotoPickerGalleryTabFragment.getString(C0003R.string.storage_permission_rationale_message, A06));
            r4.A02.setText(C0003R.string.storage_permission_rationale_link);
            r4.A02.setOnClickListener(new C182167qC(fundraiserPhotoPickerGalleryTabFragment));
            fundraiserPhotoPickerGalleryTabFragment.A02 = r4;
        }
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1955694532);
        super.onCreate(bundle);
        this.A03 = AnonymousClass0J1.A06(requireArguments());
        AnonymousClass0Z0.A09(-1461147236, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-683105581);
        View inflate = layoutInflater.inflate(C0003R.layout.fundraiser_photo_picker_tab, viewGroup, false);
        AnonymousClass0Z0.A09(-269450206, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1363383849);
        super.onResume();
        A00(this);
        AnonymousClass0Z0.A09(1408952466, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C0003R.C0005id.view_container);
        AnonymousClass0a4.A06(findViewById);
        this.A01 = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(16908298);
        AnonymousClass0a4.A06(findViewById2);
        this.mRecyclerView = (RecyclerView) findViewById2;
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(3));
        this.mRecyclerView.A0r(new C182177qD(this, getResources().getDimensionPixelSize(C0003R.dimen.fundraiser_photo_padding)));
        int i = requireContext().getResources().getDisplayMetrics().widthPixels / 3;
        C84823mM r1 = new C84823mM(requireContext(), i, i, false, false);
        C182127q5 r4 = new C182127q5(requireContext(), r1, this);
        this.mRecyclerView.setAdapter(r4);
        AnonymousClass3X7 r3 = new AnonymousClass3X7(AnonymousClass1L8.A00(this), r1);
        r3.A02 = AnonymousClass3X8.STATIC_PHOTO_ONLY;
        r3.A04 = -1;
        this.A04 = new AnonymousClass3XA(new AnonymousClass3X9(r3), r4, requireContext(), false);
        A00(this);
    }
}
