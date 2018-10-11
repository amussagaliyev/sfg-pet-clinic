package guru.springframework.sfgpetclinic.services.map;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>
{
	@Override
	public Set<Owner> findAll()
	{
		return super.findAll();
	}

	@Override
	public Owner findById(Long id)
	{
		return super.findById(id);
	}

	@Override
	public Owner save(Long id, Owner object)
	{
		return super.save(id, object);
	}

	@Override
	public void delete(Owner object)
	{
		super.delete(object);
	}

	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}
}
