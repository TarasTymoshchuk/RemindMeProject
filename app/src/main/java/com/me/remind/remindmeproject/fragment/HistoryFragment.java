package com.me.remind.remindmeproject.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.me.remind.remindmeproject.R;
import com.me.remind.remindmeproject.adapter.RemindListAdapter;
import com.me.remind.remindmeproject.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends AbstractTabFragment{
    private static final int LAYOUT = R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.menu_item_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));

        return view;
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item1"));
        data.add(new RemindDTO("Item2"));
        data.add(new RemindDTO("Item3"));
        data.add(new RemindDTO("Item4"));
        data.add(new RemindDTO("Item5"));
        data.add(new RemindDTO("Item6"));
        data.add(new RemindDTO("Item7"));

        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
