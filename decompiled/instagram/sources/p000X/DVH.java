package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DVH */
public final class DVH {
    public static C27367CAm A00(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                    return C27367CAm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                case 2:
                    return C27367CAm.IMAGE;
                case 3:
                    return C27367CAm.VIDEO;
                case 4:
                    return C27367CAm.ALBUM;
                case 5:
                    return C27367CAm.WEBVIEW;
                case 6:
                    return C27367CAm.BUNDLE;
                case 7:
                    return C27367CAm.MONTHLY_ACTIVE_CARD;
                case 8:
                    return C27367CAm.BROADCAST;
                case 9:
                    return C27367CAm.CAROUSEL_V2;
                case 10:
                    return C27367CAm.COLLECTION;
                case C120125Dh.VIEW_TYPE_BANNER:
                    return C27367CAm.AUDIO;
            }
        }
        return C27367CAm.UNKNOWN;
    }

    public static Integer A01(DVC dvc) {
        Integer num;
        if (!(dvc == null || (num = dvc.A03) == null)) {
            switch (num.intValue()) {
                case 0:
                    return Constants.ZERO;
                case 1:
                    return Constants.ONE;
                case 2:
                    return Constants.A0C;
                case 3:
                    return Constants.A0N;
                case 4:
                    return Constants.A0Y;
            }
        }
        return Constants.A0j;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.C90] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static List A02(DVC dvc) {
        DVE dve;
        C30191DVd dVd;
        ArrayList arrayList = new ArrayList();
        if (!(dvc == null || (dve = dvc.A02) == null)) {
            for (DVG dvg : dve.A00) {
                DVU dvu = dvg.A00;
                if (dvu != null) {
                    String str = null;
                    if (!(dvu.A04 == null || (dVd = dvu.A01) == null)) {
                        String str2 = dVd.A00;
                        String str3 = str2;
                        if (str2 != null) {
                            String str4 = dvu.A05;
                            String str5 = str4;
                            if (str4 != null) {
                                C27367CAm A00 = A00(dvu.A03);
                                C30190DVc dVc = dvu.A02;
                                if (dVc != null) {
                                    str = dVc.A00;
                                }
                                str = new C90(str5, str3, A00, str, dvu.A00);
                            }
                        }
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.C90] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static List A03(C30193DVf dVf) {
        DVY dvy;
        int i;
        DVX dvx;
        DVa dVa;
        ArrayList arrayList = new ArrayList();
        if (!(dVf == null || (dvy = dVf.A02) == null)) {
            for (DVV dvv : dvy.A00) {
                DVL dvl = dvv.A00;
                if (dvl != null) {
                    C30189DVb dVb = dvl.A00;
                    String str = null;
                    if (dVb != null) {
                        String str2 = dVb.A00;
                        String str3 = str2;
                        if (str2 != null) {
                            String str4 = dvl.A05;
                            String str5 = str4;
                            if (str4 != null) {
                                C27367CAm A00 = A00(dvl.A03);
                                DVZ dvz = dvl.A02;
                                if (dvz != null) {
                                    str = dvz.A00;
                                }
                                DVW dvw = dvl.A01;
                                if (dvw == null || (dvx = dvw.A00) == null || (dVa = dvx.A00) == null) {
                                    i = 0;
                                } else {
                                    i = dVa.A00;
                                }
                                str = new C90(str5, str3, A00, str, i);
                            }
                        }
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return arrayList;
    }
}
