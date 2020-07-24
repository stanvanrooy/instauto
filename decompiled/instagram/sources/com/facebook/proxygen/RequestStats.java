package com.facebook.proxygen;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass000;

public class RequestStats {
    public static final Map mFlowTimeMap = Collections.unmodifiableMap(new HashMap<String, List<String>>() {
        {
            put(TraceEventType.RequestExchange, Arrays.asList(new String[]{"uri", TraceFieldType.IsSecure, TraceFieldType.StatusCode, TraceFieldType.StatusMessage, TraceFieldType.ContentType, TraceFieldType.LocalPort, TraceFieldType.ReqHeaderSize, TraceFieldType.ReqHeaderCompSize, TraceFieldType.ReqBodySize, TraceFieldType.RspHeaderSize, TraceFieldType.RspHeaderCompSize, TraceFieldType.RedirectLocation, TraceFieldType.NumRedirects, TraceFieldType.Protocol, TraceFieldType.FirstBodyByteFlushedRatio, TraceFieldType.LastBodyByteFlushedRatio, TraceFieldType.SecurityProtocol, TraceFieldType.FlowControlPauses, TraceFieldType.ReplaySafe, TraceFieldType.HTTPMethod, TraceFieldType.RangeRequest, TraceFieldType.TraceStringId, TraceFieldType.TransportReplaySafe, TraceFieldType.EvbAvgLoopTime, TraceFieldType.TripId, TraceFieldType.TimeSinceFirstHTTPClientInit, TraceFieldType.TimeSinceHTTPClientInit, TraceFieldType.NumberHTTPClientInits, TraceFieldType.NetworkType}));
            put(TraceEventType.ResponseBodyRead, Arrays.asList(new String[]{TraceFieldType.RspIntvlAvg, TraceFieldType.RspIntvlStdDev, TraceFieldType.RspNumOnBody, TraceFieldType.ServerQuality, TraceFieldType.RecvToAck, TraceFieldType.ServerUpstreamLatency}));
            put(TraceEventType.TotalConnect, Arrays.asList(new String[0]));
            put(TraceEventType.PreConnect, Arrays.asList(new String[]{TraceFieldType.NewConnection, TraceFieldType.IsWaitingForNewConn, TraceFieldType.NewConnTimeout, TraceFieldType.InFlightConns, TraceFieldType.CachedSessions, TraceFieldType.CachedActiveSessions, TraceFieldType.ConnRoutingStale, TraceFieldType.StartedQuicAsync, TraceFieldType.ConnsStarted, TraceFieldType.RequestsWaited, TraceFieldType.TotalConnsStarted, TraceFieldType.TotalRequestsWaited, TraceFieldType.SessionCacheHitType, TraceFieldType.PerDomainLimit, TraceFieldType.DynamicDomainLimitRatio, TraceFieldType.LoadBalancing, TraceFieldType.MaxConnectionRetryCount, TraceFieldType.MaxIdleHTTPSessions, TraceFieldType.MaxIdleHTTP2Sessions, TraceFieldType.StartedExtraTcp, TraceFieldType.InflightQuicConns, TraceFieldType.QuicEnabled}));
            put(TraceEventType.DnsConnect, Arrays.asList(new String[0]));
            put(TraceEventType.DnsResolution, Arrays.asList(new String[]{TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.ResolversSerialized, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.TXT, TraceFieldType.DNSCryptUsed, TraceFieldType.DNSCryptCertSerial}));
            put(TraceEventType.DnsCache, Arrays.asList(new String[]{TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.DNSCacheHit, TraceFieldType.DNSCacheHitV4, TraceFieldType.DNSCacheHitV6, TraceFieldType.DNSCacheStale, TraceFieldType.DNSCacheStaleV4, TraceFieldType.DNSCacheStaleV6}));
            put(TraceEventType.RetryingDnsResolution, Arrays.asList(new String[]{TraceFieldType.NumberDNSRetries, TraceFieldType.ResolvedSuccess}));
            put(TraceEventType.FallbackDnsResolution, Arrays.asList(new String[]{TraceFieldType.FallbackBranchSuccess}));
            put(TraceEventType.FallbackDnsAttempt, Arrays.asList(new String[0]));
            put(TraceEventType.TcpConnect, Arrays.asList(new String[]{TraceFieldType.CachedFamily, TraceFieldType.CachedFamilyStatus, TraceFieldType.HEDrivenDns, TraceFieldType.HESerializedEvents}));
            put(TraceEventType.TlsSetup, Arrays.asList(new String[]{TraceFieldType.TLSReused, TraceFieldType.TLSCacheHit, TraceFieldType.CipherName, TraceFieldType.TLSVersion, TraceFieldType.OpenSSLVersion, TraceFieldType.TLSCachePersistence}));
            put(TraceEventType.ProxyConnect, Arrays.asList(new String[]{TraceFieldType.ProxyHost, TraceFieldType.ProxyPort}));
            put(TraceEventType.PostConnect, Arrays.asList(new String[]{TraceFieldType.NewSession, TraceFieldType.NumWaiting, TraceFieldType.TransportType, TraceFieldType.LocalAddr, TraceFieldType.LocalPort}));
            put(TraceEventType.SessionTransactions, Arrays.asList(new String[]{TraceFieldType.CurrentTransactions, TraceFieldType.HistoricalMaximumTransactions, TraceFieldType.NumberTransactionsServed}));
            put(TraceEventType.TransportInfo, Arrays.asList(new String[]{TraceFieldType.Cwnd, TraceFieldType.CwndBytes, TraceFieldType.TotalRetx, TraceFieldType.InflightPacketLoss, TraceFieldType.RTO, TraceFieldType.MSS, TraceFieldType.MTU, TraceFieldType.RcvWnd, TraceFieldType.UpstreamCapacity, TraceFieldType.QuicClientCID, TraceFieldType.QuicServerCID, TraceFieldType.RTOCount, TraceFieldType.TotalRTOCount, TraceFieldType.QuicTransportSent, TraceFieldType.QuicTransportRecvd}));
            put(TraceEventType.PostTransactionTransportInfo, Arrays.asList(new String[]{TraceFieldType.RTT, TraceFieldType.RTTVar}));
            put(TraceEventType.ConnInfo, Arrays.asList(new String[]{TraceFieldType.ConnLifeSpan, TraceFieldType.EgressBuffered, TraceFieldType.SessionType}));
            put(TraceEventType.Decompression, Arrays.asList(new String[]{TraceFieldType.RspBodySize, TraceFieldType.RspBodyCompSize, TraceFieldType.CompressionType}));
            put(TraceEventType.ReplaySafety, Arrays.asList(new String[0]));
            put(TraceEventType.Push, Arrays.asList(new String[]{TraceFieldType.IsPushRequest, TraceFieldType.PushConnectedInFlight, TraceFieldType.PushOrphaned}));
            put(TraceEventType.FizzConnect, Arrays.asList(new String[]{TraceFieldType.FizzHandshakeSuccess, TraceFieldType.FizzProtocolVersion, TraceFieldType.FizzPskType, TraceFieldType.FizzEarlyDataType}));
            put(TraceEventType.QuicConnect, Arrays.asList(new String[]{TraceFieldType.QuicClientCID, TraceFieldType.QuicDNSAddrs, TraceFieldType.QuicEarlyDataEnabled}));
            put(TraceEventType.ConnSelector, Arrays.asList(new String[]{TraceFieldType.QuicResult}));
            put(TraceEventType.PingTimeout, Arrays.asList(new String[]{TraceFieldType.FakeKilled}));
        }
    });
    public TraceEvent[] mEvents;

    public static Map getFlowTimeFieldsMap() {
        return mFlowTimeMap;
    }

    public static boolean isValidCodecProtocolStr(String str) {
        if (str.equals("http/1.1") || str.equals("http/2")) {
            return true;
        }
        return false;
    }

    public Map getCertificateVerificationData() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (TraceEvent traceEvent : this.mEvents) {
            String str3 = traceEvent.mName;
            if (str3.equals(TraceEventType.CertVerification)) {
                for (Map.Entry entry : traceEvent.getMetaData().entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
                z = true;
            } else {
                if (str3.equals(TraceEventType.QuicConnect) || str3.equals(TraceEventType.TcpConnect) || str3.equals(TraceEventType.PostConnect)) {
                    Map metaData = traceEvent.getMetaData();
                    String readStrMeta = readStrMeta(metaData, TraceFieldType.ServerAddr, "");
                    int readIntMeta = readIntMeta(metaData, TraceFieldType.ServerPort, 0);
                    if (!readStrMeta.equals("") && readIntMeta > 0) {
                        str = AnonymousClass000.A0J(readStrMeta, ":", String.valueOf(readIntMeta));
                        str2 = TraceFieldType.VerifiedServerAddress;
                    }
                } else if (str3.equals(TraceEventType.TlsSetup)) {
                    Map metaData2 = traceEvent.getMetaData();
                    String readStrMeta2 = readStrMeta(metaData2, TraceFieldType.CipherName, "");
                    int readIntMeta2 = readIntMeta(metaData2, TraceFieldType.TLSVersion, 0);
                    long readIntMeta3 = (long) readIntMeta(metaData2, TraceFieldType.OpenSSLVersion, 0);
                    if (!readStrMeta2.equals("")) {
                        hashMap.put(TraceFieldType.CipherName, readStrMeta2);
                    }
                    if (readIntMeta2 != 0) {
                        hashMap.put(TraceFieldType.TLSVersion, String.valueOf(readIntMeta2));
                    }
                    if (readIntMeta3 != 0) {
                        hashMap.put(TraceFieldType.OpenSSLVersion, String.valueOf(readIntMeta3));
                    }
                } else if (str3.equals(TraceEventType.ProxyConnect)) {
                    Map metaData3 = traceEvent.getMetaData();
                    String readStrMeta3 = readStrMeta(metaData3, TraceFieldType.ProxyHost, "");
                    int readIntMeta4 = readIntMeta(metaData3, TraceFieldType.ProxyPort, 0);
                    if (!readStrMeta3.equals("") && readIntMeta4 > 0) {
                        str = AnonymousClass000.A0J(readStrMeta3, ":", String.valueOf(readIntMeta4));
                        str2 = TraceFieldType.VerifiedProxyAddress;
                    }
                }
                hashMap.put(str2, str);
            }
        }
        if (!z) {
            return new HashMap(0);
        }
        return hashMap;
    }

    public HTTPFlowStats getFlowStats() {
        TraceEvent[] traceEventArr = this.mEvents;
        TraceEvent[] traceEventArr2 = traceEventArr;
        int length = traceEventArr.length;
        String str = "";
        String str2 = "";
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = -1;
        long j10 = -1;
        long j11 = -1;
        long j12 = -1;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        long j17 = -1;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        String str3 = "";
        String str4 = str3;
        for (int i9 = 0; i9 < length; i9++) {
            TraceEvent traceEvent = traceEventArr2[i9];
            Map metaData = traceEvent.getMetaData();
            String str5 = traceEvent.mName;
            if (TraceEventType.RequestExchange.equals(str5)) {
                str = readStrMeta(metaData, TraceFieldType.Protocol, "");
                z = isValidCodecProtocolStr(str);
                i2 = readIntMeta(metaData, TraceFieldType.LocalPort, 0);
                i3 = readIntMeta(metaData, TraceFieldType.ReqHeaderSize, 0);
                i4 = readIntMeta(metaData, TraceFieldType.ReqHeaderCompSize, 0);
                z4 = true;
                z3 = false;
                if (i3 != 0) {
                    z3 = true;
                }
                i5 = readIntMeta(metaData, TraceFieldType.ReqBodySize, 0);
                i6 = readIntMeta(metaData, TraceFieldType.RspHeaderSize, 0);
                i7 = readIntMeta(metaData, TraceFieldType.RspHeaderCompSize, 0);
                if (i6 == 0) {
                    z4 = false;
                }
                j15 = (long) readIntMeta(metaData, TraceFieldType.RequestSendTime, 0);
                j16 = (long) readIntMeta(metaData, TraceFieldType.FirstByteFlushed, 0);
                j17 = (long) readIntMeta(metaData, TraceFieldType.LastByteFlushed, 0);
            } else {
                if (TraceEventType.PostConnect.equals(str5)) {
                    z2 = readBooleanMeta(metaData, TraceFieldType.NewSession, false);
                } else if (TraceEventType.ResponseBodyRead.equals(str5)) {
                    j8 = traceEvent.mEnd - traceEvent.mStart;
                    str2 = readStrMeta(metaData, TraceFieldType.ServerQuality, "");
                    j9 = (long) readIntMeta(metaData, TraceFieldType.ServerRtt, -1);
                    j10 = (long) readIntMeta(metaData, TraceFieldType.ServerRtx, -1);
                    j11 = (long) readIntMeta(metaData, TraceFieldType.ServerCwnd, -1);
                    j12 = (long) readIntMeta(metaData, TraceFieldType.ServerMss, -1);
                    j13 = (long) readIntMeta(metaData, TraceFieldType.ServerTotalBytesWritten, -1);
                    j14 = (long) readIntMeta(metaData, TraceFieldType.ServerUpstreamLatency, -1);
                } else if (TraceEventType.TcpConnect.equals(str5)) {
                    str4 = readStrMeta(metaData, TraceFieldType.ServerAddr, str4);
                    j2 = traceEvent.mEnd - traceEvent.mStart;
                } else if (!TraceEventType.QuicConnect.equals(str5)) {
                    if (TraceEventType.PreConnect.equals(str5) || TraceEventType.DnsCache.equals(str5)) {
                        str3 = readStrMeta(metaData, TraceFieldType.HostName, str3);
                    } else if (TraceEventType.DnsResolution.equals(str5)) {
                        str3 = readStrMeta(metaData, TraceFieldType.HostName, str3);
                        j = traceEvent.mEnd - traceEvent.mStart;
                    } else if (TraceEventType.TlsSetup.equals(str5)) {
                        j3 = traceEvent.mEnd - traceEvent.mStart;
                    } else if (TraceEventType.Decompression.equals(str5)) {
                        i8 = readIntMeta(metaData, TraceFieldType.RspBodySize, 0);
                        int readIntMeta = readIntMeta(metaData, TraceFieldType.RspBodyCompSize, 0);
                        if (readIntMeta == 0 || (i != 0 && readIntMeta >= i)) {
                            readIntMeta = i;
                        }
                        i = readIntMeta;
                    } else if (TraceEventType.PostTransactionTransportInfo.equals(str5)) {
                        j4 = (long) readIntMeta(metaData, TraceFieldType.RTT, 0);
                    } else if (TraceEventType.TotalRequest.equals(str5)) {
                        j5 = (long) readIntMeta(metaData, TraceFieldType.TTFB, 0);
                        j6 = (long) readIntMeta(metaData, TraceFieldType.TTLB, 0);
                    } else if (TraceEventType.TotalConnect.equals(str5)) {
                        j7 = traceEvent.mEnd - traceEvent.mStart;
                    } else if (TraceEventType.Push.equals(str5)) {
                        z5 = readBooleanMeta(metaData, TraceFieldType.IsPushRequest, false);
                    }
                }
                str4 = readStrMeta(metaData, TraceFieldType.ServerAddr, str4);
            }
        }
        return new HTTPFlowStats(str3, str4, i2, z, z2, z3, z4, false, str, i3, i4, i5, i6, i7, i8, i, j, j2, j3, j4, j5, j6, j7, j8, str2, new ConnQuality(j9, j10, j11, j12, j13, j14), j15, z5, j16, j17);
    }

    public Map getFlowTimeData() {
        HashMap hashMap = new HashMap();
        for (TraceEvent traceEvent : this.mEvents) {
            if (mFlowTimeMap.containsKey(traceEvent.mName)) {
                Map metaData = traceEvent.getMetaData();
                long j = traceEvent.mStart;
                if (j != 0) {
                    long j2 = traceEvent.mEnd;
                    if (j2 != 0 && j < j2) {
                        hashMap.put(traceEvent.mName, String.valueOf(j2 - j));
                    }
                }
                for (String str : (List) mFlowTimeMap.get(traceEvent.mName)) {
                    if (metaData.containsKey(str)) {
                        hashMap.put(str, metaData.get(str));
                    }
                }
                if (metaData.containsKey(TraceFieldType.ServerAddr)) {
                    hashMap.put(TraceFieldType.ServerAddr, metaData.get(TraceFieldType.ServerAddr));
                    hashMap.put(TraceFieldType.ServerPort, metaData.get(TraceFieldType.ServerPort));
                }
                if (metaData.containsKey(TraceFieldType.Error)) {
                    if (hashMap.containsKey(TraceFieldType.ErrorStage)) {
                        hashMap.put(TraceFieldType.ErrorStage, AnonymousClass000.A0J((String) hashMap.get(TraceFieldType.ErrorStage), ";", traceEvent.mName));
                    } else {
                        hashMap.put(TraceFieldType.ErrorStage, traceEvent.mName);
                    }
                    joinMetaFields(metaData, hashMap, TraceFieldType.Error);
                    joinMetaFields(metaData, hashMap, TraceFieldType.DirectionError);
                    joinMetaFields(metaData, hashMap, TraceFieldType.ProxygenError);
                    joinMetaFields(metaData, hashMap, TraceFieldType.CodecError);
                }
                if (metaData.containsKey(TraceFieldType.FallbackBranchAttempt)) {
                    joinMetaFields(metaData, hashMap, TraceFieldType.FallbackBranchAttempt);
                }
            }
        }
        return hashMap;
    }

    public TraceEvent[] getTraceEvents() {
        return this.mEvents;
    }

    public RequestStats(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }

    public static void joinMetaFields(Map map, Map map2, String str) {
        if (!map.containsKey(str)) {
            return;
        }
        if (map2.containsKey(str)) {
            map2.put(str, AnonymousClass000.A0J((String) map2.get(str), ";", (String) map.get(str)));
        } else {
            map2.put(str, map.get(str));
        }
    }

    public static boolean readBooleanMeta(Map map, String str, boolean z) {
        if (!map.containsKey(str)) {
            return z;
        }
        if (Boolean.parseBoolean((String) map.get(str)) || ((String) map.get(str)).equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
            return true;
        }
        return false;
    }

    public static int readIntMeta(Map map, String str, int i) {
        if (!map.containsKey(str)) {
            return i;
        }
        try {
            return Integer.parseInt((String) map.get(str));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static String readStrMeta(Map map, String str, String str2) {
        if (!map.containsKey(str)) {
            return str2;
        }
        return (String) map.get(str);
    }
}
