package firebase.android.myinfo.tourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ContentAdapter contentAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Tour> tours = new ArrayList<Tour>();

        Tour tour =new Tour();
        tour.setName("1 Sugar Loaf");
        tour.setDescription(getResources().getString(R.string.desc));
        tour.setLocation(" Rio de Janeiro");
        tour.setImage(R.drawable.sugarloaf);
        tours.add(tour);


        Tour tour1 =new Tour();
        tour1.setName("2 Cristo Redentor");
        tour1.setDescription( getResources().getString(R.string.desc2));

        tour1.setLocation(" Rio de Janeiro");
        tour1.setImage(R.drawable.cristo);
        tours.add(tour1);

        Tour tour2 =new Tour();
        tour2.setName("3 Carnaval");
        tour2.setDescription(getResources().getString(R.string.desc2));
        tour2.setLocation(" Rio de Janeiro");
        tour2.setImage(R.drawable.carnival);
        tours.add(tour2);
//
//

        Tour tour3 =new Tour();
        tour3.setName("4 Iguaçu Falls");
        tour3.setDescription(getResources().getString(R.string.desc));
        tour3.setLocation(" Sao paulo");
        tour3.setImage(R.drawable.foz);
        tours.add(tour3);
//
//
//
        Tour tour4=new Tour();
        tour4.setName("5 Copacabana");
        tour4.setDescription(getResources().getString(R.string.desc));

        tour4.setLocation(" Rio de Janeiro");
        tour4.setImage(R.drawable.copacabana);
        tours.add(tour4);


        Tour tour5=new Tour();
        tour5.setName("6 Amazon Rain Forests");
        tour5.setDescription(getResources().getString(R.string.desc));
        tour5.setLocation(" fliamengo");
        tour5.setImage(R.drawable.amazon);
        tours.add(tour5);
        contentAdapter = new ContentAdapter(this, tours);
        recyclerView.setAdapter(contentAdapter);


//

    }
}
