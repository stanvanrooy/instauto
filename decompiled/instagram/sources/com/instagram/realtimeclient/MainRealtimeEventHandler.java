package com.instagram.realtimeclient;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.instagram.realtimeclient.DirectRealtimePayload;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeEvent;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0IT;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0ZA;
import p000X.C12670hC;
import p000X.C16180oA;
import p000X.C55622b2;

public class MainRealtimeEventHandler extends DirectRealtimeEventHandler {
    public static final Charset CHARSET_UTF8 = Charset.forName("UTF-8");
    public static final Handler MAIN_THREAD_HANDLER = new Handler(Looper.getMainLooper());
    public static final Class TAG = MainRealtimeEventHandler.class;
    public static final long TTL_MS = TimeUnit.SECONDS.toMillis(10);
    public final Map mMessageDeliveryCallbacks = new HashMap();
    public final Map mProtocolDelegates = new HashMap();
    public final RealtimeStore mStore = new RealtimeStore();
    public final List mSupportedSkywalkerMessageTypes = new ArrayList();
    public final Runnable mTimeoutCallback = new Runnable() {
        public void run() {
            MainRealtimeEventHandler.onTimeout(MainRealtimeEventHandler.this);
        }
    };
    public final AnonymousClass0IT mUserPreferencesProvider;

    public interface Delegate {
        String getProtocol();

        int getSkywalkerMessageType();

        void handleRealtimeOperation(RealtimeOperation realtimeOperation);
    }

    public List getMqttTopicsToHandle() {
        return Arrays.asList(new String[]{RealtimeConstants.MQTT_TOPIC_REGION_HINT, RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE, RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, RealtimeConstants.MQTT_TOPIC_SKYWALKER});
    }

    public void onRealtimeEventPayload(String str, String str2, String str3) {
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -931817442) {
                if (hashCode == 145554904 && str.equals(RealtimeConstants.MQTT_TOPIC_REGION_HINT)) {
                    c = 0;
                }
            } else if (str.equals(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE)) {
                c = 1;
            }
            if (c != 0) {
                onRealtimeEvent(str, RealtimeEvent__JsonHelper.parseFromJson(str3));
            } else {
                handleMqttRegionHintMessage(str3.getBytes(CHARSET_UTF8));
            }
        } catch (IOException e) {
            throw new IllegalStateException("error parsing realtime event from skywalker", e);
        }
    }

    /* renamed from: com.instagram.realtimeclient.MainRealtimeEventHandler$5 */
    public /* synthetic */ class C00485 {

        /* renamed from: $SwitchMap$com$instagram$realtimeclient$DirectRealtimePayload$Action */
        public static final /* synthetic */ int[] f149x6771e519;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[DirectRealtimePayload.Action.values().length];
            f149x6771e519 = iArr;
            iArr[DirectRealtimePayload.Action.ACK.ordinal()] = 1;
            iArr[DirectRealtimePayload.Action.UNSEEN_COUNT.ordinal()] = 2;
        }
    }

    public static MainRealtimeEventHandler create(final AnonymousClass0C1 r2) {
        return new MainRealtimeEventHandler(new AnonymousClass0IT() {
            public C16180oA get() {
                return C16180oA.A00(AnonymousClass0C1.this);
            }
        });
    }

    private Delegate getDelegateForOperation(String str) {
        for (Map.Entry entry : this.mProtocolDelegates.entrySet()) {
            if (str.startsWith((String) entry.getKey())) {
                return (Delegate) entry.getValue();
            }
        }
        return null;
    }

    private void handleMqttRegionHintMessage(byte[] bArr) {
        ((C16180oA) this.mUserPreferencesProvider.get()).A00.edit().putString("realtime_mqtt_request_routing_region", new RegionHintMessage(bArr).mRegion).apply();
    }

    public static void handleOperation(MainRealtimeEventHandler mainRealtimeEventHandler, RealtimeOperation realtimeOperation) {
        Delegate delegateForOperation = mainRealtimeEventHandler.getDelegateForOperation(realtimeOperation.path);
        if (delegateForOperation != null) {
            delegateForOperation.handleRealtimeOperation(realtimeOperation);
            return;
        }
        String name = TAG.getName();
        AnonymousClass0QD.A01(name, "Operation not handled, op: " + realtimeOperation.f152op + " path: " + realtimeOperation.path + " val: " + realtimeOperation.value);
    }

    public static void onAckEvent(MainRealtimeEventHandler mainRealtimeEventHandler, String str, Integer num, String str2, String str3, String str4, long j, Long l) {
        RealtimeClientManager.MessageDeliveryCallback messageDeliveryCallback = (RealtimeClientManager.MessageDeliveryCallback) mainRealtimeEventHandler.mMessageDeliveryCallbacks.remove(str);
        if (messageDeliveryCallback == null) {
            return;
        }
        if (num == null || num.intValue() != 200) {
            messageDeliveryCallback.onFailure(num, str2);
            return;
        }
        messageDeliveryCallback.onSuccess(str3, str4, j, l);
    }

    private void onDirectEvent(final RealtimeEvent realtimeEvent) {
        C12670hC.A04(new Runnable() {
            public void run() {
                RealtimeEvent realtimeEvent = realtimeEvent;
                if (realtimeEvent.action.ordinal() == 0) {
                    MainRealtimeEventHandler mainRealtimeEventHandler = MainRealtimeEventHandler.this;
                    DirectRealtimePayload directRealtimePayload = realtimeEvent.payload;
                    String str = directRealtimePayload.clientRequestId;
                    if (str == null) {
                        str = directRealtimePayload.clientContext;
                    }
                    MainRealtimeEventHandler.onAckEvent(mainRealtimeEventHandler, str, realtimeEvent.statusCode, directRealtimePayload.message, directRealtimePayload.threadId, directRealtimePayload.itemId, directRealtimePayload.timestamp, directRealtimePayload.ttlMs);
                }
            }
        });
    }

    private void onPatchEvent(final RealtimeEvent realtimeEvent, String str) {
        C12670hC.A04(new Runnable() {
            public void run() {
                for (RealtimeOperation realtimeOperation : realtimeEvent.operations) {
                    if (MainRealtimeEventHandler.this.mStore.patchStoreWithOperation(realtimeOperation)) {
                        MainRealtimeEventHandler.handleOperation(MainRealtimeEventHandler.this, realtimeOperation);
                    }
                }
            }
        });
    }

    public static void onTimeout(MainRealtimeEventHandler mainRealtimeEventHandler) {
        Iterator it = mainRealtimeEventHandler.mMessageDeliveryCallbacks.values().iterator();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (it.hasNext()) {
            RealtimeClientManager.MessageDeliveryCallback messageDeliveryCallback = (RealtimeClientManager.MessageDeliveryCallback) it.next();
            if (elapsedRealtime - messageDeliveryCallback.mStartSendingTimestampInMs > TTL_MS) {
                it.remove();
                messageDeliveryCallback.onTimeout();
            }
        }
    }

    public void addProtocolDelegate(String str, Delegate delegate) {
        this.mProtocolDelegates.put(str, delegate);
        this.mSupportedSkywalkerMessageTypes.add(Integer.valueOf(delegate.getSkywalkerMessageType()));
    }

    public boolean handleRealtimeEvent(C55622b2 r8, RealtimePayload realtimePayload) {
        String str = r8.A00;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -931817442:
                    if (str.equals(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE)) {
                        c = 1;
                        break;
                    }
                    break;
                case 145554904:
                    if (str.equals(RealtimeConstants.MQTT_TOPIC_REGION_HINT)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1943914206:
                    if (str.equals(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE)) {
                        c = 2;
                        break;
                    }
                    break;
                case 2080550674:
                    if (str.equals(RealtimeConstants.MQTT_TOPIC_SKYWALKER)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                handleMqttRegionHintMessage(r8.A01);
                return true;
            } else if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        throw new IllegalArgumentException();
                    } else if (this.mSupportedSkywalkerMessageTypes.contains(Integer.valueOf(realtimePayload.subTopic))) {
                        onRealtimeEvent(str, RealtimeEvent__JsonHelper.parseFromJson(realtimePayload.stringPayload));
                        return true;
                    }
                } else if (RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(realtimePayload.subTopic)) {
                    onRealtimeEvent(str, RealtimeEvent__JsonHelper.parseFromJson(realtimePayload.stringPayload));
                    return true;
                }
                return false;
            } else {
                onRealtimeEvent(str, RealtimeEvent__JsonHelper.parseFromJson(new String(r8.A01, CHARSET_UTF8)));
                return true;
            }
        } catch (IOException e) {
            throw new IllegalStateException("error parsing realtime event from skywalker", e);
        }
    }

    public void onRealtimeEvent(String str, RealtimeEvent realtimeEvent) {
        if (realtimeEvent.action != null) {
            onDirectEvent(realtimeEvent);
        } else if (realtimeEvent.type == RealtimeEvent.Type.PATCH) {
            onPatchEvent(realtimeEvent, str);
        }
    }

    public void onSendRealtimeCommand(String str, RealtimeClientManager.MessageDeliveryCallback messageDeliveryCallback) {
        if (str != null && messageDeliveryCallback != null) {
            messageDeliveryCallback.setStartSendingTimestampInMs(SystemClock.elapsedRealtime());
            this.mMessageDeliveryCallbacks.put(str, messageDeliveryCallback);
        } else if (messageDeliveryCallback != null) {
            AnonymousClass0QD.A04("MainRealtimeEventHandler_onSendRealtimeCommand_invalid_callback", AnonymousClass000.A0E("Invalid clientRequestId: ", str), 1);
        }
        Handler handler = MAIN_THREAD_HANDLER;
        AnonymousClass0ZA.A08(handler, this.mTimeoutCallback);
        AnonymousClass0ZA.A09(handler, this.mTimeoutCallback, TTL_MS, -1137970641);
    }

    public MainRealtimeEventHandler(AnonymousClass0IT r2) {
        this.mUserPreferencesProvider = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r6.equals(com.instagram.realtimeclient.RealtimeConstants.MQTT_TOPIC_REGION_HINT) == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r6.equals(com.instagram.realtimeclient.RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE) == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r6.equals(com.instagram.realtimeclient.RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE) == false) goto L_0x001f;
     */
    public boolean canHandleRealtimeEvent(String str, String str2) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -931817442) {
            c = 1;
        } else if (hashCode == 145554904) {
            c = 0;
        } else if (hashCode == 1943914206) {
            c = 2;
        }
        c = 65535;
        if (c == 0 || c == 1) {
            return true;
        }
        if (c == 2) {
            return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str2);
        }
        if (str2 == null || !this.mSupportedSkywalkerMessageTypes.contains(Integer.valueOf(str2))) {
            return false;
        }
        return true;
    }
}
