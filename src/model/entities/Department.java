package model.entities;

import java.io.Serializable;

public class Department implements Serializable{ //serve para transformar os objetos em sequência de bytes

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String name;
	
	public Department() {
	}

	public Department(Integer id, String name) {
		Id = id;
		this.name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	//hashcodeEqual serve para que os objetos sejam comparados apenas pelo conteúdo e  não pela referência de ponteiros
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
		Department other = (Department) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	@Override
	//toString serve para ter uma facilidade na hora de imprimir os valores do objeto na hora que estiver testando
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + "]";
	}
	
}
