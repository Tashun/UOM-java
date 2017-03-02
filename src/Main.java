/**
 * Created by T-A-S-H-U-N on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Main ls =new Main();
        Person p = new Person();
         String r=p.toString();


        System.out.println(r);
    }


public Person savePerson(Person person){
    if (person==null){
        throw new IllegalArgumentException();

    }
    else {
        person.setID("p");
        return person;
    }

}
}