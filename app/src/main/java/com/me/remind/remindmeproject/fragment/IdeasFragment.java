package com.me.remind.remindmeproject.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.me.remind.remindmeproject.R;

public class IdeasFragment extends AbstractTabFragment{
    private static final int LAYOUT = R.layout.fragment_example;

    public static IdeasFragment getInstance(Context context) {
        Bundle args = new Bundle();
        IdeasFragment fragment = new IdeasFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.menu_item_ideas));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
