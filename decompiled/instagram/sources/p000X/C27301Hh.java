package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.refresh.RefreshableListView;

/* renamed from: X.1Hh  reason: invalid class name and case insensitive filesystem */
public final class C27301Hh extends C256219o implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C33951dl A06;
    public boolean A07;
    public View[] A08;
    public float A09;
    public float A0A;
    public int A0B;
    public boolean A0C;
    public final float A0D;
    public final Handler A0E;
    public final C27311Hi A0F;
    public final boolean A0G;

    private void A01() {
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
        A02(this, -this.A01);
        AnonymousClass0ZA.A07(this.A0E, (Object) null);
    }

    public static C27301Hh A00(Context context) {
        AnonymousClass1HD A0L = ((FragmentActivity) context).A05().A0L(C0003R.C0005id.layout_container_main);
        if (A0L == null || !A03(A0L)) {
            return null;
        }
        return ((AnonymousClass1HO) A0L).AMt();
    }

    public static void A02(C27301Hh r5, float f) {
        float f2 = r5.A01;
        r5.A01 = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(r5.A00, f + f2));
        if (r5.A08 != null) {
            int i = 0;
            while (true) {
                View[] viewArr = r5.A08;
                if (i >= viewArr.length) {
                    break;
                }
                View view = viewArr[i];
                float f3 = r5.A01;
                if (view.getVisibility() == 0) {
                    view.setTranslationY((float) ((int) (-f3)));
                }
                i++;
            }
        }
        C33951dl r2 = r5.A06;
        if (r2 != null) {
            float f4 = r5.A01;
            if (f2 != f4) {
                r2.BSk(f4);
            }
        }
    }

    public static boolean A03(AnonymousClass1HD r1) {
        while (true) {
            AnonymousClass1HD r0 = r1.mParentFragment;
            if (r0 == null) {
                break;
            }
            r1 = r0;
        }
        if (!(r1 instanceof AnonymousClass1HO) || !((AnonymousClass1HO) r1).AhS()) {
            return false;
        }
        return true;
    }

    public final void A0B(float f, C33951dl r6, View... viewArr) {
        this.A06 = r6;
        this.A08 = viewArr;
        float f2 = this.A00;
        this.A00 = f;
        if (f2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            float f3 = this.A01;
            if (f2 == f3) {
                A02(this, f - f3);
            } else {
                A02(this, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        }
        A01();
    }

    public final void A0D(C255119b r2, AnonymousClass1PJ r3, int i) {
        if (r2 != null) {
            r2.AaK().setOnTouchListener(this);
            r3.Bho(i);
            if (r2.AaK() instanceof RefreshableListView) {
                ((RefreshableListView) r2.AaK()).setDrawableTopOffset(i);
            }
        }
    }

    public final void A08(C255119b r7, int i) {
        int i2;
        int A032 = AnonymousClass0Z0.A03(-1996245223);
        if (i != 0 || this.A08 == null) {
            i2 = -1489659014;
        } else {
            float f = this.A00;
            float f2 = f - this.A01;
            boolean z = false;
            if (f2 > f / 2.0f) {
                z = true;
            }
            float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (z) {
                f3 = f;
            }
            if (f3 == f2) {
                if (this.A0C) {
                    this.A0A = this.A09;
                }
                i2 = 1406893598;
            } else {
                C27311Hi r2 = this.A0F;
                r2.A00 = f3;
                r2.A03 = z;
                r2.A02 = false;
                r2.A01 = r7;
                this.A05 = SystemClock.uptimeMillis();
                AnonymousClass0ZA.A0E(this.A0E, r2, -193810218);
                i2 = 203980706;
            }
        }
        AnonymousClass0Z0.A0A(i2, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007f, code lost:
        if (r5.A06.Bmq(r6) != false) goto L_0x0081;
     */
    public final void A09(C255119b r6, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        float f;
        int A032 = AnonymousClass0Z0.A03(-903165419);
        if (i2 <= 0 || r6.AI5() == 0) {
            i6 = -481183226;
        } else {
            if (r6.AgC() || !this.A0G) {
                int paddingTop = (-r6.AI1(0).getTop()) + r6.AaK().getPaddingTop();
                int height = r6.AI1(0).getHeight();
                if (this.A03 == -1) {
                    this.A02 = height;
                    this.A03 = i;
                    this.A04 = paddingTop;
                }
                int i8 = this.A03;
                if (i > i8) {
                    i7 = (this.A02 - this.A04) + paddingTop;
                } else if (i < i8) {
                    i7 = -((height - paddingTop) + this.A04);
                } else {
                    i7 = paddingTop - this.A04;
                }
                f = (float) i7;
                this.A02 = height;
                this.A03 = i;
                this.A04 = paddingTop;
            } else {
                f = (float) i5;
            }
            C33951dl r2 = this.A06;
            if (r2 == null) {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            if (!(!this.A07 || this.A08 == null || f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
                if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || this.A0A == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || r2.Bmr(r6)) {
                    if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    }
                } else if (this.A00 - this.A01 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    this.A0A = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                } else {
                    float f2 = this.A0A;
                    if ((-f) > f2) {
                        this.A0A = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        f = f2 + f;
                    } else {
                        this.A0A = f2 + f;
                        f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    }
                }
                A02(this, f);
            }
            int i9 = 1;
            if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                i9 = 2;
            }
            if (i9 != this.A0B && !this.A0C) {
                this.A0A = this.A09;
            }
            this.A0B = i9;
            i6 = -1510438306;
        }
        AnonymousClass0Z0.A0A(i6, A032);
    }

    public final void A0A() {
        A01();
    }

    public final void A0C(C255119b r2) {
        A01();
        if (r2 != null) {
            r2.AaK().requestLayout();
        }
        this.A08 = null;
    }

    public final void A0E(C255119b r6, AnonymousClass1PJ r7, int i) {
        r7.Bho(i);
        if (r6.AaK() instanceof RefreshableListView) {
            ((RefreshableListView) r6.AaK()).setDrawableTopOffset(i);
        }
        float f = (float) i;
        float f2 = this.A00;
        this.A00 = f;
        if (f2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            float f3 = this.A01;
            if (f2 == f3) {
                A02(this, f - f3);
            } else {
                A02(this, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            return false;
        }
        AnonymousClass0ZA.A07(this.A0E, (Object) null);
        return false;
    }

    public C27301Hh(Context context) {
        this(context, false);
    }

    public C27301Hh(Context context, boolean z) {
        this.A0E = new Handler(Looper.getMainLooper());
        this.A0F = new C27311Hi(this);
        this.A07 = true;
        this.A0D = C06220Of.A05(context.getResources().getDisplayMetrics(), 1) / 6.0f;
        this.A09 = (float) (C06220Of.A08(context) / 5);
        this.A0C = true;
        this.A0G = z;
    }
}
