/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author Nekel
 */
public class Vector2 {
    private float x,y;
    
    public Vector2(){
        x =0.0f;
        y=0.0f;
    }

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;

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

    
    public float length(){
        return (float)Math.sqrt( x*x + y*y );
    }
    public float lengthSquared(){
        return ( x*x + y*y );
    }
    public float invLength(){
        return 1f/(float)Math.sqrt(x*x + y*y );
    }
    
    public void normalize(){
        float scalar = 1f/(float)Math.sqrt(x*x + y*y );
        this.x *= scalar;
        this.y *= scalar;
    }
    public Vector2 normalizen(){
        float scalar = 1f/(float)Math.sqrt(x*x + y*y );
        return new Vector2(x*scalar, y*scalar);
    }
    
    public void add(Vector2 v){
        this.x += v.x;
        this.y += v.y;
    }
    public Vector2 addn(Vector2 v){
        return new Vector2(this.x + v.x, this.y+v.y);
    }
    public void subtract(Vector2 v){
        this.x -= v.x;
        this.y -= v.y;
    }
    public Vector2 subtractn(Vector2 v){
        return new Vector2(this.x - v.x, this.y-v.y);
    }
    
    public void dX(float x){
        this.x += x;
    }
    public void dY(float y){
        this.y +=y;
    }
    
    public float dotProduct(Vector2 v){
        return (this.x * v.x + this.y*v.y );
    }
    public Vector3 crossProduct(Vector2 v){
        float z;
        z=this.x*v.y-this.y*v.x;
        return new Vector3(0,0,z);
    }
    public float getAngle(Vector2 v){
        return AMath.acos((this.x * v.x + this.y*v.y )/(this.length()*v.length()));
    }
}
