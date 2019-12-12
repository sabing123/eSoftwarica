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
import com.sabin.esoftwarica.ui.dashboard.DashboardFragment;
import com.sabin.esoftwarica.ui.dashboard.Student;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

public static List<Contacts> contactsList  = new ArrayList<>();
List<Student> students = new ArrayList<>();
     private RecyclerView recyclerView;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = view.findViewById(R.id.recyclerview);
if(HomeFragment.contactsList.isEmpty()) {
    final List<Contacts> contactsList = new ArrayList<>();
    contactsList.add(new Contacts("Sabin", "20", "Male", "Kalanki", R.drawable.men, ""));
    contactsList.add(new Contacts("Arya", "30", "Female", " Kathmandu", R.drawable.women, ""));
    contactsList.add(new Contacts("John", "30", "other", "Nepal", R.drawable.other, ""));

    final ContactsAdapter contactsAdapter = new ContactsAdapter(getContext(), contactsList);
    recyclerView.setAdapter(contactsAdapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
}else {
    Student student = new Student(getContext(), students);
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getContext());

    recyclerView.setLayoutManager(layoutManager);
}


        return view;



    }


}