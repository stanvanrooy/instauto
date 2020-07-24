package com.instagram.debug.devoptions.api;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass8GM;
import p000X.AnonymousClass8GN;
import p000X.C194318Tn;
import p000X.C22270y8;
import p000X.C22470yU;
import p000X.C52362Om;
import p000X.C53642Tq;

public class DeveloperOptionsLauncher {
    public static final String DEV_OPTIONS_PLUGIN_IMPL = "com.instagram.debug.devoptions.DeveloperOptionsPluginImpl";

    public static void launchDevoptionsMenu(FragmentActivity fragmentActivity, Bundle bundle, AnonymousClass0C1 r4) {
        try {
            DeveloperOptionsPlugin.sInstance = (DeveloperOptionsPlugin) Class.forName(DEV_OPTIONS_PLUGIN_IMPL).newInstance();
            if (bundle == null) {
                C52362Om r1 = new C52362Om(fragmentActivity, r4);
                r1.A0B = true;
                r1.A02 = DeveloperOptionsPlugin.sInstance.getDeveloperOptionsFragment();
                r1.A02();
                return;
            }
            C52362Om r12 = new C52362Om(fragmentActivity, r4);
            r12.A08(DeveloperOptionsPlugin.sInstance.getDeveloperOptionsFragment(), bundle);
            r12.A08 = false;
            C52362Om.A01(r12, Constants.ZERO);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    public static void launchMediaInjectionTool(final Context context, final FragmentActivity fragmentActivity, final AnonymousClass0C1 r7) {
        C22270y8 A01 = C22270y8.A01();
        AnonymousClass8GM r3 = new AnonymousClass8GM(C22470yU.DEVELOPER_OPTIONS);
        r3.A03 = Constants.ZERO;
        r3.A02 = new C194318Tn() {
            public void onFailure() {
                C53642Tq.A00(context, C0003R.string.dev_options_download_failed, 1).show();
            }

            public void onSuccess() {
                try {
                    DeveloperOptionsPlugin.sInstance = (DeveloperOptionsPlugin) Class.forName(DeveloperOptionsLauncher.DEV_OPTIONS_PLUGIN_IMPL).newInstance();
                    C52362Om r2 = new C52362Om(FragmentActivity.this, r7);
                    r2.A02 = DeveloperOptionsPlugin.sInstance.getInjectedMediaToolFragment();
                    r2.A02();
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        A01.A04(r7, new AnonymousClass8GN(r3));
    }

    public static void launchStoriesExperimentSwitcherTool(final Context context, final FragmentActivity fragmentActivity, final AnonymousClass0C1 r7) {
        C22270y8 A01 = C22270y8.A01();
        AnonymousClass8GM r3 = new AnonymousClass8GM(C22470yU.DEVELOPER_OPTIONS);
        r3.A03 = Constants.ZERO;
        r3.A02 = new C194318Tn() {
            public void onFailure() {
                C53642Tq.A00(context, C0003R.string.dev_options_download_failed, 1).show();
            }

            public void onSuccess() {
                try {
                    DeveloperOptionsPlugin.sInstance = (DeveloperOptionsPlugin) Class.forName(DeveloperOptionsLauncher.DEV_OPTIONS_PLUGIN_IMPL).newInstance();
                    C52362Om r2 = new C52362Om(FragmentActivity.this, r7);
                    r2.A02 = DeveloperOptionsPlugin.sInstance.getStoriesExperimentSwitcherToolFragment();
                    r2.A02();
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        A01.A04(r7, new AnonymousClass8GN(r3));
    }

    public static void launchStoryToolbarSwitcherTool(final Context context, final FragmentActivity fragmentActivity, final AnonymousClass0C1 r7) {
        C22270y8 A01 = C22270y8.A01();
        AnonymousClass8GM r3 = new AnonymousClass8GM(C22470yU.DEVELOPER_OPTIONS);
        r3.A03 = Constants.ZERO;
        r3.A02 = new C194318Tn() {
            public void onFailure() {
                C53642Tq.A00(context, C0003R.string.dev_options_download_failed, 1).show();
            }

            public void onSuccess() {
                try {
                    DeveloperOptionsPlugin.sInstance = (DeveloperOptionsPlugin) Class.forName(DeveloperOptionsLauncher.DEV_OPTIONS_PLUGIN_IMPL).newInstance();
                    C52362Om r2 = new C52362Om(FragmentActivity.this, r7);
                    r2.A02 = DeveloperOptionsPlugin.sInstance.getStoryToolbarSwitcherFragment();
                    r2.A02();
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        A01.A04(r7, new AnonymousClass8GN(r3));
    }

    public static void loadAndLaunchDeveloperOptions(final Context context, AnonymousClass1AM r6, final FragmentActivity fragmentActivity, final AnonymousClass0C1 r8, final Bundle bundle) {
        C22270y8 A01 = C22270y8.A01();
        AnonymousClass8GM r3 = new AnonymousClass8GM(C22470yU.DEVELOPER_OPTIONS);
        r3.A03 = Constants.ZERO;
        r3.A01 = r6;
        r3.A02 = new C194318Tn() {
            public void onFailure() {
                C53642Tq.A00(context, C0003R.string.dev_options_download_failed, 1).show();
            }

            public void onSuccess() {
                DeveloperOptionsLauncher.launchDevoptionsMenu(FragmentActivity.this, bundle, r8);
            }
        };
        A01.A04(r8, new AnonymousClass8GN(r3));
    }
}
