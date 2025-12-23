package com.billiard.ai;

import org.opencv.core.Mat;
import java.util.List;

public class VisionProcessor {
    // stub: هنا نضع طرق لتحليل إطار الصورة (Mat) وإعادة قائمة الكرات وحفر الطاولة
    public static class Ball { public double x,y,r; public Ball(double x,double y,double r){this.x=x;this.y=y;this.r=r;} }
    public static class Pocket { public double x,y; public Pocket(double x,double y){this.x=x;this.y=y;} }

    public static List<Ball> detectBalls(Mat frame){
        // TODO: استخدم OpenCV HoughCircles أو color segmentation
        return java.util.Collections.emptyList();
    }

    public static List<Pocket> detectPockets(Mat frame){
        // TODO: اكتشاف زوايا الطاولة والحفر عبر contours
        return java.util.Collections.emptyList();
    }
}
