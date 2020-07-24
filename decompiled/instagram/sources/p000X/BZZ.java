package p000X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;

/* renamed from: X.BZZ */
public final class BZZ extends C25792Ba0 {
    public final /* synthetic */ C25768BZc A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BZZ(C25768BZc bZc, AnonymousClass1AM r2) {
        super(r2);
        this.A00 = bZc;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(2095922333);
        C112564sq.A00(this.A00.getContext());
        AnonymousClass0Z0.A0A(111698405, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(569787873);
        int A032 = AnonymousClass0Z0.A03(-148607852);
        C25768BZc bZc = this.A00;
        if (bZc.A0D) {
            bZc.A07.A02("qp_id_289412055317492");
        } else if (bZc.A05.isChecked()) {
            this.A00.A07.A02("qp_id_254858015509080");
        } else {
            this.A00.A07.A01(Constants.ZERO, "qp_id_254858015509080");
        }
        FragmentActivity activity = this.A00.getActivity();
        if (activity instanceof ModalActivity) {
            activity.finish();
        }
        AnonymousClass0Z0.A0A(1300712213, A032);
        AnonymousClass0Z0.A0A(153937796, A03);
    }
}
