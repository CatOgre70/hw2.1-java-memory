public class Task10 {
    public static void main(String[] args) {

        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println("person = " + person);

    }

    public static void changePerson(Person person) {
        
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    
    }

}
