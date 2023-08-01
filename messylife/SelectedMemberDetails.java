package com.example.messylife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SelectedMemberDetails extends AppCompatActivity {
    TextView tv01,fname, lname, age;
    FirebaseDatabase db;
    DatabaseReference reference;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_member_details);
            tv01=(TextView) findViewById(R.id.textView1);
            String s1 = getIntent().getStringExtra("username");
            String s3 = s1;
            tv01.setText(s3);





    }
}