package com.instagram.debug.devoptions.eventvisualizer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1PH;
import p000X.AnonymousClass5F9;
import p000X.C31391Ya;

public class EventVisualizerView extends FrameLayout {
    public EventViewDelegate mDelegate;
    public View mFilterButton;
    public View mInteractiveButton;
    public View mMainContentView;
    public RecyclerView mRecyclerView;

    public interface EventViewDelegate {
        void onFilterButtonClicked(View view);

        void onInteractiveButtonClicked();
    }

    public void requestScrollToPosition(int i) {
        C31391Ya r0 = this.mRecyclerView.A0L;
        if (r0 != null) {
            r0.A1L(i);
        }
    }

    public void setAdapter(AnonymousClass1PH r2) {
        this.mRecyclerView.setAdapter(r2);
    }

    public void setInteractive() {
        this.mRecyclerView.setClickable(true);
        this.mRecyclerView.setOnTouchListener((View.OnTouchListener) null);
    }

    public void setLayoutManager(C31391Ya r2) {
        this.mRecyclerView.setLayoutManager(r2);
    }

    public void setNotInteractive() {
        this.mRecyclerView.setClickable(false);
        this.mRecyclerView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                EventVisualizerView.this.mMainContentView.dispatchTouchEvent(motionEvent);
                return true;
            }
        });
    }

    public EventVisualizerView(Context context, EventViewDelegate eventViewDelegate) {
        super(context);
        this.mDelegate = eventViewDelegate;
        initView();
    }

    private void initView() {
        Context context = getContext();
        inflate(context, C0003R.layout.event_visualizer, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0003R.C0005id.recyclerView);
        this.mRecyclerView = recyclerView;
        getContext();
        recyclerView.A0r(new EventItemDecoration(context));
        View findViewById = findViewById(C0003R.C0005id.interactive_button);
        this.mInteractiveButton = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0Z0.A05(-1009426018);
                EventViewDelegate eventViewDelegate = EventVisualizerView.this.mDelegate;
                if (eventViewDelegate != null) {
                    eventViewDelegate.onInteractiveButtonClicked();
                }
                AnonymousClass0Z0.A0C(-365758403, A05);
            }
        });
        View findViewById2 = findViewById(C0003R.C0005id.filter_button);
        this.mFilterButton = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0Z0.A05(-380423428);
                EventViewDelegate eventViewDelegate = EventVisualizerView.this.mDelegate;
                if (eventViewDelegate != null) {
                    eventViewDelegate.onFilterButtonClicked(view);
                }
                AnonymousClass0Z0.A0C(458857961, A05);
            }
        });
        setNotInteractive();
    }

    public void setMainContentView(View view) {
        this.mMainContentView = view;
    }

    public void showEventDetail(String str) {
        if (EventVisualizerController.getInstance().mInteractiveMode) {
            AnonymousClass5F9.A02(getContext(), str);
        }
    }
}
