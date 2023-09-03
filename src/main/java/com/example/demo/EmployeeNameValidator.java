package com.example.demo;

import org.apache.commons.lang3.StringUtils;

public class EmployeeNameValidator {
    public static void validateIsAlpha(String... names){
        for (String name:names
             ) {
            if(!StringUtils.isAlpha(name)){
                throw new WrongSymbolException();

            }

        }
    } }


