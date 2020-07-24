package p000X;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;

/* renamed from: X.A86 */
public final class A86 extends A9H {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final /* synthetic */ A8K A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A86(A8K a8k, int i, int i2, int i3, int i4, int i5, int i6) {
        super(a8k, i2);
        this.A05 = a8k;
        this.A01 = i;
        this.A03 = i3;
        this.A04 = i4;
        this.A02 = i5;
        this.A00 = i6;
        Systrace.A04(33554432, "updateLayout", this.A00);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (r1.needsCustomLayoutForChildren() == false) goto L_0x0070;
     */
    public final void execute() {
        A0V a0v;
        Systrace.A02(33554432, "updateLayout", this.A00);
        A83 a83 = this.A05.A0L;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = this.A03;
        int i4 = this.A04;
        int i5 = this.A02;
        int i6 = this.A00;
        synchronized (a83) {
            C228039ra.A00();
            C08750Yk A022 = SystraceMessage.A02(33554432, "NativeViewHierarchyManager_updateLayout");
            A022.A00("parentTag", i);
            A022.A00(B5B.INTENT_PARAM_TAG, i2);
            A022.A02();
            try {
                View A023 = a83.A02(i2);
                A023.measure(View.MeasureSpec.makeMeasureSpec(i5, C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i6, C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
                ViewParent parent = A023.getParent();
                if (parent instanceof A6D) {
                    parent.requestLayout();
                }
                if (!a83.A06.get(i)) {
                    ViewManager viewManager = (ViewManager) a83.A04.get(i);
                    if (viewManager instanceof A9Z) {
                        A9Z a9z = (A9Z) viewManager;
                        if (a9z != null) {
                        }
                        AnonymousClass0ZJ.A00(33554432, 1565728068);
                    } else {
                        throw new A0i(AnonymousClass000.A06("Trying to use view with tag ", i, " as a parent, but its Manager doesn't implement IViewManagerWithChildren"));
                    }
                }
                if (!a83.A02 || !a83.A0A.A03(A023)) {
                    A023.layout(i3, i4, i5 + i3, i6 + i4);
                    AnonymousClass0ZJ.A00(33554432, 1565728068);
                } else {
                    A0Z a0z = a83.A0A;
                    C228039ra.A00();
                    int id = A023.getId();
                    A0b a0b = (A0b) a0z.A03.get(id);
                    if (a0b != null) {
                        a0b.B8s(i3, i4, i5, i6);
                    } else {
                        if (A023.getWidth() == 0 || A023.getHeight() == 0) {
                            a0v = a0z.A04;
                        } else {
                            a0v = a0z.A06;
                        }
                        Animation A012 = a0v.A01(A023, i3, i4, i5, i6);
                        if (A012 instanceof A0b) {
                            A012.setAnimationListener(new A0a(a0z, id));
                        } else {
                            A023.layout(i3, i4, i5 + i3, i6 + i4);
                        }
                        if (A012 != null) {
                            long duration = A012.getDuration();
                            if (duration > a0z.A00) {
                                a0z.A00 = duration;
                                A0Z.A00(a0z, duration);
                            }
                            A023.startAnimation(A012);
                        }
                    }
                    AnonymousClass0ZJ.A00(33554432, 1565728068);
                }
            } catch (Throwable th) {
                AnonymousClass0ZJ.A00(33554432, 1553951607);
                throw th;
            }
        }
    }
}
