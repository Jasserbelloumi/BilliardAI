package com.billiard.ai;

import okhttp3.*;
import java.io.IOException;

public class AIServerClient {
    private static final OkHttpClient client = new OkHttpClient();
    private static final String API_KEY = "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";

    public static String askOpenRouter(String jsonPayload) throws IOException {
        RequestBody body = RequestBody.create(jsonPayload, MediaType.get("application/json"));
        Request req = new Request.Builder()
            .url("https://api.openrouter.ai/v1/chat/completions")
            .addHeader("Authorization", "Bearer " + API_KEY)
            .post(body)
            .build();

        try (Response resp = client.newCall(req).execute()) {
            if (!resp.isSuccessful()) throw new IOException("Unexpected code: " + resp);
            return resp.body() != null ? resp.body().string() : null;
        }
    }
}
