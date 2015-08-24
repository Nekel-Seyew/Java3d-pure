/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Camera;

import SGDE.Math.Matrix;
import SGDE.Math.Polygon;
import SGDE.Math.Vector2;
import SGDE.Math.Vector3;
import java.awt.Point;

/**
 *
 * @author Nekel
 */
public class Camera {
    Vector3 direction;
    Vector3 position;
    Vector3 up;
    
    Vector3 taitBryan;
    
    Vector3 eye;
    
    boolean hasBeenReset = true;
    
    Matrix rotTransMatrix;
    
    Vector2 projSurfaceSize;
    Vector2 resolution;
    
    public Camera(){
        direction = new Vector3(0,0,-1);
        position = new Vector3();
        up = new Vector3(0,1,0);
        eye = new Vector3(0,0,-1);
        hasBeenReset = true;
        taitBryan = new Vector3();
    }
    
    public void reset(){
        this.hasBeenReset=true;
    }
    
    public Vector3 getDirection(){
        return this.direction;
    }
    public Vector3 getPosition(){
        return this.position;
    }
    public Vector3 getEye(){
        return this.eye;
    }

    public Vector2 getProjSurfaceSize() {
        return projSurfaceSize;
    }

    public Vector2 getResolution() {
        return resolution;
    }
    
    
    public Matrix getRotTransMatrix(){
        if(hasBeenReset){
            Matrix x = new Matrix(new float[][]{{1,0,0},
                                                {0,(float)Math.cos(-taitBryan.getX()),-(float)Math.sin(-taitBryan.getX())},
                                                {0,(float)Math.sin(-taitBryan.getX()),(float)Math.cos(-taitBryan.getX())}});
            Matrix z = new Matrix(new float[][]{{(float)Math.cos(-taitBryan.getZ()),-(float)Math.sin(-taitBryan.getZ()),0},
                                                {(float)Math.sin(-taitBryan.getZ()),(float)Math.cos(-taitBryan.getZ()),0},
                                                {0,0,1}});
            Matrix y = new Matrix(new float[][]{{(float)Math.cos(-taitBryan.getY()),0,(float)Math.sin(-taitBryan.getY())},
                                                {0,1,0},
                                                {-(float)Math.sin(-taitBryan.getY()),0,(float)Math.cos(-taitBryan.getY())}});
            
            rotTransMatrix = x.multiply(y.multiply(z));
            hasBeenReset=false;
        }
        return rotTransMatrix;
    }
    
    public Point[] perspectiveProject(Polygon p){
        if(this.direction.getAngle(p.getNormal()) < 90){
            return new Point[]{};
        }
        
        Point[] ret = new Point[p.getPoints().length];
        
        int i=0;
        for(Vector3 point : p.getPoints()){
            Vector3 diff = point.subtractn(this.position);
            float[] d = rotTransMatrix.vectorMult(diff.toArray3());
            int x = (int)((d[0]*this.resolution.getX())/(d[2]*this.projSurfaceSize.getX())*1);//this last one might be changed later, or encapsulated into a variable
            int y = (int)((d[1]*this.resolution.getY())/(d[2]*this.projSurfaceSize.getY())*1);
            Point pp = new Point(x,y);
            ret[i++]=pp;
        }
        
        return ret;
    }
    
}
