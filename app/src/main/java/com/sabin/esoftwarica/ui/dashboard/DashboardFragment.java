package com.sabin.esoftwarica.ui.dashboard;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.sabin.esoftwarica.R;
import com.sabin.esoftwarica.ui.Contacts;
import com.sabin.esoftwarica.ui.ContactsAdapter;
import com.sabin.esoftwarica.ui.home.HomeFragment;
import com.sabin.esoftwarica.ui.notifications.NotificationsViewModel;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {


    private EditText etfname, etage, etaddress;
    private RadioButton male, female, rdoother;
    private Button btnsave;
    RadioGroup gender;

    public static List<Student> details = new ArrayList<>();

    String uname,uage,ugender,uaddress;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        btnsave = view.findViewById(R.id.submit);



        etfname = view.findViewById(R.id.fname);
        etage = view.findViewById(R.id.etage);
        etaddress = view.findViewById(R.id.etaddress);
        gender = view.findViewById(R.id.gender);
        male= view.findViewById(R.id.male);
        female= view.findViewById(R.id.female);
        rdoother = view.findViewById(R.id.other);
        btnsave.setOnClickListener(this);
        gender.setOnCheckedChangeListener(this);
        return view;
    }



    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        if (i == R.id.male) {
            ugender = "Male";
            Toast.makeText(getContext(), "Male", Toast.LENGTH_SHORT).show();
        }
        if (i == R.id.female) {
            ugender = "Female";
            Toast.makeText(getContext(), "Female", Toast.LENGTH_SHORT).show();
        }
        if (i == R.id.other) {
            ugender = "Other";
            Toast.makeText(getContext(), "Other", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etfname.getText())) {

            etfname.setError("Please Enter Full Name");
            etfname.requestFocus();
            return;
        } else if (TextUtils.isEmpty(etage.getText())) {
            etage.setError("Please enter Age");
            etage.requestFocus();
            return;
        } else if (TextUtils.isEmpty(etaddress.getText())) {
            etaddress.setError("Please enter Address");
            etaddress.requestFocus();
            return;
        }
        else if(TextUtils.isEmpty(ugender)) {
            Toast.makeText(getContext(), "Select Gender", Toast.LENGTH_SHORT).show();
            return;

        }

            uname = etfname.getText().toString();
            uage = etage.getText().toString();
            uaddress = etaddress.getText().toString();
            details.add(new Student(uname,uage,ugender,uaddress));
            Toast.makeText(getContext(),"Students Details Addedd", Toast.LENGTH_SHORT).show();


    }


}