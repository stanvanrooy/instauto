package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.EglBase;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpSender;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: X.AZK */
public final class AZK {
    public C23700AYl A00;
    public AZi A01;
    public AZX A02;
    public AZU A03;
    public AudioSource A04;
    public AudioTrack A05;
    public EglBase A06;
    public PeerConnection A07;
    public PeerConnectionFactory A08;
    public RtpSender A09;
    public RtpSender A0A;
    public SessionDescription A0B;
    public SessionDescription A0C;
    public VideoSource A0D;
    public VideoTrack A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final AZW A0K = new AZW(this);
    public final String A0L;
    public final Map A0M = new HashMap();
    public final Map A0N = new HashMap();
    public final ExecutorService A0O;
    public final PeerConnection.Observer A0P = new C23706AYs(this);
    public final SdpObserver A0Q = new AZA(this);
    public final JavaAudioDeviceModule.AudioRecordErrorCallback A0R = new AZP(this);
    public final JavaAudioDeviceModule.AudioTrackErrorCallback A0S = new AZQ(this);

    public static void A02(AZK azk) {
        azk.A0G = false;
        A05(azk, new AZ2(azk), new AZS(azk, new C23698AYj(azk)));
    }

    public static AZM A00(AZK azk, String str, MediaStream mediaStream) {
        List<MediaStreamTrack> list = mediaStream.audioTracks;
        HashSet<Object> hashSet = new HashSet<>(list.size());
        for (MediaStreamTrack id : list) {
            hashSet.add(id.mo50516id());
        }
        List<MediaStreamTrack> list2 = mediaStream.videoTracks;
        HashSet<Object> hashSet2 = new HashSet<>(list2.size());
        for (MediaStreamTrack id2 : list2) {
            hashSet2.add(id2.mo50516id());
        }
        C04450Ea r3 = new C04450Ea();
        for (Object put : hashSet) {
            r3.put(put, true);
        }
        C04450Ea r2 = new C04450Ea();
        for (Object put2 : hashSet2) {
            r2.put(put2, true);
        }
        AZM azm = new AZM(str, r3, r2);
        Map map = azk.A0N;
        return new AZM(azm.A00, AZM.A00(azm.A01, map), AZM.A00(azm.A02, map));
    }

    public static List A01(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MediaStream mediaStream = (MediaStream) it.next();
            arrayList.addAll(mediaStream.audioTracks);
            arrayList.addAll(mediaStream.videoTracks);
        }
        return arrayList;
    }

    public static void A03(AZK azk) {
        RtpSender rtpSender = azk.A09;
        if (rtpSender != null) {
            rtpSender.setTrack((MediaStreamTrack) null, false);
        }
        AudioTrack audioTrack = azk.A05;
        if (audioTrack != null) {
            audioTrack.setEnabled(false);
            azk.A05.dispose();
            azk.A05 = null;
        }
        AudioSource audioSource = azk.A04;
        if (audioSource != null) {
            audioSource.dispose();
            azk.A04 = null;
        }
    }

    public static void A04(AZK azk) {
        RtpSender rtpSender = azk.A0A;
        if (rtpSender != null) {
            rtpSender.setTrack((MediaStreamTrack) null, false);
        }
        VideoTrack videoTrack = azk.A0E;
        if (videoTrack != null) {
            videoTrack.setEnabled(false);
            azk.A0E.dispose();
            azk.A0E = null;
        }
        AZU azu = azk.A03;
        if (azu != null) {
            if (azu.A00) {
                azu.A02.stopListening();
                azu.A00 = false;
            }
            AZU azu2 = azk.A03;
            if (azu2.A00) {
                azu2.A02.stopListening();
                azu2.A00 = false;
            }
            azu2.A02.dispose();
            azk.A03 = null;
        }
        VideoSource videoSource = azk.A0D;
        if (videoSource != null) {
            videoSource.dispose();
            azk.A0D = null;
        }
    }

    public static void A05(AZK azk, Runnable runnable, AWN awn) {
        try {
            if (azk.A0O.isShutdown() || azk.A0O.isTerminated()) {
                throw new RejectedExecutionException("Action scheduled on dead executor.");
            }
            AnonymousClass0Z9.A03(azk.A0O, new AY8(runnable, awn), -303402969);
        } catch (RejectedExecutionException e) {
            AnonymousClass0DB.A0H("WebRtcConnectionImpl", "Execution is safely rejected.", e);
            AWN.A00(awn);
        } catch (Exception e2) {
            if (awn != null) {
                AWN.A01(awn, e2);
                return;
            }
            throw e2;
        }
    }

    public void addRemoteStream(String str, MediaStream mediaStream) {
        this.A0M.put(str, mediaStream);
        for (MediaStreamTrack mediaStreamTrack : A01(Collections.singleton(mediaStream))) {
            if (!isRemoteTrackEnabled(mediaStreamTrack.mo50516id())) {
                mediaStreamTrack.setEnabled(false);
            }
        }
    }

    public boolean isRemoteTrackEnabled(String str) {
        Boolean bool = (Boolean) this.A0N.get(str);
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public AZK(ExecutorService executorService, String str, AZi aZi, Context context, AZX azx) {
        this.A0O = executorService;
        this.A0L = str;
        A05(this, new C23993AfC(this, aZi, context, azx), (AWN) null);
    }
}
