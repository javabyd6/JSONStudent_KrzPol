package com.sda.studentmodel.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main
{
    static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args)
    {
        try
        {
            Student[] students = mapper.readValue(new File("studentList.json"), Student[].class);
            List<Student> studentList = Arrays.asList(students);
            System.out.println(studentList.toString());
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            Student[] students = mapper.readValue(new File("studentList.json"), Student[].class);
            List<Student> studentList = Arrays.asList(students);
            studentList.stream()
            .filter(x-> x.getName().startsWith("a"))
            .forEach(System.out::println);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
