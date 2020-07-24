package p000X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.DFX */
public final class DFX {
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0159, code lost:
        if (r4 != 3) goto L_0x015b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    public static C29903DFm A00(List list, DFT dft, AnonymousClass0QL r21) {
        Boolean bool;
        String str;
        Object dfq;
        if (list == null || list.isEmpty()) {
            throw new DFW("Missing context in config");
        }
        int size = list.size();
        DFZ[] dfzArr = new DFZ[size];
        C29906DFq[] dFqArr = null;
        if (dft != null) {
            dFqArr = new C29906DFq[size];
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29054Cr7 cr7 = (C29054Cr7) it.next();
            String A00 = DFR.A00(cr7.A02);
            String str2 = cr7.A00;
            if (str2 == null || A00 == null) {
                throw new DFW("Bad context identifier", str2);
            }
            if (dft != null) {
                C29906DFq dFq = new C29906DFq();
                List<C29055Cr8> list2 = cr7.A03;
                if (list2 != null) {
                    for (C29055Cr8 cr8 : list2) {
                        String str3 = cr8.A00;
                        String str4 = cr8.A01;
                        List list3 = cr8.A02;
                        if (str3 == null) {
                            throw new DFW("Missing bucket name");
                        } else if (str4 != null) {
                            String lowerCase = str3.toLowerCase(Locale.US);
                            if (str4 != null) {
                                char c = 65535;
                                int hashCode = str4.hashCode();
                                if (hashCode != 3392903) {
                                    if (hashCode != 104980213) {
                                        if (hashCode == 1509016093 && str4.equals("catch_all")) {
                                            c = 0;
                                        }
                                    } else if (str4.equals("nnull")) {
                                        c = 2;
                                    }
                                } else if (str4.equals("null")) {
                                    c = 1;
                                }
                                if (c == 0 || c == 1 || c == 2) {
                                    bool = true;
                                    if (!bool.booleanValue()) {
                                        dfq = new DFV(lowerCase, str4, list3);
                                    } else if (str4.equals("same")) {
                                        dfq = new DFS(lowerCase, list3);
                                    } else {
                                        String str5 = str4;
                                        if (str4 != null) {
                                            char c2 = 65535;
                                            switch (str4.hashCode()) {
                                                case 3244:
                                                    if (str4.equals("eq")) {
                                                        c2 = 6;
                                                        break;
                                                    }
                                                    break;
                                                case 3309:
                                                    if (str4.equals("gt")) {
                                                        c2 = 8;
                                                        break;
                                                    }
                                                    break;
                                                case 3464:
                                                    if (str4.equals("lt")) {
                                                        c2 = 4;
                                                        break;
                                                    }
                                                    break;
                                                case 98322:
                                                    if (str4.equals("ccr")) {
                                                        c2 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case 98694:
                                                    if (str4.equals("cor")) {
                                                        c2 = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 102680:
                                                    if (str4.equals("gte")) {
                                                        c2 = 9;
                                                        break;
                                                    }
                                                    break;
                                                case 107485:
                                                    if (str4.equals("lte")) {
                                                        c2 = 5;
                                                        break;
                                                    }
                                                    break;
                                                case 108954:
                                                    if (str4.equals("neq")) {
                                                        c2 = 7;
                                                        break;
                                                    }
                                                    break;
                                                case 109854:
                                                    if (str4.equals("ocr")) {
                                                        c2 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 110226:
                                                    if (str4.equals("oor")) {
                                                        c2 = 0;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            switch (c2) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    str = str4;
                                                    break;
                                            }
                                        }
                                        str5 = null;
                                        str = null;
                                        if (str5 != null) {
                                            dfq = new DFU(lowerCase, str, list3);
                                        } else {
                                            String str6 = str4;
                                            if (str4 != null) {
                                                char c3 = 65535;
                                                int hashCode2 = str4.hashCode();
                                                if (hashCode2 != -567445985) {
                                                    if (hashCode2 != 3365) {
                                                        if (hashCode2 != 109075) {
                                                            if (hashCode2 == 108392519 && str4.equals("regex")) {
                                                                c3 = 3;
                                                            }
                                                        } else if (str4.equals("nin")) {
                                                            c3 = 1;
                                                        }
                                                    } else if (str4.equals("in")) {
                                                        c3 = 0;
                                                    }
                                                } else if (str4.equals("contains")) {
                                                    c3 = 2;
                                                }
                                                if (c3 != 0) {
                                                    if (c3 != 1) {
                                                        if (c3 != 2) {
                                                        }
                                                    }
                                                }
                                                if (str6 == null) {
                                                    dfq = new DFQ(lowerCase, str6, list3);
                                                } else {
                                                    throw new DFW("Unknown bucket definition", AnonymousClass000.A0J(lowerCase, ",", str4));
                                                }
                                            }
                                            str6 = null;
                                            if (str6 == null) {
                                            }
                                        }
                                    }
                                    dFq.A00.add(dfq);
                                }
                            }
                            bool = false;
                            if (!bool.booleanValue()) {
                            }
                            dFq.A00.add(dfq);
                        } else {
                            throw new DFW("Missing bucket strategy", str3);
                        }
                    }
                }
                dFqArr[i] = dFq;
            }
            String str7 = cr7.A01;
            if (str7 == null || str7.isEmpty()) {
                dfzArr[i] = new DFZ(cr7.A00, r21);
            } else {
                dfzArr[i] = new DFZ(cr7.A00, new DFR(A00, str7));
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(cr7.A00);
            i++;
        }
        sb.toString();
        return new C29903DFm(dfzArr, dFqArr);
    }

    public static DFY A01(List list) {
        String str;
        if (list == null || list.size() == 0) {
            throw new DFW("Missing outputs field definition");
        }
        int size = list.size();
        String[] strArr = new String[size];
        HashMap hashMap = new HashMap(size);
        int i = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29063CrG crG = (C29063CrG) it.next();
            String str2 = crG.A02;
            if (str2 == null || (str = crG.A01) == null) {
                throw new DFW("Missing output field", crG.A01);
            }
            strArr[i] = DFR.A00(str2);
            hashMap.put(str, Integer.valueOf(i));
            if (strArr[i] != null) {
                i++;
            } else {
                throw new DFW("Bad output type", crG.A02);
            }
        }
        return new DFY(strArr, hashMap);
    }

    public static Map A02(List list, DFY dfy, DFR[] dfrArr) {
        int intValue;
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29908DFs dFs = (C29908DFs) it.next();
                DFR[] dfrArr2 = new DFR[dfy.A00];
                List<C29064CrH> list2 = dFs.A01;
                if (list2 == null) {
                    throw new DFW("Missing table item values");
                } else if (dFs.A00 != null) {
                    for (C29064CrH crH : list2) {
                        Integer num = (Integer) dfy.A01.get(crH.A00);
                        if (num == null || (intValue = num.intValue()) >= dfy.A00) {
                            throw new DFW("Undeclared output param", crH.A00);
                        }
                        dfrArr2[intValue] = new DFR(dfy.A02[intValue], crH.A01);
                    }
                    for (int i = 0; i < dfy.A00; i++) {
                        if (dfrArr2[i] == null) {
                            dfrArr2[i] = dfrArr[i];
                        }
                    }
                    hashMap.put(dFs.A00.toLowerCase(Locale.US), dfrArr2);
                } else {
                    throw new DFW("Missing table item bucket");
                }
            }
            return hashMap;
        }
        throw new DFW("Missing table");
    }

    public static DFR[] A03(List list, DFY dfy) {
        int i;
        int intValue;
        if (list != null && list.size() == (i = dfy.A00)) {
            DFR[] dfrArr = new DFR[i];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29064CrH crH = (C29064CrH) it.next();
                Integer num = (Integer) dfy.A01.get(crH.A00);
                if (num == null || (intValue = num.intValue()) >= dfy.A00) {
                    throw new DFW("Undeclared output param", crH.A00);
                }
                dfrArr[intValue] = new DFR(dfy.A02[intValue], crH.A01);
            }
            int i2 = 0;
            while (i2 < dfy.A00) {
                if (dfrArr[i2] != null) {
                    i2++;
                }
            }
            return dfrArr;
        }
        throw new DFW("Missing default value");
    }
}
