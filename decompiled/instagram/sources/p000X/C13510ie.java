package p000X;

import android.os.Message;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.0ie  reason: invalid class name and case insensitive filesystem */
public final class C13510ie implements C06570Po {
    public static int A03 = 100000;
    public static final Map A04 = Collections.synchronizedMap(new HashMap());
    public AnonymousClass0C1 A00;
    public final ConcurrentMap A01;
    public final ConcurrentMap A02;

    public final void A03(C13300iJ r4) {
        C13300iJ A012 = A01(r4, true);
        AnonymousClass0C1 r1 = this.A00;
        if (r1.A06.equals(r4)) {
            r1.A05.A07(A012);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C13510ie A00(AnonymousClass0C1 r2) {
        return (C13510ie) r2.AVA(C13510ie.class, new C13520if(r2));
    }

    public final C13300iJ A02(String str) {
        return (C13300iJ) this.A01.get(str);
    }

    public C13510ie(AnonymousClass0C1 r4) {
        C13530ig r0 = new C13530ig();
        r0.A01(64);
        MapMakerInternalMap.Strength strength = MapMakerInternalMap.Strength.A02;
        r0.A03(strength);
        this.A01 = r0.A00();
        C13530ig r02 = new C13530ig();
        r02.A01(64);
        r02.A03(strength);
        this.A02 = r02.A00();
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ec, code lost:
        if (r1 == false) goto L_0x00ee;
     */
    public final C13300iJ A01(C13300iJ r7, boolean z) {
        boolean z2;
        String id = r7.getId();
        if (id == null || id.isEmpty()) {
            throw new C45351xj();
        }
        C13300iJ r4 = (C13300iJ) this.A01.putIfAbsent(id, r7);
        boolean z3 = false;
        if (r7.ANw() == 0) {
            z3 = true;
        }
        String AZn = r7.AZn();
        if (z3) {
            if (AZn == null || AZn.isEmpty()) {
                AnonymousClass0QD.A03("username_missing_exception", AnonymousClass000.A0J("Received user ", id, " is missing a username"), A03);
                r7.A2m = (String) A04.get(id);
            } else if (!A04.containsKey(id)) {
                A04.put(id, AZn);
            }
        }
        if (r4 == null) {
            if (z3) {
                String AZn2 = r7.AZn();
                if (AZn2 == null || AZn2.isEmpty()) {
                    AnonymousClass0QD.A02("cache_put_username_missing", AnonymousClass000.A0J("Trying to put user ", id, " into UserCache without username."));
                }
                this.A02.put(AZn2, r7);
            }
            return r7;
        } else if (this.A00.A06.equals(r7) && !z) {
            return r4;
        } else {
            String id2 = r7.getId();
            if (id2 != null) {
                C13300iJ.A03("id", id2, r4.A2Q);
                r4.A2Q = id2;
            }
            String AZn3 = r7.AZn();
            if (AZn3 != null) {
                C13300iJ.A03("username", AZn3, r4.A2m);
                r4.A2m = AZn3;
            }
            String AMN = r7.AMN();
            if (AMN != null) {
                r4.A2P = AMN;
            }
            ImageUrl ASv = r7.ASv();
            if (ASv != null) {
                r4.A02 = ASv;
            }
            String str = r7.A2b;
            if (str != null) {
                r4.A2b = str;
            }
            ExtendedImageUrl extendedImageUrl = r7.A05;
            if (extendedImageUrl != null) {
                r4.A05 = extendedImageUrl;
            }
            Boolean bool = r7.A0k;
            if (bool != null) {
                r4.A0k = bool;
                if (bool.booleanValue()) {
                    r4.A2b = null;
                    r4.A05 = null;
                }
            }
            if (r7.A15 != null) {
                r4.A15 = Boolean.valueOf(r7.A0h());
            }
            if (r7.A17 != null) {
                r4.A17 = Boolean.valueOf(r7.A0j());
            }
            if (r7.A16 != null) {
                r4.A16 = Boolean.valueOf(r7.A0i());
            }
            if (r7.A04 != null) {
                r4.A04 = r7.A06();
            }
            Boolean bool2 = r7.A1F;
            if (bool2 != null) {
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    z2 = true;
                }
                z2 = false;
                r4.A1F = Boolean.valueOf(z2);
            }
            boolean z4 = r7.A35;
            if (z4 != r4.A35) {
                r4.A35 = z4;
            }
            String A0A = r7.A0A();
            if (A0A != null) {
                r4.A26 = A0A;
            }
            C481927a r0 = r7.A0B;
            if (r0 != null) {
                r4.A0B = r0;
            }
            Boolean bool3 = r7.A0l;
            if (bool3 != null) {
                r4.A0l = bool3;
            }
            String str2 = r7.A2l;
            if (str2 != null) {
                r4.A2l = str2;
            }
            String str3 = r7.A2E;
            if (str3 != null) {
                r4.A2E = str3;
            }
            String str4 = r7.A2D;
            if (str4 == null) {
                str4 = r7.A2E;
            }
            if (str4 != null) {
                r4.A2D = str4;
            }
            r4.A2x = r7.A2x;
            Integer num = r7.A1f;
            if (num != null) {
                r4.A1f = num;
            }
            Integer num2 = r7.A1g;
            if (num2 != null) {
                r4.A1g = num2;
            }
            Integer num3 = r7.A1l;
            if (num3 != null) {
                r4.A1l = num3;
            }
            Integer num4 = r7.A1h;
            if (num4 != null) {
                r4.A1h = num4;
            }
            Integer num5 = r7.A1e;
            if (num5 != null) {
                r4.A1e = num5;
            }
            boolean z5 = r7.A36;
            if (z5 != r4.A36) {
                r4.A36 = z5;
            }
            Integer num6 = r7.A1k;
            if (num6 != null) {
                r4.A1k = num6;
            }
            Integer num7 = r7.A1o;
            if (num7 != r4.A1o) {
                r4.A1o = num7;
            }
            Integer num8 = r7.A1d;
            if (num8 != r4.A1d) {
                r4.A1d = num8;
            }
            Integer num9 = r7.A1i;
            if (num9 != null) {
                r4.A1i = num9;
            }
            Integer num10 = r7.A1n;
            if (num10 != null) {
                r4.A1n = num10;
            }
            String str5 = r7.A2F;
            if (str5 != null) {
                r4.A2F = str5;
            }
            String str6 = r7.A20;
            if (str6 != null) {
                r4.A20 = str6;
            }
            List list = r7.A2p;
            if (list != null) {
                r4.A2p = list;
            }
            Boolean bool4 = r7.A0n;
            if (bool4 != null) {
                r4.A0n = bool4;
            }
            List list2 = r7.A2s;
            if (list2 != null) {
                r4.A2s = list2;
            }
            Boolean bool5 = r7.A0t;
            if (bool5 != null) {
                r4.A0t = bool5;
            }
            Boolean bool6 = r7.A0T;
            if (bool6 != null) {
                r4.A0T = bool6;
            }
            Float f = r7.A1Y;
            if (f != null) {
                r4.A1Y = f;
            }
            C13390iS r1 = r7.A0M;
            if (r1 != C13390iS.FollowStatusUnknown) {
                r4.A0M = r1;
                r4.A0N = r7.A0N;
            }
            Boolean bool7 = r7.A0y;
            if (bool7 != null) {
                r4.A0y = bool7;
            }
            String str7 = r7.A27;
            if (str7 != null) {
                r4.A27 = str7;
            }
            Boolean bool8 = r7.A1L;
            if (bool8 != null) {
                r4.A1L = bool8;
            }
            Boolean bool9 = r7.A18;
            if (bool9 != null) {
                r4.A18 = bool9;
            }
            Boolean bool10 = r7.A1D;
            if (bool10 != null) {
                r4.A1D = bool10;
            }
            Boolean bool11 = r7.A19;
            if (bool11 != null) {
                r4.A19 = bool11;
            }
            Boolean bool12 = r7.A1E;
            if (bool12 != null) {
                r4.A1E = bool12;
            }
            Boolean bool13 = r7.A1J;
            if (bool13 != null) {
                r4.A1J = bool13;
            }
            Boolean bool14 = r7.A1M;
            if (bool14 != null) {
                r4.A1M = bool14;
            }
            String str8 = r7.A2j;
            if (str8 != null) {
                r4.A2j = str8;
            }
            String str9 = r7.A2a;
            if (str9 != null) {
                r4.A2a = str9;
            }
            List list3 = r7.A2r;
            if (list3 != null) {
                r4.A2r = list3;
            }
            String str10 = r7.A2Z;
            if (str10 != null) {
                r4.A2Z = str10;
            }
            Boolean bool15 = r7.A0w;
            if (bool15 != null) {
                r4.A0w = bool15;
            }
            Boolean bool16 = r7.A0R;
            if (bool16 != null) {
                r4.A0R = bool16;
            }
            Boolean bool17 = r7.A1R;
            if (bool17 != null) {
                r4.A1R = bool17;
            }
            Boolean bool18 = r7.A0W;
            if (bool18 != null) {
                r4.A0W = bool18;
            }
            Boolean bool19 = r7.A0a;
            if (bool19 != null) {
                r4.A0a = bool19;
            }
            Boolean bool20 = r7.A0V;
            if (bool20 != null) {
                r4.A0V = bool20;
            }
            Boolean bool21 = r7.A0g;
            if (bool21 != null) {
                r4.A0g = bool21;
            }
            Boolean bool22 = r7.A0b;
            if (bool22 != null) {
                r4.A0b = bool22;
            }
            Boolean bool23 = r7.A1N;
            if (bool23 != null) {
                r4.A1N = bool23;
            }
            Integer num11 = r7.A1m;
            if (num11 != null) {
                r4.A1m = num11;
            }
            Boolean bool24 = r7.A0Y;
            if (bool24 != null) {
                r4.A0Y = bool24;
            }
            String str11 = r7.A2d;
            if (str11 != null) {
                r4.A2d = str11;
            }
            String str12 = r7.A2e;
            if (str12 != null) {
                r4.A2e = str12;
            }
            String str13 = r7.A2B;
            if (str13 != null) {
                r4.A2B = str13;
            }
            String str14 = r7.A2c;
            if (str14 != null) {
                r4.A2c = str14;
            }
            String str15 = r7.A22;
            if (str15 != null) {
                r4.A22 = str15;
            }
            String str16 = r7.A21;
            if (str16 != null) {
                r4.A21 = str16;
            }
            String str17 = r7.A23;
            if (str17 != null) {
                r4.A23 = str17;
            }
            String str18 = r7.A28;
            if (str18 != null) {
                r4.A28 = str18;
            }
            String str19 = r7.A1z;
            if (str19 != null) {
                r4.A1z = str19;
            }
            String str20 = r7.A2A;
            if (str20 != null) {
                r4.A2A = str20;
            }
            String str21 = r7.A29;
            if (str21 != null) {
                r4.A29 = str21;
            }
            if (r7.A0p() || r7.A0X != null) {
                r4.A0X = r7.A0X;
            }
            if (r7.A0p() || r7.A2U != null) {
                r4.A2U = r7.A2U;
            }
            Integer num12 = r7.A1p;
            if (num12 != null) {
                r4.A1p = num12;
            }
            if (r7.A0p() || r7.A2V != null) {
                r4.A2V = r7.A2V;
            }
            if (r7.A0p() || r7.A24 != null) {
                r4.A24 = r7.A24;
            }
            if (r7.A0p() || r7.A25 != null) {
                r4.A25 = r7.A25;
            }
            if (!r7.A0p()) {
                r4.A2W = r7.A2W;
            }
            if (!r7.A0p()) {
                r4.A2X = r7.A2X;
            }
            Boolean bool25 = r7.A10;
            if (bool25 != null) {
                r4.A10 = bool25;
            }
            C13340iN r02 = r7.A07;
            if (r02 != null) {
                r4.A07 = r02;
            }
            Integer num13 = r7.A1u;
            if (num13 != null) {
                r4.A1u = num13;
            }
            Integer num14 = r7.A1q;
            if (num14 != null) {
                r4.A1q = num14;
            }
            Integer num15 = r7.A1r;
            if (num15 != null) {
                r4.A1r = num15;
            }
            Boolean bool26 = r7.A1U;
            if (bool26 != null) {
                r4.A1U = bool26;
            }
            Boolean bool27 = r7.A0S;
            if (bool27 != null) {
                r4.A0S = bool27;
            }
            Boolean bool28 = r7.A1S;
            if (bool28 != null) {
                r4.A1S = bool28;
            }
            Boolean bool29 = r7.A1T;
            if (bool29 != null) {
                r4.A1T = bool29;
            }
            C30756DjB djB = r7.A0K;
            if (djB != null) {
                r4.A0K = djB;
            }
            C106954jM r03 = r7.A0D;
            if (r03 != null) {
                r4.A0D = r03;
            }
            String str22 = r7.A2H;
            if (str22 != null) {
                r4.A2H = str22;
            }
            String str23 = r7.A2K;
            if (str23 != null) {
                r4.A2K = str23;
            }
            String str24 = r7.A2J;
            if (str24 != null) {
                r4.A2J = str24;
            }
            String str25 = r7.A2G;
            if (str25 != null) {
                r4.A2G = str25;
            }
            String str26 = r7.A2I;
            if (str26 != null) {
                r4.A2I = str26;
            }
            C468521d r04 = r7.A0L;
            if (r04 != null) {
                r4.A0L = r04;
            }
            Boolean bool30 = r7.A12;
            if (bool30 != null) {
                r4.A12 = bool30;
            }
            HashMap hashMap = r7.A2n;
            if (hashMap != null) {
                r4.A2n = hashMap;
            }
            String str27 = r7.A2C;
            if (str27 != null) {
                r4.A2C = str27;
            }
            String str28 = r7.A2R;
            if (str28 != null) {
                r4.A2R = str28;
            }
            Boolean bool31 = r7.A0U;
            if (bool31 != null) {
                r4.A0U = bool31;
            }
            Boolean bool32 = r7.A0r;
            if (bool32 != null) {
                r4.A0r = bool32;
            }
            Boolean bool33 = r7.A1X;
            if (bool33 != null) {
                r4.A1X = bool33;
            }
            C468621e r05 = r7.A09;
            if (r05 != null) {
                r4.A09 = r05;
            }
            Boolean bool34 = r7.A0h;
            if (bool34 != null) {
                r4.A0h = bool34;
            }
            Boolean bool35 = r7.A0e;
            if (bool35 != null) {
                r4.A0e = bool35;
            }
            List list4 = r7.A2q;
            if (list4 != null) {
                r4.A2q = list4;
            }
            Boolean bool36 = r7.A0f;
            if (bool36 != null) {
                r4.A0f = bool36;
            }
            C13380iR r06 = r7.A08;
            if (r06 != null) {
                r4.A08 = r06;
            }
            Boolean bool37 = r7.A11;
            if (bool37 != null) {
                r4.A11 = bool37;
            }
            C44841wq r07 = r7.A06;
            if (r07 != null) {
                r4.A06 = r07;
            }
            Boolean bool38 = r7.A1H;
            if (bool38 != null) {
                r4.A1H = bool38;
            }
            Boolean bool39 = r7.A1G;
            if (bool39 != null) {
                r4.A1G = bool39;
            }
            Boolean bool40 = r7.A0v;
            if (bool40 != null) {
                r4.A0v = bool40;
            }
            Long l = r7.A1x;
            if (l != null) {
                r4.A1x = l;
            }
            Long l2 = r7.A1w;
            if (l2 != null) {
                r4.A1w = l2;
            }
            Long l3 = r7.A1y;
            if (l3 != null) {
                r4.A1y = l3;
            }
            Integer num16 = r7.A1j;
            if (num16 != null) {
                r4.A1j = num16;
            }
            Boolean bool41 = r7.A0c;
            if (bool41 != null) {
                r4.A0c = bool41;
            }
            Boolean bool42 = r7.A0p;
            if (bool42 != null) {
                r4.A0p = bool42;
            }
            Boolean bool43 = r7.A14;
            if (bool43 != null) {
                r4.A14 = bool43;
            }
            Boolean bool44 = r7.A0j;
            if (bool44 != null) {
                r4.A0j = bool44;
            }
            C482527g r08 = r7.A03;
            if (r08 != null) {
                r4.A03 = r08;
            }
            Boolean bool45 = r7.A0x;
            if (bool45 != null) {
                r4.A0x = bool45;
            }
            Boolean bool46 = r7.A0Z;
            if (bool46 != null) {
                r4.A0Z = bool46;
            }
            C30755DjA djA = r7.A0P;
            if (djA != null) {
                r4.A0P = djA;
            }
            Boolean bool47 = r7.A1K;
            if (bool47 != null) {
                r4.A1K = bool47;
            }
            C13280iH r09 = r7.A0F;
            if (r09 != null) {
                r4.A0F = r09;
            }
            C13260iE r010 = r7.A0O;
            if (r010 != null) {
                r4.A0O = r010;
            }
            Boolean bool48 = r7.A0d;
            if (bool48 != null) {
                r4.A0d = bool48;
            }
            Boolean bool49 = r7.A0s;
            if (bool49 != null) {
                r4.A0s = bool49;
            }
            r4.A2y = r7.A2y;
            Boolean bool50 = r7.A13;
            if (bool50 != null) {
                r4.A13 = bool50;
            }
            Boolean bool51 = r7.A1W;
            if (bool51 != null) {
                r4.A1W = bool51;
            }
            Float f2 = r7.A1Z;
            if (f2 != null) {
                r4.A1Z = f2;
            }
            Boolean bool52 = r7.A1Q;
            if (bool52 != null) {
                r4.A1Q = bool52;
            }
            Boolean bool53 = r7.A1V;
            if (bool53 != null) {
                r4.A1V = bool53;
            }
            String str29 = r7.A2f;
            if (str29 != null) {
                r4.A2f = str29;
            }
            Boolean bool54 = r7.A1A;
            if (bool54 != null) {
                r4.A1A = bool54;
            }
            String str30 = r7.A2h;
            if (str30 != null) {
                r4.A2h = str30;
            }
            String str31 = r7.A2i;
            if (str31 != null) {
                r4.A2i = str31;
            }
            String str32 = r7.A2g;
            if (str32 != null) {
                r4.A2g = str32;
            }
            String str33 = r7.A2T;
            if (str33 != null) {
                r4.A2T = str33;
            }
            Boolean bool55 = r7.A0q;
            if (bool55 != null) {
                r4.A0q = bool55;
            }
            Integer num17 = r7.A1t;
            if (num17 != null) {
                r4.A1t = num17;
            }
            Integer num18 = r7.A1s;
            if (num18 != null) {
                r4.A1s = num18;
            }
            Integer num19 = r7.A1a;
            if (num19 != null) {
                r4.A1a = num19;
            }
            Boolean bool56 = r7.A0m;
            if (bool56 != null) {
                r4.A0m = bool56;
            }
            Boolean bool57 = r7.A0z;
            if (bool57 != null) {
                r4.A0z = bool57;
            }
            Integer num20 = r7.A1b;
            if (num20 != null) {
                r4.A1b = num20;
            }
            C58892gh r011 = r7.A0E;
            if (r011 != null) {
                r4.A0E = r011;
            }
            Boolean bool58 = r7.A1P;
            if (bool58 != null) {
                r4.A1P = bool58;
            }
            Boolean bool59 = r7.A1O;
            if (bool59 != null) {
                r4.A1O = bool59;
            }
            C13410iU r2 = r7.A0C;
            if (r2 != null) {
                C13410iU r012 = r4.A0C;
                if (r012 != null) {
                    C13400iT A002 = C13400iT.A00(r012);
                    Boolean bool60 = r2.A0D;
                    if (bool60 != null) {
                        A002.A0D = bool60;
                    }
                    Boolean bool61 = r2.A03;
                    if (bool61 != null) {
                        A002.A03 = bool61;
                    }
                    Boolean bool62 = r2.A02;
                    if (bool62 != null) {
                        A002.A02 = bool62;
                    }
                    Boolean bool63 = r2.A06;
                    if (bool63 != null) {
                        A002.A06 = bool63;
                    }
                    Boolean bool64 = r2.A00;
                    if (bool64 != null) {
                        A002.A00 = bool64;
                    }
                    Boolean bool65 = r2.A01;
                    if (bool65 != null) {
                        A002.A01 = bool65;
                    }
                    Boolean bool66 = r2.A08;
                    if (bool66 != null) {
                        A002.A08 = bool66;
                    }
                    Boolean bool67 = r2.A09;
                    if (bool67 != null) {
                        A002.A09 = bool67;
                    }
                    Boolean bool68 = r2.A04;
                    if (bool68 != null) {
                        A002.A04 = bool68;
                    }
                    Boolean bool69 = r2.A05;
                    if (bool69 != null) {
                        A002.A05 = bool69;
                    }
                    Boolean bool70 = r2.A0A;
                    if (bool70 != null) {
                        A002.A0A = bool70;
                    }
                    Boolean bool71 = r2.A07;
                    if (bool71 != null) {
                        A002.A07 = bool71;
                    }
                    Boolean bool72 = r2.A0B;
                    if (bool72 != null) {
                        A002.A0B = bool72;
                    }
                    Boolean bool73 = r2.A0C;
                    if (bool73 != null) {
                        A002.A0C = bool73;
                    }
                    r4.A0C = new C13410iU(A002);
                } else {
                    r4.A0C = r2;
                }
            }
            Boolean bool74 = r7.A0Q;
            if (bool74 != null) {
                r4.A0Q = bool74;
            }
            String str34 = r7.A2Y;
            if (str34 != null) {
                r4.A2Y = str34;
            }
            r4.A2u = r7.A2u;
            r4.A31 = r7.A31;
            r4.A32 = r7.A32;
            r4.A30 = r7.A30;
            r4.A2z = r7.A2z;
            r4.A2v = r7.A2v;
            r4.A2w = r7.A2w;
            r4.A01 = r7.A01;
            Boolean bool75 = r7.A0u;
            if (bool75 != null) {
                r4.A0u = bool75;
            }
            Long l4 = r7.A1v;
            if (l4 != null) {
                r4.A1v = l4;
            }
            r4.A34 = r7.A34;
            String str35 = r7.A2S;
            if (str35 != null) {
                r4.A2S = str35;
            }
            Boolean bool76 = r7.A1C;
            if (bool76 != null) {
                r4.A1C = bool76;
            }
            Boolean bool77 = r7.A1B;
            if (bool77 != null) {
                r4.A1B = bool77;
            }
            String str36 = r7.A2k;
            if (str36 != null) {
                r4.A2k = str36;
            }
            Boolean bool78 = r7.A1I;
            if (bool78 != null) {
                r4.A1I = bool78;
            }
            String str37 = r7.A2L;
            if (str37 != null) {
                r4.A2L = str37;
            }
            String str38 = r7.A2M;
            if (str38 != null) {
                r4.A2M = str38;
            }
            String str39 = r7.A2O;
            if (str39 != null) {
                r4.A2O = str39;
            }
            String str40 = r7.A2N;
            if (str40 != null) {
                r4.A2N = str40;
            }
            r4.A33 = r7.A33;
            C57942f3 r013 = r7.A0J;
            if (r013 != null) {
                r4.A0J = r013;
            }
            C57942f3 r014 = r7.A0H;
            if (r014 != null) {
                r4.A0H = r014;
            }
            C57942f3 r015 = r7.A0I;
            if (r015 != null) {
                r4.A0I = r015;
            }
            AnonymousClass2A5 r016 = r7.A0G;
            if (r016 != null) {
                r4.A0G = r016;
            }
            C58422fu r017 = r7.A0A;
            if (r017 != null) {
                r4.A0A = r017;
            }
            Boolean bool79 = r7.A0o;
            if (bool79 != null) {
                r4.A0o = bool79;
            }
            List list5 = r7.A2o;
            if (list5 != null) {
                r4.A2o = list5;
            }
            Boolean bool80 = r7.A0i;
            if (bool80 != null) {
                r4.A0i = bool80;
            }
            AnonymousClass0C1 r3 = this.A00;
            if (C13300iJ.A37 == null) {
                C13300iJ.A37 = new AnonymousClass1PN();
            }
            Message obtainMessage = C13300iJ.A37.obtainMessage(r4.A2Q.hashCode(), new AnonymousClass1PP(r3, r4));
            AnonymousClass0ZA.A02(C13300iJ.A37, r4.A2Q.hashCode());
            AnonymousClass0ZA.A06(C13300iJ.A37, obtainMessage, 1000);
            AnonymousClass0C1 r12 = this.A00;
            if (r12.A06.equals(r4)) {
                r12.A05.A07(r4);
            }
            return r4;
        }
    }
}
