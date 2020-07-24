package com.instagram.hashtag.p006ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.p009ui.widget.textview.UpdatableButton;
import p000X.Constants;
import p000X.AnonymousClass2PG;
import p000X.AnonymousClass6H0;
import p000X.C23244AEh;

/* renamed from: com.instagram.hashtag.ui.HashtagFollowButton */
public class HashtagFollowButton extends UpdatableButton {
    public String A00;
    public C23244AEh A01;

    public final void A00(Hashtag hashtag, AnonymousClass2PG r9) {
        Resources resources;
        int i;
        boolean equals = Constants.ONE.equals(hashtag.A00());
        C23244AEh aEh = this.A01;
        if (aEh != null) {
            aEh.B6S(hashtag);
        }
        String str = hashtag.A0A;
        setIsBlueButton(!equals);
        refreshDrawableState();
        setEnabled(true);
        if (equals) {
            resources = getContext().getResources();
            i = C0003R.string.following_button_following_voice;
        } else {
            resources = getContext().getResources();
            i = C0003R.string.following_button_follow_voice;
        }
        setContentDescription(resources.getString(i, new Object[]{str}));
        if (equals || TextUtils.isEmpty(this.A00)) {
            int i2 = C0003R.string.following_button_follow;
            if (equals) {
                i2 = C0003R.string.following_button_following;
            }
            setText(i2);
        } else {
            setText(this.A00);
        }
        setOnClickListener(new AnonymousClass6H0(this, equals, hashtag, r9));
    }

    public void setCustomFollowText(String str) {
        this.A00 = str;
    }

    public void setHashtagUpdateListener(C23244AEh aEh) {
        this.A01 = aEh;
    }

    public HashtagFollowButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
