package org.example.lab4.people;

import org.example.lab4.people.Student;
import org.example.lab4.people.Teacher;
import org.example.lab4.people.Person;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args){
        //a)
        /*Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);*/

        //b)
        /*Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());*/

        //c)
        /*Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );*/

        //d)
        /*List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);*/

        /*Person p = new Person("Hena Potogija", "Ilidanska 12");
        p.setAge(20);
        System.out.println(p.getAge());*/

        ArrayList<Double> henasGrades = new ArrayList<>();
        henasGrades.add(10.00);

        Student hena = new Student("Hena Potogija", "Ilidzanska 12", 123, henasGrades);
        //this will change our attribute grades and add 9.5 to it despite working with variable in main
        //POINTS TO MEMORY LOCATION
        henasGrades.add(9.5);
        hena.addGrade(6.1);
        System.out.println(hena.getGrades());
        System.out.println(henasGrades);

        /*Student iman = new Student("Iman Ahmagic", "Neka Ulica 12");
        iman.addGrade(9.0);
        System.out.println(iman.getGrades());*/

    }



    public static void printDepartment(List<Person> people) {
        for (Person p : people){
            System.out.println(p);
        }
    }

}
