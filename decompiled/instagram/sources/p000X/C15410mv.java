package p000X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.0mv  reason: invalid class name and case insensitive filesystem */
public final class C15410mv implements C15390mt {
    public final /* synthetic */ C15360mq A00;

    public C15410mv(C15360mq r1) {
        this.A00 = r1;
    }

    public final Object BWm(C49612Cx r8, C15350mp r9) {
        AnonymousClass2DV r3 = new AnonymousClass2DV();
        if (r8.BX5() == Constants.A0C) {
            while (true) {
                Integer Aq2 = r8.Aq2();
                Integer num = Constants.A0N;
                if (Aq2 == num) {
                    break;
                }
                String BX1 = r8.BX1();
                r8.Aq2();
                if ("ig.style.SearchStyle".equals(BX1)) {
                    C23235ADy aDy = new C23235ADy();
                    if (r8.BX5() != Constants.A0C) {
                        r8.Bov();
                        aDy = null;
                    } else {
                        while (r8.Aq2() != num) {
                            String BX12 = r8.BX1();
                            r8.Aq2();
                            String str = null;
                            if ("key".equals(BX12)) {
                                if (!r8.BX6().Agh()) {
                                    str = r8.BX6().Bqf();
                                }
                                aDy.A00 = str;
                            } else if ("search_keyword".equals(BX12)) {
                                if (!r8.BX6().Agh()) {
                                    str = r8.BX6().Bqf();
                                }
                                aDy.A01 = str;
                            }
                            r8.Bov();
                        }
                    }
                    r3.A00 = aDy;
                } else if ("flex".equals(BX1)) {
                    AnonymousClass2DX r5 = new AnonymousClass2DX();
                    if (r8.BX5() != Constants.A0C) {
                        r8.Bov();
                        r5 = null;
                    } else {
                        while (r8.Aq2() != num) {
                            String BX13 = r8.BX1();
                            r8.Aq2();
                            String str2 = null;
                            if (IgReactMediaPickerNativeModule.WIDTH.equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0S = str2;
                            } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A06 = str2;
                            } else if ("min_width".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0H = str2;
                            } else if ("min_height".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0G = str2;
                            } else if ("max_width".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0F = str2;
                            } else if ("max_height".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0E = str2;
                            } else if ("top".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0R = str2;
                            } else if ("left".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A07 = str2;
                            } else if ("right".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0P = str2;
                            } else if ("bottom".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A04 = str2;
                            } else if ("start".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0Q = str2;
                            } else if ("end".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A05 = str2;
                            } else if ("margin_top".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0D = str2;
                            } else if ("margin_left".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0A = str2;
                            } else if ("margin_right".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0B = str2;
                            } else if ("margin_bottom".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A08 = str2;
                            } else if ("margin_start".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0C = str2;
                            } else if ("margin_end".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A09 = str2;
                            } else if ("padding_top".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0N = str2;
                            } else if ("padding_left".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0K = str2;
                            } else if ("padding_right".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0L = str2;
                            } else if ("padding_bottom".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0I = str2;
                            } else if ("padding_start".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0M = str2;
                            } else if ("padding_end".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0J = str2;
                            } else if ("position_type".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A0O = str2;
                            } else if ("aspect_ratio".equals(BX13)) {
                                r5.A00 = new Float(r8.BX6().ACT());
                            } else if ("grow".equals(BX13)) {
                                r5.A01 = new Float(r8.BX6().ACT());
                            } else if ("shrink".equals(BX13)) {
                                r5.A02 = new Float(r8.BX6().ACT());
                            } else if ("align_self".equals(BX13)) {
                                if (!r8.BX6().Agh()) {
                                    str2 = r8.BX6().Bqf();
                                }
                                r5.A03 = str2;
                            }
                            r8.Bov();
                        }
                    }
                    r3.A01 = r5;
                } else if ("collection".equals(BX1)) {
                    C23226ADp aDp = new C23226ADp();
                    if (r8.BX5() != Constants.A0C) {
                        r8.Bov();
                        aDp = null;
                    } else {
                        while (r8.Aq2() != num) {
                            String BX14 = r8.BX1();
                            r8.Aq2();
                            if (IgReactMediaPickerNativeModule.WIDTH.equals(BX14)) {
                                aDp.A01 = AnonymousClass2D4.A08(r8.BX6().Bqf());
                            } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(BX14)) {
                                aDp.A00 = AnonymousClass2D4.A08(r8.BX6().Bqf());
                            } else if ("is_sticky".equals(BX14)) {
                                r8.BX6().A6r();
                            } else if ("on_appear".equals(BX14)) {
                                aDp.A02 = C49642Da.A00(r8.BX6());
                            } else if ("on_disappear".equals(BX14)) {
                                aDp.A03 = C49642Da.A00(r8.BX6());
                            }
                            r8.Bov();
                        }
                    }
                    r3.A00 = aDp;
                }
                r8.Bov();
            }
        } else {
            r8.Bov();
            r3 = null;
        }
        return r3.A00();
    }
}
