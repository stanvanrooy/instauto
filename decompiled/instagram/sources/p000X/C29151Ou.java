package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.1Ou  reason: invalid class name and case insensitive filesystem */
public final class C29151Ou extends C29121Or {
    public static final int A0a = Constants.ZERO(27).length;
    public AnonymousClass1VW A00;
    public C30811Vh A01;
    public C30751Vb A02;
    public AnonymousClass1VK A03;
    public AnonymousClass1VP A04;
    public AnonymousClass1VO A05;
    public C30771Vd A06;
    public AnonymousClass1VN A07;
    public C30741Va A08;
    public AnonymousClass1VV A09;
    public AnonymousClass1VS A0A;
    public AnonymousClass1VQ A0B;
    public AnonymousClass1VT A0C;
    public C56962dL A0D;
    public AnonymousClass1VJ A0E;
    public C30761Vc A0F;
    public AnonymousClass1VL A0G;
    public AnonymousClass1VI A0H;
    public AnonymousClass1RJ A0I;
    public C30261Td A0J;
    public AnonymousClass1OP A0K;
    public final Context A0L;
    public final C29001Of A0M;
    public final C27371Ho A0N;
    public final C29181Ox A0O;
    public final C27411Hs A0P;
    public final AnonymousClass0C1 A0Q;
    public final AnonymousClass1I6 A0R;
    public final AnonymousClass1LO A0S;
    public final AnonymousClass1PD A0T = new AnonymousClass1PC();
    public final AnonymousClass1I2 A0U;
    public final C26611Ee A0V;
    public final C26671El A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public final boolean AfG(int i, Object obj, Object obj2) {
        return true;
    }

    private void A01(View view, int i, Object obj, Object obj2) {
        String str;
        String str2;
        C120495Ev r5;
        String str3;
        C120495Ev r52;
        C31561Yu r11;
        List list;
        int A032 = AnonymousClass0Z0.A03(-1550144736);
        try {
            int i2 = i;
            Integer num = Constants.ZERO(27)[i];
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01(AnonymousClass000.A0E("bindView: ", C49002Ai.A00(num)), 1481387576);
            }
            View view2 = view;
            Object obj3 = obj;
            Object obj4 = obj3;
            AnonymousClass0C1 r6 = this.A0Q;
            Object obj5 = obj2;
            if (obj3 instanceof AnonymousClass1NJ) {
                C32991cC A002 = C32991cC.A00(r6);
                AnonymousClass1NJ r12 = (AnonymousClass1NJ) obj4;
                switch (num.intValue()) {
                    case 1:
                    case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                        if (obj5 instanceof C36841ih) {
                            A002.A04(view2, new C38231kw(r12, this.A0Q, this.A0N, new C39021mE(r12, this.A0L, (C36841ih) obj5)));
                            break;
                        }
                        break;
                    case 3:
                    case 16:
                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                        A002.A04(view2, new C38231kw(r12, this.A0Q, this.A0N, (C39031mF) null));
                        break;
                    default:
                        A002.A02.A00.remove(view2);
                        break;
                }
            }
            boolean z = true;
            switch (num.intValue()) {
                case 0:
                    view2.setTag(new C36391hy());
                    break;
                case 1:
                    this.A00.A04((C36401hz) view2.getTag(), (AnonymousClass1NJ) obj3, (C36841ih) obj5);
                    break;
                case 2:
                    C36841ih r7 = (C36841ih) obj5;
                    C36841ih r122 = r7;
                    C32541bR r10 = (C32541bR) view2.getTag();
                    this.A09.A00(r10, AnonymousClass1NG.A02(obj3), r122, r7.getPosition(), this.A0N, this.A0S);
                    break;
                case 3:
                    AnonymousClass1NJ A022 = AnonymousClass1NG.A02(obj3);
                    AnonymousClass0a4.A06(A022);
                    AnonymousClass1VJ r15 = this.A0E;
                    C31801Zz r72 = (C31801Zz) view2.getTag();
                    C36841ih r14 = (C36841ih) obj5;
                    int position = r14.getPosition();
                    boolean z2 = A022.A3W;
                    AnonymousClass0C1 r62 = this.A0Q;
                    C27371Ho r9 = this.A0N;
                    C38261kz r27 = C38261kz.HIDDEN;
                    C27411Hs r102 = this.A0P;
                    if (r102 != null) {
                        r11 = r102.AWq(A022.A0c(r62).getId());
                    } else {
                        r11 = null;
                    }
                    if (r11 == null) {
                        list = Collections.emptyList();
                    } else {
                        list = new ArrayList(r11.A01.size());
                        for (AnonymousClass2KB r103 : r11.A01) {
                            list.add(new AnonymousClass2KC(r103.A04, r103.A06));
                        }
                    }
                    AnonymousClass0a4.A09(true);
                    AnonymousClass1NJ r20 = A022;
                    C36841ih r21 = r14;
                    AnonymousClass1VJ r18 = r15;
                    C31801Zz r19 = r72;
                    r18.A05(r19, r20, r21, position, z2, (String) null, r62, r9, r27, new C31571Yv((String) null, list, 0, 0, 0), this.A0U);
                    break;
                case 4:
                    AnonymousClass1VL r123 = this.A0G;
                    AnonymousClass1NJ A023 = AnonymousClass1NG.A02(obj3);
                    C36841ih r92 = (C36841ih) obj5;
                    int position2 = r92.getPosition();
                    C32141af Aa7 = this.A0I.Aa7(r92.getPosition(), AnonymousClass1NG.A02(obj3));
                    AnonymousClass1PD r8 = this.A0T;
                    C36841ih r22 = r92;
                    C32151ag r192 = (C32151ag) view2.getTag();
                    AnonymousClass1VL r182 = r123;
                    r182.A03(r192, A023, position2, r22, Aa7, r8, this.A0N, this.A0I.AaD(AnonymousClass1NG.A02(obj3)), C36451i4.A09(AnonymousClass1NG.A02(obj3), this.A0Y, this.A0Z));
                    this.A0I.A0E((C32161ah) view2.getTag(), AnonymousClass1NG.A02(obj3));
                    break;
                case 5:
                    this.A05.A01(AnonymousClass1NG.A02(obj3), (C36841ih) obj5, (C32401bA) view2.getTag(), false);
                    break;
                case 6:
                    this.A08.A01((C57912ez) view2.getTag(), AnonymousClass1NG.A02(obj3));
                    break;
                case 7:
                    AnonymousClass1VN r104 = this.A07;
                    C26611Ee r93 = this.A0V;
                    C26671El r82 = this.A0W;
                    C36841ih r73 = (C36841ih) obj5;
                    C36841ih r222 = r73;
                    C26611Ee r193 = r93;
                    C26671El r202 = r82;
                    AnonymousClass1VN r183 = r104;
                    r183.A01(r193, r202, AnonymousClass1NG.A02(obj3), r222, r73.getPosition(), (C32351b1) view2.getTag(), this.A0N.getModuleName());
                    break;
                case 8:
                    AnonymousClass2f0.A00((AnonymousClass2ZR) view2.getTag(), (AnonymousClass1NJ) obj3, (C36841ih) obj5, this.A0N, this.A0J, this.A0Q);
                    break;
                case 9:
                case 10:
                    this.A0H.A07(this.A0Q, view2, AnonymousClass1NG.A02(obj3), obj5);
                    break;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    AnonymousClass1NJ r124 = (AnonymousClass1NJ) obj3;
                    AnonymousClass1NJ A0O2 = r124.A0O();
                    C30751Vb r112 = this.A02;
                    C36841ih r83 = (C36841ih) obj5;
                    int position3 = r83.getPosition();
                    C32141af Aa72 = this.A0I.Aa7(r83.getPosition(), A0O2);
                    AnonymousClass1PD r74 = this.A0T;
                    C36841ih r212 = r83;
                    C36411i0 r194 = (C36411i0) view2.getTag();
                    AnonymousClass1NJ r203 = r124;
                    C30751Vb r184 = r112;
                    r184.A02(r194, r203, r212, position3, Aa72, r74, this.A0N, this.A0I.AaD(A0O2));
                    this.A0I.A0E((C32161ah) view2.getTag(), A0O2);
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    C30761Vc r94 = this.A0F;
                    C57372e5 r113 = (C57372e5) view2.getTag();
                    AnonymousClass1NJ r84 = (AnonymousClass1NJ) obj3;
                    TextView textView = r113.A04;
                    C57922f1 r53 = r84.A0X;
                    if (r53 != null) {
                        str = r53.A02;
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                    C57922f1 r54 = r84.A0X;
                    if (r54 != null) {
                        str2 = r54.A01;
                    } else {
                        str2 = null;
                    }
                    String str4 = str2;
                    int i3 = 0;
                    if (str2 != null) {
                        r113.A03.setText(str4);
                        r113.A03.setVisibility(0);
                    } else {
                        r113.A03.setVisibility(8);
                    }
                    C57922f1 r55 = r84.A0X;
                    if (r55 != null) {
                        r5 = r55.A00;
                    } else {
                        r5 = null;
                    }
                    if (r5 != null) {
                        r113.A02.setVisibility(0);
                        C57922f1 r56 = r84.A0X;
                        if (r56 != null) {
                            r52 = r56.A00;
                        } else {
                            r52 = null;
                        }
                        switch (r52.ordinal()) {
                            case 0:
                                r113.A02.setImageResource(C0003R.C0004drawable.info);
                                r113.A02.setColorFilter(C019000b.A00(r94.A00, C0003R.color.igds_secondary_icon));
                                break;
                            case 1:
                                r113.A02.setImageResource(C0003R.C0004drawable.instagram_report_outline_24);
                                r113.A02.setColorFilter(C019000b.A00(r94.A00, C0003R.color.igds_error_or_destructive));
                                break;
                            default:
                                r113.A02.setVisibility(8);
                                break;
                        }
                    } else {
                        r113.A02.setVisibility(8);
                    }
                    ImageView imageView = r113.A01;
                    C57922f1 r57 = r84.A0X;
                    if (r57 != null) {
                        str3 = r57.A03;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        i3 = 8;
                    }
                    imageView.setVisibility(i3);
                    r113.A00.setOnClickListener(new C57932f2(r94, r84));
                    break;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    C36841ih r63 = (C36841ih) obj5;
                    AnonymousClass1VP r75 = this.A04;
                    C32441bF r85 = (C32441bF) view2.getTag();
                    AnonymousClass1NJ A024 = AnonymousClass1NG.A02(obj3);
                    boolean z3 = false;
                    if (!C17050pb.A0A(A024, r63.A0E)) {
                        z3 = true;
                    }
                    r75.A00(r85, A024, r63, z3, r63.A0p);
                    break;
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    C06220Of.A0K(view2, C37191jG.A00(AnonymousClass1NG.A02(obj3), this.A0L.getResources()));
                    break;
                case 15:
                    AnonymousClass1VQ r114 = this.A0B;
                    C32561bT r105 = (C32561bT) view2.getTag();
                    AnonymousClass1NJ A025 = AnonymousClass1NG.A02(obj3);
                    C36841ih r86 = (C36841ih) obj5;
                    C36841ih r64 = r105.A06;
                    if (r64 != null) {
                        r64.A0F((C32571bU) null);
                    }
                    r105.A05 = A025;
                    r105.A06 = r86;
                    r86.A0F(r105);
                    if (r105.A0B.getLayoutParams() != null) {
                        C06220Of.A0K(r105.A0B, -2);
                    }
                    if (A025.A3L) {
                        r86.A14 = false;
                    }
                    if (!r86.A14) {
                        ViewGroup viewGroup = r105.A04;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(8);
                            break;
                        }
                    } else {
                        if (r105.A04 == null) {
                            r105.A0C.inflate();
                            r105.A00();
                        }
                        r105.A04.setOnClickListener(new AnonymousClass2FQ(r114, A025, r86));
                        r105.A04.setVisibility(0);
                        AnonymousClass1VU r76 = r114.A00;
                        if (r76 == null) {
                            AnonymousClass0QD.A01("FeedInlineComposerButtonViewBinder", "FeedEmojiPickerController failed to initialize");
                            r105.A0D.A00();
                            break;
                        } else {
                            r76.A00(r105.A0D, new AnonymousClass2FR(r114, A025, r86));
                            break;
                        }
                    }
                    break;
                case 16:
                    AnonymousClass2XB r125 = (AnonymousClass2XB) view2.getTag();
                    AnonymousClass1NJ r115 = (AnonymousClass1NJ) obj3;
                    C36841ih r106 = (C36841ih) obj5;
                    C29181Ox r95 = this.A0O;
                    C27371Ho r87 = this.A0N;
                    AnonymousClass0C1 r77 = this.A0Q;
                    C36841ih r65 = r125.A02;
                    if (r65 != null) {
                        r65.A0C(r125, true);
                    }
                    AnonymousClass2XC.A00(r125, r115, r106.AHt(), r95, r87, r77);
                    r125.A01 = r115;
                    r125.A02 = r106;
                    r125.A03 = r77;
                    r125.A00 = r87;
                    r106.A0B(r125, true);
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    C37131jA r96 = (C37131jA) obj5;
                    r96.A00 = C37071j4.A00(AnonymousClass1NG.A02(obj3), r96.A02, true);
                    this.A0A.A02((C32421bD) view2.getTag(), (AnonymousClass1NJ) obj3, r96, this.A0N);
                    break;
                case 18:
                    this.A0C.A00((C32431bE) view2.getTag(), AnonymousClass1NG.A02(obj3), (C36841ih) obj5);
                    break;
                case 19:
                    C36841ih r66 = (C36841ih) obj5;
                    this.A01.A00((AnonymousClass2XA) view2.getTag(), (AnonymousClass1NJ) obj3, r66, r66.getPosition());
                    break;
                case 20:
                    C36841ih r97 = (C36841ih) obj5;
                    C49012Aj A033 = r97.A03();
                    int position4 = r97.getPosition();
                    A033.A02.Bja(position4);
                    A033.A01.Bja(position4);
                    AnonymousClass1PE r13 = this.A0J.A03;
                    AnonymousClass1NJ r107 = (AnonymousClass1NJ) obj3;
                    C56982dN A0L2 = r107.A0L();
                    AnonymousClass0a4.A06(A0L2);
                    C51852Mj r126 = A0L2.A00;
                    C57042dT r78 = r107.A0L().A01;
                    C30261Td r88 = this.A0J;
                    AnonymousClass1PE r195 = r13;
                    C51852Mj r204 = r126;
                    C56962dL r185 = new C56962dL(r195, r204, r78, r88, this.A0Q, r88.A04, r107);
                    this.A0D = r185;
                    r185.A00 = new C56992dO(r88.getScrollingViewProxy(), this.A0D);
                    C56982dN A0L3 = r107.A0L();
                    AnonymousClass0a4.A06(A0L3);
                    C57012dQ.A01((C57002dP) view2.getTag(), A0L3.A00, r97.A03().A02, this.A0D);
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    C56982dN A0L4 = ((AnonymousClass1NJ) obj3).A0L();
                    AnonymousClass0a4.A06(A0L4);
                    C57052dU.A01((C57022dR) view2.getTag(), A0L4.A01.A02(0), this.A0D, true);
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    AnonymousClass1NJ r67 = (AnonymousClass1NJ) obj3;
                    AnonymousClass0a4.A06(r67.A0L());
                    C57042dT r79 = r67.A0L().A01;
                    AnonymousClass0a4.A06(r79);
                    if (r79.A00() <= 0) {
                        z = false;
                    }
                    AnonymousClass0a4.A0A(z);
                    this.A0D.A00 = new C56992dO(this.A0J.getScrollingViewProxy(), this.A0D);
                    Context context = this.A0L;
                    C49032Al r68 = ((C36841ih) obj5).A03().A01;
                    C57062dV r116 = (C57062dV) view2.getTag();
                    C57042dT r127 = r79;
                    C57072dW.A03(context, r116, r127, r68, this.A0D, r79.A02(0), true);
                    break;
                case 23:
                    AnonymousClass1NJ r69 = (AnonymousClass1NJ) obj3;
                    AnonymousClass0a4.A06(r69.A0L());
                    C51852Mj r89 = r69.A0L().A00;
                    AnonymousClass0a4.A06(r89);
                    this.A0H.A07(this.A0Q, view2, r89, ((C36841ih) obj5).A03());
                    break;
                case 24:
                    this.A03.A00((AnonymousClass2ZS) view2.getTag(), (AnonymousClass1NJ) obj3, (C36841ih) obj5, this.A0J);
                    break;
                case 25:
                    C57082dX r710 = ((AnonymousClass1NJ) obj3).A0G;
                    if (r710.A00 == null) {
                        r710.A00 = C15500n4.A00().A04((AnonymousClass2DA) r710.A01.A00);
                    }
                    AnonymousClass2DG r98 = r710.A00;
                    C57092dY r810 = (C57092dY) view2.getTag();
                    AnonymousClass1OP r711 = this.A0K;
                    if (r810.A01 != r98) {
                        C15500n4.A00();
                        C15500n4.A02(r810.A00);
                    }
                    if (r810.A01 == null) {
                        r711.registerLifecycleListener(new C57102dZ(r810, r711));
                    }
                    r810.A01 = r98;
                    C15500n4.A00().A05(r711, r98, r810.A00);
                    break;
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    C57112da.A00(this.A0Q, this.A0N, (AnonymousClass2ZT) view2.getTag(), (AnonymousClass1NJ) obj3, this.A0J);
                    break;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("View type unhandled");
                    AnonymousClass0Z0.A0A(787952514, A032);
                    throw unsupportedOperationException;
            }
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1546713876);
            }
            if (!this.A0X) {
                this.A0J.Ba4(view2, i2, obj3, obj5);
            }
            AnonymousClass0Z0.A0A(1519579919, A032);
        } catch (Throwable th) {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(1592788298);
            }
            AnonymousClass0Z0.A0A(1664329102, A032);
            throw th;
        }
    }

    private void A02(C29491Qc r4, int i, Object obj, Object obj2) {
        try {
            Integer num = Constants.ZERO(27)[i];
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01(AnonymousClass000.A0E("addRowAndViewpointData: ", C49002Ai.A00(num)), -262199098);
            }
            r4.A01(i, obj, obj2);
            int i2 = C36931iq.A00[num.intValue()];
            if (i2 == 1) {
                this.A0J.A2l(i);
            } else if (i2 == 2 || i2 == 3) {
                this.A0J.A2o(i);
            } else if (i2 != 4) {
                this.A0J.A4T(i);
            } else {
                this.A0J.A3G(i);
            }
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1565380723);
            }
        }
    }

    private void A04(C29491Qc r5, AnonymousClass1NJ r6, Object obj, C36841ih r8) {
        C37061j3 r3 = new C37061j3(this.A0L, r6, r8, true);
        boolean z = r3.A02;
        if (z) {
            AnonymousClass0a4.A09(z);
            C37131jA r1 = new C37131jA((instagramComment) r3.A01.get(0), r3.A00, r8);
            r5.A01(Constants.A09.intValue(), obj, r1);
            this.A0J.A2n(r1);
        }
    }

    private void A05(C29491Qc r6, AnonymousClass1NJ r7, Object obj, C36841ih r9) {
        C37061j3 r4 = new C37061j3(this.A0L, r7, r9, true);
        if (r4.A05) {
            A02(r6, Constants.A0A.intValue(), obj, r9);
        }
        if (r4.A04) {
            List list = r4.A01;
            boolean z = r4.A02;
            for (instagramComment r2 : list.subList(z ? 1 : 0, list.size())) {
                C37131jA r1 = new C37131jA(r2, r4.A00, r9);
                r6.A01(Constants.A09.intValue(), obj, r1);
                this.A0J.A2n(r1);
            }
        }
        A02(r6, Constants.A07.intValue(), obj, r9);
        A02(r6, Constants.A05.intValue(), obj, r9);
        A02(r6, Constants.A06.intValue(), obj, r9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0154 A[Catch:{ all -> 0x0253 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019b A[Catch:{ all -> 0x0253 }] */
    public final /* bridge */ /* synthetic */ void A72(C29491Qc r6, Object obj, Object obj2) {
        AnonymousClass1NJ r3;
        boolean z;
        AnonymousClass1NG r7 = (AnonymousClass1NG) obj;
        C36841ih r8 = (C36841ih) obj2;
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("buildRowViewTypes: " + r7.A0H, 910019481);
        }
        try {
            C29261Pf r4 = r7.A0H;
            switch (r4.ordinal()) {
                case 1:
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    r3 = r7.A05();
                    AnonymousClass0a4.A06(r3);
                    boolean z2 = false;
                    if (r4 == C29261Pf.EXPLORE_STORY) {
                        z2 = true;
                    }
                    r8.A0p = z2;
                    this.A0J.BY3(r3, r8);
                    if (C30671Ut.A0H(this.A0Q, r3)) {
                        A02(r6, Constants.ZERO.intValue(), r3, r8);
                        break;
                    } else if (r8.Ai7()) {
                        if (!r3.Aho()) {
                            A02(r6, Constants.A02.intValue(), r3, r8);
                            break;
                        } else {
                            A02(r6, Constants.A15.intValue(), r3, r8);
                            break;
                        }
                    } else {
                        boolean z3 = false;
                        if (r3.A0X != null) {
                            z3 = true;
                        }
                        if (z3) {
                            A02(r6, Constants.A04.intValue(), r3, r8);
                        }
                        A02(r6, Constants.A0N.intValue(), r3, r8);
                        if (r3.A1W()) {
                            A02(r6, Constants.A0C.intValue(), r3, r8);
                            if (!C36961it.A03(this.A0Q, r3) && C17050pb.A08(r3, r8.AHt())) {
                                A02(r6, Constants.ONE.intValue(), r3, r8);
                            }
                        } else if (r3.A1X()) {
                            A02(r6, Constants.A03.intValue(), r3, r8);
                        } else {
                            A02(r6, Constants.A0Y.intValue(), r3, r8);
                            if (!C36961it.A03(this.A0Q, r3) && r3.A1L()) {
                                A02(r6, Constants.ONE.intValue(), r3, r8);
                            }
                        }
                        if (C36971iu.A01(r3)) {
                            A02(r6, Constants.A0H.intValue(), r3, r8);
                        }
                        if (r3.A0N == null && r3.A1g()) {
                            A02(r6, Constants.A0J.intValue(), r3, r8);
                        }
                        if (C36981iv.A05(this.A0Q, r3, r8.A0E)) {
                            A02(r6, Constants.A14.intValue(), r3, r8);
                        }
                        AnonymousClass0C1 r2 = this.A0Q;
                        C36991iw r42 = (C36991iw) r2.AVA(C36991iw.class, new C37001ix(r2));
                        if (r42.A00.getBoolean("low_data_mode_enable", false)) {
                            z = true;
                            if (!r42.A00.getBoolean("low_data_mode_experience", false)) {
                            }
                            if (z) {
                                A02(r6, Constants.A0u.intValue(), r3, r8);
                            }
                            A02(r6, Constants.A12.intValue(), r3, r8);
                            A02(r6, Constants.A0j.intValue(), r3, r8);
                            A03(r6, r3, r8);
                            if ((r3.Aho() && r3.A1R()) || C37041j1.A08(r3, this.A0Q)) {
                                A02(r6, Constants.A0B.intValue(), r3, r8);
                            }
                            A04(r6, r3, r3, r8);
                            A05(r6, r3, r3, r8);
                            if (r3.A0L() != null) {
                                C49012Aj A032 = r8.A03();
                                Integer num = A032.A00;
                                if (num == Constants.ZERO && A032.A02.Ai7()) {
                                    A032.A00 = Constants.ONE;
                                } else if (num == Constants.ONE && A032.A01.Ai7()) {
                                    A032.A00 = Constants.A0C;
                                }
                                switch (A032.A00.intValue()) {
                                    case 0:
                                        A02(r6, Constants.A0D.intValue(), r3, r8);
                                        break;
                                    case 1:
                                        A02(r6, Constants.A0E.intValue(), r3, r8);
                                        A02(r6, Constants.A0F.intValue(), r3, r8);
                                        break;
                                    case 2:
                                        A02(r6, Constants.A0G.intValue(), r3, r8);
                                        break;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        A02(r6, Constants.A12.intValue(), r3, r8);
                        A02(r6, Constants.A0j.intValue(), r3, r8);
                        A03(r6, r3, r8);
                        A02(r6, Constants.A0B.intValue(), r3, r8);
                        A04(r6, r3, r3, r8);
                        A05(r6, r3, r3, r8);
                        if (r3.A0L() != null) {
                        }
                    }
                    break;
                case 16:
                    r3 = ((AnonymousClass1SP) r7.A0G).APe();
                    this.A0J.BY3(r3, r8);
                    A02(r6, Constants.A0Y.intValue(), r3, r8);
                    A02(r6, Constants.A12.intValue(), r3, r8);
                    A02(r6, Constants.A0j.intValue(), r3, r8);
                    A03(r6, r3, r8);
                    A04(r6, r3, r3, r8);
                    A05(r6, r3, r3, r8);
                    break;
                default:
                    throw new UnsupportedOperationException(AnonymousClass000.A0E("Unsupported feed item type in FeedItemBinderGroup: ", r4.toString()));
            }
            if (r3.A0G != null && C14100jl.A02(this.A0Q) && C05770Lw.A00().A00.getBoolean("enable_feed_media_debug_info", false)) {
                A02(r6, Constants.A0I.intValue(), r3, r8);
            }
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1689118685);
            }
        }
    }

    public final int ANH(int i, Object obj, Object obj2) {
        if (Constants.ZERO(27)[i] == Constants.A09) {
            return ((C37131jA) obj2).A01.hashCode();
        }
        return Objects.hash(new Object[]{((AnonymousClass1NJ) obj).APo(), Integer.valueOf(i)});
    }

    public final int AaQ(int i, Object obj, Object obj2) {
        String str;
        Integer num = Constants.ZERO(27)[i];
        AnonymousClass1NJ r6 = (AnonymousClass1NJ) obj;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
            case 1:
            case 2:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
            case 16:
            case 18:
            case 19:
            case 20:
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
            case 23:
            case 24:
            case 25:
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                return Process.WAIT_RESULT_TIMEOUT;
            case 3:
                boolean z = r6.A3W;
                AnonymousClass0C1 r0 = this.A0Q;
                if (z) {
                    return r6.A0c(r0).A0M.ordinal();
                }
                return Process.WAIT_RESULT_TIMEOUT;
            case 4:
                return AnonymousClass1VL.A00(r6, (C36841ih) obj2);
            case 7:
                return Objects.hash(new Object[]{Boolean.valueOf(this.A0V.A0K(r6)), Boolean.valueOf(this.A0W.A0L(r6))});
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return Objects.hash(new Object[]{((C36841ih) obj2).A0D});
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return C37191jG.A00(r6, this.A0L.getResources());
            case 15:
                return Objects.hash(new Object[]{Boolean.valueOf(r6.A3L)});
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return AnonymousClass1VS.A00((C37131jA) obj2);
            default:
                if (num != null) {
                    switch (intValue) {
                        case 1:
                            str = "AD_CTA";
                            break;
                        case 2:
                            str = "CAROUSEL_CONTENT";
                            break;
                        case 3:
                            str = "MEDIA_HEADER";
                            break;
                        case 4:
                            str = "MEDIA_CONTENT";
                            break;
                        case 5:
                            str = "MEDIA_FEEDBACK";
                            break;
                        case 6:
                            str = "MEDIA_RELOAD_BAR";
                            break;
                        case 7:
                            str = "MEDIA_UFI";
                            break;
                        case 8:
                            str = "MEDIA_INSIGHTS";
                            break;
                        case 9:
                            str = "TOMBSTONE_SPONSORED";
                            break;
                        case 10:
                            str = "TOMBSTONE_REPORT";
                            break;
                        case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                            str = "COLLECTION_TOP_WITH_BOTTOM_THREE_CONTENT";
                            break;
                        case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                            str = "MEDIA_NOTICE";
                            break;
                        case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                            str = "MEDIA_LABEL_BELOW_COMMENTS";
                            break;
                        case C120125Dh.VIEW_TYPE_LINK /*14*/:
                            str = "GAP";
                            break;
                        case 15:
                            str = "MEDIA_INLINE_COMPOSER_BUTTON";
                            break;
                        case 16:
                            str = "MEDIA_HEADLINE";
                            break;
                        case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                            str = "MEDIA_COMMENT";
                            break;
                        case 18:
                            str = "MEDIA_VIEW_ALL_COMMENTS";
                            break;
                        case 19:
                            str = "BRANDED_CONTENT_LABEL";
                            break;
                        case 20:
                            str = "MEDIA_INLINE_SURVEY_SIMPLE_ACTION";
                            break;
                        case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                            str = "MEDIA_INLINE_SURVEY_QUESTION_TITLE";
                            break;
                        case C120125Dh.NUM_VIEW_TYPES /*22*/:
                            str = "MEDIA_INLINE_SURVEY_ANSWERS";
                            break;
                        case 23:
                            str = "MEDIA_INLINE_SURVEY_TOMBSTONE";
                            break;
                        case 24:
                            str = "GATING_CTA";
                            break;
                        case 25:
                            str = "MEDIA_DEBUG_INFO";
                            break;
                        case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                            str = "MEDIA_OVERLAY_CTA";
                            break;
                        default:
                            str = "HOLDOUT";
                            break;
                    }
                } else {
                    str = "null";
                }
                throw new IllegalStateException(AnonymousClass000.A0E("Could not get ViewModel hash for item type ", str));
        }
    }

    public final String AaR(int i) {
        return AnonymousClass000.A0J("FeedItem[", C49002Ai.A00(Constants.ZERO(27)[i]), "]");
    }

    public final void BVd(View view, int i, Object obj, Object obj2) {
        if (this.A0X) {
            this.A0J.Ba4(view, i, obj, obj2);
        }
    }

    public final int getViewTypeCount() {
        return A0a;
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.A0X) {
            this.A0J.BsD(view);
        }
    }

    public C29151Ou(Context context, C27371Ho r6, AnonymousClass0C1 r7, AnonymousClass1I6 r8, C26611Ee r9, C26671El r10, C29181Ox r11, AnonymousClass1LO r12, C29001Of r13, AnonymousClass1OP r14, boolean z, AnonymousClass1I2 r16, C27411Hs r17) {
        this.A0L = context;
        this.A0N = r6;
        this.A0Q = r7;
        this.A0R = r8;
        this.A0O = r11;
        this.A0V = r9;
        this.A0W = r10;
        this.A0S = r12;
        this.A0M = r13;
        AnonymousClass0L7 r2 = AnonymousClass0L7.VIDEO_SCRUBBER;
        this.A0Z = ((Boolean) AnonymousClass0L6.A02(r7, r2, "is_sponsored_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0Y = ((Boolean) AnonymousClass0L6.A02(r7, r2, "is_organic_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0K = r14;
        this.A0X = z;
        this.A0U = r16;
        this.A0P = r17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ac, code lost:
        p000X.AnonymousClass0Z0.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03af, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        p000X.AnonymousClass0Z0.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0122, code lost:
        return r1;
     */
    private View A00(Context context, int i, ViewGroup viewGroup) {
        FrameLayout frameLayout;
        int i2;
        View view;
        int i3;
        int A032 = AnonymousClass0Z0.A03(2111729392);
        try {
            Integer num = Constants.ZERO(27)[i];
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01(AnonymousClass000.A0E("createView: ", C49002Ai.A00(num)), 2075251530);
            }
            switch (num.intValue()) {
                case 0:
                    view = new View(context);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-1279569853);
                    }
                    i3 = 892009378;
                    break;
                case 1:
                    AnonymousClass0C1 r4 = this.A0Q;
                    View inflate = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_cta, viewGroup, false);
                    inflate.setTag(AnonymousClass1VW.A01(r4, inflate));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(147890233);
                    }
                    i2 = -1885660597;
                    frameLayout = inflate;
                    break;
                case 2:
                    AnonymousClass1VV r42 = this.A09;
                    View inflate2 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_carousel_media_group, viewGroup, false);
                    C32541bR r3 = new C32541bR(inflate2, r42.A04);
                    r3.A09.setPageSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    inflate2.setTag(r3);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-1055827659);
                    }
                    i2 = 529690167;
                    frameLayout = inflate2;
                    break;
                case 3:
                    View A002 = this.A06.A01.A00();
                    if (A002 == null) {
                        A002 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_media_profile_header, viewGroup, false);
                        A002.setTag(AnonymousClass1VJ.A01(A002));
                    }
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(560001892);
                    }
                    i3 = 1706966208;
                    break;
                case 4:
                    view = this.A06.A00.A00();
                    if (view == null) {
                        AnonymousClass1VL r43 = this.A0G;
                        view = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_media_media_group, viewGroup, false);
                        view.setTag(r43.A02(view));
                    }
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-1729826966);
                    }
                    i3 = -930024761;
                    break;
                case 5:
                    View A003 = this.A05.A00(context, viewGroup);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1981648277);
                    }
                    i2 = 2017437615;
                    frameLayout = A003;
                    break;
                case 6:
                    View A004 = C30741Va.A00(context, viewGroup);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(403309711);
                    }
                    i2 = -1259895597;
                    frameLayout = A004;
                    break;
                case 7:
                    View A005 = this.A07.A00(context, viewGroup);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(900340329);
                    }
                    i2 = -635253775;
                    frameLayout = A005;
                    break;
                case 8:
                    View inflate3 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_media_insights, viewGroup, false);
                    inflate3.setTag(new AnonymousClass2ZR(inflate3.findViewById(C0003R.C0005id.insights_view)));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-206133615);
                    }
                    i2 = -289220217;
                    frameLayout = inflate3;
                    break;
                case 9:
                    View A006 = AnonymousClass1VI.A00(context, viewGroup, 1);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1258133236);
                    }
                    i2 = 1769020656;
                    frameLayout = A006;
                    break;
                case 10:
                    View A007 = AnonymousClass1VI.A00(context, viewGroup, 0);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-1836530136);
                    }
                    i2 = -1680078254;
                    frameLayout = A007;
                    break;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    View A008 = C30751Vb.A00(context, this.A0Q, viewGroup);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-321905920);
                    }
                    i2 = 1584942673;
                    frameLayout = A008;
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    View inflate4 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_media_notice, viewGroup, false);
                    C57372e5 r1 = new C57372e5();
                    r1.A00 = inflate4.findViewById(C0003R.C0005id.row_feed_media_notice);
                    r1.A02 = (ImageView) inflate4.findViewById(C0003R.C0005id.row_feed_media_notice_icon);
                    r1.A04 = (TextView) inflate4.findViewById(C0003R.C0005id.row_feed_media_notice_text);
                    r1.A03 = (TextView) inflate4.findViewById(C0003R.C0005id.row_feed_media_notice_sub_text);
                    r1.A01 = (ImageView) inflate4.findViewById(C0003R.C0005id.row_feed_media_notice_chevron);
                    inflate4.setTag(r1);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(610366436);
                    }
                    i2 = 1295644790;
                    frameLayout = inflate4;
                    break;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    View inflate5 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_label_below_comments, viewGroup, false);
                    inflate5.setTag(new C32441bF(inflate5));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1101509209);
                    }
                    i2 = 1280424962;
                    frameLayout = inflate5;
                    break;
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    View view2 = new View(context);
                    view2.setId(C0003R.C0005id.gap_view);
                    view2.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1144282383);
                    }
                    i2 = -1561082390;
                    frameLayout = view2;
                    break;
                case 15:
                    View A009 = this.A06.A02.A00();
                    View view3 = A009;
                    if (A009 == null) {
                        AnonymousClass1VQ r8 = this.A0B;
                        View inflate6 = LayoutInflater.from(r8.A02).inflate(C0003R.layout.row_feed_inline_composer_button, viewGroup, false);
                        inflate6.setTag(new C32561bT(inflate6, r8.A04, r8.A03, r8, r8.A01));
                        view3 = inflate6;
                    }
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-1816854678);
                    }
                    i2 = 800843385;
                    frameLayout = view3;
                    break;
                case 16:
                    C29181Ox r44 = this.A0O;
                    View inflate7 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_media_headline, viewGroup, false);
                    inflate7.setTag(new AnonymousClass2XB(inflate7, r44));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-422983928);
                    }
                    i2 = 1232728297;
                    frameLayout = inflate7;
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    View inflate8 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_comment, viewGroup, false);
                    inflate8.setTag(new C32421bD(inflate8));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(379309846);
                    }
                    i2 = 781539290;
                    frameLayout = inflate8;
                    break;
                case 18:
                    View inflate9 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_view_all_comments, viewGroup, false);
                    inflate9.setTag(new C32431bE(inflate9));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(71905386);
                    }
                    i2 = 1056574314;
                    frameLayout = inflate9;
                    break;
                case 19:
                    View inflate10 = LayoutInflater.from(context).inflate(C0003R.layout.row_branded_content_tag, viewGroup, false);
                    inflate10.setTag(new AnonymousClass2XA(inflate10));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(910516668);
                    }
                    i2 = 1357402034;
                    frameLayout = inflate10;
                    break;
                case 20:
                    View A0010 = C57012dQ.A00(context, viewGroup);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1889256049);
                    }
                    i2 = -580596791;
                    frameLayout = A0010;
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    View A0011 = C57052dU.A00(viewGroup);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-161196486);
                    }
                    i2 = 1854595724;
                    frameLayout = A0011;
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    View A012 = C57072dW.A01(viewGroup);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1226312996);
                    }
                    i2 = -675680592;
                    frameLayout = A012;
                    break;
                case 23:
                    View A0012 = AnonymousClass1VI.A00(context, viewGroup, 3);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-112331065);
                    }
                    i2 = 268055002;
                    frameLayout = A0012;
                    break;
                case 24:
                    View inflate11 = LayoutInflater.from(context).inflate(C0003R.layout.row_feed_gating_cta, viewGroup, false);
                    inflate11.setTag(new AnonymousClass2ZS(inflate11));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-1355079057);
                    }
                    i2 = 2117946853;
                    frameLayout = inflate11;
                    break;
                case 25:
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    C57092dY r12 = new C57092dY();
                    r12.A00 = frameLayout2;
                    frameLayout2.setTag(r12);
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1594206226);
                    }
                    i2 = -174393370;
                    frameLayout = frameLayout2;
                    break;
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    View inflate12 = LayoutInflater.from(this.A0L).inflate(C0003R.layout.row_feed_media_overlay_cta, viewGroup, false);
                    inflate12.setTag(new AnonymousClass2ZT(inflate12));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(-43362423);
                    }
                    i2 = 1345468217;
                    frameLayout = inflate12;
                    break;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                    AnonymousClass0Z0.A0A(651207485, A032);
                    throw unsupportedOperationException;
            }
        } catch (Throwable th) {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(155106642);
            }
            AnonymousClass0Z0.A0A(-2096218606, A032);
            throw th;
        }
    }

    public static void A03(C29491Qc r1, AnonymousClass1NJ r2, C36841ih r3) {
        AnonymousClass1NJ r0;
        if (r2.A1W()) {
            r0 = r2.A0P(r3.AHt());
        } else {
            r0 = r2;
        }
        if (r0 != null && r0.A1K()) {
            r1.A01(Constants.A08.intValue(), r2, r3);
        }
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0Z0.A03(91415393);
        A01(view, i, obj, obj2);
        AnonymousClass0Z0.A0A(-1090593477, A032);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0Z0.A03(1454637878);
        View A002 = A00(viewGroup.getContext(), i, viewGroup);
        AnonymousClass0Z0.A0A(-334109263, A032);
        return A002;
    }

    public final View AaJ(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A032 = AnonymousClass0Z0.A03(-180464226);
        if (view == null) {
            view = A00(this.A0L, i, viewGroup);
        }
        A01(view, i, obj, obj2);
        AnonymousClass0Z0.A0A(654765641, A032);
        return view;
    }
}
