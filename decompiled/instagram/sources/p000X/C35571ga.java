package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.1ga  reason: invalid class name and case insensitive filesystem */
public final class C35571ga {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.5Rf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.1tq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.1hJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.2Ks} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.1gb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.5Rf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.5Rf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.5Rf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.5Rf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.5Rf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.5Rf} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static AnonymousClass1ZK A00(ViewGroup viewGroup, AnonymousClass0C1 r5, int i, boolean z, AnonymousClass1Q5 r8, AnonymousClass252 r9) {
        C123535Rf r2;
        View view;
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.reel_item_replay_unit, viewGroup, false);
            C123535Rf r22 = new C123535Rf(inflate, z);
            inflate.setTag(r22);
            r2 = r22;
            if (r9 != null) {
                AnonymousClass252.A06(r9, r22.ATs());
                AnonymousClass252.A05(r9, r22.A01.A04);
                C06220Of.A0L(r22.A01.A02.A04, r9.A09);
                return r22;
            }
        } else if (i == 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.reel_item_livewith_unit, viewGroup, false);
            C43111tq r23 = new C43111tq(inflate2, z);
            inflate2.setTag(r23);
            r2 = r23;
            if (r9 != null) {
                AnonymousClass252.A01(r9, r23.A00);
                AnonymousClass252.A00(r9, r23.A00);
                AnonymousClass252.A05(r9, r23.A01.A04);
                C06220Of.A0L(r23.A01.A02.A04, r9.A09);
                return r23;
            }
        } else if (i == 3 || i == 5) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            if (r8 != null) {
                view = (View) r8.A02.poll();
            } else {
                view = null;
            }
            boolean z2 = false;
            if (view == null) {
                view = from.inflate(C0003R.layout.reel_item_with_background, viewGroup, false);
            } else {
                z2 = true;
            }
            C35861h3.A00(view, context);
            C36021hJ r24 = new C36021hJ(view, z2);
            view.setTag(r24);
            r2 = r24;
            if (r9 != null) {
                AnonymousClass252.A04(r9, r24.A0E);
                AnonymousClass252.A05(r9, r24.A0F);
                C06220Of.A0L(r24.A0G.A04, r9.A09);
                return r24;
            }
        } else if (i != 7) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.reel_item_story_unit, viewGroup, false);
            C35581gb r25 = new C35581gb(inflate3, z);
            inflate3.setTag(r25);
            r2 = r25;
            if (r9 != null) {
                AnonymousClass252.A04(r9, r25.A00);
                AnonymousClass252.A05(r9, r25.A01.A04);
                C06220Of.A0L(r25.A01.A02.A04, r9.A09);
                r2 = r25;
            }
        } else {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.reel_item_group_story_unit, viewGroup, false);
            C51452Ks r26 = new C51452Ks(inflate4, z);
            inflate4.setTag(r26);
            r2 = r26;
            if (r9 != null) {
                AnonymousClass252.A07(r9, r26.A02.A02);
                AnonymousClass252.A05(r9, r26.A03.A04);
                C06220Of.A0L(r26.A03.A02.A04, r9.A09);
                return r26;
            }
        }
        return r2;
    }

    public static void A01(Context context, AnonymousClass0C1 r15, AnonymousClass1ZK r16, C31581Yw r17, int i, int i2, C31581Yw r20, AnonymousClass1OX r21, List list, AnonymousClass0RN r23, AnonymousClass1LO r24, String str, Integer num, AnonymousClass252 r27, AnonymousClass1I2 r28) {
        int i3;
        int i4 = i2;
        int i5 = i;
        C31581Yw r7 = r17;
        Context context2 = context;
        AnonymousClass0C1 r5 = r15;
        C31581Yw r9 = r20;
        AnonymousClass1OX r10 = r21;
        List list2 = list;
        AnonymousClass0RN r152 = r23;
        AnonymousClass1ZK r6 = r16;
        AnonymousClass252 r1 = r27;
        if (i == 0) {
            C35581gb r62 = (C35581gb) r6;
            C35771gu.A00(context, r5, r62, r7, i4, r9, r10, list2, r152, false, false, r28);
            if (r1 != null) {
                AnonymousClass252.A03(r1, r62.A00);
            }
        } else if (i5 == 1) {
            C123535Rf r63 = (C123535Rf) r6;
            C35781gv.A00(context, r5, r63.A01, r7, i4, r21, list, false);
            C35761gt r3 = r63.A00;
            C35841h1.A00(r3);
            r3.A04 = new C35851h2(r5, r7);
            C35841h1.A03(r5, r3, r7, r9, false);
            Reel reel = r7.A04;
            if (reel.A0x && reel.A0l(r5)) {
                r3.A0F.setVisibility(4);
            } else if (r7.A04.A0U() || r7.A03() || r7.A02() || r7.A01()) {
                if (r3.A01 == null) {
                    r3.A01 = r3.A09.inflate();
                }
                r3.A01.setVisibility(0);
                r3.A0F.A05();
            }
            View findViewById = r3.A0D.findViewById(C0003R.C0005id.profile_image_container);
            AnonymousClass11J.A00(findViewById);
            if (r3.A04.A04) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
            }
            C35841h1.A01(r3, r7);
            C35841h1.A02(r3, r7, r5, i4, r152);
            if (r27 != null) {
                AnonymousClass252.A02(r1, r63.A00);
            }
        } else if (i5 != 2) {
            Integer num2 = num;
            String str2 = str;
            if (i5 == 3) {
                C36021hJ r64 = (C36021hJ) r6;
                if (r20 != null && r9.A04.A0Z()) {
                    r9.A01 = r64.A01().getCurrentSpinnerProgressState();
                }
                C59252hH.A00(context2, r5, r64, r7, i4, r9, r10, r24, list2, str2, num2, r152);
                if (r27 != null) {
                    boolean A0Z = r7.A04.A0Z();
                    boolean A04 = r7.A04();
                    AnonymousClass252.A03(r1, r64.A0E);
                    if (A0Z && !r64.A06) {
                        AnonymousClass252.A07(r1, r64.A01());
                        r64.A06 = true;
                    } else if (A04 && !r64.A05) {
                        AnonymousClass252.A00(r1, r64.A00());
                        AnonymousClass252.A01(r1, r64.A00());
                        r64.A05 = true;
                    }
                }
            } else if (i5 == 5) {
                C59252hH.A00(context2, r5, (C36021hJ) r6, r7, i4, r9, r10, (AnonymousClass1LO) null, list2, str2, num2, r152);
            } else if (i5 == 7) {
                C51452Ks r65 = (C51452Ks) r6;
                if (r20 != null) {
                    r9.A01 = r65.A02.A02.getCurrentSpinnerProgressState();
                }
                C35781gv.A00(context2, r5, r65.A03, r7, i4, r10, list2, false);
                AnonymousClass421 r32 = r65.A02;
                C35841h1.A04(r5, r32.A02, r7);
                if (r7.A03() || r7.A04.A0U() || r7.A06(r5)) {
                    r32.A01.A02(0);
                    r32.A02.A03();
                } else {
                    r32.A01.A02(8);
                }
                if (r27 != null && r65.A02.A01.A00() != 8) {
                    View A01 = r65.A02.A01.A01();
                    Integer num3 = r1.A0M;
                    if (num3 == Constants.ZERO) {
                        i3 = r1.A07;
                    } else if (num3 == Constants.A0C) {
                        i3 = r1.A08;
                    } else {
                        return;
                    }
                    C06220Of.A0V(A01, i3, i3);
                }
            }
        } else {
            C43111tq r66 = (C43111tq) r6;
            C35781gv.A00(context2, r5, r66.A01, r7, i4, r10, list2, false);
            C43151tu.A00(r5, r66.A00, r7);
        }
    }
}
