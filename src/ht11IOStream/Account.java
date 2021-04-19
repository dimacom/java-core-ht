package ht11IOStream;

import java.io.Serializable;

public class Account implements Serializable {
    private String username;
    private String email;
    private transient String password;
}
