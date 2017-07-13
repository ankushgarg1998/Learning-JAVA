package osa;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class UserDetails {

	@Id String  name;
   @Index String pass;
    
    public UserDetails()
    {
    	
    }
    
    public UserDetails(String name, String pass)
    {
        this.name = name;
        this.pass = pass;
	}

}
