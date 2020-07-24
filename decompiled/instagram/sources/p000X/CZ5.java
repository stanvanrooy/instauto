package p000X;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.CZ5 */
public final class CZ5 implements C52312Oh {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public ViewTreeObserver.OnGlobalLayoutListener A0A;
    public boolean A0B;
    public boolean A0C;
    public final float A0D;
    public final Context A0E;
    public final CZA A0F;
    public final boolean A0G;
    public final float A0H;
    public final AnonymousClass1EA A0I = AnonymousClass1EA.A01(30.0d, 10.0d);
    public final CZP A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0043, code lost:
        if (r0 != false) goto L_0x0045;
     */
    public final boolean B0i(C60512k1 r8, float f, float f2) {
        boolean z;
        this.A0B = false;
        LinearLayout linearLayout = this.A0F.A03;
        Rect rect = new Rect();
        int[] iArr = new int[2];
        linearLayout.getDrawingRect(rect);
        linearLayout.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        int i = (int) f;
        int i2 = (int) f2;
        if (!rect.contains(i, i2)) {
            RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A0F.A09;
            Rect rect2 = new Rect();
            int[] iArr2 = new int[2];
            roundedCornerConstraintLayout.getDrawingRect(rect2);
            roundedCornerConstraintLayout.getLocationOnScreen(iArr2);
            rect2.offset(iArr2[0], iArr2[1]);
            boolean contains = rect2.contains(i, i2);
            z = false;
        }
        z = true;
        boolean z2 = !z;
        this.A0C = z2;
        if (!r8.A02() || !z2) {
            return false;
        }
        return true;
    }

    public final void B1B(C60512k1 r7, float f, float f2, float f3, float f4, float f5) {
        float f6 = f5;
        if (f5 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f2 < this.A07 || f2 < this.A0D) {
            C60512k1 r0 = r7;
            r0.A01(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A07, f4, f6, this.A0I);
            return;
        }
        CZ3.A01(this.A0J.A00);
    }

    public final boolean BNi(C60512k1 r2, float f, float f2) {
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 0, insn: 0x011d: IGET  (r1 I:X.CZA) = (r0 I:X.CZ5) X.CZ5.A0F X.CZA, block:B:15:0x011d
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:165)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:137)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public final void B13(
/*
Method generation error in method: X.CZ5.B13(X.2k1, float, float, float, boolean):void, dex: classes4.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1507)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    public final void BTR(C60512k1 r4) {
        boolean z;
        if ((this.A05 != 1.0f || this.A0F.A03.getTranslationY() < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) && (this.A05 >= 1.0f || this.A0F.A09.getScaleY() != this.A05)) {
            z = false;
        } else {
            z = true;
        }
        if ((z && !this.A0B) || (!this.A0B && this.A0C)) {
            CZ3.A01(this.A0J.A00);
        }
    }

    public CZ5(Context context, CZA cza, CZP czp, boolean z) {
        this.A0E = context;
        this.A0F = cza;
        this.A0J = czp;
        this.A09 = 0;
        this.A0G = z;
        this.A0H = (float) ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.A0D = -C06220Of.A03(this.A0E, 20);
    }

    public final boolean B1J(C60512k1 r3, float f, float f2, float f3, float f4, boolean z) {
        if (Math.abs(f2) <= this.A0H) {
            return false;
        }
        this.A0B = true;
        return true;
    }
}
