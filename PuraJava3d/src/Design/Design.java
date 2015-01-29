/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

/**
 * Absolutely useless class, full of comments for myself.
 * @author Nekel
 */
public class Design {
    
    /*
     * For The actual design, you have three important things: Renderer, Camera, and Scene
     * 
     * You give the Renderer the camera and the scene, and it will render the scene for you.
     */
    
    /*
     * For the world coordinates, it is a 2x2x2 cube, going from [-1,1] in all three axis
     * 
     * X and Y are similar to the screen, except that instead of Y starting at 0 at the top, it is 1, and bottom of screen is -1.
     * 
     * Towards the user is -1 z and into the screen is 1 z
     */
    
    /*
     * Actually, you know what, read this section, replicate it:
     * 
     * http://en.wikipedia.org/wiki/3D_projection#Perspective_projection
     */
    
}
