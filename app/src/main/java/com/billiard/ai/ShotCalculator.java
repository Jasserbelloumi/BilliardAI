package com.billiard.ai;

public class ShotCalculator {

    public static ShotResult calculate(
        PhysicsEngine.Vec2 cue,
        PhysicsEngine.Vec2 target
    ){
        double angle = PhysicsEngine.angle(cue, target);
        double power = PhysicsEngine.force(cue, target);
        return new ShotResult(angle, power);
    }

    public static class ShotResult {
        public double angle;
        public double power;
        public ShotResult(double a, double p){
            angle = a; power = p;
        }
    }
}
