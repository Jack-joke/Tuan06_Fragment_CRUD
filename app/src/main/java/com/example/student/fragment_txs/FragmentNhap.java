package com.example.student.fragment_txs;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentNhap extends ListFragment {
    Button btna, btnb, btnc;
    ArrayAdapter<Human> arrAdap;
    ArrayList<Human> arr;
    FragmentChitiet fragmentChitiet;
    public static  final  int  GOIDIMA=100;
    public static final int GOIDIMASUA = 300;
    int vitri;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nhap,container,false);
        btna = (Button)view.findViewById(R.id.btn_Them);
        btnb = (Button)view.findViewById(R.id.btn_Xoa);
        btnc = (Button)view.findViewById(R.id.btn_Sua);

        arr = new ArrayList<Human>();
        arr.add(new Human("123","Nam"));
        arr.add(new Human("124","Nu"));

        arrAdap = new ArrayAdapter<Human>(getActivity(),R.layout.support_simple_spinner_dropdown_item,arr);
        setListAdapter(arrAdap);

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),XuLyActivity.class);
                startActivityForResult(intent, GOIDIMA);
            }
        });
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Human hSua= arr.get(vitri);
                Intent intent = new Intent(getActivity(), XuLyActivity.class);
                intent.putExtra("SUA", hSua);
                startActivityForResult(intent, GOIDIMASUA);
            }
        });


        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Human h = arr.get(position);
        vitri = position;
        fragmentChitiet = (FragmentChitiet) getFragmentManager().findFragmentById(R.id.fragB);
        if (fragmentChitiet != null && fragmentChitiet.isInLayout()){
            fragmentChitiet.tva.setText(h.getMa());
            fragmentChitiet.tvb.setText(h.getTen());
        }else{
            Intent intent = new Intent(getActivity(), ChitietActivity.class);
            intent.putExtra("gui", h);
            startActivity(intent);
        }
    }


}
