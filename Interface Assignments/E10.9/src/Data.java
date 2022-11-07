public class Data{
    

    public static object max(object[] objects, Measurer m){
        double maxMeasure = 0;
        double measure;
        object maxObject = null;

        for(int i = 0; i < objects.length; i++){
            measure m.measure(objects[i]);
            if(i == 0 || measure > maxMeasure){
                maxMeasure = measure;
                maxObject = objects[i];
            }
        }
        return maxObject;
    }
}