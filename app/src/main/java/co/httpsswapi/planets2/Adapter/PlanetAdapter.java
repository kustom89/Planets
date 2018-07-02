package co.httpsswapi.planets2.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import co.httpsswapi.planets2.R;
import co.httpsswapi.planets2.models.Planet;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.ViewHolder>{

    private List<Planet> planetList = new ArrayList<>();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.planet_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder Holder, int position) {
        Planet planet = planetList.get(position);
        TextView namePlanet = Holder.name;

    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    public  void update(List<Planet> planets){
        planetList.addAll(planets);
        notifyDataSetChanged();


    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, diameter;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name= itemView.findViewById(R.id.nameTv);
            diameter=itemView.findViewById(R.id.diameterTv);
        }
    }
}
