package com.example.student.fragment_txs;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentChitiet extends Fragment {
    TextView tva, tvb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chitiet,container,false);
        tva = (TextView)view.findViewById(R.id.tv_fid);
        tvb = (TextView)view.findViewById(R.id.tv_fname);
        return view;
    }
}
