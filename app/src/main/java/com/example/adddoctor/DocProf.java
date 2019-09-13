package com.example.adddoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class DocProf extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button btU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_prof);

        btU =findViewById(R.id.btupdt);
        btU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iu=new Intent(getApplicationContext(),UpdateContact.class);
                startActivity(iu);
            }
        });

        //RegistrationButton=(Button)findViewById(R.id.button);

        //RegistrationButton.setOnClickListener(new View.OnClickListener(){
           // @Override
           // public void onClick(View view) {
                //Toast.makeText(DocProf.this, "You can  Update now", Toast.LENGTH_LONG).show();
               // setContentView(R.layout.activity_update_contact);
                //docReg();
            //}
        //});

    }

    //public class DocProf implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?>parent, View view, int pos, long id){
           Toast.makeText(parent.getContext(),"Selecting Item:"+parent.getItemAtPosition(pos).toString(),Toast.LENGTH_SHORT).show();

        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0){

        }

    public void docReg(){
        /*
        Intent intent=new Intent(this,DocProf.class);
        startActivity(intent);
        */

        Intent i = new Intent(getApplicationContext(),UpdateContact.class);
        startActivity(i);


    }

}

