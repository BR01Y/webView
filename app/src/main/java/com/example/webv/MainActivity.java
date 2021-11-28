package com.example.webv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout googleL,facebookL,pinterestL,instagramL,linkedinL,telegramL,spotify,youtubeL,
            whatsappL,twitchL,twitterL,discord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        googleL=findViewById(R.id.google);
        facebookL=findViewById(R.id.facebook);
        pinterestL=findViewById(R.id.pin);
        instagramL=findViewById(R.id.instagram);
        linkedinL=findViewById(R.id.link);
        telegramL=findViewById(R.id.tele);
        spotify=findViewById(R.id.spotify);
        youtubeL=findViewById(R.id.youT);
        whatsappL=findViewById(R.id.whats);
        twitchL=findViewById(R.id.twitch);
        twitterL=findViewById(R.id.twitter);
        discord=findViewById(R.id.discord);
        googleL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            String pass="google";
            intent.putExtra("keyURl", pass);
            startActivity(intent);
        });
        facebookL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "facebook");
            startActivity(intent);
        });
        pinterestL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "pin");
            startActivity(intent);
        });
        instagramL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "instagram");
            startActivity(intent);
        });
        linkedinL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "link");
            startActivity(intent);
        });
        telegramL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "tele");
            startActivity(intent);
        });
        spotify.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "spotify");
            startActivity(intent);
        });
        youtubeL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "youtube");
            startActivity(intent);
        });
        whatsappL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "whatsapp");
            startActivity(intent);
        });
        twitchL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "twitch");
            startActivity(intent);
        });
        twitterL.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "twitter");
            startActivity(intent);
        });
        discord.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,web2.class);
            intent.putExtra("keyURl", "discord");
            startActivity(intent);
        });

    }
}