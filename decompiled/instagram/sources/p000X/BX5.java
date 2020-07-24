package p000X;

import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.BX5 */
public final class BX5 {
    public static Bundle getFullScreenFragmentArgs(QuickPromotionSlot quickPromotionSlot, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("QuickPromotionIIGFullscreenFragment.KEY_FRAGMENT_TAG_LAUNCH_AS_MODAL", z);
        bundle.putString("QuickPromotionIIGFullscreenFragment.KEY_PROMOTION_SLOT", quickPromotionSlot.name());
        bundle.putString("QuickPromotionIIGFullscreenFragment.KEY_QUICK_PROMOTION", str);
        return bundle;
    }

    public static String getPromotionJson(BX4 bx4) {
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0T();
            if (bx4.A05 != null) {
                A05.A0d("creative");
                C49262Bl r6 = bx4.A05;
                A05.A0T();
                if (r6.A08 != null) {
                    A05.A0d(DialogModule.KEY_TITLE);
                    C49282Bn r1 = r6.A08;
                    A05.A0T();
                    C49302Bp.A00(A05, r1);
                    A05.A0Q();
                }
                if (r6.A04 != null) {
                    A05.A0d("content");
                    C49322Br r12 = r6.A04;
                    A05.A0T();
                    C49302Bp.A00(A05, r12);
                    A05.A0Q();
                }
                if (r6.A05 != null) {
                    A05.A0d("footer");
                    C49342Bt r13 = r6.A05;
                    A05.A0T();
                    C49302Bp.A00(A05, r13);
                    A05.A0Q();
                }
                if (r6.A02 != null) {
                    A05.A0d("primary_action");
                    C49372Bw.A00(A05, r6.A02);
                }
                if (r6.A03 != null) {
                    A05.A0d("secondary_action");
                    C49372Bw.A00(A05, r6.A03);
                }
                if (r6.A06 != null) {
                    A05.A0d("image");
                    C49392By.A00(A05, r6.A06);
                }
                if (r6.A01 != null) {
                    A05.A0d("dismiss_action");
                    C49372Bw.A00(A05, r6.A01);
                }
                if (r6.A07 != null) {
                    A05.A0d("social_context");
                    C49362Bv r0 = r6.A07;
                    A05.A0T();
                    String str = r0.A00;
                    if (str != null) {
                        A05.A0H("text", str);
                    }
                    A05.A0Q();
                }
                if (r6.A09 != null) {
                    A05.A0d("social_context_images");
                    A05.A0S();
                    for (C49402Bz r02 : r6.A09) {
                        if (r02 != null) {
                            C49392By.A00(A05, r02);
                        }
                    }
                    A05.A0P();
                }
                if (r6.A00 != null) {
                    A05.A0R();
                }
                AnonymousClass1N4.A00(A05, r6);
                A05.A0Q();
            }
            if (bx4.A06 != null) {
                A05.A0d("template");
                C49242Bj r5 = bx4.A06;
                A05.A0T();
                String str2 = r5.A00;
                if (str2 != null) {
                    A05.A0H("name", str2);
                }
                if (r5.A01 != null) {
                    A05.A0d("parameters");
                    A05.A0S();
                    for (C49222Bh r03 : r5.A01) {
                        if (r03 != null) {
                            C49212Bg.A00(A05, r03);
                        }
                    }
                    A05.A0P();
                }
                A05.A0Q();
            }
            String str3 = bx4.A08;
            if (str3 != null) {
                A05.A0H("id", str3);
            }
            String str4 = bx4.A0B;
            if (str4 != null) {
                A05.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str4);
            }
            String str5 = bx4.A0A;
            if (str5 != null) {
                A05.A0H(AnonymousClass0C5.$const$string(116), str5);
            }
            A05.A0G("end_time", bx4.A02);
            A05.A0F("max_impressions", bx4.A00);
            if (bx4.A07 != null) {
                A05.A0d("local_state");
                BXW.A00(A05, bx4.A07);
            }
            A05.A0F("priority", bx4.A01);
            QuickPromotionSurface quickPromotionSurface = bx4.A03;
            if (quickPromotionSurface != null) {
                A05.A0F("surface", quickPromotionSurface.A00);
            }
            if (bx4.A0C != null) {
                A05.A0d("triggers");
                A05.A0S();
                for (Trigger trigger : bx4.A0C) {
                    if (trigger != null) {
                        A05.A0g(trigger.A00);
                    }
                }
                A05.A0P();
            }
            String str6 = bx4.A09;
            if (str6 != null) {
                A05.A0H("logging_data", str6);
            }
            A05.A0I("log_eligibility_waterfall", bx4.A0E);
            if (bx4.A04 != null) {
                A05.A0d("contextual_filters");
                C49172Bb.A00(A05, bx4.A04);
            }
            A05.A0I("is_holdout", bx4.A0D);
            AnonymousClass1N4.A00(A05, bx4);
            A05.A0Q();
            A05.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            AnonymousClass0QD.A02("IG-QP", AnonymousClass000.A0E("Error parsing QuickPromotion for fullscreen interstitial: ", bx4.AT8()));
            return null;
        }
    }
}
