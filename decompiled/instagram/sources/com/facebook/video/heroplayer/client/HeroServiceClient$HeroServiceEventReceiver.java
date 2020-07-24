package com.facebook.video.heroplayer.client;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.SparseArray;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.heroplayer.ipc.HttpTransferEndEvent;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.C06270Ok;
import p000X.C120125Dh;
import p000X.C39731nP;
import p000X.C39741nR;
import p000X.C39751nS;
import p000X.C39771nW;
import p000X.C39811na;
import p000X.C40421od;
import p000X.C40431oe;
import p000X.C40441of;
import p000X.C40501ol;
import p000X.C40521on;
import p000X.C40581ot;
import p000X.C40591ou;
import p000X.C41961rG;
import p000X.C41991rK;
import p000X.C42071rS;
import p000X.C42091rU;
import p000X.C43711ux;
import p000X.C43721uy;
import p000X.C44191vk;
import p000X.C50992Ir;

public class HeroServiceClient$HeroServiceEventReceiver extends ResultReceiver {
    public final /* synthetic */ C39731nP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeroServiceClient$HeroServiceEventReceiver(C39731nP r2) {
        super((Handler) null);
        this.A00 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        if (p000X.C39741nR.A01.containsKey(r1) != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r2 == p000X.Constants.A14) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fc, code lost:
        if (r3.equals("quality_summary") != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0106, code lost:
        if (r3.equals("live_video_frame_displayed") == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0111, code lost:
        if (r3.equals("vps_http_transfer") == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011b, code lost:
        if (r3.equals("live_video_segment_download") == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0125, code lost:
        if (r3.equals("live_video_custom_live_trace") == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0130, code lost:
        if (r3.equals("vod_vps_http_transfer") == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0526, code lost:
        if (r8 == p000X.Constants.A14) goto L_0x0528;
     */
    public final void onReceiveResult(int i, Bundle bundle) {
        boolean z;
        String str;
        HashMap hashMap;
        C42071rS r11;
        boolean z2;
        Object obj;
        boolean z3;
        Bundle bundle2 = bundle;
        Bundle bundle3 = bundle2;
        bundle3.setClassLoader(C41961rG.class.getClassLoader());
        C41961rG r5 = (C41961rG) bundle3.getSerializable("ServiceEvent");
        int i2 = i;
        C40431oe.A01("HeroServiceClient", "eventCallback(%d) %s", Integer.valueOf(i2), r5);
        SparseArray sparseArray = C39751nS.A01;
        if (sparseArray.get(i2) != null) {
            if (((C39751nS) sparseArray.get(i2)).ordinal() == 1) {
                C39771nW r1 = this.A00.A07;
                String str2 = ((C44191vk) r5).A00;
                if (C39771nW.A03(r1)) {
                    C39811na r12 = r1.A03;
                    synchronized (r12) {
                        r12.A00.remove(str2);
                    }
                }
            }
            C40421od r4 = this.A00.A0P;
            if (r4 != null) {
                C39751nS r0 = C39751nS.HTTP_TRANSFER_END;
                C39751nS r13 = r5.A00;
                if (!r0.equals(r13)) {
                    z = false;
                }
                z = true;
                if (z) {
                    C39751nS r02 = C39751nS.HTTP_TRANSFER_END;
                    C39751nS r14 = r5.A00;
                    if (r02.equals(r14)) {
                        Integer A01 = C43721uy.A01(((HttpTransferEndEvent) r5).A07);
                        if (!(A01 == Constants.A0u || A01 == Constants.A12)) {
                            z3 = false;
                        }
                        z3 = true;
                        if (z3) {
                            str = "vps_http_transfer";
                        } else {
                            str = "vod_vps_http_transfer";
                        }
                    } else {
                        str = (String) C39741nR.A01.get(r14);
                    }
                    if (str != null) {
                        C39751nS r15 = r5.A00;
                        if (r15 != C39751nS.QUALITY_SUMMARY || !((C50992Ir) r5).A14) {
                            if (r15 == C39751nS.CUSTOM_LIVE_TRACE) {
                                throw null;
                            }
                            switch (r15.ordinal()) {
                                case 3:
                                    hashMap = new HashMap();
                                    hashMap.put(TraceFieldType.VideoId, (Object) null);
                                    hashMap.put("manifest_url", (Object) null);
                                    hashMap.put("expected_segment_info", (Object) null);
                                    hashMap.put("actual_segment_info", (Object) null);
                                    hashMap.put("is_live", true);
                                    break;
                                case 4:
                                    HttpTransferEndEvent httpTransferEndEvent = (HttpTransferEndEvent) r5;
                                    hashMap = new HashMap(100);
                                    hashMap.put("time_ms", Long.valueOf(httpTransferEndEvent.A0Q));
                                    hashMap.put(TraceFieldType.VideoId, httpTransferEndEvent.A0l);
                                    hashMap.put(IgReactNavigatorModule.URL, httpTransferEndEvent.A0j);
                                    hashMap.put("error", httpTransferEndEvent.A0b);
                                    hashMap.put("is_prefetch", Boolean.valueOf(httpTransferEndEvent.A0v));
                                    hashMap.put("prefetch_source", httpTransferEndEvent.A0f);
                                    hashMap.put("bytes_length", Integer.valueOf(httpTransferEndEvent.A05));
                                    hashMap.put("transfer_start_duration_ms", Long.valueOf(httpTransferEndEvent.A0S));
                                    hashMap.put("transfer_end_duration_ms", Long.valueOf(httpTransferEndEvent.A0R));
                                    hashMap.put("seq_num", Integer.valueOf(httpTransferEndEvent.A08));
                                    hashMap.put("cache_type", httpTransferEndEvent.A0U.A01);
                                    hashMap.put("first_time_play", Boolean.valueOf(httpTransferEndEvent.A0r));
                                    hashMap.put("play_origin", httpTransferEndEvent.A0d);
                                    hashMap.put("play_sub_origin", httpTransferEndEvent.A0e);
                                    hashMap.put("debug_info", httpTransferEndEvent.A0Z);
                                    hashMap.put("offset", Long.valueOf(httpTransferEndEvent.A0P));
                                    hashMap.put("req_length", Long.valueOf(httpTransferEndEvent.A0L));
                                    Integer A012 = C43721uy.A01(httpTransferEndEvent.A07);
                                    hashMap.put(TraceFieldType.StreamType, C43721uy.A02(A012));
                                    if (!(A012 == Constants.A0u || A012 == Constants.A12)) {
                                        z2 = false;
                                        break;
                                    }
                                    z2 = true;
                                    hashMap.put("is_live", Boolean.valueOf(z2));
                                    hashMap.put("segment_duration_ms", Integer.valueOf(httpTransferEndEvent.A06));
                                    hashMap.put("data_source_factory", httpTransferEndEvent.A0Y);
                                    hashMap.put("quality_label", httpTransferEndEvent.A0g);
                                    hashMap.put("connection_quality", httpTransferEndEvent.A0W);
                                    hashMap.put("network_priority", Integer.valueOf(httpTransferEndEvent.A04));
                                    hashMap.put("avg_bitrate", Long.valueOf(httpTransferEndEvent.A09));
                                    hashMap.put("is_lowest_bitrate", Boolean.valueOf(httpTransferEndEvent.A0s));
                                    hashMap.put("buffered_duration_ms", Integer.valueOf(httpTransferEndEvent.A00));
                                    hashMap.put("start_video_bw", Long.valueOf(httpTransferEndEvent.A0N));
                                    hashMap.put("start_video_ttfb", Long.valueOf(httpTransferEndEvent.A0O));
                                    hashMap.put("is_spherical", Boolean.valueOf(httpTransferEndEvent.A0x));
                                    hashMap.put("is_sponsored", Boolean.valueOf(httpTransferEndEvent.A0y));
                                    hashMap.put("is_templated_manifest", Boolean.valueOf(httpTransferEndEvent.A0z));
                                    hashMap.put("is_fbms", Boolean.valueOf(httpTransferEndEvent.A0p));
                                    hashMap.put("is_manifest_dynamic", Boolean.valueOf(httpTransferEndEvent.A0t));
                                    hashMap.put("is_fb_predictive_dash", Boolean.valueOf(httpTransferEndEvent.A0q));
                                    hashMap.put("video_process_bandwidth", Long.valueOf(httpTransferEndEvent.A0E));
                                    hashMap.put("main_process_bandwidth", Long.valueOf(httpTransferEndEvent.A0D));
                                    hashMap.put("video_bandwidth_estimate_str", httpTransferEndEvent.A0k);
                                    hashMap.put("player_id", Long.toString(httpTransferEndEvent.A0J));
                                    hashMap.put("request_queue_time_ms", Long.toString(httpTransferEndEvent.A0K));
                                    hashMap.put("transfer_start", Long.toString(httpTransferEndEvent.A0S));
                                    hashMap.put("transfer_end", Long.toString(httpTransferEndEvent.A0R));
                                    hashMap.put("buffer_duration_ms", Integer.toString(httpTransferEndEvent.A00));
                                    hashMap.put("transfer_bytes", Integer.toString(httpTransferEndEvent.A05));
                                    hashMap.put("seq", Integer.toString(httpTransferEndEvent.A08));
                                    hashMap.put("start_bandwidth", Long.toString(httpTransferEndEvent.A0N));
                                    boolean z4 = false;
                                    if (httpTransferEndEvent.A0U == C43711ux.CACHED) {
                                        z4 = true;
                                    }
                                    hashMap.put("is_cached", Boolean.valueOf(z4));
                                    hashMap.put(TraceFieldType.Bitrate, Long.toString(httpTransferEndEvent.A09));
                                    hashMap.put("segment_start_ms", Long.toString(httpTransferEndEvent.A0M));
                                    hashMap.put("is_skip_ahead_chunk", Boolean.valueOf(httpTransferEndEvent.A0w));
                                    hashMap.put("in_rewound_state", Boolean.valueOf(httpTransferEndEvent.A0n));
                                    hashMap.put("num_segments_to_end_of_manifest", Long.valueOf(httpTransferEndEvent.A0I));
                                    String str3 = httpTransferEndEvent.A0b;
                                    if (str3 != null) {
                                        hashMap.put("exception", str3.replace(',', ';'));
                                    }
                                    hashMap.put("upstream_ttfb", Long.toString(httpTransferEndEvent.A0T));
                                    hashMap.put("tigon_session_id", httpTransferEndEvent.A0h);
                                    hashMap.put("tigon_transaction_id", httpTransferEndEvent.A0i);
                                    hashMap.put("manifest_first_segment_start", Long.valueOf(httpTransferEndEvent.A0F));
                                    hashMap.put("manifest_last_segment_end", Long.valueOf(httpTransferEndEvent.A0G));
                                    hashMap.put("manifest_num_segments", Long.valueOf(httpTransferEndEvent.A0H));
                                    hashMap.put("cancelled", Boolean.toString(httpTransferEndEvent.A0m));
                                    hashMap.put("buffer_duration_at_data_spec_creation", Integer.toString(httpTransferEndEvent.A01));
                                    hashMap.put("data_spec_creation_time_ms", Long.toString(httpTransferEndEvent.A0C));
                                    hashMap.put("chunked_transfer", Boolean.valueOf(httpTransferEndEvent.A0o));
                                    hashMap.put("predicted_url", Boolean.valueOf(httpTransferEndEvent.A0u));
                                    hashMap.put("edge_hit", httpTransferEndEvent.A0a);
                                    hashMap.put("origin_hit", httpTransferEndEvent.A0c);
                                    hashMap.put("codec", httpTransferEndEvent.A0V);
                                    hashMap.put("cdn_time", Long.valueOf(httpTransferEndEvent.A0A));
                                    hashMap.put(TraceFieldType.ContentType, httpTransferEndEvent.A0X);
                                    hashMap.put("latest_segment_id", Integer.valueOf(httpTransferEndEvent.A03));
                                    hashMap.put("confidence_based_bitrate_estimate", Long.valueOf(httpTransferEndEvent.A0B));
                                    hashMap.put("confidence_pct_for_bitrate_estimate", Integer.valueOf(httpTransferEndEvent.A02));
                                    break;
                                case 8:
                                    C50992Ir r52 = (C50992Ir) r5;
                                    hashMap = new HashMap(120);
                                    hashMap.put(TraceFieldType.VideoId, r52.A12);
                                    hashMap.put(TraceFieldType.HostName, r52.A0t);
                                    hashMap.put("trigger", r52.A11);
                                    hashMap.put("representation_id", r52.A10);
                                    hashMap.put(TraceFieldType.Bitrate, Integer.valueOf(r52.A04));
                                    hashMap.put("quality_label", r52.A0z);
                                    hashMap.put("num_qualitities", Integer.valueOf(r52.A0T));
                                    hashMap.put("highest_quality_bitrate", Integer.valueOf(r52.A09));
                                    hashMap.put("lowest_quality_bitrate", Integer.valueOf(r52.A0H));
                                    hashMap.put("highest_quality_label", r52.A0s);
                                    hashMap.put("lowest_quality_label", r52.A0u);
                                    hashMap.put("max_width_from_player_constraint", Integer.valueOf(r52.A0M));
                                    hashMap.put("prefetched_representation", r52.A0y);
                                    hashMap.put("prefetched_bitrate", Integer.valueOf(r52.A0e));
                                    hashMap.put("prefetched_quality_label", r52.A0x);
                                    hashMap.put("prefetch_queue_size", Integer.valueOf(r52.A0d));
                                    hashMap.put("prefetch_delay_ms", Integer.valueOf(r52.A0c));
                                    hashMap.put("video_width", Integer.valueOf(r52.A0l));
                                    hashMap.put("video_height", Integer.valueOf(r52.A0k));
                                    hashMap.put("video_player_width", 0);
                                    hashMap.put("video_player_height", 0);
                                    hashMap.put("stall_duration_ms", Integer.valueOf(r52.A0j));
                                    hashMap.put("sample_start_num", Integer.valueOf(r52.A0f));
                                    hashMap.put("num_samples", Integer.valueOf(r52.A0U));
                                    hashMap.put("num_failed_samples", Integer.valueOf(r52.A0S));
                                    hashMap.put("num_cached_samples", Integer.valueOf(r52.A0R));
                                    hashMap.put("num_samples_at_ideal_quality", Integer.valueOf(r52.A0X));
                                    hashMap.put("num_samples_below_ideal_quality", Integer.valueOf(r52.A0Z));
                                    hashMap.put("num_samples_below_ideal_from_player_constraint", Integer.valueOf(r52.A0Y));
                                    hashMap.put("num_samples_above_ideal_quality", Integer.valueOf(r52.A0W));
                                    hashMap.put("num_samples_below_lowest_quality", Integer.valueOf(r52.A0a));
                                    hashMap.put("num_samples_above_2x_highest_quality", Integer.valueOf(r52.A0V));
                                    hashMap.put("num_samples_suggesting_better_serving_quality", Integer.valueOf(r52.A0b));
                                    hashMap.put("max_response_time_ms", Integer.valueOf(r52.A0L));
                                    hashMap.put("min_response_time_ms", Integer.valueOf(r52.A0Q));
                                    hashMap.put("avg_response_time_ms", Integer.valueOf(r52.A03));
                                    hashMap.put("max_download_speed", Long.valueOf(r52.A0o));
                                    hashMap.put("min_download_speed", Long.valueOf(r52.A0p));
                                    hashMap.put("avg_download_speed", Long.valueOf(r52.A0m));
                                    hashMap.put("max_download_time_ms", Integer.valueOf(r52.A0J));
                                    hashMap.put("min_download_time_ms", Integer.valueOf(r52.A0O));
                                    hashMap.put("avg_download_time_ms", Integer.valueOf(r52.A01));
                                    hashMap.put("max_download_bytes", Integer.valueOf(r52.A0I));
                                    hashMap.put("min_download_bytes", Integer.valueOf(r52.A0N));
                                    hashMap.put("avg_download_bytes", Integer.valueOf(r52.A00));
                                    hashMap.put("max_recommended_bitrate", Integer.valueOf(r52.A0K));
                                    hashMap.put("min_recommended_bitrate", Integer.valueOf(r52.A0P));
                                    hashMap.put("avg_recommended_bitrate", Integer.valueOf(r52.A02));
                                    hashMap.put("first_download_bytes", Integer.valueOf(r52.A06));
                                    hashMap.put("first_download_ttfb", Integer.valueOf(r52.A08));
                                    hashMap.put("first_download_duration", Integer.valueOf(r52.A07));
                                    hashMap.put("first_download_failed", Boolean.valueOf(r52.A13));
                                    hashMap.put("second_download_bytes", Integer.valueOf(r52.A0g));
                                    hashMap.put("second_download_ttfb", Integer.valueOf(r52.A0i));
                                    hashMap.put("second_download_duration", Integer.valueOf(r52.A0h));
                                    hashMap.put("second_download_failed", Boolean.valueOf(r52.A18));
                                    hashMap.put("bandwidth_meter_kbps", Integer.valueOf(r52.A0A));
                                    hashMap.put("shared_accumulator_kbps", Integer.valueOf(r52.A0G));
                                    hashMap.put("shared_accumulator_age_ms", Integer.valueOf(r52.A0F));
                                    hashMap.put("historical_kbps", Integer.valueOf(r52.A0C));
                                    hashMap.put("heeded_kbps", Integer.valueOf(r52.A0D));
                                    hashMap.put("predicted_available_kbps", 0);
                                    hashMap.put("prediction_model_description", r52.A0w);
                                    hashMap.put("playback_is_live_streaming", Boolean.valueOf(r52.A15));
                                    hashMap.put("buffer", r52.A0r);
                                    hashMap.put("bandwidth", r52.A0q);
                                    hashMap.put("is_spherical", Boolean.valueOf(r52.A16));
                                    hashMap.put("is_sponsored", Boolean.valueOf(r52.A17));
                                    hashMap.put("last_quality_change_elapsed_realtime", Long.valueOf(r52.A0n));
                                    hashMap.put("start_playback_position_ms", Integer.toString(r52.A0E));
                                    hashMap.put("start_buffered_duration_ms", Integer.toString(r52.A0B));
                                    hashMap.put("kbps_estimate", Long.toString((long) r52.A0D));
                                    hashMap.put("highest_bitrate", Integer.toString(r52.A09));
                                    hashMap.put("constrained_highest_bitrate", Integer.toString(r52.A05));
                                    hashMap.put("lowest_bitrate", Integer.toString(r52.A0H));
                                    hashMap.put("num_bitrates", Integer.toString(r52.A0T));
                                    hashMap.put("origin", r52.A0v);
                                    break;
                                case 10:
                                    C41991rK r53 = (C41991rK) r5;
                                    hashMap = new HashMap();
                                    hashMap.put(TraceFieldType.VideoId, r53.A03);
                                    hashMap.put(TraceFieldType.ErrorDomain, r53.A02);
                                    hashMap.put("debug_reason", r53.A01);
                                    String str4 = null;
                                    try {
                                        r11 = C42071rS.valueOf(r53.A00);
                                        if (r11 != null) {
                                            try {
                                                C42091rU r10 = r11.A01;
                                                str4 = AnonymousClass000.A0J(r10.A00.A00, ".", r10.A01);
                                            } catch (IllegalArgumentException | NullPointerException unused) {
                                            }
                                        }
                                    } catch (IllegalArgumentException | NullPointerException unused2) {
                                        r11 = null;
                                    }
                                    if (str4 == null) {
                                        str4 = r53.A00;
                                    }
                                    if (r11 != null) {
                                        hashMap.put(TraceFieldType.ErrorCode, Integer.valueOf(r11.A00));
                                    }
                                    hashMap.put("reliability_label", str4);
                                    break;
                                case 18:
                                    new HashMap();
                                    throw null;
                                case 19:
                                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                                case 24:
                                    new HashMap(20);
                                    throw null;
                                default:
                                    hashMap = new HashMap();
                                    break;
                            }
                            char c = 0;
                            switch (str.hashCode()) {
                                case -1634459000:
                                    c = 2;
                                    break;
                                case -1481689943:
                                    c = 5;
                                    break;
                                case 251272203:
                                    c = 3;
                                    break;
                                case 406187260:
                                    c = 1;
                                    break;
                                case 954583480:
                                    c = 4;
                                    break;
                                case 2014421094:
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                C40501ol r34 = r4.A01.A00;
                                Object A03 = C40421od.A00(TraceFieldType.VideoId, hashMap).A03();
                                Object A032 = C40421od.A00("origin", hashMap).A03();
                                Object A033 = C40421od.A00("trigger", hashMap).A03();
                                Object A04 = C40421od.A00("last_quality_change_elapsed_realtime", hashMap).A04(0L);
                                Object A034 = C40421od.A00("start_playback_position_ms", hashMap).A03();
                                Object A035 = C40421od.A00("start_buffered_duration_ms", hashMap).A03();
                                Object A036 = C40421od.A00("kbps_estimate", hashMap).A03();
                                Object A042 = C40421od.A00(TraceFieldType.Bitrate, hashMap).A04(-1);
                                Object A037 = C40421od.A00("highest_bitrate", hashMap).A03();
                                Object A038 = C40421od.A00("constrained_highest_bitrate", hashMap).A03();
                                Object A039 = C40421od.A00("lowest_bitrate", hashMap).A03();
                                Object A0310 = C40421od.A00("num_bitrates", hashMap).A03();
                                Object A043 = C40421od.A00("num_samples", hashMap).A04(0);
                                Object A044 = C40421od.A00("num_samples_at_ideal_quality", hashMap).A04(0);
                                Object A045 = C40421od.A00("num_samples_below_ideal_quality", hashMap).A04(0);
                                Object A046 = C40421od.A00("num_samples_above_ideal_quality", hashMap).A04(0);
                                Object A047 = C40421od.A00("num_samples_above_2x_highest_quality", hashMap).A04(0);
                                Object A048 = C40421od.A00("num_samples_below_lowest_quality", hashMap).A04(0);
                                if (r34.A01.A00()) {
                                    String str5 = (String) A03;
                                    int hashCode = str5.hashCode();
                                    r34.A00.markerStart(1900561, hashCode);
                                    long longValue = ((Long) A04).longValue();
                                    int intValue = ((Integer) A042).intValue();
                                    int intValue2 = ((Integer) A043).intValue();
                                    int intValue3 = ((Integer) A044).intValue();
                                    int intValue4 = ((Integer) A045).intValue();
                                    int intValue5 = ((Integer) A046).intValue();
                                    int intValue6 = ((Integer) A047).intValue();
                                    int intValue7 = ((Integer) A048).intValue();
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put(TraceFieldType.VideoId, str5);
                                    hashMap2.put("player_origin", (String) A032);
                                    hashMap2.put("trigger", (String) A033);
                                    hashMap2.put("duration_ms", Long.toString(longValue));
                                    hashMap2.put("start_playback_position_ms", (String) A034);
                                    hashMap2.put("start_buffered_duration_ms", (String) A035);
                                    hashMap2.put("kbps_estimate", (String) A036);
                                    hashMap2.put(TraceFieldType.Bitrate, Integer.toString(intValue));
                                    hashMap2.put("highest_bitrate", (String) A037);
                                    hashMap2.put("constrained_highest_bitrate", (String) A038);
                                    hashMap2.put("lowest_bitrate", (String) A039);
                                    hashMap2.put("num_bitrates", (String) A0310);
                                    hashMap2.put("abr_decision_summary_num_decisions", Integer.toString(intValue2));
                                    hashMap2.put("abr_decision_summary_num_correct_decisions", Integer.toString(intValue3));
                                    hashMap2.put("abr_decision_summary_num_decisions_too_low", Integer.toString(intValue4));
                                    hashMap2.put("abr_decision_summary_num_decisions_too_high", Integer.toString(intValue5));
                                    hashMap2.put("abr_decision_summary_num_cases_needing_higher_quality", Integer.toString(intValue6));
                                    hashMap2.put("abr_decision_summary_num_cases_needing_lower_quality", Integer.toString(intValue7));
                                    C40441of.A00(1900561, hashCode, hashMap2);
                                    r34.A00.markerEnd(1900561, hashCode, 2);
                                }
                            } else if (c == 1 || c == 2) {
                                C40521on r8 = r4.A01.A04;
                                if ((r8.A02.A00() || r8.A02.A00) && (obj = hashMap.get(TraceFieldType.VideoId)) != null) {
                                    int hashCode2 = obj.hashCode();
                                    String valueOf = String.valueOf(hashMap.get(TraceFieldType.VideoId));
                                    String str6 = valueOf;
                                    int indexOf = valueOf.indexOf(95);
                                    if (indexOf > -1) {
                                        str6 = valueOf.substring(0, indexOf);
                                    }
                                    r8.A01.A0M(28180482, 1);
                                    r8.A01.markerStart(28180482, hashCode2);
                                    HashMap hashMap3 = new HashMap();
                                    Long l = (Long) hashMap.get("time_ms");
                                    if (l != null) {
                                        hashMap3.put("time_ms", Long.toString(l.longValue()));
                                    }
                                    hashMap3.put(TraceFieldType.VideoId, str6);
                                    hashMap3.put("player_id", String.valueOf(hashMap.get("player_id")));
                                    hashMap3.put("request_queue_time_ms", String.valueOf(hashMap.get("request_queue_time_ms")));
                                    hashMap3.put("transfer_start", String.valueOf(hashMap.get("transfer_start")));
                                    hashMap3.put("transfer_end", String.valueOf(hashMap.get("transfer_end")));
                                    hashMap3.put("buffer_duration_ms", String.valueOf(hashMap.get("buffer_duration_ms")));
                                    hashMap3.put("transfer_bytes", String.valueOf(hashMap.get("transfer_bytes")));
                                    hashMap3.put("req_length", String.valueOf(hashMap.get("req_length")));
                                    hashMap3.put("is_prefetch", String.valueOf(hashMap.get("is_prefetch")));
                                    hashMap3.put("prefetch_source", String.valueOf(hashMap.get("prefetch_source")));
                                    hashMap3.put(TraceFieldType.StreamType, String.valueOf(hashMap.get(TraceFieldType.StreamType)));
                                    hashMap3.put("seq", String.valueOf(hashMap.get("seq")));
                                    hashMap3.put("start_bandwidth", String.valueOf(hashMap.get("start_bandwidth")));
                                    hashMap3.put("start_video_ttfb", String.valueOf(hashMap.get("start_video_ttfb")));
                                    hashMap3.put("is_cached", String.valueOf(hashMap.get("is_cached")));
                                    hashMap3.put(TraceFieldType.Bitrate, String.valueOf(hashMap.get(TraceFieldType.Bitrate)));
                                    hashMap3.put("segment_start_ms", String.valueOf(hashMap.get("segment_start_ms")));
                                    hashMap3.put("is_skip_ahead_chunk", String.valueOf(hashMap.get("is_skip_ahead_chunk")));
                                    hashMap3.put("in_rewound_state", String.valueOf(hashMap.get("in_rewound_state")));
                                    hashMap3.put("num_segments_to_end_of_manifest", String.valueOf(hashMap.get("num_segments_to_end_of_manifest")));
                                    hashMap3.put("segment_duration_ms", String.valueOf(hashMap.get("segment_duration_ms")));
                                    hashMap3.put("data_source_factory", String.valueOf(hashMap.get("data_source_factory")));
                                    hashMap3.put("cache_type", String.valueOf(hashMap.get("cache_type")));
                                    hashMap3.put(IgReactNavigatorModule.URL, String.valueOf(hashMap.get(IgReactNavigatorModule.URL)));
                                    hashMap3.put("error", String.valueOf(hashMap.get("error")));
                                    hashMap3.put("first_time_play", String.valueOf(hashMap.get("first_time_play")));
                                    hashMap3.put("play_origin", String.valueOf(hashMap.get("play_origin")));
                                    hashMap3.put("debug_info", String.valueOf(hashMap.get("debug_info")));
                                    hashMap3.put("offset", String.valueOf(hashMap.get("offset")));
                                    hashMap3.put("uses_proxy", String.valueOf(hashMap.get("uses_proxy")));
                                    hashMap3.put("connection_quality", String.valueOf(hashMap.get("connection_quality")));
                                    hashMap3.put("network_priority", String.valueOf(hashMap.get("network_priority")));
                                    hashMap3.put("is_lowest_bitrate", String.valueOf(hashMap.get("is_lowest_bitrate")));
                                    hashMap3.put("is_spherical", String.valueOf(hashMap.get("is_spherical")));
                                    hashMap3.put("is_sponsored", String.valueOf(hashMap.get("is_sponsored")));
                                    hashMap3.put("liger_vp_bw", String.valueOf(hashMap.get("video_process_bandwidth")));
                                    hashMap3.put("liger_main_bw", String.valueOf(hashMap.get("main_process_bandwidth")));
                                    hashMap3.put("upstream_ttfb", String.valueOf(hashMap.get("upstream_ttfb")));
                                    hashMap3.put("is_templated_manifest", String.valueOf(hashMap.get("is_templated_manifest")));
                                    hashMap3.put("is_fbms", String.valueOf(hashMap.get("is_fbms")));
                                    hashMap3.put("is_manifest_dynamic", String.valueOf(hashMap.get("is_manifest_dynamic")));
                                    hashMap3.put("is_fb_predictive_dash", String.valueOf(hashMap.get("is_fb_predictive_dash")));
                                    hashMap3.put("manifest_first_segment_start", String.valueOf(hashMap.get("manifest_first_segment_start")));
                                    hashMap3.put("manifest_last_segment_end", String.valueOf(hashMap.get("manifest_last_segment_end")));
                                    hashMap3.put("manifest_num_segments", String.valueOf(hashMap.get("manifest_num_segments")));
                                    hashMap3.put("buffer_duration_at_data_spec_creation", String.valueOf(hashMap.get("buffer_duration_at_data_spec_creation")));
                                    hashMap3.put("data_spec_creation_time_ms", String.valueOf(hashMap.get("data_spec_creation_time_ms")));
                                    hashMap3.put("is_live", String.valueOf(hashMap.get("is_live")));
                                    hashMap3.put("chunked_transfer", String.valueOf(hashMap.get("chunked_transfer")));
                                    hashMap3.put("predicted_url", String.valueOf(hashMap.get("predicted_url")));
                                    hashMap3.put("confidence_based_bitrate_estimate", String.valueOf(hashMap.get("confidence_based_bitrate_estimate")));
                                    hashMap3.put("confidence_pct_for_bitrate_estimate", String.valueOf(hashMap.get("confidence_pct_for_bitrate_estimate")));
                                    String str7 = (String) hashMap.get("exception");
                                    if (str7 != null) {
                                        hashMap3.put("exception", str7);
                                    }
                                    String str8 = (String) hashMap.get("quality_label");
                                    if (str8 != null) {
                                        hashMap3.put("quality_label", str8);
                                    }
                                    String str9 = (String) hashMap.get("tigon_session_id");
                                    if (str9 != null) {
                                        hashMap3.put("tigon_session_id", str9);
                                    }
                                    String str10 = (String) hashMap.get("tigon_transaction_id");
                                    if (str10 != null) {
                                        hashMap3.put("tigon_transaction_id", str10);
                                    }
                                    String str11 = (String) hashMap.get("play_sub_origin");
                                    if (str11 != null) {
                                        hashMap3.put("play_sub_origin", str11);
                                    }
                                    String str12 = (String) hashMap.get("edge_hit");
                                    if (str12 != null) {
                                        hashMap3.put("edge_hit", str12);
                                    }
                                    String str13 = (String) hashMap.get("origin_hit");
                                    if (str13 != null) {
                                        hashMap3.put("origin_hit", str13);
                                    }
                                    String str14 = (String) hashMap.get("codec");
                                    if (str14 != null) {
                                        hashMap3.put("codec", str14);
                                    }
                                    hashMap3.put("cdn_time", String.valueOf(hashMap.get("cdn_time")));
                                    hashMap3.put(TraceFieldType.ContentType, String.valueOf(hashMap.get(TraceFieldType.ContentType)));
                                    hashMap3.put("latest_segment_id", String.valueOf(hashMap.get("latest_segment_id")));
                                    hashMap3.put("ig_video_id", valueOf);
                                    C40441of.A00(28180482, hashCode2, hashMap3);
                                    r8.A01.markerEnd(28180482, hashCode2, 2);
                                }
                            } else if (c == 3 || c == 4 || c == 5) {
                                C40581ot r42 = r4.A00;
                                C40591ou r54 = r42.A03;
                                long j = r42.A01;
                                r42.A01 = 1 + j;
                                AnonymousClass0P4 A002 = AnonymousClass0P4.A00(str, (AnonymousClass0RN) null);
                                A002.A0F("event_id", Long.valueOf(j));
                                A002.A0G("event_name", str.substring(11).toUpperCase(Locale.ROOT));
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String str15 = (String) entry.getKey();
                                    Object value = entry.getValue();
                                    if (value instanceof String) {
                                        A002.A0G(str15, (String) value);
                                    } else if (value instanceof Integer) {
                                        A002.A0E(str15, (Integer) value);
                                    } else if (value instanceof Long) {
                                        A002.A0F(str15, (Long) value);
                                    } else if (value instanceof Boolean) {
                                        A002.A0A(str15, (Boolean) value);
                                    } else if (value instanceof Double) {
                                        A002.A0C(str15, (Double) value);
                                    } else if (value instanceof Map) {
                                        C06270Ok A003 = C06270Ok.A00();
                                        for (Map.Entry entry2 : ((Map) value).entrySet()) {
                                            C40591ou.A00(A003, (String) entry2.getKey(), entry2.getValue());
                                        }
                                        A002.A08(str15, A003);
                                    }
                                }
                                AnonymousClass0WN.A01(r54.A00).BcG(A002);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException(AnonymousClass000.A0J("Event with eventType ", r5.A00.name(), " is not a logging event"));
                    }
                }
            }
            if (this.A00.A0I != null) {
                this.A00.A0I.send(i2, bundle2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid EventType value");
    }
}
