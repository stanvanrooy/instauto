package com.instagram.user.follow;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.textview.UpdatableButton;
import p000X.AnonymousClass1EM;
import p000X.C019000b;
import p000X.C13300iJ;
import p000X.C13390iS;
import p000X.C26771Ff;
import p000X.C43611ul;
import p000X.C43621um;
import p000X.C43631un;

public class FollowButton extends UpdatableButton {
    public int A00;
    public C43611ul A01;
    public C43631un A02;
    public int A03;
    public int A04;
    public int A05;
    public C43621um A06;
    public C43611ul A07;
    public boolean A08;
    public boolean A09;

    public final void A00(C13390iS r3) {
        int i;
        if (r3 == C13390iS.FollowStatusNotFollowing) {
            setIsBlueButton(true);
            i = this.A03;
            if (i == -1) {
                i = C0003R.color.white;
            }
        } else {
            if (r3 == C13390iS.FollowStatusFollowing || r3 == C13390iS.FollowStatusRequested) {
                setIsBlueButton(false);
                i = this.A03;
                if (i == -1) {
                    i = C0003R.color.igds_primary_text;
                }
            }
            refreshDrawableState();
        }
        this.A00 = i;
        refreshDrawableState();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r4 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        throw new java.lang.UnsupportedOperationException("Unhandled follow type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b6, code lost:
        if (r10.A0l() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fb, code lost:
        if (r10.A0l() == false) goto L_0x00fd;
     */
    public final void A01(C13300iJ r10, C13390iS r11) {
        C43611ul r0;
        boolean z;
        int i;
        boolean z2;
        Resources resources;
        int i2;
        boolean z3;
        String string;
        int i3;
        if (this.A06 == C43621um.CONDENSED) {
            r0 = C43611ul.SMALL;
        } else {
            r0 = this.A07;
        }
        this.A01 = r0;
        boolean A0e = r10.A0e();
        boolean z4 = true;
        boolean z5 = false;
        if (!A0e) {
            z5 = true;
        }
        if (r11 == C13390iS.FollowStatusFetching) {
            z4 = false;
        }
        setEnabled(z4);
        C43611ul r2 = this.A01;
        if (r2 == C43611ul.SMALL || r2 == C43611ul.ACTIONABLE_TEXT || r2 == C43611ul.INLINE_ICON) {
            z = true;
        }
        z = false;
        if (z) {
            switch (r11.ordinal()) {
                case 1:
                    i3 = r2.A02;
                    break;
                case 2:
                    i3 = r2.A00;
                    break;
                case 3:
                    i3 = r2.A01;
                    break;
                case 4:
                    i3 = r2.A03;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            setImageResource(i3);
            ColorFilter A002 = C26771Ff.A00(C019000b.A00(getContext(), this.A00));
            Drawable drawable = this.A01;
            if (drawable != null) {
                drawable.mutate().setColorFilter(A002);
            }
        } else {
            setImageResource(0);
        }
        boolean z6 = this.A08;
        boolean z7 = this.A09;
        if (!A0e) {
            switch (r11.ordinal()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = C0003R.string.following_button_loading;
                    break;
                case 2:
                    if (z6) {
                        z2 = true;
                        break;
                    }
                    z2 = false;
                    i = C0003R.string.following_button_follow;
                    if (z2) {
                        i = C0003R.string.following_button_follow_back;
                        break;
                    }
                    break;
                case 3:
                    i = C0003R.string.following_button_following;
                    if (z7) {
                        i = C0003R.string.following_button_message_option;
                        break;
                    }
                    break;
                case 4:
                    i = C0003R.string.following_button_requested;
                    break;
            }
        } else {
            i = C0003R.string.following_button_unblock;
        }
        if (i != 0) {
            Context context = getContext();
            String A0B = r10.A0B();
            if (!A0e) {
                switch (r11.ordinal()) {
                    case 1:
                        resources = context.getResources();
                        i2 = C0003R.string.following_button_loading_voice;
                    case 2:
                        if (z6) {
                            z3 = true;
                            break;
                        }
                        z3 = false;
                        if (z3) {
                            string = context.getResources().getString(C0003R.string.following_button_follow_back_voice);
                            break;
                        } else {
                            resources = context.getResources();
                            i2 = C0003R.string.following_button_follow_voice;
                        }
                    case 3:
                        if (z7) {
                            resources = context.getResources();
                            i2 = C0003R.string.following_button_message_option_voice;
                        } else {
                            resources = context.getResources();
                            i2 = C0003R.string.following_button_following_voice;
                        }
                        string = resources.getString(i2, new Object[]{A0B});
                        break;
                    case 4:
                        resources = context.getResources();
                        i2 = C0003R.string.following_button_requested_voice;
                        string = resources.getString(i2, new Object[]{A0B});
                        break;
                }
            } else {
                resources = context.getResources();
                i2 = C0003R.string.following_button_unblock_voice;
            }
            string = resources.getString(i2, new Object[]{A0B});
            setContentDescription(string);
        }
        int i4 = this.A04;
        if (i4 != -1) {
            setTextColor(C019000b.A00(getContext(), i4));
        }
        if (!this.A01.A04 || i == 0) {
            setText("");
        } else {
            setText(i);
        }
    }

    public C43631un getHelper() {
        return this.A02;
    }

    public void setBaseStyle(C43611ul r3) {
        this.A01 = r3;
        this.A07 = r3;
        boolean z = false;
        if (r3 == C43611ul.MESSAGE_OPTION) {
            z = true;
        }
        this.A09 = z;
    }

    public void setCustomForegroundColor(int i) {
        this.A04 = i;
        this.A03 = i;
    }

    public void setFollowButtonSize(C43621um r2) {
        int i;
        this.A06 = r2;
        if (r2 == C43621um.FULL) {
            i = this.A05;
        } else {
            i = 0;
        }
        setInnerSpacing(i);
    }

    private void setIsFollowButtonBlue(boolean z) {
        setIsBlueButton(z);
    }

    public void setShouldShowFollowBack(boolean z) {
        this.A08 = z;
    }

    public FollowButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public FollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C43611ul r0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1p, i, 0);
        String nonResourceString = obtainStyledAttributes.getNonResourceString(2);
        this.A03 = obtainStyledAttributes.getResourceId(0, -1);
        this.A04 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        this.A00 = C0003R.color.igds_primary_text;
        if ("large".equals(nonResourceString)) {
            r0 = C43611ul.LARGE;
        } else if ("medium".equals(nonResourceString)) {
            r0 = C43611ul.MEDIUM;
        } else if ("actionbaricon".equals(nonResourceString)) {
            r0 = C43611ul.ACTIONBARICON;
        } else if ("actionableText".equals(nonResourceString)) {
            r0 = C43611ul.ACTIONABLE_TEXT;
        } else if ("inlineIcon".equals(nonResourceString)) {
            r0 = C43611ul.INLINE_ICON;
        } else if ("messageOption".equals(nonResourceString)) {
            this.A01 = C43611ul.MESSAGE_OPTION;
            this.A09 = true;
            this.A07 = this.A01;
            this.A05 = this.A00;
            this.A06 = C43621um.FULL;
            C43631un r02 = new C43631un(this);
            this.A02 = r02;
            addOnAttachStateChangeListener(r02);
        } else {
            r0 = C43611ul.SMALL;
        }
        this.A01 = r0;
        this.A07 = this.A01;
        this.A05 = this.A00;
        this.A06 = C43621um.FULL;
        C43631un r022 = new C43631un(this);
        this.A02 = r022;
        addOnAttachStateChangeListener(r022);
    }
}
