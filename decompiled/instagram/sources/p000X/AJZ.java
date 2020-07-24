package p000X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.AJZ */
public final class AJZ extends AnonymousClass1PH {
    public static final C23357AJi A01 = new C23357AJi();
    public final ArrayList A00 = new ArrayList();

    public final void onBindViewHolder(AnonymousClass1ZK r10, int i) {
        C13150hy.A02(r10, "holder");
        if (2 == getItemViewType(i)) {
            C23352AJd aJd = (C23352AJd) r10;
            Object obj = this.A00.get(i - 1);
            C13150hy.A01(obj, "supporterList[position - 1]");
            C23350AJb aJb = (C23350AJb) obj;
            C13150hy.A02(aJb, "supporter");
            C13300iJ r7 = aJb.A00;
            if (r7 != null) {
                C23334AIl aIl = aJb.A01;
                if (aIl != null) {
                    TextView textView = aJd.A01;
                    C13150hy.A01(textView, "username");
                    SpannableStringBuilder append = new SpannableStringBuilder().append(r7.AZn());
                    C23332AIj aIj = C23335AIm.A00;
                    View view = aJd.itemView;
                    C13150hy.A01(view, "itemView");
                    Context context = view.getContext();
                    C13150hy.A01(context, "itemView.context");
                    C13150hy.A01(append, "this");
                    aIj.A01(context, append, aIl);
                    textView.setText(append);
                }
                aJd.A02.setUrl(r7.ASv(), "ig_live_supporter");
            }
            TextView textView2 = aJd.A00;
            C13150hy.A01(textView2, "amount");
            View view2 = aJd.itemView;
            C13150hy.A01(view2, "itemView");
            textView2.setText(C15960no.A07(view2.getResources(), Double.parseDouble(aJb.A02)));
        }
    }

    public final AnonymousClass1ZK onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13150hy.A02(viewGroup, "parent");
        if (i == 0) {
            return new C23355AJg(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.iglive_user_pay_supporter_list_empty_state, viewGroup, false));
        }
        if (i == 1) {
            return new C23354AJf(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.iglive_user_pay_supporter_list_header, viewGroup, false));
        }
        if (i == 2) {
            C13150hy.A02(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.iglive_user_pay_supporter, viewGroup, false);
            C13150hy.A01(inflate, "view");
            return new C23352AJd(inflate);
        }
        throw new IllegalStateException(AnonymousClass000.A05("Unsupported view type: ", i).toString());
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0Z0.A03(-1461787732);
        int i = 1;
        if (!this.A00.isEmpty()) {
            i = 1 + this.A00.size();
        }
        AnonymousClass0Z0.A0A(-1673048486, A03);
        return i;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0Z0.A03(-1659874950);
        int i2 = 1;
        if (i == 0 && this.A00.isEmpty()) {
            i2 = 0;
        } else if (i != 0 || !(!this.A00.isEmpty())) {
            i2 = 2;
        }
        AnonymousClass0Z0.A0A(221200730, A03);
        return i2;
    }
}
