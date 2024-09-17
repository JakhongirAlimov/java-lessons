package com.java.lessons.generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 14);
        Schoolar schoolar2 = new Schoolar("Miwa", 15);

        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olya", 15);

        Student student1 = new Student("Kolya", 11);
        Student student2 = new Student("Nikita", 10);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Dragon");
        Team<Schoolar> schoolarTeam2 = new Team<>("Fire");
        Team<Student> studentTeam = new Team<>("Go");
        Team<Employee> employeeTeam = new Team<>("Ahead");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

       // Team<String> anotherTeam = new Team<>("Fantaziya");

        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);



    }
}
