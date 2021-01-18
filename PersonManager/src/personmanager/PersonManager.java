/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author VINH-PC
 */
public class PersonManager {

    private Person[] listPerson;
    private int currentIndex;
    private int size;

    public PersonManager() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of list: ");
        size = sc.nextInt();
        listPerson = new Person[size];
        currentIndex=0;
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        listPerson[currentIndex] = new Person();
        System.out.println("\nInput code: ");
        listPerson[currentIndex].setCode(sc.nextLine());
        System.out.println("\nInput name: ");
        listPerson[currentIndex].setName(sc.nextLine());
        System.out.println("\nInput age: ");
        listPerson[currentIndex].setAge(sc.nextInt());
        currentIndex++;
    }

    public void remove(String code) {
        for (int i = 0; i < currentIndex; i++) {
            if (listPerson[i].getCode().equals(code)) {
                for (int j = i; j < currentIndex; j++) {
                    listPerson[j] = listPerson[j + 1];
                }
                currentIndex--;
                break;
            }
        }
    }

    public void update(String code) {
        for (int i = 0; i < currentIndex; i++) {
            if (listPerson[i].getCode().equals(code)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("\nInput new name: ");
                listPerson[i].setName(sc.nextLine());
                System.out.println("\nInput new age: ");
                listPerson[i].setAge(sc.nextInt());
                break;
            }
        }
    }

    public void list() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("\nCode: " + listPerson[i].getCode() + ", Name: " + listPerson[i].getName() + ", Age: " + listPerson[i].getAge());
        }
    }

    public void listAndSort() {
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = i + 1; j < currentIndex; j++) {
                if (listPerson[i].getAge() > listPerson[j].getAge()) {
                    int age = listPerson[i].getAge();
                    listPerson[i].setAge(listPerson[j].getAge());
                    listPerson[j].setAge(age);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonManager list = new PersonManager();
        for (int i = 0; i < list.size; i++) {
            list.add();
        }
        //show all person in list
        list.list();
        //remove person
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput Remove code: ");
        String code = sc.nextLine();
        list.remove(code);
        System.out.println("\nList person after remove");
        list.list();
        //update person
        System.out.println("\nInput updating code: ");
        code = sc.nextLine();
        list.update(code);
        System.out.println("\nList person after update");
        list.list();
        //show list with sort
        list.listAndSort();
        list.list();
    }

}
