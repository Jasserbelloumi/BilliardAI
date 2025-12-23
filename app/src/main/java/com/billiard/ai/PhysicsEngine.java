package com.billiard.ai;

public class PhysicsEngine {

    public static class Vec2 {
        public double x, y;
        public Vec2(double x, double y){ this.x=x; this.y=y; }
    }

    // حساب زاوية الضربة بين كرتين
    public static double angle(Vec2 from, Vec2 to){
        return Math.atan2(to.y - from.y, to.x - from.x);
    }

    // حساب القوة المثالية (مبسطة)
    public static double force(Vec2 from, Vec2 to){
        double dx = to.x - from.x;
        double dy = to.y - from.y;
        return Math.sqrt(dx*dx + dy*dy) * 0.12;
    }
}
