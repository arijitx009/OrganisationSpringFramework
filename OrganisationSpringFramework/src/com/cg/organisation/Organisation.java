package com.cg.organisation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import com.cg.address.Address;

public class Organisation {
	private String name;
	Address address;
	private double marketValue;
	private LocalDate established;
	private int empCount;
	private Set<String> globalPresence=new TreeSet<>();
	private List<String> boardMembers=new ArrayList<>();
	private Map<String,String> projectManager=new HashMap<>();
	private Properties proxyServerList=new Properties();



	public Organisation() {
		
	}


	public Organisation(String name, Address address, double marketValue, String established, int empCount,
			Set<String> globalPresence, List<String> boardMembers, Map<String, String> projectManager,
			Properties proxyServerList) {
		super();
		this.name = name;
		this.address = address;
		this.marketValue = marketValue;
		this.established = LocalDate.parse(established,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		this.empCount = empCount;
		this.globalPresence = globalPresence;
		this.boardMembers = boardMembers;
		this.projectManager = projectManager;
		this.proxyServerList = proxyServerList;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((boardMembers == null) ? 0 : boardMembers.hashCode());
		result = prime * result + empCount;
		result = prime * result + ((established == null) ? 0 : established.hashCode());
		result = prime * result + ((globalPresence == null) ? 0 : globalPresence.hashCode());
		long temp;
		temp = Double.doubleToLongBits(marketValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((projectManager == null) ? 0 : projectManager.hashCode());
		result = prime * result + ((proxyServerList == null) ? 0 : proxyServerList.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organisation other = (Organisation) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (boardMembers == null) {
			if (other.boardMembers != null)
				return false;
		} else if (!boardMembers.equals(other.boardMembers))
			return false;
		if (empCount != other.empCount)
			return false;
		if (established == null) {
			if (other.established != null)
				return false;
		} else if (!established.equals(other.established))
			return false;
		if (globalPresence == null) {
			if (other.globalPresence != null)
				return false;
		} else if (!globalPresence.equals(other.globalPresence))
			return false;
		if (Double.doubleToLongBits(marketValue) != Double.doubleToLongBits(other.marketValue))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (projectManager == null) {
			if (other.projectManager != null)
				return false;
		} else if (!projectManager.equals(other.projectManager))
			return false;
		if (proxyServerList == null) {
			if (other.proxyServerList != null)
				return false;
		} else if (!proxyServerList.equals(other.proxyServerList))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Organisation [name=" + name + ", address=" + address + ", marketValue=" + marketValue + ", established="
				+ established + ", empCount=" + empCount + ", globalPresence=" + globalPresence + ", boardMembers="
				+ boardMembers + ", projectManager=" + projectManager + ", proxyServerList=" + proxyServerList + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	public LocalDate getEstablished() {
		return established;
	}
	public void setEstablished(LocalDate established) {
		this.established = established;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public Set<String> getGlobalPresence() {
		return globalPresence;
	}
	public void setGlobalPresence(Set<String> globalPresence) {
		this.globalPresence = globalPresence;
	}
	public List<String> getBoardMembers() {
		return boardMembers;
	}
	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}
	public Map<String, String> getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Map<String, String> projectManager) {
		this.projectManager = projectManager;
	}
	public Properties getProxyServerList() {
		return proxyServerList;
	}
	public void setProxyServerList(Properties proxyServerList) {
		this.proxyServerList = proxyServerList;
	}





}
