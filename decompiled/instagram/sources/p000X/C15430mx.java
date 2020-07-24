package p000X;

import android.util.JsonWriter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.C0003R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.0mx  reason: invalid class name and case insensitive filesystem */
public final class C15430mx implements C15440my {
    public final C15440my A00;

    public static String A01(C53542Te r1) {
        if ((r1 instanceof AnonymousClass2Tw) || !(r1 instanceof AnonymousClass997)) {
            return r1.toString();
        }
        return String.valueOf(C51412Ko.A01(r1));
    }

    public static String A02(C53542Te r2, boolean z) {
        if (r2 instanceof AnonymousClass997) {
            Object A01 = C51412Ko.A01(r2);
            if ((A01 instanceof List) || (A01 instanceof Map)) {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                try {
                    A03(r2, jsonWriter, z);
                    jsonWriter.close();
                    return stringWriter.toString();
                } catch (IOException e) {
                    return "Exception in serialization " + e;
                }
            } else if (A01 == null) {
                return "";
            }
        }
        return A01(r2);
    }

    public static void A03(C53542Te r4, JsonWriter jsonWriter, boolean z) {
        String str;
        if (r4 instanceof AnonymousClass2Tw) {
            jsonWriter.value((Number) r4);
            return;
        }
        if (r4 instanceof AnonymousClass997) {
            Object A01 = C51412Ko.A01(r4);
            if (A01 instanceof String) {
                jsonWriter.value((String) A01);
                return;
            } else if (A01 instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    for (Map.Entry entry : ((Map) A01).entrySet()) {
                        treeMap.put(A01((C53542Te) entry.getKey()), entry.getValue());
                    }
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        jsonWriter.name((String) entry2.getKey());
                        A03((C53542Te) entry2.getValue(), jsonWriter, z);
                    }
                } else {
                    for (Map.Entry entry3 : ((Map) A01).entrySet()) {
                        jsonWriter.name(A01((C53542Te) entry3.getKey()));
                        A03((C53542Te) entry3.getValue(), jsonWriter, z);
                    }
                }
                jsonWriter.endObject();
                return;
            } else if (A01 instanceof List) {
                jsonWriter.beginArray();
                for (C53542Te A03 : (List) A01) {
                    A03(A03, jsonWriter, z);
                }
                jsonWriter.endArray();
                return;
            } else if (A01 == null) {
                jsonWriter.nullValue();
                return;
            } else {
                str = String.valueOf(A01);
            }
        } else {
            str = String.valueOf(r4);
        }
        jsonWriter.value(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r3.equals("bk.action.bloks.IndexOfChild") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3.equals("bk.action.bloks.Find") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x05ab, code lost:
        throw new java.lang.RuntimeException("Accessing state is only supported from the UI Thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r3.equals("bk.action.bloks.FindContainer") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x067d, code lost:
        return p000X.AnonymousClass2U3.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0693, code lost:
        if (r0.requestFocus() == false) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0695, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3.equals("bk.action.bloks.InsertChildrenAfter") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r3.equals("bk.action.bloks.DismissKeyboard") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r3.equals("bk.action.bloks.AddChild") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r3.equals("bk.action.component.GetAttr") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r3.equals("bk.action.bloks.Reduce") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r3.equals("bk.action.bloks.Reflow") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r3.equals("bk.action.bloks.Inflate") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        if (r3.equals("bk.action.bloks.AppendChildren") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r3.equals("bk.action.bloks.ShowKeyboard") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (r3.equals("bk.action.bloks.ChildAtIndex") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (r3.equals("bk.action.string.JsonEncode") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (r3.equals("bk.action.bloks.FindWidget") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r3.equals("bk.action.bloks.ReplaceChild") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        if (r3.equals("bk.action.collection.SetIndexById") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
        if (r3.equals("bk.action.string.JsonEncodeV2") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        if (r3.equals("bk.action.bloks.InflateSync") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f8, code lost:
        if (r3.equals("bk.action.bloks.InsertChildrenBefore") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        if (r3.equals("bk.action.bloks.ReplaceChildAfter") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010e, code lost:
        if (r3.equals("bk.action.bloks.RemoveChildrenBetween") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011a, code lost:
        if (r3.equals("bk.action.bloks.RequestFocus") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0126, code lost:
        if (r3.equals("bk.action.collection.SetIndex") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0131, code lost:
        if (r3.equals("bk.action.bloks.RemoveChildAt") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        if (r3.equals("bk.action.component.SetAttr") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0149, code lost:
        if (r3.equals("bk.action.bloks.PrependChildren") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0155, code lost:
        if (r3.equals("bk.action.component.GetWidth") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0161, code lost:
        if (r3.equals("bk.action.bloks.GetState") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016d, code lost:
        if (r3.equals("bk.action.bloks.GetVariable") == false) goto L_0x000c;
     */
    public final C53542Te ADQ(C53522Tc r14, C51422Kp r15, C53532Td r16) {
        char c;
        int i;
        C49672Dd r3;
        String str = r14.A00;
        switch (str.hashCode()) {
            case -2022606713:
                c = 12;
                break;
            case -1802986003:
                c = 0;
                break;
            case -1781978860:
                c = 2;
                break;
            case -1659672016:
                c = 11;
                break;
            case -1646637091:
                c = 25;
                break;
            case -1620560081:
                c = 3;
                break;
            case -1614809437:
                c = 15;
                break;
            case -1458151270:
                c = 20;
                break;
            case -1458099947:
                c = 19;
                break;
            case -1391375021:
                c = 21;
                break;
            case -1384591763:
                c = 9;
                break;
            case -1370121672:
                c = 24;
                break;
            case -985271337:
                c = 13;
                break;
            case -826958968:
                c = 28;
                break;
            case -730857839:
                c = 1;
                break;
            case -587000068:
                c = 6;
                break;
            case -169377409:
                c = 27;
                break;
            case -138615772:
                c = 29;
                break;
            case -27526514:
                c = 22;
                break;
            case 117073323:
                c = 10;
                break;
            case 155450432:
                c = 7;
                break;
            case 211494449:
                c = 5;
                break;
            case 258140093:
                c = 23;
                break;
            case 290488333:
                c = 26;
                break;
            case 327957399:
                c = 4;
                break;
            case 445300143:
                c = 14;
                break;
            case 1287216889:
                c = 8;
                break;
            case 1500489556:
                c = 16;
                break;
            case 1607063823:
                c = 17;
                break;
            case 1765180734:
                c = 18;
                break;
            default:
                c = 65535;
                break;
        }
        C53532Td r2 = r16;
        switch (c) {
            case 0:
            case 1:
            case 2:
                long longValue = ((AnonymousClass2Tw) r15.A00(0)).longValue();
                AnonymousClass2DG r32 = A00(r2).A00;
                AnonymousClass2D8[] r22 = new AnonymousClass2D8[1];
                r32.A01(r32.A02).Bri(new C226029oB(r32, longValue, r22));
                return C51412Ko.A00(r22[0]);
            case 3:
                AnonymousClass2D7 r8 = (AnonymousClass2D7) C51412Ko.A01(r15.A00(0));
                C15370mr r33 = (C15370mr) C51412Ko.A01(r15.A00(1));
                int intValue = ((AnonymousClass2Tw) r15.A00(2)).intValue();
                A00(r2);
                AnonymousClass2DG r6 = A00(r2).A00;
                if (!(r33 instanceof C108334le)) {
                    r6.A03(r8.AIE(), new C23239AEc(intValue, (AnonymousClass2D8) r33));
                    break;
                } else {
                    for (AnonymousClass2DA r4 : ((C108334le) r33).A00) {
                        r6.A03(r8.AIE(), new C23239AEc(intValue, (AnonymousClass2D8) r4));
                        intValue++;
                    }
                    break;
                }
            case 4:
                A00(r2).A00.A03(((AnonymousClass2D7) C51412Ko.A01(r15.A00(0))).AIE(), new C23242AEf(((AnonymousClass2Tw) r15.A00(1)).intValue()));
                break;
            case 5:
                A00(r2).A00.A03(((AnonymousClass2D7) C51412Ko.A01(r15.A00(0))).AIE(), new C23246AEj(((AnonymousClass2Tw) r15.A00(1)).longValue(), ((AnonymousClass2Tw) r15.A00(2)).longValue()));
                break;
            case 6:
                long longValue2 = ((AnonymousClass2Tw) r15.A00(0)).longValue();
                ArrayList A03 = C51412Ko.A03(r15.A00(1));
                A00(r2).A00.A03(longValue2, new C23247AEk(((AnonymousClass2Tw) r15.A00(2)).longValue(), A03));
                break;
            case 7:
                long longValue3 = ((AnonymousClass2Tw) r15.A00(0)).longValue();
                ArrayList A032 = C51412Ko.A03(r15.A00(1));
                long longValue4 = ((AnonymousClass2Tw) r15.A00(2)).longValue();
                AnonymousClass2DG r9 = A00(r2).A00;
                AnonymousClass2D8[] r82 = new AnonymousClass2D8[1];
                r9.A01(r9.A02).Bri(new C226029oB(r9, longValue3, r82));
                A00(r2).A00.A03(((AnonymousClass2D7) r82[0]).AIE(), new C23245AEi(longValue4, A032));
                break;
            case 8:
                A00(r2).A00.A03(((AnonymousClass2D7) C51412Ko.A01(r15.A00(0))).AIE(), new C23241AEe(C51412Ko.A03(r15.A00(1))));
                break;
            case 9:
                A00(r2).A00.A03(((AnonymousClass2D7) C51412Ko.A01(r15.A00(0))).AIE(), new C23240AEd(C51412Ko.A03(r15.A00(1))));
                break;
            case 10:
                ArrayList A033 = C51412Ko.A03(r15.A00(1));
                A00(r2).A00.A03(((AnonymousClass2D7) C51412Ko.A01(r15.A00(0))).AIE(), new C23248AEl(((AnonymousClass2Tw) r15.A00(2)).longValue(), 0, A033));
                break;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                ArrayList A034 = C51412Ko.A03(r15.A00(1));
                A00(r2).A00.A03(((AnonymousClass2D7) C51412Ko.A01(r15.A00(0))).AIE(), new C23248AEl(((AnonymousClass2Tw) r15.A00(2)).longValue(), 1, A034));
                break;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return AnonymousClass2U3.A01(C23249AEm.A00(((AnonymousClass2D7) A00(r2).A00.A01((AnonymousClass2D7) C51412Ko.A01(r15.A00(0)))).A00, ((AnonymousClass2Tw) r15.A00(1)).longValue()));
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return C51412Ko.A00(((AnonymousClass2D7) C51412Ko.A01(r15.A00(0))).A00.get(((AnonymousClass2Tw) r15.A00(1)).intValue()));
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                C15370mr r83 = (C15370mr) C51412Ko.A02(r15.A00(0));
                String str2 = (String) C51412Ko.A02(r15.A00(1));
                C53542Te A002 = r15.A00(2);
                boolean z = false;
                if (r83 instanceof AnonymousClass2DC) {
                    z = ((AnonymousClass2DC) r83).Bfx(str2, A002);
                }
                if (!z) {
                    if (r83 instanceof AnonymousClass2DD) {
                        AnonymousClass2DD r84 = (AnonymousClass2DD) r83;
                        A00(r2).A00.A03(r84.AIE(), new C23238AEb(r84.ATD(), str2, A002));
                        break;
                    } else {
                        throw new IllegalStateException("unknown data type " + r83);
                    }
                }
                break;
            case 15:
                C15370mr r34 = (C15370mr) C51412Ko.A02(r15.A00(0));
                String str3 = (String) C51412Ko.A02(r15.A00(1));
                if (r34 instanceof AnonymousClass2D8) {
                    return AAB.A00.ATC(r34, str3);
                }
                throw new IllegalStateException("unknown data type " + r34);
            case 16:
                return AnonymousClass2U3.A01(((AnonymousClass2DA) C51412Ko.A02(r15.A00(0))).getView().getWidth());
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                long longValue5 = ((AnonymousClass2Tw) r15.A00(0)).longValue();
                AnonymousClass2DG r5 = A00(r2).A00;
                if (AnonymousClass2U1.A00()) {
                    ArrayList arrayList = (ArrayList) r5.A04.A04(longValue5, (Object) null);
                    if (arrayList == null) {
                        C49672Dd[] r7 = new C49672Dd[1];
                        r5.A01(r5.A02).Bri(new C226049oD(new C226079oG(r5, longValue5, r7)));
                        C49672Dd r42 = r7[0];
                        if (r42 != null) {
                            arrayList = (ArrayList) C51412Ko.A02(new C51432Kq(r2).A00(r42, C51422Kp.A01));
                            if (AnonymousClass2U1.A00()) {
                                r5.A04.A08(longValue5, arrayList);
                            }
                        } else {
                            throw new IllegalStateException(AnonymousClass000.A0B("No state initializer available for id: ", longValue5));
                        }
                    }
                    return C51412Ko.A00(arrayList);
                }
                break;
            case 18:
                return C51412Ko.A00(((Map) C51412Ko.A02(r15.A00(0))).get((String) C51412Ko.A02(r15.A00(1))));
            case 19:
                long longValue6 = ((AnonymousClass2Tw) r15.A00(0)).longValue();
                AnonymousClass2DG r52 = A00(r2).A00;
                C51432Kq r35 = new C51432Kq(r2);
                AnonymousClass2D8[] r11 = new AnonymousClass2D8[1];
                r52.A01(r52.A02).Bri(new C226039oC(r52, longValue6, new C226049oD(new C226069oF(r52, longValue6)), r11));
                AnonymousClass2D8 r1 = r11[0];
                if (r1 != null) {
                    r1.Bri(new C225859nu(r52, r35));
                    break;
                }
                break;
            case 20:
                long longValue7 = ((AnonymousClass2Tw) r15.A00(0)).longValue();
                AnonymousClass2DG r62 = A00(r2).A00;
                C51432Kq r53 = new C51432Kq(r2);
                if (AnonymousClass2U1.A00()) {
                    AnonymousClass2D8[] r12 = new AnonymousClass2D8[1];
                    r62.A01(r62.A02).Bri(new C226039oC(r62, longValue7, new C226049oD(new C226069oF(r62, longValue7)), r12));
                    AnonymousClass2D8 r85 = r12[0];
                    if (r85 != null) {
                        LinkedList<AnonymousClass2D3> linkedList = r85.A04;
                        if (linkedList != null) {
                            boolean z2 = false;
                            for (AnonymousClass2D3 r36 : linkedList) {
                                z2 |= AnonymousClass2DG.A00(r36, longValue7);
                                if (z2 && (r3 = r36.A01) != null) {
                                    r53.A00(r3, C51422Kp.A01);
                                }
                            }
                        }
                        r85.Bri(new C226049oD(new C226059oE(r62, r53)));
                        break;
                    }
                }
                break;
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                Map map = (Map) C51412Ko.A02(r15.A00(0));
                C49662Dc A003 = C53552Tf.A00(r15.A00(1));
                try {
                    AnonymousClass992 r37 = new AnonymousClass992(r2, map.entrySet().iterator(), C15500n4.A00().A01);
                    r37.Aq2();
                    C15370mr r43 = (C15370mr) ((C15350mp) r2.A00.get(C0003R.C0005id.bloks_global_parser_map)).A00(r37, C15370mr.class);
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList2.size() == 0) {
                        arrayList2.add(C51412Ko.A00(r43));
                        C226909pd.A00(A003, new C51422Kp(arrayList2), r2);
                        break;
                    } else {
                        throw new IllegalArgumentException("arguments have to be continuous");
                    }
                } catch (IOException unused) {
                    C226909pd.A00(C53552Tf.A00(r15.A00(2)), C51422Kp.A01, r2);
                    break;
                }
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                try {
                    AnonymousClass992 r38 = new AnonymousClass992(r2, ((Map) C51412Ko.A02(r15.A00(0))).entrySet().iterator(), C15500n4.A00().A01);
                    r38.Aq2();
                    return C51412Ko.A00((C15370mr) ((C15350mp) r2.A00.get(C0003R.C0005id.bloks_global_parser_map)).A00(r38, C15370mr.class));
                } catch (IOException unused2) {
                    return C53602Tl.A00;
                }
            case 23:
                View view = ((AnonymousClass2DA) C51412Ko.A01(r15.A00(0))).getView();
                if (view != null) {
                    i = 1;
                    break;
                }
            case 24:
                View view2 = ((AnonymousClass2DA) C51412Ko.A01(r15.A00(0))).getView();
                if (view2 != null) {
                    view2.requestFocus();
                    ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                    i = 1;
                    break;
                }
            case 25:
                View view3 = A00(r2).A00.A02.getView();
                if (view3 != null) {
                    ((InputMethodManager) view3.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view3.getWindowToken(), 0);
                    break;
                }
                break;
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                ((AnonymousClass2U0) C51412Ko.A01(r15.A00(0))).A0F(((AnonymousClass2Tw) r15.A00(1)).intValue(), AnonymousClass2U3.A02((AnonymousClass2Tw) r15.A00(2)));
                break;
            case 27:
                AnonymousClass2U0 r86 = (AnonymousClass2U0) C51412Ko.A01(r15.A00(0));
                long longValue8 = ((AnonymousClass2Tw) r15.A00(1)).longValue();
                boolean A02 = AnonymousClass2U3.A02((AnonymousClass2Tw) r15.A00(2));
                if (AnonymousClass2U1.A00()) {
                    List list = r86.A00;
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                        } else {
                            Long AND = ((AnonymousClass2D8) list.get(i2)).AND();
                            if (AND == null || AND.longValue() != longValue8) {
                                i2++;
                            }
                        }
                    }
                    if (i2 >= 0) {
                        r86.A0F(i2, A02);
                        break;
                    }
                } else {
                    throw new RuntimeException("setIndexById cannot be called from a background thread.");
                }
                break;
            case 28:
                return C51412Ko.A00(A02(r15.A00(0), false));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return C51412Ko.A00(A02(r15.A00(0), AnonymousClass2U3.A02((AnonymousClass2Tw) r15.A00(1))));
            default:
                C15440my r0 = this.A00;
                if (r0 != null) {
                    return r0.ADQ(r14, r15, r2);
                }
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unknown lispy action type: ", str));
        }
        return C53602Tl.A00;
    }

    public C15430mx(C15440my r1) {
        this.A00 = r1;
    }

    public static C51382Kl A00(C53532Td r2) {
        return (C51382Kl) r2.A00.get(C0003R.C0005id.bloks_global_bloks_context);
    }
}
