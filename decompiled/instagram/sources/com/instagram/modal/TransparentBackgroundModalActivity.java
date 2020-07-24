package com.instagram.modal;

import android.content.Intent;
import android.os.Bundle;
import p000X.C163696ya;

public class TransparentBackgroundModalActivity extends ModalActivity {
    public final boolean A0Y() {
        return false;
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A0Z(intent);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        A05().A0r(new C163696ya(this));
    }
}
