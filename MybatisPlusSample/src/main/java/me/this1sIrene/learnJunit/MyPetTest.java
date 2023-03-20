package me.this1sIrene.learnJunit;

import ch.qos.logback.core.net.SyslogOutputStream;
import me.this1sIrene.entity.MyPet;
import org.springframework.beans.factory.annotation.Value;

public class MyPetTest {
    @Value("${pet.name}")
    String name;
    public static void main(String []args) {

    }




}
