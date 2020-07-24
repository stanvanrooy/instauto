package com.facebook.react.views.view;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A1e;
import p000X.AMD;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C23043A0y;
import p000X.C23081A5s;

public class ReactViewManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void ATE(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        map.put("accessible", "boolean");
        map.put("backfaceVisibility", "String");
        map.put("backgroundColor", "Color");
        map.put("borderBottomColor", "Color");
        map.put("borderBottomEndRadius", "number");
        map.put("borderBottomLeftRadius", "number");
        map.put("borderBottomRightRadius", "number");
        map.put("borderBottomStartRadius", "number");
        map.put("borderBottomWidth", "number");
        map.put("borderColor", "Color");
        map.put("borderEndColor", "Color");
        map.put("borderEndWidth", "number");
        map.put("borderLeftColor", "Color");
        map.put("borderLeftWidth", "number");
        map.put("borderRadius", "number");
        map.put("borderRightColor", "Color");
        map.put("borderRightWidth", "number");
        map.put("borderStartColor", "Color");
        map.put("borderStartWidth", "number");
        map.put("borderStyle", "String");
        map.put("borderTopColor", "Color");
        map.put("borderTopEndRadius", "number");
        map.put("borderTopLeftRadius", "number");
        map.put("borderTopRightRadius", "number");
        map.put("borderTopStartRadius", "number");
        map.put("borderTopWidth", "number");
        map.put("borderWidth", "number");
        map.put("collapsable", "boolean");
        map.put("elevation", "number");
        map.put("focusable", "boolean");
        map.put("hasTVPreferredFocus", "boolean");
        map.put("hitSlop", "Map");
        map.put("importantForAccessibility", "String");
        map.put("nativeBackgroundAndroid", "Map");
        map.put("nativeForegroundAndroid", "Map");
        map.put("nativeID", "String");
        map.put("needsOffscreenAlphaCompositing", "boolean");
        map.put("nextFocusDown", "number");
        map.put("nextFocusForward", "number");
        map.put("nextFocusLeft", "number");
        map.put("nextFocusRight", "number");
        map.put("nextFocusUp", "number");
        map.put("opacity", "number");
        map.put("overflow", "String");
        map.put("pointerEvents", "String");
        map.put("removeClippedSubviews", "boolean");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("testID", "String");
        map.put("transform", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("zIndex", "number");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025a, code lost:
        if (r14.equals("accessibilityLabel") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0266, code lost:
        if (r14.equals("accessibilityState") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0272, code lost:
        if (r14.equals("accessibilityValue") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027e, code lost:
        if (r14.equals("borderEndColor") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028a, code lost:
        if (r14.equals("borderEndWidth") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0296, code lost:
        if (r14.equals("backgroundColor") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a2, code lost:
        if (r14.equals("borderRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ae, code lost:
        if (r14.equals("accessibilityActions") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ba, code lost:
        if (r14.equals("focusable") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c6, code lost:
        if (r14.equals("needsOffscreenAlphaCompositing") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r14.equals("translateX") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d2, code lost:
        if (r14.equals("nativeBackgroundAndroid") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02de, code lost:
        if (r14.equals("nextFocusRight") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ea, code lost:
        if (r14.equals("nativeID") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02f6, code lost:
        if (r14.equals("borderStartColor") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0302, code lost:
        if (r14.equals("borderStartWidth") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r14.equals("translateY") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r14.equals("backfaceVisibility") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r14.equals("borderTopColor") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r14.equals("borderTopWidth") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r14.equals("collapsable") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r14.equals("borderBottomColor") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r14.equals("borderBottomWidth") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r14.equals("opacity") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (r14.equals("borderTopLeftRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        if (r14.equals("accessible") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        if (r14.equals("borderTopStartRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        if (r14.equals("scaleX") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        if (r14.equals("scaleY") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r14.equals("testID") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        if (r14.equals("borderBottomStartRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
        if (r14.equals("zIndex") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010a, code lost:
        if (r14.equals("hasTVPreferredFocus") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0116, code lost:
        if (r14.equals("nextFocusDown") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0122, code lost:
        if (r14.equals("nextFocusLeft") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012e, code lost:
        if (r14.equals("borderTopEndRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013a, code lost:
        if (r14.equals("pointerEvents") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
        if (r14.equals("removeClippedSubviews") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        if (r14.equals("borderLeftColor") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015e, code lost:
        if (r14.equals("borderLeftWidth") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016a, code lost:
        if (r14.equals("borderBottomEndRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        if (r14.equals("nativeForegroundAndroid") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0182, code lost:
        if (r14.equals("accessibilityHint") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018e, code lost:
        if (r14.equals("accessibilityRole") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019a, code lost:
        if (r14.equals("renderToHardwareTextureAndroid") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a6, code lost:
        if (r14.equals("rotation") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b2, code lost:
        if (r14.equals("elevation") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01be, code lost:
        if (r14.equals("accessibilityLiveRegion") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ca, code lost:
        if (r14.equals("borderTopRightRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d6, code lost:
        if (r14.equals("nextFocusForward") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r14.equals("borderRightColor") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e2, code lost:
        if (r14.equals("overflow") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ee, code lost:
        if (r14.equals("borderBottomLeftRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fa, code lost:
        if (r14.equals("borderBottomRightRadius") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0206, code lost:
        if (r14.equals("nextFocusUp") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0212, code lost:
        if (r14.equals("borderColor") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021e, code lost:
        if (r14.equals("borderStyle") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
        if (r14.equals("borderWidth") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0236, code lost:
        if (r14.equals("importantForAccessibility") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0242, code lost:
        if (r14.equals("hitSlop") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x024e, code lost:
        if (r14.equals("transform") == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r14.equals("borderRightWidth") == false) goto L_0x001e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        Object obj2 = obj;
        ReactViewManager reactViewManager = (ReactViewManager) viewManager;
        C23081A5s a5s = (C23081A5s) view;
        String str2 = str;
        int i = -1;
        boolean z = false;
        switch (str2.hashCode()) {
            case -1989576717:
                c = 22;
                break;
            case -1971292586:
                c = 23;
                break;
            case -1721943862:
                c = ';';
                break;
            case -1721943861:
                c = '<';
                break;
            case -1697814026:
                c = 8;
                break;
            case -1470826662:
                c = 27;
                break;
            case -1452542531:
                c = ' ';
                break;
            case -1325118190:
                c = '\"';
                break;
            case -1308858324:
                c = 10;
                break;
            case -1290574193:
                c = 15;
                break;
            case -1267206133:
                c = '1';
                break;
            case -1228066334:
                c = 29;
                break;
            case -1141400650:
                c = 7;
                break;
            case -1122140597:
                c = 31;
                break;
            case -908189618:
                c = '7';
                break;
            case -908189617:
                c = '8';
                break;
            case -877170387:
                c = '9';
                break;
            case -867333731:
                c = 14;
                break;
            case -731417480:
                c = '=';
                break;
            case -679581037:
                c = '%';
                break;
            case -631506969:
                c = ',';
                break;
            case -631278772:
                c = '.';
                break;
            case -483490364:
                c = 28;
                break;
            case -293492298:
                c = '3';
                break;
            case -252105751:
                c = '4';
                break;
            case -242276144:
                c = 19;
                break;
            case -223992013:
                c = 20;
                break;
            case -148030058:
                c = 11;
                break;
            case -109689771:
                c = ')';
                break;
            case -101663499:
                c = 1;
                break;
            case -101359900:
                c = 4;
                break;
            case -80891667:
                c = '5';
                break;
            case -40300674:
                c = '6';
                break;
            case -4379043:
                c = '#';
                break;
            case 36255470:
                c = 3;
                break;
            case 333432965:
                c = 30;
                break;
            case 503397728:
                c = '-';
                break;
            case 529642498:
                c = '2';
                break;
            case 581268560:
                c = 12;
                break;
            case 588239831:
                c = 13;
                break;
            case 660795168:
                c = '0';
                break;
            case 722830999:
                c = 16;
                break;
            case 737768677:
                c = 26;
                break;
            case 741115130:
                c = '!';
                break;
            case 746986311:
                c = '\'';
                break;
            case 926871597:
                c = '&';
                break;
            case 1052666732:
                c = ':';
                break;
            case 1146842694:
                c = 2;
                break;
            case 1153872867:
                c = 5;
                break;
            case 1156088003:
                c = 6;
                break;
            case 1220735892:
                c = 17;
                break;
            case 1239020023:
                c = 18;
                break;
            case 1287124693:
                c = 9;
                break;
            case 1349188574:
                c = 21;
                break;
            case 1505602511:
                c = 0;
                break;
            case 1629011506:
                c = '$';
                break;
            case 1667773924:
                c = '+';
                break;
            case 1747724810:
                c = '(';
                break;
            case 1910855543:
                c = '/';
                break;
            case 2045685618:
                c = '*';
                break;
            case 2119889261:
                c = 24;
                break;
            case 2138173392:
                c = 25;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        Integer num = null;
        switch (c) {
            case 0:
                reactViewManager.setAccessibilityActions(a5s, (A1e) obj2);
                return;
            case 1:
                reactViewManager.setAccessibilityHint(a5s, (String) obj2);
                return;
            case 2:
                reactViewManager.setAccessibilityLabel(a5s, (String) obj2);
                return;
            case 3:
                reactViewManager.setAccessibilityLiveRegion(a5s, (String) obj2);
                return;
            case 4:
                reactViewManager.setAccessibilityRole(a5s, (String) obj2);
                return;
            case 5:
                reactViewManager.setViewState(a5s, (C23043A0y) obj2);
                return;
            case 6:
                reactViewManager.setAccessibilityValue(a5s, (C23043A0y) obj2);
                return;
            case 7:
                if (obj != null) {
                    z = ((Boolean) obj2).booleanValue();
                }
                a5s.setFocusable(z);
                return;
            case 8:
                a5s.setBackfaceVisibility((String) obj2);
                return;
            case 9:
                if (obj != null) {
                    z = C206578th.A00(obj2, a5s.getContext()).intValue();
                }
                reactViewManager.setBackgroundColor(a5s, z);
                return;
            case 10:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, a5s.getContext()).intValue());
                }
                reactViewManager.setBorderColor(a5s, 4, num);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                float f3 = Float.NaN;
                if (obj != null) {
                    f3 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 8, f3);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                float f4 = Float.NaN;
                if (obj != null) {
                    f4 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 4, f4);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                float f5 = Float.NaN;
                if (obj != null) {
                    f5 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 3, f5);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                float f6 = Float.NaN;
                if (obj != null) {
                    f6 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 7, f6);
                return;
            case 15:
                float f7 = Float.NaN;
                if (obj != null) {
                    f7 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderWidth(a5s, 4, f7);
                return;
            case 16:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, a5s.getContext()).intValue());
                }
                reactViewManager.setBorderColor(a5s, 0, num);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, a5s.getContext()).intValue());
                }
                reactViewManager.setBorderColor(a5s, 6, num);
                return;
            case 18:
                float f8 = Float.NaN;
                if (obj != null) {
                    f8 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderWidth(a5s, 6, f8);
                return;
            case 19:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, a5s.getContext()).intValue());
                }
                reactViewManager.setBorderColor(a5s, 1, num);
                return;
            case 20:
                float f9 = Float.NaN;
                if (obj != null) {
                    f9 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderWidth(a5s, 1, f9);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                float f10 = Float.NaN;
                if (obj != null) {
                    f10 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 0, f10);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, a5s.getContext()).intValue());
                }
                reactViewManager.setBorderColor(a5s, 2, num);
                return;
            case 23:
                float f11 = Float.NaN;
                if (obj != null) {
                    f11 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderWidth(a5s, 2, f11);
                return;
            case 24:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, a5s.getContext()).intValue());
                }
                reactViewManager.setBorderColor(a5s, 5, num);
                return;
            case 25:
                float f12 = Float.NaN;
                if (obj != null) {
                    f12 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderWidth(a5s, 5, f12);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                a5s.setBorderStyle((String) obj2);
                return;
            case 27:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, a5s.getContext()).intValue());
                }
                reactViewManager.setBorderColor(a5s, 3, num);
                return;
            case 28:
                float f13 = Float.NaN;
                if (obj != null) {
                    f13 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 6, f13);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                float f14 = Float.NaN;
                if (obj != null) {
                    f14 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 1, f14);
                return;
            case 30:
                float f15 = Float.NaN;
                if (obj != null) {
                    f15 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 2, f15);
                return;
            case 31:
                float f16 = Float.NaN;
                if (obj != null) {
                    f16 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderRadius(a5s, 5, f16);
                return;
            case ' ':
                float f17 = Float.NaN;
                if (obj != null) {
                    f17 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderWidth(a5s, 3, f17);
                return;
            case '!':
                float f18 = Float.NaN;
                if (obj != null) {
                    f18 = ((Double) obj2).floatValue();
                }
                reactViewManager.setBorderWidth(a5s, 0, f18);
                return;
            case '#':
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactViewManager.setElevation(a5s, f2);
                return;
            case '$':
                if (obj != null) {
                    z = ((Boolean) obj2).booleanValue();
                }
                reactViewManager.setFocusable(a5s, z);
                return;
            case '%':
                if (obj != null) {
                    z = ((Boolean) obj2).booleanValue();
                }
                reactViewManager.setTVPreferredFocus(a5s, z);
                return;
            case '&':
                reactViewManager.setHitSlop(a5s, (C23043A0y) obj2);
                return;
            case '\'':
                reactViewManager.setImportantForAccessibility(a5s, (String) obj2);
                return;
            case '(':
                reactViewManager.setNativeBackground(a5s, (C23043A0y) obj2);
                return;
            case ')':
                reactViewManager.setNativeForeground(a5s, (C23043A0y) obj2);
                return;
            case '*':
                reactViewManager.setNativeId(a5s, (String) obj2);
                return;
            case '+':
                if (obj != null) {
                    z = ((Boolean) obj2).booleanValue();
                }
                a5s.A09 = z;
                return;
            case ',':
                if (obj != null) {
                    i = ((Double) obj2).intValue();
                }
                a5s.setNextFocusDownId(i);
                return;
            case '-':
                if (obj != null) {
                    i = ((Double) obj2).intValue();
                }
                a5s.setNextFocusForwardId(i);
                return;
            case '.':
                if (obj != null) {
                    i = ((Double) obj2).intValue();
                }
                a5s.setNextFocusLeftId(i);
                return;
            case '/':
                if (obj != null) {
                    i = ((Double) obj2).intValue();
                }
                a5s.setNextFocusRightId(i);
                return;
            case '0':
                if (obj != null) {
                    i = ((Double) obj2).intValue();
                }
                a5s.setNextFocusUpId(i);
                return;
            case '1':
                if (obj != null) {
                    f = ((Double) obj2).floatValue();
                }
                a5s.setOpacityIfPossible(f);
                return;
            case AMD.MAX_LIKES_PER_FETCH:
                a5s.setOverflow((String) obj2);
                return;
            case '3':
                reactViewManager.setPointerEvents(a5s, (String) obj2);
                return;
            case '4':
                if (obj != null) {
                    z = ((Boolean) obj2).booleanValue();
                }
                reactViewManager.setRemoveClippedSubviews(a5s, z);
                return;
            case '5':
                if (obj != null) {
                    z = ((Boolean) obj2).booleanValue();
                }
                reactViewManager.setRenderToHardwareTexture(a5s, z);
                return;
            case '6':
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                a5s.setRotation(f2);
                return;
            case '7':
                if (obj != null) {
                    f = ((Double) obj2).floatValue();
                }
                a5s.setScaleX(f);
                return;
            case '8':
                if (obj != null) {
                    f = ((Double) obj2).floatValue();
                }
                a5s.setScaleY(f);
                return;
            case '9':
                reactViewManager.setTestId(a5s, (String) obj2);
                return;
            case ':':
                reactViewManager.setTransform(a5s, (A1e) obj2);
                return;
            case ';':
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactViewManager.setTranslateX(a5s, f2);
                return;
            case '<':
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactViewManager.setTranslateY(a5s, f2);
                return;
            case '=':
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactViewManager.setZIndex(a5s, f2);
                return;
            default:
                return;
        }
    }
}
