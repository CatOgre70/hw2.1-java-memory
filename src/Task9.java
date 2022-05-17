public class Task9 {
    public static void main(String[] args) {

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println("person = " + person);

    }

    public static void changePerson(Person person) {
        
        person = new Person("Ilya", "Lagutenko");
    
    }

}
