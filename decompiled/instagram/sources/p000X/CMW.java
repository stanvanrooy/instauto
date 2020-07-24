package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.p009ui.recyclerpager.HorizontalRecyclerPager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CMW */
public final class CMW extends AnonymousClass1PH {
    public int A00;
    public Context A01;
    public C30261Td A02;
    public HorizontalRecyclerPager A03;
    public List A04;

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new C27656CMa(LayoutInflater.from(this.A01).inflate(C0003R.layout.netego_card_image, viewGroup, false));
        }
        View inflate = LayoutInflater.from(this.A01).inflate(C0003R.layout.slide_card_new_illustrations, viewGroup, false);
        inflate.findViewById(C0003R.C0005id.placeholder).setVisibility(0);
        return new CMX(inflate);
    }

    public final void onBindViewHolder(AnonymousClass1ZK r9, int i) {
        if (r9 instanceof CMX) {
            C27657CMb cMb = (C27657CMb) this.A04.get(i);
            CMX cmx = (CMX) r9;
            cmx.A02.setText(cMb.A02);
            cmx.A01.setText(cMb.A01);
            if (cMb.A00 != null) {
                cmx.A00.setImageDrawable(AnonymousClass953.A00(this.A01.getResources(), cMb.A00.intValue()));
                cmx.A00.setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(0, 0, 0, this.A01.getResources().getDimensionPixelSize(C0003R.dimen.card_text_padding));
            int i2 = this.A01.getResources().getDisplayMetrics().widthPixels;
            layoutParams.width = i2;
            layoutParams.height = Math.max(layoutParams.height, (int) (this.A01.getResources().getDisplayMetrics().density * 300.0f));
            layoutParams2.width = i2 - (this.A01.getResources().getDimensionPixelSize(C0003R.dimen.align_footer_padding) << 1);
            this.A03.setLayoutParams(layoutParams);
            this.A00 = this.A01.getResources().getDimensionPixelSize(C0003R.dimen.new_badge_height);
            cmx.itemView.setLayoutParams(layoutParams2);
            cmx.itemView.setPadding(0, this.A01.getResources().getDimensionPixelSize(C0003R.dimen.card_close_button_size), 0, 0);
            cmx.itemView.setBackgroundResource(C0003R.C0004drawable.netego_layout_border);
            TextView textView = cmx.A01;
            int i3 = this.A00;
            textView.setPadding(i3, 0, i3, 0);
            r9.itemView.setOnClickListener(new CMY(this, i));
        } else if (r9 instanceof C27656CMa) {
            Context context = this.A01;
            C30261Td r3 = this.A02;
            C27656CMa cMa = (C27656CMa) r9;
            Drawable A002 = AnonymousClass953.A00(context.getResources(), C0003R.C0004drawable.instagram_business_images_netego_welcome);
            cMa.A01.setAdjustViewBounds(true);
            cMa.A01.setImageDrawable(A002);
            if (cMa.A00 != null) {
                cMa.A00.setImageDrawable(AnonymousClass953.A00(context.getResources(), C0003R.C0004drawable.instagram_business_images_netego_arrow));
                C23103A7h.A00(context, cMa.A00);
            }
            int dimensionPixelSize = context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(C0003R.dimen.align_footer_padding) << 1);
            cMa.A01.setMaxWidth(dimensionPixelSize);
            cMa.A01.setMinimumWidth(dimensionPixelSize);
            cMa.A01.setOnClickListener(new CMZ(r3));
        }
    }

    public CMW(Context context, HorizontalRecyclerPager horizontalRecyclerPager, C13300iJ r8, C30261Td r9) {
        this.A01 = context;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C27657CMb(AnonymousClass000.A0J(context.getString(C0003R.string.welcome_to_instagram_business_tools), ", ", r8.AZn()), context.getString(C0003R.string.connect_and_learn_followers)));
        arrayList.add(new C27657CMb(context, C0003R.string.get_insights, Integer.valueOf(C0003R.C0004drawable.instagram_business_images_business_new_props_followers), C0003R.string.learn_about_follower));
        arrayList.add(new C27657CMb(context, C0003R.string.reach_your_customers_value_props, Integer.valueOf(C0003R.C0004drawable.instagram_business_images_business_new_props_megaphone), C0003R.string.reach_your_customers_message));
        arrayList.add(new C27657CMb(context, C0003R.string.your_business_profile_value_props, Integer.valueOf(C0003R.C0004drawable.instagram_business_images_business_new_props_contacts), C0003R.string.your_business_profile_message));
        this.A04 = arrayList;
        this.A02 = r9;
        this.A03 = horizontalRecyclerPager;
    }

    public final int getItemCount() {
        int i;
        int i2;
        int A032 = AnonymousClass0Z0.A03(-1950503311);
        List list = this.A04;
        if (list != null) {
            i = list.size();
            i2 = -1203504926;
        } else {
            i = 0;
            i2 = 1230499024;
        }
        AnonymousClass0Z0.A0A(i2, A032);
        return i;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0Z0.A03(1414229302);
        int i2 = 0;
        int i3 = 35148884;
        if (i == 0) {
            i2 = 1;
            i3 = -1154450897;
        }
        AnonymousClass0Z0.A0A(i3, A032);
        return i2;
    }

    public final void onViewAttachedToWindow(AnonymousClass1ZK r3) {
        IgImageView igImageView;
        super.onViewAttachedToWindow(r3);
        if ((r3 instanceof C27656CMa) && (igImageView = ((C27656CMa) r3).A00) != null) {
            C23103A7h.A00(this.A01, igImageView);
        }
    }
}
