package com.instagram.base.activity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.debughead.touchlistener.DebugHeadTouchListener;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0Q8;
import p000X.AnonymousClass0QA;
import p000X.AnonymousClass0QB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0RU;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass12K;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1AY;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass221;
import p000X.AnonymousClass222;
import p000X.AnonymousClass2FX;
import p000X.AnonymousClass2LW;
import p000X.AnonymousClass2YZ;
import p000X.C05210Iq;
import p000X.C05700Lp;
import p000X.C05760Lv;
import p000X.C06590Pq;
import p000X.C11840fl;
import p000X.C128505en;
import p000X.C13150hy;
import p000X.C15330mi;
import p000X.C17860qv;
import p000X.C252117x;
import p000X.C25731Aa;
import p000X.C25791Ai;
import p000X.C26441Dh;
import p000X.C27351Hm;
import p000X.C28351Lj;
import p000X.C31211Wy;
import p000X.C31221Wz;
import p000X.C33421ct;
import p000X.C44001vR;
import p000X.C470321z;
import p000X.C51902Mo;
import p000X.C54792Yy;
import p000X.C54802Yz;

public abstract class IgFragmentActivity extends AppCompatActivity implements C11840fl {
    public DebugHeadTouchListener A00;
    public C25791Ai A01;
    public C31221Wz A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r7 == 24) goto L_0x000b;
     */
    private boolean A01(int i, KeyEvent keyEvent) {
        boolean z;
        AnonymousClass2YZ r0;
        if (i != 25) {
            z = false;
        }
        z = true;
        if (z) {
            for (AnonymousClass1HD r1 : A05().A0Q.A02()) {
                if (r1 instanceof C27351Hm) {
                    C27351Hm r12 = (C27351Hm) r1;
                    if (i == 25) {
                        r0 = AnonymousClass2YZ.VOLUME_DOWN;
                    } else {
                        r0 = AnonymousClass2YZ.VOLUME_UP;
                    }
                    if (r12.onVolumeKeyPressed(r0, keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public abstract C06590Pq A0L();

    public final C31221Wz AGw() {
        if (this.A02 == null) {
            C06590Pq A0L = A0L();
            AnonymousClass0a4.A06(A0L);
            AnonymousClass1AM A05 = A05();
            C13150hy.A02(this, "activity");
            C13150hy.A02(A0L, "session");
            C13150hy.A02(A05, "fragmentManager");
            this.A02 = new C31211Wy(this, A0L, A05);
        }
        return this.A02;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(new AnonymousClass1AY(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (((p000X.AnonymousClass1HK) r1).onBackPressed() == false) goto L_0x0023;
     */
    public void onBackPressed() {
        boolean z;
        C31221Wz r0 = this.A02;
        if (r0 == null || !r0.A0O()) {
            AnonymousClass1HD A0L = A05().A0L(C0003R.C0005id.layout_container_main);
            if (A0L instanceof AnonymousClass1HK) {
                z = true;
            }
            z = false;
            if (!z) {
                C26441Dh.A00(A0L()).A03(this, "back");
                super.onBackPressed();
            }
        }
    }

    public void A0M() {
        onBackPressed();
    }

    public void A0N(C17860qv r2) {
        C28351Lj.A00(this, AnonymousClass1L8.A00(this), r2);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnonymousClass12K r4;
        C06590Pq A0L = A0L();
        C25791Ai r0 = this.A01;
        if (r0 != null) {
            if (!r0.A05 && motionEvent.getAction() == 0) {
                r0.A00 = motionEvent.getEventTime();
                AnonymousClass222 r2 = r0.A01;
                r2.A00.markerStart(57475073, 0, motionEvent.getEventTime(), TimeUnit.MILLISECONDS);
                r2.A00.markerPoint(57475073, "TOUCH_DOWN_HANDLE");
                r0.A05 = true;
                AnonymousClass221 r5 = r0.A02;
                if (r5.A01 == null) {
                    r5.A01 = new AnonymousClass2LW();
                    r5.A00 = System.nanoTime();
                    C470321z r42 = r5.A02;
                    if (r42.A03.isEmpty()) {
                        r42.A00 = 0;
                        r42.A02.postFrameCallback(r42.A01);
                    }
                    r42.A03.add(r5);
                }
            } else if (r0.A05 && !r0.A03 && motionEvent.getAction() == 1) {
                r0.A03 = true;
                AnonymousClass222 r22 = r0.A01;
                r22.A00.markerPoint(57475073, "TOUCH_UP_EVENT", motionEvent.getEventTime(), TimeUnit.MILLISECONDS);
                r22.A00.markerPoint(57475073, "TOUCH_UP_HANDLE");
                Looper.myQueue().addIdleHandler(new C51902Mo(r0, A0L));
            }
        }
        DebugHeadTouchListener debugHeadTouchListener = this.A00;
        if (debugHeadTouchListener != null) {
            debugHeadTouchListener.onTouchEvent(motionEvent);
        }
        AnonymousClass0WN.A01(A0L).Bck(motionEvent);
        if (!(A0L == null || !A0L.AgN() || (r4 = (AnonymousClass12K) C05210Iq.A02(A0L).AV9(AnonymousClass12K.class)) == null || r4.A06.get() == null || !r4.A08)) {
            try {
                C05700Lp.A00().ADc(new C54792Yy(r4, MotionEvent.obtain(motionEvent)));
            } catch (Throwable th) {
                C54802Yz.A00(th);
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            if (e.getMessage().equals("java.lang.NullPointerException: Attempt to read from field 'int android.view.View.mPrivateFlags' on a null object reference")) {
                AnonymousClass0QD.A06("IgFragmentActivity_error_dispatching_touch_event", "Tried to dispatch a touch event, but got an error. MotionEvent: " + motionEvent, e);
                return false;
            } else if (!((Boolean) AnonymousClass0L6.A00(A0L, AnonymousClass0L7.FRAGMENT_ACTIVITY_CRASH_ENABLE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                return false;
            } else {
                throw e;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-311357174);
        AnonymousClass0Q8 r5 = AnonymousClass0QA.A00;
        for (AnonymousClass0QB Aqy : r5.A00) {
            Aqy.Aqy(this);
        }
        this.A01 = C25791Ai.A06;
        this.A00 = DebugHeadTouchListener.INSTANCE;
        int i = 0;
        boolean A03 = C15330mi.A03(false);
        int i2 = -1;
        if (A03) {
            int i3 = C05760Lv.A01.A00.getInt("dark_mode_toggle_setting", -1);
            if (i3 == -1) {
                int i4 = 1;
                if (C15330mi.A00().getInt("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", -1) == 32) {
                    i4 = 2;
                }
                C25731Aa.A08(i4);
            } else {
                C25731Aa.A08(i3);
            }
            i2 = i3;
        }
        super.onCreate(bundle);
        for (AnonymousClass0QB Aqz : r5.A00) {
            Aqz.Aqz(this);
        }
        setVolumeControlStream(Process.WAIT_RESULT_TIMEOUT);
        if (Build.VERSION.SDK_INT >= 21) {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, AnonymousClass1BA.A01(this, 16843857) | -16777216));
        }
        if (A03) {
            if (i2 == 1) {
                i = 16;
            } else if (i2 == 2) {
                i = 32;
            }
            AnonymousClass0RU A003 = AnonymousClass0WN.A00();
            if (i != C15330mi.A00().getInt("KEY_CONFIG_UI_MODE", -1)) {
                C15330mi.A02(this, i);
                AnonymousClass0P4 A004 = AnonymousClass0P4.A00("dark_mode_in_app_toggled", (AnonymousClass0RN) null);
                A004.A0E("in_app_dark_mode_setting", Integer.valueOf(i2));
                A003.BcG(A004);
            }
        }
        AnonymousClass0Z0.A07(1246483589, A002);
    }

    public void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(1870482225);
        super.onDestroy();
        for (AnonymousClass0QB Ar1 : AnonymousClass0QA.A00.A00) {
            Ar1.Ar1(this);
        }
        C44001vR.A00(this);
        AnonymousClass0Z0.A07(421754636, A002);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A01(i, keyEvent) || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AnonymousClass1HD A0L = A05().A0L(C0003R.C0005id.layout_container_main);
        if ((!(A0L instanceof AnonymousClass2FX) || !((AnonymousClass2FX) A0L).AbO(i, keyEvent)) && !A01(i, keyEvent) && !super.onKeyUp(i, keyEvent)) {
            return false;
        }
        return true;
    }

    public void onPause() {
        int A002 = AnonymousClass0Z0.A00(-2087975887);
        super.onPause();
        for (AnonymousClass0QB Ar2 : AnonymousClass0QA.A00.A00) {
            Ar2.Ar2(this);
        }
        AnonymousClass0Z0.A07(-234322666, A002);
    }

    public void onResume() {
        int A002 = AnonymousClass0Z0.A00(1127377374);
        super.onResume();
        for (AnonymousClass0QB Ar6 : AnonymousClass0QA.A00.A00) {
            Ar6.Ar6(this);
        }
        C33421ct A003 = C33421ct.A00();
        while (!A003.isEmpty()) {
            ((C128505en) A003.removeFirst()).ADX(this);
        }
        AnonymousClass0Z0.A07(1266295207, A002);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C252117x.A02().A04(i);
        onLowMemory();
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        C06590Pq A0L = A0L();
        if (A0L != null && ((Boolean) AnonymousClass0L6.A00(A0L, AnonymousClass0L7.LOW_RAM_ANIMATIONS, "activity_transition_disabled", false, (AnonymousClass04H) null)).booleanValue()) {
            intent.addFlags(DexStore.LOAD_RESULT_PGO_ATTEMPTED);
        }
        super.startActivity(intent, bundle);
    }
}
