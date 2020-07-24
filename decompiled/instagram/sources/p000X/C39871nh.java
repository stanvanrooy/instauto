package p000X;

import android.content.Context;
import android.os.StatFs;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1nh  reason: invalid class name and case insensitive filesystem */
public final class C39871nh {
    public static volatile HeroPlayerSetting A00;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x031c, code lost:
        if (p000X.C40151oA.A00(r0).booleanValue() != false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0330, code lost:
        if (p000X.C40151oA.A00(r0).booleanValue() != false) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0344, code lost:
        if (p000X.C40151oA.A00(r0).booleanValue() != false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0422, code lost:
        if (r4 != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x08e1, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r28, p000X.AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK, "context_aware_abr_enabled", (java.lang.Object) null, (p000X.AnonymousClass04H) null)).booleanValue() != false) goto L_0x08e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0b0e, code lost:
        if (p000X.C40261oM.A00(r0).booleanValue() != false) goto L_0x0b10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0b26, code lost:
        if (p000X.C40281oO.A00(r0).booleanValue() != false) goto L_0x0b28;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e6  */
    public static HeroPlayerSetting A00(Context context, AnonymousClass0C1 r43) {
        long j;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        double doubleValue;
        double doubleValue2;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        boolean z6;
        boolean z7;
        C40111o6 r6;
        C40111o6 r7;
        C40111o6 r3;
        int i;
        String str2;
        File file;
        if (A00 == null) {
            C39881ni r1 = new C39881ni();
            r1.A0y = true;
            r1.A0d = C40121o7.A00().A05;
            r1.A1S = true;
            r1.A0t = true;
            r1.A1n = true;
            r1.A0r = true;
            AnonymousClass0L7 r62 = AnonymousClass0L7.ADAPTIVE_VIDEO_CACHE_FOLDER_SIZE_LAUNCHER;
            AnonymousClass0C1 r0 = r43;
            if (((Boolean) AnonymousClass0L6.A02(r0, r62, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue()) {
                long intValue5 = (long) ((((Integer) AnonymousClass0L6.A02(r0, r62, "max_size_mb", 100, (AnonymousClass04H) null)).intValue() << 10) << 10);
                float intValue6 = ((float) ((Integer) AnonymousClass0L6.A02(r0, AnonymousClass0L7.ADAPTIVE_VIDEO_CACHE_FOLDER_SIZE_LAUNCHER, "usage_factor", 3, (AnonymousClass04H) null)).intValue()) * 0.01f;
                File cacheDir = context.getCacheDir();
                try {
                    file = cacheDir;
                    String canonicalPath = cacheDir.getCanonicalPath();
                    file = canonicalPath;
                    str2 = canonicalPath;
                } catch (IOException unused) {
                    str2 = file.toString();
                }
                File file2 = new File(str2);
                if (104857600 <= intValue5) {
                    try {
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        StatFs statFs = new StatFs(file2.getPath());
                        j = Math.max(104857600, Math.min((long) (((float) (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong())) * intValue6), intValue5));
                    } catch (IllegalArgumentException unused2) {
                        AnonymousClass0QD.A01("IgExoVideoCache", "Couldn't determine video cache folder max size");
                    }
                    if (j <= 0) {
                        j = 104857600;
                    }
                }
                j = 0;
                if (j <= 0) {
                }
            } else {
                Context context2 = context;
                if (((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG, "alt_cache_util_is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue()) {
                    i = (int) AnonymousClass2FG.VIDEO.A00(new File(A01(context2)), 104857600);
                } else {
                    i = 104857600;
                }
                j = (long) i;
            }
            int i2 = (int) j;
            File cacheDir2 = context.getCacheDir();
            try {
                str = cacheDir2.getCanonicalPath();
            } catch (IOException unused3) {
                str = cacheDir2.toString();
            }
            String A01 = A01(context);
            long millis = TimeUnit.HOURS.toMillis(12);
            long millis2 = TimeUnit.MINUTES.toMillis(1);
            long millis3 = TimeUnit.HOURS.toMillis(1);
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.LAUNCHER_VIDEO_CACHE_FIX_DUP_REQUESTS, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L7 r63 = AnonymousClass0L7.CACHE_EFFICIENCY_LAUNCHER;
            r1.A0T = new C39901nk(str, A01, true, i2, millis, millis2, millis3, booleanValue, ((Boolean) AnonymousClass0L6.A02(r0, r63, "is_video_logging_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue(), ((Integer) AnonymousClass0L6.A02(r0, r63, "event_batching_limit", (Object) null, (AnonymousClass04H) null)).intValue(), ((Integer) AnonymousClass0L6.A02(r0, r63, "low_ram_item_limit", -1, (AnonymousClass04H) null)).intValue(), ((Integer) AnonymousClass0L6.A02(r0, r63, "high_ram_item_limit", -1, (AnonymousClass04H) null)).intValue());
            r1.A0u = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.LAUNCHER_VIDEO_CACHE_FIX_DUP_REQUESTS, "use_read_write_block_without_timeout", (Object) null, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L7 r64 = AnonymousClass0L7.SKIP_AUDIO_PREFETCH_STORY_ADS_DASH_MIGRATION_COMBINED_LAUNCHER;
            int intValue7 = ((Integer) AnonymousClass0L6.A02(r0, r64, "android_max_audio_load_time_before_stall", 1000, (AnonymousClass04H) null)).intValue();
            int intValue8 = ((Integer) AnonymousClass0L6.A02(r0, r64, "allow_joining_times", (Object) null, (AnonymousClass04H) null)).intValue();
            boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(r0, r64, "android_allow_joining_on_set_volume", (Object) null, (AnonymousClass04H) null)).booleanValue();
            C40061o1 r65 = new C40061o1();
            r65.A00 = intValue7;
            r65.A01 = (long) intValue8;
            r65.A02 = booleanValue2;
            r65.A03 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK, "enable_lazy_audio_clock_fix", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0S = new C40071o2(r65);
            r1.A0H = 1000;
            boolean z8 = false;
            r1.A13 = false;
            r1.A1h = true;
            r1.A1j = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_EXOPLAYER_2, "is_dummy_surface_enabled", true, (AnonymousClass04H) null)).booleanValue();
            r1.A1E = true;
            r1.A14 = true;
            r1.A1Q = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_ABR, "release_on_player_release", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A00 = 12000;
            r1.A01 = 6000;
            r1.A17 = true;
            r1.A15 = true;
            String str3 = "is_enabled";
            r1.A0v = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.CACHED_BANDWIDTH_ESTIMATE_WITH_NEW_ESTIMATOR, str3, (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1D = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.HERO_PLAYER_RESULT_RECEIVER_LEAK, str3, (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0A = ((Integer) AnonymousClass0L6.A02(r0, AnonymousClass0L7.DIRECT_THREAD_VIDEO_PLAYBACK, "concurrent_video_playback_count", 3, (AnonymousClass04H) null)).intValue();
            r1.A0K = (long) ((Integer) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_MICRO_STALL_IMPROVEMENT_LAUNCHER, "render_allowed_joining_time", (Object) null, (AnonymousClass04H) null)).intValue();
            AnonymousClass0L7 r72 = AnonymousClass0L7.LIVE_IMPROVEMENTS;
            r1.A0J = (long) ((Integer) AnonymousClass0L6.A02(r0, r72, "ignore_stream_error_temp_ms", (Object) null, (AnonymousClass04H) null)).intValue();
            r1.A1I = ((Boolean) AnonymousClass0L6.A02(r0, r72, "fix_downstream_format", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0B = 2;
            r1.A1i = true;
            AnonymousClass0L7 r73 = AnonymousClass0L7.VIDEO_PALYER_WARMUP_SURFACE_REUSE;
            r1.A19 = ((Boolean) AnonymousClass0L6.A02(r0, r73, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0I = ((Integer) AnonymousClass0L6.A02(r0, r73, "pool_size", 3, (AnonymousClass04H) null)).intValue();
            r1.A1f = true;
            r1.A0q = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK, "warmup_watermark_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1R = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.REORDER_SEEK_PARAMS, "reorder_seek_prepare", (Object) null, (AnonymousClass04H) null)).booleanValue();
            boolean booleanValue3 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.WARMUP_ON_OFF_SCREEN_REQUESTS, "enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            boolean booleanValue4 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.WARMUP_ON_OFF_SCREEN_REQUESTS, "is_first_warmup_onscreen", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A18 = booleanValue3;
            r1.A0x = booleanValue4;
            if (!AnonymousClass1CU.A00()) {
                z = false;
            }
            z = true;
            r1.A0p = z;
            if (!AnonymousClass1CU.A00()) {
                z2 = false;
            }
            z2 = true;
            r1.A0n = z2;
            if (!AnonymousClass1CU.A00()) {
                z3 = false;
            }
            z3 = true;
            r1.A1T = z3;
            r1.A1d = true;
            r1.A1q = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_EXPERIMENTAL_ENCODING_CONSUMPTION, "blocking_release_surface", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0e = "system_decoder";
            r1.A1r = true;
            r1.A1Z = C05770Lw.A00().A0I();
            AnonymousClass0L7 r9 = AnonymousClass0L7.LOW_LATENCY_CONSUMPTION;
            AnonymousClass0L6.A02(r0, r9, "limit_buffer_size_ms", (Object) null, (AnonymousClass04H) null);
            AnonymousClass0L6.A02(r0, r9, "is_streaming_cache_enabled", (Object) null, (AnonymousClass04H) null);
            AnonymousClass0L6.A02(r0, r9, "is_manifestless_enabled", (Object) null, (AnonymousClass04H) null);
            AnonymousClass0L6.A02(r0, r9, "use_exo2", (Object) null, (AnonymousClass04H) null);
            r1.A0W = new C40051o0();
            r1.A1H = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.LIVE_PERF_IMPROVEMENT_2_LAUNCHER, "use_low_pri_request", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A11 = A02(r0);
            r1.A10 = A02(r0);
            AnonymousClass0L7 r74 = AnonymousClass0L7.LIVE_PERFORMANCE_IMPROVEMENT_LAUNCHER;
            AnonymousClass0L6.A02(r0, r74, "enable_live_codec_reuse", (Object) null, (AnonymousClass04H) null);
            AnonymousClass0L6.A02(r0, r74, "enable_live_codec_reuse", (Object) null, (AnonymousClass04H) null);
            A02(r0);
            A02(r0);
            AnonymousClass0L7 r8 = AnonymousClass0L7.TUNE_VIDEO_RELATED_PARAMS_LAUNCHER;
            r1.A07 = ((Integer) AnonymousClass0L6.A02(r0, r8, "instance_per_codec", 2, (AnonymousClass04H) null)).intValue();
            r1.A08 = ((Integer) AnonymousClass0L6.A02(r0, r8, "codec_pool_size", 4, (AnonymousClass04H) null)).intValue();
            boolean booleanValue5 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_QP_LOGGER, "video_profiling_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            boolean booleanValue6 = C40151oA.A00(r0).booleanValue();
            boolean A002 = AnonymousClass1CU.A00();
            boolean booleanValue7 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_PROFILER_LOOM_TRACES, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            if (!booleanValue5 && !booleanValue6 && !A002) {
                z4 = false;
            }
            z4 = true;
            r1.A0o = z4;
            AnonymousClass0L7 r75 = AnonymousClass0L7.VIDEO_EXOPLAYER_2;
            r1.A1l = ((Boolean) AnonymousClass0L6.A02(r0, r75, "is_max_buffer_for_progressive", true, (AnonymousClass04H) null)).booleanValue();
            r1.A1p = ((Boolean) AnonymousClass0L6.A02(r0, r75, "ig_progressive_watermark_enabled", true, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L7 r82 = AnonymousClass0L7.VIDEO_EXOPLAYER_2;
            r1.A1C = ((Boolean) AnonymousClass0L6.A02(r0, r82, "is_media_codec_pooling_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1K = ((Boolean) AnonymousClass0L6.A02(r0, r82, "ig_player_respawn_enabled", true, (AnonymousClass04H) null)).booleanValue();
            r1.A1k = ((Boolean) AnonymousClass0L6.A02(r0, r82, "use_exo1_buffer_calc", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1J = ((Boolean) AnonymousClass0L6.A02(r0, r82, "new_renderers_for_respawn", true, (AnonymousClass04H) null)).booleanValue();
            r1.A1G = true;
            r1.A1b = ((Boolean) AnonymousClass0L6.A02(r0, r82, "skip_evaluate_on_init", true, (AnonymousClass04H) null)).booleanValue();
            r1.A1e = true;
            r1.A0s = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.DELAY_STARTED_PLAYING_CALLBACK_FOR_EXO2, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A03 = ((Integer) AnonymousClass0L6.A02(r0, r82, "live_dash_high_watermark_ms", 45000, (AnonymousClass04H) null)).intValue();
            r1.A04 = ((Integer) AnonymousClass0L6.A02(r0, r82, "live_dash_low_watermark_ms", 33000, (AnonymousClass04H) null)).intValue();
            r1.A1C = A02(r0);
            AnonymousClass0L7 r76 = AnonymousClass0L7.EXO2_ABSOLUTE_POSITION_LAUNCHER;
            r1.A1F = ((Boolean) AnonymousClass0L6.A02(r0, r76, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1A = ((Boolean) AnonymousClass0L6.A02(r0, r76, "masking_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1B = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_MICRO_STALL_IMPROVEMENT_LAUNCHER, "enable_micro_stall_fix", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1V = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_PROCESS_MERGE_TO_MAIN_PROCESS_LAUNCHER, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A15 = true;
            r1.A0w = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_PLAYBACK, "is_debug_logging_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0D = 10;
            r1.A0E = ((Integer) AnonymousClass0L6.A02(r0, AnonymousClass0L7.LAUNCHER_NETWORK_COMBINE_QUEUE, "video_process_prefetch_queue_worker_num", 1, (AnonymousClass04H) null)).intValue();
            r1.A0C = 600000;
            r1.A09 = 0;
            r1.A1O = false;
            r1.A06 = 1048576;
            r1.A05 = 1048576;
            AnonymousClass0L7 r77 = AnonymousClass0L7.VIDEO_EXPERIMENTAL_ENCODING_CONSUMPTION;
            r1.A1M = ((Boolean) AnonymousClass0L6.A02(r0, r77, "android_dash_prefetch_audio_first_for_stories_ads", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1L = ((Boolean) AnonymousClass0L6.A02(r0, r77, "prefetch_audio_first", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1a = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.SKIP_AUDIO_PREFETCH_STORY_ADS_DASH_MIGRATION_COMBINED_LAUNCHER, "android_skip_audio_prefetch", (Object) null, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L7 r78 = AnonymousClass0L7.VIDEO_EXPERIMENTAL_ENCODING_CONSUMPTION;
            r1.A1W = ((Boolean) AnonymousClass0L6.A02(r0, r78, "android_select_quality_in_prefetch_task", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1N = ((Boolean) AnonymousClass0L6.A02(r0, r78, "android_prefetch_quality_in_cache", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0z = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_LOG_SEMI_CACHED_EVENTS, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1Y = C40161oB.A00(r0).booleanValue();
            r1.A1s = C40161oB.A00(r0).booleanValue();
            r1.A1o = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.PREFETCH_SEGMENT_OFFSET, "enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1c = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.TUNE_VIDEO_RELATED_PARAMS_LAUNCHER, "enable_skip_prefetch_request", (Object) null, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L7 r66 = AnonymousClass0L7.PROGRESSIVE_PREFETCH_BYTES;
            r1.A0G = ((Integer) AnonymousClass0L6.A02(r0, r66, NetInfoModule.CONNECTION_TYPE_WIFI, 500000, (AnonymousClass04H) null)).intValue();
            r1.A0F = ((Integer) AnonymousClass0L6.A02(r0, r66, "cell", 256000, (AnonymousClass04H) null)).intValue();
            AnonymousClass0L7 r67 = AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK;
            r1.A16 = ((Boolean) AnonymousClass0L6.A02(r0, r67, "warmup_retry_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A12 = ((Boolean) AnonymousClass0L6.A02(r0, r67, "offloading_ipc_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A1P = ((Boolean) AnonymousClass0L6.A02(r0, r67, "enable_preload_init_chunk", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A02 = ((Integer) AnonymousClass0L6.A02(r0, r67, "init_chunk_size", 100, (AnonymousClass04H) null)).intValue();
            r1.A0m = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_QPL_PIPELINE, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L7 r68 = AnonymousClass0L7.ERROR_HANDLING_LAUNCHER;
            r1.A0l = ((Boolean) AnonymousClass0L6.A02(r0, r68, "enable_error_handling_policy", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0k = ((Boolean) AnonymousClass0L6.A02(r0, r68, "enable_blacklist", (Object) null, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L7 r5 = AnonymousClass0L7.VIDEO_ABR;
            Double valueOf = Double.valueOf(2.0d);
            double doubleValue3 = ((Double) AnonymousClass0L6.A02(r0, r5, "multiplier_for_live_prefetch", valueOf, (AnonymousClass04H) null)).doubleValue();
            double doubleValue4 = ((Double) AnonymousClass0L6.A02(r0, r5, "multiplier_for_prefetch", valueOf, (AnonymousClass04H) null)).doubleValue();
            Double valueOf2 = Double.valueOf(1.2d);
            AnonymousClass0C1 r28 = r0;
            AnonymousClass0L7 r29 = r5;
            Double d = valueOf2;
            double doubleValue5 = ((Double) AnonymousClass0L6.A02(r28, r29, "screen_width_multiplier_portrait_video", d, (AnonymousClass04H) null)).doubleValue();
            double doubleValue6 = ((Double) AnonymousClass0L6.A02(r28, r29, "screen_width_multiplier_landscape_video", d, (AnonymousClass04H) null)).doubleValue();
            C39991nt r92 = new C39991nt();
            r92.A0Y = 2000000;
            AnonymousClass0L7 r15 = AnonymousClass0L7.VIDEO_ABR;
            r92.A0q = ((Boolean) AnonymousClass0L6.A02(r28, r29, "limit_by_device_width", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r92.A07 = (float) doubleValue3;
            r92.A0F = (float) doubleValue4;
            r92.A0H = 10000;
            r92.A0l = ((Boolean) AnonymousClass0L6.A02(r28, r29, "cellular_hint_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r92.A0r = true;
            r92.A0E = (float) doubleValue5;
            r92.A0D = (float) doubleValue6;
            AnonymousClass0L7 r69 = AnonymousClass0L7.VIDEO_VISUAL_QUALITY_SCORE_BASED_ABR;
            r92.A0n = ((Boolean) AnonymousClass0L6.A02(r0, r69, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            AnonymousClass0L6.A02(r0, r69, "is_enabled_for_prefetch", (Object) null, (AnonymousClass04H) null);
            int A003 = C12300gW.A00(context);
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (A003 >= 2014) {
                f = 76.0f;
            }
            r92.A0A = f;
            r92.A0j = "VISUAL_QUALITY_SCORE,MAX_WIDTH";
            r92.A0k = "VISUAL_QUALITY_SCORE,MAX_WIDTH";
            Double valueOf3 = Double.valueOf(0.3d);
            double doubleValue7 = ((Double) AnonymousClass0L6.A02(r0, r15, "prefetch_long_queue_bw_fraction", valueOf3, (AnonymousClass04H) null)).doubleValue();
            double doubleValue8 = ((Double) AnonymousClass0L6.A02(r0, r15, "prefetch_short_queue_bw_fraction", Double.valueOf(0.75d), (AnonymousClass04H) null)).doubleValue();
            AnonymousClass0L7 r10 = AnonymousClass0L7.PREFETCH_CONF_PCT;
            int intValue9 = ((Integer) AnonymousClass0L6.A02(r0, r10, "prefetch_long_queue_bandwidth_confidence_pct", -1, (AnonymousClass04H) null)).intValue();
            int intValue10 = ((Integer) AnonymousClass0L6.A02(r28, r10, "prefetch_short_queue_bandwidth_confidence_pct", -1, (AnonymousClass04H) null)).intValue();
            AnonymousClass0L7 r292 = AnonymousClass0L7.LOW_RAM_VIDEO_SOURCE_ABR_TUNING;
            int intValue11 = ((Integer) AnonymousClass0L6.A02(r28, r292, "low_ram_long_queue_conf_pct_int", (Object) null, (AnonymousClass04H) null)).intValue();
            int intValue12 = ((Integer) AnonymousClass0L6.A02(r28, r292, "low_ram_short_queue_conf_pct_int", (Object) null, (AnonymousClass04H) null)).intValue();
            if (((Boolean) AnonymousClass0L6.A02(r28, r292, "is_low_ram_conf_pct_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue() && intValue11 > 0 && intValue12 > 0) {
                intValue9 = intValue11;
                intValue10 = intValue12;
            }
            AnonymousClass0L7 r102 = AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK;
            Double valueOf4 = Double.valueOf(1.0d);
            double doubleValue9 = ((Double) AnonymousClass0L6.A02(r28, r102, "bandwidth_multiplier", valueOf4, (AnonymousClass04H) null)).doubleValue();
            r92.A0b = C40191oF.A00(r0).intValue();
            r92.A0c = C40201oG.A00(r0).intValue();
            AnonymousClass0L7 r293 = AnonymousClass0L7.VIDEO_ABR;
            r92.A0a = ((Integer) AnonymousClass0L6.A02(r28, r293, "max_width_inline_player", 100000, (AnonymousClass04H) null)).intValue();
            r92.A0Z = ((Integer) AnonymousClass0L6.A02(r28, r293, "max_width_cell", 100000, (AnonymousClass04H) null)).intValue();
            AnonymousClass0L7 r13 = AnonymousClass0L7.VIDEO_ABR;
            r92.A0Y = ((Integer) AnonymousClass0L6.A02(r0, r13, "max_initial_bitrate", 2000000, (AnonymousClass04H) null)).intValue();
            r92.A0B = (float) doubleValue7;
            r92.A0C = (float) doubleValue8;
            r92.A0L = C40211oH.A00(r0).intValue();
            r92.A0m = ((Boolean) AnonymousClass0L6.A02(r28, r293, "enable_segment_bitrate", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r92.A0X = ((Integer) AnonymousClass0L6.A02(r28, r293, "max_duration_for_quality_decrease_ms", 25000, (AnonymousClass04H) null)).intValue();
            r92.A0I = C40221oI.A00(r0).intValue();
            if (!((Boolean) AnonymousClass0L6.A02(r28, AnonymousClass0L7.VIDEO_SOURCE_ABR_TUNING, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue()) {
                z5 = false;
            }
            z5 = true;
            r92.A0s = z5;
            r92.A0e = intValue9;
            r92.A0f = intValue10;
            r92.A00 = (float) doubleValue9;
            if (((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_ABR_TUNING, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue()) {
                doubleValue = 3.5d;
                doubleValue2 = 0.9d;
                intValue = 90;
                intValue2 = 60;
                intValue3 = CameraEnumerationAndroid.C01581.MIN_FPS_THRESHOLD;
                intValue4 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
            } else {
                doubleValue = ((Double) AnonymousClass0L6.A02(r0, r13, "lambda_falling_buffer_confidence_calculator", valueOf4, (AnonymousClass04H) null)).doubleValue();
                AnonymousClass0L7 r11 = r13;
                doubleValue2 = ((Double) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_ABR, "lambda_rising_buffer_confidence_calculator", valueOf4, (AnonymousClass04H) null)).doubleValue();
                intValue = ((Integer) AnonymousClass0L6.A02(r0, r11, "low_buffer_bandwidth_confidence_pct", 90, (AnonymousClass04H) null)).intValue();
                intValue2 = ((Integer) AnonymousClass0L6.A02(r0, r11, "high_buffer_bandwidth_confidence_pct", 60, (AnonymousClass04H) null)).intValue();
                intValue3 = ((Integer) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_ABR, "min_duration_high_bw_for_quality_increase_ms", Integer.valueOf(CameraEnumerationAndroid.C01581.MIN_FPS_THRESHOLD), (AnonymousClass04H) null)).intValue();
                intValue4 = ((Integer) AnonymousClass0L6.A02(r28, AnonymousClass0L7.VIDEO_ABR, "max_buffered_duration_ms_falling_buffer", (Object) null, (AnonymousClass04H) null)).intValue();
            }
            r92.A01 = (float) doubleValue;
            r92.A02 = (float) doubleValue2;
            r92.A0V = intValue;
            r92.A0G = intValue2;
            r92.A0d = intValue3;
            r92.A0h = intValue3;
            r92.A0W = intValue4;
            r92.A0g = intValue4;
            r92.A0i = ((Integer) AnonymousClass0L6.A02(r0, AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK, "bandwidth_boost", -1, (AnonymousClass04H) null)).intValue();
            r92.A0o = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.ABR_PREFETCH_HIGHER_QUALITY, "is_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            int i3 = context.getResources().getDisplayMetrics().widthPixels;
            r92.A0S = Math.min(396, i3);
            r92.A0T = Math.min(504, i3);
            int min = Math.min(i3, 504);
            r92.A0Q = min;
            r92.A0R = min;
            int min2 = Math.min(i3, 396);
            r92.A0K = min;
            r92.A0J = min2;
            AnonymousClass0L7 r610 = AnonymousClass0L7.VIDEO_ABR;
            double doubleValue10 = ((Double) AnonymousClass0L6.A02(r0, r610, "live_screen_width_multiplier_potrait_video", valueOf2, (AnonymousClass04H) null)).doubleValue();
            double doubleValue11 = ((Double) AnonymousClass0L6.A02(r28, r610, "live_screen_width_multiplier_landscape_video", valueOf2, (AnonymousClass04H) null)).doubleValue();
            double doubleValue12 = ((Double) AnonymousClass0L6.A02(r0, r610, "live_prefetch_short_queue_bw_fraction", Double.valueOf(0.6d), (AnonymousClass04H) null)).doubleValue();
            double doubleValue13 = ((Double) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_ABR, "live_prefetch_long_queue_bw_fraction", valueOf3, (AnonymousClass04H) null)).doubleValue();
            AnonymousClass0C1 r25 = r0;
            AnonymousClass0L7 r26 = AnonymousClass0L7.VIDEO_ABR;
            r92.A0R = ((Integer) AnonymousClass0L6.A02(r25, r26, "max_width_inline_player", 100000, (AnonymousClass04H) null)).intValue();
            r92.A0Q = ((Integer) AnonymousClass0L6.A02(r25, r26, "live_max_width_cell", 100000, (AnonymousClass04H) null)).intValue();
            r92.A0S = C40201oG.A00(r0).intValue();
            AnonymousClass0L7 r152 = AnonymousClass0L7.VIDEO_ABR;
            r92.A0T = ((Integer) AnonymousClass0L6.A02(r25, r26, "live_max_width_to_prefetch_wifi", Integer.valueOf(ArLinkScanControllerImpl.TARGET_IMAGE_SIZE), (AnonymousClass04H) null)).intValue();
            r92.A09 = (float) doubleValue10;
            r92.A08 = (float) doubleValue11;
            AnonymousClass0L7 r103 = AnonymousClass0L7.VIDEO_ABR;
            r92.A0M = ((Integer) AnonymousClass0L6.A02(r0, r103, "prefetch_long_queue_size", 3, (AnonymousClass04H) null)).intValue();
            r92.A04 = (float) doubleValue12;
            r92.A03 = (float) doubleValue13;
            r92.A0P = ((Integer) AnonymousClass0L6.A02(r0, r103, "live_max_duration_for_quality_decrease_ms", 25000, (AnonymousClass04H) null)).intValue();
            double doubleValue14 = ((Double) AnonymousClass0L6.A02(r0, r103, "live_lambda_falling_buffer_confidence_calculator", valueOf4, (AnonymousClass04H) null)).doubleValue();
            AnonymousClass0L7 r112 = r152;
            double doubleValue15 = ((Double) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_ABR, "live_lambda_rising_buffer_confidence_calculator", valueOf4, (AnonymousClass04H) null)).doubleValue();
            C40231oJ.A00(r0);
            int intValue13 = C40241oK.A00(r0).intValue();
            int intValue14 = ((Integer) AnonymousClass0L6.A02(r0, r112, "live_max_buffered_duration_ms_falling_buffer", (Object) null, (AnonymousClass04H) null)).intValue();
            r92.A05 = (float) doubleValue14;
            r92.A06 = (float) doubleValue15;
            r92.A0N = intValue13;
            r92.A0O = intValue14;
            r92.A0U = intValue14;
            r92.A0p = ((Boolean) AnonymousClass0L6.A02(r0, r112, "live_avoid_use_default_quality", (Object) null, (AnonymousClass04H) null)).booleanValue();
            r1.A0R = new C40001nu(r92);
            int intValue15 = ((Integer) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_PREFETCH_SEGMENT_BASED, "wifi_min_low_watermark_ms", 3000, (AnonymousClass04H) null)).intValue();
            AnonymousClass0L7 r79 = AnonymousClass0L7.VIDEO_PREFETCH_SEGMENT_BASED;
            r1.A0U = new C39961nq(intValue15, 12000, ((Double) AnonymousClass0L6.A02(r0, r79, "wifi_low_watermark_mutliplier", Double.valueOf(3.0d), (AnonymousClass04H) null)).floatValue(), 3000, ((Integer) AnonymousClass0L6.A02(r0, r79, "cell_min_low_watermark_ms", 3000, (AnonymousClass04H) null)).intValue(), 9000, ((Double) AnonymousClass0L6.A02(r0, r79, "cell_low_watermark_mutliplier", Double.valueOf(1.5d), (AnonymousClass04H) null)).floatValue(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            if (!C40251oL.A00(r0).booleanValue()) {
                z6 = false;
            }
            z6 = true;
            r1.A1U = z6;
            if (!C40271oN.A00(r0).booleanValue()) {
                z7 = false;
            }
            z7 = true;
            r1.A1m = z7;
            C40111o6 r52 = null;
            if (((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.ADAPTIVE_PARAMS_FOR_BUFFER_SETTING_LAUNCHER, "use_accumulator_for_bw", (Object) null, (AnonymousClass04H) null)).booleanValue() || ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.LIVE_PERF_IMPROVEMENT_2_LAUNCHER, "use_accumulator_for_bw", (Object) null, (AnonymousClass04H) null)).booleanValue()) {
                z8 = true;
            }
            r1.A1g = z8;
            if (C40251oL.A00(r0).booleanValue() && C40271oN.A00(r0).booleanValue()) {
                C40101o5 r710 = new C40101o5();
                r710.A06 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.ADAPTIVE_PARAMS_FOR_BUFFER_SETTING_LAUNCHER, "use_network_quality_for_minbuffer", (Object) null, (AnonymousClass04H) null)).booleanValue();
                AnonymousClass0L7 r611 = AnonymousClass0L7.ADAPTIVE_PARAMS_FOR_BUFFER_SETTING_LAUNCHER;
                r710.A00 = ((Integer) AnonymousClass0L6.A02(r0, r611, "min_buffer_default_value", 500, (AnonymousClass04H) null)).intValue();
                r710.A01 = ((Integer) AnonymousClass0L6.A02(r0, r611, "min_buffer_degraded_value", 500, (AnonymousClass04H) null)).intValue();
                AnonymousClass0L7 r93 = AnonymousClass0L7.ADAPTIVE_PARAMS_FOR_BUFFER_SETTING_LAUNCHER;
                r710.A05 = ((Integer) AnonymousClass0L6.A02(r0, r93, "min_buffer_poor_value", 1250, (AnonymousClass04H) null)).intValue();
                r710.A04 = ((Integer) AnonymousClass0L6.A02(r0, r93, "min_buffer_moderate_value", 600, (AnonymousClass04H) null)).intValue();
                r710.A03 = ((Integer) AnonymousClass0L6.A02(r0, r93, "min_buffer_good_value", 500, (AnonymousClass04H) null)).intValue();
                r710.A02 = ((Integer) AnonymousClass0L6.A02(r0, r93, "min_buffer_excellent_value", 500, (AnonymousClass04H) null)).intValue();
                r52 = new C40111o6(r710);
            }
            if (!C40251oL.A00(r0).booleanValue() || !C40271oN.A00(r0).booleanValue()) {
                r6 = null;
            } else {
                C40101o5 r83 = new C40101o5();
                r83.A06 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.ADAPTIVE_PARAMS_FOR_BUFFER_SETTING_LAUNCHER, "use_network_quality_for_rebuffer", (Object) null, (AnonymousClass04H) null)).booleanValue();
                AnonymousClass0L7 r711 = AnonymousClass0L7.ADAPTIVE_PARAMS_FOR_BUFFER_SETTING_LAUNCHER;
                Integer valueOf5 = Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                r83.A00 = ((Integer) AnonymousClass0L6.A02(r0, r711, "min_rebuffer_default_value", valueOf5, (AnonymousClass04H) null)).intValue();
                r83.A01 = ((Integer) AnonymousClass0L6.A02(r0, r711, "min_rebuffer_degraded_value", 3500, (AnonymousClass04H) null)).intValue();
                AnonymousClass0L7 r113 = AnonymousClass0L7.ADAPTIVE_PARAMS_FOR_BUFFER_SETTING_LAUNCHER;
                r83.A05 = ((Integer) AnonymousClass0L6.A02(r0, r113, "min_rebuffer_poor_value", Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS), (AnonymousClass04H) null)).intValue();
                r83.A04 = ((Integer) AnonymousClass0L6.A02(r0, r113, "min_rebuffer_moderate_value", 3500, (AnonymousClass04H) null)).intValue();
                r83.A03 = ((Integer) AnonymousClass0L6.A02(r0, r113, "min_rebuffer_good_value", 3000, (AnonymousClass04H) null)).intValue();
                r83.A02 = ((Integer) AnonymousClass0L6.A02(r0, r113, "min_rebuffer_excellent_value", valueOf5, (AnonymousClass04H) null)).intValue();
                r6 = new C40111o6(r83);
            }
            if (!C40261oM.A00(r0).booleanValue() || !C40281oO.A00(r0).booleanValue()) {
                r7 = null;
            } else {
                C40101o5 r94 = new C40101o5();
                r94.A06 = ((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.LIVE_PERF_IMPROVEMENT_2_LAUNCHER, "use_network_quality_for_minbuffer", (Object) null, (AnonymousClass04H) null)).booleanValue();
                r94.A00 = ((Integer) AnonymousClass0L6.A02(r0, AnonymousClass0L7.LIVE_PERF_IMPROVEMENT_2_LAUNCHER, "min_buffer_default_value", 500, (AnonymousClass04H) null)).intValue();
                AnonymousClass0L7 r114 = AnonymousClass0L7.LIVE_PERF_IMPROVEMENT_2_LAUNCHER;
                r94.A01 = ((Integer) AnonymousClass0L6.A02(r0, r114, "min_buffer_degraded_value", 1500, (AnonymousClass04H) null)).intValue();
                r94.A05 = ((Integer) AnonymousClass0L6.A02(r0, r114, "min_buffer_poor_value", 1250, (AnonymousClass04H) null)).intValue();
                r94.A04 = ((Integer) AnonymousClass0L6.A02(r0, r114, "min_buffer_moderate_value", 600, (AnonymousClass04H) null)).intValue();
                r94.A03 = ((Integer) AnonymousClass0L6.A02(r0, r114, "min_buffer_good_value", 500, (AnonymousClass04H) null)).intValue();
                r94.A02 = ((Integer) AnonymousClass0L6.A02(r0, r114, "min_buffer_excellent_value", 500, (AnonymousClass04H) null)).intValue();
                r7 = new C40111o6(r94);
            }
            if (!C40261oM.A00(r0).booleanValue() || !C40281oO.A00(r0).booleanValue()) {
                r3 = null;
            } else {
                C40101o5 r95 = new C40101o5();
                AnonymousClass0L7 r115 = AnonymousClass0L7.LIVE_PERF_IMPROVEMENT_2_LAUNCHER;
                r95.A06 = ((Boolean) AnonymousClass0L6.A02(r0, r115, "use_network_quality_for_rebuffer", (Object) null, (AnonymousClass04H) null)).booleanValue();
                Integer valueOf6 = Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                r95.A00 = ((Integer) AnonymousClass0L6.A02(r0, r115, "min_rebuffer_default_value", valueOf6, (AnonymousClass04H) null)).intValue();
                r95.A01 = ((Integer) AnonymousClass0L6.A02(r0, r115, "min_rebuffer_degraded_value", 3500, (AnonymousClass04H) null)).intValue();
                AnonymousClass0L7 r132 = AnonymousClass0L7.LIVE_PERF_IMPROVEMENT_2_LAUNCHER;
                r95.A05 = ((Integer) AnonymousClass0L6.A02(r0, r132, "min_rebuffer_poor_value", Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS), (AnonymousClass04H) null)).intValue();
                r95.A04 = ((Integer) AnonymousClass0L6.A02(r0, r132, "min_rebuffer_moderate_value", 3500, (AnonymousClass04H) null)).intValue();
                r95.A03 = ((Integer) AnonymousClass0L6.A02(r0, r132, "min_rebuffer_good_value", 3000, (AnonymousClass04H) null)).intValue();
                r95.A02 = ((Integer) AnonymousClass0L6.A02(r0, r132, "min_rebuffer_excellent_value", valueOf6, (AnonymousClass04H) null)).intValue();
                r3 = new C40111o6(r95);
            }
            if (r52 != null) {
                r1.A0O = r52;
            }
            if (r6 != null) {
                r1.A0P = r6;
            }
            if (r7 != null) {
                r1.A0M = r7;
            }
            if (r3 != null) {
                r1.A0N = r3;
            }
            r1.A1X = !((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.VIDEO_RETRY_LAUNCHER, "feature_enabled", (Object) null, (AnonymousClass04H) null)).booleanValue();
            A00 = new HeroPlayerSetting(r1);
        }
        return A00;
    }

    public static boolean A02(AnonymousClass0C1 r4) {
        return ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.TUNE_VIDEO_RELATED_PARAMS_LAUNCHER, "enable_codec_reuse", false, (AnonymousClass04H) null)).booleanValue();
    }

    public static String A01(Context context) {
        File A01 = C15020mC.A01(context, "", true);
        long A002 = C15020mC.A00(A01, 0.1f, 104857600);
        if (A002 <= 0) {
            A01 = C15020mC.A01(context, "", false);
            A002 = C15020mC.A00(A01, 0.1f, 104857600);
        }
        if (A002 <= 0) {
            AnonymousClass0QD.A01("IgExoVideoCache", "Couldn't create exo video cache");
        }
        return A01.getAbsolutePath();
    }
}
