package com.instagram.business.instantexperiences.p028ui;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p000X.AV6;
import p000X.AnonymousClass0C1;
import p000X.C25115B1l;
import p000X.C25118B1p;
import p000X.C25128B2e;

/* renamed from: com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome */
public class InstantExperiencesBrowserChrome extends LinearLayout {
    public Context A00;
    public FrameLayout A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public C25128B2e A07;
    public C25115B1l A08;
    public AnonymousClass0C1 A09;
    public Executor A0A;
    public final DialogInterface.OnClickListener A0B = new C25118B1p(this);

    public static CharSequence[] getMenuOptions(InstantExperiencesBrowserChrome instantExperiencesBrowserChrome) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        Context context = instantExperiencesBrowserChrome.getContext();
        arrayList.add(context.getString(C0003R.string.instant_experiences_refresh));
        instantExperiencesBrowserChrome.getContext();
        arrayList.add(context.getString(C0003R.string.instant_experiences_copy_link));
        Uri parse = Uri.parse(((AV6) instantExperiencesBrowserChrome.A08.A0D.peek()).getUrl());
        if (parse == null || (!"http".equals(parse.getScheme()) && !"https".equals(parse.getScheme()))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            instantExperiencesBrowserChrome.getContext();
            arrayList.add(context.getString(C0003R.string.instant_experiences_open_with));
        }
        instantExperiencesBrowserChrome.getContext();
        arrayList.add(context.getString(C0003R.string.instant_experiences_clear_autofill));
        return (CharSequence[]) arrayList.toArray(charSequenceArr);
    }

    public void setInstantExperiencesBrowserChromeListener(C25128B2e b2e) {
        this.A07 = b2e;
    }

    public InstantExperiencesBrowserChrome(Context context) {
        super(context);
    }

    public InstantExperiencesBrowserChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = context;
    }
}
