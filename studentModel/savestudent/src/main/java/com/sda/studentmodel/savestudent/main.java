package com.sda.studentmodel.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class main
//program ma za zadanie stworzyc liste 5 studentow i przeparsowac te klasy do JSON'a
{
    static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args)
    {
        List<Student> studentlist = new LinkedList<>();
        Student krzychu = new Student("krzysztof", "niewazne", Integer.valueOf(1337));
        Student pawelek = new Student("pawel", "tenobok", Integer.valueOf(1010));
        Student kujon = new Student("albert", "gierlach", Integer.valueOf(6666));
        Student remigiusz = new Student("remi", "jakistam", 1666);
        Student dmytro = new Student("Dmytriej", "wozniuk", 7894);
        studentlist.add(krzychu);
        studentlist.add(pawelek);
        studentlist.add(kujon);
        studentlist.add(remigiusz);
        studentlist.add(dmytro);
        try
        {
            /*mapper.writeValue(new File("krzychuStudent.json"), krzychu);
            mapper.writeValue(new File("pawelStudent.json"),pawelek);
            mapper.writeValue(new File("kujonStudent.json"), kujon);
            mapper.writeValue(new File("remik.json"), remigiusz);
            mapper.writeValue(new File("dmitriej.json"), dmytro);*/
            mapper.writeValue(new File("studentList.json"), studentlist);
          //  String result =mapper.writeValueAsString(krzychu);
          //  Files.write(Paths.get("student.json"),result.getBytes());
        } catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
