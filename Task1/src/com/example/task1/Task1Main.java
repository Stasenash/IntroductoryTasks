package com.example.task1;

class Task1Main {
    public static void main(String[] args) {
        User tester = new User(7, new Vacancy("Developer"));
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}
