package com.billiard.ai;

import okhttp3.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AIServerClient {
    private static final OkHttpClient client = new OkHttpClient();

    public static String getApiKey(){
        String k = System.getenv("OPENROUTER_API_KEY");
        if(k != null && !k.isBlank()) return k;
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("secret.properties"));
            return p.getProperty("OPENROUTER_API_KEY");
        } catch (Exception e){
            return null;
        }
    }

    // مثال طلب بسيط لواجهة chat/completions
    public static String askOpenRouter(String jsonPayload) throws IOException {
        String apiKey = getApiKey();
        if(apiKey == null) throw new IllegalStateException("OPENROUTER_API_KEY not set");

        RequestBody body = RequestBody.create(jsonPayload, MediaType.get("application/json"));
        Request req = new Request.Builder()
            .url("https://api.openrouter.ai/v1/chat/completions")
            .addHeader("Authorization", "Bearer " + apiKey)
            .post(body)
            .build();

        try (Response resp = client.newCall(req).execute()) {
            if (!resp.isSuccessful()) throw new IOException("Unexpected code: " + resp);
            return resp.body() != null ? resp.body().string() : null;
        }
    }
}
