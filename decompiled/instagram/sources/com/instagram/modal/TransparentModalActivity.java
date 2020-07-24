package com.instagram.modal;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Collections;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2CD;

public class TransparentModalActivity extends ModalActivity {
    public final boolean A0Y() {
        return false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putStringArrayList("arg_cleanup_bottom_sheet_fragments", new ArrayList(Collections.singletonList("BottomSheetConstants.FRAGMENT_TAG")));
        super.onSaveInstanceState(bundle);
    }

    public final void A0T() {
        if (A0Y()) {
            super.A0T();
        } else {
            setTheme(C0003R.style.IgTranslucentWindow);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0Z0.A00(-606044621);
        if (bundle != null) {
            AnonymousClass2CD.A00(bundle, bundle.getStringArrayList("arg_cleanup_bottom_sheet_fragments"));
        }
        super.onCreate(bundle);
        AnonymousClass0Z0.A07(439224304, A00);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A0Z(intent);
    }
}
