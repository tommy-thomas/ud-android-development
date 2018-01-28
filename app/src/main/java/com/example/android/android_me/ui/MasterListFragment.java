package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.widget.GridView;

import com.example.android.android_me.data.AndroidImageAssets;
import com.example.android.android_me.R;

import java.util.List;

public class MasterListFragment extends ListFragment {


    private MasterListAdapter masterListAdapter;

    private List<Integer> mListAllIDs;

    private GridView gridView;

    private String TAG = "VIEW-STATE";

    public MasterListFragment(){}

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mListAllIDs = AndroidImageAssets.getAll();
        masterListAdapter = new MasterListAdapter(getActivity(), mListAllIDs);
        gridView = (GridView) getActivity().findViewById(R.id.gv_list_fragment);
        gridView.setAdapter(masterListAdapter);
    }
}
