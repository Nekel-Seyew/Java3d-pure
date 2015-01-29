/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Camera;

import Math.Vector3;

/**
 *
 * @author Nekel
 */
public class Camera {
    Vector3 direction;
    
    public Camera(){
        direction = new Vector3(0,0,1);
    }
}
