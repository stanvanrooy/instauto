package p000X;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFD */
public final class AFD implements View.OnClickListener {
    public final /* synthetic */ SearchView A00;

    public AFD(SearchView searchView) {
        this.A00 = searchView;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        int A05 = AnonymousClass0Z0.A05(-1061994802);
        SearchView searchView = this.A00;
        if (view == searchView.A0U) {
            SearchView.A05(searchView, false);
            searchView.A0d.requestFocus();
            searchView.A0d.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.A04;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.A0S) {
            searchView.A0D();
        } else if (view == searchView.A0T) {
            searchView.A0E();
        } else if (view == searchView.A0V) {
            SearchableInfo searchableInfo = searchView.A02;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.A0Z);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            str4 = null;
                        } else {
                            str4 = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", str4);
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        Intent intent2 = searchView.A0Y;
                        ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                        Intent intent3 = new Intent("android.intent.action.SEARCH");
                        intent3.setComponent(searchActivity2);
                        Context context = searchView.getContext();
                        PendingIntent activity = PendingIntent.getActivity(context, 0, intent3, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
                        Bundle bundle = new Bundle();
                        Bundle bundle2 = searchView.A03;
                        if (bundle2 != null) {
                            bundle.putParcelable("app_data", bundle2);
                        }
                        Intent intent4 = new Intent(intent2);
                        int i = 1;
                        Resources resources = searchView.getResources();
                        if (searchableInfo.getVoiceLanguageModeId() != 0) {
                            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
                        } else {
                            str = "free_form";
                        }
                        String str5 = null;
                        if (searchableInfo.getVoicePromptTextId() != 0) {
                            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
                        } else {
                            str2 = null;
                        }
                        if (searchableInfo.getVoiceLanguageId() != 0) {
                            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
                        } else {
                            str3 = null;
                        }
                        if (searchableInfo.getVoiceMaxResults() != 0) {
                            i = searchableInfo.getVoiceMaxResults();
                        }
                        intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
                        intent4.putExtra("android.speech.extra.PROMPT", str2);
                        intent4.putExtra("android.speech.extra.LANGUAGE", str3);
                        intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                        if (searchActivity2 != null) {
                            str5 = searchActivity2.flattenToShortString();
                        }
                        intent4.putExtra("calling_package", str5);
                        intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                        intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                        searchView.getContext();
                        context.startActivity(intent4);
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        } else if (view == searchView.A0d) {
            searchView.A0G();
        }
        AnonymousClass0Z0.A0C(1206377867, A05);
    }
}
