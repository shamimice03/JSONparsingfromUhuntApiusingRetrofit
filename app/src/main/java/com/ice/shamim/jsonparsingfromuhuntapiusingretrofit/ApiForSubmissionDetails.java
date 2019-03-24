package com.ice.shamim.jsonparsingfromuhuntapiusingretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiForSubmissionDetails {

    String BASE_URL_Submission_details = "https://uhunt.onlinejudge.org/api/subs-user/";
    @GET
    Call<SubmissionDetailsModelClass> getValue(@Url String url); ///for dynamic access.
}
