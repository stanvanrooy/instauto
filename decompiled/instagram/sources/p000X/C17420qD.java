package p000X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.modal.ModalActivity;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.0qD  reason: invalid class name and case insensitive filesystem */
public final class C17420qD extends C17430qE {
    public AnonymousClass8W6 A00;

    public final void A08(String str, String str2, AnonymousClass0C1 r11, C27371Ho r12, String str3, Context context, boolean z, C195198Xb r16) {
        String str4 = str2;
        String str5 = str;
        C195198Xb r7 = r16;
        AnonymousClass0C1 r4 = r11;
        String str6 = str3;
        C27371Ho r5 = r12;
        if (z) {
            AnonymousClass8XW.A00(context, new AnonymousClass8XZ(this, str5, str4, r4, r5, str6, r7));
            return;
        }
        C194598Us.A0E(str, str2, r11, r12, str3);
        r7.BTO();
    }

    public static void A00(FragmentActivity fragmentActivity, AnonymousClass0C1 r7, SavedCollection savedCollection, AnonymousClass0RN r9) {
        AnonymousClass1HD A002 = C17430qE.A00.A02().A00(r7.getToken(), AnonymousClass75Q.COLLECTION_FEED, savedCollection, r9.getModuleName(), false);
        C52362Om r1 = new C52362Om(fragmentActivity, r7);
        r1.A0B = true;
        r1.A02 = A002;
        r1.A06 = "DELETE_COLLECTION_BACK_STACK_NAME";
        r1.A04 = "DELETE_COLLECTION_BACK_STACK_NAME";
        r1.A02();
    }

    public static void A01(FragmentActivity fragmentActivity, AnonymousClass0C1 r7, SavedCollection savedCollection, AnonymousClass0RN r9) {
        C17430qE.A00.A02();
        String token = r7.getToken();
        AnonymousClass75Q r4 = AnonymousClass75Q.COLLECTION_FEED;
        String moduleName = r9.getModuleName();
        AnonymousClass8V9 r2 = new AnonymousClass8V9();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
        bundle.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", r4);
        bundle.putParcelable("SaveFragment.SAVE_HOME_COLLECTION", savedCollection);
        bundle.putString("prior_module", moduleName);
        r2.setArguments(bundle);
        C52362Om r1 = new C52362Om(fragmentActivity, r7);
        r1.A0B = true;
        r1.A02 = r2;
        r1.A06 = "DELETE_COLLECTION_BACK_STACK_NAME";
        r1.A04 = "DELETE_COLLECTION_BACK_STACK_NAME";
        r1.A02();
    }

    public final AnonymousClass8W6 A02() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass8W6();
        }
        return this.A00;
    }

    public final void A03(FragmentActivity fragmentActivity, AnonymousClass0C1 r4) {
        C52362Om r1 = new C52362Om(fragmentActivity, r4);
        C17430qE.A00.A02();
        r1.A02 = new AnonymousClass8Yu();
        r1.A02();
    }

    public final void A04(FragmentActivity fragmentActivity, AnonymousClass0C1 r6, SavedCollection savedCollection, AnonymousClass0RN r8) {
        AnonymousClass0L7 r3;
        boolean z;
        String str;
        switch (savedCollection.A01.ordinal()) {
            case 0:
                r3 = AnonymousClass0L7.SAVE_CONTENT_TYPE_AGNOSTIC_COLLECTIONS_ECOSYSTEM;
                z = false;
                str = "is_all_saved_tabbed_enabled";
                break;
            case 1:
                AnonymousClass1HD A08 = C17510qM.A00.A0V().A08((String) null, r8.getModuleName());
                C52362Om r0 = new C52362Om(fragmentActivity, r6);
                r0.A02 = A08;
                r0.A06 = "DELETE_COLLECTION_BACK_STACK_NAME";
                r0.A04 = "DELETE_COLLECTION_BACK_STACK_NAME";
                r0.A02();
                return;
            default:
                r3 = AnonymousClass0L7.SAVE_CONTENT_TYPE_AGNOSTIC_COLLECTIONS_ECOSYSTEM;
                z = false;
                str = "is_user_collection_tabbed_enabled";
                break;
        }
        if (((Boolean) AnonymousClass0L6.A02(r6, r3, str, z, (AnonymousClass04H) null)).booleanValue()) {
            A01(fragmentActivity, r6, savedCollection, r8);
        } else {
            A00(fragmentActivity, r6, savedCollection, r8);
        }
    }

    public final void A05(FragmentActivity fragmentActivity, AnonymousClass0C1 r4, String str, String str2) {
        AnonymousClass1HD A08 = C17510qM.A00.A0V().A08(str, str2);
        C52362Om r0 = new C52362Om(fragmentActivity, r4);
        r0.A02 = A08;
        r0.A02();
    }

    public final void A06(FragmentActivity fragmentActivity, AnonymousClass0C1 r8, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("shopping_session_id", str);
        bundle.putString("prior_module_name", str2);
        new C59032gv(r8, ModalActivity.class, "saved_products_feed", bundle, fragmentActivity).A06(fragmentActivity);
    }

    public final void A07(C27371Ho r15, AnonymousClass1HD r16, AnonymousClass1AM r17, AnonymousClass0C1 r18, AnonymousClass1I6 r19, AnonymousClass1NJ r20, C36841ih r21, int i, String str, String str2, C38691lg r25) {
        String AVo;
        AnonymousClass1AM r3 = r17;
        C27371Ho r1 = r15;
        AnonymousClass1HD r2 = r16;
        AnonymousClass8ZW r0 = new AnonymousClass8ZW(r1, r2, r3, r18, r19);
        AnonymousClass2TH r22 = new AnonymousClass2TH(r0.A02);
        r22.A0L = r0.A00.getString(C0003R.string.save_to);
        r22.A0H = r25;
        AnonymousClass2TI A002 = r22.A00();
        AnonymousClass2TI r9 = A002;
        C17430qE.A00.A02();
        AnonymousClass1I6 r7 = r0.A03;
        String token = r0.A02.getToken();
        AnonymousClass1NJ r10 = r20;
        SaveToCollectionsParentInsightsHost A01 = AnonymousClass8ZW.A01(r0, r10);
        C195478Yd r23 = new C195478Yd();
        Bundle bundle = new Bundle();
        bundle.putSerializable("SaveToCollectionFragment.ARGS_SELECTION_MODE", AnonymousClass8WY.SAVE_TO);
        bundle.putString("SaveToCollectionFragment.ARGS_MEDIA_ID", r10.getId());
        C36841ih r11 = r21;
        bundle.putInt("SaveToCollectionFragment.ARGS_CAROUSEL_INDEX", r11.AHt());
        int i2 = i;
        bundle.putInt("SaveToCollectionFragment.ARGS_POSITION", i2);
        bundle.putString("SaveToCollectionFragment.ARGS_COLLECTION_ID_VIEWING", str);
        if (r7 == null) {
            AVo = null;
        } else {
            AVo = r7.AVo();
        }
        bundle.putString("SaveToCollectionFragment.ARGS_SESSION_ID", AVo);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
        String str3 = str2;
        bundle.putString("SaveToCollectionFragment.ARGS_NAVIGATION_TYPE", str3);
        bundle.putParcelable("SaveToCollectionFragment.ARGS_PARENT_MODULE", A01);
        r23.setArguments(bundle);
        r23.A05 = new C195718Zc(r0, r9, r10, r11, i2, str3);
        A002.A01(r0.A00.getActivity(), r23);
    }
}
