package com.clinica.autenticacion.service;
import java.util.List;
import com.clinica.autenticacion.model.Usuario;


public interface AuthService {
  List<Usuario> listarUsuarios();

  Usuario crearUsuario(Usuario usuario);

  Usuario actualizarUsuario(Usuario usuario);

  void eliminarUsuario(Long id);

  Usuario obtenerUsuarioPorId(Long id);

  Usuario obtenerUsuarioPorEmail(String email);

  Usuario obtenerUsuarioPorNombre(String nombre);
}
