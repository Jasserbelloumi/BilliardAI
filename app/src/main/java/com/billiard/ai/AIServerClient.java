package com.billiard.ai;

import java.util.Properties;
import java.io.FileInputStream;

public class AIServerClient {

    public static String getApiKey(){
        String key = System.getenv("OPENROUTER_API_KEY");
        if(key != null) return key;

        try {
            Properties p = new Properties();
            p.load(new FileInputStream("secret.properties"));
            return p.getProperty("OPENROUTER_API_KEY");
        } catch(Exception e){
            return null;
        }
    }

    // Stub: هنا سيتم ربط الذكاء الاصطناعي لاحقًا
}
