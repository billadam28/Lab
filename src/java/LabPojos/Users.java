package LabPojos;
// Generated Apr 17, 2016 5:31:00 PM by Hibernate Tools 4.3.1



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private int id;
     private String email;
     private int visitId;
     private int adminId;
     private String type;

    public Users() {
    }

    public Users(int id, String email, int visitId, int adminId, String type) {
       this.id = id;
       this.email = email;
       this.visitId = visitId;
       this.adminId = adminId;
       this.type = type;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getVisitId() {
        return this.visitId;
    }
    
    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }
    public int getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }




}


