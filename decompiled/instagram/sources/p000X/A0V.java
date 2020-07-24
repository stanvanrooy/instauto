package p000X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.A0V */
public abstract class A0V {
    public static final Map A04;
    public int A00;
    public int A01;
    public Interpolator A02;
    public Integer A03;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bb, code lost:
        if (r11.getY() != ((float) r13)) goto L_0x00bd;
     */
    public Animation A00(View view, int i, int i2, int i3, int i4) {
        boolean z;
        String str;
        View view2 = view;
        if (!(this instanceof C226349oh)) {
            A0Q a0q = (A0Q) this;
            Integer num = a0q.A03;
            if (num != null) {
                int intValue = num.intValue();
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                switch (intValue) {
                    case 0:
                        boolean A042 = a0q.A04();
                        float alpha = A042 ? view.getAlpha() : BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        if (!A042) {
                            f = view.getAlpha();
                        }
                        return new A0R(view, alpha, f);
                    case 1:
                        boolean A043 = a0q.A04();
                        if (A043) {
                            f = 1.0f;
                        }
                        float f2 = 1.0f;
                        if (A043) {
                            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        }
                        return new ScaleAnimation(f, f2, 1.0f, 1.0f, 1, 0.5f, 1, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    case 2:
                        boolean A044 = a0q.A04();
                        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        if (A044) {
                            f3 = 1.0f;
                        }
                        float f4 = 1.0f;
                        if (A044) {
                            f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        }
                        return new ScaleAnimation(1.0f, 1.0f, f3, f4, 1, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1, 0.5f);
                    case 3:
                        boolean A045 = a0q.A04();
                        if (A045) {
                            f = 1.0f;
                        }
                        float f5 = 1.0f;
                        if (A045) {
                            f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        }
                        return new ScaleAnimation(f, f5, f, f5, 1, 0.5f, 1, 0.5f);
                    default:
                        if (num != null) {
                            switch (intValue) {
                                case 1:
                                    str = "SCALE_X";
                                    break;
                                case 2:
                                    str = "SCALE_Y";
                                    break;
                                case 3:
                                    str = "SCALE_XY";
                                    break;
                                default:
                                    str = "OPACITY";
                                    break;
                            }
                        } else {
                            str = "null";
                        }
                        throw new A0i(AnonymousClass000.A0E("Missing animation for property : ", str));
                }
            } else {
                throw new A0i("Missing animated property from animation config");
            }
        } else {
            int i5 = i;
            boolean z2 = false;
            int i6 = i2;
            if (view.getX() == ((float) i)) {
                z = false;
            }
            z = true;
            int i7 = i4;
            int i8 = i3;
            if (!(view.getWidth() == i3 && view.getHeight() == i4)) {
                z2 = true;
            }
            if (z || z2) {
                return new AnonymousClass8YT(view2, i5, i6, i8, i7);
            }
            return null;
        }
    }

    public boolean A03() {
        if (this instanceof C226349oh) {
            return ((C226349oh) this).A01 > 0;
        }
        A0Q a0q = (A0Q) this;
        return a0q.A01 > 0 && a0q.A03 != null;
    }

    static {
        A0W a0w = A0W.LINEAR;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        A0W a0w2 = A0W.EASE_IN;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        A0W a0w3 = A0W.EASE_OUT;
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        A0W a0w4 = A0W.EASE_IN_EASE_OUT;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        HashMap hashMap = new HashMap();
        hashMap.put(a0w, linearInterpolator);
        hashMap.put(a0w2, accelerateInterpolator);
        hashMap.put(a0w3, decelerateInterpolator);
        hashMap.put(a0w4, accelerateDecelerateInterpolator);
        A04 = hashMap;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (r0 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        if (r0 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c7, code lost:
        if (r0 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if (r0 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        if (r0 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r3.equals("opacity") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0100, code lost:
        if (r3.equals("scaleX") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010b, code lost:
        if (r3.equals("scaleY") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0116, code lost:
        if (r3.equals("scaleXY") == false) goto L_0x0016;
     */
    public final void A02(C23043A0y a0y, int i) {
        Integer num;
        int i2;
        char c;
        A0W a0w;
        Interpolator interpolator;
        float f;
        char c2;
        if (a0y.hasKey("property")) {
            String string = a0y.getString("property");
            switch (string.hashCode()) {
                case -1267206133:
                    c2 = 0;
                    break;
                case -908189618:
                    c2 = 1;
                    break;
                case -908189617:
                    c2 = 2;
                    break;
                case 1910893003:
                    c2 = 3;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                num = Constants.ZERO;
            } else if (c2 == 1) {
                num = Constants.ONE;
            } else if (c2 == 2) {
                num = Constants.A0C;
            } else if (c2 == 3) {
                num = Constants.A0N;
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unsupported animated property: ", string));
            }
        } else {
            num = null;
        }
        this.A03 = num;
        if (a0y.hasKey("duration")) {
            i = a0y.getInt("duration");
        }
        this.A01 = i;
        if (a0y.hasKey("delay")) {
            i2 = a0y.getInt("delay");
        } else {
            i2 = 0;
        }
        this.A00 = i2;
        if (a0y.hasKey("type")) {
            String string2 = a0y.getString("type");
            String lowerCase = string2.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -1965056864:
                    boolean equals = lowerCase.equals("easeout");
                    c = 2;
                    break;
                case -1310315117:
                    boolean equals2 = lowerCase.equals("easein");
                    c = 1;
                    break;
                case -1102672091:
                    boolean equals3 = lowerCase.equals("linear");
                    c = 0;
                    break;
                case -895679987:
                    boolean equals4 = lowerCase.equals("spring");
                    c = 4;
                    break;
                case 1164546989:
                    boolean equals5 = lowerCase.equals("easeineaseout");
                    c = 3;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                a0w = A0W.LINEAR;
            } else if (c == 1) {
                a0w = A0W.EASE_IN;
            } else if (c == 2) {
                a0w = A0W.EASE_OUT;
            } else if (c == 3) {
                a0w = A0W.EASE_IN_EASE_OUT;
            } else if (c == 4) {
                a0w = A0W.SPRING;
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unsupported interpolation type : ", string2));
            }
            if (a0w.equals(A0W.SPRING)) {
                if (a0y.getType("springDamping").equals(ReadableType.Number)) {
                    f = (float) a0y.getDouble("springDamping");
                } else {
                    f = 0.5f;
                }
                interpolator = new A0X(f);
            } else {
                interpolator = (Interpolator) A04.get(a0w);
            }
            if (interpolator != null) {
                this.A02 = interpolator;
                if (!A03()) {
                    throw new A0i("Invalid layout animation : " + a0y);
                }
                return;
            }
            throw new IllegalArgumentException("Missing interpolator for type : " + a0w);
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    public final Animation A01(View view, int i, int i2, int i3, int i4) {
        if (!A03()) {
            return null;
        }
        Animation A002 = A00(view, i, i2, i3, i4);
        if (A002 != null) {
            A002.setDuration((long) this.A01);
            A002.setStartOffset((long) this.A00);
            A002.setInterpolator(this.A02);
        }
        return A002;
    }
}
