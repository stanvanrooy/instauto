package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.view.IdCaptureActivity;

/* renamed from: X.C4S */
public final class C4S implements View.OnClickListener {
    public final /* synthetic */ C114904wg A00;

    public C4S(C114904wg r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C27238C4f c4f;
        DocumentType documentType;
        int A05 = AnonymousClass0Z0.A05(12666227);
        C114904wg r0 = this.A00;
        C27234C4a c4a = new C27234C4a(r0.getContext(), r0.A00.getToken());
        Context context = c4a.A00;
        if (context == null || c4a.A03 == null || c4a.A04 == null || c4a.A05 == null) {
            throw new IllegalArgumentException("All required fields must not be null");
        } else if (c4a.A01 == C27237C4e.FRONT_AND_BACK) {
            throw new IllegalArgumentException("BackFilePath must be set for FRONT_AND_BACK captureMode");
        } else {
            if (C12300gW.A00(context) >= 2013) {
                c4f = C27238C4f.MID_END;
            } else {
                c4f = C27238C4f.LOW_END;
            }
            if (c4f == C27238C4f.LOW_END) {
                documentType = DocumentType.ID2;
            } else {
                documentType = DocumentType.ID1;
            }
            Bundle bundle = new Bundle();
            C4Y c4y = new C4Y();
            c4y.A02 = c4f;
            C26626Boi.A02(c4f, "featureLevel");
            c4y.A08.add("featureLevel");
            C27237C4e c4e = c4a.A01;
            c4y.A01 = c4e;
            C26626Boi.A02(c4e, "captureMode");
            c4y.A08.add("captureMode");
            c4y.A04 = c4a.A03;
            c4y.A03 = c4a.A02;
            String str = c4a.A05;
            c4y.A06 = str;
            C26626Boi.A02(str, "product");
            c4y.A07 = c4a.A06;
            c4y.A00 = bundle;
            c4y.A05 = c4a.A04;
            AnonymousClass1BH.A08(IdCaptureActivity.A00(c4a.A00, new IdCaptureConfig(c4y), documentType, C4L.INITIAL), this.A00);
            AnonymousClass0Z0.A0C(-1990457799, A05);
        }
    }
}
