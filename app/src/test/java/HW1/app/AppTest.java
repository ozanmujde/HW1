package HW1.app;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;


public class AppTest {
    /* ArrayList<Integer> vector_x = new ArrayList<>(Arrays.asList(1,2,3,4,-5));
    ArrayList<Integer> vector_y = new ArrayList<>(Arrays.asList(2,-10,5,4,22));
    ArrayList<Integer> vector_z = new ArrayList<>(Arrays.asList(7,2,23,2,35)); */
    @Test 
    public void nullList(){
        ArrayList<Integer> vector_x = new ArrayList<>(Arrays.asList(1,2,3,4,-5));
        ArrayList<Integer> vector_y = new ArrayList<>(Arrays.asList(2,-10,5,4,22));
        ArrayList<Integer> vector_z = null;
        new App();
        assertEquals(App.biggestNorm(vector_x, vector_y, vector_z), -1);
    }

    @Test 
    public void SizeProblem(){
        ArrayList<Integer> vector_x = new ArrayList<>(Arrays.asList(1,2,3,4,-5));
        ArrayList<Integer> vector_y = new ArrayList<>(Arrays.asList(2,-10,5,22));
        ArrayList<Integer> vector_z = new ArrayList<>(Arrays.asList(7,2,23,2,35));
        new App();
        assertEquals(App.biggestNorm(vector_x, vector_y, vector_z), -1);
    }

    @Test 
    public void normalCheck(){
        ArrayList<Integer> vector_x = new ArrayList<>(Arrays.asList(1,2,3,4,-5));
        ArrayList<Integer> vector_y = new ArrayList<>(Arrays.asList(2,-10,5,4,22));
        ArrayList<Integer> vector_z = new ArrayList<>(Arrays.asList(7,2,23,2,35));
        new App();
        
        assertEquals(App.biggestNorm(vector_x, vector_y, vector_z), 4);
    }

    @Test 
    public void emptyList(){
        ArrayList<Integer> vector_x = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> vector_y = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> vector_z = new ArrayList<>(Arrays.asList());
        new App();
        assertEquals(App.biggestNorm(vector_x, vector_y, vector_z), -1);
    }

    @Test 
    public void fullMinus(){
        ArrayList<Integer> vector_x = new ArrayList<>(Arrays.asList(1,2,3,4,-5));
        ArrayList<Integer> vector_y = new ArrayList<>(Arrays.asList(2,-10,5,4,-22));
        ArrayList<Integer> vector_z = new ArrayList<>(Arrays.asList(7,2,23,2,-35));
        new App();
        assertEquals(App.biggestNorm(vector_x, vector_y, vector_z), 4);
    }

   
}

