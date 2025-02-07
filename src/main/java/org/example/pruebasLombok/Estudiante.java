package org.example.pruebasLombok;

import lombok.*;

@Getter @Setter // Genera los métodos getter y setter
@ToString // Genera el método toString
@AllArgsConstructor // Genera un constructor con todos los argumentos
@RequiredArgsConstructor // Genera un constructor con los argumentos marcados como @NonNull
@NoArgsConstructor // Genera un constructor sin argumentos

public class Estudiante {

    @NonNull // Marca el atributo como obligatorio
    private String nombre;
    private int edad;
    private Curso curso;

}



