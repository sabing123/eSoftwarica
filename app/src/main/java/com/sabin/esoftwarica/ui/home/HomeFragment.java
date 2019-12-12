package com.sabin.esoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sabin.esoftwarica.R;
import com.sabin.esoftwarica.ui.ContactsAdapter;
import com.sabin.esoftwarica.ui.Contacts;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

public static List<Contacts> contactsList  = new ArrayList<>();
     private RecyclerView recyclerView;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);


        final List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Sabin","20","Male","Kalanki",R.drawable.men,""));
        contactsList.add(new Contacts("Namaskar","30","Female","",R.drawable.women,""));
        contactsList.add(new Contacts("Appiii","30","other","No Place",R.drawable.other,""));



        final ContactsAdapter contactsAdapter = new ContactsAdapter(getContext(), contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;



    }


}