package com.instagram.reels.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.fragment.ReelViewerFragment;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Iterator;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2TH;
import p000X.AnonymousClass2TI;
import p000X.AnonymousClass2UC;
import p000X.AnonymousClass2UD;
import p000X.AnonymousClass2UZ;
import p000X.AnonymousClass2VW;
import p000X.AnonymousClass2ZY;
import p000X.AnonymousClass34H;
import p000X.AnonymousClass34J;
import p000X.AnonymousClass34R;
import p000X.AnonymousClass34S;
import p000X.AnonymousClass34T;
import p000X.AnonymousClass34U;
import p000X.AnonymousClass34V;
import p000X.AnonymousClass34W;
import p000X.AnonymousClass35L;
import p000X.AnonymousClass48i;
import p000X.AnonymousClass4CD;
import p000X.AnonymousClass4JZ;
import p000X.AnonymousClass4K7;
import p000X.AnonymousClass5BD;
import p000X.AnonymousClass5EO;
import p000X.AnonymousClass5F4;
import p000X.AnonymousClass5JR;
import p000X.AnonymousClass5K7;
import p000X.AnonymousClass5KA;
import p000X.AnonymousClass5NM;
import p000X.AnonymousClass5PA;
import p000X.AnonymousClass5PF;
import p000X.AnonymousClass5PG;
import p000X.AnonymousClass609;
import p000X.AnonymousClass6D8;
import p000X.AnonymousClass6DF;
import p000X.AnonymousClass6DI;
import p000X.AnonymousClass6DJ;
import p000X.AnonymousClass6DM;
import p000X.AnonymousClass6DO;
import p000X.AnonymousClass6DP;
import p000X.AnonymousClass6DQ;
import p000X.AnonymousClass6DR;
import p000X.AnonymousClass6DS;
import p000X.AnonymousClass6DU;
import p000X.AnonymousClass6DW;
import p000X.AnonymousClass6DX;
import p000X.AnonymousClass6DZ;
import p000X.AnonymousClass6Dh;
import p000X.AnonymousClass6E2;
import p000X.AnonymousClass6E6;
import p000X.AnonymousClass6E7;
import p000X.AnonymousClass6E8;
import p000X.AnonymousClass6MW;
import p000X.AnonymousClass6MX;
import p000X.C05000Hl;
import p000X.C05570Lc;
import p000X.C06270Ok;
import p000X.C1184956t;
import p000X.C121785Jw;
import p000X.C121795Jx;
import p000X.C12670hC;
import p000X.C13300iJ;
import p000X.C14090jk;
import p000X.C143786Da;
import p000X.C143796Db;
import p000X.C143856Di;
import p000X.C143866Dj;
import p000X.C143876Dk;
import p000X.C143886Dl;
import p000X.C143896Dm;
import p000X.C143916Do;
import p000X.C143926Dp;
import p000X.C143946Dr;
import p000X.C143956Ds;
import p000X.C143996Dw;
import p000X.C144006Dx;
import p000X.C144016Dy;
import p000X.C144026Dz;
import p000X.C144036Ea;
import p000X.C144046Eb;
import p000X.C144096Eg;
import p000X.C144126Ej;
import p000X.C144206Es;
import p000X.C144886Hm;
import p000X.C144896Hn;
import p000X.C144946Hs;
import p000X.C144966Hu;
import p000X.C145626Kk;
import p000X.C145636Km;
import p000X.C146056Mg;
import p000X.C15890nh;
import p000X.C16180oA;
import p000X.C16290oM;
import p000X.C17020pY;
import p000X.C17850qu;
import p000X.C22200y0;
import p000X.C23000zN;
import p000X.C249916w;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C27573CIr;
import p000X.C28351Lj;
import p000X.C29181Ox;
import p000X.C29292CvN;
import p000X.C29293CvO;
import p000X.C30671Ut;
import p000X.C31151Wq;
import p000X.C31201Wx;
import p000X.C31221Wz;
import p000X.C34181eD;
import p000X.C34201eF;
import p000X.C34211eH;
import p000X.C34561ew;
import p000X.C36901in;
import p000X.C37041j1;
import p000X.C37121j9;
import p000X.C37171jE;
import p000X.C38031kc;
import p000X.C38051ke;
import p000X.C38091ki;
import p000X.C39941no;
import p000X.C49042Am;
import p000X.C50282Fr;
import p000X.C51862Mk;
import p000X.C52362Om;
import p000X.C58892gh;
import p000X.C58912gj;
import p000X.C63552pf;
import p000X.C64372rN;
import p000X.C65302ss;
import p000X.C700634s;
import p000X.CJT;

public final class ReelOptionsDialog implements AnonymousClass0RN {
    public Dialog A00;
    public DialogInterface.OnDismissListener A01;
    public AnonymousClass0QT A02;
    public ReelViewerConfig A03;
    public C145626Kk A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;
    public CharSequence A08;
    public CharSequence A09;
    public CharSequence A0A;
    public String A0B;
    public String A0C;
    public C144896Hn A0D;
    public C143786Da A0E;
    public C700634s A0F;
    public AnonymousClass35L A0G;
    public final Activity A0H;
    public final Resources A0I;
    public final AnonymousClass1HD A0J;
    public final AnonymousClass1AM A0K;
    public final AnonymousClass1L8 A0L;
    public final AnonymousClass0RN A0M;
    public final C31151Wq A0N;
    public final C37121j9 A0O;
    public final C27371Ho A0P;
    public final C29181Ox A0Q;
    public final C39941no A0R;
    public final C50282Fr A0S;
    public final AnonymousClass1OY A0T;
    public final AnonymousClass0C1 A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;

    public static void A04(Context context, Reel reel, AnonymousClass1NJ r11, DialogInterface.OnDismissListener onDismissListener, AnonymousClass0C1 r13, AnonymousClass1L8 r14, AnonymousClass1OY r15) {
        int i;
        int i2;
        int i3;
        AnonymousClass0C1 r8 = r13;
        AnonymousClass1NJ r6 = r11;
        boolean contains = ReelStore.A02(r13).A0G(r13.A04()).A0l.contains(r11);
        if (r11.AiO()) {
            i = C0003R.string.remove_video_highlight_title;
            i2 = C0003R.string.remove_video_highlight_button;
            i3 = C0003R.string.remove_video_highlight_message;
            if (contains) {
                i3 = C0003R.string.remove_video_highlight_message_active;
            }
        } else {
            i = C0003R.string.remove_photo_highlight_title;
            i2 = C0003R.string.remove_photo_highlight_button;
            i3 = C0003R.string.remove_photo_highlight_message;
            if (contains) {
                i3 = C0003R.string.remove_photo_highlight_message_active;
            }
        }
        AnonymousClass2OA r2 = new AnonymousClass2OA(context);
        r2.A07(i);
        r2.A06(i3);
        r2.A0U(true);
        r2.A0V(true);
        r2.A0A(i2, new AnonymousClass5NM(context, reel, r6, r14, r8, r15));
        r2.A09(C0003R.string.cancel, new C143916Do(onDismissListener));
        r2.A0F(onDismissListener);
        r2.A03().show();
    }

    public final String getModuleName() {
        return "ReelOptionsDialog";
    }

    public static Dialog A00(ReelOptionsDialog reelOptionsDialog, CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
        reelOptionsDialog.A01 = onDismissListener;
        AnonymousClass2OA r1 = new AnonymousClass2OA(reelOptionsDialog.A0H);
        r1.A0K(reelOptionsDialog.A0J);
        r1.A0W(charSequenceArr, onClickListener);
        r1.A0U(true);
        r1.A0V(true);
        r1.A0F(new C143886Dl(reelOptionsDialog));
        return r1.A03();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    private ArrayList A01() {
        boolean z;
        int i;
        String string;
        ArrayList arrayList = new ArrayList();
        C39941no r0 = this.A0R;
        AnonymousClass1NJ r2 = r0.A08;
        if (r2 != null) {
            boolean A0Q2 = r0.A0D.A0Q();
            z = true;
        }
        z = false;
        if (z) {
            Resources resources = this.A0I;
            AnonymousClass0C1 r4 = this.A0U;
            String moduleName = getModuleName();
            if (r2 == null) {
                string = null;
            } else {
                switch (r2.A0M().ordinal()) {
                    case 1:
                        if (!"ReelOptionsDialog".equals(moduleName)) {
                            i = C0003R.string.post_pending_approval;
                            break;
                        }
                    case 2:
                        boolean equals = "ReelOptionsDialog".equals(moduleName);
                        i = C0003R.string.post_promoting;
                        if (equals) {
                            i = C0003R.string.view_promo_insights;
                            break;
                        }
                        break;
                    case 3:
                        boolean equals2 = "ReelOptionsDialog".equals(moduleName);
                        i = C0003R.string.go_to_promo_manager;
                        if (!equals2) {
                            i = C0003R.string.not_approved;
                            break;
                        }
                        break;
                    case 4:
                        i = AnonymousClass6D8.A00(r4);
                        break;
                    default:
                        i = AnonymousClass6D8.A01(r4, true);
                        break;
                }
                string = resources.getString(i);
            }
            arrayList.add(string);
        }
        return arrayList;
    }

    private void A02() {
        Activity activity = this.A0H;
        AnonymousClass1AM r0 = this.A0K;
        C39941no r11 = this.A0R;
        C27371Ho r10 = this.A0P;
        AnonymousClass1L8 r4 = this.A0L;
        AnonymousClass0C1 r3 = this.A0U;
        C144046Eb r6 = new C144046Eb(activity, r0, r3, r10, r11);
        AnonymousClass5JR.A03(r0);
        C17850qu A032 = C144096Eg.A03(r3, r11.A0D.AZn(), r11.A08.APo(), Constants.A0Y);
        A032.A00 = r6;
        C28351Lj.A00(activity, r4, A032);
    }

    private void A03() {
        Activity activity = this.A0H;
        AnonymousClass1AM r7 = this.A0K;
        C39941no r8 = this.A0R;
        C27371Ho r10 = this.A0P;
        AnonymousClass1L8 r4 = this.A0L;
        AnonymousClass0C1 r3 = this.A0U;
        C144036Ea r6 = new C144036Ea(r7, r8, "location_story_action_sheet", r10, r3, activity);
        C17850qu A032 = C144096Eg.A03(r3, r8.A0D.AZn(), r8.A08.getId(), Constants.A0Y);
        A032.A00 = r6;
        C28351Lj.A00(activity, r4, A032);
    }

    public static void A05(AnonymousClass1AM r1, DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            onDismissListener.onDismiss((DialogInterface) null);
        }
        C12670hC.A05(new C143896Dm(r1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r7 == p000X.C34211eH.NOT_SHARED) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r1 == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
        if ((r3.A0k().longValue() + 86400) >= (java.lang.System.currentTimeMillis() / 1000)) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dc, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r14, p000X.AnonymousClass0L7.XPOSTING_DEEP_DELETION_LAUNCHER, "enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x00de;
     */
    public static void A06(Reel reel, C39941no r23, Activity activity, AnonymousClass1AM r25, AnonymousClass1L8 r26, AnonymousClass0RN r27, DialogInterface.OnDismissListener onDismissListener, AnonymousClass0C1 r29, AnonymousClass34R r30, AnonymousClass0RN r31) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        C34201eF r1;
        boolean z4;
        Integer num;
        String str;
        C39941no r0 = r23;
        AnonymousClass1NJ r3 = r0.A08;
        String uuid = AnonymousClass2ZY.A00().toString();
        boolean A0t = r0.A0t();
        Activity activity2 = activity;
        if (!A0t || !r0.A0a()) {
            String str2 = null;
            AnonymousClass0C1 r14 = r29;
            if (!A0t || r3 == null || r3.A1j == null) {
                C13300iJ r5 = r14.A06;
                boolean z5 = false;
                if (!(r5 == null || (num = r5.A1b) == null)) {
                    switch (num.intValue()) {
                        case 1:
                            C58892gh r12 = r5.A0E;
                            if (r12 != null) {
                                C58912gj r13 = r12.A01;
                                if (r13 != null) {
                                    str = r13.A00;
                                } else {
                                    str = "";
                                }
                                if (!AnonymousClass1BX.A00(str)) {
                                    z5 = true;
                                    break;
                                }
                            }
                            break;
                        case 2:
                            z5 = !AnonymousClass1BX.A00(r5.A2U);
                            break;
                    }
                }
                boolean booleanValue = ((Boolean) C05570Lc.A02(new C05000Hl("enabled", AnonymousClass0L7.XPOSTING_DEEP_DELETION_LAUNCHER, (Object) null, (String[]) null, (AnonymousClass04H) null), r14)).booleanValue();
                boolean z6 = true;
                if (r3 != null) {
                    C34211eH r7 = r3.A0k;
                    if (r7 != null) {
                        z4 = true;
                    }
                    z4 = false;
                    z = true;
                }
                z = false;
                if (!(r3 == null || (r1 = r3.A0l) == null)) {
                    str2 = r1.toString();
                }
                if (r3 != null) {
                    z2 = true;
                }
                z2 = false;
                if (r3 != null && !z2 && r3.A1Z() && z5) {
                    z3 = true;
                }
                z3 = false;
                if (r3 == null) {
                    z6 = false;
                }
                C29293CvO cvO = new C29293CvO(r14, r31, z6, z5, booleanValue, uuid, z, str2);
                if (r0.A14()) {
                    i = C0003R.string.delete_video_title;
                    if (z3) {
                        i = C0003R.string.deep_delete_title;
                    }
                    if (z3) {
                        i2 = C0003R.string.deep_delete_video_message;
                        if (z) {
                            i2 = C0003R.string.deep_delete_fb_dating_video_message;
                        }
                    } else {
                        i2 = C0003R.string.delete_video_message;
                    }
                } else {
                    int i3 = C0003R.string.delete_photo_title;
                    if (z3) {
                        i3 = C0003R.string.deep_delete_title;
                    }
                    if (z3) {
                        i2 = C0003R.string.deep_delete_photo_message;
                        if (z) {
                            i2 = C0003R.string.deep_delete_fb_dating_photo_message;
                        }
                    } else {
                        i2 = C0003R.string.delete_photo_message;
                    }
                }
                AnonymousClass2OA r32 = new AnonymousClass2OA(activity2);
                r32.A07(i);
                r32.A06(i2);
                int i4 = C0003R.string.delete;
                if (z3) {
                    i4 = C0003R.string.delete_both;
                }
                AnonymousClass0RN r16 = r27;
                AnonymousClass1L8 r17 = r26;
                AnonymousClass34R r9 = r30;
                DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                r32.A0D(i4, new AnonymousClass5PA(cvO, z3, r9, reel, r0, activity2, r25, r14, onDismissListener2, r16, r17), Constants.A0Y);
                r32.A09(C0003R.string.cancel, new AnonymousClass5PF(onDismissListener2, cvO, z3));
                r32.A0E(new AnonymousClass5PG(cvO, z3));
                if (z3) {
                    r32.A0B(C0003R.string.delete_ig_only, new AnonymousClass5PA(cvO, false, r9, reel, r23, activity, r25, r14, onDismissListener2, r16, r17), Constants.A0Y);
                }
                r32.A03().show();
                C29292CvN.A00(cvO, "view", "dialog", z3, (String) null);
                return;
            }
            C37041j1.A03(activity2, r14, activity2.getString(C0003R.string.cannot_delete_story), activity2.getString(C0003R.string.cannot_delete_promoted_branded_content_story), (DialogInterface.OnClickListener) null);
            return;
        }
        AnonymousClass2OA r2 = new AnonymousClass2OA(activity2);
        r2.A07(C0003R.string.unable_to_delete_story);
        r2.A06(C0003R.string.unable_to_delete_promoted_story);
        r2.A09(C0003R.string.cancel, new C143996Dw());
        r2.A03().show();
    }

    public static void A08(C39941no r2, Context context, AnonymousClass0C1 r4, AnonymousClass1L8 r5, DialogInterface.OnDismissListener onDismissListener, AnonymousClass1AM r7) {
        AnonymousClass4JZ.A01(context, C65302ss.A02(r2), new C121795Jx(r2, context, r4, r5, onDismissListener, r7));
    }

    public static void A09(C39941no r3, AnonymousClass0C1 r4, AnonymousClass1AM r5, AnonymousClass1L8 r6, DialogInterface.OnDismissListener onDismissListener, C31151Wq r8, Activity activity) {
        C121785Jw r2 = new C121785Jw(r3, r4, r5, r6, onDismissListener, r8, activity);
        C34561ew A022 = C65302ss.A02(r3);
        if (!C65302ss.A07(A022)) {
            AnonymousClass48i.A00(activity, A022, new AnonymousClass4K7(r2));
        } else {
            r2.BMm(true);
        }
    }

    public static void A0A(ReelOptionsDialog reelOptionsDialog) {
        Activity activity = reelOptionsDialog.A0H;
        AnonymousClass1AM r4 = reelOptionsDialog.A0K;
        C39941no r0 = reelOptionsDialog.A0R;
        String str = r0.A0F;
        String id = r0.getId();
        C27371Ho r10 = reelOptionsDialog.A0P;
        AnonymousClass1L8 r1 = reelOptionsDialog.A0L;
        AnonymousClass0C1 r9 = reelOptionsDialog.A0U;
        C144206Es r6 = new C144206Es(activity, r4, r9, r10, str, "story_highlight_action_sheet", id, reelOptionsDialog.A0C);
        AnonymousClass5JR.A03(r4);
        C17850qu A012 = C144096Eg.A01(r9, str, id, Constants.ZERO);
        A012.A00 = r6;
        C28351Lj.A00(activity, r1, A012);
    }

    public static void A0B(ReelOptionsDialog reelOptionsDialog) {
        Activity activity = reelOptionsDialog.A0H;
        AnonymousClass1AM r2 = reelOptionsDialog.A0K;
        C39941no r0 = reelOptionsDialog.A0R;
        C144126Ej.A05(activity, r2, r0.A0F, r0.getId(), r0.A0D, reelOptionsDialog.A0P, "story_highlight_action_sheet", reelOptionsDialog.A0L, reelOptionsDialog.A0U);
    }

    public static void A0C(ReelOptionsDialog reelOptionsDialog, int i, AnonymousClass34J r8, DialogInterface.OnDismissListener onDismissListener) {
        if (i == 0) {
            A08(reelOptionsDialog.A0R, reelOptionsDialog.A0H, reelOptionsDialog.A0U, reelOptionsDialog.A0L, reelOptionsDialog.A01, reelOptionsDialog.A0K);
        } else if (i == 1) {
            A0E(reelOptionsDialog, r8, onDismissListener);
        }
        reelOptionsDialog.A01 = null;
    }

    public static void A0D(ReelOptionsDialog reelOptionsDialog, AnonymousClass6E2 r18, boolean z) {
        Integer num;
        Integer num2;
        ReelOptionsDialog reelOptionsDialog2 = reelOptionsDialog;
        AnonymousClass0C1 r2 = reelOptionsDialog2.A0U;
        AnonymousClass1HD r3 = reelOptionsDialog2.A0J;
        C27371Ho r4 = reelOptionsDialog2.A0P;
        C39941no r1 = reelOptionsDialog2.A0R;
        AnonymousClass1NJ r6 = r1.A08;
        String id = r1.getId();
        DialogInterface.OnDismissListener onDismissListener = reelOptionsDialog2.A01;
        if (z) {
            num = Constants.A0C;
        } else {
            num = Constants.ZERO;
        }
        if (z) {
            num2 = Constants.A0N;
        } else {
            num2 = Constants.A0Y;
        }
        C145626Kk r12 = new C145626Kk(r2, r3, (AnonymousClass0RN) r4, (C13300iJ) null, r6, id, (String) null, (AnonymousClass6E7) r18, (C63552pf) null, (DialogInterface.OnShowListener) null, onDismissListener, false, (String) null, (String) null, num, num2);
        reelOptionsDialog2.A04 = r12;
        r12.A05();
    }

    public static void A0E(ReelOptionsDialog reelOptionsDialog, AnonymousClass34J r4, DialogInterface.OnDismissListener onDismissListener) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(reelOptionsDialog.A0H);
        r2.A07(C0003R.string.direct_leave_chat_with_group_reel_context);
        r2.A06(C0003R.string.direct_leave_conversation_explanation_with_group_reel_context);
        r2.A0A(C0003R.string.direct_leave_with_group_reel_context, new AnonymousClass5K7(reelOptionsDialog, r4));
        r2.A09(C0003R.string.cancel, new AnonymousClass6Dh(reelOptionsDialog, onDismissListener));
        r2.A0U(true);
        r2.A0V(true);
        r2.A0F(onDismissListener);
        r2.A03().show();
    }

    public static void A0F(ReelOptionsDialog reelOptionsDialog, AnonymousClass6DP r5) {
        A0K(reelOptionsDialog, "hide_button");
        AnonymousClass0C1 r1 = reelOptionsDialog.A0U;
        AnonymousClass1NJ r0 = reelOptionsDialog.A0S.A08(r1).A08;
        AnonymousClass0a4.A06(r0);
        if (C30671Ut.A0E(r1, r0) == null) {
            r5.A00((String) null);
            return;
        }
        AnonymousClass0C1 r2 = reelOptionsDialog.A0U;
        AnonymousClass6DJ r3 = new AnonymousClass6DJ(r2, reelOptionsDialog.A0J, reelOptionsDialog.A0S.A08(r2).A08, r5);
        AnonymousClass5F4 r4 = new AnonymousClass5F4(r3.A05);
        r4.A03(r3.A04);
        r4.A01(C0003R.string.report_option_dialog_title_for_hide_ad);
        r4.A09.setTextAppearance(r4.A01, C0003R.style.DialogTitleText);
        r4.A0A(AnonymousClass6DJ.A00(r3), r3.A03);
        r4.A08(true);
        r4.A09(true);
        r4.A0A.setOnShowListener(new C144026Dz(r3));
        r4.A0A.setOnDismissListener(new AnonymousClass6DX(r3));
        Dialog A002 = r4.A00();
        r3.A00 = A002;
        A002.show();
    }

    public static void A0G(ReelOptionsDialog reelOptionsDialog, AnonymousClass6DP r10, AnonymousClass6E6 r11) {
        A0K(reelOptionsDialog, "report_button");
        AnonymousClass1NJ r2 = reelOptionsDialog.A0S.A08(reelOptionsDialog.A0U).A08;
        r11.A00.A1j = true;
        r10.A00((String) null);
        C27341Hl r3 = (C27341Hl) AnonymousClass2UZ.A00().A0L(r2.APo(), -1, C30671Ut.A0A(reelOptionsDialog.A0U, r2), "report_button", C30671Ut.A02(reelOptionsDialog.A0U, r2));
        r3.registerLifecycleListener(new AnonymousClass5KA(reelOptionsDialog));
        C52362Om r22 = new C52362Om(reelOptionsDialog.A0J.getActivity(), reelOptionsDialog.A0U);
        r22.A02 = r3;
        r22.A02();
    }

    public static void A0I(ReelOptionsDialog reelOptionsDialog, CharSequence charSequence, AnonymousClass6E2 r9) {
        if (reelOptionsDialog.A07.equals(charSequence)) {
            C36901in.A0D(AnonymousClass0WN.A01(reelOptionsDialog.A0U), "hide_button", reelOptionsDialog.A0P, reelOptionsDialog.A0R.A07(), reelOptionsDialog.A0O, (Integer) null);
            r9.B6k();
        }
        reelOptionsDialog.A01 = null;
    }

    public static void A0K(ReelOptionsDialog reelOptionsDialog, String str) {
        C36901in.A0D(AnonymousClass0WN.A01(reelOptionsDialog.A0U), str, reelOptionsDialog.A0P, reelOptionsDialog.A0R.A07(), reelOptionsDialog.A0O, (Integer) null);
    }

    private void A0M(ArrayList arrayList, String str) {
        if (C144126Ej.A0B(this.A0S, this.A0R, this.A0U)) {
            arrayList.add(this.A0V);
            A0W(str, "copy_link");
        }
    }

    private void A0N(ArrayList arrayList, String str) {
        if (C144126Ej.A0B(this.A0S, this.A0R, this.A0U)) {
            arrayList.add(this.A0X);
            A0W(str, "system_share_sheet");
        }
    }

    public static CharSequence[] A0O(ReelOptionsDialog reelOptionsDialog) {
        Resources resources;
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.delete));
        if (reelOptionsDialog.A0R.A14()) {
            resources = reelOptionsDialog.A0I;
            i = C0003R.string.save_video;
        } else {
            resources = reelOptionsDialog.A0I;
            i = C0003R.string.save_photo;
        }
        arrayList.add(resources.getString(i));
        if (reelOptionsDialog.A0R.A12()) {
            arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.share_as_post));
        }
        arrayList.addAll(reelOptionsDialog.A01());
        return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r1 == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01fb  */
    public static CharSequence[] A0P(ReelOptionsDialog reelOptionsDialog) {
        String str;
        Resources resources;
        int i;
        AnonymousClass1NJ r0;
        C39941no r1;
        boolean z;
        String str2;
        boolean z2;
        boolean booleanValue;
        ArrayList arrayList = new ArrayList();
        C39941no r2 = reelOptionsDialog.A0R;
        if (r2.Aho()) {
            AnonymousClass1OY r12 = reelOptionsDialog.A0T;
            if (r12.A02()) {
                if (!(r12 == AnonymousClass1OY.ADS_HISTORY || r12 == AnonymousClass1OY.VIEW_ADS)) {
                    CharSequence A062 = reelOptionsDialog.A0Q.A06(reelOptionsDialog.A0I.getString(C0003R.string.hide_ad));
                    reelOptionsDialog.A06 = A062;
                    arrayList.add(A062);
                }
                CharSequence A063 = reelOptionsDialog.A0Q.A06(reelOptionsDialog.A0I.getString(C0003R.string.report_ad));
                reelOptionsDialog.A08 = A063;
                arrayList.add(A063);
                CharSequence A072 = reelOptionsDialog.A0Q.A07(reelOptionsDialog.A0I.getString(C0003R.string.sponsored_label_dialog_title), C30671Ut.A0G(reelOptionsDialog.A0U, reelOptionsDialog.A0R.A08));
                reelOptionsDialog.A05 = A072;
                arrayList.add(A072);
                AnonymousClass1NJ r02 = reelOptionsDialog.A0R.A08;
                if (r02 != null) {
                    Boolean bool = r02.A15;
                    if (bool == null) {
                        booleanValue = false;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    z2 = true;
                }
                z2 = false;
                if (z2 && ((Boolean) AnonymousClass0L6.A02(reelOptionsDialog.A0U, AnonymousClass0L7.STORY_ADS_MOVE_RESHARE_TO_OVERFLOW, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    String string = reelOptionsDialog.A0I.getString(C0003R.string.send_to_direct);
                    reelOptionsDialog.A09 = string;
                    arrayList.add(string);
                }
                return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
            }
        }
        if (r2.A0v()) {
            CharSequence A064 = reelOptionsDialog.A0Q.A06(reelOptionsDialog.A0I.getString(C0003R.string.hide_this));
            reelOptionsDialog.A07 = A064;
            arrayList.add(A064);
        } else if (r2.A0w()) {
            String string2 = reelOptionsDialog.A0I.getString(C0003R.string.see_fewer_suggestions);
            reelOptionsDialog.A0A = string2;
            arrayList.add(string2);
        } else {
            if (r2.A0r()) {
                str = "story_highlight_action_sheet";
            } else {
                str = "location_story_action_sheet";
            }
            if (reelOptionsDialog.A0S.A0H()) {
                arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.reel_option_dialog_leave_group));
            }
            arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.report_options));
            C39941no r13 = reelOptionsDialog.A0R;
            if (r13.A14() && !r13.Aho() && ((Boolean) AnonymousClass0L6.A02(reelOptionsDialog.A0U, AnonymousClass0L7.STORIES_CAPTIONS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.caption_options));
            }
            AnonymousClass1OY r14 = reelOptionsDialog.A0T;
            if (r14.equals(AnonymousClass1OY.EXPLORE)) {
                resources = reelOptionsDialog.A0I;
                i = C0003R.string.not_interested;
            } else {
                if (r14.equals(AnonymousClass1OY.EXPLORE_LIVE) || r14.equals(AnonymousClass1OY.TOP_LIVE)) {
                    resources = reelOptionsDialog.A0I;
                    i = C0003R.string.live_videos_show_less;
                }
                if (reelOptionsDialog.A0R.A0j()) {
                    arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.sponsor_tag_dialog_title));
                }
                AnonymousClass1NJ r03 = reelOptionsDialog.A0R.A08;
                AnonymousClass1NJ r15 = r03;
                if (r03 != null && C14090jk.A04(reelOptionsDialog.A0U, r15)) {
                    arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.remove_me_from_post));
                }
                r0 = reelOptionsDialog.A0R.A08;
                AnonymousClass1NJ r4 = r0;
                if (r0 != null) {
                    AnonymousClass0C1 r16 = reelOptionsDialog.A0U;
                    if (r0.A0Z() != null) {
                        str2 = r4.A0Z().A01;
                    } else if (r4.A0a() != null) {
                        str2 = r4.A0a().A00.A02.A02;
                    } else {
                        z = false;
                        if (z && !C14090jk.A03(reelOptionsDialog.A0U, reelOptionsDialog.A0R.A08)) {
                            arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.remove_story_link));
                        }
                    }
                    z = C14090jk.A06(r16, str2);
                    arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.remove_story_link));
                }
                AnonymousClass1NJ r04 = reelOptionsDialog.A0R.A08;
                if (r04 != null && r04.A3I) {
                    arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.view_link));
                }
                reelOptionsDialog.A0M(arrayList, str);
                reelOptionsDialog.A0N(arrayList, str);
                r1 = reelOptionsDialog.A0R;
                if (r1.A0t()) {
                    C38091ki r17 = r1.A08.A0N;
                    C38091ki r05 = r17;
                    if (r17 != null && C49042Am.MISINFORMATION.equals(r05.A00)) {
                        arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.see_why_button_misinformation));
                    }
                }
                if (C144126Ej.A0B(reelOptionsDialog.A0S, reelOptionsDialog.A0R, reelOptionsDialog.A0U)) {
                    reelOptionsDialog.A0L(arrayList);
                }
            }
            arrayList.add(resources.getString(i));
            if (reelOptionsDialog.A0R.A0j()) {
            }
            AnonymousClass1NJ r032 = reelOptionsDialog.A0R.A08;
            AnonymousClass1NJ r152 = r032;
            arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.remove_me_from_post));
            r0 = reelOptionsDialog.A0R.A08;
            AnonymousClass1NJ r42 = r0;
            if (r0 != null) {
            }
            AnonymousClass1NJ r042 = reelOptionsDialog.A0R.A08;
            arrayList.add(reelOptionsDialog.A0I.getString(C0003R.string.view_link));
            reelOptionsDialog.A0M(arrayList, str);
            reelOptionsDialog.A0N(arrayList, str);
            r1 = reelOptionsDialog.A0R;
            if (r1.A0t()) {
            }
            if (C144126Ej.A0B(reelOptionsDialog.A0S, reelOptionsDialog.A0R, reelOptionsDialog.A0U)) {
            }
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
    }

    public final String A0Q(String str) {
        if (this.A0I.getString(C0003R.string.cancel).equals(str)) {
            return "cancel";
        }
        if (this.A0I.getString(C0003R.string.copy_link_url).equals(str)) {
            return "copy_link_url";
        }
        if (this.A0I.getString(C0003R.string.delete).equals(str)) {
            return "delete";
        }
        if (this.A0I.getString(C0003R.string.delete_photo_message).equals(str)) {
            return "delete_photo_message";
        }
        if (this.A0I.getString(C0003R.string.delete_photo_title).equals(str)) {
            return "delete_photo_title";
        }
        if (this.A0I.getString(C0003R.string.delete_video_message).equals(str)) {
            return "delete_video_message";
        }
        if (this.A0I.getString(C0003R.string.delete_video_title).equals(str)) {
            return "delete_video_title";
        }
        if (this.A0I.getString(C0003R.string.edit_partner).equals(str)) {
            return "edit_partner";
        }
        if (this.A0I.getString(C0003R.string.edit_story_option).equals(str)) {
            return "edit_story_option";
        }
        if (this.A0I.getString(C0003R.string.error).equals(str)) {
            return "error";
        }
        if (this.A0I.getString(C0003R.string.go_to_promo_manager).equals(str)) {
            return "go_to_promo_manager";
        }
        if (this.A0I.getString(C0003R.string.hide_ad).equals(str)) {
            return "hide_ad";
        }
        if (this.A0I.getString(C0003R.string.hide_this).equals(str)) {
            return "hide_this";
        }
        if (this.A0I.getString(C0003R.string.inline_removed_notif_title).equals(str)) {
            return "inline_removed_notif_title";
        }
        if (this.A0I.getString(C0003R.string.reel_option_dialog_leave_group).equals(str)) {
            return "leave_group";
        }
        if (this.A0I.getString(C0003R.string.live_videos_show_less).equals(str)) {
            return "live_videos_show_less";
        }
        if (this.A0I.getString(C0003R.string.media_logging_title).equals(str)) {
            return "media_logging_title";
        }
        if (this.A0I.getString(C0003R.string.media_option_share_link).equals(str)) {
            return "media_option_share_link";
        }
        if (this.A0I.getString(C0003R.string.music_overlay_cant_save_story_alert).equals(str)) {
            return "music_overlay_cant_save_story_alert";
        }
        if (this.A0I.getString(C0003R.string.not_now).equals(str)) {
            return "not_now";
        }
        if (this.A0I.getString(C0003R.string.f118ok).equals(str)) {
            return "ok";
        }
        if (this.A0I.getString(AnonymousClass6D8.A01(this.A0U, true)).equals(str)) {
            return "promote";
        }
        if (this.A0I.getString(AnonymousClass6D8.A00(this.A0U)).equals(str)) {
            return "promote_again";
        }
        if (this.A0I.getString(C0003R.string.reel_settings_title).equals(str)) {
            return "reel_settings_title";
        }
        if (this.A0I.getString(C0003R.string.remove).equals(str)) {
            return "remove";
        }
        if (this.A0I.getString(C0003R.string.remove_business_partner).equals(str)) {
            return "remove_business_partner";
        }
        if (this.A0I.getString(C0003R.string.remove_business_partner_description).equals(str)) {
            return "remove_business_partner_description";
        }
        if (this.A0I.getString(C0003R.string.remove_from_highlight_option).equals(str)) {
            return "remove_from_highlight_option";
        }
        if (this.A0I.getString(C0003R.string.remove_me_from_post).equals(str)) {
            return "remove_me_from_post";
        }
        if (this.A0I.getString(C0003R.string.remove_photo_highlight_button).equals(str)) {
            return "remove_photo_highlight_button";
        }
        if (this.A0I.getString(C0003R.string.remove_photo_highlight_message).equals(str)) {
            return "remove_photo_highlight_message";
        }
        if (this.A0I.getString(C0003R.string.remove_photo_highlight_message_active).equals(str)) {
            return "remove_photo_highlight_message_active";
        }
        if (this.A0I.getString(C0003R.string.remove_photo_highlight_title).equals(str)) {
            return "remove_photo_highlight_title";
        }
        if (this.A0I.getString(C0003R.string.remove_sponsor_tag_subtitle).equals(str) || this.A0I.getString(C0003R.string.remove_sponsor_tag_subtitle_for_boosted_bc).equals(str)) {
            return "remove_sponsor_tag_subtitle";
        }
        if (this.A0I.getString(C0003R.string.remove_sponsor_tag_title).equals(str)) {
            return "remove_sponsor_tag_title";
        }
        if (this.A0I.getString(C0003R.string.remove_video_highlight_button).equals(str)) {
            return "remove_video_highlight_button";
        }
        if (this.A0I.getString(C0003R.string.remove_video_highlight_message).equals(str)) {
            return "remove_video_highlight_message";
        }
        if (this.A0I.getString(C0003R.string.remove_video_highlight_message_active).equals(str)) {
            return "remove_video_highlight_message_active";
        }
        if (this.A0I.getString(C0003R.string.remove_video_highlight_title).equals(str)) {
            return "remove_video_highlight_title";
        }
        if (this.A0I.getString(C0003R.string.removing_from_highlights_progress).equals(str)) {
            return "removing_from_highlights_progress";
        }
        if (this.A0I.getString(C0003R.string.report_ad).equals(str)) {
            return "report_ad";
        }
        if (this.A0I.getString(C0003R.string.report_options).equals(str)) {
            return "report_options";
        }
        if (this.A0I.getString(C0003R.string.report_thanks_toast_msg_ads).equals(str)) {
            return "report_thanks_toast_msg_ads";
        }
        if (this.A0I.getString(C0003R.string.save).equals(str)) {
            return "save";
        }
        if (this.A0I.getString(C0003R.string.save_photo).equals(str)) {
            return "save_photo";
        }
        if (this.A0I.getString(C0003R.string.save_video).equals(str) || this.A0I.getString(C0003R.string.save_video).equals(str)) {
            return "save_video";
        }
        if (this.A0I.getString(C0003R.string.saved_to_camera_roll).equals(str)) {
            return "saved_to_camera_roll";
        }
        if (this.A0I.getString(C0003R.string.send_to_direct).equals(str)) {
            return "send_to_direct";
        }
        if (this.A0I.getString(C0003R.string.share).equals(str)) {
            return "share";
        }
        if (this.A0I.getString(C0003R.string.share_as_post).equals(str)) {
            return "share_as_post";
        }
        if (this.A0I.getString(C0003R.string.share_photo_to_facebook_message).equals(str)) {
            return "share_photo_to_facebook_message";
        }
        if (this.A0I.getString(C0003R.string.share_to_facebook_title).equals(str)) {
            return "share_to_facebook_title";
        }
        if (this.A0I.getString(C0003R.string.share_video_to_facebook_message).equals(str)) {
            return "share_video_to_facebook_message";
        }
        if (this.A0I.getString(C0003R.string.sponsor_tag_dialog_title).equals(str)) {
            return "sponsor_tag_dialog_title";
        }
        if (this.A0I.getString(C0003R.string.sponsored_label_dialog_title).equals(str)) {
            return "sponsored_label_dialog_title";
        }
        if (this.A0I.getString(C0003R.string.not_interested).equals(str)) {
            return "not_interested";
        }
        if (this.A0I.getString(C0003R.string.tag_business_partner).equals(str)) {
            return "tag_business_partner";
        }
        if (this.A0I.getString(C0003R.string.unable_to_delete_promoted_story).equals(str)) {
            return "unable_to_delete_promoted_story";
        }
        if (this.A0I.getString(C0003R.string.unable_to_delete_story).equals(str)) {
            return "unable_to_delete_story";
        }
        if (this.A0I.getString(C0003R.string.unknown_error_occured).equals(str)) {
            return "unknown_error_occured";
        }
        if (this.A0I.getString(C0003R.string.view_promo_insights).equals(str)) {
            return "view_promo_insights";
        }
        if (this.A0I.getString(C0003R.string.see_why_button_misinformation).equals(str)) {
            return "see_why_button_misinformation";
        }
        return "unknown_menu_option";
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0259  */
    public final void A0R(Context context, AnonymousClass1AM r27, AnonymousClass34H r28, DialogInterface.OnDismissListener onDismissListener, AnonymousClass34J r30, AnonymousClass34R r31, AnonymousClass34S r32, AnonymousClass34T r33, AnonymousClass34V r34, AnonymousClass1OY r35, AnonymousClass0RN r36) {
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        C38091ki r0;
        Object[] array;
        Resources resources3;
        int i3;
        C38091ki r02;
        ArrayList arrayList;
        Resources resources4;
        int i4;
        C39941no r1 = this.A0R;
        if (r1.A0o()) {
            arrayList = new ArrayList();
            boolean z = false;
            if (r1.A09.A08 == C38051ke.POST_LIVE_POSTING_INITIATED) {
                z = true;
            }
            if (!z) {
                arrayList.add(this.A0I.getString(C0003R.string.delete));
            }
            if (C16180oA.A00(this.A0U).A00.getBoolean("allow_story_reshare", true)) {
                C39941no r12 = this.A0R;
                if (r12.A12() && r12.A0o()) {
                    arrayList.add(this.A0I.getString(C0003R.string.send_to_direct));
                }
            }
            resources4 = this.A0I;
            i4 = C0003R.string.reel_settings_title;
        } else if (this.A0S.A0H()) {
            arrayList = new ArrayList();
            arrayList.add(this.A0I.getString(C0003R.string.delete));
            resources4 = this.A0I;
            i4 = C0003R.string.reel_option_dialog_leave_group;
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (this.A03.A0U) {
                arrayList2.add(this.A0I.getString(C0003R.string.delete));
                C39941no r13 = this.A0R;
                if (r13.A0t() && (r02 = r13.A08.A0N) != null && C49042Am.MISINFORMATION.equals(r02.A00)) {
                    arrayList2.add(this.A0I.getString(C0003R.string.see_why_button_misinformation));
                }
                if (this.A0R.A14()) {
                    resources3 = this.A0I;
                    i3 = C0003R.string.save_video;
                } else {
                    resources3 = this.A0I;
                    i3 = C0003R.string.save_photo;
                }
                arrayList2.add(resources3.getString(i3));
                A0M(arrayList2, "location_story_action_sheet");
                A0N(arrayList2, "location_story_action_sheet");
                if (C144126Ej.A0B(this.A0S, this.A0R, this.A0U)) {
                    A0L(arrayList2);
                }
            } else {
                arrayList2.add(this.A0I.getString(C0003R.string.delete));
                C39941no r14 = this.A0R;
                if (r14.A0t() && (r0 = r14.A08.A0N) != null && C49042Am.MISINFORMATION.equals(r0.A00)) {
                    arrayList2.add(this.A0I.getString(C0003R.string.see_why_button_misinformation));
                }
                if (this.A0R.A14()) {
                    resources = this.A0I;
                    i = C0003R.string.save_video;
                } else {
                    resources = this.A0I;
                    i = C0003R.string.save_photo;
                }
                arrayList2.add(resources.getString(i));
                if (C16180oA.A00(this.A0U).A00.getBoolean("allow_story_reshare", true)) {
                    C39941no r4 = this.A0R;
                    if (r4.A0A() != C37171jE.CLOSE_FRIENDS && r4.A0t() && r4.A12()) {
                        arrayList2.add(this.A0I.getString(C0003R.string.send_to_direct));
                    }
                }
                if (r35 != AnonymousClass1OY.DIRECT && AnonymousClass1BA.A07(this.A0H, C0003R.attr.reelOptionsAllowFeedCreation, true) && this.A0R.A12()) {
                    arrayList2.add(this.A0I.getString(C0003R.string.share_as_post));
                }
                if (this.A0R.A0j()) {
                    arrayList2.add(this.A0I.getString(C0003R.string.remove_business_partner));
                    if ("eligible".equals(this.A0B)) {
                        resources2 = this.A0I;
                        i2 = C0003R.string.edit_partner;
                    }
                    A0M(arrayList2, "location_story_action_sheet");
                    A0N(arrayList2, "location_story_action_sheet");
                    arrayList2.add(this.A0I.getString(C0003R.string.reel_settings_title));
                    if (C144126Ej.A0B(this.A0S, this.A0R, this.A0U)) {
                        A0L(arrayList2);
                    }
                    arrayList2.addAll(A01());
                } else {
                    if (!this.A0R.A15(C34181eD.PRODUCT) || this.A0U.A06.A0T()) {
                        resources2 = this.A0I;
                        i2 = C0003R.string.tag_business_partner;
                    }
                    A0M(arrayList2, "location_story_action_sheet");
                    A0N(arrayList2, "location_story_action_sheet");
                    arrayList2.add(this.A0I.getString(C0003R.string.reel_settings_title));
                    if (C144126Ej.A0B(this.A0S, this.A0R, this.A0U)) {
                    }
                    arrayList2.addAll(A01());
                }
                arrayList2.add(resources2.getString(i2));
                A0M(arrayList2, "location_story_action_sheet");
                A0N(arrayList2, "location_story_action_sheet");
                arrayList2.add(this.A0I.getString(C0003R.string.reel_settings_title));
                if (C144126Ej.A0B(this.A0S, this.A0R, this.A0U)) {
                }
                arrayList2.addAll(A01());
            }
            array = arrayList2.toArray(new CharSequence[arrayList2.size()]);
            CharSequence[] charSequenceArr = (CharSequence[]) array;
            AnonymousClass34S r11 = r32;
            AnonymousClass34R r10 = r31;
            AnonymousClass34J r9 = r30;
            DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
            AnonymousClass0RN r142 = r36;
            AnonymousClass34V r132 = r34;
            AnonymousClass34T r122 = r33;
            if (!AnonymousClass6DW.A00(this.A0U).booleanValue()) {
                this.A01 = onDismissListener2;
                Context context2 = context;
                AnonymousClass5EO r2 = new AnonymousClass5EO(this.A0U, context2);
                for (int i5 = 0; i5 < charSequenceArr.length; i5++) {
                    r2.A05(String.valueOf(charSequenceArr[i5]), new AnonymousClass6DO(this, charSequenceArr, i5, onDismissListener2, r9, r10, r11, r122, r132, r142));
                    r2.A02 = r28;
                    r2.A00().A01(context2);
                }
                return;
            }
            Dialog A002 = A00(this, charSequenceArr, new AnonymousClass6DR(this, charSequenceArr, onDismissListener2, r9, r10, r11, r122, r132, r142), onDismissListener2);
            this.A00 = A002;
            A002.show();
            return;
        }
        arrayList.add(resources4.getString(i4));
        array = arrayList.toArray(new CharSequence[arrayList.size()]);
        CharSequence[] charSequenceArr2 = (CharSequence[]) array;
        AnonymousClass34S r112 = r32;
        AnonymousClass34R r102 = r31;
        AnonymousClass34J r92 = r30;
        DialogInterface.OnDismissListener onDismissListener22 = onDismissListener;
        AnonymousClass0RN r1422 = r36;
        AnonymousClass34V r1322 = r34;
        AnonymousClass34T r1222 = r33;
        if (!AnonymousClass6DW.A00(this.A0U).booleanValue()) {
        }
    }

    public final void A0S(Context context, AnonymousClass34H r27, AnonymousClass6E2 r28, AnonymousClass34J r29, DialogInterface.OnDismissListener onDismissListener, AnonymousClass34T r31, AnonymousClass34U r32, boolean z, AnonymousClass0RN r34) {
        String str;
        C145636Km.A01(this.A0P, this.A0R.getId(), this.A0U, Constants.A0N);
        CharSequence[] A0P2 = A0P(this);
        AnonymousClass34T r13 = r31;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        AnonymousClass34J r9 = r29;
        boolean z2 = z;
        AnonymousClass0RN r12 = r34;
        AnonymousClass34U r14 = r32;
        AnonymousClass6E2 r8 = r28;
        if (AnonymousClass6DW.A00(this.A0U).booleanValue()) {
            this.A01 = onDismissListener2;
            Context context2 = context;
            AnonymousClass5EO r1 = new AnonymousClass5EO(this.A0U, context2);
            for (int i = 0; i < A0P2.length; i++) {
                r1.A05(String.valueOf(A0P2[i]), new AnonymousClass6DQ(this, A0P2, i, r8, r9, onDismissListener2, z2, r12, r13, r14));
                r1.A02 = r27;
                r1.A00().A00(context2);
            }
        } else {
            Dialog A002 = A00(this, A0P2, new AnonymousClass6DS(this, A0P2, r8, r9, onDismissListener2, z2, r12, r13, r14), onDismissListener2);
            this.A00 = A002;
            A002.show();
        }
        C39941no r4 = this.A0R;
        if (r4.A0r()) {
            str = "story_highlight_action_sheet";
        } else {
            str = "location_story_action_sheet";
        }
        AnonymousClass6E8.A00(this.A0U, this.A0P, r4.getId(), str);
    }

    public final void A0T(Context context, AnonymousClass34H r19, AnonymousClass6E2 r20, AnonymousClass34J r21, DialogInterface.OnDismissListener onDismissListener, AnonymousClass34T r23, AnonymousClass34U r24, boolean z, AnonymousClass0RN r26) {
        String str;
        C13300iJ r7 = this.A0R.A0D;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        AnonymousClass34J r11 = r21;
        AnonymousClass6E2 r10 = r20;
        AnonymousClass34H r9 = r19;
        boolean z2 = z;
        Context context2 = context;
        AnonymousClass0RN r16 = r26;
        AnonymousClass34U r14 = r24;
        AnonymousClass34T r13 = r23;
        if (r7 == null || r7.A1o != Constants.ZERO) {
            A0S(context2, r9, r10, r11, onDismissListener2, r13, r14, z2, r16);
            return;
        }
        C15890nh r3 = new C15890nh(this.A0U);
        r3.A09 = Constants.A0N;
        r3.A06(C64372rN.class, false);
        String id = r7.getId();
        if (id != null) {
            String $const$string = AnonymousClass0C5.$const$string(39);
            r3.A0C = $const$string;
            r3.A0B = $const$string;
            str = MemoryDumpUploadJob.EXTRA_USER_ID;
        } else {
            String $const$string2 = AnonymousClass0C5.$const$string(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
            r3.A0C = $const$string2;
            r3.A0B = $const$string2;
            id = r7.AZn();
            str = "user_name";
        }
        r3.A09(str, id);
        r3.A09("from_module", "ReelOptionsDialog");
        r3.A08 = Constants.A0N;
        AnonymousClass6DI r5 = new AnonymousClass6DI(this, r7, context2, r9, r10, r11, onDismissListener2, r13, r14, z2, r16);
        Activity activity = this.A0H;
        AnonymousClass1L8 r1 = this.A0L;
        C17850qu A032 = r3.A03();
        A032.A00 = r5;
        C28351Lj.A00(activity, r1, A032);
    }

    public final void A0U(DialogInterface.OnDismissListener onDismissListener, AnonymousClass34S r12, AnonymousClass34V r13) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A0I.getString(C0003R.string.edit_story_option));
        arrayList.add(this.A0I.getString(C0003R.string.remove_from_highlight_option));
        if (this.A0R.A12()) {
            arrayList.add(this.A0I.getString(C0003R.string.send_to_direct));
        }
        A0M(arrayList, "story_highlight_action_sheet");
        A0N(arrayList, "story_highlight_action_sheet");
        A0L(arrayList);
        arrayList.addAll(A01());
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
        Dialog A002 = A00(this, charSequenceArr, new AnonymousClass6DF(this, charSequenceArr, onDismissListener, r12, r13), onDismissListener);
        this.A00 = A002;
        A002.show();
        AnonymousClass6E8.A00(this.A0U, this.A0P, this.A0R.getId(), "story_highlight_action_sheet");
    }

    public final void A0V(String str) {
        String str2;
        if (!this.A0X.equals(str) && !this.A0V.equals(str)) {
            if (this.A0R.A0r()) {
                str2 = "story_highlight_action_sheet";
            } else {
                str2 = "location_story_action_sheet";
            }
            String A0Q2 = A0Q(str);
            C144006Dx r2 = new C144006Dx(AnonymousClass0QT.A00(this.A0U, this.A0P).A02("external_share_option_tapped"));
            r2.A08("media_owner_id", this.A0C);
            r2.A08("share_option", A0Q2);
            r2.A08("share_location", str2);
            r2.A08("media_id", this.A0R.getId());
            r2.A01();
        }
    }

    public final void A0W(String str, String str2) {
        C144016Dy r2 = new C144016Dy(AnonymousClass0QT.A00(this.A0U, this.A0P).A02("external_share_option_impression"));
        r2.A08("media_owner_id", this.A0C);
        r2.A08("share_option", str2);
        r2.A08("share_location", str);
        r2.A08("media_id", this.A0R.getId());
        r2.A01();
    }

    public ReelOptionsDialog(Activity activity, AnonymousClass1HD r13, AnonymousClass0RN r14, Resources resources, C50282Fr r16, C39941no r17, C27371Ho r18, AnonymousClass1OY r19, String str, AnonymousClass0C1 r21, C37121j9 r22, C700634s r23, C29181Ox r24, C31151Wq r25, ReelViewerConfig reelViewerConfig, AnonymousClass35L r27) {
        String id;
        this.A0H = activity;
        this.A0J = r13;
        this.A0K = r13.mFragmentManager;
        this.A0L = AnonymousClass1L8.A00(r13);
        this.A0M = r14;
        this.A0I = resources;
        this.A0S = r16;
        C39941no r1 = r17;
        this.A0R = r1;
        this.A0P = r18;
        this.A0T = r19;
        this.A0W = str;
        AnonymousClass0C1 r4 = r21;
        this.A0U = r4;
        this.A0O = r22;
        this.A0F = r23;
        this.A0Q = r24;
        this.A0N = r25;
        this.A03 = reelViewerConfig;
        this.A0G = r27;
        this.A0B = C16180oA.A00(r4).A04();
        C13300iJ r0 = r1.A0D;
        if (r0 == null) {
            id = null;
        } else {
            id = r0.getId();
        }
        this.A0C = id;
        this.A0X = this.A0I.getString(C0003R.string.share_to);
        this.A0V = this.A0I.getString(C0003R.string.copy_link_url);
        this.A0D = new C144896Hn(this.A0U, this.A0J, this.A0R, this.A0F, this.A0M);
        this.A0E = new C143786Da(this.A0U, this.A0J, this.A0R);
        this.A02 = AnonymousClass0QT.A00(r4, r14);
    }

    public static void A07(C39941no r4, Activity activity, AnonymousClass0C1 r6, DialogInterface.OnDismissListener onDismissListener, AnonymousClass34W r8, AnonymousClass0RN r9) {
        C16180oA.A00(r6).A00.edit().putBoolean("has_seen_story_share_to_facebook_dialog", true).apply();
        AnonymousClass2OA r2 = new AnonymousClass2OA(activity);
        r2.A07(C0003R.string.share_to_facebook_title);
        boolean A14 = r4.A14();
        int i = C0003R.string.share_photo_to_facebook_message;
        if (A14) {
            i = C0003R.string.share_video_to_facebook_message;
        }
        r2.A06(i);
        r2.A0U(true);
        r2.A0V(true);
        r2.A0A(C0003R.string.share, new C1184956t(r6, r9, r8, r4));
        r2.A09(C0003R.string.not_now, new C143926Dp(onDismissListener));
        r2.A0F(onDismissListener);
        r2.A03().show();
    }

    private void A0L(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (!this.A0X.equals(charSequence) && !this.A0V.equals(charSequence)) {
                A0W("location_story_action_sheet", A0Q("" + charSequence));
            }
        }
    }

    public static void A0H(ReelOptionsDialog reelOptionsDialog, CharSequence charSequence, DialogInterface.OnDismissListener onDismissListener, AnonymousClass34J r13, AnonymousClass34R r14, AnonymousClass34S r15, AnonymousClass34T r16, AnonymousClass34V r17, AnonymousClass0RN r18) {
        if (reelOptionsDialog.A0I.getString(C0003R.string.delete).equals(charSequence)) {
            A06(reelOptionsDialog.A0S.A0A, reelOptionsDialog.A0R, reelOptionsDialog.A0H, reelOptionsDialog.A0K, reelOptionsDialog.A0L, reelOptionsDialog.A0M, reelOptionsDialog.A01, reelOptionsDialog.A0U, r14, r18);
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.see_why_button_misinformation).equals(charSequence)) {
            r16.A00(reelOptionsDialog.A0R);
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.save_video).equals(charSequence) || reelOptionsDialog.A0I.getString(C0003R.string.save_photo).equals(charSequence)) {
            A08(reelOptionsDialog.A0R, reelOptionsDialog.A0H, reelOptionsDialog.A0U, reelOptionsDialog.A0L, reelOptionsDialog.A01, reelOptionsDialog.A0K);
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.send_to_direct).equals(charSequence)) {
            r15.A00.BJc(reelOptionsDialog.A0R);
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.share_as_post).equals(charSequence)) {
            A09(reelOptionsDialog.A0R, reelOptionsDialog.A0U, reelOptionsDialog.A0K, reelOptionsDialog.A0L, reelOptionsDialog.A01, reelOptionsDialog.A0N, reelOptionsDialog.A0H);
        } else {
            if (reelOptionsDialog.A0I.getString(C0003R.string.remove_business_partner).equals(charSequence)) {
                AnonymousClass1NJ r0 = reelOptionsDialog.A0R.A08;
                if (r0 == null || r0.A1j == null) {
                    C144896Hn r3 = reelOptionsDialog.A0D;
                    AnonymousClass2OA r2 = new AnonymousClass2OA(r3.A03);
                    r2.A07(C0003R.string.remove_business_partner);
                    r2.A06(C0003R.string.remove_business_partner_description);
                    r2.A0A(C0003R.string.remove, new C143946Dr(r3, onDismissListener));
                    r2.A09(C0003R.string.cancel, new C143866Dj(r3, onDismissListener));
                    r2.A03().show();
                }
            } else if (reelOptionsDialog.A0I.getString(C0003R.string.edit_partner).equals(charSequence) || reelOptionsDialog.A0I.getString(C0003R.string.tag_business_partner).equals(charSequence)) {
                AnonymousClass1NJ r02 = reelOptionsDialog.A0R.A08;
                if (r02 == null || r02.A1j == null) {
                    if (C144886Hm.A05(reelOptionsDialog.A0U, reelOptionsDialog.A0B)) {
                        reelOptionsDialog.A0D.A01(onDismissListener);
                    } else {
                        C144896Hn r6 = reelOptionsDialog.A0D;
                        C144946Hs r4 = new C144946Hs(r6, onDismissListener);
                        Bundle bundle = new Bundle();
                        bundle.putString("eligibility_decision", C16180oA.A00(r6.A07).A04());
                        bundle.putString("entry_point", "reel_composer_edit_options");
                        bundle.putString("back_state_name", "com.instagram.reels.dialog.ReelOptionsDialog");
                        C52362Om r22 = new C52362Om(r6.A03, r6.A07);
                        r22.A02 = C16290oM.A00.A00().A00(bundle, r4);
                        r22.A04 = "com.instagram.reels.dialog.ReelOptionsDialog";
                        r22.A02();
                    }
                }
            } else if (reelOptionsDialog.A0I.getString(C0003R.string.reel_settings_title).equals(charSequence)) {
                C52362Om r23 = new C52362Om(reelOptionsDialog.A0J.getActivity(), reelOptionsDialog.A0U);
                r23.A02 = C17020pY.A00().A0J().A00();
                r23.A02();
            } else if (reelOptionsDialog.A0I.getString(AnonymousClass6D8.A01(reelOptionsDialog.A0U, true)).equals(charSequence) || reelOptionsDialog.A0I.getString(AnonymousClass6D8.A00(reelOptionsDialog.A0U)).equals(charSequence)) {
                AnonymousClass6D8.A03(reelOptionsDialog.A0M.getModuleName(), reelOptionsDialog.A0R.A08, reelOptionsDialog.A0J, reelOptionsDialog.A0U, reelOptionsDialog.A01);
            } else if (reelOptionsDialog.A0I.getString(C0003R.string.go_to_promo_manager).equals(charSequence)) {
                if (reelOptionsDialog.A0H instanceof FragmentActivity) {
                    String moduleName = reelOptionsDialog.A0M.getModuleName();
                    AnonymousClass0C1 r03 = reelOptionsDialog.A0U;
                    AnonymousClass2VW.A01(r03, moduleName);
                    AnonymousClass609.A00((FragmentActivity) reelOptionsDialog.A0H, r03);
                }
            } else if (reelOptionsDialog.A0I.getString(C0003R.string.view_promo_insights).equals(charSequence)) {
                r17.A00();
            } else if (reelOptionsDialog.A0X.equals(charSequence)) {
                reelOptionsDialog.A03();
            } else if (reelOptionsDialog.A0V.equals(charSequence)) {
                reelOptionsDialog.A02();
            } else if (reelOptionsDialog.A0I.getString(C0003R.string.reel_option_dialog_leave_group).equals(charSequence)) {
                A0E(reelOptionsDialog, r13, onDismissListener);
            }
            C144896Hn r5 = reelOptionsDialog.A0D;
            FragmentActivity fragmentActivity = r5.A03;
            C37041j1.A03(fragmentActivity, r5.A07, fragmentActivity.getString(C0003R.string.cannot_edit_story), r5.A03.getString(C0003R.string.cannot_edit_promoted_branded_content_story), new C144966Hu(r5, onDismissListener));
        }
        reelOptionsDialog.A01 = null;
        if (!reelOptionsDialog.A0R.A0o()) {
            reelOptionsDialog.A0V("" + charSequence);
        }
    }

    public static void A0J(ReelOptionsDialog reelOptionsDialog, CharSequence charSequence, AnonymousClass6E2 r16, AnonymousClass34J r17, DialogInterface.OnDismissListener onDismissListener, boolean z, AnonymousClass0RN r20, AnonymousClass34T r21, AnonymousClass34U r22) {
        AnonymousClass0C1 r9;
        AnonymousClass0L7 r7;
        String str;
        ReelOptionsDialog reelOptionsDialog2 = reelOptionsDialog;
        CharSequence charSequence2 = charSequence;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        AnonymousClass6E2 r6 = r16;
        if (reelOptionsDialog.A0I.getString(C0003R.string.report_options).equals(charSequence)) {
            if (reelOptionsDialog.A0R.A0E == Constants.A0N) {
                r9 = reelOptionsDialog.A0U;
                r7 = AnonymousClass0L7.WELLBEING_SUPPORT_FRX_LIVE_REPORTING;
            } else {
                r9 = reelOptionsDialog.A0U;
                r7 = AnonymousClass0L7.WELLBEING_SUPPORT_FRX_STORIES_REPORTING;
            }
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r9, r7, "enabled", false, (AnonymousClass04H) null)).booleanValue();
            boolean z2 = z;
            if (booleanValue) {
                C27573CIr A002 = C22200y0.A00.A00(reelOptionsDialog.A0U);
                C39941no r3 = reelOptionsDialog.A0R;
                A002.A00((AnonymousClass0RN) null, r3.getId(), r3.A0D.getId());
                AnonymousClass2TH r5 = new AnonymousClass2TH(reelOptionsDialog.A0U);
                r5.A0L = reelOptionsDialog.A0J.getContext().getResources().getString(C0003R.string.report);
                r5.A0T = true;
                r5.A00 = 0.7f;
                AnonymousClass2TI A003 = r5.A00();
                Context context = reelOptionsDialog.A0J.getContext();
                C31201Wx.A00(reelOptionsDialog.A0H);
                CJT A012 = C22200y0.A00.A01();
                AnonymousClass0C1 r12 = reelOptionsDialog.A0U;
                String moduleName = r20.getModuleName();
                C39941no r92 = reelOptionsDialog.A0R;
                C13300iJ r14 = r92.A0D;
                switch (r92.A0E.intValue()) {
                    case 3:
                    case 4:
                        str = r92.A09.A0P;
                        break;
                    default:
                        str = r92.getId();
                        break;
                }
                A003.A01(context, A012.A01(A003, r12, moduleName, r14, str, C146056Mg.CHEVRON_BUTTON, AnonymousClass6MW.STORY, AnonymousClass6MX.MEDIA, new AnonymousClass6DU(reelOptionsDialog2, r6, z2), true, 0.7f));
                C31221Wz A013 = C31201Wx.A01(reelOptionsDialog2.A0H);
                if (A013 != null) {
                    A013.A06(new AnonymousClass6DM(reelOptionsDialog2, onDismissListener2));
                }
            } else {
                A0D(reelOptionsDialog, r6, z2);
            }
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.caption_options).equals(charSequence)) {
            AnonymousClass2TH r52 = new AnonymousClass2TH(reelOptionsDialog.A0U);
            r52.A0L = reelOptionsDialog.A0I.getString(C0003R.string.caption_options);
            r52.A00().A06(reelOptionsDialog.A0J.requireContext(), new AnonymousClass4CD());
            C31221Wz A014 = C31201Wx.A01(reelOptionsDialog.A0H);
            if (A014 != null) {
                A014.A06(new C143856Di(reelOptionsDialog, onDismissListener2));
            }
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.not_interested).equals(charSequence)) {
            C28351Lj.A00(reelOptionsDialog.A0H, reelOptionsDialog.A0L, C23000zN.A02(reelOptionsDialog.A0U, reelOptionsDialog.A0R.A0D, "explore_viewer", reelOptionsDialog.A0S.A0A.A0I()));
            AnonymousClass0C1 r93 = reelOptionsDialog.A0U;
            C27371Ho r10 = reelOptionsDialog.A0P;
            AnonymousClass1NJ r4 = reelOptionsDialog.A0R.A08;
            String str2 = reelOptionsDialog.A0S.A0A.A0W;
            AnonymousClass5BD.A02(r93, r10, "explore_see_less", r4.APo(), r4.APx(), r4.getId(), "sfplt_in_viewer", reelOptionsDialog.A0W, str2, (String) null, (String) null, (String) null, (C06270Ok) null, -1);
            C50282Fr r53 = reelOptionsDialog2.A0S;
            C249916w A0B2 = r53.A0B();
            if (A0B2.AZG() != Constants.ONE || !reelOptionsDialog2.A0R.A0D.equals(A0B2.AZf())) {
                r6.B6i(Constants.A0N);
            } else {
                r53.A0A.A0w = true;
                r6.B6k();
            }
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.live_videos_show_less).equals(charSequence)) {
            AnonymousClass0C1 r94 = reelOptionsDialog.A0U;
            C27371Ho r102 = reelOptionsDialog.A0P;
            C38031kc r1 = reelOptionsDialog.A0R.A09;
            String str3 = r1.A0P;
            String id = r1.A0C.getId();
            String str4 = reelOptionsDialog2.A0S.A0A.A0W;
            AnonymousClass5BD.A02(r94, r102, "explore_see_less", str3, MediaType.LIVE, id, "sfplt_in_viewer", reelOptionsDialog2.A0W, str4, (String) null, (String) null, (String) null, (C06270Ok) null, -1);
            r6.B6i(Constants.A0N);
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.sponsor_tag_dialog_title).equals(charSequence)) {
            C36901in.A0A(AnonymousClass0WN.A01(reelOptionsDialog.A0U), reelOptionsDialog.A0P, reelOptionsDialog.A0R.A07(), reelOptionsDialog.A0O, -1);
            AnonymousClass2UC r62 = new AnonymousClass2UC(reelOptionsDialog.A0H, reelOptionsDialog.A0U, "https://help.instagram.com/1199202110205564", AnonymousClass2UD.BRANDED_CONTENT_ABOUT);
            r62.A04(reelOptionsDialog.getModuleName());
            r62.A01();
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.remove_me_from_post).equals(charSequence)) {
            C144896Hn r63 = reelOptionsDialog.A0D;
            AnonymousClass2OA r54 = new AnonymousClass2OA(r63.A03);
            r54.A07(C0003R.string.remove_sponsor_tag_title);
            AnonymousClass1NJ r32 = r63.A06.A08;
            AnonymousClass0a4.A06(r32);
            boolean A1F = r32.A1F();
            int i = C0003R.string.remove_sponsor_tag_subtitle;
            if (A1F) {
                i = C0003R.string.remove_sponsor_tag_subtitle_for_boosted_bc;
            }
            r54.A06(i);
            r54.A0A(C0003R.string.f118ok, new C143956Ds(r63, onDismissListener2));
            r54.A09(C0003R.string.cancel, new C143876Dk(r63, onDismissListener2));
            r54.A03().show();
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.remove_story_link).equals(charSequence)) {
            C143786Da r95 = reelOptionsDialog.A0E;
            C700634s r72 = reelOptionsDialog.A0F;
            AnonymousClass2OA r64 = new AnonymousClass2OA(r95.A01);
            r64.A07(C0003R.string.remove_story_link_confirmation);
            r64.A0D(C0003R.string.remove, new C143796Db(r95, onDismissListener2, r72), Constants.A0N);
            r64.A09(C0003R.string.cancel, new AnonymousClass6DZ(r95, onDismissListener2));
            r64.A03().show();
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.view_link).equals(charSequence)) {
            if (reelOptionsDialog.A0R.A0i()) {
                reelOptionsDialog.A0G.A03(reelOptionsDialog.A0R, reelOptionsDialog.A0S, (C51862Mk) null, Constants.A12);
            } else if (reelOptionsDialog.A0R.A0d()) {
                reelOptionsDialog.A0G.A01(reelOptionsDialog.A0R, reelOptionsDialog.A0S, (C51862Mk) null, Constants.A12);
            } else if (reelOptionsDialog.A0R.A0g()) {
                reelOptionsDialog.A0G.A02(reelOptionsDialog.A0R, reelOptionsDialog.A0S, (C51862Mk) null, Constants.A12);
            } else if (reelOptionsDialog.A0R.A0h()) {
                reelOptionsDialog.A0G.A04(reelOptionsDialog.A0R, reelOptionsDialog.A0S, (C51862Mk) null, Constants.A12, onDismissListener2);
            }
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.reel_option_dialog_leave_group).equals(charSequence)) {
            A0E(reelOptionsDialog, r17, onDismissListener2);
        } else if (reelOptionsDialog.A0I.getString(C0003R.string.see_why_button_misinformation).equals(charSequence)) {
            r21.A00(reelOptionsDialog.A0R);
        } else {
            AnonymousClass34U r33 = r22;
            if ("[INTERNAL] Pause Playback".equals(charSequence)) {
                ReelViewerFragment.A0m(r33.A00, "user_paused_video");
            } else if ("[INTERNAL] Resume Playback".equals(charSequence)) {
                ReelViewerFragment.A0R(r33.A00);
            } else if (reelOptionsDialog.A0X.equals(charSequence)) {
                C39941no r34 = reelOptionsDialog.A0R;
                if (r34.A0r()) {
                    A0B(reelOptionsDialog);
                } else if (r34.A0n()) {
                    C38031kc r13 = r34.A09;
                    C144126Ej.A04(reelOptionsDialog.A0H, reelOptionsDialog.A0K, reelOptionsDialog.A0L, r13.A0C, r13.A0I, r13.A0P, reelOptionsDialog2.A0P, reelOptionsDialog2.A0U);
                } else {
                    reelOptionsDialog.A03();
                }
            } else if (reelOptionsDialog.A0V.equals(charSequence)) {
                C39941no r35 = reelOptionsDialog.A0R;
                if (r35.A0r()) {
                    A0A(reelOptionsDialog);
                } else if (r35.A0n()) {
                    C38031kc r15 = r35.A09;
                    C144126Ej.A03(reelOptionsDialog.A0H, reelOptionsDialog.A0K, reelOptionsDialog.A0L, r15.A0C, r15.A0I, r15.A0P, reelOptionsDialog2.A0P, reelOptionsDialog2.A0U);
                } else {
                    reelOptionsDialog.A02();
                }
            }
        }
        reelOptionsDialog2.A01 = null;
        if (C144126Ej.A0B(reelOptionsDialog2.A0S, reelOptionsDialog2.A0R, reelOptionsDialog2.A0U)) {
            reelOptionsDialog2.A0V("" + charSequence2);
        }
    }
}
