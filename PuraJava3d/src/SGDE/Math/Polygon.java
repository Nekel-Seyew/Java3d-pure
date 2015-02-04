/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SGDE.Math;

import java.awt.Point;

/**
 *
 * @author Nekel
 */
public class Polygon {
    Vector3[] points;
    int numpoints;
    Vector3 normal;
    
    public Polygon(Vector3[] points, int numpoints, Vector3 normal){
        this.points = points;
        this.normal = normal;
        this.numpoints = numpoints;
    }
    
    public Point[] getProjection(Vector3 cameraDirection, float planeA, float planeB, float planeC, Vector3 planeNormal){
        if(cameraDirection.getAngle(this.normal) < 90){
            return new Point[]{};
        }
        Point[] ret = new Point[points.length];
        
        //TODO: fill in rest
        
        return ret;
    }
    
}
