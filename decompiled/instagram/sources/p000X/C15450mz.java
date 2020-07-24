package p000X;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* renamed from: X.0mz  reason: invalid class name and case insensitive filesystem */
public final class C15450mz implements C15440my {
    public final C15440my A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r1.equals("bk.action.spring.SetEndValue") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r1.equals("bk.action.spring.CreateSpring") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r1.equals("bk.action.animation.linear.Cancel") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r1.equals("bk.action.animation.linear.Start") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r1.equals("bk.action.animation.linear.SetNewEndValue") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r1.equals("bk.action.spring.GetCurrentValue") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r1.equals("bk.action.spring.Start") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (r1.equals("bk.action.animation.linear.CreateAnimation") == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x017d, code lost:
        return p000X.C53602Tl.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01d2, code lost:
        throw new java.lang.IllegalArgumentException("arguments have to be continuous");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1.equals("bk.action.animation.linear.GetCurrentValue") == false) goto L_0x000e;
     */
    public final C53542Te ADQ(C53522Tc r15, C51422Kp r16, C53532Td r17) {
        char c;
        String str = r15.A00;
        switch (str.hashCode()) {
            case -1334580548:
                c = 4;
                break;
            case -1254044492:
                c = 1;
                break;
            case -771341376:
                c = 2;
                break;
            case -717377024:
                c = 8;
                break;
            case -686296522:
                c = 5;
                break;
            case -275596506:
                c = 6;
                break;
            case 593705367:
                c = 0;
                break;
            case 1320422058:
                c = 3;
                break;
            case 2098589378:
                c = 7;
                break;
            default:
                c = 65535;
                break;
        }
        C53532Td r8 = r17;
        C51422Kp r1 = r16;
        switch (c) {
            case 0:
                C49662Dc A002 = C53552Tf.A00(r1.A00(0));
                AnonymousClass1EG A003 = new AnonymousClass1EB(AnonymousClass7OW.A00()).A00();
                ArrayList arrayList = new ArrayList();
                if (arrayList.size() == 0) {
                    arrayList.add(C51412Ko.A00(A003));
                    A003.A07(new C225059mX(this, A002, new C51422Kp(arrayList), r8));
                    return C51412Ko.A00(A003);
                }
                break;
            case 1:
                break;
            case 2:
                return AnonymousClass2U3.A00(((AnonymousClass1EG) C51412Ko.A02(r1.A00(0))).A00());
            case 3:
                ((AnonymousClass1EG) C51412Ko.A02(r1.A00(0))).A03((double) ((AnonymousClass2Tw) r1.A00(1)).floatValue());
                break;
            case 4:
                ValueAnimator valueAnimator = new ValueAnimator();
                C49662Dc A004 = C53552Tf.A00(r1.A00(0));
                C49662Dc A005 = C53552Tf.A00(r1.A00(1));
                float floatValue = ((AnonymousClass2Tw) r1.A00(2)).floatValue();
                float floatValue2 = ((AnonymousClass2Tw) r1.A00(3)).floatValue();
                float floatValue3 = ((AnonymousClass2Tw) r1.A00(4)).floatValue();
                ArrayList arrayList2 = new ArrayList();
                if (arrayList2.size() == 0) {
                    arrayList2.add(C51412Ko.A00(valueAnimator));
                    C51422Kp r12 = new C51422Kp(arrayList2);
                    valueAnimator.addUpdateListener(new C225069mY(this, A004, r12, r8));
                    valueAnimator.addListener(new C225079mZ(this, A005, r12, r8));
                    valueAnimator.setInterpolator(new LinearInterpolator());
                    valueAnimator.setFloatValues(new float[]{floatValue, floatValue2});
                    valueAnimator.setDuration((long) (floatValue3 * 1000.0f));
                    return C51412Ko.A00(valueAnimator);
                }
                break;
            case 5:
                ((ValueAnimator) C51412Ko.A02(r1.A00(0))).start();
                break;
            case 6:
                ((ValueAnimator) C51412Ko.A02(r1.A00(0))).cancel();
                break;
            case 7:
                return new AnonymousClass2VI(((Float) ((ValueAnimator) C51412Ko.A02(r1.A00(0))).getAnimatedValue()).floatValue());
            case 8:
                ValueAnimator valueAnimator2 = (ValueAnimator) C51412Ko.A02(r1.A00(0));
                float floatValue4 = ((AnonymousClass2Tw) r1.A00(1)).floatValue();
                float floatValue5 = ((AnonymousClass2Tw) r1.A00(2)).floatValue();
                valueAnimator2.setFloatValues(new float[]{((Float) valueAnimator2.getAnimatedValue()).floatValue(), floatValue4});
                valueAnimator2.setDuration((long) (floatValue5 * 1000.0f));
                valueAnimator2.start();
                break;
            default:
                return this.A00.ADQ(r15, r1, r8);
        }
    }

    public C15450mz(C15440my r1) {
        this.A00 = r1;
    }
}
