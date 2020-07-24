package p000X;

import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: X.1gm  reason: invalid class name and case insensitive filesystem */
public final class C35691gm implements AnonymousClass1E8, View.OnTouchListener {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final View A06;
    public final AnonymousClass1EG A07;
    public final C34861fQ A08;
    public final boolean A09;
    public final boolean A0A;
    public final Rect A0B = new Rect();
    public final GestureDetector A0C;
    public final C35711go A0D = new C35711go(this);
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final void A02() {
        this.A00 = false;
        this.A02 = false;
        this.A07.A05(1.0d, true);
        for (int i = 0; i < this.A0E.size(); i++) {
            ((C34871fR) this.A0E.get(i)).BJa(this);
        }
    }

    public final void BOF(AnonymousClass1EG r3) {
        for (int i = 0; i < this.A0E.size(); i++) {
            ((C34871fR) this.A0E.get(i)).Ata(this);
        }
    }

    public final void BOH(AnonymousClass1EG r3) {
        for (int i = 0; i < this.A0E.size(); i++) {
            ((C34871fR) this.A0E.get(i)).Atb(this);
        }
        if (this.A02) {
            this.A08.BR2(this.A06);
            this.A02 = false;
            if (this.A09) {
                A03();
            }
        }
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final void BOK(AnonymousClass1EG r7) {
        for (int i = 0; i < this.A0E.size(); i++) {
            ((C34871fR) this.A0E.get(i)).Atc(this);
        }
        AnonymousClass1EG r4 = this.A07;
        float A002 = (float) r4.A00();
        if (this.A00 && A002 <= this.A04) {
            r4.A03(1.0d);
            this.A00 = false;
        }
    }

    public static boolean A00(C35691gm r7, MotionEvent motionEvent) {
        boolean contains = r7.A0B.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        r7.A03();
                        r7.A0C.onTouchEvent(motionEvent);
                        return false;
                    }
                } else if (!contains) {
                    r7.A03();
                    return false;
                }
            } else if (contains) {
                r7.A0C.onTouchEvent(motionEvent);
                if (!r7.A01) {
                    if (r7.A0F) {
                        r7.A02 = true;
                        boolean z = false;
                        if (((float) r7.A07.A00()) == r7.A04) {
                            z = true;
                        }
                        if (z) {
                            r7.A08.BR2(r7.A06);
                            r7.A02 = false;
                            if (r7.A09) {
                                r7.A03();
                            }
                            return true;
                        }
                        r7.A01();
                        return true;
                    } else if (r7.A0G) {
                        r7.A02 = true;
                    } else {
                        r7.A03();
                        return r7.A08.BR2(r7.A06);
                    }
                }
                r7.A03();
                return true;
            }
            return false;
        }
        r7.A0B.set(0, 0, r7.A06.getWidth(), r7.A06.getHeight());
        r7.A00 = false;
        r7.A02 = false;
        r7.A01 = false;
        r7.A01();
        r7.A0C.onTouchEvent(motionEvent);
        return true;
    }

    public final void A01() {
        AnonymousClass1EG r2 = this.A07;
        r2.A06 = true;
        r2.A03((double) this.A04);
    }

    public final void A03() {
        AnonymousClass1EG r2 = this.A07;
        r2.A06 = false;
        r2.A03(1.0d);
    }

    public final void A04(boolean z) {
        this.A03 = !z;
    }

    public final void A05(View... viewArr) {
        this.A0E.clear();
        for (View r2 : viewArr) {
            this.A0E.add(new C35661gj(r2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r4.A0D.A01 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r3 != 3) goto L_0x0016;
     */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.A03) {
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                    }
                }
                this.A06.removeCallbacks(this.A0D);
                if (this.A0H && !this.A0D.A01) {
                    if (action == 1) {
                        this.A00 = true;
                        A01();
                    }
                    this.A0D.run();
                }
                C35711go r1 = this.A0D;
                r1.A01 = false;
                MotionEvent motionEvent2 = r1.A00;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    r1.A00 = null;
                }
                return A00(this, motionEvent);
            }
            C35711go r2 = this.A0D;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            MotionEvent motionEvent3 = r2.A00;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            r2.A00 = obtain;
            this.A06.removeCallbacks(this.A0D);
            if (this.A0H) {
                this.A06.postOnAnimationDelayed(this.A0D, 150);
                return true;
            }
            this.A0D.run();
            return true;
        }
        return false;
    }

    public C35691gm(C35651gi r6) {
        GestureDetector gestureDetector = new GestureDetector(r6.A0B.getContext(), new C35701gn(this, r6), new Handler(Looper.getMainLooper()));
        this.A0C = gestureDetector;
        gestureDetector.setIsLongpressEnabled(r6.A06);
        this.A04 = r6.A03;
        View view = r6.A0B;
        this.A06 = view;
        this.A05 = view.getLayerType();
        this.A0E = r6.A0C;
        this.A08 = r6.A05;
        this.A0A = r6.A02;
        this.A0H = r6.A0A;
        this.A0F = r6.A07;
        this.A09 = r6.A08;
        this.A0G = r6.A09;
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(r6.A04);
        A002.A02 = r6.A01;
        A002.A00 = r6.A00;
        A002.A05(1.0d, true);
        A002.A02();
        A002.A07(this);
        this.A07 = A002;
        this.A06.addOnAttachStateChangeListener(new C35721gp(this));
        this.A06.setOnTouchListener(this);
        if (Build.VERSION.SDK_INT > 25) {
            this.A06.setClickable(false);
            this.A06.setFocusable(true);
            AnonymousClass1E1.A0b(this.A06, new C35731gq(this));
        }
    }
}
