package guru.springframework.sfgpetclinic.model;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import java.time.LocalDate;

public class Pet
{
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

	public PetType getPetType()
	{
		return petType;
	}

	public void setPetType(PetType petType)
	{
		this.petType = petType;
	}

	public Owner getOwner()
	{
		return owner;
	}

	public void setOwner(Owner owner)
	{
		this.owner = owner;
	}

	public LocalDate getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}
}
