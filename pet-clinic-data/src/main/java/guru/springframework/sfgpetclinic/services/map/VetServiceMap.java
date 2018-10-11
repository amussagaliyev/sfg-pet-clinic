package guru.springframework.sfgpetclinic.services.map;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>
{
	@Override
	public Set<Vet> findAll()
	{
		return super.findAll();
	}

	@Override
	public Vet findById(Long id)
	{
		return super.findById(id);
	}

	@Override
	public Vet save(Long id, Vet object)
	{
		return super.save(id, object);
	}

	@Override
	public void delete(Vet object)
	{
		super.delete(object);
	}

	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}
}
