package co.httpsswapi.planets2.networks.planets.planets;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PlanetsInterceptor {

    public static final String BASE_URL="https://swapi.co/api/planets";

    public GetPlanets get(){

        Retrofit interceptor = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetPlanets getPlanets= interceptor.create(GetPlanets.class);

        return getPlanets;


    }
}
