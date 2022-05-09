package tiktok.oa2;

import org.json.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Solution {

    protected static final boolean SOLUTION_DONE = true;

    public int getPrice() throws IOException {
        URL url = new URL("http://192.168.1.226:3000/test");
        URLConnection connection = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder sb = new StringBuilder();
        while ((inputLine = br.readLine()) != null) {
            sb.append(inputLine);
        }
        System.out.println(sb.toString());
        br.close();

        JSONObject obj = new JSONObject(sb.toString());
        JSONArray infos = obj.getJSONArray("info");
        JSONObject info = infos.getJSONObject(0);
        int price = info.getInt("price");
        int discount = info.getInt("discount");

        System.out.println(price);
        System.out.println(discount);
        return 0;
    }
}
