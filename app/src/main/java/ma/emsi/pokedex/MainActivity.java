package ma.emsi.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;


import ma.emsi.pokedex.models.Pokemon;
import ma.emsi.pokedex.models.PokemonRequest;
import ma.emsi.pokedex.pokeapi.PokeapiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "POKEDEX";
    private Retrofit retrofit;

    private RecyclerView recyclerView;
    private ListPokemonAdapter listPokemonAdapter;

    private int offset;

    private boolean fitToCharge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        listPokemonAdapter = new ListPokemonAdapter(this);
        recyclerView.setAdapter(listPokemonAdapter);
        recyclerView.setHasFixedSize(true);
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (dy > 0) {
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstVisibleItemPosition();

                    if (fitToCharge) {
                        if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
                            Log.i(TAG, " We reached the end.");

                            fitToCharge = false;
                            offset += 20;
                            getInformation(offset);
                        }
                    }
                }
            }
        });


        retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        fitToCharge = true;
        offset = 0;
        getInformation(offset);
    }

    private void getInformation(int offset) {
        PokeapiService service = retrofit.create(PokeapiService.class);

        Call<PokemonRequest> pokemonRequestCall = service.obtenerListPokemon(20, offset);

        pokemonRequestCall.enqueue(new Callback<PokemonRequest>() {
            @Override
            public void onResponse(Call<PokemonRequest> call, Response<PokemonRequest> response) {
                fitToCharge = true;
                if(response.isSuccessful())
                {
                    PokemonRequest pokemonRequest = response.body();
                    ArrayList<Pokemon> listPokemon = pokemonRequest.getResults();

                    listPokemonAdapter.addListPokemon(listPokemon);
                }else{
                    Log.e(TAG, "onResponse: " +response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<PokemonRequest> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());

            }
        });

    }

}