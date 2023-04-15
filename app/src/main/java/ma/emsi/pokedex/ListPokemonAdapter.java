package ma.emsi.pokedex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

import ma.emsi.pokedex.models.Pokemon;

public class ListPokemonAdapter extends RecyclerView.Adapter<ListPokemonAdapter.ViewHolder>{

    private ArrayList<Pokemon> dataset;

    private Context context;

    public ListPokemonAdapter(Context context){
        this.context = context;
        dataset = new ArrayList<>();
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Pokemon p = dataset.get(position);
        holder.namePoke.setText(p.getName());

        Glide.with(context)
                .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + p.getNumber() + ".png")
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imagePoke);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void addListPokemon(ArrayList<Pokemon> listPokemon) {
        dataset.addAll(listPokemon);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagePoke ;
        private TextView namePoke;

        public ViewHolder(View itemView) {
            super(itemView);

            imagePoke = (ImageView) itemView.findViewById(R.id.imagePoke);
            namePoke = (TextView) itemView.findViewById(R.id.namePoke);
        }
    }
}
