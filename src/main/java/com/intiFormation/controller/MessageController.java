package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.model.Message;
import com.intiFormation.service.IMessageService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class MessageController {
	
	@Autowired
	private IMessageService messageService;
	

	@GetMapping("/messages")
    public List<Message> selectAll()
    {
        List<Message> messages = messageService.getAll();
        return messages;
        
    }
    
    @GetMapping("/messages/{id}")
    public Message selectById(@PathVariable("id") int id)
    {
    	Message message = messageService.getById(id);
        return message;
        
    }

    @PutMapping("/messages")
    public void merge(@RequestBody Message message)
    {
    	messageService.merge(message);
    }
    
    @DeleteMapping("/messages/{id}")
    public void delete(@PathVariable("id") int id)
    {
    	messageService.delete(id);
    }
    


}
