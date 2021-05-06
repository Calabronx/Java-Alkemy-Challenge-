package com.university.University.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.university.University.interfaces.IAlumno;
import com.university.University.modelo.Alumno;

@Service
public class UserDetailServiceImpl implements UserDetailsService{

	@Autowired
	private IAlumno ialumn;
	private UserDetailServiceImpl userDetail;
	@Override
	public UserDetails loadUserByUsername(String dni) throws UsernameNotFoundException {
		Alumno alumno = ialumn.findByDni(dni);
		UserBuilder builder = null;
		
		if(alumno != null) {
			builder = User.withUsername(dni);
			builder.disabled(false);
			builder.password(dni);
			builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
		}
		else {
			throw new UsernameNotFoundException("Alumno no encontrado en la bdd");
		}
		return builder.build();
	}
	

}
