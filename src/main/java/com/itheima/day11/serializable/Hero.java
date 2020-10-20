package com.itheima.day11.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Jason on 2020/10/20 11:07
 *
 */
@AllArgsConstructor
@Data
public class Hero implements Serializable {
    private static final long serialVersionUID = 3404606521097444712L;
    int hp;
    int mp;
    String name;
}
