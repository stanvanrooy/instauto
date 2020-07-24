package p000X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.1Od  reason: invalid class name and case insensitive filesystem */
public final class C28981Od implements C28991Oe, C29001Of {
    public int A00 = 0;
    public int A01 = -1;
    public int A02;
    public String A03;
    public final AnonymousClass1HD A04;
    public final C23300zv A05;
    public final C27361Hn A06;
    public final AnonymousClass0C1 A07;
    public final C27371Ho A08;

    public final void B4E(AnonymousClass1NJ r6, C36841ih r7, C30941Vv r8) {
        AnonymousClass1HD r1 = this.A04;
        if (r1.getActivity() != null) {
            View view = r1.mView;
            if (view != null) {
                C06220Of.A0E(view);
            }
            String APo = r6.APo();
            this.A03 = APo;
            C16980pU.A00.A00();
            AnonymousClass6PK r4 = new AnonymousClass6PK(this.A07, this.A08, APo, "main_feed");
            r4.A00.putString("CommentComposerModalFragment.DRAFT_COMMENT", r8.A02);
            r4.A00.putBoolean("CommentThreadFragment.INTENT_EXTRA_MEDIA_IS_CAROUSEL_BUMPED_POST", r7.A0m);
            r4.A00.putInt("CommentThreadFragment.MEDIA_POSITION_IN_FEED", r7.getPosition());
            r4.A00.putInt("CommentThreadFragment.MEDIA_CAROUSEL_INDEX", r7.AHt());
            r4.A00.putBoolean("intent_extra_show_keyboard_delayed_on_open", true);
            C31221Wz A012 = C31201Wx.A01(this.A04.getContext());
            A012.A05(new C60972ku(true, true, false));
            AnonymousClass6PI r12 = new AnonymousClass6PI();
            r12.setArguments(r4.A00);
            A012.A0F(r12);
        }
    }

    public final void B7V(AnonymousClass1NJ r8, C36841ih r9) {
        String str;
        AnonymousClass1HD r1 = this.A04;
        if (r1.getActivity() != null) {
            View view = r1.mView;
            if (view != null) {
                C06220Of.A0E(view);
            }
            this.A03 = r8.APo();
            C67072wY A002 = C67052wW.A00(this.A07).A00(r8);
            if (A002 != null && A002.A00 == null && ((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.INTERACTIONS_DRAFT_COMMENT_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                str = A002.A01;
            } else if (!TextUtils.isEmpty(r9.A0O)) {
                str = r9.A0O;
            } else {
                str = "";
            }
            C31221Wz A012 = C31201Wx.A01(this.A04.getContext());
            A012.A07(new C149716ap(this));
            A012.A05(new C60972ku(true, true, false));
            C16980pU.A00.A00();
            AnonymousClass6PK r4 = new AnonymousClass6PK(this.A07, this.A08, r8.APo(), "main_feed");
            r4.A00.putString("CommentComposerModalFragment.DRAFT_COMMENT", str);
            r4.A00.putBoolean("CommentThreadFragment.INTENT_EXTRA_MEDIA_IS_CAROUSEL_BUMPED_POST", r9.A0m);
            r4.A00.putInt("CommentThreadFragment.MEDIA_POSITION_IN_FEED", r9.getPosition());
            r4.A00.putInt("CommentThreadFragment.MEDIA_CAROUSEL_INDEX", r9.AHt());
            AnonymousClass6PI r12 = new AnonymousClass6PI();
            r12.setArguments(r4.A00);
            A012.A0F(r12);
            this.A05.A04(new C149706ao(true));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    public final void B8g(int i, boolean z) {
        int i2;
        AnonymousClass1NJ r0;
        this.A00 = i;
        if (i > 0 && this.A03 != null) {
            C255119b scrollingViewProxy = this.A06.getScrollingViewProxy();
            String str = this.A03;
            if (scrollingViewProxy != null) {
                int i3 = 0;
                while (true) {
                    if (i3 < scrollingViewProxy.AI5()) {
                        if (C36371hw.A07(scrollingViewProxy.AI1(i3).getTag()) == C36421i1.MEDIA_INLINE_COMPOSER_BUTTON && (r0 = ((C32561bT) scrollingViewProxy.AI1(i3).getTag()).A05) != null && str.equals(r0.getId())) {
                            i2 = i3 + scrollingViewProxy.ALs();
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    if (this.A01 < 0) {
                        Resources resources = this.A04.getResources();
                        this.A01 = resources.getDimensionPixelSize(C0003R.dimen.avatar_reel_ring_size_small) + (resources.getDimensionPixelSize(C0003R.dimen.comment_input_row_avatar_vertical_padding) << 1) + (resources.getDimensionPixelSize(C0003R.dimen.emoji_picker_v1_padding_vertical) << 1) + resources.getDimensionPixelSize(C0003R.dimen.emoji_picker_v1_emoji_size);
                    }
                    C255119b scrollingViewProxy2 = this.A06.getScrollingViewProxy();
                    int measuredHeight = ((scrollingViewProxy2.AaK().getMeasuredHeight() - this.A00) - this.A01) + this.A02;
                    if (((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.LOW_RAM_ANIMATIONS, "remove_scroll_animations", false, (AnonymousClass04H) null)).booleanValue()) {
                        scrollingViewProxy2.BkS(i2, measuredHeight);
                        return;
                    } else {
                        scrollingViewProxy2.Box(i2, measuredHeight);
                        return;
                    }
                } else {
                    return;
                }
            }
            i2 = -1;
            if (i2 < 0) {
            }
        }
    }

    public C28981Od(AnonymousClass1HD r5, C27361Hn r6, AnonymousClass0C1 r7, C27371Ho r8) {
        this.A04 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = C23300zv.A00(r7);
        this.A08 = r8;
        TypedValue typedValue = new TypedValue();
        this.A04.getContext().getTheme().resolveAttribute(C0003R.attr.tabBarHeight, typedValue, true);
        this.A02 = (int) typedValue.getDimension(this.A04.getResources().getDisplayMetrics());
    }
}
