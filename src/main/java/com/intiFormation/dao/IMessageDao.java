package com.intiFormation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Message;

public interface IMessageDao extends JpaRepository<Message, Integer> {

}
