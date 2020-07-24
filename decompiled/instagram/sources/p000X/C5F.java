package p000X;

import android.view.View;
import com.facebook.smartcapture.p011ui.PhotoRequirementsView;

/* renamed from: X.C5F */
public final class C5F implements View.OnClickListener {
    public final /* synthetic */ PhotoRequirementsView A00;

    public C5F(PhotoRequirementsView photoRequirementsView) {
        this.A00 = photoRequirementsView;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1972108070);
        PhotoRequirementsView photoRequirementsView = this.A00;
        B7F b7f = photoRequirementsView.A02;
        if (b7f != null) {
            b7f.A00();
            photoRequirementsView.A02 = null;
        }
        photoRequirementsView.A03 = false;
        AnonymousClass0Z0.A0C(1326584951, A05);
    }
}
