package com.example.adddoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner choco;
    EditText NameEditText,editTextEmail,MIdEditText;
    TextView textViewName,textViewEmail,textViewMId,choco_display;
    Button RegistrationButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choco=(Spinner)findViewById(R.id.chocolate_Spinner);
        choco.setOnItemSelectedListener(new DocProf());

        RegistrationButton=(Button)findViewById(R.id.button);
        NameEditText=(EditText)findViewById(R.id.editText1);
        MIdEditText=(EditText)findViewById(R.id.editText2);
        editTextEmail=(EditText)findViewById(R.id.editText3);

        RegistrationButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                final String Name=NameEditText.getText().toString();
                final String Id=MIdEditText.getText().toString();
                final String Email=editTextEmail.getText().toString();


                if(Name.length()==0){
                    NameEditText.requestFocus();
                    NameEditText.setError("Field cannot be empty");
                }
                else if(!Name.matches("[a-zA-Z]+")){
                    NameEditText.requestFocus();
                    NameEditText.setError("Enter only alphabetical character");
                }
                else if(Id.length()==0){
                    MIdEditText.requestFocus();
                    MIdEditText.setError("Field cannot be empty");
                }
                else if(Email.length()==0){
                    editTextEmail.requestFocus();
                    editTextEmail.setError("Field cannot be empty");
                }
                else if(!Email.matches("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"+
				"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"+"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"+"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$")){
                    editTextEmail.requestFocus();
                    editTextEmail.setError("Please enter valid email address");
                }

                else{
                    Toast.makeText(MainActivity.this,"Registration Succesfull",Toast.LENGTH_LONG).show();
                    setContentView(R.layout.activity_doc_prof);
                    choco_display=(TextView)findViewById(R.id.display_choco);

                    choco_display.setText("Specialization:"+String.valueOf(choco.getSelectedItem()));

                    docReg();

                }
            }
        });


    }

/*
    public void docReg(View view){
        /*
        Intent intent=new Intent(this,DocProf.class);
        startActivity(intent);
        */

       // Intent i = new Intent(getApplicationContext(),DocProf.class);
      //  startActivity(i);


   // }



public void docReg(){
        /*
        Intent intent=new Intent(this,DocProf.class);
        startActivity(intent);
        */

        Intent i = new Intent(getApplicationContext(),DocProf.class);
         startActivity(i);


        }


}



