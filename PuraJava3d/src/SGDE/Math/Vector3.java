/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SGDE.Math;

/**
 *
 * @author Nekel
 */
public class Vector3 {
    private float x,y,z;
    
    public Vector3(){
        x=0.0f;
        y=0.0f;
        z=0.0f;
    }

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    public float length(){
        return (float)Math.sqrt( x*x + y*y + z*z );
    }
    public float lengthSquared(){
        return ( x*x + y*y + z*z );
    }
    public float invLength(){
        return 1f/(float)Math.sqrt(x*x + y*y + z*z);
    }
    
    public void normalize(){
        float scalar = 1f/(float)Math.sqrt(x*x + y*y + z*z);
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }
    public Vector3 normalizen(){
        float scalar = 1f/(float)Math.sqrt(x*x + y*y + z*z);
        return new Vector3(x*scalar, y*scalar,z*scalar);
    }
    
    public void add(Vector3 v){
        this.x += v.x;
        this.y += v.y;
        this.z += v.z;
    }
    public Vector3 addn(Vector3 v){
        return new Vector3(this.x + v.x, this.y+v.y, this.z+v.z);
    }
    public void subtract(Vector3 v){
        this.x -= v.x;
        this.y -= v.y;
        this.z -= v.z;
    }
    public Vector3 subtractn(Vector3 v){
        return new Vector3(this.x - v.x, this.y-v.y, this.z-v.z);
    }
    
    public void dX(float x){
        this.x += x;
    }
    public void dY(float y){
        this.y +=y;
    }
    public void dZ(float z){
        this.z +=z;
    }
    
    public float dotProduct(Vector3 v){
        return (this.x * v.x + this.y*v.y + this.z*v.z);
    }
    public Vector3 crossProduct(Vector3 v){
        float x,y,z;
        x=this.y*v.z-this.z*v.y;
        y=-1*(this.x*v.z-this.z*v.x);
        z=this.x*v.y-this.y*v.x;
        return new Vector3(x,y,z);
    }
    public float getAngle(Vector3 v){
        return AMath.acos((this.x * v.x + this.y*v.y + this.z*v.z)/(this.length()*v.length()));
    }
    
    public float[] toArray3(){
        return new float[]{x,y,z};
    }
    public float[] toArray4(float w){
        return new float[]{x,y,z,w};
    }
    
}
