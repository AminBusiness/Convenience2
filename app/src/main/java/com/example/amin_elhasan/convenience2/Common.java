package com.example.amin_elhasan.convenience2;

import com.example.amin_elhasan.convenience2.Remote.IGoogleAPIService;
import com.example.amin_elhasan.convenience2.Remote.RetrofitClient;

/**
 * Created by Amin_Elhasan on 5/1/2018.
 */

public class Common
{
    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    private static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
