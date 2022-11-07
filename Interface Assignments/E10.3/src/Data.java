public class Data{
    public static double avarage (Measurable[] objects){
        double total = 0.0;
        for(Measurable obj : objects){
            total += obj.getMeasure();
        }

        if(objects.length> 0) return total/objects.length;
        return 0;

    }
    public static Measurable max(Measurable obj1, Measurable obj2){
        if(obj1.getMeasure() > obj2.getMeasure())
            return obj1;
        
        else return obj2;
        
    }
}
