package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.WebView;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.1mB  reason: invalid class name and case insensitive filesystem */
public final class C38991mB {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = r7.indexOf(r4);
     */
    public static List A00(String str) {
        int indexOf;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            String findAddress = WebView.findAddress(str);
            if (findAddress == null || (i = i2 + indexOf) < 0) {
                return arrayList;
            }
            int length = findAddress.length();
            int i3 = length + i;
            arrayList.add(new C39231mZ(i, i3, findAddress));
            str = str.substring(indexOf + length);
            i2 = i3;
        }
        return arrayList;
    }

    public static List A02(String str) {
        Matcher matcher = C06360Ot.A01.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(new C39231mZ(matcher.start(1), matcher.end(1), matcher.group(1)));
        }
        return arrayList;
    }

    public static List A03(String str) {
        Context context = StoredPreferences.A00;
        AnonymousClass3MK<AnonymousClass4YC> r0 = new AnonymousClass3MK(PhoneNumberUtil.A01(context), str, AnonymousClass3M1.A00(context).A00, AnonymousClass3MH.A01);
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass4YC r02 : r0) {
            int i = r02.A00;
            String str2 = r02.A01;
            arrayList.add(new C39231mZ(i, str2.length() + i, str2));
        }
        return arrayList;
    }

    public static List A01(String str) {
        Matcher A00 = C39011mD.A00(str);
        ArrayList arrayList = new ArrayList();
        while (A00.find()) {
            arrayList.add(new C39231mZ(A00.start(1), A00.end(1), A00.group(1)));
        }
        return arrayList;
    }

    public static List A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(new C39231mZ(matcher.start(0), matcher.end(0), matcher.group(0)));
        }
        return arrayList;
    }
}
