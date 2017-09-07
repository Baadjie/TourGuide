package firebase.android.myinfo.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent=getIntent();
        Tour contacts= (Tour) intent.getSerializableExtra("name");


        TextView tv;
        tv= (TextView) findViewById(R.id.textView5);
        tv.setText(""+contacts.getName() +"\n" +contacts.getDescription() +"\n"+contacts.getLocation());

        ImageView image2=(ImageView) findViewById(R.id.imageView2);
        //ImageSwitcher switcher= (ImageSwitcher) findViewById(R.id.imageView2);

        image2.setImageResource(contacts.getImage());
    }
}
