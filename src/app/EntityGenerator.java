package app;

import entity.Usuario;

public class EntityGenerator {

	/**
	 * Este método retorna um array de {@link Usuario}
	 * @return array de {@link Usuario}
	 */
	public static Usuario[] arrayUsuario() {

		Usuario[] usuarios = new Usuario[20];
		
		for (int i = 0; i < 20; i++) {
			usuarios[i] = new Usuario((i + 1), "Usuario " + (i + 1), "teste@teste.com", "1234");
		}

		return usuarios;
	}

}
