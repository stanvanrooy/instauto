package com.instagram.urlhandler;

import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.model.creation.MediaCaptureConfig;
import p000X.Constants;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C15790nX;
import p000X.C16330oQ;
import p000X.C31151Wq;
import p000X.C31161Wr;
import p000X.C944046h;

public class CreatePostExternalUrlHandlerActivity extends IgFragmentActivity {
    public C06590Pq A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-436465552);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        C06590Pq A003 = AnonymousClass0J1.A00(bundleExtra);
        this.A00 = A003;
        if (!A003.AgN()) {
            C15790nX.A00.A00(this, A003, bundleExtra);
        } else {
            C31151Wq A04 = C16330oQ.A00.A04(this, new C944046h(this), C05210Iq.A02(A003));
            Integer num = Constants.ZERO;
            A04.BqD(num, new MediaCaptureConfig(new C31161Wr(num)), Constants.ONE);
            finish();
        }
        AnonymousClass0Z0.A07(-554315421, A002);
    }
}
