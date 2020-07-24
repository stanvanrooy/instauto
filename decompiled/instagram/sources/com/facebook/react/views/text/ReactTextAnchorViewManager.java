package com.facebook.react.views.text;

import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import p000X.A06;
import p000X.A0k;
import p000X.AnonymousClass000;
import p000X.C230109zF;
import p000X.C230129zH;
import p000X.C230289zh;
import p000X.C230349zs;

public abstract class ReactTextAnchorViewManager extends BaseViewManager {
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C230129zH r5, int i, Integer num) {
        float intValue;
        float f = Float.NaN;
        if (num == null) {
            intValue = Float.NaN;
        } else {
            intValue = (float) (num.intValue() & 16777215);
        }
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        A06.A00(r5.A04).A0A(SPACING_TYPES[i], intValue, f);
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(C230129zH r2, boolean z) {
        r2.setEnabled(!z);
    }

    @ReactProp(name = "ellipsizeMode")
    public void setEllipsizeMode(C230129zH r3, String str) {
        TextUtils.TruncateAt truncateAt;
        if (str == null || str.equals("tail")) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (str.equals("head")) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (str.equals("middle")) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (str.equals("clip")) {
            r3.A03 = null;
            return;
        } else {
            throw new A0k(AnonymousClass000.A0E("Invalid ellipsizeMode: ", str));
        }
        r3.A03 = truncateAt;
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C230129zH r3, Integer num) {
        int intValue;
        if (num == null) {
            intValue = C230289zh.A00(r3.getContext(), 16842905).getDefaultColor();
        } else {
            intValue = num.intValue();
        }
        r3.setHighlightColor(intValue);
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(C230129zH r3, String str) {
        if (str == null || "auto".equals(str)) {
            r3.setGravityVertical(0);
        } else if ("top".equals(str)) {
            r3.setGravityVertical(48);
        } else if ("bottom".equals(str)) {
            r3.setGravityVertical(80);
        } else if ("center".equals(str)) {
            r3.setGravityVertical(16);
        } else {
            throw new A0k(AnonymousClass000.A0E("Invalid textAlignVertical: ", str));
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C230129zH r3, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        if (i == 0) {
            r3.setBorderRadius(f);
            return;
        }
        A06.A00(r3.A04).A08(f, i - 1);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C230129zH r3, int i, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        A06.A00(r3.A04).A09(SPACING_TYPES[i], f);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r7.equals("phoneNumber") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r7.equals("all") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r7.equals("link") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r7.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r7.equals(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.EMAIL) == false) goto L_0x000a;
     */
    @ReactProp(name = "dataDetectorType")
    public void setDataDetectorType(C230129zH r6, String str) {
        char c;
        switch (str.hashCode()) {
            case -1192969641:
                c = 0;
                break;
            case 96673:
                c = 3;
                break;
            case 3321850:
                c = 1;
                break;
            case 3387192:
                c = 4;
                break;
            case 96619420:
                c = 2;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            r6.A00 = 4;
        } else if (c == 1) {
            r6.A00 = 1;
        } else if (c == 2) {
            r6.A00 = 2;
        } else if (c != 3) {
            r6.A00 = 0;
        } else {
            r6.A00 = 15;
        }
    }

    @ReactProp(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(C230129zH r1, boolean z) {
        r1.A05 = z;
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(C230129zH r1, String str) {
        r1.setBorderStyle(str);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C230129zH r1, boolean z) {
        r1.setIncludeFontPadding(z);
    }

    @ReactProp(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(C230129zH r1, boolean z) {
        r1.A06 = z;
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(C230129zH r1, int i) {
        r1.setNumberOfLines(i);
    }

    @ReactProp(name = "selectable")
    public void setSelectable(C230129zH r1, boolean z) {
        r1.setTextIsSelectable(z);
    }
}
