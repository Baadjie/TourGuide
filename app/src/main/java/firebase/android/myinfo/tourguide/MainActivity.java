package firebase.android.myinfo.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Animation animFadeIn, animFadeout;
    private ImageView ImageHomepage;
    private Button btnPlaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageHomepage= (ImageView) findViewById(R.id.imageView);

        btnPlaces= (Button) findViewById(R.id.button2);
        btnPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        animate();
    }

    public void animate(){
        animFadeIn=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        ImageHomepage.startAnimation(animFadeIn);
    }



}
