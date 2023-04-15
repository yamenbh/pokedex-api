package ma.emsi.pokedex.pokeapi;

import retrofit2.Call;
import ma.emsi.pokedex.models.PokemonRequest;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeapiService {
    @GET("pokemon")
    Call<PokemonRequest> obtenerListPokemon(@Query("limit") int limit, @Query("offset") int offset);
}
