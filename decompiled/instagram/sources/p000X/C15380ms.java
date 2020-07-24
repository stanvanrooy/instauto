package p000X;

import android.graphics.Color;
import com.facebook.android.maps.model.LatLng;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedList;

/* renamed from: X.0ms  reason: invalid class name and case insensitive filesystem */
public final class C15380ms implements C15390mt {
    public final /* synthetic */ C15360mq A00;

    public C15380ms(C15360mq r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v74, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v78, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v80, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v82, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v100, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v102, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v71 */
    /* JADX WARNING: type inference failed for: r3v84, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v29, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r6v97 */
    /* JADX WARNING: type inference failed for: r6v98, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v264 */
    /* JADX WARNING: type inference failed for: r3v265 */
    /* JADX WARNING: type inference failed for: r3v266 */
    /* JADX WARNING: type inference failed for: r3v267 */
    /* JADX WARNING: type inference failed for: r3v268 */
    /* JADX WARNING: type inference failed for: r3v269 */
    /* JADX WARNING: type inference failed for: r3v270 */
    /* JADX WARNING: type inference failed for: r4v88 */
    /* JADX WARNING: type inference failed for: r4v89 */
    /* JADX WARNING: type inference failed for: r4v90 */
    /* JADX WARNING: type inference failed for: r6v105 */
    /* JADX WARNING: type inference failed for: r6v106 */
    /* JADX WARNING: type inference failed for: r6v107 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 2832 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1634:0x219b, code lost:
        if (r4.equals(com.instagram.realtimeclient.GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) == false) goto L_0x219d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1642:0x21b1, code lost:
        if (r4.equals("destructive") == false) goto L_0x219d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1713:0x2308, code lost:
        if ("app_icon_url".equals(r3) != false) goto L_0x230a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1774:0x242f, code lost:
        if (r0 == false) goto L_0x240e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1776:0x2439, code lost:
        if (r0 == false) goto L_0x240e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1778:0x2444, code lost:
        if (r0 == false) goto L_0x240e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1780:0x244f, code lost:
        if (r0 == false) goto L_0x240e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1803:0x24b2, code lost:
        if (r0 == false) goto L_0x248a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1805:0x24bd, code lost:
        if (r0 == false) goto L_0x248a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1807:0x24c8, code lost:
        if (r0 == false) goto L_0x248a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1809:0x24d2, code lost:
        if (r0 == false) goto L_0x248a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1811:0x24dd, code lost:
        if (r0 == false) goto L_0x248a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1813:0x24e7, code lost:
        if (r0 == false) goto L_0x248a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1834:0x2551, code lost:
        if (r6.equals("wrap") == false) goto L_0x2534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1836:0x255c, code lost:
        if (r6.equals("wrap_reverse") == false) goto L_0x2534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1838:0x2566, code lost:
        if (r6.equals("no wrap") == false) goto L_0x2534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1840:0x2570, code lost:
        if (r6.equals("no_wrap") == false) goto L_0x2534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1904:0x26e8, code lost:
        if (r6.equals("start") == false) goto L_0x26ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1906:0x26f2, code lost:
        if (r6.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L_0x26ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1908:0x26fc, code lost:
        if (r6.equals("end") == false) goto L_0x26ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1910:0x2706, code lost:
        if (r6.equals("center") == false) goto L_0x26ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1918:0x2730, code lost:
        if (r7.equals("pager") == false) goto L_0x2732;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1926:0x2747, code lost:
        if (r7.equals("linear") == false) goto L_0x2732;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2008:0x2936, code lost:
        if (r3.equals("cap_words") == false) goto L_0x291f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2010:0x2940, code lost:
        if (r3.equals("amount") == false) goto L_0x291f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2012:0x294a, code lost:
        if (r3.equals("number") == false) goto L_0x291f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2014:0x2954, code lost:
        if (r3.equals(com.facebook.react.modules.datepicker.DatePickerDialogModule.ARG_DATE) == false) goto L_0x291f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2016:0x295c, code lost:
        if (r3.equals("text") == false) goto L_0x291f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2018:0x2966, code lost:
        if (r3.equals(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.EMAIL) == false) goto L_0x291f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2020:0x2970, code lost:
        if (r3.equals("passcode") == false) goto L_0x291f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2022:0x297a, code lost:
        if (r3.equals("password") == false) goto L_0x291f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2352:0x30e2, code lost:
        if (r3.equals("datetime") == false) goto L_0x30e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2362:0x30fe, code lost:
        if (r3.equals("time") == false) goto L_0x30e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2364:0x3108, code lost:
        if (r3.equals(com.facebook.react.modules.datepicker.DatePickerDialogModule.ARG_DATE) == false) goto L_0x30e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2380:0x313f, code lost:
        if (r3.equals("medium") == false) goto L_0x3125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2382:0x3149, code lost:
        if (r3.equals("full") == false) goto L_0x3125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2384:0x3153, code lost:
        if (r3.equals("long") == false) goto L_0x3125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2386:0x315e, code lost:
        if (r3.equals("short") == false) goto L_0x3125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x07b4, code lost:
        if (r3.equals("close") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x07be, code lost:
        if (r3.equals("check") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07c9, code lost:
        if (r3.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x07d3, code lost:
        if (r3.equals("next") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07dd, code lost:
        if (r3.equals("more") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07e7, code lost:
        if (r3.equals("info") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07f1, code lost:
        if (r3.equals("done") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07fb, code lost:
        if (r3.equals("back") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0806, code lost:
        if (r3.equals("add") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0812, code lost:
        if (r3.equals("reload") == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0b30, code lost:
        if (r4.equals("adjust_resize") == false) goto L_0x0b32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0b4b, code lost:
        if (r4.equals("adjust_hidden") == false) goto L_0x0b32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0e1d, code lost:
        if (r6.equals("blue_bold") == false) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0e27, code lost:
        if (r6.equals(com.instagram.realtimeclient.GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) == false) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0e31, code lost:
        if (r6.equals("blue") == false) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0e3c, code lost:
        if (r6.equals("red") == false) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0e47, code lost:
        if (r6.equals("red_bold") == false) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0ed4, code lost:
        if (r4.equals(com.instagram.realtimeclient.GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) == false) goto L_0x0ed6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x0eee, code lost:
        if (r4.equals("error") == false) goto L_0x0ed6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x0ef8, code lost:
        if (r4.equals("error_clear") == false) goto L_0x0ed6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object BWm(C49612Cx r13, C15350mp r14) {
        boolean z;
        String str;
        DateFormat dateFormat;
        char c;
        int i;
        char c2;
        Integer num;
        String Bqf;
        String Bqf2;
        String Bqf3;
        char c3;
        int i2;
        char c4;
        Integer num2;
        char c5;
        Integer num3;
        String Bqf4;
        char c6;
        A90 a90;
        char c7;
        AnonymousClass2DO r0;
        char c8;
        AnonymousClass2DN r02;
        String Bqf5;
        char c9;
        Integer num4;
        String Bqf6;
        C215579Qv r03;
        String str2;
        AnonymousClass2DK r04;
        String Bqf7;
        String Bqf8;
        String Bqf9;
        char c10;
        Integer num5;
        String Bqf10;
        char c11;
        Integer num6;
        String Bqf11;
        char c12;
        int i3;
        char c13;
        Integer num7;
        String Bqf12;
        String Bqf13;
        AnonymousClass2D0 r2 = new AnonymousClass2D0();
        if (r13.BX5() != Constants.A0C) {
            r13.Bov();
            r2 = null;
        } else {
            while (true) {
                Integer Aq2 = r13.Aq2();
                Integer num8 = Constants.A0N;
                if (Aq2 != num8) {
                    String BX1 = r13.BX1();
                    r13.Aq2();
                    if ("bk.components.Image".equals(BX1)) {
                        r2.A0A = AnonymousClass2DR.A00(r13, r14);
                    } else if ("ig.components.Video".equals(BX1)) {
                        C200348ht r3 = new C200348ht();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r3 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX12 = r13.BX1();
                                r13.Aq2();
                                String str3 = null;
                                if ("media_id".equals(BX12)) {
                                    if (!r13.BX6().Agh()) {
                                        str3 = r13.BX6().Bqf();
                                    }
                                    r3.A02 = str3;
                                } else if ("video_width".equals(BX12)) {
                                    r3.A01 = (float) r13.BX6().ACT();
                                } else if ("video_height".equals(BX12)) {
                                    r3.A00 = (float) r13.BX6().ACT();
                                } else if ("is_dash_eligible".equals(BX12)) {
                                    r3.A04 = r13.BX6().A6r();
                                } else if ("video_dash_manifest".equals(BX12)) {
                                    if (!r13.BX6().Agh()) {
                                        str3 = r13.BX6().Bqf();
                                    }
                                    r3.A03 = str3;
                                } else {
                                    AnonymousClass2DU.A00(r3, BX12, r13, r14);
                                }
                                r13.Bov();
                            }
                            r3.A0D();
                        }
                        r2.A05 = r3;
                    } else if ("ig.components.Icon".equals(BX1)) {
                        r2.A09 = AnonymousClass2DR.A00(r13, r14);
                    } else if ("ig.components.HashtagFollowButton".equals(BX1)) {
                        AEV aev = new AEV();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            aev = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX13 = r13.BX1();
                                r13.Aq2();
                                if ("hashtag".equals(BX13)) {
                                    aev.A00 = (C23243AEg) AnonymousClass2D4.A09(r13, r14);
                                } else if ("on_follow".equals(BX13)) {
                                    aev.A01 = C49642Da.A00(r13.BX6());
                                } else if ("on_unfollow".equals(BX13)) {
                                    aev.A02 = C49642Da.A00(r13.BX6());
                                } else {
                                    AnonymousClass2DU.A00(aev, BX13, r13, r14);
                                }
                                r13.Bov();
                            }
                            aev.A0D();
                        }
                        r2.A02 = aev;
                    } else if ("ig.components.Stepper".equals(BX1)) {
                        C174657dC r32 = new C174657dC();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r32 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX14 = r13.BX1();
                                r13.Aq2();
                                if ("step_count".equals(BX14)) {
                                    r32.A01 = Integer.valueOf(r13.BX6().Adk());
                                } else if ("current_step".equals(BX14)) {
                                    r32.A00 = Integer.valueOf(r13.BX6().Adk());
                                } else {
                                    AnonymousClass2DU.A00(r32, BX14, r13, r14);
                                }
                                r13.Bov();
                            }
                            r32.A0D();
                        }
                        r2.A0H = r32;
                    } else if ("ig.components.Spinner".equals(BX1)) {
                        C2110898m r4 = new C2110898m();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r4 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX15 = r13.BX1();
                                r13.Aq2();
                                if ("state".equals(BX15)) {
                                    r4.A00 = C2110898m.A00(r13.BX6().Bqf());
                                } else {
                                    AnonymousClass2DU.A00(r4, BX15, r13, r14);
                                }
                                r13.Bov();
                            }
                            r4.A0D();
                        }
                        r2.A0F = r4;
                    } else if ("ig.components.Slider".equals(BX1)) {
                        C23260AEz aEz = new C23260AEz();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            aEz = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX16 = r13.BX1();
                                r13.Aq2();
                                if ("min_value".equals(BX16)) {
                                    aEz.A03 = r13.BX6().Adk();
                                } else if ("max_value".equals(BX16)) {
                                    aEz.A02 = r13.BX6().Adk();
                                } else if ("initial_value".equals(BX16)) {
                                    aEz.A01 = (float) r13.BX6().ACT();
                                } else if ("on_change".equals(BX16)) {
                                    aEz.A04 = C49642Da.A00(r13.BX6());
                                } else {
                                    AnonymousClass2DU.A00(aEz, BX16, r13, r14);
                                }
                                r13.Bov();
                            }
                            aEz.A0D();
                        }
                        r2.A0E = aEz;
                    } else if ("ig.components.Switch".equals(BX1)) {
                        C23250AEn aEn = new C23250AEn();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            aEn = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX17 = r13.BX1();
                                r13.Aq2();
                                if ("state".equals(BX17)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf13 = null;
                                    } else {
                                        Bqf13 = r13.BX6().Bqf();
                                    }
                                    aEn.A02 = Bqf13;
                                } else if ("on_toggle".equals(BX17)) {
                                    aEn.A01 = C49642Da.A00(r13.BX6());
                                } else {
                                    AnonymousClass2DU.A00(aEn, BX17, r13, r14);
                                }
                                r13.Bov();
                            }
                            aEn.A0D();
                        }
                        r2.A0I = aEn;
                    } else if ("ig.components.maps.StaticMap".equals(BX1)) {
                        AF2 af2 = new AF2();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            af2 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX18 = r13.BX1();
                                r13.Aq2();
                                if ("region".equals(BX18)) {
                                    af2.A00 = (AF6) AnonymousClass2D4.A09(r13, r14);
                                } else if ("markers".equals(BX18)) {
                                    ArrayList arrayList = null;
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            AF5 af5 = (AF5) AnonymousClass2D4.A09(r13, r14);
                                            if (af5 != null) {
                                                arrayList.add(af5);
                                            }
                                        }
                                    }
                                    af2.A01 = arrayList;
                                } else {
                                    AnonymousClass2DU.A00(af2, BX18, r13, r14);
                                }
                                r13.Bov();
                            }
                            af2.A0D();
                        }
                        r2.A0G = af2;
                    } else if ("bk.components.PullToRefreshContainer".equals(BX1)) {
                        AnonymousClass2EQ r1 = new AnonymousClass2EQ();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r1 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX19 = r13.BX1();
                                r13.Aq2();
                                if ("is_refreshing".equals(BX19)) {
                                    r1.A04 = r13.BX6().A6r();
                                } else if ("on_refresh".equals(BX19)) {
                                    r1.A02 = C49642Da.A00(r13.BX6());
                                } else if ("child".equals(BX19)) {
                                    r1.A01 = (AnonymousClass2U0) AnonymousClass2D4.A09(r13, r14);
                                } else {
                                    AnonymousClass2DU.A00(r1, BX19, r13, r14);
                                }
                                r13.Bov();
                            }
                            r1.A0D();
                        }
                        r2.A0C = r1;
                    } else if ("ig.components.ConfirmationCode".equals(BX1)) {
                        C174617d8 r12 = new C174617d8();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r12 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX110 = r13.BX1();
                                r13.Aq2();
                                if ("middle_space".equals(BX110)) {
                                    r12.A04 = r13.BX6().A6r();
                                } else if ("text_size".equals(BX110)) {
                                    r12.A02 = Float.valueOf(AnonymousClass2D4.A01(r13.BX6().Bqf()));
                                } else if ("digit_count".equals(BX110)) {
                                    r12.A03 = Integer.valueOf(r13.BX6().Adk());
                                } else if ("on_change".equals(BX110)) {
                                    r12.A00 = C49642Da.A00(r13.BX6());
                                } else if ("on_proceed".equals(BX110)) {
                                    r12.A01 = C49642Da.A00(r13.BX6());
                                } else {
                                    AnonymousClass2DU.A00(r12, BX110, r13, r14);
                                }
                                r13.Bov();
                            }
                            r12.A0D();
                        }
                        r2.A01 = r12;
                    } else if ("ig.components.UserAvatar".equals(BX1)) {
                        AnonymousClass9AM r15 = new AnonymousClass9AM();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r15 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX111 = r13.BX1();
                                r13.Aq2();
                                if ("user".equals(BX111)) {
                                    r15.A00 = (AnonymousClass2UP) AnonymousClass2D4.A09(r13, r14);
                                } else if ("on_show_story".equals(BX111)) {
                                    r15.A02 = C49642Da.A00(r13.BX6());
                                } else if ("on_click_no_story".equals(BX111)) {
                                    r15.A01 = C49642Da.A00(r13.BX6());
                                } else if ("stroke_width".equals(BX111)) {
                                    r15.A04 = Float.valueOf(AnonymousClass2D4.A01(r13.BX6().Bqf()));
                                } else if ("stroke_color".equals(BX111)) {
                                    r15.A05 = Integer.valueOf(Color.parseColor(r13.BX6().Bqf()));
                                } else if ("show_seen_stories".equals(BX111)) {
                                    r15.A06 = r13.BX6().A6r();
                                } else if ("ring_spacing".equals(BX111)) {
                                    r15.A03 = Float.valueOf(AnonymousClass2D4.A01(r13.BX6().Bqf()));
                                } else {
                                    AnonymousClass2DU.A00(r15, BX111, r13, r14);
                                }
                                r13.Bov();
                            }
                            r15.A0D();
                        }
                        r2.A0L = r15;
                    } else if ("ig.components.Gif".equals(BX1)) {
                        C174627d9 r16 = new C174627d9();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r16 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX112 = r13.BX1();
                                r13.Aq2();
                                if (IgReactNavigatorModule.URL.equals(BX112)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf12 = null;
                                    } else {
                                        Bqf12 = r13.BX6().Bqf();
                                    }
                                    r16.A02 = Bqf12;
                                } else if ("scale_type".equals(BX112)) {
                                    r16.A00 = AnonymousClass2D4.A07(r13.BX6().Bqf());
                                } else {
                                    AnonymousClass2DU.A00(r16, BX112, r13, r14);
                                }
                                r13.Bov();
                            }
                            r16.A0D();
                        }
                        r2.A07 = r16;
                    } else if ("ig.components.Search".equals(BX1)) {
                        AnonymousClass2VM r42 = new AnonymousClass2VM();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r42 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX113 = r13.BX1();
                                r13.Aq2();
                                if ("null_state_models".equals(BX113)) {
                                    ArrayList arrayList2 = null;
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList2 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            AnonymousClass2D8 r05 = (AnonymousClass2D8) AnonymousClass2D4.A09(r13, r14);
                                            if (r05 != null) {
                                                arrayList2.add(r05);
                                            }
                                        }
                                    }
                                    r42.A04 = arrayList2;
                                } else if ("on_keyword_change".equals(BX113)) {
                                    r42.A03 = C49642Da.A00(r13.BX6());
                                } else {
                                    AnonymousClass2DH.A00(r42, BX113, r13, r14);
                                }
                                r13.Bov();
                            }
                            r42.A0D();
                        }
                        r2.A0D = r42;
                    } else if ("ig.components.screens.Navbar".equals(BX1)) {
                        C53632Tp r33 = new C53632Tp();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r33 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX114 = r13.BX1();
                                r13.Aq2();
                                ? r6 = 0;
                                if (DialogModule.KEY_TITLE.equals(BX114)) {
                                    if (!r13.BX6().Agh()) {
                                        r6 = r13.BX6().Bqf();
                                    }
                                    r33.A04 = r6;
                                } else if ("analytics_module".equals(BX114)) {
                                    if (!r13.BX6().Agh()) {
                                        r6 = r13.BX6().Bqf();
                                    }
                                    r33.A03 = r6;
                                } else if ("on_back_press".equals(BX114)) {
                                    r33.A02 = C49642Da.A00(r13.BX6());
                                } else if ("custom_title".equals(BX114)) {
                                    r33.A01 = (AnonymousClass2DA) AnonymousClass2D4.A09(r13, r14);
                                } else if ("hide_back_button".equals(BX114)) {
                                    r33.A06 = r13.BX6().A6r();
                                } else if ("hide_navbar".equals(BX114)) {
                                    r33.A08 = r13.BX6().A6r();
                                } else if ("left_button".equals(BX114)) {
                                    r33.A00 = (C146586Oj) AnonymousClass2D4.A09(r13, r14);
                                } else if ("right_buttons".equals(BX114)) {
                                    if (r13.BX5() == Constants.ZERO) {
                                        ArrayList arrayList3 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            C146586Oj r06 = (C146586Oj) AnonymousClass2D4.A09(r13, r14);
                                            if (r06 != null) {
                                                arrayList3.add(r06);
                                            }
                                        }
                                        r6 = arrayList3;
                                    }
                                    r33.A05 = r6;
                                } else if ("hide_divider".equals(BX114)) {
                                    r33.A07 = r13.BX6().A6r();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0w = r33;
                    } else if ("ig.components.screens.NavbarButton".equals(BX1)) {
                        C146586Oj r17 = new C146586Oj();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r17 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX115 = r13.BX1();
                                r13.Aq2();
                                if ("icon".equals(BX115)) {
                                    String Bqf14 = r13.BX6().Bqf();
                                    switch (Bqf14.hashCode()) {
                                        case -934641255:
                                            c13 = 2;
                                            break;
                                        case 96417:
                                            c13 = 8;
                                            break;
                                        case 3015911:
                                            c13 = 1;
                                            break;
                                        case 3089282:
                                            c13 = 6;
                                            break;
                                        case 3237038:
                                            c13 = 7;
                                            break;
                                        case 3357525:
                                            c13 = 3;
                                            break;
                                        case 3377907:
                                            c13 = 4;
                                            break;
                                        case 3387192:
                                            c13 = 9;
                                            break;
                                        case 94627080:
                                            c13 = 5;
                                            break;
                                        case 94756344:
                                            c13 = 0;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            num7 = Constants.A06;
                                            break;
                                        case 1:
                                            num7 = Constants.A08;
                                            break;
                                        case 2:
                                            num7 = Constants.A09;
                                            break;
                                        case 3:
                                            num7 = Constants.ZERO;
                                            break;
                                        case 4:
                                            num7 = Constants.ONE;
                                            break;
                                        case 5:
                                        case 6:
                                            num7 = Constants.A12;
                                            break;
                                        case 7:
                                            num7 = num8;
                                            break;
                                        case 8:
                                            num7 = Constants.A14;
                                            break;
                                        case 9:
                                            num7 = null;
                                            break;
                                        default:
                                            throw new AnonymousClass2EN(AnonymousClass000.A0E("Unsupported icon type: ", Bqf14));
                                    }
                                    r17.A01 = num7;
                                } else if ("action".equals(BX115)) {
                                    r17.A00 = C49642Da.A00(r13.BX6());
                                } else if ("button_title".equals(BX115)) {
                                    r17.A02 = r13.BX6().Agh() ? null : r13.BX6().Bqf();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0x = r17;
                    } else if ("ig.components.BottomSheet".equals(BX1)) {
                        AnonymousClass2UK r18 = new AnonymousClass2UK();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r18 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX116 = r13.BX1();
                                r13.Aq2();
                                String str4 = null;
                                if ("analytics_module".equals(BX116)) {
                                    if (!r13.BX6().Agh()) {
                                        str4 = r13.BX6().Bqf();
                                    }
                                    r18.A04 = str4;
                                } else if (DialogModule.KEY_TITLE.equals(BX116)) {
                                    if (!r13.BX6().Agh()) {
                                        str4 = r13.BX6().Bqf();
                                    }
                                    r18.A05 = str4;
                                } else if ("is_full_screen_enabled".equals(BX116)) {
                                    r18.A02 = Boolean.valueOf(r13.BX6().A6r());
                                } else if ("content".equals(BX116)) {
                                    r18.A00 = (AnonymousClass2DA) AnonymousClass2D4.A09(r13, r14);
                                } else if ("partial_height_percentage".equals(BX116)) {
                                    r18.A03 = Integer.valueOf(r13.BX6().Adk());
                                } else if ("on_dismiss".equals(BX116)) {
                                    r18.A01 = C49642Da.A00(r13.BX6());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0q = r18;
                    } else if ("ig.components.navigation.PageSelection".equals(BX1)) {
                        C53872Ur r19 = new C53872Ur();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r19 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX117 = r13.BX1();
                                r13.Aq2();
                                if ("stepper_index".equals(BX117)) {
                                    r19.A01 = Integer.valueOf(r13.BX6().Adk());
                                } else if ("stepper_capacity".equals(BX117)) {
                                    r19.A00 = Integer.valueOf(r13.BX6().Adk());
                                } else {
                                    String str5 = null;
                                    if ("title_text".equals(BX117)) {
                                        if (!r13.BX6().Agh()) {
                                            str5 = r13.BX6().Bqf();
                                        }
                                        r19.A08 = str5;
                                    } else if ("content_text".equals(BX117)) {
                                        if (!r13.BX6().Agh()) {
                                            str5 = r13.BX6().Bqf();
                                        }
                                        r19.A04 = str5;
                                    } else if ("button_text".equals(BX117)) {
                                        if (!r13.BX6().Agh()) {
                                            str5 = r13.BX6().Bqf();
                                        }
                                        r19.A03 = str5;
                                    } else if ("bottom_button_route".equals(BX117)) {
                                        if (!r13.BX6().Agh()) {
                                            str5 = r13.BX6().Bqf();
                                        }
                                        r19.A02 = str5;
                                    } else if ("waterfall_id".equals(BX117)) {
                                        if (!r13.BX6().Agh()) {
                                            str5 = r13.BX6().Bqf();
                                        }
                                        r19.A09 = str5;
                                    } else if ("entry_point".equals(BX117)) {
                                        if (!r13.BX6().Agh()) {
                                            str5 = r13.BX6().Bqf();
                                        }
                                        r19.A05 = str5;
                                    } else if ("prior_module".equals(BX117)) {
                                        if (!r13.BX6().Agh()) {
                                            str5 = r13.BX6().Bqf();
                                        }
                                        r19.A07 = str5;
                                    } else if ("presentation_style".equals(BX117)) {
                                        if (!r13.BX6().Agh()) {
                                            str5 = r13.BX6().Bqf();
                                        }
                                        r19.A06 = str5;
                                    }
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0v = r19;
                    } else if ("ig.components.screens.Screen".equals(BX1)) {
                        AnonymousClass2UJ r62 = new AnonymousClass2UJ();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r62 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX118 = r13.BX1();
                                r13.Aq2();
                                if ("initial_content".equals(BX118)) {
                                    r62.A01 = (AnonymousClass2DA) AnonymousClass2D4.A09(r13, r14);
                                } else if ("app_id".equals(BX118)) {
                                    r62.A05 = r13.BX6().Agh() ? null : r13.BX6().Bqf();
                                } else if ("screen_id".equals(BX118)) {
                                    r62.A04 = Long.valueOf(r13.BX6().AoH());
                                } else if ("navbar".equals(BX118)) {
                                    r62.A00 = (C53632Tp) AnonymousClass2D4.A09(r13, r14);
                                } else if ("show_tabbar".equals(BX118)) {
                                    r62.A06 = r13.BX6().A6r();
                                } else if ("perf_logging_id".equals(BX118)) {
                                    r62.A02 = Integer.valueOf(r13.BX6().Adk());
                                } else if (!"adjust_screen_resizing_from_keyboard".equals(BX118)) {
                                    continue;
                                } else {
                                    String Bqf15 = r13.BX6().Bqf();
                                    int hashCode = Bqf15.hashCode();
                                    if (hashCode == -1292790694) {
                                        c12 = 1;
                                    } else if (hashCode == -1009740956) {
                                        c12 = 0;
                                    }
                                    c12 = 65535;
                                    if (c12 == 0) {
                                        i3 = 16;
                                    } else if (c12 == 1) {
                                        i3 = 32;
                                    } else {
                                        throw new AnonymousClass2EN(AnonymousClass000.A0E("can't parse unknown mode: ", Bqf15));
                                    }
                                    r62.A03 = Integer.valueOf(i3);
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0u = r62;
                    } else if ("ig.components.maps.MapBoundingBox".equals(BX1)) {
                        AF3 af3 = new AF3();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            af3 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX119 = r13.BX1();
                                r13.Aq2();
                                if ("north".equals(BX119)) {
                                    af3.A01 = (float) r13.BX6().ACT();
                                } else if ("south".equals(BX119)) {
                                    af3.A02 = (float) r13.BX6().ACT();
                                } else if ("east".equals(BX119)) {
                                    af3.A00 = (float) r13.BX6().ACT();
                                } else if ("west".equals(BX119)) {
                                    af3.A03 = (float) r13.BX6().ACT();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0f = af3;
                    } else if ("ig.components.maps.MapCenter".equals(BX1)) {
                        AF4 af4 = new AF4();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            af4 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX120 = r13.BX1();
                                r13.Aq2();
                                if (IgStaticMapViewManager.LATITUDE_KEY.equals(BX120)) {
                                    af4.A00 = (float) r13.BX6().ACT();
                                } else if (IgStaticMapViewManager.LONGITUDE_KEY.equals(BX120)) {
                                    af4.A01 = (float) r13.BX6().ACT();
                                } else if ("zoom".equals(BX120)) {
                                    af4.A02 = r13.BX6().Adk();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0g = af4;
                    } else if ("ig.components.maps.MapMarker".equals(BX1)) {
                        AF5 af52 = new AF5();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            af52 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX121 = r13.BX1();
                                r13.Aq2();
                                if (IgStaticMapViewManager.LATITUDE_KEY.equals(BX121)) {
                                    af52.A00 = r13.BX6().ACT();
                                } else if (IgStaticMapViewManager.LONGITUDE_KEY.equals(BX121)) {
                                    af52.A01 = r13.BX6().ACT();
                                }
                                r13.Bov();
                            }
                            af52.A02 = new LatLng(af52.A00, af52.A01);
                        }
                        r2.A0h = af52;
                    } else if ("ig.components.dialog.Dialog".equals(BX1)) {
                        AnonymousClass2V2 r110 = new AnonymousClass2V2();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r110 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX122 = r13.BX1();
                                r13.Aq2();
                                String str6 = null;
                                if (DialogModule.KEY_TITLE.equals(BX122)) {
                                    if (!r13.BX6().Agh()) {
                                        str6 = r13.BX6().Bqf();
                                    }
                                    r110.A05 = str6;
                                } else if (DialogModule.KEY_MESSAGE.equals(BX122)) {
                                    if (!r13.BX6().Agh()) {
                                        str6 = r13.BX6().Bqf();
                                    }
                                    r110.A04 = str6;
                                } else if ("primary_button".equals(BX122)) {
                                    r110.A02 = (AnonymousClass2V3) AnonymousClass2D4.A09(r13, r14);
                                } else if ("auxillary_button".equals(BX122)) {
                                    r110.A00 = (AnonymousClass2V3) AnonymousClass2D4.A09(r13, r14);
                                } else if ("negative_button".equals(BX122)) {
                                    r110.A01 = (AnonymousClass2V3) AnonymousClass2D4.A09(r13, r14);
                                } else if (DialogModule.KEY_CANCELABLE.equals(BX122)) {
                                    r110.A07 = r13.BX6().A6r();
                                } else if ("cancel_on_touch_outside".equals(BX122)) {
                                    r110.A06 = r13.BX6().A6r();
                                } else if ("on_cancel".equals(BX122)) {
                                    r110.A03 = C49642Da.A00(r13.BX6());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0r = r110;
                    } else if ("ig.components.dialog.Button".equals(BX1)) {
                        AnonymousClass2V3 r8 = new AnonymousClass2V3();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r8 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX123 = r13.BX1();
                                r13.Aq2();
                                if ("text".equals(BX123)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf11 = null;
                                    } else {
                                        Bqf11 = r13.BX6().Bqf();
                                    }
                                    r8.A02 = Bqf11;
                                } else if ("on_click".equals(BX123)) {
                                    r8.A00 = C49642Da.A00(r13.BX6());
                                } else if ("should_dismiss_on_click".equals(BX123)) {
                                    r8.A03 = r13.BX6().A6r();
                                } else if ("style".equals(BX123)) {
                                    String Bqf16 = r13.BX6().Bqf();
                                    switch (Bqf16.hashCode()) {
                                        case -785846925:
                                            c11 = 4;
                                            break;
                                        case 112785:
                                            c11 = 3;
                                            break;
                                        case 3027034:
                                            c11 = 1;
                                            break;
                                        case 1544803905:
                                            c11 = 0;
                                            break;
                                        case 1949100874:
                                            c11 = 2;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    if (c11 == 0) {
                                        num6 = Constants.ZERO;
                                    } else if (c11 == 1) {
                                        num6 = Constants.ONE;
                                    } else if (c11 == 2) {
                                        num6 = Constants.A0C;
                                    } else if (c11 == 3) {
                                        num6 = num8;
                                    } else if (c11 == 4) {
                                        num6 = Constants.A0Y;
                                    } else {
                                        throw new AnonymousClass2EN(AnonymousClass000.A0E("Unknown button style ", Bqf16));
                                    }
                                    r8.A01 = num6;
                                } else {
                                    continue;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0s = r8;
                    } else if ("ig.components.snackbar.Snackbar".equals(BX1)) {
                        C53652Tr r63 = new C53652Tr();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r63 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX124 = r13.BX1();
                                r13.Aq2();
                                if (DialogModule.KEY_MESSAGE.equals(BX124)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf10 = null;
                                    } else {
                                        Bqf10 = r13.BX6().Bqf();
                                    }
                                    r63.A02 = Bqf10;
                                } else if ("button".equals(BX124)) {
                                    r63.A00 = (C53662Ts) AnonymousClass2D4.A09(r13, r14);
                                } else if (!"style".equals(BX124)) {
                                    continue;
                                } else {
                                    String Bqf17 = r13.BX6().Bqf();
                                    int hashCode2 = Bqf17.hashCode();
                                    if (hashCode2 == -833403562) {
                                        c10 = 2;
                                    } else if (hashCode2 == 96784904) {
                                        c10 = 1;
                                    } else if (hashCode2 == 1544803905) {
                                        c10 = 0;
                                    }
                                    c10 = 65535;
                                    if (c10 == 0) {
                                        num5 = Constants.ONE;
                                    } else if (c10 == 1) {
                                        num5 = Constants.A0C;
                                    } else if (c10 == 2) {
                                        num5 = num8;
                                    } else {
                                        throw new AnonymousClass2EN(AnonymousClass000.A0E("Unknown snackbar style ", Bqf17));
                                    }
                                    r63.A01 = num5;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0U = r63;
                    } else if ("ig.components.snackbar.Button".equals(BX1)) {
                        C53662Ts r34 = new C53662Ts();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r34 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX125 = r13.BX1();
                                r13.Aq2();
                                if ("text".equals(BX125)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf9 = null;
                                    } else {
                                        Bqf9 = r13.BX6().Bqf();
                                    }
                                    r34.A01 = Bqf9;
                                } else if ("on_click".equals(BX125)) {
                                    r34.A00 = C49642Da.A00(r13.BX6());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0V = r34;
                    } else if ("ig.data.InAppUrlConfig".equals(BX1)) {
                        C108404ll r43 = new C108404ll();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r43 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX126 = r13.BX1();
                                r13.Aq2();
                                if ("navbar_config".equals(BX126)) {
                                    r43.A00 = (C53632Tp) AnonymousClass2D4.A09(r13, r14);
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0y = r43;
                    } else if ("ig.components.navigation.OpenCommentsArgs".equals(BX1)) {
                        AnonymousClass2V8 r111 = new AnonymousClass2V8();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r111 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX127 = r13.BX1();
                                r13.Aq2();
                                if ("media_id".equals(BX127)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf8 = null;
                                    } else {
                                        Bqf8 = r13.BX6().Bqf();
                                    }
                                    r111.A04 = Bqf8;
                                } else if ("permalink_enabled".equals(BX127)) {
                                    r111.A02 = Boolean.valueOf(r13.BX6().A6r());
                                } else if ("hide_emoji_bar".equals(BX127)) {
                                    r111.A00 = Boolean.valueOf(r13.BX6().A6r());
                                } else if ("is_self_media".equals(BX127)) {
                                    r111.A01 = Boolean.valueOf(r13.BX6().A6r());
                                } else if ("scroll_behavior".equals(BX127)) {
                                    r111.A03 = Integer.valueOf(r13.BX6().Adk());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0t = r111;
                    } else if ("ig.components.ad4ad.PresentBoostPostParams".equals(BX1)) {
                        AnonymousClass2VJ r112 = new AnonymousClass2VJ();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r112 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX128 = r13.BX1();
                                r13.Aq2();
                                String str7 = null;
                                if ("media_id".equals(BX128)) {
                                    if (!r13.BX6().Agh()) {
                                        str7 = r13.BX6().Bqf();
                                    }
                                    r112.A01 = str7;
                                } else if ("coupon_offer_id".equals(BX128)) {
                                    if (!r13.BX6().Agh()) {
                                        str7 = r13.BX6().Bqf();
                                    }
                                    r112.A00 = str7;
                                } else if ("netego_id".equals(BX128)) {
                                    if (!r13.BX6().Agh()) {
                                        str7 = r13.BX6().Bqf();
                                    }
                                    r112.A02 = str7;
                                } else if ("netego_tracking_token".equals(BX128)) {
                                    if (!r13.BX6().Agh()) {
                                        str7 = r13.BX6().Bqf();
                                    }
                                    r112.A03 = str7;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0z = r112;
                    } else if ("ig.components.ViewpointExtension".equals(BX1)) {
                        AnonymousClass9AX r35 = new AnonymousClass9AX();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r35 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX129 = r13.BX1();
                                r13.Aq2();
                                AnonymousClass9AT.A00(r35, BX129, r13);
                                r13.Bov();
                            }
                        }
                        r2.A0Q = r35;
                    } else if ("ig.components.NetegoExtension".equals(BX1)) {
                        C49742Dk r36 = new C49742Dk();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r36 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX130 = r13.BX1();
                                r13.Aq2();
                                if ("on_scroll".equals(BX130)) {
                                    r36.A00 = C49642Da.A00(r13.BX6());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0N = r36;
                    } else if ("bk.components.VisibilityExtension".equals(BX1)) {
                        AnonymousClass9AY r37 = new AnonymousClass9AY();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r37 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX131 = r13.BX1();
                                r13.Aq2();
                                AnonymousClass9AT.A00(r37, BX131, r13);
                                r13.Bov();
                            }
                        }
                        r2.A0R = r37;
                    } else if ("ig.components.TooltipExtension".equals(BX1)) {
                        C211759Bh r38 = new C211759Bh();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r38 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX132 = r13.BX1();
                                r13.Aq2();
                                String str8 = null;
                                if ("tooltip_id".equals(BX132)) {
                                    if (!r13.BX6().Agh()) {
                                        str8 = r13.BX6().Bqf();
                                    }
                                    r38.A01 = str8;
                                } else if ("text".equals(BX132)) {
                                    if (!r13.BX6().Agh()) {
                                        str8 = r13.BX6().Bqf();
                                    }
                                    r38.A00 = str8;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0P = r38;
                    } else if ("ig.components.ShoppingNavBarExtension".equals(BX1)) {
                        C216919Xd r113 = new C216919Xd();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r113 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX133 = r13.BX1();
                                r13.Aq2();
                                String str9 = null;
                                if ("merchant_id".equals(BX133)) {
                                    if (!r13.BX6().Agh()) {
                                        str9 = r13.BX6().Bqf();
                                    }
                                    r113.A03 = str9;
                                } else if ("is_bag_enabled".equals(BX133)) {
                                    r113.A07 = r13.BX6().A6r();
                                } else if ("shopping_session_id".equals(BX133)) {
                                    if (!r13.BX6().Agh()) {
                                        str9 = r13.BX6().Bqf();
                                    }
                                    r113.A06 = str9;
                                } else if ("entry_point".equals(BX133)) {
                                    if (!r13.BX6().Agh()) {
                                        str9 = r13.BX6().Bqf();
                                    }
                                    r113.A02 = str9;
                                } else if ("prior_module".equals(BX133)) {
                                    if (!r13.BX6().Agh()) {
                                        str9 = r13.BX6().Bqf();
                                    }
                                    r113.A05 = str9;
                                } else if ("show_merchant_profile_icon".equals(BX133)) {
                                    r113.A08 = r13.BX6().A6r();
                                } else if ("show_shop_manager_entry".equals(BX133)) {
                                    r113.A09 = r13.BX6().A6r();
                                } else if ("module".equals(BX133)) {
                                    if (!r13.BX6().Agh()) {
                                        str9 = r13.BX6().Bqf();
                                    }
                                    r113.A04 = str9;
                                } else if ("on_shop_manager_close".equals(BX133)) {
                                    r113.A01 = C49642Da.A00(r13.BX6());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0M = r113;
                    } else if ("bk.components.CurrencyFormatterExtension".equals(BX1)) {
                        AnonymousClass94F r39 = new AnonymousClass94F();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r39 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX134 = r13.BX1();
                                r13.Aq2();
                                if ("currency_code".equals(BX134)) {
                                    r39.A02 = Currency.getInstance(r13.BX6().Bqf());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0O = r39;
                    } else if ("ig.elements.alien_object.user".equals(BX1)) {
                        AnonymousClass2UP r114 = new AnonymousClass2UP();
                        r114.A00 = C13300iJ.A00((C13080hr) r13.AK4());
                        r2.A0m = r114;
                    } else if ("ig.elements.alien_object.explore.hashtag".equals(BX1)) {
                        C23243AEg aEg = new C23243AEg();
                        aEg.A00 = C31261Xe.parseFromJson((C13080hr) r13.AK4());
                        r2.A0W = aEg;
                    } else if ("ig.components.linechart.TickMark".equals(BX1)) {
                        AnonymousClass9BM r115 = new AnonymousClass9BM();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r115 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX135 = r13.BX1();
                                r13.Aq2();
                                if ("value".equals(BX135)) {
                                    r115.A00 = Integer.valueOf(r13.BX6().Adk());
                                } else if (DialogModule.KEY_TITLE.equals(BX135)) {
                                    r115.A01 = r13.BX6().Agh() ? null : r13.BX6().Bqf();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0b = r115;
                    } else if ("ig.components.linechart.StringWrapper".equals(BX1)) {
                        AnonymousClass9BP r310 = new AnonymousClass9BP();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r310 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX136 = r13.BX1();
                                r13.Aq2();
                                if (IgNetworkingModule.REQUEST_BODY_KEY_STRING.equals(BX136)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf7 = null;
                                    } else {
                                        Bqf7 = r13.BX6().Bqf();
                                    }
                                    r310.A00 = Bqf7;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0a = r310;
                    } else if ("ig.components.linechart.IntegerWrapper".equals(BX1)) {
                        C108354lg r311 = new C108354lg();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r311 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX137 = r13.BX1();
                                r13.Aq2();
                                if ("integer".equals(BX137)) {
                                    r311.A00 = Integer.valueOf(r13.BX6().Adk());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0Y = r311;
                    } else if ("ig.components.linechart.LineSeries".equals(BX1)) {
                        AnonymousClass9BO r44 = new AnonymousClass9BO();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r44 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX138 = r13.BX1();
                                r13.Aq2();
                                if ("stroke_color".equals(BX138)) {
                                    r44.A03 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                } else if ("fill_color".equals(BX138)) {
                                    r44.A00 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                } else if ("negative_stroke_color".equals(BX138)) {
                                    r44.A02 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                } else if ("negative_fill_color".equals(BX138)) {
                                    r44.A01 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                } else if ("data_points".equals(BX138)) {
                                    ArrayList arrayList4 = null;
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList4 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            C108354lg r07 = (C108354lg) AnonymousClass2D4.A09(r13, r14);
                                            if (r07 != null) {
                                                arrayList4.add(r07);
                                            }
                                        }
                                    }
                                    r44.A04 = arrayList4;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0Z = r44;
                    } else if ("ig.components.linechart.Canvas".equals(BX1)) {
                        AnonymousClass9BK r64 = new AnonymousClass9BK();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r64 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX139 = r13.BX1();
                                r13.Aq2();
                                ArrayList arrayList5 = null;
                                if ("y_axis_tick_marks".equals(BX139)) {
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList5 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            AnonymousClass9BM r08 = (AnonymousClass9BM) AnonymousClass2D4.A09(r13, r14);
                                            if (r08 != null) {
                                                arrayList5.add(r08);
                                            }
                                        }
                                    }
                                    r64.A01 = arrayList5;
                                } else if ("x_axis_tick_marks".equals(BX139)) {
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList5 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            AnonymousClass9BP r09 = (AnonymousClass9BP) AnonymousClass2D4.A09(r13, r14);
                                            if (r09 != null) {
                                                arrayList5.add(r09);
                                            }
                                        }
                                    }
                                    r64.A00 = arrayList5;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0X = r64;
                    } else if ("ig.components.linechart.Chart".equals(BX1)) {
                        AnonymousClass2VP r312 = new AnonymousClass2VP();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r312 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX140 = r13.BX1();
                                r13.Aq2();
                                if ("canvas".equals(BX140)) {
                                    r312.A00 = (AnonymousClass9BK) AnonymousClass2D4.A09(r13, r14);
                                } else {
                                    ArrayList arrayList6 = null;
                                    if ("primary_series_list".equals(BX140)) {
                                        if (r13.BX5() == Constants.ZERO) {
                                            arrayList6 = new ArrayList();
                                            while (r13.Aq2() != Constants.ONE) {
                                                AnonymousClass9BO r010 = (AnonymousClass9BO) AnonymousClass2D4.A09(r13, r14);
                                                if (r010 != null) {
                                                    arrayList6.add(r010);
                                                }
                                            }
                                        }
                                        r312.A02 = arrayList6;
                                    } else if ("secondary_series_list".equals(BX140)) {
                                        if (r13.BX5() == Constants.ZERO) {
                                            arrayList6 = new ArrayList();
                                            while (r13.Aq2() != Constants.ONE) {
                                                AnonymousClass9BO r011 = (AnonymousClass9BO) AnonymousClass2D4.A09(r13, r14);
                                                if (r011 != null) {
                                                    arrayList6.add(r011);
                                                }
                                            }
                                        }
                                        r312.A03 = arrayList6;
                                    } else if ("on_click".equals(BX140)) {
                                        r312.A01 = C49642Da.A00(r13.BX6());
                                    } else {
                                        AnonymousClass2DU.A00(r312, BX140, r13, r14);
                                    }
                                }
                                r13.Bov();
                            }
                            r312.A0D();
                        }
                        r2.A0B = r312;
                    } else if ("ig.components.linechart.ChartV2".equals(BX1)) {
                        AnonymousClass9BY r313 = new AnonymousClass9BY();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r313 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX141 = r13.BX1();
                                r13.Aq2();
                                if ("canvas".equals(BX141)) {
                                    r313.A00 = (AnonymousClass9BZ) AnonymousClass2D4.A09(r13, r14);
                                } else {
                                    ArrayList arrayList7 = null;
                                    if ("primary_series_list".equals(BX141)) {
                                        if (r13.BX5() == Constants.ZERO) {
                                            arrayList7 = new ArrayList();
                                            while (r13.Aq2() != Constants.ONE) {
                                                C211689Ba r012 = (C211689Ba) AnonymousClass2D4.A09(r13, r14);
                                                if (r012 != null) {
                                                    arrayList7.add(r012);
                                                }
                                            }
                                        }
                                        r313.A02 = arrayList7;
                                    } else if ("secondary_series_list".equals(BX141)) {
                                        if (r13.BX5() == Constants.ZERO) {
                                            arrayList7 = new ArrayList();
                                            while (r13.Aq2() != Constants.ONE) {
                                                C211689Ba r013 = (C211689Ba) AnonymousClass2D4.A09(r13, r14);
                                                if (r013 != null) {
                                                    arrayList7.add(r013);
                                                }
                                            }
                                        }
                                        r313.A03 = arrayList7;
                                    } else if ("on_click".equals(BX141)) {
                                        r313.A01 = C49642Da.A00(r13.BX6());
                                    } else {
                                        AnonymousClass2DU.A00(r313, BX141, r13, r14);
                                    }
                                }
                                r13.Bov();
                            }
                            r313.A0D();
                        }
                        r2.A03 = r313;
                    } else if ("ig.components.linechart.CanvasV2".equals(BX1)) {
                        AnonymousClass9BZ r45 = new AnonymousClass9BZ();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r45 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX142 = r13.BX1();
                                r13.Aq2();
                                ArrayList arrayList8 = null;
                                if ("y_axis_tick_marks".equals(BX142)) {
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList8 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            AnonymousClass9BP r014 = (AnonymousClass9BP) AnonymousClass2D4.A09(r13, r14);
                                            if (r014 != null) {
                                                arrayList8.add(r014);
                                            }
                                        }
                                    }
                                    r45.A05 = arrayList8;
                                } else if ("x_axis_tick_marks".equals(BX142)) {
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList8 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            AnonymousClass9BP r015 = (AnonymousClass9BP) AnonymousClass2D4.A09(r13, r14);
                                            if (r015 != null) {
                                                arrayList8.add(r015);
                                            }
                                        }
                                    }
                                    r45.A04 = arrayList8;
                                } else if ("min_x".equals(BX142)) {
                                    r45.A02 = new Float(r13.BX6().ACT());
                                } else if ("max_x".equals(BX142)) {
                                    r45.A00 = new Float(r13.BX6().ACT());
                                } else if ("min_y".equals(BX142)) {
                                    r45.A03 = new Float(r13.BX6().ACT());
                                } else if ("max_y".equals(BX142)) {
                                    r45.A01 = new Float(r13.BX6().ACT());
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0c = r45;
                    } else if ("ig.components.linechart.LineSeriesV2".equals(BX1)) {
                        C211689Ba r116 = new C211689Ba();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r116 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX143 = r13.BX1();
                                r13.Aq2();
                                if ("data_points".equals(BX143)) {
                                    ArrayList arrayList9 = null;
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList9 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            C211699Bb r016 = (C211699Bb) AnonymousClass2D4.A09(r13, r14);
                                            if (r016 != null) {
                                                arrayList9.add(r016);
                                            }
                                        }
                                    }
                                    r116.A04 = arrayList9;
                                } else if ("stroke_color".equals(BX143)) {
                                    r116.A03 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                } else if ("negative_stroke_color".equals(BX143)) {
                                    r116.A02 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                } else if ("negative_fill_color".equals(BX143)) {
                                    r116.A01 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                } else if ("fill_color".equals(BX143)) {
                                    r116.A00 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0e = r116;
                    } else if ("ig.components.linechart.DataPoint".equals(BX1)) {
                        C211699Bb r314 = new C211699Bb();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r314 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX144 = r13.BX1();
                                r13.Aq2();
                                if ("x".equals(BX144)) {
                                    r314.A00 = new Float(r13.BX6().ACT());
                                } else if ("y".equals(BX144)) {
                                    r314.A01 = new Float(r13.BX6().ACT());
                                } else if ("description".equals(BX144)) {
                                    r314.A02 = r13.BX6().Agh() ? null : r13.BX6().Bqf();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0d = r314;
                    } else if ("ig.components.FollowButton".equals(BX1)) {
                        C200318hq r117 = new C200318hq();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r117 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX145 = r13.BX1();
                                r13.Aq2();
                                if ("target_user".equals(BX145)) {
                                    r117.A00 = (AnonymousClass2UP) AnonymousClass2D4.A09(r13, r14);
                                } else if ("on_follow_button_press".equals(BX145)) {
                                    r117.A02 = C49642Da.A00(r13.BX6());
                                } else if ("on_follow_button_cancel".equals(BX145)) {
                                    r117.A01 = C49642Da.A00(r13.BX6());
                                } else {
                                    AnonymousClass2DU.A00(r117, BX145, r13, r14);
                                }
                                r13.Bov();
                            }
                            r117.A0D();
                        }
                        r2.A06 = r117;
                    } else if ("ig.components.CheckoutSignalingTextProvider".equals(BX1)) {
                        AnonymousClass9BQ r315 = new AnonymousClass9BQ();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r315 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX146 = r13.BX1();
                                r13.Aq2();
                                if ("padding_horizontal".equals(BX146)) {
                                    r315.A00 = AnonymousClass2D4.A08(r13.BX6().Bqf());
                                }
                                r13.Bov();
                            }
                            r315.A01 = C170547Qw.A00(C15500n4.A00().A00, (int) r315.A00.A00);
                        }
                        r2.A0S = r315;
                    } else if ("ig.components.GradientText".equals(BX1)) {
                        AnonymousClass987 r118 = new AnonymousClass987();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r118 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX147 = r13.BX1();
                                r13.Aq2();
                                ? r46 = 0;
                                if ("text".equals(BX147)) {
                                    if (!r13.BX6().Agh()) {
                                        r46 = r13.BX6().Bqf();
                                    }
                                    r118.A06 = r46;
                                } else if ("gradient_colors".equals(BX147)) {
                                    if (r13.BX5() == Constants.ZERO) {
                                        ArrayList arrayList10 = new ArrayList();
                                        do {
                                            r46 = arrayList10;
                                            if (r13.Aq2() != Constants.ONE) {
                                                r04 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                            }
                                        } while (r04 == null);
                                        arrayList10.add(r04);
                                    }
                                    r118.A07 = r46;
                                } else if ("gradient_orientation".equals(BX147)) {
                                    r118.A00 = AnonymousClass2D4.A06(r13.BX6().Bqf());
                                } else if ("text_style".equals(BX147)) {
                                    r118.A04 = Integer.valueOf(AnonymousClass2D4.A05(r13.BX6().Bqf()));
                                } else if ("text_size".equals(BX147)) {
                                    r118.A02 = Float.valueOf(AnonymousClass2D4.A02(r13.BX6().Bqf()));
                                } else if ("text_align".equals(BX147)) {
                                    r118.A03 = Integer.valueOf(AnonymousClass2D4.A04(r13.BX6().Bqf()));
                                } else if ("font_family".equals(BX147)) {
                                    if (!r13.BX6().Agh()) {
                                        r46 = r13.BX6().Bqf();
                                    }
                                    r118.A05 = r46;
                                } else if ("text_themed_color".equals(BX147)) {
                                    r118.A01 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                } else {
                                    AnonymousClass2DU.A00(r118, BX147, r13, r14);
                                }
                                r13.Bov();
                            }
                            r118.A0D();
                        }
                        r2.A08 = r118;
                    } else if ("ig.components.LaunchInfoTextProvider".equals(BX1)) {
                        AnonymousClass9A9 r316 = new AnonymousClass9A9();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r316 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX148 = r13.BX1();
                                r13.Aq2();
                                if ("timestamp".equals(BX148)) {
                                    r316.A00 = Integer.valueOf(r13.BX6().Adk());
                                } else if ("format".equals(BX148)) {
                                    r316.A01 = r13.BX6().Agh() ? null : r13.BX6().Bqf();
                                }
                                r13.Bov();
                            }
                            CharSequence A002 = AnonymousClass7RB.A00(((long) r316.A00.intValue()) * 1000, C15500n4.A00().A00, r316.A01.equals(DatePickerDialogModule.ARG_DATE), true, 32);
                            if (A002 != null) {
                                str2 = A002.toString();
                            } else {
                                str2 = null;
                            }
                            r316.A02 = str2;
                        }
                        r2.A0T = r316;
                    } else if ("mini.data.Product".equals(BX1)) {
                        C215579Qv r119 = new C215579Qv();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r119 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX149 = r13.BX1();
                                r13.Aq2();
                                String str10 = null;
                                if ("product_id".equals(BX149)) {
                                    if (!r13.BX6().Agh()) {
                                        str10 = r13.BX6().Bqf();
                                    }
                                    r119.A09 = str10;
                                } else if ("name".equals(BX149)) {
                                    if (!r13.BX6().Agh()) {
                                        str10 = r13.BX6().Bqf();
                                    }
                                    r119.A08 = str10;
                                } else if ("merchant_id".equals(BX149)) {
                                    if (!r13.BX6().Agh()) {
                                        r13.BX6().Bqf();
                                    }
                                } else if ("current_price".equals(BX149)) {
                                    if (!r13.BX6().Agh()) {
                                        str10 = r13.BX6().Bqf();
                                    }
                                    r119.A04 = str10;
                                } else if ("full_price".equals(BX149)) {
                                    if (!r13.BX6().Agh()) {
                                        str10 = r13.BX6().Bqf();
                                    }
                                    r119.A06 = str10;
                                } else if ("current_price_stripped".equals(BX149)) {
                                    if (!r13.BX6().Agh()) {
                                        str10 = r13.BX6().Bqf();
                                    }
                                    r119.A05 = str10;
                                } else if ("full_price_stripped".equals(BX149)) {
                                    if (!r13.BX6().Agh()) {
                                        str10 = r13.BX6().Bqf();
                                    }
                                    r119.A07 = str10;
                                } else if ("main_image".equals(BX149)) {
                                    r119.A02 = (AnonymousClass9R0) AnonymousClass2D4.A09(r13, r14);
                                } else if ("merchant".equals(BX149)) {
                                    r119.A01 = (AnonymousClass9Qz) AnonymousClass2D4.A09(r13, r14);
                                } else if ("has_viewer_saved".equals(BX149)) {
                                    r119.A0A = r13.BX6().A6r();
                                } else if ("thumbnail_image".equals(BX149)) {
                                    r119.A03 = (AnonymousClass9R0) AnonymousClass2D4.A09(r13, r14);
                                } else if ("inventory_quantity".equals(BX149)) {
                                    r119.A00 = r13.BX6().Adk();
                                } else if ("is_checkout_enabled".equals(BX149)) {
                                    r119.A0B = r13.BX6().A6r();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0j = r119;
                    } else if ("mini.data.ProductImage".equals(BX1)) {
                        AnonymousClass9R0 r120 = new AnonymousClass9R0();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r120 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX150 = r13.BX1();
                                r13.Aq2();
                                String str11 = null;
                                if ("image_id".equals(BX150)) {
                                    if (!r13.BX6().Agh()) {
                                        r13.BX6().Bqf();
                                    }
                                } else if (IgReactNavigatorModule.URL.equals(BX150)) {
                                    if (!r13.BX6().Agh()) {
                                        str11 = r13.BX6().Bqf();
                                    }
                                    r120.A02 = str11;
                                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(BX150)) {
                                    r120.A01 = r13.BX6().Adk();
                                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(BX150)) {
                                    r120.A00 = r13.BX6().Adk();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0k = r120;
                    } else if ("mini.data.ProductVariant".equals(BX1)) {
                        C108364lh r121 = new C108364lh();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r121 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX151 = r13.BX1();
                                r13.Aq2();
                                if ("variant_id".equals(BX151) || "variant_name".equals(BX151) || "variant_value".equals(BX151) || "variant_style".equals(BX151)) {
                                    if (!r13.BX6().Agh()) {
                                        r13.BX6().Bqf();
                                    }
                                } else if ("is_preselected".equals(BX151)) {
                                    r13.BX6().A6r();
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0l = r121;
                    } else if ("mini.data.Merchant".equals(BX1)) {
                        AnonymousClass9Qz r122 = new AnonymousClass9Qz();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r122 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX152 = r13.BX1();
                                r13.Aq2();
                                String str12 = null;
                                if ("merchant_id".equals(BX152)) {
                                    if (!r13.BX6().Agh()) {
                                        str12 = r13.BX6().Bqf();
                                    }
                                    r122.A00 = str12;
                                } else if ("username".equals(BX152)) {
                                    if (!r13.BX6().Agh()) {
                                        str12 = r13.BX6().Bqf();
                                    }
                                    r122.A02 = str12;
                                } else if ("profile_pic_url".equals(BX152)) {
                                    if (!r13.BX6().Agh()) {
                                        str12 = r13.BX6().Bqf();
                                    }
                                    r122.A01 = str12;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0i = r122;
                    } else if ("mini.components.ProductSaveButton".equals(BX1)) {
                        C212249Dj r123 = new C212249Dj();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r123 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX153 = r13.BX1();
                                r13.Aq2();
                                String str13 = null;
                                if ("product_id".equals(BX153) || "merchant_id".equals(BX153)) {
                                    if (!r13.BX6().Agh()) {
                                        r13.BX6().Bqf();
                                    }
                                } else if ("product".equals(BX153)) {
                                    r123.A00 = (C215579Qv) AnonymousClass2D4.A09(r13, r14);
                                } else if ("prior_module".equals(BX153)) {
                                    if (!r13.BX6().Agh()) {
                                        str13 = r13.BX6().Bqf();
                                    }
                                    r123.A02 = str13;
                                } else if ("prior_submodule".equals(BX153)) {
                                    if (!r13.BX6().Agh()) {
                                        str13 = r13.BX6().Bqf();
                                    }
                                    r123.A03 = str13;
                                } else if ("shopping_session_id".equals(BX153)) {
                                    if (!r13.BX6().Agh()) {
                                        str13 = r13.BX6().Bqf();
                                    }
                                    r123.A04 = str13;
                                } else if ("submodule".equals(BX153)) {
                                    if (!r13.BX6().Agh()) {
                                        str13 = r13.BX6().Bqf();
                                    }
                                    r123.A05 = str13;
                                } else if ("module".equals(BX153)) {
                                    if (!r13.BX6().Agh()) {
                                        str13 = r13.BX6().Bqf();
                                    }
                                    r123.A01 = str13;
                                } else {
                                    AnonymousClass2DU.A00(r123, BX153, r13, r14);
                                }
                                r13.Bov();
                            }
                            r123.A0D();
                        }
                        r2.A0J = r123;
                    } else if ("mini.components.ReconsiderationTile".equals(BX1)) {
                        C215589Qw r124 = new C215589Qw();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r124 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX154 = r13.BX1();
                                r13.Aq2();
                                if ("merchant".equals(BX154)) {
                                    r124.A00 = (AnonymousClass9Qz) AnonymousClass2D4.A09(r13, r14);
                                } else {
                                    ? r317 = 0;
                                    if ("initial_products".equals(BX154)) {
                                        if (r13.BX5() == Constants.ZERO) {
                                            ArrayList arrayList11 = new ArrayList();
                                            do {
                                                r317 = arrayList11;
                                                if (r13.Aq2() != Constants.ONE) {
                                                    r03 = (C215579Qv) AnonymousClass2D4.A09(r13, r14);
                                                }
                                            } while (r03 == null);
                                            arrayList11.add(r03);
                                        }
                                        r124.A07 = r317;
                                    } else if (DialogModule.KEY_TITLE.equals(BX154)) {
                                        if (!r13.BX6().Agh()) {
                                            r317 = r13.BX6().Bqf();
                                        }
                                        r124.A06 = r317;
                                    } else if ("subtitle".equals(BX154)) {
                                        if (!r13.BX6().Agh()) {
                                            r317 = r13.BX6().Bqf();
                                        }
                                        r124.A05 = r317;
                                    } else if ("prior_module".equals(BX154)) {
                                        if (!r13.BX6().Agh()) {
                                            r317 = r13.BX6().Bqf();
                                        }
                                        r124.A02 = r317;
                                    } else if ("prior_submodule".equals(BX154)) {
                                        if (!r13.BX6().Agh()) {
                                            r317 = r13.BX6().Bqf();
                                        }
                                        r124.A03 = r317;
                                    } else if ("module".equals(BX154)) {
                                        if (!r13.BX6().Agh()) {
                                            r317 = r13.BX6().Bqf();
                                        }
                                        r124.A01 = r317;
                                    } else if ("shopping_session_id".equals(BX154)) {
                                        if (!r13.BX6().Agh()) {
                                            r317 = r13.BX6().Bqf();
                                        }
                                        r124.A04 = r317;
                                    } else {
                                        AnonymousClass2DU.A00(r124, BX154, r13, r14);
                                    }
                                }
                                r13.Bov();
                            }
                            r124.A0D();
                        }
                        r2.A0K = r124;
                    } else if ("ig.components.ActionSheet".equals(BX1)) {
                        BXD bxd = new BXD();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            bxd = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX155 = r13.BX1();
                                r13.Aq2();
                                if ("items".equals(BX155)) {
                                    ArrayList arrayList12 = null;
                                    if (r13.BX5() == Constants.ZERO) {
                                        arrayList12 = new ArrayList();
                                        while (r13.Aq2() != Constants.ONE) {
                                            C225049mW r017 = (C225049mW) AnonymousClass2D4.A09(r13, r14);
                                            if (r017 != null) {
                                                arrayList12.add(r017);
                                            }
                                        }
                                    }
                                    bxd.A02 = arrayList12;
                                } else if ("primary_text".equals(BX155)) {
                                    bxd.A00 = (BXE) AnonymousClass2D4.A09(r13, r14);
                                } else if ("secondary_text".equals(BX155)) {
                                    bxd.A01 = (BXE) AnonymousClass2D4.A09(r13, r14);
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0n = bxd;
                    } else if ("ig.components.ActionSheetItem".equals(BX1)) {
                        C225049mW r65 = new C225049mW();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r65 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX156 = r13.BX1();
                                r13.Aq2();
                                if (DialogModule.KEY_TITLE.equals(BX156)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf6 = null;
                                    } else {
                                        Bqf6 = r13.BX6().Bqf();
                                    }
                                    r65.A02 = Bqf6;
                                } else if ("on_press".equals(BX156)) {
                                    r65.A00 = C49642Da.A00(r13.BX6());
                                } else if ("style".equals(BX156)) {
                                    String Bqf18 = r13.BX6().Bqf();
                                    int hashCode3 = Bqf18.hashCode();
                                    if (hashCode3 == -1829997182) {
                                        c9 = 1;
                                    } else if (hashCode3 == 1544803905) {
                                        c9 = 0;
                                    }
                                    c9 = 65535;
                                    if (c9 == 0) {
                                        num4 = Constants.ZERO;
                                    } else if (c9 == 1) {
                                        num4 = Constants.ONE;
                                    } else {
                                        throw new AnonymousClass2EN(AnonymousClass000.A0E("Unknown action sheet item style: ", Bqf18));
                                    }
                                    r65.A01 = num4;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0o = r65;
                    } else if ("ig.components.ActionSheetText".equals(BX1)) {
                        BXE bxe = new BXE();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            bxe = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX157 = r13.BX1();
                                r13.Aq2();
                                if ("text".equals(BX157)) {
                                    if (r13.BX6().Agh()) {
                                        Bqf5 = null;
                                    } else {
                                        Bqf5 = r13.BX6().Bqf();
                                    }
                                    bxe.A00 = Bqf5;
                                }
                                r13.Bov();
                            }
                        }
                        r2.A0p = bxe;
                    } else if ("ig.components.navigation.PurchaseOptionAddUrl".equals(BX1)) {
                        C108344lf r125 = new C108344lf();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            r125 = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX158 = r13.BX1();
                                r13.Aq2();
                                String str14 = null;
                                if ("session_id".equals(BX158)) {
                                    if (!r13.BX6().Agh()) {
                                        str14 = r13.BX6().Bqf();
                                    }
                                    r125.A04 = str14;
                                } else if ("entry_point".equals(BX158)) {
                                    if (!r13.BX6().Agh()) {
                                        str14 = r13.BX6().Bqf();
                                    }
                                    r125.A01 = str14;
                                } else if ("service_type".equals(BX158)) {
                                    if (!r13.BX6().Agh()) {
                                        str14 = r13.BX6().Bqf();
                                    }
                                    r125.A03 = str14;
                                } else if ("partner_name".equals(BX158)) {
                                    if (!r13.BX6().Agh()) {
                                        str14 = r13.BX6().Bqf();
                                    }
                                    r125.A02 = str14;
                                } else if ("app_id".equals(BX158)) {
                                    if (!r13.BX6().Agh()) {
                                        str14 = r13.BX6().Bqf();
                                    }
                                    r125.A00 = str14;
                                } else if (IgReactNavigatorModule.URL.equals(BX158)) {
                                    if (!r13.BX6().Agh()) {
                                        str14 = r13.BX6().Bqf();
                                    }
                                    r125.A05 = str14;
                                } else {
                                    if (!"partner_type".equals(BX158)) {
                                        if ("is_editing_partner".equals(BX158) || "is_stories_flow".equals(BX158) || "should_fetch_partner".equals(BX158)) {
                                            r13.BX6().A6r();
                                        }
                                    }
                                    if (!r13.BX6().Agh()) {
                                        r13.BX6().Bqf();
                                    }
                                }
                                r13.Bov();
                            }
                        }
                        r2.A04 = r125;
                    } else if ("bk.components.SearchBar".equals(BX1)) {
                        C23259AEy aEy = new C23259AEy();
                        if (r13.BX5() != Constants.A0C) {
                            r13.Bov();
                            aEy = null;
                        } else {
                            while (r13.Aq2() != num8) {
                                String BX159 = r13.BX1();
                                r13.Aq2();
                                String str15 = null;
                                if ("placeholder".equals(BX159)) {
                                    if (!r13.BX6().Agh()) {
                                        str15 = r13.BX6().Bqf();
                                    }
                                    aEy.A02 = str15;
                                } else if ("text".equals(BX159)) {
                                    if (!r13.BX6().Agh()) {
                                        str15 = r13.BX6().Bqf();
                                    }
                                    aEy.A03 = str15;
                                } else if ("on_focus".equals(BX159)) {
                                    aEy.A00 = C49642Da.A00(r13.BX6());
                                } else if ("on_text_change".equals(BX159)) {
                                    aEy.A01 = C49642Da.A00(r13.BX6());
                                } else {
                                    AnonymousClass2DU.A00(aEy, BX159, r13, r14);
                                }
                                r13.Bov();
                            }
                            aEy.A0D();
                        }
                        r2.A00 = aEy;
                    } else {
                        if ("bk.components.Flexbox".equals(BX1)) {
                            AnonymousClass2D6 r126 = new AnonymousClass2D6();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r126 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX160 = r13.BX1();
                                    r13.Aq2();
                                    if ("flex_direction".equals(BX160)) {
                                        C49632Cz BX6 = r13.BX6();
                                        String Bqf19 = BX6.Bqf();
                                        switch (Bqf19.hashCode()) {
                                            case -1781065991:
                                                boolean equals = Bqf19.equals("column_reverse");
                                                c8 = 2;
                                                break;
                                            case -1354837162:
                                                boolean equals2 = Bqf19.equals("column");
                                                c8 = 0;
                                                break;
                                            case -207799939:
                                                boolean equals3 = Bqf19.equals("row_reverse");
                                                c8 = 3;
                                                break;
                                            case 113114:
                                                boolean equals4 = Bqf19.equals("row");
                                                c8 = 1;
                                                break;
                                            default:
                                                c8 = 65535;
                                                break;
                                        }
                                        if (c8 == 0) {
                                            r02 = AnonymousClass2DN.COLUMN;
                                        } else if (c8 == 1) {
                                            r02 = AnonymousClass2DN.ROW;
                                        } else if (c8 == 2) {
                                            r02 = AnonymousClass2DN.COLUMN_REVERSE;
                                        } else if (c8 == 3) {
                                            r02 = AnonymousClass2DN.ROW_REVERSE;
                                        } else {
                                            throw new AnonymousClass2EN(AnonymousClass000.A0E("unknown flex direction ", BX6.Bqf()));
                                        }
                                        r126.A03 = r02;
                                    } else if (RealtimeProtocol.DIRECT_V2_MESSAGE_POLICY_VIOLATION_VISIBILITY_CHANGED.equals(BX160)) {
                                        r126.A00 = AnonymousClass2DI.A02(r13.BX6().Bqf()).intValue();
                                    } else if ("justify_content".equals(BX160)) {
                                        C49632Cz BX62 = r13.BX6();
                                        String Bqf20 = BX62.Bqf();
                                        switch (Bqf20.hashCode()) {
                                            case -1364013995:
                                                boolean equals5 = Bqf20.equals("center");
                                                c7 = 2;
                                                break;
                                            case -932331738:
                                                boolean equals6 = Bqf20.equals("space_around");
                                                c7 = 5;
                                                break;
                                            case -814425728:
                                                boolean equals7 = Bqf20.equals("space_evenly");
                                                c7 = 4;
                                                break;
                                            case 1384876188:
                                                boolean equals8 = Bqf20.equals("flex_start");
                                                c7 = 0;
                                                break;
                                            case 1682480591:
                                                boolean equals9 = Bqf20.equals("space_between");
                                                c7 = 3;
                                                break;
                                            case 1744442261:
                                                boolean equals10 = Bqf20.equals("flex_end");
                                                c7 = 1;
                                                break;
                                            default:
                                                c7 = 65535;
                                                break;
                                        }
                                        if (c7 == 0) {
                                            r0 = AnonymousClass2DO.FLEX_START;
                                        } else if (c7 == 1) {
                                            r0 = AnonymousClass2DO.FLEX_END;
                                        } else if (c7 == 2) {
                                            r0 = AnonymousClass2DO.CENTER;
                                        } else if (c7 == 3) {
                                            r0 = AnonymousClass2DO.SPACE_BETWEEN;
                                        } else if (c7 == 4) {
                                            r0 = AnonymousClass2DO.SPACE_EVENLY;
                                        } else if (c7 == 5) {
                                            r0 = AnonymousClass2DO.SPACE_AROUND;
                                        } else {
                                            throw new AnonymousClass2EN(AnonymousClass000.A0E("unknown flex justify ", BX62.Bqf()));
                                        }
                                        r126.A04 = r0;
                                    } else if ("align_items".equals(BX160)) {
                                        r126.A02 = AnonymousClass2DI.A01(r13.BX6().Bqf());
                                    } else if ("align_content".equals(BX160)) {
                                        r126.A01 = AnonymousClass2DI.A01(r13.BX6().Bqf());
                                    } else if ("flex_wrap".equals(BX160)) {
                                        String Bqf21 = r13.BX6().Bqf();
                                        switch (Bqf21.hashCode()) {
                                            case 3657802:
                                                c6 = 2;
                                                break;
                                            case 491642861:
                                                c6 = 3;
                                                break;
                                            case 2052203337:
                                                c6 = 1;
                                                break;
                                            case 2110385160:
                                                c6 = 0;
                                                break;
                                            default:
                                                c6 = 65535;
                                                break;
                                        }
                                        if (c6 == 0 || c6 == 1) {
                                            a90 = A90.NO_WRAP;
                                        } else if (c6 == 2) {
                                            a90 = A90.WRAP;
                                        } else if (c6 == 3) {
                                            a90 = A90.WRAP_REVERSE;
                                        } else {
                                            throw new AnonymousClass2EN(AnonymousClass000.A0E("unknown flex wrap ", Bqf21));
                                        }
                                        r126.A05 = a90;
                                    } else if ("background_color".equals(BX160)) {
                                        Color.parseColor(r13.BX6().Bqf());
                                    } else if ("decoration".equals(BX160)) {
                                        r126.A06 = (AnonymousClass2DJ) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("on_click".equals(BX160)) {
                                        r126.A07 = C49642Da.A00(r13.BX6());
                                    } else if ("enabled".equals(BX160)) {
                                        r126.A08 = Boolean.valueOf(r13.BX6().A6r());
                                    } else if ("padding_left".equals(BX160)) {
                                        r126.A0A = Float.valueOf(AnonymousClass2DI.A00(r13.BX6().Bqf()));
                                    } else if ("padding_right".equals(BX160)) {
                                        r126.A0B = Float.valueOf(AnonymousClass2DI.A00(r13.BX6().Bqf()));
                                    } else if ("padding_top".equals(BX160)) {
                                        r126.A0C = Float.valueOf(AnonymousClass2DI.A00(r13.BX6().Bqf()));
                                    } else if ("padding_bottom".equals(BX160)) {
                                        r126.A09 = Float.valueOf(AnonymousClass2DI.A00(r13.BX6().Bqf()));
                                    } else {
                                        AnonymousClass2DH.A00(r126, BX160, r13, r14);
                                    }
                                    r13.Bov();
                                }
                                r126.A0D();
                            }
                            r2.A01 = r126;
                            z = true;
                        } else if ("bk.components.Text".equals(BX1)) {
                            r2.A06 = AnonymousClass2DY.A00(r13, r14);
                            z = true;
                        } else if ("bk.components.RichText".equals(BX1)) {
                            r2.A05 = AnonymousClass2DY.A00(r13, r14);
                            z = true;
                        } else if ("bk.components.Collection".equals(BX1)) {
                            AnonymousClass2U0 r127 = new AnonymousClass2U0();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r127 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX161 = r13.BX1();
                                    r13.Aq2();
                                    if ("direction".equals(BX161)) {
                                        if (r13.BX6().Agh()) {
                                            Bqf4 = null;
                                        } else {
                                            Bqf4 = r13.BX6().Bqf();
                                        }
                                        r127.A0D = Bqf4;
                                    } else if ("snap".equals(BX161)) {
                                        String Bqf22 = r13.BX6().Bqf();
                                        switch (Bqf22.hashCode()) {
                                            case -1364013995:
                                                c5 = 1;
                                                break;
                                            case 100571:
                                                c5 = 2;
                                                break;
                                            case 3387192:
                                                c5 = 3;
                                                break;
                                            case 109757538:
                                                c5 = 0;
                                                break;
                                            default:
                                                c5 = 65535;
                                                break;
                                        }
                                        if (c5 == 0) {
                                            num3 = Constants.ZERO;
                                        } else if (c5 == 1) {
                                            num3 = Constants.ONE;
                                        } else if (c5 == 2) {
                                            num3 = Constants.A0C;
                                        } else if (c5 == 3) {
                                            num3 = num8;
                                        } else {
                                            throw new AnonymousClass2EN(AnonymousClass000.A0E("can't parse unknown snap gravity: ", Bqf22));
                                        }
                                        r127.A0B = num3;
                                    } else if ("snap_style".equals(BX161)) {
                                        String Bqf23 = r13.BX6().Bqf();
                                        int hashCode4 = Bqf23.hashCode();
                                        if (hashCode4 == -1102672091) {
                                            c4 = 0;
                                        } else if (hashCode4 == 106426307) {
                                            c4 = 1;
                                        }
                                        c4 = 65535;
                                        if (c4 == 0) {
                                            num2 = Constants.ZERO;
                                        } else if (c4 == 1) {
                                            num2 = Constants.ONE;
                                        } else {
                                            throw new AnonymousClass2EN(AnonymousClass000.A0E("can't parse unknown snap style: ", Bqf23));
                                        }
                                        r127.A0C = num2;
                                    } else if ("item_spacing".equals(BX161)) {
                                        r127.A03 = AnonymousClass2D4.A01(r13.BX6().Bqf());
                                    } else if ("spacing_before".equals(BX161)) {
                                        r127.A02 = AnonymousClass2D4.A01(r13.BX6().Bqf());
                                    } else if ("spacing_after".equals(BX161)) {
                                        r127.A01 = AnonymousClass2D4.A01(r13.BX6().Bqf());
                                    } else if ("scroll_check_direction".equals(BX161)) {
                                        r127.A04 = r13.BX6().Adk();
                                    } else if ("on_scroll".equals(BX161)) {
                                        r127.A09 = C49642Da.A00(r13.BX6());
                                    } else if ("on_scroll_snap".equals(BX161)) {
                                        r127.A0A = C49642Da.A00(r13.BX6());
                                    } else if ("enable_animations".equals(BX161)) {
                                        r127.A0F = r13.BX6().A6r();
                                    } else if ("supports_sticky_headers".equals(BX161)) {
                                        r13.BX6().A6r();
                                    } else if ("on_page_scroll".equals(BX161)) {
                                        r127.A07 = C49642Da.A00(r13.BX6());
                                    } else if ("background_themed_color".equals(BX161)) {
                                        r127.A06 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("left_offset_on_snap".equals(BX161)) {
                                        r127.A00 = AnonymousClass2D4.A01(r13.BX6().Bqf());
                                    } else if ("overscroll".equals(BX161)) {
                                        r127.A0E = r13.BX6().A6r();
                                    } else if ("on_scroll_callback".equals(BX161)) {
                                        r127.A08 = C49642Da.A00(r13.BX6());
                                    } else {
                                        AnonymousClass2DH.A00(r127, BX161, r13, r14);
                                    }
                                    r13.Bov();
                                }
                                r127.A0D();
                            }
                            r2.A00 = r127;
                            z = true;
                        } else if ("bk.components.ProgressBar".equals(BX1)) {
                            A72 a72 = new A72();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                a72 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX162 = r13.BX1();
                                    r13.Aq2();
                                    AnonymousClass2DU.A00(a72, BX162, r13, r14);
                                    r13.Bov();
                                }
                                a72.A0D();
                            }
                            r2.A02 = a72;
                            z = true;
                        } else if ("bk.components.TextInput".equals(BX1)) {
                            AnonymousClass9AC r128 = new AnonymousClass9AC();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r128 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX163 = r13.BX1();
                                    r13.Aq2();
                                    String str16 = null;
                                    if ("text".equals(BX163)) {
                                        if (!r13.BX6().Agh()) {
                                            str16 = r13.BX6().Bqf();
                                        }
                                        r128.A0F = str16;
                                    } else if ("hint".equals(BX163)) {
                                        if (!r13.BX6().Agh()) {
                                            str16 = r13.BX6().Bqf();
                                        }
                                        r128.A0D = str16;
                                    } else if ("type".equals(BX163)) {
                                        String Bqf24 = r13.BX6().Bqf();
                                        switch (Bqf24.hashCode()) {
                                            case -2141169668:
                                                c3 = 7;
                                                break;
                                            case -1413853096:
                                                c3 = 5;
                                                break;
                                            case -1034364087:
                                                c3 = 1;
                                                break;
                                            case 3076014:
                                                c3 = 6;
                                                break;
                                            case 3556653:
                                                c3 = 0;
                                                break;
                                            case 96619420:
                                                c3 = 2;
                                                break;
                                            case 1216389502:
                                                c3 = 4;
                                                break;
                                            case 1216985755:
                                                c3 = 3;
                                                break;
                                            default:
                                                c3 = 65535;
                                                break;
                                        }
                                        switch (c3) {
                                            case 0:
                                                i2 = 1;
                                                break;
                                            case 1:
                                                i2 = 2;
                                                break;
                                            case 2:
                                                i2 = 33;
                                                break;
                                            case 3:
                                                i2 = 129;
                                                break;
                                            case 4:
                                                i2 = 18;
                                                break;
                                            case 5:
                                                i2 = ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED;
                                                break;
                                            case 6:
                                                i2 = 20;
                                                break;
                                            case 7:
                                                i2 = 8193;
                                                break;
                                            default:
                                                throw new AnonymousClass2EN(AnonymousClass000.A0E("can't parse unknown inputType: ", Bqf24));
                                        }
                                        r128.A0B = Integer.valueOf(i2);
                                    } else if ("max_length".equals(BX163)) {
                                        r128.A07 = Integer.valueOf(r13.BX6().Adk());
                                    } else if ("on_text_change".equals(BX163)) {
                                        r128.A05 = C49642Da.A00(r13.BX6());
                                    } else if ("on_gain_focus".equals(BX163)) {
                                        r128.A03 = C49642Da.A00(r13.BX6());
                                    } else if ("on_lose_focus".equals(BX163)) {
                                        r128.A04 = C49642Da.A00(r13.BX6());
                                    } else if ("text_align".equals(BX163)) {
                                        r128.A08 = Integer.valueOf(AnonymousClass2D4.A04(r13.BX6().Bqf()));
                                    } else if ("numerical_mask".equals(BX163)) {
                                        if (!r13.BX6().Agh()) {
                                            str16 = r13.BX6().Bqf();
                                        }
                                        r128.A0E = str16;
                                    } else if ("font_family".equals(BX163)) {
                                        if (!r13.BX6().Agh()) {
                                            str16 = r13.BX6().Bqf();
                                        }
                                        r128.A0C = str16;
                                    } else if ("text_size".equals(BX163)) {
                                        r128.A06 = Float.valueOf(AnonymousClass2D4.A02(r13.BX6().Bqf()));
                                    } else if ("text_style".equals(BX163)) {
                                        r128.A0A = Integer.valueOf(AnonymousClass2D4.A05(r13.BX6().Bqf()));
                                    } else if ("text_color".equals(BX163)) {
                                        r128.A09 = Integer.valueOf(AnonymousClass2D4.A03(r13.BX6().Bqf()));
                                    } else if ("text_themed_color".equals(BX163)) {
                                        r128.A01 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("single_line".equals(BX163)) {
                                        r128.A0H = r13.BX6().A6r();
                                    } else if ("remove_default_insets".equals(BX163)) {
                                        r128.A0G = r13.BX6().A6r();
                                    } else if ("allow_text_change_callback".equals(BX163)) {
                                        r128.A02 = C49642Da.A00(r13.BX6());
                                    } else {
                                        AnonymousClass2DU.A00(r128, BX163, r13, r14);
                                    }
                                    r13.Bov();
                                }
                                r128.A0D();
                            }
                            r2.A03 = r128;
                            z = true;
                        } else if ("bk.components.AccessibilityExtension".equals(BX1)) {
                            C49702Dg r318 = new C49702Dg();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r318 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX164 = r13.BX1();
                                    r13.Aq2();
                                    if ("enabled".equals(BX164)) {
                                        r318.A02 = r13.BX6().A6r();
                                    } else {
                                        String str17 = null;
                                        if ("label".equals(BX164)) {
                                            if (!r13.BX6().Agh()) {
                                                str17 = r13.BX6().Bqf();
                                            }
                                            r318.A00 = str17;
                                        } else if ("role".equals(BX164)) {
                                            if (!r13.BX6().Agh()) {
                                                str17 = r13.BX6().Bqf();
                                            }
                                            r318.A01 = str17;
                                        } else if ("on_reflow".equals(BX164)) {
                                            r318.A00 = C49642Da.A00(r13.BX6());
                                        }
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0L = r318;
                            z = true;
                        } else if ("bk.components.TextInputMaskExtension".equals(BX1)) {
                            AnonymousClass9AJ r319 = new AnonymousClass9AJ();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r319 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX165 = r13.BX1();
                                    r13.Aq2();
                                    if ("mask".equals(BX165)) {
                                        if (r13.BX6().Agh()) {
                                            Bqf3 = null;
                                        } else {
                                            Bqf3 = r13.BX6().Bqf();
                                        }
                                        r319.A01 = Bqf3;
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A04 = r319;
                            z = true;
                        } else if ("bk.components.TreeMutationObserverExtension".equals(BX1)) {
                            C225869nv r320 = new C225869nv();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r320 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX166 = r13.BX1();
                                    r13.Aq2();
                                    if ("on_component_added".equals(BX166)) {
                                        r320.A00 = C49642Da.A00(r13.BX6());
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0M = r320;
                            z = true;
                        } else if ("bk.components.internal.Shadow".equals(BX1)) {
                            AnonymousClass2D3 r66 = new AnonymousClass2D3();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r66 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX167 = r13.BX1();
                                    r13.Aq2();
                                    if ("child".equals(BX167)) {
                                        r66.A00 = (AnonymousClass2D8) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("id".equals(BX167)) {
                                        r66.A03 = Long.valueOf(r13.BX6().AoH());
                                    } else if ("init_state".equals(BX167)) {
                                        r66.A02 = C49642Da.A00(r13.BX6());
                                    } else if ("reduce".equals(BX167)) {
                                        r66.A01 = C49642Da.A00(r13.BX6());
                                    } else if ("extensions".equals(BX167)) {
                                        ArrayList arrayList13 = null;
                                        if (r13.BX5() == Constants.ZERO) {
                                            arrayList13 = new ArrayList();
                                            while (r13.Aq2() != Constants.ONE) {
                                                C49732Dj r018 = (C49732Dj) AnonymousClass2D4.A09(r13, r14);
                                                if (r018 != null) {
                                                    arrayList13.add(r018);
                                                }
                                            }
                                        }
                                        r66.A04 = arrayList13;
                                    }
                                    r13.Bov();
                                }
                            }
                            AnonymousClass2D8 r129 = r66.A00;
                            if (r129 != null) {
                                if (r129.A04 == null) {
                                    r129.A04 = new LinkedList();
                                }
                                r129.A04.addFirst(r66);
                                r66.A00 = null;
                                r2.A07 = r129;
                                z = true;
                            } else {
                                throw new AnonymousClass2EN("Shadow component should never be a leaf node");
                            }
                        } else if ("bk.components.TextSpan".equals(BX1)) {
                            AnonymousClass9BL r130 = new AnonymousClass9BL();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r130 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX168 = r13.BX1();
                                    r13.Aq2();
                                    if ("text".equals(BX168)) {
                                        if (r13.BX6().Agh()) {
                                            Bqf2 = null;
                                        } else {
                                            Bqf2 = r13.BX6().Bqf();
                                        }
                                        r130.A06 = Bqf2;
                                    } else if ("text_provider".equals(BX168)) {
                                        r130.A00 = (AnonymousClass9BN) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("text_size".equals(BX168)) {
                                        r130.A03 = Float.valueOf(AnonymousClass2D4.A02(r13.BX6().Bqf()));
                                    } else if ("text_color".equals(BX168)) {
                                        r130.A04 = Integer.valueOf(AnonymousClass2D4.A03(r13.BX6().Bqf()));
                                    } else if ("text_style".equals(BX168)) {
                                        r130.A05 = Integer.valueOf(AnonymousClass2D4.A05(r13.BX6().Bqf()));
                                    } else if ("on_click".equals(BX168)) {
                                        r130.A02 = C49642Da.A00(r13.BX6());
                                    } else if ("text_themed_color".equals(BX168)) {
                                        r130.A01 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("strikethrough".equals(BX168)) {
                                        r130.A07 = r13.BX6().A6r();
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0I = r130;
                            z = true;
                        } else if ("bk.components.BoxDecoration".equals(BX1)) {
                            AnonymousClass2DJ r131 = new AnonymousClass2DJ();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r131 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX169 = r13.BX1();
                                    r13.Aq2();
                                    if ("corner_fill_color".equals(BX169)) {
                                        r131.A04 = AnonymousClass2D4.A03(r13.BX6().Bqf());
                                    } else if ("corner_radius".equals(BX169)) {
                                        r131.A01 = AnonymousClass2D4.A01(r13.BX6().Bqf());
                                    } else if ("border_width".equals(BX169)) {
                                        r131.A00 = AnonymousClass2D4.A01(r13.BX6().Bqf());
                                    } else if ("border_color".equals(BX169)) {
                                        r131.A03 = AnonymousClass2D4.A03(r13.BX6().Bqf());
                                    } else if ("clipping".equals(BX169)) {
                                        r131.A09 = r13.BX6().A6r();
                                    } else if ("elevation".equals(BX169)) {
                                        r131.A02 = AnonymousClass2D4.A01(r13.BX6().Bqf());
                                    } else if (AppStateModule.APP_STATE_BACKGROUND.equals(BX169)) {
                                        r131.A05 = (AnonymousClass2DM) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("foreground".equals(BX169)) {
                                        r131.A06 = (AnonymousClass2DM) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("corner_fill_themed_color".equals(BX169)) {
                                        r131.A08 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("border_themed_color".equals(BX169)) {
                                        r131.A07 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A09 = r131;
                            z = true;
                        } else if ("bk.components.ColorDrawable".equals(BX1)) {
                            C180877nr r321 = new C180877nr();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r321 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX170 = r13.BX1();
                                    r13.Aq2();
                                    if ("color".equals(BX170)) {
                                        r321.A00 = Integer.valueOf(Color.parseColor(r13.BX6().Bqf()));
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0A = r321;
                            z = true;
                        } else if ("bk.components.ThemedColorDrawable".equals(BX1)) {
                            AnonymousClass2DL r67 = new AnonymousClass2DL();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r67 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX171 = r13.BX1();
                                    r13.Aq2();
                                    if ("color".equals(BX171)) {
                                        r67.A00 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0K = r67;
                            z = true;
                        } else if ("bk.components.StateDrawable".equals(BX1)) {
                            C49682De r7 = new C49682De();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r7 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX172 = r13.BX1();
                                    r13.Aq2();
                                    if ("state_items".equals(BX172)) {
                                        ArrayList arrayList14 = null;
                                        if (r13.BX5() == Constants.ZERO) {
                                            arrayList14 = new ArrayList();
                                            while (r13.Aq2() != Constants.ONE) {
                                                C49692Df r019 = (C49692Df) AnonymousClass2D4.A09(r13, r14);
                                                if (r019 != null) {
                                                    arrayList14.add(r019);
                                                }
                                            }
                                        }
                                        r7.A00 = arrayList14;
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0G = r7;
                            z = true;
                        } else if ("bk.components.StateDrawableItem".equals(BX1)) {
                            C49692Df r322 = new C49692Df();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r322 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX173 = r13.BX1();
                                    r13.Aq2();
                                    if ("state".equals(BX173)) {
                                        if (r13.BX6().Agh()) {
                                            Bqf = null;
                                        } else {
                                            Bqf = r13.BX6().Bqf();
                                        }
                                        r322.A01 = Bqf;
                                    } else if ("drawable".equals(BX173)) {
                                        r322.A00 = (AnonymousClass2DM) AnonymousClass2D4.A09(r13, r14);
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0H = r322;
                            z = true;
                        } else if ("bk.components.RippleDrawable".equals(BX1)) {
                            C180867nq r132 = new C180867nq();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r132 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX174 = r13.BX1();
                                    r13.Aq2();
                                    if ("ripple_color".equals(BX174)) {
                                        r132.A02 = Integer.valueOf(Color.parseColor(r13.BX6().Bqf()));
                                    } else if ("content".equals(BX174)) {
                                        r132.A00 = (AnonymousClass2DM) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("fallback".equals(BX174)) {
                                        r132.A01 = (AnonymousClass2DM) AnonymousClass2D4.A09(r13, r14);
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0F = r132;
                            z = true;
                        } else if ("bk.components.DatetimeTextProvider".equals(BX1)) {
                            AnonymousClass9A8 r72 = new AnonymousClass9A8();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r72 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX175 = r13.BX1();
                                    r13.Aq2();
                                    if ("timestamp".equals(BX175)) {
                                        r72.A01 = r13.BX6().AoH();
                                    } else if ("type".equals(BX175)) {
                                        String Bqf25 = r13.BX6().Bqf();
                                        int hashCode5 = Bqf25.hashCode();
                                        if (hashCode5 == 3076014) {
                                            c2 = 0;
                                        } else if (hashCode5 == 3560141) {
                                            c2 = 1;
                                        } else if (hashCode5 == 1793702779) {
                                            c2 = 2;
                                        }
                                        c2 = 65535;
                                        if (c2 == 0) {
                                            num = Constants.ZERO;
                                        } else if (c2 == 1) {
                                            num = Constants.ONE;
                                        } else if (c2 == 2) {
                                            num = Constants.A0C;
                                        } else {
                                            throw new AnonymousClass2EN(AnonymousClass000.A0E("Can't parse unknown datetime type: ", Bqf25));
                                        }
                                        r72.A02 = num;
                                    } else if ("format".equals(BX175)) {
                                        String Bqf26 = r13.BX6().Bqf();
                                        switch (Bqf26.hashCode()) {
                                            case -1078030475:
                                                c = 1;
                                                break;
                                            case 3154575:
                                                c = 3;
                                                break;
                                            case 3327612:
                                                c = 2;
                                                break;
                                            case 109413500:
                                                c = 0;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        if (c == 0) {
                                            i = 3;
                                        } else if (c == 1) {
                                            i = 2;
                                        } else if (c == 2) {
                                            i = 1;
                                        } else if (c == 3) {
                                            i = 0;
                                        } else {
                                            throw new AnonymousClass2EN(AnonymousClass000.A0E("Can't parse unknown datetime format: ", Bqf26));
                                        }
                                        r72.A00 = i;
                                    }
                                    r13.Bov();
                                }
                                Integer num9 = r72.A02;
                                int i4 = r72.A00;
                                int intValue = num9.intValue();
                                switch (intValue) {
                                    case 0:
                                        dateFormat = DateFormat.getDateInstance(i4);
                                        break;
                                    case 1:
                                        dateFormat = DateFormat.getTimeInstance(i4);
                                        break;
                                    case 2:
                                        dateFormat = DateFormat.getDateTimeInstance(i4, i4);
                                        break;
                                    default:
                                        if (num9 != null) {
                                            switch (intValue) {
                                                case 1:
                                                    str = "TIME";
                                                    break;
                                                case 2:
                                                    str = "DATETIME";
                                                    break;
                                                default:
                                                    str = "DATE";
                                                    break;
                                            }
                                        } else {
                                            str = "null";
                                        }
                                        throw new IllegalArgumentException(AnonymousClass000.A0E("Unknown dateformat type: ", str));
                                }
                                r72.A03 = dateFormat.format(Long.valueOf(r72.A01 * 1000));
                            }
                            r2.A0B = r72;
                            z = true;
                        } else if ("bk.components.GradientThemedColorDrawable".equals(BX1)) {
                            C180857np r133 = new C180857np();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r133 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX176 = r13.BX1();
                                    r13.Aq2();
                                    if ("begin_color".equals(BX176)) {
                                        r133.A01 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("middle_color".equals(BX176)) {
                                        r133.A03 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("end_color".equals(BX176)) {
                                        r133.A02 = (AnonymousClass2DK) AnonymousClass2D4.A09(r13, r14);
                                    } else if ("orientation".equals(BX176)) {
                                        r133.A00 = AnonymousClass2D4.A06(r13.BX6().Bqf());
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0C = r133;
                            z = true;
                        } else if ("bk.types.ThemedColor".equals(BX1)) {
                            AnonymousClass2DK r134 = new AnonymousClass2DK();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r134 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX177 = r13.BX1();
                                    r13.Aq2();
                                    if ("light_color".equals(BX177)) {
                                        r134.A01 = Integer.valueOf(AnonymousClass2D4.A03(r13.BX6().Bqf()));
                                    } else if ("dark_color".equals(BX177)) {
                                        r134.A00 = Integer.valueOf(AnonymousClass2D4.A03(r13.BX6().Bqf()));
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0J = r134;
                            z = true;
                        } else if ("bk.components.internal.Merge".equals(BX1)) {
                            C108334le r73 = new C108334le();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r73 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX178 = r13.BX1();
                                    r13.Aq2();
                                    if ("children".equals(BX178)) {
                                        ArrayList arrayList15 = null;
                                        if (r13.BX5() == Constants.ZERO) {
                                            arrayList15 = new ArrayList();
                                            while (r13.Aq2() != Constants.ONE) {
                                                AnonymousClass2DA r020 = (AnonymousClass2DA) AnonymousClass2D4.A09(r13, r14);
                                                if (r020 != null) {
                                                    arrayList15.add(r020);
                                                }
                                            }
                                        }
                                        r73.A00 = arrayList15;
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0E = r73;
                            z = true;
                        } else if ("bk.components.internal.Action".equals(BX1)) {
                            C139175xA r323 = new C139175xA();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r323 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX179 = r13.BX1();
                                    r13.Aq2();
                                    if ("handler".equals(BX179)) {
                                        r323.A00 = C49642Da.A00(r13.BX6());
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A08 = r323;
                            z = true;
                        } else if ("bk.components.internal.Inflatable".equals(BX1)) {
                            C139385xW r324 = new C139385xW();
                            if (r13.BX5() != Constants.A0C) {
                                r13.Bov();
                                r324 = null;
                            } else {
                                while (r13.Aq2() != num8) {
                                    String BX180 = r13.BX1();
                                    r13.Aq2();
                                    if ("inflate_callback".equals(BX180)) {
                                        r324.A00 = C49642Da.A00(r13.BX6());
                                    }
                                    r13.Bov();
                                }
                            }
                            r2.A0D = r324;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new AnonymousClass2EN(AnonymousClass000.A0E("Unsupported data: ", BX1));
                        }
                    }
                    r13.Bov();
                }
            }
        }
        return r2.A00();
    }
}
