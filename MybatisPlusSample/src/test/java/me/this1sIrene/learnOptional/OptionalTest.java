package me.this1sIrene.learnOptional;

import me.this1sIrene.entity.Employee;
import org.junit.Test;

import java.util.*;

public class OptionalTest {
    @Test
    public void test01() {
        String str1 = "hello";
        String str2 = null;

        ArrayList<String> list = new ArrayList();
        list.add("88");
        list.add(null);
        list.add("89");
        list.add("99");

        Map<String, String> map = new HashMap<>();
        map.put("name", "irene");
        map.put("gender", "F");
        map.put(null, null);
        map.put("tel", "110");

        Employee employee = new Employee();
        Employee employee1 = new Employee();
        employee.setId("0");
        employee.setName("irene");
        employee.setGender("F");

        // difference between Optional.of() and Optional.ofNullable()
        String s = Optional.of(str1).get();
        System.out.println(s);
        String s1 = Optional.ofNullable(str2).orElse("it is null");
        System.out.println(s1);

        boolean b = Optional.ofNullable(employee).equals(str2);
        System.out.println(b);

        Optional.ofNullable(employee1).ofNullable(employee.getName()).ifPresent( n -> employee.setName(n.toUpperCase()));
        System.out.println(employee1);

        String orElseGet = Optional.ofNullable(str2).orElseGet(() -> String.valueOf(new Random().nextInt()));
        System.out.println(orElseGet);

        for (int i = 0; i < list.size(); i++) {
            String ss = Optional.ofNullable(list.get(i)).filter(n -> n.contains("9")).orElse("not contains 9");
            System.out.println(ss);
        }

        // IMPORTANT
        // the paramter type of faltMap is optional while map's is T
        for (String o:
             list) {
            String op = Optional.ofNullable(o).map(n -> n = "oooo").orElse("pppp");
            System.out.println(op);
        }


        for (String o:
                list) {
            Object o1 = Optional.ofNullable(o).flatMap(n -> Optional.empty()).orElse("110");
            System.out.println(o1);
        }



    }
}
