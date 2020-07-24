package p000X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.AST */
public final class AST {
    public static ASS parseFromJson(C13080hr r4) {
        ASS ass = new ASS();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("upload_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ass.A0K = str;
            } else if ("fbvp_tcp_upload_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ass.A0I = str;
            } else if ("fbvp_quic_upload_url".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ass.A0H = str;
            } else if (TraceFieldType.BroadcastId.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                ass.A0G = str;
            } else if ("max_time_in_seconds".equals(A0i)) {
                ass.A0E = Long.valueOf(r4.A0J());
            } else if ("speed_test_ui_timeout".equals(A0i)) {
                ass.A0F = Long.valueOf(r4.A0J());
            } else {
                if (!"stream_network_speed_test_payload_chunk_size_in_bytes".equals(A0i) && !"stream_network_speed_test_payload_size_in_bytes".equals(A0i) && !"stream_network_speed_test_payload_timeout_in_seconds".equals(A0i)) {
                    if ("stream_network_connection_retry_count".equals(A0i)) {
                        ass.A0A = Integer.valueOf(r4.A0I());
                    } else if ("stream_network_connection_retry_delay_in_seconds".equals(A0i)) {
                        ass.A0B = Integer.valueOf(r4.A0I());
                    } else {
                        if (!"speed_test_minimum_bandwidth_threshold".equals(A0i)) {
                            if (!"speed_test_retry_max_count".equals(A0i)) {
                                if (!"speed_test_retry_time_delay".equals(A0i)) {
                                    if (!"disable_speed_test".equals(A0i)) {
                                        if ("stream_video_width".equals(A0i)) {
                                            ass.A07 = r4.A0I();
                                        } else if ("stream_video_bit_rate".equals(A0i)) {
                                            ass.A05 = r4.A0I();
                                        } else if ("stream_video_fps".equals(A0i)) {
                                            ass.A06 = r4.A0I();
                                        } else if ("stream_audio_sample_rate".equals(A0i)) {
                                            ass.A04 = r4.A0I();
                                        } else if ("stream_audio_channels".equals(A0i)) {
                                            ass.A02 = r4.A0I();
                                        } else if ("stream_audio_bit_rate".equals(A0i)) {
                                            ass.A01 = r4.A0I();
                                        } else if ("stream_audio_profile".equals(A0i)) {
                                            ass.A03 = r4.A0I();
                                        } else if (!"heartbeat_interval".equals(A0i)) {
                                            if (!"pass_thru_enabled".equals(A0i)) {
                                                if ("stream_video_adaptive_bitrate_config".equals(A0i)) {
                                                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                                                        str = r4.A0t();
                                                    }
                                                    ass.A0J = str;
                                                } else if ("display_server_message".equals(A0i)) {
                                                    ass.A00 = r4.A0I();
                                                } else if (!"connect_with_1rtt".equals(A0i) && !"allow_resolution_change".equals(A0i)) {
                                                    if ("live_trace_enabled".equals(A0i)) {
                                                        ass.A08 = Boolean.valueOf(r4.A0O());
                                                    } else if ("live_trace_sample_interval_in_seconds".equals(A0i)) {
                                                        ass.A0C = Integer.valueOf(r4.A0I());
                                                    } else if ("live_trace_sampling_source".equals(A0i)) {
                                                        ass.A0D = Integer.valueOf(r4.A0I());
                                                    } else if ("server_abr_enabled".equals(A0i)) {
                                                        ass.A09 = Boolean.valueOf(r4.A0O());
                                                    } else {
                                                        AnonymousClass1N4.A01(ass, A0i, r4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    r4.A0O();
                                }
                            }
                        }
                        r4.A0H();
                    }
                }
                r4.A0I();
            }
            r4.A0f();
        }
        return ass;
    }
}
