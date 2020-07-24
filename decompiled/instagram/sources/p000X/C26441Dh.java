package p000X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.appstatelogger.AppState;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Dh  reason: invalid class name and case insensitive filesystem */
public final class C26441Dh implements C06570Po, C06580Pp {
    public long A00;
    public C51752Lz A01;
    public C51752Lz A02;
    public AnonymousClass0P4 A03;
    public String A04;
    public String A05;
    public int A06 = 0;
    public final Map A07 = new HashMap();
    public final Set A08 = new HashSet();
    public final Set A09 = new HashSet();
    public final Context A0A = StoredPreferences.A00;
    public final AnonymousClass1BC A0B = AnonymousClass1BC.A02;
    public final C06590Pq A0C;

    public final void A07(AnonymousClass0RN r2, int i, String str) {
        A08(r2, i, str, (C52912Qs) null);
    }

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C26441Dh A00(C06590Pq r2) {
        return (C26441Dh) r2.AVA(C26441Dh.class, new C26451Di(r2));
    }

    public static C06170Oa A01(C26441Dh r6, String str) {
        AnonymousClass1dL r0 = (AnonymousClass1dL) r6.A07.get(str);
        if (r0 == null) {
            return null;
        }
        C06170Oa A002 = C06170Oa.A00();
        LinkedList linkedList = r0.A01;
        for (int i = 0; i < linkedList.size(); i++) {
            C06270Ok A003 = C06270Ok.A00();
            for (Map.Entry entry : ((Map) linkedList.get(i)).entrySet()) {
                if (!((String) entry.getKey()).equals("instance_id")) {
                    A003.A09((String) entry.getKey(), (String) entry.getValue());
                }
            }
            A002.A00.add(A003);
        }
        return A002;
    }

    public final void A02(Activity activity) {
        A03(activity, "button");
    }

    public final void A05(AnonymousClass0RN r3) {
        this.A08.add(Integer.valueOf(System.identityHashCode(r3)));
    }

    public final void A09(AnonymousClass0RN r6, Activity activity) {
        boolean z;
        AnonymousClass1dL r4;
        Set set = this.A08;
        Integer valueOf = Integer.valueOf(System.identityHashCode(r6));
        if (set.contains(valueOf)) {
            this.A08.remove(valueOf);
            z = true;
        } else {
            z = false;
        }
        if (!z && (r4 = (AnonymousClass1dL) this.A07.get(activity.toString())) != null) {
            boolean z2 = true;
            if (!r4.A01.isEmpty()) {
                Map map = (Map) r4.A01.getLast();
                if (!AnonymousClass1dL.A01(map, r6)) {
                    Iterator it = r4.A01.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AnonymousClass1dL.A01((Map) it.next(), r6)) {
                                it.remove();
                                r4.A00--;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2) {
                        AnonymousClass0QD.A02("mismatch_nav", AnonymousClass000.A0N("Expected module: ", (String) map.get("module"), ", current module: ", r6.getModuleName()));
                    }
                    boolean isActive = BreakpadManager.isActive();
                }
                r4.A01.removeLast();
            }
            r4.A00--;
            boolean isActive2 = BreakpadManager.isActive();
        }
    }

    public final void A0A(AnonymousClass0RN r3, String str, String str2, Activity activity) {
        AnonymousClass1dL r1 = (AnonymousClass1dL) this.A07.get(activity.toString());
        if (r1 != null && !r1.A01.isEmpty()) {
            Map map = (Map) r1.A01.getLast();
            if (AnonymousClass1dL.A01(map, r3)) {
                map.put(str, str2);
            }
        }
    }

    public C26441Dh(C06590Pq r2) {
        this.A0C = r2;
    }

    public final void A03(Activity activity, String str) {
        AnonymousClass1AM r0;
        AnonymousClass0RN A002 = C55262aK.A00(activity);
        if (A002 != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            if (!(fragmentActivity instanceof AnonymousClass1D3) || (r0 = ((AnonymousClass1D3) fragmentActivity).AJb()) == null) {
                r0 = fragmentActivity.A05();
            }
            A07(A002, r0.A0I(), str);
        }
    }

    public final void A04(Activity activity, String str, C52912Qs r5) {
        AnonymousClass0RN A002 = C55262aK.A00(activity);
        if (A002 != null) {
            A08(A002, ((FragmentActivity) activity).A05().A0I(), str, r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03e7, code lost:
        if ((!r9.A01.A01.isEmpty()) != false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0166, code lost:
        if (r0.equals(r12) != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017b, code lost:
        if ("up".equals(r12) != false) goto L_0x017d;
     */
    public final void A06(AnonymousClass0RN r15) {
        String str;
        C215739Ro r4;
        AnonymousClass00B r3;
        Map BYU;
        String AZc;
        boolean z;
        AnonymousClass2LU r0;
        AnonymousClass2LU r9;
        boolean z2;
        boolean contains;
        boolean z3;
        String str2;
        C12670hC.A02();
        if (!this.A09.contains(r15.getModuleName())) {
            AnonymousClass0P4 r02 = this.A03;
            if (r02 != null) {
                str = r02.A03;
                long now = AwakeTimeSinceBootClock.INSTANCE.now() - this.A00;
                String moduleName = r15.getModuleName();
                C11150eV.A00(C11130eT.A01.A00, new C33661dH(moduleName));
                this.A0B.A01(r15, str, this.A03.A06.A01("click_point"));
                boolean z4 = false;
                if (AnonymousClass09Q.A0W != null) {
                    z4 = true;
                }
                if (z4) {
                    String moduleName2 = r15.getModuleName();
                    synchronized (AnonymousClass09Q.A0X) {
                        try {
                            if (AnonymousClass09Q.A0W == null) {
                                AnonymousClass0DB.A0E("AppStateLoggerCore", "AppStateLogger is not ready yet");
                            } else {
                                AnonymousClass09Q r10 = AnonymousClass09Q.A0W;
                                AppState appState = r10.A08;
                                if (moduleName2 == null) {
                                    moduleName2 = "";
                                }
                                if (!moduleName2.equals(appState.A0N)) {
                                    appState.A0N = moduleName2;
                                    appState.A08 = SystemClock.uptimeMillis();
                                }
                                if (!"".equals(appState.A0I)) {
                                    appState.A0I = "";
                                }
                                String A0E = AnonymousClass000.A0E("@", moduleName2.replace(',', '_'));
                                synchronized (r10.A0H) {
                                    try {
                                        if (r10.A0I.add(A0E)) {
                                            StringBuilder sb = r10.A0H;
                                            sb.append(A0E);
                                            sb.append(',');
                                            r10.A08.A0K = sb.substring(0, sb.length() - 1);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                                if (BreakpadManager.isActive()) {
                                    BreakpadManager.setCustomData("navigation_module", moduleName2, new Object[0]);
                                    BreakpadManager.setCustomData("endpoint", appState.A00(), new Object[0]);
                                }
                                AnonymousClass09Q r2 = AnonymousClass09Q.A0W;
                                C026403i r92 = r2.A09;
                                ActivityManager activityManager = r2.A06;
                                boolean z5 = false;
                                if (activityManager != null) {
                                    activityManager.getMemoryInfo(r2.A05);
                                    ActivityManager.MemoryInfo memoryInfo = r2.A05;
                                    if (memoryInfo.lowMemory || memoryInfo.availMem < 157286400) {
                                        z5 = true;
                                    }
                                }
                                r92.A07(z5, false);
                                if (BreakpadManager.isActive()) {
                                    AnonymousClass09Q r22 = AnonymousClass09Q.A0W;
                                    ActivityManager activityManager2 = r22.A06;
                                    boolean z6 = false;
                                    if (activityManager2 != null) {
                                        activityManager2.getMemoryInfo(r22.A05);
                                        ActivityManager.MemoryInfo memoryInfo2 = r22.A05;
                                        if (memoryInfo2.availMem < memoryInfo2.threshold) {
                                            z6 = true;
                                        }
                                    }
                                    BreakpadManager.setCustomData("no_device_memory", Boolean.toString(z6), new Object[0]);
                                }
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                            }
                        }
                    }
                }
                C33671dI r1 = C33671dI.A02;
                if (r1 != null) {
                    r1.A00(r15.getModuleName());
                }
                if (str != null) {
                    if (C22900zC.A00) {
                        r0 = AnonymousClass2LT.A00;
                        r9 = r0;
                    } else {
                        r0 = null;
                        r9 = null;
                    }
                    if (r0 != null) {
                        C06590Pq r32 = this.A0C;
                        String A012 = this.A03.A06.A01("click_point");
                        String moduleName3 = r15.getModuleName();
                        boolean z7 = false;
                        if (A012 != null) {
                            if (!"explore_topic_load".equals(A012)) {
                                if (AnonymousClass1DW.A00(Constants.A0C).equals(moduleName3)) {
                                    if (!"newsfeed_following".equals(A012)) {
                                        str2 = "newsfeed_you";
                                    }
                                } else if (AnonymousClass1DW.A00(Constants.A0N).equals(moduleName3) || AnonymousClass1DW.A00(Constants.A0Y).equals(moduleName3)) {
                                    if (!"user_detail_grid".equals(A012) && !"user_detail_list".equals(A012) && !"favorites".equals(A012) && !"photos_of_you".equals(A012)) {
                                        str2 = "internal_tab";
                                    }
                                } else if ("blended_search".equals(moduleName3) || "search_users".equals(moduleName3) || "search_tags".equals(moduleName3) || "search_places".equals(moduleName3)) {
                                    z7 = "button".equals(A012);
                                }
                            }
                            z7 = true;
                        }
                        if (!z7) {
                            if (!"back".equals(A012)) {
                                z2 = false;
                            }
                            z2 = true;
                            if (z2) {
                                AnonymousClass2LV r23 = r9.A01;
                                String A0E2 = AnonymousClass000.A0E(r15.getModuleName(), ":");
                                int size = r23.A01.size();
                                int i = size - 2;
                                while (true) {
                                    if (i > -1) {
                                        if (((String) r23.A01.get(i)).startsWith(A0E2)) {
                                            break;
                                        }
                                        i--;
                                    } else {
                                        i = -1;
                                        break;
                                    }
                                }
                                if (i < 0) {
                                    z3 = false;
                                } else {
                                    r23.A01.subList(i + 1, size).clear();
                                    AnonymousClass2LV.A00(r23);
                                    z3 = true;
                                }
                                if (!z3) {
                                    AnonymousClass2LV r24 = r9.A01;
                                    int size2 = r24.A01.size();
                                    if (size2 != 0) {
                                        r24.A01.remove(size2 - 1);
                                        AnonymousClass2LV.A00(r24);
                                    }
                                }
                                if (!(!r9.A01.A01.isEmpty())) {
                                    r9.A03.remove(r9.A02);
                                    Iterator it = r9.A03.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (!it.hasNext()) {
                                            AnonymousClass2LU.A01(r9, (String) entry.getKey());
                                            AnonymousClass2LU.A00(r9, r32, r15);
                                        }
                                    }
                                }
                            } else {
                                if ("cold start".equals(A012)) {
                                    r9.A03.clear();
                                    AnonymousClass2LU.A01(r9, AnonymousClass2LU.A06);
                                } else {
                                    if (A012 == null) {
                                        contains = false;
                                    } else {
                                        contains = r9.A04.contains(A012);
                                    }
                                    if (contains) {
                                        AnonymousClass2LU.A01(r9, A012);
                                    }
                                }
                                AnonymousClass2LV r25 = r9.A01;
                                String moduleName4 = r15.getModuleName();
                                int i2 = r9.A00 + 1;
                                r9.A00 = i2;
                                r25.A01.add(String.format(Locale.US, "%s:%d", new Object[]{moduleName4, Integer.valueOf(i2)}));
                                AnonymousClass2LV.A00(r25);
                                AnonymousClass2LU.A00(r9, r32, r15);
                            }
                            AnonymousClass2LU.A00(r9, r32, r15);
                        }
                    }
                }
                AnonymousClass0P4 r26 = this.A03;
                r26.A0G("source_module", str);
                r26.A0G("dest_module", r15.getModuleName());
                r26.A0E("seq", Integer.valueOf(this.A06));
                r26.A0F("nav_time_taken", Long.valueOf(now));
                C33681dJ A002 = C33681dJ.A00();
                C33691dK r27 = new C33691dK();
                r27.A07 = str;
                r27.A06 = r15.getModuleName();
                r27.A01 = now;
                AnonymousClass0P4 r42 = this.A03;
                r27.A03 = r42.A06;
                r27.A08 = r42.A07;
                r27.A02 = r42.A00;
                r27.A05 = r42.A02;
                r27.A0A = this.A0C.AgN();
                r27.A04 = r42.A01;
                r27.A09 = r42.A05;
                C30761DjI djI = A002.A00;
                if (djI != null) {
                    djI.onNavEvent(r27);
                }
                String A013 = this.A03.A06.A01("click_point");
                C33501d1 A003 = C33501d1.A00(this.A0C);
                C215739Ro r03 = A003.A01;
                if (r03 == null || !C33501d1.A03(A003, r03.A00)) {
                    C33501d1.A02(A003, false);
                    r4 = null;
                } else {
                    if (A013 == null || (!A013.equals("back") && !A013.equals("cold start") && !A013.equals("warm start") && !A013.equals("internal_tab"))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        r4 = null;
                    } else {
                        r4 = A003.A01;
                        A003.A01 = null;
                    }
                }
                if (r4 != null) {
                    this.A03.A0G("event_trace_id", r4.A03);
                    this.A03.A0I("tracking", r4.A04);
                    String str3 = C33501d1.A00(this.A0C).A04;
                    if ((r15 instanceof AnonymousClass0RB) && (AZc = ((AnonymousClass0RB) r15).AZc()) != null) {
                        str3 = AZc;
                    }
                    this.A03.A0H("dest_module_uri", str3);
                    this.A03.A09("tracking_nodes", r4.A02);
                }
                if ((r15 instanceof AnonymousClass0RC) && (BYU = ((AnonymousClass0RC) r15).BYU()) != null) {
                    for (Map.Entry entry2 : BYU.entrySet()) {
                        this.A03.A0G((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                C12670hC.A02();
                this.A06++;
                if (r4 == null || !r4.A01.A03) {
                    AnonymousClass0WN.A01(this.A0C).BcG(this.A03);
                } else {
                    AnonymousClass0WN.A01(this.A0C).BdB(this.A03);
                }
                if (AnonymousClass19Q.A01 == null) {
                    AnonymousClass19Q.A01 = new AnonymousClass19Q();
                }
                AnonymousClass19Q r04 = AnonymousClass19Q.A01;
                String moduleName5 = r15.getModuleName();
                String str4 = str;
                if (r04.A00 && (r3 = AnonymousClass00B.A01) != null) {
                    if (str == null) {
                        str4 = "missing_info";
                    }
                    if (moduleName5 == null) {
                        moduleName5 = "missing_info";
                    }
                    if (r3.isMarkerOn(25952257)) {
                        r3.markerAnnotate(25952257, 0, "next_module", moduleName5);
                        r3.markerEnd(25952257, 0, 2);
                    }
                    r3.markerStart(25952257);
                    r3.markerAnnotate(25952257, 0, "previous_module", str4);
                    r3.markerAnnotate(25952257, 0, "current_module", moduleName5);
                }
                this.A05 = r15.getModuleName();
                C11130eT.A01.BXT(new AnonymousClass1FF(str, r15.getModuleName(), this.A00));
            } else {
                str = null;
            }
            this.A03 = null;
            C51752Lz r12 = this.A01;
            if (r12 != null) {
                this.A02 = r12;
                r12.A00 = r15.getModuleName();
                this.A01 = null;
            }
            Set set = this.A08;
            Integer valueOf = Integer.valueOf(System.identityHashCode(r15));
            if (set.contains(valueOf)) {
                this.A08.remove(valueOf);
                AnonymousClass1dL r33 = (AnonymousClass1dL) this.A07.get(this.A04);
                if (r33 == null) {
                    r33 = new AnonymousClass1dL();
                    this.A07.put(this.A04, r33);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str == null) {
                    Map map = (Map) r33.A01.peekLast();
                    if (map != null) {
                        str = (String) map.get("module");
                    } else {
                        str = null;
                    }
                }
                AnonymousClass1dL.A00(r15, str, linkedHashMap);
                r33.A01.add(linkedHashMap);
                while (r33.A01.size() > 10) {
                    r33.A01.removeFirst();
                }
                r33.A00++;
                boolean isActive = BreakpadManager.isActive();
            } else {
                AnonymousClass1dL r13 = (AnonymousClass1dL) this.A07.get(this.A04);
                if (r13 != null && !r13.A01.isEmpty()) {
                    Map map2 = (Map) r13.A01.getLast();
                    if (AnonymousClass1dL.A01(map2, r15)) {
                        map2.clear();
                        AnonymousClass1dL.A00(r15, (String) map2.get("source_module"), map2);
                    }
                }
            }
            C32991cC A004 = C32991cC.A00(this.A0C);
            long intValue = (long) ((Integer) AnonymousClass0L6.A00(A004.A01, AnonymousClass0L7.AL_CLEAN_LOG_CONTEXT_ON_NAV, "clear_registry_on_nav_delay_time_in_ms", 1000, (AnonymousClass04H) null)).intValue();
            if (intValue > 0) {
                AnonymousClass0ZA.A09(A004.A04, new C33701dM(A004), intValue, 103115286);
            } else {
                A004.A02();
            }
        }
    }

    public final void A08(AnonymousClass0RN r4, int i, String str, C52912Qs r7) {
        C12670hC.A02();
        if (TextUtils.isEmpty(str)) {
            str = "button";
        }
        this.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("navigation", r4);
        A002.A0G("click_point", str);
        A002.A0E("nav_depth", Integer.valueOf(i));
        this.A03 = A002;
        this.A01 = new C51752Lz(r4, this.A00, str);
        if (r7 != null) {
            r7.A36(this.A03);
        }
    }
}
