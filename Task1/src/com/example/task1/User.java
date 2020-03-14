package com.example.task1;

class User {
    private long id;
    private Vacancy vacancy;

    public User(int id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    String getVacancy() {
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}