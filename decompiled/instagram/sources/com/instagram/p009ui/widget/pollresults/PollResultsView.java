package com.instagram.p009ui.widget.pollresults;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: com.instagram.ui.widget.pollresults.PollResultsView */
public class PollResultsView extends LinearLayout {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;

    private void A00() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0003R.layout.poll_results, this, true);
        this.A04 = (TextView) inflate.findViewById(C0003R.C0005id.row_newsfeed_winning_poll_percentage);
        this.A05 = (TextView) inflate.findViewById(C0003R.C0005id.row_newsfeed_winning_poll_option);
        this.A01 = (ImageView) inflate.findViewById(C0003R.C0005id.row_newsfeed_winning_poll_background);
        this.A02 = (TextView) inflate.findViewById(C0003R.C0005id.row_newsfeed_losing_poll_percentage);
        this.A03 = (TextView) inflate.findViewById(C0003R.C0005id.row_newsfeed_losing_poll_option);
        this.A00 = (ImageView) inflate.findViewById(C0003R.C0005id.row_newsfeed_losing_poll_background);
    }

    public PollResultsView(Context context) {
        super(context);
        A00();
    }

    public PollResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PollResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
