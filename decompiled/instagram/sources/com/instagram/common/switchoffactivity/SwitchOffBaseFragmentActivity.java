package com.instagram.common.switchoffactivity;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import p000X.AnonymousClass0XY;
import p000X.AnonymousClass0Z0;

public class SwitchOffBaseFragmentActivity extends FragmentActivity {
    public void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0Z0.A00(1345302537);
        if (!AnonymousClass0XY.A01().A00(this, this, getIntent())) {
            finish();
        }
        super.onCreate(bundle);
        AnonymousClass0Z0.A07(1386702006, A00);
    }
}
