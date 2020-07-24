package p000X;

import android.util.Pair;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.ASR */
public final class ASR extends C17920r1 {
    public final /* synthetic */ AQ5 A00;

    public ASR(AQ5 aq5) {
        this.A00 = aq5;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean booleanValue;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        long longValue;
        ARK ark;
        int A03 = AnonymousClass0Z0.A03(612001152);
        ASS ass = (ASS) obj;
        int A032 = AnonymousClass0Z0.A03(-1790567043);
        AQ5 aq5 = this.A00;
        String str = ass.A0G;
        aq5.A08 = ass;
        AnonymousClass79M r6 = aq5.A0R;
        r6.A08 = str;
        r6.A0L.A3C(C35051fj.A0U, AnonymousClass000.A0E("broadcast_id:", str));
        AnonymousClass0QD.A00().BYg(C193418Ps.$const$string(118), str);
        AnonymousClass0QD.A00().BYg(C193418Ps.$const$string(121), r6.A0M.A05());
        aq5.A0R.A0D(true, (String) null);
        if (!AQ5.A07(aq5)) {
            AXY axy = aq5.A0S;
            ASS ass2 = aq5.A08;
            axy.A00 = ass2.A0G;
            AQK aqk = aq5.A0T;
            int i = aq5.A01;
            int i2 = aq5.A00;
            boolean z = true;
            boolean z2 = false;
            if (ass2 != null) {
                z2 = true;
            }
            AnonymousClass0a4.A0C(z2, "Error: execute() called before init().");
            Pair A002 = C192478Ku.A00(ass2.A07, i, i2);
            ASV asv = new ASV();
            asv.A08 = ass2.A0K;
            asv.A06 = ass2.A0I;
            asv.A07 = ass2.A0H;
            asv.A09 = String.valueOf(System.currentTimeMillis());
            asv.A05 = ass2.A0G;
            ASZ asz = new ASZ();
            int intValue5 = ((Integer) A002.first).intValue();
            asz.A04 = intValue5;
            asz.A02 = ((Integer) A002.second).intValue();
            asz.A00 = ass2.A05;
            asz.A01 = ass2.A06;
            asz.A05 = "baseline";
            asz.A03 = 1;
            asv.A02 = new ASX(asz);
            C23580ASb aSb = new C23580ASb();
            aSb.A00 = ass2.A01;
            aSb.A01 = ass2.A02;
            aSb.A02 = ass2.A03;
            aSb.A03 = ass2.A04;
            asv.A00 = new C23579ASa(aSb);
            Boolean bool = ass2.A08;
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            Integer num = ass2.A0C;
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            Integer num2 = ass2.A0D;
            if (num2 == null) {
                intValue2 = 0;
            } else {
                intValue2 = num2.intValue();
            }
            asv.A01 = new C23581ASc(booleanValue, intValue, intValue2);
            Integer num3 = ass2.A0A;
            if (num3 == null) {
                intValue3 = 60;
            } else {
                intValue3 = num3.intValue();
            }
            asv.A03 = Integer.valueOf(intValue3);
            Integer num4 = ass2.A0B;
            if (num4 == null) {
                intValue4 = 3;
            } else {
                intValue4 = num4.intValue();
            }
            asv.A04 = Integer.valueOf(intValue4);
            ASU asu = new ASU(asv);
            ASY asy = new ASY();
            asy.A04 = asu;
            Long l = ass2.A0F;
            if (l == null) {
                longValue = 7;
            } else {
                longValue = l.longValue();
            }
            asy.A03 = longValue;
            if (!aqk.A0C || aqk.A09 == Constants.ZERO) {
                z = false;
            }
            asy.A05 = z;
            if (z) {
                switch (aqk.A09.intValue()) {
                    case 0:
                        intValue5 = 0;
                        break;
                    case 1:
                        break;
                    case 2:
                        intValue5 = ArLinkScanControllerImpl.TARGET_IMAGE_SIZE;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid MaxDvrResLevel mapping.");
                }
                if (i < intValue5) {
                    intValue5 = i;
                }
                Pair A003 = C192478Ku.A00(intValue5, i, i2);
                int intValue6 = ((Integer) A003.first).intValue();
                asy.A02 = intValue6;
                int intValue7 = ((Integer) A003.second).intValue();
                asy.A01 = intValue7;
                asy.A00 = (int) (((float) (intValue6 * intValue7)) * aqk.A07);
            }
            ASW asw = new ASW(asy);
            aq5.A0D = asw;
            AUZ auz = aq5.A0P;
            ASU asu2 = asw.A04;
            String str2 = asu2.A05;
            String str3 = asu2.A09;
            auz.A02 = str2;
            auz.A03 = str3;
            if (aq5.A0W) {
                ark = AQ5.A00(aq5);
            } else {
                if (aq5.A0E == null) {
                    aq5.A0E = new AVQ(aq5.A03, aq5.A05, aq5.A0D, aq5.A01, aq5.A00, aq5.A0R, aq5.A0V, aq5.A0Q, aq5.A07, aq5.A0A, ((Boolean) AnonymousClass0L6.A02(aq5.A05, AnonymousClass0L7.LIVE_STREAMING, "tslog_enabled", true, (AnonymousClass04H) null)).booleanValue(), aq5.A08.A09.booleanValue());
                    aq5.A0P.A01 = true;
                }
                aq5.A0P.A00("uninitialized", "starting", "", (String) null);
                ark = aq5.A0E;
            }
            aq5.A0B = ark;
            AQ5.A04(aq5, ark.AH8());
            aq5.A0B.AdJ(new AQG(aq5));
        }
        AnonymousClass0Z0.A0A(-197619351, A032);
        AnonymousClass0Z0.A0A(2016022926, A03);
    }

    public final void onFail(C43791v5 r8) {
        Integer num;
        BroadcastFailureType broadcastFailureType;
        int A03 = AnonymousClass0Z0.A03(593325913);
        AQ5 aq5 = this.A00;
        aq5.A08 = (ASS) r8.A00;
        String A01 = AQ5.A01(r8);
        Object[] objArr = new Object[2];
        if (r8.A03()) {
            num = Integer.valueOf(((C28691Ms) r8.A00).mStatusCode);
        } else {
            num = null;
        }
        objArr[0] = num;
        objArr[1] = A01;
        AnonymousClass0DB.A0J("IgLiveStreamingController", "Initializing Broadcast Failure (%d): %s", objArr);
        aq5.A0R.A0D(false, A01);
        Throwable th = r8.A01;
        ASS ass = aq5.A08;
        boolean z = true;
        if (ass == null || ass.A00 != 1) {
            z = false;
        }
        if (z) {
            broadcastFailureType = BroadcastFailureType.InitFailureWithUserMessage;
        } else {
            broadcastFailureType = BroadcastFailureType.InitFailure;
        }
        aq5.A0D(broadcastFailureType, new C23588ASm("API broadcast Init", A01, th));
        AnonymousClass0Z0.A0A(-975934494, A03);
    }
}
