package p000X;

import android.text.TextUtils;
import com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

/* renamed from: X.AZz */
public abstract class AZz implements C11200ea {
    public final String A00;

    public void A00(Aa0 aa0) {
        C23823Abr abr;
        C23826Abu abu;
        C23820Abo abo;
        C23826Abu abu2;
        if (this instanceof AZv) {
            AZv aZv = (AZv) this;
            IgVideoRealtimeEventPayload$Type igVideoRealtimeEventPayload$Type = ((C23719Aa1) aa0).A00.A02;
            if (igVideoRealtimeEventPayload$Type.ordinal() != 1) {
                AnonymousClass0DB.A0K("LiveWithRtcSession", "Unexpected IgLiveWithSessionEvent type: %s", igVideoRealtimeEventPayload$Type);
                return;
            }
            aZv.A00.A03();
        } else if (this instanceof C23833Ac1) {
            C23823Abr abr2 = ((C23833Ac1) this).A00.A03;
            C23823Abr.A01(abr2, abr2.A01, C23826Abu.DISMISSED);
        } else if (this instanceof C23829Abx) {
            C23829Abx abx = (C23829Abx) this;
            C23720Aa2 aa2 = (C23720Aa2) aa0;
            String str = aa2.A02;
            switch (aa2.A01.ordinal()) {
                case 0:
                    C23823Abr.A02(abx.A00.A03, str, C23826Abu.ACTIVE);
                    return;
                case 1:
                    C23823Abr abr3 = abx.A00.A03;
                    if (aa2.A00 >= 3000) {
                        C23823Abr.A02(abr3, str, C23826Abu.STALLED);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (!(this instanceof C23824Abs)) {
            C23827Abv abv = (C23827Abv) this;
            C23838Ac6 ac6 = (C23838Ac6) aa0;
            C23837Ac5 ac5 = ac6.A00;
            int i = ac5.A00;
            C23828Abw abw = abv.A00;
            if (i >= abw.A00) {
                C23823Abr abr4 = abw.A03;
                String str2 = ac5.A03;
                Integer num = ac5.A02;
                C23820Abo A002 = C23823Abr.A00(abr4, str2);
                switch (num.intValue()) {
                    case 1:
                    case 5:
                        abu2 = C23826Abu.DISCONNECTED;
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case C120125Dh.VIEW_TYPE_BANNER:
                    case C120125Dh.VIEW_TYPE_SPINNER:
                        abu2 = C23826Abu.UNREACHABLE;
                        break;
                    case 3:
                        abu2 = C23826Abu.REJECTED;
                        break;
                    case 6:
                    case 7:
                        abu2 = C23826Abu.INVITED;
                        break;
                    case 8:
                        abu2 = C23826Abu.CONNECTING;
                        break;
                    case 9:
                        abu2 = C23826Abu.CONNECTED;
                        break;
                    default:
                        abu2 = C23826Abu.UNKNOWN;
                        break;
                }
                C23823Abr.A01(abr4, A002, abu2);
                abv.A00.A00 = ac6.A00.A00;
            }
        } else {
            C23824Abs abs = (C23824Abs) this;
            Aa3 aa3 = (Aa3) aa0;
            String str3 = aa3.A01;
            switch (aa3.A00.ordinal()) {
                case 0:
                    C23823Abr abr5 = abs.A00.A03;
                    if (str3 != null) {
                        try {
                            abo = C23823Abr.A00(abr5, str3);
                        } catch (NoSuchElementException e) {
                            AnonymousClass0DB.A0K("ConferenceState", "onMediaStreamAdded:  Unknown participant %s", str3, e);
                            AnonymousClass0QD.A05("ConferenceState", AnonymousClass000.A0E("Media stream added for missing participant: ", str3), e);
                            return;
                        }
                    } else {
                        abo = (C23820Abo) abr5.A03(new HashSet(Arrays.asList(new C23826Abu[]{C23826Abu.CONNECTING, C23826Abu.INVITED}))).iterator().next();
                    }
                    if (abo != null) {
                        C23823Abr.A01(abr5, abo, C23826Abu.CONNECTED);
                        return;
                    }
                    return;
                case 1:
                    abr = abs.A00.A03;
                    abu = C23826Abu.DISCONNECTED;
                    break;
                case 2:
                    abr = abs.A00.A03;
                    abu = C23826Abu.ACTIVE;
                    break;
                default:
                    return;
            }
            C23823Abr.A02(abr, str3, abu);
        }
    }

    public boolean A01(Aa0 aa0) {
        if (!(this instanceof AZv)) {
            return true;
        }
        AZv aZv = (AZv) this;
        return aZv.A00 != null && aZv.A00.A06.contains(((C23719Aa1) aa0).A00.A02);
    }

    public AZz(String str) {
        AnonymousClass0a4.A09(!TextUtils.isEmpty(str));
        this.A00 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        boolean z;
        int A03 = AnonymousClass0Z0.A03(1849254559);
        Aa0 aa0 = (Aa0) obj;
        int A032 = AnonymousClass0Z0.A03(-983374954);
        String str = this.A00;
        String str2 = aa0.A00;
        if (str2 != null) {
            boolean equals = str2.equals(str);
            z = true;
        }
        z = false;
        if (z && A01(aa0)) {
            A00(aa0);
        }
        AnonymousClass0Z0.A0A(36246512, A032);
        AnonymousClass0Z0.A0A(-1805429480, A03);
    }
}
