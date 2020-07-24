package com.facebook.react.uimanager;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import p000X.A0k;
import p000X.A1k;
import p000X.A6E;
import p000X.A8X;
import p000X.A90;
import p000X.A9D;
import p000X.A9J;
import p000X.AnonymousClass000;
import p000X.AnonymousClass2DN;
import p000X.AnonymousClass2DO;
import p000X.AnonymousClass2DP;
import p000X.C230109zF;
import p000X.C230349zs;
import p000X.C23049A1l;
import p000X.C23126A8e;

public class LayoutShadowNode extends ReactShadowNodeImpl {
    public final C23049A1l A00 = new C23049A1l();

    @ReactProp(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        this.A05.setAspectRatio(f);
    }

    private int A02(int i) {
        if (I18nUtil.A00().A02(AY1())) {
            if (i == 0) {
                return 4;
            }
            if (i == 2) {
                return 5;
            }
        }
        return i;
    }

    @ReactProp(name = "alignContent")
    public void setAlignContent(String str) {
        AnonymousClass2DP r1;
        if (!AiS()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        r1 = AnonymousClass2DP.AUTO;
                        break;
                    case 1:
                        break;
                    case 2:
                        r1 = AnonymousClass2DP.CENTER;
                        break;
                    case 3:
                        r1 = AnonymousClass2DP.FLEX_END;
                        break;
                    case 4:
                        r1 = AnonymousClass2DP.STRETCH;
                        break;
                    case 5:
                        r1 = AnonymousClass2DP.BASELINE;
                        break;
                    case 6:
                        r1 = AnonymousClass2DP.SPACE_BETWEEN;
                        break;
                    case 7:
                        r1 = AnonymousClass2DP.SPACE_AROUND;
                        break;
                    default:
                        throw new A0k(AnonymousClass000.A0E("invalid value for alignContent: ", str));
                }
            }
            r1 = AnonymousClass2DP.FLEX_START;
            this.A05.setAlignContent(r1);
        }
    }

    @ReactProp(name = "alignItems")
    public void setAlignItems(String str) {
        AnonymousClass2DP r1;
        if (!AiS()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        r1 = AnonymousClass2DP.AUTO;
                        break;
                    case 1:
                        r1 = AnonymousClass2DP.FLEX_START;
                        break;
                    case 2:
                        r1 = AnonymousClass2DP.CENTER;
                        break;
                    case 3:
                        r1 = AnonymousClass2DP.FLEX_END;
                        break;
                    case 4:
                        break;
                    case 5:
                        r1 = AnonymousClass2DP.BASELINE;
                        break;
                    case 6:
                        r1 = AnonymousClass2DP.SPACE_BETWEEN;
                        break;
                    case 7:
                        r1 = AnonymousClass2DP.SPACE_AROUND;
                        break;
                    default:
                        throw new A0k(AnonymousClass000.A0E("invalid value for alignItems: ", str));
                }
            }
            r1 = AnonymousClass2DP.STRETCH;
            this.A05.setAlignItems(r1);
        }
    }

    @ReactProp(name = "alignSelf")
    public void setAlignSelf(String str) {
        AnonymousClass2DP r1;
        if (!AiS()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        break;
                    case 1:
                        r1 = AnonymousClass2DP.FLEX_START;
                        break;
                    case 2:
                        r1 = AnonymousClass2DP.CENTER;
                        break;
                    case 3:
                        r1 = AnonymousClass2DP.FLEX_END;
                        break;
                    case 4:
                        r1 = AnonymousClass2DP.STRETCH;
                        break;
                    case 5:
                        r1 = AnonymousClass2DP.BASELINE;
                        break;
                    case 6:
                        r1 = AnonymousClass2DP.SPACE_BETWEEN;
                        break;
                    case 7:
                        r1 = AnonymousClass2DP.SPACE_AROUND;
                        break;
                    default:
                        throw new A0k(AnonymousClass000.A0E("invalid value for alignSelf: ", str));
                }
            }
            r1 = AnonymousClass2DP.AUTO;
            this.A05.setAlignSelf(r1);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (!AiS()) {
            int A02 = A02(A8X.A01[i]);
            this.A05.setBorder(C23126A8e.A00(A02), C230109zF.A00(f));
        }
    }

    @ReactProp(name = "display")
    public void setDisplay(String str) {
        A9D a9d;
        if (AiS()) {
            return;
        }
        if (str == null) {
            this.A05.setDisplay(A9D.FLEX);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3145721) {
            if (hashCode == 3387192 && str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                c = 1;
            }
        } else if (str.equals("flex")) {
            c = 0;
        }
        if (c == 0) {
            a9d = A9D.FLEX;
        } else if (c == 1) {
            a9d = A9D.NONE;
        } else {
            throw new A0k(AnonymousClass000.A0E("invalid value for display: ", str));
        }
        this.A05.setDisplay(a9d);
    }

    @ReactProp(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (!AiS()) {
            super.setFlex(f);
        }
    }

    @ReactProp(name = "flexBasis")
    public void setFlexBasis(A1k a1k) {
        if (!AiS()) {
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    this.A05.setFlexBasis(a1l.A00);
                    break;
                case 2:
                    this.A05.setFlexBasisPercent(a1l.A00);
                    break;
                case 3:
                    this.A05.setFlexBasisAuto();
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "flexDirection")
    public void setFlexDirection(String str) {
        AnonymousClass2DN r1;
        if (AiS()) {
            return;
        }
        if (str == null) {
            this.A05.setFlexDirection(AnonymousClass2DN.COLUMN);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1448970769:
                if (str.equals("row-reverse")) {
                    c = 3;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c = 0;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c = 2;
                    break;
                }
                break;
            case 1272730475:
                if (str.equals("column-reverse")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            r1 = AnonymousClass2DN.COLUMN;
        } else if (c == 1) {
            r1 = AnonymousClass2DN.COLUMN_REVERSE;
        } else if (c == 2) {
            r1 = AnonymousClass2DN.ROW;
        } else if (c == 3) {
            r1 = AnonymousClass2DN.ROW_REVERSE;
        } else {
            throw new A0k(AnonymousClass000.A0E("invalid value for flexDirection: ", str));
        }
        this.A05.setFlexDirection(r1);
    }

    @ReactProp(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (!AiS()) {
            super.setFlexGrow(f);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (!AiS()) {
            super.setFlexShrink(f);
        }
    }

    @ReactProp(name = "flexWrap")
    public void setFlexWrap(String str) {
        A90 a90;
        if (AiS()) {
            return;
        }
        if (str == null) {
            this.A05.setWrap(A90.NO_WRAP);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1039592053) {
            if (hashCode != -749527969) {
                if (hashCode == 3657802 && str.equals("wrap")) {
                    c = 1;
                }
            } else if (str.equals("wrap-reverse")) {
                c = 2;
            }
        } else if (str.equals("nowrap")) {
            c = 0;
        }
        if (c == 0) {
            a90 = A90.NO_WRAP;
        } else if (c == 1) {
            a90 = A90.WRAP;
        } else if (c == 2) {
            a90 = A90.WRAP_REVERSE;
        } else {
            throw new A0k(AnonymousClass000.A0E("invalid value for flexWrap: ", str));
        }
        this.A05.setWrap(a90);
    }

    @ReactProp(name = "height")
    public void setHeight(A1k a1k) {
        if (!AiS()) {
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    Bkn(a1l.A00);
                    break;
                case 2:
                    this.A05.setHeightPercent(a1l.A00);
                    break;
                case 3:
                    this.A05.setHeightAuto();
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "justifyContent")
    public void setJustifyContent(String str) {
        AnonymousClass2DO r1;
        if (AiS()) {
            return;
        }
        if (str == null) {
            this.A05.setJustifyContent(AnonymousClass2DO.FLEX_START);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 0;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 3;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 2;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 4;
                    break;
                }
                break;
            case 2055030478:
                if (str.equals("space-evenly")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            r1 = AnonymousClass2DO.FLEX_START;
        } else if (c == 1) {
            r1 = AnonymousClass2DO.CENTER;
        } else if (c == 2) {
            r1 = AnonymousClass2DO.FLEX_END;
        } else if (c == 3) {
            r1 = AnonymousClass2DO.SPACE_BETWEEN;
        } else if (c == 4) {
            r1 = AnonymousClass2DO.SPACE_AROUND;
        } else if (c == 5) {
            r1 = AnonymousClass2DO.SPACE_EVENLY;
        } else {
            throw new A0k(AnonymousClass000.A0E("invalid value for justifyContent: ", str));
        }
        this.A05.setJustifyContent(r1);
    }

    @ReactPropGroup(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, A1k a1k) {
        if (!AiS()) {
            int A02 = A02(A8X.A02[i]);
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    this.A05.setMargin(C23126A8e.A00(A02), a1l.A00);
                    break;
                case 2:
                    this.A05.setMarginPercent(C23126A8e.A00(A02), a1l.A00);
                    break;
                case 3:
                    this.A05.setMarginAuto(C23126A8e.A00(A02));
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "maxHeight")
    public void setMaxHeight(A1k a1k) {
        if (!AiS()) {
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    this.A05.setMaxHeight(a1l.A00);
                    break;
                case 2:
                    this.A05.setMaxHeightPercent(a1l.A00);
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "maxWidth")
    public void setMaxWidth(A1k a1k) {
        if (!AiS()) {
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    this.A05.setMaxWidth(a1l.A00);
                    break;
                case 2:
                    this.A05.setMaxWidthPercent(a1l.A00);
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "minHeight")
    public void setMinHeight(A1k a1k) {
        if (!AiS()) {
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    this.A05.setMinHeight(a1l.A00);
                    break;
                case 2:
                    this.A05.setMinHeightPercent(a1l.A00);
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "minWidth")
    public void setMinWidth(A1k a1k) {
        if (!AiS()) {
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    this.A05.setMinWidth(a1l.A00);
                    break;
                case 2:
                    this.A05.setMinWidthPercent(a1l.A00);
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "overflow")
    public void setOverflow(String str) {
        A6E a6e;
        if (AiS()) {
            return;
        }
        if (str == null) {
            this.A05.setOverflow(A6E.VISIBLE);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1217487446) {
            if (hashCode != -907680051) {
                if (hashCode == 466743410 && str.equals("visible")) {
                    c = 0;
                }
            } else if (str.equals("scroll")) {
                c = 2;
            }
        } else if (str.equals("hidden")) {
            c = 1;
        }
        if (c == 0) {
            a6e = A6E.VISIBLE;
        } else if (c == 1) {
            a6e = A6E.HIDDEN;
        } else if (c == 2) {
            a6e = A6E.SCROLL;
        } else {
            throw new A0k(AnonymousClass000.A0E("invalid value for overflow: ", str));
        }
        this.A05.setOverflow(a6e);
    }

    @ReactPropGroup(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, A1k a1k) {
        if (!AiS()) {
            int A02 = A02(A8X.A02[i]);
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    A07(A02, a1l.A00);
                    break;
                case 2:
                    float f = a1l.A00;
                    this.A0L[A02] = f;
                    this.A0M[A02] = !C230349zs.A00(f);
                    ReactShadowNodeImpl.A04(this);
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "position")
    public void setPosition(String str) {
        A9J a9j;
        if (AiS()) {
            return;
        }
        if (str == null) {
            this.A05.setPositionType(A9J.RELATIVE);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -554435892) {
            if (hashCode == 1728122231 && str.equals("absolute")) {
                c = 1;
            }
        } else if (str.equals("relative")) {
            c = 0;
        }
        if (c == 0) {
            a9j = A9J.RELATIVE;
        } else if (c == 1) {
            a9j = A9J.ABSOLUTE;
        } else {
            throw new A0k(AnonymousClass000.A0E("invalid value for position: ", str));
        }
        this.A05.setPositionType(a9j);
    }

    @ReactPropGroup(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, A1k a1k) {
        if (!AiS()) {
            int A02 = A02(new int[]{4, 5, 0, 2, 1, 3}[i]);
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    this.A05.setPosition(C23126A8e.A00(A02), a1l.A00);
                    break;
                case 2:
                    this.A05.setPositionPercent(C23126A8e.A00(A02), a1l.A00);
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "width")
    public void setWidth(A1k a1k) {
        if (!AiS()) {
            this.A00.A00(a1k);
            C23049A1l a1l = this.A00;
            switch (a1l.A01.intValue()) {
                case 0:
                case 1:
                    Bko(a1l.A00);
                    break;
                case 2:
                    this.A05.setWidthPercent(a1l.A00);
                    break;
                case 3:
                    this.A05.setWidthAuto();
                    break;
            }
            a1k.BZP();
        }
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(boolean z) {
    }
}
