public interface Measurable {
    double getMeasure();

static Measurable largest(Measurable[] objects){
    Measurable largest = objects[0];
        for(int i = 1; i < objects.length; i++){
            if(objects[i].getMeasure() > largest.getMeasure()){
                largest = objects[i];
            }
        }
        return largest;
    }
static Measurable smallest(Measurable[] objects){
    Measurable smallest = objects[0];
        for(int i = 1; i < objects.length; i++){
            if(objects[i].getMeasure() < smallest.getMeasure()){
                smallest = objects[i];
            }
        }
        return smallest;
    }
}
