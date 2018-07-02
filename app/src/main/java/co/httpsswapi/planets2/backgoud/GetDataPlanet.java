package co.httpsswapi.planets2.backgoud;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

import co.httpsswapi.planets2.models.Planet;
import co.httpsswapi.planets2.networks.planets.planets.GetPlanets;
import co.httpsswapi.planets2.networks.planets.planets.PlanetsInterceptor;
import retrofit2.Call;

public class GetDataPlanet extends AsyncTask<Void, Void, List<Planet>> {

    private final GetPlanets request= new PlanetsInterceptor().get();


    @Override
    protected List <Planet> doInBackground(Void... voids) {
        List<Planet> planets= new ArrayList <>();

        Call <Planet[]> call= request.getPlanet(61);
        return null;
    }
}
