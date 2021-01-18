/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager;

import java.util.Scanner;

/**
 *
 * @author VINH-PC
 */
public class Person {

    private String code;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
