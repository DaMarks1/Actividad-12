import java.util.HashMap;

public class Agenda {
    private HashMap<String, Contacto> contactos;

    public Agenda(HashMap<String, Contacto> contactos) {
        this.contactos = contactos;
    }

    public Agenda() {
        this.contactos = new HashMap<>();
    }

    public void agregarContacto(Contacto contacto){
        contactos.put(contacto.getNombre(),contacto);

    }
    public Contacto buscarContacto(String nombre){
        return contactos.get(nombre);

    }
    public void mostrarContacto(){
        if(contactos.isEmpty()){
            System.out.println("No hay contactos");
        }else {
            for(Contacto contacto: contactos.values()){
                System.out.println(contacto.toString());
            }
        }
    }

}
