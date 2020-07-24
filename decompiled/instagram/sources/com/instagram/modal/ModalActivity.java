package com.instagram.modal;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.util.HashSet;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass19Z;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1X4;
import p000X.C06500Ph;
import p000X.C06590Pq;
import p000X.C12600h4;
import p000X.C18450rs;
import p000X.C18470ru;
import p000X.C27141Gq;
import p000X.C33501d1;
import p000X.C52352Ol;
import p000X.C52362Om;

public class ModalActivity extends BaseFragmentActivity {
    public static final int[] A03 = (AnonymousClass19Z.A04 ? new int[]{C0003R.anim.modal_slide_up_enter, C0003R.anim.modal_empty_animation, C0003R.anim.modal_empty_animation, C0003R.anim.modal_slide_down_exit} : null);
    public static final int[] A04;
    public static final int[] A05;
    public AnonymousClass0C1 A00;
    public String A01;
    public final Set A02 = new HashSet();

    public boolean A0a() {
        return true;
    }

    static {
        int[] iArr = Build.VERSION.SDK_INT == 26 ? new int[]{C0003R.anim.empty_anim, C0003R.anim.empty_anim, C0003R.anim.empty_anim, C0003R.anim.empty_anim} : new int[]{0, 0, 0, 0};
        A04 = iArr;
        if (AnonymousClass19Z.A03) {
            iArr = new int[]{C0003R.anim.fragment_slide_left_enter, C0003R.anim.fragment_slide_left_exit, C0003R.anim.fragment_slide_right_enter, C0003R.anim.fragment_slide_right_exit};
        }
        A05 = iArr;
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final C33501d1 A0P() {
        AnonymousClass0C1 r0 = this.A00;
        if (r0 != null) {
            return C33501d1.A00(r0);
        }
        return null;
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.A02.add(Integer.valueOf(i));
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void A0V(Bundle bundle) {
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            String stringExtra = getIntent().getStringExtra("fragment_name");
            if ("bottom_sheet".equals(stringExtra)) {
                this.A01 = stringExtra;
                return;
            }
            Bundle bundleExtra = getIntent().getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
            bundleExtra.putAll(new Bundle());
            AnonymousClass1HD A002 = C18450rs.A00.A00(this.A00, this, stringExtra, bundleExtra);
            if (A002 == null) {
                return;
            }
            if (A002 instanceof C52352Ol) {
                ((C52352Ol) A002).A06(A05(), "dialog_fragment");
                return;
            }
            C52362Om r1 = new C52362Om(this, this.A00);
            r1.A08(A002, bundleExtra);
            r1.A08 = false;
            C52362Om.A01(r1, Constants.ZERO);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r5.getStringExtra("fragment_name");
        r3 = r5.getBundleExtra(com.instagram.react.modules.product.IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
     */
    public final void A0Z(Intent intent) {
        String stringExtra;
        Bundle bundleExtra;
        AnonymousClass1HD A002;
        if ((intent.getFlags() & 268435456) == 268435456 && (A002 = C18450rs.A00.A00(this.A00, this, stringExtra, bundleExtra)) != null) {
            C52362Om r1 = new C52362Om(this, this.A00);
            r1.A08(A002, bundleExtra);
            r1.A08 = false;
            r1.A02();
        }
    }

    public final int[] A0b() {
        int[] intArrayExtra = getIntent().getIntArrayExtra("fragment_animation");
        if (intArrayExtra == null || intArrayExtra.length != 4) {
            return null;
        }
        return intArrayExtra;
    }

    public void finish() {
        super.finish();
        int[] A0b = A0b();
        if (A0b != null) {
            overridePendingTransition(A0b[2], A0b[3]);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1HD A0L;
        super.onActivityResult(i, i2, intent);
        if (this.A02.remove(Integer.valueOf(i)) && (A0L = A05().A0L(C0003R.C0005id.layout_container_main)) != null) {
            A0L.onActivityResult(i, i2, intent);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (A0a()) {
            C06500Ph.A01(this, configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(974291974);
        C12600h4 A003 = C12600h4.A00();
        if (AnonymousClass0Q7.A03().A0H()) {
            C12600h4.A01(A003, this, Constants.ONE, -1, Looper.myQueue());
        }
        this.A00 = AnonymousClass0J1.A05();
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("translucent_navigation_bar", false);
        boolean booleanExtra2 = intent.getBooleanExtra("will_hide_system_ui", false);
        if (booleanExtra) {
            getWindow().addFlags(134217728);
            getWindow().addFlags(Process.WAIT_RESULT_TIMEOUT);
        } else if (!booleanExtra2) {
            findViewById(C0003R.C0005id.layout_container_parent).setFitsSystemWindows(intent.getBooleanExtra("will_fit_system_windows", true));
            int i = 1280;
            if (intent.getBooleanExtra("will_hide_navigation_bar", false)) {
                i = 1792;
            }
            getWindow().getDecorView().setSystemUiVisibility(i);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (intent.hasExtra("status_bar_color")) {
                getWindow().setStatusBarColor(intent.getIntExtra("status_bar_color", -16777216));
                AnonymousClass1X4.A03(this, true);
            }
            if (intent.hasExtra("navigation_bar_color")) {
                C27141Gq.A01(this, intent.getIntExtra("navigation_bar_color", -16777216));
            }
        }
        int[] A0b = A0b();
        if (A0b != null) {
            overridePendingTransition(A0b[0], A0b[1]);
        }
        AnonymousClass0Z0.A07(23611305, A002);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if ("bottom_sheet".equals(this.A01)) {
            C18470ru r3 = C18470ru.A00;
            AnonymousClass0C1 r2 = this.A00;
            Bundle bundleExtra = getIntent().getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
            AnonymousClass11J.A00(bundleExtra);
            r3.A00(r2, this, bundleExtra);
        }
    }
}
