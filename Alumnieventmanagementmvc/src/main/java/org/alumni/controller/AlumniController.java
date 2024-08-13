package org.alumni.controller;

import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.alumni.model.Alumnimastermodel;
import org.alumni.model.BatchMasterModel;
import org.alumni.service.Alumnimasterservice;
import org.alumni.service.BatchMasterService;
import org.alumni.service.BatchMasterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlumniController {
	@Autowired
	BatchMasterService batchservice;
	@Autowired
	Alumnimasterservice amservice;

	@RequestMapping(value = "/alumni")
	public String getalumnimaster() {

		return "Alumnimaster";
	}

	@RequestMapping(value = "/addalumni")
	public String addalumni(Map<String, Vector<BatchMasterModel>> map) {
		Vector<BatchMasterModel> vect = batchservice.getbatches();
		 System.out.println("Controller Models:" + vect); 
		if (vect != null) {
			map.put("c", vect);
			return "Addalumni";
		} else {
			return "Alumnimaster";
		}
	}

	@RequestMapping(value = "/success")
	public String getbatch(HttpServletRequest req, Alumnimastermodel amd, Model md) {
		boolean b;
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String contact = req.getParameter("contact");
		int age = Integer.parseInt(req.getParameter("age"));
		String company = req.getParameter("comp");
		int Bid = Integer.parseInt(req.getParameter("bid"));
		amd.setname(name);
		amd.setemail(email);
		amd.setcontact(contact);
		amd.setage(age);
		amd.setcompany(company);
		amd.setbid(Bid);
		b = amservice.isAlumniadded(amd);
		if (b) {
			md.addAttribute("msg", "Alumni Added Successfully");
		} else {
			md.addAttribute("msg", "Alumni not Added Successfully");
		}
		return "Addalumni";
	}

	@RequestMapping(value = "/viewalumni")
	public String viewalumni(Map<String, Vector<Alumnimastermodel>> map) {
		Vector<Alumnimastermodel> vect1 = amservice.viewalumni();
		/* System.out.println(vect1); */
		if (vect1 != null) {
			map.put("a", vect1);
			return "viewalumni";
		} else {
			return "Alumnimaster";
		}
	}

	@RequestMapping(value = "/remove")
	public String deleteemployeebyid(@RequestParam("aid") Integer aid, Map map) {
		amservice.deletealumnibyid(aid);
		Vector<Alumnimastermodel> list = amservice.viewalumni();
		if (list != null) {
			map.put("a", list);
		}
		return "viewalumni";
	}
}