package testClass;

import page.CargaInformacion;
import page.Login;

import java.text.ParseException;

public class Logeo {

    private Login login;

    private CargaInformacion cargaInformacion;

    public Logeo(){

    }



    public void CasoLogin1(String usuario, String clave)throws ParseException {

        login = new Login();
        cargaInformacion = new CargaInformacion();
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Testing");
        cargaInformacion.rellenarCampoMail("hsharpe@qanova.cl");
        cargaInformacion.rellenarCampoAreaTexto("QA NOVA GROUP");
        cargaInformacion.SeleccionarFechaCalendario("2023-10-30");
        //cargaInformacion.rellenarCampoFecha("21-07-2021");
        cargaInformacion.rellenarCampoLista("valor 1");
        cargaInformacion.seleccionMultiple("1,2,3");
        cargaInformacion.comboRadio(2);
        cargaInformacion.clickBtnEnviar();




    }

}
