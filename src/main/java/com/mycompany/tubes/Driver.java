/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tubes;

/**
 *
 * @author lenovo
 */
public class Driver {

    /*
    TODO:
        APP FLOW (User):
            - User register
            - User login
            - User checkin (input data foto baru)
            - dilihat kemiripan foto baru dengan foto lama
            - if kemiripan > 70% -> pass -> kirim boolean of admisison to admin
            - else -> isi form checkin
            - form checkin dikirim ke admin
            - admin admit form (bool of true or false)
            - check-in admitted
            - check-out -> exit program
        APP FLOW (Admin):
            - Admin register instance
            - Admin login
            - Admin view forms and admit
            - Admin view checked-in user
            - Admin view profile
            - can logout
        USERS:
            User:
                - can register
                - can login
                - can check-in (automated/manual)
                - can check-out (logout)
                - can view profile
            Admin:
                - can admit form
                - can view checked-in user
                - can view profile
    */
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
