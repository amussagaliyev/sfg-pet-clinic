package guru.springframework.sfgpetclinic.services;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService
{
	Vet findById(Long id);

	Vet save(Vet owner);

	Set<Vet> findAll();
}
