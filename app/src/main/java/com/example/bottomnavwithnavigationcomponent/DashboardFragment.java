package com.example.bottomnavwithnavigationcomponent;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private RecyclerView recyclerView2;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        recyclerView2 = view.findViewById(R.id.main_recyclerView2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        mList = new ArrayList<>(); // Initialize mList here
        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Iron Man is the superhero persona of Anthony Edward \"Tony\" Stark, a businessman and engineer who runs the company Stark Industries. Beginning his career as a weapons manufacturer, he is captured in a war zone, and his heart is severely injured by shrapnel.");


        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Jason Momoa as Arthur Curry / Aquaman: A half-Atlantean, half-human who is reluctant to be king of the undersea nation of Atlantis. He is a member of the Justice League. He possesses superhuman strength, durability, has hydrokinetic powers, can communicate with sea creatures, and can swim at supersonic speeds.");






        mList.add(new DataModel(nestedList1 , "IRON MAN"));
        mList.add(new DataModel( nestedList2,"AQUAMAN"));


        adapter = new ItemAdapter(mList);
        recyclerView2.setAdapter(adapter);

        return view;
    }
}
