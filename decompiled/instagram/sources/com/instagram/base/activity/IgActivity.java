package com.instagram.base.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import p000X.AnonymousClass0Q8;
import p000X.AnonymousClass0QA;
import p000X.AnonymousClass0QB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.C11540f8;
import p000X.C14800ll;
import p000X.C252117x;
import p000X.C44001vR;

public abstract class IgActivity extends Activity {
    public C14800ll A00;

    public final Resources getResources() {
        return this.A00;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C14800ll A01 = C11540f8.A00().A01();
        AnonymousClass0a4.A07(A01, "Resources have not been initialized!");
        this.A00 = A01;
    }

    public void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1215114548);
        AnonymousClass0Q8 r2 = AnonymousClass0QA.A00;
        for (AnonymousClass0QB Aqy : r2.A00) {
            Aqy.Aqy(this);
        }
        super.onCreate(bundle);
        for (AnonymousClass0QB Aqz : r2.A00) {
            Aqz.Aqz(this);
        }
        AnonymousClass0Z0.A07(1531119685, A002);
    }

    public void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(-1544405360);
        super.onDestroy();
        for (AnonymousClass0QB Ar1 : AnonymousClass0QA.A00.A00) {
            Ar1.Ar1(this);
        }
        if (Build.VERSION.SDK_INT < 29) {
            C44001vR.A00(this);
        }
        AnonymousClass0Z0.A07(1886719446, A002);
    }

    public final void onPause() {
        int A002 = AnonymousClass0Z0.A00(-1267059465);
        super.onPause();
        for (AnonymousClass0QB Ar2 : AnonymousClass0QA.A00.A00) {
            Ar2.Ar2(this);
        }
        AnonymousClass0Z0.A07(625802624, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0Z0.A00(1098597612);
        super.onResume();
        for (AnonymousClass0QB Ar6 : AnonymousClass0QA.A00.A00) {
            Ar6.Ar6(this);
        }
        AnonymousClass0QD.A00().BcK(getClass().getName());
        AnonymousClass0Z0.A07(-1000650145, A002);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C252117x.A02().A04(i);
    }
}
