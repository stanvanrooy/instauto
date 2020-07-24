package com.instagram.archive.fragment;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.calendar.CalendarRecyclerView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1UY;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass2MW;
import p000X.AnonymousClass309;
import p000X.AnonymousClass39L;
import p000X.AnonymousClass6W2;
import p000X.AnonymousClass6W4;
import p000X.AnonymousClass6W5;
import p000X.AnonymousClass6W9;
import p000X.AnonymousClass6WA;
import p000X.AnonymousClass6WB;
import p000X.AnonymousClass6WC;
import p000X.AnonymousClass6WF;
import p000X.AnonymousClass6WG;
import p000X.AnonymousClass6WH;
import p000X.C06590Pq;
import p000X.C124475Uy;
import p000X.C124485Uz;
import p000X.C148306Vz;
import p000X.C17020pY;
import p000X.C17850qu;
import p000X.C26301Cs;
import p000X.C27341Hl;
import p000X.C34071dx;
import p000X.C59012gt;

public class ArchiveReelCalendarFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass1W5 {
    public RectF A00;
    public AnonymousClass6W2 A01;
    public AnonymousClass1UY A02;
    public AnonymousClass0C1 A03;
    public String A04;
    public boolean A05;
    public AnonymousClass6W5 A06;
    public final Map A07 = new LinkedHashMap();
    public CalendarRecyclerView mCalendar;
    public View mLoadingSpinner;

    public final void B4l(Reel reel, C59012gt r2) {
    }

    public final void BHt(Reel reel) {
    }

    public final String getModuleName() {
        return "archive_calendar";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public static void A00(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        int i;
        ImageUrl imageUrl;
        ArchiveReelCalendarFragment archiveReelCalendarFragment2 = archiveReelCalendarFragment;
        if (archiveReelCalendarFragment2.A05) {
            ArrayList<AnonymousClass6WA> arrayList = new ArrayList<>();
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            Calendar instance2 = Calendar.getInstance();
            for (AnonymousClass2MW r0 : archiveReelCalendarFragment2.A07.values()) {
                C124475Uy r2 = (C124475Uy) r0.A00;
                Reel reel = (Reel) r0.A01;
                if (!reel.A0k(archiveReelCalendarFragment2.A03)) {
                    instance.setTime(new Date(r2.A01 * 1000));
                    int i2 = instance.get(1);
                    int i3 = instance.get(2);
                    int i4 = instance.get(5);
                    instance2.clear();
                    instance2.set(i2, i3, i4, 0, 0);
                    C124485Uz r02 = r2.A02;
                    if (r02 != null) {
                        imageUrl = r02.A00;
                    } else {
                        imageUrl = null;
                    }
                    arrayList.add(new AnonymousClass6WA(reel, instance2.getTime(), imageUrl));
                }
            }
            AnonymousClass6W2 r5 = archiveReelCalendarFragment2.A01;
            ArrayList<AnonymousClass6WB> arrayList2 = new ArrayList<>();
            r5.A08.clear();
            r5.A09.clear();
            for (AnonymousClass6WA r03 : arrayList) {
                Date date = r03.A02;
                Reel reel2 = r03.A01;
                arrayList2.add(new AnonymousClass6WB(reel2, date, r03.A00));
                r5.A08.add(reel2);
                r5.A09.put(reel2.getId(), date);
            }
            Collections.sort(arrayList2, new AnonymousClass6WC(r5));
            Date date2 = new Date();
            Date date3 = date2;
            if (arrayList2.size() > 0) {
                date3 = ((AnonymousClass6WB) arrayList2.get(0)).A02;
            }
            r5.A02.clear();
            r5.A03.clear();
            r5.A04.clear();
            r5.A01.clear();
            r5.A01.setTime(date3);
            r5.A01.clear();
            r5.A01.setTime(date2);
            int i5 = (r5.A01.get(1) * 12) + r5.A01.get(2);
            for (int i6 = (r5.A01.get(1) * 12) + r5.A01.get(2); i6 <= i5; i6++) {
                r5.A01.clear();
                r5.A01.set(1, i6 / 12);
                r5.A01.set(2, i6 % 12);
                Date time = r5.A01.getTime();
                r5.A01.clear();
                r5.A01.setTime(time);
                int firstDayOfWeek = r5.A01.getFirstDayOfWeek();
                int i7 = AnonymousClass6W4.A05;
                int i8 = (i7 - 1) + firstDayOfWeek;
                if (i8 > i7) {
                    i8 %= i7;
                }
                int i9 = r5.A01.get(1);
                int i10 = r5.A01.get(2);
                r5.A02.add(new AnonymousClass6WG(r5.A00.format(time)));
                r5.A03.put(AnonymousClass6W4.A00(i9, i10, -1), Integer.valueOf(r5.A02.size() - 1));
                int i11 = firstDayOfWeek;
                while (true) {
                    int i12 = AnonymousClass6W4.A05;
                    if (i11 >= i12 + firstDayOfWeek) {
                        break;
                    }
                    if (i11 > i12) {
                        i = i11 % i12;
                    } else {
                        i = i11;
                    }
                    r5.A02.add(new AnonymousClass6WF(i));
                    i11++;
                }
                int i13 = r5.A01.get(7);
                while (firstDayOfWeek < i13) {
                    r5.A02.add(new AnonymousClass6WH());
                    firstDayOfWeek++;
                }
                do {
                    int i14 = r5.A01.get(5);
                    r5.A02.add(new AnonymousClass6W9(r5.A01.getTime()));
                    r5.A03.put(AnonymousClass6W4.A00(i9, i10, i14), Integer.valueOf(r5.A02.size() - 1));
                    r5.A01.add(5, 1);
                } while (r5.A01.get(2) == i10);
                r5.A01.add(5, -1);
                int i15 = r5.A01.get(7);
                if (i15 != i8) {
                    int i16 = i15 + 1;
                    while (true) {
                        int i17 = AnonymousClass6W4.A05;
                        if (i16 > i17) {
                            i16 %= i17;
                        }
                        r5.A02.add(new AnonymousClass6WH());
                        if (i16 == i8) {
                            break;
                        }
                        i16++;
                    }
                }
            }
            for (AnonymousClass6WB r3 : arrayList2) {
                String A052 = r5.A05(r3.A02);
                List list = (List) r5.A04.get(A052);
                if (list == null) {
                    list = new ArrayList();
                    r5.A04.put(A052, list);
                }
                list.add(r3);
            }
            r5.notifyDataSetChanged();
        }
    }

    public final void BHS(Reel reel) {
        A00(this);
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BlI(C0003R.string.calendar);
        boolean z = false;
        if (this.mFragmentManager.A0I() > 0) {
            z = true;
        }
        r3.Bo6(z);
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-727900766);
        super.onCreate(bundle);
        this.A03 = AnonymousClass0J1.A06(this.mArguments);
        this.A04 = UUID.randomUUID().toString();
        this.A01 = new AnonymousClass6W2(getContext(), this);
        C17850qu A032 = AnonymousClass39L.A03(this.A03, Constants.A0N, true, false, false, false);
        A032.A00 = new C148306Vz(this);
        schedule(A032);
        AnonymousClass0Z0.A09(122313904, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-355874952);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_calendar, viewGroup, false);
        AnonymousClass0Z0.A09(-1156819653, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-2051839251);
        super.onDestroyView();
        ArchiveReelCalendarFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(2046447060, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1433135794);
        super.onPause();
        this.mCalendar.A0x(this.A06);
        AnonymousClass0Z0.A09(1268121340, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(443248475);
        super.onResume();
        if (!this.A01.A08.isEmpty()) {
            this.mLoadingSpinner.setVisibility(8);
        }
        C34071dx A0T = C17020pY.A00().A0T(getActivity());
        if (A0T != null && A0T.A0a()) {
            RectF rectF = this.A00;
            A0T.A0U(rectF, rectF, (AnonymousClass309) null);
        }
        this.mCalendar.A0w(this.A06);
        A00(this);
        AnonymousClass0Z0.A09(168153590, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(-1764492549);
        super.onStart();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(8);
        }
        AnonymousClass0Z0.A09(-1731453221, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(2084790397);
        super.onStop();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(0);
        }
        AnonymousClass0Z0.A09(1709620632, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mCalendar = (CalendarRecyclerView) view.findViewById(C0003R.C0005id.calendar);
        this.mLoadingSpinner = view.findViewById(C0003R.C0005id.loading_spinner);
        this.mCalendar.setAdapter(this.A01);
        this.A06 = new AnonymousClass6W5(this.A01, this.A03, this);
    }
}
