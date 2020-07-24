package com.instagram.debug.devoptions.eventvisualizer;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;

public class EventVisualizerFilterView extends FrameLayout {
    public ArrayAdapter mAdapter;
    public View mAddButton;
    public View mApplyButton;
    public View mClearButton;
    public FilterViewDelegate mDelegate;
    public EditText mEditText;
    public final ArrayList mFilters;
    public ListView mListView;

    public interface FilterViewDelegate {
        void onFilterAdded(String str);

        void onFilterApplied(List list);

        void onFilterCleared();
    }

    private void updateFilterView() {
        this.mEditText.getText().clear();
        AnonymousClass0Z1.A00(this.mAdapter, 978541428);
    }

    public void clearFilter() {
        this.mFilters.clear();
        updateFilterView();
    }

    public EventVisualizerFilterView(Context context, FilterViewDelegate filterViewDelegate) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.mFilters = arrayList;
        this.mAdapter = new ArrayAdapter(getContext(), 17367043, arrayList);
        this.mDelegate = filterViewDelegate;
        initView();
    }

    private void initView() {
        inflate(getContext(), C0003R.layout.event_visualizer_filter, this);
        this.mEditText = (EditText) findViewById(C0003R.C0005id.filter_edittext);
        ListView listView = (ListView) findViewById(C0003R.C0005id.filterListView);
        this.mListView = listView;
        listView.setAdapter(this.mAdapter);
        this.mAddButton = findViewById(C0003R.C0005id.filter_add_button);
        this.mClearButton = findViewById(C0003R.C0005id.filter_clear_button);
        this.mApplyButton = findViewById(C0003R.C0005id.filter_apply_button);
        this.mAddButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0Z0.A05(1464719946);
                EventVisualizerFilterView eventVisualizerFilterView = EventVisualizerFilterView.this;
                eventVisualizerFilterView.mDelegate.onFilterAdded(eventVisualizerFilterView.mEditText.getText().toString());
                AnonymousClass0Z0.A0C(163318118, A05);
            }
        });
        this.mClearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0Z0.A05(165771106);
                EventVisualizerFilterView.this.mDelegate.onFilterCleared();
                AnonymousClass0Z0.A0C(-2124329490, A05);
            }
        });
        this.mApplyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0Z0.A05(572469661);
                EventVisualizerFilterView eventVisualizerFilterView = EventVisualizerFilterView.this;
                eventVisualizerFilterView.mDelegate.onFilterApplied(eventVisualizerFilterView.mFilters);
                AnonymousClass0Z0.A0C(1444060756, A05);
            }
        });
    }

    public void addFilter(String str) {
        if (!TextUtils.isEmpty(str) && !this.mFilters.contains(str)) {
            this.mFilters.add(str);
        }
        updateFilterView();
    }
}
