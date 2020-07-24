package p000X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.regex.Pattern;
import org.webrtc.AudioTrack;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;

/* renamed from: X.AZf */
public final /* synthetic */ class AZf implements Runnable {
    public final /* synthetic */ AZA A00;
    public final /* synthetic */ SessionDescription A01;

    public /* synthetic */ AZf(AZA aza, SessionDescription sessionDescription) {
        this.A00 = aza;
        this.A01 = sessionDescription;
    }

    public final void run() {
        AZA aza = this.A00;
        SessionDescription sessionDescription = this.A01;
        AZh aZh = new AZh(sessionDescription.description);
        aZh.A03(aza.A00.A01.A04);
        String str = aza.A00.A01.A05;
        Pattern compile = Pattern.compile("^a=ssrc:(\\S+) cname:(\\S+)$");
        Iterator it = aZh.A00.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (compile.matcher(str2).matches()) {
                aZh.A00.set(i, AnonymousClass000.A0J(str2.substring(0, str2.indexOf("cname:")), "cname:", str));
            }
            i++;
        }
        ListIterator listIterator = aZh.A00.listIterator();
        while (listIterator.hasNext()) {
            if (((String) listIterator.next()).startsWith("a=rtcp-fb:111 transport-cc")) {
                listIterator.set("a=rtcp-fb:111 nack");
            }
        }
        Iterator it2 = aza.A00.A01.A06.iterator();
        while (it2.hasNext()) {
            aZh.A03(aza.A00.A01.A04);
            AZh.A02(aZh, ((C23713AZs) it2.next()).toString(), false);
        }
        SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, aZh.toString());
        AZK azk = aza.A00;
        azk.A0H = false;
        azk.A0I = false;
        azk.A0B = sessionDescription2;
        C23700AYl aYl = azk.A00;
        String str3 = sessionDescription2.description;
        HashMap hashMap = new HashMap();
        AudioTrack audioTrack = azk.A05;
        if (audioTrack != null) {
            hashMap.put(audioTrack.mo50516id(), Boolean.valueOf(azk.A05.enabled()));
        } else {
            hashMap.put(azk.A09.mo50739id(), false);
        }
        VideoTrack videoTrack = azk.A0E;
        if (videoTrack != null) {
            hashMap.put(videoTrack.mo50516id(), Boolean.valueOf(azk.A0E.enabled()));
        } else {
            hashMap.put(azk.A0A.mo50739id(), false);
        }
        if (aYl != null) {
            C12670hC.A04(new AYI(aYl, str3, hashMap));
        }
    }
}
