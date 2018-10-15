package guru.springframework.sfgpetclinic.services;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import java.util.Set;

public interface CrudService<T, ID>
{
	Set<T> findAll();

	T findById(ID id);

	T save(T object);

	void delete(T object);

	void deleteById(ID id);
}
