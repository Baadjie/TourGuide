package firebase.android.myinfo.tourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Baadjie on 2017/08/16.
 */

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {


    Context context;
    List<Tour> contactList;

    public ContentAdapter(Context context, List<Tour> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public ContentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.tour_layout,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ContentAdapter.ViewHolder holder, int position) {
        final Tour contacts=contactList.get(position);

        holder.txtName.setText(contacts.getName());
        holder.txtLocation.setText(contacts.getLocation());
        holder.desc.setText(contacts.getDescription());

        holder.imgView.setImageResource(contacts.getImage());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,Main3Activity.class);
                intent.putExtra("name",contacts);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtName,txtLocation,desc;
        ImageView imgView;
        CardView card;
        public ViewHolder(View itemView) {
            super(itemView);

            txtName=(TextView) itemView.findViewById(R.id.textView);
            txtLocation= (TextView) itemView.findViewById(R.id.textView2);
            desc=(TextView)  itemView.findViewById(R.id.textView3);

            imgView= (ImageView) itemView.findViewById(R.id.imageView);
            card=(CardView) itemView.findViewById(R.id.cardView);
        }
    }
}
