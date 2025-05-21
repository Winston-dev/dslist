package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;



public class GameMinDTO {
	
	
	private Long id;
	private String title;	
	private Integer year;	
	private String imgUrl;	
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {//o construtor recebe a entidade		
		id = entity.getId();//como não tem anbiguidade não precisa do this
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}	
	
	
	
	
	
}
