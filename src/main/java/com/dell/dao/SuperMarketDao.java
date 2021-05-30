package com.dell.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.dell.model.*;


@Controller
public interface SuperMarketDao extends JpaRepository<SuperMarket, Integer> {

	SuperMarket findOne(int id);

	void delete(int id);
	
}
