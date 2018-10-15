package guru.springframework.sfgpetclinic.services.map;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService
{
	@Override
	public Set<Pet> findAll()
	{
		return super.findAll();
	}

	@Override
	public Pet findById(Long id)
	{
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object)
	{
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Pet object)
	{
		super.delete(object);
	}

	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}
}
