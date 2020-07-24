package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30608Dfv;

public class CallPeerConnectionSummaryEventLog {
    public static AnonymousClass921 CONVERTER = new C30608Dfv();
    public final String audioDevice;
    public final Long audioDeviceIsRestarting;
    public final Long audioDeviceIsStalled;
    public final Long audioDevicePlayChannel;
    public final Long audioDevicePlayFrames;
    public final Long audioDevicePlayLevelSum;
    public final Long audioDevicePlaySampleRate;
    public final Long audioDevicePlayStall;
    public final Long audioDeviceRecordChannel;
    public final Long audioDeviceRecordFrames;
    public final Long audioDeviceRecordLevelSum;
    public final Long audioDeviceRecordSampleRate;
    public final Long audioDeviceRecordStall;
    public final Long audioDeviceTotalRestart;
    public final Long audioDeviceTotalRestartSuccess;
    public final Long audioDeviceTotalStall;
    public final Long audioRecvAudioLevel;
    public final Long audioRecvAudioLevelConverted;
    public final Long audioRecvBurstDiscardCount;
    public final Long audioRecvBurstLossCount;
    public final Long audioRecvBurstPacketsDiscarded;
    public final Long audioRecvBurstPacketsLost;
    public final Long audioRecvBytesRecv;
    public final String audioRecvCodec;
    public final Long audioRecvConcealedSamples;
    public final Long audioRecvConcealmentEvents;
    public final Long audioRecvDelayedPacketOutageSamples;
    public final Long audioRecvFecPacketsDiscarded;
    public final Long audioRecvFecPacketsReceived;
    public final Long audioRecvFractionLost;
    public final Long audioRecvInsertedSamplesForDeceleration;
    public final Long audioRecvJitter;
    public final Long audioRecvJitterBufferDelay;
    public final Long audioRecvJitterBufferEmittedCount;
    public final Long audioRecvJitterBufferFlushes;
    public final Long audioRecvJitterBufferFramesAssembled;
    public final Long audioRecvJitterBufferFramesOut;
    public final Long audioRecvJitterBufferKeyframesOut;
    public final Long audioRecvNeteqAccelerate;
    public final Long audioRecvNeteqAttemptOperations;
    public final Long audioRecvNeteqCallToSilenceGenerator;
    public final Long audioRecvNeteqCng;
    public final Long audioRecvNeteqMaxWaitMs;
    public final Long audioRecvNeteqMeanWaitMs;
    public final Long audioRecvNeteqMutedOutput;
    public final Long audioRecvNeteqNoOperations;
    public final Long audioRecvNeteqNormal;
    public final Long audioRecvNeteqOperationErrors;
    public final Long audioRecvNeteqOperations;
    public final Long audioRecvNeteqPlc;
    public final Long audioRecvNeteqPlccng;
    public final Long audioRecvNeteqPreemptiveExpand;
    public final Long audioRecvNumInboundRtpStreams;
    public final Long audioRecvNumMediaStreamTracks;
    public final Long audioRecvPacketsDiscarded;
    public final Long audioRecvPacketsLost;
    public final Long audioRecvPacketsRecv;
    public final Long audioRecvPacketsRepaired;
    public final Long audioRecvPaddingPacketsReceived;
    public final Long audioRecvReceivedLatencyMs;
    public final Long audioRecvRelativePacketArrivalDelay;
    public final Long audioRecvRemovedSamplesForDeceleration;
    public final Long audioRecvRoundTripTime;
    public final Long audioRecvSilentConcealedSamples;
    public final Long audioRecvTotalAudioEnergy;
    public final Long audioRecvTotalSamplesDuration;
    public final Long audioRecvTotalSamplesReceived;
    public final Long audioSendAudioLevel;
    public final Long audioSendAverageTargetBitrate;
    public final Long audioSendBytesSent;
    public final String audioSendCodec;
    public final Long audioSendCurrentIsacDownlinkBitrate;
    public final Long audioSendCurrentIsacExternalTargetBitrate;
    public final Long audioSendCurrentIsacUplinkBitrate;
    public final Long audioSendEchoReturnLoss;
    public final Long audioSendEchoReturnLossEnhancement;
    public final Long audioSendEncCngCount;
    public final Long audioSendEncEmptyCount;
    public final Long audioSendEncSpeechCount;
    public final Long audioSendNumMediaStreamTracks;
    public final Long audioSendNumOutboundRtpStreams;
    public final Long audioSendPacketsLost;
    public final Long audioSendPacketsSent;
    public final Long audioSendTotalAudioEnergy;
    public final Long audioSendTotalSamplesDuration;
    public final Long audioSendTotalSamplesReceived;
    public final Long availableIncomingBitrate;
    public final Long availableOutgoingBitrate;
    public final Long avgVideoActualEncodeBitrate;
    public final Long avgVideoRetransmitBitrate;
    public final Long avgVideoTargetEncodeBitrate;
    public final Long avgVideoTransmitBitrate;
    public final String connectionLoggingId;
    public final Long gen0IceReceivedHost;
    public final Long gen0IceReceivedPrflx;
    public final Long gen0IceReceivedRelay;
    public final Long gen0IceReceivedSrflx;
    public final Long gen0IceSentHost;
    public final Long gen0IceSentPrflx;
    public final Long gen0IceSentRelay;
    public final Long gen0IceSentSrflx;
    public final Long initialProbingAttempted;
    public final Long initialProbingResult;
    public final String localCallId;
    public final Long peerId;
    public final String protocol;
    public final String sharedCallId;
    public final long steadyTimeMs;
    public final long systemTimeMs;
    public final Long transportCellBytesRecv;
    public final Long transportCellBytesSent;
    public final String transportConnIpversion;
    public final Long transportConnNetworkCost;
    public final Long transportConnRttAvg;
    public final Long transportConnRttMax;
    public final Long transportConnRttMin;
    public final Long transportConnRttVar;
    public final String transportConnType;
    public final Long transportConnected;
    public final Long transportNumGaps;
    public final Long transportOtherBytesRecv;
    public final Long transportOtherBytesSent;
    public final Long transportTotalGapDurationMs;
    public final Long transportWifiBytesRecv;
    public final Long transportWifiBytesSent;
    public final Long videoRecvAggBytesDecoded;
    public final Long videoRecvAggBytesRecv;
    public final Long videoRecvAggDecodeTimeMs;
    public final Long videoRecvAggFramesDecoded;
    public final Long videoRecvAggFramesRendered;
    public final Long videoRecvAggPacketsLost;
    public final Long videoRecvAggPacketsRecv;
    public final Long videoRecvAvgDecodeLatencyMs;
    public final Long videoRecvAvgE2eLatencyMs;
    public final Long videoRecvAvgJitterBufferLatencyMs;
    public final Long videoRecvAvgRecvLatencyMs;
    public final String videoRecvCodec;
    public final Long videoRecvFirsSent;
    public final Long videoRecvFrameHeight;
    public final Long videoRecvFrameWidth;
    public final Long videoRecvFramerateDecoded;
    public final Long videoRecvFramerateOutput;
    public final Long videoRecvFramerateRecv;
    public final Long videoRecvFramesDecoded;
    public final Long videoRecvFramesRendered;
    public final Long videoRecvFreezeCount;
    public final Long videoRecvFreezeDuration;
    public final Long videoRecvJitterBufferFramesAssembled;
    public final Long videoRecvJitterBufferFramesOut;
    public final Long videoRecvJitterBufferKeyframesOut;
    public final Long videoRecvNacksSent;
    public final Long videoRecvPacketsLost;
    public final Long videoRecvPacketsRecv;
    public final Long videoRecvPaddingPacketsReceived;
    public final Long videoRecvPauseCount;
    public final Long videoRecvPauseDurationMs;
    public final Long videoRecvPlisSent;
    public final Long videoRecvQpSum;
    public final Long videoRecvRenderDurationMs;
    public final Long videoRecvTotalPixelsDecoded;
    public final Long videoRecvTotalPixelsRendered;
    public final Long videoSendAverageCapturePixelsPerFrame;
    public final Long videoSendAverageTargetBitrate;
    public final Long videoSendAvgEncodeMs;
    public final Long videoSendBytesSent;
    public final Long videoSendCaptureDurationMs;
    public final String videoSendCodec;
    public final Long videoSendFirsRecv;
    public final Long videoSendFrameHeight;
    public final Long videoSendFrameHeightInput;
    public final Long videoSendFrameWidth;
    public final Long videoSendFrameWidthInput;
    public final Long videoSendFramesCaptured;
    public final Long videoSendFramesEncoded;
    public final Long videoSendFramesSendToEncoder;
    public final Long videoSendFramesSent;
    public final Long videoSendKeyFramesEncoded;
    public final Long videoSendNacksRecv;
    public final Long videoSendPacketsLost;
    public final Long videoSendPacketsSent;
    public final Long videoSendPlisRecv;
    public final Long videoSendQpSum;
    public final Long videoSendTotalInputPixel;
    public final Long videoSendTotalOutputPixel;
    public final String webrtcVersion;

    public static native CallPeerConnectionSummaryEventLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallPeerConnectionSummaryEventLog)) {
            return false;
        }
        CallPeerConnectionSummaryEventLog callPeerConnectionSummaryEventLog = (CallPeerConnectionSummaryEventLog) obj;
        String str = this.connectionLoggingId;
        if ((str != null || callPeerConnectionSummaryEventLog.connectionLoggingId != null) && (str == null || !str.equals(callPeerConnectionSummaryEventLog.connectionLoggingId))) {
            return false;
        }
        String str2 = this.localCallId;
        if ((str2 != null || callPeerConnectionSummaryEventLog.localCallId != null) && (str2 == null || !str2.equals(callPeerConnectionSummaryEventLog.localCallId))) {
            return false;
        }
        String str3 = this.sharedCallId;
        if ((str3 != null || callPeerConnectionSummaryEventLog.sharedCallId != null) && (str3 == null || !str3.equals(callPeerConnectionSummaryEventLog.sharedCallId))) {
            return false;
        }
        Long l = this.peerId;
        if (((l != null || callPeerConnectionSummaryEventLog.peerId != null) && (l == null || !l.equals(callPeerConnectionSummaryEventLog.peerId))) || this.systemTimeMs != callPeerConnectionSummaryEventLog.systemTimeMs || this.steadyTimeMs != callPeerConnectionSummaryEventLog.steadyTimeMs) {
            return false;
        }
        String str4 = this.protocol;
        if ((str4 != null || callPeerConnectionSummaryEventLog.protocol != null) && (str4 == null || !str4.equals(callPeerConnectionSummaryEventLog.protocol))) {
            return false;
        }
        String str5 = this.webrtcVersion;
        if ((str5 != null || callPeerConnectionSummaryEventLog.webrtcVersion != null) && (str5 == null || !str5.equals(callPeerConnectionSummaryEventLog.webrtcVersion))) {
            return false;
        }
        String str6 = this.audioRecvCodec;
        if ((str6 != null || callPeerConnectionSummaryEventLog.audioRecvCodec != null) && (str6 == null || !str6.equals(callPeerConnectionSummaryEventLog.audioRecvCodec))) {
            return false;
        }
        Long l2 = this.audioRecvBytesRecv;
        if ((l2 != null || callPeerConnectionSummaryEventLog.audioRecvBytesRecv != null) && (l2 == null || !l2.equals(callPeerConnectionSummaryEventLog.audioRecvBytesRecv))) {
            return false;
        }
        Long l3 = this.audioRecvPacketsRecv;
        if ((l3 != null || callPeerConnectionSummaryEventLog.audioRecvPacketsRecv != null) && (l3 == null || !l3.equals(callPeerConnectionSummaryEventLog.audioRecvPacketsRecv))) {
            return false;
        }
        Long l4 = this.audioRecvPacketsLost;
        if ((l4 != null || callPeerConnectionSummaryEventLog.audioRecvPacketsLost != null) && (l4 == null || !l4.equals(callPeerConnectionSummaryEventLog.audioRecvPacketsLost))) {
            return false;
        }
        Long l5 = this.audioRecvNeteqCallToSilenceGenerator;
        if ((l5 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqCallToSilenceGenerator != null) && (l5 == null || !l5.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqCallToSilenceGenerator))) {
            return false;
        }
        Long l6 = this.audioRecvNeteqOperations;
        if ((l6 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqOperations != null) && (l6 == null || !l6.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqOperations))) {
            return false;
        }
        Long l7 = this.audioRecvNeteqOperationErrors;
        if ((l7 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqOperationErrors != null) && (l7 == null || !l7.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqOperationErrors))) {
            return false;
        }
        Long l8 = this.audioRecvNeteqNoOperations;
        if ((l8 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqNoOperations != null) && (l8 == null || !l8.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqNoOperations))) {
            return false;
        }
        Long l9 = this.audioRecvNeteqNormal;
        if ((l9 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqNormal != null) && (l9 == null || !l9.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqNormal))) {
            return false;
        }
        Long l10 = this.audioRecvNeteqPlc;
        if ((l10 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqPlc != null) && (l10 == null || !l10.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqPlc))) {
            return false;
        }
        Long l11 = this.audioRecvNeteqCng;
        if ((l11 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqCng != null) && (l11 == null || !l11.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqCng))) {
            return false;
        }
        Long l12 = this.audioRecvNeteqPlccng;
        if ((l12 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqPlccng != null) && (l12 == null || !l12.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqPlccng))) {
            return false;
        }
        Long l13 = this.audioRecvNeteqAccelerate;
        if ((l13 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqAccelerate != null) && (l13 == null || !l13.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqAccelerate))) {
            return false;
        }
        Long l14 = this.audioRecvNeteqPreemptiveExpand;
        if ((l14 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqPreemptiveExpand != null) && (l14 == null || !l14.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqPreemptiveExpand))) {
            return false;
        }
        Long l15 = this.audioRecvNeteqMutedOutput;
        if ((l15 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqMutedOutput != null) && (l15 == null || !l15.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqMutedOutput))) {
            return false;
        }
        Long l16 = this.audioRecvNeteqAttemptOperations;
        if ((l16 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqAttemptOperations != null) && (l16 == null || !l16.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqAttemptOperations))) {
            return false;
        }
        Long l17 = this.audioRecvNeteqMeanWaitMs;
        if ((l17 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqMeanWaitMs != null) && (l17 == null || !l17.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqMeanWaitMs))) {
            return false;
        }
        Long l18 = this.audioRecvNeteqMaxWaitMs;
        if ((l18 != null || callPeerConnectionSummaryEventLog.audioRecvNeteqMaxWaitMs != null) && (l18 == null || !l18.equals(callPeerConnectionSummaryEventLog.audioRecvNeteqMaxWaitMs))) {
            return false;
        }
        Long l19 = this.audioRecvReceivedLatencyMs;
        if ((l19 != null || callPeerConnectionSummaryEventLog.audioRecvReceivedLatencyMs != null) && (l19 == null || !l19.equals(callPeerConnectionSummaryEventLog.audioRecvReceivedLatencyMs))) {
            return false;
        }
        Long l20 = this.audioRecvNumMediaStreamTracks;
        if ((l20 != null || callPeerConnectionSummaryEventLog.audioRecvNumMediaStreamTracks != null) && (l20 == null || !l20.equals(callPeerConnectionSummaryEventLog.audioRecvNumMediaStreamTracks))) {
            return false;
        }
        Long l21 = this.audioRecvNumInboundRtpStreams;
        if ((l21 != null || callPeerConnectionSummaryEventLog.audioRecvNumInboundRtpStreams != null) && (l21 == null || !l21.equals(callPeerConnectionSummaryEventLog.audioRecvNumInboundRtpStreams))) {
            return false;
        }
        Long l22 = this.audioRecvJitterBufferDelay;
        if ((l22 != null || callPeerConnectionSummaryEventLog.audioRecvJitterBufferDelay != null) && (l22 == null || !l22.equals(callPeerConnectionSummaryEventLog.audioRecvJitterBufferDelay))) {
            return false;
        }
        Long l23 = this.audioRecvJitterBufferEmittedCount;
        if ((l23 != null || callPeerConnectionSummaryEventLog.audioRecvJitterBufferEmittedCount != null) && (l23 == null || !l23.equals(callPeerConnectionSummaryEventLog.audioRecvJitterBufferEmittedCount))) {
            return false;
        }
        Long l24 = this.audioRecvAudioLevel;
        if ((l24 != null || callPeerConnectionSummaryEventLog.audioRecvAudioLevel != null) && (l24 == null || !l24.equals(callPeerConnectionSummaryEventLog.audioRecvAudioLevel))) {
            return false;
        }
        Long l25 = this.audioRecvAudioLevelConverted;
        if ((l25 != null || callPeerConnectionSummaryEventLog.audioRecvAudioLevelConverted != null) && (l25 == null || !l25.equals(callPeerConnectionSummaryEventLog.audioRecvAudioLevelConverted))) {
            return false;
        }
        Long l26 = this.audioRecvTotalAudioEnergy;
        if ((l26 != null || callPeerConnectionSummaryEventLog.audioRecvTotalAudioEnergy != null) && (l26 == null || !l26.equals(callPeerConnectionSummaryEventLog.audioRecvTotalAudioEnergy))) {
            return false;
        }
        Long l27 = this.audioRecvTotalSamplesReceived;
        if ((l27 != null || callPeerConnectionSummaryEventLog.audioRecvTotalSamplesReceived != null) && (l27 == null || !l27.equals(callPeerConnectionSummaryEventLog.audioRecvTotalSamplesReceived))) {
            return false;
        }
        Long l28 = this.audioRecvTotalSamplesDuration;
        if ((l28 != null || callPeerConnectionSummaryEventLog.audioRecvTotalSamplesDuration != null) && (l28 == null || !l28.equals(callPeerConnectionSummaryEventLog.audioRecvTotalSamplesDuration))) {
            return false;
        }
        Long l29 = this.audioRecvConcealedSamples;
        if ((l29 != null || callPeerConnectionSummaryEventLog.audioRecvConcealedSamples != null) && (l29 == null || !l29.equals(callPeerConnectionSummaryEventLog.audioRecvConcealedSamples))) {
            return false;
        }
        Long l30 = this.audioRecvSilentConcealedSamples;
        if ((l30 != null || callPeerConnectionSummaryEventLog.audioRecvSilentConcealedSamples != null) && (l30 == null || !l30.equals(callPeerConnectionSummaryEventLog.audioRecvSilentConcealedSamples))) {
            return false;
        }
        Long l31 = this.audioRecvConcealmentEvents;
        if ((l31 != null || callPeerConnectionSummaryEventLog.audioRecvConcealmentEvents != null) && (l31 == null || !l31.equals(callPeerConnectionSummaryEventLog.audioRecvConcealmentEvents))) {
            return false;
        }
        Long l32 = this.audioRecvInsertedSamplesForDeceleration;
        if ((l32 != null || callPeerConnectionSummaryEventLog.audioRecvInsertedSamplesForDeceleration != null) && (l32 == null || !l32.equals(callPeerConnectionSummaryEventLog.audioRecvInsertedSamplesForDeceleration))) {
            return false;
        }
        Long l33 = this.audioRecvRemovedSamplesForDeceleration;
        if ((l33 != null || callPeerConnectionSummaryEventLog.audioRecvRemovedSamplesForDeceleration != null) && (l33 == null || !l33.equals(callPeerConnectionSummaryEventLog.audioRecvRemovedSamplesForDeceleration))) {
            return false;
        }
        Long l34 = this.audioRecvJitterBufferFlushes;
        if ((l34 != null || callPeerConnectionSummaryEventLog.audioRecvJitterBufferFlushes != null) && (l34 == null || !l34.equals(callPeerConnectionSummaryEventLog.audioRecvJitterBufferFlushes))) {
            return false;
        }
        Long l35 = this.audioRecvDelayedPacketOutageSamples;
        if ((l35 != null || callPeerConnectionSummaryEventLog.audioRecvDelayedPacketOutageSamples != null) && (l35 == null || !l35.equals(callPeerConnectionSummaryEventLog.audioRecvDelayedPacketOutageSamples))) {
            return false;
        }
        Long l36 = this.audioRecvRelativePacketArrivalDelay;
        if ((l36 != null || callPeerConnectionSummaryEventLog.audioRecvRelativePacketArrivalDelay != null) && (l36 == null || !l36.equals(callPeerConnectionSummaryEventLog.audioRecvRelativePacketArrivalDelay))) {
            return false;
        }
        Long l37 = this.audioRecvFecPacketsReceived;
        if ((l37 != null || callPeerConnectionSummaryEventLog.audioRecvFecPacketsReceived != null) && (l37 == null || !l37.equals(callPeerConnectionSummaryEventLog.audioRecvFecPacketsReceived))) {
            return false;
        }
        Long l38 = this.audioRecvFecPacketsDiscarded;
        if ((l38 != null || callPeerConnectionSummaryEventLog.audioRecvFecPacketsDiscarded != null) && (l38 == null || !l38.equals(callPeerConnectionSummaryEventLog.audioRecvFecPacketsDiscarded))) {
            return false;
        }
        Long l39 = this.audioRecvPacketsDiscarded;
        if ((l39 != null || callPeerConnectionSummaryEventLog.audioRecvPacketsDiscarded != null) && (l39 == null || !l39.equals(callPeerConnectionSummaryEventLog.audioRecvPacketsDiscarded))) {
            return false;
        }
        Long l40 = this.audioRecvPacketsRepaired;
        if ((l40 != null || callPeerConnectionSummaryEventLog.audioRecvPacketsRepaired != null) && (l40 == null || !l40.equals(callPeerConnectionSummaryEventLog.audioRecvPacketsRepaired))) {
            return false;
        }
        Long l41 = this.audioRecvJitter;
        if ((l41 != null || callPeerConnectionSummaryEventLog.audioRecvJitter != null) && (l41 == null || !l41.equals(callPeerConnectionSummaryEventLog.audioRecvJitter))) {
            return false;
        }
        Long l42 = this.audioRecvFractionLost;
        if ((l42 != null || callPeerConnectionSummaryEventLog.audioRecvFractionLost != null) && (l42 == null || !l42.equals(callPeerConnectionSummaryEventLog.audioRecvFractionLost))) {
            return false;
        }
        Long l43 = this.audioRecvRoundTripTime;
        if ((l43 != null || callPeerConnectionSummaryEventLog.audioRecvRoundTripTime != null) && (l43 == null || !l43.equals(callPeerConnectionSummaryEventLog.audioRecvRoundTripTime))) {
            return false;
        }
        Long l44 = this.audioRecvBurstPacketsLost;
        if ((l44 != null || callPeerConnectionSummaryEventLog.audioRecvBurstPacketsLost != null) && (l44 == null || !l44.equals(callPeerConnectionSummaryEventLog.audioRecvBurstPacketsLost))) {
            return false;
        }
        Long l45 = this.audioRecvBurstPacketsDiscarded;
        if ((l45 != null || callPeerConnectionSummaryEventLog.audioRecvBurstPacketsDiscarded != null) && (l45 == null || !l45.equals(callPeerConnectionSummaryEventLog.audioRecvBurstPacketsDiscarded))) {
            return false;
        }
        Long l46 = this.audioRecvBurstLossCount;
        if ((l46 != null || callPeerConnectionSummaryEventLog.audioRecvBurstLossCount != null) && (l46 == null || !l46.equals(callPeerConnectionSummaryEventLog.audioRecvBurstLossCount))) {
            return false;
        }
        Long l47 = this.audioRecvBurstDiscardCount;
        if ((l47 != null || callPeerConnectionSummaryEventLog.audioRecvBurstDiscardCount != null) && (l47 == null || !l47.equals(callPeerConnectionSummaryEventLog.audioRecvBurstDiscardCount))) {
            return false;
        }
        Long l48 = this.audioRecvPaddingPacketsReceived;
        if ((l48 != null || callPeerConnectionSummaryEventLog.audioRecvPaddingPacketsReceived != null) && (l48 == null || !l48.equals(callPeerConnectionSummaryEventLog.audioRecvPaddingPacketsReceived))) {
            return false;
        }
        Long l49 = this.audioRecvJitterBufferFramesOut;
        if ((l49 != null || callPeerConnectionSummaryEventLog.audioRecvJitterBufferFramesOut != null) && (l49 == null || !l49.equals(callPeerConnectionSummaryEventLog.audioRecvJitterBufferFramesOut))) {
            return false;
        }
        Long l50 = this.audioRecvJitterBufferKeyframesOut;
        if ((l50 != null || callPeerConnectionSummaryEventLog.audioRecvJitterBufferKeyframesOut != null) && (l50 == null || !l50.equals(callPeerConnectionSummaryEventLog.audioRecvJitterBufferKeyframesOut))) {
            return false;
        }
        Long l51 = this.audioRecvJitterBufferFramesAssembled;
        if ((l51 != null || callPeerConnectionSummaryEventLog.audioRecvJitterBufferFramesAssembled != null) && (l51 == null || !l51.equals(callPeerConnectionSummaryEventLog.audioRecvJitterBufferFramesAssembled))) {
            return false;
        }
        String str7 = this.audioSendCodec;
        if ((str7 != null || callPeerConnectionSummaryEventLog.audioSendCodec != null) && (str7 == null || !str7.equals(callPeerConnectionSummaryEventLog.audioSendCodec))) {
            return false;
        }
        Long l52 = this.audioSendBytesSent;
        if ((l52 != null || callPeerConnectionSummaryEventLog.audioSendBytesSent != null) && (l52 == null || !l52.equals(callPeerConnectionSummaryEventLog.audioSendBytesSent))) {
            return false;
        }
        Long l53 = this.audioSendPacketsSent;
        if ((l53 != null || callPeerConnectionSummaryEventLog.audioSendPacketsSent != null) && (l53 == null || !l53.equals(callPeerConnectionSummaryEventLog.audioSendPacketsSent))) {
            return false;
        }
        Long l54 = this.audioSendPacketsLost;
        if ((l54 != null || callPeerConnectionSummaryEventLog.audioSendPacketsLost != null) && (l54 == null || !l54.equals(callPeerConnectionSummaryEventLog.audioSendPacketsLost))) {
            return false;
        }
        Long l55 = this.audioSendEncEmptyCount;
        if ((l55 != null || callPeerConnectionSummaryEventLog.audioSendEncEmptyCount != null) && (l55 == null || !l55.equals(callPeerConnectionSummaryEventLog.audioSendEncEmptyCount))) {
            return false;
        }
        Long l56 = this.audioSendEncSpeechCount;
        if ((l56 != null || callPeerConnectionSummaryEventLog.audioSendEncSpeechCount != null) && (l56 == null || !l56.equals(callPeerConnectionSummaryEventLog.audioSendEncSpeechCount))) {
            return false;
        }
        Long l57 = this.audioSendEncCngCount;
        if ((l57 != null || callPeerConnectionSummaryEventLog.audioSendEncCngCount != null) && (l57 == null || !l57.equals(callPeerConnectionSummaryEventLog.audioSendEncCngCount))) {
            return false;
        }
        Long l58 = this.audioSendAverageTargetBitrate;
        if ((l58 != null || callPeerConnectionSummaryEventLog.audioSendAverageTargetBitrate != null) && (l58 == null || !l58.equals(callPeerConnectionSummaryEventLog.audioSendAverageTargetBitrate))) {
            return false;
        }
        Long l59 = this.audioSendNumMediaStreamTracks;
        if ((l59 != null || callPeerConnectionSummaryEventLog.audioSendNumMediaStreamTracks != null) && (l59 == null || !l59.equals(callPeerConnectionSummaryEventLog.audioSendNumMediaStreamTracks))) {
            return false;
        }
        Long l60 = this.audioSendNumOutboundRtpStreams;
        if ((l60 != null || callPeerConnectionSummaryEventLog.audioSendNumOutboundRtpStreams != null) && (l60 == null || !l60.equals(callPeerConnectionSummaryEventLog.audioSendNumOutboundRtpStreams))) {
            return false;
        }
        Long l61 = this.audioSendAudioLevel;
        if ((l61 != null || callPeerConnectionSummaryEventLog.audioSendAudioLevel != null) && (l61 == null || !l61.equals(callPeerConnectionSummaryEventLog.audioSendAudioLevel))) {
            return false;
        }
        Long l62 = this.audioSendTotalAudioEnergy;
        if ((l62 != null || callPeerConnectionSummaryEventLog.audioSendTotalAudioEnergy != null) && (l62 == null || !l62.equals(callPeerConnectionSummaryEventLog.audioSendTotalAudioEnergy))) {
            return false;
        }
        Long l63 = this.audioSendEchoReturnLoss;
        if ((l63 != null || callPeerConnectionSummaryEventLog.audioSendEchoReturnLoss != null) && (l63 == null || !l63.equals(callPeerConnectionSummaryEventLog.audioSendEchoReturnLoss))) {
            return false;
        }
        Long l64 = this.audioSendEchoReturnLossEnhancement;
        if ((l64 != null || callPeerConnectionSummaryEventLog.audioSendEchoReturnLossEnhancement != null) && (l64 == null || !l64.equals(callPeerConnectionSummaryEventLog.audioSendEchoReturnLossEnhancement))) {
            return false;
        }
        Long l65 = this.audioSendTotalSamplesReceived;
        if ((l65 != null || callPeerConnectionSummaryEventLog.audioSendTotalSamplesReceived != null) && (l65 == null || !l65.equals(callPeerConnectionSummaryEventLog.audioSendTotalSamplesReceived))) {
            return false;
        }
        Long l66 = this.audioSendTotalSamplesDuration;
        if ((l66 != null || callPeerConnectionSummaryEventLog.audioSendTotalSamplesDuration != null) && (l66 == null || !l66.equals(callPeerConnectionSummaryEventLog.audioSendTotalSamplesDuration))) {
            return false;
        }
        Long l67 = this.audioSendCurrentIsacDownlinkBitrate;
        if ((l67 != null || callPeerConnectionSummaryEventLog.audioSendCurrentIsacDownlinkBitrate != null) && (l67 == null || !l67.equals(callPeerConnectionSummaryEventLog.audioSendCurrentIsacDownlinkBitrate))) {
            return false;
        }
        Long l68 = this.audioSendCurrentIsacUplinkBitrate;
        if ((l68 != null || callPeerConnectionSummaryEventLog.audioSendCurrentIsacUplinkBitrate != null) && (l68 == null || !l68.equals(callPeerConnectionSummaryEventLog.audioSendCurrentIsacUplinkBitrate))) {
            return false;
        }
        Long l69 = this.audioSendCurrentIsacExternalTargetBitrate;
        if ((l69 != null || callPeerConnectionSummaryEventLog.audioSendCurrentIsacExternalTargetBitrate != null) && (l69 == null || !l69.equals(callPeerConnectionSummaryEventLog.audioSendCurrentIsacExternalTargetBitrate))) {
            return false;
        }
        String str8 = this.audioDevice;
        if ((str8 != null || callPeerConnectionSummaryEventLog.audioDevice != null) && (str8 == null || !str8.equals(callPeerConnectionSummaryEventLog.audioDevice))) {
            return false;
        }
        Long l70 = this.audioDeviceRecordSampleRate;
        if ((l70 != null || callPeerConnectionSummaryEventLog.audioDeviceRecordSampleRate != null) && (l70 == null || !l70.equals(callPeerConnectionSummaryEventLog.audioDeviceRecordSampleRate))) {
            return false;
        }
        Long l71 = this.audioDeviceRecordChannel;
        if ((l71 != null || callPeerConnectionSummaryEventLog.audioDeviceRecordChannel != null) && (l71 == null || !l71.equals(callPeerConnectionSummaryEventLog.audioDeviceRecordChannel))) {
            return false;
        }
        Long l72 = this.audioDeviceRecordStall;
        if ((l72 != null || callPeerConnectionSummaryEventLog.audioDeviceRecordStall != null) && (l72 == null || !l72.equals(callPeerConnectionSummaryEventLog.audioDeviceRecordStall))) {
            return false;
        }
        Long l73 = this.audioDevicePlaySampleRate;
        if ((l73 != null || callPeerConnectionSummaryEventLog.audioDevicePlaySampleRate != null) && (l73 == null || !l73.equals(callPeerConnectionSummaryEventLog.audioDevicePlaySampleRate))) {
            return false;
        }
        Long l74 = this.audioDevicePlayChannel;
        if ((l74 != null || callPeerConnectionSummaryEventLog.audioDevicePlayChannel != null) && (l74 == null || !l74.equals(callPeerConnectionSummaryEventLog.audioDevicePlayChannel))) {
            return false;
        }
        Long l75 = this.audioDevicePlayStall;
        if ((l75 != null || callPeerConnectionSummaryEventLog.audioDevicePlayStall != null) && (l75 == null || !l75.equals(callPeerConnectionSummaryEventLog.audioDevicePlayStall))) {
            return false;
        }
        Long l76 = this.audioDeviceTotalStall;
        if ((l76 != null || callPeerConnectionSummaryEventLog.audioDeviceTotalStall != null) && (l76 == null || !l76.equals(callPeerConnectionSummaryEventLog.audioDeviceTotalStall))) {
            return false;
        }
        Long l77 = this.audioDeviceTotalRestart;
        if ((l77 != null || callPeerConnectionSummaryEventLog.audioDeviceTotalRestart != null) && (l77 == null || !l77.equals(callPeerConnectionSummaryEventLog.audioDeviceTotalRestart))) {
            return false;
        }
        Long l78 = this.audioDeviceTotalRestartSuccess;
        if ((l78 != null || callPeerConnectionSummaryEventLog.audioDeviceTotalRestartSuccess != null) && (l78 == null || !l78.equals(callPeerConnectionSummaryEventLog.audioDeviceTotalRestartSuccess))) {
            return false;
        }
        Long l79 = this.audioDeviceIsStalled;
        if ((l79 != null || callPeerConnectionSummaryEventLog.audioDeviceIsStalled != null) && (l79 == null || !l79.equals(callPeerConnectionSummaryEventLog.audioDeviceIsStalled))) {
            return false;
        }
        Long l80 = this.audioDeviceIsRestarting;
        if ((l80 != null || callPeerConnectionSummaryEventLog.audioDeviceIsRestarting != null) && (l80 == null || !l80.equals(callPeerConnectionSummaryEventLog.audioDeviceIsRestarting))) {
            return false;
        }
        Long l81 = this.audioDevicePlayFrames;
        if ((l81 != null || callPeerConnectionSummaryEventLog.audioDevicePlayFrames != null) && (l81 == null || !l81.equals(callPeerConnectionSummaryEventLog.audioDevicePlayFrames))) {
            return false;
        }
        Long l82 = this.audioDevicePlayLevelSum;
        if ((l82 != null || callPeerConnectionSummaryEventLog.audioDevicePlayLevelSum != null) && (l82 == null || !l82.equals(callPeerConnectionSummaryEventLog.audioDevicePlayLevelSum))) {
            return false;
        }
        Long l83 = this.audioDeviceRecordFrames;
        if ((l83 != null || callPeerConnectionSummaryEventLog.audioDeviceRecordFrames != null) && (l83 == null || !l83.equals(callPeerConnectionSummaryEventLog.audioDeviceRecordFrames))) {
            return false;
        }
        Long l84 = this.audioDeviceRecordLevelSum;
        if ((l84 != null || callPeerConnectionSummaryEventLog.audioDeviceRecordLevelSum != null) && (l84 == null || !l84.equals(callPeerConnectionSummaryEventLog.audioDeviceRecordLevelSum))) {
            return false;
        }
        Long l85 = this.availableOutgoingBitrate;
        if ((l85 != null || callPeerConnectionSummaryEventLog.availableOutgoingBitrate != null) && (l85 == null || !l85.equals(callPeerConnectionSummaryEventLog.availableOutgoingBitrate))) {
            return false;
        }
        Long l86 = this.availableIncomingBitrate;
        if ((l86 != null || callPeerConnectionSummaryEventLog.availableIncomingBitrate != null) && (l86 == null || !l86.equals(callPeerConnectionSummaryEventLog.availableIncomingBitrate))) {
            return false;
        }
        Long l87 = this.avgVideoActualEncodeBitrate;
        if ((l87 != null || callPeerConnectionSummaryEventLog.avgVideoActualEncodeBitrate != null) && (l87 == null || !l87.equals(callPeerConnectionSummaryEventLog.avgVideoActualEncodeBitrate))) {
            return false;
        }
        Long l88 = this.avgVideoTargetEncodeBitrate;
        if ((l88 != null || callPeerConnectionSummaryEventLog.avgVideoTargetEncodeBitrate != null) && (l88 == null || !l88.equals(callPeerConnectionSummaryEventLog.avgVideoTargetEncodeBitrate))) {
            return false;
        }
        Long l89 = this.avgVideoTransmitBitrate;
        if ((l89 != null || callPeerConnectionSummaryEventLog.avgVideoTransmitBitrate != null) && (l89 == null || !l89.equals(callPeerConnectionSummaryEventLog.avgVideoTransmitBitrate))) {
            return false;
        }
        Long l90 = this.avgVideoRetransmitBitrate;
        if ((l90 != null || callPeerConnectionSummaryEventLog.avgVideoRetransmitBitrate != null) && (l90 == null || !l90.equals(callPeerConnectionSummaryEventLog.avgVideoRetransmitBitrate))) {
            return false;
        }
        Long l91 = this.transportWifiBytesSent;
        if ((l91 != null || callPeerConnectionSummaryEventLog.transportWifiBytesSent != null) && (l91 == null || !l91.equals(callPeerConnectionSummaryEventLog.transportWifiBytesSent))) {
            return false;
        }
        Long l92 = this.transportWifiBytesRecv;
        if ((l92 != null || callPeerConnectionSummaryEventLog.transportWifiBytesRecv != null) && (l92 == null || !l92.equals(callPeerConnectionSummaryEventLog.transportWifiBytesRecv))) {
            return false;
        }
        Long l93 = this.transportCellBytesSent;
        if ((l93 != null || callPeerConnectionSummaryEventLog.transportCellBytesSent != null) && (l93 == null || !l93.equals(callPeerConnectionSummaryEventLog.transportCellBytesSent))) {
            return false;
        }
        Long l94 = this.transportCellBytesRecv;
        if ((l94 != null || callPeerConnectionSummaryEventLog.transportCellBytesRecv != null) && (l94 == null || !l94.equals(callPeerConnectionSummaryEventLog.transportCellBytesRecv))) {
            return false;
        }
        Long l95 = this.transportOtherBytesSent;
        if ((l95 != null || callPeerConnectionSummaryEventLog.transportOtherBytesSent != null) && (l95 == null || !l95.equals(callPeerConnectionSummaryEventLog.transportOtherBytesSent))) {
            return false;
        }
        Long l96 = this.transportOtherBytesRecv;
        if ((l96 != null || callPeerConnectionSummaryEventLog.transportOtherBytesRecv != null) && (l96 == null || !l96.equals(callPeerConnectionSummaryEventLog.transportOtherBytesRecv))) {
            return false;
        }
        String str9 = this.transportConnIpversion;
        if ((str9 != null || callPeerConnectionSummaryEventLog.transportConnIpversion != null) && (str9 == null || !str9.equals(callPeerConnectionSummaryEventLog.transportConnIpversion))) {
            return false;
        }
        String str10 = this.transportConnType;
        if ((str10 != null || callPeerConnectionSummaryEventLog.transportConnType != null) && (str10 == null || !str10.equals(callPeerConnectionSummaryEventLog.transportConnType))) {
            return false;
        }
        Long l97 = this.transportConnNetworkCost;
        if ((l97 != null || callPeerConnectionSummaryEventLog.transportConnNetworkCost != null) && (l97 == null || !l97.equals(callPeerConnectionSummaryEventLog.transportConnNetworkCost))) {
            return false;
        }
        Long l98 = this.transportConnRttMin;
        if ((l98 != null || callPeerConnectionSummaryEventLog.transportConnRttMin != null) && (l98 == null || !l98.equals(callPeerConnectionSummaryEventLog.transportConnRttMin))) {
            return false;
        }
        Long l99 = this.transportConnRttVar;
        if ((l99 != null || callPeerConnectionSummaryEventLog.transportConnRttVar != null) && (l99 == null || !l99.equals(callPeerConnectionSummaryEventLog.transportConnRttVar))) {
            return false;
        }
        Long l100 = this.transportConnRttMax;
        if ((l100 != null || callPeerConnectionSummaryEventLog.transportConnRttMax != null) && (l100 == null || !l100.equals(callPeerConnectionSummaryEventLog.transportConnRttMax))) {
            return false;
        }
        Long l101 = this.transportConnRttAvg;
        if ((l101 != null || callPeerConnectionSummaryEventLog.transportConnRttAvg != null) && (l101 == null || !l101.equals(callPeerConnectionSummaryEventLog.transportConnRttAvg))) {
            return false;
        }
        Long l102 = this.transportConnected;
        if ((l102 != null || callPeerConnectionSummaryEventLog.transportConnected != null) && (l102 == null || !l102.equals(callPeerConnectionSummaryEventLog.transportConnected))) {
            return false;
        }
        Long l103 = this.transportNumGaps;
        if ((l103 != null || callPeerConnectionSummaryEventLog.transportNumGaps != null) && (l103 == null || !l103.equals(callPeerConnectionSummaryEventLog.transportNumGaps))) {
            return false;
        }
        Long l104 = this.transportTotalGapDurationMs;
        if ((l104 != null || callPeerConnectionSummaryEventLog.transportTotalGapDurationMs != null) && (l104 == null || !l104.equals(callPeerConnectionSummaryEventLog.transportTotalGapDurationMs))) {
            return false;
        }
        Long l105 = this.gen0IceSentHost;
        if ((l105 != null || callPeerConnectionSummaryEventLog.gen0IceSentHost != null) && (l105 == null || !l105.equals(callPeerConnectionSummaryEventLog.gen0IceSentHost))) {
            return false;
        }
        Long l106 = this.gen0IceSentRelay;
        if ((l106 != null || callPeerConnectionSummaryEventLog.gen0IceSentRelay != null) && (l106 == null || !l106.equals(callPeerConnectionSummaryEventLog.gen0IceSentRelay))) {
            return false;
        }
        Long l107 = this.gen0IceSentSrflx;
        if ((l107 != null || callPeerConnectionSummaryEventLog.gen0IceSentSrflx != null) && (l107 == null || !l107.equals(callPeerConnectionSummaryEventLog.gen0IceSentSrflx))) {
            return false;
        }
        Long l108 = this.gen0IceSentPrflx;
        if ((l108 != null || callPeerConnectionSummaryEventLog.gen0IceSentPrflx != null) && (l108 == null || !l108.equals(callPeerConnectionSummaryEventLog.gen0IceSentPrflx))) {
            return false;
        }
        Long l109 = this.gen0IceReceivedHost;
        if ((l109 != null || callPeerConnectionSummaryEventLog.gen0IceReceivedHost != null) && (l109 == null || !l109.equals(callPeerConnectionSummaryEventLog.gen0IceReceivedHost))) {
            return false;
        }
        Long l110 = this.gen0IceReceivedRelay;
        if ((l110 != null || callPeerConnectionSummaryEventLog.gen0IceReceivedRelay != null) && (l110 == null || !l110.equals(callPeerConnectionSummaryEventLog.gen0IceReceivedRelay))) {
            return false;
        }
        Long l111 = this.gen0IceReceivedSrflx;
        if ((l111 != null || callPeerConnectionSummaryEventLog.gen0IceReceivedSrflx != null) && (l111 == null || !l111.equals(callPeerConnectionSummaryEventLog.gen0IceReceivedSrflx))) {
            return false;
        }
        Long l112 = this.gen0IceReceivedPrflx;
        if ((l112 != null || callPeerConnectionSummaryEventLog.gen0IceReceivedPrflx != null) && (l112 == null || !l112.equals(callPeerConnectionSummaryEventLog.gen0IceReceivedPrflx))) {
            return false;
        }
        Long l113 = this.videoRecvAggBytesRecv;
        if ((l113 != null || callPeerConnectionSummaryEventLog.videoRecvAggBytesRecv != null) && (l113 == null || !l113.equals(callPeerConnectionSummaryEventLog.videoRecvAggBytesRecv))) {
            return false;
        }
        Long l114 = this.videoRecvAggPacketsRecv;
        if ((l114 != null || callPeerConnectionSummaryEventLog.videoRecvAggPacketsRecv != null) && (l114 == null || !l114.equals(callPeerConnectionSummaryEventLog.videoRecvAggPacketsRecv))) {
            return false;
        }
        Long l115 = this.videoRecvAggPacketsLost;
        if ((l115 != null || callPeerConnectionSummaryEventLog.videoRecvAggPacketsLost != null) && (l115 == null || !l115.equals(callPeerConnectionSummaryEventLog.videoRecvAggPacketsLost))) {
            return false;
        }
        Long l116 = this.videoRecvAggFramesDecoded;
        if ((l116 != null || callPeerConnectionSummaryEventLog.videoRecvAggFramesDecoded != null) && (l116 == null || !l116.equals(callPeerConnectionSummaryEventLog.videoRecvAggFramesDecoded))) {
            return false;
        }
        Long l117 = this.videoRecvAggFramesRendered;
        if ((l117 != null || callPeerConnectionSummaryEventLog.videoRecvAggFramesRendered != null) && (l117 == null || !l117.equals(callPeerConnectionSummaryEventLog.videoRecvAggFramesRendered))) {
            return false;
        }
        Long l118 = this.videoRecvAggBytesDecoded;
        if ((l118 != null || callPeerConnectionSummaryEventLog.videoRecvAggBytesDecoded != null) && (l118 == null || !l118.equals(callPeerConnectionSummaryEventLog.videoRecvAggBytesDecoded))) {
            return false;
        }
        Long l119 = this.videoRecvAggDecodeTimeMs;
        if ((l119 != null || callPeerConnectionSummaryEventLog.videoRecvAggDecodeTimeMs != null) && (l119 == null || !l119.equals(callPeerConnectionSummaryEventLog.videoRecvAggDecodeTimeMs))) {
            return false;
        }
        Long l120 = this.videoRecvTotalPixelsDecoded;
        if ((l120 != null || callPeerConnectionSummaryEventLog.videoRecvTotalPixelsDecoded != null) && (l120 == null || !l120.equals(callPeerConnectionSummaryEventLog.videoRecvTotalPixelsDecoded))) {
            return false;
        }
        String str11 = this.videoRecvCodec;
        if ((str11 != null || callPeerConnectionSummaryEventLog.videoRecvCodec != null) && (str11 == null || !str11.equals(callPeerConnectionSummaryEventLog.videoRecvCodec))) {
            return false;
        }
        Long l121 = this.videoRecvPacketsRecv;
        if ((l121 != null || callPeerConnectionSummaryEventLog.videoRecvPacketsRecv != null) && (l121 == null || !l121.equals(callPeerConnectionSummaryEventLog.videoRecvPacketsRecv))) {
            return false;
        }
        Long l122 = this.videoRecvPacketsLost;
        if ((l122 != null || callPeerConnectionSummaryEventLog.videoRecvPacketsLost != null) && (l122 == null || !l122.equals(callPeerConnectionSummaryEventLog.videoRecvPacketsLost))) {
            return false;
        }
        Long l123 = this.videoRecvFrameWidth;
        if ((l123 != null || callPeerConnectionSummaryEventLog.videoRecvFrameWidth != null) && (l123 == null || !l123.equals(callPeerConnectionSummaryEventLog.videoRecvFrameWidth))) {
            return false;
        }
        Long l124 = this.videoRecvFrameHeight;
        if ((l124 != null || callPeerConnectionSummaryEventLog.videoRecvFrameHeight != null) && (l124 == null || !l124.equals(callPeerConnectionSummaryEventLog.videoRecvFrameHeight))) {
            return false;
        }
        Long l125 = this.videoRecvFramerateRecv;
        if ((l125 != null || callPeerConnectionSummaryEventLog.videoRecvFramerateRecv != null) && (l125 == null || !l125.equals(callPeerConnectionSummaryEventLog.videoRecvFramerateRecv))) {
            return false;
        }
        Long l126 = this.videoRecvFramerateDecoded;
        if ((l126 != null || callPeerConnectionSummaryEventLog.videoRecvFramerateDecoded != null) && (l126 == null || !l126.equals(callPeerConnectionSummaryEventLog.videoRecvFramerateDecoded))) {
            return false;
        }
        Long l127 = this.videoRecvFramerateOutput;
        if ((l127 != null || callPeerConnectionSummaryEventLog.videoRecvFramerateOutput != null) && (l127 == null || !l127.equals(callPeerConnectionSummaryEventLog.videoRecvFramerateOutput))) {
            return false;
        }
        Long l128 = this.videoRecvFramesDecoded;
        if ((l128 != null || callPeerConnectionSummaryEventLog.videoRecvFramesDecoded != null) && (l128 == null || !l128.equals(callPeerConnectionSummaryEventLog.videoRecvFramesDecoded))) {
            return false;
        }
        Long l129 = this.videoRecvQpSum;
        if ((l129 != null || callPeerConnectionSummaryEventLog.videoRecvQpSum != null) && (l129 == null || !l129.equals(callPeerConnectionSummaryEventLog.videoRecvQpSum))) {
            return false;
        }
        Long l130 = this.videoRecvFramesRendered;
        if ((l130 != null || callPeerConnectionSummaryEventLog.videoRecvFramesRendered != null) && (l130 == null || !l130.equals(callPeerConnectionSummaryEventLog.videoRecvFramesRendered))) {
            return false;
        }
        Long l131 = this.videoRecvRenderDurationMs;
        if ((l131 != null || callPeerConnectionSummaryEventLog.videoRecvRenderDurationMs != null) && (l131 == null || !l131.equals(callPeerConnectionSummaryEventLog.videoRecvRenderDurationMs))) {
            return false;
        }
        Long l132 = this.videoRecvTotalPixelsRendered;
        if ((l132 != null || callPeerConnectionSummaryEventLog.videoRecvTotalPixelsRendered != null) && (l132 == null || !l132.equals(callPeerConnectionSummaryEventLog.videoRecvTotalPixelsRendered))) {
            return false;
        }
        Long l133 = this.videoRecvPauseCount;
        if ((l133 != null || callPeerConnectionSummaryEventLog.videoRecvPauseCount != null) && (l133 == null || !l133.equals(callPeerConnectionSummaryEventLog.videoRecvPauseCount))) {
            return false;
        }
        Long l134 = this.videoRecvPauseDurationMs;
        if ((l134 != null || callPeerConnectionSummaryEventLog.videoRecvPauseDurationMs != null) && (l134 == null || !l134.equals(callPeerConnectionSummaryEventLog.videoRecvPauseDurationMs))) {
            return false;
        }
        Long l135 = this.videoRecvFreezeCount;
        if ((l135 != null || callPeerConnectionSummaryEventLog.videoRecvFreezeCount != null) && (l135 == null || !l135.equals(callPeerConnectionSummaryEventLog.videoRecvFreezeCount))) {
            return false;
        }
        Long l136 = this.videoRecvFreezeDuration;
        if ((l136 != null || callPeerConnectionSummaryEventLog.videoRecvFreezeDuration != null) && (l136 == null || !l136.equals(callPeerConnectionSummaryEventLog.videoRecvFreezeDuration))) {
            return false;
        }
        Long l137 = this.videoRecvNacksSent;
        if ((l137 != null || callPeerConnectionSummaryEventLog.videoRecvNacksSent != null) && (l137 == null || !l137.equals(callPeerConnectionSummaryEventLog.videoRecvNacksSent))) {
            return false;
        }
        Long l138 = this.videoRecvFirsSent;
        if ((l138 != null || callPeerConnectionSummaryEventLog.videoRecvFirsSent != null) && (l138 == null || !l138.equals(callPeerConnectionSummaryEventLog.videoRecvFirsSent))) {
            return false;
        }
        Long l139 = this.videoRecvPlisSent;
        if ((l139 != null || callPeerConnectionSummaryEventLog.videoRecvPlisSent != null) && (l139 == null || !l139.equals(callPeerConnectionSummaryEventLog.videoRecvPlisSent))) {
            return false;
        }
        Long l140 = this.videoRecvAvgRecvLatencyMs;
        if ((l140 != null || callPeerConnectionSummaryEventLog.videoRecvAvgRecvLatencyMs != null) && (l140 == null || !l140.equals(callPeerConnectionSummaryEventLog.videoRecvAvgRecvLatencyMs))) {
            return false;
        }
        Long l141 = this.videoRecvAvgJitterBufferLatencyMs;
        if ((l141 != null || callPeerConnectionSummaryEventLog.videoRecvAvgJitterBufferLatencyMs != null) && (l141 == null || !l141.equals(callPeerConnectionSummaryEventLog.videoRecvAvgJitterBufferLatencyMs))) {
            return false;
        }
        Long l142 = this.videoRecvAvgDecodeLatencyMs;
        if ((l142 != null || callPeerConnectionSummaryEventLog.videoRecvAvgDecodeLatencyMs != null) && (l142 == null || !l142.equals(callPeerConnectionSummaryEventLog.videoRecvAvgDecodeLatencyMs))) {
            return false;
        }
        Long l143 = this.videoRecvAvgE2eLatencyMs;
        if ((l143 != null || callPeerConnectionSummaryEventLog.videoRecvAvgE2eLatencyMs != null) && (l143 == null || !l143.equals(callPeerConnectionSummaryEventLog.videoRecvAvgE2eLatencyMs))) {
            return false;
        }
        Long l144 = this.videoRecvPaddingPacketsReceived;
        if ((l144 != null || callPeerConnectionSummaryEventLog.videoRecvPaddingPacketsReceived != null) && (l144 == null || !l144.equals(callPeerConnectionSummaryEventLog.videoRecvPaddingPacketsReceived))) {
            return false;
        }
        Long l145 = this.videoRecvJitterBufferFramesOut;
        if ((l145 != null || callPeerConnectionSummaryEventLog.videoRecvJitterBufferFramesOut != null) && (l145 == null || !l145.equals(callPeerConnectionSummaryEventLog.videoRecvJitterBufferFramesOut))) {
            return false;
        }
        Long l146 = this.videoRecvJitterBufferKeyframesOut;
        if ((l146 != null || callPeerConnectionSummaryEventLog.videoRecvJitterBufferKeyframesOut != null) && (l146 == null || !l146.equals(callPeerConnectionSummaryEventLog.videoRecvJitterBufferKeyframesOut))) {
            return false;
        }
        Long l147 = this.videoRecvJitterBufferFramesAssembled;
        if ((l147 != null || callPeerConnectionSummaryEventLog.videoRecvJitterBufferFramesAssembled != null) && (l147 == null || !l147.equals(callPeerConnectionSummaryEventLog.videoRecvJitterBufferFramesAssembled))) {
            return false;
        }
        String str12 = this.videoSendCodec;
        if ((str12 != null || callPeerConnectionSummaryEventLog.videoSendCodec != null) && (str12 == null || !str12.equals(callPeerConnectionSummaryEventLog.videoSendCodec))) {
            return false;
        }
        Long l148 = this.videoSendBytesSent;
        if ((l148 != null || callPeerConnectionSummaryEventLog.videoSendBytesSent != null) && (l148 == null || !l148.equals(callPeerConnectionSummaryEventLog.videoSendBytesSent))) {
            return false;
        }
        Long l149 = this.videoSendPacketsSent;
        if ((l149 != null || callPeerConnectionSummaryEventLog.videoSendPacketsSent != null) && (l149 == null || !l149.equals(callPeerConnectionSummaryEventLog.videoSendPacketsSent))) {
            return false;
        }
        Long l150 = this.videoSendPacketsLost;
        if ((l150 != null || callPeerConnectionSummaryEventLog.videoSendPacketsLost != null) && (l150 == null || !l150.equals(callPeerConnectionSummaryEventLog.videoSendPacketsLost))) {
            return false;
        }
        Long l151 = this.videoSendFramesSent;
        if ((l151 != null || callPeerConnectionSummaryEventLog.videoSendFramesSent != null) && (l151 == null || !l151.equals(callPeerConnectionSummaryEventLog.videoSendFramesSent))) {
            return false;
        }
        Long l152 = this.videoSendFramesCaptured;
        if ((l152 != null || callPeerConnectionSummaryEventLog.videoSendFramesCaptured != null) && (l152 == null || !l152.equals(callPeerConnectionSummaryEventLog.videoSendFramesCaptured))) {
            return false;
        }
        Long l153 = this.videoSendAverageCapturePixelsPerFrame;
        if ((l153 != null || callPeerConnectionSummaryEventLog.videoSendAverageCapturePixelsPerFrame != null) && (l153 == null || !l153.equals(callPeerConnectionSummaryEventLog.videoSendAverageCapturePixelsPerFrame))) {
            return false;
        }
        Long l154 = this.videoSendCaptureDurationMs;
        if ((l154 != null || callPeerConnectionSummaryEventLog.videoSendCaptureDurationMs != null) && (l154 == null || !l154.equals(callPeerConnectionSummaryEventLog.videoSendCaptureDurationMs))) {
            return false;
        }
        Long l155 = this.videoSendKeyFramesEncoded;
        if ((l155 != null || callPeerConnectionSummaryEventLog.videoSendKeyFramesEncoded != null) && (l155 == null || !l155.equals(callPeerConnectionSummaryEventLog.videoSendKeyFramesEncoded))) {
            return false;
        }
        Long l156 = this.videoSendFrameWidthInput;
        if ((l156 != null || callPeerConnectionSummaryEventLog.videoSendFrameWidthInput != null) && (l156 == null || !l156.equals(callPeerConnectionSummaryEventLog.videoSendFrameWidthInput))) {
            return false;
        }
        Long l157 = this.videoSendFrameHeightInput;
        if ((l157 != null || callPeerConnectionSummaryEventLog.videoSendFrameHeightInput != null) && (l157 == null || !l157.equals(callPeerConnectionSummaryEventLog.videoSendFrameHeightInput))) {
            return false;
        }
        Long l158 = this.videoSendFrameWidth;
        if ((l158 != null || callPeerConnectionSummaryEventLog.videoSendFrameWidth != null) && (l158 == null || !l158.equals(callPeerConnectionSummaryEventLog.videoSendFrameWidth))) {
            return false;
        }
        Long l159 = this.videoSendFrameHeight;
        if ((l159 != null || callPeerConnectionSummaryEventLog.videoSendFrameHeight != null) && (l159 == null || !l159.equals(callPeerConnectionSummaryEventLog.videoSendFrameHeight))) {
            return false;
        }
        Long l160 = this.videoSendNacksRecv;
        if ((l160 != null || callPeerConnectionSummaryEventLog.videoSendNacksRecv != null) && (l160 == null || !l160.equals(callPeerConnectionSummaryEventLog.videoSendNacksRecv))) {
            return false;
        }
        Long l161 = this.videoSendFirsRecv;
        if ((l161 != null || callPeerConnectionSummaryEventLog.videoSendFirsRecv != null) && (l161 == null || !l161.equals(callPeerConnectionSummaryEventLog.videoSendFirsRecv))) {
            return false;
        }
        Long l162 = this.videoSendPlisRecv;
        if ((l162 != null || callPeerConnectionSummaryEventLog.videoSendPlisRecv != null) && (l162 == null || !l162.equals(callPeerConnectionSummaryEventLog.videoSendPlisRecv))) {
            return false;
        }
        Long l163 = this.videoSendQpSum;
        if ((l163 != null || callPeerConnectionSummaryEventLog.videoSendQpSum != null) && (l163 == null || !l163.equals(callPeerConnectionSummaryEventLog.videoSendQpSum))) {
            return false;
        }
        Long l164 = this.videoSendAvgEncodeMs;
        if ((l164 != null || callPeerConnectionSummaryEventLog.videoSendAvgEncodeMs != null) && (l164 == null || !l164.equals(callPeerConnectionSummaryEventLog.videoSendAvgEncodeMs))) {
            return false;
        }
        Long l165 = this.videoSendAverageTargetBitrate;
        if ((l165 != null || callPeerConnectionSummaryEventLog.videoSendAverageTargetBitrate != null) && (l165 == null || !l165.equals(callPeerConnectionSummaryEventLog.videoSendAverageTargetBitrate))) {
            return false;
        }
        Long l166 = this.videoSendFramesEncoded;
        if ((l166 != null || callPeerConnectionSummaryEventLog.videoSendFramesEncoded != null) && (l166 == null || !l166.equals(callPeerConnectionSummaryEventLog.videoSendFramesEncoded))) {
            return false;
        }
        Long l167 = this.videoSendFramesSendToEncoder;
        if ((l167 != null || callPeerConnectionSummaryEventLog.videoSendFramesSendToEncoder != null) && (l167 == null || !l167.equals(callPeerConnectionSummaryEventLog.videoSendFramesSendToEncoder))) {
            return false;
        }
        Long l168 = this.videoSendTotalInputPixel;
        if ((l168 != null || callPeerConnectionSummaryEventLog.videoSendTotalInputPixel != null) && (l168 == null || !l168.equals(callPeerConnectionSummaryEventLog.videoSendTotalInputPixel))) {
            return false;
        }
        Long l169 = this.videoSendTotalOutputPixel;
        if ((l169 != null || callPeerConnectionSummaryEventLog.videoSendTotalOutputPixel != null) && (l169 == null || !l169.equals(callPeerConnectionSummaryEventLog.videoSendTotalOutputPixel))) {
            return false;
        }
        Long l170 = this.initialProbingAttempted;
        if ((l170 != null || callPeerConnectionSummaryEventLog.initialProbingAttempted != null) && (l170 == null || !l170.equals(callPeerConnectionSummaryEventLog.initialProbingAttempted))) {
            return false;
        }
        Long l171 = this.initialProbingResult;
        if ((l171 != null || callPeerConnectionSummaryEventLog.initialProbingResult != null) && (l171 == null || !l171.equals(callPeerConnectionSummaryEventLog.initialProbingResult))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        int hashCode47;
        int hashCode48;
        int hashCode49;
        int hashCode50;
        int hashCode51;
        int hashCode52;
        int hashCode53;
        int hashCode54;
        int hashCode55;
        int hashCode56;
        int hashCode57;
        int hashCode58;
        int hashCode59;
        int hashCode60;
        int hashCode61;
        int hashCode62;
        int hashCode63;
        int hashCode64;
        int hashCode65;
        int hashCode66;
        int hashCode67;
        int hashCode68;
        int hashCode69;
        int hashCode70;
        int hashCode71;
        int hashCode72;
        int hashCode73;
        int hashCode74;
        int hashCode75;
        int hashCode76;
        int hashCode77;
        int hashCode78;
        int hashCode79;
        int hashCode80;
        int hashCode81;
        int hashCode82;
        int hashCode83;
        int hashCode84;
        int hashCode85;
        int hashCode86;
        int hashCode87;
        int hashCode88;
        int hashCode89;
        int hashCode90;
        int hashCode91;
        int hashCode92;
        int hashCode93;
        int hashCode94;
        int hashCode95;
        int hashCode96;
        int hashCode97;
        int hashCode98;
        int hashCode99;
        int hashCode100;
        int hashCode101;
        int hashCode102;
        int hashCode103;
        int hashCode104;
        int hashCode105;
        int hashCode106;
        int hashCode107;
        int hashCode108;
        int hashCode109;
        int hashCode110;
        int hashCode111;
        int hashCode112;
        int hashCode113;
        int hashCode114;
        int hashCode115;
        int hashCode116;
        int hashCode117;
        int hashCode118;
        int hashCode119;
        int hashCode120;
        int hashCode121;
        int hashCode122;
        int hashCode123;
        int hashCode124;
        int hashCode125;
        int hashCode126;
        int hashCode127;
        int hashCode128;
        int hashCode129;
        int hashCode130;
        int hashCode131;
        int hashCode132;
        int hashCode133;
        int hashCode134;
        int hashCode135;
        int hashCode136;
        int hashCode137;
        int hashCode138;
        int hashCode139;
        int hashCode140;
        int hashCode141;
        int hashCode142;
        int hashCode143;
        int hashCode144;
        int hashCode145;
        int hashCode146;
        int hashCode147;
        int hashCode148;
        int hashCode149;
        int hashCode150;
        int hashCode151;
        int hashCode152;
        int hashCode153;
        int hashCode154;
        int hashCode155;
        int hashCode156;
        int hashCode157;
        int hashCode158;
        int hashCode159;
        int hashCode160;
        int hashCode161;
        int hashCode162;
        int hashCode163;
        int hashCode164;
        int hashCode165;
        int hashCode166;
        int hashCode167;
        int hashCode168;
        int hashCode169;
        int hashCode170;
        int hashCode171;
        int hashCode172;
        int hashCode173;
        int hashCode174;
        int hashCode175;
        int hashCode176;
        int hashCode177;
        int hashCode178;
        int hashCode179;
        int hashCode180;
        int hashCode181;
        int hashCode182;
        String str = this.connectionLoggingId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        String str2 = this.localCallId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.sharedCallId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l = this.peerId;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        long j = this.systemTimeMs;
        long j2 = this.steadyTimeMs;
        int i5 = (((((i4 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str4 = this.protocol;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.webrtcVersion;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this.audioRecvCodec;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Long l2 = this.audioRecvBytesRecv;
        if (l2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Long l3 = this.audioRecvPacketsRecv;
        if (l3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l3.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Long l4 = this.audioRecvPacketsLost;
        if (l4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l4.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Long l5 = this.audioRecvNeteqCallToSilenceGenerator;
        if (l5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l5.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Long l6 = this.audioRecvNeteqOperations;
        if (l6 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l6.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        Long l7 = this.audioRecvNeteqOperationErrors;
        if (l7 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l7.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        Long l8 = this.audioRecvNeteqNoOperations;
        if (l8 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l8.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        Long l9 = this.audioRecvNeteqNormal;
        if (l9 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = l9.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        Long l10 = this.audioRecvNeteqPlc;
        if (l10 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = l10.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        Long l11 = this.audioRecvNeteqCng;
        if (l11 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = l11.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        Long l12 = this.audioRecvNeteqPlccng;
        if (l12 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = l12.hashCode();
        }
        int i19 = (i18 + hashCode18) * 31;
        Long l13 = this.audioRecvNeteqAccelerate;
        if (l13 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = l13.hashCode();
        }
        int i20 = (i19 + hashCode19) * 31;
        Long l14 = this.audioRecvNeteqPreemptiveExpand;
        if (l14 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = l14.hashCode();
        }
        int i21 = (i20 + hashCode20) * 31;
        Long l15 = this.audioRecvNeteqMutedOutput;
        if (l15 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = l15.hashCode();
        }
        int i22 = (i21 + hashCode21) * 31;
        Long l16 = this.audioRecvNeteqAttemptOperations;
        if (l16 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = l16.hashCode();
        }
        int i23 = (i22 + hashCode22) * 31;
        Long l17 = this.audioRecvNeteqMeanWaitMs;
        if (l17 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = l17.hashCode();
        }
        int i24 = (i23 + hashCode23) * 31;
        Long l18 = this.audioRecvNeteqMaxWaitMs;
        if (l18 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = l18.hashCode();
        }
        int i25 = (i24 + hashCode24) * 31;
        Long l19 = this.audioRecvReceivedLatencyMs;
        if (l19 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = l19.hashCode();
        }
        int i26 = (i25 + hashCode25) * 31;
        Long l20 = this.audioRecvNumMediaStreamTracks;
        if (l20 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = l20.hashCode();
        }
        int i27 = (i26 + hashCode26) * 31;
        Long l21 = this.audioRecvNumInboundRtpStreams;
        if (l21 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = l21.hashCode();
        }
        int i28 = (i27 + hashCode27) * 31;
        Long l22 = this.audioRecvJitterBufferDelay;
        if (l22 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = l22.hashCode();
        }
        int i29 = (i28 + hashCode28) * 31;
        Long l23 = this.audioRecvJitterBufferEmittedCount;
        if (l23 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = l23.hashCode();
        }
        int i30 = (i29 + hashCode29) * 31;
        Long l24 = this.audioRecvAudioLevel;
        if (l24 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = l24.hashCode();
        }
        int i31 = (i30 + hashCode30) * 31;
        Long l25 = this.audioRecvAudioLevelConverted;
        if (l25 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = l25.hashCode();
        }
        int i32 = (i31 + hashCode31) * 31;
        Long l26 = this.audioRecvTotalAudioEnergy;
        if (l26 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = l26.hashCode();
        }
        int i33 = (i32 + hashCode32) * 31;
        Long l27 = this.audioRecvTotalSamplesReceived;
        if (l27 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = l27.hashCode();
        }
        int i34 = (i33 + hashCode33) * 31;
        Long l28 = this.audioRecvTotalSamplesDuration;
        if (l28 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = l28.hashCode();
        }
        int i35 = (i34 + hashCode34) * 31;
        Long l29 = this.audioRecvConcealedSamples;
        if (l29 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = l29.hashCode();
        }
        int i36 = (i35 + hashCode35) * 31;
        Long l30 = this.audioRecvSilentConcealedSamples;
        if (l30 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = l30.hashCode();
        }
        int i37 = (i36 + hashCode36) * 31;
        Long l31 = this.audioRecvConcealmentEvents;
        if (l31 == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = l31.hashCode();
        }
        int i38 = (i37 + hashCode37) * 31;
        Long l32 = this.audioRecvInsertedSamplesForDeceleration;
        if (l32 == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = l32.hashCode();
        }
        int i39 = (i38 + hashCode38) * 31;
        Long l33 = this.audioRecvRemovedSamplesForDeceleration;
        if (l33 == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = l33.hashCode();
        }
        int i40 = (i39 + hashCode39) * 31;
        Long l34 = this.audioRecvJitterBufferFlushes;
        if (l34 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = l34.hashCode();
        }
        int i41 = (i40 + hashCode40) * 31;
        Long l35 = this.audioRecvDelayedPacketOutageSamples;
        if (l35 == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = l35.hashCode();
        }
        int i42 = (i41 + hashCode41) * 31;
        Long l36 = this.audioRecvRelativePacketArrivalDelay;
        if (l36 == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = l36.hashCode();
        }
        int i43 = (i42 + hashCode42) * 31;
        Long l37 = this.audioRecvFecPacketsReceived;
        if (l37 == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = l37.hashCode();
        }
        int i44 = (i43 + hashCode43) * 31;
        Long l38 = this.audioRecvFecPacketsDiscarded;
        if (l38 == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = l38.hashCode();
        }
        int i45 = (i44 + hashCode44) * 31;
        Long l39 = this.audioRecvPacketsDiscarded;
        if (l39 == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = l39.hashCode();
        }
        int i46 = (i45 + hashCode45) * 31;
        Long l40 = this.audioRecvPacketsRepaired;
        if (l40 == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = l40.hashCode();
        }
        int i47 = (i46 + hashCode46) * 31;
        Long l41 = this.audioRecvJitter;
        if (l41 == null) {
            hashCode47 = 0;
        } else {
            hashCode47 = l41.hashCode();
        }
        int i48 = (i47 + hashCode47) * 31;
        Long l42 = this.audioRecvFractionLost;
        if (l42 == null) {
            hashCode48 = 0;
        } else {
            hashCode48 = l42.hashCode();
        }
        int i49 = (i48 + hashCode48) * 31;
        Long l43 = this.audioRecvRoundTripTime;
        if (l43 == null) {
            hashCode49 = 0;
        } else {
            hashCode49 = l43.hashCode();
        }
        int i50 = (i49 + hashCode49) * 31;
        Long l44 = this.audioRecvBurstPacketsLost;
        if (l44 == null) {
            hashCode50 = 0;
        } else {
            hashCode50 = l44.hashCode();
        }
        int i51 = (i50 + hashCode50) * 31;
        Long l45 = this.audioRecvBurstPacketsDiscarded;
        if (l45 == null) {
            hashCode51 = 0;
        } else {
            hashCode51 = l45.hashCode();
        }
        int i52 = (i51 + hashCode51) * 31;
        Long l46 = this.audioRecvBurstLossCount;
        if (l46 == null) {
            hashCode52 = 0;
        } else {
            hashCode52 = l46.hashCode();
        }
        int i53 = (i52 + hashCode52) * 31;
        Long l47 = this.audioRecvBurstDiscardCount;
        if (l47 == null) {
            hashCode53 = 0;
        } else {
            hashCode53 = l47.hashCode();
        }
        int i54 = (i53 + hashCode53) * 31;
        Long l48 = this.audioRecvPaddingPacketsReceived;
        if (l48 == null) {
            hashCode54 = 0;
        } else {
            hashCode54 = l48.hashCode();
        }
        int i55 = (i54 + hashCode54) * 31;
        Long l49 = this.audioRecvJitterBufferFramesOut;
        if (l49 == null) {
            hashCode55 = 0;
        } else {
            hashCode55 = l49.hashCode();
        }
        int i56 = (i55 + hashCode55) * 31;
        Long l50 = this.audioRecvJitterBufferKeyframesOut;
        if (l50 == null) {
            hashCode56 = 0;
        } else {
            hashCode56 = l50.hashCode();
        }
        int i57 = (i56 + hashCode56) * 31;
        Long l51 = this.audioRecvJitterBufferFramesAssembled;
        if (l51 == null) {
            hashCode57 = 0;
        } else {
            hashCode57 = l51.hashCode();
        }
        int i58 = (i57 + hashCode57) * 31;
        String str7 = this.audioSendCodec;
        if (str7 == null) {
            hashCode58 = 0;
        } else {
            hashCode58 = str7.hashCode();
        }
        int i59 = (i58 + hashCode58) * 31;
        Long l52 = this.audioSendBytesSent;
        if (l52 == null) {
            hashCode59 = 0;
        } else {
            hashCode59 = l52.hashCode();
        }
        int i60 = (i59 + hashCode59) * 31;
        Long l53 = this.audioSendPacketsSent;
        if (l53 == null) {
            hashCode60 = 0;
        } else {
            hashCode60 = l53.hashCode();
        }
        int i61 = (i60 + hashCode60) * 31;
        Long l54 = this.audioSendPacketsLost;
        if (l54 == null) {
            hashCode61 = 0;
        } else {
            hashCode61 = l54.hashCode();
        }
        int i62 = (i61 + hashCode61) * 31;
        Long l55 = this.audioSendEncEmptyCount;
        if (l55 == null) {
            hashCode62 = 0;
        } else {
            hashCode62 = l55.hashCode();
        }
        int i63 = (i62 + hashCode62) * 31;
        Long l56 = this.audioSendEncSpeechCount;
        if (l56 == null) {
            hashCode63 = 0;
        } else {
            hashCode63 = l56.hashCode();
        }
        int i64 = (i63 + hashCode63) * 31;
        Long l57 = this.audioSendEncCngCount;
        if (l57 == null) {
            hashCode64 = 0;
        } else {
            hashCode64 = l57.hashCode();
        }
        int i65 = (i64 + hashCode64) * 31;
        Long l58 = this.audioSendAverageTargetBitrate;
        if (l58 == null) {
            hashCode65 = 0;
        } else {
            hashCode65 = l58.hashCode();
        }
        int i66 = (i65 + hashCode65) * 31;
        Long l59 = this.audioSendNumMediaStreamTracks;
        if (l59 == null) {
            hashCode66 = 0;
        } else {
            hashCode66 = l59.hashCode();
        }
        int i67 = (i66 + hashCode66) * 31;
        Long l60 = this.audioSendNumOutboundRtpStreams;
        if (l60 == null) {
            hashCode67 = 0;
        } else {
            hashCode67 = l60.hashCode();
        }
        int i68 = (i67 + hashCode67) * 31;
        Long l61 = this.audioSendAudioLevel;
        if (l61 == null) {
            hashCode68 = 0;
        } else {
            hashCode68 = l61.hashCode();
        }
        int i69 = (i68 + hashCode68) * 31;
        Long l62 = this.audioSendTotalAudioEnergy;
        if (l62 == null) {
            hashCode69 = 0;
        } else {
            hashCode69 = l62.hashCode();
        }
        int i70 = (i69 + hashCode69) * 31;
        Long l63 = this.audioSendEchoReturnLoss;
        if (l63 == null) {
            hashCode70 = 0;
        } else {
            hashCode70 = l63.hashCode();
        }
        int i71 = (i70 + hashCode70) * 31;
        Long l64 = this.audioSendEchoReturnLossEnhancement;
        if (l64 == null) {
            hashCode71 = 0;
        } else {
            hashCode71 = l64.hashCode();
        }
        int i72 = (i71 + hashCode71) * 31;
        Long l65 = this.audioSendTotalSamplesReceived;
        if (l65 == null) {
            hashCode72 = 0;
        } else {
            hashCode72 = l65.hashCode();
        }
        int i73 = (i72 + hashCode72) * 31;
        Long l66 = this.audioSendTotalSamplesDuration;
        if (l66 == null) {
            hashCode73 = 0;
        } else {
            hashCode73 = l66.hashCode();
        }
        int i74 = (i73 + hashCode73) * 31;
        Long l67 = this.audioSendCurrentIsacDownlinkBitrate;
        if (l67 == null) {
            hashCode74 = 0;
        } else {
            hashCode74 = l67.hashCode();
        }
        int i75 = (i74 + hashCode74) * 31;
        Long l68 = this.audioSendCurrentIsacUplinkBitrate;
        if (l68 == null) {
            hashCode75 = 0;
        } else {
            hashCode75 = l68.hashCode();
        }
        int i76 = (i75 + hashCode75) * 31;
        Long l69 = this.audioSendCurrentIsacExternalTargetBitrate;
        if (l69 == null) {
            hashCode76 = 0;
        } else {
            hashCode76 = l69.hashCode();
        }
        int i77 = (i76 + hashCode76) * 31;
        String str8 = this.audioDevice;
        if (str8 == null) {
            hashCode77 = 0;
        } else {
            hashCode77 = str8.hashCode();
        }
        int i78 = (i77 + hashCode77) * 31;
        Long l70 = this.audioDeviceRecordSampleRate;
        if (l70 == null) {
            hashCode78 = 0;
        } else {
            hashCode78 = l70.hashCode();
        }
        int i79 = (i78 + hashCode78) * 31;
        Long l71 = this.audioDeviceRecordChannel;
        if (l71 == null) {
            hashCode79 = 0;
        } else {
            hashCode79 = l71.hashCode();
        }
        int i80 = (i79 + hashCode79) * 31;
        Long l72 = this.audioDeviceRecordStall;
        if (l72 == null) {
            hashCode80 = 0;
        } else {
            hashCode80 = l72.hashCode();
        }
        int i81 = (i80 + hashCode80) * 31;
        Long l73 = this.audioDevicePlaySampleRate;
        if (l73 == null) {
            hashCode81 = 0;
        } else {
            hashCode81 = l73.hashCode();
        }
        int i82 = (i81 + hashCode81) * 31;
        Long l74 = this.audioDevicePlayChannel;
        if (l74 == null) {
            hashCode82 = 0;
        } else {
            hashCode82 = l74.hashCode();
        }
        int i83 = (i82 + hashCode82) * 31;
        Long l75 = this.audioDevicePlayStall;
        if (l75 == null) {
            hashCode83 = 0;
        } else {
            hashCode83 = l75.hashCode();
        }
        int i84 = (i83 + hashCode83) * 31;
        Long l76 = this.audioDeviceTotalStall;
        if (l76 == null) {
            hashCode84 = 0;
        } else {
            hashCode84 = l76.hashCode();
        }
        int i85 = (i84 + hashCode84) * 31;
        Long l77 = this.audioDeviceTotalRestart;
        if (l77 == null) {
            hashCode85 = 0;
        } else {
            hashCode85 = l77.hashCode();
        }
        int i86 = (i85 + hashCode85) * 31;
        Long l78 = this.audioDeviceTotalRestartSuccess;
        if (l78 == null) {
            hashCode86 = 0;
        } else {
            hashCode86 = l78.hashCode();
        }
        int i87 = (i86 + hashCode86) * 31;
        Long l79 = this.audioDeviceIsStalled;
        if (l79 == null) {
            hashCode87 = 0;
        } else {
            hashCode87 = l79.hashCode();
        }
        int i88 = (i87 + hashCode87) * 31;
        Long l80 = this.audioDeviceIsRestarting;
        if (l80 == null) {
            hashCode88 = 0;
        } else {
            hashCode88 = l80.hashCode();
        }
        int i89 = (i88 + hashCode88) * 31;
        Long l81 = this.audioDevicePlayFrames;
        if (l81 == null) {
            hashCode89 = 0;
        } else {
            hashCode89 = l81.hashCode();
        }
        int i90 = (i89 + hashCode89) * 31;
        Long l82 = this.audioDevicePlayLevelSum;
        if (l82 == null) {
            hashCode90 = 0;
        } else {
            hashCode90 = l82.hashCode();
        }
        int i91 = (i90 + hashCode90) * 31;
        Long l83 = this.audioDeviceRecordFrames;
        if (l83 == null) {
            hashCode91 = 0;
        } else {
            hashCode91 = l83.hashCode();
        }
        int i92 = (i91 + hashCode91) * 31;
        Long l84 = this.audioDeviceRecordLevelSum;
        if (l84 == null) {
            hashCode92 = 0;
        } else {
            hashCode92 = l84.hashCode();
        }
        int i93 = (i92 + hashCode92) * 31;
        Long l85 = this.availableOutgoingBitrate;
        if (l85 == null) {
            hashCode93 = 0;
        } else {
            hashCode93 = l85.hashCode();
        }
        int i94 = (i93 + hashCode93) * 31;
        Long l86 = this.availableIncomingBitrate;
        if (l86 == null) {
            hashCode94 = 0;
        } else {
            hashCode94 = l86.hashCode();
        }
        int i95 = (i94 + hashCode94) * 31;
        Long l87 = this.avgVideoActualEncodeBitrate;
        if (l87 == null) {
            hashCode95 = 0;
        } else {
            hashCode95 = l87.hashCode();
        }
        int i96 = (i95 + hashCode95) * 31;
        Long l88 = this.avgVideoTargetEncodeBitrate;
        if (l88 == null) {
            hashCode96 = 0;
        } else {
            hashCode96 = l88.hashCode();
        }
        int i97 = (i96 + hashCode96) * 31;
        Long l89 = this.avgVideoTransmitBitrate;
        if (l89 == null) {
            hashCode97 = 0;
        } else {
            hashCode97 = l89.hashCode();
        }
        int i98 = (i97 + hashCode97) * 31;
        Long l90 = this.avgVideoRetransmitBitrate;
        if (l90 == null) {
            hashCode98 = 0;
        } else {
            hashCode98 = l90.hashCode();
        }
        int i99 = (i98 + hashCode98) * 31;
        Long l91 = this.transportWifiBytesSent;
        if (l91 == null) {
            hashCode99 = 0;
        } else {
            hashCode99 = l91.hashCode();
        }
        int i100 = (i99 + hashCode99) * 31;
        Long l92 = this.transportWifiBytesRecv;
        if (l92 == null) {
            hashCode100 = 0;
        } else {
            hashCode100 = l92.hashCode();
        }
        int i101 = (i100 + hashCode100) * 31;
        Long l93 = this.transportCellBytesSent;
        if (l93 == null) {
            hashCode101 = 0;
        } else {
            hashCode101 = l93.hashCode();
        }
        int i102 = (i101 + hashCode101) * 31;
        Long l94 = this.transportCellBytesRecv;
        if (l94 == null) {
            hashCode102 = 0;
        } else {
            hashCode102 = l94.hashCode();
        }
        int i103 = (i102 + hashCode102) * 31;
        Long l95 = this.transportOtherBytesSent;
        if (l95 == null) {
            hashCode103 = 0;
        } else {
            hashCode103 = l95.hashCode();
        }
        int i104 = (i103 + hashCode103) * 31;
        Long l96 = this.transportOtherBytesRecv;
        if (l96 == null) {
            hashCode104 = 0;
        } else {
            hashCode104 = l96.hashCode();
        }
        int i105 = (i104 + hashCode104) * 31;
        String str9 = this.transportConnIpversion;
        if (str9 == null) {
            hashCode105 = 0;
        } else {
            hashCode105 = str9.hashCode();
        }
        int i106 = (i105 + hashCode105) * 31;
        String str10 = this.transportConnType;
        if (str10 == null) {
            hashCode106 = 0;
        } else {
            hashCode106 = str10.hashCode();
        }
        int i107 = (i106 + hashCode106) * 31;
        Long l97 = this.transportConnNetworkCost;
        if (l97 == null) {
            hashCode107 = 0;
        } else {
            hashCode107 = l97.hashCode();
        }
        int i108 = (i107 + hashCode107) * 31;
        Long l98 = this.transportConnRttMin;
        if (l98 == null) {
            hashCode108 = 0;
        } else {
            hashCode108 = l98.hashCode();
        }
        int i109 = (i108 + hashCode108) * 31;
        Long l99 = this.transportConnRttVar;
        if (l99 == null) {
            hashCode109 = 0;
        } else {
            hashCode109 = l99.hashCode();
        }
        int i110 = (i109 + hashCode109) * 31;
        Long l100 = this.transportConnRttMax;
        if (l100 == null) {
            hashCode110 = 0;
        } else {
            hashCode110 = l100.hashCode();
        }
        int i111 = (i110 + hashCode110) * 31;
        Long l101 = this.transportConnRttAvg;
        if (l101 == null) {
            hashCode111 = 0;
        } else {
            hashCode111 = l101.hashCode();
        }
        int i112 = (i111 + hashCode111) * 31;
        Long l102 = this.transportConnected;
        if (l102 == null) {
            hashCode112 = 0;
        } else {
            hashCode112 = l102.hashCode();
        }
        int i113 = (i112 + hashCode112) * 31;
        Long l103 = this.transportNumGaps;
        if (l103 == null) {
            hashCode113 = 0;
        } else {
            hashCode113 = l103.hashCode();
        }
        int i114 = (i113 + hashCode113) * 31;
        Long l104 = this.transportTotalGapDurationMs;
        if (l104 == null) {
            hashCode114 = 0;
        } else {
            hashCode114 = l104.hashCode();
        }
        int i115 = (i114 + hashCode114) * 31;
        Long l105 = this.gen0IceSentHost;
        if (l105 == null) {
            hashCode115 = 0;
        } else {
            hashCode115 = l105.hashCode();
        }
        int i116 = (i115 + hashCode115) * 31;
        Long l106 = this.gen0IceSentRelay;
        if (l106 == null) {
            hashCode116 = 0;
        } else {
            hashCode116 = l106.hashCode();
        }
        int i117 = (i116 + hashCode116) * 31;
        Long l107 = this.gen0IceSentSrflx;
        if (l107 == null) {
            hashCode117 = 0;
        } else {
            hashCode117 = l107.hashCode();
        }
        int i118 = (i117 + hashCode117) * 31;
        Long l108 = this.gen0IceSentPrflx;
        if (l108 == null) {
            hashCode118 = 0;
        } else {
            hashCode118 = l108.hashCode();
        }
        int i119 = (i118 + hashCode118) * 31;
        Long l109 = this.gen0IceReceivedHost;
        if (l109 == null) {
            hashCode119 = 0;
        } else {
            hashCode119 = l109.hashCode();
        }
        int i120 = (i119 + hashCode119) * 31;
        Long l110 = this.gen0IceReceivedRelay;
        if (l110 == null) {
            hashCode120 = 0;
        } else {
            hashCode120 = l110.hashCode();
        }
        int i121 = (i120 + hashCode120) * 31;
        Long l111 = this.gen0IceReceivedSrflx;
        if (l111 == null) {
            hashCode121 = 0;
        } else {
            hashCode121 = l111.hashCode();
        }
        int i122 = (i121 + hashCode121) * 31;
        Long l112 = this.gen0IceReceivedPrflx;
        if (l112 == null) {
            hashCode122 = 0;
        } else {
            hashCode122 = l112.hashCode();
        }
        int i123 = (i122 + hashCode122) * 31;
        Long l113 = this.videoRecvAggBytesRecv;
        if (l113 == null) {
            hashCode123 = 0;
        } else {
            hashCode123 = l113.hashCode();
        }
        int i124 = (i123 + hashCode123) * 31;
        Long l114 = this.videoRecvAggPacketsRecv;
        if (l114 == null) {
            hashCode124 = 0;
        } else {
            hashCode124 = l114.hashCode();
        }
        int i125 = (i124 + hashCode124) * 31;
        Long l115 = this.videoRecvAggPacketsLost;
        if (l115 == null) {
            hashCode125 = 0;
        } else {
            hashCode125 = l115.hashCode();
        }
        int i126 = (i125 + hashCode125) * 31;
        Long l116 = this.videoRecvAggFramesDecoded;
        if (l116 == null) {
            hashCode126 = 0;
        } else {
            hashCode126 = l116.hashCode();
        }
        int i127 = (i126 + hashCode126) * 31;
        Long l117 = this.videoRecvAggFramesRendered;
        if (l117 == null) {
            hashCode127 = 0;
        } else {
            hashCode127 = l117.hashCode();
        }
        int i128 = (i127 + hashCode127) * 31;
        Long l118 = this.videoRecvAggBytesDecoded;
        if (l118 == null) {
            hashCode128 = 0;
        } else {
            hashCode128 = l118.hashCode();
        }
        int i129 = (i128 + hashCode128) * 31;
        Long l119 = this.videoRecvAggDecodeTimeMs;
        if (l119 == null) {
            hashCode129 = 0;
        } else {
            hashCode129 = l119.hashCode();
        }
        int i130 = (i129 + hashCode129) * 31;
        Long l120 = this.videoRecvTotalPixelsDecoded;
        if (l120 == null) {
            hashCode130 = 0;
        } else {
            hashCode130 = l120.hashCode();
        }
        int i131 = (i130 + hashCode130) * 31;
        String str11 = this.videoRecvCodec;
        if (str11 == null) {
            hashCode131 = 0;
        } else {
            hashCode131 = str11.hashCode();
        }
        int i132 = (i131 + hashCode131) * 31;
        Long l121 = this.videoRecvPacketsRecv;
        if (l121 == null) {
            hashCode132 = 0;
        } else {
            hashCode132 = l121.hashCode();
        }
        int i133 = (i132 + hashCode132) * 31;
        Long l122 = this.videoRecvPacketsLost;
        if (l122 == null) {
            hashCode133 = 0;
        } else {
            hashCode133 = l122.hashCode();
        }
        int i134 = (i133 + hashCode133) * 31;
        Long l123 = this.videoRecvFrameWidth;
        if (l123 == null) {
            hashCode134 = 0;
        } else {
            hashCode134 = l123.hashCode();
        }
        int i135 = (i134 + hashCode134) * 31;
        Long l124 = this.videoRecvFrameHeight;
        if (l124 == null) {
            hashCode135 = 0;
        } else {
            hashCode135 = l124.hashCode();
        }
        int i136 = (i135 + hashCode135) * 31;
        Long l125 = this.videoRecvFramerateRecv;
        if (l125 == null) {
            hashCode136 = 0;
        } else {
            hashCode136 = l125.hashCode();
        }
        int i137 = (i136 + hashCode136) * 31;
        Long l126 = this.videoRecvFramerateDecoded;
        if (l126 == null) {
            hashCode137 = 0;
        } else {
            hashCode137 = l126.hashCode();
        }
        int i138 = (i137 + hashCode137) * 31;
        Long l127 = this.videoRecvFramerateOutput;
        if (l127 == null) {
            hashCode138 = 0;
        } else {
            hashCode138 = l127.hashCode();
        }
        int i139 = (i138 + hashCode138) * 31;
        Long l128 = this.videoRecvFramesDecoded;
        if (l128 == null) {
            hashCode139 = 0;
        } else {
            hashCode139 = l128.hashCode();
        }
        int i140 = (i139 + hashCode139) * 31;
        Long l129 = this.videoRecvQpSum;
        if (l129 == null) {
            hashCode140 = 0;
        } else {
            hashCode140 = l129.hashCode();
        }
        int i141 = (i140 + hashCode140) * 31;
        Long l130 = this.videoRecvFramesRendered;
        if (l130 == null) {
            hashCode141 = 0;
        } else {
            hashCode141 = l130.hashCode();
        }
        int i142 = (i141 + hashCode141) * 31;
        Long l131 = this.videoRecvRenderDurationMs;
        if (l131 == null) {
            hashCode142 = 0;
        } else {
            hashCode142 = l131.hashCode();
        }
        int i143 = (i142 + hashCode142) * 31;
        Long l132 = this.videoRecvTotalPixelsRendered;
        if (l132 == null) {
            hashCode143 = 0;
        } else {
            hashCode143 = l132.hashCode();
        }
        int i144 = (i143 + hashCode143) * 31;
        Long l133 = this.videoRecvPauseCount;
        if (l133 == null) {
            hashCode144 = 0;
        } else {
            hashCode144 = l133.hashCode();
        }
        int i145 = (i144 + hashCode144) * 31;
        Long l134 = this.videoRecvPauseDurationMs;
        if (l134 == null) {
            hashCode145 = 0;
        } else {
            hashCode145 = l134.hashCode();
        }
        int i146 = (i145 + hashCode145) * 31;
        Long l135 = this.videoRecvFreezeCount;
        if (l135 == null) {
            hashCode146 = 0;
        } else {
            hashCode146 = l135.hashCode();
        }
        int i147 = (i146 + hashCode146) * 31;
        Long l136 = this.videoRecvFreezeDuration;
        if (l136 == null) {
            hashCode147 = 0;
        } else {
            hashCode147 = l136.hashCode();
        }
        int i148 = (i147 + hashCode147) * 31;
        Long l137 = this.videoRecvNacksSent;
        if (l137 == null) {
            hashCode148 = 0;
        } else {
            hashCode148 = l137.hashCode();
        }
        int i149 = (i148 + hashCode148) * 31;
        Long l138 = this.videoRecvFirsSent;
        if (l138 == null) {
            hashCode149 = 0;
        } else {
            hashCode149 = l138.hashCode();
        }
        int i150 = (i149 + hashCode149) * 31;
        Long l139 = this.videoRecvPlisSent;
        if (l139 == null) {
            hashCode150 = 0;
        } else {
            hashCode150 = l139.hashCode();
        }
        int i151 = (i150 + hashCode150) * 31;
        Long l140 = this.videoRecvAvgRecvLatencyMs;
        if (l140 == null) {
            hashCode151 = 0;
        } else {
            hashCode151 = l140.hashCode();
        }
        int i152 = (i151 + hashCode151) * 31;
        Long l141 = this.videoRecvAvgJitterBufferLatencyMs;
        if (l141 == null) {
            hashCode152 = 0;
        } else {
            hashCode152 = l141.hashCode();
        }
        int i153 = (i152 + hashCode152) * 31;
        Long l142 = this.videoRecvAvgDecodeLatencyMs;
        if (l142 == null) {
            hashCode153 = 0;
        } else {
            hashCode153 = l142.hashCode();
        }
        int i154 = (i153 + hashCode153) * 31;
        Long l143 = this.videoRecvAvgE2eLatencyMs;
        if (l143 == null) {
            hashCode154 = 0;
        } else {
            hashCode154 = l143.hashCode();
        }
        int i155 = (i154 + hashCode154) * 31;
        Long l144 = this.videoRecvPaddingPacketsReceived;
        if (l144 == null) {
            hashCode155 = 0;
        } else {
            hashCode155 = l144.hashCode();
        }
        int i156 = (i155 + hashCode155) * 31;
        Long l145 = this.videoRecvJitterBufferFramesOut;
        if (l145 == null) {
            hashCode156 = 0;
        } else {
            hashCode156 = l145.hashCode();
        }
        int i157 = (i156 + hashCode156) * 31;
        Long l146 = this.videoRecvJitterBufferKeyframesOut;
        if (l146 == null) {
            hashCode157 = 0;
        } else {
            hashCode157 = l146.hashCode();
        }
        int i158 = (i157 + hashCode157) * 31;
        Long l147 = this.videoRecvJitterBufferFramesAssembled;
        if (l147 == null) {
            hashCode158 = 0;
        } else {
            hashCode158 = l147.hashCode();
        }
        int i159 = (i158 + hashCode158) * 31;
        String str12 = this.videoSendCodec;
        if (str12 == null) {
            hashCode159 = 0;
        } else {
            hashCode159 = str12.hashCode();
        }
        int i160 = (i159 + hashCode159) * 31;
        Long l148 = this.videoSendBytesSent;
        if (l148 == null) {
            hashCode160 = 0;
        } else {
            hashCode160 = l148.hashCode();
        }
        int i161 = (i160 + hashCode160) * 31;
        Long l149 = this.videoSendPacketsSent;
        if (l149 == null) {
            hashCode161 = 0;
        } else {
            hashCode161 = l149.hashCode();
        }
        int i162 = (i161 + hashCode161) * 31;
        Long l150 = this.videoSendPacketsLost;
        if (l150 == null) {
            hashCode162 = 0;
        } else {
            hashCode162 = l150.hashCode();
        }
        int i163 = (i162 + hashCode162) * 31;
        Long l151 = this.videoSendFramesSent;
        if (l151 == null) {
            hashCode163 = 0;
        } else {
            hashCode163 = l151.hashCode();
        }
        int i164 = (i163 + hashCode163) * 31;
        Long l152 = this.videoSendFramesCaptured;
        if (l152 == null) {
            hashCode164 = 0;
        } else {
            hashCode164 = l152.hashCode();
        }
        int i165 = (i164 + hashCode164) * 31;
        Long l153 = this.videoSendAverageCapturePixelsPerFrame;
        if (l153 == null) {
            hashCode165 = 0;
        } else {
            hashCode165 = l153.hashCode();
        }
        int i166 = (i165 + hashCode165) * 31;
        Long l154 = this.videoSendCaptureDurationMs;
        if (l154 == null) {
            hashCode166 = 0;
        } else {
            hashCode166 = l154.hashCode();
        }
        int i167 = (i166 + hashCode166) * 31;
        Long l155 = this.videoSendKeyFramesEncoded;
        if (l155 == null) {
            hashCode167 = 0;
        } else {
            hashCode167 = l155.hashCode();
        }
        int i168 = (i167 + hashCode167) * 31;
        Long l156 = this.videoSendFrameWidthInput;
        if (l156 == null) {
            hashCode168 = 0;
        } else {
            hashCode168 = l156.hashCode();
        }
        int i169 = (i168 + hashCode168) * 31;
        Long l157 = this.videoSendFrameHeightInput;
        if (l157 == null) {
            hashCode169 = 0;
        } else {
            hashCode169 = l157.hashCode();
        }
        int i170 = (i169 + hashCode169) * 31;
        Long l158 = this.videoSendFrameWidth;
        if (l158 == null) {
            hashCode170 = 0;
        } else {
            hashCode170 = l158.hashCode();
        }
        int i171 = (i170 + hashCode170) * 31;
        Long l159 = this.videoSendFrameHeight;
        if (l159 == null) {
            hashCode171 = 0;
        } else {
            hashCode171 = l159.hashCode();
        }
        int i172 = (i171 + hashCode171) * 31;
        Long l160 = this.videoSendNacksRecv;
        if (l160 == null) {
            hashCode172 = 0;
        } else {
            hashCode172 = l160.hashCode();
        }
        int i173 = (i172 + hashCode172) * 31;
        Long l161 = this.videoSendFirsRecv;
        if (l161 == null) {
            hashCode173 = 0;
        } else {
            hashCode173 = l161.hashCode();
        }
        int i174 = (i173 + hashCode173) * 31;
        Long l162 = this.videoSendPlisRecv;
        if (l162 == null) {
            hashCode174 = 0;
        } else {
            hashCode174 = l162.hashCode();
        }
        int i175 = (i174 + hashCode174) * 31;
        Long l163 = this.videoSendQpSum;
        if (l163 == null) {
            hashCode175 = 0;
        } else {
            hashCode175 = l163.hashCode();
        }
        int i176 = (i175 + hashCode175) * 31;
        Long l164 = this.videoSendAvgEncodeMs;
        if (l164 == null) {
            hashCode176 = 0;
        } else {
            hashCode176 = l164.hashCode();
        }
        int i177 = (i176 + hashCode176) * 31;
        Long l165 = this.videoSendAverageTargetBitrate;
        if (l165 == null) {
            hashCode177 = 0;
        } else {
            hashCode177 = l165.hashCode();
        }
        int i178 = (i177 + hashCode177) * 31;
        Long l166 = this.videoSendFramesEncoded;
        if (l166 == null) {
            hashCode178 = 0;
        } else {
            hashCode178 = l166.hashCode();
        }
        int i179 = (i178 + hashCode178) * 31;
        Long l167 = this.videoSendFramesSendToEncoder;
        if (l167 == null) {
            hashCode179 = 0;
        } else {
            hashCode179 = l167.hashCode();
        }
        int i180 = (i179 + hashCode179) * 31;
        Long l168 = this.videoSendTotalInputPixel;
        if (l168 == null) {
            hashCode180 = 0;
        } else {
            hashCode180 = l168.hashCode();
        }
        int i181 = (i180 + hashCode180) * 31;
        Long l169 = this.videoSendTotalOutputPixel;
        if (l169 == null) {
            hashCode181 = 0;
        } else {
            hashCode181 = l169.hashCode();
        }
        int i182 = (i181 + hashCode181) * 31;
        Long l170 = this.initialProbingAttempted;
        if (l170 == null) {
            hashCode182 = 0;
        } else {
            hashCode182 = l170.hashCode();
        }
        int i183 = (i182 + hashCode182) * 31;
        Long l171 = this.initialProbingResult;
        if (l171 != null) {
            i = l171.hashCode();
        }
        return i183 + i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.StringBuilder} */
    /* JADX WARNING: Multi-variable type inference failed */
    public String toString() {
        return "CallPeerConnectionSummaryEventLog{connectionLoggingId=" + this.connectionLoggingId + "," + "localCallId=" + this.localCallId + "," + "sharedCallId=" + this.sharedCallId + "," + "peerId=" + this.peerId + "," + "systemTimeMs=" + this.systemTimeMs + "," + "steadyTimeMs=" + this.steadyTimeMs + "," + "protocol=" + this.protocol + "," + "webrtcVersion=" + this.webrtcVersion + "," + "audioRecvCodec=" + this.audioRecvCodec + "," + "audioRecvBytesRecv=" + this.audioRecvBytesRecv + "," + "audioRecvPacketsRecv=" + this.audioRecvPacketsRecv + "," + "audioRecvPacketsLost=" + this.audioRecvPacketsLost + "," + "audioRecvNeteqCallToSilenceGenerator=" + this.audioRecvNeteqCallToSilenceGenerator + "," + "audioRecvNeteqOperations=" + this.audioRecvNeteqOperations + "," + "audioRecvNeteqOperationErrors=" + this.audioRecvNeteqOperationErrors + "," + "audioRecvNeteqNoOperations=" + this.audioRecvNeteqNoOperations + "," + "audioRecvNeteqNormal=" + this.audioRecvNeteqNormal + "," + "audioRecvNeteqPlc=" + this.audioRecvNeteqPlc + "," + "audioRecvNeteqCng=" + this.audioRecvNeteqCng + "," + "audioRecvNeteqPlccng=" + this.audioRecvNeteqPlccng + "," + "audioRecvNeteqAccelerate=" + this.audioRecvNeteqAccelerate + "," + "audioRecvNeteqPreemptiveExpand=" + this.audioRecvNeteqPreemptiveExpand + "," + "audioRecvNeteqMutedOutput=" + this.audioRecvNeteqMutedOutput + "," + "audioRecvNeteqAttemptOperations=" + this.audioRecvNeteqAttemptOperations + "," + "audioRecvNeteqMeanWaitMs=" + this.audioRecvNeteqMeanWaitMs + "," + "audioRecvNeteqMaxWaitMs=" + this.audioRecvNeteqMaxWaitMs + "," + "audioRecvReceivedLatencyMs=" + this.audioRecvReceivedLatencyMs + "," + "audioRecvNumMediaStreamTracks=" + this.audioRecvNumMediaStreamTracks + "," + "audioRecvNumInboundRtpStreams=" + this.audioRecvNumInboundRtpStreams + "," + "audioRecvJitterBufferDelay=" + this.audioRecvJitterBufferDelay + "," + "audioRecvJitterBufferEmittedCount=" + this.audioRecvJitterBufferEmittedCount + "," + "audioRecvAudioLevel=" + this.audioRecvAudioLevel + "," + "audioRecvAudioLevelConverted=" + this.audioRecvAudioLevelConverted + "," + "audioRecvTotalAudioEnergy=" + this.audioRecvTotalAudioEnergy + "," + "audioRecvTotalSamplesReceived=" + this.audioRecvTotalSamplesReceived + "," + "audioRecvTotalSamplesDuration=" + this.audioRecvTotalSamplesDuration + "," + "audioRecvConcealedSamples=" + this.audioRecvConcealedSamples + "," + "audioRecvSilentConcealedSamples=" + this.audioRecvSilentConcealedSamples + "," + "audioRecvConcealmentEvents=" + this.audioRecvConcealmentEvents + "," + "audioRecvInsertedSamplesForDeceleration=" + this.audioRecvInsertedSamplesForDeceleration + "," + "audioRecvRemovedSamplesForDeceleration=" + this.audioRecvRemovedSamplesForDeceleration + "," + "audioRecvJitterBufferFlushes=" + this.audioRecvJitterBufferFlushes + "," + "audioRecvDelayedPacketOutageSamples=" + this.audioRecvDelayedPacketOutageSamples + "," + "audioRecvRelativePacketArrivalDelay=" + this.audioRecvRelativePacketArrivalDelay + "," + "audioRecvFecPacketsReceived=" + this.audioRecvFecPacketsReceived + "," + "audioRecvFecPacketsDiscarded=" + this.audioRecvFecPacketsDiscarded + "," + "audioRecvPacketsDiscarded=" + this.audioRecvPacketsDiscarded + "," + "audioRecvPacketsRepaired=" + this.audioRecvPacketsRepaired + "," + "audioRecvJitter=" + this.audioRecvJitter + "," + "audioRecvFractionLost=" + this.audioRecvFractionLost + "," + "audioRecvRoundTripTime=" + this.audioRecvRoundTripTime + "," + "audioRecvBurstPacketsLost=" + this.audioRecvBurstPacketsLost + "," + "audioRecvBurstPacketsDiscarded=" + this.audioRecvBurstPacketsDiscarded + "," + "audioRecvBurstLossCount=" + this.audioRecvBurstLossCount + "," + "audioRecvBurstDiscardCount=" + this.audioRecvBurstDiscardCount + "," + "audioRecvPaddingPacketsReceived=" + this.audioRecvPaddingPacketsReceived + "," + "audioRecvJitterBufferFramesOut=" + this.audioRecvJitterBufferFramesOut + "," + "audioRecvJitterBufferKeyframesOut=" + this.audioRecvJitterBufferKeyframesOut + "," + "audioRecvJitterBufferFramesAssembled=" + this.audioRecvJitterBufferFramesAssembled + "," + "audioSendCodec=" + this.audioSendCodec + "," + "audioSendBytesSent=" + this.audioSendBytesSent + "," + "audioSendPacketsSent=" + this.audioSendPacketsSent + "," + "audioSendPacketsLost=" + this.audioSendPacketsLost + "," + "audioSendEncEmptyCount=" + this.audioSendEncEmptyCount + "," + "audioSendEncSpeechCount=" + this.audioSendEncSpeechCount + "," + "audioSendEncCngCount=" + this.audioSendEncCngCount + "," + "audioSendAverageTargetBitrate=" + this.audioSendAverageTargetBitrate + "," + "audioSendNumMediaStreamTracks=" + this.audioSendNumMediaStreamTracks + "," + "audioSendNumOutboundRtpStreams=" + this.audioSendNumOutboundRtpStreams + "," + "audioSendAudioLevel=" + this.audioSendAudioLevel + "," + "audioSendTotalAudioEnergy=" + this.audioSendTotalAudioEnergy + "," + "audioSendEchoReturnLoss=" + this.audioSendEchoReturnLoss + "," + "audioSendEchoReturnLossEnhancement=" + this.audioSendEchoReturnLossEnhancement + "," + "audioSendTotalSamplesReceived=" + this.audioSendTotalSamplesReceived + "," + "audioSendTotalSamplesDuration=" + this.audioSendTotalSamplesDuration + "," + "audioSendCurrentIsacDownlinkBitrate=" + this.audioSendCurrentIsacDownlinkBitrate + "," + "audioSendCurrentIsacUplinkBitrate=" + this.audioSendCurrentIsacUplinkBitrate + "," + "audioSendCurrentIsacExternalTargetBitrate=" + this.audioSendCurrentIsacExternalTargetBitrate + "," + "audioDevice=" + this.audioDevice + "," + "audioDeviceRecordSampleRate=" + this.audioDeviceRecordSampleRate + "," + "audioDeviceRecordChannel=" + this.audioDeviceRecordChannel + "," + "audioDeviceRecordStall=" + this.audioDeviceRecordStall + "," + "audioDevicePlaySampleRate=" + this.audioDevicePlaySampleRate + "," + "audioDevicePlayChannel=" + this.audioDevicePlayChannel + "," + "audioDevicePlayStall=" + this.audioDevicePlayStall + "," + "audioDeviceTotalStall=" + this.audioDeviceTotalStall + "," + "audioDeviceTotalRestart=" + this.audioDeviceTotalRestart + "," + "audioDeviceTotalRestartSuccess=" + this.audioDeviceTotalRestartSuccess + "," + "audioDeviceIsStalled=" + this.audioDeviceIsStalled + "," + "audioDeviceIsRestarting=" + this.audioDeviceIsRestarting + "," + "audioDevicePlayFrames=" + this.audioDevicePlayFrames + "," + "audioDevicePlayLevelSum=" + this.audioDevicePlayLevelSum + "," + "audioDeviceRecordFrames=" + this.audioDeviceRecordFrames + "," + "audioDeviceRecordLevelSum=" + this.audioDeviceRecordLevelSum + "," + "availableOutgoingBitrate=" + this.availableOutgoingBitrate + "," + "availableIncomingBitrate=" + this.availableIncomingBitrate + "," + "avgVideoActualEncodeBitrate=" + this.avgVideoActualEncodeBitrate + "," + "avgVideoTargetEncodeBitrate=" + this.avgVideoTargetEncodeBitrate + "," + "avgVideoTransmitBitrate=" + this.avgVideoTransmitBitrate + "," + "avgVideoRetransmitBitrate=" + this.avgVideoRetransmitBitrate + "," + "transportWifiBytesSent=" + this.transportWifiBytesSent + "," + "transportWifiBytesRecv=" + this.transportWifiBytesRecv + "," + "transportCellBytesSent=" + this.transportCellBytesSent + "," + "transportCellBytesRecv=" + this.transportCellBytesRecv + "," + "transportOtherBytesSent=" + this.transportOtherBytesSent + "," + "transportOtherBytesRecv=" + this.transportOtherBytesRecv + "," + "transportConnIpversion=" + this.transportConnIpversion + "," + "transportConnType=" + this.transportConnType + "," + "transportConnNetworkCost=" + this.transportConnNetworkCost + "," + "transportConnRttMin=" + this.transportConnRttMin + "," + "transportConnRttVar=" + this.transportConnRttVar + "," + "transportConnRttMax=" + this.transportConnRttMax + "," + "transportConnRttAvg=" + this.transportConnRttAvg + "," + "transportConnected=" + this.transportConnected + "," + "transportNumGaps=" + this.transportNumGaps + "," + "transportTotalGapDurationMs=" + this.transportTotalGapDurationMs + "," + "gen0IceSentHost=" + this.gen0IceSentHost + "," + "gen0IceSentRelay=" + this.gen0IceSentRelay + "," + "gen0IceSentSrflx=" + this.gen0IceSentSrflx + "," + "gen0IceSentPrflx=" + this.gen0IceSentPrflx + "," + "gen0IceReceivedHost=" + this.gen0IceReceivedHost + "," + "gen0IceReceivedRelay=" + this.gen0IceReceivedRelay + "," + "gen0IceReceivedSrflx=" + this.gen0IceReceivedSrflx + "," + "gen0IceReceivedPrflx=" + this.gen0IceReceivedPrflx + "," + "videoRecvAggBytesRecv=" + this.videoRecvAggBytesRecv + "," + "videoRecvAggPacketsRecv=" + this.videoRecvAggPacketsRecv + "," + "videoRecvAggPacketsLost=" + this.videoRecvAggPacketsLost + "," + "videoRecvAggFramesDecoded=" + this.videoRecvAggFramesDecoded + "," + "videoRecvAggFramesRendered=" + this.videoRecvAggFramesRendered + "," + "videoRecvAggBytesDecoded=" + this.videoRecvAggBytesDecoded + "," + "videoRecvAggDecodeTimeMs=" + this.videoRecvAggDecodeTimeMs + "," + "videoRecvTotalPixelsDecoded=" + this.videoRecvTotalPixelsDecoded + "," + "videoRecvCodec=" + this.videoRecvCodec + "," + "videoRecvPacketsRecv=" + this.videoRecvPacketsRecv + "," + "videoRecvPacketsLost=" + this.videoRecvPacketsLost + "," + "videoRecvFrameWidth=" + this.videoRecvFrameWidth + "," + "videoRecvFrameHeight=" + this.videoRecvFrameHeight + "," + "videoRecvFramerateRecv=" + this.videoRecvFramerateRecv + "," + "videoRecvFramerateDecoded=" + this.videoRecvFramerateDecoded + "," + "videoRecvFramerateOutput=" + this.videoRecvFramerateOutput + "," + "videoRecvFramesDecoded=" + this.videoRecvFramesDecoded + "," + "videoRecvQpSum=" + this.videoRecvQpSum + "," + "videoRecvFramesRendered=" + this.videoRecvFramesRendered + "," + "videoRecvRenderDurationMs=" + this.videoRecvRenderDurationMs + "," + "videoRecvTotalPixelsRendered=" + this.videoRecvTotalPixelsRendered + "," + "videoRecvPauseCount=" + this.videoRecvPauseCount + "," + "videoRecvPauseDurationMs=" + this.videoRecvPauseDurationMs + "," + "videoRecvFreezeCount=" + this.videoRecvFreezeCount + "," + "videoRecvFreezeDuration=" + this.videoRecvFreezeDuration + "," + "videoRecvNacksSent=" + this.videoRecvNacksSent + "," + "videoRecvFirsSent=" + this.videoRecvFirsSent + "," + "videoRecvPlisSent=" + this.videoRecvPlisSent + "," + "videoRecvAvgRecvLatencyMs=" + this.videoRecvAvgRecvLatencyMs + "," + "videoRecvAvgJitterBufferLatencyMs=" + this.videoRecvAvgJitterBufferLatencyMs + "," + "videoRecvAvgDecodeLatencyMs=" + this.videoRecvAvgDecodeLatencyMs + "," + "videoRecvAvgE2eLatencyMs=" + this.videoRecvAvgE2eLatencyMs + "," + "videoRecvPaddingPacketsReceived=" + this.videoRecvPaddingPacketsReceived + "," + "videoRecvJitterBufferFramesOut=" + this.videoRecvJitterBufferFramesOut + "," + "videoRecvJitterBufferKeyframesOut=" + this.videoRecvJitterBufferKeyframesOut + "," + "videoRecvJitterBufferFramesAssembled=" + this.videoRecvJitterBufferFramesAssembled + "," + "videoSendCodec=" + this.videoSendCodec + "," + "videoSendBytesSent=" + this.videoSendBytesSent + "," + "videoSendPacketsSent=" + this.videoSendPacketsSent + "," + "videoSendPacketsLost=" + this.videoSendPacketsLost + "," + "videoSendFramesSent=" + this.videoSendFramesSent + "," + "videoSendFramesCaptured=" + this.videoSendFramesCaptured + "," + "videoSendAverageCapturePixelsPerFrame=" + this.videoSendAverageCapturePixelsPerFrame + "," + "videoSendCaptureDurationMs=" + this.videoSendCaptureDurationMs + "," + "videoSendKeyFramesEncoded=" + this.videoSendKeyFramesEncoded + "," + "videoSendFrameWidthInput=" + this.videoSendFrameWidthInput + "," + "videoSendFrameHeightInput=" + this.videoSendFrameHeightInput + "," + "videoSendFrameWidth=" + this.videoSendFrameWidth + "," + "videoSendFrameHeight=" + this.videoSendFrameHeight + "," + "videoSendNacksRecv=" + this.videoSendNacksRecv + "," + "videoSendFirsRecv=" + this.videoSendFirsRecv + "," + "videoSendPlisRecv=" + this.videoSendPlisRecv + "," + "videoSendQpSum=" + this.videoSendQpSum + "," + "videoSendAvgEncodeMs=" + this.videoSendAvgEncodeMs + "," + "videoSendAverageTargetBitrate=" + this.videoSendAverageTargetBitrate + "," + "videoSendFramesEncoded=" + this.videoSendFramesEncoded + "," + "videoSendFramesSendToEncoder=" + this.videoSendFramesSendToEncoder + "," + "videoSendTotalInputPixel=" + this.videoSendTotalInputPixel + "," + "videoSendTotalOutputPixel=" + this.videoSendTotalOutputPixel + "," + "initialProbingAttempted=" + this.initialProbingAttempted + "," + "initialProbingResult=" + this.initialProbingResult + "}";
    }

    public CallPeerConnectionSummaryEventLog(String str, String str2, String str3, Long l, long j, long j2, String str4, String str5, String str6, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l20, Long l21, Long l22, Long l23, Long l24, Long l25, Long l26, Long l27, Long l28, Long l29, Long l30, Long l31, Long l32, Long l33, Long l34, Long l35, Long l36, Long l37, Long l38, Long l39, Long l40, Long l41, Long l42, Long l43, Long l44, Long l45, Long l46, Long l47, Long l48, Long l49, Long l50, Long l51, String str7, Long l52, Long l53, Long l54, Long l55, Long l56, Long l57, Long l58, Long l59, Long l60, Long l61, Long l62, Long l63, Long l64, Long l65, Long l66, Long l67, Long l68, Long l69, String str8, Long l70, Long l71, Long l72, Long l73, Long l74, Long l75, Long l76, Long l77, Long l78, Long l79, Long l80, Long l81, Long l82, Long l83, Long l84, Long l85, Long l86, Long l87, Long l88, Long l89, Long l90, Long l91, Long l92, Long l93, Long l94, Long l95, Long l96, String str9, String str10, Long l97, Long l98, Long l99, Long l100, Long l101, Long l102, Long l103, Long l104, Long l105, Long l106, Long l107, Long l108, Long l109, Long l110, Long l111, Long l112, Long l113, Long l114, Long l115, Long l116, Long l117, Long l118, Long l119, Long l120, String str11, Long l121, Long l122, Long l123, Long l124, Long l125, Long l126, Long l127, Long l128, Long l129, Long l130, Long l131, Long l132, Long l133, Long l134, Long l135, Long l136, Long l137, Long l138, Long l139, Long l140, Long l141, Long l142, Long l143, Long l144, Long l145, Long l146, Long l147, String str12, Long l148, Long l149, Long l150, Long l151, Long l152, Long l153, Long l154, Long l155, Long l156, Long l157, Long l158, Long l159, Long l160, Long l161, Long l162, Long l163, Long l164, Long l165, Long l166, Long l167, Long l168, Long l169, Long l170, Long l171) {
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Long.valueOf(j2));
        this.connectionLoggingId = str;
        this.localCallId = str2;
        this.sharedCallId = str3;
        this.peerId = l;
        this.systemTimeMs = j;
        this.steadyTimeMs = j2;
        this.protocol = str4;
        this.webrtcVersion = str5;
        this.audioRecvCodec = str6;
        this.audioRecvBytesRecv = l2;
        this.audioRecvPacketsRecv = l3;
        this.audioRecvPacketsLost = l4;
        this.audioRecvNeteqCallToSilenceGenerator = l5;
        this.audioRecvNeteqOperations = l6;
        this.audioRecvNeteqOperationErrors = l7;
        this.audioRecvNeteqNoOperations = l8;
        this.audioRecvNeteqNormal = l9;
        this.audioRecvNeteqPlc = l10;
        this.audioRecvNeteqCng = l11;
        this.audioRecvNeteqPlccng = l12;
        this.audioRecvNeteqAccelerate = l13;
        this.audioRecvNeteqPreemptiveExpand = l14;
        this.audioRecvNeteqMutedOutput = l15;
        this.audioRecvNeteqAttemptOperations = l16;
        this.audioRecvNeteqMeanWaitMs = l17;
        this.audioRecvNeteqMaxWaitMs = l18;
        this.audioRecvReceivedLatencyMs = l19;
        this.audioRecvNumMediaStreamTracks = l20;
        this.audioRecvNumInboundRtpStreams = l21;
        this.audioRecvJitterBufferDelay = l22;
        this.audioRecvJitterBufferEmittedCount = l23;
        this.audioRecvAudioLevel = l24;
        this.audioRecvAudioLevelConverted = l25;
        this.audioRecvTotalAudioEnergy = l26;
        this.audioRecvTotalSamplesReceived = l27;
        this.audioRecvTotalSamplesDuration = l28;
        this.audioRecvConcealedSamples = l29;
        this.audioRecvSilentConcealedSamples = l30;
        this.audioRecvConcealmentEvents = l31;
        this.audioRecvInsertedSamplesForDeceleration = l32;
        this.audioRecvRemovedSamplesForDeceleration = l33;
        this.audioRecvJitterBufferFlushes = l34;
        this.audioRecvDelayedPacketOutageSamples = l35;
        this.audioRecvRelativePacketArrivalDelay = l36;
        this.audioRecvFecPacketsReceived = l37;
        this.audioRecvFecPacketsDiscarded = l38;
        this.audioRecvPacketsDiscarded = l39;
        this.audioRecvPacketsRepaired = l40;
        this.audioRecvJitter = l41;
        this.audioRecvFractionLost = l42;
        this.audioRecvRoundTripTime = l43;
        this.audioRecvBurstPacketsLost = l44;
        this.audioRecvBurstPacketsDiscarded = l45;
        this.audioRecvBurstLossCount = l46;
        this.audioRecvBurstDiscardCount = l47;
        this.audioRecvPaddingPacketsReceived = l48;
        this.audioRecvJitterBufferFramesOut = l49;
        this.audioRecvJitterBufferKeyframesOut = l50;
        this.audioRecvJitterBufferFramesAssembled = l51;
        this.audioSendCodec = str7;
        this.audioSendBytesSent = l52;
        this.audioSendPacketsSent = l53;
        this.audioSendPacketsLost = l54;
        this.audioSendEncEmptyCount = l55;
        this.audioSendEncSpeechCount = l56;
        this.audioSendEncCngCount = l57;
        this.audioSendAverageTargetBitrate = l58;
        this.audioSendNumMediaStreamTracks = l59;
        this.audioSendNumOutboundRtpStreams = l60;
        this.audioSendAudioLevel = l61;
        this.audioSendTotalAudioEnergy = l62;
        this.audioSendEchoReturnLoss = l63;
        this.audioSendEchoReturnLossEnhancement = l64;
        this.audioSendTotalSamplesReceived = l65;
        this.audioSendTotalSamplesDuration = l66;
        this.audioSendCurrentIsacDownlinkBitrate = l67;
        this.audioSendCurrentIsacUplinkBitrate = l68;
        this.audioSendCurrentIsacExternalTargetBitrate = l69;
        this.audioDevice = str8;
        this.audioDeviceRecordSampleRate = l70;
        this.audioDeviceRecordChannel = l71;
        this.audioDeviceRecordStall = l72;
        this.audioDevicePlaySampleRate = l73;
        this.audioDevicePlayChannel = l74;
        this.audioDevicePlayStall = l75;
        this.audioDeviceTotalStall = l76;
        this.audioDeviceTotalRestart = l77;
        this.audioDeviceTotalRestartSuccess = l78;
        this.audioDeviceIsStalled = l79;
        this.audioDeviceIsRestarting = l80;
        this.audioDevicePlayFrames = l81;
        this.audioDevicePlayLevelSum = l82;
        this.audioDeviceRecordFrames = l83;
        this.audioDeviceRecordLevelSum = l84;
        this.availableOutgoingBitrate = l85;
        this.availableIncomingBitrate = l86;
        this.avgVideoActualEncodeBitrate = l87;
        this.avgVideoTargetEncodeBitrate = l88;
        this.avgVideoTransmitBitrate = l89;
        this.avgVideoRetransmitBitrate = l90;
        this.transportWifiBytesSent = l91;
        this.transportWifiBytesRecv = l92;
        this.transportCellBytesSent = l93;
        this.transportCellBytesRecv = l94;
        this.transportOtherBytesSent = l95;
        this.transportOtherBytesRecv = l96;
        this.transportConnIpversion = str9;
        this.transportConnType = str10;
        this.transportConnNetworkCost = l97;
        this.transportConnRttMin = l98;
        this.transportConnRttVar = l99;
        this.transportConnRttMax = l100;
        this.transportConnRttAvg = l101;
        this.transportConnected = l102;
        this.transportNumGaps = l103;
        this.transportTotalGapDurationMs = l104;
        this.gen0IceSentHost = l105;
        this.gen0IceSentRelay = l106;
        this.gen0IceSentSrflx = l107;
        this.gen0IceSentPrflx = l108;
        this.gen0IceReceivedHost = l109;
        this.gen0IceReceivedRelay = l110;
        this.gen0IceReceivedSrflx = l111;
        this.gen0IceReceivedPrflx = l112;
        this.videoRecvAggBytesRecv = l113;
        this.videoRecvAggPacketsRecv = l114;
        this.videoRecvAggPacketsLost = l115;
        this.videoRecvAggFramesDecoded = l116;
        this.videoRecvAggFramesRendered = l117;
        this.videoRecvAggBytesDecoded = l118;
        this.videoRecvAggDecodeTimeMs = l119;
        this.videoRecvTotalPixelsDecoded = l120;
        this.videoRecvCodec = str11;
        this.videoRecvPacketsRecv = l121;
        this.videoRecvPacketsLost = l122;
        this.videoRecvFrameWidth = l123;
        this.videoRecvFrameHeight = l124;
        this.videoRecvFramerateRecv = l125;
        this.videoRecvFramerateDecoded = l126;
        this.videoRecvFramerateOutput = l127;
        this.videoRecvFramesDecoded = l128;
        this.videoRecvQpSum = l129;
        this.videoRecvFramesRendered = l130;
        this.videoRecvRenderDurationMs = l131;
        this.videoRecvTotalPixelsRendered = l132;
        this.videoRecvPauseCount = l133;
        this.videoRecvPauseDurationMs = l134;
        this.videoRecvFreezeCount = l135;
        this.videoRecvFreezeDuration = l136;
        this.videoRecvNacksSent = l137;
        this.videoRecvFirsSent = l138;
        this.videoRecvPlisSent = l139;
        this.videoRecvAvgRecvLatencyMs = l140;
        this.videoRecvAvgJitterBufferLatencyMs = l141;
        this.videoRecvAvgDecodeLatencyMs = l142;
        this.videoRecvAvgE2eLatencyMs = l143;
        this.videoRecvPaddingPacketsReceived = l144;
        this.videoRecvJitterBufferFramesOut = l145;
        this.videoRecvJitterBufferKeyframesOut = l146;
        this.videoRecvJitterBufferFramesAssembled = l147;
        this.videoSendCodec = str12;
        this.videoSendBytesSent = l148;
        this.videoSendPacketsSent = l149;
        this.videoSendPacketsLost = l150;
        this.videoSendFramesSent = l151;
        this.videoSendFramesCaptured = l152;
        this.videoSendAverageCapturePixelsPerFrame = l153;
        this.videoSendCaptureDurationMs = l154;
        this.videoSendKeyFramesEncoded = l155;
        this.videoSendFrameWidthInput = l156;
        this.videoSendFrameHeightInput = l157;
        this.videoSendFrameWidth = l158;
        this.videoSendFrameHeight = l159;
        this.videoSendNacksRecv = l160;
        this.videoSendFirsRecv = l161;
        this.videoSendPlisRecv = l162;
        this.videoSendQpSum = l163;
        this.videoSendAvgEncodeMs = l164;
        this.videoSendAverageTargetBitrate = l165;
        this.videoSendFramesEncoded = l166;
        this.videoSendFramesSendToEncoder = l167;
        this.videoSendTotalInputPixel = l168;
        this.videoSendTotalOutputPixel = l169;
        this.initialProbingAttempted = l170;
        this.initialProbingResult = l171;
    }
}
