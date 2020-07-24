package com.instagram.debug.devoptions.eventvisualizer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1PH;
import p000X.AnonymousClass1ZK;

public class EventVisualizerAdapter extends AnonymousClass1PH {
    public final List mData = new ArrayList();
    public EventDataDelegate mDelegate;

    public interface EventDataDelegate {
        void onEventDetailRequest(EventVisualizerLogger.EventData eventData);
    }

    public class ViewHolder extends AnonymousClass1ZK {
        public TextView textView;

        public ViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(C0003R.C0005id.text1);
        }
    }

    public void addNewData(EventVisualizerLogger.EventData eventData) {
        this.mData.add(0, eventData);
        notifyItemInserted(0);
    }

    public void clearData() {
        this.mData.clear();
        notifyDataSetChanged();
    }

    public int getItemCount() {
        int A03 = AnonymousClass0Z0.A03(-1865786049);
        int size = this.mData.size();
        AnonymousClass0Z0.A0A(-1183789279, A03);
        return size;
    }

    public void setDelegate(EventDataDelegate eventDataDelegate) {
        this.mDelegate = eventDataDelegate;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(((EventVisualizerLogger.EventData) this.mData.get(i)).mName);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.event_visualizer_row_view, viewGroup, false));
        viewHolder.textView.setLongClickable(true);
        viewHolder.textView.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                EventVisualizerAdapter eventVisualizerAdapter = EventVisualizerAdapter.this;
                EventDataDelegate eventDataDelegate = eventVisualizerAdapter.mDelegate;
                if (eventDataDelegate == null) {
                    return true;
                }
                eventDataDelegate.onEventDetailRequest((EventVisualizerLogger.EventData) eventVisualizerAdapter.mData.get(viewHolder.getAdapterPosition()));
                return true;
            }
        });
        return viewHolder;
    }
}
