public class Person implements Measurable{
    String name;
    int height;

    public Person(String name, int height){
        this.name = name;
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public double getMeasure(){
        return height;
    }
    public String toString (){
        return "person : " + name + " " + "height : " + height ;
    }
    public static void main(String[] args){
        Person[] obj = new Person[5];
        for(int i = 0; i < obj.length; i++){
            obj[i] = new Person("person"+ i+1, (int)(Math.random()*100) + 100 );
        }
        System.out.println("Persons are ");

        for(Person person : obj ){
            System.out.println(person);
        }
        double avarageHeight = Data.avarage(obj);
        System.out.println("The avarage height is : " + avarageHeight);

        Person tallest = new Person(null, 0);

        for(int i = 1; i<obj.length; i++){
          tallest = (Person) Data.max(obj[i - 1], obj[i]);  
        }

        System.out.println("The tallest person is ");
        System.out.println(tallest);
    }
}
