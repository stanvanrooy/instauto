package p000X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.net.Socket;
import java.security.cert.Certificate;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.0dk  reason: invalid class name and case insensitive filesystem */
public final class C10710dk extends AnonymousClass0UJ {
    public final AnonymousClass0UL A00;
    public final SSLSocketFactory A01;

    public C10710dk(ExecutorService executorService, SSLSocketFactory sSLSocketFactory, AnonymousClass0UL r3) {
        super(executorService);
        this.A01 = sSLSocketFactory;
        this.A00 = r3;
    }

    public final Socket A00(Socket socket, String str, int i) {
        String str2;
        int length;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C07410Sz.A01(socket.isConnected());
        SSLSocket sSLSocket = (SSLSocket) this.A01.createSocket(socket, str, i, true);
        AnonymousClass0UL r4 = this.A00;
        sSLSocket.getInputStream();
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            throw new SSLException("SSL Session is null");
        } else if ("SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
            Object[] objArr = new Object[7];
            if (sSLSocket.isClosed()) {
                str3 = "closed";
            } else {
                str3 = "open";
            }
            objArr[0] = str3;
            if (sSLSocket.isConnected()) {
                str4 = RealtimeConstants.MQTT_CONNECTED;
            } else {
                str4 = RealtimeConstants.MQTT_DISCONNECTED;
            }
            objArr[1] = str4;
            if (sSLSocket.isBound()) {
                str5 = "bound";
            } else {
                str5 = "unbound";
            }
            objArr[2] = str5;
            if (sSLSocket.isInputShutdown()) {
                str6 = "input_shutdown";
            } else {
                str6 = "input_open";
            }
            objArr[3] = str6;
            if (sSLSocket.isOutputShutdown()) {
                str7 = "output_shutdown";
            } else {
                str7 = "output_open";
            }
            objArr[4] = str7;
            objArr[5] = str;
            objArr[6] = String.valueOf(sSLSocket.getInetAddress());
            throw new SSLException(String.format((Locale) null, "SSL handshake returned an invalid session. Socket state (%s, %s, %s, %s, %s, %s, %s)", objArr));
        } else if (r4.A00.verify(str, session)) {
            return sSLSocket;
        } else {
            Object[] objArr2 = new Object[3];
            objArr2[0] = str;
            objArr2[1] = sSLSocket.getInetAddress().toString();
            try {
                Certificate[] peerCertificates = session.getPeerCertificates();
                if (peerCertificates == null || (length = peerCertificates.length) <= 0) {
                    str2 = "No certificates";
                } else {
                    str2 = String.format((Locale) null, "num: %d, %s", new Object[]{Integer.valueOf(length), peerCertificates[0].toString()});
                }
            } catch (SSLException e) {
                str2 = AnonymousClass000.A0E("Exception getting certificates ", e.toString());
            }
            objArr2[2] = str2;
            throw new SSLException(String.format((Locale) null, "could not verify hostname for (%s, %s). (%s)", objArr2));
        }
    }
}
