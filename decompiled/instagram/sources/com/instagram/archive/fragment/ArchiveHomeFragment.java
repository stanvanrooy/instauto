package com.instagram.archive.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.base.TriangleSpinner;
import java.util.ArrayList;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass5DH;
import p000X.AnonymousClass5DI;
import p000X.AnonymousClass5DL;
import p000X.AnonymousClass5DM;
import p000X.AnonymousClass5DN;
import p000X.AnonymousClass5DP;
import p000X.AnonymousClass5O6;
import p000X.C05770Lw;
import p000X.C06590Pq;
import p000X.C148876Yh;
import p000X.C16180oA;
import p000X.C16270oK;
import p000X.C23300zv;
import p000X.C27021Ge;
import p000X.C27341Hl;
import p000X.C35241g2;

public class ArchiveHomeFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public AnonymousClass5DM A00;
    public AnonymousClass0C1 A01;
    public CharSequence[] A02;
    public AnonymousClass1HD A03;
    public AnonymousClass1HD A04;
    public boolean A05;
    public boolean A06;
    public final C27021Ge A07 = new AnonymousClass5DN(this);
    public View mCalendarActionBarButton;

    public final void configureActionBar(AnonymousClass1EX r4) {
        this.mCalendarActionBarButton = null;
        TriangleSpinner triangleSpinner = (TriangleSpinner) r4.Bgz(C0003R.layout.archive_home_action_bar_title, 0, 0).findViewById(C0003R.C0005id.drop_down);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AnonymousClass5DM.STORY);
        arrayList.add(AnonymousClass5DM.POSTS);
        triangleSpinner.setAdapter(new AnonymousClass5DL(this, arrayList));
        triangleSpinner.setOnItemSelectedListener(new AnonymousClass5DI(this, arrayList));
        triangleSpinner.setSelection(arrayList.indexOf(this.A00));
        r4.Bo6(true);
        r4.A4N(Constants.ZERO, new AnonymousClass5DH(this));
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(ArchiveHomeFragment archiveHomeFragment) {
        AnonymousClass1HD r2;
        AnonymousClass5DM r1 = archiveHomeFragment.A00;
        if (r1 == AnonymousClass5DM.STORY) {
            if (archiveHomeFragment.A04 == null) {
                Bundle bundle = archiveHomeFragment.mArguments;
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", archiveHomeFragment.A01.getToken());
                bundle.putSerializable("highlight_management_source", AnonymousClass5DP.ARCHIVE);
                if (archiveHomeFragment.A05) {
                    C16270oK.A00.A01();
                    ArchiveReelTabbedFragment archiveReelTabbedFragment = new ArchiveReelTabbedFragment();
                    archiveReelTabbedFragment.setArguments(bundle);
                    archiveHomeFragment.A04 = archiveReelTabbedFragment;
                } else {
                    C16270oK.A00.A01();
                    ArchiveReelFragment archiveReelFragment = new ArchiveReelFragment();
                    archiveReelFragment.setArguments(bundle);
                    archiveHomeFragment.A04 = archiveReelFragment;
                }
            }
            r2 = archiveHomeFragment.A04;
        } else if (r1 == AnonymousClass5DM.POSTS) {
            if (archiveHomeFragment.A03 == null) {
                C16270oK.A00.A01();
                String token = archiveHomeFragment.A01.getToken();
                C148876Yh r22 = new C148876Yh();
                Bundle bundle2 = new Bundle();
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
                r22.setArguments(bundle2);
                archiveHomeFragment.A03 = r22;
            }
            r2 = archiveHomeFragment.A03;
        } else {
            r2 = null;
        }
        AnonymousClass1H6 A0Q = archiveHomeFragment.getChildFragmentManager().A0Q();
        A0Q.A02(C0003R.C0005id.archive_home_fragment_container, r2);
        A0Q.A09();
        if (archiveHomeFragment.A06) {
            AnonymousClass1EW A032 = AnonymousClass1EW.A03(archiveHomeFragment.getActivity());
            boolean z = false;
            if (archiveHomeFragment.A00 == AnonymousClass5DM.POSTS) {
                z = true;
            }
            A032.Bo0(z);
        }
    }

    public final String getModuleName() {
        return this.A00.A02;
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        AnonymousClass1HD A0L = getChildFragmentManager().A0L(C0003R.C0005id.archive_home_fragment_container);
        if (A0L instanceof AnonymousClass1HK) {
            return ((AnonymousClass1HK) A0L).onBackPressed();
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2050385586);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A01 = A062;
        AnonymousClass5O6.A03(A062);
        AnonymousClass5DM r0 = (AnonymousClass5DM) AnonymousClass5DM.A03.get(C16180oA.A00(this.A01).A00.getString("sticky_archive_home_mode", (String) null));
        if (r0 == null) {
            r0 = AnonymousClass5DM.STORY;
        }
        this.A00 = r0;
        boolean z = C05770Lw.A00().A00.getBoolean("archive_calendar_enabled", false);
        this.A05 = z;
        this.A06 = z;
        AnonymousClass0Z0.A09(644233110, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1307781194);
        C23300zv.A00(this.A01).A02(C35241g2.class, this.A07);
        View inflate = layoutInflater.inflate(C0003R.layout.archive_home_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(44997564, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(451334250);
        super.onDestroyView();
        this.mCalendarActionBarButton = null;
        C23300zv.A00(this.A01).A03(C35241g2.class, this.A07);
        AnonymousClass0Z0.A09(-293445653, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A00(this);
    }
}
