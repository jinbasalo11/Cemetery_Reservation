/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author user daw
 */
public class UserSessions {
    private static int userId;
    private static String username;
    private static int rlId;
    private static int pdiId;
    private static int adminid;
    
    
    public static void setUserId(int userId) {
        UserSessions.userId = userId;
    }
    
    public static int getUserId() {
        return UserSessions.userId;
    }
    
    public static void setUsername(String username) {
        UserSessions.username = username;
    }
    
    public static String getUsername() {
        return UserSessions.username;
    }
    public static void setReservationLocationId(int rlId) {
    UserSessions.rlId = rlId;
}

public static void setDeathPersonId(int pdiId) {
    UserSessions.pdiId = pdiId;
}

public static int getReservationLocationId() {
    return UserSessions.rlId;
}

public static int getDeathPersonId() {
    return UserSessions.pdiId;
}
public static void setAdminId(int adminid) {
        UserSessions.adminid = adminid;
    }

    public static int getAdminId() {
        return UserSessions.adminid;
    }
}


