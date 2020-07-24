package com.facebook.react.views.text;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Map;
import p000X.A1P;
import p000X.A1e;
import p000X.AMD;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C23043A0y;

public class ReactVirtualTextShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void ATE(Map map) {
        map.put("adjustsFontSizeToFit", "boolean");
        map.put("alignContent", "String");
        map.put("alignItems", "String");
        map.put("alignSelf", "String");
        map.put("allowFontScaling", "boolean");
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
        map.put("color", "Color");
        map.put("display", "String");
        map.put("end", "Dynamic");
        map.put("flex", "number");
        map.put("flexBasis", "Dynamic");
        map.put("flexDirection", "String");
        map.put("flexGrow", "number");
        map.put("flexShrink", "number");
        map.put("flexWrap", "String");
        map.put("fontFamily", "String");
        map.put("fontSize", "number");
        map.put("fontStyle", "String");
        map.put("fontVariant", "Array");
        map.put("fontWeight", "String");
        map.put(IgReactMediaPickerNativeModule.HEIGHT, "Dynamic");
        map.put("includeFontPadding", "boolean");
        map.put("justifyContent", "String");
        map.put("left", "Dynamic");
        map.put("letterSpacing", "number");
        map.put("lineHeight", "number");
        map.put("margin", "Dynamic");
        map.put("marginBottom", "Dynamic");
        map.put("marginEnd", "Dynamic");
        map.put("marginHorizontal", "Dynamic");
        map.put("marginLeft", "Dynamic");
        map.put("marginRight", "Dynamic");
        map.put("marginStart", "Dynamic");
        map.put("marginTop", "Dynamic");
        map.put("marginVertical", "Dynamic");
        map.put("maxFontSizeMultiplier", "number");
        map.put("maxHeight", "Dynamic");
        map.put("maxWidth", "Dynamic");
        map.put("minHeight", "Dynamic");
        map.put("minWidth", "Dynamic");
        map.put("minimumFontScale", "number");
        map.put("numberOfLines", "number");
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
        map.put("textAlign", "String");
        map.put("textBreakStrategy", "String");
        map.put("textDecorationLine", "String");
        map.put("textShadowColor", "Color");
        map.put("textShadowOffset", "Map");
        map.put("textShadowRadius", "number");
        map.put("textTransform", "String");
        map.put("top", "Dynamic");
        map.put(IgReactMediaPickerNativeModule.WIDTH, "Dynamic");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x024f, code lost:
        if (r13.equals("paddingRight") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025b, code lost:
        if (r13.equals("paddingStart") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0267, code lost:
        if (r13.equals("borderWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0273, code lost:
        if (r13.equals("position") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027f, code lost:
        if (r13.equals("minimumFontScale") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028b, code lost:
        if (r13.equals("marginRight") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0297, code lost:
        if (r13.equals("marginStart") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02a3, code lost:
        if (r13.equals("flexShrink") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ae, code lost:
        if (r13.equals("aspectRatio") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ba, code lost:
        if (r13.equals("textShadowOffset") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r13.equals("flexBasis") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c6, code lost:
        if (r13.equals("textShadowRadius") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d2, code lost:
        if (r13.equals("borderEndWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02dd, code lost:
        if (r13.equals("backgroundColor") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e9, code lost:
        if (r13.equals("onLayout") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02f5, code lost:
        if (r13.equals("textTransform") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0301, code lost:
        if (r13.equals("paddingVertical") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x030d, code lost:
        if (r13.equals("marginVertical") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0319, code lost:
        if (r13.equals("display") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0325, code lost:
        if (r13.equals("flexGrow") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0331, code lost:
        if (r13.equals("flexWrap") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r13.equals("textBreakStrategy") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x033c, code lost:
        if (r13.equals("alignSelf") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0348, code lost:
        if (r13.equals("justifyContent") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0354, code lost:
        if (r13.equals("marginLeft") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0360, code lost:
        if (r13.equals("fontVariant") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036c, code lost:
        if (r13.equals("includeFontPadding") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0378, code lost:
        if (r13.equals("textDecorationLine") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0384, code lost:
        if (r13.equals("letterSpacing") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0390, code lost:
        if (r13.equals("borderStartWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r13.equals("fontStyle") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r13.equals("paddingLeft") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r13.equals("borderTopWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r13.equals("adjustsFontSizeToFit") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r13.equals("bottom") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r13.equals("minWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        if (r13.equals("numberOfLines") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r13.equals("collapsable") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        if (r13.equals("borderBottomWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (r13.equals("fontFamily") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (r13.equals(com.instagram.react.modules.product.IgReactMediaPickerNativeModule.HEIGHT) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d2, code lost:
        if (r13.equals("margin") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r13.equals("textAlign") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e9, code lost:
        if (r13.equals("alignItems") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        if (r13.equals("marginEnd") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        if (r13.equals("marginTop") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010d, code lost:
        if (r13.equals("flexDirection") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0119, code lost:
        if (r13.equals("maxHeight") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
        if (r13.equals("padding") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0130, code lost:
        if (r13.equals("alignContent") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013c, code lost:
        if (r13.equals("fontWeight") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0148, code lost:
        if (r13.equals("lineHeight") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0153, code lost:
        if (r13.equals("allowFontScaling") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015f, code lost:
        if (r13.equals("paddingHorizontal") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        if (r13.equals("marginBottom") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0177, code lost:
        if (r13.equals("borderLeftWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0183, code lost:
        if (r13.equals("minHeight") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018f, code lost:
        if (r13.equals("end") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019b, code lost:
        if (r13.equals("top") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a7, code lost:
        if (r13.equals("flex") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b3, code lost:
        if (r13.equals("left") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01bf, code lost:
        if (r13.equals("paddingEnd") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cb, code lost:
        if (r13.equals("paddingTop") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r13.equals("borderRightWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d7, code lost:
        if (r13.equals("color") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e3, code lost:
        if (r13.equals("right") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ef, code lost:
        if (r13.equals("start") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fb, code lost:
        if (r13.equals(com.instagram.react.modules.product.IgReactMediaPickerNativeModule.WIDTH) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0207, code lost:
        if (r13.equals("paddingBottom") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0213, code lost:
        if (r13.equals("fontSize") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021f, code lost:
        if (r13.equals("maxWidth") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022b, code lost:
        if (r13.equals("overflow") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0237, code lost:
        if (r13.equals("maxFontSizeMultiplier") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0243, code lost:
        if (r13.equals("textShadowColor") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r13.equals("marginHorizontal") == false) goto L_0x001a;
     */
    public final void Bjr(ReactShadowNode reactShadowNode, String str, Object obj) {
        char c;
        int intValue;
        Object obj2 = obj;
        ReactVirtualTextShadowNode reactVirtualTextShadowNode = (ReactVirtualTextShadowNode) reactShadowNode;
        String str2 = str;
        int i = -1;
        boolean z = true;
        boolean z2 = false;
        switch (str2.hashCode()) {
            case -1971292586:
                c = 10;
                break;
            case -1906103182:
                c = '\'';
                break;
            case -1783760955:
                c = 20;
                break;
            case -1563136667:
                c = 'C';
                break;
            case -1550943582:
                c = 27;
                break;
            case -1501175880:
                c = ':';
                break;
            case -1452542531:
                c = 12;
                break;
            case -1386887134:
                c = 0;
                break;
            case -1383228885:
                c = 14;
                break;
            case -1375815020:
                c = '1';
                break;
            case -1329887265:
                c = '3';
                break;
            case -1325118190:
                c = 15;
                break;
            case -1290574193:
                c = 7;
                break;
            case -1224696685:
                c = 25;
                break;
            case -1221029593:
                c = 30;
                break;
            case -1081309778:
                c = '$';
                break;
            case -1065511464:
                c = 'B';
                break;
            case -1063257157:
                c = 2;
                break;
            case -1044806579:
                c = '&';
                break;
            case -1044792121:
                c = '+';
                break;
            case -975171706:
                c = 21;
                break;
            case -906066005:
                c = '.';
                break;
            case -806339567:
                c = '6';
                break;
            case -752601676:
                c = 1;
                break;
            case -734428249:
                c = 29;
                break;
            case -515807685:
                c = '#';
                break;
            case -407229137:
                c = 4;
                break;
            case -359890155:
                c = '9';
                break;
            case -289173127:
                c = '%';
                break;
            case -223992013:
                c = 9;
                break;
            case -133587431:
                c = '0';
                break;
            case 100571:
                c = 18;
                break;
            case 115029:
                c = 'I';
                break;
            case 3145721:
                c = 19;
                break;
            case 3317767:
                c = '!';
                break;
            case 90115850:
                c = '8';
                break;
            case 90130308:
                c = '=';
                break;
            case 94842723:
                c = 16;
                break;
            case 108511772:
                c = '@';
                break;
            case 109757538:
                c = 'A';
                break;
            case 113126854:
                c = 'J';
                break;
            case 202355100:
                c = '7';
                break;
            case 365601008:
                c = 26;
                break;
            case 400381634:
                c = '/';
                break;
            case 529642498:
                c = '5';
                break;
            case 548921173:
                c = '-';
                break;
            case 578735798:
                c = 'E';
                break;
            case 713848971:
                c = ';';
                break;
            case 715094737:
                c = '<';
                break;
            case 741115130:
                c = 13;
                break;
            case 747804969:
                c = '?';
                break;
            case 948643277:
                c = '2';
                break;
            case 975087886:
                c = ')';
                break;
            case 976333652:
                c = '*';
                break;
            case 1031115618:
                c = 23;
                break;
            case 1092174483:
                c = 5;
                break;
            case 1096003488:
                c = 'F';
                break;
            case 1177204639:
                c = 'G';
                break;
            case 1239020023:
                c = 8;
                break;
            case 1287124693:
                c = 6;
                break;
            case 1288688105:
                c = '4';
                break;
            case 1327548607:
                c = 'H';
                break;
            case 1343645351:
                c = '>';
                break;
            case 1431421764:
                c = ',';
                break;
            case 1671764162:
                c = 17;
                break;
            case 1743739820:
                c = 22;
                break;
            case 1744216035:
                c = 24;
                break;
            case 1767100401:
                c = 3;
                break;
            case 1860657097:
                c = ' ';
                break;
            case 1970934485:
                c = '(';
                break;
            case 2008872246:
                c = 28;
                break;
            case 2020113146:
                c = 31;
                break;
            case 2031616849:
                c = 'D';
                break;
            case 2111078717:
                c = '\"';
                break;
            case 2138173392:
                c = 11;
                break;
            default:
                c = 65535;
                break;
        }
        Integer num = null;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f2 = Float.NaN;
        switch (c) {
            case 0:
                if (obj != null) {
                    z2 = ((Boolean) obj2).booleanValue();
                }
                reactVirtualTextShadowNode.setAdjustFontSizeToFit(z2);
                return;
            case 1:
                reactVirtualTextShadowNode.setAlignContent((String) obj2);
                return;
            case 2:
                reactVirtualTextShadowNode.setAlignItems((String) obj2);
                return;
            case 3:
                reactVirtualTextShadowNode.setAlignSelf((String) obj2);
                return;
            case 4:
                if (obj != null) {
                    z = ((Boolean) obj2).booleanValue();
                }
                reactVirtualTextShadowNode.setAllowFontScaling(z);
                return;
            case 5:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setAspectRatio(f2);
                return;
            case 6:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, reactVirtualTextShadowNode.AY1()).intValue());
                }
                reactVirtualTextShadowNode.setBackgroundColor(num);
                return;
            case 7:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setBorderWidths(4, f2);
                return;
            case 8:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setBorderWidths(2, f2);
                return;
            case 9:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setBorderWidths(5, f2);
                return;
            case 10:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setBorderWidths(6, f2);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setBorderWidths(1, f2);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setBorderWidths(3, f2);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setBorderWidths(0, f2);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                reactVirtualTextShadowNode.setPositionValues(5, new A1P(obj2));
                return;
            case 16:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj2, reactVirtualTextShadowNode.AY1()).intValue());
                }
                reactVirtualTextShadowNode.setColor(num);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                reactVirtualTextShadowNode.setDisplay((String) obj2);
                return;
            case 18:
                reactVirtualTextShadowNode.setPositionValues(1, new A1P(obj2));
                return;
            case 19:
                if (obj != null) {
                    f = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setFlex(f);
                return;
            case 20:
                reactVirtualTextShadowNode.setFlexBasis(new A1P(obj2));
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                reactVirtualTextShadowNode.setFlexDirection((String) obj2);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                if (obj != null) {
                    f = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setFlexGrow(f);
                return;
            case 23:
                if (obj != null) {
                    f = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setFlexShrink(f);
                return;
            case 24:
                reactVirtualTextShadowNode.setFlexWrap((String) obj2);
                return;
            case 25:
                reactVirtualTextShadowNode.setFontFamily((String) obj2);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setFontSize(f2);
                return;
            case 27:
                reactVirtualTextShadowNode.setFontStyle((String) obj2);
                return;
            case 28:
                reactVirtualTextShadowNode.setFontVariant((A1e) obj2);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                reactVirtualTextShadowNode.setFontWeight((String) obj2);
                return;
            case 30:
                reactVirtualTextShadowNode.setHeight(new A1P(obj2));
                return;
            case 31:
                if (obj != null) {
                    z = ((Boolean) obj2).booleanValue();
                }
                reactVirtualTextShadowNode.setIncludeFontPadding(z);
                return;
            case ' ':
                reactVirtualTextShadowNode.setJustifyContent((String) obj2);
                return;
            case '!':
                reactVirtualTextShadowNode.setPositionValues(2, new A1P(obj2));
                return;
            case '\"':
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setLetterSpacing(f2);
                return;
            case '#':
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setLineHeight(f2);
                return;
            case '$':
                reactVirtualTextShadowNode.setMargins(0, new A1P(obj2));
                return;
            case '%':
                reactVirtualTextShadowNode.setMargins(6, new A1P(obj2));
                return;
            case '&':
                reactVirtualTextShadowNode.setMargins(4, new A1P(obj2));
                return;
            case '\'':
                reactVirtualTextShadowNode.setMargins(2, new A1P(obj2));
                return;
            case '(':
                reactVirtualTextShadowNode.setMargins(7, new A1P(obj2));
                return;
            case ')':
                reactVirtualTextShadowNode.setMargins(8, new A1P(obj2));
                return;
            case '*':
                reactVirtualTextShadowNode.setMargins(3, new A1P(obj2));
                return;
            case '+':
                reactVirtualTextShadowNode.setMargins(5, new A1P(obj2));
                return;
            case ',':
                reactVirtualTextShadowNode.setMargins(1, new A1P(obj2));
                return;
            case '-':
                if (obj != null) {
                    f2 = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setMaxFontSizeMultiplier(f2);
                return;
            case '.':
                reactVirtualTextShadowNode.setMaxHeight(new A1P(obj2));
                return;
            case '/':
                reactVirtualTextShadowNode.setMaxWidth(new A1P(obj2));
                return;
            case '0':
                reactVirtualTextShadowNode.setMinHeight(new A1P(obj2));
                return;
            case '1':
                reactVirtualTextShadowNode.setMinWidth(new A1P(obj2));
                return;
            case AMD.MAX_LIKES_PER_FETCH:
                if (obj != null) {
                    f = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setMinimumFontScale(f);
                return;
            case '3':
                if (obj != null) {
                    i = ((Double) obj2).intValue();
                }
                reactVirtualTextShadowNode.setNumberOfLines(i);
                return;
            case '4':
                if (obj != null) {
                    z2 = ((Boolean) obj2).booleanValue();
                }
                reactVirtualTextShadowNode.A08 = z2;
                return;
            case '5':
                reactVirtualTextShadowNode.setOverflow((String) obj2);
                return;
            case '6':
                reactVirtualTextShadowNode.setPaddings(0, new A1P(obj2));
                return;
            case '7':
                reactVirtualTextShadowNode.setPaddings(6, new A1P(obj2));
                return;
            case '8':
                reactVirtualTextShadowNode.setPaddings(4, new A1P(obj2));
                return;
            case '9':
                reactVirtualTextShadowNode.setPaddings(2, new A1P(obj2));
                return;
            case ':':
                reactVirtualTextShadowNode.setPaddings(7, new A1P(obj2));
                return;
            case ';':
                reactVirtualTextShadowNode.setPaddings(8, new A1P(obj2));
                return;
            case '<':
                reactVirtualTextShadowNode.setPaddings(3, new A1P(obj2));
                return;
            case '=':
                reactVirtualTextShadowNode.setPaddings(5, new A1P(obj2));
                return;
            case '>':
                reactVirtualTextShadowNode.setPaddings(1, new A1P(obj2));
                return;
            case '?':
                reactVirtualTextShadowNode.setPosition((String) obj2);
                return;
            case '@':
                reactVirtualTextShadowNode.setPositionValues(3, new A1P(obj2));
                return;
            case 'A':
                reactVirtualTextShadowNode.setPositionValues(0, new A1P(obj2));
                return;
            case 'B':
                reactVirtualTextShadowNode.setTextAlign((String) obj2);
                return;
            case 'C':
                reactVirtualTextShadowNode.setTextBreakStrategy((String) obj2);
                return;
            case 'D':
                reactVirtualTextShadowNode.setTextDecorationLine((String) obj2);
                return;
            case 'E':
                if (obj == null) {
                    intValue = 1426063360;
                } else {
                    intValue = C206578th.A00(obj2, reactVirtualTextShadowNode.AY1()).intValue();
                }
                reactVirtualTextShadowNode.setTextShadowColor(intValue);
                return;
            case 'F':
                reactVirtualTextShadowNode.setTextShadowOffset((C23043A0y) obj2);
                return;
            case 'G':
                if (obj != null) {
                    f = ((Double) obj2).floatValue();
                }
                reactVirtualTextShadowNode.setTextShadowRadius(f);
                return;
            case 'H':
                reactVirtualTextShadowNode.setTextTransform((String) obj2);
                return;
            case 'I':
                reactVirtualTextShadowNode.setPositionValues(4, new A1P(obj2));
                return;
            case 'J':
                reactVirtualTextShadowNode.setWidth(new A1P(obj2));
                return;
            default:
                return;
        }
    }
}
