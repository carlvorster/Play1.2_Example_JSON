package models;

import java.util.*;

import com.google.gson.annotations.Expose;

import play.data.validation.Required;

import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;


@Entity
public class Message extends Model {
	
	@Expose
    public Date dteCreate = new Date();
    
    @Required
    @Expose
    public String message;
    
    @Required
    @Expose
    public String room;
    

    
    //*****************************************************
    // Relationships
    //*****************************************************
    
    
    
    //*****************************************************
    // Queries
    //*****************************************************
	
    
	public static List<Message> findMessagesOfRoom(String room){
		return Message.find("room = ?", room).fetch();
	}
	
	
    //*****************************************************
    // To String
    //*****************************************************
			
	public String toString() {
		return 	"ID: " + id + 
				" Room: " + room +
				" Message: " + message;
	}
	
}

        
