package ng.com.aksugist;

/**
 * Created by Nsikak  Thompson on 11/3/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;



import ng.com.aksugist.model.feed_item;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private List<feed_item> feedList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgItem;
        TextView txtItem, description;

        public MyViewHolder(View view) {
            super(view);
            imgItem = (ImageView) view.findViewById(R.id.image);
            txtItem = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);

        }
    }


    public HomeAdapter(List<feed_item> feedList) {
        this.feedList = feedList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
       feed_item item = feedList.get(position);
        holder.imgItem.setImageResource(item.getImage());
        holder.txtItem.setText(item.getTitle());
        if(item.getDescription() != null){
         holder.description.setVisibility(View.VISIBLE);
            holder.description.setText(item.getDescription());
        }

    }

    @Override
    public int getItemCount() {
        return feedList.size();
    }
}