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
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.sabin.esoftwarica.R;

public class DashboardFragment extends Fragment implements View.OnClickListener {


    private EditText etfname, etage, etaddress;
    private RadioButton rdomale, rdofemale, rdoother;
    private Button btnsave;





    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_dashboard, container,false);

        etfname = view.findViewById(R.id.fname);
        etage = view.findViewById(R.id.etage);
        etaddress = view.findViewById(R.id.etaddress);
        btnsave = view.findViewById(R.id.btns);
       btnsave.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v){
        if (TextUtils.isEmpty(etfname.getText())){

            etfname.setError("Please Enter Full Name");
            etfname.requestFocus();
            return;
        }
        else if (TextUtils.isEmpty(etage.getText())){
            etage.setError("Please enter Age");
            etage.requestFocus();
            return;
        }

        else if (TextUtils.isEmpty(etaddress.getText())){
            etaddress.setError("Please enter Address");
            etaddress.requestFocus();
            return;

        }
    }


}