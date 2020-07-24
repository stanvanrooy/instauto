package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1oT  reason: invalid class name and case insensitive filesystem */
public final class C40321oT {
    public static C40481oj A00(C38831lv r11, AnonymousClass0C1 r12, int i, int i2) {
        String A06;
        C38851lx r0 = r11.A01;
        C38871lz r3 = r0.A02;
        if (r3 == null) {
            A06 = "Cannot make OneByTwoSection with null 1x2 item";
        } else {
            List list = r0.A07;
            if (list == null) {
                A06 = "Cannot make OneByTwoSection with null fill items";
            } else if (list.size() != 4) {
                A06 = AnonymousClass000.A06("Cannot make OneByTwoSection with ", list.size(), " fill_items");
            } else {
                C40361oX A03 = A03(r3, r11.A00, r12, C40331oU.A00(2, 1));
                if (A03 != null) {
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    int i3 = 0;
                    while (i3 < list.size()) {
                        int i4 = 1;
                        if (i3 < 2) {
                            i4 = 0;
                        }
                        int i5 = (i3 % 2) + i2;
                        C40361oX A02 = A02((C38871lz) list.get(i3));
                        if (A02 != null) {
                            C40411oc r02 = new C40411oc(i4, i5);
                            arrayList.add(A02);
                            hashMap.put(A02, r02);
                            i3++;
                        }
                    }
                    C40411oc r03 = new C40411oc(0, i);
                    arrayList.add(i, A03);
                    hashMap.put(A03, r03);
                    return new C40481oj(arrayList, hashMap, 2);
                }
                return null;
            }
        }
        AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", A06);
        return null;
    }

    public static C40481oj A01(C38831lv r9, AnonymousClass0C1 r10, int i, int i2) {
        String A06;
        C38851lx r0 = r9.A01;
        C38871lz r2 = r0.A05;
        if (r2 == null) {
            A06 = "Cannot make TwoByTwoSection with null 2x2 item";
        } else {
            List list = r0.A07;
            if (list == null) {
                A06 = "Cannot make TwoByTwoSection with null fill items";
            } else if (list.size() != 2) {
                A06 = AnonymousClass000.A06("Cannot make TwoByTwoSection with ", list.size(), " fill_items");
            } else {
                C40361oX A03 = A03(r2, r9.A00, r10, C40331oU.A00(2, 2));
                if (A03 != null) {
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    int i3 = 0;
                    while (i3 < list.size()) {
                        C40361oX A02 = A02((C38871lz) list.get(i3));
                        if (A02 != null) {
                            C40411oc r02 = new C40411oc(i3, i2);
                            arrayList.add(A02);
                            hashMap.put(A02, r02);
                            i3++;
                        }
                    }
                    C40411oc r03 = new C40411oc(0, i);
                    arrayList.add(i, A03);
                    hashMap.put(A03, r03);
                    return new C40481oj(arrayList, hashMap, 2);
                }
                return null;
            }
        }
        AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", A06);
        return null;
    }

    public static C40361oX A02(C38871lz r3) {
        C39401mr r2 = r3.A00;
        if (r2 == C39401mr.MEDIA) {
            return new C40511om(C40331oU.A00(1, 1), (AnonymousClass1NJ) r3.A0G);
        }
        AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", AnonymousClass000.A0E("Cannot make 1x1 item with type ", r2.toString()));
        return null;
    }

    public static C40361oX A03(C38871lz r9, C39421mt r10, AnonymousClass0C1 r11, C40331oU r12) {
        C39401mr r2 = r9.A00;
        C40331oU r3 = r12;
        switch (r2.ordinal()) {
            case 1:
                AnonymousClass1NJ r5 = (AnonymousClass1NJ) r9.A0G;
                if (r5.AiO()) {
                    return new C40551oq(r3, r5.getId(), r5, Constants.ZERO, "video_chaining", (String) null, C40571os.A00(r9, r10));
                }
                return new C40511om(r12, r5);
            case 2:
                C39931nn r0 = (C39931nn) r9.A0G;
                return new C40551oq(r3, r0.A01, r0.A00, Constants.ONE, r0.A03, r0.A02, C40571os.A00(r9, r10));
            case 4:
                return new C41731qo(r12, (AnonymousClass2CJ) r9.A0G, r11, C40571os.A00(r9, r10));
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return new C50312Fu(r12, (C173727bX) r9.A0G, C40571os.A00(r9, r10));
            case 18:
                return new AnonymousClass2SN(r12, (C217329Yv) r9.A0G);
            case 23:
                return new C1657574w(r12, (C1657474v) r9.A0G);
            case 24:
                return new C55102a4((C28771CmR) r9.A0G, r12);
            case 25:
                return new C40351oW(r12, (C38891m1) r9.A0G);
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                return new AnonymousClass304(r12, (C222139hV) r9.A0G);
            case 27:
                return new C41741qp(r12, (C120925Gn) r9.A0G);
            case 28:
                return new C41751qq(r12, (C472522v) r9.A0G);
            default:
                AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", "Cannot make " + r12.A02 + "x" + r12.AIT() + " item with type " + r2.toString());
                return null;
        }
    }

    public static List A04(AnonymousClass0C1 r16, List list) {
        Object obj;
        C40331oU r10;
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38831lv r0 = (C38831lv) it.next();
            C39431mu r8 = r0.A02;
            AnonymousClass0C1 r1 = r16;
            switch (r8.ordinal()) {
                case 0:
                    C38871lz r4 = r0.A01.A01;
                    if (r4 == null) {
                        AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", "Cannot make FullWidthSection without full_item");
                        obj = null;
                        break;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        HashMap hashMap = new HashMap();
                        boolean z = false;
                        if (r8 == C39431mu.FULL_WIDTH) {
                            z = true;
                        }
                        AnonymousClass0a4.A0A(z);
                        C39401mr r7 = r4.A00;
                        if (!(r7 == C39401mr.IGTV_CHANNEL || r7 == C39401mr.BLOKS)) {
                            float f = r0.A00.A00;
                            if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                switch (r7.ordinal()) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                                        i = 1;
                                        r10 = new C40331oU(1, 3, 1, -1, 1.0f);
                                        break;
                                }
                            } else {
                                i = 1;
                                r10 = new C40331oU(1, 3, 1, -1, f);
                            }
                            C40361oX A03 = A03(r4, r0.A00, r1, r10);
                            C40411oc r12 = new C40411oc(0, 0);
                            arrayList2.add(A03);
                            hashMap.put(A03, r12);
                            obj = new C40481oj(arrayList2, hashMap, i);
                            break;
                        }
                        i = 1;
                        r10 = new C40331oU(1, 3, 1, -1, -1.0f);
                        C40361oX A032 = A03(r4, r0.A00, r1, r10);
                        C40411oc r122 = new C40411oc(0, 0);
                        arrayList2.add(A032);
                        hashMap.put(A032, r122);
                        obj = new C40481oj(arrayList2, hashMap, i);
                    }
                case 1:
                    List list2 = r0.A01.A08;
                    obj = null;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        HashMap hashMap2 = new HashMap();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= list2.size()) {
                                obj = new C40481oj(arrayList3, hashMap2, 1);
                                break;
                            } else {
                                C40361oX A02 = A02((C38871lz) list2.get(i2));
                                if (A02 == null) {
                                    break;
                                } else {
                                    C40411oc r02 = new C40411oc(0, i2);
                                    arrayList3.add(A02);
                                    hashMap2.put(A02, r02);
                                    i2++;
                                }
                            }
                        }
                    } else {
                        AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", "Cannot make SingleRowSection with null media");
                        break;
                    }
                case 2:
                    obj = A00(r0, r1, 0, 1);
                    break;
                case 3:
                    obj = A00(r0, r1, 2, 0);
                    break;
                case 4:
                    obj = A01(r0, r1, 0, 2);
                    break;
                case 5:
                    obj = A01(r0, r1, 1, 0);
                    break;
                case 6:
                    C38871lz r3 = r0.A01.A03;
                    obj = null;
                    if (r3 != null) {
                        C39421mt r2 = r0.A00;
                        float f2 = r2.A00;
                        if (f2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            f2 = 0.85714287f;
                        }
                        C40361oX A033 = A03(r3, r2, r1, new C40331oU(4, 3, 1, -1, f2));
                        if (A033 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            HashMap hashMap3 = new HashMap();
                            C40411oc r13 = new C40411oc(0, 0);
                            arrayList4.add(A033);
                            hashMap3.put(A033, r13);
                            obj = new C40481oj(arrayList4, hashMap3, 4);
                            break;
                        }
                    } else {
                        AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", "Cannot make threeByFourSection with null 3x4 item");
                        break;
                    }
                    break;
                case 8:
                    obj = r0.A01.A00;
                    if (obj == null) {
                        AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", "Cannot make DiscoveryTabsInfo with null tabs_info");
                        obj = null;
                        break;
                    }
                    break;
                default:
                    AnonymousClass0QD.A01("DiscoveryRecyclerSectionTransformer", AnonymousClass000.A0E("Unsupported DiscoverySection layout_type: ", r8.A00));
                    obj = null;
                    break;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
