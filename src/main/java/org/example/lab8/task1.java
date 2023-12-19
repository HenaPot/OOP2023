package org.example.lab8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SuppressWarnings("unused")
class task1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User("hena");
        Admin admin = new Admin("admin Zlaja");
        /*System.out.println(user.getClass().isAnnotationPresent(UserPermission.class));
        System.out.println(user.getClass().getAnnotation(UserPermission.class).value());
        System.out.println(admin.getClass().getAnnotation(UserPermission.class).value());*/

        MessagingSystem messagingSystem = new MessagingSystem();
        // messagingSystem.sendMessage(admin, "an admin sent this message");
        messagingSystem.sendMessage(user, "let us see if this works!");
    }

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage {}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface RequiresPermission {
    PermissionLevel value() default PermissionLevel.ADMIN;
}

enum PermissionLevel {
    USER, ADMIN
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission {
    PermissionLevel value() default PermissionLevel.USER;
}

@UserPermission
class User {
    public String username;

    public User(String username) {
        this.username = username;
    }

    @SuppressWarnings("unused")
    public String getUsername() {
        return username;
    }
}

@UserPermission(PermissionLevel.ADMIN)
class Admin {
    public String username;

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class MessagingSystem {
    @SuppressWarnings("unused")
    @CanSendMessage
    @RequiresPermission(value = PermissionLevel.ADMIN)
    public void sendMessage(Admin user, String message) throws NoSuchFieldException, IllegalAccessException {
        // same thing two times to practice reflection
        System.out.println("Message was sent by user " + user.getUsername() + ": " + message);
        System.out.println("Message was sent by user " + user.getClass().getDeclaredField("username").get(user) + ": " + message);
    }

    @SuppressWarnings("unused")
    public void sendMessage(User user, String message) {
        System.out.println("Access denied");
    }
}








