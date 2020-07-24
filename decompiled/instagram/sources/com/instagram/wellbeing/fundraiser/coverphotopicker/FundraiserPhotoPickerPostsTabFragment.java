package com.instagram.wellbeing.fundraiser.coverphotopicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import java.util.ArrayList;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass382;
import p000X.AnonymousClass387;
import p000X.AnonymousClass6WJ;
import p000X.AnonymousClass6WK;
import p000X.AnonymousClass6WN;
import p000X.C06590Pq;
import p000X.C124695Vx;
import p000X.C27341Hl;
import p000X.C29621Qp;
import p000X.C49672Dd;
import p000X.C51412Ko;
import p000X.C51422Kp;
import p000X.C51432Kq;
import p000X.C61622m6;
import p000X.C63532pd;

public class FundraiserPhotoPickerPostsTabFragment extends C27341Hl implements C63532pd {
    public AnonymousClass6WN A00;
    public AnonymousClass387 A01;
    public AnonymousClass0C1 A02;
    public C124695Vx A03;
    public RecyclerView mRecyclerView;

    public final boolean B64(View view, MotionEvent motionEvent, AnonymousClass1NJ r4, int i) {
        return false;
    }

    public final String getModuleName() {
        return "fundraiser_photo_picker_posts_tab";
    }

    public static void A00(FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment, boolean z) {
        AnonymousClass387 r1 = fundraiserPhotoPickerPostsTabFragment.A01;
        if (r1 != null && !r1.A02()) {
            boolean z2 = z;
            if (z || r1.A00.A03()) {
                r1.A00(z2, true, true, fundraiserPhotoPickerPostsTabFragment.A02.A04(), (String) null, false);
            }
        }
    }

    public final void B63(AnonymousClass1NJ r7, int i) {
        AnonymousClass6WN r1 = this.A00;
        if (r1 != null) {
            r1.A00.A0W();
            C51432Kq r5 = new C51432Kq(r1.A03);
            C49672Dd r4 = r1.A02;
            ArrayList arrayList = new ArrayList();
            String A0v = r7.A0v(r1.A01.A00);
            if (arrayList.size() == 0) {
                arrayList.add(C51412Ko.A00(A0v));
                String str = r7.A27;
                if (arrayList.size() == 1) {
                    arrayList.add(C51412Ko.A00(str));
                    r5.A00(r4, new C51422Kp(arrayList));
                    return;
                }
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1712057436);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0J1.A06(requireArguments());
        this.A01 = new AnonymousClass387(requireContext(), this.A02, AnonymousClass1L8.A00(this), new AnonymousClass6WJ(this), AnonymousClass382.FULL_AUDIENCE_MEDIA_GRID.A00, (String) null, false);
        AnonymousClass0Z0.A09(-1900491831, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1376551888);
        this.A03 = new C124695Vx(requireContext(), this, this.A02, this);
        View inflate = layoutInflater.inflate(C0003R.layout.fundraiser_photo_picker_tab, viewGroup, false);
        AnonymousClass0Z0.A09(-975114133, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(16908298);
        AnonymousClass0a4.A06(findViewById);
        this.mRecyclerView = (RecyclerView) findViewById;
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext(), 1);
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A03);
        this.mRecyclerView.A0w(new C61622m6(new AnonymousClass6WK(this), C29621Qp.GRID, fastScrollingLinearLayoutManager, false, false));
        A00(this, true);
    }
}
