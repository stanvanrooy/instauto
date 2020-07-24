package com.facebook.react.views.textinput;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A1P;
import p000X.A1e;
import p000X.AMD;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C230139zI;
import p000X.C23043A0y;

public class ReactTextInputManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void ATE(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        map.put("allowFontScaling", "boolean");
        map.put("autoCapitalize", "Dynamic");
        map.put("autoCompleteType", "String");
        map.put("autoCorrect", "boolean");
        map.put("autoFocus", "boolean");
        map.put("backgroundColor", "Color");
        map.put("blurOnSubmit", "boolean");
        map.put("borderBottomColor", "Color");
        map.put("borderBottomLeftRadius", "number");
        map.put("borderBottomRightRadius", "number");
        map.put("borderBottomWidth", "number");
        map.put("borderColor", "Color");
        map.put("borderLeftColor", "Color");
        map.put("borderLeftWidth", "number");
        map.put("borderRadius", "number");
        map.put("borderRightColor", "Color");
        map.put("borderRightWidth", "number");
        map.put("borderStyle", "String");
        map.put("borderTopColor", "Color");
        map.put("borderTopLeftRadius", "number");
        map.put("borderTopRightRadius", "number");
        map.put("borderTopWidth", "number");
        map.put("borderWidth", "number");
        map.put("caretHidden", "boolean");
        map.put("color", "Color");
        map.put("contextMenuHidden", "boolean");
        map.put("cursorColor", "Color");
        map.put("disableFullscreenUI", "boolean");
        map.put("editable", "boolean");
        map.put("elevation", "number");
        map.put("fontFamily", "String");
        map.put("fontSize", "number");
        map.put("fontStyle", "String");
        map.put("fontWeight", "String");
        map.put("importantForAccessibility", "String");
        map.put("importantForAutofill", "String");
        map.put("includeFontPadding", "boolean");
        map.put("inlineImageLeft", "String");
        map.put("inlineImagePadding", "number");
        map.put("keyboardType", "String");
        map.put("letterSpacing", "number");
        map.put("maxFontSizeMultiplier", "number");
        map.put("maxLength", "number");
        map.put("multiline", "boolean");
        map.put("nativeID", "String");
        map.put("numberOfLines", "number");
        map.put("onContentSizeChange", "boolean");
        map.put("onKeyPress", "boolean");
        map.put("onScroll", "boolean");
        map.put("onSelectionChange", "boolean");
        map.put("opacity", "number");
        map.put("placeholder", "String");
        map.put("placeholderTextColor", "Color");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("returnKeyLabel", "String");
        map.put("returnKeyType", "String");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("secureTextEntry", "boolean");
        map.put("selectTextOnFocus", "boolean");
        map.put("selectionColor", "Color");
        map.put("showSoftInputOnFocus", "boolean");
        map.put("testID", "String");
        map.put("textAlign", "String");
        map.put("textAlignVertical", "String");
        map.put("transform", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("underlineColorAndroid", "Color");
        map.put("zIndex", "number");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v158, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v163, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v168, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v173, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v179, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v184, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v190, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v195, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v200, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v205, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v210, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v215, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v220, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v157 */
    /* JADX WARNING: type inference failed for: r0v224 */
    /* JADX WARNING: type inference failed for: r0v225 */
    /* JADX WARNING: type inference failed for: r0v226 */
    /* JADX WARNING: type inference failed for: r0v227 */
    /* JADX WARNING: type inference failed for: r0v228 */
    /* JADX WARNING: type inference failed for: r0v229 */
    /* JADX WARNING: type inference failed for: r0v230 */
    /* JADX WARNING: type inference failed for: r0v231 */
    /* JADX WARNING: type inference failed for: r0v232 */
    /* JADX WARNING: type inference failed for: r0v233 */
    /* JADX WARNING: type inference failed for: r0v234 */
    /* JADX WARNING: type inference failed for: r0v235 */
    /* JADX WARNING: type inference failed for: r0v236 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0249, code lost:
        if (r13.equals("secureTextEntry") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0255, code lost:
        if (r13.equals("borderBottomLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0261, code lost:
        if (r13.equals("borderBottomRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026d, code lost:
        if (r13.equals("placeholder") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0279, code lost:
        if (r13.equals("borderColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0285, code lost:
        if (r13.equals("borderStyle") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0291, code lost:
        if (r13.equals("borderWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x029d, code lost:
        if (r13.equals("importantForAccessibility") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a9, code lost:
        if (r13.equals("returnKeyType") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b5, code lost:
        if (r13.equals("autoCompleteType") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r13.equals("placeholderTextColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c1, code lost:
        if (r13.equals("transform") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02cd, code lost:
        if (r13.equals("onContentSizeChange") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d8, code lost:
        if (r13.equals("accessibilityLabel") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e3, code lost:
        if (r13.equals("accessibilityState") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ee, code lost:
        if (r13.equals("accessibilityValue") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02fa, code lost:
        if (r13.equals("importantForAutofill") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0306, code lost:
        if (r13.equals("backgroundColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0312, code lost:
        if (r13.equals("inlineImageLeft") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x031e, code lost:
        if (r13.equals("borderRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x032a, code lost:
        if (r13.equals("onScroll") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r13.equals("translateX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0335, code lost:
        if (r13.equals("accessibilityActions") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0341, code lost:
        if (r13.equals("editable") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x034d, code lost:
        if (r13.equals("autoFocus") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0359, code lost:
        if (r13.equals("contextMenuHidden") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0365, code lost:
        if (r13.equals("textAlignVertical") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0371, code lost:
        if (r13.equals("inlineImagePadding") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x037d, code lost:
        if (r13.equals("showSoftInputOnFocus") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0389, code lost:
        if (r13.equals("includeFontPadding") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0395, code lost:
        if (r13.equals("nativeID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a1, code lost:
        if (r13.equals("letterSpacing") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r13.equals("translateY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ad, code lost:
        if (r13.equals("selectionColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r13.equals("caretHidden") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r13.equals("cursorColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r13.equals("underlineColorAndroid") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r13.equals("fontStyle") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r13.equals("borderTopColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r13.equals("borderTopWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r13.equals("autoCapitalize") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        if (r13.equals("numberOfLines") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        if (r13.equals("borderBottomColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r13.equals("borderBottomWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r13.equals("opacity") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if (r13.equals("borderTopLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (r13.equals("fontFamily") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        if (r13.equals("multiline") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        if (r13.equals("textAlign") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0109, code lost:
        if (r13.equals("onKeyPress") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        if (r13.equals("scaleX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0121, code lost:
        if (r13.equals("scaleY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        if (r13.equals("testID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0139, code lost:
        if (r13.equals("blurOnSubmit") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0145, code lost:
        if (r13.equals("maxLength") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0151, code lost:
        if (r13.equals("fontWeight") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015d, code lost:
        if (r13.equals("zIndex") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0169, code lost:
        if (r13.equals("returnKeyLabel") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0175, code lost:
        if (r13.equals("selectTextOnFocus") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0181, code lost:
        if (r13.equals("autoCorrect") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
        if (r13.equals("allowFontScaling") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0198, code lost:
        if (r13.equals("borderLeftColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a4, code lost:
        if (r13.equals("borderLeftWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01af, code lost:
        if (r13.equals("accessibilityHint") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ba, code lost:
        if (r13.equals("accessibilityRole") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c6, code lost:
        if (r13.equals("renderToHardwareTextureAndroid") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r13.equals("borderRightColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d2, code lost:
        if (r13.equals("rotation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01de, code lost:
        if (r13.equals("elevation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e9, code lost:
        if (r13.equals("accessibilityLiveRegion") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f5, code lost:
        if (r13.equals("color") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0201, code lost:
        if (r13.equals("keyboardType") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        if (r13.equals("borderTopRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0219, code lost:
        if (r13.equals("fontSize") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0225, code lost:
        if (r13.equals("disableFullscreenUI") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0231, code lost:
        if (r13.equals("maxFontSizeMultiplier") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023d, code lost:
        if (r13.equals("onSelectionChange") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r13.equals("borderRightWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        float floatValue;
        ReactTextInputManager reactTextInputManager = (ReactTextInputManager) viewManager;
        C230139zI r12 = (C230139zI) view;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1989576717:
                c = 22;
                break;
            case -1971292586:
                c = 23;
                break;
            case -1775748605:
                c = ';';
                break;
            case -1721943862:
                c = 'J';
                break;
            case -1721943861:
                c = 'K';
                break;
            case -1615101171:
                c = 30;
                break;
            case -1595747923:
                c = '!';
                break;
            case -1573887368:
                c = 'L';
                break;
            case -1550943582:
                c = '\'';
                break;
            case -1470826662:
                c = 25;
                break;
            case -1452542531:
                c = 28;
                break;
            case -1339545093:
                c = 8;
                break;
            case -1329887265:
                c = '4';
                break;
            case -1308858324:
                c = 14;
                break;
            case -1290574193:
                c = 17;
                break;
            case -1267206133:
                c = '9';
                break;
            case -1228066334:
                c = 26;
                break;
            case -1224696685:
                c = '%';
                break;
            case -1206239059:
                c = '2';
                break;
            case -1065511464:
                c = 'G';
                break;
            case -1037804509:
                c = '6';
                break;
            case -908189618:
                c = '@';
                break;
            case -908189617:
                c = 'A';
                break;
            case -877170387:
                c = 'F';
                break;
            case -869116834:
                c = 13;
                break;
            case -791400086:
                c = '1';
                break;
            case -734428249:
                c = '(';
                break;
            case -731417480:
                c = 'M';
                break;
            case -700807899:
                c = '=';
                break;
            case -637043280:
                c = 'C';
                break;
            case -435916869:
                c = 10;
                break;
            case -407229137:
                c = 7;
                break;
            case -242276144:
                c = 19;
                break;
            case -223992013:
                c = 20;
                break;
            case -101663499:
                c = 1;
                break;
            case -101359900:
                c = 4;
                break;
            case -80891667:
                c = '<';
                break;
            case -40300674:
                c = '?';
                break;
            case -4379043:
                c = '$';
                break;
            case 36255470:
                c = 3;
                break;
            case 94842723:
                c = 31;
                break;
            case 208939969:
                c = '.';
                break;
            case 333432965:
                c = 27;
                break;
            case 365601008:
                c = '&';
                break;
            case 514055831:
                c = '\"';
                break;
            case 548921173:
                c = '0';
                break;
            case 552298621:
                c = '8';
                break;
            case 568836494:
                c = 'B';
                break;
            case 581268560:
                c = 15;
                break;
            case 588239831:
                c = 16;
                break;
            case 598246771:
                c = ':';
                break;
            case 722830999:
                c = 18;
                break;
            case 737768677:
                c = 24;
                break;
            case 741115130:
                c = 29;
                break;
            case 746986311:
                c = ')';
                break;
            case 947486441:
                c = '>';
                break;
            case 1043796834:
                c = 9;
                break;
            case 1052666732:
                c = 'I';
                break;
            case 1056207947:
                c = '5';
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
            case 1192948249:
                c = '*';
                break;
            case 1287124693:
                c = 12;
                break;
            case 1304686953:
                c = ',';
                break;
            case 1349188574:
                c = 21;
                break;
            case 1490730380:
                c = '7';
                break;
            case 1505602511:
                c = 0;
                break;
            case 1602416228:
                c = '#';
                break;
            case 1638055017:
                c = 11;
                break;
            case 1798561528:
                c = ' ';
                break;
            case 1869416814:
                c = 'H';
                break;
            case 1908266863:
                c = '-';
                break;
            case 1937428854:
                c = 'E';
                break;
            case 2020113146:
                c = '+';
                break;
            case 2045685618:
                c = '3';
                break;
            case 2111078717:
                c = '/';
                break;
            case 2142299447:
                c = 'D';
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f3 = Float.NaN;
        ? r0 = 0;
        switch (c) {
            case 0:
                reactTextInputManager.setAccessibilityActions(r12, (A1e) obj);
                return;
            case 1:
                reactTextInputManager.setAccessibilityHint(r12, (String) obj);
                return;
            case 2:
                reactTextInputManager.setAccessibilityLabel(r12, (String) obj);
                return;
            case 3:
                reactTextInputManager.setAccessibilityLiveRegion(r12, (String) obj);
                return;
            case 4:
                reactTextInputManager.setAccessibilityRole(r12, (String) obj);
                return;
            case 5:
                reactTextInputManager.setViewState(r12, (C23043A0y) obj);
                return;
            case 6:
                reactTextInputManager.setAccessibilityValue(r12, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                r12.setAllowFontScaling(z);
                return;
            case 8:
                reactTextInputManager.setAutoCapitalize(r12, new A1P(obj));
                return;
            case 9:
                reactTextInputManager.setTextContentType(r12, (String) obj);
                return;
            case 10:
                if (obj != null) {
                    r0 = Boolean.valueOf(((Boolean) obj).booleanValue());
                }
                reactTextInputManager.setAutoCorrect(r12, r0);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.A0C = z2;
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj != null) {
                    z2 = C206578th.A00(obj, r12.getContext()).intValue();
                }
                reactTextInputManager.setBackgroundColor(r12, z2);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    r0 = Boolean.valueOf(((Boolean) obj).booleanValue());
                }
                r12.A09 = r0;
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setBorderColor(r12, 4, r0);
                return;
            case 15:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderRadius(r12, 4, f3);
                return;
            case 16:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderRadius(r12, 3, f3);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderWidth(r12, 4, f3);
                return;
            case 18:
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setBorderColor(r12, 0, r0);
                return;
            case 19:
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setBorderColor(r12, 1, r0);
                return;
            case 20:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderWidth(r12, 1, f3);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderRadius(r12, 0, f3);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setBorderColor(r12, 2, r0);
                return;
            case 23:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderWidth(r12, 2, f3);
                return;
            case 24:
                r12.setBorderStyle((String) obj);
                return;
            case 25:
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setBorderColor(r12, 3, r0);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderRadius(r12, 1, f3);
                return;
            case 27:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderRadius(r12, 2, f3);
                return;
            case 28:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderWidth(r12, 3, f3);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setBorderWidth(r12, 0, f3);
                return;
            case 30:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.setCursorVisible(!z2);
                return;
            case 31:
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setColor(r12, r0);
                return;
            case ' ':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactTextInputManager.setContextMenuHidden(r12, z2);
                return;
            case '!':
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setCursorColor(r12, r0);
                return;
            case '\"':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.setDisableFullscreenUI(z2);
                return;
            case '#':
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                r12.setEnabled(z);
                return;
            case '$':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setElevation(r12, f2);
                return;
            case '%':
                r12.setFontFamily((String) obj);
                return;
            case '&':
                if (obj == null) {
                    floatValue = 14.0f;
                } else {
                    floatValue = ((Double) obj).floatValue();
                }
                r12.setFontSize(floatValue);
                return;
            case '\'':
                r12.setFontStyle((String) obj);
                return;
            case '(':
                r12.setFontWeight((String) obj);
                return;
            case ')':
                reactTextInputManager.setImportantForAccessibility(r12, (String) obj);
                return;
            case '*':
                reactTextInputManager.setImportantForAutofill(r12, (String) obj);
                return;
            case '+':
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                r12.setIncludeFontPadding(z);
                return;
            case ',':
                reactTextInputManager.setInlineImageLeft(r12, (String) obj);
                return;
            case '-':
                if (obj != null) {
                    z2 = ((Double) obj).intValue();
                }
                r12.setCompoundDrawablePadding(z2);
                return;
            case '.':
                reactTextInputManager.setKeyboardType(r12, (String) obj);
                return;
            case '/':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                r12.setLetterSpacingPt(f2);
                return;
            case '0':
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                r12.setMaxFontSizeMultiplier(f3);
                return;
            case '1':
                if (obj != null) {
                    r0 = Integer.valueOf(((Double) obj).intValue());
                }
                reactTextInputManager.setMaxLength(r12, r0);
                return;
            case AMD.MAX_LIKES_PER_FETCH:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactTextInputManager.setMultiline(r12, z2);
                return;
            case '3':
                reactTextInputManager.setNativeId(r12, (String) obj);
                return;
            case '4':
                if (obj != null) {
                    z = ((Double) obj).intValue();
                }
                r12.setLines(z);
                return;
            case '5':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactTextInputManager.setOnContentSizeChange(r12, z2);
                return;
            case '6':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.A0E = z2;
                return;
            case '7':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactTextInputManager.setOnScroll(r12, z2);
                return;
            case '8':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactTextInputManager.setOnSelectionChange(r12, z2);
                return;
            case '9':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                reactTextInputManager.setOpacity(r12, f);
                return;
            case ':':
                r12.setHint((String) obj);
                return;
            case ';':
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setPlaceholderTextColor(r12, r0);
                return;
            case '<':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactTextInputManager.setRenderToHardwareTexture(r12, z2);
                return;
            case '=':
                reactTextInputManager.setReturnKeyLabel(r12, (String) obj);
                return;
            case '>':
                r12.setReturnKeyType((String) obj);
                return;
            case '?':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                r12.setRotation(f2);
                return;
            case '@':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                r12.setScaleX(f);
                return;
            case 'A':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                r12.setScaleY(f);
                return;
            case 'B':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactTextInputManager.setSecureTextEntry(r12, z2);
                return;
            case 'C':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.setSelectAllOnFocus(z2);
                return;
            case 'D':
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setSelectionColor(r12, r0);
                return;
            case 'E':
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                r12.setShowSoftInputOnFocus(z);
                return;
            case 'F':
                reactTextInputManager.setTestId(r12, (String) obj);
                return;
            case 'G':
                reactTextInputManager.setTextAlign(r12, (String) obj);
                return;
            case 'H':
                reactTextInputManager.setTextAlignVertical(r12, (String) obj);
                return;
            case 'I':
                reactTextInputManager.setTransform(r12, (A1e) obj);
                return;
            case 'J':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setTranslateX(r12, f2);
                return;
            case 'K':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setTranslateY(r12, f2);
                return;
            case 'L':
                if (obj != null) {
                    r0 = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextInputManager.setUnderlineColor(r12, r0);
                return;
            case 'M':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactTextInputManager.setZIndex(r12, f2);
                return;
            default:
                return;
        }
    }
}
