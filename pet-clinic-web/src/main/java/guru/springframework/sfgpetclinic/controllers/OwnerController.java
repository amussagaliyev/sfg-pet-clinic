package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Copyright 2001-2018 by HireRight, Inc. All rights reserved.
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 */
@Controller
@RequestMapping("/owners")
public class OwnerController
{

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners()
	{
		return "owners/index";
	}
}
