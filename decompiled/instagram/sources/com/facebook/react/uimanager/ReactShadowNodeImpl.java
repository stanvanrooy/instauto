package com.facebook.react.uimanager;

import com.facebook.catalyst.views.art.ARTGroupShadowNode;
import com.facebook.catalyst.views.art.ARTSurfaceViewShadowNode;
import com.facebook.catalyst.views.art.ARTVirtualNode;
import com.facebook.react.views.modal.ModalHostShadowNode;
import com.facebook.react.views.text.ReactRawTextShadowNode;
import com.facebook.react.views.text.ReactVirtualTextShadowNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p000X.A07;
import p000X.A86;
import p000X.A8A;
import p000X.A8I;
import p000X.A8K;
import p000X.A8M;
import p000X.A9F;
import p000X.A9N;
import p000X.A9Y;
import p000X.AD0;
import p000X.AD2;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0FY;
import p000X.C230099zE;
import p000X.C230349zs;
import p000X.C23053A3d;
import p000X.C23126A8e;

public class ReactShadowNodeImpl implements ReactShadowNode {
    public static final A9F A0N = A9Y.A00;
    public int A00;
    public int A01 = 0;
    public ReactShadowNodeImpl A02;
    public ReactShadowNodeImpl A03;
    public ReactShadowNodeImpl A04;
    public A8M A05;
    public ArrayList A06;
    public ArrayList A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public C23053A3d A0E;
    public Integer A0F;
    public Integer A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J = true;
    public final A07 A0K = new A07(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final float[] A0L = new float[9];
    public final boolean[] A0M = new boolean[9];

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    public static void A04(ReactShadowNodeImpl reactShadowNodeImpl) {
        A8M a8m;
        C23126A8e A002;
        float[] fArr;
        float[] fArr2;
        char c;
        float f;
        int i = 0;
        while (i <= 8) {
            if (i == 0 || i == 2 || i == 4 || i == 5) {
                fArr2 = reactShadowNodeImpl.A0L;
                if (C230349zs.A00(fArr2[i])) {
                    c = 6;
                    if (C230349zs.A00(fArr2[c])) {
                        f = fArr2[8];
                    }
                }
                if (reactShadowNodeImpl.A0M[i]) {
                    reactShadowNodeImpl.A05.setPaddingPercent(C23126A8e.A00(i), reactShadowNodeImpl.A0L[i]);
                    i++;
                } else {
                    a8m = reactShadowNodeImpl.A05;
                    A002 = C23126A8e.A00(i);
                    fArr = reactShadowNodeImpl.A0L;
                    a8m.setPadding(A002, fArr[i]);
                    i++;
                }
            } else if (i == 1 || i == 3) {
                fArr2 = reactShadowNodeImpl.A0L;
                if (C230349zs.A00(fArr2[i])) {
                    c = 7;
                    if (C230349zs.A00(fArr2[c])) {
                    }
                }
                if (reactShadowNodeImpl.A0M[i]) {
                }
            } else {
                f = reactShadowNodeImpl.A0L[i];
            }
            if (C230349zs.A00(f)) {
                a8m = reactShadowNodeImpl.A05;
                A002 = C23126A8e.A00(i);
                fArr = reactShadowNodeImpl.A0K.A02;
                a8m.setPadding(A002, fArr[i]);
                i++;
            }
            if (reactShadowNodeImpl.A0M[i]) {
            }
        }
    }

    public void A09(A8K a8k) {
    }

    public boolean A0A() {
        return false;
    }

    public boolean A0B() {
        return this instanceof ARTSurfaceViewShadowNode;
    }

    public boolean AiS() {
        if ((this instanceof ReactRawTextShadowNode) || (this instanceof ReactVirtualTextShadowNode)) {
            return true;
        }
        if ((this instanceof ARTSurfaceViewShadowNode) || !(this instanceof ARTVirtualNode)) {
            return false;
        }
        boolean z = ((ARTVirtualNode) this) instanceof ARTGroupShadowNode;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r2.hasNewLayout() == false) goto L_0x000e;
     */
    public final void Aoh() {
        boolean z;
        this.A0J = false;
        A8M a8m = this.A05;
        if (a8m != null) {
            z = true;
        }
        z = false;
        if (z && a8m != null) {
            a8m.markLayoutSeen();
        }
    }

    public void At9(A8I a8i) {
    }

    public void Bih(Object obj) {
    }

    static {
        if (A9Y.A00 == null) {
            AD2 ad2 = new AD2();
            A9Y.A00 = ad2;
            ad2.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A9Y.A00.A01(true);
        }
    }

    /* renamed from: A05 */
    public final ReactShadowNodeImpl AI2(int i) {
        ArrayList arrayList = this.A06;
        if (arrayList != null) {
            return (ReactShadowNodeImpl) arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A06("Index ", i, " out of bounds: node has no children"));
    }

    public void A06() {
        if (!this.A0J) {
            this.A0J = true;
            ReactShadowNodeImpl reactShadowNodeImpl = this.A04;
            if (reactShadowNodeImpl != null) {
                reactShadowNodeImpl.A06();
            }
        }
    }

    public void A07(int i, float f) {
        this.A0L[i] = f;
        this.A0M[i] = false;
        A04(this);
    }

    public void A08(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        if (this.A06 == null) {
            this.A06 = new ArrayList(4);
        }
        this.A06.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.A04 = this;
        A8M a8m = this.A05;
        if (a8m != null && !A0C()) {
            A8M a8m2 = reactShadowNodeImpl.A05;
            if (a8m2 != null) {
                a8m.addChildAt(a8m2, i);
            } else {
                throw new RuntimeException(AnonymousClass000.A0O("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '", reactShadowNodeImpl.toString(), "' to a '", toString(), "')"));
            }
        }
        A06();
        int A022 = reactShadowNodeImpl.A02();
        this.A01 += A022;
        A03(A022);
    }

    public boolean A0C() {
        return this.A05.isMeasureDefined();
    }

    public /* bridge */ /* synthetic */ void A2m(ReactShadowNode reactShadowNode, int i) {
        if (!(this instanceof ModalHostShadowNode)) {
            A08((ReactShadowNodeImpl) reactShadowNode, i);
        } else {
            ((ModalHostShadowNode) this).A08((ReactShadowNodeImpl) reactShadowNode, i);
        }
    }

    public final /* bridge */ /* synthetic */ void A3c(ReactShadowNode reactShadowNode, int i) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        boolean z = true;
        boolean z2 = false;
        if (AQg() == Constants.ZERO) {
            z2 = true;
        }
        AnonymousClass0FY.A02(z2);
        if (reactShadowNodeImpl.AQg() == Constants.A0C) {
            z = false;
        }
        AnonymousClass0FY.A02(z);
        if (this.A07 == null) {
            this.A07 = new ArrayList(4);
        }
        this.A07.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.A03 = this;
    }

    public final void A7J() {
        A7K(Float.NaN, Float.NaN);
    }

    public final void A7K(float f, float f2) {
        this.A05.calculateLayout(f, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r4.hasNewLayout() == false) goto L_0x0016;
     */
    public final boolean ACI(float f, float f2, A8K a8k, A8I a8i) {
        boolean z;
        A8K a8k2 = a8k;
        if (this.A0J) {
            A09(a8k2);
        }
        A8M a8m = this.A05;
        if (a8m != null) {
            z = true;
        }
        z = false;
        boolean z2 = false;
        if (z) {
            float AOr = AOr();
            float AOs = AOs();
            float f3 = f + AOr;
            int round = Math.round(f3);
            float f4 = f2 + AOs;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + a8m.getLayoutWidth());
            int round4 = Math.round(f4 + a8m.getLayoutHeight());
            int round5 = Math.round(AOr);
            int round6 = Math.round(AOs);
            int i = round3 - round;
            int i2 = round4 - round2;
            if (!(round5 == this.A0C && round6 == this.A0D && i == this.A0B && i2 == this.A0A)) {
                z2 = true;
            }
            this.A0C = round5;
            this.A0D = round6;
            this.A0B = i;
            this.A0A = i2;
            if (z2) {
                A8I a8i2 = a8i;
                if (a8i != null) {
                    A8I.A00(a8i2, this);
                } else {
                    a8k2.A0F.add(new A86(a8k2, this.A04.ATb(), ATb(), AVE(), AVF(), AVD(), AVC()));
                    return z2;
                }
            }
        }
        return z2;
    }

    public final int AI5() {
        ArrayList arrayList = this.A06;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final /* bridge */ /* synthetic */ ReactShadowNode AOp() {
        ReactShadowNodeImpl reactShadowNodeImpl = this.A02;
        if (reactShadowNodeImpl == null) {
            return this.A03;
        }
        return reactShadowNodeImpl;
    }

    public final float AOr() {
        return this.A05.getLayoutX();
    }

    public final float AOs() {
        return this.A05.getLayoutY();
    }

    public final int AQf() {
        ArrayList arrayList = this.A07;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final /* bridge */ /* synthetic */ int AQh(ReactShadowNode reactShadowNode) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= AI5()) {
                break;
            }
            ReactShadowNodeImpl A052 = AI2(i);
            if (reactShadowNodeImpl == A052) {
                z = true;
                break;
            }
            i2 += A052.A02();
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException(AnonymousClass000.A07("Child ", reactShadowNodeImpl.ATb(), " was not a child of ", this.A00));
    }

    public final int AUi() {
        boolean z = false;
        if (this.A09 != 0) {
            z = true;
        }
        AnonymousClass0FY.A02(z);
        return this.A09;
    }

    public final C23053A3d AY1() {
        C23053A3d a3d = this.A0E;
        AnonymousClass0FY.A00(a3d);
        return a3d;
    }

    public final String AaL() {
        String str = this.A0H;
        AnonymousClass0FY.A00(str);
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r2.isDirty() == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2.hasNewLayout() == false) goto L_0x000f;
     */
    public final boolean AcO() {
        boolean z;
        boolean z2;
        if (!this.A0J) {
            A8M a8m = this.A05;
            if (a8m != null) {
                z = true;
            }
            z = false;
            if (!z) {
                if (a8m != null) {
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int Ad0(ReactShadowNode reactShadowNode) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ArrayList arrayList = this.A06;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(reactShadowNodeImpl);
    }

    public final /* bridge */ /* synthetic */ int Ad2(ReactShadowNode reactShadowNode) {
        AnonymousClass0FY.A00(this.A07);
        return this.A07.indexOf((ReactShadowNodeImpl) reactShadowNode);
    }

    public final /* bridge */ /* synthetic */ boolean Af0(ReactShadowNode reactShadowNode) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        for (ReactShadowNodeImpl reactShadowNodeImpl2 = this.A04; reactShadowNodeImpl2 != null; reactShadowNodeImpl2 = reactShadowNodeImpl2.A04) {
            if (reactShadowNodeImpl2 == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    public final void Baj() {
        ArrayList arrayList = this.A07;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ReactShadowNodeImpl) this.A07.get(size)).A03 = null;
            }
            this.A07.clear();
        }
    }

    public final /* bridge */ /* synthetic */ ReactShadowNode Bap(int i) {
        ArrayList arrayList = this.A06;
        if (arrayList != null) {
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) arrayList.remove(i);
            reactShadowNodeImpl.A04 = null;
            A8M a8m = this.A05;
            if (a8m != null && !A0C()) {
                a8m.removeChildAt(i);
            }
            A06();
            int A022 = reactShadowNodeImpl.A02();
            this.A01 -= A022;
            A03(-A022);
            return reactShadowNodeImpl;
        }
        throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A06("Index ", i, " out of bounds: node has no children"));
    }

    public final /* bridge */ /* synthetic */ ReactShadowNode BbC(int i) {
        AnonymousClass0FY.A00(this.A07);
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) this.A07.remove(i);
        reactShadowNodeImpl.A03 = null;
        return reactShadowNodeImpl;
    }

    public final void BiA(boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        if (this.A04 == null) {
            z3 = true;
        }
        AnonymousClass0FY.A03(z3, "Must remove from no opt parent first");
        boolean z4 = false;
        if (this.A03 == null) {
            z4 = true;
        }
        AnonymousClass0FY.A03(z4, "Must remove from native parent first");
        if (AQf() != 0) {
            z2 = false;
        }
        AnonymousClass0FY.A03(z2, "Must remove all native children first");
        this.A0I = z;
    }

    public final /* bridge */ /* synthetic */ void BiR(ReactShadowNode reactShadowNode) {
        this.A02 = (ReactShadowNodeImpl) reactShadowNode;
    }

    public final void Bkn(float f) {
        this.A05.setHeight(f);
    }

    public final void Bko(float f) {
        this.A05.setWidth(f);
    }

    public void dispose() {
        A8M a8m = this.A05;
        if (a8m != null) {
            a8m.reset();
            A9N.A00().BaL(this.A05);
        }
    }

    public void setFlex(float f) {
        this.A05.setFlex(f);
    }

    public void setFlexGrow(float f) {
        this.A05.setFlexGrow(f);
    }

    public void setFlexShrink(float f) {
        this.A05.setFlexShrink(f);
    }

    public String toString() {
        return AnonymousClass000.A0L("[", this.A0H, " ", ATb(), "]");
    }

    public ReactShadowNodeImpl() {
        if (!AiS()) {
            A8M a8m = (A8M) A9N.A00().A2N();
            a8m = a8m == null ? new AD0(A0N) : a8m;
            this.A05 = a8m;
            a8m.setData(this);
            Arrays.fill(this.A0L, Float.NaN);
            return;
        }
        this.A05 = null;
    }

    private int A02() {
        Integer AQg = AQg();
        if (AQg == Constants.A0C) {
            return this.A01;
        }
        if (AQg == Constants.ONE) {
            return 1 + this.A01;
        }
        return 1;
    }

    private void A03(int i) {
        Integer AQg = AQg();
        Integer num = Constants.ZERO;
        if (AQg != num) {
            ReactShadowNodeImpl reactShadowNodeImpl = this.A04;
            while (reactShadowNodeImpl != null) {
                reactShadowNodeImpl.A01 += i;
                if (reactShadowNodeImpl.AQg() != num) {
                    reactShadowNodeImpl = reactShadowNodeImpl.A04;
                } else {
                    return;
                }
            }
        }
    }

    public Iterable A7L() {
        if (A0B()) {
            return null;
        }
        return this.A06;
    }

    public final void ABz() {
        if (!AiS()) {
            this.A05.dirty();
            return;
        }
        ReactShadowNodeImpl reactShadowNodeImpl = this.A04;
        if (reactShadowNodeImpl != null) {
            reactShadowNodeImpl.ABz();
        }
    }

    public final Integer AMr() {
        return this.A0F;
    }

    public final Integer AQg() {
        if (AiS() || Ag9()) {
            return Constants.A0C;
        }
        if (A0A()) {
            return Constants.ONE;
        }
        return Constants.ZERO;
    }

    public final /* bridge */ /* synthetic */ ReactShadowNode AQi() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ ReactShadowNode ARa() {
        return this.A04;
    }

    public final int ATb() {
        return this.A00;
    }

    public final int AVC() {
        return this.A0A;
    }

    public final int AVD() {
        return this.A0B;
    }

    public final int AVE() {
        return this.A0C;
    }

    public final int AVF() {
        return this.A0D;
    }

    public final Integer Aaj() {
        return this.A0G;
    }

    public final boolean Ag9() {
        return this.A0I;
    }

    public final void Bal() {
        if (AI5() != 0) {
            int i = 0;
            for (int AI5 = AI5() - 1; AI5 >= 0; AI5--) {
                A8M a8m = this.A05;
                if (a8m != null && !A0C()) {
                    a8m.removeChildAt(AI5);
                }
                ReactShadowNodeImpl A052 = AI2(AI5);
                A052.A04 = null;
                i += A052.A02();
                A052.dispose();
            }
            ArrayList arrayList = this.A06;
            AnonymousClass0FY.A00(arrayList);
            arrayList.clear();
            A06();
            this.A01 -= i;
            A03(-i);
        }
    }

    public final void Biq(int i, int i2) {
        this.A0G = Integer.valueOf(i);
        this.A0F = Integer.valueOf(i2);
    }

    public final boolean Bn7() {
        return this.A08;
    }

    public final void Bt0(C230099zE r5) {
        Class<?> cls = getClass();
        Map map = A8A.A00;
        ViewManagerPropertyUpdater$ShadowNodeSetter viewManagerPropertyUpdater$ShadowNodeSetter = (ViewManagerPropertyUpdater$ShadowNodeSetter) map.get(cls);
        if (viewManagerPropertyUpdater$ShadowNodeSetter == null) {
            viewManagerPropertyUpdater$ShadowNodeSetter = (ViewManagerPropertyUpdater$ShadowNodeSetter) A8A.A00(cls);
            if (viewManagerPropertyUpdater$ShadowNodeSetter == null) {
                viewManagerPropertyUpdater$ShadowNodeSetter = new ViewManagerPropertyUpdater$FallbackShadowNodeSetter(cls);
            }
            map.put(cls, viewManagerPropertyUpdater$ShadowNodeSetter);
        }
        Iterator entryIterator = r5.A00.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) entryIterator.next();
            viewManagerPropertyUpdater$ShadowNodeSetter.Bjr(this, (String) entry.getKey(), entry.getValue());
        }
    }

    public final void Bjz(int i) {
        this.A00 = i;
    }

    public final void BkG(int i) {
        this.A09 = i;
    }

    public void BlA(C23053A3d a3d) {
        this.A0E = a3d;
    }

    public final void Bln(String str) {
        this.A0H = str;
    }
}
