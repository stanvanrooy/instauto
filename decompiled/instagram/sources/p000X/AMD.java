package p000X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.avatarlike.AvatarLikesView;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.AMD */
public final class AMD {
    public static final int MAX_LIKES_PER_FETCH = 50;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C23442AMp A06;
    public AND A07;
    public C23334AIl A08;
    public String A09;
    public Handler A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final C13300iJ A0G;
    public final C23393AKs A0H;
    public final AK9 A0I;
    public final AMO A0J;
    public final AMG A0K;
    public final int A0L;
    public final C11590fD A0M;
    public final C27341Hl A0N;
    public final AnonymousClass0C1 A0O;
    public final C23446AMt A0P;

    public final void A07(int i, int i2, AM9 am9) {
        int i3;
        int i4;
        C943346a r0;
        if (am9 != null) {
            i3 = am9.A00;
        } else {
            i3 = 0;
        }
        int i5 = this.A01;
        if (i >= i5 && i3 >= (i4 = this.A03)) {
            if (this.A0E) {
                ArrayList arrayList = new ArrayList();
                if (i5 == -1) {
                    this.A01 = i;
                } else {
                    if ((i - i5) - i2 > 0) {
                        arrayList.add(new C943346a(Integer.valueOf(C0003R.color.igds_icon_on_media)));
                    }
                    this.A01 = i + i2;
                }
                if (am9 != null) {
                    if (i4 != -1 && i3 - i4 > 0) {
                        for (AM8 am8 : am9.A02) {
                            C23334AIl aIl = am8.A02;
                            C23334AIl aIl2 = aIl;
                            if (aIl != null && am8.A00 > 0) {
                                arrayList.add(new C943346a(Integer.valueOf(C23335AIm.A00(aIl2))));
                            }
                        }
                    }
                    this.A03 = i3;
                }
                if (arrayList.isEmpty()) {
                    r0 = null;
                } else {
                    r0 = (C943346a) arrayList.get(new Random().nextInt(arrayList.size()));
                }
                if (r0 != null) {
                    this.A0K.A07.A07.A0A(false, r0.A00, (Float) null);
                    AND and = this.A07;
                    if (and != null) {
                        and.BCq();
                    }
                }
            } else if (i5 == -1) {
                this.A01 = i;
            } else {
                if ((i - i5) - i2 > 0) {
                    A0H(false);
                    AND and2 = this.A07;
                    if (and2 != null) {
                        and2.BCq();
                    }
                }
                this.A01 = i + i2;
            }
        }
    }

    public final void A08(int i, List list, AM9 am9) {
        int i2;
        if (am9 != null) {
            i2 = am9.A01;
        } else {
            i2 = 0;
        }
        int i3 = this.A02;
        if (i < i3 && i2 < this.A04) {
            return;
        }
        if (this.A0E) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                if (i3 == -1) {
                    this.A02 = i;
                    this.A00 = i;
                } else {
                    int i4 = i - this.A00;
                    if (i4 > 0) {
                        int min = Math.min(50, list.size());
                        if (!list.isEmpty()) {
                            for (int i5 = 0; i5 < min; i5++) {
                                arrayList.add(new C23431AMe((C227669qs) list.get(i5), Integer.valueOf(C0003R.color.igds_icon_on_media)));
                            }
                        }
                        int min2 = Math.min(50, i4 - min);
                        for (int i6 = 0; i6 < min2; i6++) {
                            arrayList.add(new C23431AMe((C227669qs) null, Integer.valueOf(C0003R.color.igds_icon_on_media)));
                        }
                        this.A00 += i4;
                        AND and = this.A07;
                        if (and != null) {
                            and.BCw(i4);
                        }
                    }
                    this.A02 = i;
                }
            }
            if (am9 == null || this.A04 != -1) {
                int i7 = i2 - this.A05;
                if (i7 > 0) {
                    for (AM8 am8 : am9.A02) {
                        int min3 = Math.min(50, am8.A03.size());
                        if (!am8.A03.isEmpty()) {
                            for (int i8 = 0; i8 < min3; i8++) {
                                if (am8.A02 != null) {
                                    arrayList.add(new C23431AMe((C227669qs) am8.A03.get(i8), Integer.valueOf(C23335AIm.A00(am8.A02))));
                                }
                            }
                        }
                        int min4 = Math.min(50, am8.A01 - min3);
                        for (int i9 = 0; i9 < min4; i9++) {
                            C23334AIl aIl = am8.A02;
                            if (aIl != null) {
                                arrayList.add(new C23431AMe((C227669qs) null, Integer.valueOf(C23335AIm.A00(aIl))));
                            }
                        }
                    }
                    this.A05 += i7;
                    AND and2 = this.A07;
                    if (and2 != null) {
                        and2.BCw(i7);
                    }
                }
                this.A04 = i2;
            } else {
                this.A04 = i2;
                this.A05 = i2;
            }
            Collections.shuffle(arrayList);
            int size = arrayList.size();
            List<C23431AMe> list2 = arrayList;
            if (size > 50) {
                list2 = arrayList.subList(0, 50);
            }
            if (!list2.isEmpty()) {
                AvatarLikesView avatarLikesView = this.A0K.A07.A07;
                AvatarLikesView.A06(avatarLikesView, avatarLikesView.A04);
                AvatarLikesView.A06(avatarLikesView, avatarLikesView.A07);
                for (C23431AMe aMe : list2) {
                    C227669qs r1 = aMe.A00;
                    C227669qs r0 = r1;
                    if (r1 != null) {
                        ANC anc = new ANC(r1.A01, r0.A00);
                        Integer num = aMe.A01;
                        AnonymousClass1GH A0C2 = AnonymousClass12C.A0c.A0C(anc.A01);
                        A0C2.A02(new C23433AMg(avatarLikesView, false, num, anc));
                        A0C2.A01();
                    } else {
                        AvatarLikesView.A07(avatarLikesView, false, (Bitmap) null, false, aMe.A01, (Float) null);
                    }
                }
                avatarLikesView.invalidate();
            }
        } else if (i3 == -1) {
            this.A02 = i;
            this.A00 = i;
        } else {
            int i10 = i - this.A00;
            if (i10 > 0) {
                A09(i10, false, list, (C23334AIl) null);
                AND and3 = this.A07;
                if (and3 != null) {
                    and3.BCw(i10);
                }
            }
            this.A02 = i;
        }
    }

    public static AMD A00(ViewGroup viewGroup, C27341Hl r19, AnonymousClass0C1 r20, C13300iJ r21, AK9 ak9, AnonymousClass3Dj r23, AKU aku, C23444AMr aMr, int i, C23334AIl aIl, boolean z) {
        C27341Hl r10 = r19;
        AnonymousClass3Dj r5 = r23;
        AnonymousClass0C1 r9 = r20;
        C23393AKs aKs = new C23393AKs(r10.getContext(), r10, AnonymousClass1L8.A00(r10), r9, r5, aku);
        AMO amo = new AMO(r9, r5);
        ViewGroup viewGroup2 = viewGroup;
        AMS ams = new AMS(viewGroup2, i, aMr);
        AMQ amq = new AMQ(viewGroup2);
        Context context = viewGroup2.getContext();
        AMN amn = new AMN(C06400Ox.A02(context), ams.A0B, amq.A01, amq.A03);
        AMS ams2 = ams;
        AMQ amq2 = amq;
        AMN amn2 = amn;
        return new AMD(r9, r10, r21, aKs, amo, new C23446AMt(r9, r10, r5), new AMG(ams2, amq2, amn2, new C109084mu(), new C109084mu()), ak9, viewGroup2.getResources().getDimensionPixelSize(C0003R.dimen.face_effect_picker_height), new AN6(), aIl, z);
    }

    private boolean A01() {
        C13300iJ r1 = this.A0G;
        AnonymousClass0C1 r4 = this.A0O;
        if (r1.equals(r4.A06) && ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.LIVE_CHANGE_HEARTS_COLOR_BROADCASTER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return true;
        }
        C13300iJ r12 = this.A0G;
        AnonymousClass0C1 r42 = this.A0O;
        if (r12.equals(r42.A06) || !((Boolean) AnonymousClass0L6.A02(r42, AnonymousClass0L7.LIVE_CHANGE_HEARTS_COLOR_VIEWER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final void A02() {
        C23393AKs aKs = this.A0H;
        aKs.A01 = null;
        aKs.A00 = null;
        AMG amg = this.A0K;
        amg.A02 = null;
        amg.A03 = null;
        View view = amg.A05.A03;
        View view2 = view;
        if (view != null) {
            view2.setOnTouchListener((View.OnTouchListener) null);
        }
        View view3 = amg.A05.A0C;
        View view4 = view3;
        if (view3 != null) {
            view4.setOnTouchListener((View.OnTouchListener) null);
        }
        View view5 = amg.A05.A06;
        View view6 = view5;
        if (view5 != null) {
            view6.setOnTouchListener((View.OnTouchListener) null);
        }
        View view7 = amg.A05.A07;
        View view8 = view7;
        if (view7 != null) {
            view8.setOnTouchListener((View.OnTouchListener) null);
        }
        View view9 = amg.A05.A04;
        View view10 = view9;
        if (view9 != null) {
            view10.setOnTouchListener((View.OnTouchListener) null);
        }
        View view11 = amg.A05.A01;
        View view12 = view11;
        if (view11 != null) {
            view12.setOnTouchListener((View.OnTouchListener) null);
        }
        View view13 = amg.A05.A02;
        View view14 = view13;
        if (view13 != null) {
            view14.setOnTouchListener((View.OnTouchListener) null);
        }
        View view15 = amg.A05.A00;
        View view16 = view15;
        if (view15 != null) {
            view16.setOnTouchListener((View.OnTouchListener) null);
        }
        View view17 = amg.A05.A05;
        View view18 = view17;
        if (view17 != null) {
            view18.setOnTouchListener((View.OnTouchListener) null);
        }
        AMG amg2 = this.A0K;
        EditText editText = amg2.A07.A06;
        editText.removeTextChangedListener(amg2.A01);
        editText.setOnKeyListener((View.OnKeyListener) null);
        editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        editText.setOnClickListener((View.OnClickListener) null);
        editText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        AMG amg3 = this.A0K;
        Animator animator = amg3.A00;
        if (animator != null) {
            animator.removeAllListeners();
            amg3.A00.cancel();
        }
        AMQ amq = amg3.A07;
        amq.A06.setText("");
        amq.A06.setOnKeyListener((View.OnKeyListener) null);
        amq.A06.setHint(C0003R.string.comment);
        amq.A06.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        amq.A06.setOnClickListener((View.OnClickListener) null);
        amq.A06.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        amq.A02.setOnTouchListener((View.OnTouchListener) null);
        amq.A07.A08();
        this.A0P.A00 = null;
        this.A06 = null;
        this.A0D = true;
        this.A0I.A0H();
    }

    public final void A03() {
        C06220Of.A0E(this.A0K.A07.A06);
    }

    public final void A04() {
        AMG amg = this.A0K;
        AMS ams = amg.A05;
        View view = ams.A00;
        if (view == null) {
            View findViewById = ams.A0B.findViewById(C0003R.C0005id.camera_ar_effect_button);
            ams.A00 = findViewById;
            findViewById.setVisibility(0);
            view = amg.A05.A00;
            AMG.A01(amg, view);
        }
        view.setVisibility(0);
    }

    public final void A05() {
        AMC amc = this.A0H.A03;
        if (amc.A05) {
            amc.A05 = false;
            AnonymousClass0ZA.A07(amc.A02, (Object) null);
            amc.A02 = null;
        }
        this.A0I.A0I();
        AMO amo = this.A0J;
        if (amo.A01 != null) {
            ((C23300zv) amo.A04.getValue()).A03(AN5.class, amo.A02);
            ((ANJ) amo.A06.getValue()).A00 = null;
            ((ANJ) amo.A06.getValue()).A00();
            ((RealtimeClientManager) amo.A05.getValue()).graphqlUnsubscribeCommand(amo.A01);
            amo.A01 = null;
        }
        this.A0K.A07.A06.setEnabled(false);
        C173777bc.A02 = null;
        Handler handler = this.A0A;
        if (handler != null) {
            AnonymousClass0ZA.A07(handler, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1 == false) goto L_0x0029;
     */
    public final void A06(int i) {
        boolean z;
        int i2;
        if (!this.A0D) {
            boolean z2 = this.A0F;
            boolean z3 = false;
            if (i > ((Integer) this.A0M.get()).intValue()) {
                z3 = true;
            }
            this.A0F = z3;
            AMG amg = this.A0K;
            amg.A04 = z3;
            View view = amg.A05.A00;
            if (view != null) {
                boolean isActivated = view.isActivated();
                z = true;
            }
            z = false;
            if (!z || this.A0F) {
                i2 = i;
            } else {
                i2 = this.A0L;
            }
            if (z2 != this.A0F) {
                AMG amg2 = this.A0K;
                float f = (float) (-i2);
                if (amg2.A07.A04.getHeight() > 0) {
                    amg2.A07.A04.setTranslationY(f);
                    amg2.A07.A00.setTranslationY(f);
                    amg2.A07.A02.setTranslationY(f);
                }
                EditText editText = this.A0K.A07.A06;
                editText.setSelection(editText.getText().length());
                if (!this.A0F) {
                    EditText editText2 = this.A0K.A07.A06;
                    String trim = editText2.getText().toString().trim();
                    editText2.clearFocus();
                    editText2.setText(trim);
                    if (!AnonymousClass0PB.A06()) {
                        AnonymousClass1X4.A04(this.A0N.getActivity().getWindow(), this.A0K.A07.A05, false);
                    }
                    this.A0K.A07.A00();
                    return;
                }
                AMQ amq = this.A0K.A07;
                Context context = amq.A05.getContext();
                int A082 = C06220Of.A08(context);
                if (i > (C06220Of.A06(context) >> 1)) {
                    int i3 = A082 - i;
                    ViewGroup.LayoutParams layoutParams = amq.A04.getLayoutParams();
                    if (layoutParams.height != i3) {
                        layoutParams.height = i3;
                        amq.A04.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public final void A09(int i, boolean z, List list, C23334AIl aIl) {
        Float valueOf;
        if (list != null && list.size() > 50) {
            list = list.subList(0, 50);
        }
        Integer num = null;
        if (A01() || this.A0E) {
            num = Integer.valueOf(C0003R.color.igds_icon_on_media);
            valueOf = Float.valueOf(0.4f);
        } else {
            valueOf = null;
        }
        if (aIl != null) {
            num = Integer.valueOf(C23335AIm.A00(aIl));
        }
        this.A0K.A07.A07.A09(Math.min(i, 50), createAvatarLikes(list), z, num, valueOf);
        if (aIl == null) {
            this.A00 += i;
        } else {
            this.A05 += i;
        }
    }

    public final void A0B(String str, String str2) {
        C23446AMt aMt = this.A0P;
        editInstagramCommentData commentEditData = this.A0K.A01;
        long elapsedRealtime = SystemClock.elapsedRealtime() - commentEditData.elapsedTime;
        commentEditData.elapsedTime = 0;
        int numOfDeletes = commentEditData.numOfDeletes;
        commentEditData.numOfDeletes = 0;
        C23334AIl aIl = this.A08;
        C13300iJ r2 = aMt.A02.A06;
        AKS aks = new AKS();
        aks.commentText = str;
        aks.A0D = r2;
        aks.postTime = System.currentTimeMillis() / 1000;
        aks.elapsedRealTime = elapsedRealtime;
        aks.numOfDeletes = numOfDeletes;
        aks.A00 = aIl;
        aks.A0I = Constants.A0C;
        AMD amd = aMt.A00;
        if (amd != null) {
            AK9 ak9 = amd.A0I;
            ak9.A07.A02(aks);
            ak9.A05.A0g(0);
        }
        AnonymousClass0C1 r1 = aMt.A02;
        long AFH = aMt.A03.AFH();
        C15890nh r3 = new C15890nh(r1);
        r3.A09 = Constants.ONE;
        r3.A0C = C06360Ot.formatString("live/%s/comment/", str2);
        r3.A06(C23415ALo.class, true);
        r3.A09(AnonymousClass0C5.$const$string(79), aks.commentText);
        r3.A09("offset_to_video_start", Long.toString(AFH / 1000));
        r3.A09(AnonymousClass0C5.$const$string(243), aks.getUUID());
        r3.A09("user_breadcrumb", UserBreadcrumb.createUserBreadcrumb(aks.commentText.length(), aks.elapsedRealTime, aks.numOfDeletes));
        r3.A09("live_or_vod", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        r3.A0G = true;
        C17850qu A032 = r3.A03();
        C27341Hl r22 = aMt.A01;
        A032.A00 = new C23414ALn(aks, new C23417ALq(aMt));
        C28351Lj.A00(r22.getContext(), AnonymousClass1L8.A00(r22), A032);
        this.A07.BH3(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
    }

    public final void A0C(String str, String str2, int i, boolean z) {
        String str3 = this.A0B;
        if (str3 == null || AnonymousClass17M.A00(str3, str)) {
            this.A0A = new Handler(Looper.getMainLooper());
            this.A0K.A07.A06.setEnabled(true);
            if (this.A0B == null) {
                this.A0B = str;
                this.A09 = str2;
                AMG amg = this.A0K;
                EditText editText = amg.A07.A06;
                editText.setFocusableInTouchMode(true);
                editText.setFocusable(true);
                editText.clearFocus();
                editText.setOnFocusChangeListener(new AMM(amg));
                editText.setOnEditorActionListener(new C23440AMn(amg));
                editText.setOnClickListener(new C23436AMj(amg, editText));
                View view = amg.A07.A02;
                view.setOnTouchListener(new C23448AMv(amg, new GestureDetector(view.getContext(), new C23432AMf(amg))));
                AMG.A01(amg, amg.A05.A02);
                AMG.A01(amg, amg.A05.A07);
                AMG.A01(amg, amg.A05.A01);
                AMG.A01(amg, amg.A05.A04);
                AMG.A01(amg, amg.A05.A06);
                AMG.A01(amg, amg.A05.A0C);
                AMG.A01(amg, amg.A05.A00);
                AMG.A01(amg, amg.A05.A05);
                AMG.A01(amg, amg.A05.A08);
                View view2 = amg.A05.A03;
                if (view2 != null) {
                    C35651gi r0 = new C35651gi(view2);
                    r0.A05 = amg;
                    view2.setOnTouchListener(new C23445AMs(amg, r0.A00()));
                }
                View view3 = amg.A05.A00;
                if (!(amg.A03 == null || view3 == null || view3.getVisibility() != 0)) {
                    amg.A03.A03();
                }
            }
            this.A02 = -1;
            this.A01 = -1;
            this.A04 = -1;
            this.A03 = -1;
            C23393AKs aKs = this.A0H;
            String str4 = this.A0B;
            AMC amc = aKs.A03;
            if (!amc.A05) {
                amc.A05 = true;
                amc.A02 = new Handler(Looper.getMainLooper());
                amc.A04 = str4;
                amc.A00 = i;
                amc.A01();
                if (z) {
                    AnonymousClass0ZA.A09(amc.A02, new ANB(amc), 3000, 1571825317);
                } else {
                    AMC.A00(amc);
                }
            }
            this.A0I.A0L(this.A0B, str2);
            AMO amo = this.A0J;
            String str5 = this.A0B;
            C13150hy.A02(str5, "broadcastId");
            if (amo.A01 == null) {
                amo.A01 = AnonymousClass10M.A06(RealtimeSubscription.getLivePinnedProductSubscription(str5));
                ((RealtimeClientManager) amo.A05.getValue()).graphqlSubscribeCommand(amo.A01);
                ((ANJ) amo.A06.getValue()).A00 = amo.A03;
                ((C23300zv) amo.A04.getValue()).A02(AN5.class, amo.A02);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("IgLiveReactionsPresenter started with different broadcastId");
    }

    public final void A0D(boolean z) {
        if (this.A0C != z) {
            this.A0C = z;
            boolean z2 = !z;
            int i = C0003R.string.comment;
            if (z) {
                i = C0003R.string.comments_disabled;
            }
            EditText editText = this.A0K.A07.A06;
            editText.setText("");
            editText.setFocusable(z2);
            editText.setFocusableInTouchMode(z2);
            editText.setHint(i);
            editText.clearFocus();
            AK9 ak9 = this.A0I;
            boolean z3 = this.A0C;
            if (ak9.A0B != z3) {
                ak9.A0B = z3;
                if (z3) {
                    C476624x.A08(true, ak9.A05);
                    if (ak9.A08 != null) {
                        ak9.A0G().setVisibility(8);
                    }
                } else {
                    C476624x.A09(true, ak9.A05);
                    if (ak9.A08 != null) {
                        ak9.A0G().setVisibility(0);
                    }
                }
            }
            A03();
        }
    }

    public final void A0E(boolean z) {
        AMS ams = this.A0K.A05;
        TextView textView = ams.A09;
        if (textView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
        } else if (z) {
            TextView textView2 = (TextView) ams.A0B.findViewById(C0003R.C0005id.new_requests_to_join_badge);
            ams.A09 = textView2;
            textView2.setVisibility(0);
        }
    }

    public final void A0F(boolean z) {
        AMS ams = this.A0K.A05;
        TextView textView = ams.A0A;
        if (textView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
        } else if (z) {
            TextView textView2 = (TextView) ams.A0B.findViewById(C0003R.C0005id.qa_mode_button_unread_count_badge);
            ams.A0A = textView2;
            textView2.setVisibility(0);
        }
    }

    public final void A0G(boolean z) {
        View view = this.A0K.A05.A05;
        if (view != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public final void A0J(boolean z, boolean z2) {
        ViewGroup viewGroup = this.A0K.A07.A05;
        if (!z2) {
            int i = 8;
            if (z) {
                i = 0;
            }
            viewGroup.setVisibility(i);
        }
        if (z) {
            C476624x.A09(true, viewGroup);
            return;
        }
        C476624x.A08(true, viewGroup);
    }

    public final boolean A0K() {
        if (this.A0F) {
            A03();
            return true;
        }
        AK9 ak9 = this.A0I;
        if (ak9.A0F()) {
            return C23358AJj.A03(ak9);
        }
        return false;
    }

    public final boolean A0L() {
        if (this.A0F) {
            return false;
        }
        AMG amg = this.A0K;
        amg.A07.A06.requestFocus();
        C06220Of.A0G(amg.A07.A06);
        return true;
    }

    public final boolean A0M() {
        if (this.A0F) {
            return true;
        }
        AK9 ak9 = this.A0I;
        if (ak9.A0F()) {
            return C23358AJj.A03(ak9);
        }
        return false;
    }

    public List createAvatarLikes(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C227669qs r0 = (C227669qs) it.next();
            arrayList.add(new ANC(r0.A01, r0.A00));
        }
        return arrayList;
    }

    public AMD(AnonymousClass0C1 r4, C27341Hl r5, C13300iJ r6, C23393AKs aKs, AMO amo, C23446AMt aMt, AMG amg, AK9 ak9, int i, C11590fD r13, C23334AIl aIl, boolean z) {
        this.A0O = r4;
        this.A0N = r5;
        this.A0G = r6;
        this.A0I = ak9;
        this.A0H = aKs;
        this.A0J = amo;
        this.A0K = amg;
        this.A0P = aMt;
        this.A0L = i;
        this.A0M = r13;
        this.A08 = aIl;
        this.A0E = z;
        aKs.A01 = this;
        amg.A02 = this;
        aMt.A00 = this;
        View view = amg.A05.A0C;
        view.setEnabled(false);
        view.setAlpha(0.4f);
        AMG amg2 = this.A0K;
        EditText editText = amg2.A07.A06;
        AMU amu = new AMU(amg2, editText);
        amg2.A01 = amu;
        editText.addTextChangedListener(amu);
        editText.setOnKeyListener(new C23443AMq(amg2));
        this.A0P.A00 = this;
    }

    public final void A0A(String str) {
        if (!str.isEmpty()) {
            A0B(str, this.A0B);
            this.A0K.A07.A06.setText("");
            A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.A0E != false) goto L_0x000c;
     */
    public final void A0H(boolean z) {
        Float f;
        Integer num = null;
        if (!A01()) {
            f = null;
        }
        num = Integer.valueOf(C0003R.color.igds_icon_on_media);
        f = Float.valueOf(0.4f);
        C23334AIl aIl = this.A08;
        if (aIl != null) {
            num = Integer.valueOf(C23335AIm.A00(aIl));
        }
        this.A0K.A07.A07.A0A(z, num, f);
    }

    public final void A0I(boolean z) {
        int i = C0003R.string.switch_front_camera;
        if (z) {
            i = C0003R.string.switch_back_camera;
        }
        View view = this.A0K.A05.A01;
        if (view != null) {
            view.setContentDescription(view.getContext().getString(i));
        }
    }
}
