package com.example.ovnifans.omnifans;

/**
 * Created by DavidL on 25/3/2016.
 */
public class Usuario  {
    // Atributos
    private String id;
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String facebook_id;

    public Usuario() {
    }

    public Usuario(String id, String firstname, String lastname, String username,String email,String facebook_id) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username =username;
        this.email=email;
        this.facebook_id=facebook_id;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFacebook_id() {
        return facebook_id;
    }
    public void setFacebook_id(String facebook_id) {
        this.facebook_id = facebook_id;
    }
}