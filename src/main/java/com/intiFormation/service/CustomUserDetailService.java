package com.intiFormation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.intiFormation.model.Role;
import com.intiFormation.model.Utilisateur;


@Service
public class CustomUserDetailService implements UserDetailsService {

	
	@Autowired
	IUtilisateurService utiService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utilisateur utilisateur = utiService.findByUsername(username);
		
		if(utilisateur==null)
		{
			throw new UsernameNotFoundException(username);
		}
		
		List<GrantedAuthority> authorities = getGrantedAuthority(utilisateur);
		
		return new User(utilisateur.getUsername(), utilisateur.getPassword(), authorities);
		
	}
	
	
	private List<GrantedAuthority> getGrantedAuthority (Utilisateur utilisateur)
	{
		List<GrantedAuthority> liste = new ArrayList<>();
		Role role = utilisateur.getRole();
		
		liste.add(new SimpleGrantedAuthority(role.getNom()));
		return liste;
	}

}
