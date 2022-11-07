import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
 /*
     This is the answer of E10.1
 */

interface Measurable{
    double getMeasure();
}

public class Data {
   
    //The added method : 

    public static Measurable max (Measurable[] objects){
        List measure = new ArrayList<>();
        measure = Arrays.asList(objects);

        return (Measurable) Collections.max(measure);
    }
}
