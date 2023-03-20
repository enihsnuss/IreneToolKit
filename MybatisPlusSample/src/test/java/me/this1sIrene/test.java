package me.this1sIrene;

import me.this1sIrene.entity.MyPet;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

public class test {
    @Test
    public void test01() {
        MyPet cat = new MyPet();
        System.out.println(cat);
    }
}
