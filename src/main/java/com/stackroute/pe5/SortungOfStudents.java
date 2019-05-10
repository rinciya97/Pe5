package com.stackroute.pe5;
import java.util.*;

class Student
{
    private int age;
    private String name;
    private int rollno;

    public Student(int age, String name, int rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}

class StudentSorter implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getAge() == s2.getAge()) {
            if (s1.getName().equals(s2.getName()))
                return s1.getRollno() - s2.getRollno();
            else
                return s1.getName().compareTo(s2.getName());
        }
        else if (s1.getAge() > s2.getAge())
            return -1;
        else
            return 1;

    }
}
public class SortungOfStudents {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(21, "rinciya", 204));
        al.add(new Student(25, "saranya", 202));
        al.add(new Student(22, "monish", 203));
        al.add(new Student(21, "rinciya", 201));
        al.add(new Student(21, "sneha", 205));
        al.add(new Student(21, "pooja", 206));
        al.add(new Student(21, "madhu", 207));


        Collections.sort(al,new StudentSorter());
        for(Student st: al){
            System.out.println(st.getRollno()+" "+st.getAge()+" "+st.getName());
        }

    }
}
