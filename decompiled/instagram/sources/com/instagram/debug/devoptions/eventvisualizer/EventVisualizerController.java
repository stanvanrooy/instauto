package com.instagram.debug.devoptions.eventvisualizer;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerAdapter;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerFilterView;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerView;
import java.util.List;

public class EventVisualizerController implements EventVisualizerFilterView.FilterViewDelegate, EventVisualizerLogger.EventDataListener, EventVisualizerView.EventViewDelegate, EventVisualizerAdapter.EventDataDelegate {
    public static EventVisualizerController sInstance;
    public EventVisualizerAdapter mEventVisualizerAdapter = new EventVisualizerAdapter();
    public EventVisualizerFilterView mEventVisualizerFilterView;
    public EventVisualizerLogger mEventVisualizerLogger = EventVisualizerLogger.getInstance();
    public EventVisualizerView mEventVisualizerView;
    public boolean mFilterMode = false;
    public boolean mInteractiveMode = false;
    public ViewGroup mRootView;

    public static EventVisualizerController getInstance() {
        if (sInstance == null) {
            sInstance = new EventVisualizerController();
        }
        return sInstance;
    }

    public void onEventDetailRequest(EventVisualizerLogger.EventData eventData) {
        this.mEventVisualizerView.showEventDetail(eventData.mDebugString);
    }

    public void onEventVisualizerDismiss() {
        if (this.mFilterMode) {
            this.mRootView.removeView(this.mEventVisualizerFilterView);
            this.mFilterMode = false;
        }
        this.mRootView.removeView(this.mEventVisualizerView);
        this.mEventVisualizerLogger.mListener = null;
        this.mEventVisualizerAdapter.mDelegate = null;
    }

    public void onEventVisualizerShow(Activity activity) {
        this.mEventVisualizerLogger.mListener = this;
        this.mEventVisualizerAdapter.mDelegate = this;
        this.mRootView = getRootViewFromActivity(activity);
        EventVisualizerView eventVisualizerView = new EventVisualizerView(activity, this);
        this.mEventVisualizerView = eventVisualizerView;
        eventVisualizerView.mMainContentView = this.mRootView.getChildAt(0);
        this.mEventVisualizerView.setLayoutManager(new LinearLayoutManager());
        this.mEventVisualizerView.setAdapter(this.mEventVisualizerAdapter);
        this.mRootView.addView(this.mEventVisualizerView);
    }

    public void onFilterAdded(String str) {
        this.mEventVisualizerFilterView.addFilter(str);
    }

    public void onFilterApplied(List list) {
        this.mEventVisualizerAdapter.clearData();
        this.mEventVisualizerLogger.updateFilters(list);
        this.mEventVisualizerLogger.requestFilteredData();
        this.mRootView.removeView(this.mEventVisualizerFilterView);
        this.mFilterMode = false;
    }

    public void onFilterButtonClicked(View view) {
        boolean z = !this.mFilterMode;
        this.mFilterMode = z;
        if (z) {
            EventVisualizerFilterView eventVisualizerFilterView = new EventVisualizerFilterView(view.getContext(), this);
            this.mEventVisualizerFilterView = eventVisualizerFilterView;
            this.mRootView.addView(eventVisualizerFilterView);
            return;
        }
        this.mRootView.removeView(this.mEventVisualizerFilterView);
    }

    public void onFilterCleared() {
        this.mEventVisualizerFilterView.clearFilter();
    }

    public void onInteractiveButtonClicked() {
        if (this.mInteractiveMode) {
            this.mEventVisualizerView.setNotInteractive();
            this.mInteractiveMode = false;
            return;
        }
        this.mEventVisualizerView.setInteractive();
        this.mInteractiveMode = true;
    }

    public void onNewEventsAdded(EventVisualizerLogger.EventData eventData) {
        this.mEventVisualizerAdapter.addNewData(eventData);
        this.mEventVisualizerView.requestScrollToPosition(0);
    }

    public static ViewGroup getRootViewFromActivity(Activity activity) {
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        return (ViewGroup) activity.findViewById(16908290);
    }

    public boolean getInteractiveMode() {
        return this.mInteractiveMode;
    }
}
