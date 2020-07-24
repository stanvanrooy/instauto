package p000X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.13p  reason: invalid class name and case insensitive filesystem */
public final class C241813p {
    public static final C241913q A01 = new C241913q();
    public C156356m1 A00;

    public static void A00(Activity activity, AnonymousClass0C1 r4, String str) {
        Bundle bundle = new Bundle();
        C05230Is.A00(r4, bundle);
        AnonymousClass1BH.A03(new Intent((String) null).setClassName(activity, "com.instagram.modal.ModalActivity").putExtra("fragment_name", str).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle), activity);
    }

    public static void A01(C241813p r20, Activity activity, AnonymousClass0C1 r22, BugReportComposerViewModel bugReportComposerViewModel, String str, String str2) {
        HashMap hashMap;
        String str3;
        Activity activity2 = activity;
        Bitmap A002 = C146156Mq.A00(activity2);
        String str4 = null;
        String str5 = null;
        if (A002 != null) {
            AnonymousClass0C1 r14 = r22;
            C26441Dh.A00(r14).A02(activity2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String A04 = r14.A04();
            HashMap hashMap2 = new HashMap();
            Iterator it = ((C73853Lo) r14.AVA(C73853Lo.class, new C73863Lp())).A00.iterator();
            while (it.hasNext()) {
                C89833uw r0 = (C89833uw) ((WeakReference) it.next()).get();
                if (r0 == null) {
                    it.remove();
                } else {
                    C66112uw r2 = r0.A0V;
                    if (r2 != null) {
                        hashMap = new HashMap(1);
                        if (r2.Afz()) {
                            str3 = "yes";
                        } else {
                            str3 = "no";
                        }
                        hashMap.put("reported-from-interop", str3);
                    } else {
                        hashMap = null;
                    }
                    if (hashMap != null) {
                        hashMap2.putAll(hashMap);
                    }
                }
            }
            if (str != null) {
                str4 = str;
            }
            if (str2 != null) {
                str5 = str2;
            }
            C156356m1 r13 = new C156356m1(r14, activity2, new BugReport((String) null, arrayList, arrayList2, str5, (String) null, A04, str4, "rage_shake", hashMap2, (String) null), A002, (String) null, bugReportComposerViewModel);
            r20.A00 = r13;
            r13.A04(new Void[0]);
            return;
        }
        AnonymousClass5F9.A00(activity2, C0003R.string.bugreporter_low_memory_screenshot_error);
    }

    public static void A02(AnonymousClass0C1 r2, Activity activity, AnonymousClass1HD r4) {
        C52362Om r1 = new C52362Om((FragmentActivity) activity, r2);
        r1.A02 = r4;
        r1.A00 = C0003R.C0005id.layout_container_main;
        r1.A02();
    }

    public static CharSequence[] A05(Activity activity, AnonymousClass0C1 r6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(activity.getString(C0003R.string.rageshake_bug_report_option));
        arrayList.add(activity.getString(C0003R.string.rageshake_video_quality_issue));
        if (C14090jk.A00(r6)) {
            arrayList.add(activity.getString(C0003R.string.rageshake_developer_page_option));
            arrayList.add(activity.getString(C0003R.string.dev_options_sandbox_selector));
        }
        if (C14090jk.A01(r6) && !A04(activity)) {
            arrayList.add(activity.getString(C0003R.string.bloks_shell));
        }
        if (C14090jk.A01(r6) && !A04(activity) && ((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.IN_APP_ADMIN, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            arrayList.add(activity.getString(C0003R.string.admin_tool));
        }
        if (!C14090jk.A00(r6)) {
            arrayList.add(activity.getString(C0003R.string.rageshake_disable_option));
        }
        if (activity.getPackageName().equals("com.instagram.sandbox")) {
            arrayList.add(activity.getString(C0003R.string.rageshake_sandbox_menu_option));
        }
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        arrayList.toArray(charSequenceArr);
        return charSequenceArr;
    }

    public static void A03(AnonymousClass0C1 r1, Activity activity, String str) {
        try {
            A02(r1, activity, (AnonymousClass1HD) Class.forName(str).newInstance());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean A04(Activity activity) {
        if (activity.findViewById(C0003R.C0005id.layout_container_main) == null) {
            return true;
        }
        return false;
    }
}
