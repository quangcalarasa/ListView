package com.example.list_avata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView)findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContacts,this);
        lvContact.setAdapter(adapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this,contactModel.getName(),Toast.LENGTH_LONG).show();
            }
        });

    }
    private void initData(){
        ContactModel contact = new ContactModel("Doan Van Quang","0329326112",R.drawable.dijgdfg);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van Minh","01263716237",R.drawable.uyuw);
        listContacts.add(contact);
        contact = new ContactModel("Luong Minh Trang","01263716237",R.drawable.werrr);
        listContacts.add(contact);
        contact = new ContactModel("Pham Duc Cong","01263716237",R.drawable.weruiw);
        listContacts.add(contact);
        contact = new ContactModel("Pham Viet Ha","01263716237",R.drawable.wkhrfwe);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Phuong Linh","01263716237",R.drawable.asdaf);
        listContacts.add(contact);
        contact = new ContactModel("Doan Duc Trong","01263716237",R.drawable.hack);
        listContacts.add(contact);
        contact = new ContactModel("Luong Quang Phong","01263716237",R.drawable.fgfg);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Hai Phong","01263716237",R.drawable.efsdfsdf);
        listContacts.add(contact);
        contact = new ContactModel("Minh Van Phuoc","01263716237",R.drawable.asdas);
        listContacts.add(contact);


    }
}