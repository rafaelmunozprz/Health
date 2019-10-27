/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthfocus;

import java.sql.SQLException;
import java.util.Random;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Kevin
 */
public class nuevoPacienteFrame extends javax.swing.JFrame {

    selectorTexto seleccionarTexto = new selectorTexto();
    funciones funcion = new funciones();

    /**
     * Bloque para la asignación de getters y setters de la la primer ventana de
     * un nuevo usuario, DATOS PERSONALES
     */
    private String vdpNombre = "";
    private String vdpApellidos = "";
    private String vdpSexo = "";
    private String vdpNacimiento = "";
    private String vdpEdad = "";
    private String vdpCPostal = "";
    private String vdpDomicilio = "";
    private String vdpEscolaridad = "";
    private String vdpCiudad = "";
    private String vdpEstadoCivil = "";
    private String vdpIDEspediente = "";
    private String vdpEmail = "";

    public String getVdpNombre() {
        return vdpNombre;
    }

    public void setVdpNombre(String vdpNombre) {
        this.vdpNombre = vdpNombre;
    }

    public String getVdpApellidos() {
        return vdpApellidos;
    }

    public void setVdpApellidos(String vdpApellidos) {
        this.vdpApellidos = vdpApellidos;
    }

    public String getVdpSexo() {
        return vdpSexo;
    }

    public void setVdpSexo(String vdpSexo) {
        this.vdpSexo = vdpSexo;
    }

    public String getVdpNacimiento() {
        return vdpNacimiento;
    }

    public void setVdpNacimiento(String vdpNacimiento) {
        this.vdpNacimiento = vdpNacimiento;
    }

    public String getVdpEdad() {
        return vdpEdad;
    }

    public void setVdpEdad(String vdpEdad) {
        this.vdpEdad = vdpEdad;
    }

    public String getVdpCPostal() {
        return vdpCPostal;
    }

    public void setVdpCPostal(String vdpCPostal) {
        this.vdpCPostal = vdpCPostal;
    }

    public String getVdpDomicilio() {
        return vdpDomicilio;
    }

    public void setVdpDomicilio(String vdpDomicilio) {
        this.vdpDomicilio = vdpDomicilio;
    }

    public String getVdpEscolaridad() {
        return vdpEscolaridad;
    }

    public void setVdpEscolaridad(String vdpEscolaridad) {
        this.vdpEscolaridad = vdpEscolaridad;
    }

    public String getVdpCiudad() {
        return vdpCiudad;
    }

    public void setVdpCiudad(String vdpCiudad) {
        this.vdpCiudad = vdpCiudad;
    }

    public String getVdpEstadoCivil() {
        return vdpEstadoCivil;
    }

    public void setVdpEstadoCivil(String vdpEstadoCivil) {
        this.vdpEstadoCivil = vdpEstadoCivil;
    }

    public String getVdpIDEspediente() {
        return vdpIDEspediente;
    }

    public void setVdpIDEspediente(String vdpIDEspediente) {
        this.vdpIDEspediente = vdpIDEspediente;
    }

    public String getVdpEmail() {
        return vdpEmail;
    }

    public void setVdpEmail(String vdpEmail) {
        this.vdpEmail = vdpEmail;
    }

    /**
     * Bloque para la asignación de getters y setters de la segunda ventana de
     * un nuevo usuario, ANTECEDENTES SALUD Y ENFERMEDAD
     */
    private String vasediarrea = "";
    private String vaseestrenimiento = "";
    private String vasegastritis = "";
    private String vaseulcera = "";
    private String vasenauseas = "";
    private String vasepirosis = "";
    private String vasevomito = "";
    private String vasecolitis = "";
    private String vasedentadura = "";
    private String vaseotros = "";
    private String vaseobservaciones = "";
    private String vaseenfermedadDiagosticada = "";
    private String vasecualED = "";
    private String vaseenfermedadImportante = "";
    private String vasecualEI = "";
    private String vasemedicamento = "";
    private String vasecualMedicamento = "";
    private String vasedosisMedicamento = "";
    private String vasetiempoMedicamento = "";
    private String vaselaxantes = "";
    private String vasediureticos = "";
    private String vaseantiacidos = "";
    private String vaseanalgesicos = "";
    private String vasecirujia = "";
    private String vasecualCirujia = "";

    public String getVasediarrea() {
        return vasediarrea;
    }

    public void setVasediarrea(String vasediarrea) {
        this.vasediarrea = vasediarrea;
    }

    public String getVaseestrenimiento() {
        return vaseestrenimiento;
    }

    public void setVaseestrenimiento(String vaseestrenimiento) {
        this.vaseestrenimiento = vaseestrenimiento;
    }

    public String getVasegastritis() {
        return vasegastritis;
    }

    public void setVasegastritis(String vasegastritis) {
        this.vasegastritis = vasegastritis;
    }

    public String getVaseulcera() {
        return vaseulcera;
    }

    public void setVaseulcera(String vaseulcera) {
        this.vaseulcera = vaseulcera;
    }

    public String getVasenauseas() {
        return vasenauseas;
    }

    public void setVasenauseas(String vasenauseas) {
        this.vasenauseas = vasenauseas;
    }

    public String getVasepirosis() {
        return vasepirosis;
    }

    public void setVasepirosis(String vasepirosis) {
        this.vasepirosis = vasepirosis;
    }

    public String getVasevomito() {
        return vasevomito;
    }

    public void setVasevomito(String vasevomito) {
        this.vasevomito = vasevomito;
    }

    public String getVasecolitis() {
        return vasecolitis;
    }

    public void setVasecolitis(String vasecolitis) {
        this.vasecolitis = vasecolitis;
    }

    public String getVasedentadura() {
        return vasedentadura;
    }

    public void setVasedentadura(String vasedentadura) {
        this.vasedentadura = vasedentadura;
    }

    public String getVaseobservaciones() {
        return vaseobservaciones;
    }

    public void setVaseobservaciones(String vaseobservaciones) {
        this.vaseobservaciones = vaseobservaciones;
    }

    public String getVaseenfermedadDiagosticada() {
        return vaseenfermedadDiagosticada;
    }

    public void setVaseenfermedadDiagosticada(String vaseenfermedadDiagosticada) {
        this.vaseenfermedadDiagosticada = vaseenfermedadDiagosticada;
    }

    public String getVasecualED() {
        return vasecualED;
    }

    public void setVasecualED(String vasecualED) {
        this.vasecualED = vasecualED;
    }

    public String getVaseenfermedadImportante() {
        return vaseenfermedadImportante;
    }

    public void setVaseenfermedadImportante(String vaseenfermedadImportante) {
        this.vaseenfermedadImportante = vaseenfermedadImportante;
    }

    public String getVasecualEI() {
        return vasecualEI;
    }

    public void setVasecualEI(String vasecualEI) {
        this.vasecualEI = vasecualEI;
    }

    public String getVasemedicamento() {
        return vasemedicamento;
    }

    public void setVasemedicamento(String vasemedicamento) {
        this.vasemedicamento = vasemedicamento;
    }

    public String getVasecualMedicamento() {
        return vasecualMedicamento;
    }

    public void setVasecualMedicamento(String vasecualMedicamento) {
        this.vasecualMedicamento = vasecualMedicamento;
    }

    public String getVasedosisMedicamento() {
        return vasedosisMedicamento;
    }

    public void setVasedosisMedicamento(String vasedosisMedicamento) {
        this.vasedosisMedicamento = vasedosisMedicamento;
    }

    public String getVasetiempoMedicamento() {
        return vasetiempoMedicamento;
    }

    public void setVasetiempoMedicamento(String vasetiempoMedicamento) {
        this.vasetiempoMedicamento = vasetiempoMedicamento;
    }

    public String getVaselaxantes() {
        return vaselaxantes;
    }

    public void setVaselaxantes(String vaselaxantes) {
        this.vaselaxantes = vaselaxantes;
    }

    public String getVasediureticos() {
        return vasediureticos;
    }

    public void setVasediureticos(String vasediureticos) {
        this.vasediureticos = vasediureticos;
    }

    public String getVaseantiacidos() {
        return vaseantiacidos;
    }

    public void setVaseantiacidos(String vaseantiacidos) {
        this.vaseantiacidos = vaseantiacidos;
    }

    public String getVaseanalgesicos() {
        return vaseanalgesicos;
    }

    public void setVaseanalgesicos(String vaseanalgesicos) {
        this.vaseanalgesicos = vaseanalgesicos;
    }

    public String getVasecirujia() {
        return vasecirujia;
    }

    public void setVasecirujia(String vasecirujia) {
        this.vasecirujia = vasecirujia;
    }

    public String getVasecualCirujia() {
        return vasecualCirujia;
    }

    public void setVasecualCirujia(String vasecualCirujia) {
        this.vasecualCirujia = vasecualCirujia;
    }

    public String getVaseotros() {
        return vaseotros;
    }

    public void setVaseotros(String vaseotros) {
        this.vaseotros = vaseotros;
    }

    /**
     * Bloque para la asignación de getters y setters de la tercera ventana de
     * un nuevo usuario, ASEPECTOS GINECOLOGICOS
     */
    private String vagEmbarazoAcutal = "";
    private String vagSemanasGestacion = "";
    private String vagAnticonceptivos = "";
    private String vagCualAnticonceptivo = "";
    private String vagDosisAnticoconceptivo = "";
    private String vagTiempoAnticonceptivo = "";
    private String vagClimaterio = "";
    private String vagTerapiaHormonal = "";
    private String vagCualTerapiaHormonal = "";
    private String vagDosisTerapiaHormonal = "";
    private String vagTiempoTerapiaHormonal = "";

    public String getVagEmbarazoAcutal() {
        return vagEmbarazoAcutal;
    }

    public void setVagEmbarazoAcutal(String vagEmbarazoAcutal) {
        this.vagEmbarazoAcutal = vagEmbarazoAcutal;
    }

    public String getVagSemanasGestacion() {
        return vagSemanasGestacion;
    }

    public void setVagSemanasGestacion(String vagSemanasGestacion) {
        this.vagSemanasGestacion = vagSemanasGestacion;
    }

    public String getVagAnticonceptivos() {
        return vagAnticonceptivos;
    }

    public void setVagAnticonceptivos(String vagAnticonceptivos) {
        this.vagAnticonceptivos = vagAnticonceptivos;
    }

    public String getVagCualAnticonceptivo() {
        return vagCualAnticonceptivo;
    }

    public void setVagCualAnticonceptivo(String vagCualAnticonceptivo) {
        this.vagCualAnticonceptivo = vagCualAnticonceptivo;
    }

    public String getVagDosisAnticoconceptivo() {
        return vagDosisAnticoconceptivo;
    }

    public void setVagDosisAnticoconceptivo(String vagDosisAnticoconceptivo) {
        this.vagDosisAnticoconceptivo = vagDosisAnticoconceptivo;
    }

    public String getVagTiempoAnticonceptivo() {
        return vagTiempoAnticonceptivo;
    }

    public void setVagTiempoAnticonceptivo(String vagTiempoAnticonceptivo) {
        this.vagTiempoAnticonceptivo = vagTiempoAnticonceptivo;
    }

    public String getVagClimaterio() {
        return vagClimaterio;
    }

    public void setVagClimaterio(String vagClimaterio) {
        this.vagClimaterio = vagClimaterio;
    }

    public String getVagTerapiaHormonal() {
        return vagTerapiaHormonal;
    }

    public void setVagTerapiaHormonal(String vagTerapiaHormonal) {
        this.vagTerapiaHormonal = vagTerapiaHormonal;
    }

    public String getVagCualTerapiaHormonal() {
        return vagCualTerapiaHormonal;
    }

    public void setVagCualTerapiaHormonal(String vagCualTerapiaHormonal) {
        this.vagCualTerapiaHormonal = vagCualTerapiaHormonal;
    }

    public String getVagDosisTerapiaHormonal() {
        return vagDosisTerapiaHormonal;
    }

    public void setVagDosisTerapiaHormonal(String vagDosisTerapiaHormonal) {
        this.vagDosisTerapiaHormonal = vagDosisTerapiaHormonal;
    }

    public String getVagTiempoTerapiaHormonal() {
        return vagTiempoTerapiaHormonal;
    }

    public void setVagTiempoTerapiaHormonal(String vagTiempoTerapiaHormonal) {
        this.vagTiempoTerapiaHormonal = vagTiempoTerapiaHormonal;
    }
    /**
     * Bloque para la asignación de getters y setters de la cuarta ventana de un
     * nuevo usuario, DIARIO DE ACTIVIDADES
     */
    private String vddaHoraDespertarse = "";
    private String vddaMinutoDespertarse = "";
    private String vddaDespertarse = "";
    private String vddaHoraDesayuno = "";
    private String vddaMinutoDesayuno = "";
    private String vddaDesayuno = "";
    private String vddaHoraComida = "";
    private String vddaMinutosComida = "";
    private String vddaComida = "";
    private String vddaHoraCena = "";
    private String vddaMinutosCena = "";
    private String vddaCena = "";
    private String vddaHoraAcostarse = "";
    private String vddaMinutosAcostarse = "";
    private String vddaAcostarse = "";
    private String vddaAspectoGeneral = "";
    private String vddaTipoEjercicio = "";
    private String vddaFrecuenciaEjercicio = "";
    private String vddaDuracionEjercicio = "";
    private String vddaPresionArterial = "";
    private String vddaCualPresionArterial = "";
    private String vddaHoraPresionArterial = "";
    private String vddaTabaco = "";
    private String vddaAlcohol = "";
    private String vddaCafe = "";

    public String getVddaHoraDespertarse() {
        return vddaHoraDespertarse;
    }

    public void setVddaHoraDespertarse(String vddaHoraDespertarse) {
        this.vddaHoraDespertarse = vddaHoraDespertarse;
    }

    public String getVddaMinutoDespertarse() {
        return vddaMinutoDespertarse;
    }

    public void setVddaMinutoDespertarse(String vddaMinutoDespertarse) {
        this.vddaMinutoDespertarse = vddaMinutoDespertarse;
    }

    public String getVddaDespertarse() {
        return vddaDespertarse;
    }

    public void setVddaDespertarse(String vddaDespertarse) {
        this.vddaDespertarse = vddaDespertarse;
    }

    public String getVddaHoraDesayuno() {
        return vddaHoraDesayuno;
    }

    public void setVddaHoraDesayuno(String vddaHoraDesayuno) {
        this.vddaHoraDesayuno = vddaHoraDesayuno;
    }

    public String getVddaMinutoDesayuno() {
        return vddaMinutoDesayuno;
    }

    public void setVddaMinutoDesayuno(String vddaMinutoDesayuno) {
        this.vddaMinutoDesayuno = vddaMinutoDesayuno;
    }

    public String getVddaDesayuno() {
        return vddaDesayuno;
    }

    public void setVddaDesayuno(String vddaDesayuno) {
        this.vddaDesayuno = vddaDesayuno;
    }

    public String getVddaHoraComida() {
        return vddaHoraComida;
    }

    public void setVddaHoraComida(String vddaHoraComida) {
        this.vddaHoraComida = vddaHoraComida;
    }

    public String getVddaMinutosComida() {
        return vddaMinutosComida;
    }

    public void setVddaMinutosComida(String vddaMinutosComida) {
        this.vddaMinutosComida = vddaMinutosComida;
    }

    public String getVddaComida() {
        return vddaComida;
    }

    public void setVddaComida(String vddaComida) {
        this.vddaComida = vddaComida;
    }

    public String getVddaHoraCena() {
        return vddaHoraCena;
    }

    public void setVddaHoraCena(String vddaHoraCena) {
        this.vddaHoraCena = vddaHoraCena;
    }

    public String getVddaMinutosCena() {
        return vddaMinutosCena;
    }

    public void setVddaMinutosCena(String vddaMinutosCena) {
        this.vddaMinutosCena = vddaMinutosCena;
    }

    public String getVddaCena() {
        return vddaCena;
    }

    public void setVddaCena(String vddaCena) {
        this.vddaCena = vddaCena;
    }

    public String getVddaHoraAcostarse() {
        return vddaHoraAcostarse;
    }

    public void setVddaHoraAcostarse(String vddaHoraAcostarse) {
        this.vddaHoraAcostarse = vddaHoraAcostarse;
    }

    public String getVddaMinutosAcostarse() {
        return vddaMinutosAcostarse;
    }

    public void setVddaMinutosAcostarse(String vddaMinutosAcostarse) {
        this.vddaMinutosAcostarse = vddaMinutosAcostarse;
    }

    public String getVddaAcostarse() {
        return vddaAcostarse;
    }

    public void setVddaAcostarse(String vddaAcostarse) {
        this.vddaAcostarse = vddaAcostarse;
    }

    public String getVddaAspectoGeneral() {
        return vddaAspectoGeneral;
    }

    public void setVddaAspectoGeneral(String vddaAspectoGeneral) {
        this.vddaAspectoGeneral = vddaAspectoGeneral;
    }

    public String getVddaTipoEjercicio() {
        return vddaTipoEjercicio;
    }

    public void setVddaTipoEjercicio(String vddaTipoEjercicio) {
        this.vddaTipoEjercicio = vddaTipoEjercicio;
    }

    public String getVddaFrecuenciaEjercicio() {
        return vddaFrecuenciaEjercicio;
    }

    public void setVddaFrecuenciaEjercicio(String vddaFrecuenciaEjercicio) {
        this.vddaFrecuenciaEjercicio = vddaFrecuenciaEjercicio;
    }

    public String getVddaDuracionEjercicio() {
        return vddaDuracionEjercicio;
    }

    public void setVddaDuracionEjercicio(String vddaDuracionEjercicio) {
        this.vddaDuracionEjercicio = vddaDuracionEjercicio;
    }

    public String getVddaPresionArterial() {
        return vddaPresionArterial;
    }

    public void setVddaPresionArterial(String vddaPresionArterial) {
        this.vddaPresionArterial = vddaPresionArterial;
    }

    public String getVddaCualPresionArterial() {
        return vddaCualPresionArterial;
    }

    public void setVddaCualPresionArterial(String vddaCualPresionArterial) {
        this.vddaCualPresionArterial = vddaCualPresionArterial;
    }

    public String getVddaHoraPresionArterial() {
        return vddaHoraPresionArterial;
    }

    public void setVddaHoraPresionArterial(String vddaHoraPresionArterial) {
        this.vddaHoraPresionArterial = vddaHoraPresionArterial;
    }

    public String getVddaTabaco() {
        return vddaTabaco;
    }

    public void setVddaTabaco(String vddaTabaco) {
        this.vddaTabaco = vddaTabaco;
    }

    public String getVddaAlcohol() {
        return vddaAlcohol;
    }

    public void setVddaAlcohol(String vddaAlcohol) {
        this.vddaAlcohol = vddaAlcohol;
    }

    public String getVddaCafe() {
        return vddaCafe;
    }

    public void setVddaCafe(String vddaCafe) {
        this.vddaCafe = vddaCafe;
    }
    /**
     * Bloque para la asignación de getters y setters de la tercera ventana de
     * un nuevo usuario, INDICADORES DIETETICOS
     */
    private String vidCuantasComidas = "";
    private String vidQuienPrepara = "";
    private String vidSiEntreComidas = "";
    private String vidNoEntreComidas = "";
    private String vidQueEntreComidas = "";
    private String vidComidasCasaSemana = "";
    private String vidComidasCasaFin = "";
    private String vidComidasFueraSemana = "";
    private String vidComidasFueraFin = "";
    private String vidSiModificacionAlimentos = "";
    private String vidNoModificacionAlimentos = "";
    private String vidRazonModificacion = "";
    private String vidApetitoBueno = "";
    private String vidApetitoMalo = "";
    private String vidApetitoRegular = "";
    private String vidLevantarseHambre = "";
    private String vidMananaHambre = "";
    private String vidTardeHambre = "";
    private String vidNocheHambre = "";
    private String vidAlimentosPreferidos = "";
    private String vidAlimentosNoPreferidos = "";
    private String vidAlimentosMalestar = "";
    private String vidSiAlimentosIntolerante = "";
    private String vidNoAlimentosIntolerante = "";
    private String vidCualIntolerante = "";
    private String vidApetitoVariableEDA = ""; //Estado de animo
    private String vidNuloEDA = "";
    private String vidMenorEDA = "";
    private String vidMayorEDA = "";
    private String vidSiSal = "";
    private String vidNoSal = "";
    private String vidMargarinaGrasa = "";
    private String vidAceiteGrasa = "";
    private String vidMantecaGrasa = "";
    private String vidMantequilla = "";
    private String vidOtroGrasa = "";
    private String vidSiDietaEspecial = "";
    private String vidNoDietaEspecial = "";
    private String vidCuantasDietaEspecial = "";
    private String vidHaceCuantoDietaEspecial = "";
    private String vidTiempoDietaEspecial = "";
    private String vidRazonDietaEspecial = "";
    private String vidNadaApegoDieta = "";
    private String vidMuyPocoAPegoDieta = "";
    private String vidSuficienteApegoDieta = "";
    private String vidExcepcionalApegoDieta = "";
    private String vidNadaResultadosDieta = "";
    private String vidMuyPocoResultadosDieta = "";
    private String vidSuficienteResultadosDieta = "";
    private String vidExcepcionalResultadosDieta = "";
    private String vidSiMedicamentosPeso = "";
    private String vidNoMedicamentosPeso = "";
    private String vidCualMedicamentoPeso = "";

    public String getVidCuantasComidas() {
        return vidCuantasComidas;
    }

    public void setVidCuantasComidas(String vidCuantasComidas) {
        this.vidCuantasComidas = vidCuantasComidas;
    }

    public String getVidQuienPrepara() {
        return vidQuienPrepara;
    }

    public void setVidQuienPrepara(String vidQuienPrepara) {
        this.vidQuienPrepara = vidQuienPrepara;
    }

    public String getVidSiEntreComidas() {
        return vidSiEntreComidas;
    }

    public void setVidSiEntreComidas(String vidSiEntreComidas) {
        this.vidSiEntreComidas = vidSiEntreComidas;
    }

    public String getVidNoEntreComidas() {
        return vidNoEntreComidas;
    }

    public void setVidNoEntreComidas(String vidNoEntreComidas) {
        this.vidNoEntreComidas = vidNoEntreComidas;
    }

    public String getVidQueEntreComidas() {
        return vidQueEntreComidas;
    }

    public void setVidQueEntreComidas(String vidQueEntreComidas) {
        this.vidQueEntreComidas = vidQueEntreComidas;
    }

    public String getVidComidasCasaSemana() {
        return vidComidasCasaSemana;
    }

    public void setVidComidasCasaSemana(String vidComidasCasaSemana) {
        this.vidComidasCasaSemana = vidComidasCasaSemana;
    }

    public String getVidComidasCasaFin() {
        return vidComidasCasaFin;
    }

    public void setVidComidasCasaFin(String vidComidasCasaFin) {
        this.vidComidasCasaFin = vidComidasCasaFin;
    }

    public String getVidComidasFueraSemana() {
        return vidComidasFueraSemana;
    }

    public void setVidComidasFueraSemana(String vidComidasFueraSemana) {
        this.vidComidasFueraSemana = vidComidasFueraSemana;
    }

    public String getVidComidasFueraFin() {
        return vidComidasFueraFin;
    }

    public void setVidComidasFueraFin(String vidComidasFueraFin) {
        this.vidComidasFueraFin = vidComidasFueraFin;
    }

    public String getVidSiModificacionAlimentos() {
        return vidSiModificacionAlimentos;
    }

    public void setVidSiModificacionAlimentos(String vidSiModificacionAlimentos) {
        this.vidSiModificacionAlimentos = vidSiModificacionAlimentos;
    }

    public String getVidNoModificacionAlimentos() {
        return vidNoModificacionAlimentos;
    }

    public void setVidNoModificacionAlimentos(String vidNoModificacionAlimentos) {
        this.vidNoModificacionAlimentos = vidNoModificacionAlimentos;
    }

    public String getVidRazonModificacion() {
        return vidRazonModificacion;
    }

    public void setVidRazonModificacion(String vidRazonModificacion) {
        this.vidRazonModificacion = vidRazonModificacion;
    }

    public String getVidApetitoBueno() {
        return vidApetitoBueno;
    }

    public void setVidApetitoBueno(String vidApetitoBueno) {
        this.vidApetitoBueno = vidApetitoBueno;
    }

    public String getVidApetitoMalo() {
        return vidApetitoMalo;
    }

    public void setVidApetitoMalo(String vidApetitoMalo) {
        this.vidApetitoMalo = vidApetitoMalo;
    }

    public String getVidApetitoRegular() {
        return vidApetitoRegular;
    }

    public void setVidApetitoRegular(String vidApetitoRegular) {
        this.vidApetitoRegular = vidApetitoRegular;
    }

    public String getVidLevantarseHambre() {
        return vidLevantarseHambre;
    }

    public void setVidLevantarseHambre(String vidLevantarseHambre) {
        this.vidLevantarseHambre = vidLevantarseHambre;
    }

    public String getVidMananaHambre() {
        return vidMananaHambre;
    }

    public void setVidMananaHambre(String vidMananaHambre) {
        this.vidMananaHambre = vidMananaHambre;
    }

    public String getVidTardeHambre() {
        return vidTardeHambre;
    }

    public void setVidTardeHambre(String vidTardeHambre) {
        this.vidTardeHambre = vidTardeHambre;
    }

    public String getVidNocheHambre() {
        return vidNocheHambre;
    }

    public void setVidNocheHambre(String vidNocheHambre) {
        this.vidNocheHambre = vidNocheHambre;
    }

    public String getVidAlimentosPreferidos() {
        return vidAlimentosPreferidos;
    }

    public void setVidAlimentosPreferidos(String vidAlimentosPreferidos) {
        this.vidAlimentosPreferidos = vidAlimentosPreferidos;
    }

    public String getVidAlimentosNoPreferidos() {
        return vidAlimentosNoPreferidos;
    }

    public void setVidAlimentosNoPreferidos(String vidAlimentosNoPreferidos) {
        this.vidAlimentosNoPreferidos = vidAlimentosNoPreferidos;
    }

    public String getVidAlimentosMalestar() {
        return vidAlimentosMalestar;
    }

    public void setVidAlimentosMalestar(String vidAlimentosMalestar) {
        this.vidAlimentosMalestar = vidAlimentosMalestar;
    }

    public String getVidSiAlimentosIntolerante() {
        return vidSiAlimentosIntolerante;
    }

    public void setVidSiAlimentosIntolerante(String vidSiAlimentosIntolerante) {
        this.vidSiAlimentosIntolerante = vidSiAlimentosIntolerante;
    }

    public String getVidNoAlimentosIntolerante() {
        return vidNoAlimentosIntolerante;
    }

    public void setVidNoAlimentosIntolerante(String vidNoAlimentosIntolerante) {
        this.vidNoAlimentosIntolerante = vidNoAlimentosIntolerante;
    }

    public String getVidCualIntolerante() {
        return vidCualIntolerante;
    }

    public void setVidCualIntolerante(String vidCualIntolerante) {
        this.vidCualIntolerante = vidCualIntolerante;
    }

    public String getVidApetitoVariableEDA() {
        return vidApetitoVariableEDA;
    }

    public void setVidApetitoVariableEDA(String vidApetitoVariableEDA) {
        this.vidApetitoVariableEDA = vidApetitoVariableEDA;
    }

    public String getVidNuloEDA() {
        return vidNuloEDA;
    }

    public void setVidNuloEDA(String vidNuloEDA) {
        this.vidNuloEDA = vidNuloEDA;
    }

    public String getVidMenorEDA() {
        return vidMenorEDA;
    }

    public void setVidMenorEDA(String vidMenorEDA) {
        this.vidMenorEDA = vidMenorEDA;
    }

    public String getVidMayorEDA() {
        return vidMayorEDA;
    }

    public void setVidMayorEDA(String vidMayorEDA) {
        this.vidMayorEDA = vidMayorEDA;
    }

    public String getVidSiSal() {
        return vidSiSal;
    }

    public void setVidSiSal(String vidSiSal) {
        this.vidSiSal = vidSiSal;
    }

    public String getVidNoSal() {
        return vidNoSal;
    }

    public void setVidNoSal(String vidNoSal) {
        this.vidNoSal = vidNoSal;
    }

    public String getVidMargarinaGrasa() {
        return vidMargarinaGrasa;
    }

    public void setVidMargarinaGrasa(String vidMargarinaGrasa) {
        this.vidMargarinaGrasa = vidMargarinaGrasa;
    }

    public String getVidAceiteGrasa() {
        return vidAceiteGrasa;
    }

    public void setVidAceiteGrasa(String vidAceiteGrasa) {
        this.vidAceiteGrasa = vidAceiteGrasa;
    }

    public String getVidMantecaGrasa() {
        return vidMantecaGrasa;
    }

    public void setVidMantecaGrasa(String vidMantecaGrasa) {
        this.vidMantecaGrasa = vidMantecaGrasa;
    }

    public String getVidMantequilla() {
        return vidMantequilla;
    }

    public void setVidMantequilla(String vidMantequilla) {
        this.vidMantequilla = vidMantequilla;
    }

    public String getVidOtroGrasa() {
        return vidOtroGrasa;
    }

    public void setVidOtroGrasa(String vidOtroGrasa) {
        this.vidOtroGrasa = vidOtroGrasa;
    }

    public String getVidSiDietaEspecial() {
        return vidSiDietaEspecial;
    }

    public void setVidSiDietaEspecial(String vidSiDietaEspecial) {
        this.vidSiDietaEspecial = vidSiDietaEspecial;
    }

    public String getVidNoDietaEspecial() {
        return vidNoDietaEspecial;
    }

    public void setVidNoDietaEspecial(String vidNoDietaEspecial) {
        this.vidNoDietaEspecial = vidNoDietaEspecial;
    }

    public String getVidCuantasDietaEspecial() {
        return vidCuantasDietaEspecial;
    }

    public void setVidCuantasDietaEspecial(String vidCuantasDietaEspecial) {
        this.vidCuantasDietaEspecial = vidCuantasDietaEspecial;
    }

    public String getVidHaceCuantoDietaEspecial() {
        return vidHaceCuantoDietaEspecial;
    }

    public void setVidHaceCuantoDietaEspecial(String vidHaceCuantoDietaEspecial) {
        this.vidHaceCuantoDietaEspecial = vidHaceCuantoDietaEspecial;
    }

    public String getVidTiempoDietaEspecial() {
        return vidTiempoDietaEspecial;
    }

    public void setVidTiempoDietaEspecial(String vidTiempoDietaEspecial) {
        this.vidTiempoDietaEspecial = vidTiempoDietaEspecial;
    }

    public String getVidRazonDietaEspecial() {
        return vidRazonDietaEspecial;
    }

    public void setVidRazonDietaEspecial(String vidRazonDietaEspecial) {
        this.vidRazonDietaEspecial = vidRazonDietaEspecial;
    }

    public String getVidNadaApegoDieta() {
        return vidNadaApegoDieta;
    }

    public void setVidNadaApegoDieta(String vidNadaApegoDieta) {
        this.vidNadaApegoDieta = vidNadaApegoDieta;
    }

    public String getVidMuyPocoAPegoDieta() {
        return vidMuyPocoAPegoDieta;
    }

    public void setVidMuyPocoAPegoDieta(String vidMuyPocoAPegoDieta) {
        this.vidMuyPocoAPegoDieta = vidMuyPocoAPegoDieta;
    }

    public String getVidSuficienteApegoDieta() {
        return vidSuficienteApegoDieta;
    }

    public void setVidSuficienteApegoDieta(String vidSuficienteApegoDieta) {
        this.vidSuficienteApegoDieta = vidSuficienteApegoDieta;
    }

    public String getVidExcepcionalApegoDieta() {
        return vidExcepcionalApegoDieta;
    }

    public void setVidExcepcionalApegoDieta(String vidExcepcionalApegoDieta) {
        this.vidExcepcionalApegoDieta = vidExcepcionalApegoDieta;
    }

    public String getVidNadaResultadosDieta() {
        return vidNadaResultadosDieta;
    }

    public void setVidNadaResultadosDieta(String vidNadaResultadosDieta) {
        this.vidNadaResultadosDieta = vidNadaResultadosDieta;
    }

    public String getVidMuyPocoResultadosDieta() {
        return vidMuyPocoResultadosDieta;
    }

    public void setVidMuyPocoResultadosDieta(String vidMuyPocoResultadosDieta) {
        this.vidMuyPocoResultadosDieta = vidMuyPocoResultadosDieta;
    }

    public String getVidSuficienteResultadosDieta() {
        return vidSuficienteResultadosDieta;
    }

    public void setVidSuficienteResultadosDieta(String vidSuficienteResultadosDieta) {
        this.vidSuficienteResultadosDieta = vidSuficienteResultadosDieta;
    }

    public String getVidExcepcionalResultadosDieta() {
        return vidExcepcionalResultadosDieta;
    }

    public void setVidExcepcionalResultadosDieta(String vidExcepcionalResultadosDieta) {
        this.vidExcepcionalResultadosDieta = vidExcepcionalResultadosDieta;
    }

    public String getVidSiMedicamentosPeso() {
        return vidSiMedicamentosPeso;
    }

    public void setVidSiMedicamentosPeso(String vidSiMedicamentosPeso) {
        this.vidSiMedicamentosPeso = vidSiMedicamentosPeso;
    }

    public String getVidNoMedicamentosPeso() {
        return vidNoMedicamentosPeso;
    }

    public void setVidNoMedicamentosPeso(String vidNoMedicamentosPeso) {
        this.vidNoMedicamentosPeso = vidNoMedicamentosPeso;
    }

    public String getVidCualMedicamentoPeso() {
        return vidCualMedicamentoPeso;
    }

    public void setVidCualMedicamentoPeso(String vidCualMedicamentoPeso) {
        this.vidCualMedicamentoPeso = vidCualMedicamentoPeso;
    }
    /**
     * Bloque para la asignación de getters y setters de la sexta ventana de un
     * nuevo usuario, INDICADORES ANTROPOMETICOS
     */
    private String viaPesoActual = "";
    private String viaPesoHabitual = "";
    private String viaEstatura = "";
    private String viaPCTricipital = "";
    private String viaPCBicipital = "";
    private String viaPCSubescapular = "";
    private String viaPCSuprailiaco = "";
    private String viaCircunferenciaBrazon = "";
    private String viaCircunferenciaCintura = "";
    private String viaCircunferenciaCadera = "";
    private String viaCircunferenciaAbdominal = "";
    private String viaComplexion = "";
    private String viaPesoTeorico = "";
    private String viaPesoTeoricoXC = "";
    private String viaPesoHabitualXC = "";
    private String viaIMC = "";
    private String viaMinimoIMC = "";
    private String viaMaximoIMC = "";
    private String viaGrasaCorporalXC = "";
    private String viaGrasaCorporalTotal = "";
    private String viaMasaLibreGrasa = "";
    private String viaDiferenciaGrasa = "";
    private String viaMasaMuscularTotal = "";
    private String viaPCTricipitalPerceptil = "";
    private String viaPCSubescapularPerceptil = "";
    private String viaIndiceCinturaCadera = "";
    private String viaAreaMuscularBrazo = "";
    private String viaAguaCorporalTotal = "";

    public String getViaPesoActual() {
        return viaPesoActual;
    }

    public void setViaPesoActual(String viaPesoActual) {
        this.viaPesoActual = viaPesoActual;
    }

    public String getViaPesoHabitual() {
        return viaPesoHabitual;
    }

    public void setViaPesoHabitual(String viaPesoHabitual) {
        this.viaPesoHabitual = viaPesoHabitual;
    }

    public String getViaEstatura() {
        return viaEstatura;
    }

    public void setViaEstatura(String viaEstatura) {
        this.viaEstatura = viaEstatura;
    }

    public String getViaPCTricipital() {
        return viaPCTricipital;
    }

    public void setViaPCTricipital(String viaPCTricipital) {
        this.viaPCTricipital = viaPCTricipital;
    }

    public String getViaPCBicipital() {
        return viaPCBicipital;
    }

    public void setViaPCBicipital(String viaPCBicipital) {
        this.viaPCBicipital = viaPCBicipital;
    }

    public String getViaPCSubescapular() {
        return viaPCSubescapular;
    }

    public void setViaPCSubescapular(String viaPCSubescapular) {
        this.viaPCSubescapular = viaPCSubescapular;
    }

    public String getViaPCSuprailiaco() {
        return viaPCSuprailiaco;
    }

    public void setViaPCSuprailiaco(String viaPCSuprailiaco) {
        this.viaPCSuprailiaco = viaPCSuprailiaco;
    }

    public String getViaCircunferenciaBrazon() {
        return viaCircunferenciaBrazon;
    }

    public void setViaCircunferenciaBrazon(String viaCircunferenciaBrazon) {
        this.viaCircunferenciaBrazon = viaCircunferenciaBrazon;
    }

    public String getViaCircunferenciaCintura() {
        return viaCircunferenciaCintura;
    }

    public void setViaCircunferenciaCintura(String viaCircunferenciaCintura) {
        this.viaCircunferenciaCintura = viaCircunferenciaCintura;
    }

    public String getViaCircunferenciaCadera() {
        return viaCircunferenciaCadera;
    }

    public void setViaCircunferenciaCadera(String viaCircunferenciaCadera) {
        this.viaCircunferenciaCadera = viaCircunferenciaCadera;
    }

    public String getViaCircunferenciaAbdominal() {
        return viaCircunferenciaAbdominal;
    }

    public void setViaCircunferenciaAbdominal(String viaCircunferenciaAbdominal) {
        this.viaCircunferenciaAbdominal = viaCircunferenciaAbdominal;
    }

    public String getViaComplexion() {
        return viaComplexion;
    }

    public void setViaComplexion(String viaComplexion) {
        this.viaComplexion = viaComplexion;
    }

    public String getViaPesoTeorico() {
        return viaPesoTeorico;
    }

    public void setViaPesoTeorico(String viaPesoTeorico) {
        this.viaPesoTeorico = viaPesoTeorico;
    }

    public String getViaPesoTeoricoXC() {
        return viaPesoTeoricoXC;
    }

    public void setViaPesoTeoricoXC(String viaPesoTeoricoXC) {
        this.viaPesoTeoricoXC = viaPesoTeoricoXC;
    }

    public String getViaPesoHabitualXC() {
        return viaPesoHabitualXC;
    }

    public void setViaPesoHabitualXC(String viaPesoHabitualXC) {
        this.viaPesoHabitualXC = viaPesoHabitualXC;
    }

    public String getViaIMC() {
        return viaIMC;
    }

    public void setViaIMC(String viaIMC) {
        this.viaIMC = viaIMC;
    }

    public String getViaMinimoIMC() {
        return viaMinimoIMC;
    }

    public void setViaMinimoIMC(String viaMinimoIMC) {
        this.viaMinimoIMC = viaMinimoIMC;
    }

    public String getViaMaximoIMC() {
        return viaMaximoIMC;
    }

    public void setViaMaximoIMC(String viaMaximoIMC) {
        this.viaMaximoIMC = viaMaximoIMC;
    }

    public String getViaGrasaCorporalXC() {
        return viaGrasaCorporalXC;
    }

    public void setViaGrasaCorporalXC(String viaGrasaCorporalXC) {
        this.viaGrasaCorporalXC = viaGrasaCorporalXC;
    }

    public String getViaGrasaCorporalTotal() {
        return viaGrasaCorporalTotal;
    }

    public void setViaGrasaCorporalTotal(String viaGrasaCorporalTotal) {
        this.viaGrasaCorporalTotal = viaGrasaCorporalTotal;
    }

    public String getViaMasaLibreGrasa() {
        return viaMasaLibreGrasa;
    }

    public void setViaMasaLibreGrasa(String viaMasaLibreGrasa) {
        this.viaMasaLibreGrasa = viaMasaLibreGrasa;
    }

    public String getViaDiferenciaGrasa() {
        return viaDiferenciaGrasa;
    }

    public void setViaDiferenciaGrasa(String viaDiferenciaGrasa) {
        this.viaDiferenciaGrasa = viaDiferenciaGrasa;
    }

    public String getViaMasaMuscularTotal() {
        return viaMasaMuscularTotal;
    }

    public void setViaMasaMuscularTotal(String viaMasaMuscularTotal) {
        this.viaMasaMuscularTotal = viaMasaMuscularTotal;
    }

    public String getViaPCTricipitalPerceptil() {
        return viaPCTricipitalPerceptil;
    }

    public void setViaPCTricipitalPerceptil(String viaPCTricipitalPerceptil) {
        this.viaPCTricipitalPerceptil = viaPCTricipitalPerceptil;
    }

    public String getViaPCSubescapularPerceptil() {
        return viaPCSubescapularPerceptil;
    }

    public void setViaPCSubescapularPerceptil(String viaPCSubescapularPerceptil) {
        this.viaPCSubescapularPerceptil = viaPCSubescapularPerceptil;
    }

    public String getViaIndiceCinturaCadera() {
        return viaIndiceCinturaCadera;
    }

    public void setViaIndiceCinturaCadera(String viaIndiceCinturaCadera) {
        this.viaIndiceCinturaCadera = viaIndiceCinturaCadera;
    }

    public String getViaAreaMuscularBrazo() {
        return viaAreaMuscularBrazo;
    }

    public void setViaAreaMuscularBrazo(String viaAreaMuscularBrazo) {
        this.viaAreaMuscularBrazo = viaAreaMuscularBrazo;
    }

    public String getViaAguaCorporalTotal() {
        return viaAguaCorporalTotal;
    }

    public void setViaAguaCorporalTotal(String viaAguaCorporalTotal) {
        this.viaAguaCorporalTotal = viaAguaCorporalTotal;
    }

    /**
     * Creates new form nuevoPacienteFrame
     */
    public nuevoPacienteFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/icons/headerIcon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgDiarrea = new javax.swing.ButtonGroup();
        rbgEstrenimiento = new javax.swing.ButtonGroup();
        rbgGastritis = new javax.swing.ButtonGroup();
        rbgUlcera = new javax.swing.ButtonGroup();
        rbgNausea = new javax.swing.ButtonGroup();
        rbgPirosis = new javax.swing.ButtonGroup();
        rbgVomito = new javax.swing.ButtonGroup();
        rbgColitis = new javax.swing.ButtonGroup();
        rbgDentadura = new javax.swing.ButtonGroup();
        rgbEDiagnosticada = new javax.swing.ButtonGroup();
        rbgEnfermedadImportante = new javax.swing.ButtonGroup();
        rbgMedicamento = new javax.swing.ButtonGroup();
        rbgLaxantes = new javax.swing.ButtonGroup();
        rbgDiureticos = new javax.swing.ButtonGroup();
        rbgAntiacidos = new javax.swing.ButtonGroup();
        rbgAnalgesicos = new javax.swing.ButtonGroup();
        rbgCirugia = new javax.swing.ButtonGroup();
        rbgEmbarazo = new javax.swing.ButtonGroup();
        rbgAnticonceptivos = new javax.swing.ButtonGroup();
        rbgPresionArterial = new javax.swing.ButtonGroup();
        rbgEntreComidas = new javax.swing.ButtonGroup();
        rbgModificacionAlimentos = new javax.swing.ButtonGroup();
        rbgApetito = new javax.swing.ButtonGroup();
        rbgHoraHambre = new javax.swing.ButtonGroup();
        rbgIntolerante = new javax.swing.ButtonGroup();
        rbgVariacionAlimentacion = new javax.swing.ButtonGroup();
        rbgComportamientoAlimentacion = new javax.swing.ButtonGroup();
        rbgSal = new javax.swing.ButtonGroup();
        rbgDietaEspecial = new javax.swing.ButtonGroup();
        rbgBajarPeso = new javax.swing.ButtonGroup();
        rbgApegoDieta = new javax.swing.ButtonGroup();
        rbgResultadosDieta = new javax.swing.ButtonGroup();
        rbgReemplazoHormonal = new javax.swing.ButtonGroup();
        rbgClimaterio = new javax.swing.ButtonGroup();
        rbgGrasaUtilizada = new javax.swing.ButtonGroup();
        rbgIDdietaEspecial = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel = new javax.swing.JTabbedPane();
        panelDatosPersonales = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        dpNombre = new javax.swing.JTextField();
        jlApellidos = new javax.swing.JLabel();
        dpApellidos = new javax.swing.JTextField();
        jlSexo = new javax.swing.JLabel();
        dpSexo = new javax.swing.JComboBox<>();
        jlEdad = new javax.swing.JLabel();
        cbEdad = new javax.swing.JComboBox<>();
        jlNacimiento = new javax.swing.JLabel();
        dpNacimiento = new javax.swing.JTextField();
        jlDomicilio = new javax.swing.JLabel();
        dpDomicilio = new javax.swing.JTextField();
        dpCP = new javax.swing.JTextField();
        jlCPostal = new javax.swing.JLabel();
        jlCiudad = new javax.swing.JLabel();
        dpCiudad = new javax.swing.JTextField();
        jlID = new javax.swing.JLabel();
        dpIDExpediente = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        dpEmail = new javax.swing.JTextField();
        jlEscolaridad = new javax.swing.JLabel();
        dpEscolaridad = new javax.swing.JComboBox<>();
        jlEstadoCivil = new javax.swing.JLabel();
        dpEstadoCivil = new javax.swing.JComboBox<>();
        jlTelefono = new javax.swing.JLabel();
        dpTelefono = new javax.swing.JTextField();
        dpGuardar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        panelAntecedentes = new javax.swing.JPanel();
        jlDiarrea = new javax.swing.JLabel();
        rbSiDiarrea = new javax.swing.JRadioButton();
        rbNoDiarrea = new javax.swing.JRadioButton();
        jlEstrenimiento = new javax.swing.JLabel();
        rbSiEstrenimiento = new javax.swing.JRadioButton();
        rbNoEstrenimiento = new javax.swing.JRadioButton();
        jlGastritis = new javax.swing.JLabel();
        rbSiGastritis = new javax.swing.JRadioButton();
        rbNoGastritis = new javax.swing.JRadioButton();
        jlUlcera = new javax.swing.JLabel();
        rbSiUlcera = new javax.swing.JRadioButton();
        rbNoUlcera = new javax.swing.JRadioButton();
        jlNausea = new javax.swing.JLabel();
        rbSiNausea = new javax.swing.JRadioButton();
        rbNoNausea = new javax.swing.JRadioButton();
        jlPirosis = new javax.swing.JLabel();
        rbSiPirosis = new javax.swing.JRadioButton();
        rbNoPirosis = new javax.swing.JRadioButton();
        jlVomito = new javax.swing.JLabel();
        rbSiVomito = new javax.swing.JRadioButton();
        rbNoVomito = new javax.swing.JRadioButton();
        jlColitis = new javax.swing.JLabel();
        rbSiColitis = new javax.swing.JRadioButton();
        rbNoColitis = new javax.swing.JRadioButton();
        jlDentadura = new javax.swing.JLabel();
        rbSiDentadura = new javax.swing.JRadioButton();
        rbNoDentadura = new javax.swing.JRadioButton();
        jlOtros = new javax.swing.JLabel();
        tfOtros = new javax.swing.JTextField();
        jlObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservaciones = new javax.swing.JTextArea();
        jlEDiagnosticada = new javax.swing.JLabel();
        rbSiED = new javax.swing.JRadioButton();
        rbNoED = new javax.swing.JRadioButton();
        jlCualED = new javax.swing.JLabel();
        tfCualED = new javax.swing.JTextField();
        jlEnfemedadImportante = new javax.swing.JLabel();
        rbSiEI = new javax.swing.JRadioButton();
        rbNoEI = new javax.swing.JRadioButton();
        jlCualEI = new javax.swing.JLabel();
        tfCualEI = new javax.swing.JTextField();
        jlMedicamenti = new javax.swing.JLabel();
        rbSiMedicamento = new javax.swing.JRadioButton();
        rbNoMedicamento = new javax.swing.JRadioButton();
        jlCualMedicamento = new javax.swing.JLabel();
        tfCualMedicamento = new javax.swing.JTextField();
        jlDosis = new javax.swing.JLabel();
        tfDosisMedicamento = new javax.swing.JTextField();
        jlCuantoTiempo = new javax.swing.JLabel();
        tfCuantoTiempo = new javax.swing.JTextField();
        jlDosis2 = new javax.swing.JLabel();
        rbSiLaxante = new javax.swing.JRadioButton();
        rbNoLaxante = new javax.swing.JRadioButton();
        jlDiureticos = new javax.swing.JLabel();
        rbSiDiureticos = new javax.swing.JRadioButton();
        rbNoDiureticos = new javax.swing.JRadioButton();
        rbNoAnalgesicos = new javax.swing.JRadioButton();
        rbSiAnalgesicos = new javax.swing.JRadioButton();
        jlAnalgesicos = new javax.swing.JLabel();
        rbNoAC = new javax.swing.JRadioButton();
        rbSiAC = new javax.swing.JRadioButton();
        jlAntiacidos = new javax.swing.JLabel();
        jlMedicamenti1 = new javax.swing.JLabel();
        rbSiCirugia = new javax.swing.JRadioButton();
        rbNoCirugia = new javax.swing.JRadioButton();
        jlCualMedicamento1 = new javax.swing.JLabel();
        tfCirugia = new javax.swing.JTextField();
        dpGuardar1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        panelGinecologico = new javax.swing.JPanel();
        jlEmbarazoActual = new javax.swing.JLabel();
        siEmbarazoActual = new javax.swing.JRadioButton();
        noEmbarazoActual = new javax.swing.JRadioButton();
        jlSemanasGestacion = new javax.swing.JLabel();
        tfSDG = new javax.swing.JTextField();
        jlAnticonceptivos = new javax.swing.JLabel();
        siAnticonceptivosOrales = new javax.swing.JRadioButton();
        noAnticonceptivos = new javax.swing.JRadioButton();
        tfDosisAnticonceptivos = new javax.swing.JTextField();
        jlCuantoTiempo1 = new javax.swing.JLabel();
        tfDosisTerapiaHormonal = new javax.swing.JTextField();
        jlvagDosis = new javax.swing.JLabel();
        jlCualAnticonceptivo = new javax.swing.JLabel();
        tfCualTerapiaHormonal = new javax.swing.JTextField();
        jlClimaterio = new javax.swing.JLabel();
        siClimaterio = new javax.swing.JRadioButton();
        noClimaterio = new javax.swing.JRadioButton();
        jlTerapiaHormonal = new javax.swing.JLabel();
        siTerapiaHormonal = new javax.swing.JRadioButton();
        noTerapiaHornomal = new javax.swing.JRadioButton();
        jlCualTerapia = new javax.swing.JLabel();
        tfvagTiempoTerapiaHormonal = new javax.swing.JTextField();
        jlvagCualTerapiaHormonal = new javax.swing.JLabel();
        tfVagCualAnticonceptivo = new javax.swing.JTextField();
        jlvagTiempoTerapiaHormonal = new javax.swing.JLabel();
        dpGuardar2 = new javax.swing.JButton();
        tfVagTiempoAnticonceptivo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        panelActiviadades = new javax.swing.JPanel();
        jlDiarioActividades = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jlAlimento = new javax.swing.JLabel();
        cbHoraDespertarse = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cbMinutoDespertarse = new javax.swing.JComboBox<>();
        jlDespertarse = new javax.swing.JLabel();
        tfDespertarse = new javax.swing.JTextField();
        jlSignos = new javax.swing.JLabel();
        jlAspectoGeneral = new javax.swing.JLabel();
        cbHoraDesayuno = new javax.swing.JComboBox<>();
        cbMinutoDesayuno = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jlDesayuno = new javax.swing.JLabel();
        tfDesayuno = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAspectoGeneral = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        cbHoraComida = new javax.swing.JComboBox<>();
        cbMinutoComida = new javax.swing.JComboBox<>();
        jlComida = new javax.swing.JLabel();
        tfComida = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        cbHoraCena = new javax.swing.JComboBox<>();
        cbMinutoCena = new javax.swing.JComboBox<>();
        jlCena = new javax.swing.JLabel();
        tfCena = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        cbHoraDormir = new javax.swing.JComboBox<>();
        cbMinutoDormir = new javax.swing.JComboBox<>();
        jlDormir = new javax.swing.JLabel();
        tfDormir = new javax.swing.JTextField();
        jlEjercicio = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        cbTipoActividad = new javax.swing.JComboBox<>();
        jlFrecuencia = new javax.swing.JLabel();
        cbFrecuenciaActividad = new javax.swing.JComboBox<>();
        jlPreisonArterial = new javax.swing.JLabel();
        jlPresionArterial = new javax.swing.JLabel();
        siPresionArterial = new javax.swing.JRadioButton();
        noPresionArterial = new javax.swing.JRadioButton();
        jlDuracionActividad = new javax.swing.JLabel();
        cbDuracionActividad = new javax.swing.JComboBox<>();
        jlCualPresionArterial = new javax.swing.JLabel();
        tfCualPresionArterial = new javax.swing.JTextField();
        jlHoraPresion = new javax.swing.JLabel();
        tfHoraPresion = new javax.swing.JTextField();
        jlConsumoFrecuencia = new javax.swing.JLabel();
        jlTabaco = new javax.swing.JLabel();
        cbTabaco = new javax.swing.JComboBox<>();
        jlAlcohol = new javax.swing.JLabel();
        cbAlcohol = new javax.swing.JComboBox<>();
        jlCafe = new javax.swing.JLabel();
        cbCafe = new javax.swing.JComboBox<>();
        dpGuardar3 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        panelIndicadores = new javax.swing.JPanel();
        jlCuantasComidasDia = new javax.swing.JLabel();
        tfComidasDia = new javax.swing.JTextField();
        jlEntreSemana = new javax.swing.JLabel();
        jlFinSemana = new javax.swing.JLabel();
        jlComidasCasa = new javax.swing.JLabel();
        jlComidasFuera = new javax.swing.JLabel();
        tfComidaCasaSemana = new javax.swing.JTextField();
        tfComidaCasaFin = new javax.swing.JTextField();
        tfComidasFueraSemana = new javax.swing.JTextField();
        tfComidasFueraFin = new javax.swing.JTextField();
        jlQuienPrepara = new javax.swing.JLabel();
        tfQuienPrepara = new javax.swing.JTextField();
        jlEntreComidas = new javax.swing.JLabel();
        siEntreComidas = new javax.swing.JRadioButton();
        noEntreComidas = new javax.swing.JRadioButton();
        jLabel62 = new javax.swing.JLabel();
        tfComidasDia6 = new javax.swing.JTextField();
        jlModificacionDieta = new javax.swing.JLabel();
        siModificacionAlimentos = new javax.swing.JRadioButton();
        noModificacionAlimentos = new javax.swing.JRadioButton();
        jlRazonModificacion = new javax.swing.JLabel();
        tfRazonModifiacion = new javax.swing.JTextField();
        jlApetito = new javax.swing.JLabel();
        buenoApetito = new javax.swing.JRadioButton();
        maloApetito = new javax.swing.JRadioButton();
        regularAPetito = new javax.swing.JRadioButton();
        jlHoraHambre = new javax.swing.JLabel();
        levantarseHambre = new javax.swing.JRadioButton();
        mañanaHambre = new javax.swing.JRadioButton();
        TardeHambre = new javax.swing.JRadioButton();
        NocheHambre = new javax.swing.JRadioButton();
        jlAlimentosPreferidos = new javax.swing.JLabel();
        tfAlimentosPreferidos = new javax.swing.JTextField();
        jlAliementosNoPreferidos = new javax.swing.JLabel();
        tfAlimentosNoPreferidos = new javax.swing.JTextField();
        jlAlimentosMalestar = new javax.swing.JLabel();
        tfAlimentosMalestar = new javax.swing.JTextField();
        jlComoVaria = new javax.swing.JLabel();
        siAlergico = new javax.swing.JRadioButton();
        noAlergico = new javax.swing.JRadioButton();
        jlCualAlergico = new javax.swing.JLabel();
        tfCualAlergico = new javax.swing.JTextField();
        jlConsumoEDA = new javax.swing.JLabel();
        siVariacion = new javax.swing.JRadioButton();
        noVariacion = new javax.swing.JRadioButton();
        jlAlergico = new javax.swing.JLabel();
        nulaVariacion = new javax.swing.JRadioButton();
        menorVariacion = new javax.swing.JRadioButton();
        mayorVariacion = new javax.swing.JRadioButton();
        jlAgregarSal = new javax.swing.JLabel();
        siSal = new javax.swing.JRadioButton();
        noSal = new javax.swing.JRadioButton();
        jlGrasaUtilizada = new javax.swing.JLabel();
        margarinaGrasa = new javax.swing.JRadioButton();
        aceiteVegetalGrasa = new javax.swing.JRadioButton();
        mantecaGrasa = new javax.swing.JRadioButton();
        mantequillaGrasa = new javax.swing.JRadioButton();
        jlOtroGrasa = new javax.swing.JLabel();
        tfOtroGrasa = new javax.swing.JTextField();
        jlDietaEspecial = new javax.swing.JLabel();
        siMedicamentoBajarPeso = new javax.swing.JRadioButton();
        noMedicamentoBajarPeso = new javax.swing.JRadioButton();
        jlCuantasDietas = new javax.swing.JLabel();
        tfCuantasDietas = new javax.swing.JTextField();
        jHaceCuantoDieta = new javax.swing.JLabel();
        tfHaceCuantoDieta = new javax.swing.JTextField();
        jlCuantoTiempoDieta = new javax.swing.JLabel();
        tfCuantoTiempoDieta = new javax.swing.JTextField();
        jlRazonDIetaEspecial = new javax.swing.JLabel();
        tfRazonDietaEspecial = new javax.swing.JTextField();
        jlCuantoAPegoDieta = new javax.swing.JLabel();
        jlResultadosEsperadosDieta = new javax.swing.JLabel();
        jlAlimentosParaBajarPeso = new javax.swing.JLabel();
        jlCualMedicamentoBajarPeso = new javax.swing.JLabel();
        tfCualMedicamentoBajarPeso = new javax.swing.JTextField();
        nadaAPego = new javax.swing.JRadioButton();
        muyPocoAPego = new javax.swing.JRadioButton();
        SuficienteApego = new javax.swing.JRadioButton();
        excepcionalApego = new javax.swing.JRadioButton();
        nadaResultadosDieta = new javax.swing.JRadioButton();
        muyPocoResultadosDieta = new javax.swing.JRadioButton();
        suficienteResultadosDieta = new javax.swing.JRadioButton();
        excepcionalResultadosDieta = new javax.swing.JRadioButton();
        siDietaEspecial = new javax.swing.JRadioButton();
        noDietaEspecial = new javax.swing.JRadioButton();
        dpGuardar4 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        panelIndicadoresAntropo = new javax.swing.JPanel();
        jlMedicion = new javax.swing.JLabel();
        jlPesoActual = new javax.swing.JLabel();
        tfPesoHabitual = new javax.swing.JTextField();
        jlPesoHabitual = new javax.swing.JLabel();
        tfPesoActual = new javax.swing.JTextField();
        jlDato = new javax.swing.JLabel();
        jlEstatura = new javax.swing.JLabel();
        tfEstatura = new javax.swing.JTextField();
        jlPliegueCutaneoTricipital = new javax.swing.JLabel();
        tfPliegueCutaneoTricipital = new javax.swing.JTextField();
        jlPliegueCutaneoBicipital = new javax.swing.JLabel();
        tfPliegueCutaneoBicipital = new javax.swing.JTextField();
        jPliegueCutaneoSubescapular = new javax.swing.JLabel();
        tfPliegueCutaneoSubescapular = new javax.swing.JTextField();
        jPliegueCutaneoSuprailiaco = new javax.swing.JLabel();
        tfPliegueCutaneoSuprailiaco = new javax.swing.JTextField();
        jlCircunferenciaBrazo = new javax.swing.JLabel();
        tfCircunferenciaBrazo = new javax.swing.JTextField();
        jlCircunferenciaCintura = new javax.swing.JLabel();
        tfCircunferenciaCintura = new javax.swing.JTextField();
        jlCircunferenciaCadera = new javax.swing.JLabel();
        tfCircunferenciaCadera = new javax.swing.JTextField();
        jlCircunferenciaAbdominal = new javax.swing.JLabel();
        tfCircunferenciaAbdominal = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jlComplexion = new javax.swing.JLabel();
        tfComplexion = new javax.swing.JTextField();
        jlPesoTeorico = new javax.swing.JLabel();
        tfPesoTeorico = new javax.swing.JTextField();
        jlPesoTeoricoXC = new javax.swing.JLabel();
        tfPesoTeoricoXC = new javax.swing.JTextField();
        jlPesoHabitualXC = new javax.swing.JLabel();
        tfPesoHabitualXC = new javax.swing.JTextField();
        JIMC = new javax.swing.JLabel();
        tfIMC = new javax.swing.JTextField();
        jlPesoMinimoIMC = new javax.swing.JLabel();
        tfPesoMinimoIMC = new javax.swing.JTextField();
        jlMedicion2 = new javax.swing.JLabel();
        jlDato2 = new javax.swing.JLabel();
        jlPesoMaximo = new javax.swing.JLabel();
        tfPesoMaximo = new javax.swing.JTextField();
        tfGrasaCorporal = new javax.swing.JTextField();
        jlGrasaCorporal = new javax.swing.JLabel();
        jlGrasaCorporalKG = new javax.swing.JLabel();
        tfGrasaCorporalKG = new javax.swing.JTextField();
        jlMasaLigreGrasaKG = new javax.swing.JLabel();
        tfMasaLibreGrasa = new javax.swing.JTextField();
        jlDiferenciaGrasaKG = new javax.swing.JLabel();
        tfDiferenciaGrasa = new javax.swing.JTextField();
        jlMasaMuscularTotal = new javax.swing.JLabel();
        tfMasaMuscularTotal = new javax.swing.JTextField();
        jlPliegueCutaneoPerceptil = new javax.swing.JLabel();
        tfPliegueCutaneoPerceptil = new javax.swing.JTextField();
        jlPliegueCutaneosubescapular = new javax.swing.JLabel();
        jlIndiceCinturaCadera = new javax.swing.JLabel();
        jlAreaMuscularBrazo = new javax.swing.JLabel();
        jlAguaCorporalTotal = new javax.swing.JLabel();
        tfPliegueCutaneoSubescapularPerceptil = new javax.swing.JTextField();
        tfIndiceCaderaCintura = new javax.swing.JTextField();
        tfAreaMuscularBrazo = new javax.swing.JTextField();
        tfAguaCorporalTotal = new javax.swing.JTextField();
        dpGuardar5 = new javax.swing.JButton();
        jLabel123 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HF - Nuevo Paciente");
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));

        panelDatosPersonales.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelDatosPersonales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlNombre.setText("Nombre");
        panelDatosPersonales.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, -1, -1));

        dpNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpNombreFocusLost(evt);
            }
        });
        dpNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpNombreActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 78, 200, -1));

        jlApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlApellidos.setText("Apellidos");
        panelDatosPersonales.add(jlApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 81, -1, -1));

        dpApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpApellidosFocusLost(evt);
            }
        });
        dpApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpApellidosActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 78, 200, -1));

        jlSexo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlSexo.setText("Sexo");
        panelDatosPersonales.add(jlSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, -1));

        dpSexo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Femenino", "Masculino" }));
        dpSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelDatosPersonales.add(dpSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 150, -1));

        jlEdad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEdad.setText("Edad");
        panelDatosPersonales.add(jlEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 125, -1, -1));

        cbEdad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110" }));
        panelDatosPersonales.add(cbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 122, 200, -1));

        jlNacimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlNacimiento.setText("Nacimiento");
        panelDatosPersonales.add(jlNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        dpNacimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpNacimientoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpNacimientoFocusLost(evt);
            }
        });
        dpNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpNacimientoActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 122, 200, -1));

        jlDomicilio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDomicilio.setText("Domicilio");
        panelDatosPersonales.add(jlDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 169, -1, -1));

        dpDomicilio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpDomicilio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpDomicilio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpDomicilioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpDomicilioFocusLost(evt);
            }
        });
        dpDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpDomicilioActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 166, 601, -1));

        dpCP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpCP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpCP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpCPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpCPFocusLost(evt);
            }
        });
        dpCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpCPActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 150, -1));

        jlCPostal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCPostal.setText("C. Postal");
        panelDatosPersonales.add(jlCPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        jlCiudad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCiudad.setText("Ciudad");
        panelDatosPersonales.add(jlCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, -1, -1));

        dpCiudad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpCiudadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpCiudadFocusLost(evt);
            }
        });
        dpCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpCiudadActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 210, 601, -1));

        jlID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlID.setText("ID (Expediente)");
        panelDatosPersonales.add(jlID, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 298, -1, -1));

        dpIDExpediente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpIDExpediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpIDExpediente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpIDExpedienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpIDExpedienteFocusLost(evt);
            }
        });
        dpIDExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpIDExpedienteActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpIDExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 283, -1));

        jlEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEmail.setText("E-mail");
        panelDatosPersonales.add(jlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        dpEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpEmailFocusLost(evt);
            }
        });
        dpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpEmailActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 555, -1));

        jlEscolaridad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEscolaridad.setText("Escolaridad");
        panelDatosPersonales.add(jlEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, -1, -1));

        dpEscolaridad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpEscolaridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Sin estudios", "Preescolar", "Primaria", "Secundaria", "Carrera Técnica", "Bachillerato", "Licenciatura", "Maestría", "Doctorado", " ", " " }));
        dpEscolaridad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelDatosPersonales.add(dpEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 150, -1));

        jlEstadoCivil.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEstadoCivil.setText("Estado Civil");
        panelDatosPersonales.add(jlEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        dpEstadoCivil.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Soltero/a", "Comprometido/a", "Relación (novio/a)", "Casado/a", "Union libre", "Separado/a", "Divorciado/a", "Viudo/a", " ", " " }));
        dpEstadoCivil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelDatosPersonales.add(dpEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 150, -1));

        jlTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlTelefono.setText("Teléfono");
        panelDatosPersonales.add(jlTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, -1, -1));

        dpTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dpTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dpTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dpTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dpTelefonoFocusLost(evt);
            }
        });
        dpTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpTelefonoActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 254, 200, -1));

        dpGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/save_128px.png"))); // NOI18N
        dpGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dpGuardar.setBorderPainted(false);
        dpGuardar.setContentAreaFilled(false);
        dpGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dpGuardar.setFocusPainted(false);
        dpGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpGuardarActionPerformed(evt);
            }
        });
        panelDatosPersonales.add(dpGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 406, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_979x606.png"))); // NOI18N
        jLabel15.setToolTipText("");
        panelDatosPersonales.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 600));

        panel.addTab("Datos Personales", panelDatosPersonales);

        panelAntecedentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlDiarrea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDiarrea.setText("Diarrea");
        panelAntecedentes.add(jlDiarrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        rbSiDiarrea.setBackground(new java.awt.Color(255, 255, 255));
        rbgDiarrea.add(rbSiDiarrea);
        rbSiDiarrea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiDiarrea.setText("Si");
        panelAntecedentes.add(rbSiDiarrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 7, -1, -1));

        rbNoDiarrea.setBackground(new java.awt.Color(255, 255, 255));
        rbgDiarrea.add(rbNoDiarrea);
        rbNoDiarrea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoDiarrea.setText("No");
        panelAntecedentes.add(rbNoDiarrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 7, -1, -1));

        jlEstrenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEstrenimiento.setText("Estreñimiento");
        panelAntecedentes.add(jlEstrenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 11, -1, -1));

        rbSiEstrenimiento.setBackground(new java.awt.Color(255, 255, 255));
        rbgEstrenimiento.add(rbSiEstrenimiento);
        rbSiEstrenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiEstrenimiento.setText("Si");
        panelAntecedentes.add(rbSiEstrenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 7, -1, -1));

        rbNoEstrenimiento.setBackground(new java.awt.Color(255, 255, 255));
        rbgEstrenimiento.add(rbNoEstrenimiento);
        rbNoEstrenimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoEstrenimiento.setText("No");
        panelAntecedentes.add(rbNoEstrenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 7, -1, -1));

        jlGastritis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlGastritis.setText("Gastritis");
        panelAntecedentes.add(jlGastritis, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 11, -1, -1));

        rbSiGastritis.setBackground(new java.awt.Color(255, 255, 255));
        rbgGastritis.add(rbSiGastritis);
        rbSiGastritis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiGastritis.setText("Si");
        panelAntecedentes.add(rbSiGastritis, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 7, -1, -1));

        rbNoGastritis.setBackground(new java.awt.Color(255, 255, 255));
        rbgGastritis.add(rbNoGastritis);
        rbNoGastritis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoGastritis.setText("No");
        panelAntecedentes.add(rbNoGastritis, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 7, -1, -1));

        jlUlcera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlUlcera.setText("Úlcera");
        panelAntecedentes.add(jlUlcera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, -1, -1));

        rbSiUlcera.setBackground(new java.awt.Color(255, 255, 255));
        rbgUlcera.add(rbSiUlcera);
        rbSiUlcera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiUlcera.setText("Si");
        panelAntecedentes.add(rbSiUlcera, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 54, -1, -1));

        rbNoUlcera.setBackground(new java.awt.Color(255, 255, 255));
        rbgUlcera.add(rbNoUlcera);
        rbNoUlcera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoUlcera.setText("No");
        panelAntecedentes.add(rbNoUlcera, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 54, -1, -1));

        jlNausea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlNausea.setText("Náusea");
        panelAntecedentes.add(jlNausea, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 58, -1, -1));

        rbSiNausea.setBackground(new java.awt.Color(255, 255, 255));
        rbgNausea.add(rbSiNausea);
        rbSiNausea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiNausea.setText("Si");
        panelAntecedentes.add(rbSiNausea, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 54, -1, -1));

        rbNoNausea.setBackground(new java.awt.Color(255, 255, 255));
        rbgNausea.add(rbNoNausea);
        rbNoNausea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoNausea.setText("No");
        panelAntecedentes.add(rbNoNausea, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 54, -1, -1));

        jlPirosis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPirosis.setText("Pirosis");
        panelAntecedentes.add(jlPirosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 58, -1, -1));

        rbSiPirosis.setBackground(new java.awt.Color(255, 255, 255));
        rbgPirosis.add(rbSiPirosis);
        rbSiPirosis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiPirosis.setText("Si");
        panelAntecedentes.add(rbSiPirosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 54, -1, -1));

        rbNoPirosis.setBackground(new java.awt.Color(255, 255, 255));
        rbgPirosis.add(rbNoPirosis);
        rbNoPirosis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoPirosis.setText("No");
        panelAntecedentes.add(rbNoPirosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 54, -1, -1));

        jlVomito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlVomito.setText("Vómito");
        panelAntecedentes.add(jlVomito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, -1));

        rbSiVomito.setBackground(new java.awt.Color(255, 255, 255));
        rbgVomito.add(rbSiVomito);
        rbSiVomito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiVomito.setText("Si");
        panelAntecedentes.add(rbSiVomito, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 101, -1, -1));

        rbNoVomito.setBackground(new java.awt.Color(255, 255, 255));
        rbgVomito.add(rbNoVomito);
        rbNoVomito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoVomito.setText("No");
        panelAntecedentes.add(rbNoVomito, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 101, -1, -1));

        jlColitis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlColitis.setText("Colitis");
        panelAntecedentes.add(jlColitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 105, -1, -1));

        rbSiColitis.setBackground(new java.awt.Color(255, 255, 255));
        rbgColitis.add(rbSiColitis);
        rbSiColitis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiColitis.setText("Si");
        panelAntecedentes.add(rbSiColitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 101, -1, -1));

        rbNoColitis.setBackground(new java.awt.Color(255, 255, 255));
        rbgColitis.add(rbNoColitis);
        rbNoColitis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoColitis.setText("No");
        panelAntecedentes.add(rbNoColitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 101, -1, -1));

        jlDentadura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDentadura.setText("Dentadura");
        panelAntecedentes.add(jlDentadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 105, -1, -1));

        rbSiDentadura.setBackground(new java.awt.Color(255, 255, 255));
        rbgDentadura.add(rbSiDentadura);
        rbSiDentadura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiDentadura.setText("Si");
        panelAntecedentes.add(rbSiDentadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 101, -1, -1));

        rbNoDentadura.setBackground(new java.awt.Color(255, 255, 255));
        rbgDentadura.add(rbNoDentadura);
        rbNoDentadura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoDentadura.setText("No");
        panelAntecedentes.add(rbNoDentadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 101, -1, -1));

        jlOtros.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlOtros.setText("Otros");
        panelAntecedentes.add(jlOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        tfOtros.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelAntecedentes.add(tfOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 148, 638, -1));

        jlObservaciones.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlObservaciones.setText("Observaciones");
        panelAntecedentes.add(jlObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, -1, 14));

        taObservaciones.setColumns(20);
        taObservaciones.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        taObservaciones.setRows(5);
        jScrollPane1.setViewportView(taObservaciones);

        panelAntecedentes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 217, 702, -1));

        jlEDiagnosticada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEDiagnosticada.setText("¿Padece alguna enfermedad diagnosticada?");
        panelAntecedentes.add(jlEDiagnosticada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, -1, -1));

        rbSiED.setBackground(new java.awt.Color(153, 217, 234));
        rgbEDiagnosticada.add(rbSiED);
        rbSiED.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiED.setText("Si");
        rbSiED.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbSiEDStateChanged(evt);
            }
        });
        rbSiED.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbSiEDFocusGained(evt);
            }
        });
        panelAntecedentes.add(rbSiED, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 341, -1, -1));

        rbNoED.setBackground(new java.awt.Color(153, 217, 234));
        rgbEDiagnosticada.add(rbNoED);
        rbNoED.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoED.setText("No");
        rbNoED.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbNoEDFocusGained(evt);
            }
        });
        panelAntecedentes.add(rbNoED, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 341, -1, -1));

        jlCualED.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualED.setText("¿Cuál?");
        panelAntecedentes.add(jlCualED, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 344, -1, -1));

        tfCualED.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCualED.setEnabled(false);
        panelAntecedentes.add(tfCualED, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 341, 255, -1));

        jlEnfemedadImportante.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEnfemedadImportante.setText("¿Ha padecido alguna enfermedad importante?");
        panelAntecedentes.add(jlEnfemedadImportante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 392, -1, -1));

        rbSiEI.setBackground(new java.awt.Color(153, 217, 234));
        rbgEnfermedadImportante.add(rbSiEI);
        rbSiEI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiEI.setText("Si");
        rbSiEI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbSiEIFocusGained(evt);
            }
        });
        panelAntecedentes.add(rbSiEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 388, -1, -1));

        rbNoEI.setBackground(new java.awt.Color(153, 217, 234));
        rbgEnfermedadImportante.add(rbNoEI);
        rbNoEI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoEI.setText("No");
        rbNoEI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbNoEIFocusGained(evt);
            }
        });
        panelAntecedentes.add(rbNoEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 388, -1, -1));

        jlCualEI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualEI.setText("¿Cuál?");
        panelAntecedentes.add(jlCualEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 388, -1, -1));

        tfCualEI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCualEI.setEnabled(false);
        panelAntecedentes.add(tfCualEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 385, 255, -1));

        jlMedicamenti.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlMedicamenti.setText("¿Toma algún medicamento?");
        panelAntecedentes.add(jlMedicamenti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 439, -1, -1));

        rbSiMedicamento.setBackground(new java.awt.Color(153, 217, 234));
        rbgMedicamento.add(rbSiMedicamento);
        rbSiMedicamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiMedicamento.setText("Si");
        rbSiMedicamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbSiMedicamentoFocusGained(evt);
            }
        });
        panelAntecedentes.add(rbSiMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 435, -1, -1));

        rbNoMedicamento.setBackground(new java.awt.Color(153, 217, 234));
        rbgMedicamento.add(rbNoMedicamento);
        rbNoMedicamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoMedicamento.setText("No");
        rbNoMedicamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbNoMedicamentoFocusGained(evt);
            }
        });
        panelAntecedentes.add(rbNoMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 435, -1, -1));

        jlCualMedicamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualMedicamento.setText("¿Cuál?");
        panelAntecedentes.add(jlCualMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 439, -1, -1));

        tfCualMedicamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCualMedicamento.setEnabled(false);
        panelAntecedentes.add(tfCualMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 436, 255, -1));

        jlDosis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDosis.setText("Dosis");
        panelAntecedentes.add(jlDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 485, -1, -1));

        tfDosisMedicamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfDosisMedicamento.setEnabled(false);
        panelAntecedentes.add(tfDosisMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 482, 243, -1));

        jlCuantoTiempo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCuantoTiempo.setText("¿Hace cuanto tiempo?");
        panelAntecedentes.add(jlCuantoTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 485, -1, -1));

        tfCuantoTiempo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCuantoTiempo.setEnabled(false);
        panelAntecedentes.add(tfCuantoTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 482, 257, -1));

        jlDosis2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDosis2.setText("Laxantes");
        panelAntecedentes.add(jlDosis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        rbSiLaxante.setBackground(new java.awt.Color(153, 217, 234));
        rbgLaxantes.add(rbSiLaxante);
        rbSiLaxante.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiLaxante.setText("Si");
        panelAntecedentes.add(rbSiLaxante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 526, -1, -1));

        rbNoLaxante.setBackground(new java.awt.Color(153, 217, 234));
        rbgLaxantes.add(rbNoLaxante);
        rbNoLaxante.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoLaxante.setText("No");
        panelAntecedentes.add(rbNoLaxante, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 526, -1, -1));

        jlDiureticos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDiureticos.setText("Diuréticos");
        panelAntecedentes.add(jlDiureticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 530, -1, -1));

        rbSiDiureticos.setBackground(new java.awt.Color(153, 217, 234));
        rbgDiureticos.add(rbSiDiureticos);
        rbSiDiureticos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiDiureticos.setText("Si");
        panelAntecedentes.add(rbSiDiureticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 526, -1, -1));

        rbNoDiureticos.setBackground(new java.awt.Color(153, 217, 234));
        rbgDiureticos.add(rbNoDiureticos);
        rbNoDiureticos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoDiureticos.setText("No");
        panelAntecedentes.add(rbNoDiureticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 526, -1, -1));

        rbNoAnalgesicos.setBackground(new java.awt.Color(153, 217, 234));
        rbgAnalgesicos.add(rbNoAnalgesicos);
        rbNoAnalgesicos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoAnalgesicos.setText("No");
        panelAntecedentes.add(rbNoAnalgesicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 526, -1, -1));

        rbSiAnalgesicos.setBackground(new java.awt.Color(153, 217, 234));
        rbgAnalgesicos.add(rbSiAnalgesicos);
        rbSiAnalgesicos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiAnalgesicos.setText("Si");
        panelAntecedentes.add(rbSiAnalgesicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 526, -1, -1));

        jlAnalgesicos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAnalgesicos.setText("Analgésicos");
        panelAntecedentes.add(jlAnalgesicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 530, -1, -1));

        rbNoAC.setBackground(new java.awt.Color(153, 217, 234));
        rbgAntiacidos.add(rbNoAC);
        rbNoAC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoAC.setText("No");
        panelAntecedentes.add(rbNoAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 526, -1, -1));

        rbSiAC.setBackground(new java.awt.Color(153, 217, 234));
        rbgAntiacidos.add(rbSiAC);
        rbSiAC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiAC.setText("Si");
        panelAntecedentes.add(rbSiAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 526, -1, -1));

        jlAntiacidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAntiacidos.setText("Antiácidos");
        panelAntecedentes.add(jlAntiacidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 530, -1, -1));

        jlMedicamenti1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlMedicamenti1.setText("¿Le han practicado alguna cirugía?");
        panelAntecedentes.add(jlMedicamenti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 577, -1, -1));

        rbSiCirugia.setBackground(new java.awt.Color(153, 217, 234));
        rbgCirugia.add(rbSiCirugia);
        rbSiCirugia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbSiCirugia.setText("Si");
        rbSiCirugia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbSiCirugiaFocusGained(evt);
            }
        });
        panelAntecedentes.add(rbSiCirugia, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 573, -1, -1));

        rbNoCirugia.setBackground(new java.awt.Color(153, 217, 234));
        rbgCirugia.add(rbNoCirugia);
        rbNoCirugia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        rbNoCirugia.setText("No");
        rbNoCirugia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rbNoCirugiaFocusGained(evt);
            }
        });
        panelAntecedentes.add(rbNoCirugia, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 573, -1, -1));

        jlCualMedicamento1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualMedicamento1.setText("¿Cuál?");
        panelAntecedentes.add(jlCualMedicamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 577, -1, -1));

        tfCirugia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCirugia.setEnabled(false);
        panelAntecedentes.add(tfCirugia, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 574, 262, -1));

        dpGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/save_128px.png"))); // NOI18N
        dpGuardar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dpGuardar1.setBorderPainted(false);
        dpGuardar1.setContentAreaFilled(false);
        dpGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dpGuardar1.setFocusPainted(false);
        dpGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpGuardar1ActionPerformed(evt);
            }
        });
        panelAntecedentes.add(dpGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_979x606.png"))); // NOI18N
        panelAntecedentes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 610));

        panel.addTab("Antecedentes salud/enfermedad", panelAntecedentes);

        panelGinecologico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlEmbarazoActual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEmbarazoActual.setText("¿Embarazo actual?");
        panelGinecologico.add(jlEmbarazoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        siEmbarazoActual.setBackground(new java.awt.Color(255, 255, 255));
        rbgEmbarazo.add(siEmbarazoActual);
        siEmbarazoActual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siEmbarazoActual.setText("Si");
        siEmbarazoActual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                siEmbarazoActualFocusGained(evt);
            }
        });
        siEmbarazoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siEmbarazoActualActionPerformed(evt);
            }
        });
        panelGinecologico.add(siEmbarazoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 86, -1, -1));

        noEmbarazoActual.setBackground(new java.awt.Color(255, 255, 255));
        rbgEmbarazo.add(noEmbarazoActual);
        noEmbarazoActual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noEmbarazoActual.setText("No");
        noEmbarazoActual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noEmbarazoActualFocusGained(evt);
            }
        });
        noEmbarazoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noEmbarazoActualActionPerformed(evt);
            }
        });
        panelGinecologico.add(noEmbarazoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 86, -1, -1));

        jlSemanasGestacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlSemanasGestacion.setText("Semanas de gestación");
        panelGinecologico.add(jlSemanasGestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 90, -1, -1));

        tfSDG.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfSDG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSDG.setEnabled(false);
        panelGinecologico.add(tfSDG, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 87, 198, -1));

        jlAnticonceptivos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAnticonceptivos.setText("¿Usa anticonceptivos orales?");
        panelGinecologico.add(jlAnticonceptivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, -1, -1));

        siAnticonceptivosOrales.setBackground(new java.awt.Color(255, 255, 255));
        rbgAnticonceptivos.add(siAnticonceptivosOrales);
        siAnticonceptivosOrales.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siAnticonceptivosOrales.setText("Si");
        siAnticonceptivosOrales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                siAnticonceptivosOralesFocusGained(evt);
            }
        });
        siAnticonceptivosOrales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siAnticonceptivosOralesActionPerformed(evt);
            }
        });
        panelGinecologico.add(siAnticonceptivosOrales, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 133, -1, -1));

        noAnticonceptivos.setBackground(new java.awt.Color(255, 255, 255));
        rbgAnticonceptivos.add(noAnticonceptivos);
        noAnticonceptivos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noAnticonceptivos.setText("No");
        noAnticonceptivos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noAnticonceptivosFocusGained(evt);
            }
        });
        panelGinecologico.add(noAnticonceptivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 133, -1, -1));

        tfDosisAnticonceptivos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfDosisAnticonceptivos.setEnabled(false);
        panelGinecologico.add(tfDosisAnticonceptivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 243, -1));

        jlCuantoTiempo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCuantoTiempo1.setText("¿Hace cuanto tiempo?");
        panelGinecologico.add(jlCuantoTiempo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        tfDosisTerapiaHormonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfDosisTerapiaHormonal.setEnabled(false);
        panelGinecologico.add(tfDosisTerapiaHormonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 320, 250, -1));

        jlvagDosis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlvagDosis.setText("Dosis");
        panelGinecologico.add(jlvagDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, -1, -1));

        jlCualAnticonceptivo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualAnticonceptivo.setText("¿Cual?");
        panelGinecologico.add(jlCualAnticonceptivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 137, -1, -1));

        tfCualTerapiaHormonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCualTerapiaHormonal.setEnabled(false);
        tfCualTerapiaHormonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCualTerapiaHormonalActionPerformed(evt);
            }
        });
        panelGinecologico.add(tfCualTerapiaHormonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 200, -1));

        jlClimaterio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlClimaterio.setText("Climaterio");
        panelGinecologico.add(jlClimaterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 228, -1, -1));

        siClimaterio.setBackground(new java.awt.Color(255, 255, 255));
        rbgClimaterio.add(siClimaterio);
        siClimaterio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siClimaterio.setText("Si");
        siClimaterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siClimaterioActionPerformed(evt);
            }
        });
        panelGinecologico.add(siClimaterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 224, -1, -1));

        noClimaterio.setBackground(new java.awt.Color(255, 255, 255));
        rbgClimaterio.add(noClimaterio);
        noClimaterio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noClimaterio.setText("No");
        noClimaterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noClimaterioActionPerformed(evt);
            }
        });
        panelGinecologico.add(noClimaterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 224, -1, -1));

        jlTerapiaHormonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlTerapiaHormonal.setText("¿Terapia de reemplazo hormonal?");
        panelGinecologico.add(jlTerapiaHormonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 279, -1, -1));

        siTerapiaHormonal.setBackground(new java.awt.Color(255, 255, 255));
        rbgReemplazoHormonal.add(siTerapiaHormonal);
        siTerapiaHormonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siTerapiaHormonal.setText("Si");
        siTerapiaHormonal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                siTerapiaHormonalFocusGained(evt);
            }
        });
        panelGinecologico.add(siTerapiaHormonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 275, -1, -1));

        noTerapiaHornomal.setBackground(new java.awt.Color(255, 255, 255));
        rbgReemplazoHormonal.add(noTerapiaHornomal);
        noTerapiaHornomal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noTerapiaHornomal.setText("No");
        noTerapiaHornomal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noTerapiaHornomalFocusGained(evt);
            }
        });
        panelGinecologico.add(noTerapiaHornomal, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 275, -1, -1));

        jlCualTerapia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualTerapia.setText("¿Cual?");
        panelGinecologico.add(jlCualTerapia, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 279, -1, -1));

        tfvagTiempoTerapiaHormonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfvagTiempoTerapiaHormonal.setEnabled(false);
        tfvagTiempoTerapiaHormonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfvagTiempoTerapiaHormonalActionPerformed(evt);
            }
        });
        panelGinecologico.add(tfvagTiempoTerapiaHormonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 200, -1));

        jlvagCualTerapiaHormonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlvagCualTerapiaHormonal.setText("Dosis");
        panelGinecologico.add(jlvagCualTerapiaHormonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 325, -1, -1));

        tfVagCualAnticonceptivo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfVagCualAnticonceptivo.setEnabled(false);
        panelGinecologico.add(tfVagCualAnticonceptivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 200, -1));

        jlvagTiempoTerapiaHormonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlvagTiempoTerapiaHormonal.setText("¿Hace cuanto tiempo?");
        panelGinecologico.add(jlvagTiempoTerapiaHormonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        dpGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/save_128px.png"))); // NOI18N
        dpGuardar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dpGuardar2.setBorderPainted(false);
        dpGuardar2.setContentAreaFilled(false);
        dpGuardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dpGuardar2.setFocusPainted(false);
        dpGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpGuardar2ActionPerformed(evt);
            }
        });
        panelGinecologico.add(dpGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        tfVagTiempoAnticonceptivo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfVagTiempoAnticonceptivo.setEnabled(false);
        panelGinecologico.add(tfVagTiempoAnticonceptivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 200, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_979x606.png"))); // NOI18N
        panelGinecologico.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 610));

        panel.addTab("Aspectos ginecológicos", panelGinecologico);

        panelActiviadades.setMinimumSize(new java.awt.Dimension(980, 610));
        panelActiviadades.setPreferredSize(new java.awt.Dimension(980, 610));
        panelActiviadades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlDiarioActividades.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDiarioActividades.setText("Diario de actividades");
        panelActiviadades.add(jlDiarioActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jlHora.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlHora.setText("Hora");
        panelActiviadades.add(jlHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        jlAlimento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAlimento.setText("Alimento");
        panelActiviadades.add(jlAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 49, -1, -1));

        cbHoraDespertarse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraDespertarse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        panelActiviadades.add(cbHoraDespertarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel30.setText(":");
        panelActiviadades.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 78, -1, -1));

        cbMinutoDespertarse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoDespertarse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        panelActiviadades.add(cbMinutoDespertarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 75, -1, -1));

        jlDespertarse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDespertarse.setText("Despertarse");
        panelActiviadades.add(jlDespertarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 78, -1, -1));

        tfDespertarse.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfDespertarse.setText("Si la acción no se realiza dejar 00:00");
        tfDespertarse.setEnabled(false);
        panelActiviadades.add(tfDespertarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 75, 279, -1));

        jlSignos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlSignos.setText("Signos");
        panelActiviadades.add(jlSignos, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 49, -1, -1));

        jlAspectoGeneral.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAspectoGeneral.setText("Aspecto General (cabello, ojos, piel, uñas, labios, encías, etc.)");
        panelActiviadades.add(jlAspectoGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 78, -1, -1));

        cbHoraDesayuno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraDesayuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        panelActiviadades.add(cbHoraDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, -1, -1));

        cbMinutoDesayuno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoDesayuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        panelActiviadades.add(cbMinutoDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 119, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel34.setText(":");
        panelActiviadades.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 122, -1, -1));

        jlDesayuno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDesayuno.setText("Desayuno");
        panelActiviadades.add(jlDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 122, -1, -1));

        tfDesayuno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfDesayuno.setText("Si la acción no se realiza dejar 00:00");
        tfDesayuno.setEnabled(false);
        tfDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDesayunoActionPerformed(evt);
            }
        });
        panelActiviadades.add(tfDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 119, 279, -1));

        taAspectoGeneral.setColumns(20);
        taAspectoGeneral.setRows(5);
        jScrollPane2.setViewportView(taAspectoGeneral);

        panelActiviadades.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 119, 453, 169));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel36.setText(":");
        panelActiviadades.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 166, -1, -1));

        cbHoraComida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        panelActiviadades.add(cbHoraComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, -1));

        cbMinutoComida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        panelActiviadades.add(cbMinutoComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 163, -1, -1));

        jlComida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlComida.setText("Comida");
        panelActiviadades.add(jlComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 166, -1, -1));

        tfComida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfComida.setText("Si la acción no se realiza dejar 00:00");
        tfComida.setEnabled(false);
        panelActiviadades.add(tfComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 163, 279, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel38.setText(":");
        panelActiviadades.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        cbHoraCena.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraCena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        panelActiviadades.add(cbHoraCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, -1, -1));

        cbMinutoCena.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoCena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        panelActiviadades.add(cbMinutoCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 207, -1, -1));

        jlCena.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCena.setText("Cena");
        panelActiviadades.add(jlCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 210, -1, -1));

        tfCena.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCena.setText("Si la acción no se realiza dejar 00:00");
        tfCena.setEnabled(false);
        panelActiviadades.add(tfCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 207, 279, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel40.setText(":");
        panelActiviadades.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 254, -1, -1));

        cbHoraDormir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbHoraDormir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        panelActiviadades.add(cbHoraDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 251, -1, -1));

        cbMinutoDormir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbMinutoDormir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        panelActiviadades.add(cbMinutoDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 251, -1, -1));

        jlDormir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDormir.setText("Dormir");
        panelActiviadades.add(jlDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 254, -1, -1));

        tfDormir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfDormir.setText("Si la acción no se realiza dejar 00:00");
        tfDormir.setEnabled(false);
        panelActiviadades.add(tfDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 251, 279, -1));

        jlEjercicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEjercicio.setText("Ejercicio");
        panelActiviadades.add(jlEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 306, -1, -1));

        jlTipo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlTipo.setText("Tipo");
        panelActiviadades.add(jlTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        cbTipoActividad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbTipoActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Sin actividad", "Muy ligera", "Ligera", "Moderada", "Pesada", "Excepcional" }));
        cbTipoActividad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoActividadItemStateChanged(evt);
            }
        });
        cbTipoActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActividadActionPerformed(evt);
            }
        });
        panelActiviadades.add(cbTipoActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 337, 120, -1));

        jlFrecuencia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFrecuencia.setText("Frecuencia");
        panelActiviadades.add(jlFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 340, -1, -1));

        cbFrecuenciaActividad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbFrecuenciaActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nunca", "Raramente", "Frecuentemente", "Casi siempre", "Siempre" }));
        panelActiviadades.add(cbFrecuenciaActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 337, -1, -1));

        jlPreisonArterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPreisonArterial.setText("Presión arterial");
        panelActiviadades.add(jlPreisonArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 306, -1, -1));

        jlPresionArterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPresionArterial.setText("¿Conoce su presión arterial?");
        panelActiviadades.add(jlPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 340, -1, -1));

        siPresionArterial.setBackground(new java.awt.Color(153, 217, 234));
        rbgPresionArterial.add(siPresionArterial);
        siPresionArterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siPresionArterial.setText("Si");
        siPresionArterial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                siPresionArterialFocusGained(evt);
            }
        });
        panelActiviadades.add(siPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 336, -1, -1));

        noPresionArterial.setBackground(new java.awt.Color(153, 217, 234));
        rbgPresionArterial.add(noPresionArterial);
        noPresionArterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noPresionArterial.setText("No");
        noPresionArterial.setToolTipText("");
        noPresionArterial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noPresionArterialFocusGained(evt);
            }
        });
        panelActiviadades.add(noPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 336, -1, -1));

        jlDuracionActividad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDuracionActividad.setText("Duración");
        panelActiviadades.add(jlDuracionActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 377, -1, -1));

        cbDuracionActividad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbDuracionActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Sin actividad", "< 30 Minutos", "< 60 minutos", "< 90 minutos", "< 120 minutos", "< 150 minutos", "< 180 minutos", "> 180 minutos" }));
        panelActiviadades.add(cbDuracionActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 374, -1, -1));

        jlCualPresionArterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualPresionArterial.setText("¿Cuál es?");
        panelActiviadades.add(jlCualPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 377, -1, -1));

        tfCualPresionArterial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCualPresionArterial.setEnabled(false);
        panelActiviadades.add(tfCualPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 374, 182, -1));

        jlHoraPresion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlHoraPresion.setText("Hora");
        panelActiviadades.add(jlHoraPresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 377, -1, -1));

        tfHoraPresion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfHoraPresion.setEnabled(false);
        panelActiviadades.add(tfHoraPresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 374, 144, -1));

        jlConsumoFrecuencia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlConsumoFrecuencia.setText("Consumo de frecuencia y cantidad");
        panelActiviadades.add(jlConsumoFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 418, -1, -1));

        jlTabaco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlTabaco.setText("Tabaco");
        panelActiviadades.add(jlTabaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 452, -1, -1));

        cbTabaco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbTabaco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nunca", "Raramente", "Frecuentemente", "Casi siempre", "Siempre" }));
        cbTabaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTabacoActionPerformed(evt);
            }
        });
        panelActiviadades.add(cbTabaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 449, -1, -1));

        jlAlcohol.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAlcohol.setText("Alcochol");
        panelActiviadades.add(jlAlcohol, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 452, -1, -1));

        cbAlcohol.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbAlcohol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nunca", "Raramente", "Frecuentemente", "Casi siempre", "Siempre" }));
        cbAlcohol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlcoholActionPerformed(evt);
            }
        });
        panelActiviadades.add(cbAlcohol, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 449, -1, -1));

        jlCafe.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCafe.setText("Café");
        panelActiviadades.add(jlCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 489, -1, -1));

        cbCafe.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbCafe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nunca", "Raramente", "Frecuentemente", "Casi siempre", "Siempre" }));
        cbCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCafeActionPerformed(evt);
            }
        });
        panelActiviadades.add(cbCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 486, -1, -1));

        dpGuardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/save_128px.png"))); // NOI18N
        dpGuardar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dpGuardar3.setBorderPainted(false);
        dpGuardar3.setContentAreaFilled(false);
        dpGuardar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dpGuardar3.setFocusPainted(false);
        dpGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpGuardar3ActionPerformed(evt);
            }
        });
        panelActiviadades.add(dpGuardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_979x606.png"))); // NOI18N
        panelActiviadades.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 610));

        panel.addTab("Diario de actividades", panelActiviadades);

        panelIndicadores.setPreferredSize(new java.awt.Dimension(980, 610));
        panelIndicadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlCuantasComidasDia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCuantasComidasDia.setText("¿Cuántas comidas hace al día?");
        panelIndicadores.add(jlCuantasComidasDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        tfComidasDia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfComidasDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfComidasDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 11, 124, -1));

        jlEntreSemana.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEntreSemana.setText("Entre semana");
        panelIndicadores.add(jlEntreSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jlFinSemana.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFinSemana.setText("Fin de semana");
        panelIndicadores.add(jlFinSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jlComidasCasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlComidasCasa.setText("Comidas en casa");
        panelIndicadores.add(jlComidasCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jlComidasFuera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlComidasFuera.setText("Comidas fuera");
        panelIndicadores.add(jlComidasFuera, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        tfComidaCasaSemana.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfComidaCasaSemana.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfComidaCasaSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 94, -1));

        tfComidaCasaFin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfComidaCasaFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfComidaCasaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 94, -1));

        tfComidasFueraSemana.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfComidasFueraSemana.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfComidasFueraSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 94, -1));

        tfComidasFueraFin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfComidasFueraFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfComidasFueraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 94, -1));

        jlQuienPrepara.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlQuienPrepara.setText("¿Quién prepara sus alimentos?");
        panelIndicadores.add(jlQuienPrepara, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 14, -1, -1));

        tfQuienPrepara.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfQuienPrepara.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfQuienPrepara, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 11, 166, -1));

        jlEntreComidas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEntreComidas.setText("¿Come entre comidas?");
        panelIndicadores.add(jlEntreComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 14, -1, -1));

        siEntreComidas.setBackground(new java.awt.Color(255, 255, 255));
        rbgEntreComidas.add(siEntreComidas);
        siEntreComidas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siEntreComidas.setText("Si");
        panelIndicadores.add(siEntreComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 10, -1, -1));

        noEntreComidas.setBackground(new java.awt.Color(153, 217, 234));
        rbgEntreComidas.add(noEntreComidas);
        noEntreComidas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noEntreComidas.setText("No");
        panelIndicadores.add(noEntreComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 10, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel62.setText("¿Qué come entre comidas?");
        panelIndicadores.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        tfComidasDia6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfComidasDia6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfComidasDia6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 400, -1));

        jlModificacionDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlModificacionDieta.setText("¿Ha modificado su alimentación en los últimos 6 meses (trabajo, estudio, etc)?");
        panelIndicadores.add(jlModificacionDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        siModificacionAlimentos.setBackground(new java.awt.Color(153, 217, 234));
        rbgModificacionAlimentos.add(siModificacionAlimentos);
        siModificacionAlimentos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siModificacionAlimentos.setText("Si");
        panelIndicadores.add(siModificacionAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        noModificacionAlimentos.setBackground(new java.awt.Color(153, 217, 234));
        rbgModificacionAlimentos.add(noModificacionAlimentos);
        noModificacionAlimentos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noModificacionAlimentos.setText("No");
        panelIndicadores.add(noModificacionAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, -1, -1));

        jlRazonModificacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlRazonModificacion.setText("¿Porqué ha modificado su alimentación?");
        panelIndicadores.add(jlRazonModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        tfRazonModifiacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfRazonModifiacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfRazonModifiacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 345, -1));

        jlApetito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlApetito.setText("Su apetito es:");
        panelIndicadores.add(jlApetito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        buenoApetito.setBackground(new java.awt.Color(255, 255, 255));
        rbgApetito.add(buenoApetito);
        buenoApetito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buenoApetito.setText("Bueno");
        panelIndicadores.add(buenoApetito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        maloApetito.setBackground(new java.awt.Color(255, 255, 255));
        rbgApetito.add(maloApetito);
        maloApetito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        maloApetito.setText("Malo");
        panelIndicadores.add(maloApetito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        regularAPetito.setBackground(new java.awt.Color(255, 255, 255));
        rbgApetito.add(regularAPetito);
        regularAPetito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        regularAPetito.setText("Regular");
        panelIndicadores.add(regularAPetito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jlHoraHambre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlHoraHambre.setText("¿A qué hora tiene más hambre?");
        panelIndicadores.add(jlHoraHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        levantarseHambre.setBackground(new java.awt.Color(255, 255, 255));
        rbgHoraHambre.add(levantarseHambre);
        levantarseHambre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        levantarseHambre.setText("Levantarse");
        panelIndicadores.add(levantarseHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        mañanaHambre.setBackground(new java.awt.Color(255, 255, 255));
        rbgHoraHambre.add(mañanaHambre);
        mañanaHambre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        mañanaHambre.setText("Mañana");
        panelIndicadores.add(mañanaHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        TardeHambre.setBackground(new java.awt.Color(153, 217, 234));
        rbgHoraHambre.add(TardeHambre);
        TardeHambre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TardeHambre.setText("Tarde");
        panelIndicadores.add(TardeHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, -1));

        NocheHambre.setBackground(new java.awt.Color(153, 217, 234));
        rbgHoraHambre.add(NocheHambre);
        NocheHambre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NocheHambre.setText("Noche");
        panelIndicadores.add(NocheHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));

        jlAlimentosPreferidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAlimentosPreferidos.setText("Alimentos preferidos:");
        panelIndicadores.add(jlAlimentosPreferidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        tfAlimentosPreferidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfAlimentosPreferidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfAlimentosPreferidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 798, -1));

        jlAliementosNoPreferidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAliementosNoPreferidos.setText("Alimentos que NO agradan:");
        panelIndicadores.add(jlAliementosNoPreferidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        tfAlimentosNoPreferidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfAlimentosNoPreferidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfAlimentosNoPreferidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 758, -1));

        jlAlimentosMalestar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAlimentosMalestar.setText("Alimentos que causan malestar:");
        panelIndicadores.add(jlAlimentosMalestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        tfAlimentosMalestar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfAlimentosMalestar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfAlimentosMalestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 734, -1));

        jlComoVaria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlComoVaria.setText("¿Cómo?");
        panelIndicadores.add(jlComoVaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        siAlergico.setBackground(new java.awt.Color(255, 255, 255));
        rbgIntolerante.add(siAlergico);
        siAlergico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siAlergico.setText("Si");
        panelIndicadores.add(siAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        noAlergico.setBackground(new java.awt.Color(255, 255, 255));
        rbgIntolerante.add(noAlergico);
        noAlergico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noAlergico.setText("No");
        panelIndicadores.add(noAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jlCualAlergico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualAlergico.setText("¿Cuál (es)?");
        panelIndicadores.add(jlCualAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        tfCualAlergico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCualAlergico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfCualAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 484, -1));

        jlConsumoEDA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlConsumoEDA.setText("¿Su consumo varía cuando está triste, nervioso o ansioso?");
        panelIndicadores.add(jlConsumoEDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        siVariacion.setBackground(new java.awt.Color(153, 217, 234));
        rbgVariacionAlimentacion.add(siVariacion);
        siVariacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siVariacion.setText("Si");
        panelIndicadores.add(siVariacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        noVariacion.setBackground(new java.awt.Color(153, 217, 234));
        rbgVariacionAlimentacion.add(noVariacion);
        noVariacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noVariacion.setText("No");
        panelIndicadores.add(noVariacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jlAlergico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAlergico.setText("¿Es alérgico o intolerante a algun alimento?");
        panelIndicadores.add(jlAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        nulaVariacion.setBackground(new java.awt.Color(153, 217, 234));
        rbgComportamientoAlimentacion.add(nulaVariacion);
        nulaVariacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nulaVariacion.setText("Nula");
        panelIndicadores.add(nulaVariacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        menorVariacion.setBackground(new java.awt.Color(153, 217, 234));
        rbgComportamientoAlimentacion.add(menorVariacion);
        menorVariacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        menorVariacion.setText("Menor");
        panelIndicadores.add(menorVariacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        mayorVariacion.setBackground(new java.awt.Color(153, 217, 234));
        rbgComportamientoAlimentacion.add(mayorVariacion);
        mayorVariacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        mayorVariacion.setText("Mayor");
        panelIndicadores.add(mayorVariacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, -1));

        jlAgregarSal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAgregarSal.setText("¿Agrega sal a la comida ya preparada?");
        panelIndicadores.add(jlAgregarSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        siSal.setBackground(new java.awt.Color(153, 217, 234));
        rbgSal.add(siSal);
        siSal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siSal.setText("Si");
        panelIndicadores.add(siSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        noSal.setBackground(new java.awt.Color(153, 217, 234));
        rbgSal.add(noSal);
        noSal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noSal.setText("No");
        panelIndicadores.add(noSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jlGrasaUtilizada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlGrasaUtilizada.setText("¿Grasa utilizada en casa?");
        panelIndicadores.add(jlGrasaUtilizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        margarinaGrasa.setBackground(new java.awt.Color(153, 217, 234));
        rbgGrasaUtilizada.add(margarinaGrasa);
        margarinaGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        margarinaGrasa.setText("Margarina");
        panelIndicadores.add(margarinaGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        aceiteVegetalGrasa.setBackground(new java.awt.Color(153, 217, 234));
        rbgGrasaUtilizada.add(aceiteVegetalGrasa);
        aceiteVegetalGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        aceiteVegetalGrasa.setText("Aceite vegetal");
        panelIndicadores.add(aceiteVegetalGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        mantecaGrasa.setBackground(new java.awt.Color(153, 217, 234));
        rbgGrasaUtilizada.add(mantecaGrasa);
        mantecaGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        mantecaGrasa.setText("Manteca");
        panelIndicadores.add(mantecaGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        mantequillaGrasa.setBackground(new java.awt.Color(153, 217, 234));
        rbgGrasaUtilizada.add(mantequillaGrasa);
        mantequillaGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        mantequillaGrasa.setText("Mantequilla");
        panelIndicadores.add(mantequillaGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        jlOtroGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlOtroGrasa.setText("Otro");
        panelIndicadores.add(jlOtroGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        tfOtroGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfOtroGrasa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfOtroGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 169, -1));

        jlDietaEspecial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDietaEspecial.setText("¿Ha llevado alguna dieta especial?");
        panelIndicadores.add(jlDietaEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        siMedicamentoBajarPeso.setBackground(new java.awt.Color(153, 217, 234));
        rbgBajarPeso.add(siMedicamentoBajarPeso);
        siMedicamentoBajarPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siMedicamentoBajarPeso.setText("Si");
        panelIndicadores.add(siMedicamentoBajarPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, -1, -1));

        noMedicamentoBajarPeso.setBackground(new java.awt.Color(153, 217, 234));
        rbgBajarPeso.add(noMedicamentoBajarPeso);
        noMedicamentoBajarPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noMedicamentoBajarPeso.setText("No");
        panelIndicadores.add(noMedicamentoBajarPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        jlCuantasDietas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCuantasDietas.setText("¿Cuántas?");
        panelIndicadores.add(jlCuantasDietas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        tfCuantasDietas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCuantasDietas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfCuantasDietas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 65, -1));

        jHaceCuantoDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jHaceCuantoDieta.setText("¿Hace cuanto?");
        panelIndicadores.add(jHaceCuantoDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        tfHaceCuantoDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfHaceCuantoDieta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfHaceCuantoDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 215, -1));

        jlCuantoTiempoDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCuantoTiempoDieta.setText("¿Por cuánto tiempo?");
        panelIndicadores.add(jlCuantoTiempoDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        tfCuantoTiempoDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCuantoTiempoDieta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfCuantoTiempoDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 156, -1));

        jlRazonDIetaEspecial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlRazonDIetaEspecial.setText("¿Por qué razón?");
        panelIndicadores.add(jlRazonDIetaEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        tfRazonDietaEspecial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfRazonDietaEspecial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfRazonDietaEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 356, -1));

        jlCuantoAPegoDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCuantoAPegoDieta.setText("¿Qué tanto se apegó a ella?");
        panelIndicadores.add(jlCuantoAPegoDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jlResultadosEsperadosDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlResultadosEsperadosDieta.setText("¿Obtuvo los resultados esperados?");
        panelIndicadores.add(jlResultadosEsperadosDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jlAlimentosParaBajarPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAlimentosParaBajarPeso.setText("¿Ha utilizado medicamentos para bajar de peso?");
        panelIndicadores.add(jlAlimentosParaBajarPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jlCualMedicamentoBajarPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCualMedicamentoBajarPeso.setText("¿Cuál (es)?");
        panelIndicadores.add(jlCualMedicamentoBajarPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        tfCualMedicamentoBajarPeso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfCualMedicamentoBajarPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelIndicadores.add(tfCualMedicamentoBajarPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 299, -1));

        nadaAPego.setBackground(new java.awt.Color(153, 217, 234));
        rbgApegoDieta.add(nadaAPego);
        nadaAPego.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nadaAPego.setText("Nada");
        panelIndicadores.add(nadaAPego, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, -1));

        muyPocoAPego.setBackground(new java.awt.Color(153, 217, 234));
        rbgApegoDieta.add(muyPocoAPego);
        muyPocoAPego.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        muyPocoAPego.setText("Muy poco");
        panelIndicadores.add(muyPocoAPego, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        SuficienteApego.setBackground(new java.awt.Color(153, 217, 234));
        rbgApegoDieta.add(SuficienteApego);
        SuficienteApego.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        SuficienteApego.setText("Suficiente");
        panelIndicadores.add(SuficienteApego, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        excepcionalApego.setBackground(new java.awt.Color(153, 217, 234));
        rbgApegoDieta.add(excepcionalApego);
        excepcionalApego.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        excepcionalApego.setText("Excepcional");
        panelIndicadores.add(excepcionalApego, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        nadaResultadosDieta.setBackground(new java.awt.Color(153, 217, 234));
        rbgResultadosDieta.add(nadaResultadosDieta);
        nadaResultadosDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nadaResultadosDieta.setText("Nada");
        panelIndicadores.add(nadaResultadosDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        muyPocoResultadosDieta.setBackground(new java.awt.Color(153, 217, 234));
        rbgResultadosDieta.add(muyPocoResultadosDieta);
        muyPocoResultadosDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        muyPocoResultadosDieta.setText("Muy poco");
        panelIndicadores.add(muyPocoResultadosDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, -1, -1));

        suficienteResultadosDieta.setBackground(new java.awt.Color(153, 217, 234));
        rbgResultadosDieta.add(suficienteResultadosDieta);
        suficienteResultadosDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        suficienteResultadosDieta.setText("Suficiente");
        panelIndicadores.add(suficienteResultadosDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, -1));

        excepcionalResultadosDieta.setBackground(new java.awt.Color(153, 217, 234));
        rbgResultadosDieta.add(excepcionalResultadosDieta);
        excepcionalResultadosDieta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        excepcionalResultadosDieta.setText("Excepcional");
        panelIndicadores.add(excepcionalResultadosDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        siDietaEspecial.setBackground(new java.awt.Color(153, 217, 234));
        rbgIDdietaEspecial.add(siDietaEspecial);
        siDietaEspecial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        siDietaEspecial.setText("Si");
        panelIndicadores.add(siDietaEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        noDietaEspecial.setBackground(new java.awt.Color(153, 217, 234));
        rbgIDdietaEspecial.add(noDietaEspecial);
        noDietaEspecial.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        noDietaEspecial.setText("No");
        panelIndicadores.add(noDietaEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        dpGuardar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/save_128px.png"))); // NOI18N
        dpGuardar4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dpGuardar4.setBorderPainted(false);
        dpGuardar4.setContentAreaFilled(false);
        dpGuardar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dpGuardar4.setFocusPainted(false);
        dpGuardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpGuardar4ActionPerformed(evt);
            }
        });
        panelIndicadores.add(dpGuardar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, -1, -1));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_979x606.png"))); // NOI18N
        panelIndicadores.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 980, 630));

        panel.addTab("Indicadores dietéticos", panelIndicadores);

        panelIndicadoresAntropo.setPreferredSize(new java.awt.Dimension(980, 610));
        panelIndicadoresAntropo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMedicion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlMedicion.setText("Medición (unidad)");
        panelIndicadoresAntropo.add(jlMedicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jlPesoActual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoActual.setText("Peso actual (kg)");
        panelIndicadoresAntropo.add(jlPesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        tfPesoHabitual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPesoHabitual, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 74, 137, -1));

        jlPesoHabitual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoHabitual.setText("Peso habitual (kg)");
        panelIndicadoresAntropo.add(jlPesoHabitual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, -1, -1));

        tfPesoActual.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 42, 137, -1));

        jlDato.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDato.setText("Dato (unidad)");
        panelIndicadoresAntropo.add(jlDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 11, 101, -1));

        jlEstatura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEstatura.setText("Estatura (m)");
        panelIndicadoresAntropo.add(jlEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, -1, -1));

        tfEstatura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 106, 137, -1));

        jlPliegueCutaneoTricipital.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPliegueCutaneoTricipital.setText("Pliege Cutáneo Tricipital (mm)");
        panelIndicadoresAntropo.add(jlPliegueCutaneoTricipital, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, -1, -1));

        tfPliegueCutaneoTricipital.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPliegueCutaneoTricipital, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 138, 137, -1));

        jlPliegueCutaneoBicipital.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPliegueCutaneoBicipital.setText("Pliege Cutáneo Bicipital (mm)");
        panelIndicadoresAntropo.add(jlPliegueCutaneoBicipital, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, -1, -1));

        tfPliegueCutaneoBicipital.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPliegueCutaneoBicipital, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 170, 137, -1));

        jPliegueCutaneoSubescapular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jPliegueCutaneoSubescapular.setText("Pliege Cutáneo Subescapular(mm)");
        panelIndicadoresAntropo.add(jPliegueCutaneoSubescapular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, -1));

        tfPliegueCutaneoSubescapular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPliegueCutaneoSubescapular, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 202, 137, -1));

        jPliegueCutaneoSuprailiaco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jPliegueCutaneoSuprailiaco.setText("Pliege Cutáneo Suprailiaco (mm)");
        panelIndicadoresAntropo.add(jPliegueCutaneoSuprailiaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, -1, -1));

        tfPliegueCutaneoSuprailiaco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPliegueCutaneoSuprailiaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 234, 137, -1));

        jlCircunferenciaBrazo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCircunferenciaBrazo.setText("Circunferencia de brazo (cm)");
        panelIndicadoresAntropo.add(jlCircunferenciaBrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, -1, -1));

        tfCircunferenciaBrazo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfCircunferenciaBrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 266, 137, -1));

        jlCircunferenciaCintura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCircunferenciaCintura.setText("Circunferencia de cintura (cm)");
        panelIndicadoresAntropo.add(jlCircunferenciaCintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 301, -1, -1));

        tfCircunferenciaCintura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfCircunferenciaCintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 298, 137, -1));

        jlCircunferenciaCadera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCircunferenciaCadera.setText("Circunferencia de cadera (cm)");
        panelIndicadoresAntropo.add(jlCircunferenciaCadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, -1, -1));

        tfCircunferenciaCadera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfCircunferenciaCadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 330, 137, -1));

        jlCircunferenciaAbdominal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCircunferenciaAbdominal.setText("Circunferencia abdominal (cm)");
        panelIndicadoresAntropo.add(jlCircunferenciaAbdominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, -1, -1));

        tfCircunferenciaAbdominal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfCircunferenciaAbdominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 362, 137, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel100.setText("Medición (unidad)");
        panelIndicadoresAntropo.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 397, -1, -1));

        jLabel101.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel101.setText("Dato (unidad)");
        panelIndicadoresAntropo.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 397, 132, -1));

        jlComplexion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlComplexion.setText("Complexión");
        panelIndicadoresAntropo.add(jlComplexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 429, -1, -1));

        tfComplexion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfComplexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 426, 142, -1));

        jlPesoTeorico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoTeorico.setText("Peso teórico (kg)");
        panelIndicadoresAntropo.add(jlPesoTeorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 461, -1, -1));

        tfPesoTeorico.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPesoTeorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 458, 142, -1));

        jlPesoTeoricoXC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoTeoricoXC.setText("Peso teórico (%)");
        panelIndicadoresAntropo.add(jlPesoTeoricoXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 493, -1, -1));

        tfPesoTeoricoXC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPesoTeoricoXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 490, 142, -1));

        jlPesoHabitualXC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoHabitualXC.setText("Peso habitual (%)");
        panelIndicadoresAntropo.add(jlPesoHabitualXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 525, -1, -1));

        tfPesoHabitualXC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPesoHabitualXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 522, 142, -1));

        JIMC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        JIMC.setText("Indice de masa corportal (kg/m2)");
        panelIndicadoresAntropo.add(JIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 557, -1, -1));

        tfIMC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 554, 142, -1));

        jlPesoMinimoIMC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoMinimoIMC.setText("Peso mínimo por IMC (kg)");
        panelIndicadoresAntropo.add(jlPesoMinimoIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 589, -1, -1));

        tfPesoMinimoIMC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPesoMinimoIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 586, 142, -1));

        jlMedicion2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlMedicion2.setText("Medición (unidad)");
        panelIndicadoresAntropo.add(jlMedicion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 11, -1, -1));

        jlDato2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDato2.setText("Dato (unidad)");
        panelIndicadoresAntropo.add(jlDato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 11, 101, -1));

        jlPesoMaximo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPesoMaximo.setText("Peso máximo por IMC (kg)");
        panelIndicadoresAntropo.add(jlPesoMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 40, -1, -1));

        tfPesoMaximo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPesoMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 37, 142, -1));

        tfGrasaCorporal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tfGrasaCorporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGrasaCorporalActionPerformed(evt);
            }
        });
        panelIndicadoresAntropo.add(tfGrasaCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 74, 142, -1));

        jlGrasaCorporal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlGrasaCorporal.setText("Grasa corporal (%)");
        panelIndicadoresAntropo.add(jlGrasaCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 74, -1, -1));

        jlGrasaCorporalKG.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlGrasaCorporalKG.setText("Grasa corporal total (kg)");
        panelIndicadoresAntropo.add(jlGrasaCorporalKG, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 109, -1, -1));

        tfGrasaCorporalKG.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfGrasaCorporalKG, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 106, 142, -1));

        jlMasaLigreGrasaKG.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlMasaLigreGrasaKG.setText("Masa libre de grasa (kg)");
        panelIndicadoresAntropo.add(jlMasaLigreGrasaKG, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 141, -1, -1));

        tfMasaLibreGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfMasaLibreGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 138, 142, -1));

        jlDiferenciaGrasaKG.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDiferenciaGrasaKG.setText("Diferencia de grasa (kg)");
        panelIndicadoresAntropo.add(jlDiferenciaGrasaKG, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 173, -1, -1));

        tfDiferenciaGrasa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfDiferenciaGrasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 170, 142, -1));

        jlMasaMuscularTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlMasaMuscularTotal.setText("Masa muscular total (kg)");
        panelIndicadoresAntropo.add(jlMasaMuscularTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 205, -1, -1));

        tfMasaMuscularTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfMasaMuscularTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 202, 142, -1));

        jlPliegueCutaneoPerceptil.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPliegueCutaneoPerceptil.setText("Pliegue cutáneo tricipital (perceptil)");
        panelIndicadoresAntropo.add(jlPliegueCutaneoPerceptil, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 237, -1, -1));

        tfPliegueCutaneoPerceptil.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPliegueCutaneoPerceptil, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 234, 142, -1));

        jlPliegueCutaneosubescapular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlPliegueCutaneosubescapular.setText("Pliegue cutáneo subescapular (perceptil)");
        panelIndicadoresAntropo.add(jlPliegueCutaneosubescapular, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 269, -1, -1));

        jlIndiceCinturaCadera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlIndiceCinturaCadera.setText("Índice cintura-cadera (cm)");
        panelIndicadoresAntropo.add(jlIndiceCinturaCadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 301, -1, -1));

        jlAreaMuscularBrazo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAreaMuscularBrazo.setText("Área muscular de brazo (cm2)");
        panelIndicadoresAntropo.add(jlAreaMuscularBrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        jlAguaCorporalTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlAguaCorporalTotal.setText("Agua corporal total (lt)");
        panelIndicadoresAntropo.add(jlAguaCorporalTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        tfPliegueCutaneoSubescapularPerceptil.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfPliegueCutaneoSubescapularPerceptil, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 266, 142, -1));

        tfIndiceCaderaCintura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfIndiceCaderaCintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 298, 142, -1));

        tfAreaMuscularBrazo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfAreaMuscularBrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 142, -1));

        tfAguaCorporalTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        panelIndicadoresAntropo.add(tfAguaCorporalTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 142, -1));

        dpGuardar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons_128px/save_128px.png"))); // NOI18N
        dpGuardar5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dpGuardar5.setBorderPainted(false);
        dpGuardar5.setContentAreaFilled(false);
        dpGuardar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dpGuardar5.setFocusPainted(false);
        dpGuardar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpGuardar5ActionPerformed(evt);
            }
        });
        panelIndicadoresAntropo.add(dpGuardar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, -1, -1));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_invertido_979x606.png"))); // NOI18N
        panelIndicadoresAntropo.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        panel.addTab("Indicadores Antropométricos", panelIndicadoresAntropo);

        jDesktopPane1.setLayer(panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jMenuItem1.setText("Guardar");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dpGuardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpGuardar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpGuardar4ActionPerformed

    private void dpGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpGuardar3ActionPerformed
        // TODO add your handling code here:
        int banderavdda = 0;
        /**
         * Validación de variable Presion Arterial
         */
        if(siPresionArterial.isSelected()||noPresionArterial.isSelected()){
            if(siPresionArterial.isSelected()){
                setVddaPresionArterial("Con presion arterial");
            }else{
                setVddaPresionArterial("Sin presion arterial");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Presión Arterial", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Validacion cual presion arterial
         */
        if (tfCualPresionArterial.getText().equals("")) {
            if(funcion.tipoString(tfCualPresionArterial.getText())){
                setVddaCualPresionArterial(tfCualPresionArterial.getText());
            }else{
                setVddaCualPresionArterial("Sin presion arterial");
            }
        } else {
            banderavdda = banderavdda + 1;
            tfCualPresionArterial.setText("");
            JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"¿Cuanta presión arterial?\"", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Validacion hora presion arterial
         */
        if (tfHoraPresion.getText().equals("")) {
            if(funcion.tipoString(tfHoraPresion.getText())){
                setVddaHoraPresionArterial(tfHoraPresion.getText());
            }else{
                setVddaHoraPresionArterial("Sin hora presion arterial");
            }
        } else {
            banderavdda = banderavdda + 1;
            tfHoraPresion.setText("");
            JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Hora presión arterial\"", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Validación de variable tabaco
         */
        if(cbTabaco.getSelectedItem().equals("...")){
            JOptionPane.showMessageDialog(null, "Asignar valor a la opción \"Tabaco\"", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            String vTabaco = (String) cbTabaco.getSelectedItem();
            setVddaTabaco(vTabaco);
        }
        /**
         * Validación de variable alcochol
         */
        if(cbAlcohol.getSelectedItem().equals("...")){
            JOptionPane.showMessageDialog(null, "Asignar valor a la opción \"Alcohol\"", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            String vAlcochol = (String) cbAlcohol.getSelectedItem();
            setVddaAlcohol(vAlcochol);
        }
        /**
         * Validación de variable café
         */
        if(cbCafe.getSelectedItem().equals("...")){
            JOptionPane.showMessageDialog(null, "Asignar valor a la opción \"Café\"", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            String vCafe = (String) cbCafe.getSelectedItem();
            setVddaCafe(vCafe);
        }
        
    }//GEN-LAST:event_dpGuardar3ActionPerformed

    private void cbCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCafeActionPerformed

    private void cbAlcoholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlcoholActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlcoholActionPerformed

    private void cbTabacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTabacoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTabacoActionPerformed

    private void cbTipoActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActividadActionPerformed

    private void dpGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpGuardar2ActionPerformed
        // TODO add your handling code here:
        int banderavag = 0;
        /**
         * Validación de variable EMBARAZO
         */
        if(siEmbarazoActual.isSelected() || noEmbarazoActual.isSelected()){
            if(siEmbarazoActual.isSelected()){
                setVagEmbarazoAcutal("Embarazo Actual");
            }else{
                setVagEmbarazoAcutal("Sin Embarazo Actual");
            }
        }else{
            banderavag = banderavag + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Embarazo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        /**
         * Valoracion de variable SDG
         */
        if(tfSDG.getText().equals("")){
            setVagSemanasGestacion("Sin semanas de gestacion");            
        }else{
            if (funcion.tipoString(tfSDG.getText())) {
                setVagSemanasGestacion(tfSDG.getText());
            } else {
                banderavag = banderavag + 1;
                tfSDG.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Semanas de gestación\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        /**
         * Validación de variable Anticonceptivos
         */
        if(siAnticonceptivosOrales.isSelected()||noAnticonceptivos.isSelected()){
            if(siAnticonceptivosOrales.isSelected()){
                setVagAnticonceptivos("Anticonceptivos Orales");
            }else{
                setVagAnticonceptivos("Sin anticonceptivos orales");
            }
        }else{
            banderavag = banderavag + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Anticonceptivos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoracion de variable Anticonceptivo
         */
        if(tfVagCualAnticonceptivo.getText().equals("")){
            setVagCualAnticonceptivo("Sin anticonceptivos orales");            
        }else{
            if (funcion.tipoString(tfVagCualAnticonceptivo.getText())) {
                setVagCualAnticonceptivo(tfVagCualAnticonceptivo.getText());
            } else {
                banderavag = banderavag + 1;
                tfVagCualAnticonceptivo.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"¿Cuál anticonceptivo?\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        /**
         * Valoracion de variable Dosis Anticonceptivo
         */
        if(tfDosisAnticonceptivos.getText().equals("")){
            setVagDosisAnticoconceptivo("Sin dosis de anticonceptivos");            
        }else{
            if (funcion.tipoString(tfDosisAnticonceptivos.getText())) {
                setVagDosisAnticoconceptivo(tfDosisAnticonceptivos.getText());
            } else {
                banderavag = banderavag + 1;
                tfDosisAnticonceptivos.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Dosis Anticonceptivos\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        /**
         * Valoracion de variable Tiempo de Anticonceptivos
         */
        if(tfVagTiempoAnticonceptivo.getText().equals("")){
            setVagTiempoAnticonceptivo("Sin tiempo de anticonceptivos");            
        }else{
            if (funcion.tipoString(tfVagTiempoAnticonceptivo.getText())) {
                setVagTiempoAnticonceptivo(tfVagTiempoAnticonceptivo.getText());
            } else {
                banderavag = banderavag + 1;
                tfVagTiempoAnticonceptivo.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Tiempo anticonceptivo\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        /**
         * Valoración de variable Climaterio
         */
        if(siClimaterio.isSelected() || noClimaterio.isSelected()){
            if(siClimaterio.isSelected()){
                setVagClimaterio("Con climaterio");
            }else{
                setVagClimaterio("Sin climaterio");
            }
        }else{
            banderavag = banderavag + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Climaterio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variable Terapia hormonal
         */
        if(siTerapiaHormonal.isSelected() || noTerapiaHornomal.isSelected()){
            if(siTerapiaHormonal.isSelected()){
                setVagTerapiaHormonal("Con terapia hormonal");
            }else{
                setVagClimaterio("Sin terapia hormonal");
            }
        }else{
            banderavag = banderavag + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Terapia Hormonal", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoracion de variable cual terapia hormonal
         */
        if(tfCualTerapiaHormonal.getText().equals("")){
            setVagCualTerapiaHormonal("Sin terapia hormonal");   
        }else{
            if(funcion.tipoString(tfCualTerapiaHormonal.getText())){
                setVagCualTerapiaHormonal(tfCualTerapiaHormonal.getText());
            }else{
                banderavag = banderavag + 1;
                tfCualTerapiaHormonal.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"¿Cuál terapia hormonal?\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        /**
         * Valoracion de variable cual dosis de terapia hormonal
         */
        if(tfDosisTerapiaHormonal.getText().equals("")){
            setVagDosisTerapiaHormonal("Sin dosis de terapia hormonal");   
        }else{
            if(funcion.tipoString(tfDosisTerapiaHormonal.getText())){
                setVagDosisTerapiaHormonal(tfDosisTerapiaHormonal.getText());
            }else{
                banderavag = banderavag + 1;
                tfDosisTerapiaHormonal.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Dosis de terapia hormonal\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        /**
         * Valoracion de variable cual tiempo de terapia hormonal
         */
        if(tfvagTiempoTerapiaHormonal.getText().equals("")){
            setVagTiempoTerapiaHormonal("Sin tiempo de terapia hormonal");   
        }else{
            if(funcion.tipoString(tfvagTiempoTerapiaHormonal.getText())){
                setVagTiempoTerapiaHormonal(tfvagTiempoTerapiaHormonal.getText());
            }else{
                banderavag = banderavag + 1;
                tfvagTiempoTerapiaHormonal.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Tiempo de terapia hormonal\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (banderavag == 0) {
            int respvag = JOptionPane.showConfirmDialog(null, "¿Éstas seguro de guardar la información \"Aspectos Ginecológicos\"?", "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (respvag == 0) {
                panel.setSelectedIndex(3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen campos sin seleccionar, favor de verificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_dpGuardar2ActionPerformed

    private void tfvagTiempoTerapiaHormonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfvagTiempoTerapiaHormonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfvagTiempoTerapiaHormonalActionPerformed

    private void noClimaterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noClimaterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noClimaterioActionPerformed

    private void siClimaterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siClimaterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siClimaterioActionPerformed

    private void tfCualTerapiaHormonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCualTerapiaHormonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCualTerapiaHormonalActionPerformed

    private void siAnticonceptivosOralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siAnticonceptivosOralesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siAnticonceptivosOralesActionPerformed

    private void noEmbarazoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noEmbarazoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noEmbarazoActualActionPerformed

    private void siEmbarazoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siEmbarazoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siEmbarazoActualActionPerformed

    private void dpGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpGuardar1ActionPerformed
        // TODO add your handling code here:
        int banderavase = 0;
        /**
         * Valoración de variables para la opcion "Diarrea"
         */
        if (rbSiDiarrea.isSelected() || rbNoDiarrea.isSelected()) {
            if (rbSiDiarrea.isSelected()) {
                setVasediarrea("SI");
                System.out.println("Si Diarrea seleccionado");
            } else if (rbNoDiarrea.isSelected()) {
                System.out.println("No Diarrea seleccionado");
                setVasediarrea("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Diarrea", "Error", JOptionPane.ERROR_MESSAGE);
        }

        /**
         * Valoración de variables para la opción "Estreñimineto"
         */
        if (rbSiEstrenimiento.isSelected() || rbNoEstrenimiento.isSelected()) {
            if (rbSiEstrenimiento.isSelected()) {
                setVaseestrenimiento("SI");
                System.out.println("Si Estrenimiento seleccionado");
            } else if (rbNoEstrenimiento.isSelected()) {
                System.out.println("No Estrenimiento seleccionado");
                setVaseestrenimiento("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Estreñimiento", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variables para la opción "Gastritis"
         */
        if (rbSiGastritis.isSelected() || rbNoGastritis.isSelected()) {
            if (rbSiGastritis.isSelected()) {
                setVasegastritis("SI");
                System.out.println("Si Gastritis seleccionado");
            } else if (rbNoGastritis.isSelected()) {
                System.out.println("No Gastritis seleccionado");
                setVasegastritis("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Gastritis", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variables para la opción "Ulceras"
         */
        if (rbSiUlcera.isSelected() || rbNoUlcera.isSelected()) {
            if (rbSiUlcera.isSelected()) {
                setVaseulcera("SI");
                System.out.println("Si Ulcera seleccionado");
            } else if (rbNoUlcera.isSelected()) {
                System.out.println("No Ulcera seleccionado");
                setVaseulcera("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Ulcera", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variables para la opción "Nauseas"
         */
        if (rbSiNausea.isSelected() || rbNoNausea.isSelected()) {
            if (rbSiNausea.isSelected()) {
                setVasenauseas("SI");
                System.out.println("Si Nauseas seleccionado");
            } else if (rbNoNausea.isSelected()) {
                System.out.println("No Nauseas seleccionado");
                setVasenauseas("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Náuseas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variables para la opción "Pirosis"
         */
        if (rbSiPirosis.isSelected() || rbNoPirosis.isSelected()) {
            if (rbSiPirosis.isSelected()) {
                setVasepirosis("SI");
                System.out.println("Si Pirosis seleccionado");
            } else if (rbNoPirosis.isSelected()) {
                System.out.println("No Pirosis seleccionado");
                setVasepirosis("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Pirosis", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variables para la opción "Vomito"
         */
        if (rbSiVomito.isSelected() || rbNoVomito.isSelected()) {
            if (rbSiVomito.isSelected()) {
                setVasevomito("SI");
                System.out.println("Si Vómito seleccionado");
            } else if (rbNoVomito.isSelected()) {
                System.out.println("No Vómito seleccionado");
                setVasevomito("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Vómito", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variables para la opción "Colitis"
         */
        if (rbSiColitis.isSelected() || rbNoColitis.isSelected()) {
            if (rbSiColitis.isSelected()) {
                setVasecolitis("SI");
                System.out.println("Si Colitis seleccionado");
            } else if (rbNoColitis.isSelected()) {
                System.out.println("No Colitis seleccionado");
                setVasecolitis("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Colitis", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variables para la opción "Dentadura"
         */
        if (rbSiDentadura.isSelected() || rbNoDentadura.isSelected()) {
            if (rbSiDentadura.isSelected()) {
                setVasedentadura("SI");
                System.out.println("Si Dentadura seleccionado");
            } else if (rbNoDentadura.isSelected()) {
                System.out.println("No Dentadura seleccionado");
                setVasedentadura("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Dentadura", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Text field otros
         */
        if (tfOtros.getText().equals("")) {
            setVaseotros("Sin otros problemas");
            System.out.println("Otros sin información");
        } else {
            if (funcion.tipoString(tfOtros.getText())) {
                setVaseotros(tfOtros.getText());
                System.out.println(getVaseotros());
            } else {
                banderavase = banderavase + 1;
                tfOtros.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Otros\"", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        /**
         * Text Area Observaciones
         */
        if (taObservaciones.getText().equals("")) {
            setVaseobservaciones("Sin observaciones");
            System.out.println("Sin observaciones");
        } else {
            if (funcion.tipoString(taObservaciones.getText())) {
                setVaseobservaciones(taObservaciones.getText());
                System.out.println(getVaseobservaciones());
            } else {
                banderavase = banderavase + 1;
                taObservaciones.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Observaciones\"", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        /**
         * Valoración de variables para la opción "Enfermedades diagnosticadas"
         */
        if (rbSiED.isSelected() || rbNoED.isSelected()) {
            if (rbSiED.isSelected()) {
                setVaseenfermedadDiagosticada("SI");
                System.out.println("Si ED seleccionado");
            } else if (rbNoED.isSelected()) {
                System.out.println("No ED seleccionado");
                setVaseenfermedadDiagosticada("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Enfermedad Diagnosticada", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoracion de variable cual enfermedad diagnosticada
         */
        if (tfCualED.getText().equals("")) {
            setVasecualED("Sin enfermedad diagnosticada");
            System.out.println("Sin enfermedad importante");
        } else {
            if (funcion.tipoString(tfCualED.getText())) {
                setVasecualED(tfCualED.getText());
                System.out.println(getVasecualED());
            } else {
                banderavase = banderavase + 1;
                tfCualED.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"¿Cuál enfermedad diagnosticada?\"", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        /**
         * Valoración de variables para la opción "Enfermedades importante"
         */
        if (rbSiEI.isSelected() || rbNoEI.isSelected()) {
            if (rbSiEI.isSelected()) {
                setVaseenfermedadImportante("SI");
                System.out.println("Si EI seleccionado");
            } else if (rbNoEI.isSelected()) {
                System.out.println("No EI seleccionado");
                setVaseenfermedadImportante("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Enfermedad Importante", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoracion de variable cual enfermedad Importante
         */
        if (tfCualEI.getText().equals("")) {
            setVasecualEI("Sin enfermedad importante");
            System.out.println("Sin enfermedad importante");
        } else {
            if (funcion.tipoString(tfCualEI.getText())) {
                setVasecualEI(tfCualEI.getText());
                System.out.println(getVasecualEI());
            } else {
                banderavase = banderavase + 1;
                tfCualEI.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"¿Cuál enfermedad importante?\"", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        
        
        /**
         * Valoración de variables para la opción "Medicamento"
         */
        if (rbSiMedicamento.isSelected() || rbNoMedicamento.isSelected()) {
            if (rbSiMedicamento.isSelected()) {
                setVasemedicamento("SI");
                System.out.println("Si Medicamento seleccionado");
            } else if (rbNoMedicamento.isSelected()) {
                System.out.println("No Medicamento seleccionado");
                setVasemedicamento("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Medicamento", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoracion de variable cual Medicamento
         */
        if (tfCualMedicamento.getText().equals("")) {
            setVasecualMedicamento("Sin enfermedad importante");
            System.out.println("Sin enfermedad importante");
        } else {
            if (funcion.tipoString(tfCualMedicamento.getText())) {
                setVasecualMedicamento(tfCualMedicamento.getText());
                System.out.println(getVasecualMedicamento());
            } else {
                banderavase = banderavase + 1;
                tfCualMedicamento.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"¿Cuál enfermedad medicamento?\"", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        /**
         * Valoracion de variable dosisMedicamento
         */
        if(tfDosisMedicamento.getText().equals("")){
            setVasedosisMedicamento("Sin dosis medicamento");
            System.out.println("Sin dosis medicamento");
        }else{
            if (funcion.tipoString(tfDosisMedicamento.getText())) {
                setVasedosisMedicamento(tfDosisMedicamento.getText());
                System.out.println(getVasedosisMedicamento());
            } else {
                banderavase = banderavase + 1;
                tfDosisMedicamento.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Dosis Medicamento\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        /**
         * Valoracion de variable Tiempo medicamento
         */
        if(tfCuantoTiempo.getText().equals("")){
            setVasedosisMedicamento("Sin tiempo medicamento");
            System.out.println("Sin tiempo medicamento");
            
        }else{
            if (funcion.tipoString(tfCuantoTiempo.getText())) {
                setVasedosisMedicamento(tfCuantoTiempo.getText());
                System.out.println(getVasetiempoMedicamento());
            } else {
                banderavase = banderavase + 1;
                tfCuantoTiempo.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"Tiempo Medicamento\"", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        /**
         * Valoración de variables para la opción "Cirugia"
         */
        if (rbSiCirugia.isSelected() || rbNoCirugia.isSelected()) {
            if (rbSiCirugia.isSelected()) {
                setVasecirujia("SI");
                System.out.println("Si cirugia seleccionado");
            } else if (rbNoCirugia.isSelected()) {
                System.out.println("No cirugia seleccionado");
                setVasecirujia("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción cirugia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoracion de variable cual Cirugia
         */
        if (tfCirugia.getText().equals("")) {
            setVasecualCirujia("Sin cirugia");
            System.out.println("Sin cirugia");
        } else {
            if (funcion.tipoString(tfCirugia.getText())) {
                setVasecualCirujia(tfCirugia.getText());
                System.out.println(getVasecualCirujia());
            } else {
                banderavase = banderavase + 1;
                tfCirugia.setText("");
                JOptionPane.showMessageDialog(null, "Caracteres especiales no permitidos en campo \"¿Cuál cirugía?\"", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        /**
         * Valoración de variables para la opción "Laxantes"
         */
        if (rbSiLaxante.isSelected() || rbNoLaxante.isSelected()) {
            if (rbSiLaxante.isSelected()) {
                setVaselaxantes("SI");
                System.out.println("Si cirugia seleccionado");
            } else if (rbNoLaxante.isSelected()) {
                System.out.println("No cirugia seleccionado");
                setVaselaxantes("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Laxantes", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        /**
         * Valoración de variables para la opción "Diuréticos"
         */
        if (rbSiDiureticos.isSelected() || rbNoDiureticos.isSelected()) {
            if (rbSiDiureticos.isSelected()) {
                setVasediureticos("SI");
                System.out.println("Si Diuréticos seleccionado");
            } else if (rbNoDiureticos.isSelected()) {
                System.out.println("No Diuréticos seleccionado");
                setVasediureticos("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Diuréticos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        /**
         * Valoración de variables para la opción "Antiácidos"
         */
        if (rbSiAC.isSelected() || rbNoAC.isSelected()) {
            if (rbSiAC.isSelected()) {
                setVaseantiacidos("SI");
                System.out.println("Si Antiácidos seleccionado");
            } else if (rbNoAC.isSelected()) {
                System.out.println("No Antiácidos seleccionado");
                setVaseantiacidos("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Antiácidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        /**
         * Valoración de variables para la opción "Analgésicos"
         */
        if (rbSiAnalgesicos.isSelected() || rbNoAnalgesicos.isSelected()) {
            if (rbSiAnalgesicos.isSelected()) {
                setVaseanalgesicos("SI");
                System.out.println("Si Analgésicos seleccionado");
            } else if (rbNoAnalgesicos.isSelected()) {
                System.out.println("No Analgésicos seleccionado");
                setVaseanalgesicos("NO");
            }
        } else {
            banderavase = banderavase + 1;
            JOptionPane.showMessageDialog(null, "Seleccionar la opción Analgésicos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if(banderavase == 0){
            int respvase = JOptionPane.showConfirmDialog(null, "¿Éstas seguro de guardar la información \"Antecedentes Salud/Enfemedad\"?", "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(respvase==0){
                panel.setSelectedIndex(2);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Existen campos sin seleccionar, favor de verificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dpGuardar1ActionPerformed

    private void dpGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpGuardarActionPerformed
        // TODO add your handling code here:
        String nombre = dpNombre.getText(), apellidos = dpApellidos.getText(), sexo = (String) dpSexo.getSelectedItem();
        String nac = dpNacimiento.getText(), edad = (String) cbEdad.getSelectedItem(), cp = dpCP.getText();
        String domicilio = dpDomicilio.getText(), escolaridad = (String) dpEscolaridad.getSelectedItem(), ciudad = dpCiudad.getText();
        String estadoC = (String) dpEstadoCivil.getSelectedItem(), telefono = dpTelefono.getText();
        String dpID = dpIDExpediente.getText(), email = dpEmail.getText();
        int resp = JOptionPane.showConfirmDialog(null, "¿Éstas seguro de guardar la información del usuario?", "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0) {
            consultasMysql ingreso = new consultasMysql();
            try {
                if (ingreso.insertarNuevoPaciente(dpID, nombre, apellidos, sexo, nac, edad, domicilio, cp, ciudad, escolaridad, estadoC, telefono, email) == 0) {
                    JOptionPane.showMessageDialog(null, "Datos guardados exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_dpGuardarActionPerformed

    private void dpTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpTelefonoActionPerformed

    private void dpTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpTelefonoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dpTelefonoFocusLost

    private void dpTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpTelefonoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dpTelefonoFocusGained

    private void dpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpEmailActionPerformed

    private void dpEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dpEmailFocusLost

    private void dpEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dpEmailFocusGained

    private void dpIDExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpIDExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpIDExpedienteActionPerformed

    private void dpIDExpedienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpIDExpedienteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dpIDExpedienteFocusLost

    private void dpIDExpedienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpIDExpedienteFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dpIDExpedienteFocusGained

    private void dpCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpCiudadActionPerformed

    private void dpCiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpCiudadFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dpCiudadFocusLost

    private void dpCiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpCiudadFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dpCiudadFocusGained

    private void dpCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpCPActionPerformed

    private void dpCPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpCPFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dpCPFocusLost

    private void dpCPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpCPFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dpCPFocusGained

    private void dpDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpDomicilioActionPerformed

    private void dpDomicilioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpDomicilioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dpDomicilioFocusLost

    private void dpDomicilioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpDomicilioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dpDomicilioFocusGained

    private void dpNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpNacimientoActionPerformed

    private void dpNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpNacimientoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dpNacimientoFocusLost

    private void dpNacimientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpNacimientoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dpNacimientoFocusGained

    private void dpApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpApellidosActionPerformed

    private void dpApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpApellidosFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dpApellidosFocusLost

    private void dpApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpApellidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dpApellidosFocusGained

    private void dpNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpNombreActionPerformed

    private void dpNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpNombreFocusLost
        // TODO add your handling code here:
        seleccionarTexto.focusLost(evt);
    }//GEN-LAST:event_dpNombreFocusLost

    private void dpNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dpNombreFocusGained
        // TODO add your handling code here:
        seleccionarTexto.focusGained(evt);
    }//GEN-LAST:event_dpNombreFocusGained

    private void tfGrasaCorporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGrasaCorporalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGrasaCorporalActionPerformed

    private void dpGuardar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpGuardar5ActionPerformed
        // TODO add your handling code here:
        String pesoActual = tfPesoActual.getText();
        pesoActual = pesoActual + "@";
        encriptacion encript = new encriptacion();
        String encr = encript.encriptar(pesoActual);
        System.out.println("Texto encriptado: " + encr);

        System.out.println("Texto desencriptado: " + encript.desEncriptar(encr));

        Random rnd = new Random();
        int valor = 48 + rnd.nextInt(118);
        System.out.println(valor);
    }//GEN-LAST:event_dpGuardar5ActionPerformed

    private void rbSiEDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbSiEDStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSiEDStateChanged

    private void rbSiEDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbSiEDFocusGained
        // TODO add your handling code here:
        tfCualED.enable(true);
    }//GEN-LAST:event_rbSiEDFocusGained

    private void rbNoEDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbNoEDFocusGained
        // TODO add your handling code here:
        tfCualED.setText("");
        tfCualED.disable();
        //JOptionPane.showMessageDialog(null, "Si no se padece ninguna Enfermedad Diagnosticada\n el siguiente campo no puede contener información", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_rbNoEDFocusGained

    private void rbSiEIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbSiEIFocusGained
        // TODO add your handling code here:
        tfCualEI.enable(true);
    }//GEN-LAST:event_rbSiEIFocusGained

    private void rbNoEIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbNoEIFocusGained
        // TODO add your handling code here:
        tfCualEI.setText("");
        tfCualEI.disable();
    }//GEN-LAST:event_rbNoEIFocusGained

    private void rbSiMedicamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbSiMedicamentoFocusGained
        // TODO add your handling code here:
        tfCualMedicamento.enable(true);
        tfDosisMedicamento.enable(true);
        tfCuantoTiempo.enable(true);
    }//GEN-LAST:event_rbSiMedicamentoFocusGained

    private void rbNoMedicamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbNoMedicamentoFocusGained
        // TODO add your handling code here:
        tfCualMedicamento.setText("");
        tfCualMedicamento.disable();
        tfDosisMedicamento.setText("");
        tfDosisMedicamento.disable();
        tfCuantoTiempo.setText("");
        tfCuantoTiempo.disable();
    }//GEN-LAST:event_rbNoMedicamentoFocusGained

    private void rbSiCirugiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbSiCirugiaFocusGained
        // TODO add your handling code here:
        tfCirugia.enable();
    }//GEN-LAST:event_rbSiCirugiaFocusGained

    private void rbNoCirugiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbNoCirugiaFocusGained
        // TODO add your handling code here:
        tfCirugia.setText("");
        tfCirugia.disable();
    }//GEN-LAST:event_rbNoCirugiaFocusGained

    private void siEmbarazoActualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_siEmbarazoActualFocusGained
        // TODO add your handling code here:
        tfSDG.enable();
    }//GEN-LAST:event_siEmbarazoActualFocusGained

    private void noEmbarazoActualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noEmbarazoActualFocusGained
        // TODO add your handling code here:
        tfSDG.setText("");
        tfSDG.disable();
    }//GEN-LAST:event_noEmbarazoActualFocusGained

    private void siAnticonceptivosOralesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_siAnticonceptivosOralesFocusGained
        // TODO add your handling code here:
        tfVagCualAnticonceptivo.enable(true);
        tfVagTiempoAnticonceptivo.enable(true);
        tfDosisAnticonceptivos.enable(true);
    }//GEN-LAST:event_siAnticonceptivosOralesFocusGained

    private void noAnticonceptivosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noAnticonceptivosFocusGained
        // TODO add your handling code here:
        tfVagCualAnticonceptivo.setText("");
        tfVagCualAnticonceptivo.disable();
        tfVagTiempoAnticonceptivo.setText("");
        tfVagTiempoAnticonceptivo.disable();
        tfDosisAnticonceptivos.setText("");
        tfDosisAnticonceptivos.disable();
    }//GEN-LAST:event_noAnticonceptivosFocusGained

    private void siTerapiaHormonalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_siTerapiaHormonalFocusGained
        // TODO add your handling code here:
        tfCualTerapiaHormonal.enable(true);
        tfDosisTerapiaHormonal.enable(true);
        tfvagTiempoTerapiaHormonal.enable(true);
    }//GEN-LAST:event_siTerapiaHormonalFocusGained

    private void noTerapiaHornomalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noTerapiaHornomalFocusGained
        // TODO add your handling code here:
        tfCualTerapiaHormonal.setText("");
        tfCualTerapiaHormonal.disable();
        tfDosisTerapiaHormonal.setText("");
        tfDosisTerapiaHormonal.disable();
        tfvagTiempoTerapiaHormonal.setText("");
        tfvagTiempoTerapiaHormonal.disable();
    }//GEN-LAST:event_noTerapiaHornomalFocusGained

    private void tfDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDesayunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDesayunoActionPerformed

    private void siPresionArterialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_siPresionArterialFocusGained
        // TODO add your handling code here:
        tfCualPresionArterial.enable(true);
        tfHoraPresion.enable(true);
    }//GEN-LAST:event_siPresionArterialFocusGained

    private void noPresionArterialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noPresionArterialFocusGained
        // TODO add your handling code here:
        tfCualPresionArterial.setText("");
        tfCualPresionArterial.disable();
        tfHoraPresion.setText("");
        tfHoraPresion.disable();
    }//GEN-LAST:event_noPresionArterialFocusGained

    private void cbTipoActividadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoActividadItemStateChanged
        // TODO add your handling code here:
        if(cbTipoActividad.getSelectedItem().equals("Sin actividad")){
            cbDuracionActividad.setSelectedIndex(1);
            cbFrecuenciaActividad.setSelectedIndex(1);
            cbDuracionActividad.disable();
            cbFrecuenciaActividad.disable();
        }
        if(cbTipoActividad.getSelectedItem().equals("...")){
            cbDuracionActividad.setSelectedIndex(0);
            cbFrecuenciaActividad.setSelectedIndex(0);
            cbDuracionActividad.enable(true);
            cbFrecuenciaActividad.enable(true);
        }
        if(cbTipoActividad.getSelectedItem().equals("Muy ligera") || cbTipoActividad.getSelectedItem().equals("Ligera") || cbTipoActividad.getSelectedItem().equals("Moderada") || cbTipoActividad.getSelectedItem().equals("Pesada") || cbTipoActividad.getSelectedItem().equals("Excepcional")){
            cbDuracionActividad.enable(true);
            cbFrecuenciaActividad.enable(true);
        }
    }//GEN-LAST:event_cbTipoActividadItemStateChanged
    private void guardarInfoGeneral() {
        System.out.println("Clic en guardar");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nuevoPacienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoPacienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoPacienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoPacienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoPacienteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JIMC;
    private javax.swing.JRadioButton NocheHambre;
    private javax.swing.JRadioButton SuficienteApego;
    private javax.swing.JRadioButton TardeHambre;
    private javax.swing.JRadioButton aceiteVegetalGrasa;
    private javax.swing.JRadioButton buenoApetito;
    private javax.swing.JComboBox<String> cbAlcohol;
    private javax.swing.JComboBox<String> cbCafe;
    private javax.swing.JComboBox<String> cbDuracionActividad;
    private javax.swing.JComboBox<String> cbEdad;
    private javax.swing.JComboBox<String> cbFrecuenciaActividad;
    private javax.swing.JComboBox<String> cbHoraCena;
    private javax.swing.JComboBox<String> cbHoraComida;
    private javax.swing.JComboBox<String> cbHoraDesayuno;
    private javax.swing.JComboBox<String> cbHoraDespertarse;
    private javax.swing.JComboBox<String> cbHoraDormir;
    private javax.swing.JComboBox<String> cbMinutoCena;
    private javax.swing.JComboBox<String> cbMinutoComida;
    private javax.swing.JComboBox<String> cbMinutoDesayuno;
    private javax.swing.JComboBox<String> cbMinutoDespertarse;
    private javax.swing.JComboBox<String> cbMinutoDormir;
    private javax.swing.JComboBox<String> cbTabaco;
    private javax.swing.JComboBox<String> cbTipoActividad;
    private javax.swing.JTextField dpApellidos;
    private javax.swing.JTextField dpCP;
    private javax.swing.JTextField dpCiudad;
    private javax.swing.JTextField dpDomicilio;
    private javax.swing.JTextField dpEmail;
    private javax.swing.JComboBox<String> dpEscolaridad;
    private javax.swing.JComboBox<String> dpEstadoCivil;
    private javax.swing.JButton dpGuardar;
    private javax.swing.JButton dpGuardar1;
    private javax.swing.JButton dpGuardar2;
    private javax.swing.JButton dpGuardar3;
    private javax.swing.JButton dpGuardar4;
    private javax.swing.JButton dpGuardar5;
    private javax.swing.JTextField dpIDExpediente;
    private javax.swing.JTextField dpNacimiento;
    private javax.swing.JTextField dpNombre;
    private javax.swing.JComboBox<String> dpSexo;
    private javax.swing.JTextField dpTelefono;
    private javax.swing.JRadioButton excepcionalApego;
    private javax.swing.JRadioButton excepcionalResultadosDieta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jHaceCuantoDieta;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel jPliegueCutaneoSubescapular;
    private javax.swing.JLabel jPliegueCutaneoSuprailiaco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlAgregarSal;
    private javax.swing.JLabel jlAguaCorporalTotal;
    private javax.swing.JLabel jlAlcohol;
    private javax.swing.JLabel jlAlergico;
    private javax.swing.JLabel jlAliementosNoPreferidos;
    private javax.swing.JLabel jlAlimento;
    private javax.swing.JLabel jlAlimentosMalestar;
    private javax.swing.JLabel jlAlimentosParaBajarPeso;
    private javax.swing.JLabel jlAlimentosPreferidos;
    private javax.swing.JLabel jlAnalgesicos;
    private javax.swing.JLabel jlAntiacidos;
    private javax.swing.JLabel jlAnticonceptivos;
    private javax.swing.JLabel jlApellidos;
    private javax.swing.JLabel jlApetito;
    private javax.swing.JLabel jlAreaMuscularBrazo;
    private javax.swing.JLabel jlAspectoGeneral;
    private javax.swing.JLabel jlCPostal;
    private javax.swing.JLabel jlCafe;
    private javax.swing.JLabel jlCena;
    private javax.swing.JLabel jlCircunferenciaAbdominal;
    private javax.swing.JLabel jlCircunferenciaBrazo;
    private javax.swing.JLabel jlCircunferenciaCadera;
    private javax.swing.JLabel jlCircunferenciaCintura;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlClimaterio;
    private javax.swing.JLabel jlColitis;
    private javax.swing.JLabel jlComida;
    private javax.swing.JLabel jlComidasCasa;
    private javax.swing.JLabel jlComidasFuera;
    private javax.swing.JLabel jlComoVaria;
    private javax.swing.JLabel jlComplexion;
    private javax.swing.JLabel jlConsumoEDA;
    private javax.swing.JLabel jlConsumoFrecuencia;
    private javax.swing.JLabel jlCualAlergico;
    private javax.swing.JLabel jlCualAnticonceptivo;
    private javax.swing.JLabel jlCualED;
    private javax.swing.JLabel jlCualEI;
    private javax.swing.JLabel jlCualMedicamento;
    private javax.swing.JLabel jlCualMedicamento1;
    private javax.swing.JLabel jlCualMedicamentoBajarPeso;
    private javax.swing.JLabel jlCualPresionArterial;
    private javax.swing.JLabel jlCualTerapia;
    private javax.swing.JLabel jlCuantasComidasDia;
    private javax.swing.JLabel jlCuantasDietas;
    private javax.swing.JLabel jlCuantoAPegoDieta;
    private javax.swing.JLabel jlCuantoTiempo;
    private javax.swing.JLabel jlCuantoTiempo1;
    private javax.swing.JLabel jlCuantoTiempoDieta;
    private javax.swing.JLabel jlDato;
    private javax.swing.JLabel jlDato2;
    private javax.swing.JLabel jlDentadura;
    private javax.swing.JLabel jlDesayuno;
    private javax.swing.JLabel jlDespertarse;
    private javax.swing.JLabel jlDiarioActividades;
    private javax.swing.JLabel jlDiarrea;
    private javax.swing.JLabel jlDietaEspecial;
    private javax.swing.JLabel jlDiferenciaGrasaKG;
    private javax.swing.JLabel jlDiureticos;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlDormir;
    private javax.swing.JLabel jlDosis;
    private javax.swing.JLabel jlDosis2;
    private javax.swing.JLabel jlDuracionActividad;
    private javax.swing.JLabel jlEDiagnosticada;
    private javax.swing.JLabel jlEdad;
    private javax.swing.JLabel jlEjercicio;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEmbarazoActual;
    private javax.swing.JLabel jlEnfemedadImportante;
    private javax.swing.JLabel jlEntreComidas;
    private javax.swing.JLabel jlEntreSemana;
    private javax.swing.JLabel jlEscolaridad;
    private javax.swing.JLabel jlEstadoCivil;
    private javax.swing.JLabel jlEstatura;
    private javax.swing.JLabel jlEstrenimiento;
    private javax.swing.JLabel jlFinSemana;
    private javax.swing.JLabel jlFrecuencia;
    private javax.swing.JLabel jlGastritis;
    private javax.swing.JLabel jlGrasaCorporal;
    private javax.swing.JLabel jlGrasaCorporalKG;
    private javax.swing.JLabel jlGrasaUtilizada;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlHoraHambre;
    private javax.swing.JLabel jlHoraPresion;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlIndiceCinturaCadera;
    private javax.swing.JLabel jlMasaLigreGrasaKG;
    private javax.swing.JLabel jlMasaMuscularTotal;
    private javax.swing.JLabel jlMedicamenti;
    private javax.swing.JLabel jlMedicamenti1;
    private javax.swing.JLabel jlMedicion;
    private javax.swing.JLabel jlMedicion2;
    private javax.swing.JLabel jlModificacionDieta;
    private javax.swing.JLabel jlNacimiento;
    private javax.swing.JLabel jlNausea;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlOtroGrasa;
    private javax.swing.JLabel jlOtros;
    private javax.swing.JLabel jlPesoActual;
    private javax.swing.JLabel jlPesoHabitual;
    private javax.swing.JLabel jlPesoHabitualXC;
    private javax.swing.JLabel jlPesoMaximo;
    private javax.swing.JLabel jlPesoMinimoIMC;
    private javax.swing.JLabel jlPesoTeorico;
    private javax.swing.JLabel jlPesoTeoricoXC;
    private javax.swing.JLabel jlPirosis;
    private javax.swing.JLabel jlPliegueCutaneoBicipital;
    private javax.swing.JLabel jlPliegueCutaneoPerceptil;
    private javax.swing.JLabel jlPliegueCutaneoTricipital;
    private javax.swing.JLabel jlPliegueCutaneosubescapular;
    private javax.swing.JLabel jlPreisonArterial;
    private javax.swing.JLabel jlPresionArterial;
    private javax.swing.JLabel jlQuienPrepara;
    private javax.swing.JLabel jlRazonDIetaEspecial;
    private javax.swing.JLabel jlRazonModificacion;
    private javax.swing.JLabel jlResultadosEsperadosDieta;
    private javax.swing.JLabel jlSemanasGestacion;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlSignos;
    private javax.swing.JLabel jlTabaco;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTerapiaHormonal;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlUlcera;
    private javax.swing.JLabel jlVomito;
    private javax.swing.JLabel jlvagCualTerapiaHormonal;
    private javax.swing.JLabel jlvagDosis;
    private javax.swing.JLabel jlvagTiempoTerapiaHormonal;
    private javax.swing.JRadioButton levantarseHambre;
    private javax.swing.JRadioButton maloApetito;
    private javax.swing.JRadioButton mantecaGrasa;
    private javax.swing.JRadioButton mantequillaGrasa;
    private javax.swing.JRadioButton margarinaGrasa;
    private javax.swing.JRadioButton mayorVariacion;
    private javax.swing.JRadioButton mañanaHambre;
    private javax.swing.JRadioButton menorVariacion;
    private javax.swing.JRadioButton muyPocoAPego;
    private javax.swing.JRadioButton muyPocoResultadosDieta;
    private javax.swing.JRadioButton nadaAPego;
    private javax.swing.JRadioButton nadaResultadosDieta;
    private javax.swing.JRadioButton noAlergico;
    private javax.swing.JRadioButton noAnticonceptivos;
    private javax.swing.JRadioButton noClimaterio;
    private javax.swing.JRadioButton noDietaEspecial;
    private javax.swing.JRadioButton noEmbarazoActual;
    private javax.swing.JRadioButton noEntreComidas;
    private javax.swing.JRadioButton noMedicamentoBajarPeso;
    private javax.swing.JRadioButton noModificacionAlimentos;
    private javax.swing.JRadioButton noPresionArterial;
    private javax.swing.JRadioButton noSal;
    private javax.swing.JRadioButton noTerapiaHornomal;
    private javax.swing.JRadioButton noVariacion;
    private javax.swing.JRadioButton nulaVariacion;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JPanel panelActiviadades;
    private javax.swing.JPanel panelAntecedentes;
    private javax.swing.JPanel panelDatosPersonales;
    private javax.swing.JPanel panelGinecologico;
    private javax.swing.JPanel panelIndicadores;
    private javax.swing.JPanel panelIndicadoresAntropo;
    private javax.swing.JRadioButton rbNoAC;
    private javax.swing.JRadioButton rbNoAnalgesicos;
    private javax.swing.JRadioButton rbNoCirugia;
    private javax.swing.JRadioButton rbNoColitis;
    private javax.swing.JRadioButton rbNoDentadura;
    private javax.swing.JRadioButton rbNoDiarrea;
    private javax.swing.JRadioButton rbNoDiureticos;
    private javax.swing.JRadioButton rbNoED;
    private javax.swing.JRadioButton rbNoEI;
    private javax.swing.JRadioButton rbNoEstrenimiento;
    private javax.swing.JRadioButton rbNoGastritis;
    private javax.swing.JRadioButton rbNoLaxante;
    private javax.swing.JRadioButton rbNoMedicamento;
    private javax.swing.JRadioButton rbNoNausea;
    private javax.swing.JRadioButton rbNoPirosis;
    private javax.swing.JRadioButton rbNoUlcera;
    private javax.swing.JRadioButton rbNoVomito;
    private javax.swing.JRadioButton rbSiAC;
    private javax.swing.JRadioButton rbSiAnalgesicos;
    private javax.swing.JRadioButton rbSiCirugia;
    private javax.swing.JRadioButton rbSiColitis;
    private javax.swing.JRadioButton rbSiDentadura;
    private javax.swing.JRadioButton rbSiDiarrea;
    private javax.swing.JRadioButton rbSiDiureticos;
    private javax.swing.JRadioButton rbSiED;
    private javax.swing.JRadioButton rbSiEI;
    private javax.swing.JRadioButton rbSiEstrenimiento;
    private javax.swing.JRadioButton rbSiGastritis;
    private javax.swing.JRadioButton rbSiLaxante;
    private javax.swing.JRadioButton rbSiMedicamento;
    private javax.swing.JRadioButton rbSiNausea;
    private javax.swing.JRadioButton rbSiPirosis;
    private javax.swing.JRadioButton rbSiUlcera;
    private javax.swing.JRadioButton rbSiVomito;
    private javax.swing.ButtonGroup rbgAnalgesicos;
    private javax.swing.ButtonGroup rbgAntiacidos;
    private javax.swing.ButtonGroup rbgAnticonceptivos;
    private javax.swing.ButtonGroup rbgApegoDieta;
    private javax.swing.ButtonGroup rbgApetito;
    private javax.swing.ButtonGroup rbgBajarPeso;
    private javax.swing.ButtonGroup rbgCirugia;
    private javax.swing.ButtonGroup rbgClimaterio;
    private javax.swing.ButtonGroup rbgColitis;
    private javax.swing.ButtonGroup rbgComportamientoAlimentacion;
    private javax.swing.ButtonGroup rbgDentadura;
    private javax.swing.ButtonGroup rbgDiarrea;
    private javax.swing.ButtonGroup rbgDietaEspecial;
    private javax.swing.ButtonGroup rbgDiureticos;
    private javax.swing.ButtonGroup rbgEmbarazo;
    private javax.swing.ButtonGroup rbgEnfermedadImportante;
    private javax.swing.ButtonGroup rbgEntreComidas;
    private javax.swing.ButtonGroup rbgEstrenimiento;
    private javax.swing.ButtonGroup rbgGastritis;
    private javax.swing.ButtonGroup rbgGrasaUtilizada;
    private javax.swing.ButtonGroup rbgHoraHambre;
    private javax.swing.ButtonGroup rbgIDdietaEspecial;
    private javax.swing.ButtonGroup rbgIntolerante;
    private javax.swing.ButtonGroup rbgLaxantes;
    private javax.swing.ButtonGroup rbgMedicamento;
    private javax.swing.ButtonGroup rbgModificacionAlimentos;
    private javax.swing.ButtonGroup rbgNausea;
    private javax.swing.ButtonGroup rbgPirosis;
    private javax.swing.ButtonGroup rbgPresionArterial;
    private javax.swing.ButtonGroup rbgReemplazoHormonal;
    private javax.swing.ButtonGroup rbgResultadosDieta;
    private javax.swing.ButtonGroup rbgSal;
    private javax.swing.ButtonGroup rbgUlcera;
    private javax.swing.ButtonGroup rbgVariacionAlimentacion;
    private javax.swing.ButtonGroup rbgVomito;
    private javax.swing.JRadioButton regularAPetito;
    private javax.swing.ButtonGroup rgbEDiagnosticada;
    private javax.swing.JRadioButton siAlergico;
    private javax.swing.JRadioButton siAnticonceptivosOrales;
    private javax.swing.JRadioButton siClimaterio;
    private javax.swing.JRadioButton siDietaEspecial;
    private javax.swing.JRadioButton siEmbarazoActual;
    private javax.swing.JRadioButton siEntreComidas;
    private javax.swing.JRadioButton siMedicamentoBajarPeso;
    private javax.swing.JRadioButton siModificacionAlimentos;
    private javax.swing.JRadioButton siPresionArterial;
    private javax.swing.JRadioButton siSal;
    private javax.swing.JRadioButton siTerapiaHormonal;
    private javax.swing.JRadioButton siVariacion;
    private javax.swing.JRadioButton suficienteResultadosDieta;
    private javax.swing.JTextArea taAspectoGeneral;
    private javax.swing.JTextArea taObservaciones;
    private javax.swing.JTextField tfAguaCorporalTotal;
    private javax.swing.JTextField tfAlimentosMalestar;
    private javax.swing.JTextField tfAlimentosNoPreferidos;
    private javax.swing.JTextField tfAlimentosPreferidos;
    private javax.swing.JTextField tfAreaMuscularBrazo;
    private javax.swing.JTextField tfCena;
    private javax.swing.JTextField tfCircunferenciaAbdominal;
    private javax.swing.JTextField tfCircunferenciaBrazo;
    private javax.swing.JTextField tfCircunferenciaCadera;
    private javax.swing.JTextField tfCircunferenciaCintura;
    private javax.swing.JTextField tfCirugia;
    private javax.swing.JTextField tfComida;
    private javax.swing.JTextField tfComidaCasaFin;
    private javax.swing.JTextField tfComidaCasaSemana;
    private javax.swing.JTextField tfComidasDia;
    private javax.swing.JTextField tfComidasDia6;
    private javax.swing.JTextField tfComidasFueraFin;
    private javax.swing.JTextField tfComidasFueraSemana;
    private javax.swing.JTextField tfComplexion;
    private javax.swing.JTextField tfCualAlergico;
    private javax.swing.JTextField tfCualED;
    private javax.swing.JTextField tfCualEI;
    private javax.swing.JTextField tfCualMedicamento;
    private javax.swing.JTextField tfCualMedicamentoBajarPeso;
    private javax.swing.JTextField tfCualPresionArterial;
    private javax.swing.JTextField tfCualTerapiaHormonal;
    private javax.swing.JTextField tfCuantasDietas;
    private javax.swing.JTextField tfCuantoTiempo;
    private javax.swing.JTextField tfCuantoTiempoDieta;
    private javax.swing.JTextField tfDesayuno;
    private javax.swing.JTextField tfDespertarse;
    private javax.swing.JTextField tfDiferenciaGrasa;
    private javax.swing.JTextField tfDormir;
    private javax.swing.JTextField tfDosisAnticonceptivos;
    private javax.swing.JTextField tfDosisMedicamento;
    private javax.swing.JTextField tfDosisTerapiaHormonal;
    private javax.swing.JTextField tfEstatura;
    private javax.swing.JTextField tfGrasaCorporal;
    private javax.swing.JTextField tfGrasaCorporalKG;
    private javax.swing.JTextField tfHaceCuantoDieta;
    private javax.swing.JTextField tfHoraPresion;
    private javax.swing.JTextField tfIMC;
    private javax.swing.JTextField tfIndiceCaderaCintura;
    private javax.swing.JTextField tfMasaLibreGrasa;
    private javax.swing.JTextField tfMasaMuscularTotal;
    private javax.swing.JTextField tfOtroGrasa;
    private javax.swing.JTextField tfOtros;
    private javax.swing.JTextField tfPesoActual;
    private javax.swing.JTextField tfPesoHabitual;
    private javax.swing.JTextField tfPesoHabitualXC;
    private javax.swing.JTextField tfPesoMaximo;
    private javax.swing.JTextField tfPesoMinimoIMC;
    private javax.swing.JTextField tfPesoTeorico;
    private javax.swing.JTextField tfPesoTeoricoXC;
    private javax.swing.JTextField tfPliegueCutaneoBicipital;
    private javax.swing.JTextField tfPliegueCutaneoPerceptil;
    private javax.swing.JTextField tfPliegueCutaneoSubescapular;
    private javax.swing.JTextField tfPliegueCutaneoSubescapularPerceptil;
    private javax.swing.JTextField tfPliegueCutaneoSuprailiaco;
    private javax.swing.JTextField tfPliegueCutaneoTricipital;
    private javax.swing.JTextField tfQuienPrepara;
    private javax.swing.JTextField tfRazonDietaEspecial;
    private javax.swing.JTextField tfRazonModifiacion;
    private javax.swing.JTextField tfSDG;
    private javax.swing.JTextField tfVagCualAnticonceptivo;
    private javax.swing.JTextField tfVagTiempoAnticonceptivo;
    private javax.swing.JTextField tfvagTiempoTerapiaHormonal;
    // End of variables declaration//GEN-END:variables
}
