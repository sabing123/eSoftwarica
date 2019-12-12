package com.sabin.esoftwarica.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sabin.esoftwarica.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsviewHolder> {

    Context mContext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }


    @NonNull
    @Override
    public ContactsviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext())
              .inflate(R.layout.contactview,parent,false);
      return new ContactsviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsviewHolder holder, final int position) {
        final Contacts contacts = contactsList.get(position);
        holder.imgprofile.setImageResource(contacts.getImageId());
        holder.name.setText(contacts.getName());
        holder.age.setText(contacts.getAge());
        holder.location.setText(contacts.getLocation());
        holder.gender.setText(contacts.getGender());
        holder.btndelete.setText(contacts.getDelimgID());


        holder.imgprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Hello! This is :" + contacts.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactsList.remove(position);
                notifyItemRemoved(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsviewHolder extends RecyclerView.ViewHolder{

        TextView name,age,gender,location;
        ImageView imgprofile;
        ToggleButton btndelete;


        public ContactsviewHolder(@NonNull View itemView) {
            super(itemView);

            imgprofile= itemView.findViewById(R.id.imageView2);
            name= itemView.findViewById(R.id.name);
            age= itemView.findViewById(R.id.age);
            location= itemView.findViewById(R.id.location);
            gender= itemView.findViewById(R.id.Gender);
            btndelete =itemView.findViewById(R.id.btndelete);



        }
    }


}
