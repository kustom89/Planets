package co.httpsswapi.planets2.networks.planets.planets;

import co.httpsswapi.planets2.models.Planet;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetPlanets {

    @GET("/planets/{id}")
    Call<Planet[]> getPlanet(@Query("count")int count);
}
