package p000X;

import android.os.SystemClock;
import com.facebook.C0003R;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;

/* renamed from: X.AWN */
public abstract class AWN {
    public void A02() {
        AYG ayg;
        AWN awn;
        int i;
        if (this instanceof C23754Aag) {
            ayg = ((C23754Aag) this).A00;
        } else if (this instanceof C23752Aae) {
            C23752Aae aae = (C23752Aae) this;
            C23859AcX acX = aae.A01;
            acX.A06.BgR(true);
            acX.A09.A03();
            A00(aae.A00);
            return;
        } else if (!(this instanceof C25275BBq)) {
            if (this instanceof AVT) {
                AVT avt = (AVT) this;
                AVQ avq = avt.A01;
                int i2 = avq.A07;
                float f = 1.0f;
                if (i2 != 0) {
                    f = (((float) avq.A08) * 1.0f) / ((float) i2);
                }
                AVR avr = avq.A0B;
                C23983Ael.A02(AVR.A0I, "initializeLiveStream", new Object[0]);
                LiveStreamingClient liveStreamingClient = avr.A01;
                if (liveStreamingClient != null) {
                    liveStreamingClient.updateAspectRatio(f);
                    avr.A03 = AVW.INITIALIZED_STREAMING;
                }
                awn = avt.A00;
            } else if (this instanceof AR7) {
                AR7 ar7 = (AR7) this;
                C23674AXl aXl = ar7.A01.A05;
                if (aXl != null) {
                    aXl.BqO(true, ar7.A00);
                    return;
                }
                AWN awn2 = ar7.A00;
                if (awn2 != null) {
                    awn2.A02();
                    return;
                }
                return;
            } else if (this instanceof AR3) {
                C23553AQx.A02(((AR3) this).A00);
                return;
            } else if (this instanceof AR6) {
                AR6 ar6 = (AR6) this;
                C23674AXl aXl2 = ar6.A00.A05;
                if (aXl2 != null) {
                    aXl2.BaJ(true, new AR5(ar6));
                    return;
                }
                return;
            } else if (this instanceof AQG) {
                AQ5 aq5 = ((AQG) this).A00;
                if (aq5.A0I) {
                    aq5.A0M = true;
                    return;
                } else {
                    C12670hC.A04(new C23488AOk(aq5, aq5.A08));
                    return;
                }
            } else if (this instanceof ARV) {
                ARV arv = (ARV) this;
                try {
                    AQ5.A00(arv.A00).AdJ(new ARW(arv));
                    arv.A00.A02 = SystemClock.elapsedRealtime();
                    return;
                } catch (Exception e) {
                    AQ5.A06(arv.A00, "2p session creation failed", e);
                    return;
                }
            } else if (this instanceof ARW) {
                AQ5 aq52 = ((ARW) this).A00.A00;
                DLog.m40d(DLogTag.LIVE, "Completed LiveSwap", new Object[0]);
                C23674AXl aXl3 = aq52.A0C;
                AnonymousClass0a4.A06(aXl3);
                aq52.A0B = aXl3;
                AQ5.A04(aq52, aXl3.AH8());
                aq52.A0B.Bg3(aq52.A0L);
                aq52.A0J = false;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!AQ5.A07(aq52) && aq52.A0B != null) {
                    AQ5.A04(aq52, BroadcastType.LIVESWAP_RTC);
                    aq52.A0B.BtB();
                    AQ5.A03(aq52, C23486AOi.LIVE_SWAP);
                    AWZ.A01(aq52.A07, aq52.A09());
                    aq52.A07 = null;
                    AVQ avq2 = aq52.A0E;
                    if (avq2 != null) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        AnonymousClass79M r12 = aq52.A0R;
                        long audioPts = avq2.A0B.A00.getAudioPts();
                        long videoPts = aq52.A0E.A0B.A00.getVideoPts();
                        long audioPtsStreamTime = aq52.A0E.A0B.A00.getAudioPtsStreamTime();
                        long j = elapsedRealtime2 - aq52.A02;
                        long j2 = elapsedRealtime2 - elapsedRealtime;
                        AnonymousClass0P4 A00 = AnonymousClass79M.A00(r12, Constants.A0Q);
                        String d = Double.toString(0.0d);
                        A00.A0G("audio_buffer_duration_seconds", d);
                        A00.A0G("video_buffer_duration_seconds", d);
                        A00.A0G(C193418Ps.$const$string(117), Double.toString((double) (((float) audioPts) / 1000.0f)));
                        A00.A0G(C193418Ps.$const$string(123), Double.toString((double) (((float) videoPts) / 1000.0f)));
                        A00.A0G("last_audio_pts_streamtime", Double.toString((double) (((float) audioPtsStreamTime) / 1000.0f)));
                        A00.A0G("call_started_to_socket_writability_latency_seconds", Double.toString((double) (((float) j) / 1000.0f)));
                        A00.A0G("call_joined_to_socket_writability_latency_seconds", Double.toString((double) (((float) j2) / 1000.0f)));
                        AnonymousClass0WN.A01(r12.A0N).BcG(A00);
                        i = 0;
                        aq52.A0E.BaJ(false, (AWZ) null);
                        aq52.A03 = aq52.A0E.AYh();
                        aq52.A0E = null;
                    } else {
                        i = 0;
                    }
                    DLog.m40d(DLogTag.LIVE, "Complete LiveSwap", new Object[i]);
                    return;
                }
                return;
            } else if (this instanceof ARJ) {
                ARJ arj = (ARJ) this;
                ARK ark = arj.A00.A0B;
                if (ark != null) {
                    ark.BaJ(true, new ARI(arj, ark));
                    return;
                }
                return;
            } else if (this instanceof C23532AQc) {
                C23532AQc aQc = (C23532AQc) this;
                ARK ark2 = aQc.A01.A0B;
                if (ark2 != null) {
                    ark2.BqO(aQc.A02, aQc.A00);
                    return;
                } else {
                    A00(aQc.A00);
                    return;
                }
            } else if (this instanceof C23816Abk) {
                C23816Abk abk = (C23816Abk) this;
                abk.A00.A00.A05.A09(abk.A01, abk.A02);
                return;
            } else if (this instanceof C23821Abp) {
                C23821Abp abp = (C23821Abp) this;
                C23815Abj abj = abp.A01;
                String str = abp.A02;
                C23828Abw abw = abj.A01;
                C23820Abo abo = abw != null ? (C23820Abo) abw.A03.A02.get(str) : null;
                if (abo == null) {
                    C23815Abj.A00(abj, new C23820Abo(str, C23826Abu.DISMISSED));
                } else {
                    abo.A00(C23826Abu.DISMISSED);
                    abj.A06(abo);
                    C23839AcA acA = abj.A00;
                    if (acA != null) {
                        acA.BDt(abo);
                    }
                }
                awn = abp.A00;
            } else if (this instanceof C23811Abf) {
                AnonymousClass79M r2 = ((C23811Abf) this).A01.A01.A05;
                AnonymousClass0WN.A01(r2.A0N).BcG(AnonymousClass79M.A00(r2, Constants.A0U));
                return;
            } else if (this instanceof C23698AYj) {
                C23700AYl aYl = ((C23698AYj) this).A00.A00;
                if (aYl != null) {
                    C12670hC.A04(new C23697AYi(aYl));
                    return;
                }
                return;
            } else if (this instanceof AZS) {
                AZS azs = (AZS) this;
                AZK azk = azs.A01;
                azk.A02.Azj(azk);
                awn = azs.A00;
            } else if (this instanceof AZO) {
                AZO azo = (AZO) this;
                azo.A03.A00(azo.A00, azo.A05, azo.A02, azo.A01);
                return;
            } else if (this instanceof AYB) {
                AYB ayb = (AYB) this;
                AZK azk2 = ayb.A02;
                AZK.A05(azk2, new AYC(azk2), ayb.A01);
                return;
            } else if (this instanceof C23677AXo) {
                ayg = ((C23677AXo) this).A00;
            } else {
                return;
            }
            awn.A02();
            return;
        } else {
            C25275BBq bBq = (C25275BBq) this;
            C25276BBr bBr = bBq.A00;
            A52 a52 = bBr.A03;
            if (a52 == null) {
                AnonymousClass0QD.A02("CameraClient", C193418Ps.$const$string(48));
                return;
            } else {
                bBr.A05.A02(new C25274BBp(bBq), a52.A03, a52.A02);
                return;
            }
        }
        ayg.A03();
    }

    public void A03(Exception exc) {
        AWN awn;
        AWN awn2;
        boolean z;
        AQ5 aq5;
        String str;
        AnonymousClass79M r2;
        String str2;
        String str3;
        if (!(this instanceof AYF)) {
            if (this instanceof C23752Aae) {
                C23752Aae aae = (C23752Aae) this;
                C23859AcX acX = aae.A01;
                acX.A06.BgR(true);
                acX.A09.A03();
                awn = aae.A00;
            } else if (!(this instanceof C25275BBq)) {
                if (this instanceof AVT) {
                    awn2 = ((AVT) this).A00;
                } else if (this instanceof AR3) {
                    ((AR3) this).A00.A0B(new ARA(BroadcastFailureType.InitFailure, "initWebRtcSession", exc.getMessage()));
                    return;
                } else if (!(this instanceof AQG)) {
                    if (this instanceof ARV) {
                        aq5 = ((ARV) this).A00;
                        str = "Stopping 1p session failed";
                    } else if (this instanceof ARW) {
                        aq5 = ((ARW) this).A00.A00;
                        str = "2p session init failed";
                    } else if (!(this instanceof C23816Abk)) {
                        if (this instanceof C23812Abg) {
                            r2 = ((C23812Abg) this).A00.A05;
                            str2 = exc.getMessage();
                            str3 = "Broadcast Event (LEFT) Failed";
                        } else if (this instanceof C23813Abh) {
                            r2 = ((C23813Abh) this).A00.A05;
                            str2 = exc.getMessage();
                            str3 = "Broadcast Event (JOINED) Failed";
                        } else if (this instanceof C23821Abp) {
                            awn2 = ((C23821Abp) this).A00;
                        } else if (this instanceof C23832Ac0) {
                            C23832Ac0 ac0 = (C23832Ac0) this;
                            C23815Abj abj = ac0.A00;
                            C23831Abz abz = abj.A01;
                            boolean z2 = false;
                            if (abz != null) {
                                z2 = true;
                            }
                            AnonymousClass0a4.A0A(z2);
                            C13300iJ A02 = abj.A04.A02(ac0.A01);
                            AnonymousClass0a4.A06(A02);
                            String AZn = A02.AZn();
                            String string = abz.A07.getString(C0003R.string.live_broadcast_remove_guest_failure, new Object[]{AZn});
                            Integer num = Constants.A0C;
                            C51512Ky r0 = new C51512Ky();
                            r0.A07 = num;
                            r0.A09 = string;
                            C11130eT.A01.BXT(new C33441cv(r0.A00()));
                            if (!ac0.A00.A09().isEmpty()) {
                                ac0.A00.A0B(true);
                                return;
                            } else {
                                ac0.A00.A01.A02();
                                return;
                            }
                        } else if (this instanceof C23811Abf) {
                            C23811Abf abf = (C23811Abf) this;
                            AnonymousClass79M r3 = abf.A01.A01.A05;
                            AnonymousClass0P4 A00 = AnonymousClass79M.A00(r3, Constants.A0V);
                            A00.A0G("error_message", exc.getMessage());
                            AnonymousClass0WN.A01(r3.A0N).BcG(A00);
                            abf.A00.A03(exc);
                            return;
                        } else if (this instanceof C23698AYj) {
                            C23700AYl aYl = ((C23698AYj) this).A00.A00;
                            if (aYl != null) {
                                C12670hC.A04(new C23697AYi(aYl));
                                return;
                            }
                            return;
                        } else if (this instanceof AZS) {
                            AZS azs = (AZS) this;
                            AZK azk = azs.A01;
                            azk.A02.Azj(azk);
                            awn2 = azs.A00;
                        } else if (this instanceof AZO) {
                            AZO azo = (AZO) this;
                            AnonymousClass0QD.A02("WebRtcConnectionFactory", C06360Ot.formatString("Could not release WebRtcConnection instance: %s", azo.A04.A0L));
                            azo.A03.A00(azo.A00, azo.A05, azo.A02, azo.A01);
                            return;
                        } else if (this instanceof AYB) {
                            awn = ((AYB) this).A01;
                        } else {
                            return;
                        }
                        r2.A0C(str3, str2);
                        return;
                    } else {
                        C23816Abk abk = (C23816Abk) this;
                        C23815Abj abj2 = abk.A00.A00;
                        boolean z3 = false;
                        if (abj2.A01 != null) {
                            z3 = true;
                        }
                        AnonymousClass0a4.A0A(z3);
                        abj2.A09.add(abk.A02);
                        C23815Abj abj3 = abk.A00.A00;
                        C23831Abz abz2 = abj3.A01;
                        C13300iJ A022 = abj3.A04.A02(abk.A02);
                        AnonymousClass0a4.A06(A022);
                        abz2.A04(A022, abk.A00.A00.A07);
                        return;
                    }
                    AQ5.A06(aq5, str, exc);
                    return;
                } else {
                    AQG aqg = (AQG) this;
                    AQ5 aq52 = aqg.A00;
                    if (exc instanceof ARA) {
                        ARA ara = (ARA) exc;
                        aq52.A0D(ara.A00, new C23588ASm(ara.A01, ara.getMessage(), exc));
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        aqg.A00.A0D(BroadcastFailureType.InitFailure, new C23588ASm("ApiInitBroadcast", (String) null, exc));
                        return;
                    }
                    return;
                }
                awn2.A03(exc);
                return;
            } else {
                ((C25275BBq) this).A00.A0F.A02(new BC3(exc));
                return;
            }
            A01(awn, exc);
            return;
        }
        String A05 = C06360Ot.formatString("confirm failed: %s", ((AYF) this).A01.toString());
        AnonymousClass0DB.A0G("VideoCallRealtimeEventHandler", A05, exc);
        AnonymousClass0QD.A05("videocall-mqtt-messaging", A05, exc);
    }

    public static void A00(AWN awn) {
        if (awn != null) {
            C12670hC.A04(new AWP(awn));
        }
    }

    public static void A01(AWN awn, Exception exc) {
        if (awn != null) {
            C12670hC.A04(new AWO(awn, exc));
        }
    }
}
