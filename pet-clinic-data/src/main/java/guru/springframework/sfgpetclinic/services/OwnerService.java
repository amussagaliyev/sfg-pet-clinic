package guru.springframework.sfgpetclinic.services;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService
{
	Owner findBylastname(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
