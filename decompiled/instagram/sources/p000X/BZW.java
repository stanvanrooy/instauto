package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.modal.ModalActivity;

/* renamed from: X.BZW */
public final class BZW implements View.OnClickListener {
    public final /* synthetic */ C25768BZc A00;

    public BZW(C25768BZc bZc) {
        this.A00 = bZc;
    }

    public final void onClick(View view) {
        Integer num;
        int A05 = AnonymousClass0Z0.A05(1299814150);
        C25768BZc bZc = this.A00;
        if (bZc.getActivity() instanceof ModalActivity) {
            if (bZc.A0C) {
                if (bZc.A0D || bZc.A05.isChecked()) {
                    num = Constants.ZERO;
                } else {
                    num = Constants.ONE;
                }
                C17850qu A002 = C140635zn.A00(bZc.A06, num, Constants.ZERO);
                A002.A00 = new BZZ(bZc, bZc.mFragmentManager);
                bZc.schedule(A002);
            } else {
                boolean z = false;
                if (!bZc.A0B) {
                    z = true;
                }
                if (!z) {
                    C25768BZc.A02(bZc, true, false);
                    C25771BZf bZf = bZc.A07;
                    BZY bzy = new BZY(bZf.A00.A02("ig_location_verification_location_services_already_enabled"));
                    bzy.A08("product", bZf.getModuleName());
                    bzy.A08("qp_type", "qp_id_2416090471986251");
                    bzy.A01();
                } else if (bZc.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                    C35251g3.A02(bZc.getActivity(), new BRZ(bZc), "android.permission.ACCESS_FINE_LOCATION");
                } else {
                    AnonymousClass2OA r3 = new AnonymousClass2OA(bZc.getActivity());
                    r3.A03 = bZc.getString(C0003R.string.landing_surface_low_confidence_open_setting_dialog_title);
                    r3.A0M(bZc.getString(C0003R.string.system_settings_permission_dialog_text, bZc.getString(C0003R.string.location_permission_name)));
                    r3.A0U(true);
                    r3.A0A(C0003R.string.system_settings_permission_dialog_button_label, new C25594BRa(bZc));
                    r3.A08(C0003R.string.cancel, new BZX(bZc));
                    r3.A03().show();
                }
            }
        }
        AnonymousClass0Z0.A0C(-1709511038, A05);
    }
}
