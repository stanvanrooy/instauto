package com.facebook.catalyst.views.art;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Map;
import p000X.A1P;
import p000X.AMD;
import p000X.C120125Dh;
import p000X.C206578th;

public class ARTSurfaceViewShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void ATE(Map map) {
        map.put("alignContent", "String");
        map.put("alignItems", "String");
        map.put("alignSelf", "String");
        map.put("aspectRatio", "number");
        map.put("backgroundColor", "Color");
        map.put("borderBottomWidth", "number");
        map.put("borderEndWidth", "number");
        map.put("borderLeftWidth", "number");
        map.put("borderRightWidth", "number");
        map.put("borderStartWidth", "number");
        map.put("borderTopWidth", "number");
        map.put("borderWidth", "number");
        map.put("bottom", "Dynamic");
        map.put("collapsable", "boolean");
        map.put("display", "String");
        map.put("end", "Dynamic");
        map.put("flex", "number");
        map.put("flexBasis", "Dynamic");
        map.put("flexDirection", "String");
        map.put("flexGrow", "number");
        map.put("flexShrink", "number");
        map.put("flexWrap", "String");
        map.put(IgReactMediaPickerNativeModule.HEIGHT, "Dynamic");
        map.put("justifyContent", "String");
        map.put("left", "Dynamic");
        map.put("margin", "Dynamic");
        map.put("marginBottom", "Dynamic");
        map.put("marginEnd", "Dynamic");
        map.put("marginHorizontal", "Dynamic");
        map.put("marginLeft", "Dynamic");
        map.put("marginRight", "Dynamic");
        map.put("marginStart", "Dynamic");
        map.put("marginTop", "Dynamic");
        map.put("marginVertical", "Dynamic");
        map.put("maxHeight", "Dynamic");
        map.put("maxWidth", "Dynamic");
        map.put("minHeight", "Dynamic");
        map.put("minWidth", "Dynamic");
        map.put("onLayout", "boolean");
        map.put("overflow", "String");
        map.put("padding", "Dynamic");
        map.put("paddingBottom", "Dynamic");
        map.put("paddingEnd", "Dynamic");
        map.put("paddingHorizontal", "Dynamic");
        map.put("paddingLeft", "Dynamic");
        map.put("paddingRight", "Dynamic");
        map.put("paddingStart", "Dynamic");
        map.put("paddingTop", "Dynamic");
        map.put("paddingVertical", "Dynamic");
        map.put("position", "String");
        map.put("right", "Dynamic");
        map.put("start", "Dynamic");
        map.put("top", "Dynamic");
        map.put(IgReactMediaPickerNativeModule.WIDTH, "Dynamic");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0245, code lost:
        if (r14.equals("display") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0251, code lost:
        if (r14.equals("flexGrow") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025d, code lost:
        if (r14.equals("flexWrap") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0268, code lost:
        if (r14.equals("alignSelf") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0274, code lost:
        if (r14.equals("justifyContent") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0280, code lost:
        if (r14.equals("marginLeft") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028c, code lost:
        if (r14.equals("borderStartWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r14.equals("flexBasis") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r14.equals("paddingLeft") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r14.equals("borderTopWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r14.equals("bottom") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r14.equals("minWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r14.equals("collapsable") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r14.equals("borderBottomWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r14.equals(com.instagram.react.modules.product.IgReactMediaPickerNativeModule.HEIGHT) == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r14.equals("margin") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r14.equals("alignItems") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        if (r14.equals("marginEnd") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        if (r14.equals("marginTop") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (r14.equals("flexDirection") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ca, code lost:
        if (r14.equals("maxHeight") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r14.equals("padding") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (r14.equals("alignContent") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        if (r14.equals("paddingHorizontal") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f9, code lost:
        if (r14.equals("marginBottom") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        if (r14.equals("borderLeftWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0110, code lost:
        if (r14.equals("minHeight") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
        if (r14.equals("end") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0128, code lost:
        if (r14.equals("top") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0134, code lost:
        if (r14.equals("flex") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        if (r14.equals("left") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014c, code lost:
        if (r14.equals("paddingEnd") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0158, code lost:
        if (r14.equals("paddingTop") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        if (r14.equals("right") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0170, code lost:
        if (r14.equals("start") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017c, code lost:
        if (r14.equals(com.instagram.react.modules.product.IgReactMediaPickerNativeModule.WIDTH) == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0188, code lost:
        if (r14.equals("paddingBottom") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0194, code lost:
        if (r14.equals("maxWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a0, code lost:
        if (r14.equals("overflow") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ac, code lost:
        if (r14.equals("paddingRight") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b8, code lost:
        if (r14.equals("paddingStart") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c4, code lost:
        if (r14.equals("borderWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r14.equals("borderRightWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d0, code lost:
        if (r14.equals("position") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dc, code lost:
        if (r14.equals("marginRight") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
        if (r14.equals("marginStart") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f4, code lost:
        if (r14.equals("flexShrink") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ff, code lost:
        if (r14.equals("aspectRatio") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020a, code lost:
        if (r14.equals("borderEndWidth") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0215, code lost:
        if (r14.equals("backgroundColor") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0221, code lost:
        if (r14.equals("onLayout") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022d, code lost:
        if (r14.equals("paddingVertical") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0239, code lost:
        if (r14.equals("marginVertical") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r14.equals("marginHorizontal") == false) goto L_0x0013;
     */
    public final void Bjr(ReactShadowNode reactShadowNode, String str, Object obj) {
        char c;
        Integer valueOf;
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = (ARTSurfaceViewShadowNode) reactShadowNode;
        boolean z = false;
        switch (str.hashCode()) {
            case -1971292586:
                c = 8;
                break;
            case -1906103182:
                c = 28;
                break;
            case -1783760955:
                c = 17;
                break;
            case -1501175880:
                c = ',';
                break;
            case -1452542531:
                c = 10;
                break;
            case -1383228885:
                c = 12;
                break;
            case -1375815020:
                c = '%';
                break;
            case -1325118190:
                c = 13;
                break;
            case -1290574193:
                c = 5;
                break;
            case -1221029593:
                c = 22;
                break;
            case -1081309778:
                c = 25;
                break;
            case -1063257157:
                c = 1;
                break;
            case -1044806579:
                c = 27;
                break;
            case -1044792121:
                c = ' ';
                break;
            case -975171706:
                c = 18;
                break;
            case -906066005:
                c = '\"';
                break;
            case -806339567:
                c = '(';
                break;
            case -752601676:
                c = 0;
                break;
            case -359890155:
                c = '+';
                break;
            case -289173127:
                c = 26;
                break;
            case -223992013:
                c = 7;
                break;
            case -133587431:
                c = '$';
                break;
            case 100571:
                c = 15;
                break;
            case 115029:
                c = '4';
                break;
            case 3145721:
                c = 16;
                break;
            case 3317767:
                c = 24;
                break;
            case 90115850:
                c = '*';
                break;
            case 90130308:
                c = '/';
                break;
            case 108511772:
                c = '2';
                break;
            case 109757538:
                c = '3';
                break;
            case 113126854:
                c = '5';
                break;
            case 202355100:
                c = ')';
                break;
            case 400381634:
                c = '#';
                break;
            case 529642498:
                c = '\'';
                break;
            case 713848971:
                c = '-';
                break;
            case 715094737:
                c = '.';
                break;
            case 741115130:
                c = 11;
                break;
            case 747804969:
                c = '1';
                break;
            case 975087886:
                c = 30;
                break;
            case 976333652:
                c = 31;
                break;
            case 1031115618:
                c = 20;
                break;
            case 1092174483:
                c = 3;
                break;
            case 1239020023:
                c = 6;
                break;
            case 1287124693:
                c = 4;
                break;
            case 1288688105:
                c = '&';
                break;
            case 1343645351:
                c = '0';
                break;
            case 1431421764:
                c = '!';
                break;
            case 1671764162:
                c = 14;
                break;
            case 1743739820:
                c = 19;
                break;
            case 1744216035:
                c = 21;
                break;
            case 1767100401:
                c = 2;
                break;
            case 1860657097:
                c = 23;
                break;
            case 1970934485:
                c = 29;
                break;
            case 2138173392:
                c = 9;
                break;
            default:
                c = 65535;
                break;
        }
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f2 = Float.NaN;
        switch (c) {
            case 0:
                aRTSurfaceViewShadowNode.setAlignContent((String) obj);
                return;
            case 1:
                aRTSurfaceViewShadowNode.setAlignItems((String) obj);
                return;
            case 2:
                aRTSurfaceViewShadowNode.setAlignSelf((String) obj);
                return;
            case 3:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setAspectRatio(f2);
                return;
            case 4:
                if (obj == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(C206578th.A00(obj, aRTSurfaceViewShadowNode.AY1()).intValue());
                }
                aRTSurfaceViewShadowNode.setBackgroundColor(valueOf);
                return;
            case 5:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setBorderWidths(4, f2);
                return;
            case 6:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setBorderWidths(2, f2);
                return;
            case 7:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setBorderWidths(5, f2);
                return;
            case 8:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setBorderWidths(6, f2);
                return;
            case 9:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setBorderWidths(1, f2);
                return;
            case 10:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setBorderWidths(3, f2);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setBorderWidths(0, f2);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                aRTSurfaceViewShadowNode.setPositionValues(5, new A1P(obj));
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                aRTSurfaceViewShadowNode.setDisplay((String) obj);
                return;
            case 15:
                aRTSurfaceViewShadowNode.setPositionValues(1, new A1P(obj));
                return;
            case 16:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setFlex(f);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                aRTSurfaceViewShadowNode.setFlexBasis(new A1P(obj));
                return;
            case 18:
                aRTSurfaceViewShadowNode.setFlexDirection((String) obj);
                return;
            case 19:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setFlexGrow(f);
                return;
            case 20:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aRTSurfaceViewShadowNode.setFlexShrink(f);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                aRTSurfaceViewShadowNode.setFlexWrap((String) obj);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                aRTSurfaceViewShadowNode.setHeight(new A1P(obj));
                return;
            case 23:
                aRTSurfaceViewShadowNode.setJustifyContent((String) obj);
                return;
            case 24:
                aRTSurfaceViewShadowNode.setPositionValues(2, new A1P(obj));
                return;
            case 25:
                aRTSurfaceViewShadowNode.setMargins(0, new A1P(obj));
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                aRTSurfaceViewShadowNode.setMargins(6, new A1P(obj));
                return;
            case 27:
                aRTSurfaceViewShadowNode.setMargins(4, new A1P(obj));
                return;
            case 28:
                aRTSurfaceViewShadowNode.setMargins(2, new A1P(obj));
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                aRTSurfaceViewShadowNode.setMargins(7, new A1P(obj));
                return;
            case 30:
                aRTSurfaceViewShadowNode.setMargins(8, new A1P(obj));
                return;
            case 31:
                aRTSurfaceViewShadowNode.setMargins(3, new A1P(obj));
                return;
            case ' ':
                aRTSurfaceViewShadowNode.setMargins(5, new A1P(obj));
                return;
            case '!':
                aRTSurfaceViewShadowNode.setMargins(1, new A1P(obj));
                return;
            case '\"':
                aRTSurfaceViewShadowNode.setMaxHeight(new A1P(obj));
                return;
            case '#':
                aRTSurfaceViewShadowNode.setMaxWidth(new A1P(obj));
                return;
            case '$':
                aRTSurfaceViewShadowNode.setMinHeight(new A1P(obj));
                return;
            case '%':
                aRTSurfaceViewShadowNode.setMinWidth(new A1P(obj));
                return;
            case '&':
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                aRTSurfaceViewShadowNode.A08 = z;
                return;
            case '\'':
                aRTSurfaceViewShadowNode.setOverflow((String) obj);
                return;
            case '(':
                aRTSurfaceViewShadowNode.setPaddings(0, new A1P(obj));
                return;
            case ')':
                aRTSurfaceViewShadowNode.setPaddings(6, new A1P(obj));
                return;
            case '*':
                aRTSurfaceViewShadowNode.setPaddings(4, new A1P(obj));
                return;
            case '+':
                aRTSurfaceViewShadowNode.setPaddings(2, new A1P(obj));
                return;
            case ',':
                aRTSurfaceViewShadowNode.setPaddings(7, new A1P(obj));
                return;
            case '-':
                aRTSurfaceViewShadowNode.setPaddings(8, new A1P(obj));
                return;
            case '.':
                aRTSurfaceViewShadowNode.setPaddings(3, new A1P(obj));
                return;
            case '/':
                aRTSurfaceViewShadowNode.setPaddings(5, new A1P(obj));
                return;
            case '0':
                aRTSurfaceViewShadowNode.setPaddings(1, new A1P(obj));
                return;
            case '1':
                aRTSurfaceViewShadowNode.setPosition((String) obj);
                return;
            case AMD.MAX_LIKES_PER_FETCH:
                aRTSurfaceViewShadowNode.setPositionValues(3, new A1P(obj));
                return;
            case '3':
                aRTSurfaceViewShadowNode.setPositionValues(0, new A1P(obj));
                return;
            case '4':
                aRTSurfaceViewShadowNode.setPositionValues(4, new A1P(obj));
                return;
            case '5':
                aRTSurfaceViewShadowNode.setWidth(new A1P(obj));
                return;
            default:
                return;
        }
    }
}
