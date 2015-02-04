/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SGDE.Math;

import java.util.Arrays;

/**
 *
 * @author Nekel
 */
public class Matrix {
    private float[][] data;
    private float[][] trans;
    private int r,c;
    
    public Matrix(){
        data = new float[0][0];
        r=0;
        c=0;
        trans = new float[0][0];
    }
    
    public Matrix(float[][] data){
        this.data=new float[data.length][data[0].length];
        for(int i=0; i<data.length; i++){
            System.arraycopy(data[i], 0, this.data[i], 0, data[i].length);
        }
        trans = transpose(this.data);
        this.r = data.length;
        this.c = data[0].length;
    }
    
    /**
     * takes in a transposed vector and multiplies it by this matrix. If there is a problem, it will return null;
     * @param vector a 1D float array of the same length as the number of columns of this matrix
     * @return 
     */
    public float[] vectorMult(float[] vector){
        if(vector.length != c ){
            return null;
        }
        
        float[] ret = new float[r];
        
        for(int i=0; i<r; i++){
            float numi = 0f;
            for(int j=0; j<ret.length; j++){
                numi += vector[j] * this.data[i][j];
            }
            ret[i]=numi;
        }
        return ret;
    }
    
    
    public Matrix multiply(Matrix m){
        if(this.r != m.c){
            return null;
        }
        Matrix ret= new Matrix();
        float[][] ndata = multiplyf(m);
        ret.data = ndata;
        ret.r = ndata.length;
        ret.c = ndata[0].length;
        ret.trans = transpose(ndata);
        return ret;
    }
    public float[][] multiplyf(Matrix m){
        if(this.r != m.c){
            return null;
        }
        float[][] ndata = new float[this.r][m.c];
        for(int i=0; i<ndata.length; i++){
            for(int j=0; j<ndata[i].length; j++){
                float sum=0;
                for(int k=0; k<this.c; k++){
                    sum += this.data[i][k] * m.trans[j][k];
                }
                ndata[i][j] = sum;
            }
        }
        return ndata;
    }
    
    public Matrix add(Matrix m){
        if(this.r != m.r || this.c != m.c){
            return null;
        }
        float[][] ndata = new float[this.r][this.c];
        for(int i=0; i<ndata.length; i++){
            for(int j=0; j<ndata[i].length; j++){
                ndata[i][j] = this.data[i][j]+m.data[i][j];
            }
        }
        Matrix ret= new Matrix();
        ret.data = ndata;
        ret.r = ndata.length;
        ret.c = ndata[0].length;
        ret.trans = transpose(ndata);
        return ret;
    }
    
    
    private float[][] transpose(float[][] data){
        float[][] tr = new float[data[0].length][data.length];
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[i].length; j++){
                tr[j][i] = data[i][j];
            }
        }
        return tr;
    }
    
    public float[][] transpose(){
        return this.trans;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Arrays.deepHashCode(this.data);
        hash = 89 * hash + this.r;
        hash = 89 * hash + this.c;
        return hash;
    }
    
    public boolean equals(Object m){
        if(!(m instanceof Matrix)){
            return false;
        }
        Matrix o = (Matrix)m;
        if(o.r != this.r || o.c != this.c){
            return false;
        }
        
        for(int i=0; i< this.r; i++){
            for(int j=0; j<this.c; j++){
                if(! AMath.equals(this.data[i][j], o.data[i][j])){
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
