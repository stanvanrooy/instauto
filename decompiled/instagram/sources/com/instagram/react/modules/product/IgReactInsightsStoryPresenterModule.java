package com.instagram.react.modules.product;

import android.app.Activity;
import com.facebook.fbreact.specs.NativeIGInsightsStoryPresenterReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.A1e;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass6KJ;
import p000X.C23173ABb;
import p000X.C23175ABd;

@ReactModule(name = "IGInsightsStoryPresenterReactModule")
public class IgReactInsightsStoryPresenterModule extends NativeIGInsightsStoryPresenterReactModuleSpec {
    public static final String MODULE_NAME = "IGInsightsStoryPresenterReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public static void logStoryPresenterError(String str) {
        AnonymousClass0QD.A0A("IgReactInsightsStoryPresenterModule", new IllegalArgumentException(str));
    }

    public static List parseMediaIDList(A1e a1e) {
        ArrayList arrayList = new ArrayList();
        Iterator it = a1e.toArrayList().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                arrayList.add((String) next);
            }
        }
        return arrayList;
    }

    private C23175ABd getStoriesReactFragment(String str) {
        Integer num;
        String str2;
        String str3;
        Activity currentActivity = getCurrentActivity();
        Integer[] A00 = Constants.ZERO(5);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                switch (num.intValue()) {
                    case 1:
                        str3 = "COMBINED_MEDIA_GRID";
                        break;
                    case 2:
                        str3 = "POST_GRID";
                        break;
                    case 3:
                        str3 = "STORY_GRID";
                        break;
                    case 4:
                        str3 = "TUTORIALS_HOME";
                        break;
                    default:
                        str3 = "ACCOUNT_INSIGHTS";
                        break;
                }
                if (!str3.equals(str)) {
                    i++;
                }
            } else {
                num = null;
            }
        }
        if (currentActivity == null || num == null) {
            str2 = "Story viewer activity can not be null for surface ";
        } else {
            AnonymousClass1HD A002 = AnonymousClass6KJ.A00(currentActivity, num);
            if (A002 instanceof C23175ABd) {
                return (C23175ABd) A002;
            }
            str2 = "Fragment must be StoriesReactFragment for surface ";
        }
        logStoryPresenterError(AnonymousClass000.A0E(str2, str));
        return null;
    }

    private void openStoryViewerForMedia(A1e a1e, String str, C23175ABd aBd, double d, AnonymousClass1OY r15) {
        List parseMediaIDList = parseMediaIDList(a1e);
        int indexOf = parseMediaIDList.indexOf(str);
        A44 reactApplicationContext = getReactApplicationContext();
        C23175ABd aBd2 = aBd;
        aBd.A02 = reactApplicationContext;
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.A02(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new C23173ABb(this, d, aBd2, parseMediaIDList, indexOf, r15));
        }
    }

    public void openStoryViewerForMediaIDs(A1e a1e, String str, double d, String str2) {
        C23175ABd storiesReactFragment = getStoriesReactFragment(str2);
        if (storiesReactFragment != null) {
            A1e a1e2 = a1e;
            openStoryViewerForMedia(a1e2, str, storiesReactFragment, d, AnonymousClass1OY.BUSINESS_INSIGHTS);
        }
    }

    public IgReactInsightsStoryPresenterModule(A44 a44) {
        super(a44);
    }
}
