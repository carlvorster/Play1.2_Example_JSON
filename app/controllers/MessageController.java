package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.*;


public class MessageController extends Controller {

	static Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
	
    public static void index() {
        render();
    }

    
  
    public static void getMessagesByRoomJSON(String room) {
    	Logger.info("MessageController.getMessagesByRoom:"+room);
    	
    	List<Message> messages = Message.findMessagesOfRoom(room);
    	Logger.info("length:"+messages.size());
    	
    	renderJSON(messages);
    }
    
    public static void getMessagesByRoomXML(String room) {
    	Logger.info("MessageController.getMessagesByRoom:"+room);
    	
    	List<Message> messages = Message.findMessagesOfRoom(room);
    	Logger.info("length:"+messages.size());
    	
    	renderXml(messages);
    }

    
    public static void getMessagesByRoomUsingTemplate(String room) {
    	Logger.info("MessageController.getMessagesByRoomUsingTemplate:"+room);
    	
    	List<Message> messageLst = Message.findMessagesOfRoom(room);
    	Logger.info("length:"+messageLst.size());
    	
    	render(messageLst);
    }
    
    public static void getMessagesByRoomExtension(String room) {
    	Logger.info("MessageController.getMessagesByRoomExtension:"+room);
    	
    	List<Message> messageLst = Message.findMessagesOfRoom(room);
    	Logger.info("length:"+messageLst.size());
    	
    	// Using templates for all formats
    	render(messageLst);
    	
    	// Using templates for xml/html only
    	/*
    	if(request.format.equals("json")) {
            renderJSON(messages); 
    	}
    	else {
    		render(messages); 
    	}
    	*/
    }
    
        
    public static void sendMessage(MessageDTO body) {
    	Logger.info("MessageController.sendMessage");
    	Logger.info(gson.toJson(body));
    	
    	body.message = body.message.replaceAll("[\\r\\n]", " "); 
    	
    	Message message = new Message();
    	message.message = body.message;
    	message.room = body.room;
    	message.save();
        	
    	renderJSON("{\"status\":\"success\"}");
    }
}