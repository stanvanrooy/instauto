package p000X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.0nu  reason: invalid class name and case insensitive filesystem */
public final class C16020nu extends C16030nv implements AnonymousClass0RN {
    public final String getModuleName() {
        return "registration_plugin";
    }

    public final void A0F(FragmentActivity fragmentActivity, C06590Pq r6) {
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        C136895sj A00 = C135525qU.A00(fragmentActivity, r6);
        regFlowExtras.A09 = "RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f";
        A09("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f", A00, regFlowExtras, new C134565om(fragmentActivity, r6));
    }

    public final void A0G(FragmentActivity fragmentActivity, C06590Pq r8, Bundle bundle) {
        RegFlowExtras regFlowExtras;
        if (bundle != null && (regFlowExtras = (RegFlowExtras) bundle.getParcelable("RegistrationPlugin_REGISTRATION_FLOW_EXTRAS")) != null && !C15870nf.A00().A0B("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f")) {
            String string = bundle.getString("RegistrationPlugin_CURRENT_SAVED_STEP_NAME");
            String[] stringArray = bundle.getStringArray("RegistrationPlugin_CURRENT_VISITED_STEP_NAMES");
            C136895sj A00 = C135525qU.A00(fragmentActivity, r8);
            A00.A01(string, stringArray, 1, regFlowExtras);
            A09("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f", A00, regFlowExtras, new C134565om(fragmentActivity, r8));
        }
    }

    public final void A0E(Bundle bundle) {
        for (String equals : A07()) {
            if (equals.equals("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f")) {
                String A06 = A06("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f");
                String[] A0D = A0D("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f");
                bundle.putString("RegistrationPlugin_CURRENT_SAVED_STEP_NAME", A06);
                bundle.putStringArray("RegistrationPlugin_CURRENT_VISITED_STEP_NAMES", A0D);
                RegFlowExtras regFlowExtras = (RegFlowExtras) A05("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f");
                AnonymousClass0a4.A07(regFlowExtras, "Could not find registration flow extras.");
                regFlowExtras.A09 = "RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f";
                bundle.putParcelable("RegistrationPlugin_REGISTRATION_FLOW_EXTRAS", regFlowExtras);
                return;
            }
        }
    }
}
