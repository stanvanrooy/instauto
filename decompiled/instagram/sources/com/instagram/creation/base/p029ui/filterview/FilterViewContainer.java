package com.instagram.creation.base.p029ui.filterview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.p004ui.widget.imageview.PunchedOverlayView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.p029ui.TagPeopleDrawable;
import com.instagram.creation.state.CreationState;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass7MK;
import p000X.C019000b;
import p000X.C11200ea;
import p000X.C178557js;
import p000X.C182797rM;
import p000X.C183877tP;
import p000X.C183887tQ;
import p000X.C183897tR;
import p000X.C183907tS;
import p000X.C183927tU;
import p000X.C183937tV;
import p000X.C186077xB;
import p000X.C23300zv;

/* renamed from: com.instagram.creation.base.ui.filterview.FilterViewContainer */
public class FilterViewContainer extends MediaFrameLayout implements AnonymousClass1E8, C11200ea, GestureDetector.OnGestureListener {
    public AnimationDrawable A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public CreationSession A05;
    public C183937tV A06;
    public AnonymousClass0C1 A07;
    public boolean A08;
    public GestureDetector A09;
    public final AnonymousClass1EG A0A = AnonymousClass0P2.A00().A00();
    public final Handler A0B = new C183907tS(this);

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void A02(boolean z, Drawable drawable) {
        if (z) {
            CreationSession creationSession = this.A05;
            Bitmap bitmap = creationSession.A03;
            if (bitmap != null) {
                this.A04.addOnLayoutChangeListener(new C178557js(this, creationSession.A04, creationSession.A07.A00.A01));
                this.A04.setImageBitmap(bitmap);
                CreationSession creationSession2 = this.A05;
                creationSession2.A03 = null;
                creationSession2.A04 = null;
            } else {
                this.A04.setImageDrawable(drawable);
            }
            this.A04.setVisibility(0);
            return;
        }
        this.A04.setVisibility(4);
    }

    public final void BOH(AnonymousClass1EG r10) {
        int i = 4;
        if (this.A01.getVisibility() != 8) {
            View view = this.A01;
            int i2 = 0;
            if (r10.A00() == 0.0d) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
        if (this.A02.getVisibility() != 8) {
            View view2 = this.A02;
            int i3 = 0;
            if (r10.A00() == 0.0d) {
                i3 = 4;
            }
            view2.setVisibility(i3);
        }
        if (this.A03.getVisibility() != 8) {
            View view3 = this.A03;
            if (r10.A00() != 0.0d) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    private void A00() {
        Context context = getContext();
        C182797rM r1 = (C182797rM) context;
        this.A05 = r1.AJ7();
        this.A07 = r1.AZl();
        getContext();
        this.A09 = new GestureDetector(context, this);
    }

    public static void A01(View view, float f) {
        if (view.getVisibility() != 8) {
            view.setAlpha(Math.min(1.0f, Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f)));
            view.setVisibility(0);
        }
    }

    public final void BOK(AnonymousClass1EG r5) {
        float A002 = (float) r5.A00();
        A01(this.A01, A002);
        A01(this.A02, A002);
        A01(this.A03, A002);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(985958785);
        super.onAttachedToWindow();
        ((C183927tU) getContext()).BZV(this);
        AnonymousClass1EG r3 = this.A0A;
        r3.A07(this);
        r3.A05(1.0d, true);
        AnonymousClass0Z0.A0D(-1757303389, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(898253361);
        super.onDetachedFromWindow();
        C23300zv.A00(this.A07).A03(C186077xB.class, this);
        this.A0A.A08(this);
        AnonymousClass0ZA.A07(this.A0B, (Object) null);
        AnonymousClass0Z0.A0D(-1430928286, A062);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0Z0.A03(1860178336);
        int A033 = AnonymousClass0Z0.A03(1276643228);
        if (((C186077xB) obj).A02 == CreationState.SHARE) {
            CreationSession creationSession = this.A05;
            if (!creationSession.A0N() || creationSession.A01 != 0) {
                this.A02.setVisibility(8);
            } else {
                ((TagPeopleDrawable) this.A02.findViewById(C0003R.C0005id.tag_people_pill_icon)).setNumPeopleTagged(this.A05.A0D.size());
                this.A02.setOnClickListener(new C183897tR(this));
                this.A02.setVisibility(0);
                A01(this.A02, (float) this.A0A.A00());
            }
            this.A01.setOnClickListener(new C183877tP(this));
            int i = 0;
            this.A01.setVisibility(0);
            this.A03.setOnClickListener(new C183887tQ(this));
            View view = this.A03;
            CreationSession creationSession2 = this.A05;
            if (creationSession2.A0N() || !creationSession2.A07.A01.A0C) {
                i = 8;
            }
            view.setVisibility(i);
            this.A00.stop();
        } else {
            this.A0A.A05(1.0d, true);
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
            this.A03.setVisibility(8);
        }
        AnonymousClass0Z0.A0A(1498972405, A033);
        AnonymousClass0Z0.A0A(1714647865, A032);
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0Z0.A06(1639287623);
        super.onFinishInflate();
        this.A04 = (ImageView) findViewById(C0003R.C0005id.loading_cover_for_surface_view);
        this.A01 = findViewById(C0003R.C0005id.edit_pill);
        this.A02 = findViewById(C0003R.C0005id.tag_people_pill);
        View findViewById = findViewById(C0003R.C0005id.trim_pill);
        this.A03 = findViewById;
        this.A00 = (AnimationDrawable) ((ImageView) findViewById.findViewById(C0003R.C0005id.trim_pill_icon)).getDrawable();
        Context context = getContext();
        if (((C182797rM) context).AJ7().A0A == Constants.ONE) {
            PunchedOverlayView punchedOverlayView = (PunchedOverlayView) ((ViewStub) findViewById(C0003R.C0005id.avatar_punched_stub)).inflate();
            getContext();
            getContext();
            punchedOverlayView.setDarkenColor(C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.creationTertiaryBackground)));
            punchedOverlayView.post(new AnonymousClass7MK(this, punchedOverlayView));
        }
        AnonymousClass0Z0.A0D(934044002, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C183937tV r0;
        int A052 = AnonymousClass0Z0.A05(1564346410);
        this.A09.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z = false;
                if (motionEvent.getActionMasked() == 3) {
                    z = true;
                }
                AnonymousClass0ZA.A02(this.A0B, 0);
                getParent().requestDisallowInterceptTouchEvent(false);
                if (this.A08 && (r0 = this.A06) != null) {
                    this.A08 = false;
                    r0.BAI(z);
                }
            }
        } else if (this.A06 != null) {
            AnonymousClass0ZA.A03(this.A0B, 0, 300);
        }
        AnonymousClass0Z0.A0C(-671123914, A052);
        return true;
    }

    public void setLongPressListener(C183937tV r1) {
        this.A06 = r1;
    }

    public FilterViewContainer(Context context) {
        super(context);
        A00();
    }

    public FilterViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public FilterViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
