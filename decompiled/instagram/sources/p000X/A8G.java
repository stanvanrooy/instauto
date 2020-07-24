package p000X;

import android.os.SystemClock;
import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.SystraceMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.A8G */
public final class A8G {
    public long A00;
    public Object A01 = new Object();
    public final A44 A02;
    public final A8I A03;
    public final A8q A04;
    public final A8K A05;
    public final C23125A8d A06;
    public final A9C A07;
    public final int[] A08;

    public static void A05(A8G a8g, ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int[] iArr) {
        int i;
        int i2;
        if (reactShadowNode == reactShadowNode2 || reactShadowNode.AiS()) {
            i = 0;
            i2 = 0;
        } else {
            i = Math.round(reactShadowNode.AOr());
            i2 = Math.round(reactShadowNode.AOs());
            for (ReactShadowNode ARa = reactShadowNode.ARa(); ARa != reactShadowNode2; ARa = ARa.ARa()) {
                AnonymousClass0FY.A00(ARa);
                a8g.A00(ARa);
                i += Math.round(ARa.AOr());
                i2 += Math.round(ARa.AOs());
            }
            a8g.A00(reactShadowNode2);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = reactShadowNode.AVD();
        iArr[3] = reactShadowNode.AVC();
    }

    public A8G(A44 a44, C23125A8d a8d, A9C a9c, int i) {
        A8K a8k = new A8K(a44, new A83(a8d), i);
        A8q a8q = new A8q();
        this.A04 = a8q;
        this.A08 = new int[4];
        this.A00 = 0;
        this.A02 = a44;
        this.A06 = a8d;
        this.A05 = a8k;
        this.A03 = new A8I(a8k, a8q);
        this.A07 = a9c;
    }

    private void A00(ReactShadowNode reactShadowNode) {
        ViewManager A002 = this.A06.A00(reactShadowNode.AaL());
        AnonymousClass0FY.A00(A002);
        if (A002 instanceof A9Z) {
            A9Z a9z = (A9Z) A002;
            if (a9z != null && a9z.needsCustomLayoutForChildren()) {
                throw new A0i(AnonymousClass000.A0J("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (", reactShadowNode.AaL(), "). Use measure instead."));
            }
            return;
        }
        throw new A0i(AnonymousClass000.A0J("Trying to use view ", reactShadowNode.AaL(), " as a parent, but its Manager doesn't extends ViewGroupManager"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1.A0G.isEmpty() == false) goto L_0x0013;
     */
    public static void A03(A8G a8g) {
        boolean z;
        A8K a8k = a8g.A05;
        if (a8k.A0F.isEmpty()) {
            z = true;
        }
        z = false;
        if (z) {
            a8g.A06(-1);
        }
    }

    public static void A04(A8G a8g, int i, String str) {
        if (a8g.A04.A00(i) == null) {
            throw new A0i("Unable to execute operation " + str + " on view with " + "tag: " + i + ", since the view does not exists");
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A06(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long uptimeMillis;
        float f;
        C08750Yk A022 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIImplementation.dispatchViewUpdates");
        int i2 = i;
        A022.A00("batchId", i2);
        A022.A02();
        long uptimeMillis2 = SystemClock.uptimeMillis();
        try {
            AnonymousClass0ZJ.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIImplementation.updateViewHierarchy", -2076598530);
            int i3 = 0;
            while (true) {
                try {
                    A8q a8q = this.A04;
                    a8q.A02.A00();
                    if (i3 >= a8q.A01.size()) {
                        break;
                    }
                    A8q a8q2 = this.A04;
                    a8q2.A02.A00();
                    ReactShadowNode A002 = this.A04.A00(a8q2.A01.keyAt(i3));
                    if (!(A002.Aaj() == null || A002.AMr() == null)) {
                        C08750Yk A023 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIImplementation.notifyOnBeforeLayoutRecursive");
                        A023.A00("rootTag", A002.ATb());
                        A023.A02();
                        A01(A002);
                        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 2053787268);
                        C08750Yk A024 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "cssRoot.calculateLayout");
                        A024.A00("rootTag", A002.ATb());
                        A024.A02();
                        uptimeMillis = SystemClock.uptimeMillis();
                        int intValue = A002.Aaj().intValue();
                        int intValue2 = A002.AMr().intValue();
                        float f2 = Float.NaN;
                        if (View.MeasureSpec.getMode(intValue) == 0) {
                            f = Float.NaN;
                        } else {
                            f = (float) View.MeasureSpec.getSize(intValue);
                        }
                        if (View.MeasureSpec.getMode(intValue2) != 0) {
                            f2 = (float) View.MeasureSpec.getSize(intValue2);
                        }
                        A002.A7K(f, f2);
                        AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1038463381);
                        this.A00 = SystemClock.uptimeMillis() - uptimeMillis;
                        C08750Yk A025 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIImplementation.applyUpdatesRecursive");
                        A025.A00("rootTag", A002.ATb());
                        A025.A02();
                        try {
                            A08(A002, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -459719830);
                        } catch (Throwable th) {
                            th = th;
                            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 853945950);
                            throw th;
                        }
                    }
                    i3++;
                } catch (Throwable th2) {
                    AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -872687533);
                    throw th2;
                }
            }
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -116617015);
            this.A03.A00.clear();
            A8K a8k = this.A05;
            long j = this.A00;
            C08750Yk A026 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIViewOperationQueue.dispatchViewUpdates");
            A026.A00("batchId", i2);
            A026.A02();
            long uptimeMillis3 = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            ArrayDeque arrayDeque = null;
            if (!a8k.A0G.isEmpty()) {
                arrayList = a8k.A0G;
                a8k.A0G = new ArrayList();
            } else {
                arrayList = null;
            }
            if (!a8k.A0F.isEmpty()) {
                arrayList2 = a8k.A0F;
                a8k.A0F = new ArrayList();
            } else {
                arrayList2 = null;
            }
            synchronized (a8k.A0O) {
                try {
                    if (!a8k.A0D.isEmpty()) {
                        arrayDeque = a8k.A0D;
                        a8k.A0D = new ArrayDeque();
                    }
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                    }
                    throw th;
                }
            }
            A9W a9w = a8k.A0C;
            if (a9w != null) {
                a9w.BVi();
            }
            A8L a8l = new A8L(a8k, i2, arrayList, arrayDeque, arrayList2, uptimeMillis2, j, uptimeMillis3, currentThreadTimeMillis);
            C08750Yk A027 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "acquiring mDispatchRunnablesLock");
            A027.A00("batchId", i2);
            A027.A02();
            synchronized (a8k.A0N) {
                try {
                    AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 477058621);
                    a8k.A0E.add(a8l);
                } catch (Throwable th4) {
                    while (true) {
                        th = th4;
                        break;
                    }
                }
            }
            if (!a8k.A0H) {
                C228039ra.A01(new A98(a8k, a8k.A0K));
            }
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1983923452);
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 221929086);
            return;
            throw th;
        } catch (Throwable th5) {
            AnonymousClass0ZJ.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 916237250);
            throw th5;
        }
    }

    public final void A07(int i, A1e a1e, A1e a1e2, A1e a1e3, A1e a1e4, A1e a1e5) {
        int i2;
        int size;
        int size2;
        A0i a0i;
        boolean z;
        synchronized (this.A01) {
            int i3 = i;
            ReactShadowNode A002 = this.A04.A00(i3);
            A1e a1e6 = a1e;
            if (a1e == null) {
                i2 = 0;
            } else {
                i2 = a1e6.size();
            }
            A1e a1e7 = a1e3;
            if (a1e3 == null) {
                size = 0;
            } else {
                size = a1e7.size();
            }
            A1e a1e8 = a1e5;
            if (a1e5 == null) {
                size2 = 0;
            } else {
                size2 = a1e8.size();
            }
            A1e a1e9 = a1e2;
            if (i2 == 0 || (a1e2 != null && i2 == a1e9.size())) {
                A1e a1e10 = a1e4;
                if (size == 0 || (a1e4 != null && size == a1e10.size())) {
                    int i4 = i2 + size;
                    A8r[] a8rArr = new A8r[i4];
                    int i5 = i2 + size2;
                    int[] iArr = new int[i5];
                    int i6 = i5;
                    int[] iArr2 = new int[i5];
                    int[] iArr3 = new int[size2];
                    if (i2 > 0) {
                        AnonymousClass0FY.A00(a1e6);
                        AnonymousClass0FY.A00(a1e9);
                        for (int i7 = 0; i7 < i2; i7++) {
                            int i8 = a1e6.getInt(i7);
                            int ATb = A002.AI2(i8).ATb();
                            a8rArr[i7] = new A8r(ATb, a1e9.getInt(i7));
                            iArr[i7] = i8;
                            iArr2[i7] = ATb;
                        }
                    }
                    if (size > 0) {
                        AnonymousClass0FY.A00(a1e7);
                        AnonymousClass0FY.A00(a1e10);
                        for (int i9 = 0; i9 < size; i9++) {
                            a8rArr[i2 + i9] = new A8r(a1e7.getInt(i9), a1e10.getInt(i9));
                        }
                    }
                    if (size2 > 0) {
                        AnonymousClass0FY.A00(a1e8);
                        for (int i10 = 0; i10 < size2; i10++) {
                            int i11 = a1e8.getInt(i10);
                            int ATb2 = A002.AI2(i11).ATb();
                            int i12 = i2 + i10;
                            iArr[i12] = i11;
                            iArr2[i12] = ATb2;
                            iArr3[i10] = ATb2;
                        }
                    }
                    Arrays.sort(a8rArr, A8r.A02);
                    Arrays.sort(iArr);
                    int i13 = i5 - 1;
                    int i14 = -1;
                    while (true) {
                        if (i13 >= 0) {
                            int i15 = iArr[i13];
                            if (i15 == i14) {
                                a0i = new A0i(AnonymousClass000.A05("Repeated indices in Removal list for view tag: ", i3));
                                break;
                            }
                            A002.Bap(i15);
                            i14 = iArr[i13];
                            i13--;
                        } else {
                            int i16 = 0;
                            while (i16 < i4) {
                                A8r a8r = a8rArr[i16];
                                ReactShadowNode A003 = this.A04.A00(a8r.A01);
                                if (A003 != null) {
                                    A002.A2m(A003, a8r.A00);
                                    i16++;
                                } else {
                                    a0i = new A0i(AnonymousClass000.A05("Trying to add unknown view tag: ", a8r.A01));
                                }
                            }
                            A8I a8i = this.A03;
                            for (int i17 = 0; i17 < i6; i17++) {
                                int i18 = iArr2[i17];
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= size2) {
                                        z = false;
                                        break;
                                    }
                                    int i20 = iArr3[i19];
                                    i19++;
                                    if (i20 == i18) {
                                        z = true;
                                        break;
                                    }
                                }
                                A8I.A03(a8i, a8i.A01.A00(i18), z);
                            }
                            for (int i21 = 0; i21 < i4; i21++) {
                                A8r a8r2 = a8rArr[i21];
                                A8I.A01(a8i, A002, a8i.A01.A00(a8r2.A01), a8r2.A00);
                            }
                            for (int i22 = 0; i22 < size2; i22++) {
                                ReactShadowNode A004 = this.A04.A00(iArr3[i22]);
                                A02(A004);
                                A004.dispose();
                            }
                        }
                    }
                } else {
                    a0i = new A0i("Size of addChildTags != size of addAtIndices!");
                }
            } else {
                a0i = new A0i("Size of moveFrom != size of moveTo!");
            }
            throw a0i;
        }
    }

    private void A01(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.AcO()) {
            for (int i = 0; i < reactShadowNode.AI5(); i++) {
                A01(reactShadowNode.AI2(i));
            }
            reactShadowNode.At9(this.A03);
        }
    }

    private void A02(ReactShadowNode reactShadowNode) {
        reactShadowNode.Baj();
        A8q a8q = this.A04;
        int ATb = reactShadowNode.ATb();
        a8q.A02.A00();
        if (!a8q.A01.get(ATb)) {
            a8q.A00.remove(ATb);
            for (int AI5 = reactShadowNode.AI5() - 1; AI5 >= 0; AI5--) {
                A02(reactShadowNode.AI2(AI5));
            }
            reactShadowNode.Bal();
            return;
        }
        throw new A0i(AnonymousClass000.A06("Trying to remove root node ", ATb, " without using removeRootNode!"));
    }

    public final void A08(ReactShadowNode reactShadowNode, float f, float f2) {
        if (reactShadowNode.AcO()) {
            Iterable<ReactShadowNode> A7L = reactShadowNode.A7L();
            if (A7L != null) {
                for (ReactShadowNode A082 : A7L) {
                    A08(A082, reactShadowNode.AOr() + f, reactShadowNode.AOs() + f2);
                }
            }
            int ATb = reactShadowNode.ATb();
            A8q a8q = this.A04;
            a8q.A02.A00();
            if (!a8q.A01.get(ATb) && reactShadowNode.ACI(f, f2, this.A05, this.A03) && reactShadowNode.Bn7()) {
                this.A07.ACG(C228159rq.A00(ATb, reactShadowNode.AVE(), reactShadowNode.AVF(), reactShadowNode.AVD(), reactShadowNode.AVC()));
            }
            reactShadowNode.Aoh();
        }
    }
}
