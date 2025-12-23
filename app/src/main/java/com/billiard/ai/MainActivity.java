package com.billiard.ai;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);

        PhysicsEngine.Vec2 cue = new PhysicsEngine.Vec2(0,0);
        PhysicsEngine.Vec2 target = new PhysicsEngine.Vec2(120,60);

        ShotCalculator.ShotResult r =
            ShotCalculator.calculate(cue, target);

        System.out.println("ANGLE=" + r.angle);
        System.out.println("POWER=" + r.power);
    }
}
