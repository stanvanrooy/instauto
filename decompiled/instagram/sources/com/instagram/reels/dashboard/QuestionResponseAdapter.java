package com.instagram.reels.dashboard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0OW;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1AD;
import p000X.AnonymousClass1PH;
import p000X.AnonymousClass1ZK;
import p000X.AnonymousClass23O;
import p000X.AnonymousClass5M1;
import p000X.AnonymousClass5X7;
import p000X.AnonymousClass6V0;
import p000X.AnonymousClass6V1;
import p000X.C019000b;
import p000X.C11200ea;
import p000X.C121935Kn;
import p000X.C147956Ua;
import p000X.C148036Ui;
import p000X.C148056Ul;
import p000X.C148076Un;
import p000X.C148146Uw;
import p000X.C148176Uz;
import p000X.C1662977d;
import p000X.C23300zv;
import p000X.C39941no;

public class QuestionResponseAdapter extends AnonymousClass1PH implements C11200ea, AnonymousClass1AD {
    public AnonymousClass23O A00;
    public boolean A01;
    public RecyclerView A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final C148076Un A05;
    public final C39941no A06;
    public final ReelDashboardFragment A07;
    public final AnonymousClass0C1 A08;

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new AnonymousClass6V1(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.question_response_item, viewGroup, false), C0003R.C0004drawable.question_response_card_outline);
        }
        if (i == 1) {
            return new AnonymousClass6V0(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.question_response_item, viewGroup, false));
        }
        if (i == 2) {
            return new C148056Ul(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.question_response_see_all_card, viewGroup, false));
        }
        throw new IllegalArgumentException(AnonymousClass000.A05("unexpected viewType: ", i));
    }

    public static void A00(QuestionResponseAdapter questionResponseAdapter) {
        questionResponseAdapter.A03.clear();
        for (C147956Ua A002 : questionResponseAdapter.A04) {
            questionResponseAdapter.A03.add(C148036Ui.A00(A002));
        }
        if (questionResponseAdapter.A01) {
            questionResponseAdapter.A03.add(new C148036Ui(Constants.A0N, (C147956Ua) null));
        }
        questionResponseAdapter.notifyDataSetChanged();
    }

    public final void onBindViewHolder(AnonymousClass1ZK r10, int i) {
        int A002;
        ViewParent parent = this.A02.getParent();
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            AnonymousClass6V1 r102 = (AnonymousClass6V1) r10;
            C148146Uw.A00(r102, ((C148036Ui) this.A03.get(i)).A00, new AnonymousClass5X7(r102.A03, parent), this.A07);
        } else if (itemViewType == 1) {
            AnonymousClass6V0 r103 = (AnonymousClass6V0) r10;
            C148176Uz.A00(r103, ((C148036Ui) this.A03.get(i)).A00, new AnonymousClass5X7(r103.A04, parent), this.A07);
        } else if (itemViewType == 2) {
            C148056Ul r104 = (C148056Ul) r10;
            AnonymousClass23O r7 = this.A00;
            C39941no r0 = this.A06;
            String str = r0.A0F;
            String id = r0.getId();
            AnonymousClass5X7 r6 = new AnonymousClass5X7(r104, parent);
            ReelDashboardFragment reelDashboardFragment = this.A07;
            View view = r104.A01;
            Context context = view.getContext();
            if (r7.A03.ordinal() != 1) {
                ((GradientDrawable) view.getBackground().mutate()).setColor(AnonymousClass0OW.A03(Color.parseColor(r7.A04)));
                A002 = Color.parseColor(r7.A08);
            } else {
                view.setBackground(C019000b.A03(context, C0003R.C0004drawable.question_response_card_outline));
                A002 = C019000b.A00(context, C0003R.color.question_response_primary_text_color);
            }
            r104.A02.setTextColor(A002);
            r104.A04.setColorFilter(A002);
            r104.A01.setOnTouchListener(r6);
            r104.A03.A02();
            r104.A00 = new C121935Kn(reelDashboardFragment, str, id);
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A05("unexpected viewType: ", itemViewType));
        }
    }

    @OnLifecycleEvent(C1662977d.ON_DESTROY)
    public void removeEventListener() {
        C23300zv.A00(this.A08).A03(AnonymousClass5M1.class, this);
        this.A05.A07(this);
    }

    public QuestionResponseAdapter(C148076Un r5, AnonymousClass0C1 r6, C39941no r7, ReelDashboardFragment reelDashboardFragment) {
        this.A05 = r5;
        this.A08 = r6;
        this.A06 = r7;
        this.A07 = reelDashboardFragment;
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.MEMLEAK_FIX_QUESTION_RESPONSE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r5.A06(this);
        }
        C23300zv.A00(r6).A02(AnonymousClass5M1.class, this);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0Z0.A03(257083748);
        int size = this.A03.size();
        AnonymousClass0Z0.A0A(1941370740, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0Z0.A03(478968819);
        int i3 = 1;
        switch (((C148036Ui) this.A03.get(i)).A01.intValue()) {
            case 0:
            case 2:
                i3 = 0;
                i2 = -1905069886;
                break;
            case 1:
                i2 = 573791750;
                break;
            case 3:
                i3 = 2;
                i2 = 861853409;
                break;
            default:
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected QuestionResponseCardViewModel type");
                AnonymousClass0Z0.A0A(616083693, A032);
                throw illegalArgumentException;
        }
        AnonymousClass0Z0.A0A(i2, A032);
        return i3;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.A02 = recyclerView;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0Z0.A03(-321041947);
        int A033 = AnonymousClass0Z0.A03(-1986217841);
        int indexOf = this.A04.indexOf(((AnonymousClass5M1) obj).A00);
        if (indexOf >= 0) {
            this.A04.remove(indexOf);
            A00(this);
        }
        AnonymousClass0Z0.A0A(2023025949, A033);
        AnonymousClass0Z0.A0A(-2040284994, A032);
    }
}
