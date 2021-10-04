
public class Main {

    public static void main(String[] args) {
        // Instantiate the classes
        HealthStation childrensHospital = new HealthStation();
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);
        
        // Display results to user
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        
        // Feed ethan 3 times
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        
        // Display the results
        System.out.println("");
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        
        // Display the number of weighings
        System.out.println("");
        System.out.println("weighings performed: " + childrensHospital.weighings());

        // Do a number of weighings
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        
        // Display the results
        System.out.println("");
        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}