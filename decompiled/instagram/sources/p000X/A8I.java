package p000X;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ReactShadowNode;

/* renamed from: X.A8I */
public final class A8I {
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final A8q A01;
    public final A8K A02;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x005c, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x005c, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r1 != 0.0d) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ec, code lost:
        if (r0 != 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        if (r4.getInt("backgroundColor") != 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
        if (r14.equals("borderRadius") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013a, code lost:
        if (r14.equals("borderWidth") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0144, code lost:
        if (r14.equals("overflow") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014e, code lost:
        if (r14.equals("borderLeftWidth") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0158, code lost:
        if (r14.equals("borderLeftColor") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0162, code lost:
        if (r14.equals("opacity") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x016c, code lost:
        if (r14.equals("borderBottomWidth") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0176, code lost:
        if (r14.equals("borderBottomColor") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0180, code lost:
        if (r14.equals("borderTopWidth") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018a, code lost:
        if (r14.equals("borderTopColor") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0194, code lost:
        if (r14.equals("borderRightWidth") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019e, code lost:
        if (r14.equals("borderRightColor") == false) goto L_0x007c;
     */
    public static boolean A07(C230099zE r21) {
        char c;
        String string;
        String str;
        int i;
        double d;
        C230099zE r3 = r21;
        if (r21 != null) {
            if (r3.A00.hasKey("collapsable")) {
                boolean z = true;
                if (!r3.A00.isNull("collapsable")) {
                    z = r3.A00.getBoolean("collapsable");
                }
                if (!z) {
                    return false;
                }
            }
            ReadableMapKeySetIterator keySetIterator = r3.A00.keySetIterator();
            while (keySetIterator.Aby()) {
                C23043A0y a0y = r3.A00;
                String Aq1 = keySetIterator.Aq1();
                boolean z2 = true;
                if (!A8X.A00.contains(Aq1)) {
                    if ("pointerEvents".equals(Aq1)) {
                        string = a0y.getString(Aq1);
                        if (!"auto".equals(string)) {
                            str = "box-none";
                        } else {
                            continue;
                        }
                    } else {
                        switch (Aq1.hashCode()) {
                            case -1989576717:
                                c = 3;
                                break;
                            case -1971292586:
                                c = 9;
                                break;
                            case -1470826662:
                                c = 4;
                                break;
                            case -1452542531:
                                c = 8;
                                break;
                            case -1308858324:
                                c = 5;
                                break;
                            case -1290574193:
                                c = 10;
                                break;
                            case -1267206133:
                                c = 0;
                                break;
                            case -242276144:
                                c = 2;
                                break;
                            case -223992013:
                                c = 7;
                                break;
                            case 529642498:
                                c = 11;
                                break;
                            case 741115130:
                                c = 6;
                                break;
                            case 1349188574:
                                c = 1;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                if (a0y.isNull("opacity")) {
                                    continue;
                                } else if (a0y.getDouble("opacity") == 1.0d) {
                                    continue;
                                }
                            case 1:
                                if (a0y.hasKey("backgroundColor")) {
                                    break;
                                }
                                if (!a0y.hasKey("borderWidth")) {
                                    continue;
                                } else if (a0y.isNull("borderWidth")) {
                                    continue;
                                } else if (a0y.getDouble("borderWidth") == 0.0d) {
                                    continue;
                                }
                            case 2:
                                if (!a0y.isNull("borderLeftColor")) {
                                    i = a0y.getInt("borderLeftColor");
                                }
                                z2 = false;
                                continue;
                            case 3:
                                if (!a0y.isNull("borderRightColor")) {
                                    i = a0y.getInt("borderRightColor");
                                }
                                z2 = false;
                                continue;
                            case 4:
                                if (!a0y.isNull("borderTopColor")) {
                                    i = a0y.getInt("borderTopColor");
                                }
                                z2 = false;
                                continue;
                            case 5:
                                if (!a0y.isNull("borderBottomColor")) {
                                    i = a0y.getInt("borderBottomColor");
                                }
                                z2 = false;
                                continue;
                            case 6:
                                if (!a0y.isNull("borderWidth")) {
                                    d = a0y.getDouble("borderWidth");
                                } else {
                                    continue;
                                }
                            case 7:
                                if (!a0y.isNull("borderLeftWidth")) {
                                    d = a0y.getDouble("borderLeftWidth");
                                } else {
                                    continue;
                                }
                            case 8:
                                if (!a0y.isNull("borderTopWidth")) {
                                    d = a0y.getDouble("borderTopWidth");
                                } else {
                                    continue;
                                }
                            case 9:
                                if (!a0y.isNull("borderRightWidth")) {
                                    d = a0y.getDouble("borderRightWidth");
                                } else {
                                    continue;
                                }
                            case 10:
                                if (!a0y.isNull("borderBottomWidth")) {
                                    d = a0y.getDouble("borderBottomWidth");
                                } else {
                                    continue;
                                }
                            case C120125Dh.VIEW_TYPE_BANNER:
                                if (!a0y.isNull("overflow")) {
                                    string = a0y.getString("overflow");
                                    str = "visible";
                                } else {
                                    continue;
                                }
                        }
                    }
                    if (str.equals(string)) {
                        continue;
                    }
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    return false;
                }
            }
        }
        return true;
    }

    public A8I(A8K a8k, A8q a8q) {
        this.A02 = a8k;
        this.A01 = a8q;
    }

    public static void A00(A8I a8i, ReactShadowNode reactShadowNode) {
        int ATb = reactShadowNode.ATb();
        if (!a8i.A00.get(ATb)) {
            a8i.A00.put(ATb, true);
            ReactShadowNode ARa = reactShadowNode.ARa();
            int AVE = reactShadowNode.AVE();
            int AVF = reactShadowNode.AVF();
            while (ARa != null && ARa.AQg() != Constants.ZERO) {
                if (!ARa.AiS()) {
                    AVE += Math.round(ARa.AOr());
                    AVF += Math.round(ARa.AOs());
                }
                ARa = ARa.ARa();
            }
            a8i.A04(reactShadowNode, AVE, AVF);
        }
    }

    public static void A01(A8I a8i, ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        A9I a9i;
        int AQh = reactShadowNode.AQh(reactShadowNode.AI2(i));
        Integer AQg = reactShadowNode.AQg();
        Integer num = Constants.ZERO;
        if (AQg != num) {
            while (true) {
                Integer AQg2 = reactShadowNode.AQg();
                if (AQg2 == num) {
                    a9i = new A9I(reactShadowNode, AQh);
                    break;
                }
                ReactShadowNode ARa = reactShadowNode.ARa();
                if (ARa == null) {
                    a9i = null;
                    break;
                }
                int i2 = 0;
                if (AQg2 == Constants.ONE) {
                    i2 = 1;
                }
                AQh = AQh + i2 + ARa.AQh(reactShadowNode);
                reactShadowNode = ARa;
            }
            if (a9i != null) {
                reactShadowNode = a9i.A01;
                AQh = a9i.A00;
            } else {
                return;
            }
        }
        if (reactShadowNode2.AQg() != Constants.A0C) {
            a8i.A06(reactShadowNode, reactShadowNode2, AQh);
        } else {
            a8i.A05(reactShadowNode, reactShadowNode2, AQh);
        }
    }

    public static void A02(A8I a8i, ReactShadowNode reactShadowNode, C230099zE r9) {
        ReactShadowNode ARa = reactShadowNode.ARa();
        if (ARa == null) {
            reactShadowNode.BiA(false);
            return;
        }
        int Ad0 = ARa.Ad0(reactShadowNode);
        ARa.Bap(Ad0);
        A03(a8i, reactShadowNode, false);
        reactShadowNode.BiA(false);
        a8i.A02.A01(reactShadowNode.AY1(), reactShadowNode.ATb(), reactShadowNode.AaL(), r9);
        ARa.A2m(reactShadowNode, Ad0);
        A01(a8i, ARa, reactShadowNode, Ad0);
        for (int i = 0; i < reactShadowNode.AI5(); i++) {
            A01(a8i, reactShadowNode, reactShadowNode.AI2(i), i);
        }
        boolean z = true;
        if (a8i.A00.size() != 0) {
            z = false;
        }
        AnonymousClass0FY.A02(z);
        A00(a8i, reactShadowNode);
        for (int i2 = 0; i2 < reactShadowNode.AI5(); i2++) {
            A00(a8i, reactShadowNode.AI2(i2));
        }
        a8i.A00.clear();
    }

    public static void A03(A8I a8i, ReactShadowNode reactShadowNode, boolean z) {
        if (reactShadowNode.AQg() != Constants.ZERO) {
            for (int AI5 = reactShadowNode.AI5() - 1; AI5 >= 0; AI5--) {
                A03(a8i, reactShadowNode.AI2(AI5), z);
            }
        }
        ReactShadowNode AQi = reactShadowNode.AQi();
        if (AQi != null) {
            int Ad2 = AQi.Ad2(reactShadowNode);
            AQi.BbC(Ad2);
            A8K a8k = a8i.A02;
            a8k.A0F.add(new A84(a8k, AQi.ATb(), new int[]{Ad2}, (A8r[]) null, z ? new int[]{reactShadowNode.ATb()} : null));
        }
    }

    private void A04(ReactShadowNode reactShadowNode, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (reactShadowNode.AQg() == Constants.A0C || reactShadowNode.AQi() == null) {
            for (int i5 = 0; i5 < reactShadowNode.AI5(); i5++) {
                ReactShadowNode AI2 = reactShadowNode.AI2(i5);
                int ATb = AI2.ATb();
                if (!this.A00.get(ATb)) {
                    this.A00.put(ATb, true);
                    A04(AI2, AI2.AVE() + i, AI2.AVF() + i2);
                }
            }
            return;
        }
        int ATb2 = reactShadowNode.ATb();
        A8K a8k = this.A02;
        a8k.A0F.add(new A86(a8k, reactShadowNode.AOp().ATb(), ATb2, i3, i4, reactShadowNode.AVD(), reactShadowNode.AVC()));
    }

    private void A05(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        boolean z = false;
        if (reactShadowNode2.AQg() != Constants.ZERO) {
            z = true;
        }
        AnonymousClass0FY.A02(z);
        for (int i2 = 0; i2 < reactShadowNode2.AI5(); i2++) {
            ReactShadowNode AI2 = reactShadowNode2.AI2(i2);
            boolean z2 = false;
            if (AI2.AQi() == null) {
                z2 = true;
            }
            AnonymousClass0FY.A02(z2);
            int AQf = reactShadowNode.AQf();
            if (AI2.AQg() == Constants.A0C) {
                A05(reactShadowNode, AI2, i);
            } else {
                A06(reactShadowNode, AI2, i);
            }
            i += reactShadowNode.AQf() - AQf;
        }
    }

    private void A06(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        reactShadowNode.A3c(reactShadowNode2, i);
        A8K a8k = this.A02;
        a8k.A0F.add(new A84(a8k, reactShadowNode.ATb(), (int[]) null, new A8r[]{new A8r(reactShadowNode2.ATb(), i)}, (int[]) null));
        if (reactShadowNode2.AQg() != Constants.ZERO) {
            A05(reactShadowNode, reactShadowNode2, i + 1);
        }
    }
}
