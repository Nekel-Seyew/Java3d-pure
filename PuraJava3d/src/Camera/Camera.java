/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Camera;

import SGDE.Math.Vector3;

/**
 *
 * @author Nekel
 */
public class Camera {
    Vector3 direction;
    Vector3 position;
    Vector3 up;
    
    public Camera(){
        direction = new Vector3(0,0,-1);
        position = new Vector3();
        up = new Vector3(0,1,0);
    }
    
    
}
