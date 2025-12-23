package com.billiard.ai;

import java.util.List;

public class ShotPlanner {
    public static class TableState {
        public List<VisionProcessor.Ball> balls;
        public TableState(List<VisionProcessor.Ball> b){ balls = b; }
    }

    public static String stateToJson(TableState s){
        // TODO: تحويل الحالة إلى JSON لإرسالها لـ AIServerClient
        return "{}";
    }
}
