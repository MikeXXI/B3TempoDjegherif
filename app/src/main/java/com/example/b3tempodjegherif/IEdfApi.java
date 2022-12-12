package com.example.b3tempodjegherif;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IEdfApi {
    @GET("services/rest/referentiel/getNbTempoDays")
    Call<TempoDaysLeft> getTempoDaysLeft(@Query("TypeAlerte") String alertType);
}
