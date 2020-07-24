package com.instagram.realtimeclient;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.realtimeclient.C0142L;
import com.instagram.realtimeclient.MainRealtimeEventHandler;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0O9;
import p000X.AnonymousClass0Q6;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0QD;
import p000X.StoredPreferences;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0UT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BD;
import p000X.AnonymousClass1CF;
import p000X.AnonymousClass1CH;
import p000X.C05700Lp;
import p000X.C05860Mt;
import p000X.C06300On;
import p000X.C06570Po;
import p000X.C08080Vo;
import p000X.C12670hC;
import p000X.C12690hE;
import p000X.C27381Hp;
import p000X.C55622b2;
import p000X.C56392cQ;
import p000X.C58092fI;
import p000X.C58102fM;
import p000X.C62362na;
import p000X.C62372nb;
import p000X.C62382nc;
import p000X.C68242yk;
import p000X.C68252ym;

public class RealtimeClientManager implements C06570Po {
    public static final String APP_FOREGROUND_CONDITION = "APP_FOREGROUND";
    public static final Charset CHARSET_UTF8 = Charset.forName("UTF-8");
    public static final String CLIENT_TYPE = "cookie_auth";
    public static final String DEFAULT_MQTT_HOST_NAME = "edge-mqtt.facebook.com";
    public static final int MQTT_STATE_DESTROYED = 1;
    public static final int MQTT_STATE_STARTED = 2;
    public static final int MQTT_STATE_STOPPED = 3;
    public static final int MQTT_STATE_UNSET = -1;
    public static final String SOFT_ERROR_TAG = "RealtimeClientManager";
    public static final Class TAG = RealtimeClientManager.class;
    public static GraphQLSubscriptionsProvider sGraphQLSubscriptionsProvider;
    public static final List sOtherRealtimeEventHandlerProviders = new ArrayList();
    public static RawSkywalkerSubscriptionsProvider sRawSkywalkerSubscriptionsProvider;
    public static final Set sRealtimeDelegateProviders = new HashSet();
    public final AnonymousClass0Q6 mBackgroundDetectorListener = new AnonymousClass0Q6() {
        public void onAppBackgrounded() {
            int i;
            int A03 = AnonymousClass0Z0.A03(-187291162);
            C62382nc r1 = RealtimeClientManager.this.mMqttClient;
            if (r1 == null) {
                i = -2097565683;
            } else {
                r1.BsR(false);
                RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                AnonymousClass0ZA.A08(realtimeClientManager.mDelayHandler, realtimeClientManager.mDelayStopRunnable);
                RealtimeClientManager realtimeClientManager2 = RealtimeClientManager.this;
                AnonymousClass0ZA.A09(realtimeClientManager2.mDelayHandler, realtimeClientManager2.mDelayStopRunnable, (long) realtimeClientManager2.mRealtimeClientConfig.mDelayDisconnectMQTTMS, -893005534);
                i = 1537877775;
            }
            AnonymousClass0Z0.A0A(i, A03);
        }

        public void onAppForegrounded() {
            int A03 = AnonymousClass0Z0.A03(1955666353);
            RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
            AnonymousClass0ZA.A08(realtimeClientManager.mDelayHandler, realtimeClientManager.mDelayStopRunnable);
            RealtimeClientManager.this.addKeepAliveCondition(RealtimeClientManager.APP_FOREGROUND_CONDITION);
            C62382nc r1 = RealtimeClientManager.this.mMqttClient;
            if (r1 != null) {
                r1.BsR(true);
            }
            AnonymousClass0Z0.A0A(1510223431, A03);
        }
    };
    public final Set mConnectionKeepAliveConditions = new HashSet();
    public final Context mContext;
    public final Handler mDelayHandler = new Handler(Looper.getMainLooper());
    public final Runnable mDelayStopRunnable = new Runnable() {
        public void run() {
            if (AnonymousClass0Q7.A03().A0H()) {
                RealtimeClientManager.this.removeKeepAliveCondition(RealtimeClientManager.APP_FOREGROUND_CONDITION);
            }
        }
    };
    public boolean mIsInitializingMqttClient;
    public final MainRealtimeEventHandler mMasterRealtimeEventHandler;
    public final List mMqttChannelStateChangeListeners = new ArrayList();
    public final C68252ym mMqttChannelStateListener = new C68252ym() {
        public void onChannelStateChanged(C56392cQ r7) {
            synchronized (RealtimeClientManager.this.mObservers) {
                try {
                    for (Observer onConnectionChanged : RealtimeClientManager.this.mObservers) {
                        onConnectionChanged.onConnectionChanged(r7);
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            boolean z = false;
            if (r7.A00 == Constants.ONE) {
                z = true;
            }
            if (z) {
                synchronized (RealtimeClientManager.this.mRawSkywalkerSubscriptions) {
                    try {
                        if (!RealtimeClientManager.this.mRawSkywalkerSubscriptions.isEmpty()) {
                            RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                            RealtimeClientManager.sendSkywalkerCommand(realtimeClientManager, RealtimeConstants.MQTT_TOPIC_SKYWALKER, realtimeClientManager.mRawSkywalkerSubscriptions, (List) null, C58092fI.ACKNOWLEDGED_DELIVERY);
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                synchronized (RealtimeClientManager.this.mRealtimeSubscriptions) {
                    try {
                        if (!RealtimeClientManager.this.mRealtimeSubscriptions.isEmpty()) {
                            RealtimeClientManager realtimeClientManager2 = RealtimeClientManager.this;
                            RealtimeClientManager.sendRealtimeSubscription(realtimeClientManager2, RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, realtimeClientManager2.mRealtimeSubscriptions, (List) null, C58092fI.ACKNOWLEDGED_DELIVERY);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            }
            synchronized (RealtimeClientManager.this.mMqttTopicToHandlersMap) {
                try {
                    for (RealtimeEventHandler onMqttChannelStateChanged : RealtimeClientManager.this.mMqttChannelStateChangeListeners) {
                        onMqttChannelStateChanged.onMqttChannelStateChanged(r7);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            }
        }
    };
    public C62382nc mMqttClient;
    public final C68242yk mMqttPublishArrivedListener = new C68242yk() {
        private boolean handleMessageArrived(C55622b2 r5) {
            List<RealtimeEventHandler> list;
            String str = r5.A00;
            synchronized (RealtimeClientManager.this.mMqttTopicToHandlersMap) {
                try {
                    list = (List) RealtimeClientManager.this.mMqttTopicToHandlersMap.get(str);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            synchronized (RealtimeClientManager.this.mObservers) {
                try {
                    for (Observer onMessage : RealtimeClientManager.this.mObservers) {
                        onMessage.onMessage(r5);
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            RealtimePayload parse = RealtimePayloadParser.parse(r5);
            if (list == null) {
                return false;
            }
            for (RealtimeEventHandler handleRealtimeEvent : list) {
                if (handleRealtimeEvent.handleRealtimeEvent(r5, parse)) {
                    return true;
                }
            }
            return false;
            throw th;
        }

        public void onMessageArrived(C55622b2 r5) {
            String str;
            if (!handleMessageArrived(r5)) {
                RealtimePayload parse = RealtimePayloadParser.parse(r5);
                String str2 = r5.A00;
                if (parse == null) {
                    str = "null";
                } else {
                    str = parse.subTopic;
                }
                AnonymousClass0QD.A01("no_mqtt_handlers", AnonymousClass000.A0N("No handler is handling MQTT topic: ", str2, ", subTopic: ", str));
            }
        }
    };
    public int mMqttTargetState = -1;
    public final Map mMqttTopicToHandlersMap = new HashMap();
    public final Set mObservers = new HashSet();
    public final List mRawSkywalkerSubscriptions = new ArrayList();
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final CopyOnWriteArraySet mRealtimeEventHandlers = new CopyOnWriteArraySet();
    public RealtimeMqttClientConfig mRealtimeMqttClientConfig;
    public final List mRealtimeSubscriptions = new ArrayList();
    public final AnonymousClass0C1 mUserSession;
    public final C27381Hp mZeroTokenChangeListener = new C27381Hp() {
        public synchronized void onTokenChange() {
            RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
            if (realtimeClientManager.mRealtimeMqttClientConfig != null) {
                RealtimeClientManager.this.mRealtimeMqttClientConfig.setHost(RealtimeClientManager.getLatestMqttHost(realtimeClientManager.mZeroTokenManager), false);
            }
        }
    };
    public AnonymousClass1CH mZeroTokenManager;

    public interface GraphQLSubscriptionsProvider {
        List get(AnonymousClass0C1 r1);
    }

    public class IgnoredMqttTopicsHandler extends RealtimeEventHandler {
        public boolean canHandleRealtimeEvent(String str, String str2) {
            return true;
        }

        public boolean handleRealtimeEvent(C55622b2 r2, RealtimePayload realtimePayload) {
            return true;
        }

        public void onRealtimeEventPayload(String str, String str2, String str3) {
        }

        public List getMqttTopicsToHandle() {
            return Collections.singletonList(RealtimeConstants.MQTT_TOPIC_PREEMPTIVE_PING);
        }

        public IgnoredMqttTopicsHandler() {
        }

        public /* synthetic */ IgnoredMqttTopicsHandler(C00501 r1) {
        }
    }

    public interface RawSkywalkerSubscriptionsProvider {
        List get(AnonymousClass0C1 r1);
    }

    public interface RealtimeDelegateProvider {
        MainRealtimeEventHandler.Delegate get(AnonymousClass0C1 r1);
    }

    /* renamed from: com.instagram.realtimeclient.RealtimeClientManager$11 */
    public /* synthetic */ class C006011 {

        /* renamed from: $SwitchMap$com$facebook$mqtt$client$MqttChannelState$ConnectionState */
        public static final /* synthetic */ int[] f150xd9fea1d5;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0013 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            int[] iArr = new int[Constants.ZERO(3).length];
            f150xd9fea1d5 = iArr;
            iArr[Constants.ZERO.intValue()] = 1;
            iArr[Constants.ONE.intValue()] = 2;
            try {
                iArr[Constants.A0C.intValue()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public interface Observer {
        void onConnectionChanged(C56392cQ r1);

        void onMessage(C55622b2 r1);

        void onSendMessage(String str, String str2, String str3, boolean z, Long l);
    }

    public static void destroyMqttClient(RealtimeClientManager realtimeClientManager) {
        realtimeClientManager.mMqttTargetState = 1;
        C62382nc r0 = realtimeClientManager.mMqttClient;
        if (r0 != null) {
            r0.destroy();
            AnonymousClass1CH r1 = realtimeClientManager.mZeroTokenManager;
            if (r1 != null) {
                r1.Bba(realtimeClientManager.mZeroTokenChangeListener);
            }
            synchronized (realtimeClientManager.mRawSkywalkerSubscriptions) {
                try {
                    realtimeClientManager.mRawSkywalkerSubscriptions.clear();
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            synchronized (realtimeClientManager.mRealtimeSubscriptions) {
                try {
                    realtimeClientManager.mRealtimeSubscriptions.clear();
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            realtimeClientManager.mRealtimeEventHandlers.clear();
            synchronized (realtimeClientManager.mMqttTopicToHandlersMap) {
                try {
                    realtimeClientManager.mMqttTopicToHandlersMap.clear();
                    realtimeClientManager.mMqttChannelStateChangeListeners.clear();
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                        break;
                    }
                }
            }
            synchronized (realtimeClientManager.mObservers) {
                try {
                    realtimeClientManager.mObservers.clear();
                } catch (Throwable th4) {
                    while (true) {
                        th = th4;
                        break;
                    }
                }
            }
            realtimeClientManager.mZeroTokenManager = null;
            realtimeClientManager.mRealtimeMqttClientConfig = null;
            return;
        }
        return;
        throw th;
    }

    public static void sendRealtimeSubscription(RealtimeClientManager realtimeClientManager, String str, List list, List list2, C58092fI r10) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (list == null || list.isEmpty()) {
            arrayList = null;
        } else {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((RealtimeSubscription) it.next()).getSubscriptionString(realtimeClientManager.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()));
            }
            arrayList = new ArrayList(hashSet);
        }
        if (list2 != null && !list2.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                hashSet2.add(((RealtimeSubscription) it2.next()).getSubscriptionString(realtimeClientManager.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()));
            }
            arrayList2 = new ArrayList(hashSet2);
        }
        sendSkywalkerCommand(realtimeClientManager, str, arrayList, arrayList2, r10);
    }

    private void startMqttClient() {
        this.mMqttTargetState = 2;
        C62382nc r0 = this.mMqttClient;
        if (r0 == null) {
            initMqttClient();
        } else {
            r0.start();
        }
    }

    private void stopMqttClient() {
        this.mMqttTargetState = 3;
        C62382nc r0 = this.mMqttClient;
        if (r0 != null) {
            r0.stop();
        }
    }

    public synchronized void publish(String str, String str2, C58092fI r18, boolean z) {
        String str3;
        String str4;
        boolean z2;
        final long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (true) {
                str3 = str2;
                str4 = str;
                z2 = z;
                if (!it.hasNext()) {
                    break;
                }
                ((Observer) it.next()).onSendMessage(str4, str3, RealtimeConstants.SEND_ATTEMPT, z2, (Long) null);
            }
        }
        C62382nc r1 = this.mMqttClient;
        if (r1 != null) {
            final String str5 = str4;
            final String str6 = str3;
            final boolean z3 = z2;
            r1.BYY(str4, str3.getBytes(CHARSET_UTF8), r18, new C58102fM() {
                public void onFailure() {
                    synchronized (RealtimeClientManager.this.mObservers) {
                        for (Observer onSendMessage : RealtimeClientManager.this.mObservers) {
                            onSendMessage.onSendMessage(str5, str6, RealtimeConstants.SEND_FAIL, z3, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        }
                    }
                }

                public void onSuccess() {
                    synchronized (RealtimeClientManager.this.mObservers) {
                        for (Observer onSendMessage : RealtimeClientManager.this.mObservers) {
                            onSendMessage.onSendMessage(str5, str6, "success", z3, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        }
                    }
                }
            });
        }
    }

    public int publishWithCallbacks(String str, byte[] bArr, C58092fI r17, C08080Vo r18) {
        byte[] bArr2;
        String str2;
        final long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (true) {
                bArr2 = bArr;
                str2 = str;
                if (!it.hasNext()) {
                    break;
                }
                ((Observer) it.next()).onSendMessage(str2, bArr2.toString(), RealtimeConstants.SEND_ATTEMPT, false, (Long) null);
            }
        }
        C62382nc r3 = this.mMqttClient;
        if (r3 == null) {
            return -1;
        }
        final String str3 = str;
        final byte[] bArr3 = bArr2;
        return r3.BYZ(str2, bArr2, r17, new C58102fM() {
            public void onFailure() {
                synchronized (RealtimeClientManager.this.mObservers) {
                    for (Observer onSendMessage : RealtimeClientManager.this.mObservers) {
                        onSendMessage.onSendMessage(str3, bArr3.toString(), RealtimeConstants.SEND_FAIL, false, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }
                }
            }

            public void onSuccess() {
                synchronized (RealtimeClientManager.this.mObservers) {
                    for (Observer onSendMessage : RealtimeClientManager.this.mObservers) {
                        onSendMessage.onSendMessage(str3, bArr3.toString(), "success", false, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }
                }
            }
        }, r18);
    }

    public abstract class MessageDeliveryCallback {
        public long mStartSendingTimestampInMs;

        public abstract void onFailure(Integer num, String str);

        public abstract void onSuccess(String str, String str2, long j, Long l);

        public abstract void onTimeout();

        public long getStartSendingTimestampInMs() {
            return this.mStartSendingTimestampInMs;
        }

        public void setStartSendingTimestampInMs(long j) {
            this.mStartSendingTimestampInMs = j;
        }
    }

    public static /* synthetic */ boolean access$700() {
        return false;
    }

    public static synchronized void addOtherRealtimeEventHandlerProvider(RealtimeEventHandlerProvider realtimeEventHandlerProvider) {
        synchronized (RealtimeClientManager.class) {
            sOtherRealtimeEventHandlerProviders.add(realtimeEventHandlerProvider);
        }
    }

    public static synchronized void addRealtimeDelegateProvider(RealtimeDelegateProvider realtimeDelegateProvider) {
        synchronized (RealtimeClientManager.class) {
            sRealtimeDelegateProviders.add(realtimeDelegateProvider);
        }
    }

    private void collectObservers() {
        if (this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()) {
            synchronized (this.mObservers) {
                this.mObservers.add(new AnalyticsLoggingObserver(this.mUserSession, this.mRealtimeClientConfig.getLogReceiveMessageSampleRate()));
            }
        }
    }

    private AnonymousClass0UT createMqttAuthCredentials() {
        if (!this.mUserSession.Abj()) {
            AnonymousClass0C1 r0 = this.mUserSession;
            String A04 = r0.A04();
            String A00 = AnonymousClass1BD.A00(r0);
            if (A00 != null) {
                return AnonymousClass0UT.A00(A04, AnonymousClass000.A0E("sessionid=", A00));
            }
        }
        return null;
    }

    private C62382nc createMqttClient(RealtimeMqttClientConfig realtimeMqttClientConfig, AnonymousClass0UT r12, Set set) {
        ArrayList arrayList;
        AnonymousClass0QT r9;
        if (set == null) {
            arrayList = new ArrayList();
            arrayList.add(RealtimeConstants.MQTT_TOPIC_SKYWALKER);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_REGION_HINT);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_SUB_IRIS_RESPONSE);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_MESSAGE_SYNC);
        } else {
            arrayList = new ArrayList(set);
        }
        if (C0142L.ig_android_mqtt_unified_client_logging.enabled.getAndExpose(this.mUserSession).booleanValue()) {
            r9 = AnonymousClass0QT.A00(this.mUserSession, new C06300On("mqtt_unified"));
        } else {
            r9 = null;
        }
        C62362na r1 = new C62362na(this.mContext, r12, C05860Mt.A02.A04(), this.mMqttPublishArrivedListener, this.mMqttChannelStateListener, arrayList, new ThriftPayloadEncoder(), r9);
        C62372nb r0 = new C62372nb(realtimeMqttClientConfig);
        r0.AdG(r1);
        return r0;
    }

    public static synchronized GraphQLSubscriptionsProvider getGraphQLSubscriptionsProvider() {
        GraphQLSubscriptionsProvider graphQLSubscriptionsProvider;
        synchronized (RealtimeClientManager.class) {
            graphQLSubscriptionsProvider = sGraphQLSubscriptionsProvider;
        }
        return graphQLSubscriptionsProvider;
    }

    public static synchronized RealtimeClientManager getInstance(AnonymousClass0C1 r5) {
        RealtimeClientManager realtimeClientManager;
        Class<RealtimeClientManager> cls = RealtimeClientManager.class;
        synchronized (cls) {
            realtimeClientManager = (RealtimeClientManager) r5.AV9(cls);
            if (realtimeClientManager == null) {
                DLog.m40d(DLogTag.REAL_TIME, "[Realtime] Init instance", new Object[0]);
                realtimeClientManager = new RealtimeClientManager(StoredPreferences.A00, r5, new RealtimeClientConfig(r5), MainRealtimeEventHandler.create(r5));
                r5.BYi(cls, realtimeClientManager);
            }
        }
        return realtimeClientManager;
    }

    public static String getLatestMqttHost(AnonymousClass1CH r1) {
        return r1.Be9(DEFAULT_MQTT_HOST_NAME);
    }

    public static synchronized RawSkywalkerSubscriptionsProvider getRawSkywalkerSubscriptionsProvider() {
        RawSkywalkerSubscriptionsProvider rawSkywalkerSubscriptionsProvider;
        synchronized (RealtimeClientManager.class) {
            rawSkywalkerSubscriptionsProvider = sRawSkywalkerSubscriptionsProvider;
        }
        return rawSkywalkerSubscriptionsProvider;
    }

    private void initMqttClient() {
        if (!this.mIsInitializingMqttClient) {
            this.mIsInitializingMqttClient = true;
            Looper.myQueue().addIdleHandler(new C12690hE("scheduleInitMqttClientInBackground") {
                public boolean onQueueIdle() {
                    C05700Lp.A00().ADc(new AnonymousClass0O9(180) {
                        public void run() {
                            RealtimeClientManager.initMqttClientInBackground(RealtimeClientManager.this);
                        }
                    });
                    return false;
                }
            });
        }
    }

    private Set initRealtimeEventHandlers() {
        synchronized (this.mMqttTopicToHandlersMap) {
            if (!this.mMqttTopicToHandlersMap.isEmpty()) {
                return null;
            }
            for (RealtimeDelegateProvider realtimeDelegateProvider : sRealtimeDelegateProviders) {
                MainRealtimeEventHandler.Delegate delegate = realtimeDelegateProvider.get(this.mUserSession);
                if (delegate != null) {
                    this.mMasterRealtimeEventHandler.addProtocolDelegate(delegate.getProtocol(), delegate);
                }
            }
            registerRealtimeEventHandler(this.mMasterRealtimeEventHandler);
            registerRealtimeEventHandler(new IgnoredMqttTopicsHandler());
            for (RealtimeEventHandlerProvider realtimeEventHandlerProvider : sOtherRealtimeEventHandlerProviders) {
                RealtimeEventHandler realtimeEventHandler = realtimeEventHandlerProvider.get(this.mUserSession);
                if (realtimeEventHandler != null) {
                    registerRealtimeEventHandler(realtimeEventHandler);
                }
            }
            Set keySet = this.mMqttTopicToHandlersMap.keySet();
            return keySet;
        }
    }

    public static synchronized boolean isInitialized(AnonymousClass0C1 r3) {
        boolean z;
        Class<RealtimeClientManager> cls = RealtimeClientManager.class;
        synchronized (cls) {
            z = false;
            if (((RealtimeClientManager) r3.AV9(cls)) != null) {
                z = true;
            }
        }
        return z;
    }

    public static void sendSkywalkerCommand(RealtimeClientManager realtimeClientManager, String str, List list, List list2, C58092fI r6) {
        if (realtimeClientManager.mMqttClient != null) {
            try {
                realtimeClientManager.publish(str, SkywalkerCommand__JsonHelper.serializeToJson(new SkywalkerCommand(list, list2, (HashMap) null)), r6, true);
            } catch (IOException e) {
                throw new IllegalStateException("error serializing skywalker command", e);
            }
        } else {
            AnonymousClass0QD.A02(SOFT_ERROR_TAG, "Trying to subscribe to skywalker without enabling MQTT");
        }
    }

    public static synchronized void setGraphQLSubscriptionsProvider(GraphQLSubscriptionsProvider graphQLSubscriptionsProvider) {
        synchronized (RealtimeClientManager.class) {
            sGraphQLSubscriptionsProvider = graphQLSubscriptionsProvider;
        }
    }

    public static synchronized void setRawSkywalkerSubscriptionsProvider(RawSkywalkerSubscriptionsProvider rawSkywalkerSubscriptionsProvider) {
        synchronized (RealtimeClientManager.class) {
            sRawSkywalkerSubscriptionsProvider = rawSkywalkerSubscriptionsProvider;
        }
    }

    public static boolean useMqttSandbox() {
        return false;
    }

    public void addKeepAliveCondition(String str) {
        this.mConnectionKeepAliveConditions.add(str);
        if (this.mMqttTargetState == 2) {
            C62382nc r0 = this.mMqttClient;
            if (r0 != null) {
                r0.Aia();
                return;
            }
            return;
        }
        startMqttClient();
    }

    public void addObserver(Observer observer) {
        synchronized (this.mObservers) {
            this.mObservers.add(observer);
        }
    }

    public int getDelayDisconnectKeepaliveMs() {
        return this.mRealtimeClientConfig.mDelayDisconnectMQTTMS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r2 != 3) goto L_0x001c;
     */
    public int getMqttTargetState() {
        boolean z = true;
        if (this.mIsInitializingMqttClient) {
            if (this.mMqttTargetState == -1) {
                z = false;
            }
            AnonymousClass0a4.A0A(z);
            return 0;
        }
        int i = this.mMqttTargetState;
        if (!(i == -1 || i == 1)) {
            if (i == 2) {
                C62382nc r0 = this.mMqttClient;
                if (r0 == null) {
                    return 99;
                }
                switch (r0.AQT().A00.A00.intValue()) {
                    case 0:
                        return 4;
                    case 1:
                        return 5;
                    case 2:
                        return 2;
                }
            }
            AnonymousClass0QD.A02(SOFT_ERROR_TAG, AnonymousClass000.A05("Mqtt target state is unknown: ", this.mMqttTargetState));
            return 98;
        }
        return i;
    }

    public void graphqlSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendRealtimeSubscription(this, RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, list, (List) null, C58092fI.FIRE_AND_FORGET);
        }
        synchronized (this.mRealtimeSubscriptions) {
            this.mRealtimeSubscriptions.addAll(list);
        }
    }

    public void graphqlUnsubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendRealtimeSubscription(this, RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, (List) null, list, C58092fI.FIRE_AND_FORGET);
        }
        synchronized (this.mRealtimeSubscriptions) {
            this.mRealtimeSubscriptions.removeAll(list);
        }
    }

    public boolean isMqttConnected() {
        C62382nc r0 = this.mMqttClient;
        if (r0 != null) {
            boolean z = false;
            if (r0.AQT().A00.A00 == Constants.ONE) {
                z = true;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void maybeCancelPendingPublish(int i) {
        C62382nc r0 = this.mMqttClient;
        if (r0 != null) {
            r0.Aom(i);
        }
    }

    public void rawSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendSkywalkerCommand(this, RealtimeConstants.MQTT_TOPIC_SKYWALKER, list, (List) null, C58092fI.FIRE_AND_FORGET);
        }
        synchronized (this.mRawSkywalkerSubscriptions) {
            this.mRawSkywalkerSubscriptions.addAll(list);
        }
    }

    public void rawUnSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendSkywalkerCommand(this, RealtimeConstants.MQTT_TOPIC_SKYWALKER, (List) null, list, C58092fI.FIRE_AND_FORGET);
        }
        synchronized (this.mRawSkywalkerSubscriptions) {
            this.mRawSkywalkerSubscriptions.removeAll(list);
        }
    }

    public void removeKeepAliveCondition(String str) {
        if (this.mConnectionKeepAliveConditions.remove(str) && this.mConnectionKeepAliveConditions.isEmpty()) {
            stopMqttClient();
        }
    }

    public void removeObserver(Observer observer) {
        synchronized (this.mObservers) {
            this.mObservers.remove(observer);
        }
    }

    public void sendCommand(String str, String str2, MessageDeliveryCallback messageDeliveryCallback) {
        if (this.mMqttClient != null) {
            publish(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE, str2, C58092fI.FIRE_AND_FORGET, false);
            this.mMasterRealtimeEventHandler.onSendRealtimeCommand(str, messageDeliveryCallback);
            return;
        }
        AnonymousClass0QD.A02(SOFT_ERROR_TAG, "Trying to send command without enabling MQTT");
    }

    public RealtimeClientManager(Context context, AnonymousClass0C1 r4, RealtimeClientConfig realtimeClientConfig, MainRealtimeEventHandler mainRealtimeEventHandler) {
        this.mUserSession = r4;
        this.mContext = context.getApplicationContext();
        this.mRealtimeClientConfig = realtimeClientConfig;
        this.mMasterRealtimeEventHandler = mainRealtimeEventHandler;
        AnonymousClass0Q7.A03().A0B(this.mBackgroundDetectorListener);
        C12670hC.A04(new Runnable() {
            public void run() {
                if (!AnonymousClass0Q7.A03().A0H()) {
                    RealtimeClientManager.this.mBackgroundDetectorListener.onAppForegrounded();
                }
            }
        });
    }

    private void addSkywalkerAndGraphqlSubscriptions() {
        List list = getRawSkywalkerSubscriptionsProvider().get(this.mUserSession);
        List list2 = getGraphQLSubscriptionsProvider().get(this.mUserSession);
        synchronized (this.mRawSkywalkerSubscriptions) {
            try {
                this.mRawSkywalkerSubscriptions.addAll(list);
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        synchronized (this.mRealtimeSubscriptions) {
            try {
                this.mRealtimeSubscriptions.addAll(list2);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public static void initMqttClientInBackground(RealtimeClientManager realtimeClientManager) {
        AnonymousClass0UT createMqttAuthCredentials = realtimeClientManager.createMqttAuthCredentials();
        if (createMqttAuthCredentials != null) {
            realtimeClientManager.mRealtimeClientConfig.loadConfig();
            final RealtimeMqttClientConfig realtimeMqttClientConfig = new RealtimeMqttClientConfig(realtimeClientManager.mUserSession, realtimeClientManager.mRealtimeClientConfig);
            final AnonymousClass1CH A00 = AnonymousClass1CF.A00(realtimeClientManager.mUserSession);
            realtimeMqttClientConfig.setHost(getLatestMqttHost(A00), false);
            final C62382nc createMqttClient = realtimeClientManager.createMqttClient(realtimeMqttClientConfig, createMqttAuthCredentials, realtimeClientManager.initRealtimeEventHandlers());
            realtimeClientManager.collectObservers();
            realtimeClientManager.addSkywalkerAndGraphqlSubscriptions();
            C12670hC.A04(new Runnable() {
                public void run() {
                    RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                    realtimeClientManager.mMqttClient = createMqttClient;
                    realtimeClientManager.mRealtimeMqttClientConfig = realtimeMqttClientConfig;
                    realtimeClientManager.mZeroTokenManager = A00;
                    realtimeClientManager.mZeroTokenChangeListener.onTokenChange();
                    RealtimeClientManager realtimeClientManager2 = RealtimeClientManager.this;
                    realtimeClientManager2.mZeroTokenManager.A4p(realtimeClientManager2.mZeroTokenChangeListener);
                    RealtimeClientManager realtimeClientManager3 = RealtimeClientManager.this;
                    int i = realtimeClientManager3.mMqttTargetState;
                    if (i == -1) {
                        AnonymousClass0QD.A02(RealtimeClientManager.SOFT_ERROR_TAG, "MQTT status is UNSET after finishing Initialization");
                    } else if (i == 1) {
                        RealtimeClientManager.destroyMqttClient(realtimeClientManager3);
                    } else if (i == 2) {
                        realtimeClientManager3.mMqttClient.BsR(true ^ AnonymousClass0Q7.A03().A0H());
                        RealtimeClientManager.this.mMqttClient.start();
                    } else if (i == 3) {
                        realtimeClientManager3.mMqttClient.stop();
                    }
                    RealtimeClientManager.this.mIsInitializingMqttClient = false;
                }
            });
        }
    }

    private void registerRealtimeEventHandler(RealtimeEventHandler realtimeEventHandler) {
        for (String str : realtimeEventHandler.getMqttTopicsToHandle()) {
            List list = (List) this.mMqttTopicToHandlersMap.get(str);
            if (list == null) {
                list = new ArrayList();
                this.mMqttTopicToHandlersMap.put(str, list);
            }
            list.add(realtimeEventHandler);
        }
        if (realtimeEventHandler.shouldNotifyMqttChannelStateChanged()) {
            this.mMqttChannelStateChangeListeners.add(realtimeEventHandler);
        }
    }

    public boolean isReceivingRealtimeAndForeground() {
        if (!isMqttConnected() || AnonymousClass0Q7.A03().A0H()) {
            return false;
        }
        return true;
    }

    public boolean isSendingAvailable() {
        return isMqttConnected();
    }

    public void onUserSessionWillEnd(boolean z) {
        destroyMqttClient(this);
        AnonymousClass0Q7.A03().A0D(this.mBackgroundDetectorListener);
    }
}
