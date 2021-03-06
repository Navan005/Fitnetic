package com.example.fitnetic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UpdateActivity extends AppCompatActivity {

    private Button addExercise;
    private EditText nameEdit,desEdit,imageEdit;
    private RadioButton chestR,backR,bicepR,tricepR,legR,buttockR,absR,forearmR;
    DatabaseReference reffchest,reffback,refbicep,reftricep,refleg,refbuttock,refabs,refforearms;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        addExercise=(Button) findViewById(R.id.btnAddExercise) ;
        nameEdit=(EditText) findViewById(R.id.exName) ;
        desEdit=(EditText) findViewById(R.id.exDes) ;
        imageEdit=(EditText) findViewById(R.id.exIma) ;

        chestR = (RadioButton) findViewById(R.id.chest);
        backR = (RadioButton) findViewById(R.id.back);
        bicepR = (RadioButton) findViewById(R.id.biceps);
        tricepR = (RadioButton) findViewById(R.id.triceps);
        legR = (RadioButton) findViewById(R.id.legs);
        buttockR = (RadioButton) findViewById(R.id.buttocks);
        absR = (RadioButton) findViewById(R.id.abs);
        forearmR = (RadioButton) findViewById(R.id.forearms);
        member=new Member();
        reffchest= FirebaseDatabase.getInstance().getReference().child("chest");
        reffback= FirebaseDatabase.getInstance().getReference().child("back");
        refbicep= FirebaseDatabase.getInstance().getReference().child("biceps");
        reftricep= FirebaseDatabase.getInstance().getReference().child("triceps");
        refleg= FirebaseDatabase.getInstance().getReference().child("legs");
        refbuttock= FirebaseDatabase.getInstance().getReference().child("buttock");
        refabs= FirebaseDatabase.getInstance().getReference().child("abs");
        refforearms= FirebaseDatabase.getInstance().getReference().child("Forearms");

        addExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameStr=nameEdit.getText().toString();
                String desStr=desEdit.getText().toString();
                String imageStr=imageEdit.getText().toString();

                member.setName(nameStr);
                member.setDescription(desStr);
                member.setImage(imageStr);
                if(chestR.isChecked()) {
                    reffchest.push().setValue(member);
                }
                else if(backR.isChecked()){
                    reffback.push().setValue(member);
                }
                else if(bicepR.isChecked()){
                    refbicep.push().setValue(member);
                }
                else if(tricepR.isChecked()){
                    reftricep.push().setValue(member);
                }
                else if(legR.isChecked()){
                    refleg.push().setValue(member);
                }
                else if(buttockR.isChecked()){
                    refbuttock.push().setValue(member);
                }
                else if(absR.isChecked()){
                    refabs.push().setValue(member);
                }
                else if(forearmR.isChecked()){
                    refforearms.push().setValue(member);
                }
                Toast.makeText(getBaseContext(), "Done" , Toast.LENGTH_SHORT ).show();
            }
        });

    }
}