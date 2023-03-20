package me.this1sIrene.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

@Data
public class MyPet {

    private String name;

    private String id;

    private String sex;

    private Date birth;

}
