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
    
    public Polygon(Vector3[] points, int numpoints, Vector3 normal) throws Exception{
        this.points = points;
        this.normal = normal;
        this.numpoints = numpoints;
        if(numpoints < 3){
            throw new Exception("Polygons must have at least 3 points!!");
        }
    }
    
    public Polygon(Vector3[] points) throws Exception{
        this.points = points;
        this.numpoints = points.length;
        if(numpoints < 3){
            throw new Exception("Polygons must have at least 3 points!!");
        }
        //I'm going to assume it's safe to construct a vector from first point to second, and first to last, then cross
        Vector3 first = points[1].subtractn(points[0]);
        Vector3 last = points[points.length-1].subtractn(points[0]);
        this.normal = first.crossProduct(last);
    }

    public Vector3[] getPoints() {
        return points;
    }

    public int getNumpoints() {
        return numpoints;
    }

    public Vector3 getNormal() {
        return normal;
    }
    
}
