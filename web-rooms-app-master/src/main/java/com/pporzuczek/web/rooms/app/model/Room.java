package com.pporzuczek.web.rooms.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class Room {
	
	public Room(){}
	
    @GeneratedValue
    @Id
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 100, message = "Name must have at least 3 characters.")
    private String name;
    
    private int positions = 0;
    
    private int computers = 0;
    
    private String network = "NO";
    
    private String projector = "NO";
    
    private String speakers = "NO";
    
    private String conditioning = "NO";
    
    private String board = "NO";
       
    @ManyToOne
    @NotNull
    private Unit unit;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the positions
	 */
	public int getPositions() {
		return positions;
	}

	/**
	 * @param positions the positions to set
	 */
	public void setPositions(int positions) {
		this.positions = positions;
	}

	/**
	 * @return the computers
	 */
	public int getComputers() {
		return computers;
	}

	/**
	 * @param computers the computers to set
	 */
	public void setComputers(int computers) {
		this.computers = computers;
	}

	/**
	 * @return the network
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * @param network the network to set
	 */
	public void setNetwork(String network) {
		this.network = network;
	}

	/**
	 * @return the projector
	 */
	public String getProjector() {
		return projector;
	}

	/**
	 * @param projector the projector to set
	 */
	public void setProjector(String projector) {
		this.projector = projector;
	}

	/**
	 * @return the speakers
	 */
	public String getSpeakers() {
		return speakers;
	}

	/**
	 * @param speakers the speakers to set
	 */
	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	/**
	 * @return the conditioning
	 */
	public String getConditioning() {
		return conditioning;
	}

	/**
	 * @param conditioning the conditioning to set
	 */
	public void setConditioning(String conditioning) {
		this.conditioning = conditioning;
	}

	/**
	 * @return the board
	 */
	public String getBoard() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(String board) {
		this.board = board;
	}

	/**
	 * @return the unit
	 */
	public Unit getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
    
    
    
}