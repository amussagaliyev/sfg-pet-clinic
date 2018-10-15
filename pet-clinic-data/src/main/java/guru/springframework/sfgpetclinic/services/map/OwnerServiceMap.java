package guru.springframework.sfgpetclinic.services.map;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService
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
	public Owner save(Owner object)
	{
		return super.save(object);
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

	@Override
	public Owner findByLastName(String lastName)
	{
		return null;
	}
}
