package p000X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.ADV */
public final class ADV {
    public C23161AAp A00;
    public boolean A01;
    public long[] A02;
    public boolean A03;
    public boolean[] A04 = new boolean[4];
    public boolean[] A05 = new boolean[4];
    public final Context A06;
    public final AnonymousClass008 A07 = new AnonymousClass008();
    public final C23214ADc A08;

    public static void A00(Context context, C23225ADo aDo) {
        C23167AAv aAv = aDo.A01.A05;
        List list = aAv.A02;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C23232ADv) list.get(size)).Bs0(context, aDo.A02, aAv, aDo.A01.A06);
            }
        }
        aDo.A03 = false;
    }

    public static void A01(Context context, C23225ADo aDo) {
        C23167AAv aAv = aDo.A01.A05;
        List<C23232ADv> list = aAv.A02;
        if (list != null) {
            for (C23232ADv A6S : list) {
                A6S.A6S(context, aDo.A02, aAv, aDo.A01.A06);
            }
        }
        aDo.A03 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00eb, code lost:
        if (((android.view.View) r1).isLayoutRequested() == false) goto L_0x00ed;
     */
    private void A02(Context context, C23213ADb aDb, C23225ADo aDo) {
        boolean z;
        int i;
        int i2;
        C23213ADb aDb2 = aDb;
        C23167AAv aAv = aDb2.A05;
        C23225ADo aDo2 = aDo;
        C23213ADb aDb3 = aDo2.A01;
        C23167AAv aAv2 = aDb3.A05;
        Object obj = aDo2.A02;
        aDo2.A01 = aDb2;
        if (aAv2 != aAv) {
            List list = aAv.A02;
            List list2 = aAv.A00;
            if (list2 == null) {
                list2 = aAv.A03;
            }
            if (list != null) {
                i = list.size();
                if (this.A04.length < i) {
                    this.A04 = new boolean[i];
                }
            } else {
                i = 0;
            }
            if (list2 != null) {
                i2 = list2.size();
                if (this.A05.length < i2) {
                    this.A05 = new boolean[i2];
                }
            } else {
                i2 = 0;
            }
            boolean[] zArr = this.A04;
            Context context2 = context;
            if (i != 0) {
                C23167AAv aAv3 = aDb3.A05;
                Object obj2 = aDb3.A06;
                C23167AAv aAv4 = aDb2.A05;
                Object obj3 = aDb2.A06;
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    C23232ADv aDv = (C23232ADv) list.get(i3);
                    if (aDv.Bng(aAv3, aAv4, obj2, obj3)) {
                        aDv.Bs0(context2, obj, aAv3, obj2);
                        zArr[i3] = true;
                    } else {
                        zArr[i3] = false;
                    }
                }
            }
            boolean[] zArr2 = this.A05;
            if (i2 != 0) {
                C23167AAv aAv5 = aDb3.A05;
                Object obj4 = aDb3.A06;
                C23167AAv aAv6 = aDb2.A05;
                Object obj5 = aDb2.A06;
                for (int i4 = i2 - 1; i4 >= 0; i4--) {
                    C23232ADv aDv2 = (C23232ADv) list2.get(i4);
                    if (aDv2.Bng(aAv5, aAv6, obj4, obj5)) {
                        aDv2.Bs0(context2, obj, aAv5, obj4);
                        zArr2[i4] = true;
                    } else {
                        zArr2[i4] = false;
                    }
                }
            }
            boolean[] zArr3 = this.A05;
            if (i2 != 0) {
                C23167AAv aAv7 = aDb2.A05;
                Object obj6 = aDb2.A06;
                for (int i5 = 0; i5 < i2; i5++) {
                    if (zArr3[i5]) {
                        ((C23232ADv) list2.get(i5)).A6S(context2, obj, aAv7, obj6);
                    }
                }
            }
            boolean[] zArr4 = this.A04;
            if (i != 0) {
                C23167AAv aAv8 = aDb2.A05;
                Object obj7 = aDb2.A06;
                for (int i6 = 0; i6 < i; i6++) {
                    if (zArr4[i6]) {
                        ((C23232ADv) list.get(i6)).A6S(context2, obj, aAv8, obj7);
                    }
                }
            }
        }
        if (aDb2.A05.A02() != 0) {
            Object obj8 = aDo2.A02;
            if (obj8 instanceof View) {
                z = true;
            }
            z = false;
            ADX.A00(aDo2.A01, aDo2.A02, z);
        }
    }

    public static void A03(Context context, C23213ADb aDb, C23167AAv aAv, Object obj) {
        List list = aAv.A00;
        if (list == null) {
            list = aAv.A03;
        }
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C23232ADv) list.get(size)).Bs0(context, obj, aAv, aDb.A06);
            }
        }
    }

    public static void A04(Context context, C23213ADb aDb, C23167AAv aAv, Object obj) {
        List<C23232ADv> list = aAv.A00;
        if (list == null) {
            list = aAv.A03;
        }
        if (list != null) {
            for (C23232ADv A6S : list) {
                A6S.A6S(context, obj, aAv, aDb.A06);
            }
        }
    }

    public static void A05(ADV adv, C23213ADb aDb) {
        int i;
        int i2;
        C23167AAv aAv = aDb.A05;
        AnonymousClass008 r8 = adv.A07;
        long A022 = aAv.A02();
        C23225ADo aDo = (C23225ADo) r8.A04(A022, (Object) null);
        if (aDo != null) {
            Object obj = aDo.A02;
            if (A022 != 0) {
                r8.A06(A022);
                List list = aDb.A00;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    C23214ADc aDc = (C23214ADc) obj;
                    int i3 = 0;
                    while (true) {
                        List list2 = aDb.A00;
                        if (list2 != null) {
                            i2 = list2.size();
                        } else {
                            i2 = 0;
                        }
                        if (i3 >= i2) {
                            break;
                        }
                        A05(adv, (C23213ADb) aDb.A00.get(i3));
                        i3++;
                    }
                    if (aDc.getMountItemCount() > 0) {
                        throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                    }
                }
                C23214ADc aDc2 = aDo.A00;
                if (aDo.A03) {
                    A00(adv.A06, aDo);
                }
                aDc2.A02(aDb.A01, aDo);
                if (obj instanceof View) {
                    ((View) obj).setPadding(0, 0, 0, 0);
                }
                A03(adv.A06, aDb, aAv, obj);
                Context context = adv.A06;
                C23167AAv aAv2 = aDo.A01.A05;
                Object obj2 = aDo.A02;
                AnonymousClass1Q7 A002 = AED.A00(context, aAv2.getClass());
                if (A002 != null) {
                    A002.BaL(obj2);
                }
            }
        }
    }

    public final void A06(C23161AAp aAp) {
        Object obj;
        long[] jArr;
        C23213ADb[] aDbArr;
        C23213ADb aDb;
        long A022;
        long[] jArr2;
        if (aAp == null) {
            throw new IllegalStateException("Trying to mount a null RenderTreeNode");
        } else if (this.A03) {
            throw new IllegalStateException("Trying to mount while already mounting!");
        } else if (aAp != this.A00 || this.A01) {
            this.A00 = aAp;
            this.A03 = true;
            if (this.A02 != null) {
                int i = 0;
                while (true) {
                    long[] jArr3 = this.A02;
                    int length = jArr3.length;
                    if (i >= length) {
                        break;
                    }
                    C23161AAp aAp2 = this.A00;
                    long j = jArr3[i];
                    int i2 = 0;
                    while (true) {
                        aDbArr = aAp2.A03;
                        if (i2 < aDbArr.length) {
                            if (aDbArr[i2].A05.A02() == j) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    C23214ADc aDc = null;
                    if (i2 > -1) {
                        aDb = aDbArr[i2];
                    } else {
                        aDb = null;
                    }
                    AnonymousClass008 r10 = this.A07;
                    C23225ADo aDo = null;
                    if (!(r10 == null || (jArr2 = this.A02) == null || i >= length)) {
                        aDo = (C23225ADo) r10.A04(jArr2[i], (Object) null);
                    }
                    if (i2 != -1) {
                        C23213ADb aDb2 = aDb.A04;
                        if (aDb2 == null) {
                            A022 = 0;
                        } else {
                            A022 = aDb2.A05.A02();
                        }
                        Object A042 = r10.A04(A022, (Object) null);
                        if (A042 != null) {
                            aDc = (C23214ADc) ((C23225ADo) A042).A02;
                        }
                        if (aDo != null) {
                            C23214ADc aDc2 = aDo.A00;
                            if (aDc2 == aDc) {
                                if (i2 != i) {
                                    aDc2.A03(aDo, aDo.A01.A01, aDb.A01);
                                }
                            }
                            A05(this, aDo.A01);
                        }
                    } else {
                        if (aDo == null) {
                        }
                        A05(this, aDo.A01);
                    }
                    i++;
                }
            }
            C23225ADo aDo2 = (C23225ADo) this.A07.A04(0, (Object) null);
            C23213ADb aDb3 = this.A00.A03[0];
            C23167AAv aAv = aDb3.A05;
            if (aDo2 == null) {
                A04(this.A06, aDb3, aAv, this.A08);
                C23214ADc aDc3 = this.A08;
                C23225ADo aDo3 = new C23225ADo(aDb3, aDc3, aDc3);
                this.A07.A08(0, aDo3);
                A01(this.A06, aDo3);
            } else {
                A02(this.A06, aDb3, aDo2);
            }
            C23213ADb[] aDbArr2 = this.A00.A03;
            int length2 = aDbArr2.length;
            long[] jArr4 = this.A02;
            if (jArr4 == null || length2 != jArr4.length) {
                this.A02 = new long[length2];
            }
            for (int i3 = 0; i3 < length2; i3++) {
                this.A02[i3] = aDbArr2[i3].A05.A02();
            }
            int length3 = aAp.A03.length;
            int i4 = 1;
            while (true) {
                boolean z = false;
                if (i4 < length3) {
                    C23213ADb aDb4 = aAp.A03[i4];
                    AnonymousClass008 r6 = this.A07;
                    C23225ADo aDo4 = null;
                    if (!(r6 == null || (jArr = this.A02) == null || i4 >= jArr.length)) {
                        aDo4 = (C23225ADo) r6.A04(jArr[i4], (Object) null);
                    }
                    if (aDo4 != null) {
                        z = true;
                    }
                    if (!z) {
                        C23214ADc aDc4 = (C23214ADc) ((C23225ADo) r6.A04(aDb4.A04.A05.A02(), (Object) null)).A02;
                        if (aDc4 != null) {
                            C23167AAv aAv2 = aDb4.A05;
                            Context context = this.A06;
                            AnonymousClass1Q7 A002 = AED.A00(context, aAv2.A03());
                            if (A002 == null || (obj = A002.A2N()) == null) {
                                obj = aAv2.A04(context);
                            }
                            A04(this.A06, aDb4, aAv2, obj);
                            C23225ADo aDo5 = new C23225ADo(aDb4, aDc4, obj);
                            this.A07.A08(this.A02[i4], aDo5);
                            aDc4.A01(aDb4.A01, aDo5);
                            A01(this.A06, aDo5);
                            ADX.A00(aDb4, aDo5.A02, true);
                        } else {
                            throw new RuntimeException("Trying to mount a RenderTreeNode but its host is not mounted.");
                        }
                    } else {
                        A02(this.A06, aDb4, aDo4);
                    }
                    i4++;
                } else {
                    this.A01 = false;
                    this.A03 = false;
                    return;
                }
            }
        }
    }

    public ADV(C23214ADc aDc) {
        this.A06 = aDc.getContext();
        this.A08 = aDc;
    }
}
