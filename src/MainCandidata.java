import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
public class MainCandidata {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Candidata> listaCandidatas = new ArrayList<>();
    static Map<Integer, Integer>votos = new HashMap<>();
    public static void main(String[] args) {
        //7.	Interfaz de consola (menú)
        //o	Registrar candidata.
        //o	Listar todas.
        //o	Buscar por nombre/id.
        //o	Filtrar por tipo/distrito.
        //o	Simular voto / registrar voto manual.
        //o	Mostrar resultados y ganador.
        //o	Salir.
        int option =0;
        do{
            System.out.println("================= Sistema de Gestion de Elecciones =================");
            System.out.println("1. Registrar Candidata.");
            System.out.println("2. Listar Candidata.");
            System.out.println("3. Buscar por nombre/ID.");
            System.out.println("4. Filtrar por tipo/distrito.");
            System.out.println("5. Simular voto / registrar voto manual.");
            System.out.println("6. Mostrar resultados y ganado.");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opcion: ");
            String entrada = sc.nextLine();
            //excepciones
            try{
                if (entrada.trim().isEmpty()){
                    throw new DatoInvalidoException("La opcion no puede estar vacia.");
                }
                option = Integer.parseInt(entrada);
            }catch(DatoInvalidoException ex ){
                System.out.println("Error. "+ex.getMessage());
                continue;
            }catch(NumberFormatException ex){
                System.out.println("Error. Ingrese solo numeros.");
                continue;
            }
            try{
                switch (option){
                    case 1:
                        //metodo para registrar candidatas
                        registrarCandidatas();
                        break;
                    case 2:
                        //Metodo para listar candidatas
                        listarCandidatas();
                        break;
                    case 3:
                        //metodo para buscar
                        buscarCandidata();
                        break;
                    case 4:
                        //metodo para filtrar tipo
                        filtrarCandidata();
                        break;
                    case 5:
                        //Metodo para simular votos
                        simularVotos();
                        break;
                    case 6:
                        // Mostrar resultados
                        mostrarResultados();
                        break;
                    case 7:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        throw new DatoInvalidoException("Ingresa un numero válido:))).");
                }
            }catch(DatoInvalidoException ex ){
                System.out.println("Error. "+ex.getMessage());
                continue;
            }
        }while(option!=7);
    }
    static void registrarCandidatas()throws DatoInvalidoException{
        try{
            System.out.println("=== Registrar Candidata ===");
            System.out.println("Ingrese el ID de la candidata: ");
            String entradaid = sc.nextLine();
            if (entradaid.trim().isEmpty()){
                throw new DatoInvalidoException("El id no puede estar vacio.");
            }
            int id;
            try{
                id = Integer.parseInt(entradaid);
            }catch(NumberFormatException ex){
                throw new DatoInvalidoException("El id debe ser un numero.");
            }
            System.out.println("Ingrese el nombre de la candidata: ");
            String nombre = sc.nextLine();
            if (nombre.trim().isEmpty()){
                throw new DatoInvalidoException("El nombre no puede estar vacio.");
            }
            System.out.println("Ingrese la edad de la candidata: ");
            String Entradaedad = sc.nextLine();
            if (Entradaedad.trim().isEmpty()){
                throw new DatoInvalidoException("La edad no debe estar vacia.");
            }
            int edad;
            try{
                edad = Integer.parseInt(Entradaedad);
            }catch(NumberFormatException ex){
                throw new DatoInvalidoException("La edad debe ser un numero.");
            }
            System.out.println("Ingrese el distrito de la candidata: ");
            String distrito = sc.nextLine();
            if (distrito.trim().isEmpty()){
                throw new DatoInvalidoException("El distrito no puede estar vacio.");
            }
            System.out.println("Ingrese el puntaje del jurado: ");
            String puntajeEntrada = sc.nextLine();
            if (puntajeEntrada.trim().isEmpty()){
                throw new DatoInvalidoException("El puntaje no puede estar vacio");
            }
            double puntajeJurado;
            try{
                puntajeJurado = Double.parseDouble(puntajeEntrada);
            }catch(NumberFormatException ex){
                throw new DatoInvalidoException("El puntaje debe ser un numero.");
            }
            System.out.println("Ingrese el tipo de Candidata: ");
            System.out.println("1. Estudiante.");
            System.out.println("2. Profesional.");
            String entradaTipo = sc.nextLine();
            if (entradaTipo.trim().isEmpty()){
                throw new DatoInvalidoException("Tipo de candidata no debe ser nulo");
            }
            int tipo;
            try{
                tipo = Integer.parseInt(entradaTipo);
            }catch(NumberFormatException ex){
                throw new DatoInvalidoException("Ingrese 1 o 2");
            }
            //creamos el objeto
            Candidata nueva;
            if (tipo == 1){
                System.out.println("Universidad: ");
                String Universidad = sc.nextLine();
                if (Universidad.trim().isEmpty()){
                    throw new DatoInvalidoException("Universidad no puede estar vacia.");
                }
                System.out.println("Carrera: ");
                String carrera = sc.nextLine();
                if(carrera.trim().isEmpty()){
                    throw new DatoInvalidoException("Carrera no puede estar vacia.");
                }
                nueva = new CandidataEstudiante(id,nombre,edad,distrito,puntajeJurado,Universidad,carrera);
            }else if(tipo == 2){
                System.out.println("Profesion: ");
                String Profesion = sc.nextLine();
                if(Profesion.trim().isEmpty()){
                    throw new DatoInvalidoException("La Profesion no puede estar vacia.");
                }
                System.out.println("Años de experiencia: ");
                String entradaAnios = sc.nextLine();
                if(entradaAnios.trim().isEmpty()){
                    throw new DatoInvalidoException("no puede dejar vacio.");
                }
                int anios;
                try{
                    anios = Integer.parseInt(entradaAnios);
                }catch(NumberFormatException ex){
                    throw new DatoInvalidoException("Ingrese años validos.");
                }
                nueva = new CandidataProfesional(id,nombre,edad,distrito,puntajeJurado, Profesion,anios);
            }else{
                throw new DatoInvalidoException("Tipo invalido.");
            }
            listaCandidatas.add(nueva);
        }catch(DatoInvalidoException ex ){
            System.out.println("Error. "+ex.getMessage());
        }
    }
    static void listarCandidatas()throws DatoInvalidoException{
        if(listaCandidatas.isEmpty()){
            System.out.println("No existen candidatas registradas.");
            return;
        }
        System.out.println("=== Listar Candidatas ===");
        for (Candidata c:listaCandidatas){
            c.mostrarDetalles();
            System.out.println("--------------------------------------------");
        }
    }
    static void buscarCandidata()throws DatoInvalidoException{
        if(listaCandidatas.isEmpty()){
            System.out.println("No existen candidatas registradas.");
            return;
        }
        System.out.println("=== Buscar Candidata ===");
        System.out.println("1. Buscar por ID");
        System.out.println("2. Buscar por nombre");
        System.out.println("Seleccione una opcion: ");
        String entradabuscar= sc.nextLine();
        if(entradabuscar.trim().isEmpty()){
            throw new DatoInvalidoException("Ingrese una opcion.");
        }
        int buscar;
        try{
            buscar = Integer.parseInt(entradabuscar);
        }catch(NumberFormatException ex){
            throw new DatoInvalidoException("Ingrese un numero.");
        }
        switch(buscar){
            case 1:
                System.out.println("INGRESE EL ID: ");
                String entradaId= sc.nextLine();
                if(entradaId.trim().isEmpty()){
                    throw new DatoInvalidoException("El id no puede estar vacio.");
                }
                int id;
                try{
                    id = Integer.parseInt(entradaId);
                }catch(NumberFormatException ex){
                    throw new DatoInvalidoException("Debe ingresar un numero.");
                }
                boolean encontradoId = false;
                for(Candidata c:listaCandidatas){
                    if(c.getId() == id){
                        c.mostrarDetalles();
                        encontradoId = true;
                    }
                }
                if(!encontradoId){
                    System.out.println("No existe una candidata con ese ID.");
                }
                break;
            case 2:
                System.out.println("Ingrese el nombre: ");
                String entradaNombre= sc.nextLine();
                if(entradaNombre.trim().isEmpty()){
                    throw new DatoInvalidoException("El nombre no debe estar vacio.");
                }
                boolean encontradoNombre=false;
                for(Candidata c:listaCandidatas){
                    if(c.getNombre().equals(entradaNombre)){
                        c.mostrarDetalles();
                        encontradoNombre=true;
                    }
                }
                if(!encontradoNombre){
                    System.out.println("No existe una candidata con ese nombre.");
                }
                break;
            default:
                throw new DatoInvalidoException("Opcion invalida.");
        }
    }
    static void filtrarCandidata()throws DatoInvalidoException{
        if(listaCandidatas.isEmpty()){
            System.out.println("No exisnten candidatas registradas.");
            return;
        }
        System.out.println("=== Filtrar Candidata ===");
        System.out.println("1. Filtrar por Estudiante.");
        System.out.println("2. Filtrar por Profesion");
        System.out.println("3. Filtrar por Distrito.");
        System.out.println("Ingrese una opcion: ");
        String entradaFiltrar= sc.nextLine();
        if(entradaFiltrar.trim().isEmpty()){
            throw new DatoInvalidoException("Ingrese una opcion.");
        }
        int filtrar;
        try{
            filtrar = Integer.parseInt(entradaFiltrar);
        }catch(NumberFormatException ex){
            throw new DatoInvalidoException("Debe ingresar un numero.");
        }
        boolean encontrado = false;
        switch(filtrar){
            case 1:
                System.out.println("=== CAndidatas Estudiantes ===");
                for(Candidata c: listaCandidatas){
                    if(c instanceof CandidataEstudiante){
                        c.mostrarDetalles();
                        System.out.println("--------------------------");
                        encontrado = true;
                    }
                }
                if(!encontrado){
                    System.out.println("No existen candidatas estudiantes.");
                }
                break;
            case 2:
                System.out.println("=== Candidatas Profesionales ===");
                for(Candidata c : listaCandidatas){
                    if(c instanceof CandidataProfesional){
                        c.mostrarDetalles();
                        System.out.println("--------------------------");
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("No existe una candidatas profesionales.");
                }
                    break;
            case 3:
                System.out.println("Ingrese el distrito a filtrar: ");
                String buscarDistrito= sc.nextLine();
                if(buscarDistrito.trim().isEmpty()){
                    throw new DatoInvalidoException("Debe ingresar un numero.");
                }
                System.out.println("=== Candidatas por Distrito ===");
                for(Candidata c : listaCandidatas){
                    if(c.getDistrito().equals(buscarDistrito)){
                        c.mostrarDetalles();
                        System.out.println("--------------------------");
                        encontrado = true;
                    }
                }
                if (!encontrado){
                    System.out.println("No existe una candidatas por Distrito.");
                }
                break;
            default:
                throw new DatoInvalidoException("Opcion invalida.");
        }
    }
    static void simularVotos()throws DatoInvalidoException{
        if(listaCandidatas.isEmpty()){
            System.out.println("No existen candidatas registradas.");
            return;
        }
        System.out.println("=== Simular Votos ===");
        System.out.println("=== Candidatas ===");
        for(Candidata c: listaCandidatas){
            c.mostrarDetalles();
            System.out.println("-----------------------------");
        }
        System.out.println("Ingrese el id de la candidata para votar");
        String entradaid =  sc.nextLine();
        if(entradaid.trim().isEmpty()){
            throw new DatoInvalidoException("El ID no puede estar vacio.");
        }
        int id;
        try{
            id = Integer.parseInt(entradaid);
        }catch(NumberFormatException ex){
            throw new DatoInvalidoException("Debe ingresar un numero.");
        }
        // verificamos que exista el id
        boolean encontrado = false;
        for (Candidata c: listaCandidatas){
            if(c.getId() == id){
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No existe una candidata con ese ID.");
        }
        //registramos votos
        votos.put(id,votos.getOrDefault(id,0)+1);
        System.out.println("Voto exitoso para la candidata que tiene el id: "+id);
    }
    static void mostrarResultados()throws DatoInvalidoException{
        if (listaCandidatas.isEmpty()){
            System.out.println("No existen candidatas registradas.");
            return;
        }
        if(votos.isEmpty()){
            System.out.println("AUn no se han registrado votos.");
            return;
        }

        System.out.println("=== Resultados ===");
        for(Candidata c: listaCandidatas){
            int id =c.getId();
            int cantVotos=votos.getOrDefault(id,0);
            System.out.println("ID: "+id+
                    " | Nombre: "+c.getNombre()+
                    " | Votos: "+cantVotos+
                    " | Puntaje Jurado: "+c.getPuntajeJurado());
        }
        // determinar ganadora
        Candidata ganadora= null;
        int maxVotos=-1;
        for(Candidata c: listaCandidatas){
            int cantVotos=votos.getOrDefault(c.getId(),0);
            if(cantVotos>maxVotos){
                maxVotos=cantVotos;
                ganadora = c;
            }
            //Empate
            else if(cantVotos==maxVotos&&ganadora!=null){
                if(c.getPuntajeJurado()>ganadora.getPuntajeJurado()){
                    ganadora=c;
                }
            }
        }
        System.out.println("=== Ganadora ===");
        if(ganadora!=null){
            ganadora.mostrarDetalles();
            System.out.println("Votos obtenidos: "+maxVotos);
        }
    }
}
