package LabPojos;
// Generated Apr 17, 2016 5:31:00 PM by Hibernate Tools 4.3.1



/**
 * Hospital generated by hbm2java
 */
public class Hospital  implements java.io.Serializable {


     private int id;
     private String name;
     private String address;

    public Hospital() {
    }

	
    public Hospital(int id) {
        this.id = id;
    }
    public Hospital(int id, String name, String address) {
       this.id = id;
       this.name = name;
       this.address = address;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }




}


