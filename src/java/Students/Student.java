/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author adamopoulo
 */
public class Student {
    private int id;
    private String name;
    private String email;
    private String degree;
    
    public Student() {};
    public int getId() {return id;}
    public String getName() {return name;}
    public String getDegree() {return degree;}
    public String getEmail() {return email;}
    
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setDegree(String degree) {this.degree = degree;}
    
    
    
    
}
