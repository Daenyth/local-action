package sunlight;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ram45 on 3/2/2017.
 */

public class SunlightApi {
    public static JSONObject getReps(String zipcode) throws IOException, JSONException {


        OkHttpClient client = new OkHttpClient();

        String url = "https://congress.api/sunlightfoundation.com/legislators/locate?zip=" + zipcode;
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        String jsonStr =  response.body().string();
        return new JSONObject(jsonStr);
    }
}
