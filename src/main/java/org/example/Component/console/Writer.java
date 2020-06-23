package org.example.Component.console;

import org.springframework.stereotype.Component;

@Component
public class Writer {
    public void WriteStr(String str) {
        System.out.println(str);
    }

    public void WriteDouble(Double dbl) {
        System.out.println(dbl);
    }
}
