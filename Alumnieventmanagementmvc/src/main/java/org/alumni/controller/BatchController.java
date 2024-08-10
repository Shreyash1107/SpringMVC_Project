package org.alumni.controller;

import javax.servlet.http.HttpServletRequest;

import org.alumni.model.BatchMasterModel;
import org.alumni.service.BatchMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BatchController 
{
	@Autowired
	BatchMasterService batchservice;
	@RequestMapping(value = "/add")
	public String getbatch(HttpServletRequest req,BatchMasterModel bm,Model md)
	{
		boolean b;
		String year = req.getParameter("batchyear");
		bm.setyear(year);
		b = batchservice.isBatchadded(bm);
		if(b)
		{
			md.addAttribute("msg", "Batch Added Successfully");
		}
		else
		{
			md.addAttribute("msg", "Batch not Added Successfully");
		}
		return "home";
	}
}
