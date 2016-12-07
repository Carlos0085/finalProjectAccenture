package com.java.academy.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.java.academy.model.User;
import com.java.academy.repository.UsersRepository;


@SessionAttributes("{nombre,listaUsuarios, usuariosDetalle}")
@RequestMapping("/Users")
@Controller
public class UserController  {
	
	@Autowired
	private UsersRepository userRepo;

	
	
	@RequestMapping("/")
	public String viewUsers(Model model){
		model.addAttribute("users",userRepo.findAll());
		System.out.println(userRepo.findAll());
		return "users";
	}
	
	@RequestMapping("/Add")
	public String addUserView(Model model){
		model.addAttribute("user", new User());
		return "crearUsuario";
	}
	@RequestMapping("/Save")
	public String saveUser(Model model, @ModelAttribute User user){
		System.out.println(user);
		userRepo.saveAndFlush(user);
		return "redirect:/Users/";
	}
	@RequestMapping("/Eliminar/{user}")
	public String deleteUser(Model model, @PathVariable("user") int id){
		userRepo.delete(id);
		return "redirect:/Users/";
	}
	@RequestMapping("/Detalles/{user}")
	public String detalleUser(Model model, @PathVariable("user") int id){
		model.addAttribute("user",userRepo.findOne(id));
		return "userDetails";
	}
	@RequestMapping("/Editar/{user}")
	public String editUser(Model model, @PathVariable("user") int id){
		model.addAttribute("user",userRepo.findOne(id));
		return "editarUsuario";
	}
	@RequestMapping("/GuardarCambios/{user}")
	public String saveChangesUser(Model model, @PathVariable("user") int id, @ModelAttribute User user){
		User existingUser = userRepo.findOne(id);
		BeanUtils.copyProperties(user, existingUser);
		userRepo.saveAndFlush(existingUser);
		return "redirect:/Users/";
	}
	
	@RequestMapping("/{userName}")
	public String userDetail(Model model){
		return "users";
	}

	

}
