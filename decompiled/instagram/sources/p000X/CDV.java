package p000X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CDV */
public final class CDV {
    public static String A02(Context context, CFW cfw) {
        List list = cfw.A07;
        if (CGR.A00(list)) {
            return null;
        }
        String str = (String) list.get(0);
        if (list.size() > 1) {
            for (int i = 1; i < list.size(); i++) {
                String str2 = (String) list.get(i);
                int size = list.size() - 1;
                int i2 = C0003R.string.promote_list_with_or;
                if (i < size) {
                    i2 = C0003R.string.promote_list_with_comma;
                }
                str = context.getString(i2, new Object[]{str, str2});
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        if (r0 == false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    public static String A03(Context context, CFW cfw) {
        int i;
        int i2;
        String str;
        int i3;
        String A02;
        List list;
        String string;
        ArrayList arrayList = new ArrayList();
        List list2 = cfw.A06;
        if (!CGR.A00(list2) && (!list2.contains(C27489CFf.MALE) || !list2.contains(C27489CFf.FEMALE))) {
            if (list2.contains(C27489CFf.MALE)) {
                i = C0003R.string.promote_audience_gender_male;
            } else {
                boolean contains = list2.contains(C27489CFf.FEMALE);
                i = C0003R.string.promote_audience_gender_female;
            }
            String string2 = context.getString(i);
            i2 = cfw.A01;
            int i4 = cfw.A00;
            if (i2 != 0 || i4 == 0) {
                str = null;
            } else if (i2 == i4) {
                str = String.valueOf(i4);
            } else if (i4 >= 65) {
                str = String.valueOf(i2).concat("+");
            } else {
                str = context.getString(C0003R.string.promote_audience_age, new Object[]{Integer.valueOf(i2), Integer.valueOf(i4)});
            }
            if (TextUtils.isEmpty(str)) {
                arrayList.add(context.getString(C0003R.string.promote_audience_gender_and_age, new Object[]{string2, str}));
            } else {
                arrayList.add(string2);
            }
            A02 = A02(context, cfw);
            if (!TextUtils.isEmpty(A02)) {
                arrayList.add(A02);
            }
            list = cfw.A08;
            if (!CGR.A00(list)) {
                string = null;
            } else {
                String str2 = (String) list.get(0);
                if (list.size() > 1) {
                    for (int i5 = 1; i5 < list.size(); i5++) {
                        String str3 = (String) list.get(i5);
                        int size = list.size() - 1;
                        int i6 = C0003R.string.promote_list_with_or;
                        if (i5 < size) {
                            i6 = C0003R.string.promote_list_with_comma;
                        }
                        str2 = context.getString(i6, new Object[]{str2, str3});
                    }
                }
                string = context.getString(C0003R.string.promote_audience_interests, new Object[]{str2});
            }
            if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
            StringBuilder sb = new StringBuilder();
            for (i3 = 0; i3 < arrayList.size(); i3++) {
                sb.append((String) arrayList.get(i3));
                if (i3 != arrayList.size() - 1) {
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
        i = C0003R.string.promote_audience_all_gender;
        String string22 = context.getString(i);
        i2 = cfw.A01;
        int i42 = cfw.A00;
        if (i2 != 0) {
        }
        str = null;
        if (TextUtils.isEmpty(str)) {
        }
        A02 = A02(context, cfw);
        if (!TextUtils.isEmpty(A02)) {
        }
        list = cfw.A08;
        if (!CGR.A00(list)) {
        }
        if (!TextUtils.isEmpty(string)) {
        }
        StringBuilder sb2 = new StringBuilder();
        while (i3 < arrayList.size()) {
        }
        return sb2.toString();
    }

    public static List A04(List list, CFL cfl) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27473CEp cEp = (C27473CEp) it.next();
            if (cEp.A03 == cfl) {
                arrayList.add(cEp.A06);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public static boolean A05(CFW cfw) {
        if (Constants.ZERO == cfw.A02) {
            return true;
        }
        return false;
    }

    public static boolean A06(C27481CEx cEx) {
        if (CCN.A02.equals(CCf.A00(cEx.A03))) {
            CFW cfw = cEx.A02;
            AnonymousClass11J.A00(cfw);
            boolean z = true;
            if (!A05(cfw) && cfw.A01 < 18) {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static ImmutableList A00(C27452CDu cDu) {
        if (CGR.A00(cDu.A00())) {
            return null;
        }
        AnonymousClass267 A00 = ImmutableList.A00();
        C239512q A0I = cDu.A00().iterator();
        while (A0I.hasNext()) {
            A00.A08(((C27485CFb) A0I.next()).A00);
        }
        return A00.A06();
    }

    public static ImmutableList A01(C27452CDu cDu) {
        if (CGR.A00(cDu.A02())) {
            return null;
        }
        AnonymousClass267 A00 = ImmutableList.A00();
        C239512q A0I = cDu.A02().iterator();
        while (A0I.hasNext()) {
            A00.A08(((CG9) A0I.next()).A00);
        }
        return A00.A06();
    }
}
