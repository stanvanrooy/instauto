package p000X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;

/* renamed from: X.0nn  reason: invalid class name and case insensitive filesystem */
public final class C15950nn extends C15970np {
    public final C16000ns A00 = new C16000ns();

    public static void A01(C52362Om r3) {
        r3.A0M.A0u(C137845uJ.ENTRY_POINT.AWt(), 1);
    }

    public static void A02(C137695u4 r1) {
        ADG adg = (ADG) r1.A03.getChildFragmentManager().A0N("ProfileWizardPlugin_LoaderDialogFragmentName");
        if (adg != null) {
            adg.A09();
        }
    }

    public final void A0F(FragmentActivity fragmentActivity, AnonymousClass0C1 r9) {
        C137635ty.A00(Constants.ZERO, r9, (String) null);
        C137695u4 r5 = new C137695u4(r9.A06);
        C136875sh r1 = new C136875sh(new C136035rK(), C137845uJ.ENTRY_POINT);
        r1.A05 = true;
        r1.A02 = new C137795uE(this, r5, r9, fragmentActivity);
        C136875sh r12 = new C136875sh(r1.A00(), C137845uJ.LOAD_USER);
        r12.A05 = true;
        r12.A02 = new C137715u6(this, r5, r9, fragmentActivity);
        r12.A03 = new C137655u0(this, r5);
        C136875sh r13 = new C136875sh(r12.A00(), C137845uJ.ADD_PROFILE_PICTURE);
        r13.A01 = new C137605tv(this, r9);
        r13.A00 = new C137755uA(fragmentActivity, r9);
        r13.A02 = new C137785uD(this, r9, r5);
        r13.A04 = new C137735u8(this, r5);
        r13.A03 = new C137775uC(r9);
        C136875sh r14 = new C136875sh(r13.A00(), C137845uJ.ADD_NAME);
        r14.A01 = new C137555tq(this, r9);
        r14.A00 = new C137755uA(fragmentActivity, r9);
        r14.A02 = new C137875uM(this, r5, r9);
        r14.A04 = new C137585tt(this, r5);
        r14.A03 = new C137775uC(r9);
        C136875sh r15 = new C136875sh(r14.A00(), C137845uJ.ADD_BIO);
        r15.A01 = new C137565tr(this, r9);
        r15.A00 = new C137755uA(fragmentActivity, r9);
        r15.A02 = new C137855uK(this, r5, r9);
        r15.A04 = new C137575ts(this, r5);
        r15.A03 = new C137775uC(r9);
        C136875sh r16 = new C136875sh(r15.A00(), C137845uJ.SHOW_LOADER);
        r16.A05 = true;
        r16.A01 = new C137745u9(this, r5);
        r16.A02 = new C137665u1(this, r5);
        C136875sh r17 = new C136875sh(r16.A00(), C137845uJ.SAVE_NAME_AND_BIO);
        r17.A05 = true;
        r17.A01 = new C137595tu(this, r5);
        r17.A02 = new C137645tz(this, r5, r9, fragmentActivity);
        C136035rK A002 = r17.A00();
        Context applicationContext = fragmentActivity.getApplicationContext();
        C136875sh r18 = new C136875sh(A002, C137845uJ.SAVE_PROFILE_PICTURE);
        r18.A05 = true;
        r18.A01 = new C137725u7(this, r5);
        r18.A02 = new C137685u3(this, r5, applicationContext, r9);
        C136875sh r19 = new C136875sh(r18.A00(), C137845uJ.BROADCAST_USER_UPDATES);
        r19.A05 = true;
        r19.A02 = new C137545tp(this, r9, r5);
        C136035rK A003 = r19.A00();
        C136895sj r2 = new C136895sj();
        r2.A03 = Collections.unmodifiableList(A003.A00);
        r5.A05 = r2;
        A09("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", r2, (Object) null, new C137615tw(this, r5));
    }

    public final void A0G(FragmentActivity fragmentActivity, AnonymousClass0C1 r4, Bundle bundle) {
        if (bundle != null && !C15870nf.A00().A0B("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93")) {
            if (bundle.getString("ProfileWizardPlugin_CurrentSavedStepName") != null) {
                A01(new C52362Om(fragmentActivity, r4));
            }
            A0F(fragmentActivity, r4);
        }
    }

    public final void A0E(Bundle bundle) {
        for (String equals : A07()) {
            if (equals.equals("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93")) {
                bundle.putString("ProfileWizardPlugin_CurrentSavedStepName", A06("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"));
                return;
            }
        }
    }
}
