package com.instagram.debug.devoptions.debughead.touchlistener;

import android.view.MotionEvent;

public class DebugHeadTouchListener {
    public static final DebugHeadTouchListener INSTANCE = new DebugHeadTouchListener();
    public DebugHeadActualTouchListener mListener;

    public interface DebugHeadActualTouchListener {
        void onTouchEvent(MotionEvent motionEvent);
    }

    public static DebugHeadTouchListener getInstance() {
        return INSTANCE;
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        DebugHeadActualTouchListener debugHeadActualTouchListener = this.mListener;
        if (debugHeadActualTouchListener != null) {
            debugHeadActualTouchListener.onTouchEvent(motionEvent);
        }
    }

    public void setActualListener(DebugHeadActualTouchListener debugHeadActualTouchListener) {
        this.mListener = debugHeadActualTouchListener;
    }
}
