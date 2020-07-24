package p000X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.0qY  reason: invalid class name and case insensitive filesystem */
public final class C17630qY extends C17640qZ {
    public final C59742i9 A08(FragmentActivity fragmentActivity, AnonymousClass0RN r9, AnonymousClass0C1 r10, QuickPromotionSlot quickPromotionSlot, C28811Ng r12) {
        return new C59742i9(fragmentActivity, r10, quickPromotionSlot, A05(fragmentActivity, r10), new C59732i8(fragmentActivity, A02(r10), r10), r12);
    }

    public final AnonymousClass1OC A09(C27341Hl r10, AnonymousClass0RN r11, AnonymousClass0C1 r12, QuickPromotionSlot quickPromotionSlot, C28811Ng r14) {
        return new AnonymousClass1OC(r10, r12, quickPromotionSlot, (C28911Nv) r12.AVA(C28911Nv.class, new C28931Nx(r10.getRootActivity(), r12)), A07(r10, r11, r12), r14);
    }

    public final AnonymousClass1OC A0A(AnonymousClass2NN r10, AnonymousClass0RN r11, AnonymousClass0C1 r12, QuickPromotionSlot quickPromotionSlot, C28811Ng r14) {
        return new AnonymousClass1OC(r10, r12, quickPromotionSlot, (C28911Nv) r12.AVA(C28911Nv.class, new C28931Nx(r10.getRootActivity(), r12)), A07(r10, r11, r12), r14);
    }

    public final List A0C(AnonymousClass0C1 r4, AnonymousClass1OE r5) {
        return Arrays.asList(new AnonymousClass2MK[]{new C693331w(r4, r5), new C693431x(r4, r5), new C693531y(r4, r5)});
    }

    public final void A0E(Context context, AnonymousClass0C1 r13, QuickPromotionSlot quickPromotionSlot, AnonymousClass2O9 r15) {
        FragmentActivity fragmentActivity = (FragmentActivity) AnonymousClass0PK.A01(context, FragmentActivity.class);
        Activity activity = (Activity) AnonymousClass0PK.A01(context, Activity.class);
        BX4 bx4 = (BX4) r15;
        String promotionJson = BX5.getPromotionJson(bx4);
        if (promotionJson != null) {
            String str = bx4.A06.A00;
            char c = 65535;
            if (str.hashCode() == -677595213 && str.equals("iig_fullscreen")) {
                c = 0;
            }
            if (c == 0) {
                AnonymousClass0C1 r6 = r13;
                if (activity != null) {
                    boolean z = false;
                    if (activity.findViewById(C0003R.C0005id.layout_container_main) == null) {
                        z = true;
                    }
                    if (z) {
                        new C59032gv(r6, ModalActivity.class, "qp_full_screen", BX5.getFullScreenFragmentArgs(quickPromotionSlot, promotionJson, true), activity).A06(activity);
                        return;
                    }
                }
                if (fragmentActivity != null) {
                    BX6 bx6 = new BX6();
                    bx6.setArguments(BX5.getFullScreenFragmentArgs(quickPromotionSlot, promotionJson, false));
                    C52362Om r1 = new C52362Om(fragmentActivity, r13);
                    r1.A02 = bx6;
                    r1.A07 = true;
                    r1.A0A = true;
                    r1.A02();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r2.equals("instagram_direct_launcher") == false) goto L_0x0019;
     */
    public final void A0F(AnonymousClass2O9 r4, AnonymousClass1OE r5) {
        char c;
        String str = ((BX4) r4).A06.A00;
        if (str.hashCode() == -731794263) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            r5.BGv(r4);
            r5.BGt(r4, Constants.ONE, (Bundle) null);
        }
    }

    public final C29131Os A00(Context context, AnonymousClass0C1 r3, AnonymousClass1OE r4) {
        return new AnonymousClass1QL(r3, r4);
    }

    public final C40371oY A01(AnonymousClass2O9 r8) {
        if (r8 == null) {
            return null;
        }
        BX4 bx4 = (BX4) r8;
        String str = bx4.A06.A00;
        char c = 65535;
        switch (str.hashCode()) {
            case -303268285:
                if (str.equals("standard_megaphone_ig")) {
                    c = 3;
                    break;
                }
                break;
            case 453021476:
                if (str.equals("condensed_megaphone")) {
                    c = 0;
                    break;
                }
                break;
            case 897282998:
                if (str.equals("inline_editing_standard_megaphone_ig")) {
                    c = 4;
                    break;
                }
                break;
            case 1219174331:
                if (str.equals("social_context_condensed_megaphone_ig")) {
                    c = 1;
                    break;
                }
                break;
            case 1499251297:
                if (str.equals("social_context_standard_megaphone_ig")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return new AnonymousClass332(bx4);
        }
        if (c == 2 || c == 3 || c != 4) {
            return new AnonymousClass331(bx4);
        }
        return new AnonymousClass333(bx4);
    }

    public final AnonymousClass2C0 A02(AnonymousClass0C1 r3) {
        return (AnonymousClass2C0) r3.AVA(AnonymousClass2C0.class, new AnonymousClass2C1(r3));
    }

    public final AnonymousClass1NW A03() {
        return new AnonymousClass1NW();
    }

    public final C27735CPe A04() {
        return new C27735CPe();
    }

    public final C28921Nw A05(Context context, AnonymousClass0C1 r3) {
        return new C28941Ny(context, r3);
    }

    public final AnonymousClass1NI A06() {
        return new AnonymousClass4BC();
    }

    public final C28831Nj A07(AnonymousClass1HD r2, AnonymousClass0RN r3, AnonymousClass0C1 r4) {
        return new C28821Ni(r2, r3, r4);
    }

    public final AnonymousClass1NR A0B(AnonymousClass0C1 r2, Map map) {
        return new AnonymousClass1NR(r2, map);
    }

    public final boolean A0I(AnonymousClass0C1 r9, QuickPromotionSlot quickPromotionSlot, AnonymousClass1ON r11) {
        C37881kN r1;
        Long l;
        long j;
        Long l2;
        C37771kC r4 = (C37771kC) r9.AVA(C37771kC.class, new C37781kD(r9));
        if (r4.A00 == null) {
            AnonymousClass0C1 r7 = r4.A01;
            boolean z = false;
            if (C37791kE.A00(r7).getLong("qp_cooldown_response_expiration_time", 0) <= System.currentTimeMillis()) {
                z = true;
            }
            if (!z) {
                if (C37791kE.A01(r7) != null) {
                    r4.A00 = C37881kN.A00(C37791kE.A01(r7));
                } else {
                    AnonymousClass0QD.A01(C17640qZ.A00.A02(r7).getModuleName(), "QP cooldown response listed as unexpired but is null.");
                }
            }
        }
        if (((Boolean) AnonymousClass0L6.A02(r4.A01, AnonymousClass0L7.QP_SLOT_COOLDOWN_ENABLED, "is_enabled", true, (AnonymousClass04H) null)).booleanValue() && (r1 = r4.A00) != null) {
            Map map = r1.A01;
            long j2 = r1.A00;
            if (!(map == null || (l2 = (Long) map.get(quickPromotionSlot)) == null)) {
                j2 = l2.longValue();
            }
            QuickPromotionSurface quickPromotionSurface = r11.A00;
            if (quickPromotionSurface != null) {
                l = (Long) r11.A01.get(quickPromotionSurface);
            } else {
                l = null;
            }
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            int i = ((j + j2) > System.currentTimeMillis() ? 1 : ((j + j2) == System.currentTimeMillis() ? 0 : -1));
            boolean z2 = false;
            if (i > 0) {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A0D() {
        C25731BXb A00 = C25731BXb.A00();
        C25732BXc bXc = A00.A01;
        synchronized (bXc) {
            bXc.A01.clear();
            bXc.A00.clear();
        }
        A00.A03();
    }

    public final void A0G(AnonymousClass1OE r1, AnonymousClass2O9 r2, Context context) {
        C25724BWu.A00(r1, r2, context);
    }

    public final void A0H(AnonymousClass1OE r1, AnonymousClass2O9 r2, Context context) {
        C25725BWv.A00(r1, r2, context);
    }
}
