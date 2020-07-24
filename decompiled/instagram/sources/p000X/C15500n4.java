package p000X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.minscript.compiler.MinsCompilerImpl;

/* renamed from: X.0n4  reason: invalid class name and case insensitive filesystem */
public final class C15500n4 {
    public static C15500n4 A06;
    public final Context A00;
    public final C15490n3 A01;
    public final C15510n5 A02;
    public final C15350mp A03;
    public final C15440my A04;
    public final C15480n2 A05;

    public final void A05(C15550n9 r2, AnonymousClass2DG r3, FrameLayout frameLayout) {
        A03(this, r2, r3, frameLayout, true);
    }

    public static C15500n4 A00() {
        C15500n4 r0 = A06;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Can't find bloks instance. Is it initialized?");
    }

    public static C225029mU A01(C225019mS r1) {
        MinsCompilerImpl minsCompilerImpl = r1.A00;
        boolean z = false;
        if (minsCompilerImpl != null) {
            z = true;
        }
        if (!z) {
            return new C225029mU((MinsCompilerImpl) null);
        }
        if (minsCompilerImpl == null) {
            throw new IllegalStateException("MinScript is not enabled");
        } else if (minsCompilerImpl != null) {
            return new C225029mU(minsCompilerImpl);
        } else {
            throw null;
        }
    }

    public final AnonymousClass2DG A04(AnonymousClass2DA r2) {
        return new AnonymousClass2DG((AnonymousClass2D8) r2);
    }

    public C15500n4(Context context, C15440my r8, C15350mp r9, C15510n5 r10, C15490n3 r11, C15480n2 r12) {
        this.A00 = context;
        this.A04 = r8;
        this.A03 = r9;
        this.A02 = r10;
        this.A01 = r11;
        this.A05 = r12;
        int i = 0;
        Class[] clsArr = {C15370mr.class, C15400mu.class};
        while (i < 2) {
            Class cls = clsArr[i];
            if (this.A03.A00.containsKey(cls)) {
                i++;
            } else {
                throw new IllegalStateException("Missing parser support for type " + cls);
            }
        }
    }

    public static final void A02(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 0) {
            if (frameLayout.getChildCount() != 1) {
                throw new IllegalStateException("found more than one root view");
            } else if (((AnonymousClass2DG) frameLayout.getTag(C0003R.C0005id.bloks_tag_component_tree)) != null) {
                ((ADT) frameLayout.getChildAt(0)).setRenderState((ADR) null);
                frameLayout.setTag(C0003R.C0005id.bloks_tag_component_tree, (Object) null);
            } else {
                throw new IllegalStateException("Host view has a child but no tree to unbind");
            }
        }
        frameLayout.removeAllViews();
    }

    public static void A03(C15500n4 r6, C15550n9 r7, AnonymousClass2DG r8, FrameLayout frameLayout, boolean z) {
        if (frameLayout.getChildCount() == 0) {
            ADQ adq = ADQ.A00;
            Context context = frameLayout.getContext();
            if (context != null) {
                C51382Kl r2 = new C51382Kl(r7, r8, context);
                ADT adt = new ADT(context);
                adt.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                ADR adr = new ADR(context, r2, new C23221ADk(r8));
                adt.setRenderState(adr);
                adr.A02(new C23229ADs(r8.A02, r8.A01, r7));
                r8.A00 = new ADP(adq, adr, r8, r7);
                frameLayout.addView(adt);
                frameLayout.setTag(C0003R.C0005id.bloks_tag_component_tree, r8);
                return;
            }
            throw new IllegalArgumentException("Host view must have a context");
        } else if (frameLayout.getChildCount() == 1) {
            AnonymousClass2DG r0 = (AnonymousClass2DG) frameLayout.getTag(C0003R.C0005id.bloks_tag_component_tree);
            if (r0 == null) {
                throw new IllegalStateException("Host view has a child but no bound tree");
            } else if (r8 == r0) {
            } else {
                if (z) {
                    A02(frameLayout);
                    A03(r6, r7, r8, frameLayout, false);
                    return;
                }
                throw new IllegalStateException("binding to new component before unbinding");
            }
        } else {
            throw new IllegalStateException("found more than one root view");
        }
    }
}
