package com.instagram.react.modules.product;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.fbreact.specs.NativeIGInsightsReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import p000X.A44;
import p000X.AC5;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1D1;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass2VV;
import p000X.AnonymousClass2VW;
import p000X.AnonymousClass60B;
import p000X.AnonymousClass60C;
import p000X.AnonymousClass6KJ;
import p000X.AnonymousClass6VY;
import p000X.C06590Pq;
import p000X.C12890hY;
import p000X.C13460iZ;
import p000X.C14100jl;
import p000X.C145256Ix;
import p000X.C152786fz;
import p000X.C152836g5;
import p000X.C156356m1;
import p000X.C16310oO;
import p000X.C228039ra;
import p000X.C23176ABe;
import p000X.C23300zv;
import p000X.C26801Bsm;
import p000X.C27171Gt;
import p000X.C31151Wq;

@ReactModule(name = "IGInsightsReactModule")
public class IgReactInsightsModule extends NativeIGInsightsReactModuleSpec {
    public static final String MODULE_NAME = "IGInsightsReactModule";
    public final C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    public void onFilterChangedInsightsAccountGrowth(double d, double d2) {
        C23300zv.A00((AnonymousClass0C1) this.mSession).BXT(new C152836g5(d2));
    }

    public void showInsightsFilterView(String str, String str2, String str3, String str4, String str5) {
        C152786fz r2 = new C152786fz(str2, str4, str3, str5);
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0T();
            String str6 = r2.A05;
            if (str6 != null) {
                A05.A0H("id", str6);
            }
            String str7 = r2.A02;
            if (str7 != null) {
                A05.A0H("ordering", str7);
            }
            String str8 = r2.A03;
            if (str8 != null) {
                A05.A0H("post_type", str8);
            }
            String str9 = r2.A04;
            if (str9 != null) {
                A05.A0H("timeframe", str9);
            }
            String str10 = r2.A01;
            if (str10 != null) {
                A05.A0H("first", str10);
            }
            String str11 = r2.A00;
            if (str11 != null) {
                A05.A0H("after", str11);
            }
            A05.A0Q();
            A05.close();
            String stringWriter2 = stringWriter.toString();
            C16310oO.A00.A00();
            AC5 ac5 = new AC5(this);
            Bundle bundle = new Bundle();
            bundle.putString(C26801Bsm.A0G, stringWriter2);
            bundle.putString(C26801Bsm.A0F, str);
            C26801Bsm bsm = new C26801Bsm();
            bsm.A05 = ac5;
            bsm.setArguments(bundle);
            AnonymousClass1HD A00 = AnonymousClass6KJ.A00(getCurrentActivity(), Constants.ZERO);
            if (A00 != null) {
                bsm.A06(A00.mFragmentManager, (String) null);
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("exception on serialize new api query");
        }
    }

    public IgReactInsightsModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }

    public void navigateToCreatePromotion() {
        AnonymousClass2VV.A02();
        C06590Pq r3 = this.mSession;
        AnonymousClass2VW.A03(r3, "business_insights", C14100jl.A01(r3), (String) null);
        C228039ra.A01(new AnonymousClass60B(this, AnonymousClass6VY.A00(getCurrentActivity())));
    }

    public void navigateToFeedbackChannel(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            AnonymousClass0C1 A06 = AnonymousClass0J1.A06(currentActivity.getIntent().getExtras());
            BugReport bugReport = new BugReport((String) null, new ArrayList(), new ArrayList(), "636812293063672", "306244556460128", A06.A04(), (String) null, "user_options", new HashMap(), (String) null);
            String string = currentActivity.getString(C0003R.string.feedback_channel_detail_dissatisfaction);
            currentActivity.getString(C0003R.string.bugreporter_rageshake_hint);
            currentActivity.getString(C0003R.string.bugreporter_disclaimer, new Object[]{AnonymousClass1BA.A06(currentActivity)});
            currentActivity.getString(C0003R.string.rageshake_title);
            new C156356m1(A06, currentActivity, bugReport, (Bitmap) null, (String) null, new BugReportComposerViewModel("", string, currentActivity.getString(C0003R.string.feedback_channel_feedback_title), false, false)).A04(new Void[0]);
            return;
        }
        AnonymousClass0QD.A0A("IgReactInsightsModule", new IllegalArgumentException("Activity can not be null to navigateToFeedbackChannel"));
    }

    public void navigateToSeeMorePromotions() {
        FragmentActivity A00 = AnonymousClass6VY.A00(getCurrentActivity());
        if (A00 != null) {
            C228039ra.A01(new C145256Ix(this, A00, AnonymousClass0J1.A06(A00.getIntent().getExtras())));
        } else {
            AnonymousClass0QD.A0A("IgReactInsightsModule", new IllegalArgumentException("Activity can not be null in navigateToSeeMorePromotions"));
        }
    }

    public void navigateToSingleFeedView(String str) {
        AnonymousClass1HD A00 = AnonymousClass6KJ.A00(getCurrentActivity(), Constants.ZERO);
        FragmentActivity A002 = AnonymousClass6VY.A00(getCurrentActivity());
        if (A00 != null) {
            C228039ra.A01(new AnonymousClass60C(this, A002, str));
        }
    }

    public void navigateToStoriesCamera() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            while (currentActivity.getParent() != null) {
                currentActivity = currentActivity.getParent();
            }
            AnonymousClass1D1 r2 = (AnonymousClass1D1) currentActivity;
            C27171Gt r1 = new C27171Gt();
            r1.A00 = r2.AIZ().A05();
            r1.A0B = true;
            r1.A09 = "camera_action_organic_insights";
            r2.Bsx(r1);
        }
    }

    public void navigateToTopPostsCamera() {
        C31151Wq r1;
        Activity currentActivity = getCurrentActivity();
        Integer num = Constants.ZERO;
        AnonymousClass1HD A00 = AnonymousClass6KJ.A00(currentActivity, num);
        if (A00 != null && (A00 instanceof C23176ABe) && (r1 = ((C23176ABe) A00).A00) != null) {
            r1.BpO(num, Constants.A0N);
        }
    }
}
