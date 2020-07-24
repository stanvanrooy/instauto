package p000X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;

/* renamed from: X.AZg */
public final /* synthetic */ class AZg implements Runnable {
    public final /* synthetic */ AZK A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public /* synthetic */ AZg(AZK azk, String str, Map map) {
        this.A00 = azk;
        this.A01 = str;
        this.A02 = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r0.enabled() == false) goto L_0x0031;
     */
    public final void run() {
        int i;
        int indexOf;
        AZK azk = this.A00;
        String str = this.A01;
        Map map = this.A02;
        if (azk.A07 != null) {
            AZh aZh = new AZh(str);
            AZi aZi = azk.A01;
            int i2 = aZi.A00;
            if (i2 > 0) {
                AZh.A01(aZh, 1 - aZi.A04.intValue() != 0 ? "ISAC" : "OPUS", 0, i2, false);
            }
            VideoTrack videoTrack = azk.A0E;
            if (videoTrack != null) {
                i = 1;
            }
            i = 0;
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = aZh.A00.listIterator();
            Boolean bool = false;
            while (listIterator.hasNext()) {
                String str2 = (String) listIterator.next();
                if (str2.startsWith("m=")) {
                    bool = Boolean.valueOf(str2.startsWith(AnonymousClass000.A0J("m=", MediaStreamTrack.VIDEO_TRACK_KIND, " ")));
                } else if (bool.booleanValue() && str2.startsWith("a=ssrc:") && (indexOf = str2.indexOf(" label:")) >= 0) {
                    arrayList.add(str2.substring(indexOf + 7).trim());
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (map == null || (r1 = strArr.length) <= 0) {
                i += strArr.length;
            } else {
                for (String str3 : strArr) {
                    Boolean bool2 = (Boolean) map.get(str3);
                    if (bool2 == null || bool2.booleanValue()) {
                        i++;
                    }
                }
            }
            Iterator it = azk.A01.A06.iterator();
            while (it.hasNext()) {
                aZh.A03(azk.A01.A04);
                AZh.A02(aZh, ((C23713AZs) it.next()).toString(), false);
            }
            for (C23713AZs aZs : C23713AZs.values()) {
                C23710AZl aZl = azk.A01.A03;
                AZh.A01(aZh, aZs.toString(), aZl.AWZ(i), aZl.APV(i), true);
            }
            azk.A0C = new SessionDescription(SessionDescription.Type.ANSWER, aZh.toString());
            azk.A0N.clear();
            azk.A0N.putAll(map);
            SessionDescription sessionDescription = azk.A0B;
            AnonymousClass0a4.A06(sessionDescription);
            PeerConnection peerConnection = azk.A07;
            SdpObserver sdpObserver = azk.A0Q;
            AnonymousClass0a4.A06(sessionDescription);
            peerConnection.setLocalDescription(sdpObserver, sessionDescription);
        }
    }
}
