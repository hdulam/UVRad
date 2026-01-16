public class RadioCarro implements Radio{

    /**
     * Clase que tendrá los overrides de la interfaz
     */
    
    /*
    * @param encendido: indica si está prendido o apagado
    * @param am: indica si está en AM o FM, true es am, false es fm
    * @param emisoraActual: indica la emisora actual
    * @param botonesAM: array que guarda las emisoras guardadas en AM
    * @param botonesFM: array que guarda las emisoras guardadas en FM
    */
    private boolean encendido;
    private boolean am;
    private double emisoraActual;
    private double[] botonesAM;
    private double[] botonesFM;
    
    /*
    * Constructor de la clase RadioCarro
    */
    public RadioCarro() {
        this.encendido = false;
        this.am = false;
        this.emisoraActual = 530.0;
        this.botonesAM = new double[6];
        this.botonesFM = new double[6];
    }

    /*
    * va a encender la radio poniendo el valor true a encendido
    */
    @Override
    public void prenderRadio() {
        this.encendido = true;
    }

    /*
    * va a apagar la radio poniendo el valor false a encendido
    */
    @Override
    public void apagarRadio() {
        this.encendido = false;
    }

    /*
    * avanza la estación actual según el tipo de emisora (AM o FM)
    * aca va a revisar si es AM o FM para ver el tipo de incremento, si llegó al limite va a regresar a la mas baja de su categoria
    */

    @Override
    public void avanzarEstacion() {
        if (this.am) {
            this.emisoraActual += 10.0;
            if (this.emisoraActual > 1700.0) {
                this.emisoraActual = 530.0;
            }
        } else {
            this.emisoraActual += 0.2;
            if (this.emisoraActual > 108.0) {
                this.emisoraActual = 87.9;  
            }
        }
    }

    /* 
     * guarda la estación actual en el botón indicado
     */
    @Override
    public void guardarEstacion(int numeroBoton) {
        if (this.am) {
            this.botonesAM[numeroBoton] = this.emisoraActual;
        } else {
            this.botonesFM[numeroBoton] = this.emisoraActual;
        }
    }

    /*
     * carga la estación guardada en el botón indicado
     */

    @Override
    public void cargarEstacion(int numeroBoton) {
        if (this.am) {
            this.emisoraActual = this.botonesAM[numeroBoton];
        } else {
            this.emisoraActual = this.botonesFM[numeroBoton];
        }
    }

    /*
     * cambia a FM pone la emisora actual en la más baja de FM
     */

    @Override
    public void cambiarFM() {
        this.am = false;
        this.emisoraActual = 87.9;
    }

    /*
     * cambia a AM pone la emisora actual en la más baja de AM
     */
    @Override
    public void cambiarAM() {
        this.am = true;
        this.emisoraActual = 530.0;
    }
}
