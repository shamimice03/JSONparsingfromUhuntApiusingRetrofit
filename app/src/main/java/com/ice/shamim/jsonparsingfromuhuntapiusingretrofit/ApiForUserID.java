package com.ice.shamim.jsonparsingfromuhuntapiusingretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiForUserID {

    String BASE_URL = "https://uhunt.onlinejudge.org/api/uname2uid/";
    @GET
    Call<Integer> getValue(@Url String url); ///for dynamic access.
}
