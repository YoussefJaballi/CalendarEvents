/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.models;

import java.util.Date;
import java.util.List;



//USER_ACTIVATED
/**
 *
 * @author azer
 */
public class User extends Reportable {

    private int id;
    private String email;
    private String name;
    private String lastName;
    private String login;
    private String password;

    
    private Date birthday;
    private String adress;
    private String photoURL;
    private boolean userActivated;
    private Entreprise entreprise;
    private RoleUser role;

    
    public void setUserActivated(boolean userActivated) {
        this.userActivated = userActivated;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public void setRole(RoleUser role) {
        this.role = role;
    }
    
    public boolean isUserActivated() {
        return userActivated;
    }
    List<Participation> participations;

    public User(int id, String email, String name, String lastName, String login, String password, Date birthday, String adress, String photoURL, Entreprise entreprise, RoleUser role,boolean userActivated) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.birthday = birthday;
        this.adress = adress;
        this.photoURL = photoURL;
        this.entreprise = entreprise;
        this.role = role;
        this.userActivated = userActivated;
    }

    public User(String email, String name, String lastName, String login, String password, Date birthday, String adress, String photoURL, Entreprise entreprise, RoleUser role,boolean userActivated) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.birthday = birthday;
        this.adress = adress;
        this.photoURL = photoURL;
        this.entreprise = entreprise;
        this.role = role;
        this.userActivated = userActivated;
    }

    public User() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntrepriseID(Entreprise entrepriseID) {
        this.entreprise = entreprise;
    }

    public RoleUser getRole() {
        return role;
    }

    public void setRoleID(RoleUser role) {
        this.role = role;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", name=" + name + ", lastName=" + lastName + ", login=" + login + ", password=" + password + ", birthday=" + birthday.getDate()+"/"+(birthday.getMonth()+1)+"/"+(birthday.getYear()-100)+", adress=" + adress + ", photoURL=" + photoURL + ", userActivated=" + userActivated + ", entreprise=" + entreprise + ", role=" + role + ", participations=" + participations + '}';
    }

}
