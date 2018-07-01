package com.spring.example1;

public class Actor {

    private int id;
    private String name;
    private int age;
    private Gender gender;
    private EgoMetrics egoMetrics;

    public void setEgoMetrics(EgoMetrics egoMetrics) {
        this.egoMetrics = egoMetrics;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
