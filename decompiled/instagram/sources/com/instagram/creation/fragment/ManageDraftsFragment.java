package com.instagram.creation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.GridView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.gallery.Draft;
import com.instagram.creation.base.CreationSession;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass81L;
import p000X.C06590Pq;
import p000X.C182397qd;
import p000X.C182587qw;
import p000X.C182617r0;
import p000X.C182797rM;
import p000X.C27341Hl;

public class ManageDraftsFragment extends C27341Hl {
    public CreationSession A00;
    public C182587qw A01;
    public AnonymousClass0C1 A02;
    public boolean A03;
    public TextView mActionBarActionButton;
    public TextView mActionBarTitleTextView;

    public final String getModuleName() {
        return "manage_drafts";
    }

    public static void A01(ManageDraftsFragment manageDraftsFragment) {
        boolean z = manageDraftsFragment.A03;
        int i = C0003R.string.draft_section_title;
        if (z) {
            i = C0003R.string.dialog_option_discard;
        }
        int i2 = C0003R.string.edit;
        if (z) {
            i2 = C0003R.string.done;
        }
        manageDraftsFragment.mActionBarTitleTextView.setText(i);
        manageDraftsFragment.mActionBarActionButton.setText(i2);
    }

    public static List A00(AnonymousClass0C1 r13) {
        int i;
        List<PendingMedia> A07 = PendingMediaStore.A01(r13).A07(Constants.A03);
        ArrayList arrayList = new ArrayList();
        for (PendingMedia pendingMedia : A07) {
            switch (pendingMedia.A0g.ordinal()) {
                case 0:
                    arrayList.add(new Draft(pendingMedia.A1h, pendingMedia.A1g, false, false, 0, pendingMedia.A0o()));
                    break;
                case 1:
                    arrayList.add(new Draft(pendingMedia.A1h, pendingMedia.A1g, true, false, pendingMedia.A0l.AKe(), false));
                    break;
                case 4:
                    PendingMedia A04 = PendingMediaStore.A01(r13).A04((String) PendingMediaStore.A01(r13).A04(pendingMedia.A1h).A0K().get(0));
                    String str = pendingMedia.A1h;
                    String str2 = A04.A1g;
                    boolean A0x = A04.A0x();
                    if (A0x) {
                        i = A04.A0l.AKe();
                    } else {
                        i = 0;
                    }
                    arrayList.add(new Draft(str, str2, A0x, true, i, false));
                    break;
            }
        }
        return arrayList;
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2027553342);
        super.onCreate(bundle);
        int round = Math.round((float) (getResources().getDisplayMetrics().widthPixels / 3));
        this.A02 = AnonymousClass0J1.A06(this.mArguments);
        C182587qw r2 = new C182587qw(getContext(), new C182397qd(round), this);
        this.A01 = r2;
        List A002 = A00(this.A02);
        r2.A01.clear();
        r2.A02.clear();
        r2.A01.addAll(A002);
        C182587qw.A01(r2);
        this.A00 = ((C182797rM) getContext()).AJ7();
        AnonymousClass0Z0.A09(639969163, A022);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AnonymousClass81L.A02(this, z, i2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(703151268);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_drafts_grid, viewGroup, false);
        AnonymousClass0Z0.A09(-561857714, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-581468953);
        super.onDestroyView();
        ManageDraftsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-430434364, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GridView gridView = (GridView) view.findViewById(C0003R.C0005id.drafts_grid);
        gridView.setAdapter(this.A01);
        gridView.setNumColumns(3);
        this.mActionBarActionButton = (TextView) getActivity().findViewById(C0003R.C0005id.next_button_textview);
        this.mActionBarTitleTextView = (TextView) getActivity().findViewById(C0003R.C0005id.action_bar_textview_title);
        this.mActionBarActionButton.setOnClickListener(new C182617r0(this));
        A01(this);
    }
}
