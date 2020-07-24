package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;

/* renamed from: X.CDH */
public final class CDH extends C27341Hl implements AnonymousClass1HM {
    public CD8 A00;
    public CCf A01;
    public CD3 A02;
    public AnonymousClass0C1 A03;

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.Bo6(true);
        r2.BlI(C0003R.string.promote_preview_action_bar_title);
    }

    public final String getModuleName() {
        return "promote_story_eligible_preview";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(CDH cdh, String str) {
        AnonymousClass1HD A032 = C16310oO.A00.A00().A03(cdh.A02.A0Z, CCf.A01(cdh.getContext(), cdh.A01), cdh.A02.A0a, str);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", cdh.A03.getToken());
        C52362Om r2 = new C52362Om(cdh.getActivity(), cdh.A03);
        r2.A08(A032, bundle);
        r2.A02();
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onAttach(Context context) {
        CCf A002;
        super.onAttach(context);
        CD3 AT6 = ((C945346y) context).AT6();
        this.A02 = AT6;
        AnonymousClass0C1 r1 = AT6.A0Q;
        this.A03 = r1;
        this.A00 = new CD8(r1, (FragmentActivity) context, this);
        CD3 cd3 = this.A02;
        if (cd3.A0I == C26905BuU.PROMOTE_MANAGER_PREVIEW) {
            A002 = cd3.A0A;
            AnonymousClass0a4.A06(A002);
        } else {
            A002 = C27411CCe.A00(cd3);
        }
        this.A01 = A002;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2046477353);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_preview, viewGroup, false);
        AnonymousClass0Z0.A09(1943442033, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CD3 cd3 = this.A02;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.PROMOTE_PREVIEW_DISCLAIMER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        IgTextView igTextView = (IgTextView) view.findViewById(C0003R.C0005id.promote_preview_subtitle_text);
        boolean z = cd3.A10;
        if (z && cd3.A0u) {
            igTextView.setText(C0003R.string.promote_preview_subtitle_feed_story_explore);
        } else if (z) {
            igTextView.setText(C0003R.string.promote_preview_subtitle_feed_story);
        } else if (cd3.A0u) {
            igTextView.setText(C0003R.string.promote_preview_subtitle_feed_explore);
        }
        view.findViewById(C0003R.C0005id.preview_feed_button).setOnClickListener(new C27503CFt(this));
        if (cd3.A10) {
            ((ViewStub) view.findViewById(C0003R.C0005id.stories_button_stub)).inflate().setOnClickListener(new CFR(this));
        }
        if (cd3.A0u) {
            ((ViewStub) view.findViewById(C0003R.C0005id.explore_button_stub)).inflate().setOnClickListener(new C27504CFu(this));
        }
        if (cd3.A10 && booleanValue) {
            ((IgTextView) ((ViewStub) view.findViewById(C0003R.C0005id.performance_disclaimer_stub)).inflate()).setText(C0003R.string.promote_preview_performance_disclaimer);
            if (cd3.A0t) {
                ((IgTextView) ((ViewStub) view.findViewById(C0003R.C0005id.carousel_disclaimer_stub)).inflate()).setText(C0003R.string.promote_preview_carousel_disclaimer);
            }
        }
    }
}
