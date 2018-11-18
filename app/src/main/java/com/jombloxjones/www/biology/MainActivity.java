package com.jombloxjones.www.biology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.jombloxjones.www.biology.R.id.user;

public class MainActivity extends AppCompatActivity {
    Button bakbut, archa, proto, fungi, plant, anim, keluar;
    Intent getData;
    String str_user;
    TextView user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
        getData=getIntent();
        str_user=getData.getStringExtra("username");
        user.setText("Hallo"+str_user);

    }
    public void setUp(){
        bakbut=(Button)findViewById(R.id.bakteri);
        keluar=(Button)findViewById(R.id.exit);
        archa=(Button)findViewById(R.id.archa);
        proto=(Button)findViewById(R.id.proto);
        fungi=(Button)findViewById(R.id.fungi);
        plant=(Button)findViewById(R.id.plant);
        anim=(Button)findViewById(R.id.anim);



    }
    public void bakteri(View view){
        Intent tekan = new Intent(this,Eubacteria.class);
        MainActivity.this.finish();
        startActivity(tekan);
    }
    public void exit(View view){
        MainActivity.this.finish();
    }
    public void archa(View view){
        Intent archa =new Intent(this,Archabacteria.class);
        MainActivity.this.finish();
        startActivity(archa);
    }
    public void proto(View view){
        Intent proto =new Intent(this,Protozoa.class);
        MainActivity.this.finish();
        startActivity(proto);
    }
    public void fungi(View view){
        Intent fungi =new Intent(this,Fungi.class);
        MainActivity.this.finish();
        startActivity(fungi);
    }
    public void plant(View view){
        Intent plant =new Intent(this,Plantae.class);
        MainActivity.this.finish();
        startActivity(plant);
    }
    public void anim(View view){
        Intent anim =new Intent(this,Animalia.class);
        MainActivity.this.finish();
        startActivity(anim);
    }


}
