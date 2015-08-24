/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SGDE.Math;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nekel
 */
public class Vector3Test {
    
    public Vector3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of getX method, of class Vector3.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Vector3 instance = new Vector3();
        float expResult = 0.0F;
        float result = instance.getX();
        assertEquals(expResult, result, 1e-5);
    }

    /**
     * Test of setX method, of class Vector3.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3();
        instance.setX(x);
        float result = instance.getX();
        assertEquals(x,result,1e-5);
    }

    /**
     * Test of getY method, of class Vector3.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        float expResult = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(0,expResult,0);
        float result = instance.getY();
        assertEquals(expResult, result, 1e-5);
    }

    /**
     * Test of setY method, of class Vector3.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3();
        instance.setY(y);
        float result = instance.getY();
        assertEquals(y, result, 1e-5);
    }

    /**
     * Test of getZ method, of class Vector3.
     */
    @Test
    public void testGetZ() {
        System.out.println("getZ");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(0,0,z);
        float result = instance.getZ();
        assertEquals(z, result, 1e-5);
    }

    /**
     * Test of setZ method, of class Vector3.
     */
    @Test
    public void testSetZ() {
        System.out.println("setZ");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3();
        instance.setZ(z);
        float result = instance.getZ();
        assertEquals(z, result, 1e-5);
    }

    /**
     * Test of length method, of class Vector3.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float expResult = (float)Math.sqrt(x*x + y*y + z*z);
        float result = instance.length();
        assertEquals(expResult, result, 1e-5);
    }

    /**
     * Test of lengthSquared method, of class Vector3.
     */
    @Test
    public void testLengthSquared() {
        System.out.println("lengthSquared");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float expResult = (x*x + y*y + z*z);
        float result = instance.lengthSquared();
        assertEquals(expResult, result, 1e-5);
    }

    /**
     * Test of invLength method, of class Vector3.
     */
    @Test
    public void testInvLength() {
        System.out.println("invLength");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float expResult = 1f/(float)Math.sqrt(x*x + y*y + z*z);
        float result = instance.invLength();
        assertEquals(expResult, result, 1e-5);
    }

    /**
     * Test of normalize method, of class Vector3.
     */
    @Test
    public void testNormalize() {
        System.out.println("normalize");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float length = (float)Math.sqrt(x*x + y*y + z*z);
        instance.normalize();
        assertEquals(z/length, instance.getZ(), 1e-5);
        assertEquals(y/length, instance.getY(), 1e-5);
        assertEquals(z/length, instance.getX(), 1e-5);
    }

    /**
     * Test of normalizen method, of class Vector3.
     */
    @Test
    public void testNormalizen() {
        System.out.println("normalizen");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float length = (float)Math.sqrt(x*x + y*y + z*z);
        Vector3 expResult = new Vector3(x/length,y/length,z/length);
        Vector3 result = instance.normalizen();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Vector3.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float z1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 v = new Vector3(x1,y1,z1);
        instance.add(v);
        assertEquals(z+z1, instance.getZ(), 1e-5);
        assertEquals(y+y1, instance.getY(), 1e-5);
        assertEquals(x+x1, instance.getX(), 1e-5);
    }

    /*
     * int size = sizeof(variable)
     * memset(&variable,0,size)
     */
    
    /**
     * Test of addn method, of class Vector3.
     */
    @Test
    public void testAddn() {
        System.out.println("addn");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float z1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 v = new Vector3(x1,y1,z1);
        Vector3 expResult = new Vector3(x+x1, y+y1, z+z1);
        Vector3 result = instance.addn(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class Vector3.
     */
    @Test
    public void testSubtract() {
       System.out.println("subtract");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float z1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 v = new Vector3(x1,y1,z1);
        instance.subtract(v);
        assertEquals(z-z1, instance.getZ(), 1e-5);
        assertEquals(y-y1, instance.getY(), 1e-5);
        assertEquals(x-x1, instance.getX(), 1e-5);
    }

    /**
     * Test of subtractn method, of class Vector3.
     */
    @Test
    public void testSubtractn() {
        System.out.println("subtractn");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float z1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 v = new Vector3(x1,y1,z1);
        Vector3 expResult = new Vector3(x-x1, y-y1, z-z1);
        Vector3 result = instance.subtractn(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of dX method, of class Vector3.
     */
    @Test
    public void testDX() {
        System.out.println("dX");
        float x1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float dx = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x1,0,0);
        instance.dX(dx);
        assertEquals((x1+dx),instance.getX(),1e-5);
    }

    /**
     * Test of dY method, of class Vector3.
     */
    @Test
    public void testDY() {
        System.out.println("dY");
        float y1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float dy = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(0,y1,0);
        instance.dY(dy);
        assertEquals((y1+dy),instance.getY(),1e-5);
    }

    /**
     * Test of dZ method, of class Vector3.
     */
    @Test
    public void testDZ() {
        System.out.println("dZ");
        float z1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float dz = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(0,0,z1);
        instance.dZ(dz);
        assertEquals((z1+dz),instance.getZ(),1e-5);
    }

    /**
     * Test of dotProduct method, of class Vector3.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float z1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 v = new Vector3(x1,y1,z1);
        float expResult = x1*x + y1*y + z1*z;
        float result = instance.dotProduct(v);
        assertEquals(expResult, result, 1e-5);
    }

    /**
     * Test of crossProduct method, of class Vector3.
     */
    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3 v = null;
        Vector3 instance = new Vector3();
        Vector3 expResult = null;
        Vector3 result = instance.crossProduct(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAngle method, of class Vector3.
     */
    @Test
    public void testGetAngle() {
        System.out.println("getAngle");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float z1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x1 = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 v = new Vector3(x1,y1,z1);
        float expResult = AMath.acos((x1*x+y1*y+z1*z)/(float)(Math.sqrt(x*x+y*y+z*z) * Math.sqrt(x1*x1+y1*y1+z1*z1)) );
        float result = instance.getAngle(v);
        assertEquals(expResult, result, 1e-5);
    }

    /**
     * Test of toArray3 method, of class Vector3.
     */
    @Test
    public void testToArray3() {
        System.out.println("toArray3");
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float[] expResult = new float[]{x,y,z};
        float[] result = instance.toArray3();
        assertArrayEquals(expResult, result, 1e-6f);
    }

    /**
     * Test of toArray4 method, of class Vector3.
     */
    @Test
    public void testToArray4() {
        System.out.println("toArray4");
        float w = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float z = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float y = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        float x = (float)Math.random()*Float.MAX_VALUE * (Math.random() > 0.5 ? 1 : -1);
        Vector3 instance = new Vector3(x,y,z);
        float[] expResult = new float[]{x,y,z,w};
        float[] result = instance.toArray4(w);
        assertArrayEquals(expResult, result,1e-6f);
    }
}