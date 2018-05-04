package com.example.amin_elhasan.convenience2.Remote;

import com.example.amin_elhasan.convenience2.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Amin_Elhasan on 5/1/2018.
 */

public interface IGoogleAPIService
{
    @GET
    Call<MyPlaces> getNearbyPlaces(@Url String url);
}
