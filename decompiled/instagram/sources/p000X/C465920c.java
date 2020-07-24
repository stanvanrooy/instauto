package p000X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.p009ui.widget.textview.UpdatableButton;
import java.util.List;

/* renamed from: X.20c  reason: invalid class name and case insensitive filesystem */
public final class C465920c extends AnonymousClass1PH {
    public C43411uN A00;
    public final Activity A01;
    public final AnonymousClass0RN A02;
    public final C23300zv A03;
    public final C11200ea A04 = new C466220f(this);
    public final C28161Kq A05;
    public final C28181Ks A06;
    public final AnonymousClass0C1 A07;
    public final Runnable A08;
    public final Runnable A09;
    public final int A0A;
    public final C12830hS A0B;
    public final C29401Pt A0C;

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = null;
        if (i == 0) {
            C29401Pt r0 = this.A0C;
            if (r0 != null) {
                view = (View) r0.A04.poll();
            }
            if (view == null) {
                view = LayoutInflater.from(this.A01).inflate(C0003R.layout.suggested_entity_card, viewGroup, false);
            }
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new AnonymousClass1ZN(this.A0A, -1));
            } else {
                view.getLayoutParams().width = this.A0A;
            }
            return new C466520i(this.A01, this.A02, this.A0B, this.A07, view);
        } else if (i != 1) {
            return null;
        } else {
            View inflate = LayoutInflater.from(this.A01).inflate(C0003R.layout.suggested_upsell_card, viewGroup, false);
            inflate.getLayoutParams().width = this.A0A;
            return new AnonymousClass44G(inflate);
        }
    }

    public static void A00(C465920c r1, int i) {
        r1.A00.A0H.remove(i);
        if (r1.getItemCount() == 0) {
            r1.A03.BXT(new C32971c9());
        } else {
            r1.notifyItemRemoved(i);
        }
    }

    public C465920c(Activity activity, C12830hS r4, AnonymousClass0C1 r5, C28161Kq r6, Runnable runnable, Runnable runnable2, C29401Pt r9, C28181Ks r10) {
        this.A01 = activity;
        this.A02 = r6.AFt();
        this.A0B = r4;
        this.A07 = r5;
        this.A03 = C23300zv.A00(r5);
        this.A05 = r6;
        this.A08 = runnable;
        this.A09 = runnable2;
        this.A0A = C466320g.A00(this.A01.getResources(), C06220Of.A09(this.A01));
        this.A0C = r9;
        this.A06 = r10;
    }

    public final int getItemCount() {
        int size;
        int A032 = AnonymousClass0Z0.A03(116098169);
        List list = this.A00.A0H;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        AnonymousClass0Z0.A0A(-309438366, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0Z0.A03(-312481517);
        int i3 = 1;
        switch (this.A00.A00(i).A05.ordinal()) {
            case 1:
            case 2:
                i2 = 717046396;
                break;
            default:
                i3 = 0;
                i2 = 1080099793;
                break;
        }
        AnonymousClass0Z0.A0A(i2, A032);
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0137  */
    public final void onBindViewHolder(AnonymousClass1ZK r14, int i) {
        TextView textView;
        String AMN;
        View view;
        View view2;
        Integer num;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C466520i r142 = (C466520i) r14;
            C43451uR r3 = (C43451uR) this.A00.A00(i).A04;
            C13300iJ r8 = r3.A02;
            r142.A00.setOnClickListener(new C466720k(this, r142, r3));
            r142.A06.setUrl(r8.ASv());
            C466820l.A05(r142.A05, r8.A0s());
            r142.A01.setOnClickListener(new C466920m(this, r142, r3));
            if (this.A00.ALf() == C29261Pf.SUGGESTED_CLOSE_FRIENDS) {
                UpdatableButton updatableButton = r142.A07;
                if (updatableButton != null) {
                    updatableButton.setVisibility(0);
                }
                C466620j r5 = r142.A08;
                if (r5 != null) {
                    C13300iJ r4 = r3.A02;
                    if (r4.A0g()) {
                        num = Constants.ZERO;
                    } else {
                        num = Constants.ONE;
                    }
                    r5.A01 = num;
                    r5.A00 = r4;
                    C466620j.A01(r5);
                }
                r142.A04.setText(r3.A02.AMN());
                r142.A09.setVisibility(8);
            } else {
                UpdatableButton updatableButton2 = r142.A07;
                if (updatableButton2 != null) {
                    updatableButton2.setVisibility(8);
                }
                boolean A0l = r8.A0l();
                r142.A09.setShouldShowFollowBack(A0l);
                r142.A04.setText(r3.A04);
                r142.A09.setVisibility(0);
                C06270Ok A002 = C06270Ok.A00();
                A002.A05("can_show_follow_back", Boolean.valueOf(A0l));
                A002.A05("following_current_user", Boolean.valueOf(r8.A0l()));
                String str = this.A00.A08;
                if (str != null) {
                    A002.A09("insertion_context", str);
                }
                A002.A09("format", "profile");
                A002.A09("unit_id", this.A00.getId());
                r142.A09.A02.A02(this.A07, r8, new C467020n(this, r142, r3, i), (AnonymousClass1NJ) null, A002, (AnonymousClass1I6) null);
                if (!TextUtils.isEmpty(r8.AMN())) {
                    textView = r142.A05;
                    AMN = r8.AMN();
                    textView.setText(AMN);
                    if (!(r142.A02 == null || (view = r142.A03) == null)) {
                        view.setVisibility(4);
                        r142.A02.setVisibility(8);
                        if (r3.A09) {
                            if (!C16180oA.A00(this.A07).A00.getBoolean("aysf_has_seen_new_badge_long_impression", false) || !C466320g.A00) {
                                view2 = r142.A02;
                            } else {
                                view2 = r142.A03;
                            }
                            view2.setVisibility(0);
                        }
                    }
                    this.A06.A00(this.A00, r3);
                    C28181Ks r0 = this.A06;
                    r0.A00.A03(r142.A00, r0.A01.A00(r3.getId()));
                }
            }
            textView = r142.A05;
            AMN = r8.AZn();
            textView.setText(AMN);
            view.setVisibility(4);
            r142.A02.setVisibility(8);
            if (r3.A09) {
            }
            this.A06.A00(this.A00, r3);
            C28181Ks r02 = this.A06;
            r02.A00.A03(r142.A00, r02.A01.A00(r3.getId()));
        } else if (itemViewType == 1) {
            AnonymousClass44G r143 = (AnonymousClass44G) r14;
            AnonymousClass20T r32 = (AnonymousClass20T) this.A00.A00(i).A04;
            r143.A00.setOnClickListener(new AnonymousClass44H(this, r143));
            r143.A03.setText(r32.A04);
            r143.A02.setText(r32.A03);
            r143.A01.setText(r32.A02);
            r143.A01.setOnClickListener(new C28458ChF(this, r32));
            r143.A04.clearColorFilter();
            switch (r32.AXE().ordinal()) {
                case 1:
                    r143.A04.setImageDrawable(C019000b.A03(this.A01, C0003R.C0004drawable.fb_connect));
                    r143.A04.setColorFilter(C26771Ff.A00(C019000b.A00(this.A01, C0003R.color.igds_facebook_blue)));
                    break;
                case 2:
                    r143.A04.setImageDrawable(C019000b.A03(this.A01, C0003R.C0004drawable.instagram_hero_contacts));
                    CircularImageView circularImageView = r143.A04;
                    circularImageView.setColorFilter(C26771Ff.A00(C019000b.A00(circularImageView.getContext(), C0003R.color.igds_primary_icon)));
                    break;
                default:
                    AnonymousClass0QD.A01("SuggestedItemsAdapter", "Unhandled suggested upsell `SuggestedItemType`. Please fix ASAP because otherwise the icon for your upsell will be totally empty. ");
                    break;
            }
            if (r32.AXE().ordinal() == 2) {
                C127735dY.A06(this.A07, this.A02, i);
            }
        }
    }

    public final void onViewAttachedToWindow(AnonymousClass1ZK r4) {
        super.onViewAttachedToWindow(r4);
        if (r4 instanceof C466520i) {
            this.A03.A02(C467420r.class, this.A04);
        }
    }

    public final void onViewDetachedFromWindow(AnonymousClass1ZK r4) {
        super.onViewDetachedFromWindow(r4);
        if (r4 instanceof C466520i) {
            this.A03.A03(C467420r.class, this.A04);
        }
    }
}
