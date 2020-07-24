package p000X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Dc  reason: invalid class name and case insensitive filesystem */
public final class C04230Dc {
    public static C04230Dc A02;
    public final C04250Df A00 = new C04250Df();
    public final C169397Ly A01 = new C169397Ly();

    public static boolean A04(String[] strArr, String str) {
        if (strArr != null) {
            for (String equalsIgnoreCase : strArr) {
                if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String A00(String str, int i) {
        if (str == null || str.length() < 1) {
            return "";
        }
        String replace = str.replace("\n", "").replace("\"", "");
        if (replace.length() > i) {
            return AnonymousClass000.A0E(replace.substring(0, i), "...");
        }
        return replace;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|(2:7|(3:9|(1:35)(1:(2:16|(2:34|18)(1:36))(1:33))|31)(1:32))|15|19|20|(4:23|(2:25|39)(1:38)|37|21)|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00f7 */
    public static void A01(C04230Dc r14, String str, PrintWriter printWriter, String[] strArr) {
        PrintWriter printWriter2 = printWriter;
        printWriter2.print(str);
        printWriter2.println("Top Level Window View Hierarchy:");
        String[] strArr2 = strArr;
        boolean A04 = A04(strArr2, "all-roots");
        boolean A042 = A04(strArr2, "top-root");
        boolean A043 = A04(strArr2, "webview");
        C04230Dc r7 = r14;
        try {
            List A002 = r14.A01.A00();
            if (A002 != null && !A002.isEmpty()) {
                Collections.reverse(A002);
                WindowManager.LayoutParams layoutParams = null;
                Iterator it = A002.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C169407Lz r2 = (C169407Lz) it.next();
                    if (r2.A00.getVisibility() == 0) {
                        if (!A04 && layoutParams != null && Math.abs(r2.A01.type - layoutParams.type) != 1) {
                            break;
                        }
                        r7.A03(AnonymousClass000.A0E(str, "  "), printWriter2, r2.A00, 0, 0, A043);
                        layoutParams = r2.A01;
                        if (A042) {
                            break;
                        }
                    }
                }
                C04250Df r22 = r14.A00;
                for (C04240De r6 : r22.A01) {
                    String str2 = (String) r22.A00.get(r6.A04);
                    if (str2 != null) {
                        printWriter2.print("WebView HTML for ");
                        printWriter2.print(r6);
                        printWriter2.println(":");
                        String replace = str2.replace("\\u003C", "<").replace("\\n", "").replace("\\\"", "\"");
                        printWriter2.println(String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", new Object[]{r6.A04, Integer.valueOf(r6.A01), Integer.valueOf(r6.A02), Integer.valueOf(r6.A03), Integer.valueOf(r6.A00), replace.substring(1, replace.length() - 1)}));
                    }
                }
                r22.A01.clear();
                r22.A00.clear();
            }
        } catch (Exception e) {
            printWriter2.println(AnonymousClass000.A0E("Failure in view hierarchy dump: ", e.getMessage()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0231, code lost:
        r4 = (android.view.ViewGroup) r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x025f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017b A[Catch:{ Exception -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0187 A[Catch:{ Exception -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c7  */
    private void A03(String str, PrintWriter printWriter, View view, int i, int i2, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2;
        ViewGroup viewGroup;
        int childCount;
        int length;
        String str8;
        String str9;
        PrintWriter printWriter2 = printWriter;
        String str10 = str;
        printWriter2.print(str10);
        View view2 = view;
        if (view == null) {
            printWriter2.println("null");
            return;
        }
        Class cls = view2.getClass();
        printWriter2.print(cls.getName());
        printWriter2.print("{");
        printWriter2.print(Integer.toHexString(view2.hashCode()));
        printWriter2.print(" ");
        int visibility = view2.getVisibility();
        String str11 = "V";
        String str12 = ".";
        if (visibility != 0) {
            if (visibility == 4) {
                str9 = "I";
            } else if (visibility != 8) {
                printWriter2.print(str12);
            } else {
                str9 = "G";
            }
            printWriter2.print(str9);
        } else {
            printWriter2.print(str11);
        }
        String str13 = "F";
        String str14 = str12;
        if (view2.isFocusable()) {
            str14 = str13;
        }
        printWriter2.print(str14);
        if (view2.isEnabled()) {
            str2 = "E";
        } else {
            str2 = str12;
        }
        printWriter2.print(str2);
        printWriter2.print(str12);
        String str15 = "H";
        String str16 = str12;
        if (view2.isHorizontalScrollBarEnabled()) {
            str16 = str15;
        }
        printWriter2.print(str16);
        if (!view2.isVerticalScrollBarEnabled()) {
            str11 = str12;
        }
        printWriter2.print(str11);
        if (view2.isClickable()) {
            str3 = "C";
        } else {
            str3 = str12;
        }
        printWriter2.print(str3);
        if (view2.isLongClickable()) {
            str4 = "L";
        } else {
            str4 = str12;
        }
        printWriter2.print(str4);
        printWriter2.print(" ");
        if (!view2.isFocused()) {
            str13 = str12;
        }
        printWriter2.print(str13);
        if (view2.isSelected()) {
            str5 = "S";
        } else {
            str5 = str12;
        }
        printWriter2.print(str5);
        if (!view2.isHovered()) {
            str15 = str12;
        }
        printWriter2.print(str15);
        if (view2.isActivated()) {
            str6 = "A";
        } else {
            str6 = str12;
        }
        printWriter2.print(str6);
        if (view2.isDirty()) {
            str12 = "D";
        }
        printWriter2.print(str12);
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        printWriter2.print(" ");
        printWriter2.print(iArr[0] - i);
        printWriter2.print(",");
        printWriter2.print(iArr[1] - i2);
        printWriter2.print("-");
        printWriter2.print((iArr[0] + view2.getWidth()) - i);
        printWriter2.print(",");
        printWriter2.print((iArr[1] + view2.getHeight()) - i2);
        try {
            int id = view2.getId();
            if (id != -1) {
                printWriter2.append(" #");
                printWriter2.append(Integer.toHexString(id));
                Resources resources = view2.getResources();
                if (id > 0 && resources != null) {
                    int i3 = -16777216 & id;
                    if (i3 == 16777216) {
                        str8 = "android";
                    } else if (i3 != 2130706432) {
                        str8 = resources.getResourcePackageName(id);
                    } else {
                        str8 = "app";
                    }
                    printWriter2.print(" ");
                    printWriter2.print(str8);
                    printWriter2.print(":");
                    printWriter2.print(resources.getResourceTypeName(id));
                    printWriter2.print("/");
                    printWriter2.print(resources.getResourceEntryName(id));
                    str7 = null;
                    if (!(view2 instanceof TextView)) {
                        str7 = ((TextView) view2).getText().toString();
                    } else {
                        Object tag = view2.getTag();
                        if (tag != null) {
                            str7 = tag.toString().trim();
                        }
                    }
                    if (str7 != null && !str7.isEmpty()) {
                        printWriter2.print(" text=\"");
                        printWriter2.print(A00(str7, 200));
                        printWriter2.print("\"");
                    }
                    printWriter2.println("}");
                    while (true) {
                        if (cls != null) {
                            z2 = false;
                            break;
                        } else if (cls.getSimpleName().equals("LithoView")) {
                            z2 = true;
                            break;
                        } else {
                            cls = cls.getSuperclass();
                        }
                    }
                    if (z2) {
                        String view3 = view2.toString();
                        int indexOf = view3.indexOf(10) + 1;
                        if (indexOf > 0 && indexOf < (length = view3.length())) {
                            printWriter2.append(view3, indexOf, length);
                            printWriter2.println();
                        }
                    }
                    boolean z3 = z;
                    if (z && (view2 instanceof WebView)) {
                        C04250Df r7 = this.A00;
                        WebView webView = (WebView) view2;
                        C04240De r3 = new C04240De(webView);
                        r7.A01.add(r3);
                        webView.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", new Object[]{Integer.valueOf(r3.A01), Integer.valueOf(r3.A02), Float.valueOf(webView.getResources().getDisplayMetrics().scaledDensity)}), new AnonymousClass0Dd(r7, r3));
                    }
                    if ((view2 instanceof ViewGroup) && (childCount = viewGroup.getChildCount()) > 0) {
                        String A0E = AnonymousClass000.A0E(str10, "  ");
                        int[] iArr2 = new int[2];
                        view2.getLocationOnScreen(iArr2);
                        for (int i4 = 0; i4 < childCount; i4++) {
                            A03(A0E, printWriter2, viewGroup.getChildAt(i4), iArr2[0], iArr2[1], z3);
                        }
                        return;
                    }
                    return;
                }
            }
            A02(printWriter2, view2);
        } catch (Exception unused) {
            A02(printWriter2, view2);
        }
        str7 = null;
        try {
            if (!(view2 instanceof TextView)) {
            }
            printWriter2.print(" text=\"");
            printWriter2.print(A00(str7, 200));
            printWriter2.print("\"");
        } catch (Exception unused2) {
        }
        printWriter2.println("}");
        while (true) {
            if (cls != null) {
            }
            cls = cls.getSuperclass();
        }
        if (z2) {
        }
        boolean z32 = z;
        C04250Df r72 = this.A00;
        WebView webView2 = (WebView) view2;
        C04240De r32 = new C04240De(webView2);
        r72.A01.add(r32);
        webView2.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", new Object[]{Integer.valueOf(r32.A01), Integer.valueOf(r32.A02), Float.valueOf(webView2.getResources().getDisplayMetrics().scaledDensity)}), new AnonymousClass0Dd(r72, r32));
        if ((view2 instanceof ViewGroup) || (childCount = viewGroup.getChildCount()) > 0) {
        }
    }

    public static void A02(PrintWriter printWriter, View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            if (str.length() > 0) {
                printWriter.print(" app:tag/");
                printWriter.print(A00(str, 60));
            }
        }
    }
}
