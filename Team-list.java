package com.example.runtimebattle;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import static android.app.PendingIntent.getActivity;


public class team_list extends AppCompatActivity implements View.OnClickListener {
   private TextView timer1;
   public Button s1;
   private Button p1;
   private Button r1;
   private EditText m1;
   private CountDownTimer countDownTimer1;
   private long timeLeftInMilliseconds1=60000;//10mins
   private boolean timeRunning1;
   //private static final long mStartTimeinmillis = 0;    a const var
   private long mStartTimeinmillis1;

   private TextView timer2;
   private Button s2;
   private Button p2;
   private Button r2;
   private EditText m2;
   private CountDownTimer countDownTimer2;
   private long timeLeftInMilliseconds2=60000;//10mins
   private boolean timeRunning2;
   //private static final long mStartTimeinmillis = 0;    a const var
   private long mStartTimeinmillis2;


   private TextView timer3;
   private Button s3;
   private Button p3;
   private Button r3;
   private EditText m3;
   private CountDownTimer countDownTimer3;
   private long timeLeftInMilliseconds3=60000;//10mins
   private boolean timeRunning3;
   //private static final long mStartTimeinmillis = 0;    a const var
   private long mStartTimeinmillis3;


   private TextView timer4;
   private Button s4;
   private Button p4;
   private Button r4;
   private EditText m4;
   private CountDownTimer countDownTimer4;
   private long timeLeftInMilliseconds4=60000;//10mins
   private boolean timeRunning4;
   //private static final long mStartTimeinmillis = 0;    a const var
   private long mStartTimeinmillis4;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_team_list);//activity hi galat jaga thi

       timer1 = findViewById((R.id.timer1));
       s1 = (Button)findViewById(R.id.s1);//to find where s1 is declared ctrl+b
       p1 = findViewById(R.id.p1);
       r1 = findViewById(R.id.r1);
       m1 = findViewById(R.id.m1);
       s1.setOnClickListener(this);
       p1.setOnClickListener(this);
       r1.setOnClickListener(this);
       updateTimer1();

       timer2 = findViewById((R.id.timer2));
       s2 = findViewById(R.id.s2);
       p2 = findViewById(R.id.p2);
       r2 = findViewById(R.id.r2);
       m2 =(EditText) findViewById(R.id.m2);
       s2.setOnClickListener(this);
       p2.setOnClickListener(this);
       r2.setOnClickListener(this);
       updateTimer2();


       timer3 = findViewById((R.id.timer3));
       s3 = findViewById(R.id.s3);
       p3 = findViewById(R.id.p3);
       r3 = findViewById(R.id.r3);
       m3 = findViewById(R.id.m3);
       s3.setOnClickListener(this);
       p3.setOnClickListener(this);
       r3.setOnClickListener(this);
       updateTimer3();

       timer4=findViewById((R.id.timer4));
       s4=findViewById(R.id.s4);
       p4=findViewById(R.id.p4);
       r4 = findViewById(R.id.r4);
       m4=findViewById(R.id.m4);
       s4.setOnClickListener(this);
       p4.setOnClickListener(this);
       r4.setOnClickListener(this);
       updateTimer4();

   }


   public void starttimer1(){
       countDownTimer1=new CountDownTimer(timeLeftInMilliseconds1,1000) {
           @Override
           public void onTick(long l) {
               timeLeftInMilliseconds1=l;
               updateCountDownText1();
           }

           @Override
           public void onFinish() {

           }
       }.start();


       timeRunning1=true;
   }
   public void stopTimer1(){
       countDownTimer1.cancel();

       timeRunning1=false;
   }

   public void updateTimer1(){
       int minutes=(int)timeLeftInMilliseconds1/60000;
       int seconds=(int)(timeLeftInMilliseconds1%60000)/1000;

       String timeleftext;
       timeleftext=" "+minutes;
       timeleftext=":";
       if(seconds<10)
       {
           timeleftext+="0";

       }
       timeleftext+=seconds;

       timer1.setText(timeleftext);
   }

   private void settimer1(long milliseconds){
       mStartTimeinmillis1=milliseconds;
       timeLeftInMilliseconds1=mStartTimeinmillis1;
       updateCountDownText1();

   }
   private void updateCountDownText1(){
       int hours=(int)((timeLeftInMilliseconds1/1000)/60)/60;
       int minutes=(int)(timeLeftInMilliseconds1/1000)%3600/60;
       int seconds=(int)(timeLeftInMilliseconds1/1000)%60;

       String timeformat;
       if(hours>0)
       {
           timeformat=String.format(Locale.getDefault(),"%d:%02d:%02d",hours,minutes,seconds );
       }else
           timeformat=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
       timer1.setText(timeformat);
   }


   public void starttimer2(){
       countDownTimer2=new CountDownTimer(timeLeftInMilliseconds2,1000) {
           @Override
           public void onTick(long l) {
               timeLeftInMilliseconds2=l;
               updateCountDownText2();
           }

           @Override
           public void onFinish() {

           }
       }.start();


       timeRunning2=true;
   }
   public void stopTimer2(){
       countDownTimer2.cancel();

       timeRunning2=false;
   }

   public void updateTimer2(){
       int minutes=(int)timeLeftInMilliseconds2/60000;
       int seconds=(int)(timeLeftInMilliseconds2%60000)/1000;

       String timeleftext;
       timeleftext=" "+minutes;
       timeleftext=":";
       if(seconds<10)
       {
           timeleftext+="0";

       }
       timeleftext+=seconds;

       timer2.setText(timeleftext);
   }

   private void settimer2(long milliseconds){
       mStartTimeinmillis2=milliseconds;
       timeLeftInMilliseconds2=mStartTimeinmillis2;
       updateCountDownText2();

   }
   private void updateCountDownText2(){
       int hours=(int)((timeLeftInMilliseconds2/1000)/60)/60;
       int minutes=(int)(timeLeftInMilliseconds2/1000)%3600/60;
       int seconds=(int)(timeLeftInMilliseconds2/1000)%60;

       String timeformat;
       if(hours>0)
       {
           timeformat=String.format(Locale.getDefault(),"%d:%02d:%02d",hours,minutes,seconds );
       }else
           timeformat=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
       timer2.setText(timeformat);
   }
   @Override
   public void onClick(View v) {
       if(v==s1)
           starttimer1();
       if(v==p1)
           stopTimer1();
       if(v==r1) {
           String input = m1.getText().toString();
           if (input.length() == 0) {
               Toast.makeText(team_list.this, "Field can't be empty...", Toast.LENGTH_SHORT).show();
               return;
           }
           long millisInput = Long.parseLong(input) * 60000;
           if (millisInput == 0) {
               Toast.makeText(team_list.this, "Please enter a positive number", Toast.LENGTH_SHORT).show();
               return ;
           }
           settimer1(millisInput);
           m1.setText("");
       }
       if(v==s2)
           starttimer2();
       if(v==p2)
           stopTimer2();
       if(v==r2) {
           String input = m2.getText().toString();
           if (input.length() == 0) {
               Toast.makeText(team_list.this, "Field can't be empty...", Toast.LENGTH_SHORT).show();
               return;
           }
           long millisInput = Long.parseLong(input) * 60000;
           if (millisInput == 0) {
               Toast.makeText(team_list.this, "Please enter a positive number", Toast.LENGTH_SHORT).show();
               return;
           }
           settimer2(millisInput);
           m2.setText("");
       }
       if(v==s3)
           starttimer3();
       if(v==p3)
           stopTimer3();
       if(v==r3) {
           String input = m3.getText().toString();
           if (input.length() == 0) {
               Toast.makeText(team_list.this, "Field can't be empty...", Toast.LENGTH_SHORT).show();
               return;
           }
           long millisInput = Long.parseLong(input) * 60000;
           if (millisInput == 0) {
               Toast.makeText(team_list.this, "Please enter a positive number", Toast.LENGTH_SHORT).show();
               return ;
           }
           settimer3(millisInput);
           m3.setText("");
       }
       if(v==s4)
           starttimer4();
       if(v==p4)
           stopTimer4();
       if(v==r4) {
           String input = m4.getText().toString();
           if (input.length() == 0) {
               Toast.makeText(team_list.this, "Field can't be empty...", Toast.LENGTH_SHORT).show();
               return;
           }
           long millisInput = Long.parseLong(input) * 60000;
           if (millisInput == 0) {
               Toast.makeText(team_list.this, "Please enter a positive number", Toast.LENGTH_SHORT).show();
               return ;
           }
           settimer4(millisInput);
           m4.setText("");
       }
   }

   public void starttimer3(){
       countDownTimer3=new CountDownTimer(timeLeftInMilliseconds3,1000) {
           @Override
           public void onTick(long l) {
               timeLeftInMilliseconds3=l;
               updateCountDownText3();
           }

           @Override
           public void onFinish() {

           }
       }.start();


       timeRunning3=true;
   }
   public void stopTimer3(){
       countDownTimer3.cancel();

       timeRunning3=false;
   }

   public void updateTimer3(){
       int minutes=(int)timeLeftInMilliseconds3/60000;
       int seconds=(int)(timeLeftInMilliseconds3%60000)/1000;

       String timeleftext;
       timeleftext=" "+minutes;
       timeleftext=":";
       if(seconds<10)
       {
           timeleftext+="0";

       }
       timeleftext+=seconds;

       timer3.setText(timeleftext);
   }

   private void settimer3(long milliseconds){
       mStartTimeinmillis3=milliseconds;
       timeLeftInMilliseconds3=mStartTimeinmillis3;
       updateCountDownText3();

   }
   private void updateCountDownText3(){
       int hours=(int)((timeLeftInMilliseconds3/1000)/60)/60;
       int minutes=(int)(timeLeftInMilliseconds3/1000)%3600/60;
       int seconds=(int)(timeLeftInMilliseconds3/1000)%60;

       String timeformat;
       if(hours>0)
       {
           timeformat=String.format(Locale.getDefault(),"%d:%02d:%02d",hours,minutes,seconds );
       }else
           timeformat=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
       timer3.setText(timeformat);
   }


   public void starttimer4(){
       countDownTimer4=new CountDownTimer(timeLeftInMilliseconds4,1000) {
           @Override
           public void onTick(long l) {
               timeLeftInMilliseconds4=l;
               updateCountDownText4();
           }

           @Override
           public void onFinish() {

           }
       }.start();


       timeRunning4=true;
   }
   public void stopTimer4(){
       countDownTimer4.cancel();

       timeRunning4=false;
   }

   public void updateTimer4(){
       int minutes=(int)timeLeftInMilliseconds4/60000;
       int seconds=(int)(timeLeftInMilliseconds4%60000)/1000;

       String timeleftext;
       timeleftext=" "+minutes;
       timeleftext=":";
       if(seconds<10)
       {
           timeleftext+="0";

       }
       timeleftext+=seconds;

       timer4.setText(timeleftext);
   }

   private void settimer4(long milliseconds){
       mStartTimeinmillis4=milliseconds;
       timeLeftInMilliseconds4=mStartTimeinmillis4;
       updateCountDownText4();

   }
   private void updateCountDownText4(){
       int hours=(int)((timeLeftInMilliseconds4/1000)/60)/60;
       int minutes=(int)(timeLeftInMilliseconds4/1000)%3600/60;
       int seconds=(int)(timeLeftInMilliseconds4/1000)%60;

       String timeformat;
       if(hours>0)
       {
           timeformat=String.format(Locale.getDefault(),"%d:%02d:%02d",hours,minutes,seconds );
       }else
           timeformat=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
       timer4.setText(timeformat);
   }




}


