package guru.springframework.sfgpetclinic.services.map;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService<T, ID>
{
	protected Map<ID, T> map = new HashMap<>();

	Set<T> findAll()
	{
		return new HashSet<>(map.values());
	}

	T findById(ID id)
	{
		return map.get(id);
	}

	T save(ID id, T object)
	{
		map.put(id, object);
		return object;
	}

	void deleteById(ID id)
	{
		map.remove(id);
	}

	void delete(T object)
	{
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

}
