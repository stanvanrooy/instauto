package com.instagram.react.modules.base;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.tigon.iface.TigonRequest;
import com.google.common.p003io.Closeables;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p000X.A0j;
import p000X.A1e;
import p000X.A44;
import p000X.A47;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BZ;
import p000X.AnonymousClass1C4;
import p000X.AnonymousClass1C5;
import p000X.C06590Pq;
import p000X.C12810hQ;
import p000X.C15910nj;
import p000X.C16090o1;
import p000X.C17190pp;
import p000X.C17740qj;
import p000X.C17780qn;
import p000X.C17850qu;
import p000X.C205818rU;
import p000X.C205918rf;
import p000X.C206528ta;
import p000X.C206538tb;
import p000X.C206548td;
import p000X.C206558te;
import p000X.C228259s1;
import p000X.C23041A0r;
import p000X.C23043A0y;
import p000X.C25951Ba;
import p000X.C25961Bb;
import p000X.C26141Bv;

@ReactModule(name = "Networking")
public class IgNetworkingModule extends NativeNetworkingAndroidSpec implements A47 {
    public static final String CONTENT_LENGTH_HEADER_NAME = "content-length";
    public static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    public static final String MODULE_NAME = "Networking";
    public static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    public static final String REQUEST_BODY_KEY_STRING = "string";
    public static final String REQUEST_BODY_KEY_URI = "uri";
    public static final Class TAG = IgNetworkingModule.class;
    public final Object mEnqueuedRequestMonitor = new Object();
    public final SparseArray mEnqueuedRequests = new SparseArray();
    public final C16090o1 mResponseHandler = new C206528ta(this);
    public final C06590Pq mSession;

    public static void buildSimpleRequest(AnonymousClass1BZ r6, C17190pp[] r7, String str) {
        String str2 = null;
        if (r7 != null) {
            for (C17190pp r2 : r7) {
                if (r2.A00.equalsIgnoreCase(CONTENT_TYPE_HEADER_NAME)) {
                    str2 = r2.A01;
                } else {
                    r6.A05.add(r2);
                }
            }
        }
        if (str2 != null) {
            r6.A00 = new C205918rf(str, str2);
            return;
        }
        throw new IllegalArgumentException("Payload is set but no content-type header specified");
    }

    public void abortRequest(double d) {
        C17740qj removeRequest = removeRequest(this, (int) d);
        if (removeRequest != null) {
            removeRequest.A00();
        }
    }

    public void addListener(String str) {
    }

    public void clearCookies(Callback callback) {
    }

    public String getName() {
        return MODULE_NAME;
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public void removeListeners(double d) {
    }

    public void sendRequest(String str, String str2, double d, A1e a1e, C23043A0y a0y, String str3, boolean z, double d2, boolean z2) {
        int i = (int) d;
        try {
            sendRequestInternal(str, str2, i, a1e, a0y, str3);
        } catch (Exception e) {
            AnonymousClass0DB.A05(TAG, "Error while preparing request", e);
            onRequestError(this, i, e.getMessage());
        }
    }

    public static void addAllHeaders(AnonymousClass1BZ r4, C17190pp[] r5) {
        if (r5 != null) {
            for (C17190pp add : r5) {
                r4.A05.add(add);
            }
        }
    }

    private void buildMultipartRequest(AnonymousClass1BZ r13, C17190pp[] r14, A1e a1e) {
        C15910nj r4 = new C15910nj();
        int size = a1e.size();
        int i = 0;
        while (i < size) {
            C23043A0y map = a1e.getMap(i);
            String string = map.getString("fieldName");
            if (string != null) {
                if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                    r4.A06(string, map.getString(REQUEST_BODY_KEY_STRING));
                } else if (map.hasKey("uri")) {
                    String string2 = map.getString("uri");
                    String string3 = map.getString("name");
                    String string4 = map.getString("type");
                    if (string3 == null || string4 == null) {
                        throw new IllegalArgumentException("Incomplete payload for URI formData part");
                    }
                    Uri parse = Uri.parse(string2);
                    ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
                    long binaryContentLength = getBinaryContentLength(contentResolver, parse);
                    boolean z = false;
                    if (string != null) {
                        z = true;
                    }
                    AnonymousClass0a4.A09(z);
                    r4.A00.put(string, new C206558te(contentResolver, parse, string3, string4, binaryContentLength));
                } else {
                    throw new IllegalArgumentException("Unrecognized FormData part.");
                }
                i++;
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A05("Attribute 'name' missing for formData part at index ", i));
            }
        }
        addAllHeaders(r13, r14);
        C26141Bv A00 = r4.A00();
        if (A00 != null) {
            r13.A01(CONTENT_LENGTH_HEADER_NAME, String.valueOf(A00.getContentLength()));
            r13.A00 = A00;
        }
    }

    public static AnonymousClass1C4 buildRequest(IgNetworkingModule igNetworkingModule, String str, String str2, A1e a1e, C23043A0y a0y) {
        AnonymousClass1BZ r3 = new AnonymousClass1BZ((C25961Bb) new C25951Ba(igNetworkingModule.mSession));
        C17190pp[] extractHeaders = extractHeaders(a1e);
        if (TigonRequest.GET.equalsIgnoreCase(str)) {
            r3.A01 = Constants.A0N;
            r3.A02 = str2;
            addAllHeaders(r3, extractHeaders);
        } else if ("POST".equalsIgnoreCase(str)) {
            r3.A01 = Constants.ONE;
            r3.A02 = str2;
            if (a0y.hasKey(REQUEST_BODY_KEY_STRING)) {
                buildSimpleRequest(r3, extractHeaders, a0y.getString(REQUEST_BODY_KEY_STRING));
            } else if (a0y.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                igNetworkingModule.buildMultipartRequest(r3, extractHeaders, a0y.getArray(REQUEST_BODY_KEY_FORMDATA));
            } else {
                throw new IllegalArgumentException("Unsupported POST data type");
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A0E("Unsupported HTTP request method ", str));
        }
        return r3.A00();
    }

    public static C17190pp[] extractHeaders(A1e a1e) {
        if (a1e == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a1e.size());
        int size = a1e.size();
        for (int i = 0; i < size; i++) {
            A1e array = a1e.getArray(i);
            if (array == null || array.size() != 2) {
                throw new A0j("Unexpected structure of headers array");
            }
            arrayList.add(new C17190pp(array.getString(0), array.getString(1)));
        }
        return (C17190pp[]) arrayList.toArray(new C17190pp[arrayList.size()]);
    }

    public static long getBinaryContentLength(ContentResolver contentResolver, Uri uri) {
        long j;
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream != null) {
                j = (long) openInputStream.available();
            } else {
                j = -1;
            }
            Closeables.A01(openInputStream);
            return j;
        } catch (IOException unused) {
            return -1;
        }
    }

    public static byte[] inputStreamToByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private void onDataReceived(int i, String str) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushString(str);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("onDataReceived");
        if (eventEmitter != null) {
            eventEmitter.emit("didReceiveNetworkData", writableNativeArray);
        }
    }

    public static void onRequestError(IgNetworkingModule igNetworkingModule, int i, String str) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushString(str);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = igNetworkingModule.getEventEmitter("onRequestError");
        if (eventEmitter != null) {
            eventEmitter.emit("didCompleteNetworkResponse", writableNativeArray);
        }
    }

    private void onResponseReceived(int i, C206538tb r5) {
        C228259s1 translateHeaders = translateHeaders(r5.A02);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushInt(r5.A00);
        writableNativeArray.pushMap(translateHeaders);
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("onResponseReceived");
        if (eventEmitter != null) {
            eventEmitter.emit("didReceiveNetworkResponse", writableNativeArray);
        }
    }

    private void registerRequest(int i, C17740qj r4) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, r4);
        }
    }

    public static C17740qj removeRequest(IgNetworkingModule igNetworkingModule, int i) {
        C17740qj r1;
        synchronized (igNetworkingModule.mEnqueuedRequestMonitor) {
            r1 = (C17740qj) igNetworkingModule.mEnqueuedRequests.get(i);
            igNetworkingModule.mEnqueuedRequests.remove(i);
        }
        return r1;
    }

    private void sendRequestInternal(String str, String str2, int i, A1e a1e, C23043A0y a0y, String str3) {
        C17740qj r3 = new C17740qj();
        C17780qn A02 = C17780qn.A00(-12, new C205818rU(this, str, str2, a1e, a0y)).A02(572, new AnonymousClass1C5(r3.A00)).A02(573, this.mResponseHandler);
        registerRequest(i, r3);
        C17850qu r1 = new C17850qu(A02);
        r1.A00 = new C206548td(this, i, str3);
        C12810hQ.A02(r1);
    }

    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                C17740qj r0 = (C17740qj) this.mEnqueuedRequests.valueAt(i);
                if (r0 != null) {
                    r0.A00();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    public IgNetworkingModule(A44 a44, C06590Pq r3) {
        super(a44);
        this.mSession = r3;
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String str) {
        A44 reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    public static void onRequestSuccess(IgNetworkingModule igNetworkingModule, int i, C206538tb r5, String str) {
        String str2;
        igNetworkingModule.onResponseReceived(i, r5);
        if (str.equals("text")) {
            str2 = new String(r5.A01, Charset.forName("UTF-8"));
        } else if (str.equals("base64")) {
            str2 = Base64.encodeToString(r5.A01, 2);
        } else {
            str2 = "";
        }
        igNetworkingModule.onDataReceived(i, str2);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        writableNativeArray.pushInt(i);
        writableNativeArray.pushNull();
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = igNetworkingModule.getEventEmitter("onRequestSuccess");
        if (eventEmitter != null) {
            eventEmitter.emit("didCompleteNetworkResponse", writableNativeArray);
        }
    }

    public static C228259s1 translateHeaders(C17190pp[] r8) {
        C228259s1 A03 = C23041A0r.A03();
        for (C17190pp r4 : r8) {
            String str = r4.A00;
            if (A03.hasKey(str)) {
                A03.putString(str, AnonymousClass000.A0J(A03.getString(str), ", ", r4.A01));
            } else {
                A03.putString(str, r4.A01);
            }
        }
        return A03;
    }

    public void initialize() {
        getReactApplicationContext().A06(this);
    }
}
