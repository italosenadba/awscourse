package com.awscourse.awscourse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Machine {

    private String ip;
    private String name;
    private String os;
    private String architecture;
    private String osVersion;

}
