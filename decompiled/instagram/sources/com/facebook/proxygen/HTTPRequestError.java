package com.facebook.proxygen;

public class HTTPRequestError {
    public ProxygenError mErrCode;
    public String mErrMsg;
    public HTTPRequestStage mErrStage;

    public enum HTTPRequestStage {
        ProcessRequest,
        DNSResolution,
        TCPConnection,
        TLSSetup,
        SendRequest,
        RecvResponse,
        Unknown,
        ZeroRttSent,
        WaitingRequest,
        RecvRequest,
        SendResponse,
        Max
    }

    public enum ProxygenError {
        None,
        Message,
        Connect,
        ConnectTimeout,
        Read,
        Write,
        Timeout,
        Handshake,
        NoServer,
        MaxRedirects,
        InvalidRedirect,
        ResponseAction,
        MaxConnects,
        Dropped,
        Connection,
        ConnectionReset,
        ParseHeader,
        ParseBody,
        EOF,
        ClientRenegotiation,
        Unknown,
        BadDecompress,
        SSL,
        StreamAbort,
        StreamUnacknowledged,
        WriteTimeout,
        AddressPrivate,
        AddressFamilyNotSupported,
        DNSNoResults,
        MalformedInput,
        UnsupportedExpectation,
        MethodNotSupported,
        UnsupportedScheme,
        Shutdown,
        IngressStateTransition,
        ClientSilent,
        Canceled,
        ParseResponse,
        ConnRefused,
        DNSOtherServer,
        DNSOtherClient,
        DNSOtherCancelled,
        DNSshutdown,
        DNSgetaddrinfo,
        DNSthreadpool,
        DNSunimplemented,
        Network,
        Configuration,
        EarlyDataRejected,
        EarlyDataFailed,
        AuthRequired,
        Unauthorized,
        EgressEOMSeenOnParentStream,
        TransportIsDraining,
        ParentStreamNotExist,
        CreatingStream,
        PushNotSupported,
        MaxConcurrentOutgoingStreamLimitReached,
        BadSocket,
        DuplicatedStreamId,
        ClientTransactionGone,
        NetworkSwitch,
        Forbidden,
        Max
    }

    public ProxygenError getErrCode() {
        return this.mErrCode;
    }

    public String getErrMsg() {
        return this.mErrMsg;
    }

    public HTTPRequestStage getErrStage() {
        return this.mErrStage;
    }

    public HTTPRequestError(String str, HTTPRequestStage hTTPRequestStage, ProxygenError proxygenError) {
        this.mErrMsg = str;
        this.mErrStage = hTTPRequestStage;
        this.mErrCode = proxygenError;
    }
}
