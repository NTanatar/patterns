package com.nata.bridge;

import com.nata.bridge.model.Angry;
import com.nata.bridge.model.Character;
import com.nata.bridge.model.Friendly;
import com.nata.bridge.model.Girl;
import com.nata.bridge.model.Person;
import com.nata.bridge.model.Playful;
import com.nata.bridge.model.Student;
import com.nata.bridge.model.Teacher;

public class Main {

    public static void main(String[] args) {
        Character nice = new Friendly();
        Character angry = new Angry();

        Person angryStudent = new Student(angry);
        Person angryTeacher = new Teacher(angry);
        Person niceTeacher = new Teacher(nice);
        Person niceStudent = new Student(nice);
        Person child = new Girl(new Playful());

        angryStudent.talk();
        niceTeacher.talk();
        child.talk();
        niceStudent.talk();
        angryTeacher.talk();
    }
}
