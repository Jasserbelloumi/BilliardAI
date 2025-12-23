package com.billiard.ai;

import java.util.List;

public class ShotPlanner {
    public static class TableState {
        public List<PhysicsEngine.Vec2> balls;
        public ShotPlanner.TableState(List<PhysicsEngine.Vec2> b){ balls = b;}
    }

    // تحويل الحالة إلى JSON لإرسالها الى AIServerClient.askOpenRouter(...)
    public static String stateToJson(TableState s){
        // TODO: serialise to JSON (يمكن استخدام org.json أو gson لاحقًا)
        return "{}";
    }
}
