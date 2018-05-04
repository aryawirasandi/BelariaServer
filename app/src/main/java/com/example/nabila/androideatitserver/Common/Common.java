package com.example.nabila.androideatitserver.Common;

import com.example.nabila.androideatitserver.Model.User;

/**
 * Created by NABILA on 02/05/2018.
 */

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeStatus(String code)
    {
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "On My Way";
        else
            return "Shipped";
    }
}
