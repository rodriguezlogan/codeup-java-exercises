import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person logan = new Person("Logan");
        Person bob = new Person("Bob");
        Person joe = new Person("Joe");
        Person fred = new Person("Fred");

        Person[] people = new Person[3];

        people[0] = logan;
        people[1] = bob;
        people[2] = joe;

        Person[] people2 =  addPerson(people, fred);


        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }

        for(int i = 0; i < people2.length; i++){
            System.out.println(people2[i].getName());
        }



    }

    public static  Person[] addPerson(Person[] personArr, Person person){
        Person[] nPeople = Arrays.copyOf(personArr, personArr.length+1);
        nPeople[personArr.length] = person;
        return  nPeople;
    }


}
