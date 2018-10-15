package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService)
	{
		this.ownerService = ownerService;
	}

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners(Model model)
	{
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
}
