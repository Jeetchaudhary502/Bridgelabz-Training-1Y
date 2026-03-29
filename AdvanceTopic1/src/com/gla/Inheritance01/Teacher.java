package com.gla.Instance01;

public class Teacher {
    String name;
    int id;
    String subject;
    public Teacher(){
        
    }
    public void faculty()
    {
        System.out.println("The name is " + name);
        System.out.println("The id is " + id);
        System.out.println("The subject is " + subject);

    }
    public static void main(){
        Teacher t1 = new teacher();
    }
}
