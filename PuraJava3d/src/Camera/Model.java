/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Camera;

import SGDE.Math.Polygon;
import java.util.ArrayList;

/**
 *
 * @author Nekel
 */
public class Model {
    ArrayList<Polygon> faces;
    ArrayList<Texture> textures;
    
    public Model(){
        faces = new ArrayList<Polygon>();
        textures = new ArrayList<Texture>();
    }
    
    public Model(String file){
        this();
        
    }
}
