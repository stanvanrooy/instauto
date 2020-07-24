package p000X;

import android.util.SparseArray;
import com.facebook.react.animated.EventAnimationDriver;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.AB3 */
public final class AB3 {
    public int A00 = 0;
    public int A01 = 0;
    public final SparseArray A02 = new SparseArray();
    public final SparseArray A03 = new SparseArray();
    public final SparseArray A04 = new SparseArray();
    public final A44 A05;
    public final List A06 = new LinkedList();
    public final Map A07 = new HashMap();
    public final A9X A08;

    public static void A00(AB3 ab3, ABX abx) {
        int i = 0;
        while (i < ab3.A02.size()) {
            ABK abk = (ABK) ab3.A02.valueAt(i);
            if (abx.equals(abk.A01)) {
                if (abk.A02 != null) {
                    C228259s1 A032 = C23041A0r.A03();
                    A032.putBoolean("finished", false);
                    abk.A02.invoke(A032);
                }
                ab3.A02.removeAt(i);
                i--;
            }
            i++;
        }
    }

    public static void A01(AB3 ab3, C23091A6e a6e) {
        if (!ab3.A07.isEmpty()) {
            A9X a9x = ab3.A08;
            String A012 = a6e.A01();
            Map map = (Map) a9x.A00.mCustomDirectEvents.get(A012);
            if (map != null) {
                A012 = (String) map.get("registrationName");
            }
            List<EventAnimationDriver> list = (List) ab3.A07.get(AnonymousClass000.A00(a6e.A01, A012));
            if (list != null) {
                for (EventAnimationDriver eventAnimationDriver : list) {
                    A00(ab3, eventAnimationDriver.mValueNode);
                    a6e.A05(eventAnimationDriver);
                    ab3.A06.add(eventAnimationDriver.mValueNode);
                }
                A02(ab3, ab3.A06);
                ab3.A06.clear();
            }
        }
    }

    public static void A02(AB3 ab3, List list) {
        ABP abp;
        C23180ABi aBi;
        IllegalArgumentException illegalArgumentException;
        double d;
        IllegalArgumentException illegalArgumentException2;
        int i;
        AB3 ab32 = ab3;
        int i2 = ab32.A00 + 1;
        ab32.A00 = i2;
        if (i2 == 0) {
            ab32.A00 = 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            ABX abx = (ABX) it.next();
            int i4 = abx.A01;
            int i5 = ab32.A00;
            if (i4 != i5) {
                abx.A01 = i5;
                i3++;
                arrayDeque.add(abx);
            }
        }
        while (!arrayDeque.isEmpty()) {
            ABX abx2 = (ABX) arrayDeque.poll();
            if (abx2.A03 != null) {
                for (int i6 = 0; i6 < abx2.A03.size(); i6++) {
                    ABX abx3 = (ABX) abx2.A03.get(i6);
                    abx3.A00++;
                    int i7 = abx3.A01;
                    int i8 = ab32.A00;
                    if (i7 != i8) {
                        abx3.A01 = i8;
                        i3++;
                        arrayDeque.add(abx3);
                    }
                }
            }
        }
        int i9 = ab32.A00 + 1;
        ab32.A00 = i9;
        if (i9 == 0) {
            ab32.A00 = 1;
        }
        Iterator it2 = list.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            ABX abx4 = (ABX) it2.next();
            if (abx4.A00 == 0 && abx4.A01 != (i = ab32.A00)) {
                abx4.A01 = i;
                i10++;
                arrayDeque.add(abx4);
            }
        }
        boolean z = false;
        while (!arrayDeque.isEmpty()) {
            ABX abx5 = (ABX) arrayDeque.poll();
            try {
                abx5.A01();
                if (abx5 instanceof ABA) {
                    ABA aba = (ABA) abx5;
                    if (aba.A00 != -1) {
                        for (Map.Entry entry : aba.A04.entrySet()) {
                            ABX abx6 = (ABX) aba.A02.A03.get(((Integer) entry.getValue()).intValue());
                            if (abx6 == null) {
                                illegalArgumentException = new IllegalArgumentException("Mapped property node does not exists");
                            } else if (abx6 instanceof ABF) {
                                ABF abf = (ABF) abx6;
                                A1N a1n = aba.A03;
                                for (Map.Entry entry2 : abf.A01.entrySet()) {
                                    ABX abx7 = (ABX) abf.A00.A03.get(((Integer) entry2.getValue()).intValue());
                                    if (abx7 == null) {
                                        illegalArgumentException = new IllegalArgumentException("Mapped style node does not exists");
                                    } else if (abx7 instanceof AB8) {
                                        AB8 ab8 = (AB8) abx7;
                                        ArrayList arrayList = new ArrayList(ab8.A01.size());
                                        for (C23182ABk aBk : ab8.A01) {
                                            if (aBk instanceof C23178ABg) {
                                                ABX abx8 = (ABX) ab8.A00.A03.get(((C23178ABg) aBk).A00);
                                                if (abx8 == null) {
                                                    illegalArgumentException2 = new IllegalArgumentException("Mapped style node does not exists");
                                                } else if (abx8 instanceof ABP) {
                                                    d = ((ABP) abx8).A04();
                                                } else {
                                                    illegalArgumentException2 = new IllegalArgumentException("Unsupported type of node used as a transform child node " + abx8.getClass());
                                                }
                                                throw illegalArgumentException2;
                                            }
                                            d = ((C23177ABf) aBk).A00;
                                            arrayList.add(new A1N(aBk.A00, Double.valueOf(d)));
                                        }
                                        a1n.putArray("transform", new A1L(arrayList));
                                    } else if (abx7 instanceof ABP) {
                                        a1n.putDouble((String) entry2.getKey(), ((ABP) abx7).A04());
                                    } else {
                                        illegalArgumentException = new IllegalArgumentException("Unsupported type of node used in property node " + abx7.getClass());
                                    }
                                }
                                continue;
                            } else if (abx6 instanceof ABP) {
                                ABP abp2 = (ABP) abx6;
                                Object obj = abp2.A03;
                                if (obj instanceof String) {
                                    aba.A03.putString((String) entry.getKey(), (String) obj);
                                } else {
                                    aba.A03.putDouble((String) entry.getKey(), abp2.A04());
                                }
                            } else {
                                illegalArgumentException = new IllegalArgumentException("Unsupported type of node used in property node " + abx6.getClass());
                            }
                            throw illegalArgumentException;
                        }
                        aba.A01.synchronouslyUpdateViewOnUIThread(aba.A00, aba.A03);
                    }
                }
            } catch (A0i e) {
                AnonymousClass0CH.A09("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e);
            } catch (A0j e2) {
                if (!z) {
                    ab32.A01++;
                    z = true;
                }
                int i11 = ab32.A01;
                if (i11 <= 64) {
                    AnonymousClass0CH.A09("NativeAnimatedNodesManager", AnonymousClass000.A05("Swallowing exception due to potential race between JS and UI threads: inconsistent frame counter: ", i11), e2);
                } else {
                    throw new IllegalStateException(e2);
                }
            }
            if ((abx5 instanceof ABP) && (aBi = abp.A02) != null) {
                double A042 = (abp = (ABP) abx5).A04();
                C228259s1 A032 = C23041A0r.A03();
                A032.putInt(B5B.INTENT_PARAM_TAG, aBi.A00);
                A032.putDouble("value", A042);
                A44 reactApplicationContextIfActiveOrWarn = aBi.A01.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", A032);
                }
            }
            if (abx5.A03 != null) {
                for (int i12 = 0; i12 < abx5.A03.size(); i12++) {
                    ABX abx9 = (ABX) abx5.A03.get(i12);
                    int i13 = abx9.A00 - 1;
                    abx9.A00 = i13;
                    int i14 = abx9.A01;
                    int i15 = ab32.A00;
                    if (i14 != i15 && i13 == 0) {
                        abx9.A01 = i15;
                        i10++;
                        arrayDeque.add(abx9);
                    }
                }
            }
        }
        if (i3 != i10) {
            if (!z) {
                ab32.A01++;
            }
            if (ab32.A01 > 64) {
                throw new IllegalStateException(AnonymousClass000.A07("Looks like animated nodes graph has cycles, there are ", i3, " but toposort visited only ", i10));
            }
        } else if (!z) {
            ab32.A01 = 0;
        }
    }

    public final void A03(int i, int i2, C23043A0y a0y, Callback callback) {
        ABK abh;
        ABX abx = (ABX) this.A03.get(i2);
        if (abx == null) {
            throw new A0k(AnonymousClass000.A06("Animated node with tag ", i2, " does not exist"));
        } else if (abx instanceof ABP) {
            ABK abk = (ABK) this.A02.get(i);
            if (abk != null) {
                abk.A02(a0y);
                return;
            }
            String string = a0y.getString("type");
            if ("frames".equals(string)) {
                abh = new AB9(a0y);
            } else if ("spring".equals(string)) {
                abh = new ABB(a0y);
            } else if ("decay".equals(string)) {
                abh = new ABH(a0y);
            } else {
                throw new A0k(AnonymousClass000.A0E("Unsupported animation type: ", string));
            }
            abh.A00 = i;
            abh.A02 = callback;
            abh.A01 = (ABP) abx;
            this.A02.put(i, abh);
        } else {
            throw new A0k(AnonymousClass000.A0E("Animated node should be of type ", ABP.class.getName()));
        }
    }

    public AB3(A44 a44) {
        this.A05 = a44;
        NativeModule A022 = a44.A02(UIManagerModule.class);
        AnonymousClass0FY.A00(A022);
        UIManagerModule uIManagerModule = (UIManagerModule) A022;
        uIManagerModule.mEventDispatcher.A3P(this);
        this.A08 = new A9X(uIManagerModule);
    }
}
