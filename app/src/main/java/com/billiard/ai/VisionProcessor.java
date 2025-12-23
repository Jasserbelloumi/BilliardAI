package com.billiard.ai;

import org.opencv.core.Mat;
import java.util.List;

public class VisionProcessor {
    public static class Ball { public double x,y,r; public Ball(double x,double y,double r){this.x=x; this.y=y; this.r=r;} }
    public static class Pocket { public double x,y; public Pocket(double x,double y){this.x=x; this.y=y;} }

    public static List<Ball> detectBalls(Mat frame){
        return java.util.Collections.emptyList(); // TODO: HoughCircles أو color detection
    }

    public static List<Pocket> detectPockets(Mat frame){
        return java.util.Collections.emptyList(); // TODO: contours/zones detection
    }
}
